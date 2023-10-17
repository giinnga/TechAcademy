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
    private double angle4 = 0;
    private double angle5 = 0;
    private double angle6 = 0;
    private double angle7 = 0;
    private double angle8 = 0;

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
        int planetC = (int) (centerX + 110 * Math.cos(angle2));
        int planetD = (int) (centerY + 110 * Math.sin(angle2));
        g.setColor(Color.YELLOW);
        g.fillOval(planetC - 18, planetD - 18, 18, 18);

        angle2 += 0.04;

        // 惑星を描画
        int planetE = (int) (centerX + 150 * Math.cos(angle3));
        int planetF = (int) (centerY + 150 * Math.sin(angle3));
        g.setColor(Color.BLUE);
        g.fillOval(planetE - 20, planetF - 20, 20, 20);

        angle3 += 0.03;

        // 惑星を描画
        int planetG = (int) (centerX + 180 * Math.cos(angle4));
        int planetH = (int) (centerY + 180 * Math.sin(angle4));
        g.setColor(Color.RED);
        g.fillOval(planetG - 14, planetH - 14, 14, 14);

        angle4 += 0.026;

        // 惑星を描画
        int planetI = (int) (centerX + 230 * Math.cos(angle5));
        int planetJ = (int) (centerY + 230 * Math.sin(angle5));
        g.setColor(Color.ORANGE);
        g.fillOval(planetI - 40, planetJ - 40, 40, 40);

        angle5 += 0.007;

        // 惑星を描画
        int planetK = (int) (centerX + 270 * Math.cos(angle6));
        int planetL = (int) (centerY + 270 * Math.sin(angle6));
        g.setColor(Color.MAGENTA);
        g.fillOval(planetK - 30, planetL - 30, 30, 30);

        angle6 += 0.005;

        // 惑星を描画
        int planetM = (int) (centerX + 330 * Math.cos(angle7));
        int planetN = (int) (centerY + 330 * Math.sin(angle7));
        g.setColor(Color.CYAN);
        g.fillOval(planetM - 25, planetN - 25, 25, 25);

        angle7 += 0.004;

        // 惑星を描画
        int planetO = (int) (centerX + 370 * Math.cos(angle8));
        int planetP = (int) (centerY + 370 * Math.sin(angle8));
        g.setColor(Color.BLUE);
        g.fillOval(planetO - 24, planetP - 24, 24, 24);

        angle8 += 0.002;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Solar System Simulation");
        SolarSystemSimulation simulation = new SolarSystemSimulation();
        frame.add(simulation);
        frame.setSize(1600, 1600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Timer timer = new Timer(16, simulation);
        timer.start();
    }
}
