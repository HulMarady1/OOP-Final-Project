package finalproject;
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

class Quiz extends JFrame implements ActionListener
{
    static int sum1,sum2,sum3,sum4,sum5;
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JPanel panel3=new JPanel();
    JPanel panel4=new JPanel();
    JPanel panel5=new JPanel();

    //Description
    JPanel tex1_1=new JPanel(new GridLayout(1,1));

    JPanel tex1_Space1=new JPanel(new GridLayout(1,1));

    JPanel tex1_Space5=new JPanel(new GridLayout(1,1));
    JPanel tex1_Space7=new JPanel(new GridLayout(1,1));



    JMenuBar menubar;
//    JMenu manegement;
//    JMenuItem add;
//    JMenuItem delete;
//    JMenuItem update;
//    JMenuItem display;
    JMenuItem  logout;
    JMenu login;
//    JMenuItem  admin;
//    JMenuItem student;
//
//    JMenu test;
//    JMenu attendance;
    static int AnswerCount =0;
    static int QuestionCount=0;
    static  int Correct_Answer =0;
    static int t =0;
    static int total=0;
    static int j=0;


    @SuppressWarnings("deprecation")
	Quiz() throws IOException
    {

        //Count string
        File file = new File("Question.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line1;
        int paraCount=0;

        while ((line1 = bufferedReader.readLine()) != null)
        {
            if (line1.equals(""))
            {
                paraCount += 1;
            }
            else
            {
                String sentence[] = line1.split(",+");
                QuestionCount += sentence.length;
            }
        }


        File file1 = new File("Answer.txt");
        FileInputStream fileInputStream1 = new FileInputStream(file1);
        InputStreamReader inputStreamReader1 = new InputStreamReader(fileInputStream1);
        BufferedReader bufferedReader1 = new BufferedReader(inputStreamReader1);

        String line2;
        int paraCount1=0;

        while ((line2 = bufferedReader1.readLine()) != null)
        {
            if (line2.equals(""))
            {
                paraCount += 1;
            }
            else
            {
                String sentence[] = line2.split(",+");
                AnswerCount += sentence.length;
            }
        }

        File file2 = new File("Correct.txt");
        FileInputStream fileInputStream2 = new FileInputStream(file2);
        InputStreamReader inputStreamReader2 = new InputStreamReader(fileInputStream2);
        BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);

        String line3;
        int paraCount2=0;

        while ((line3 = bufferedReader2.readLine()) != null)
        {
            if (line3.equals(""))
            {
                paraCount2 += 1;
            }
            else
            {
                String sentence[] = line3.split(",+");
                Correct_Answer += sentence.length;
            }
        }

        //Array stores correct answer
        String[] select = new String[Correct_Answer];
        int[] sum = new int[Correct_Answer];


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200,800);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLayout(new BorderLayout());

        menubar=new JMenuBar();
        menubar.setBounds(0, 0, 50, 50);
        menubar.setBackground(Color.white);


//        //menu
//        manegement =new JMenu("Manengement");
//        test =new JMenu("Test");
//        attendance =new JMenu("Attendence");
        login =new JMenu("Log Out");
//        manegement.setFont(new Font(null,Font.BOLD,15));
//        test.setFont(new Font(null,Font.BOLD,15));
//        attendance.setFont(new Font(null,Font.BOLD,15));
        login.setFont(new Font(null,Font.BOLD,15));
        logout=new JMenuItem("Sign out");
		logout.addActionListener(this);
        //item
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
//        student=new JMenuItem("Student");
//        student.addActionListener(this);
//
//        manegement.add(add);
//        manegement.add(update);
//        manegement.add(delete);
//        manegement.add(display);
        login.add(logout);
       
        panel1.setBackground(new Color( 0, 0, 128));
        panel1.setLayout(new GridLayout(1,1));
        panel1.setBorder( BorderFactory.createEmptyBorder(20,20,0,20) );
        JPanel panel1_1=new JPanel();
//		panel1_1.setBackground(Color.black);
        panel1_1.setBorder( BorderFactory.createEmptyBorder(5,0,0,0) );
        JLabel register=new JLabel("Quiz");
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
        body.setBorder( BorderFactory.createEmptyBorder(25,100,80,100) );

