package defpackage;

import android.os.Handler;
import android.util.Log;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zqh {
    public final gu4 a;
    public final gu4 b;
    public final Executor c;
    public final xt4 d;
    public final Executor e;
    public final xt4 f;
    public final Executor g;
    public final xt4 h;
    public final ifh i;
    public final ifh j;

    public zqh(gu4 gu4Var, gu4 gu4Var2, Executor executor, xt4 xt4Var, Executor executor2, xt4 xt4Var2, Executor executor3, xt4 xt4Var3, af7 af7Var, iqh iqhVar) {
        this.a = gu4Var;
        this.b = gu4Var2;
        this.c = executor;
        this.d = xt4Var;
        this.e = executor2;
        this.f = xt4Var2;
        this.g = executor3;
        this.h = xt4Var3;
        this.i = new ifh(new bdb(1, af7Var));
        this.j = new ifh(new bpg(13, iqhVar));
    }

    public final Handler a() {
        return (Handler) this.i.getValue();
    }

    public final Object b(long j, cf7 cf7Var) {
        try {
            return yab.A0(this.d, new h99(this, cf7Var, j, (lq4) null));
        } catch (InterruptedException e) {
            Log.i("CXCP", "runBlockingCheckedOrNull cancelled by thread interruption", e);
            return null;
        }
    }
}
