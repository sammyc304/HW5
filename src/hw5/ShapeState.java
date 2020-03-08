package hw5;

import java.awt.*;
import java.util.Objects;

public class ShapeState {

  private final int tick;
  private final Position p;
  private final Dimension d;
  private final Color c;
  private final ShapeType s;
  private final CPComponent cp;

  public ShapeState() {
    this.tick = 0;
    this.p = new Position();
    this.d = new Dimension();
    this.c = new Color(0, 0, 0);
    this.s = null;
    this.cp = new CPComponent(p, d, c, s);
  }

  public ShapeState(int tick, Position p, Dimension d, Color c, ShapeType s) {
    this.tick = tick;
    this.p = new Position(p);
    this.d = new Dimension(d);
    this.c = new Color(c.getRGB());
    this.s = s;
    this.cp = new CPComponent(p, d, c, s);
  }

  @Override
  public String toString() {
    StringBuilder ret_val = new StringBuilder();
    ret_val.append(tick).append(" ").append(p.toString())
        .append(" ").append(d.toString()).append(c.getRed())
        .append(" ").append(c.getGreen()).append(" ").append(c.getBlue());
    return ret_val.toString();
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof ShapeState)) {
      return false;
    }
    ShapeState temp = (ShapeState) obj;
    return (temp.tick == this.tick &&
        temp.p.equals(this.p) && temp.d.equals(this.d)
        && temp.c.equals(this.c) && temp.s == this.s && temp.cp.equals(this.cp));
  }
}
