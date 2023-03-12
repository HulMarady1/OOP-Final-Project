package finalproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

class Testhis extends JFrame implements ActionListener{
	JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JPanel panel3=new JPanel(new GridLayout(1,1));
    JPanel panel3_1=new JPanel();

    JPanel panel4=new JPanel();
    JPanel panel5=new JPanel();
    JPanel panel5_1=new JPanel(new GridLayout(1,2,40,40));
    JPanel panel5_2=new JPanel(new GridLayout(1,1));
    
	JButton bsearch=new JButton("Search");
	JButton dis=new JButton("Display");
	DefaultTableModel model;
	JMenuBar menubar;
	
	JMenu manegement;
	JMenuItem Mange;
	JMenuItem his;
	
	JMenu login;
	JMenuItem  admin;
	JMenuItem student;
	JMenuItem  logout;
	JMenuItem  DisplayT;
	JMenuItem  manageT;
	
	JMenu test;
	JMenu attendance;
	
	JLabel tsearch;
	JTextField search;
	
	 JComboBox generation;
	
	Testhis(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1200,800);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLayout(new BorderLayout());
		
		
		menubar=new JMenuBar();
		menubar.setBounds(0, 0, 50, 50);
		menubar.setBackground(Color.white);
		
				
		//menu
		manegement =new JMenu("Manengement");
		test =new JMenu("Test");
		attendance =new JMenu("Attendence");
		login =new JMenu("Log out");
		manegement.setFont(new Font(null,Font.BOLD,15));
		test.setFont(new Font(null,Font.BOLD,15));
		attendance.setFont(new Font(null,Font.BOLD,15));
		login.setFont(new Font(null,Font.BOLD,15));
		
		//item
		Mange=new JMenuItem("Manage Infomation");
		Mange.addActionListener(this);
		his=new JMenuItem("History");
		his.addActionListener(this);
		
		admin=new JMenuItem("Admin");
		admin.addActionListener(this);
		student=new JMenuItem("Student");
		student.addActionListener(this);
		logout=new JMenuItem("Sign out");
		logout.addActionListener(this);
		DisplayT=new JMenuItem("Display Score");
		DisplayT.addActionListener(this);
		manageT=new JMenuItem("Manage Test ");
		manageT.addActionListener(this);
		
		manegement.add(Mange);
		manegement.add(his);
		
//		login.add(admin);
//		login.add(student);
		login.add(logout);
		test.add(manageT);
		test.add(DisplayT);
		
		
		panel1.setBackground(new Color( 0, 0, 128));
		panel1.setLayout(new GridLayout(1,1));
		panel1.setBorder( BorderFactory.createEmptyBorder(20,20,0,20) );
		JPanel panel1_1=new JPanel();
//		panel1_1.setBackground(Color.black);
		panel1_1.setBorder( BorderFactory.createEmptyBorder(5,0,0,0) );
		JLabel register=new JLabel("Information" );
		register.setForeground(Color.white);
		register.setFont(new Font(null,Font.BOLD,30));
		panel1_1.setBackground(new Color(255, 180, 0 ));
		
		
		panel2.setBackground(new Color( 0, 0, 128));
		panel3.setBackground(new Color( 0, 0, 128));
		panel4.setBackground(new Color( 0, 0, 128));
		panel1.setPreferredSize(new Dimension(200,80));
		panel2.setPreferredSize(new Dimension(20,20));
		panel3.setPreferredSize(new Dimension(20,65));
		panel4.setPreferredSize(new Dimension(20,20));
//		panel3.setBackground(Color.red);
		panel3.setBorder( BorderFactory.createEmptyBorder(0,20,20,20) );
		panel3_1.setBorder( BorderFactory.createEmptyBorder(0,1150,14,0) );
//		panel3_1.setBackground(Color.LIGHT_GRAY);
		
		
		dis.setBackground(new Color( 65, 102, 245));
		dis.setFocusable(false);
		dis.setForeground(Color.white);
		dis.setPreferredSize(new Dimension(120,35));
		dis.addActionListener(this);
		
//		panel5.setBackground(Color.green);
		panel5.setLayout(new GridLayout(1,1));
		panel5.setBackground(Color.white);
		panel5.setBorder( BorderFactory.createEmptyBorder(10,50,10,50) );
		panel5.setLayout(new BorderLayout());
		
		
//		panel5_1.setBackground(Color.red);
		panel5_1.setPreferredSize(new Dimension(300,80));
		
