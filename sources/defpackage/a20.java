package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a20 extends n1g {
    public final /* synthetic */ b20 g;

    public a20(b20 b20Var) {
        this.g = b20Var;
    }

    @Override // defpackage.n1g
    public final int B() {
        return this.g.b.size();
    }

    @Override // defpackage.n1g
    public final int C() {
        return this.g.a.size();
    }

    @Override // defpackage.n1g
    public final boolean f(int i, int i2) {
        b20 b20Var = this.g;
        Object obj = b20Var.a.get(i);
        Object obj2 = b20Var.b.get(i2);
        if (obj != null && obj2 != null) {
            return ((e9i) b20Var.e.b.c).g(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // defpackage.n1g
    public final boolean g(int i, int i2) {
        b20 b20Var = this.g;
        Object obj = b20Var.a.get(i);
        Object obj2 = b20Var.b.get(i2);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        return ((e9i) b20Var.e.b.c).h(obj, obj2);
    }

    @Override // defpackage.n1g
    public final Object y(int i, int i2) {
        b20 b20Var = this.g;
        Object obj = b20Var.a.get(i);
        Object obj2 = b20Var.b.get(i2);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        return ((e9i) b20Var.e.b.c).Z(obj, obj2);
    }
}
