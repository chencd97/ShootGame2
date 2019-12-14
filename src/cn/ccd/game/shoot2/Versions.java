package cn.ccd.game.shoot2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public interface Versions {
	public static String NUMBLE = "第5次修改_@c223i";// 修改次数

	public static final String PROJECT = "ShootGame2";// 项目名
	public static final String EDITION = "Beta";// 版本
	public static final String VERSIONS = "1.0.6";// 版本号 <<<<<< 改这里
	public static final String AUTHOR = "@c223i @Laxworld @heavenlyking";// 项目参与者
	public static final String URL = "https://c223i.github.io/ShootGame2/";// 项目地址
	public static final String COPYRIGHT = "CopyRight (C) 2019";// 版权标志

	public static final String CONTENT = "修改内容：" + 
			" 调整贴图文件位置" + 
			" 增加新的贴图文件(部分暂时还未使用)" + 
			" 修改Images.java文件,调整图片的载入方式" + 
			" 代码优化调整" + 
			"";// 这里是添加的内容

	/* 输出版本信息信息展示 */
	public static void printInfo() {

		System.out.println("[ " + PROJECT + " ] " + EDITION + "_" + VERSIONS + "\n");
		System.out.println("欢迎体验本游戏");
		System.out.println("本游戏由：" + AUTHOR + " 共同开发");
		System.out.println("开发此游戏目的只是为了代码的学习，研究和测试");
		System.out.println("在游戏中出现某些未预料的BUG属于正常现象");
		System.out.println("此版本不是最终版本，但也不代表后续会进行更新，可能随时弃坑\n");
		System.out.println("欢迎访问我们的项目地址:\n" + URL);

	}

	// 增了加一个修改的信息的保存方法
	public static void main(String[] args) {
		saveInformation();
	}

	
	
	
	
	
	
	
	
	
	public static void saveInformation() {
		try {

			FileOutputStream fos = new FileOutputStream("./src/cn/ccd/game/shoot2/editon.txt", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw, true);
			String str = "\tNUMBLE:" + NUMBLE + "。\r\n" + 
					"\tPROJECT:" 	+ PROJECT + "。\r\n" + 
					"\tEDITION:"	+ EDITION + "。\r\n" + 
					"\tVERSIONS:"	+ VERSIONS + "。\r\n" + 
					"\tAUTHOR:" 	+ AUTHOR + "。\r\n"+ 
					"\tURL:" 	+ URL + "。\r\n"+ 
					"\tCOPYRIGHT:" 	+ COPYRIGHT + "。\r\n" + 
					"\tCONTENT:\r\n\t\t" + CONTENT+ "。\r\n\r\n";
					
			FileInputStream fis = new FileInputStream("./src/cn/ccd/game/shoot2/editon.txt");
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String b = null;
			while ((b = br.readLine()) != null) {
				sb.append(b);
			}
			b = sb.toString();
			if (!(b.contains(NUMBLE))) {
				pw.println(str);
				System.out.println("创建完成");
			} else {
				System.out.println("已经创建过了");
			}
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("文件没有找到");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("输入有误");
			e.printStackTrace();
		}

	}

}
