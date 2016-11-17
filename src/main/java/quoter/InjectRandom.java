package quoter;/**
 * Created by Evegeny on 17/11/2016.
 */

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
public @interface InjectRandom {
    int min();
    int max();
}
