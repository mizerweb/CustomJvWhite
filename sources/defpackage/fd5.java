package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class fd5 implements xje {
    public final Context a;
    public final pgg b;
    public boolean c;
    public qt9 d = qt9.I0;

    public fd5(Context context) {
        this.a = context;
        this.b = new pgg(context);
    }

    @Override // defpackage.xje
    public final ks0[] a(Handler handler, y3j y3jVar, ob0 ob0Var, inh inhVar, vwa vwaVar) {
        ArrayList arrayList = new ArrayList();
        qt9 qt9Var = this.d;
        boolean z = this.c;
        Context context = this.a;
        xt9 xt9Var = new xt9(context);
        xt9Var.d = this.b;
        xt9Var.c = qt9Var;
        xt9Var.e = 5000L;
        xt9Var.f = z;
        xt9Var.g = handler;
        xt9Var.h = y3jVar;
        xt9Var.i = 50;
        lvb.b0(!xt9Var.b);
        Handler handler2 = xt9Var.g;
        lvb.b0((handler2 == null && xt9Var.h == null) || !(handler2 == null || xt9Var.h == null));
        xt9Var.b = true;
        arrayList.add(new zt9(xt9Var));
        arrayList.add(new lt9(this.a, this.b, this.d, this.c, handler, ob0Var, c(context)));
        d(inhVar, handler.getLooper(), arrayList);
        Looper looper = handler.getLooper();
        arrayList.add(new xwa(vwaVar, looper));
        arrayList.add(new xwa(vwaVar, looper));
        arrayList.add(new cg2());
        arrayList.add(new s78(new c1k(context)));
        return (ks0[]) arrayList.toArray(new ks0[0]);
    }

    @Override // defpackage.xje
    public final void b(ks0 ks0Var) {
        int i = ks0Var.b;
    }

    public b85 c(Context context) {
        return new qz4(context).b();
    }

    public void d(inh inhVar, Looper looper, ArrayList arrayList) {
        arrayList.add(new nnh(inhVar, looper, x7h.O0));
    }
}
