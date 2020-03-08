package hw5.shapes;

import java.awt.*;

import hw5.Dimension;
import hw5.Position;
import hw5.ShapeCommand;

public class Triangle implements ShapeCommand {

  private final Position p;
  private final Dimension d;

  public Triangle(Position p, Dimension d) {
    this.p = p;
    this.d = d;
  }

  @Override
  public void goCommand(Graphics2D g) {
    g.fillPolygon(new int[]{(p.getX() - (d.getW() / 2)), p.getX(), (p.getX() + (d.getW() / 2))},
        new int[]{(p.getY() + (d.getH() / 2)), (p.getY() - (d.getH() / 2)), (p.getY() + (d.getH() / 2))}, 3);
  }
}
