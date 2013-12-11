package mba.soap.entity;

import java.util.Date;

public class TransactionStatus {
    /**
     * Код статуса
     */
    private String statusCode;
    /**
     * Расшифровка статуса
     */
    private String statusTitle;
    /**
     * Сообщение
     */
    private String message;
    /**
     * Время изменения статуса транзакции
     */
    private Date changeStatusDateTime;


    public TransactionStatus() {
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusTitle() {
        return statusTitle;
    }

    public void setStatusTitle(String statusTitle) {
        this.statusTitle = statusTitle;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getChangeStatusDateTime() {
        return changeStatusDateTime;
    }

    public void setChangeStatusDateTime(Date changeStatusDateTime) {
        this.changeStatusDateTime = changeStatusDateTime;
    }
}
