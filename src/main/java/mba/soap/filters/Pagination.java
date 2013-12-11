package mba.soap.filters;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.io.Serializable;

/**
 * Пагинация для длинных результатов
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Pagination implements Serializable{
    /**
     * отступ от начала выборки (начияна с 0)
     */
    private int offset;
    /**
     * Лимит выборки
     */
    private int limit;
    /**
     * Общее количество объектов, доступных для выборки
     */
    private int total;

    public Pagination(){

    }
    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
