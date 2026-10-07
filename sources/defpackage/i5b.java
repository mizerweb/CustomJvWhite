package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class i5b {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public i5b(Context context, String str, jl8 jl8Var) {
        this.a = 0;
        this.c = str;
        this.d = jl8Var;
        this.e = context.getApplicationContext();
        dq4 dq4Var = jl8Var.a.a;
        this.f = dq4Var == null ? null : dq4Var;
        this.g = new AtomicBoolean(true);
        this.i = e9i.a(0, 0, 1);
        this.j = new g5b(this, jl8Var.b);
        this.k = new f5b(this);
        this.l = new h5b(0, this);
    }

    public void a() {
        int iD = qt4.D(this.b);
        if (iD == 0 || iD == 1) {
            e();
            return;
        }
        if (iD != 2 && iD != 3) {
            if (iD == 4) {
                tvj.a("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
                return;
            } else {
                qr7.q(ewi.q(this.b), " is not handled", "State ");
                return;
            }
        }
        tvj.a("VideoEncoderSession", "closeInternal in " + ewi.q(this.b) + " state");
        this.b = 3;
    }

    public o24 b(String[] strArr) {
        return new o24((pzf) this.i, 22, strArr);
    }

    public void c(Intent intent) {
        if (((AtomicBoolean) this.g).compareAndSet(true, false)) {
            ((Context) this.e).bindService(intent, (h5b) this.l, 1);
            ((jl8) this.d).a((g5b) this.j);
        }
    }

    public void d() {
        if (((AtomicBoolean) this.g).compareAndSet(false, true)) {
            ((jl8) this.d).b((g5b) this.j);
            try {
                k38 k38Var = (k38) this.h;
                if (k38Var != null) {
                    k38Var.e0((f5b) this.k, this.b);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
            }
            ((Context) this.e).unbindService((h5b) this.l);
        }
    }

    public void e() {
        int iD = qt4.D(this.b);
        if (iD == 0) {
            this.b = 5;
            return;
        }
        if (iD != 1 && iD != 2 && iD != 3) {
            int i = this.b;
            if (iD != 4) {
                qr7.q(ewi.q(i), " is not handled", "State ");
                return;
            }
            tvj.a("VideoEncoderSession", "terminateNow in " + ewi.q(i) + ", No-op");
            return;
        }
        this.b = 5;
        ((r72) this.l).b((m86) this.f);
        this.h = null;
        if (((m86) this.f) == null) {
            tvj.g("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            ((r72) this.j).b(null);
            return;
        }
        tvj.a("VideoEncoderSession", "VideoEncoder is releasing: " + ((m86) this.f));
        m86 m86Var = (m86) this.f;
        m86Var.h.execute(new a86(m86Var, 4));
        ((m86) this.f).i.b(new f4g(20, this), (Executor) this.d);
        this.f = null;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString((ich) this.h, "SURFACE_REQUEST_NOT_CONFIGURED");
            default:
                return super.toString();
        }
    }

    public i5b(z76 z76Var, eif eifVar, Executor executor) {
        this.a = 1;
        this.f = null;
        this.g = null;
        this.h = null;
        this.b = 1;
        this.i = new g88(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.j = null;
        this.k = new g88(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.l = null;
        this.c = executor;
        this.d = eifVar;
        this.e = z76Var;
    }
}
