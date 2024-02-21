// CSC 1302 Alex Ng Lab 10 Online Section

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

   public class PizzaBuilder 
   {
	   private static JFrame myFrame = new JFrame("Build a Pizza");
	
	   private static JRadioButton small, medium, large;
	   private static ButtonGroup bg;
	   private static JLabel sizeList = new JLabel("Sizes List: ");
	   private static JLabel Price = new JLabel("Total $ ");
	   private static JLabel totPrice = new JLabel("0.0");
	   private static JLabel topsPrice = new JLabel("Topping $ ");
	   private static JLabel toppingsPrice = new JLabel("0.0");
	
	   private static final double LARGE = 16.49;
	   private static final double MEDIUM = 13.49;
	   private static final double SMALL = 10.49;
	   private static final double MEATITEM = 2.25;
	   private static final double VEGITEM = 1.75;
	
	   private static int meattopping = 0;
	   private static int vegtopping = 0;
	   private static JCheckBox sausage, pepperoni, canadian_ham, anchovies;
	   private static JCheckBox mushroom, green_pepper, onion, black_olive;

	      public static void main(String[] args) 
         {
		      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      myFrame.setLayout(new FlowLayout());
		
		      JPanel panelSizePrice = makeSizePricePanel();		
		      JPanel panelCheck = makePizzaPanel();

		      myFrame.add(panelSizePrice);
		      myFrame.add(panelCheck);
		      myFrame.setSize(620,340);
		      myFrame.setVisible(true);
	      }

	      private static JPanel makeSizePricePanel() 
         {
		      JPanel jp = new JPanel();
		      jp.setLayout(new GridLayout(2,4));
		      jp.setPreferredSize(new Dimension(575,100));
		      
            // creating radio buttons for sizes
		      small = new JRadioButton("Small", true);
		      totPrice.setText(String.valueOf(SMALL));
            medium = new JRadioButton("Medium", false);
            large = new JRadioButton("Large", false);
		      
            // setting buttons to the item listener
            small.addItemListener(new pizzaSizeListen());
            medium.addItemListener(new pizzaSizeListen());
            large.addItemListener(new pizzaSizeListen());
		      
            // new button group
		      bg = new ButtonGroup();
		      
            // adding sizes to button group
            bg.add(small);
            bg.add(medium);
            bg.add(large);
            
            // size panel
            JPanel radioPanel = new JPanel();
            radioPanel.setLayout(new GridLayout(1,4));
            radioPanel.add(sizeList);
            radioPanel.add(small);
            radioPanel.add(medium);
            radioPanel.add(large);
            
            // price panel
            JPanel pricePanel = new JPanel();
            pricePanel.setLayout(new GridLayout(1,4));
            pricePanel.add(Price);
            pricePanel.add(totPrice);
            pricePanel.add(topsPrice);
            pricePanel.add(toppingsPrice);
            
            // adding price and size panels to the main panel
            jp.add(radioPanel);
            jp.add(pricePanel);
		
		      return jp;
		
	      }
   
	      private static class pizzaSizeListen implements ItemListener 
         {
		      public void itemStateChanged(ItemEvent i)
		      {
		      	double sizePrice = SMALL;
                  
                  // checks if the source is equal to one of the sizes
                  // if met the sizePrice is changed to that size
                  if(i.getSource() == small)
                  {
                     sizePrice = SMALL;
                  }
                  
                  if(i.getSource() == medium)
                  {
                     sizePrice = MEDIUM;
                  }
                  
                  if(i.getSource() == large)
                  {
                     sizePrice = LARGE;
                  }
		      	
		      	//check which radio button was 'selected' and set the price
		      	//according to the constants, SMALL, MEDIUM, LARGE
			
		      	double pizzaPrice = sizePrice + Double.parseDouble(toppingsPrice.getText());
		      	totPrice.setText(String.valueOf(pizzaPrice));
		      }
	      }     
   
	      private static JPanel makePizzaPanel() 
         {
		      JPanel jp = new JPanel();
		      jp.setLayout(new GridLayout(2,4));
		      jp.setPreferredSize(new Dimension(575,100));
		      
            // creating check boxes for each item
            sausage = new JCheckBox("Sausage", false);
            pepperoni = new JCheckBox("Pepperoni", false);
            canadian_ham = new JCheckBox("Canadian Ham", false);
            anchovies = new JCheckBox("Anchovies", false);
            black_olive = new JCheckBox("Black Olive", false);
            onion = new JCheckBox("Onion", false);
            mushroom = new JCheckBox("Mushroom", false);
            green_pepper = new JCheckBox("Green Pepper", false);
            
            // setting the items to the item listener
            sausage.addItemListener(new pizzaToppingListen());
            pepperoni.addItemListener(new pizzaToppingListen());
            canadian_ham.addItemListener(new pizzaToppingListen());
            anchovies.addItemListener(new pizzaToppingListen());
            black_olive.addItemListener(new pizzaToppingListen());
            onion.addItemListener(new pizzaToppingListen());
            mushroom.addItemListener(new pizzaToppingListen());
            green_pepper.addItemListener(new pizzaToppingListen());
            
            // creating a panel for the meat items
            JPanel meatPanel = new JPanel();
            meatPanel.setLayout(new GridLayout(1,4));
            meatPanel.add(sausage);
            meatPanel.add(pepperoni);
            meatPanel.add(canadian_ham);
            meatPanel.add(anchovies);
            
            // creating a panel for the veggie items
            JPanel vegiPanel = new JPanel();
            vegiPanel.setLayout(new GridLayout(1,4));
            vegiPanel.add(black_olive);
            vegiPanel.add(onion);
            vegiPanel.add(mushroom);
            vegiPanel.add(green_pepper);
            
            // adding meat and veggie panels to the main panel
            jp.add(meatPanel);
            jp.add(vegiPanel);
		
		      Border blackline = BorderFactory.createLineBorder(Color.black);
		      jp.setBorder(blackline);
		      return jp;
		
	      }
   
	      private static class pizzaToppingListen implements ItemListener 
         {
		      public void itemStateChanged(ItemEvent i) 
            {
               // nested if statement checking if the source is the item
               // the inner statement checks if the state is 1
               // if met the topping is incremented
               // if not the topping is decremented
               if(i.getSource() == sausage)
               {
                  if(i.getStateChange() == 1)
                  {
                     meattopping++;
                  }
                     else
                     {
                        meattopping--;
                     }
               }
               
               if(i.getSource() == pepperoni)
               {
                  if(i.getStateChange() == 1)
                  {
                     meattopping++;
                  }
                     else
                     {
                        meattopping--;
                     }
               }
               
               if(i.getSource() == canadian_ham)
               {
                  if(i.getStateChange() == 1)
                  {
                     meattopping++;
                  }
                     else
                     {
                        meattopping--;
                     }
               }
               
               if(i.getSource() == anchovies)
               {
                  if(i.getStateChange() == 1)
                  {
                     meattopping++;
                  }
                     else
                     {
                        meattopping--;
                     }
               }
               
               if(i.getSource() == black_olive)
               {
                  if(i.getStateChange() == 1)
                  {
                     vegtopping++;
                  }
                     else
                     {
                        vegtopping--;
                     }
               }
               
               if(i.getSource() == onion)
               {
                  if(i.getStateChange() == 1)
                  {
                     vegtopping++;
                  }
                     else
                     {
                        vegtopping--;
                     }
               }
               
               if(i.getSource() == mushroom)
               {
                  if(i.getStateChange() == 1)
                  {
                     vegtopping++;
                  }
                     else
                     {
                        vegtopping--;
                     }
               }
               
               if(i.getSource() == green_pepper)
               {
                  if(i.getStateChange() == 1)
                  {
                     vegtopping++;
                  }
                     else
                     {
                        vegtopping--;
                     }
               }
		
			      double topsPrice = (meattopping * MEATITEM) + (vegtopping * VEGITEM);
			      double sizePrice = 0.0;
         
			         if(small.isSelected()) 
                  {
			         	totPrice.setText(String.valueOf(SMALL));
			         	sizePrice = SMALL;
			         }
         
			         if(medium.isSelected()) 
                  {
			         	totPrice.setText(String.valueOf(MEDIUM));
			         	sizePrice = MEDIUM;
			         }
         
			         if(large.isSelected()) 
                  {
			         	totPrice.setText(String.valueOf(LARGE));
			         	sizePrice = LARGE;
			         }

			      toppingsPrice.setText(String.valueOf(topsPrice));
			      totPrice.setText(String.valueOf(topsPrice + sizePrice));
		      }
	      }

   }