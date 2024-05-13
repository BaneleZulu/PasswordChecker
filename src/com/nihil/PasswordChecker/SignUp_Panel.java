package com.nihil.PasswordChecker;

import com.nihil.code.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


@SuppressWarnings("serial")
public class SignUp_Panel extends JFrame {

	private JPanel contentPane;
	private StyledDocument doc;
	private SimpleAttributeSet center;

	private JTextPane passwordtxt;
	private JLabel statuslbl;
	private JPanel weakPanel;
	private JPanel mediumPanel;
	private JPanel strongPanel;
	private int count;
	private String password;

	private String status;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp_Panel frame = new SignUp_Panel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUp_Panel() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1065, 740);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(45, 45, 45));
		this.setContentPane(contentPane);

		JPanel motherPanel = new RoundedPanel(50);
		motherPanel.setBackground(new Color(50, 50, 50));
		motherPanel.setOpaque(false);
		motherPanel.setLayout(null);
		motherPanel.setBounds(246, 27, 554, 621);
		contentPane.add(motherPanel);

		JLabel heading1 = new JLabel();
		heading1.setText("Welcome to Nihil Application.");
		heading1.setForeground(new Color(255, 255, 255));
		heading1.setBounds(33, 19, 479, 36);
		heading1.setFont(new Font("Dialog", Font.PLAIN, 23));
		motherPanel.add(heading1);

		JLabel heading2 = new JLabel();
		heading2.setBounds(33, 63, 400, 20);
		heading2.setText("Join us to code, share, learn, and make real world projects. Sign up now!");
		heading2.setFont(new Font("Times New Romen", Font.PLAIN, 12));
		heading2.setForeground(new Color(211,211,211));
		motherPanel.add(heading2);

		JPanel innrPanel = new JPanel();
		innrPanel.setBounds(33, 93, 479, 138);
		innrPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(102, 102, 102)));
		innrPanel.setOpaque(false);
		innrPanel.setLayout(null);
		motherPanel.add(innrPanel);

		JLabel  namelbl = new JLabel();
		namelbl.setText("Full name");
		namelbl.setForeground(Color.WHITE);
		namelbl.setFont(new Font("Dialog", Font.PLAIN, 18));
		namelbl.setBounds(0, 10, 126, 27);
		innrPanel.add(namelbl);

		JTextPane firstnametxt = new JTextPane();
		firstnametxt.setText("Firstname");
		firstnametxt.setForeground(new Color(211,211,211));	
		firstnametxt.setBounds(0, 47, 217, 27);
		firstnametxt.setFont(new Font("Dialog", Font.PLAIN, 17));
		firstnametxt.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 102)));
		firstnametxt.setOpaque(false);
		doc = firstnametxt.getStyledDocument();
		center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		firstnametxt.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {  			//211,211,211
				firstnametxt.setText(null);	
				firstnametxt.setBorder(BorderFactory.createMatteBorder(2, 1, 2, 1, new Color(155,221,255)));
			}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {
				if(firstnametxt.getText().length() == 0) {
					firstnametxt.setText("Firstname");
					firstnametxt.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 102)));
				}
			}
		});
		innrPanel.add(firstnametxt);

		JTextPane lastnametxt = new JTextPane();
		lastnametxt.setText("Lastname");
		lastnametxt.setForeground(new Color(211,211,211));
		lastnametxt.setBounds(255, 47, 224, 27);
		lastnametxt.setFont(new Font("Dialog", Font.PLAIN, 17));
		lastnametxt.setForeground(new Color(221, 221, 221));
		lastnametxt.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 102)));
		lastnametxt.setOpaque(false);
		doc = lastnametxt.getStyledDocument();
		center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		lastnametxt.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lastnametxt.setText(null);	
				lastnametxt.setBorder(BorderFactory.createMatteBorder(2, 1, 2, 1, new Color(155,221,255)));				
			}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {
				if(lastnametxt.getText().length() == 0) {
					lastnametxt.setText("Lastname");
					lastnametxt.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 102)));
				}
			}
		});
		innrPanel.add(lastnametxt);

		JRadioButton maleRadioButton = new JRadioButton();
		maleRadioButton.setBounds(113, 109, 91, 20);
		maleRadioButton.setFont(new Font("Dialog", Font.PLAIN, 17));
		maleRadioButton.setOpaque(false);
		maleRadioButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		maleRadioButton.setSize(200, 20);
		maleRadioButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		maleRadioButton.setForeground(Color.WHITE);
		maleRadioButton.setText("Male");
		maleRadioButton.setFocusable(false);
		innrPanel.add(maleRadioButton);		

		JRadioButton femaleRadioButton = new JRadioButton();
		femaleRadioButton.setBounds(0, 109, 91, 21);
		femaleRadioButton.setFont(new Font("Dialog", Font.PLAIN, 17));
		femaleRadioButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		femaleRadioButton.setText("Female");
		femaleRadioButton.setOpaque(false);
		femaleRadioButton.setFocusable(false);
		femaleRadioButton.setForeground(Color.WHITE);
		innrPanel.add(femaleRadioButton);

		ButtonGroup group = new ButtonGroup();
		group.add(femaleRadioButton);
		group.add(maleRadioButton);

		JLabel usernamelbl = new JLabel();
		usernamelbl.setText("Username or Email");
		usernamelbl.setForeground(Color.WHITE);
		usernamelbl.setFont(new Font("Dialog", Font.PLAIN, 18));
		usernamelbl.setBounds(33, 252, 161, 20);
		motherPanel.add(usernamelbl);

		JTextPane usernametxt = new JTextPane();
		usernametxt.setText("Enter your username or password");
		usernametxt.setForeground(new Color(211,211,211));
		usernametxt.setFont(new Font("Dialog", Font.PLAIN, 17));
		usernametxt.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 102)));
		usernametxt.setOpaque(false);
		usernametxt.setBounds(33, 282, 479, 27);
		usernametxt.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				usernametxt.setText(null);	
				usernametxt.setBorder(BorderFactory.createMatteBorder(2, 1, 2, 1, new Color(115, 221, 255)));
			}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {
				if(usernametxt.getText().length() == 0) {
					usernametxt.setText("Enter your username or email.");
					usernametxt.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 102)));
				}
			}
		});
		motherPanel.add(usernametxt);

		JLabel passwordlbl = new JLabel();
		passwordlbl.setText("Password");
		passwordlbl.setForeground(Color.WHITE);
		passwordlbl.setFont(new Font("Dialog", Font.PLAIN, 18));
		passwordlbl.setBounds(33, 333, 151, 20);
		motherPanel.add(passwordlbl);

		weakPanel = new RoundedPanel(10);
		weakPanel.setBounds(33, 415, 72, 10);
		weakPanel.setBackground(new Color(51,51,51));
		motherPanel.add(weakPanel);

		mediumPanel =  new RoundedPanel(10);
		mediumPanel.setBounds(115, 415, 72, 10);
		mediumPanel.setOpaque(true);
		mediumPanel.setBackground(new Color(51,51,51));
		motherPanel.add(mediumPanel);

		strongPanel =  new RoundedPanel(10);
		strongPanel.setBounds(197, 415, 72, 10);
		strongPanel.setOpaque(true);
		strongPanel.setBackground(new Color(51,51,51));
		motherPanel.add(strongPanel);

	    statuslbl = new JLabel();
	    statuslbl.setFont(new Font("Verdana", Font.PLAIN, 17));
		statuslbl.setBounds(279, 405, 101, 20);
		motherPanel.add(statuslbl);

	    passwordtxt = new JTextPane();
		passwordtxt.setText("Password");
		passwordtxt.setOpaque(false);
		passwordtxt.setForeground(new Color(211, 211, 211));
		passwordtxt.setFont(new Font("Dialog", Font.PLAIN, 17));
		passwordtxt.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 102)));
		passwordtxt.setBounds(33, 363, 479, 27);
		passwordtxt.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordtxt.setText(null);
				passwordtxt.setBorder(BorderFactory.createMatteBorder(2,1,2,1, new Color(115, 221, 225)));
			}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {
				if(passwordtxt.getText().length() == 0) {
					passwordtxt.setText("Password");
					passwordtxt.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 102)));
				}
			}
		});
		passwordtxt.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
					//count++;
					password = passwordtxt.getText();
					for(int r=0; r<password.length(); r++) {
						count = r;
					}
					passwordStrength(password, count);
			}
			@Override
			public void keyReleased(KeyEvent e) {}
		});
		motherPanel.add(passwordtxt);

		JLabel lblConfirmPassword = new JLabel();
		lblConfirmPassword.setText("Confirm Password");
		lblConfirmPassword.setForeground(Color.WHITE);
		lblConfirmPassword.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblConfirmPassword.setBounds(33, 435, 151, 20);
		motherPanel.add(lblConfirmPassword);

		JTextPane conformPasswordtxt = new JTextPane();
		conformPasswordtxt.setText("Confirm Password");
		conformPasswordtxt.setOpaque(false);
		conformPasswordtxt.setForeground(new Color(211, 211, 211));
		conformPasswordtxt.setFont(new Font("Dubai", Font.PLAIN, 17));
		conformPasswordtxt.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 102)));
		conformPasswordtxt.setBounds(33, 466, 479, 27);
		conformPasswordtxt.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				conformPasswordtxt.setText(null);
				conformPasswordtxt.setBorder(BorderFactory.createMatteBorder(2,1,2,1, new Color(115,221,225)));
			}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {
				if(conformPasswordtxt.getText().length() == 0) {
					conformPasswordtxt.setText("Confirm your Password");
					conformPasswordtxt.setBorder(BorderFactory.createMatteBorder(1,1,1,1,new Color(102,102,102)));
				}
			}
		});
		motherPanel.add(conformPasswordtxt);

		JButton signupButton = new JButton();
		signupButton.setText("Sign Up");
		signupButton.setBounds(33, 513, 479, 27);
		signupButton.setFocusable(false);
		signupButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		signupButton.setForeground(new Color(229,229,229));
		signupButton.setFont(new Font("Times New Romen", Font.PLAIN, 18));
		signupButton.setBackground(new Color(45,45,45));
		signupButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102,102,102)));
		signupButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent act) {
			try{
				String firstname = firstnametxt.getText();
				String lastname = lastnametxt.getText();
				String gender = group.getSelection().toString();
				String username = usernametxt.getText();
				String password = passwordtxt.getText();
				String confirmed = conformPasswordtxt.getText();
				if(!firstname.equals(null) && !lastname.equals(null) && !gender.equals(null) && !username.equals(null) && !password.equals(null) && !confirmed.equals(null))
				{
					if(password.equals(confirmed)) {
						JOptionPane.showMessageDialog(null, "Congratulations! You have created you account successfully!", "ACCOUNT CREATION COMPLETE", JOptionPane.INFORMATION_MESSAGE);						
						firstnametxt.setText(null);
						lastnametxt.setText(null);
						group.clearSelection();
						usernametxt.setText(null);
						passwordtxt.setText(null);
						conformPasswordtxt.setText(null);
					}
					else {
						JOptionPane.showMessageDialog(null, "You have re-entered a password unidentical to the original.", "CORRECT PASSWORD", JOptionPane.WARNING_MESSAGE);												
						passwordtxt.setText(null);
						conformPasswordtxt.setText(null);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Please ensure that you have entered all required infomation.", "FEILD COMPLETENESS ERROR", JOptionPane.ERROR_MESSAGE);					
				}
			}
			catch(Exception error) {JOptionPane.showMessageDialog(null, error.getMessage(), "ERROR OCCURED", JOptionPane.ERROR_MESSAGE);}
			}
		});
		motherPanel.add(signupButton);

		JLabel footerlbl = new JLabel();
		footerlbl.setText("Already have an account?");
		footerlbl.setBounds(154, 564, 151, 25);
		footerlbl.setFont(new Font("Dialog", Font.PLAIN, 13));
		footerlbl.setForeground(new Color(221,221,221));
		motherPanel.add(footerlbl);

		JButton signinButton = new JButton();
		signinButton.setText("Sign In");
		signinButton.setBounds(303, 564, 52, 25);
		signinButton.setFocusable(false);
		signinButton.setForeground(new Color(0,115,207));
		signinButton.setFont(new Font("Dialog", Font.PLAIN, 13));
		signinButton.setBackground(new Color(51,51,51));
		signinButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		signinButton.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0,115,207)));
		signinButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent act) {
				signinButton.setBackground(new Color(51, 51,51));
				signinButton.setOpaque(false);				
				motherPanel.hide();
				SignIn_Panel sign = new SignIn_Panel(contentPane, motherPanel);
				sign.hide();
			}
		});
		motherPanel.add(signinButton);
		this.setVisible(true);
	}

	private void passwordStrength(String password, int count)
	{
		class CheckPassword extends Thread{
			int track = count;
			public void run() {
					if(track > 0 || track < 4 ) {
						weakPanel.setBackground(new Color(220, 20, 60));
						weakPanel.show();
						statuslbl.setText("Weak");
						statuslbl.setForeground(weakPanel.getBackground());
						statuslbl.setBounds(133, 408, 101, 20);
						mediumPanel.hide();
					}
					if(track > 7) {						
						mediumPanel.show();
						strongPanel.hide();
						mediumPanel.setBackground(new Color(225,127,0));
						statuslbl.setText("Medium");
						statuslbl.setForeground(mediumPanel.getBackground());
						statuslbl.setBounds(215, 408, 101, 20);						
					}
					if(password.length() > 10) {
						char[] passwordLetters = new char[passwordtxt.getText().length()]; 
						boolean isSecured = false;
						for(int run=0; run<passwordLetters.length; run++) {
							passwordLetters[run] = passwordtxt.getText().charAt(run);
						}
						for(int run=0; run<passwordLetters.length; run++) {
							if(Character.isUpperCase(passwordLetters[run]) || Character.isDigit(passwordLetters[run]) && Character.isLetter(passwordLetters[run])) {
								isSecured = true;
							}
						} 
						if(isSecured == true) {
							strongPanel.show();
							strongPanel.setBackground(new Color(50, 205, 50));
							statuslbl.setText("Strong");
							statuslbl.setForeground(strongPanel.getBackground());
							statuslbl.setBounds(293, 408, 101, 20);
						}
					}
					if( track == 0) {
						statuslbl.setText(null);
						weakPanel.hide();
						mediumPanel.hide();
						strongPanel.hide();
					}
				}
		}
		CheckPassword inn = new CheckPassword();
		inn.start();
	}
}