        JPanel body1=new JPanel(new GridLayout(QuestionCount+AnswerCount+5,1,5,5));
        body1.setBackground(new Color(249,248,248));
        body1.setBackground(Color.white);
        body1.setBorder(BorderFactory.createLineBorder(Color.black));
        JScrollPane sp=new JScrollPane(body);
        body.add(body1);
        panel5.add(sp);

        JPanel Submit = new JPanel(new GridLayout(1,1));
        Submit.setBorder( BorderFactory.createEmptyBorder(10,100,10,100) );

        JButton button = new JButton("Submit");
        button.setBorder( BorderFactory.createEmptyBorder(0,200,0,200) );
        button.setFont(new Font(null,Font.HANGING_BASELINE,15));
        button.setBackground(Color.CYAN);
        button.setOpaque(true);
        Submit.add(button);

        //read file
        JLabel RESULT = new JLabel();
        RESULT.setFont(new Font(null,Font.CENTER_BASELINE,16));
        RESULT.setBorder( BorderFactory.createEmptyBorder(0,100,0,0) );

        //tex1_1

        JPanel Choose_the_answer = new JPanel(new GridLayout(1,1));
        Choose_the_answer.setBorder( BorderFactory.createEmptyBorder(10,75,10,0) );
        Choose_the_answer.setBackground(Color.green);


        JLabel t1_1=new JLabel("Choose the correct answer");
        t1_1.setFont(new Font(null,Font.HANGING_BASELINE,30));
        t1_1.setBorder( BorderFactory.createEmptyBorder(0,50,0,50) );
        Choose_the_answer.add(t1_1);
        body1.add(Choose_the_answer);



        //
        String[] question =  new String[100];
        try
        {
            Scanner read = new Scanner(new File("Question.txt"));
            while(read.hasNext())
            {
                String line=read.nextLine();
                if(line.isEmpty())
                {
                    continue;
                }
                String[] word = line.split(",");
                for(int i=0;i<QuestionCount;i++)
                {
                    question[i]=word[i];
                }
            }
        }
        catch (FileNotFoundException e1)
        {
            e1.printStackTrace();
        }


        String[] Answer = new String[100];
        try
        {
            Scanner read = new Scanner(new File("Answer.txt"));
            while(read.hasNext())
            {
                String line=read.nextLine();
                if(line.isEmpty())
                {
                    continue;
                }
                String[] word=line.split(",");
                for(int i=0;i<AnswerCount;i++)
                {
                    Answer[i] = word[i];
                }
            }
        }
        catch (FileNotFoundException e1)
        {
            e1.printStackTrace();
        }

        String[] Correct = new String[100];
        try
        {
            Scanner read = new Scanner(new File("Correct.txt"));
            while(read.hasNext())
            {
                String line=read.nextLine();
                if(line.isEmpty())
                {
                    continue;
                }
                String[] word=line.split(",");
                for(int i=0;i<Correct_Answer;i++)
                {
                    Correct[i] = word[i];
                }
            }
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }

        JRadioButton[] Option1 = new JRadioButton[QuestionCount];
        JRadioButton[] Option2 = new JRadioButton[QuestionCount];
        JRadioButton[] Option3 = new JRadioButton[QuestionCount];
        JRadioButton[] Option4 = new JRadioButton[QuestionCount];

        JPanel[] tex1_Question1=new JPanel[QuestionCount];
        JPanel[] tex1_A=new JPanel[AnswerCount];
        JPanel[] tex1_B=new JPanel[AnswerCount];
        JPanel[] tex1_C=new JPanel[AnswerCount];
        JPanel[] tex1_D=new JPanel[AnswerCount];

        String[] O1 = new String[QuestionCount];
        String[] O2 = new String[QuestionCount];
        String[] O3 = new String[QuestionCount];
        String[] O4 = new String[QuestionCount];


