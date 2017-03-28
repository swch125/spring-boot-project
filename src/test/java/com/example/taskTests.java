package com.example;

import com.Starter;
import com.schedule.TestTasks;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Eric.sun on 2017/3/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Starter.class)
public class taskTests {

    @Autowired
    private TestTasks task;

    @Test
    public void test() throws Exception {
        task.doTaskOne();
        task.doTaskTwo();
        task.doTaskThree();
    }
}
