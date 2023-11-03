package org.apache.coyote.http11.exception.base;

import org.apache.coyote.http11.exception.ErrorCode;

public class BaseRuntimeException extends RuntimeException {
    private final ErrorCode errorCode;

    public BaseRuntimeException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public BaseRuntimeException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
