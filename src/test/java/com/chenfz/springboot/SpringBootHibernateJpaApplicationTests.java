package com.chenfz.springboot;

import com.chenfz.pojo.Address;
import com.chenfz.pojo.User;
import com.chenfz.pojo.resultSet.UserResult;
import com.chenfz.repository.AddressRepository;
import com.chenfz.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootHibernateJpaApplicationTests {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AddressRepository addressRepository;

    @Test
    public void contextLoads() throws Exception {
        // 创建10条记录
        userRepository.save(new User("AAA", 10));
        userRepository.save(new User("BBB", 20));
        userRepository.save(new User("CCC", 30));
        userRepository.save(new User("DDD", 40));
        userRepository.save(new User("EEE", 50));
        userRepository.save(new User("FFF", 60));
        userRepository.save(new User("GGG", 70));
        userRepository.save(new User("HHH", 80));
        userRepository.save(new User("III", 90));
        userRepository.save(new User("JJJ", 100));
        userRepository.save(new User("F123", 110));
        userRepository.save(new User("F123", 120));
        addressRepository.save(new Address(1L, "浙江"));

//        Assert.assertEquals(10,userRepository.findAll().size());
//
//        Assert.assertEquals(60,userRepository.findByName("FFF").getAge().longValue());
//
//        Assert.assertEquals(60,userRepository.findUser("FFF").getAge().longValue());
//
//        Assert.assertEquals(6,userRepository.findByNameAndAge("FFF",60).getId().longValue());
//
//
//        userRepository.delete(userRepository.findByName("FFF"));
////        userRepository.removeByName("JJJ");
//        userRepository.deleteById(2L);
//        Assert.assertEquals(8,userRepository.findAll().size());
        System.out.println(userRepository.findFirstByOrderByAgeDesc());
//
//        int page = 1,pageSize = 2;
//        Sort sort = new Sort(Sort.Direction.DESC, "id");
//        Pageable pageable = new PageRequest(page, pageSize, sort);

//        UserResult user = userRepository.findUserResultById(1L);
//        System.out.println("address:"+user.getAddress());

        Pageable pageable = new PageRequest(1, 2, new Sort(Sort.Direction.DESC, "id"));
        List<User> f = userRepository.findByNameLike("F%");
        for (User u : f) {
            System.out.println(u.getName());
        }
    }

}