        for(int i=0;i<QuestionCount;i++)
        {
            tex1_Question1[i] = new JPanel(new GridLayout(1,1));
            tex1_A[i] = new JPanel(new GridLayout(1,1));
            tex1_B[i] = new JPanel(new GridLayout(1,1));
            tex1_C[i] = new JPanel(new GridLayout(1,1));
            tex1_D[i] = new JPanel(new GridLayout(1,1));
            JPanel[] Q1 = new JPanel[QuestionCount];
            Q1[i]=new JPanel(new GridLayout(1,1));
            Q1[i].setFont(new Font(null,Font.CENTER_BASELINE,16));
            Q1[i].setBorder( BorderFactory.createEmptyBorder(0,300,0,0) );

            JLabel[] Question = new JLabel[QuestionCount];
            Question[i] = new JLabel(String.valueOf(question[i]));
            Question[i].setBorder( BorderFactory.createEmptyBorder(0,0,0,0) );
            Question[i].setFont(new Font(null,Font.HANGING_BASELINE,20));
            Q1[i].add(Question[i]);
            tex1_Question1[i].add(Q1[i]);
            //Question 1

            //Answer 1
            Option1[i]=new JRadioButton(Answer[t]);
            Option2[i]=new JRadioButton(Answer[t +1]);
            Option3[i]=new JRadioButton(Answer[t +2]);
            Option4[i]=new JRadioButton(Answer[t +3]);

            //Store string in array
            O1[i] = Answer[t];
            O2[i] = Answer[t +1];
            O3[i] = Answer[t +2];
            O4[i] = Answer[t +3];

            t = t +4;

            Option1[i].setFocusable(false);
            Option2[i].setFocusable(false);
            Option3[i].setFocusable(false);
            //Option4[i].setFocusable(false);
            Option1[i].setFont(new Font(null,Font.ROMAN_BASELINE,13));
            Option2[i].setFont(new Font(null,Font.ROMAN_BASELINE,13));
            Option3[i].setFont(new Font(null,Font.ROMAN_BASELINE,13));
            Option4[i].setFont(new Font(null,Font.ROMAN_BASELINE,13));
            tex1_A[i].setBorder( BorderFactory.createEmptyBorder(0,400,0,0) );
            tex1_B[i].setBorder( BorderFactory.createEmptyBorder(0,400,0,0) );
            tex1_C[i].setBorder( BorderFactory.createEmptyBorder(0,400,0,0) );
            tex1_D[i].setBorder( BorderFactory.createEmptyBorder(0,400,0,0) );
            tex1_A[i].add(Option1[i]);
            tex1_B[i].add(Option2[i]);
            tex1_C[i].add(Option3[i]);
            tex1_D[i].add(Option4[i]);


            body1.add(tex1_Question1[i]);
            body1.add(tex1_A[i]);
            body1.add(tex1_B[i]);
            body1.add(tex1_C[i]);
            body1.add(tex1_D[i]);
            body1.add(tex1_Space1);
        }

        //Show result
        JPanel Result = new JPanel(new GridLayout(1,1));
        Result.setBorder(BorderFactory.createEmptyBorder(0,100,0,100) );

        JLabel result = new JLabel();
        result.setBorder(BorderFactory.createEmptyBorder(0,120,0,120) );
        result.setFont(new Font(null,Font.HANGING_BASELINE,25));
        result.setBackground(Color.cyan);
        Result.add(result);


