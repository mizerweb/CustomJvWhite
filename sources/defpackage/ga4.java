package defpackage;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class ga4 {
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public ga4(Looper looper) {
        this.b = new Object();
        this.c = looper;
        this.d = null;
        this.a = 0;
    }

    public void a() {
        HandlerThread handlerThread;
        synchronized (this.b) {
            try {
                lvb.b0(this.a > 0);
                int i = this.a - 1;
                this.a = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                    handlerThread.quit();
                    this.d = null;
                    this.c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ga4() {
        this.a = 20;
    }
}
