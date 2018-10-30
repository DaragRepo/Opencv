/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication196;

import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author moh
 */
public class Translate implements Transformer {

    @Override
    public Mat transform(Mat image) {
        Mat des = new Mat();
        Imgproc.warpAffine(image, des, Imgproc.getRotationMatrix2D(new Point(image.width() / 2, image.height() / 2), 180, 2), new Size(image.width(), image.height()));

        return des;
    }

}