        /*button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int t = 0;
                for(int i=0;i<QuestionCount;i++)
                {

                    System.out.println((Correct[i]));
                    /*if(Option1[i].isSelected() && Answer[count].equals(Correct[i]))
                    {
                        sum[i]=3;
                    }
                    else if(Option1[i].isSelected() && !Answer[count].equals(Correct[i]))
                    {
                        sum[i]=-1;
                    }
                    else if(!Option1[i].isSelected())
                    {
                        sum[i]=0;
                    }

                    if(Option2[i].isSelected() && Answer[count].equals(Correct[i]))
                    {
                        sum[i]=3;
                    }
                    else if(Option2[i].isSelected() && !Answer[count].equals(Correct[i]))
                    {
                        sum[i]=-1;
                    }
                    else if(!Option2[i].isSelected())
                    {
                        sum[i]=0;
                    }

                    if(Option3[i].isSelected() && Answer[count].equals(Correct[i]))
                    {
                        sum[i]=3;
                    }
                    else if(Option3[i].isSelected() && Answer[count].equals(Correct[i]))
                    {
                        sum[i]=-1;
                    }
                    else if(!Option3[i].isSelected())
                    {
                        sum[i]=0;
                    }

                    if(Option4[i].isSelected() && Answer[count].equals(Correct[i]))
                    {
                        sum[i]=3;
                    }
                    else if(Option4[i].isSelected() && !Answer[count].equals(Correct[i]))
                    {
                        sum[i]=-1;
                    }
                    else if(!Option4[i].isSelected())
                    {
                        sum[i]=0;
                    }*/
                        /*if(Option1[i].isSelected())
                        {

                        }
                        if(Option2[i].isSelected())
                        {
                            for(int j=0;j<QuestionCount;j++)
                            {
                                if(O2[j]==(Correct[j]))
                                {
                                    sum[i]=3;
                                    break;
                                }
                                else
                                {
                                    if(j==QuestionCount-1)
                                    {
                                        sum[i]=-1;
                                    }
                                }
                            }
                        }
                        if(Option3[i].isSelected())
                        {
                            for(int j=0;j<QuestionCount;j++)
                            {
                                if(O3[j]==(Correct[j]))
                                {
                                    sum[i]=3;
                                    break;
                                }
                                else
                                {
                                    if(j==QuestionCount-1)
                                    {
                                        sum[i]=-1;
                                    }
                                }
                            }
                        }
                        if(Option4[i].isSelected())
                        {
                            for(int j=0;j<QuestionCount;j++)
                            {
                                if(O4[j]==(Correct[j]))
                                {
                                    sum[i]=3;
                                    break;
                                }
                                else
                                {
                                    if(j==QuestionCount-1)
                                    {
                                        sum[i]=-1;
                                    }
                                }
                            }
                        }
                        else
                        {
                            sum[i]=0;
                        }*/
                        /*System.out.println(sum[i]);
                        if(O1[i]==Correct[j])
                        {
                            Option1[i].isSelected();
                            sum[i]=3;
                        }
                        else if(O2[i]==Correct[j])
                        {
                            Option2[i].isSelected();
                            sum[i]=3;
                        }
                        else if(O3[i]==Correct[j])
                        {
                            Option3[i].isSelected();
                            sum[i]=3;
                        }
                        else if(O4[i]==Correct[j])
                        {
                            Option4[i].isSelected();
                            sum[i]=3;
                        }
                        else
                        {
                            sum[i] = 0;
                        }*/
                   /* total = total + sum[i];
                }
                result.setText("Your Score : "+total);
            }
        });*/
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int t =0;
                for(int i=0;i<QuestionCount;i++)
                {
                    if(Option1[i].isSelected() && Answer[t].equals(Correct[i]))
                    {
                        System.out.println("1");
                        System.out.println(Answer[t]);
                        System.out.println(Correct[i]);
                        sum[i]=3;
                    }
                    else if(Option2[i].isSelected() && Answer[t].equals(Correct[i]))
                    {
                        System.out.println("5");
                        System.out.println(Answer[t]);
                        System.out.println(Correct[i]);
                        sum[i]=3;
                    }
                    else if(Option3[i].isSelected() && Answer[t].equals(Correct[i]))
                    {
                        System.out.println("9");
                        System.out.println(Answer[t]);
                        System.out.println(Correct[i]);
                        sum[i]=3;
                    }
                    else if(Option4[i].isSelected() && Answer[t].equals(Correct[i]))
                    {
                        System.out.println("13");
                        System.out.println(Answer[t]);
                        System.out.println(Correct[i]);
                        sum[i]=3;
                    }
                    else if(Option1[i].isSelected() && Answer[t +1].equals(Correct[i]))
                    {
                        System.out.println("2");
                        System.out.println(Answer[t+1]);
                        System.out.println(Correct[i]);
                        sum[i]=3;
                    }
                    else if(Option2[i].isSelected() && Answer[t +1].equals(Correct[i]))
                    {
                        System.out.println("6");
                        System.out.println(Answer[t+1]);
                        System.out.println(Correct[i]);
                        sum[i]=3;
                    }
                    else if(Option3[i].isSelected() && Answer[t+1].equals(Correct[i]))
                    {
                        System.out.println("10");
                        System.out.println(Answer[t+1]);
                        System.out.println(Correct[i]);
                        sum[i]=3;
                    }
                    else if(Option4[i].isSelected() && Answer[t +1].equals(Correct[i]))
                    {
                        System.out.println("14");
                        System.out.println(Answer[t+1]);
                        System.out.println(Correct[i]);
                        sum[i]=3;
                    }

                    else if(Option1[i].isSelected() && Answer[t +2].equals(Correct[i]))
                    {
                        System.out.println("3");
                        System.out.println(Answer[t+2]);
                        System.out.println(Correct[i]);
                        sum[i]=3;
                    }
                    else if(Option2[i].isSelected() && Answer[t +2].equals(Correct[i]))
                    {
                        System.out.println("7");
                        System.out.println(Answer[t+2]);
                        System.out.println(Correct[i]);
                        sum[i]=3;
                    }
                    else if(Option2[i].isSelected() && Answer[t +2].equals(Correct[i]))
                    {
                        System.out.println("7");
                        System.out.println(Answer[t+2]);
                        System.out.println(Correct[i]);
                        sum[i]=3;
                    }
                    else if(Option3[i].isSelected() && Answer[t +2].equals(Correct[i]))
                    {
                        System.out.println("11");
                        System.out.println(Answer[t+2]);
                        System.out.println(Correct[i]);
                        sum[i]=3;
                    }


                    else if(Option1[i].isSelected() && Answer[t +3].equals(Correct[i]))
                    {
                        System.out.println("4");
                        System.out.println(Answer[t+3]);
                        System.out.println(Correct[i]);
                        sum[i]=3;
                    }
                    else if(Option2[i].isSelected() && Answer[t +3].equals(Correct[i]))
                    {
                        System.out.println("8");
                        System.out.println(Answer[t+3]);
                        System.out.println(Correct[i]);
                        sum[i]=3;
                    }

                    else if(Option3[i].isSelected() && Answer[t +3].equals(Correct[i]))
                    {
                        System.out.println("12");
                        System.out.println(Answer[t]+3);
                        System.out.println(Correct[i]);
                        sum[i]=3;
                    }
                    else if(Option4[i].isSelected() && Answer[t +2].equals(Correct[i]))
                    {
                        System.out.println("15");
                        System.out.println(Answer[t+2]);
                        System.out.println(Correct[i]);
                        sum[i]=3;
                    }
                    else if(Option4[i].isSelected() && Answer[t +3].equals(Correct[i]))
                    {
                        System.out.println("16");
                        System.out.println(Answer[t+3]);
                        System.out.println(Correct[i]);
                        sum[i]=3;
                    }
                    else if(!Option1[i].isSelected() || !Option2[i].isSelected()  || !Option3[i].isSelected()  || !Option4[i].isSelected())
                    {
                        System.out.println("17");
                        System.out.println(Answer[t]);
                        System.out.println(Correct[i]);
                        sum[i]=0;
                    }
                    else if(Option1[i].isSelected() && !Answer[i].equals(Correct[i]))
                    {
                        System.out.println("18");
                        System.out.println(Answer[t]);
                        System.out.println(Correct[i]);
                        sum[i]=-1;
                    }
                    t = t + 4;
                    total = total + sum[i];
                }
                result.setText("Your Score : "+total);
                try
                {
                    PrintWriter Score = new PrintWriter(new BufferedWriter(new FileWriter("ScorStudent.txt",true)));
                    Score.print(","+total);
                    Score.println();
                    Score.close();
                }
                catch (IOException ex)
                {
                    throw new RuntimeException(ex);
                }
                total=0;
            }
            
        });
       

        panel1_1.add(register);
        panel1.add(panel1_1);
//
//        menubar.add(manegement);
//        menubar.add(test);
//        menubar.add(attendance);
        menubar.add(login);

        //body1.add(tex1_Space5);
        body1.add(Submit);
        Result.add(result);
        body1.add(tex1_Space7);
        body1.add(Result);
        this.setJMenuBar(menubar);

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
        if(e.getSource()==logout){
        	Testlo t=new Testlo();
        	// TODO Auto-generated method stub
        }
    }

}
public class Test
{
    public static void main(String[] args) throws IOException {
        Quiz Q =new Quiz();
    }

}
