package com.real.icrement.paymenthmac;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class TestMain {
	
	;

	

	    public static String generateHmac(String jsonInput, String secretKey) {
	        try {
	            Mac hmacSha256 = Mac.getInstance("HmacSHA256");
	            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(), "HmacSHA256");
	            hmacSha256.init(secretKeySpec);
	            byte[] hmacBytes = hmacSha256.doFinal(jsonInput.getBytes());
	            return Base64.getEncoder().encodeToString(hmacBytes);
	        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
	            e.printStackTrace();
	            return null;
	        }
	    }

	    public static void main(String[] args) {
	        String jsonInput = "{\"key1\": \"value1\", \"key2\": \"value2\"}";
	        String secretKey = "THIS IS MY SECRET";

	        String hmacSignature = generateHmac(jsonInput, secretKey);
	        System.out.println("HMAC Signature: " + hmacSignature);
	    }
	}



