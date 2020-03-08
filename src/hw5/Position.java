package hw5;

public class Position {

  private final int x;
  private final int y;

  public Position() {
    this.x = 0;
    this.y = 0;
  }

  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Position(Position pos) {
    this.x = pos.x;
    this.y = pos.y;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }
}
