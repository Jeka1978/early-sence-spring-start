package quoter;

import lombok.Setter;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Evegeny on 17/11/2016.
 */
@Setter
public class ShakespearQuoter implements Quoter {

    private String message;
    @InjectRandom(min =3, max = 5)
    private int repeat;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
