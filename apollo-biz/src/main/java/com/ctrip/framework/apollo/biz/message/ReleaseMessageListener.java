package com.ctrip.framework.apollo.biz.message;

import com.ctrip.framework.apollo.biz.entity.ReleaseMessage;

/**
 * @author Jason Song(song_s@ctrip.com)
 * 消息的监听器
 */
public interface ReleaseMessageListener {
    /**
     * 监听消息
     *
     * @param message 消息
     * @param channel 渠道
     */
    void handleMessage(ReleaseMessage message, String channel);
}
