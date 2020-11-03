package io.github.yezhihao.netmc.core;

import io.github.yezhihao.netmc.core.handler.Handler;

/**
 * 消息映射接口
 * @author yezhihao
 * home https://gitee.com/yezhihao/jt808-server
 */
public interface HandlerMapping {

    Handler getHandler(Object messageType);

}