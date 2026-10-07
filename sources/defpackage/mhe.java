package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mhe extends q98 {
    public static final mhe h;
    public final transient ypb e;
    public final transient int f;
    public transient p98 g;

    static {
        ypb ypbVar = new ypb();
        ypbVar.d(3);
        h = new mhe(ypbVar);
    }

    public mhe(ypb ypbVar) {
        this.e = ypbVar;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = ypbVar.c;
            if (i >= i2) {
                this.f = k4m.g(j);
                return;
            } else {
                lvb.U(i, i2);
                j += (long) ypbVar.b[i];
                i++;
            }
        }
    }

    @Override // defpackage.s88
    public final boolean g() {
        throw null;
    }

    @Override // defpackage.q98
    public final u98 j() {
        p98 p98Var = this.g;
        if (p98Var != null) {
            return p98Var;
        }
        p98 p98Var2 = new p98(this, 1);
        this.g = p98Var2;
        return p98Var2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f;
    }
}
