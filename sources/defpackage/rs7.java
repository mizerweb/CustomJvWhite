package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class rs7 extends lk9 implements jg5 {
    public final Handler c;
    public final boolean d;
    public final rs7 e;

    public rs7(Handler handler, boolean z) {
        this.c = handler;
        this.d = z;
        this.e = z ? this : new rs7(handler, true);
    }

    @Override // defpackage.xt4
    public final void D0(vt4 vt4Var, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        T0(vt4Var, runnable);
    }

    @Override // defpackage.jg5
    public final void P(long j, ek2 ek2Var) {
        o90 o90Var = new o90(ek2Var, 8, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(o90Var, j)) {
            ek2Var.w(new ol(this, 5, o90Var));
        } else {
            T0(ek2Var.e, o90Var);
        }
    }

    @Override // defpackage.xt4
    public final boolean P0(vt4 vt4Var) {
        return (this.d && cqk.d(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    @Override // defpackage.lk9
    public final lk9 S0() {
        return this.e;
    }

    public final void T0(vt4 vt4Var, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        vo8 vo8Var = (vo8) vt4Var.x0(nhb.h);
        if (vo8Var != null) {
            vo8Var.b(cancellationException);
        }
        ao5 ao5Var = ao5.a;
        lb5.c.D0(vt4Var, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rs7)) {
            return false;
        }
        rs7 rs7Var = (rs7) obj;
        return rs7Var.c == this.c && rs7Var.d == this.d;
    }

    public final int hashCode() {
        return (this.d ? 1231 : 1237) ^ System.identityHashCode(this.c);
    }

    @Override // defpackage.jg5
    public final no5 t0(long j, final Runnable runnable, vt4 vt4Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(runnable, j)) {
            return new no5() { // from class: qs7
                @Override // defpackage.no5
                public final void dispose() {
                    this.a.c.removeCallbacks(runnable);
                }
            };
        }
        T0(vt4Var, runnable);
        return dib.a;
    }

    @Override // defpackage.lk9, defpackage.xt4
    public final String toString() {
        lk9 lk9VarS0;
        String string;
        ao5 ao5Var = ao5.a;
        lk9 lk9Var = rk9.a;
        if (this == lk9Var) {
            string = "Dispatchers.Main";
        } else {
            try {
                lk9VarS0 = lk9Var.S0();
            } catch (UnsupportedOperationException unused) {
                lk9VarS0 = null;
            }
            string = this == lk9VarS0 ? "Dispatchers.Main.immediate" : null;
        }
        if (string == null) {
            string = this.c.toString();
            if (this.d) {
                return zo5.o(string, ".immediate");
            }
        }
        return string;
    }
}
