package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedHashSet;
import one.video.player.BaseVideoPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class hsh extends Handler {
    public final long a;
    public final fbc b;
    public volatile long c;
    public volatile long d;

    /* JADX WARN: Illegal instructions before constructor call */
    public hsh(fbc fbcVar, Looper looper) {
        if (looper == null && (looper = Looper.myLooper()) == null) {
            looper = Looper.getMainLooper();
        }
        super(looper);
        this.a = 1000L;
        this.b = fbcVar;
        this.d = -1L;
    }

    public final long a() {
        long jElapsedRealtime;
        synchronized (this) {
            jElapsedRealtime = this.c + (this.d > 0 ? SystemClock.elapsedRealtime() - this.d : 0L);
        }
        return jElapsedRealtime;
    }

    public final void b() {
        synchronized (this) {
            if (this.d != -1) {
                this.c = (SystemClock.elapsedRealtime() - this.d) + this.c;
                this.d = -1L;
                removeCallbacksAndMessages(this);
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.d != -1 && message.what == 1 && message.obj == this) {
            fbc fbcVar = this.b;
            long jA = a();
            Iterator it = ((LinkedHashSet) fbcVar.b).iterator();
            while (it.hasNext()) {
                ldc ldcVar = ((bt0) it.next()).a;
                wx wxVar = BaseVideoPlayer.C;
                ldcVar.j();
                fbc fbcVar2 = ldcVar.e;
                if (fbcVar2 != null) {
                    ((hsh) fbcVar2.c).getClass();
                }
                ldcVar.o(jA);
            }
            sendMessageDelayed(obtainMessage(1, this), this.a);
        }
    }
}
