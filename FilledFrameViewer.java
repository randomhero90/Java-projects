import javax.swing.*;

public class FilledFrameViewer extends JFrame
{
      
   final int FRAME_WIDTH = 300;
   final int FRAME_HEIGHT = 400;
   JButton button = new JButton("Click Me!");
   
   public FilledFrameViewer()
   {
      JLabel label = new JLabel("Hello, World!");
      
      JPanel panel = new JPanel();
      panel.add(button);
      panel.add(label);
      add(panel);
      
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      setTitle("An Empty Frame");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setVisible(true);
   }

   public static void main(String[] args)
   {
      JFrame frame = new FilledFrameViewer();
   }
}