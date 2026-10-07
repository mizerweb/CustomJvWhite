package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a99 {
    public final srb a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ b99 d;

    public a99(b99 b99Var, srb srbVar) {
        this.d = b99Var;
        this.a = srbVar;
    }

    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        b99 b99Var = this.d;
        int i2 = b99Var.c;
        b99Var.c = i + i2;
        if (!b99Var.d) {
            b99Var.d = true;
            while (true) {
                try {
                    int i3 = b99Var.c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        b99Var.g();
                    } else if (z3) {
                        b99Var.h();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    b99Var.d = false;
                    throw th;
                }
            }
            b99Var.d = false;
        }
        if (this.b) {
            b99Var.c(this);
        }
    }

    public void b() {
    }

    public boolean c(g19 g19Var) {
        return false;
    }

    public abstract boolean d();
}
