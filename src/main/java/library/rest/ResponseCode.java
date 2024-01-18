package library.rest;

public enum ResponseCode {
    SUCCESS("200"),
    WARNING("1000"),
    ERROR("1001"),
    MEMBER_NOT_FOUND("1002"),
    INVALID_OTP("1003"),
    CAPTCHA_REQUIRED("1005"),
    MISSING_INPUT("1006"),
    INVALID_OTP_ID("1007"),
    OTP_IS_NOT_EXIST("1008"),
    PASSWORD_TRY_LIMIT_EXCEEDED("1009"),
    PASSWORD_LOCKED("1010"),
    PASSWORD_IS_EXIST("1011"),
    MEMBER_ALREADY_EXIST("1012");

    private final String value;

    public String getValue() {
        return value;
    }

    ResponseCode(String value) {
        this.value = value;
    }
}