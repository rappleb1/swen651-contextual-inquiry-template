package main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Runner {
public static void main(String[] args) {
    Player p = new Player();
    JPanel buttonBar = new JPanel();
    JButton add = new JButton("Done");
    JButton cancel = new JButton("Cancel");
    buttonBar.add(cancel);
    buttonBar.add(add);
    CIDialog d = new CIDialog();
    JFrame f = new JFrame("Create Character");
    f.setLayout(new BorderLayout());
    f.add(d, BorderLayout.CENTER);
    f.add(buttonBar, BorderLayout.SOUTH);
    f.setVisible(true);
    f.setMinimumSize(new Dimension(500, 200));
    add.addActionListener(new ActionListener() {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            f.setVisible(false);
            p.setCharName(d.getCharName());
            p.setAge(d.getAge());
            p.setRace(d.getRace());
            
            JOptionPane.showMessageDialog(f, String.format("Welcome %s the %d year-old %s!", p.getCharName(), p.getAge(), p.getRace()));
            System.exit(0);
        }
    });
    
    cancel.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            f.setVisible(false);
            JOptionPane.showMessageDialog(f, "Canceled");
            System.exit(0);
        }
    });
}
}
