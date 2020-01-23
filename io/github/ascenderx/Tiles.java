package io.github.ascenderx;

import java.awt.EventQueue;

public class Tiles {
  private GameWindow window;
  private GameCanvas canvas;
  private FramerateTimer timer;
  private static final long INTERVAL = 10;

  public Tiles() {
    canvas = new GameCanvas();
    window = new GameWindow(canvas);

    timer = new FramerateTimer(() -> {
      canvas.repaint();
    }, INTERVAL);
  }

  public void run() {
    EventQueue.invokeLater(() -> {
      window.reveal();
      timer.start();
    });
  }

  public static void main(String[] args) {
    Tiles tiles = new Tiles();
    tiles.run();
  }
}