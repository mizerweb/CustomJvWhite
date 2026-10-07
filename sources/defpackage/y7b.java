package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y7b implements l8e {
    public final Object a;
    public volatile boolean b;
    public volatile Object c;
    public final /* synthetic */ z7b d;

    public y7b(z7b z7bVar, Object obj) {
        this.d = z7bVar;
        this.a = obj;
        this.c = obj;
    }

    @Override // defpackage.l8e
    public final /* bridge */ /* synthetic */ void B(Object obj, zv8 zv8Var, Object obj2) {
        b(obj2);
    }

    public final Object a(zv8 zv8Var) {
        this.d.a.invoke(new vx9(this, 13, zv8Var));
        return this.c;
    }

    public final void b(Object obj) {
        this.b = true;
        this.c = obj;
    }

    @Override // defpackage.j8e
    public final /* bridge */ /* synthetic */ Object m(Object obj, zv8 zv8Var) {
        return a(zv8Var);
    }
}
