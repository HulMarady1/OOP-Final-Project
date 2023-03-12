package finalproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

class Testlo extends JFrame implements ActionListener{
	
	
	JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JPanel panel3=new JPanel();
    JPanel panel4=new JPanel();
    JPanel panel5=new JPanel();
    
    
    JPanel tex1_1=new JPanel(new GridLayout(1,1));
    JPanel tex1_2=new JPanel(new GridLayout(1,1));
    JPanel tex1_3=new JPanel(new GridLayout(1,1));
    JPanel tex1_4=new JPanel(new GridLayout(1,1));
    JPanel tex1_5=new JPanel(new GridLayout(1,1));
    JPanel tex1_6=new JPanel(new GridLayout(1,2));
    JPanel tex1_7=new JPanel(new GridLayout(1,1));
    JPanel tex1_8=new JPanel(new GridLayout(1,1));
    
    JTextField t1_2 =new JTextField();
    JTextField t1_4 =new JTextField();
	
	JMenuBar menubar;
		
//	JMenu manegement;
//	JMenuItem add;
//	JMenuItem delete;
//	JMenuItem update;
//	JMenuItem display;
	
	JMenu login;
	JMenuItem  admin;
	JMenuItem student;
	
//	JMenu test;
//	JMenu attendance;
	JButton forgot;
	JButton re;
	JButton lo;
	
	
	Testlo(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1200,800);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLayout(new BorderLayout());
		
		menubar=new JMenuBar();
		menubar.setBounds(0, 0, 100, 50);
		menubar.setBackground(Color.white);
		menubar.setBorder( BorderFactory.createEmptyBorder(0,10,0,10) );
		
				
		//menu
//		manegement =new JMenu("Manengement");
//		test =new JMenu("Test");
//		attendance =new JMenu("Attendence");
		login =new JMenu("Login");
//		manegement.setFont(new Font(null,Font.BOLD,15));
//		test.setFont(new Font(null,Font.BOLD,15));
//		attendance.setFont(new Font(null,Font.BOLD,15));
		login.setFont(new Font(null,Font.BOLD,15));
		
		//item
//		add=new JMenuItem("Add");
//		add.addActionListener(this);
//		update=new JMenuItem("Update");
//		update.addActionListener(this);
//		delete=new JMenuItem("Delete");
//		delete.addActionListener(this);
//		display=new JMenuItem("Display");
//		display.addActionListener(this);
		admin=new JMenuItem("Admin");
		admin.addActionListener(this);
		student=new JMenuItem("Student");
		student.addActionListener(this);
//		
//		manegement.add(add);
//		manegement.add(update);
//		manegement.add(delete);
//		manegement.add(display);
		login.add(admin);
		login.add(student);
		
		
		panel1.setBackground(new Color( 0, 0, 128));
		panel1.setLayout(new GridLayout(1,1));
		panel1.setBorder( BorderFactory.createEmptyBorder(20,20,0,20) );
		JPanel panel1_1=new JPanel();
//		panel1_1.setBackground(Color.black);
		panel1_1.setBorder( BorderFactory.createEmptyBorder(5,0,0,0) );
		JLabel register=new JLabel("Login");
		register.setForeground(Color.white);
		register.setFont(new Font(null,Font.BOLD,30));
		panel1_1.setBackground(new Color(255, 180, 0 ));
		
		
		panel2.setBackground(new Color( 0, 0, 128));
		panel3.setBackground(new Color( 0, 0, 128));
		panel4.setBackground(new Color( 0, 0, 128));
		panel1.setPreferredSize(new Dimension(200,80));
		panel2.setPreferredSize(new Dimension(20,20));
		panel3.setPreferredSize(new Dimension(20,20));
		panel4.setPreferredSize(new Dimension(20,20));
		
		
//		panel5.setBackground(Color.green);
		panel5.setLayout(new GridLayout(1,1));
		panel5.setBackground(Color.white);
		panel5.setBorder( BorderFactory.createEmptyBorder(10,200,10,200) );
		JPanel body=new JPanel(new GridLayout(1,1));
		
		Border border = new LineBorder(Color.gray, 2, true);
		body.setBorder(border);
		body.setBorder( BorderFactory.createEmptyBorder(80,250,120,250) );
		JPanel body1=new JPanel(new GridLayout(8,1,5,5));
		body1.setBackground(new Color(249,248,248));
		
	//tex1_1 
		JLabel t1_1=new JLabel("Emil or Phone Number");
		t1_1.setFont(new Font(null,Font.CENTER_BASELINE,18));
		tex1_1.setBorder( BorderFactory.createEmptyBorder(17,0,0,0) );
		tex1_1.add(t1_1);
	//tex1_2
		t1_2.setFont(new Font(null,Font.CENTER_BASELINE,16));
		t1_2.setCaretColor(Color.red);
		tex1_2.add(t1_2);
		
