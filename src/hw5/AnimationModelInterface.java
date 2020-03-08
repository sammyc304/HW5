package hw5;

import java.awt.*;

public interface AnimationModelInterface {
  void addShape(Shape s);

  void addMotion(String name, int tick, Position p, Dimension d, Color c);

  String textOutput();
}
