package finalproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
class TestLogin extends JFrame implements ActionListener {

	JLabel fn=new JLabel("First Name ");
	JLabel ln=new JLabel("Last Name ");
	JLabel un=new JLabel("Username ");
	JLabel em=new JLabel("Email ");
	JLabel pa=new JLabel("Password ");
	JLabel cpa=new JLabel("Comfirm Password ");
	JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JPanel panel3=new JPanel();
    JPanel panel4=new JPanel();
    JPanel panel5=new JPanel();
    JPanel body1_1=new JPanel(new GridLayout(1,2,40,40));
    JPanel body1_2=new JPanel(new GridLayout(1,2,40,40));
    JPanel body1_3=new JPanel(new GridLayout(1,2,40,40));
    JPanel body1_4=new JPanel(new GridLayout(1,2,40,40));
    JPanel body1_4_1=new JPanel(new GridLayout(1,3,15,15));
    JPanel body1_5=new JPanel(new GridLayout(2,1));
    JPanel body1_5_1=new JPanel(new GridLayout(1,2,40,40));
    JPanel body1_5_2=new JPanel(new GridLayout(1,1));
    JPanel body1_5_1_1=new JPanel(new GridLayout(1,3,15,15));
    JPanel body1_6=new JPanel(new GridLayout(1,2,40,40));
    JPanel body1_7=new JPanel(new GridLayout(1,2,40,40));
    JPanel body1_8=new JPanel(new GridLayout(1,2,40,40));
    JPanel body1_9=new JPanel(new GridLayout(1,1));
    JPanel body1_10=new JPanel(new GridLayout(1,1));
    JPanel body1_11=new JPanel(new GridLayout(1,2,40,40));
    JPanel body1_12=new JPanel(new GridLayout(1,2,40,40));
    JPanel body1_13=new JPanel(new GridLayout(1,2,40,40));
    JPanel body1_14=new JPanel(new GridLayout(1,2,40,40));
    JPanel body1_14_1=new JPanel(new GridLayout(1,2,15,15));
    JPanel body1_15=new JPanel(new GridLayout(2,1));
    JPanel body1_15_1=new JPanel(new GridLayout(1,2,40,40));
    JPanel body1_15_2=new JPanel(new GridLayout(1,1));
    JPanel body1_15_1_1=new JPanel(new GridLayout(1,2,15,15));
    JPanel body1_16=new JPanel(new GridLayout(1,1));
    JPanel body1_17=new JPanel(new GridLayout(1,2,20,20));
	
    
    JTextField text1_2_1=new JTextField();
    JTextField text1_2_2=new JTextField();
    
    JTextField text1_4_1_1=new JTextField();
    JTextField text1_4_1_2=new JTextField();
    JTextField text1_4_1_3=new JTextField();
//    JTextField text1_4_2=new JTextField();
    JRadioButton fe;
	JRadioButton me;
	JRadioButton no;
   
    
//    JTextField text1_6_1=new JTextField();
    JComboBox major;
    JComboBox generation;
    
    JTextField text1_8_1=new JTextField();
    JTextField text1_8_2=new JTextField();
    
    JTextField text1_10_1=new JTextField();
    
    JPasswordField pas=new JPasswordField();
    JPasswordField rpas=new JPasswordField();
    
    JTextField text1_14_1_1=new JTextField();
    JTextField text1_14_1_2=new JTextField();
    JTextField text1_14_2=new JTextField();
    
    JTextField text1_16_1=new JTextField();
    
    JButton reset=new JButton("Reset");
    JButton submit=new JButton("Submit");
    
    JMenuBar menubar;
	
//	JMenu manegement;
//	JMenuItem add;
//	JMenuItem delete;
//	JMenuItem update;
//	JMenuItem display;
	
	JMenu login;
	JMenuItem  admin;
	JMenuItem student;
//	
//	JMenu test;
//	JMenu attendance;
	
