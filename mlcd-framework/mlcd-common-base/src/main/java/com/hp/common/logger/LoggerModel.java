package com.hp.common.logger;


import java.io.Serializable;
import java.util.Map;
import lombok.Data;


/**
 * 日志实体类.
 *
 * @author hp
 */

@Data
public class LoggerModel implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 4296799309713867875L;

    /**
     * 请求唯一标识，可以自定义规则生成
     */
    private String trackId;

    /**
     * 请求路径
     */
    private String uri;

    /**
     * 请求uri上的参数
     */
    private String queryString;

    /**
     * 请求方式，GET/POST等
     */
    private String method;

    /**
     * 操作说明
     */
    private String description;

    /**
     * 请求ip，客户端ip地址
     */
    private String ip;

    /**
     * 请求体，请求正文的内容
     */
    private String body;

    /**
     * 请求token，登录用户token，登录状态小存在
     */
    private String token;

    /**
     * 请求用户id，登录用户id，登录状态下存在
     */
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * Map
     */
    private Map<String, Object> ext;

    /**
     * 返回请求结果
     */
    private String returnData;

    /**
     * 开始时间
     */
    private long startTime;

    /**
     * 结束时间
     */
    private long endTime;
}
