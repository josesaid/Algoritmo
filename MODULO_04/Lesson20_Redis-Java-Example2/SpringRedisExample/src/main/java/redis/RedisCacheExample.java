package redis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author josesaidolanogarcia
 */
public class RedisCacheExample {

    public static void main(String[] args) {

        System.out.println("Java version: " + System.getProperty("java.version"));

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MusicService musicService = ctx.getBean(MusicService.class);

        System.out.println("message: " + musicService.play("trumpet"));
        System.out.println("message: " + musicService.play("trumpet"));
        System.out.println("message: " + musicService.play("guitar"));
        System.out.println("message: " + musicService.play("guitar"));


        System.out.println("Done.");
    }

}