package io.github.ascenderx;

import java.awt.EventQueue;
import java.awt.Point;
import java.util.LinkedList;
import java.util.List;

public class Polyominoes {
  private GameWindow window;
  private GameCanvas canvas;
  private FramerateTimer timer;
  private List<Drawable> drawables;
  private static final long INTERVAL = 50;

  public Polyominoes() {
    drawables = new LinkedList<Drawable>();
    drawables.add(new TestBlock(new Point(0, 0)));

    canvas = new GameCanvas(drawables);
    window = new GameWindow(canvas);

    timer = new FramerateTimer(() -> {
      for (Drawable drawable : drawables) {
        drawable.update();
      }
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
    Polyominoes tiles = new Polyominoes();
    tiles.run();
  }
}