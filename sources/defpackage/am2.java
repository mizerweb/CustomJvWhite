package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class am2 implements fd2 {
    public final /* synthetic */ pm2 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public am2(pm2 pm2Var, int i, int i2) {
        this.a = pm2Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.fd2
    public final e89 a() {
        pm2 pm2Var = this.a;
        dq4 dq4Var = pm2Var.e.a;
        int i = this.b;
        int i2 = this.c;
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = zl2.class;
        try {
            r72Var.a = yab.i0(dq4Var, null, 0, new xl2(r72Var, null, pm2Var, i, i2, 1), 3);
            return u72Var;
        } catch (Exception e) {
            u72Var.c(e);
            return u72Var;
        }
    }

    @Override // defpackage.fd2
    public final e89 b() {
        pm2 pm2Var = this.a;
        dq4 dq4Var = pm2Var.e.a;
        int i = this.b;
        int i2 = this.c;
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = yl2.class;
        try {
            r72Var.a = yab.i0(dq4Var, null, 0, new xl2(r72Var, null, pm2Var, i, i2, 0), 3);
            return u72Var;
        } catch (Exception e) {
            u72Var.c(e);
            return u72Var;
        }
    }
}
