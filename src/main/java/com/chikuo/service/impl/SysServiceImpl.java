package com.chikuo.service.impl;

import com.chikuo.dao.SysLogMapper;
import com.chikuo.dao.SysViewMapper;
import com.chikuo.entity.SysLog;
import com.chikuo.entity.SysLogExample;
import com.chikuo.entity.SysView;
import com.chikuo.entity.SysViewExample;
import com.chikuo.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * SysService实现类
 *
 */
@Component
public class SysServiceImpl implements SysService {

    @Autowired
    SysLogMapper sysLogMapper;
    @Autowired
    SysViewMapper sysViewMapper;

//    private static SysServiceImpl sysService;
//
//    @PostConstruct
//    public void init() {
//        sysService = this;
//        sysService.sysLogMapper = this.sysLogMapper;
//        sysService.sysViewMapper = this.sysViewMapper;
//    }


    /**
     * 增加一条日志信息
     *
     * @param sysLog
     */
    @Override
    public void addLog(SysLog sysLog) {
        sysLogMapper.insertSelective(sysLog);
    }

    /**
     * 增加一条访问量
     *
     * @param sysView
     */
    @Override
    public void addView(SysView sysView) {
        sysViewMapper.insertSelective(sysView);
    }

    /**
     * 获取日志的总数量
     *
     * @return 日志的总数量
     */
    @Override
    public int getLogCount() {
        SysLogExample example = new SysLogExample();
        return sysLogMapper.selectByExample(example).size();
    }

    /**
     * 返回当前网站的访问量
     *
     * @return
     */
    @Override
    public int getViewCount() {
        SysViewExample example = new SysViewExample();
        return sysViewMapper.selectByExample(example).size();
    }

    /**
     * 返回所有的日志信息
     *
     * @return
     */
    @Override
    public List<SysLog> listAllLog() {
        SysLogExample example = new SysLogExample();
        return sysLogMapper.selectByExample(example);
    }

    /**
     * 返回所有的访问信息
     *
     * @return
     */
    @Override
    public List<SysView> listAllView() {
        SysViewExample example = new SysViewExample();
        return sysViewMapper.selectByExample(example);
    }
}
