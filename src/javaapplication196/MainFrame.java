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
    private TransformerPanel transformerPanel;
    private static JLabel image = new JLabel("");
    private static Mat getImage;
    private static Filter filter[];
    private static Transformer transformer[];

    public MainFrame(int width, int height, String frameName, String imagePath, Filter filter[], Transformer transformer[]) throws Exception {

        super(frameName);
        getImage = ImageHelpers.openFile(imagePath);
        setImage();
        MainFrame.filter = filter;
        MainFrame.transformer = transformer;
        panel = new MyPanel();
        transformerPanel = new TransformerPanel();
        add(panel, BorderLayout.NORTH);
        add(transformerPanel,BorderLayout.PAGE_END);
        panel.add(image, BorderLayout.CENTER);
     //   image.setHorizontalAlignment(JLabel.CENTER);
        // image.setVerticalAlignment(JLabel.CENTER);
        // add(image, BorderLayout.CENTER);
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }

    public static Filter[] getFilter() {
        return MainFrame.filter;
    }

    public static Transformer[] getTransformer() {
        return MainFrame.transformer;
    }
    
    public static void setImageTransformed(Mat image , Transformer transformer) {
         MainFrame.image.setIcon(new ImageIcon(ImageHelpers.getImageTransformered(transformer, image)));;
    }
    

    public static Mat getImage() {
        return getImage;
    }

    public static void setImage() {
        image.setIcon(new ImageIcon(ImageHelpers.getImage(getImage)));
    }

    public static void setImageFiltered(Mat image, Filter filter) {
        MainFrame.image.setIcon(new ImageIcon(ImageHelpers.getImageFiltered(filter, image)));
    }

}
