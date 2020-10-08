package top.weidaboy.eduservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import top.weidaboy.common_utils.R;

import java.util.List;

//确认需要连接的注册服务名称，必须在nacos中有，且名字一致，要哪个服务，就添加哪个连接
//fallback 就是服务器宕机后的熔断实现方法
@FeignClient(name = "service-vod",fallback = VodFileDegradeFeignClient.class) //调用的服务名称
@Component //交给spring容器接管，防止侵入
public interface VodClient {
    //定义调用的方法路径
    //定义调用的方法路径
    //根据视频id删除阿里云视频
    //@PathVariable注解一定要指定参数名称，否则出错
    @DeleteMapping("/eduvod/video/removeAlyVideo/{id}")
    public R removeAlyVideo(@PathVariable("id") String id);

    //定义调用删除多个视频的方法
    //删除多个阿里云视频的方法
    //参数多个视频id  List videoIdList
    @DeleteMapping("/eduvod/video/delete-batch")
    public R deleteBatch(@RequestParam("videoIdList") List<String> videoIdList);

}
