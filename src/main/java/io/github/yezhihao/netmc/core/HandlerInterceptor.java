package io.github.yezhihao.netmc.core;

import io.github.yezhihao.netmc.core.model.Header;
import io.github.yezhihao.netmc.core.model.Message;
import io.github.yezhihao.netmc.session.Session;

/**
 * 消息拦截器
 * @author yezhihao
 * home https://gitee.com/yezhihao/jt808-server
 */
public interface HandlerInterceptor<T extends Message<? extends Header>> {
    /** 未找到对应的Handle */
    T notSupported(T request, Session session);

    /** 调用之前 */
    boolean beforeHandle(T request, Session session);

    /** 调用之后，返回值为void的 */
    T successful(T request, Session session);

    /** 调用之后，有返回值的 */
    void afterHandle(T request, T response, Session session);

    /** 调用之后抛出异常的 */
    T exceptional(T request, Session session, Exception e);
}