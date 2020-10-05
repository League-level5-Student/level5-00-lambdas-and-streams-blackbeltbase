package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons  {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener(e->{String nums = JOptionPane.showInputDialog("Enter two number seperated by a space. (e.i. 5 6)"); String[] numsNum = nums.split(" "); int num1 = Integer.parseInt(numsNum[0]); int num2 = Integer.parseInt(numsNum[1]); JOptionPane.showMessageDialog(null, numsNum[0] +" plus (+) "+numsNum[1]+ " equals (=) "+(num1+ num2));});
		randNumber.addActionListener(e->{Random ran = new Random(); JOptionPane.showMessageDialog(null, "Generating random number..."); JOptionPane.showMessageDialog(null, "Generated! Your random number is "+ ran.nextInt());});
		tellAJoke.addActionListener(e->{JOptionPane.showMessageDialog(null, "What do you call a black screen with your face?"); JOptionPane.showMessageDialog(null, "A mirror with a goblin in it!"); JOptionPane.showMessageDialog(null, "*insert laugh track*");});
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}


	
	
}
