package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ohd extends sw3 {
    public final nhd b;

    public ohd(aw8 aw8Var) {
        super(aw8Var);
        this.b = new nhd(aw8Var.d());
    }

    @Override // defpackage.sw3, defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        int iH = h(obj);
        x74 x74VarR = u76Var.r(this.b, iH);
        o(x74VarR, obj, iH);
        x74VarR.c();
    }

    @Override // defpackage.k0, defpackage.aw8
    public final Object c(r55 r55Var) {
        return i(r55Var);
    }

    @Override // defpackage.aw8
    public final fif d() {
        return this.b;
    }

    @Override // defpackage.k0
    public final Object e() {
        return (mhd) k(n());
    }

    @Override // defpackage.k0
    public final int f(Object obj) {
        return ((mhd) obj).d();
    }

    @Override // defpackage.k0
    public final Iterator g(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.k0
    public final Object l(Object obj) {
        return ((mhd) obj).a();
    }

    @Override // defpackage.sw3
    public final void m(Object obj, int i, Object obj2) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object n();

    public abstract void o(x74 x74Var, Object obj, int i);
}
