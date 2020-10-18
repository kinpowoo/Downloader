package com.download.sample.downloader.dispatcher_queue;

import android.os.Looper;

/**
 * @author cenxiaozhong
 * @date 2020/7/5
 * @since 1.0.0
 */
public final class GlobalQueue {
    private static volatile DispatchThread mMainQueue = null;

    public static DispatchThread getMainQueue() {
        if (mMainQueue == null) {
            synchronized (GlobalQueue.class) {
                DispatchThread temp = mMainQueue;
                if (temp == null) {
                    mMainQueue = new DispatchThread(Looper.getMainLooper());
                    return mMainQueue;
                }
            }
        }
        return mMainQueue;
    }
}
