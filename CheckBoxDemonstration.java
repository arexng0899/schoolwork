
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxDemonstration {

	private static FlowLayout flow;
	private static JLabel label, response;
	private static JCheckBox coffee, cola, milk, water;
	private static JFrame myFrame;
	
	public static void main(String[] args) {
		flow = new FlowLayout();
		label = new JLabel("What would you like to drink?");
		response=new JLabel("");
		coffee = new JCheckBox("Coffee", false);
		cola = new JCheckBox("Cola", false);
		milk = new JCheckBox("Milk", false);
		water = new JCheckBox("Water", false);
		myFrame = new JFrame("Check Box Example");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(flow);
		label.setFont(new Font("Arial",Font.ITALIC,22));
		coffee.addItemListener(new checkListen());
		cola.addItemListener(new checkListen());
		milk.addItemListener(new checkListen());
		water.addItemListener(new checkListen());
		
		myFrame.add(label);
		myFrame.add(coffee);
		myFrame.add(cola);
		myFrame.add(milk);
		myFrame.add(water);
		myFrame.add(response);
		myFrame.setSize(350,220);
		myFrame.setVisible(true);
	}
	private static class checkListen implements ItemListener{
		public void itemStateChanged(ItemEvent i) {
			String s="";
			
			if(i.getSource()==coffee && i.getStateChange()==1) {
				s=response.getText()+" coffee ";
			} 
			if(i.getSource()==cola && i.getStateChange()==1) {
				s=response.getText()+" cola ";
			}
			if(i.getSource()==milk && i.getStateChange()==1) {
				s=response.getText()+" milk ";
			}
			if(i.getSource()==water && i.getStateChange()==1) {
				s=response.getText()+" water ";
			}
			response.setText(s);
		}
	}

}