	//tex1_3
		JLabel t1_3=new JLabel("Password");
		tex1_3.setBorder( BorderFactory.createEmptyBorder(17,0,0,0) );
		t1_3.setFont(new Font(null,Font.CENTER_BASELINE,18));
		tex1_3.add(t1_3);
	//tex1_4
		t1_4.setFont(new Font(null,Font.CENTER_BASELINE,16));
		tex1_4.add(t1_4);
		t1_4.setCaretColor(Color.red);
	//tex1_5
		forgot=new JButton("Forgotten password");
		forgot.setFont(new Font(null,Font.ITALIC,15));
		Border emptyBorder = BorderFactory.createEmptyBorder();
		forgot.setBorder(emptyBorder);
		forgot.setBackground(new Color(240,240,240));
		tex1_5.setBorder( BorderFactory.createEmptyBorder(18,420,0,0) );
		forgot.setForeground(Color.blue);
		forgot.setFocusable(false);
		
		tex1_5.add(forgot);
	//tex1_6 
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		re=new JButton("sign up");
		
		re.setFont(new Font(null,Font.PLAIN,16));
		re.setBorder(emptyBorder);
		re.setBackground(new Color(240,240,240));
		JLabel t1_6=new JLabel("Do not have an account?");
		t1_6.setFont(new Font(null,Font.PLAIN,16));
		tex1_6.setBorder( BorderFactory.createEmptyBorder(18,50,0,200) );
		p2.setBorder( BorderFactory.createEmptyBorder(0,0,0,90 ));
		re.setForeground(Color.blue);
//		p1.setBackground(Color.blue);
//		p2.setBackground(Color.CYAN);
		re.setFocusable(false);
		p1.add(t1_6);
		p2.add(re);
		tex1_6.add(p1);
		tex1_6.add(p2);
 //tex1_7 	
		lo=new JButton("sign in");
		
		lo.setFont(new Font(null,Font.PLAIN,16));
		lo.setBorder(emptyBorder);
		lo.setBackground(new Color(65, 102, 245));
		lo.setForeground(Color.white);
		tex1_7.setBorder( BorderFactory.createEmptyBorder(6,450,6,10 ));
		lo.setFocusable(false);
		tex1_7.add(lo);
		
		
		t1_2.addActionListener(this);
		t1_4.addActionListener(this);
		forgot.addActionListener(this);;
		re.addActionListener(this);;
		lo.addActionListener(this);;
		
		body1.add(tex1_1);
		body1.add(tex1_2);
		body1.add(tex1_3);
		body1.add(tex1_4);
		body1.add(tex1_5);
		body1.add(tex1_6);
		body1.add(tex1_7);
		body1.add(tex1_8);
	
		
		body.add(body1);
		panel5.add(body);
		
		panel1_1.add(register);
		panel1.add(panel1_1);
		forgot.addActionListener(this);
		
//		menubar.add(manegement);
//		menubar.add(test);
//		menubar.add(attendance);
		menubar.add(login);
		this.setJMenuBar(menubar);

		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.WEST);
		this.add(panel3,BorderLayout.SOUTH);
		this.add(panel4,BorderLayout.EAST);
		this.add(panel5,BorderLayout.CENTER);
		this.setVisible(true);

	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==re) {
			this.dispose();
			TestLogin to=new TestLogin();
		}
		
		if(e.getSource()==lo) {
			try {
				Scanner read = new Scanner(new File("Login.txt"));
				
								
				int k = 0;
				while(read.hasNext()) {
					String line=read.nextLine();
					if(line.isEmpty()) {
						continue;
					}
					String[] word=line.split(",");
					String email=word[0],phone=word[1],pas=word[2],id=word[3],name=word[4];
					if((t1_2.getText().equals(email) || t1_2.getText().equals(phone)) && t1_4.getText().equals(pas)) {
						 System.out.println(id+" ,"+name);	
						 FileWriter write3=new FileWriter("ScorStudent.txt",true);
						 PrintWriter wr3=new PrintWriter(write3);
						 wr3.print(id+","+name);
						
					     this.dispose();
						 Quiz Q =new Quiz();
						 k=1;
						 wr3.close();	
						 write3.close();
					}
					
				}
				
				if(k==0){
					JOptionPane.showInternalMessageDialog(null,"Please input data again!","Incorrect information ",JOptionPane.WARNING_MESSAGE);
					t1_4.setText(null);
				}
			}catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		}
		if(e.getSource()==admin) {
			this.dispose();
			Testload t=new Testload();
		}
		if(e.getSource()==forgot) {
			this.dispose();
			Fpas pa=new Fpas();
		}
		
	}
	
}
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testlo t=new Testlo();
	}

}
