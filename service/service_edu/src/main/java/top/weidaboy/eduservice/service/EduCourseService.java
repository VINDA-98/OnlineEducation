package top.weidaboy.eduservice.service;

import top.weidaboy.eduservice.entity.EduCourse;
import com.baomidou.mybatisplus.extension.service.IService;
import top.weidaboy.eduservice.entity.vo.CourseInfoVo;
import top.weidaboy.eduservice.entity.vo.CoursePublishVo;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author vinda
 * @since 2020-09-28
 */
public interface EduCourseService extends IService<EduCourse> {

    //添加课程基本信息的方法
    String saveCourseInfo(CourseInfoVo courseInfoVo);

    //根据课程id查询课程基本信息
    CourseInfoVo getCourseInfo(String courseId);

    //修改课程信息
    void updateCourseInfo(CourseInfoVo courseInfoVo);

    //根据课程id查询课程确认信息
    CoursePublishVo publishCourseInfo(String id);

    //删除课程
    void removeCourse(String courseId);
}
