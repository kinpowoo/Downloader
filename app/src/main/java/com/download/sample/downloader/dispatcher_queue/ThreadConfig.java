package com.download.sample.downloader.dispatcher_queue;

import java.util.concurrent.atomic.AtomicInteger;

public final class ThreadConfig {

    private final static AtomicInteger THREAD_ID_GENERATOR = new AtomicInteger(1);

    public static int getUniqueThreadId() {
        return THREAD_ID_GENERATOR.getAndIncrement();
    }

}