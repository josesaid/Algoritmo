package redis;

import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class RedisKeyJava {

	public static void main(String[] args) {
	      Jedis jedis = new Jedis("localhost");
	      System.out.println("Connection to server sucessfully");

	     Set<String> list = jedis.keys("*");
	     for(int i=0; i<list.size(); i++) {
	       System.out.println("List of stored keys:: "+list.size());
             list.forEach(System.out::println);
	     }

	}

}
