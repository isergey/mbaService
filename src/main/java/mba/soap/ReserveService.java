package mba.soap;

import mba.soap.entity.ReserveTransaction;
import mba.soap.filters.Pagination;
import mba.soap.filters.SimpleFilter;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Сервис бронирования документа
 */
//@WebService
public class ReserveService {
    /**
     *
     * @param sender Отправитель
     * @param receiver Получатель
     * @param bibRecord Биб запись документа
     * @param comments Комментарии
     * @return Идентификатор транзакции
     */
    public String reserve(String sender, String receiver, String bibRecord, String comments){
        return "transactionId";
    }

    /**
     * Получить список заказаов
     * @param sender отправитель
     * @param filters условия фильтрации (не обязательно)
     * @param pagination пагинация по результатам (не обязательно)
     * @return Список заказов
     */
    public List<ReserveTransaction> getOrders(String sender,@XmlElement(required = false) List<SimpleFilter> filters, @XmlElement(required = false)Pagination pagination){
        return new ArrayList<ReserveTransaction>();
    }
}
