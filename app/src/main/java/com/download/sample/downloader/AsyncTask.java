package com.download.sample.downloader;

import android.os.Looper;

import com.download.sample.downloader.dispatcher_queue.DispatchThread;

/**
 * @author cenxiaozhong
 * @date 2020/7/5
 * @since 1.0.0
 *
 *  依赖
 *  implementation 'com.github.Justson:dispatch-queue:v1.0.5'
 */
public class AsyncTask {


    private static final DispatchThread MAIN_QUEUE = new DispatchThread(Looper.getMainLooper());

    protected void publishProgress(final Integer... values) {
        MAIN_QUEUE.post(new Runnable() {
            @Override
            public void run() {
                onProgressUpdate(values);
            }
        });
    }


    protected void onProgressUpdate(Integer... values) {

    }

}
