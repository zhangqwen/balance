package cn.zhangqw7.projects.mapper;

import cn.zhangqw7.projects.model.User;
import tk.mybatis.mapper.common.Mapper;


// 在启动器中@MapperScan中扫描
public interface UserMapper extends Mapper<User> {
}
