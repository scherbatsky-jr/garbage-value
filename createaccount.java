import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;


public class createaccount extends JFrame{
    private JLabel background;
    private JLabel title;
    private JLabel create;
    private JLabel fname_text;
    private JLabel lname_text;
    private JLabel depart_text;
    private JLabel picture;
    private JTextField fname;
    private JTextField lname;
    private JTextField department;
    private JButton signup;
    private JButton backbutton;
    private JButton upload;
    createaccount(){
        
        
       super("Create an Account");
       setLayout(null);
       //Adding components to JFrame
       background = new JLabel();
       background.setBackground(Color.white);
       background.setOpaque(true);
       add(background);
       
       title = new JLabel("ROUTINE MANAGEMENT");
       title.setFont(title.getFont().deriveFont(25f));
       background.add(title);
       
       create= new JLabel("Create a new account");
       background.add(create);
       
       fname_text = new JLabel("Enter your first name");
       background.add(fname_text);
      
       lname_text = new JLabel("Enter your last name");
       background.add(lname_text);
       
       depart_text = new JLabel("Enter your department");
       background.add(depart_text);
       
       fname = new JTextField(null);
       background.add(fname);
       
       lname = new JTextField(null);
       background.add(lname);
       
       department = new JTextField(null);
       background.add(department);
       
       signup = new JButton("Signup");
       background.add(signup);
       
       backbutton = new JButton();
        backbutton.setIcon(new ImageIcon("/root/NetBeansProjects/Project2ndSem/src/project2ndsem/back.png"));
        background.add(backbutton);
       
        picture = new JLabel();
        picture.setBackground(Color.GRAY);
        picture.setOpaque(true);
        background.add(picture);
        
        upload = new JButton("Upload your picture");
        background.add(upload);
       

        //Setting Layout
       Insets insets = getInsets();
       background.setBounds(insets.left,insets.top,750,500);
       backbutton.setBounds(insets.left,insets.top,75,35);
       title.setBounds(200+insets.left,insets.top,700,100);
       create.setBounds(10+insets.left,110+insets.top,200,50);
       fname_text.setBounds(10+insets.left,170+insets.top,200,50);
       lname_text.setBounds(10+insets.left,230+insets.top,200,50);
       depart_text.setBounds(10+insets.left,290+insets.top,200,50);
       fname.setBounds(220+insets.left,170+insets.top,200,50);
       lname.setBounds(220+insets.left,230+insets.top,200,50);
       department.setBounds(220+insets.left,290+insets.top,200,50);
       signup.setBounds(10+insets.left,350+insets.top,100,30);
       picture.setBounds(550+insets.left,170+insets.top,100,100);
       upload.setBounds(550+insets.left,280+insets.top,100,30);
       
       //ActionListener
       signup.addActionListener(
               new ActionListener(){
                   public void actionPerformed(ActionEvent ev){
                       if((fname.getText().equals(""))||(lname.getText().equals(""))||(department.getText().equals(""))){     
                       JOptionPane.showMessageDialog(null,"Please fill all the required fields","Error",JOptionPane.PLAIN_MESSAGE);
                       }
                       else{
                           
                       }
                       
                   }
               }
       );
       
       backbutton.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent ev){
                        teacherlogin win = new teacherlogin();
                        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        win.setSize(750,500);
                        win.setVisible(true);
                        dispose();
                    }
                }
        );
       
       upload.addActionListener(
               new ActionListener(){
               public void actionPerformed(ActionEvent ev){
                  JFileChooser chooser = new JFileChooser();
                  chooser.showOpenDialog(null);
                  File f=chooser.getSelectedFile();
                  String filename=f.getAbsolutePath();
                  ImageIcon icon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
                  picture.setIcon(icon); 
                  
                  
                  
               }
               }
       );
    }
}