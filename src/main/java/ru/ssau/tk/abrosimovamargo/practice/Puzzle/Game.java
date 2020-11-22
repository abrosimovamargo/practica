package ru.ssau.tk.abrosimovamargo.practice.Puzzle;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Game extends JFrame {
    private ArrayList<Point> solution = new ArrayList<>();
    private ArrayList<PuzzleButton> buttons = new ArrayList<>();
    private JPanel panel = new JPanel();
    private BufferedImage source;
    private BufferedImage resized;
    private int width, height;
    private final int DESIRED_WIDTH = 400;

    public Game() throws IOException {
        initUI();
    }

    public void initUI() throws IOException {
        solution.add(new Point(0, 0));
        solution.add(new Point(0, 1));
        solution.add(new Point(0, 2));
        solution.add(new Point(1, 0));
        solution.add(new Point(1, 1));
        solution.add(new Point(1, 2));
        solution.add(new Point(2, 0));
        solution.add(new Point(2, 1));
        solution.add(new Point(2, 2));
        solution.add(new Point(3, 0));
        solution.add(new Point(3, 1));
        solution.add(new Point(3, 2));

        buttons=new ArrayList<>();

        panel=new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.gray));
        panel.setLayout(new GridLayout(4, 3));

        try {
            source = loadImage();
            int h=getNewHeight(source.getWidth(),source.getHeight());
            resized=resizeImage(source,DESIRED_WIDTH, h, BufferedImage.TYPE_INT_ARGB);
        }catch(IOException ex){
            System.err.println("Problem this source image"+ex);
        }

    }
    private BufferedImage resizeImage(BufferedImage originImage, int width, int height, int type){
        BufferedImage resizedImage= new BufferedImage(width,height,type);
        Graphics2D g=resizedImage.createGraphics();
        g.drawImage(originImage, 0,0, width,height, null);
        g.dispose();
        return resizedImage;
    }

    private BufferedImage loadImage() throws IOException {
        BufferedImage bimg= ImageIO.read(new File("rose.jpg"));
                return bimg;
    }
    private int getNewHeight(int w, int h){
        double ratio=DESIRED_WIDTH/(double)w;
        int newHeight=(int)(h*ratio);
        return newHeight;
    }
}