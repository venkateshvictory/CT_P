package com.real.icrement.utils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class HmacSha256Utils {

public  static  String 	geneteSignature(String secretKey,String jsonInput) {

	// String jsonInput = "{\"key1\": \"value1\", \"key2\": \"value2\"}";
	// String secretKey = "THIS IS MY SECRET";
	// String hmacSignature = generateHmac(jsonInput, secretKey);
	// System.out.println("HMAC Signature: " + hmacSignature);

	 

		try {
			String singnature=null;
			Mac hmacSha256 = Mac.getInstance("HmacSHA256");
			SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(), "HmacSHA256");
			hmacSha256.init(secretKeySpec);
			byte[] hmacBytes = hmacSha256.doFinal(jsonInput.getBytes());
			
			
			singnature=Base64.getEncoder().encodeToString(hmacBytes);
			System.out.println("HMAC Signature: " + singnature);
			return singnature;
			
		} catch (NoSuchAlgorithmException | InvalidKeyException e) {
			e.printStackTrace();
			return null;
		}

	}
}
