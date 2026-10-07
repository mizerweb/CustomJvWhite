package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class hjd {
    public final int a;
    public final gj0 b;
    public final Rect c;
    public final int d;
    public final int e;
    public final Matrix f;
    public final qme g;
    public final String h;
    public final e89 j;
    public int k = -1;
    public final ArrayList i = new ArrayList();

    public hjd(gl2 gl2Var, gj0 gj0Var, qme qmeVar, e89 e89Var, int i) {
        this.a = i;
        this.b = gj0Var;
        this.e = gj0Var.h;
        this.d = gj0Var.g;
        this.c = gj0Var.e;
        this.f = gj0Var.f;
        this.g = qmeVar;
        this.h = String.valueOf(gl2Var.hashCode());
        List<bn2> list = gl2Var.a;
        Objects.requireNonNull(list);
        for (bn2 bn2Var : list) {
            ArrayList arrayList = this.i;
            bn2Var.getClass();
            arrayList.add(0);
        }
        this.j = e89Var;
        tvj.a("ProcessingRequest", "ProcessingRequest: mRequestId = " + this.a + ", mTagBundleKey = " + this.h);
    }

    public final void a(int i) {
        if (this.k != i) {
            this.k = i;
            wxl.a();
            qme qmeVar = this.g;
            if (qmeVar.g) {
                return;
            }
            gj0 gj0Var = qmeVar.a;
            gj0Var.c.execute(new ff(gj0Var, i));
        }
    }
}
