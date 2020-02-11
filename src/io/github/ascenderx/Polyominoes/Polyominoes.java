package io.github.ascenderx.Polyominoes;

import java.awt.EventQueue;
import java.util.List;

import io.github.ascenderx.Polyominoes.models.Drawable;
import io.github.ascenderx.Polyominoes.models.FramerateTimer;
import io.github.ascenderx.Polyominoes.models.Game;
import io.github.ascenderx.Polyominoes.models.InputHandler;
import io.github.ascenderx.Polyominoes.views.GameCanvas;
import io.github.ascenderx.Polyominoes.views.GameWindow;

public class Polyominoes {
  private Game game;
  private GameWindow window;
  private GameCanvas canvas;
  private InputHandler inputHandler;
  private FramerateTimer timer;
  private List<Drawable> drawables;
  private static final long INTERVAL = 50;

  public Polyominoes() {
    inputHandler = new InputHandler();
    game = new Game(inputHandler);
    drawables = game.getDrawables();
    canvas = new GameCanvas(drawables);
    window = new GameWindow(canvas, inputHandler);

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