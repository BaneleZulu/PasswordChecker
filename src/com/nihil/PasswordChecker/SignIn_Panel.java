package com.nihil.PasswordChecker;

import com.nihil.code.*;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;

public class SignIn_Panel extends JPanel {

	private static final long serialVersionUID = 1L;
	private StyledDocument doc;
	private SimpleAttributeSet center;
	
	/**
	 * Create the panel.
	 */
	public SignIn_Panel(JPanel contentPane, JPanel motherPanel) {
		
		this.setLayout(new BorderLayout());
		this.setBackground(new Color(45, 45,45));
		this.setBackground(Color.GREEN);
		
		JPanel panel = new RoundedPanel(50);
		panel.setBounds(250, 65, 500, 570);
		panel.setBackground(new Color(50, 50,50));
		panel.setOpaque(true);
		panel.setLayout(null);
		this.add(panel, BorderLayout.CENTER);
		
		JLabel heading1 = new JLabel();
		heading1.setText("Welcome Back!");
		heading1.setForeground(new Color(255, 255, 255));
		heading1.setBounds(35, 22, 414, 36);
		heading1.setFont(new Font("Times New Romen", Font.PLAIN, 23));
		panel.add(heading1);
		
		JLabel heading2 = new JLabel( );
		heading2.setBounds(36, 66, 400, 20);
		heading2.setText("Please sign in to access your account.");
		heading2.setFont(new Font("Times New Romen", Font.PLAIN, 12));
		heading2.setForeground(new Color(211,211,211));
		panel.add(heading2);
		
		JLabel usernamelbl = new JLabel("New label");
		usernamelbl.setHorizontalAlignment(SwingConstants.LEFT);
		usernamelbl.setBounds(35, 124, 179, 29);
		usernamelbl.setText("Username");
		usernamelbl.setForeground(Color.WHITE);
		usernamelbl.setFont(new Font("Dialog", Font.PLAIN, 18));
		panel.add(usernamelbl);
		
		JTextPane usernametxt = new JTextPane();
		usernametxt.setBounds(35, 166, 414, 29);
		usernametxt.setText("Username");
		doc = usernametxt.getStyledDocument();
		center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		
		usernametxt.setForeground(new Color(211,211,211));
		usernametxt.setFont(new Font("Dialog", Font.PLAIN, 17));
		usernametxt.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 102)));
		usernametxt.setOpaque(false);
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
					usernametxt.setText("Username");
					usernametxt.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 102)));
				}
			}
		});
		panel.add(usernametxt);
		
		
		JLabel passwordlbl = new JLabel();
		passwordlbl.setHorizontalAlignment(SwingConstants.LEFT);
		passwordlbl.setText("Password");
		passwordlbl.setFont(new Font("Dialog", Font.PLAIN, 18));
		passwordlbl.setForeground(new Color(255,255,255));
		passwordlbl.setBounds(35, 230, 179, 29);
		panel.add(passwordlbl);
		
		JTextPane passwordtxt = new JTextPane();
		passwordtxt.setText("Password");
		doc = passwordtxt.getStyledDocument();
		center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		passwordtxt.setBounds(35, 270, 414, 29);
		passwordtxt.setOpaque(false);
		passwordtxt.setForeground(new Color(211, 211, 211));
		passwordtxt.setFont(new Font("Dialog", Font.PLAIN, 17));
		passwordtxt.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102, 102, 102)));
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
		panel.add(passwordtxt);
		
		JCheckBox rememberMeBox = new JCheckBox();
		rememberMeBox.setBounds(35, 332, 149, 20);
		rememberMeBox.setText("Remember me?");
		rememberMeBox.setForeground(new Color(229, 229, 229));
		rememberMeBox.setBackground(new Color(51,51,51));
		rememberMeBox.setOpaque(true);
		rememberMeBox.setFont(new Font("Times New Romen", Font.PLAIN, 13));
		rememberMeBox.setFocusable(false);
		rememberMeBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel.add(rememberMeBox);
		
		JButton signinButton = new JButton();
		signinButton.setText("Sign In");
		signinButton.setBounds(35, 387, 414, 36);
		signinButton.setFocusable(false);
		signinButton.setForeground(new Color(229, 229, 229));
		signinButton.setFont(new Font("Times New Romen", Font.PLAIN, 18));
		signinButton.setBackground(new Color(45,45,45));
		signinButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		signinButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(102,102,102)));
		signinButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent act) {
				String username = usernametxt.getText();
				String password = passwordtxt.getText();
				
				if(!username.equals(null) && !username.equals("Username") && !password.equals(null) && !password.equals("Password")) {
					JOptionPane.showMessageDialog(null, "Welcome back: " + username.toUpperCase(), "LOGIN SUCCESSFUL", JOptionPane.PLAIN_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Please ensure you've entered the correct details", "LOGIN FAILED", JOptionPane.ERROR_MESSAGE);					
				}
			 }
		});
		panel.add(signinButton);
		
		JLabel footerlbl = new JLabel();
		footerlbl.setText("Don't have an account?");
		footerlbl.setBounds(106, 465, 150, 25);
		footerlbl.setFont(new Font("Times New Romen", Font.PLAIN, 14));
		footerlbl.setForeground(new Color(221,221,221));
		panel.add(footerlbl);
		
		JButton signupButton = new JButton();
		signupButton.setFont(new Font("Dialog", Font.PLAIN, 14));
		signupButton.setText("Sign Up");
		signupButton.setForeground(new Color(0, 115,207));
		signupButton.setBackground(new Color(51,51,51));
		signupButton.setFocusable(false);
		signupButton.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 115, 207)));
		signupButton.setBounds(264, 468 , 53, 20);
		signupButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		signupButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent act) {
				signupButton.setBackground(new Color(45, 45,45));
				signupButton.setOpaque(false);
				motherPanel.show();
				panel.hide();
			}
		});
		panel.add(signupButton);
		contentPane.add(panel);
	}
}



















