package defpackage;

import android.graphics.drawable.Animatable;

/* JADX INFO: loaded from: classes2.dex */
public final class q68 extends oq0 {
    public final y45 b;
    public long c = -1;

    public q68(y45 y45Var) {
        this.b = y45Var;
    }

    @Override // defpackage.oq0, defpackage.mr4
    public final void e(String str, Object obj, Animatable animatable) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.c;
        y45 y45Var = this.b;
        y45Var.s = jCurrentTimeMillis;
        y45Var.invalidateSelf();
    }

    @Override // defpackage.oq0, defpackage.mr4
    public final void f(Object obj, String str) {
        this.c = System.currentTimeMillis();
    }
}
