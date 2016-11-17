package quoter;

import lombok.Setter;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Evegeny on 17/11/2016.
 */
@Setter
public class TalkingRobot {
    private List<Quoter> qouters;

    @Scheduled(cron = "1/2 * * * * ?")
    public void talk(){
        qouters.forEach(Quoter::sayQuote);
    }
}
