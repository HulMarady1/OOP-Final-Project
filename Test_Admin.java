package finalproject;
import java.awt.BorderLayout;
//import com.sun.source.doctree.SummaryTree;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
class Quiz_Admin extends JFrame implements ActionListener
{
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JPanel panel3=new JPanel();
    JPanel panel4=new JPanel();
    JPanel panel5=new JPanel();

    //Description
    JMenuBar MenuBar;
    JMenu Management;
    JMenu manegement;
	JMenuItem Mange;
	JMenuItem his;

    JMenu login;
	JMenuItem student;
	JMenuItem  logout;
	JMenuItem  DisplayT;
	JMenuItem  manageT;
    JMenu test;
    JMenu attendance;

    Quiz_Admin()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200,800);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLayout(new BorderLayout());

        MenuBar=new JMenuBar();
        MenuBar.setBounds(0, 0, 50, 50);
        MenuBar.setBackground(Color.white);


        //menu
        Management =new JMenu("Management");
        test =new JMenu("Test");
//        attendance =new JMenu("Attendance");
        login =new JMenu("Login");
        Management.setFont(new Font(null,Font.BOLD,15));
        test.setFont(new Font(null,Font.BOLD,15));
//        attendance.setFont(new Font(null,Font.BOLD,15));
        login.setFont(new Font(null,Font.BOLD,15));

        //item
        Mange=new JMenuItem("Manage Infomation");
		Mange.addActionListener(this);
		his=new JMenuItem("History");
		his.addActionListener(this);
//        add=new JMenuItem("Add");
//        add.addActionListener(this);
//        update=new JMenuItem("Update");
//        update.addActionListener(this);
//        delete=new JMenuItem("Delete");
//        delete.addActionListener(this);
//        display=new JMenuItem("Display");
//        display.addActionListener(this);
//        admin=new JMenuItem("Admin");
//        admin.addActionListener(this);
        student=new JMenuItem("Student");
        student.addActionListener(this);
        logout=new JMenuItem("Sign out");
		logout.addActionListener(this);
		DisplayT=new JMenuItem("Display Score");
		DisplayT.addActionListener(this);
		manageT=new JMenuItem("Manage Test ");
		manageT.addActionListener(this);

		Management.add(Mange);
		Management.add(his);
//		login.add(admin);
//		login.add(student);
//		student.addActionListener(this);
		login.add(logout);
		test.add(manageT);
		test.add(DisplayT);
