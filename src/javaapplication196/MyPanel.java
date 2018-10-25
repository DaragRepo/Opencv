/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication196;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import org.opencv.core.Mat;

/**
 *
 * @author moh
 */
public class MyPanel extends JPanel {

    private JLabel label;
    private JRadioButton buttons[] = new JRadioButton[4];
    public ButtonGroup buttonGroup;
    private final String filters[] = {"None","Blur", "GaussianBlur", "Median"};
    private final Filter filter [] = {new GaussianBlur(),new Blur(),new Median()};

    public MyPanel() {

        //   setLayout(new FlowLayout());
        label = new JLabel("Filter:");
        buttonGroup = new ButtonGroup();
        add(label);
        addRadioButtons();
        //  System.out.println(buttons[0].getSelectedIcon());
        //add(buttons[]);
    }

    public void addRadioButtons() {
        for (int i = 0; i < filters.length; i++) {
            buttons[i] = new JRadioButton(filters[i]);
            buttons[i].setFocusable(false);
            buttonGroup.add(buttons[i]);
            add(buttons[i]);
            buttons[i].addItemListener(new MyItemListener());
        }
    }

    public String getSelectedButton() {
        String selected = "";
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i].isSelected()) {
                selected += buttons[i].getText();
            }
        }
        return selected;
    }

    private class MyItemListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                String buttonChecked = getSelectedButton();
                if (buttonChecked.equals("None")) {
                    
                } else {
                for (int i = 0 ; i < filter.length ; i++) {
                    if (buttonChecked.equals(filter[i].getClass().getSimpleName())) {
                    Mat img = MainFrame.getImage();
                  //  Mat newImage =filter[1].applyFilter(img);
                    MainFrame.setImage(img,filter[i]);
                    }
                }
                }
            }
        }

    }

}
