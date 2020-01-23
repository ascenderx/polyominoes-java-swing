package io.github.ascenderx;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Stroke;

public class TestBlock implements Drawable {
  private Point position;
  private Rectangle rectangle;
  private static final Dimension DIMENSION = new Dimension(50, 50);
  private static final Color COLOR = Color.RED;
  private static final Stroke STROKE = new BasicStroke(3);

  public TestBlock(Point position) {
    this.position = position;
    this.rectangle = new Rectangle(position, DIMENSION);
  }
  
  @Override
  public void draw(Graphics2D graphics) {
    graphics.setStroke(STROKE);
    graphics.setColor(COLOR);
    graphics.draw(rectangle);
  }

  @Override
  public void update() {
    position.translate(5, 5);
    rectangle.setLocation(position);
  }
}