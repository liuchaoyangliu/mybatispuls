package com.zut.lcy.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zut.lcy.mybatisplus.entity.Student;
import com.zut.lcy.mybatisplus.mapper.StudentMapper;
import com.zut.lcy.mybatisplus.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lcy
 * @since 2019-12-17
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
