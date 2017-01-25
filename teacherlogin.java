import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class teacherlogin extends JFrame{
    private JLabel background;
    private JLabel title;
    private JLabel message;
    private JLabel signup_message;
    private JButton signup;
    private JButton login;
    private JButton backbutton;
    teacherlogin(){
        super("Teacher");
        setLayout(null);
        //Adding the components
        background = new JLabel();
       background.setBackground(Color.white);
       background.setOpaque(true);
       add(background);
       
        title = new JLabel("ROUTINE MANAGEMENT");
        title.setFont(title.getFont().deriveFont(25f));
        background.add(title);
        
        message = new JLabel("Built For Simplicity");
        message.setFont(message.getFont().deriveFont(15f));
        background.add(message);
        
        login = new JButton(String.format("Login as\n Existing user"));
        background.add(login);
        
        signup_message = new JLabel("New to this? Sign up clicking below");
        background.add(signup_message);
        
        signup = new JButton("Sign up");
        background.add(signup);
        
        backbutton = new JButton();
        backbutton.setIcon(new ImageIcon("/root/NetBeansProjects/Project2ndSem/src/project2ndsem/back.png"));
        background.add(backbutton);
        
        //Setting the layout
        Insets insets = getInsets();
         background.setBounds(insets.left,insets.top,750,500);
         backbutton.setBounds(insets.left,insets.top,75,35);
        title.setBounds(200+insets.left,insets.top,700,100);
        message.setBounds(300+insets.left,52+insets.top,200,30);
        login.setBounds(325+insets.left,100+insets.top,100,100);
        signup_message.setBounds(275+insets.left, 225+insets.top,300,50);
        signup.setBounds(325+insets.left,275+insets.top,100,20);
        
        //Adding action listener to sign up;
        signup.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent ev){
                        createaccount ca = new createaccount();
                        ca.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        ca.setSize(750,500);
                        ca.setVisible(true);
                        dispose();
                    }
                    
                }
        );
        
        backbutton.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent ev){
                        first win = new first();
                        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        win.setSize(750,500);
                        win.setVisible(true);
                        dispose();
                    }
                }
        );
        
    }
            
}