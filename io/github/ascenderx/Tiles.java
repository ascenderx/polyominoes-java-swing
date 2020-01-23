package io.github.ascenderx;

import javax.swing.JFrame;

public class Tiles {
  private JFrame frame;
  private GameCanvas canvas;
  private FramerateTimer timer;

  private static long INTERVAL = 10;

  public Tiles(String title, int width, int height) {
    frame = new JFrame(title);
    frame.setSize(width, height);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    canvas = new GameCanvas();
    frame.add(canvas);

    timer = new FramerateTimer(() -> {
      canvas.repaint();
    }, INTERVAL);
  }

  public void run() {
    frame.setVisible(true);
    timer.start();
  }

  public static void main(String[] args) {
    int scale = 4;
    int width = 128 * scale;
    int height = 64 * scale;
    Tiles tiles = new Tiles("Tiles", width, height);
    tiles.run();
  }
}