package finalproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

class FirstPage  extends JFrame implements ActionListener{
	JPanel panel1=new JPanel(new GridLayout(1,1));
    JPanel panel2=new JPanel();
    JPanel panel3=new JPanel();
    JPanel panel4=new JPanel();
    JPanel panel5=new JPanel();
    
    JPanel p1=new JPanel();
    JPanel p2=new JPanel(new GridLayout(2,1));
    JPanel p3=new JPanel();
    JPanel p4=new JPanel(new GridLayout(1,2,40,40));
    JPanel p5=new JPanel();
    JPanel p2_1=new JPanel();
    JPanel p2_2=new JPanel();
    JPanel p4_1=new JPanel();
    JPanel p4_2=new JPanel();
    JButton admin=new JButton("Admin");
    JButton student=new JButton("Student");
    
    
    
    FirstPage() throws IOException{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1200,800);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLayout(new BorderLayout());
		
//		ImageIcon img=new ImageIcon("welcom.png");
		panel1.setBackground(new Color( 0, 0, 58));
		panel2.setBackground(new Color( 0, 0, 128));
		panel3.setBackground(new Color( 0, 0, 128));
		panel4.setBackground(new Color( 0, 0, 128));
		panel1.setPreferredSize(new Dimension(400,410));
		JPanel Img=new JPanel();
//		Img.setBackground(Color.black);
		Img.setBackground(new Color( 0, 0, 58));
		BufferedImage img=ImageIO.read(new File("C:\\Users\\Eav Sarin\\eclipse-workspace\\finalproject\\src\\finalproject\\welcom.jpg"));
		JLabel imgs=new JLabel(new ImageIcon(img));
		 
		imgs.setPreferredSize(new Dimension(2000,400));
		Img.add(imgs);
		panel1.add(Img);
	
		
		panel2.setPreferredSize(new Dimension(20,20));
		panel3.setPreferredSize(new Dimension(20,20));
		panel4.setPreferredSize(new Dimension(20,20));
		panel5.setLayout(new GridLayout(5,1,5,5));
		panel5.setBackground(Color.white);
//		panel5.setBorder( BorderFactory.createEmptyBorder(20,0,0,0) );
		
		p1.setBackground(Color.white);
		p2.setBackground(Color.white);
		p3.setBackground(Color.white);
		p4.setBackground(Color.white);
		p5.setBackground(Color.white);
		p2_1.setBackground(Color.white);
		p2_2.setBackground(Color.white);
		p4_1.setBackground(Color.white);
		p4_2.setBackground(Color.white);
		
		p1.setBorder( BorderFactory.createEmptyBorder(20,0,0,0) );
		JLabel header=new JLabel("Welcom To Student System Management ");
		header.setFont(new Font(null,Font.BOLD,30));
		header.setForeground(new Color( 0, 0, 58));
		p1.add(header);
		
		JLabel text=new JLabel(" Excited to have you here!We are looking forward to having a great academic session with you.");
		text.setFont(new Font(null,Font.CENTER_BASELINE,17));
		JLabel text1=new JLabel("Sign in as");
		text1.setForeground(new Color( 0, 0, 128));
		text.setFont(new Font(null,Font.CENTER_BASELINE,17));
		text1.setFont(new Font(null,Font.CENTER_BASELINE,15));
		p2_1.add(text);
		p2_2.add(text1);
		p2.add(p2_1);
		p2.add(p2_2);
		
		p3.setBorder( BorderFactory.createEmptyBorder(0,0,200,0) );
		JLabel logo=new JLabel("-----");
		logo.setFont(new Font(null,Font.CENTER_BASELINE,27));
		p3.add(logo);
		
		
		Border emptyBorder = BorderFactory.createEmptyBorder();
		admin.setBorder(emptyBorder);
		student.setBorder(emptyBorder);
		student.setFocusable(false);
		admin.setFocusable(false);
		admin.setBackground(Color.white);
		student.setBackground(Color.white);
		
		p4.setBorder( BorderFactory.createEmptyBorder(0,0,10,0) );
		p4_1.setBorder( BorderFactory.createEmptyBorder(0,550,190,0) );
		admin.setPreferredSize(new Dimension(180,40));
		admin.setFont(new Font(null,Font.CENTER_BASELINE,16));
		p4_2.setBorder( BorderFactory.createEmptyBorder(0,0,170,550) );
		student.setPreferredSize(new Dimension(180,40));
		student.setFont(new Font(null,Font.CENTER_BASELINE,16));
		student.setForeground(new Color( 0, 0, 128));
		admin.setForeground(new Color( 0, 0, 128));
		admin.setBackground(new Color(200,202,219));
		student.setBackground(new Color(200,202,219));
		admin.addActionListener(this);
		student.addActionListener(this);
		
		p4_1.add(admin);
		p4_2.add(student);
		p4.add(p4_1);
		p4.add(p4_2);
		
		panel5.add(p1);
		panel5.add(p2);
		panel5.add(p3);
		panel5.add(p4);
		panel5.add(p5);
		
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
		if(e.getSource()==admin) {
			this.dispose();
			Testload t=new Testload();
		}if(e.getSource()==student) {
			this.dispose();
			Testlo t=new Testlo();
		}
		
	}
}

public class Welcom{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub 
		FirstPage tt=new FirstPage();

	}

}
