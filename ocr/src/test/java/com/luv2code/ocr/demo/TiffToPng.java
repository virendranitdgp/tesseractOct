package com.luv2code.ocr.demo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class TiffToPng {
	public static void main(String[] args) throws IOException {
		BufferedImage tif;
		try {
			tif = ImageIO.read(new File("/home/virendra/Downloads/def.tiff"));
			ImageIO.write(tif, "png", new File("/home/virendra/Downloads/mno.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
