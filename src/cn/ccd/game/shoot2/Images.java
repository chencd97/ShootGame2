package cn.ccd.game.shoot2;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

/** 游戏贴图 */
public class Images {

	public static BufferedImage[] sky; // 背景
	public static BufferedImage[] bullet; // 英雄机子弹
	public static BufferedImage[] heros; // 英雄机
	public static BufferedImage[] airplanes; // 小敌机
	public static BufferedImage[] bigAirplanes; // 大敌机
	public static BufferedImage[] bees; // 空投
	public static BufferedImage start; // 游戏等待开始
	public static BufferedImage pause; // 游戏暂停
	public static BufferedImage gameOver; // 游戏结束
	public static BufferedImage[] ProtectedCover; // 英雄机保护罩
	public static BufferedImage revolveb; // 旋转子弹的图片
	public static BufferedImage bar; // 大炮的图片

	static {

		sky = new BufferedImage[6];
		for (int i = 0; i < sky.length; i++) {
			sky[i] = loadImage("bg_" + i + ".jpg");
		}

		bullet = new BufferedImage[4];
		for (int i = 0; i < bullet.length; i++) {
			bullet[i] = loadImage("bullet" + i + ".png");
		}

		heros = new BufferedImage[] { 
				loadImage("hero0.png"),
				loadImage("hero1.png") 
		};

		airplanes = new BufferedImage[4];
		for (int i = 0; i < airplanes.length; i++) {
			airplanes[i] = loadImage("airplane" + i + ".png");
		}

		bigAirplanes = new BufferedImage[3];
		for (int i = 0; i < bigAirplanes.length; i++) {
			bigAirplanes[i] = loadImage("bigplane" + i + ".png");
		}

		bees = new BufferedImage[5];
		for (int i = 0; i < bees.length; i++) {
			bees[i] = loadImage("bee_" + i + ".png");
		}

		ProtectedCover = new BufferedImage[4];
		for (int i = 0; i < ProtectedCover.length; i++) {
			ProtectedCover[i] = loadImage("clean" + i + ".png");
		}

		start = loadImage("start_1.png");
		pause = loadImage("pause_1.png");
		gameOver = loadImage("gameover_1.jpg.png");

		revolveb = loadImage("bom2.png");
		bar = loadImage("cannon.png");

	}

	public static BufferedImage loadImage(String fileName) {

		try {

			BufferedImage img = ImageIO.read(Images.class.getResource(fileName));
			return img;

		} catch (Exception e) {

			e.printStackTrace();
			throw new RuntimeException();

		}

	}

}
