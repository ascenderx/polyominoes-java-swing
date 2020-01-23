package io.github.ascenderx;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GameCanvas extends JPanel {
  private int x;
  private int y;

  public GameCanvas() {
    x = 0;
    y = 0;
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D graphics = (Graphics2D) g;
    graphics.setColor(Color.BLACK);
    graphics.fillRect(0, 0, getWidth(), getHeight());

    graphics.setColor(Color.RED);
    graphics.fillRect(x++, y++, 50, 50);
  }
}
