/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproject.Note;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author PC
 */
public class note extends JFrame {

    private JPanel board;
    
    public note() {
        super("Note");
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        board = new JPanel() {
            private int mouseX, mouseY;

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Draw the original line
                g.drawLine(10, 10, 10, 10);

                // Set the color to red
                g.setColor(Color.RED);

                // Draw the new line and text at the mouse position
                g.drawLine(0, mouseY, getWidth(), mouseY);
                g.drawString("Text", mouseX, mouseY);
            }
        };

        board.setBounds(0, 100, 1920, 900);
        board.setBackground(Color.GRAY);

        board.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                board.repaint();
            }
        });

        board.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                // Update mouse position
                board.repaint();
//                mouseX = e.getX();
//                mouseY = e.getY();
                board.repaint();
            }
        });

        add(board);

        setLayout(null);
        setVisible(true);
    }


}
