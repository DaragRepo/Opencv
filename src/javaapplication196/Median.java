/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication196;

import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author moh
 */
public class Median implements Filter {

    @Override
    public Mat applyFilter(Mat image) {
        Mat mat = new Mat();
        Imgproc.medianBlur(image, mat, 5);
        return mat;
    }

}
