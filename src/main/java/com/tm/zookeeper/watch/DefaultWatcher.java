package com.tm.zookeeper.watch;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;

/**
 * created by douming on 2019/7/10.
 * 功能描述：
 */
public class DefaultWatcher implements Watcher {
    @Override
    public void process(WatchedEvent event) {
        System.out.println("==========DefaultWatcher start==============");

        System.out.println("DefaultWatcher state: " + event.getState().name());

        System.out.println("DefaultWatcher type: " + event.getType().name());

        System.out.println("DefaultWatcher path: " + event.getPath());

        System.out.println("==========DefaultWatcher end==============");

    }
}
