package hw5;

import java.awt.*;

public class Main {
  public static void main(String[] args) {
    BasicAMI b = new BasicAMI();
    Shape a = new Shape("First", 1, new Position(10, 10), new Dimension(5, 5), Color.GREEN, ShapeType.OVAL);
    b.addShape(a);
    b.addMotion("First", 10, new Position(1, 1), new Dimension(6, 6), Color.GREEN);
    b.addMotion("First", 50, new Position(2, 2), new Dimension(6, 6), Color.GREEN);
    Shape c = new Shape("Second", 1, new Position(10, 10), new Dimension(5, 5), Color.CYAN, ShapeType.TRIANGLE);
    b.addShape(c);
    b.addMotion("Second", 10, new Position(5, 5), new Dimension(4, 4), Color.CYAN);
    System.out.print(b.textOutput());
    /*Frame frame = new Frame();
    frame.add(new CPComponent(new Position(150, 150), new Dimension(100, 100), Color.CYAN, ShapeType.OVAL));
    int frameWidth = 300;
    int frameHeight = 300;
    frame.setSize(frameWidth, frameHeight);
    frame.setVisible(true);*/
  }
}
