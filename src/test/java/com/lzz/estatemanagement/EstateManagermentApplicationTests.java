package com.lzz.estatemanagement;

import com.lzz.estatemanagement.common.GetNowTime;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class EstateManagermentApplicationTests {

    @Test
    void contextLoads() {
        Date now = new Date();
        System.out.println(now);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat);
    }

}
