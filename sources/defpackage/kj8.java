package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class kj8 implements aw8 {
    public static final nhd a = yi8.c.b;

    public static f8b e(r55 r55Var) {
        f8b f8bVar = new f8b();
        nhd nhdVar = a;
        v74 v74VarA = r55Var.a(nhdVar);
        for (int iV = v74VarA.v(nhdVar); iV != -1; iV = v74VarA.v(nhdVar)) {
            f8bVar.a(v74VarA.l(nhdVar, iV));
        }
        v74VarA.j(nhdVar);
        return f8bVar;
    }
}