	TestLogin(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLayout(new BorderLayout());
		
		menubar=new JMenuBar();
		menubar.setBounds(0, 0, 50, 50);
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
		JLabel register=new JLabel("Register");
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
		
		
//		body.setBackground(Color.white);
		Border border = new LineBorder(Color.gray, 2, true);
		body.setBorder(border);
		body.setBorder( BorderFactory.createEmptyBorder(15,200,15,200) );
		JPanel body1=new JPanel(new GridLayout(17,1,5,5));
		body1.setBackground(new Color(249,248,248));
//		body1_1.setBackground(Color.gray);
//		body1_2.setBackground(Color.gray);
//		body1_3.setBackground(Color.gray);
//		body1_4.setBackground(Color.gray);
//		body1_5.setBackground(Color.gray);
//		body1_6.setBackground(Color.gray);
//		body1_7.setBackground(Color.gray);
//		body1_8.setBackground(Color.gray);
//		body1_9.setBackground(Color.gray);
//		body1_10.setBackground(Color.gray);
//		body1_11.setBackground(Color.gray);
//		body1_12.setBackground(Color.gray);
//		body1_13.setBackground(Color.gray);
//		body1_14.setBackground(Color.gray);
//		body1_15.setBackground(Color.gray);
//		body1_16.setBackground(Color.gray);
//		body1_17.setBackground(Color.gray);
		
//	body1_1.setBorder( BorderFactory.createEmptyBorder(0,40,0,40) );
		JLabel t1_1_1=new JLabel("Last Name");
		JLabel t1_1_2=new JLabel("First Name");
		t1_1_1.setFont(new Font(null,Font.CENTER_BASELINE,16));
		t1_1_2.setFont(new Font(null,Font.CENTER_BASELINE,16));
		body1_1.add(t1_1_1);
		body1_1.add(t1_1_2);
		
		
//	body1_2.setBorder( BorderFactory.createEmptyBorder(0,40,0,40) );
		body1_2.add(text1_2_1);
		body1_2.add(text1_2_2);
		text1_2_1.setCaretColor(Color.red);
		text1_2_2.setCaretColor(Color.red);
		
//	body1_3.setBorder( BorderFactory.createEmptyBorder(0,40,0,40) );
		JLabel t1_3_1=new JLabel("Birth Date");
		JLabel t1_3_2=new JLabel("Gender");
		t1_3_1.setFont(new Font(null,Font.CENTER_BASELINE,16));
		t1_3_2.setFont(new Font(null,Font.CENTER_BASELINE,16));
		body1_3.add(t1_3_1);
		body1_3.add(t1_3_2);
		
//	body1_4.setBorder( BorderFactory.createEmptyBorder(0,40,0,40) );
		body1_4_1.add(text1_4_1_1);
		body1_4_1.add(text1_4_1_2);
		body1_4_1.add(text1_4_1_3);
		text1_4_1_1.setCaretColor(Color.red);
		text1_4_1_2.setCaretColor(Color.red);
		text1_4_1_3.setCaretColor(Color.red);
		JPanel radio =new JPanel();
		radio.setLayout(new FlowLayout());
		radio.setBorder( BorderFactory.createEmptyBorder(0,0,0,150) );
//		radio.setBackground(Color.BLUE);
		JLabel gen=new JLabel("Gender : ");
		fe=new JRadioButton("Female");
		me=new JRadioButton("Male");
		no=new JRadioButton("N/A");
		fe.setFocusable(false);
		me.setFocusable(false);
		no.setFocusable(false);
		gen.setFont(new Font(null,Font.BOLD,16));
		ButtonGroup group=new ButtonGroup();
		group.add(fe);
		group.add(me);
		group.add(no);
		fe.addActionListener(this);
		me.addActionListener(this);
		no.addActionListener(this);
		radio.add(fe);
		radio.add(me);
		radio.add(no);
		body1_4.add(body1_4_1);
		body1_4.add(radio);
		
		
//	body1_5.setBorder( BorderFactory.createEmptyBorder(0,40,0,40) );
		JLabel t1_5_1_1=new JLabel("Day");
		JLabel t1_5_1_2=new JLabel("Month");
		JLabel t1_5_1_3=new JLabel("Year");
		JLabel t1_5_2=new JLabel();
		JLabel t1_5_0=new JLabel("Course");
		t1_5_1_1.setFont(new Font(null,Font.CENTER_BASELINE,9));
		t1_5_1_2.setFont(new Font(null,Font.CENTER_BASELINE,9));
		t1_5_1_3.setFont(new Font(null,Font.CENTER_BASELINE,9));
	
		t1_5_0.setFont(new Font(null,Font.CENTER_BASELINE,16));
		body1_5_1_1.add(t1_5_1_1);
		body1_5_1_1.add(t1_5_1_2);
		body1_5_1_1.add(t1_5_1_3);
		body1_5_1.add(body1_5_1_1);
		body1_5_1.add(t1_5_2);
		body1_5_2.add(t1_5_0);
		body1_5.add(body1_5_1);
		body1_5.add(body1_5_2);
		
		
//	body1_6.setBorder( BorderFactory.createEmptyBorder(0,40,0,40) );
		String[] Major= {"Computer Science","Telecoms And Networking","Digital Business"};
		major=new JComboBox(Major);
		major.setFont(new Font(null,Font.CENTER_BASELINE,15));
		String[] jen= {"Jeneration 1","Generation 2","Generation 3","Generation 4","Generation 5","Generation 6","Generation 7","Generation 8","Generation 9"};
		generation=new JComboBox(jen);
		generation.setFont(new Font(null,Font.CENTER_BASELINE,15));
		generation.setEditable(true);
		major.setEditable(true);
		body1_6.add(major);
		body1_6.add(generation);
		
//	body1_7.setBorder( BorderFactory.createEmptyBorder(0,40,0,40) );
		JLabel t1_7_1=new JLabel("Phone Number");
		t1_7_1.setFont(new Font(null,Font.CENTER_BASELINE,16));
		JLabel t1_7_2=new JLabel("ID");
		t1_7_2.setFont(new Font(null,Font.CENTER_BASELINE,16));
		body1_7.add(t1_7_1);
		body1_7.add(t1_7_2);

		
//	body1_8.setBorder( BorderFactory.createEmptyBorder(0,40,0,40) );
		body1_8.add(text1_8_1);
		body1_8.add(text1_8_2);
		text1_8_1.setCaretColor(Color.red);
		text1_8_2.setCaretColor(Color.red);
		
//	body1_9.setBorder( BorderFactory.createEmptyBorder(0,40,0,40) );
		JLabel t1_9_1=new JLabel("Email");
		t1_9_1.setFont(new Font(null,Font.CENTER_BASELINE,16));
		body1_9.add(t1_9_1);
		
//	body1_10.setBorder( BorderFactory.createEmptyBorder(0,40,0,40) );
		body1_10.add(text1_10_1);
		text1_10_1.setCaretColor(Color.red);
		
//	body1_11.setBorder( BorderFactory.createEmptyBorder(0,40,0,40) );
		JLabel t1_11_1=new JLabel("Password");
		JLabel t1_11_2=new JLabel("Confirm Password");
		t1_11_1.setFont(new Font(null,Font.CENTER_BASELINE,16));
		t1_11_2.setFont(new Font(null,Font.CENTER_BASELINE,16));
		body1_11.add(t1_11_1);
		body1_11.add(t1_11_2);
		
//	body1_12.setBorder( BorderFactory.createEmptyBorder(0,40,0,40) );
		body1_12.add(pas);
		body1_12.add(rpas);
		pas.setCaretColor(Color.red);
		rpas.setCaretColor(Color.red);
		
//	body1_13.setBorder( BorderFactory.createEmptyBorder(0,40,0,40) );
		JLabel t1_13_1=new JLabel("Emergency Contact");
		JLabel t1_13_2=new JLabel("Relationship");
		t1_13_1.setFont(new Font(null,Font.CENTER_BASELINE,16));
		t1_13_2.setFont(new Font(null,Font.CENTER_BASELINE,16));
		body1_13.add(t1_13_1);
		body1_13.add(t1_13_2);
		
//	body1_14.setBorder( BorderFactory.createEmptyBorder(0,40,0,40) );
		body1_14_1.add(text1_14_1_1);
		body1_14_1.add(text1_14_1_2);
		body1_14.add(body1_14_1);
		body1_14.add(text1_14_2);
		text1_14_2.setCaretColor(Color.red);
		text1_14_1_1.setCaretColor(Color.red);
		text1_14_1_2.setCaretColor(Color.red);
		
//	body1_15.setBorder( BorderFactory.createEmptyBorder(0,40,0,40) );
		JLabel t1_15_1_1=new JLabel("Last Name");
		JLabel t1_15_1_2=new JLabel("First Name");
		JLabel t1_15_2=new JLabel("Phone Number Of Person To Contact In Case Of Emergency");
		JLabel t1_15_1_1_0=new JLabel("ex.Father ,Mother ,Sister,etc");
		t1_15_1_1_0.setFont(new Font(null,Font.CENTER_BASELINE,9));
		t1_15_1_1.setFont(new Font(null,Font.CENTER_BASELINE,9));
		t1_15_1_2.setFont(new Font(null,Font.CENTER_BASELINE,9));
		t1_15_2.setFont(new Font(null,Font.CENTER_BASELINE,15));
		body1_15_1_1.add(t1_15_1_1);
		body1_15_1_1.add(t1_15_1_2);
		body1_15_1.add(body1_15_1_1);
		body1_15_1.add(t1_15_1_1_0);
		body1_15_2.add(t1_15_2);
		body1_15.add(body1_15_1);
		body1_15.add(body1_15_2);
//	body1_16.setBorder( BorderFactory.createEmptyBorder(0,40,0,40) );
		body1_16.add(text1_16_1);
		text1_16_1.setCaretColor(Color.red);
		
//	body1_17.setBorder( BorderFactory.createEmptyBorder(0,40,0,40) );
		submit.setForeground(Color.white);
		submit.setFocusable(false);
		reset.setForeground(Color.white);
		reset.setFocusable(false);
		submit.setBackground(new Color( 65, 102, 245));
		reset.setBackground(new Color(50, 205, 50 ));
		body1_17.add(reset);
		body1_17.add(submit);
		
		
		  text1_2_1.addActionListener(this);
		  text1_2_2.addActionListener(this);
		    
		  text1_4_1_1.addActionListener(this);
		  text1_4_1_2.addActionListener(this);
		  text1_4_1_3.addActionListener(this);
		  major.addActionListener(this);
		  generation.addActionListener(this);
		    
		  text1_8_1.addActionListener(this);
		  text1_8_2.addActionListener(this);
		    
		  text1_10_1.addActionListener(this);
		    
		  pas.addActionListener(this);
		  rpas.addActionListener(this);
		    
		  text1_14_1_1.addActionListener(this);
		  text1_14_1_2.addActionListener(this);
		  text1_14_2.addActionListener(this);
		    
		  text1_16_1.addActionListener(this);
		    
		  reset.addActionListener(this);
		  submit.addActionListener(this);
		    
		
		
		
		body1.add(body1_1);
		body1.add(body1_2);
		body1.add(body1_3);
		body1.add(body1_4);
		body1.add(body1_5);
		body1.add(body1_6);
		body1.add(body1_7);
		body1.add(body1_8);
		body1.add(body1_9);
		body1.add(body1_10);
		body1.add(body1_11);
		body1.add(body1_12);
		body1.add(body1_13);
		body1.add(body1_14);
		body1.add(body1_15);
		body1.add(body1_16);
		body1.add(body1_17);
		

		
		
		
		body.add(body1);
		panel5.add(body);
		
		panel1_1.add(register);
		panel1.add(panel1_1);
//		
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
		if(e.getSource()==submit) {
			String gen ="";
			if(fe.isSelected()) {
				gen="Female";
			}else if(me.isSelected()) {
				gen="Male";
			}else if(me.isSelected()) {
				gen="N/A";
			}	
			String re=new String (pas.getPassword());
			String re1=new String (rpas.getPassword());
			 String name=(String) generation.getSelectedItem()+"(full)"+".txt";
			 String name1=(String) generation.getSelectedItem()+".txt";
			 LocalDate today=LocalDate.now();
			 int day=Integer.parseInt(text1_4_1_1.getText());
			 int month=Integer.parseInt(text1_4_1_2.getText());
			 int year=Integer.parseInt(text1_4_1_3.getText());
			 LocalDate birt=LocalDate.of(year, month, day);
			 int Age=Period.between(birt, today).getYears();
			
			 try {
				 //file management
					FileWriter write=new FileWriter(name1,true);
					PrintWriter wr=new PrintWriter(write);
				 //file all data
					FileWriter write1=new FileWriter(name,true);
					PrintWriter wr1=new PrintWriter(write1);
				//file login(email,passowrd)	
					FileWriter write2=new FileWriter("Login.txt",true);
					PrintWriter wr2=new PrintWriter(write2);
					System.out.println(pas.getPassword());
					System.out.println(rpas.getPassword());
					
					
					
					if(text1_2_1.getText().equals("")|| text1_2_2.getText().equals("")||text1_4_1_1.getText().equals("")||text1_4_1_2.getText().equals("")||text1_4_1_3.getText().equals("")||gen==""||major.getSelectedItem()==null||generation.getSelectedItem()==null||text1_8_1.getText().equals("")||text1_8_2.getText().equals("")||text1_10_1.getText().equals("")||pas.getPassword().equals("")||rpas.getPassword().equals("")||text1_14_1_1.getText().equals("")||text1_14_1_2.getText().equals("")||text1_14_2.getText().equals("")||text1_16_1.getText().equals("")) {
						JOptionPane.showInternalMessageDialog(null,"Please input all your informations!","Miss data",JOptionPane.WARNING_MESSAGE);
					}else if(!(re.equals(re1))) {
						JOptionPane.showInternalMessageDialog(null,"Please password again!","Passwords do not match ",JOptionPane.WARNING_MESSAGE);
						rpas.setText(null);
					}
					else if(!text1_2_1.getText().equals("")&&! text1_2_2.getText().equals("")&&!text1_4_1_1.getText().equals("")&&!text1_4_1_2.getText().equals("")&&!text1_4_1_3.getText().equals("")&&gen!=""&&major.getSelectedItem()!=null&&generation.getSelectedItem()!=null&&!text1_8_1.getText().equals("")&&!text1_8_2.getText().equals("")&&!text1_10_1.getText().equals("")&&!pas.getPassword().equals("")&&!rpas.getPassword().equals("")&&!text1_14_1_1.getText().equals("")&&!text1_14_1_2.getText().equals("")&&!text1_14_2.getText().equals("")&&!text1_16_1.getText().equals("")&&re.equals(re1)){
						wr1.println(text1_2_1.getText()+","+text1_2_2.getText()+","+text1_4_1_1.getText()+","+text1_4_1_2.getText()+","+text1_4_1_3.getText()+","+gen+","+ major.getSelectedItem()+","+text1_8_1.getText()+","+text1_8_2.getText()+","+text1_10_1.getText()+","+text1_14_1_1.getText()+","+text1_14_1_2.getText()+","+text1_16_1.getText());
						wr.println(text1_8_2.getText()+","+text1_2_1.getText()+" "+text1_2_2.getText()+","+gen+","+Age+","+major.getSelectedItem()+","+text1_10_1.getText());
						wr2.println(text1_10_1.getText()+","+text1_8_1.getText()+","+re+","+text1_8_2.getText()+","+text1_2_1.getText()+" "+text1_2_2.getText());
                        
						  text1_2_1.setText(null);
						  text1_2_2.setText(null);
						    
						  text1_4_1_1.setText(null);
						  text1_4_1_2.setText(null);
						  text1_4_1_3.setText(null);
						    
						  text1_8_1.setText(null);
						  text1_8_2.setText(null);
						    
						  text1_10_1.setText(null);
						    
						  pas.setText(null);
						  rpas.setText(null);
						    
						  text1_14_1_1.setText(null);
						  text1_14_1_2.setText(null);
						  text1_14_2.setText(null);;
						    
						  text1_16_1.setText(null);
						  
						  this.dispose();  
						  Testlo t=new Testlo();
						
						
					}
					wr.close();
					write.close();
					wr1.close();
					write1.close();
					wr2.close();
					write2.close();

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
		}else if(e.getSource()==reset) {
			 text1_2_1.setText(null);
			  text1_2_2.setText(null);
			    
			  text1_4_1_1.setText(null);
			  text1_4_1_2.setText(null);
			  text1_4_1_3.setText(null);
			    
			  text1_8_1.setText(null);
			  text1_8_2.setText(null);
			    
			  text1_10_1.setText(null);
			    
			  pas.setText(null);
			  rpas.setText(null);
			    
			  text1_14_1_1.setText(null);
			  text1_14_1_2.setText(null);
			  text1_14_2.setText(null);;
			    
			  text1_16_1.setText(null);
		}
		if(e.getSource()==admin) {
			this.dispose();
			Testload t=new Testload();
		}
		else if(e.getSource()==student) {
			this.dispose();
			Testlo t=new Testlo();
		}
		
	}

}
public class Register {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		TestLogin t=new TestLogin();
	}

}
