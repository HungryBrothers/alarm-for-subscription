package com.hungrybrothers.alarmforsubscription.common;

public class Const {
    public static final String API_SIGN = "/api/sign";
    public static final String API_SUBSCRIPTION = "/api/subscriptions";
    public static final String ERROR_URL = "/error";

    public static final long TIMEOUT = 30L;

    public static final String ERROR_MESSAGE_AUTHENTICATION_FAIL = "아이디와 비밀번호를 확인해주세요";

    public static final String LOG_MESSAGE_TOKEN_INVALID = "The token is invalid";
    public static final String LOG_MESSAGE_TOKEN_EXPIRED = "The token is expired";

    public static final String MAIL_SUBJECT = "[DO-NOT-FORGET] 이메일 인증 코드입니다.";
    public static final String MAIL_TEXT = "이메일 인증 코드는 '%s' 입니다.";
    public static final int MAIL_CODE_LENGTH = 6;
}
