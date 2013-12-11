package mba.soap.exceptions;

import javax.xml.ws.WebFault;

@WebFault(faultBean = "ServiceError")
public class ValidateException extends Exception{
    private ServiceError error;

    public ValidateException() {
        super();
    }

    public ValidateException(String message) {
        super(message);
        error = new ServiceError(message);
    }

    public ValidateException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidateException(Throwable cause) {
        super(cause);
    }

    public ServiceError getError() {
        return error;
    }

    public void setError(ServiceError error) {
        this.error = error;
    }

    protected ValidateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
