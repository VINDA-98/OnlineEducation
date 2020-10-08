package top.weidaboy.eduservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.util.StringUtils;
import top.weidaboy.eduservice.entity.EduTeacher;
import top.weidaboy.eduservice.mapper.EduTeacherMapper;
import top.weidaboy.eduservice.query.TeacherQuery;
import top.weidaboy.eduservice.service.EduTeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 讲师 服务实现类
 * </p>
 *
 * @author vinda
 * @since 2020-09-24
 */
@Service
public class EduTeacherServiceImpl extends ServiceImpl<EduTeacherMapper, EduTeacher> implements EduTeacherService {

//    @Override
//    public void pageQuery(Page<EduTeacher> pageParam, TeacherQuery teacherQuery) {
//
//        //新建教师查询返回结果集
//        QueryWrapper<EduTeacher> queryWrapper  = new QueryWrapper<>();
//        //设定排序方式
//        queryWrapper.orderByAsc("sort");
//        //判断
//        if(queryWrapper == null){
//            baseMapper.selectPage(pageParam,queryWrapper);
//            return;
//        }
//        String name = teacherQuery.getName();
//        Integer level = teacherQuery.getLevel();
//        String begin = teacherQuery.getBegin();
//        String end = teacherQuery.getEnd();
//
//        if (!StringUtils.isEmpty(name)) {
//            queryWrapper.like("name", name);
//        }
//
//        if (!StringUtils.isEmpty(level) ) {
//            queryWrapper.eq("level", level);
//        }
//
//        if (!StringUtils.isEmpty(begin)) {
//            queryWrapper.ge("gmt_create", begin);
//        }
//
//        if (!StringUtils.isEmpty(end)) {
//            queryWrapper.le("gmt_create", end);
//        }
//
//        baseMapper.selectPage(pageParam, queryWrapper);
//
//
//    }
}
