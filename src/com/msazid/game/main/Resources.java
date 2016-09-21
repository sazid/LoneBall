package com.msazid.game.main;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Resources {
	
	public static BufferedImage welcomeImage, iconImage, line;
	public static AudioClip hit, bounce;
	public static Color darkBlue, darkRed;
	
	public static void load() {
		welcomeImage = loadImage("welcome.png");
		iconImage = loadImage("iconimage.png");
		line = loadImage("line.png");
		hit = loadSound("hit.wav");
		bounce = loadSound("bounce.wav");
		darkBlue = new Color(25, 83, 105);
		darkRed = new Color(105, 13, 13);
	}
	
	private static AudioClip loadSound(String fileName) {
		URL fileUrl = Resources.class.getResource("/resources/" + fileName);
		return Applet.newAudioClip(fileUrl);
	}
	
	private static BufferedImage loadImage(String fileName) {
		BufferedImage img = null;
		try {
			img = ImageIO.read(Resources.class.getResource("/resources/" + fileName));
		} catch (IOException e) {
			System.out.println("Error while reading: " + fileName);
			e.printStackTrace();
		}
		return img;
	}
	
}
