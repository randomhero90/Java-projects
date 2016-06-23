import javax.swing.*;
import java.awt.event.*;

public class ButtonDoesSomething extends JFrame
{
      
   final int FRAME_WIDTH = 300;
   final int FRAME_HEIGHT = 400;
   
   int timesClicked1 = 0;
   int timesClicked2 = 0;
   
   private JButton button1 = new JButton("Click Me!");
   private JLabel label1 = new JLabel("Hey, I am button 1, click me!");
   private JButton button2 = new JButton("No, Click Me!");
   private JLabel label2 = new JLabel("That other button isn't worth the click!");
      
   
   private ButtonDoesSomething()
   {
      JPanel panel = new JPanel();
      panel.add(button1);
      panel.add(button2);
      panel.add(label1);
      panel.add(label2);
      add(panel);
      
      ActionListener buttonListener = new ButtonListener();
      button1.addActionListener(buttonListener);
      button2.addActionListener(buttonListener);
      
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      setTitle("An Empty Frame");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setVisible(true);
   }
   
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
         if(event.getSource() == button1)
         {
            timesClicked1++;
            label1.setText("Yay you have clicked me: " + timesClicked1 + " times");
         }
         else if(event.getSource() == button2)
         {
            timesClicked2++;
            label2.setText("You made the right choice: " + timesClicked2 + " times");
         }
      }
   }
   public static void main(String[] args)
   {
      JFrame frame = new ButtonDoesSomething();
   }
}