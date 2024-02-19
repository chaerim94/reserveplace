package reserveplace.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "notification", url = "${api.url.notification}")
public interface NotificationHistoryService {
    @RequestMapping(
        method = RequestMethod.POST,
        path = "/notificationHistories"
    )
    public void notifedUsers(
        @RequestBody NotificationHistory notificationHistory
    );
}
