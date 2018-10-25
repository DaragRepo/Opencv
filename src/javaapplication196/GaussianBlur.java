/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication196;

import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author moh
 */
public class GaussianBlur implements Filter {

    @Override
    public Mat applyFilter(Mat image) {
        Mat mat = new Mat();
        Imgproc.GaussianBlur(image, mat, new Size(3.0, 3.0), 17);
        return mat;
    }

}
