package defpackage;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hqh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ HandlerThread b;

    public /* synthetic */ hqh(HandlerThread handlerThread, int i) {
        this.a = i;
        this.b = handlerThread;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        int i = this.a;
        HandlerThread handlerThread = this.b;
        switch (i) {
            case 0:
                handlerThread.quit();
                handlerThread.join(1000L);
                break;
            default:
                handlerThread.quitSafely();
                break;
        }
    }
}
