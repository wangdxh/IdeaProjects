package com.wangdxh.elai.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Date;

@Component
public class myjwt {

    private static String mykey;

    @Value("${mysecuretkey}")
    public void setMysecuretkey(String mysecuretkey) {
        this.mykey = mysecuretkey;
    }

    public static <T> String sign(T object, long maxAge) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonString = mapper.writeValueAsString(object);
            return JWT.create().withExpiresAt(new Date(System.currentTimeMillis() + maxAge * 1000))
                    .withClaim("myinfo", jsonString)
                    .withIssuer("auth0")
                    .sign(Algorithm.HMAC256(mykey));

        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static <T> T unsign(String strtoken, Class<T> classT) {
        try {
            DecodedJWT decode = JWT.require(Algorithm.HMAC256(mykey)).withIssuer("auth0").build().verify(strtoken);
            String myinfo = decode.getClaim("myinfo").asString();
            if (decode.getExpiresAt().getTime() > System.currentTimeMillis() && StringUtils.isEmpty(myinfo) == false) {
                ObjectMapper objectMapper = new ObjectMapper();
                return objectMapper.readValue(myinfo, classT);
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
