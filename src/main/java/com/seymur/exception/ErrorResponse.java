package com.seymur.exception;

/**
 * Created by Seymur on 6/5/2018.
 */
public class ErrorResponse {
    private int errorCode;
    private String message;
    private long timestamp;


    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorResponse(int errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorResponse() {
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "errorCode=" + errorCode +
                ", message='" + message + '\'' +
                '}';
    }
}
