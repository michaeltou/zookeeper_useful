package com.tm.zookeeper.code;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;

/**
 * created by douming on 2019/7/10.
 * 功能描述：
 */
public class ZKDelete {

    private static ZooKeeper zk;
    private static ZooKeeperConnection conn;

    // Method to check existence of znode and its status, if znode is available.
    public static void delete(String path) throws KeeperException,InterruptedException {
        zk.delete(path,zk.exists(path,true).getVersion());
    }

    public static void main(String[] args) throws InterruptedException,KeeperException {
        String path = "/MyFirstZnode"; //Assign path to the znode

        try {
            conn = new ZooKeeperConnection();
            zk = conn.connect(MyConstant.ZOOKEEPER_HOST);
            delete(path); //delete the node with the specified path
        } catch(Exception e) {
            System.out.println(e.getMessage()); // catches error messages
        }
    }
}
