package Gamestates;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import Display.Game;

public class Menu extends State implements Statemethods {

        public Menu(Game game) {
        super(game);
    }

        @Override
        public void update() {
        }

        @Override
        public void draw(Graphics g) {
            g.setColor(Color.black);
            g.drawString("PRESS ENTER TO START", Game.screenWidth / 2 - 90, 200);
            g.drawString("PRESS ESC TO RETURN BACK", Game.screenWidth / 2 - 105, 300);
        }

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseMoved(MouseEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                Gamestate.state = Gamestate.PLAYING;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
        
    }
