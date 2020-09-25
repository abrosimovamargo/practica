package ru.ssau.tk.abrosimovamargo.practice.Puzzle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PuzzleButton extends JButton {
    public PuzzleButton(){
        super();
        initUI();
    }
    public PuzzleButton(Image i){
        super(new ImageIcon(i));
        initUI();
    }
    private void initUI(){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.green));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.gray));
            }
        });
    }
}
