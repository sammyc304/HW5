package hw5.shapes;

import java.awt.*;

import hw5.Dimension;
import hw5.Position;
import hw5.ShapeCommand;

public class Rectangle implements ShapeCommand {

  private final Position p;
  private final Dimension d;

  public Rectangle(Position p, Dimension d) {
    this.p = p;
    this.d = d;
  }

  @Override
  public void goCommand(Graphics2D g) {
    g.fillRect(p.getX(), p.getY(), d.getW(), d.getH());
  }
}
