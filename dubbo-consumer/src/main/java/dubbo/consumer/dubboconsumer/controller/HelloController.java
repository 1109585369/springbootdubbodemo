package dubbo.consumer.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.HelloService;

/**
 * @author yy
 * @ProjectName springbootdubbodemo
 * @Description: TODO
 * @date 2018/12/7 10:43
 */

@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("hello")
    public String sayHello(@RequestParam("sayData") String sayData){
        return helloService.sayHello(sayData);
    }

}
