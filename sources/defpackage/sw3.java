package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class sw3 extends k0 {
    public final aw8 a;

    public sw3(aw8 aw8Var) {
        this.a = aw8Var;
    }

    @Override // defpackage.aw8
    public void a(u76 u76Var, Object obj) {
        int iH = h(obj);
        x74 x74VarR = u76Var.r(d(), iH);
        Iterator itG = g(obj);
        for (int i = 0; i < iH; i++) {
            x74VarR.i(d(), i, this.a, itG.next());
        }
        x74VarR.c();
    }

    @Override // defpackage.k0
    public void j(v74 v74Var, int i, Object obj) {
        m(obj, i, v74Var.x(d(), i, this.a, null));
    }

    public abstract void m(Object obj, int i, Object obj2);
}
