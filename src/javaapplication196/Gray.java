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
public class Gray implements Filter {

    @Override
    public Mat applyFilter(Mat src) {

        Mat des = new Mat();
        Imgproc.cvtColor(src, des, Imgproc.COLOR_RGB2GRAY);

        return des;
    }

}
