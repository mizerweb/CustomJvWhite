package defpackage;

import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jj extends vjg {
    public final int j;
    public int k;

    public jj(View view, oi8 oi8Var, cf7 cf7Var, int i) {
        super(view, oi8Var, (i & 16) != 0 ? null : cf7Var);
        this.j = 8;
        this.k = -1;
        ij ijVar = new ij(this);
        WeakHashMap weakHashMap = i7j.a;
        swj.a(view, ijVar);
    }

    public static final ixj g(jj jjVar, ixj ixjVar) {
        xwj uwjVar;
        if (jjVar.f == 0) {
            return ixjVar;
        }
        mi8 mi8VarF = ixjVar.a.f(519);
        if (mi8VarF.d > jjVar.f) {
            return ixjVar;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            uwjVar = new wwj(ixjVar);
        } else if (i >= 30) {
            uwjVar = new vwj(ixjVar);
        } else {
            uwjVar = i >= 29 ? new uwj(ixjVar) : new twj(ixjVar);
        }
        uwjVar.c(519, mi8.b(mi8VarF.a, mi8VarF.b, mi8VarF.c, jjVar.f));
        return uwjVar.b();
    }

    @Override // defpackage.vjg
    public final void b(ixj ixjVar, j11 j11Var) {
        exj exjVar = ixjVar.a;
        mi8 mi8VarF = exjVar.f(this.d);
        int i = this.j;
        mi8 mi8VarF2 = exjVar.f(i);
        if (exjVar.o(i)) {
            mi8VarF = mi8VarF2;
        }
        a(mi8VarF, j11Var);
    }

    @Override // defpackage.vjg
    public final void c(ixj ixjVar) {
        xwj uwjVar;
        if (this.k != -1) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                uwjVar = new wwj(ixjVar);
            } else if (i >= 30) {
                uwjVar = new vwj(ixjVar);
            } else {
                uwjVar = i >= 29 ? new uwj(ixjVar) : new twj(ixjVar);
            }
            uwjVar.c(8, mi8.e);
            uwjVar.i(8, false);
            ixjVar = uwjVar.b();
        }
        super.c(ixjVar);
    }

    @Override // defpackage.vjg
    public final ixj d(ixj ixjVar) {
        return ixjVar;
    }

    @Override // defpackage.vjg
    public final void e() {
        this.g = false;
        View view = this.a;
        if (!view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new hj(view, 0));
        } else {
            WeakHashMap weakHashMap = i7j.a;
            w6j.c(view);
        }
    }

    public void h(ixj ixjVar, wze wzeVar) {
    }

    public abstract ixj i(ixj ixjVar);

    public abstract void j();

    public void k() {
    }
}
