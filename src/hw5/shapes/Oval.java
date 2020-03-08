package hw5.shapes;

import java.awt.*;

import hw5.Dimension;
import hw5.Position;
import hw5.ShapeCommand;

public class Oval implements ShapeCommand {

  private final Position p;
  private final Dimension d;

  public Oval(Position p, Dimension d) {
    this.p = p;
    this.d = d;
  }

  @Override
  public void goCommand(Graphics2D g) {
    g.fillOval(p.getX(), p.getY(), d.getW(), d.getH());
  }
}