		JPanel panel5_1_1=new JPanel(new GridLayout(1,2));
		JPanel panel5_1_2=new JPanel(new GridLayout(1,2));
		
		panel5_1_1.setBorder( BorderFactory.createEmptyBorder(20,0,20,0) );
		panel5_1_2.setBorder( BorderFactory.createEmptyBorder(20,20,20,20) );
		
		JPanel panel5_1_1_0=new JPanel();
		JPanel panel5_1_1_1=new JPanel();
		
//		panel5_1_1_0.setBackground(Color.gray);
		panel5_1_1_0.setLayout(new FlowLayout());
//		panel5_1_1_1.setBackground(Color.green);
		
		panel5_1_1_1.setBorder( BorderFactory.createEmptyBorder(0,5,0,240) );
		
		JPanel panel5_1_2_0=new JPanel();
		JPanel panel5_1_2_1=new JPanel();
		panel5_1_2_0.setBorder( BorderFactory.createEmptyBorder(0,245,0,5) );
		panel5_1_2_1.setBorder( BorderFactory.createEmptyBorder(0,5,5,5) );
		
//		panel5_1_2_0.setBackground(Color.gray);
//		panel5_1_2_1.setBackground(Color.green);
		
		search=new JTextField();
		search.setPreferredSize(new Dimension(156,30));
//		
		tsearch=new JLabel("Search :");
		tsearch.setBorder( BorderFactory.createEmptyBorder(0,110,0,0) );
		tsearch.setFont(new Font(null,Font.CENTER_BASELINE,15));
		
		bsearch.setBackground(new Color(50, 205, 50 ));
		search.setCaretColor(Color.red);
		bsearch.setFocusable(false);
		bsearch.setForeground(Color.white);
		bsearch.setPreferredSize(new Dimension(90,30));
		
		String[] jen= {"Generation 1","Generation 2","Generation 3","Generation 4","Generation 5","Generation 6","Generation 7","Generation 8","Generation 9"};
		generation=new JComboBox(jen);
		generation.setEditable(true);
		generation.setBorder(new EmptyBorder(5,5,5,5));
		JLabel tjen=new JLabel("Jeneration :");
		tjen.setFont(new Font(null,Font.CENTER_BASELINE,15));
		generation.setFont(new Font(null,Font.CENTER_BASELINE,13));
		
		generation.addActionListener(this);
		bsearch.addActionListener(this);
		panel5_1_1_0.add(tsearch);
		panel5_1_1_0.add(search);
		panel5_1_1_1.add(bsearch);
		
		panel5_1_1.add(panel5_1_1_0);
		panel5_1_1.add(panel5_1_1_1);
		
		panel5_1_2_1.add(tjen);
		panel5_1_2_1.add(generation);
		
		panel5_1_2.add(panel5_1_2_0);
		panel5_1_2.add(panel5_1_2_1);
		
		panel5_1.add(panel5_1_1);
		panel5_1.add(panel5_1_2);
		
		//table
		
		DefaultTableModel header=new  DefaultTableModel();
		header.addColumn("ID");
		header.addColumn("Name");
		header.addColumn("Gender");
		header.addColumn("Major");
		header.addColumn("Email");
		header.addColumn("Phone number");
		header.addColumn("Birth date");
		header.addColumn("Contact name");
		header.addColumn("Phone number ");
//		header.addColumn("");
//		header.addColumn("");
	    JTable t=new JTable(header);
		model= (DefaultTableModel) t.getModel();
		 
		String name= generation.getSelectedItem()+"(full)"+".txt";
		
		try {
			Scanner scanner =new Scanner(new File(name));
			
			int k=0;
			while(scanner.hasNextLine()) {
				String line=scanner.nextLine();
				k++;
				if(line.isEmpty()) {
					continue;
				}
				String[] wordarr=line.split(",");
				String t1=wordarr[0],t2=wordarr[1],t3=wordarr[2],t4=wordarr[3],t5=wordarr[4],t6=wordarr[5],t7=wordarr[6],t8=wordarr[7],t9=wordarr[8],t10=wordarr[9],t11=wordarr[10],t12=wordarr[11],t13=wordarr[12];
				String na=t1+" "+t2,date=t3+"/"+t4+"/"+t5,cona=t11+" "+t12;
				model.addRow(new Object[]{t9,na,t6,t7,t10,t8,date,cona,t13});
					}
			scanner.close();
		} catch(Exception e) {
	         e.printStackTrace();
	    }
		
		
		
		
		t.setFont(new Font(null,1,15));
		t.setRowHeight(30);
		t.setEnabled(false);
		JTableHeader header1 = t.getTableHeader();
		
