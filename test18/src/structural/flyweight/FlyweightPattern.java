package structural.flyweight;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import structural.flyweight.ShapeFactory.ShapeType;
//Flyweight Pattern : 변경할 수 없는 개체와 함께 사용되는 개체 인스턴스를 캐싱하고 재사용하도록 하는 패턴
public class FlyweightPattern extends JFrame{
    private static final long serialVersionUID = -1350200437285282550L;
    private final int WIDTH;
    private final int HEIGHT;
 
    private static final ShapeType shapes[] = { ShapeType.LINE, ShapeType.OVAL_FILL,ShapeType.OVAL_NOFILL };
    private static final Color colors[] = { Color.RED, Color.GREEN, Color.YELLOW };
	
    public FlyweightPattern(int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;
        Container contentPane = getContentPane();
 
        JButton startButton = new JButton("Draw");
        final JPanel panel = new JPanel();
 
        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(startButton, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
 
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                Graphics g = panel.getGraphics();
                for (int i = 0; i < 20; ++i) {
                    Shape shape = ShapeFactory.getShape(getRandomShape());
                    shape.draw(g, getRandomX(), getRandomY(), getRandomWidth(),
                            getRandomHeight(), getRandomColor());
                }
            }
        });
    }
	
    private ShapeType getRandomShape() {
        return shapes[(int) (Math.random() * shapes.length)];
    }
 
    private int getRandomX() {
        return (int) (Math.random() * WIDTH);
    }
 
    private int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }
 
    private int getRandomWidth() {
        return (int) (Math.random() * (WIDTH / 10));
    }
 
    private int getRandomHeight() {
        return (int) (Math.random() * (HEIGHT / 10));
    }
 
    private Color getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
 
    public static void main(String[] args) {
    	FlyweightPattern drawing = new FlyweightPattern(500,600);
    }
}
