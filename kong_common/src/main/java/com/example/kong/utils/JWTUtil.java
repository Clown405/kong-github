//package com.example.kong.utils;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//import javax.crypto.Mac;
//import javax.crypto.spec.SecretKeySpec;
//import java.security.Key;
//import java.util.Base64;
//
//public class JWTUtil {
//
//    private static final String SECRET = "your_secret_key_here"; // 替换为你的密钥
//    private static final Key KEY = Keys.hmacShaKeyFor(SECRET.getBytes());
//
//    public static String generateToken(String keyId, String date) {
//        String signature = Base64.getEncoder().encodeToString(hmacSha256(keyId + "\n" + date, SECRET));
//        return Jwts.builder()
//                .claim("keyId", keyId)
//                .claim("date", date)
//                .signWith(KEY, SignatureAlgorithm.HS256)
//                .headerParam("signature", signature)
//                .compact();
//    }
//
//    public static boolean verifyToken(String token) {
//        try {
//            Claims claims = Jwts.parserBuilder()
//                    .setSigningKey(KEY)
//                    .build()
//                    .parseClaimsJws(token)
//                    .getBody();
//
//            String keyId = (String) claims.get("keyId");
//            String date = (String) claims.get("date");
//            String signature = (String) claims.getHeader().get("signature");
//            String expectedSignature = Base64.getEncoder().encodeToString(hmacSha256(keyId + "\n" + date, SECRET));
//
//            return signature.equals(expectedSignature);
//        } catch (Exception e) {
//            // Token验证失败
//            return false;
//        }
//    }
//
//    private static byte[] hmacSha256(String data, String key) {
//        try {
//            Mac mac = Mac.getInstance("HmacSHA256");
//            SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "HmacSHA256");
//            mac.init(secretKey);
//            return mac.doFinal(data.getBytes());
//        } catch (Exception e) {
//            // 处理异常
//            return null;
//        }
//    }
//}
