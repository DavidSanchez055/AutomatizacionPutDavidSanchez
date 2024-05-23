package com.unac.apis;

import com.unac.restinteractions.RestInteractions;

public class GoRestApi {

    private static final String TOKEN = "6b2783938ff4fa138d22b6c93438f4d96e6430a29fe7027123e10f9934e51824";
    private static String pathName = "name";

    public static void setBaseUrl(String baseUrl) {
        RestInteractions.setBaseUrl(baseUrl);
    }

    public static void executionGetToken(String endPoint, String idUser){
        RestInteractions.executionGetToken(endPoint,idUser,TOKEN);
    }

    public static void validateResponse(Integer statusCode, String name) {
    RestInteractions.validatecode(statusCode);
    RestInteractions.validateDataResponse(name,pathName);
    }
}
