package testtest;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SolarSystemSimulation extends JPanel implements ActionListener {
    private double angle1 = 0;
    private double angle2 = 0;
    private double angle3 = 0;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // 太陽を描画
        g.setColor(Color.ORANGE);
        g.fillOval(centerX - 50, centerY - 50, 100, 100);

        // 惑星を描画
        int planetA = (int) (centerX + 80 * Math.cos(angle1));
        int planetB = (int) (centerY + 80 * Math.sin(angle1));
        g.setColor(Color.DARK_GRAY);
        g.fillOval(planetA - 10, planetB - 10, 10, 10);

        angle1 += 0.05;

     // 惑星を描画
        int planetC = (int) (centerX + 120 * Math.cos(angle2));
        int planetD = (int) (centerY + 120 * Math.sin(angle2));
        g.setColor(Color.YELLOW);
        g.fillOval(planetC - 18, planetD - 18, 18, 18);

        angle2 += 0.01;

        // 惑星を描画
        int planetE = (int) (centerX + 200 * Math.cos(angle3));
        int planetF = (int) (centerY + 200 * Math.sin(angle3));
        g.setColor(Color.BLUE);
        g.fillOval(planetE - 20, planetF - 20, 20, 20);

        angle3 += 0.008;

     // 惑星を描画
        int planetG = (int) (centerX + 250 * Math.cos(angle3));
        int planetH = (int) (centerY + 250 * Math.sin(angle3));
        g.setColor(Color.RED);
        g.fillOval(planetG - 14, planetH - 14, 14, 14);

        angle3 += 0.006;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Solar System Simulation");
        SolarSystemSimulation simulation = new SolarSystemSimulation();
        frame.add(simulation);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Timer timer = new Timer(16, simulation);
        timer.start();
    }
}
