package com.hp.common.logger;

/** 日志存储接口.
 * @author hp
 */
public interface ILoggerStore {

    /**
     * 存储日志
     * @param model
     * @return
     */
    public int save(LoggerModel model);
}