//        login.add(student);

        panel1.setBackground(new Color(0, 0, 128));
        panel1.setLayout(new GridLayout(1,1));
        panel1.setBorder(BorderFactory.createEmptyBorder(20,20,0,20) );

        panel2.setBackground(new Color(0, 0, 128));
        panel3.setBackground(new Color(0, 0, 128));
        panel4.setBackground(new Color(0, 0, 128));

        panel1.setPreferredSize(new Dimension(200,80));
        panel2.setPreferredSize(new Dimension(20,20));
        panel3.setPreferredSize(new Dimension(20,20));
        panel4.setPreferredSize(new Dimension(20,20));
        panel5.setPreferredSize(new Dimension(400,100));

        JPanel panel1_1=new JPanel();
        panel1_1.setBorder(BorderFactory.createEmptyBorder(5,0,0,0) );
        JLabel register=new JLabel("Quiz");
        register.setForeground(Color.white);
        register.setFont(new Font(null,Font.BOLD,30));
        panel1_1.setBackground(new Color(255, 180, 0 ));


        panel5.setLayout(new GridLayout(1,1));
        panel5.setBackground(Color.white);
        panel5.setBorder(BorderFactory.createEmptyBorder(10,150,0,150));
        //panel5.setBorder(BorderFactory.createLineBorder(Color.black));

        JPanel child_panel5 = new JPanel(new GridLayout(11,1));
        child_panel5.setBorder(BorderFactory.createEmptyBorder(50,150,0,150));
        child_panel5.setBorder(BorderFactory.createLineBorder(Color.black));

        JPanel child_body1 = new JPanel();
        child_body1.setBorder(BorderFactory.createEmptyBorder(0,0,0,0) );
        //child_body1.setBackground(Color.green);

        JLabel Info_Question = new JLabel("Form Question");
        Info_Question.setFont(new Font(null,Font.BOLD,30));
        Info_Question.setFont(new Font(null,Font.HANGING_BASELINE,30));
        child_body1.add(Info_Question);
        child_panel5.add(child_body1);


        JPanel text1 = new JPanel(new GridLayout(1,2));
        text1.setBorder(BorderFactory.createEmptyBorder(5,100,5,200) );

        JLabel newLabel = new JLabel("Create the question");
        newLabel.setFont(new Font(null,Font.HANGING_BASELINE,18));
        newLabel.setBorder(BorderFactory.createEmptyBorder(0,75,0,0) );
        text1.add(newLabel);

        JTextField text_Question = new JTextField();
        text_Question.setBorder(BorderFactory.createEmptyBorder(0,10,0,100) );
        text1.add(text_Question);
        child_panel5.add(text1);


        JPanel child_body2 = new JPanel();
        child_body2.setBorder(BorderFactory.createEmptyBorder(0,0,0,0) );
        //child_body2.setBackground(Color.green);

        JLabel Info_Option = new JLabel("Form Option");
        Info_Option.setFont(new Font(null,Font.BOLD,30));
        Info_Option.setFont(new Font(null,Font.HANGING_BASELINE,30));
        child_body2.add(Info_Option);
        child_panel5.add(child_body2);

        JPanel Option1 = new JPanel(new GridLayout(1,2));
        Option1.setBorder(BorderFactory.createEmptyBorder(5,200,5,200) );

        JLabel Option_1 = new JLabel("Option 1");
        Option_1.setFont(new Font(null,Font.HANGING_BASELINE,15));
        Option1.add(Option_1);

        JTextField textField_Option1 = new JTextField();
        textField_Option1.setBorder(BorderFactory.createEmptyBorder(0,10,0,0) );
        Option1.add(textField_Option1);
        child_panel5.add(Option1);


        JPanel Option2 = new JPanel(new GridLayout(1,2));
        Option2.setBorder(BorderFactory.createEmptyBorder(5,200,5,200) );

        JLabel Option_2 = new JLabel("Option 2");
        Option_2.setFont(new Font(null,Font.HANGING_BASELINE,15));
        Option2.add(Option_2);

        JTextField textField_Option2 = new JTextField();
        textField_Option2.setBorder(BorderFactory.createEmptyBorder(0,10,0,0) );
        Option2.add(textField_Option2);
        child_panel5.add(Option2);

        JPanel Option3 = new JPanel(new GridLayout(1,2));
        Option3.setBorder(BorderFactory.createEmptyBorder(5,200,5,200) );

        JLabel Option_3 = new JLabel("Option 3");
        Option_3.setFont(new Font(null,Font.HANGING_BASELINE,15));
        Option3.add(Option_3);

        JTextField textField_Option3 = new JTextField();
        textField_Option3.setBorder(BorderFactory.createEmptyBorder(0,10,0,0) );
        Option3.add(textField_Option3);
        child_panel5.add(Option3);

        JPanel Option4 = new JPanel(new GridLayout(1,2));
        Option4.setBorder(BorderFactory.createEmptyBorder(5,200,5,200) );

        JLabel Option_4 = new JLabel("Option 4");
        Option_4.setFont(new Font(null,Font.HANGING_BASELINE,15));
        Option4.add(Option_4);

        JTextField textField_Option4 = new JTextField();
        textField_Option4.setBorder(BorderFactory.createEmptyBorder(0,10,0,0) );
        Option4.add(textField_Option4);
        child_panel5.add(Option4);

        JPanel Submit_Panel = new JPanel(new GridLayout(1,1));
        Submit_Panel.setBorder(BorderFactory.createEmptyBorder(0,300,0,300) );

        JPanel Correct_Answer = new JPanel(new GridLayout(1,2));
        Correct_Answer.setBorder(BorderFactory.createEmptyBorder(5,175,5,175) );

        JLabel correct = new JLabel("Correct Answer");
        correct.setBorder(BorderFactory.createEmptyBorder(0,10,0,0) );
        correct.setFont(new Font(null,Font.HANGING_BASELINE,15));
        Correct_Answer.add(correct);

        JTextField Answer_Field = new JTextField();
        Answer_Field.setBorder(BorderFactory.createEmptyBorder(0,10,0,0) );
        Correct_Answer.add(Answer_Field);

        child_panel5.add(Correct_Answer);

        JPanel space1 = new JPanel();
        space1.setBorder(BorderFactory.createEmptyBorder(0,10,0,0) );
        child_panel5.add(space1);

        JButton Submit = new JButton("Create Question");
        Submit.setBorder(BorderFactory.createEmptyBorder(0,0,0,0) );
        Submit.setFont(new Font(null,Font.HANGING_BASELINE,15));
        Submit.setBackground(new Color(50, 205, 50 ));
        Submit.setForeground(Color.white);
        Submit.setFocusable(false);
        Submit.setOpaque(true);
        Submit_Panel.add(Submit);
        child_panel5.add(Submit_Panel);

        Submit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    //Write question
                    PrintWriter Question_text = new PrintWriter(new BufferedWriter(new FileWriter("Question.txt",true)));
                    String Question = text_Question.getText();
                    Question_text.print(Question+",");
                    Question_text.close();

                    //Clear textField
                    text_Question.setText("");

                    //Write answer
                    PrintWriter Answer_text = new PrintWriter(new BufferedWriter(new FileWriter("Answer.txt",true)));
                    String[] Answer = new String[4];
                    Answer[0] = textField_Option1.getText();
                    Answer[1] = textField_Option2.getText();
                    Answer[2] = textField_Option3.getText();
                    Answer[3] = textField_Option4.getText();
                    Answer_text.print(Answer[0]+",");
                    Answer_text.print(Answer[1]+",");
                    Answer_text.print(Answer[2]+",");
                    Answer_text.print(Answer[3]+",");
                    Answer_text.close();

                    //Clear textField
                    textField_Option1.setText("");
                    textField_Option2.setText("");
                    textField_Option3.setText("");
                    textField_Option4.setText("");

                    //Write Correct Answer
                    PrintWriter Correct = new PrintWriter(new BufferedWriter(new FileWriter("Correct.txt",true)));
                    String correct_answer = Answer_Field.getText();
                    Correct.print(correct_answer+",");
                    Correct.close();

                    //Clear textField
                    Answer_Field.setText("");

                }
                catch (FileNotFoundException ex)
                {
                    ex.printStackTrace();
                }
                catch (IOException ex)
                {
                    throw new RuntimeException(ex);
                }
            }
        });

        JPanel space2 = new JPanel();
        space2.setBorder(BorderFactory.createEmptyBorder(0,10,0,0) );
        child_panel5.add(space2);

        panel5.add(child_panel5);
        panel1_1.add(register);
        panel1.add(panel1_1);

        //add menu element
        MenuBar.add(Management);
        MenuBar.add(test);
//        MenuBar.add(attendance);
        MenuBar.add(login);


        this.setJMenuBar(MenuBar);
        this.add(panel1,BorderLayout.NORTH);
        this.add(panel2,BorderLayout.WEST);
        this.add(panel3,BorderLayout.SOUTH);
        this.add(panel4,BorderLayout.EAST);
        this.add(panel5,BorderLayout.CENTER);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==manageT) {
			Quiz_Admin Q =new Quiz_Admin();
		}
		if(e.getSource()==logout) {
			Testload t=new Testload();	
		}
		if(e.getSource()==DisplayT) {
			Read kk=new Read();
		}
		if(e.getSource()==his) {
			Testhis p=new Testhis();
		}
		if(e.getSource()==Mange) {
			try {
				Edit t=new Edit();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getSource()==DisplayT) {
			Read kk=new Read();
		} // TODO Auto-generated method stub
    }
}
public class Test_Admin
{
    public static void main(String[] args)
    {
        Quiz_Admin Q =new Quiz_Admin();
    }

}
