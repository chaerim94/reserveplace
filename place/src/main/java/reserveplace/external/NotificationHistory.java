package reserveplace.external;

import java.util.Date;
import lombok.Data;

@Data
public class NotificationHistory {

    private Long notiId;
    private Long orderId;
    private String usrId;
    private String msg;
    private Date sendDt;
}
