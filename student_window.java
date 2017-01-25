import java.time.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class student_window extends JFrame{
private JLabel background;
private JLabel title;
private JLabel ptext;
private JButton backbutton;
private JRadioButton ce;
private JRadioButton cs;
private JLabel yeartext;
private JRadioButton first_year;
private JRadioButton second_year;
private JRadioButton third_year;
private JRadioButton fourth_year;
private JLabel semtext;
private JRadioButton first_sem;
private JRadioButton second_sem;
private JButton submit;

private ButtonGroup program_group;
private ButtonGroup year_group;
private ButtonGroup sem_group;

public String program;
public int year;
public int semester;
public student_window(){
	super("Routine Management");
	setLayout(null);
        
        
       background = new JLabel();
       background.setBackground(Color.white);
       background.setOpaque(true);
       add(background);
       
        title = new JLabel("ROUTINE MANAGEMENT");
        title.setFont(title.getFont().deriveFont(25f));
        background.add(title);

           
	ptext = new JLabel("Choose your department: ");
	background.add(ptext);

	ce = new JRadioButton("CE",true);
	background.add(ce);

	cs = new JRadioButton("CS",false);
	background.add(cs);

	program_group = new ButtonGroup();
	program_group.add(ce);
	program_group.add(cs);

       yeartext = new JLabel("Choose your year:");
	background.add(yeartext);

	first_year= new JRadioButton("First Year",true);
	background.add(first_year);

	second_year = new JRadioButton("Second Year",false);
	background.add(second_year);

	third_year = new JRadioButton("Third Year",false);
	background.add(third_year);

	fourth_year = new JRadioButton("Fourth Year",false);
	background.add(fourth_year);
	year_group = new ButtonGroup();
	year_group.add(first_year);
	year_group.add(second_year);
	year_group.add(third_year);
	year_group.add(fourth_year);

	semtext = new JLabel("Choose your Semester:");
	background.add(semtext);

	first_sem = new JRadioButton("First Semester",true);
	background.add(first_sem);

	second_sem = new JRadioButton("Second Semester",false);
	background.add(second_sem);

	sem_group = new ButtonGroup();
	sem_group.add(first_sem);
	sem_group.add(second_sem);
		
	backbutton = new JButton();
        backbutton.setIcon(new ImageIcon("/root/NetBeansProjects/Project2ndSem/src/project2ndsem/back.png"));
        background.add(backbutton);
        
        
        Insets insets = getInsets();
        background.setBounds(insets.left,insets.top,750,500);
        backbutton.setBounds(insets.left,insets.top,75,35);
        title.setBounds(200+insets.left,insets.top,500,25);
        ptext.setBounds(10+insets.left,40+insets.top,300,15);
        ce.setBounds(200+insets.left, 40+insets.top, 50, 15);
        cs.setBounds(250+insets.left, 40+insets.top, 50, 15);
        yeartext.setBounds(10+insets.left, 70+insets.top, 300, 15);
        first_year.setBounds(200+insets.left, 70+insets.top, 125, 15);
        second_year.setBounds(325+insets.left, 70+insets.top, 125, 15);
        third_year.setBounds(450+insets.left, 70+insets.top, 125, 15);
        fourth_year.setBounds(575+insets.left, 70+insets.top, 125, 15);
        semtext.setBounds(10+insets.left, 100+insets.top, 300, 15);
        first_sem.setBounds(200+insets.left, 100+insets.top, 200, 15);
        second_sem.setBounds(400+insets.left, 100+insets.top, 200, 15);
        
        
	
	if(ce.isSelected()){
		program = ce.getText();
	}
	else if(cs.isSelected()){
		program = cs.getText();
	}

	if(first_year.isSelected()){
		year  = 1; 
	}
	else if(second_year.isSelected()){
		year  = 2; 
	}
	else if(third_year.isSelected()){
		year  = 3; 
	}
	else if(fourth_year.isSelected()){
		year  = 4; 
	}
	
	if(first_sem.isSelected()){
		semester = 1;
	}
	else if(second_sem.isSelected()){
		semester = 2;
		}

        submit = new JButton("Submit");
	background.add(submit);
        submit.setBounds(200+insets.left, 130+insets.top, 125, 20);
        
	submit.addActionListener(
		new ActionListener(){
			public void actionPerformed(ActionEvent e){
                           
			JOptionPane.showMessageDialog(null,String.format("Program: %s\n Year = %d\n Semester = %d",program,year,semester),"Your record",JOptionPane.PLAIN_MESSAGE);	
				
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
