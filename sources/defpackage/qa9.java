package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class qa9 implements ot5 {
    @Override // defpackage.ot5
    public final Drawable a(xt3 xt3Var) {
        e95 e95Var = xt3Var instanceof e95 ? (e95) xt3Var : null;
        if (e95Var != null) {
            return e95Var.l();
        }
        return null;
    }

    @Override // defpackage.ot5
    public final boolean b(xt3 xt3Var) {
        return xt3Var instanceof e95;
    }
}
