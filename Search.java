
package finalproject;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.AbstractButton;
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
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

class Edit extends JFrame implements ActionListener{
	JPanel pane1;
	JPanel pane2;
	JButton bu1=new JButton("Add new");
	JButton bu2=new JButton("Update");
	JButton bu3=new JButton("Delete");
	JButton bu4=new JButton("Display");
	JButton bsearch=new JButton("Search");
	JPanel pane1_1=new JPanel();
	JPanel pane1_2=new JPanel();
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField t4;
	JTextField t5;
	DefaultTableModel model;
	JRadioButton fe;
	JRadioButton me;
	JComboBox major;
	JLabel tsearch;
	JTextField search;
	JMenuBar menubar;
	
	JMenu manegement;
	JMenuItem Mange;
	JMenuItem his;
	
	JMenu login;
	JMenuItem student;
	JMenuItem  logout;
	JMenuItem  DisplayT;
	JMenuItem  manageT;

//	JMenuItem  admin;
//	JMenuItem student;
	
	JMenu test;
//	JMenu attendance;
	JComboBox generation;
	
	
	

	Edit() throws FileNotFoundException{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new GridLayout(2,1,0,0));
		this.setBackground(Color.black);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		pane1 = new JPanel();
		pane1.setLayout(new GridLayout(2,1,0,0));
		pane1.setBackground(new Color( 0, 0, 128));
//		pane1.setBackground(Color.white);
		pane1.setPreferredSize(new Dimension(500,200));
		pane1.setBorder( BorderFactory.createEmptyBorder(20,20,0,20) );
		
		String[] Major= {"Computer Science","Telecoms And Networking","Digital Business"};
		major=new JComboBox(Major);
		major.setFont(new Font(null,Font.CENTER_BASELINE,15));
		
		menubar=new JMenuBar();
		menubar.setBounds(0, 0, 50, 50);
		menubar.setBackground(Color.white);
		
				
		//menu
		manegement =new JMenu("Manengement");
		test =new JMenu("Test");
//		attendance =new JMenu("Attendence");
		login =new JMenu("Log out");
		manegement.setFont(new Font(null,Font.BOLD,15));
		test.setFont(new Font(null,Font.BOLD,15));
//		attendance.setFont(new Font(null,Font.BOLD,15));
		login.setFont(new Font(null,Font.BOLD,15));
		manegement.addActionListener(this);
		login.addActionListener(this);
		
		
//		item
		Mange=new JMenuItem("Manage Infomation");
		Mange.addActionListener(this);
		his=new JMenuItem("History");
		his.addActionListener(this);
//		admin=new JMenuItem("Admin");
//		admin.addActionListener(this);
//		student=new JMenuItem("Student");
//		student.addActionListener(this);
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
//		student.addActionListener(this);
		login.add(logout);
		test.add(manageT);
		test.add(DisplayT);
		
		
		
		pane1_1.setLayout(new GridLayout(3,1,0,0));
//		pane1_1.setBackground(Color.gray);
//		pane1_2.setBackground(Color.green);
		pane1_1.setBorder( BorderFactory.createEmptyBorder(0,20,0,0) );
		
		
		JLabel la1=new JLabel("Student Management");
		JPanel pane1_1_0=new JPanel();;
//		pane1_1_0.setBackground(Color.GREEN);
		
		pane1_1_0.setBorder( BorderFactory.createEmptyBorder(10,0,0,0) );
		
		JPanel pane1_1_1=new JPanel(new GridLayout(1,2,0,0));
		pane1_1_1.setBorder( BorderFactory.createEmptyBorder(20,0,0,0) );
//		pane1_1_1.setBackground(Color.black);
		JPanel pane1_1_1_0=new JPanel(new GridLayout(1,2,0,20));
		JPanel pane1_1_1_1=new JPanel(new GridLayout(1,2,0,0));
		JPanel pane1_1_1_0_0=new JPanel();
		JPanel pane1_1_1_0_1=new JPanel();
//		pane1_1_1_0_0.setBackground(Color.black);
//		pane1_1_1_0_1.setBackground(Color.white);
//		pane1_1_1_0.setBackground(Color.LIGHT_GRAY);
		search=new JTextField();
		search.setCaretColor(Color.red);
		tsearch=new JLabel("Search :");
		tsearch.setBorder( BorderFactory.createEmptyBorder(0,110,0,0) );
		tsearch.setFont(new Font(null,Font.CENTER_BASELINE,15));
		
		
		
