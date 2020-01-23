package io.github.ascenderx.views;

import javax.swing.JFrame;

public class GameWindow extends JFrame {
  private static final int SCALE = 4;
  private static final int WIDTH = 128 * SCALE;
  private static final int HEIGHT = 64 * SCALE;
  private static final String TITLE = "Tiles";

  public GameWindow(GameCanvas canvas) {
    super(TITLE);

    // Set properties.
    setSize(WIDTH, HEIGHT);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // Add components.
    add(canvas);
  }

  public void reveal() {
    setVisible(true);
  }
}
