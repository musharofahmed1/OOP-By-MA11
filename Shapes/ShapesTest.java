package Shapes;
import java.swing.Jframe;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ShapesTest {
    public static void main(String[] args){
        //obtain user choice
        String input = JOptionPane.showInputDialog("Enter 1 to draw Rectangle\n" + "Enter 2 to draw ovals", args, null, 0);

        int choice = Integer.parseInt(input);

        Shapes panel = new Shapes(choice);

        //create a new JFrame
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300,300);
        application.setVisible(true);
    }
    //end of shape test
}