		bsearch.setFocusable(false);
		bsearch.setPreferredSize(new Dimension(100,30));
		pane1_1_1_0_0.setBorder( BorderFactory.createEmptyBorder(0,0,25,50) );
		
		
		pane1_1_1_1.setBackground(Color.cyan);
		JPanel pane1_1_1_1_0=new JPanel();
		JPanel pane1_1_1_1_1=new JPanel();
		pane1_1_1_1_1.setBorder( BorderFactory.createEmptyBorder(0,30,0,0) );
//		pane1_1_1_1_0.setBackground(Color.black);
//		pane1_1_1_1_1.setBackground(Color.white);
		//Cambobox button
		String[] jen= {"Generation 1","Generation 2","Generation 3","Generation 4","Generation 5","Generation 6","Generation 7","Generation 8","Generation 9"};
		generation=new JComboBox(jen);
		generation.setEditable(true);
		generation.setBorder(new EmptyBorder(5,5,5,5));
		JLabel tjen=new JLabel("Generation :");
		tjen.setFont(new Font(null,Font.CENTER_BASELINE,15));
		generation.setFont(new Font(null,Font.CENTER_BASELINE,13));
		pane1_1_1_1_0.add(tjen);
		pane1_1_1_1_0.add(generation);
		
		JLabel lo1=new JLabel("ID");
		lo1.setFont(new Font(null,Font.CENTER_BASELINE,15));
		JLabel lo2=new JLabel("Name");
		lo2.setFont(new Font(null,Font.CENTER_BASELINE,15));
		JLabel lo3=new JLabel("Age");
		lo3.setFont(new Font(null,Font.CENTER_BASELINE,15));
		JLabel lo4=new JLabel("Major");
		lo4.setFont(new Font(null,Font.CENTER_BASELINE,15));
		JLabel lo5=new JLabel("Email");
		lo5.setFont(new Font(null,Font.CENTER_BASELINE,15));
		
		JPanel pane1_1_2=new JPanel(new GridLayout(1,5,50,0));
		pane1_1_2.setBorder( BorderFactory.createEmptyBorder(30,10,0,10) );
		
		bu1.setFont(new Font(null,Font.BOLD,15));
		bu1.setForeground(Color.white);
		bu1.setFocusable(false);
		bu1.setBackground(new Color( 65, 102, 245));
		bu1.setOpaque(true);
		bu1.setBorder(new RoundedBorder(15));
		
		
		bu2.setFont(new Font(null,Font.BOLD,15));
		bu2.setForeground(Color.white);
		bu2.setFocusable(false);
		bu2.setBackground(new Color( 255, 127, 0));
		bu2.setOpaque(true);
		bu2.setBorder(new RoundedBorder(15));
		
		bu3.setFont(new Font(null,Font.BOLD,15));
		bu3.setForeground(Color.white);
		bu3.setFocusable(false);
		bu3.setBackground(new Color( 228,0,70));
		bu3.setOpaque(true);
		bu3.setBorder(new RoundedBorder(15));
		
		bu4.setFont(new Font(null,Font.BOLD,15));
		bu4.setForeground(Color.white);
		bu4.setFocusable(false);
		bu4.setBackground(new Color(50, 205, 50 ));
		bu4.setOpaque(true);
		bu4.setBorder(new RoundedBorder(15));
		
		bsearch.setBackground(new Color(255, 167, 0 ));
		bsearch.setForeground(Color.white);
		bsearch.setBorder(new RoundedBorder(15));
		bsearch.addActionListener(this);
//		
		
		
		pane1_2.setLayout(new GridLayout(2,1,50,0));
		
