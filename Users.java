import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

//class CarHire definition
public class Users extends JFrame implements ActionListener
{
        //GUI components building


        //declaring variables
        private int j=0;  //count variable to keep track
		String[] message = {""};
        private static final int FRAME_WIDTH = 420;// JFrame size
        private static final int FRAME_HEIGHT = 280;
        private JButton refreshButton = new JButton("Refresh");
        private JTextArea textArea = new JTextArea(420,280);

        //constructor
        public Users()
        {
           super("Users");
           setLayout(new FlowLayout());  //FlowLayout
           for(int i=0;i<200;i++)         // 200 elements- Customer objcet
           {
			   //generate user objects here
		   }
		   add(refreshButton);
           add(new JScrollPane(textArea));

           refreshButton.addActionListener(this);
        }

        public void refresh()
        {
			textArea.setText("Current Users: " + "." );
		}

        //button event handling
        public void actionPerformed(ActionEvent e)
        {
			String actionString=e.getActionCommand();
			switch(actionString)
			{
				case "Refresh":
					refresh();
					break;
				default:
					System.out.println("invalid input");
			}

		}

       //main method
        public static void main(String[] args)
        {
		   JFrame frame = new Users();
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		   frame.setVisible(true);
		   frame.setResizable(false);
	    }
}// end of class definition