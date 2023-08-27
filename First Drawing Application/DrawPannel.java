package First Drawing Application;
import java.awt.Graphics;
import java.swing.JPanel;
public class DrawPannel {
    //draw an X
    public void printComponent(Graphics g){
        //call printfComponent
        super.printComponent(g);

        int width = getWidth();
        int height = getHeight();

        //draw a line from upper left to lower left
        g.drawLine(0,0,width,height);

        //draw a line from lower left to upper right
        g.drawLine(0,height,width,0);

    }
    //end class drawpannel
}
