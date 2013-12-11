package mba.soap.entity;

import java.util.Date;
import java.util.List;

public class CopyTransaction {
    /**
     * Отправитель
     */
    private String sender;
    /**
     * Получатель
     */
    private String receiver;
    /**
     * Биб запись
     */
    private String bibRecord;
    /**
     * Место получения копии
     */
    private String getCopyPlace;
    /**
     * Информация о копировании (номера страниц, частей итд)
     */
    private String copyInfo;
    /**
     * Комментарии
     */
    private String comments;
    /**
     * Дата и время создания транзакции
     */
    private Date createDateTime;
    /**
     * Время последнего изменения транзакции
     */
    private Date lastTransactionStatusDateTime;

    /**
     * Список статусов транзакции
     */
    private List<TransactionStatus> transactionStatuses;

    public CopyTransaction() {
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getBibRecord() {
        return bibRecord;
    }

    public void setBibRecord(String bibRecord) {
        this.bibRecord = bibRecord;
    }

    public String getGetCopyPlace() {
        return getCopyPlace;
    }

    public void setGetCopyPlace(String getCopyPlace) {
        this.getCopyPlace = getCopyPlace;
    }

    public String getCopyInfo() {
        return copyInfo;
    }

    public void setCopyInfo(String copyInfo) {
        this.copyInfo = copyInfo;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Date getLastTransactionStatusDateTime() {
        return lastTransactionStatusDateTime;
    }

    public void setLastTransactionStatusDateTime(Date lastTransactionStatusDateTime) {
        this.lastTransactionStatusDateTime = lastTransactionStatusDateTime;
    }

    public List<TransactionStatus> getTransactionStatuses() {
        return transactionStatuses;
    }

    public void setTransactionStatuses(List<TransactionStatus> transactionStatuses) {
        this.transactionStatuses = transactionStatuses;
    }
}
