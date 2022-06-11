import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class MyFrame extends JFrame implements ActionListener {

JComboBox comboBox1;
JComboBox comboBox2;
String firstbox = " ";
String secondbox = " ";
String F = "Fahrenheit";
String C = "Celsius";
String K = "Kelvin";
JButton button;
JTextField field;
JLabel label;
private JFrame frame;
private JPanel panel;
int finaltemp = 0;
String stringFT = " ";
int FTFIN = 0;





MyFrame(){



this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(new FlowLayout());

this.setTitle("Temperature Converter");
Color back = new Color(152, 198, 235);
this.getContentPane().setBackground(back);




//Drop box

String[] temperatures1 = {"  ", "Fahrenheit", "Celcius", "Kelvin"};
String[] temperatures2 = {"  ", "Fahrenheit" , "Celsius", "Kelvin"};

comboBox1 = new JComboBox(temperatures1);
comboBox2 = new JComboBox(temperatures2);
comboBox1.addActionListener(this);
comboBox2.addActionListener(this);

this.add(comboBox1);
this.pack();
this.setVisible(true);
this.add(comboBox2);
this.pack();
this.setVisible(true);
this.setSize(400,200);



// final JLabel Output

label = new JLabel();
label.setText("Temperature:                       ");
label.setBounds(250,100,100,100);
this.add(label);
this.setVisible(true);




//Button

JButton b = new JButton("Submit");
button = b;
b.addActionListener(this);
this.setLayout(null);
b.setBounds(220,60,100,30);  
b.setFocusable(false);
b.setForeground(Color.black);
b.setBackground(Color.lightGray);

this.add(b);
b.setText("Convert");




//Text box

JTextField t = new JTextField();
field = t;
t.setPreferredSize(new Dimension(200,40));
t.setBounds(100,55,100,40);
this.add(t);
//this.pack(); //Put this back to change format
this.setVisible(true);




}




public void actionPerformed(ActionEvent e) {
if(e.getSource()==comboBox1) {                    
firstbox = (String) comboBox1.getSelectedItem();

}
if(e.getSource()==comboBox2) {
secondbox = (String) comboBox2.getSelectedItem();
}


if(e.getSource()==button) {

if(firstbox == F && secondbox == F) {
stringFT = field.getText();
label.setText("Temperature: " + stringFT);
}

if(firstbox == F && secondbox == C) {
FTFIN = Integer.parseInt(field.getText());
FTFIN = ((FTFIN - 32) * 5)/9;
label.setText("Temperature " + FTFIN );

}
if(firstbox == F && secondbox == K) {
FTFIN = Integer.parseInt(field.getText());
FTFIN = (int) ((((FTFIN - 32) * 5)/9) + 273.13);
label.setText("Temperature " + FTFIN );

}


if(firstbox == C && secondbox == C) {
stringFT =  field.getText();
label.setText("Temperature: " + stringFT);
}

if(firstbox == C && secondbox == F) {
FTFIN = Integer.parseInt(field.getText());
FTFIN = (int) (FTFIN * 1.8 + 32);
label.setText("Temperature " + FTFIN );

}

if(firstbox == C && secondbox == K) {
FTFIN = Integer.parseInt(field.getText());
FTFIN = (int) (FTFIN + 273.15);
label.setText("Temperature " + FTFIN );

}

if(firstbox == K && secondbox == K) {
stringFT =  field.getText();
label.setText("Temperature: " + stringFT);
}

if(firstbox == K && secondbox == F) {
FTFIN = Integer.parseInt(field.getText());
FTFIN = (int) ((FTFIN - 273.15) * 9/5) + 32;
label.setText("Temperature " + FTFIN );

}

if(firstbox == K && secondbox == C) {
FTFIN = Integer.parseInt(field.getText());
FTFIN = (int) (FTFIN - 273.15);
label.setText("Temperature " + FTFIN );

}
button.setEnabled(true);
field.setEditable(true);

}

}





}



	


