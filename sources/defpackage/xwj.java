package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class xwj {
    public final ixj a;
    public mi8[] b;

    public xwj() {
        this(new ixj());
    }

    public final void a() {
        mi8[] mi8VarArr = this.b;
        if (mi8VarArr != null) {
            mi8 mi8VarF = mi8VarArr[0];
            mi8 mi8VarF2 = mi8VarArr[1];
            ixj ixjVar = this.a;
            if (mi8VarF2 == null) {
                mi8VarF2 = ixjVar.a.f(2);
            }
            if (mi8VarF == null) {
                mi8VarF = ixjVar.a.f(1);
            }
            g(mi8.a(mi8VarF, mi8VarF2));
            mi8 mi8Var = this.b[gm0.A(16)];
            if (mi8Var != null) {
                f(mi8Var);
            }
            mi8 mi8Var2 = this.b[gm0.A(32)];
            if (mi8Var2 != null) {
                d(mi8Var2);
            }
            mi8 mi8Var3 = this.b[gm0.A(64)];
            if (mi8Var3 != null) {
                h(mi8Var3);
            }
        }
    }

    public abstract ixj b();

    public void c(int i, mi8 mi8Var) {
        if (this.b == null) {
            this.b = new mi8[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[gm0.A(i2)] = mi8Var;
            }
        }
    }

    public void d(mi8 mi8Var) {
    }

    public abstract void e(mi8 mi8Var);

    public void f(mi8 mi8Var) {
    }

    public abstract void g(mi8 mi8Var);

    public void h(mi8 mi8Var) {
    }

    public void i(int i, boolean z) {
    }

    public xwj(ixj ixjVar) {
        this.a = ixjVar;
    }
}
