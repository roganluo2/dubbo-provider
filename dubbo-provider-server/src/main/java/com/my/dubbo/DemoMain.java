package com.my.dubbo;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;


public class DemoMain {

    public static void main(String[] args) {
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("myProtocol");
        System.out.println(protocol.getDefaultPort());



    }
}
