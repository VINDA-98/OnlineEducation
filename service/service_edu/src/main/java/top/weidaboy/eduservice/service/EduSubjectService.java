package top.weidaboy.eduservice.service;

import org.springframework.web.multipart.MultipartFile;
import top.weidaboy.eduservice.entity.EduSubject;
import com.baomidou.mybatisplus.extension.service.IService;
import top.weidaboy.eduservice.entity.subject.OneSubject;

import java.util.List;

/**
 * <p>
 * 课程科目 服务类
 * </p>
 *
 * @author vinda
 * @since 2020-09-27
 */
public interface EduSubjectService extends IService<EduSubject> {

    void saveSubject(MultipartFile file, EduSubjectService subjectService);
    //课程分类列表（树形）
    List<OneSubject> getAllOneTwoSubject();
}
