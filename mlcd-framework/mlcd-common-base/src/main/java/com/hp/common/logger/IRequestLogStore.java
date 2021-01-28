package com.hp.common.logger;

/**
 * 保存请求接口
 */
public interface IRequestLogStore {

    /**
     * 保存请求日志接口
     * @param model
     * @return
     */
    public int saveRequestLog(LoggerModel model);
}
