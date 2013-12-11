package mba.soap;

import mba.soap.entity.CopyTransaction;
import mba.soap.exceptions.ValidateException;
import mba.soap.filters.Pagination;
import mba.soap.filters.SimpleFilter;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Сервис доставки копии документа(части документа)
 */
@WebService
public class CopyService {
    /**
     * Оформить заказ на копирование
     * @param sender Отправитель заказа
     * @param receiver Получатель заказа
     * @param getCopyPlace Место получения копии
     * @param copyInfo Информация о копировании (номера страниц, частей итд)
     * @param comments Комментарии
     * @return Идентификатор транзакции
     */
    @WebMethod
    public String makeOrder(String sender, String receiver, String getCopyPlace, String copyInfo, String comments){
        return "transactionId";
    }

    @WebMethod
    public List<CopyTransaction> getOrders(String sender, List<SimpleFilter> filters, Pagination pagination){
        System.out.println(sender);
        List<CopyTransaction> orders = new ArrayList<CopyTransaction>();
        CopyTransaction ct = new CopyTransaction();
        ct.setComments("123344");
        orders.add(ct);
        return orders;
    }
}
