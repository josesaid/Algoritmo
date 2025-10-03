package redis;

import redis.clients.jedis.Jedis;

/**
 * @author josesaidolanogarcia
 */
public class RedisStringJava {

	public static void main(String[] args) {
	      Jedis jedis = new Jedis("localhost");
	      System.out.println("Connection to server sucessfully");

	      jedis.set("w3ckey", "Redis tutorial");
		  jedis.set("algo", "said was here!");
          jedis.set("nombre-novela", "Salome!");

	     System.out.println("Stored string in redis:: "+ jedis.get("w3ckey"));
		System.out.println("Stored string in redis:: "+ jedis.get("algo").toUpperCase());
        System.out.println("Stored string in redis:: "+ jedis.get("nombre-novela").toUpperCase());
	}

}
