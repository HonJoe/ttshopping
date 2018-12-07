package cn.test;

import redis.clients.jedis.Jedis;

public class RedisDemo1 {

	public static void main(String[] args) {
		
		Jedis jedis=new Jedis("127.0.0.1",6739);
		
		System.out.println("connection is OK====="+jedis.ping());
		
	}
}
