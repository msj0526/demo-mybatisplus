package com.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.common.utils.PageUtils;
import com.demo.entity.DictTypeEntity;
import com.demo.common.request.PageFrom;

/**
 * 字典类型表
 *
 * @author msj
 * @email
 * @date 2021-06-24 11:48:20
 */
public interface DictTypeService extends IService<DictTypeEntity> {

    PageUtils queryPage(PageFrom params);
}

