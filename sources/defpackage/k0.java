package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 implements aw8 {
    @Override // defpackage.aw8
    public Object c(r55 r55Var) {
        return i(r55Var);
    }

    public abstract Object e();

    public abstract int f(Object obj);

    public abstract Iterator g(Object obj);

    public abstract int h(Object obj);

    public final Object i(r55 r55Var) {
        Object objE = e();
        int iF = f(objE);
        v74 v74VarA = r55Var.a(d());
        while (true) {
            int iV = v74VarA.v(d());
            if (iV == -1) {
                v74VarA.j(d());
                return l(objE);
            }
            j(v74VarA, iV + iF, objE);
        }
    }

    public abstract void j(v74 v74Var, int i, Object obj);

    public abstract Object k(Object obj);

    public abstract Object l(Object obj);
}
