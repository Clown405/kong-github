package com.example.kong.utils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class SignatureUtil {

//    public static String hmacSha256(String data, String secret) {
//        try {
//            Mac mac = Mac.getInstance("HmacSHA256");
//            SecretKeySpec secretKey = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
//            mac.init(secretKey);
//            byte[] hmacData = mac.doFinal(data.getBytes());
//            return Base64.getEncoder().encodeToString(hmacData);
//        } catch (Exception e) {
//            // 处理异常
//            return null;
//        }
//    }

}
