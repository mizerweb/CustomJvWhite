package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public class NativeRunnable {
    private final Runnable runnable;

    public NativeRunnable(Runnable runnable) {
        this.runnable = runnable;
    }

    public void run() {
        this.runnable.run();
    }
}
