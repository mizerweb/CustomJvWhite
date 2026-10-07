package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class p03 extends x23 {
    @Override // defpackage.x23
    public final void H(x7a x7aVar, cf7 cf7Var, qf7 qf7Var) {
        u7a u7aVar = (u7a) x7aVar;
        B(u7aVar);
        super.H(u7aVar, cf7Var, qf7Var);
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void B(u7a u7aVar) {
        v23 v23Var = (v23) this.a;
        v23Var.setId((int) u7aVar.a);
        v23Var.setTitle(u7aVar.e);
        v23Var.setLink(u7aVar.g);
        v23Var.setSubtitle(u7aVar.f);
        if (!u7aVar.h) {
            v23Var.setLinkPhoto(u7aVar.d);
            return;
        }
        kwb kwbVar = v23Var.w;
        kwbVar.p1 = null;
        kwbVar.b.i(null);
        kwb.y(v23Var.w, (Drawable) v23Var.s.getValue(), null, new xk1(26), new xk1(27), 6);
        v23Var.u();
    }
}
