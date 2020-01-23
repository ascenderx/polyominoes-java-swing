package io.github.ascenderx;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JPanel;

public class GameCanvas extends JPanel {
  public List<Drawable> drawables;
  
  public GameCanvas(List<Drawable> drawables) {
    this.drawables = drawables;
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D graphics = (Graphics2D) g;

    // Draw the background.
    graphics.setColor(Color.BLACK);
    graphics.fillRect(0, 0, getWidth(), getHeight());

    // Draw everything else.
    for (Drawable drawable : drawables) {
      drawable.draw(graphics);
    }
  }
}
