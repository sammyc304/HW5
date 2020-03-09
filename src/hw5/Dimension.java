package hw5;

import java.util.Objects;

/**
 * Dimension is a class to represent the height and width of a shape.
 */
public final class Dimension {

  private final int h;
  private final int w;

  public Dimension() {
    this.h = 0;
    this.w = 0;
  }

  public Dimension(int h, int w) {
    this.h = h;
    this.w = w;
  }

  public Dimension(Dimension dim) {
    this.h = dim.h;
    this.w = dim.w;
  }

  /**
   * getH returns the h component.
   * @return int, h
   */
  public int getH() {
    return this.h;
  }

  /**
   * getH returns the w component.
   * @return int, w
   */
  public int getW() {
    return this.w;
  }

  @Override
  public String toString() {
    return w + " " + h;
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
    Dimension temp = (Dimension) obj;
    return (temp.h == this.h && temp.w == this.w);
  }
}
