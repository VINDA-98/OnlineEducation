package top.weidaboy.eduservice.client;

import org.springframework.stereotype.Component;
import top.weidaboy.common_utils.R;

import java.util.List;

@Component
public class VodFileDegradeFeignClient implements VodClient{

    @Override
    public R removeAlyVideo(String id) {
        return R.error().message("删除视频出错了");
    }

    @Override
    public R deleteBatch(List<String> videoIdList) {
        return R.error().message("删除视频出错了");
    }
}
