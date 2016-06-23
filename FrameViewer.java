import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FrameViewer
{

   static JTextField label;
   static JButton button;
   
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      
      button = new JButton("Click here!");
      ActionListener listener = new ClickListener();
      button.addActionListener(listener);
      label = new JTextField("I am a frame!");
      label.setForeground( new Color(255, 0, 0) );
      Font trb = new Font("TimesRoman", Font.BOLD, 14);
      label.setFont(trb);
      
      JPanel panel = new JPanel();
      panel.add(button);
      panel.add(label);
      frame.add(panel);
      
      final int FRAME_WIDTH = 600;
      final int FRAME_HEIGHT = 200;
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("A filled frame!");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.setVisible(true);
   }
   
   public static class ClickListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         Font trb = new Font("MarkerFelt", Font.BOLD, 18);
         label.setFont(trb);
         label.setText("I was f---ing clicked!");
      }
   }
}