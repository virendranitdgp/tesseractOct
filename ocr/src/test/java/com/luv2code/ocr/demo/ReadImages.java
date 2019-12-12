package com.luv2code.ocr.demo;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadImages {
	public static void main(String[] args) throws TesseractException {

		File imageFile = new File("/home/virendra/eclipse-workspace/ocr/resources/def.tiff");
		Tesseract instance = new Tesseract();
		instance.setDatapath("/home/virendra/eclipse-workspace/ocr/tessdata");
		String result = instance.doOCR(imageFile);
		System.out.println(result);
	}
}
