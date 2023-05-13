package mall.domain;

import java.util.Date;
import lombok.Data;
import mall.domain.*;
import mall.infra.AbstractEvent;

@Data
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String productId;
    private String productName;
    private Integer qty;
    private String customerId;
    private String status;

    public OrderCanceled(Order aggregate) {
        super(aggregate);
    }

    public OrderCanceled() {
        super();
    }
    // keep

}
