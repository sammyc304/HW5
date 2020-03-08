package hw5;

public class Dimension {

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

  public int getH() {
    return this.h;
  }

  public int getW() {
    return this.w;
  }
}
