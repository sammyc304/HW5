package hw5;

import java.awt.*;

public class Main {
  public static void main(String[] args) {
    Frame frame = new Frame();
    frame.add(new CPComponent(new Position(150, 150), new Dimension(100, 100), Color.CYAN, ShapeType.TRIANGLE));
    int frameWidth = 300;
    int frameHeight = 300;
    frame.setSize(frameWidth, frameHeight);
    frame.setVisible(true);
  }
}
