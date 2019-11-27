package com.gaze.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class MD5Util {
	public static String getMd5(String plainText) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(plainText.getBytes());
			byte b[] = md.digest();

			int i;

			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			// 32λ
			// return buf.toString();
			// 16λ
			// return buf.toString().substring(0, 16);
			
			return buf.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}

	}
	public static String getMd5(String plainText,int length) {
		return getMd5(plainText).substring(0, length);
	}

	public static int getRandomCode(){		
		int max=9999;
        int min=1111;
        Random random = new Random();
        return random.nextInt(max)%(max-min+1) + min;		
	}
	public static void main(String[] args) {
//		System.out.println(getRandomCode());
//		System.out.println(MD5Utils.getMd5("123456",6));
		System.out.println(MD5Util.getMd5("123456"));
		
	}
}
