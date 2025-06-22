package stock.mainserver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;

import java.util.Arrays;

@SpringBootTest
class MainserverApplicationTests {

    @Autowired
    Environment env;

    @Test
    void contextLoads() {
        System.out.println(">>> active profile: " + Arrays.toString(env.getActiveProfiles()));

    }

}
