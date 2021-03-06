package quoter;

import lombok.Setter;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

/**
 * Created by Evegeny on 17/11/2016.
 */
@Setter
public class TerminatorQuoter implements Quoter {
    private List<String> messages;

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }
}
