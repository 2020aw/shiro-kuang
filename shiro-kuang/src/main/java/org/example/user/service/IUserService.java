package org.example.user.service;

import org.example.user.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.jws.soap.SOAPBinding;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 雨芸
 * @since 2025-02-06
 */
public interface IUserService extends IService<User> {
    User queryName(String name);
}
