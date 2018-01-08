package cn.summerwaves.regex;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FiltrateTest {
    private static final Logger logger = LoggerFactory.getLogger(FiltrateTest.class);

    @Test
    public void getMatch() {
        logger.info("{}",Filtrate.getMatch());

    }

    @Test
    public void txt2String() {
        System.out.println(Filtrate.txt2String());
    }

    @Test
    public void slf4jTest() {
        logger.info("测试1:{}，测试");
    }
}