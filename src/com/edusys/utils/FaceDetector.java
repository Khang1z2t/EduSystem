package com.edusys.utils;

import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

import java.io.IOException;

public class FaceDetector {
    private CascadeClassifier faceDetector;

    public FaceDetector() {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        faceDetector = new CascadeClassifier();
        faceDetector.load("data/haarcascades/haarcascade_frontalface_default.xml");
    }

    public Mat detectFace(String imgPath) {
        Mat img = Imgcodecs.imread(imgPath);
        MatOfRect faceDetections = new MatOfRect();
        faceDetector.detectMultiScale(img, faceDetections);

        for (Rect rect : faceDetections.toArray()) {
            Imgproc.rectangle(img, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(0, 255, 0));
        }

        return img;
    }

    public byte[] matToBytes(Mat image) throws IOException {
        MatOfByte matOfByte = new MatOfByte();
        Imgcodecs.imencode(".jpg", image, matOfByte);
        return matOfByte.toArray();
    }
}
