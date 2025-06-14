package main;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import main.Player.PlayerRace;

public class CIDialog extends JPanel {
    static private int COLS = 2;
    static private int ROWS = 3;
    JTextField name = new JTextField();
    JSpinner spin = new JSpinner();
    JComboBox<PlayerRace> race = new JComboBox<>(PlayerRace.values());

    public CIDialog() {
        super();
        setLayout(new GridLayout(ROWS, COLS));
        setBorder(new EmptyBorder(10, 10, 10, 10));
        add(new JLabel("Name:"));
        add(name);
        add(new JLabel("Age:"));
        add(spin);
        add(new JLabel("Race:"));
        add(race);
        setMinimumSize(new Dimension(100, 100));
    }

    public String getCharName() {
        return name.getText();
    }

    public int getAge() {
        return (int) spin.getValue();
    }

    public PlayerRace getRace() {
        return (PlayerRace) race.getSelectedItem();
    }
}
