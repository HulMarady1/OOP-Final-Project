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
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

class Fpas extends JFrame implements ActionListener{
	JPanel p1=new JPanel();
	JPanel p2=new JPanel(new GridLayout(2,1));
	JPanel p3=new JPanel(new GridLayout(1,1));
	JPanel p4=new JPanel(new GridLayout(2,1,0,0));
	JPanel p5=new JPanel(new GridLayout(1,1));
	JPanel p6=new JPanel(new GridLayout(1,1));
	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	JButton find=new JButton("find password");
	JButton lo;
	
	Fpas(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1200,800);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLayout(new BorderLayout());
		
		JPanel mbody=new JPanel(new GridLayout(1,1));
		mbody.setBackground(Color.white);
		JPanel body=new JPanel(new GridLayout(6,1,5,5));
		body.setBackground(Color.white);
		mbody.setBorder(BorderFactory.createEmptyBorder(100,500,300,500));
		 
		p1.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		JLabel head=new JLabel("Forgot Password ?");
		head.setFont(new Font(null,Font.BOLD,30));
		p1.add(head);
		
		JLabel pa=new JLabel("No worries,we will send your password");
		JPanel p=new JPanel();
		pa.setFont(new Font(null,Font.CENTER_BASELINE,15));
		p.add(pa);
		p.setBorder(BorderFactory.createEmptyBorder(0,50,0,50));
		p2.setBorder(BorderFactory.createEmptyBorder(0,30,0,30));
		JLabel email=new JLabel("Email");
		email.setFont(new Font(null,Font.CENTER_BASELINE,15));
		p2.add(p);
		p2.add(email);
		
		p3.setBorder(BorderFactory.createEmptyBorder(0,30,28,30));
		p3.add(t1);
		
		p4.setBorder(BorderFactory.createEmptyBorder(0,30,0,30));
		JLabel phone=new JLabel("Phone Number");
		phone.setFont(new Font(null,Font.CENTER_BASELINE,15));
		p4.add(phone);
		p4.add(t2);
		p.setBackground(Color.white);
		p5.setBackground(Color.white);
		p6.setBackground(Color.white);
		
		p5.setBorder(BorderFactory.createEmptyBorder(18,130,2,130));
		find.setFont(new Font(null,Font.CENTER_BASELINE,16));
		find.setFocusable(false);
		find.setBorder(new RoundedBorder(25));
		find.setForeground(Color.white);
		find.setBackground(new Color(164,94,229));
		
		p5.add(find);
		
		p6.setBorder(BorderFactory.createEmptyBorder(10,130,10,130));
        lo=new JButton("Go back to sign in");
        Border emptyBorder = BorderFactory.createEmptyBorder();
		lo.setFont(new Font(null,Font.PLAIN,16));
		lo.setBorder(emptyBorder);
//		lo.setBackground(new Color(65, 102, 245));
		lo.setBackground(Color.white);
		lo.setForeground(Color.LIGHT_GRAY);
		lo.setFocusable(false);
		p6.add(lo);
		find.addActionListener(this);
		lo.addActionListener(this);
		
		p1.setBackground(Color.white);
		p2.setBackground(Color.white);
		p3.setBackground(Color.white);
		p4.setBackground(Color.white);
		
		
		t1.setFont(new Font(null,Font.CENTER_BASELINE,13));
		t2.setFont(new Font(null,Font.CENTER_BASELINE,13));
		t1.setCaretColor(Color.red);
		t2.setCaretColor(Color.red);
		
		
		
		body.add(p1);
		body.add(p2);
		body.add(p3);
		body.add(p4);
		body.add(p5);
		body.add(p6);
		mbody.add(body);
		this.add(mbody);
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==find) {
			Scanner read;
			try {
				read = new Scanner(new File("Login.txt"));
				int k = 0;
				while(read.hasNext()) {
					String line=read.nextLine();
					if(line.isEmpty()) {
						continue;
					}
					String[] word=line.split(",");
					String email=word[0],phone=word[1],pas=word[2];
					if((t1.getText().equals(email) && t2.getText().equals(phone))) {
						JOptionPane.showInternalMessageDialog(null,"Your password "+pas,"Password ",JOptionPane.INFORMATION_MESSAGE);
						t1.setText(null);
						k=1;
						t1.setText(null);
						t2.setText(null);
						break;
					}
				}
				if(k==0){
					JOptionPane.showInternalMessageDialog(null,"Please password again!","Incorrect Password ",JOptionPane.WARNING_MESSAGE);
					t1.setText(null);
					t2.setText(null);
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				   e1.printStackTrace();
			}
		}else if(e.getSource()==lo) {
			this.dispose();
			Testlo t=new Testlo();
		}
	}
	
}
public class Forgetpas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fpas pa=new Fpas();
	}

}
