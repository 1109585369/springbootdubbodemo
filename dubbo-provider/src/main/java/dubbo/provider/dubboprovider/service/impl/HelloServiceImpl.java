package dubbo.provider.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import service.HelloService;

/**
 * @author yy
 * @ProjectName springbootdubbodemo
 * @Description: TODO
 * @date 2018/12/7 10:28
 */

@Component
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name;
    }
}
