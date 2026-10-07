package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class a4 {
    public b4[] a;
    public int b;
    public int c;
    public t7h d;

    public final gjg c() {
        t7h t7hVar;
        synchronized (this) {
            t7hVar = this.d;
            if (t7hVar == null) {
                int i = this.b;
                t7hVar = new t7h(1, Integer.MAX_VALUE, 2);
                t7hVar.a(Integer.valueOf(i));
                this.d = t7hVar;
            }
        }
        return t7hVar;
    }

    public final b4 e() {
        b4 b4VarF;
        t7h t7hVar;
        synchronized (this) {
            try {
                b4[] b4VarArrG = this.a;
                if (b4VarArrG == null) {
                    b4VarArrG = g();
                    this.a = b4VarArrG;
                } else if (this.b >= b4VarArrG.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(b4VarArrG, b4VarArrG.length * 2);
                    this.a = (b4[]) objArrCopyOf;
                    b4VarArrG = (b4[]) objArrCopyOf;
                }
                int i = this.c;
                do {
                    b4VarF = b4VarArrG[i];
                    if (b4VarF == null) {
                        b4VarF = f();
                        b4VarArrG[i] = b4VarF;
                    }
                    i++;
                    if (i >= b4VarArrG.length) {
                        i = 0;
                    }
                } while (!b4VarF.a(this));
                this.c = i;
                this.b++;
                t7hVar = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (t7hVar != null) {
            t7hVar.x(1);
        }
        return b4VarF;
    }

    public abstract b4 f();

    public abstract b4[] g();

    public final void i(b4 b4Var) {
        t7h t7hVar;
        int i;
        lq4[] lq4VarArrB;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                t7hVar = this.d;
                if (i2 == 0) {
                    this.c = 0;
                }
                lq4VarArrB = b4Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (lq4 lq4Var : lq4VarArrB) {
            if (lq4Var != null) {
                lq4Var.resumeWith(sbi.a);
            }
        }
        if (t7hVar != null) {
            t7hVar.x(-1);
        }
    }
}
