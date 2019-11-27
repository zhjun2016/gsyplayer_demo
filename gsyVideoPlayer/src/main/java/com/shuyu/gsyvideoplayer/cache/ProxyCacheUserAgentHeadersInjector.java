package com.shuyu.gsyvideoplayer.cache;

import com.shuyu.gsyvideoplayer.utils.Debuger;

import java.util.HashMap;
import java.util.Map;

import videocache.headers.HeaderInjector;

/**
 for android video cache header
 */
public class ProxyCacheUserAgentHeadersInjector implements HeaderInjector {

    public final static Map<String, String> mMapHeadData = new HashMap<>();

    @Override
    public Map<String, String> addHeaders(String url) {
        Debuger.printfLog("****** proxy addHeaders ****** " + mMapHeadData.size());
        return mMapHeadData;
    }
}