/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication196;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import static org.opencv.imgcodecs.Imgcodecs.IMREAD_GRAYSCALE;

/**
 *
 * @author moh
 */
public class JavaApplication196 {

    // public  String className = this.getClass().getSimpleName();
    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       Filter filters[] = { new GaussianBlur(), new Blur(), new Median(), new Gray(), new HistogramEqualization() };
      new MainFrame(600, 400, "GUI", "C:\\Users\\moh\\Desktop\\opencvTut\\image.jpg",filters);

    }

}
