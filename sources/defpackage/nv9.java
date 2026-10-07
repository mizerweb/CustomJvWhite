package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class nv9 implements IBinder.DeathRecipient {
    public final ku9 a = new ku9(this);
    public aa5 b;
    public ju9 c;
    public final Handler d;
    public final /* synthetic */ pv9 e;

    public nv9(pv9 pv9Var, Looper looper) {
        this.e = pv9Var;
        this.d = new Handler(looper, new w84(4, this));
    }

    public final void a(boolean z) {
        iu9 iu9Var = this.e.b;
        iu9Var.getClass();
        lvb.b0(Looper.myLooper() == iu9Var.f.getLooper());
        gu9 gu9Var = iu9Var.e;
        new Bundle().putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", z);
        gu9Var.u(new emf("androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED", Bundle.EMPTY));
    }

    public final void b(x2d x2dVar) {
        pv9 pv9Var = this.e;
        ov9 ov9Var = pv9Var.n;
        pv9Var.n = new ov9(ov9Var.a, pv9.Z(x2dVar), ov9Var.c, ov9Var.d, ov9Var.e, ov9Var.f, ov9Var.g, ov9Var.h);
        e();
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        c(8, null);
    }

    public final void c(int i, Object obj) {
        aa5 aa5Var = this.b;
        if (aa5Var != null) {
            aa5Var.obtainMessage(i, obj).sendToTarget();
        }
    }

    public final void d(Handler handler) {
        if (handler != null) {
            aa5 aa5Var = new aa5(this, handler.getLooper());
            this.b = aa5Var;
            aa5Var.b = true;
        } else {
            aa5 aa5Var2 = this.b;
            if (aa5Var2 != null) {
                aa5Var2.b = false;
                aa5Var2.removeCallbacksAndMessages(null);
                this.b = null;
            }
        }
    }

    public final void e() {
        Handler handler = this.d;
        if (handler.hasMessages(1)) {
            return;
        }
        handler.sendEmptyMessageDelayed(1, this.e.h);
    }
}
