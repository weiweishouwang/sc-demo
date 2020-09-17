/*
 * Copyright 2019-2029 geekidea(https://github.com/geekidea)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zhw.sc.commons.log.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.zhw.sc.commons.log.entity.SysLoginLog;
import com.zhw.sc.commons.log.mapper.SysLoginLogMapper;
import com.zhw.sc.commons.log.service.SysLoginLogService;
import com.zhw.sc.commons.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 系统登录日志 服务实现类
 *
 * @author geekidea
 * @since 2020-03-24
 */
@Service
public class SysLoginLogServiceImpl extends BaseServiceImpl<SysLoginLogMapper, SysLoginLog> implements SysLoginLogService {

    @Autowired
    private SysLoginLogMapper sysLoginLogMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveSysLoginLog(SysLoginLog sysLoginLog) throws Exception {
        return super.save(sysLoginLog);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateSysLoginLog(SysLoginLog sysLoginLog) throws Exception {
        return super.updateById(sysLoginLog);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteSysLoginLog(Long id) throws Exception {
        return super.removeById(id);
    }

}
