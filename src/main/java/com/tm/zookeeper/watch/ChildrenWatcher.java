package com.tm.zookeeper.watch;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;

/**
 * created by douming on 2019/7/10.
 * 功能描述：
 */
public class ChildrenWatcher implements Watcher {

    @Override
    public void process(WatchedEvent event) {

        System.out.println("==========ChildrenWatcher start==============");

        System.out.println("ChildrenWatcher state: " + event.getState().name());

        System.out.println("ChildrenWatcher type: " + event.getType().name());

        System.out.println("ChildrenWatcher path: " + event.getPath());

        System.out.println("==========ChildrenWatcher end==============");
    }

}
