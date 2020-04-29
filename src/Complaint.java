import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.*;



public class Complaint 
{
	JFrame frm1;
	BufferedWriter bw;
	
	
	void fun1()
	{
		frm1 = new JFrame();
		frm1.setSize(900, 700);
		frm1.setLayout(null);
		
		JPanel pnl1 = new JPanel();
		pnl1.setBounds(0, 0, 900, 700);
		pnl1.setBackground(Color.white);
		pnl1.setLayout(null);
		frm1.getContentPane().add(pnl1);
		
		Font fnt1 = new Font("SansSerif", Font.BOLD, 24);
		JLabel lbl1 = new JLabel("Lodge your FIR");
		lbl1.setBounds(350, 10, 250, 40);
		lbl1.setFont(fnt1);
		lbl1.setForeground(Color.RED);
		pnl1.add(lbl1);
		
		JLabel lbl2 = new JLabel("Please enter your FIR details :-");
		lbl2.setBounds(10, 60, 250, 40);
		pnl1.add(lbl2);
		
		JLabel lblTopic = new JLabel("Topic :");
		lblTopic.setBounds(100, 120, 100, 20);
		pnl1.add(lblTopic);
		
		JComboBox<String> cmbTopic = new JComboBox<String>();
		cmbTopic.setBounds(190, 120, 200, 20);
		cmbTopic.addItem("Child Abuse");
		cmbTopic.addItem("Child Labour");
		cmbTopic.addItem("Corruption");
		cmbTopic.addItem("Domestic Violence");
		cmbTopic.addItem("Extortion");
		cmbTopic.addItem("Goods Stolen");
		cmbTopic.addItem("Harrasment");
		cmbTopic.addItem("Kidnapping");
		cmbTopic.addItem("Mobile Theft");
		cmbTopic.addItem("Murder");
		cmbTopic.addItem("Rape");
		cmbTopic.addItem("Robbery");
		cmbTopic.addItem("Other");
		pnl1.add(cmbTopic);
		
		JLabel lblSubject = new JLabel("Subject :");
		lblSubject.setBounds(84, 150, 100, 20);
		pnl1.add(lblSubject);
		
		JTextField txtSubject = new JTextField();
		txtSubject.setBounds(190, 150, 200, 20);
		pnl1.add(txtSubject);
		
		JLabel lblDescription = new JLabel("Description :");
		lblDescription.setBounds(58, 180, 100, 20);
		pnl1.add(lblDescription);
		
		JTextArea txtArDescription= new JTextArea();
		txtArDescription.setBounds(190, 180, 200, 80);
		txtArDescription.setBorder(new LineBorder(Color.BLACK, 1));
		pnl1.add(txtArDescription);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setBounds(90, 280, 100, 20);
		pnl1.add(lblName);
		
		JTextField txtName = new JTextField();
		txtName.setBounds(188, 280, 200, 20);
		pnl1.add(txtName);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setBounds(75, 310, 100, 20);
		pnl1.add(lblAddress);
		
		JTextArea txtArAddress = new JTextArea();
		txtArAddress.setBounds(188, 310, 200, 80);
		txtArAddress.setBorder(new LineBorder(Color.BLACK, 1));
		pnl1.add(txtArAddress);
		
		JLabel lblCountry = new JLabel("Country :");
		lblCountry.setBounds(75, 400, 100, 20);
		pnl1.add(lblCountry);
		
		JComboBox<String> cmbCountry = new JComboBox<String>();
		cmbCountry.setBounds(185, 400, 200, 20);
		cmbCountry.addItem("Bangladesh");
		cmbCountry.addItem("Canada");
		cmbCountry.addItem("Denmark");
		cmbCountry.addItem("France");
		cmbCountry.addItem("Germany");
		cmbCountry.addItem("Greece");
		cmbCountry.addItem("India");
		cmbCountry.addItem("Indonesia");
		cmbCountry.addItem("Malayasia");
		cmbCountry.addItem("Thailand");
		cmbCountry.addItem("UAE");
		cmbCountry.addItem("UK");
		cmbCountry.addItem("USA");
		cmbCountry.addItem("Vietnam");
		pnl1.add(cmbCountry);

		JLabel lblPhone = new JLabel("Phone :");
		lblPhone.setBounds(85, 430, 100, 20);
		pnl1.add(lblPhone);
		
		JTextField txtPhone = new JTextField();
		txtPhone.setBounds(184, 430, 205, 20);
		pnl1.add(txtPhone);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setBounds(89, 460, 100, 20);
		pnl1.add(lblEmail);
		
		JTextField txtEmail = new JTextField();
		txtEmail.setBounds(183, 460, 207, 20);
		pnl1.add(txtEmail);
		
		JLabel lblAdd = new JLabel("Add As :");
		lblAdd.setBounds(79, 490, 100, 20);
		pnl1.add(lblAdd);
		
		JComboBox<String> cmbAddAs = new JComboBox<String>();
		cmbAddAs.setBounds(182, 490, 207, 20);
		cmbAddAs.addItem("Country Information");
		cmbAddAs.addItem("Global Issue");
		pnl1.add(cmbAddAs);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(400, 550, 180, 40);
		btnSubmit.setBackground(Color.darkGray);
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					bw = new BufferedWriter(new FileWriter("./bin/comp.txt"));
					bw.write("Topic = "+cmbTopic.getSelectedItem());
					bw.newLine();
					bw.newLine();
					bw.write("Subject = "+txtSubject.getText());
					bw.newLine();
					bw.newLine();
					bw.write("Description = "+txtArDescription.getText());
					bw.newLine();
					bw.newLine();
					bw.write("Name = "+txtName.getText());
					bw.newLine();
					bw.newLine();
					bw.write("Address = "+txtArAddress.getText()	);
					bw.newLine();
					bw.newLine();
					bw.write("Country = "+cmbCountry.getSelectedItem());
					bw.newLine();
					bw.newLine();
					bw.write("Phone = "+txtPhone.getText());
					bw.newLine();
					bw.newLine();
					bw.write("Email = "+txtEmail.getText());
					bw.newLine();
					bw.newLine();
					bw.write("Added As : "+cmbAddAs.getSelectedItem());
					bw.newLine();
					bw.newLine();
					
					bw.close();
					JOptionPane.showMessageDialog(null, "Successfully regestered complaint.\nFile Saved to 'bin' folder");
					
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, ex);
				}
			}
			
		});
		
		pnl1.add(btnSubmit);
		
		
		
		
		
		frm1.setVisible(true);
	}

	public static void main(String[] args) 
	{
		Complaint object = new Complaint();
		object.fun1();
	}

}

