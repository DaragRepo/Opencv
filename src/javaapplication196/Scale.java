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
public class Scale implements Transformer {

    @Override
    public Mat transform(Mat image) {
        Mat des = new Mat();
        Imgproc.resize(image, des,new Size(image.width()*2,image.height()*2));

        return des;
    }

}