		JPanel pane1_2_1 =new JPanel();
		pane1_2_1.setLayout(new GridLayout(1,5,50,0));
//		pane1_2_1.setBackground(Color.GRAY);
		pane1_2_1.setBorder(BorderFactory.createEmptyBorder(0,20,40,20) );
		JPanel pane1_2_2 =new JPanel(new GridLayout(1,2,50,0));
//		pane1_2_2.setBackground(Color.cyan);
		pane1_2_2.setBorder(BorderFactory.createEmptyBorder(10,70,25,70) );
		JPanel radio =new JPanel();
		JPanel Button =new JPanel(new GridLayout(1,4,50,50));
//		radio.setBackground(Color.black);
//		Button.setBackground(Color.darkGray);
		radio.setLayout(new FlowLayout());
		JLabel gen=new JLabel("Gender : ");
		fe=new JRadioButton("Female");
		me=new JRadioButton("Male");
		fe.setFocusable(false);
		me.setFocusable(false);
		fe.setFont(new Font(null,Font.ITALIC,18));
		me.setFont(new Font(null,Font.ITALIC,18));
		gen.setFont(new Font(null,Font.BOLD,16));
		ButtonGroup group=new ButtonGroup();
		group.add(fe);
		group.add(me);
		fe.addActionListener(this);
		me.addActionListener(this);
		
		
		la1.setFont(new Font(null,Font.BOLD,30));
		
		bu1.addActionListener(this);
		bu2.addActionListener(this);
		bu3.addActionListener(this);
		bu4.addActionListener(this);
		t1=new JTextField();
		t1.setFont(new Font(null,Font.CENTER_BASELINE,15));
		t2=new JTextField();
		t2.setFont(new Font(null,Font.CENTER_BASELINE,15));
		t3=new JTextField();
		t3.setFont(new Font(null,Font.CENTER_BASELINE,15));
//		t4=new JTextField();
//		t4.setFont(new Font(null,Font.CENTER_BASELINE,15));
		t5=new JTextField();
		
		t5.setCaretColor(Color.red);
		t1.setCaretColor(Color.red);
		t2.setCaretColor(Color.red);
		t3.setCaretColor(Color.red);
		
		t5.setFont(new Font(null,Font.CENTER_BASELINE,15));
		t1.setBorder(BorderFactory.createEmptyBorder(0,15,0,0) );
		t2.setBorder(BorderFactory.createEmptyBorder(0,15,0,0) );
		t3.setBorder(BorderFactory.createEmptyBorder(0,15,0,0) );
		major.setBorder(BorderFactory.createEmptyBorder(0,15,0,0) );
		major.setEditable(true);
		major.setBorder(new EmptyBorder(5,5,5,5));
		t5.setBorder(BorderFactory.createEmptyBorder(0,15,0,0) );
		search.setBorder(BorderFactory.createEmptyBorder(0,10,0,0));
		
		
		pane1_1_1_0.add(tsearch);
		pane1_1_1_0.add(search);
		pane1_1_1_0_0.add(bsearch);
		pane1_1_1_1_1.add(tjen);
		pane1_1_1_1_1.add(generation);
		pane1_1_1_0.add(pane1_1_1_0_0);
		pane1_1_1_0.add(pane1_1_1_0_1);
		pane1_1_1_1.add(pane1_1_1_1_0);
		pane1_1_1_1.add(pane1_1_1_1_1);
		pane1_2_1.add(t1);
		pane1_2_1.add(t2);
		pane1_2_1.add(t3);
//		pane1_2_1.add(t4);
		pane1_2_1.add(major);
		pane1_2_1.add(t5);
		pane1_1_0.add(la1);
		pane1_1_1.add(pane1_1_1_0);
		pane1_1_1.add(pane1_1_1_1);
		pane1_1_2.add(lo1);
		pane1_1_2.add(lo2);
		pane1_1_2.add(lo3);
		pane1_1_2.add(lo4);
		pane1_1_2.add(lo5);
		
		radio.add(gen);
		radio.add(fe);
		radio.add(me);
		Button.add(bu1);
		Button.add(bu2);
		Button.add(bu3);
		Button.add(bu4);
		pane1_2_2.add(radio);
		pane1_2_2.add(Button);
		
		
		pane1_1.add(pane1_1_0);
		pane1_1.add(pane1_1_1);
		pane1_1.add(pane1_1_2);
		
		
		
		pane1_2.add(pane1_2_1);
		pane1_2.add(pane1_2_2);
		pane1.add(pane1_1);
		pane1.add(pane1_2);
		
		
		
		
		pane2 = new JPanel();
		pane2.setBackground(new Color( 0, 0, 128));
		pane2.setPreferredSize(new Dimension(500,300));

		DefaultTableModel header=new  DefaultTableModel();
		header.addColumn("ID");
		header.addColumn("Name");
		header.addColumn("Gender");
		header.addColumn("Age");
		header.addColumn("Major");
		header.addColumn("Email");
	    JTable t=new JTable(header);
		model= (DefaultTableModel) t.getModel();
		 
