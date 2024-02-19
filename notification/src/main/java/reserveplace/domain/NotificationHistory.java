package reserveplace.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import reserveplace.NotificationApplication;
import reserveplace.domain.Notified;

@Entity
@Table(name = "NotificationHistory_table")
@Data
//<<< DDD / Aggregate Root
public class NotificationHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long notiId;

    private Long orderId;

    private String usrId;

    private String msg;

    private Date sendDt;

    @PostPersist
    public void onPostPersist() {
        Notified notified = new Notified(this);
        notified.publishAfterCommit();
    }

    public static NotificationHistoryRepository repository() {
        NotificationHistoryRepository notificationHistoryRepository = NotificationApplication.applicationContext.getBean(
            NotificationHistoryRepository.class
        );
        return notificationHistoryRepository;
    }
}
//>>> DDD / Aggregate Root
