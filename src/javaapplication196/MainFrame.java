/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication196;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import static org.opencv.imgcodecs.Imgcodecs.CV_LOAD_IMAGE_COLOR;
import static org.opencv.imgcodecs.Imgcodecs.IMREAD_GRAYSCALE;

/**
 *
 * @author moh
 */
public class MainFrame extends JFrame {

    private MyPanel panel;
    private static JLabel image = new JLabel("");
    private static Mat getImage; 

    public MainFrame(int width, int height, String frameName, String imagePath, int flag) throws Exception {

        super(frameName);
        getImage = ImageHelpers.openFile(imagePath, flag);
        image.setIcon(new ImageIcon(ImageHelpers.getImage(getImage))); 
        panel = new MyPanel();
        add(panel, BorderLayout.WEST);
        add(image, BorderLayout.CENTER);
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }

    public static Mat getImage() {
        return getImage;
    }

    public static void setImage(Mat image,Filter filter) {
      MainFrame.image.setIcon(new ImageIcon(ImageHelpers.getImageFiltered(filter, image))); 
      //  MainFrame.image.setIcon(new ImageIcon(loadedImage)); 
    }

   

 

}
