package kr.hs.study;

import kr.hs.study.beans.Music;
import kr.hs.study.beans.jpop;
import kr.hs.study.beans.kpop;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Music music1 = ctx.getBean("m1", Music.class);
        music1.sound();

        Music music2 = ctx.getBean("m2", Music.class);
        music2.sound();
        ctx.close();
    }
}