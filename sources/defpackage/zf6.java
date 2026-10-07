package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zf6 implements e5a {
    public final Object a;
    public final nn9 b;
    public ush c;

    public zf6(Object obj, nn9 nn9Var) {
        this.a = obj;
        this.b = nn9Var;
        this.c = nn9Var.o;
    }

    @Override // defpackage.e5a
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.e5a
    public final ush b() {
        return this.c;
    }

    public final void d(ush ushVar) {
        this.c = ushVar;
    }
}
