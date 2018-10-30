/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication196;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import static org.opencv.highgui.HighGui.imshow;
import static org.opencv.highgui.HighGui.waitKey;
import org.opencv.imgcodecs.Imgcodecs;
import static org.opencv.imgcodecs.Imgcodecs.CV_LOAD_IMAGE_COLOR;
import static org.opencv.imgcodecs.Imgcodecs.IMREAD_GRAYSCALE;
import org.opencv.imgproc.Imgproc;

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
       Transformer transformer [] = {new Scale(),new Rotate()};
      new MainFrame(600, 700, "GUI", "C:\\Users\\moh\\Desktop\\opencvTut\\image.jpg",filters,transformer);
            // first.convertTo(first, CvType.CV_32FC1, 1.0 / 255.0);
     //  second.convertTo(second, CvType.CV_32FC1, 1.0 / 255.0);
  //   Imgproc.cvtColor( first, first, Imgproc.COLOR_GRAY2RGB);
     //   Imgproc.cvtColor( second, second, Imgproc.COLOR_BGRA2BGR);
       // Imgproc.cvtColor(first, first, CV_LOAD_IMAGE_COLOR);
        
        //*********************************************************************************
//        Mat first = Imgcodecs.imread("C:\\Users\\moh\\Desktop\\multimedia\\first.png");
//        Mat second = Imgcodecs.imread("C:\\Users\\moh\\Desktop\\multimedia\\second.png");
//        Mat m = new Mat();
//        Core.subtract(first, second, m);
//        imshow("test", m);
//        waitKey();
        //***********************************************************************************
//        Mat first = Imgcodecs.imread("C:\\Users\\moh\\Desktop\\multimedia\\first.png");
//        Mat second = Imgcodecs.imread("C:\\Users\\moh\\Desktop\\multimedia\\second.png");
//        Mat m = new Mat();
//        Core.add(first, second, m);
//        imshow("test", m);
//        waitKey();
//        
        
        
        
    }

}
