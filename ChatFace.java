import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

//class CarHire definition
public class ChatFace extends JFrame implements ActionListener
{
		String firstName = JOptionPane.showInputDialog(null, "Enter a Name You Wish To Use", "Type Here");
		String userName = firstName;
        //GUI components building
        private JLabel nameLabel=new JLabel("User: " + userName);

	    private JTextField nameField=new JTextField(16);
        private JTextField daysField=new JTextField(11);
        private JTextField inputTextField=new JTextField(20);

	    private JButton displayButton=new JButton("Show All Active Users on Server");
	    private JButton connectButton=new JButton("Connect to Server");
        private JButton sendMessageButton = new JButton("Send");
        private JButton changeNameButton=new JButton("Change Name");
        private JButton startServerButton = new JButton("Create Server");
        private JButton disconnectButton = new JButton("Disconnect");

        private JTextArea textArea=new JTextArea(16,35);

        //declaring variables
        private int j=0;  //count variable to keep track
		String[] message = {""};
        private static final int FRAME_WIDTH = 480;// JFrame size
        private static final int FRAME_HEIGHT = 430;

        //constructor
        public ChatFace()
        {
           super("ChatFace");
           setLayout(new FlowLayout());  //FlowLayout
           for(int i=0;i<200;i++)         // 200 elements- Customer objcet
           {
			   //generate user objects here
		   }
           add(connectButton);
           add(disconnectButton);
           add(displayButton);
           add(startServerButton);
           add(changeNameButton);
           add(new JScrollPane(textArea));
           add(inputTextField);
           add(sendMessageButton);
           add(nameLabel);

           changeNameButton.addActionListener(this);
           sendMessageButton.addActionListener(this);
           displayButton.addActionListener(this);
           connectButton.addActionListener(this);
           disconnectButton.addActionListener(this);
        }

        //button event handling
        public void actionPerformed(ActionEvent e)
        {
			String actionString=e.getActionCommand();
			switch(actionString)
			{
				case "Show All Active Users on Server":
					showAllUsers();
					break;
				case "Send":
					sendMessage();
					break;
				case "Change Name":
					changeName();
					break;
				case "Create Server":
					startServer();
					break;
				case "Connect to Server":
					connectToServer();
					break;
				case "Disconnect":
					disconnect();
					break;
				default:
					System.out.println("invalid input");
			}

		}

		public void connectToServer()
		{
			//need server to connect to

		}

		public void showAllUsers()
		{
			//launches seperate GUI to display current users
			Users userList = new Users();

		}

		public void startServer()
		{
			//server needs to be modified so it actually works
			Server createdServer = new Server();
		}

		public void disconnect()
		{

		}

		public void sendMessage()
		{
			//this needs to send the text to the server, which then sends it to the clients
			String sentMessage = inputTextField.getText();
			inputTextField.setText("");
			textArea.setText(userName + ": " + sentMessage + ".");
		}

		public void changeName()
		{
			//this also needs to be sent to client program
			String newUserName = JOptionPane.showInputDialog(null, "Choose your new Username");
			String newNameLabel = "User: " + newUserName;
			nameLabel.setText(newNameLabel);
			textArea.setText(userName + " has changed their name to " + newUserName + ". (" + firstName + ")");
			if (userName == null)
			{
				userName = firstName;
			}else{
				userName = newUserName;
			}
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