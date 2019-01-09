package PhoneDialer;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
 * Ailsa Mensinger
 * 12-19-18
 */

public class PhoneDialer implements ActionListener {
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton dash;
	JButton dialButton;
	String phoneNumber = "";
	
	public static void main(String[] args) {
		new PhoneDialer();
		
		

	}

	public PhoneDialer() {
		JFrame frame = new JFrame();
		frame.setTitle("Dialer");
		frame.setSize(200,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = (JPanel)frame.getContentPane();
		mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		JPanel newPanel = new JPanel();
		newPanel.setLayout(new FlowLayout());
		JLabel label = new JLabel("Enter the number to dial: ");
		newPanel.add(label);
		
		JPanel gridPanel = new JPanel();
		gridPanel.setLayout(new GridLayout(4,3,5,5));
		gridPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		
		button0 = new JButton("0");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		dash = new JButton("-");
		
		gridPanel.add(button0);
		gridPanel.add(button1);
		gridPanel.add(button2);
		gridPanel.add(button3);
		gridPanel.add(button4);
		gridPanel.add(button5);
		gridPanel.add(button6);
		gridPanel.add(button7);
		gridPanel.add(button8);
		gridPanel.add(button9);
		gridPanel.add(dash);
		
		mainPanel.add(newPanel);
		mainPanel.add(gridPanel);
		
		dialButton = new JButton("Dial number");
		dialButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		mainPanel.add(dialButton);
		
		frame.setVisible(true);
		
		button0.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		dash.addActionListener(this);
		dialButton.addActionListener(this);
		
		
		
		
		
		
		
		
		
		
	}
	public void actionPerformed(ActionEvent phoneDial) {
		if (phoneDial.getSource() == dialButton) {
			JOptionPane.showMessageDialog(null,  "Dialing: "+ phoneNumber);
			phoneNumber = "";
		}
		else if (phoneDial.getSource() == button0) {
			phoneNumber = phoneNumber + "0";
		}
		else if (phoneDial.getSource() == button1) {
			phoneNumber = phoneNumber + "1";
		}
		else if (phoneDial.getSource() == button2) {
			phoneNumber = phoneNumber + "2";
		}
		else if (phoneDial.getSource() == button3) {
			phoneNumber = phoneNumber + "3";
		}
		else if (phoneDial.getSource() == button4) {
			phoneNumber = phoneNumber + "4";
		}
		else if (phoneDial.getSource() == button5) {
			phoneNumber = phoneNumber + "5";
		}
		else if (phoneDial.getSource() == button6) {
			phoneNumber = phoneNumber + "6";
		}
		else if (phoneDial.getSource() == button7) {
			phoneNumber = phoneNumber + "7";
		}
		else if (phoneDial.getSource() == button8) {
			phoneNumber = phoneNumber + "8";
		}
		else if (phoneDial.getSource() == button9) {
			phoneNumber = phoneNumber + "9";
		}
		else if (phoneDial.getSource() == dash) {
			phoneNumber = phoneNumber + "-";
		}
		
	}


	

}
