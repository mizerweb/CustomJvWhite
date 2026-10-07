package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class exa {
    public static final fxa g = new fxa();
    public final jc5 a;
    public final ry9 b;
    public final sfh c;
    public final axa d;
    public final axa e;
    public boolean f;

    public exa(jc5 jc5Var, ry9 ry9Var, axa axaVar, axa axaVar2) {
        Looper looper;
        this.a = jc5Var;
        this.b = ry9Var;
        this.d = axaVar;
        this.e = axaVar2;
        fxa fxaVar = g;
        synchronized (fxaVar) {
            try {
                if (fxaVar.b == null) {
                    lvb.b0(fxaVar.c == 0);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:MetadataRetriever");
                    fxaVar.b = handlerThread;
                    handlerThread.start();
                }
                fxaVar.c++;
                HandlerThread handlerThread2 = fxaVar.b;
                handlerThread2.getClass();
                looper = handlerThread2.getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c = new sfh(new Handler(looper, new dxa(this)));
    }

    public final synchronized void a() {
        if (!this.f) {
            this.f = true;
            this.c.a(4).b();
        }
    }
}