		String name=(String) generation.getSelectedItem()+".txt";
		
		
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
				String slname=wordarr[0],sfname=wordarr[1],sgender=wordarr[2],age=wordarr[3],major=wordarr[4],email=wordarr[5];
				model.addRow(new Object[]{slname,sfname,sgender,age,major,email});
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
		header1.setFont(new Font(null,Font.BOLD,20));
		
		
		JScrollPane sp=new JScrollPane(t);
		
		JPanel pane2_1=new JPanel();
		pane2_1.setBorder( BorderFactory.createEmptyBorder(0,20,20,20) );
		pane2_1.add(sp);
		pane2.add(pane2_1);
		
		
		pane2.setLayout(new GridLayout(1,1));
		pane2_1.setLayout(new GridLayout(1,1));
		pane2.setBorder( BorderFactory.createEmptyBorder(0,20,20,20) );

		menubar.add(manegement);
		menubar.add(test);
//		menubar.add(attendance);
		menubar.add(login);
		this.setJMenuBar(menubar);
		this.add(pane1);
		this.add(pane2);
		
		this.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
//		 if(e.getSource()==student) {
//			
//			Testlo l=new Testlo();
//		}
		
		//button delete
		if(e.getSource()==bu3) {
			String gen ="";
			if(fe.isSelected()) {
				gen="Female";
			}else if(me.isSelected()) {
				gen="Male";
			}
			int result=JOptionPane.showConfirmDialog(null,"Your data will delete.Are you sure? ","Confirm",JOptionPane.YES_NO_OPTION);
			if(result==JOptionPane.YES_OPTION) {
			String name=(String) generation.getSelectedItem()+".txt";
				try {
					File newfile=new File("te.txt");
				    File oldfile=new File(name);
					FileWriter f1 = new FileWriter("te.txt",true);
					
					BufferedWriter pa=new BufferedWriter(f1);
					PrintWriter lin=new PrintWriter(pa);
					
					Scanner sc = new Scanner(new File(name));
					Scanner scanner =new Scanner(new File(name));
					
					while(scanner.hasNextLine()) {
						String line=scanner.nextLine();
						String itemText = (String)major.getSelectedItem();
						if(line.isEmpty()) {
							continue;
						}
						String[] wordarr=line.split(",");
						String slname=wordarr[0],sfname=wordarr[1],sgender=wordarr[2],age=wordarr[3],major=wordarr[4],email=wordarr[5];
						if(!search.getText().equals(slname) ) {
							lin.println(slname+","+sfname+","+sgender+","+age+","+major+","+email);
						}
					}
					scanner.close();
					pa.close();
					sc.close();
					lin.close();
					f1.close();
				   if(oldfile.exists()) {
				    	if(oldfile.delete()) {
				    		System.out.println("delete successfully");
				    	}else {
				    		System.out.println("delete successfully");
				    	}
				    }else {
				    	System.out.println("don't have file");
				    }		
					File dum=new File(name);
					if(newfile.renameTo(dum)) {
						System.out.println("rename successfully");
					}else {
						System.out.println("rename not successfully");
					}
				
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			//dfghjk
			
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
			t5.setText(null);
			search.setText(null);
		}
		//button update
		if(e.getSource()==bu2) {
			String gen ="";
			if(fe.isSelected()) {
				gen="Female";
			}else if(me.isSelected()) {
				gen="Male";
			}
			String name=(String) generation.getSelectedItem()+".txt";
			//dfghjk
			try {
				File newfile=new File("te.txt");
			    File oldfile=new File(name);
				FileWriter f1 = new FileWriter("te.txt",true);
				
				BufferedWriter pa=new BufferedWriter(f1);
				PrintWriter lin=new PrintWriter(pa);
				
				Scanner sc = new Scanner(new File(name));
				Scanner scanner =new Scanner(new File(name));
				
				while(scanner.hasNextLine()) {
					String line=scanner.nextLine();
					String itemText = (String)major.getSelectedItem();
					if(line.isEmpty()) {
						continue;
					}
					String[] wordarr=line.split(",");
					String slname=wordarr[0],sfname=wordarr[1],sgender=wordarr[2],age=wordarr[3],major=wordarr[4],email=wordarr[5];
					if(search.getText().equals(slname) ) {
						lin.println(t1.getText()+","+t2.getText()+","+gen+","+t3.getText()+","+itemText+","+t5.getText());	
					}else {
						lin.println(slname+","+sfname+","+sgender+","+age+","+major+","+email);
					}
				}
				scanner.close();
				pa.close();
				sc.close();
				lin.close();
				f1.close();
			   if(oldfile.exists()) {
			    	if(oldfile.delete()) {
			    		System.out.println("delete successfully");
			    	}else {
			    		System.out.println("delete successfully");
			    	}
			    }else {
			    	System.out.println("don't have file");
			    }		
				File dum=new File(name);
				if(newfile.renameTo(dum)) {
					System.out.println("rename successfully");
				}else {
					System.out.println("rename not successfully");
				}
			
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
			t5.setText(null);
			search.setText(null);
		}
		
		//button display
		if(e.getSource()==bu4) {
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
			t5.setText(null);
			search.setText(null);
			model.getDataVector().removeAllElements();
			String name=(String) generation.getSelectedItem()+".txt";
		
				
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
						String slname=wordarr[0],sfname=wordarr[1],sgender=wordarr[2],age=wordarr[3],major=wordarr[4],email=wordarr[5];
						model.addRow(new Object[]{slname,sfname,sgender,age,major,email});
							}
					scanner.close();
				} catch(Exception e1) {
			         e1.printStackTrace();
			         JOptionPane.showInternalMessageDialog(null,"File is exist!Please input data first .","File is exist",JOptionPane.WARNING_MESSAGE);
			    }
			
			
		}
		//button search
		if(e.getSource()==bsearch) {
			String name=(String) generation.getSelectedItem()+".txt";
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
					String slname=wordarr[0],sfname=wordarr[1],sgender=wordarr[2],age=wordarr[3],major=wordarr[4],email=wordarr[5];
					if(search.getText().equals(slname) ) {
						model.getDataVector().removeAllElements();
						model.addRow(new Object[]{slname,sfname,sgender,age,major,email});
						t1.setText(slname);
						t2.setText(sfname);
						t3.setText(age);
						t5.setText(email);
						
					
						
						if(sgender.equals("Female")) {
							fe.setSelected(true);
						}else {
							me.setSelected(true);
						}
						
						
					}
				}
				scanner.close();
			} catch(Exception e1) {
		         e1.printStackTrace();
		      }
			
			
		}
		
		//menubar