		header1.setBackground(Color.gray);
		header1.setFont(new Font(null,Font.BOLD,16));
		
		
		JScrollPane sp=new JScrollPane(t);
		
//		JPanel pane2_1=new JPanel();
//		pane2_1.setBorder( BorderFactory.createEmptyBorder(0,20,20,20) );
//		pane2_1.add(sp);
		panel5_2.add(sp);
		panel5_2.setBackground(Color.black);
		
//		body1.add(tex1_1);
//		body1.add(tex1_2);
//		body1.add(tex1_3);
//		body1.add(tex1_4);
//		body1.add(tex1_5);
//		body1.add(tex1_6);
//		body1.add(tex1_7);
//		body1.add(tex1_8);
	
		
//		body.add(body1);
//		panel5.add(body);
		panel5.add(panel5_1,BorderLayout.NORTH);
		panel5.add(panel5_2,BorderLayout.CENTER);
		panel1_1.add(register);
		panel1.add(panel1_1);
		
		menubar.add(manegement);
		menubar.add(test);
//		menubar.add(attendance);
		menubar.add(login);
		panel3_1.add(dis);
		panel3.add(panel3_1);
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
		if(e.getSource()==bsearch) {
			 String name=(String) generation.getSelectedItem()+"(full)"+".txt";
			try {
				Scanner scanner =new Scanner(new File(name));
				
				int k=0;
				while(scanner.hasNextLine()) {
					String line=scanner.nextLine();
					k++;
					if(line.isEmpty()) {
						continue;
					}
					String[] wordarr=line.split(",");
					String t1=wordarr[0],t2=wordarr[1],t3=wordarr[2],t4=wordarr[3],t5=wordarr[4],t6=wordarr[5],t7=wordarr[6],t8=wordarr[7],t9=wordarr[8],t10=wordarr[9],t11=wordarr[10],t12=wordarr[11],t13=wordarr[12];
					String na=t1+" "+t2,date=t3+"/"+t4+"/"+t5,cona=t11+" "+t12;
					
					if(search.getText().equals(t9) ) {
						model.getDataVector().removeAllElements();
						model.addRow(new Object[]{t9,na,t6,t7,t10,t8,date,cona,t13});
			
					}
				}
				scanner.close();
			} catch(Exception e1) {
		         e1.printStackTrace();
		     }
	}
		if(e.getSource()==dis) {
			model.getDataVector().removeAllElements();
			 String name= generation.getSelectedItem()+"(full)"+".txt";
			 
				try {
					Scanner scanner =new Scanner(new File(name));
					
					int k=0;
					while(scanner.hasNextLine()) {
						String line=scanner.nextLine();
						k++;
						if(line.isEmpty()) {
							continue;
						}
						String[] wordarr=line.split(",");
						String t1=wordarr[0],t2=wordarr[1],t3=wordarr[2],t4=wordarr[3],t5=wordarr[4],t6=wordarr[5],t7=wordarr[6],t8=wordarr[7],t9=wordarr[8],t10=wordarr[9],t11=wordarr[10],t12=wordarr[11],t13=wordarr[12];
						String na=t1+" "+t2,date=t3+"/"+t4+"/"+t5,cona=t11+" "+t12;
						model.addRow(new Object[]{t9,na,t6,t7,t10,t8,date,cona,t13});
					
					}
					scanner.close();
				} catch(Exception e1) {
			         e1.printStackTrace();
			     }
		}
		if(e.getSource()==manageT) {
			Quiz_Admin Q =new Quiz_Admin();
		}
		if(e.getSource()==logout) {
			Testload t=new Testload();	
		}
		if(e.getSource()==DisplayT) {
			Read kk=new Read();
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
		}
		
	
    }
}

public class History {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testhis p=new Testhis();
	}

}
