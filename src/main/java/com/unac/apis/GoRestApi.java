package com.unac.apis;

import com.unac.restinteractions.RestInteractions;

public class GoRestApi {

    private static final String TOKEN = "6b2783938ff4fa138d22b6c93438f4d96e6430a29fe7027123e10f9934e51824";
    private static String pathName = "name";
    private static String pathEmail = "email";

    public static void setBaseUrl(String baseUrl) {
        RestInteractions.setBaseUrl(baseUrl);
    }

    public static void executionPutToken(String endPoint, String idUser, String name, String email){
        RestInteractions.executionPutToken(endPoint,idUser,TOKEN, name, email);
    }

    public static void validateResponse(Integer statusCode, String name, String email) {
    RestInteractions.validateCode(statusCode);
    RestInteractions.validateDataResponse(name,"name");
    RestInteractions.validateDataResponse(email, "email");
    }
}
