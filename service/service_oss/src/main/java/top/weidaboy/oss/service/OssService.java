package top.weidaboy.oss.service;

import org.springframework.web.multipart.MultipartFile;

public interface OssService {
    public String uploadFileAvatar(MultipartFile file);
}
