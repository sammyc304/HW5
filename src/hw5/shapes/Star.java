package hw5.shapes;

import java.awt.*;

import hw5.Dimension;
import hw5.Position;
import hw5.ShapeCommand;

public class Star implements ShapeCommand {

  private final Position p;
  private final Dimension d;

  public Star(Position p, Dimension d) {
    this.p = p;
    this.d = d;
  }

  @Override
  public void goCommand(Graphics2D g) {
    int midX = 500;
    int midY = 340;
    int[] radius = {118, 40, 90, 40};
    int nPoints = 16;
    int[] X = new int[nPoints];
    int[] Y = new int[nPoints];

    for (double current = 0.0; current < nPoints; current++) {
      int i = (int) current;
      double x = Math.cos(current * ((2 * Math.PI) / 10)) * radius[i % 4];
      double y = Math.sin(current * ((2 * Math.PI) / 10)) * radius[i % 4];

      X[i] = (int) x + midX;
      Y[i] = (int) y + midY;
    }

    g.fillPolygon(X, Y, nPoints);
  }
}
