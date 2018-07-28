import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

//class CarHire definition
public class ChatFace extends JFrame implements ActionListener
{
	String userName = JOptionPane.showInputDialog(null, "Enter a Name You Wish To Use");
        //GUI components building
        private JLabel nameLabel=new JLabel("\nUser: " + userName);

	    private JTextField nameField=new JTextField(16);
        private JTextField daysField=new JTextField(11);

	    private JButton displayButton=new JButton("Show All Active Users on Server");
	    private JButton connectButton=new JButton("Connect to Server");
	    private JButton exitButton=new JButton("Exit");
        private JTextArea textArea=new JTextArea(16,35);
        private JTextField inputTextField=new JTextField(20);
        private JButton sendMessageButton = new JButton("Send");
        private JButton changeNameButton=new JButton("Change Name");

        //declaring variables
        private int j=0;  //count variable to keep track
		String[] message = {""};
        private static final int FRAME_WIDTH = 480;// JFrame size
        private static final int FRAME_HEIGHT = 430;

        //constructor
        public ChatFace()
        {
           super("  ChatFace Main Menu");
           setLayout(new FlowLayout());  //FlowLayout
           for(int i=0;i<200;i++)         // 200 elements- Customer objcet
           {
			   //generate user objects here

		   }
           add(connectButton);
           add(displayButton);
           add(exitButton);
           add(changeNameButton);
           add(textArea);
           add(inputTextField);
           add(sendMessageButton);
           add(nameLabel);
           changeNameButton.addActionListener(this);
           exitButton.addActionListener(this);
           sendMessageButton.addActionListener(this);
           displayButton.addActionListener(this);
        }

        //button event handling
        public void actionPerformed(ActionEvent e)
        {
			String actionString=e.getActionCommand();
			switch(actionString)
			{
				case "Show All Active Users":
					showAllUsers();
					break;
				case "Exit":
					exit();
					break;
				case "Send":
					sendMessage();
					break;
				case "Change Name":
					changeName();
					break;
				default:
					System.out.println("invalid input");
			}

		}

		public void showAllUsers()
		{

		}

		public void exit()
		{
			JOptionPane.showMessageDialog(null, "Thankyou for using ChatFace\n Cya next time " + userName + ".");
			System.exit(1);
		}

		public void sendMessage()
		{
			String input = JOptionPane.showInputDialog("Message?");
			String messageOutput = userName + ": " + input + ".\n";
			textArea.setText(messageOutput);
		}

		public void changeName()
		{
			userName = JOptionPane.showInputDialog(null, "Choose your new Username");
			String newNameLabel = "User: " + userName;
			nameLabel.setText(newNameLabel);
		}


        //main method
        public static void main(String[] args)
        {
		   JFrame frame = new ChatFace();
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		   frame.setVisible(true);
		   frame.setResizable(false);
	    }
}// end of class definition