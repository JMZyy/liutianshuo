//package edu.czjt.reggie.config;
//
//
//import edu.czjt.reggie.entity.Employee;
//
//import edu.czjt.reggie.entity.User;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//
//
//import java.io.Serializable;
//import java.net.UnknownHostException;
//
//@Configuration
//public class MyConfig {
//
//
//
//
//
//    //配置redis,将实体类User转换为json格式，保存到redis中
//    @Bean
//    public RedisTemplate<Object, User> MyTemplate(RedisConnectionFactory redisConnectionFactory)
//            throws UnknownHostException {
//        // 这里自定义序列化类型
//        RedisTemplate<Object, User> template = new RedisTemplate<>();
//        //用于链接redis数据库
//        template.setConnectionFactory(redisConnectionFactory);
//        // 需要对实体类创建一个序列化，传入的User.class表示为要序列化的实体类类型为user
//        Jackson2JsonRedisSerializer<User> ser = new Jackson2JsonRedisSerializer<>(User.class);
//        //将实体类user保存到redis中，惊奇序列化转换为json格式。
//        template.setDefaultSerializer(ser);
//        return template;
//    }
//
//    @Bean
//    public RedisTemplate<String, Serializable> redisTemplate(LettuceConnectionFactory connectionFactory){
//        RedisTemplate<String, Serializable> template = new RedisTemplate<>();
//        template.setConnectionFactory(connectionFactory);
//        // 设置key和value的序列化 预防乱码
//        template.setKeySerializer(new StringRedisSerializer());
//        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
//        return template;
//    }
//}
