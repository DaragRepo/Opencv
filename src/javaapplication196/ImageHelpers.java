/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication196;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import static org.opencv.imgcodecs.Imgcodecs.CV_LOAD_IMAGE_COLOR;
import static org.opencv.imgcodecs.Imgcodecs.IMREAD_GRAYSCALE;

/**
 *
 * @author moh
 */
public class ImageHelpers {

    public static Image toBufferedImage(Mat matrix) {
        int type = BufferedImage.TYPE_BYTE_GRAY;
        if (matrix.channels() > 1) {
            type = BufferedImage.TYPE_3BYTE_BGR;
        }
        int bufferSize = matrix.channels() * matrix.cols() * matrix.rows();
        byte[] buffer = new byte[bufferSize];
        matrix.get(0, 0, buffer); // get all the pixels
        BufferedImage image = new BufferedImage(matrix.cols(), matrix.
                rows(), type);
        final byte[] targetPixels = ((DataBufferByte) image.getRaster().
                getDataBuffer()).getData();
        System.arraycopy(buffer, 0, targetPixels, 0, buffer.length);

        return image;
    }

    public static Mat openFile(String fileName) throws Exception {

        Mat newImage = Imgcodecs.imread(fileName);
        if (newImage.dataAddr() == 0) {
            throw new Exception("Couldn't open file " + fileName);
        }
        return newImage;
    }

    public static Image getImageFiltered(Filter filter, Mat image) {
        Mat img = filter.applyFilter(image);
        Image loadedImage = toBufferedImage(img);
        return loadedImage;
    }

    public static Image getImageTransformered(Transformer transformer, Mat image) {
        Mat img = transformer.transform(image);
        Image loadedImage = toBufferedImage(img);
        return loadedImage;
    }
    
    public static Image getImage(Mat image) {
        Image loadedImage = toBufferedImage(image);
        return loadedImage;
    }

}
