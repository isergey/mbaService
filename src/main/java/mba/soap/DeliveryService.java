package mba.soap;

import mba.soap.entity.DeliveryTransaction;
import mba.soap.filters.Pagination;
import mba.soap.filters.SimpleFilter;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Сервис доставки документа
 */
//@WebService
public class DeliveryService {
    /**
     * Произвести заказ
     * @param sender отправитель
     * @param receiver получатель
     * @param bibRecord баб запись
     * @param comments комментарии к заказу
     * @return Идентификатор транзакции
     */
    public String makeOrder(String sender, String receiver, String bibRecord, String comments){
        return "transactionId";
    }

    /**
     * Получить список заказаов
     * @param sender отправитель
     * @param filter условия фильтрации (не обязательно)
     * @param pagination пагинация по результатам (не обязательно)
     * @return Список заказов
     */
    public List<DeliveryTransaction> getOrders(String sender, @XmlElement(required = false) SimpleFilter filter, @XmlElement(required = false) Pagination pagination){
        return new ArrayList<DeliveryTransaction>();
    }
}