//		if(e.getSource()==add) {
//			try {
//				Table t=new Table();
//			} catch (FileNotFoundException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			this.dispose();
//		}
		///
		if(e.getSource()==manageT) {
			Quiz_Admin Q =new Quiz_Admin();
		}
		if(e.getSource()==DisplayT) {
			Read kk=new Read();
		}
		if(e.getSource()==DisplayT) {
			Read kk=new Read();
		}
		if(e.getSource()==his) {
			this.dispose();
			Testhis p=new Testhis();
		}
		if(e.getSource()==logout) {
			Testload t=new Testload();	
		}
		if(e.getSource()==login) {
			this.dispose();
			Testload t=new Testload();
		}
		if(e.getSource()==bu1) {
			String gen ="";
			if(fe.isSelected()) {
				gen="Female";
			}else if(me.isSelected()) {
				gen="Male";
			}
			String name=(String) generation.getSelectedItem()+".txt";
			try {
				FileWriter write=new FileWriter(name,true);
				PrintWriter wr=new PrintWriter(write);
				if(t1.getText().equals("")|| t2.getText().equals("")||t3.getText().equals("")||major.getSelectedItem()==null||t5.getText().equals("")||gen=="") {
					JOptionPane.showInternalMessageDialog(null,"Please input all your informations!","Miss data",JOptionPane.WARNING_MESSAGE);
				}else if(!t1.getText().equals("") && !t2.getText().equals("")&& !major.getSelectedItem().equals("")&& !t5.getText().equals("")&&gen!=""){
					wr.println(t1.getText()+","+t2.getText()+","+gen+","+t3.getText()+","+major.getSelectedItem()+","+t5.getText());
					model.addRow(new Object[]{t1.getText(),t2.getText(),gen,t3.getText(),major.getSelectedItem(),t5.getText()});
					t1.setText(null);
					t2.setText(null);
					t3.setText(null);
					t5.setText(null);
					fe.setSelected(false);
					me.setSelected(false);	
				}
				wr.close();
				write.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	  
		
	}
	
}
public class Search {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Edit t=new Edit();
	}

}
