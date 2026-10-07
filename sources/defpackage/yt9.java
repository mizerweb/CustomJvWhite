package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class yt9 implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ zt9 b;

    public yt9(zt9 zt9Var, kt9 kt9Var) {
        this.b = zt9Var;
        Handler handlerP = vqi.p(this);
        this.a = handlerP;
        kt9Var.u(this, handlerP);
    }

    public final void a(long j) {
        Surface surface;
        zt9 zt9Var = this.b;
        fbc fbcVar = zt9Var.i2;
        if (this != zt9Var.S2 || zt9Var.n1 == null) {
            return;
        }
        if (j == BuildConfig.MAX_TIME_TO_UPLOAD) {
            zt9Var.T1 = true;
            return;
        }
        try {
            zt9Var.D0(j);
            k4j k4jVar = zt9Var.N2;
            if (!k4jVar.equals(k4j.d) && !k4jVar.equals(zt9Var.O2)) {
                zt9Var.O2 = k4jVar;
                fbcVar.E(k4jVar);
            }
            zt9Var.V1.e++;
            uwi uwiVar = zt9Var.l2;
            boolean z = uwiVar.e != 3;
            uwiVar.e = 3;
            ((nfh) uwiVar.l).getClass();
            uwiVar.g = vqi.X(SystemClock.elapsedRealtime());
            if (z && (surface = zt9Var.x2) != null) {
                Handler handler = (Handler) fbcVar.b;
                if (handler != null) {
                    handler.post(new xc2(fbcVar, surface, SystemClock.elapsedRealtime(), 7));
                }
                zt9Var.A2 = true;
            }
            zt9Var.i0(j);
        } catch (ExoPlaybackException e) {
            zt9Var.U1 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = vqi.a;
        a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
        return true;
    }
}
