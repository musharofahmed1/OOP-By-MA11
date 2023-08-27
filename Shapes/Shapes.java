package Shapes;
import java.awt.Graphics;
import java.swing.JPanel;
public class Shapes {
    public class Shapes extends JPanel{
        private int choice;

        //constructor set the user choice
        public Shapes(int userChoice){
            choice = userChoice;
        }
        //draw cascade of shapes string from top left corner
        public void paintComponent(Graphics g){
            super.paintComponent(g);

            for(int i = 0; i<10;i++){
                switch(choice)
                {
                    case 1: 
                        g.drawReact(10 + i * 10, 10+i*10, 50+i*10,50+i*10);
                        break;
                        case 2: 
                             g.drawReact(10 + i * 10, 10+i*10, 50+i*10,50+i*10);
                        break;
                }
            }
        }
    }
}
