import java.awt.*;
import java.awt.Image.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;



public class first extends JFrame{
private JLabel title;
private JLabel message;
private JLabel login;
private JLabel background;
private JButton teacher;
private JButton student;
private JLabel day;

public String day_name="Hello";
public String current_time = "0";

public void set_day_name(){
    dayofweek d = new dayofweek();
    day_name = d.initday();
}

public void set_day_time(){
    timeofday t = new timeofday();
    current_time = t.inittime();
}



public first(){
	super("Routine Management");
	setLayout(null);
        
        
        set_day_name();
        set_day_time();

        background = new JLabel();
        background.setIcon(new ImageIcon("/root/NetBeansProjects/Project2ndSem/src/project2ndsem/1.jpg"));
        add(background);
        
        
	title= new JLabel("WELCOME TO ROUTINE MANAGEMENT");
	title.setFont(title.getFont().deriveFont(25f));
        background.add(title);
        
        message = new JLabel("Built for Simplicity");
        background.add(message);

	login = new JLabel("Login as");
        login.setFont(login.getFont().deriveFont(15f));
	background.add(login);

	teacher = new JButton("Teacher");
	teacher.setIcon(new ImageIcon("/root/NetBeansProjects/Project2ndSem/src/project2ndsem/teach.png"));
        background.add(teacher);
	
	student = new JButton("Student");
        student.setIcon(new ImageIcon("/root/NetBeansProjects/Project2ndSem/src/project2ndsem/std.png"));
	background.add(student);
        
        day = new JLabel(String.format("The day is %s and the time is %s", day_name,current_time));
        background.add(day);
        
        Insets insets = getInsets();
        Dimension size = title.getPreferredSize();
        
        background.setBounds(0,0,1000,500);
        title.setBounds(100+insets.left,insets.top,700,100);
        message.setBounds(300+insets.left,52+insets.top,200,30);
        login.setBounds(330+insets.left,100+insets.top,size.width,size.height);
        teacher.setBounds(200+insets.left,150+insets.top,100,100);
        student.setBounds(400+insets.left,150+insets.top,100,100);
        day.setBounds(10+insets.left,400+insets.top,500,100);
        
        
        //Adding Action Listener
        teacher.addActionListener(
                new ActionListener(){
                        public void actionPerformed(ActionEvent ev){
                            
                            teacherlogin twin = new teacherlogin();
                            twin.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
						twin.setSize(750,500);
						twin.setVisible(true);
                                                dispose();
                        }
    
                    }
        );
     
        
	student.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ev){
						student_window swin = new student_window();
						swin.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
						swin.setSize(750,500);
						swin.setVisible(true);
                                                dispose();
		}
				}
	
	);	
}


}


