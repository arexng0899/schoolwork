import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

   public class TestGUICounter 
   {
      static JFrame frame_1;
	   static JButton start_val, add_1, minus_1, reset_1;
	   static JLabel label_0, label_1, label_num;
	   static JTextField text_1;
      static JPanel panel_center, panel_south;
	   static int iCounter = 0;
	
	   public static void main(String[] args) 
      {
	      frame_1 = new JFrame("LAB9 GUI Counter"); 
	   	frame_1.setLayout(new BorderLayout());

	   	label_0 = new JLabel("Input counter start:");
         text_1 = new JTextField("0", 3);
	   	label_1 = new JLabel("Value is:");
	   	label_num = new JLabel("0");
	   	start_val = new JButton("Set counter start");
	   	add_1 = new JButton("Add 1");
	   	minus_1 = new JButton("Delete 1");
	   	reset_1 = new JButton("Reset");
		
		   start_val.addActionListener(new ButtonListener());
         add_1.addActionListener(new ButtonListener());
         minus_1.addActionListener(new ButtonListener());
         reset_1.addActionListener(new ButtonListener());
         
         label_num = new JLabel("0");
         text_1 = new JTextField(5);
         text_1.setText("0");
         
         panel_center.add(text_1);
         panel_center.add(label_1);
         panel_center.add(label_num);
         
         panel_south.add(start_val);
         panel_south.add(add_1);
         panel_south.add(minus_1);
         panel_south.add(reset_1);
         
         frame_1.add(panel_center, BorderLayout.CENTER);
         frame_1.add(panel_south, BorderLayout.SOUTH);

		   frame_1.setSize(350, 150);    
		   frame_1.setVisible(true);
		   frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }
   
	   private static class ButtonListener implements ActionListener 
      {
		   public void actionPerformed(ActionEvent e) 
         {
			   if(e.getSource().equals(start_val))
            {
               iCounter = Integer.parseInt(text_1.getText());
               label_num.setText(text_1.getText());
            }
               else if(e.getSource().equals(add_1))
               {
                  iCounter++;
               }
                  else if(e.getSource().equals(minus_1))
                  {
                     iCounter--;
                  }
                     else if(e.getSource().equals(reset_1))
                     {
                        iCounter = 0;
                        text_1.setText("0");
                     }
            label_num.setText((Integer.toString(iCounter)));
		   }

	   }
   }