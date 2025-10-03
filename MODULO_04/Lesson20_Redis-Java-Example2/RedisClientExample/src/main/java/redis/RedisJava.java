package redis;

import redis.clients.jedis.Jedis;

/**
 * @author josesaidolanogarcia
 */
public class RedisJava {

	public static void main(String[] args) {

	      Jedis jedis = new Jedis("localhost");
	      System.out.println("Connection to server sucessfully");
	      System.out.println("Server is running: "+jedis.ping());
	}

}
