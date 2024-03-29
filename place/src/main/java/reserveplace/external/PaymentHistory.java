package reserveplace.external;

import java.util.Date;
import lombok.Data;

@Data
public class PaymentHistory {

    private Long payId;
    private Long orderId;
    private String usrId;
    private Double amount;
    private Date payDt;
    private String status;
}
