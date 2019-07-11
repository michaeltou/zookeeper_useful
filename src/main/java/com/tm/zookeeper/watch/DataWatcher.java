package com.tm.zookeeper.watch;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;

/**
 * created by douming on 2019/7/10.
 * 功能描述：
 */
public class DataWatcher  implements Watcher {

    @Override
    public void process(WatchedEvent event) {

        System.out.println("==========DataWatcher start==============");

        System.out.println("DataWatcher state: " + event.getState().name());

        System.out.println("DataWatcher type: " + event.getType().name());

        System.out.println("DataWatcher path: " + event.getPath());

        System.out.println("==========DataWatcher end==============");
    }
}
