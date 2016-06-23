import javax.swing.*;

public class EmptyFrameViewer extends JFrame
{
      
   final int FRAME_WIDTH = 300;
   final int FRAME_HEIGHT = 400;
   
   public EmptyFrameViewer()
   {
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      setTitle("An Empty Frame");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setVisible(true);
   }

   public static void main(String[] args)
   {
      JFrame frame = new EmptyFrameViewer();
   }
}