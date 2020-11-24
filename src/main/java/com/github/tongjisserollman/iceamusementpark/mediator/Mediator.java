package com.github.tongjisserollman.iceamusementpark.mediator;

import com.github.tongjisserollman.iceamusementpark.util.CallStackLogInfo;
import com.github.tongjisserollman.iceamusementpark.util.CallStackLogger;

/**
 * @author Mrcopytuo
 *
 * 中介系统
 */

public class Mediator {

    /**
     * 中介系统发布需求消息
     */
    public static void tellLack(Shop shop, String str){
        CallStackLogger.log(
                new CallStackLogInfo(
                        "Mediator",
                        "tellLack",
                        "1145141515",
                        "中介系统发布需求消息"
                )
        );
        System.out.println("商店名："+shop.getName()+"\t需求："+str);
    }
}