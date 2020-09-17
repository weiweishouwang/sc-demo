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
import com.zhw.sc.commons.log.entity.SysOperationLog;
import com.zhw.sc.commons.log.mapper.SysOperationLogMapper;
import com.zhw.sc.commons.log.service.SysOperationLogService;
import com.zhw.sc.commons.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 系统操作日志 服务实现类
 *
 * @author geekidea
 * @since 2020-03-19
 */
@Service
public class SysOperationLogServiceImpl extends BaseServiceImpl<SysOperationLogMapper, SysOperationLog> implements SysOperationLogService {

    @Autowired
    private SysOperationLogMapper sysOperationLogMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveSysOperationLog(SysOperationLog sysOperationLog) throws Exception {
        return super.save(sysOperationLog);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateSysOperationLog(SysOperationLog sysOperationLog) throws Exception {
        return super.updateById(sysOperationLog);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteSysOperationLog(Long id) throws Exception {
        return super.removeById(id);
    }

}
