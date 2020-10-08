package top.weidaboy.servicebase.handler;

import lombok.extern.slf4j.Slf4j;
import top.weidaboy.common_utils.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//统一异常类处理
@ControllerAdvice
@Slf4j      //添加统一日志
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e){
        e.printStackTrace();
        return R.error();
    }

    //处理特定异常
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public R error(ArithmeticException e){
        e.printStackTrace();
        return R.error().message("执行了自定义异常");
    }

    //自定义异常类，需要的是GuliException类
    @ExceptionHandler(GuliException.class)
    @ResponseBody
    public R error(GuliException e){
        log.error(e.getMessage()); //写入到log文件中
        e.printStackTrace();
        return R.error().message(e.getMsg()).code(e.getCode());
    }

}
