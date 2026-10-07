package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s98 implements i1e {
    public static final s98 d;
    public int a;
    public boolean b;
    public boolean c;

    static {
        s98 s98Var = new s98();
        s98Var.a = Integer.MAX_VALUE;
        s98Var.b = true;
        s98Var.c = true;
        d = s98Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s98)) {
            return false;
        }
        s98 s98Var = (s98) obj;
        return this.a == s98Var.a && this.b == s98Var.b && this.c == s98Var.c;
    }

    public final int hashCode() {
        return (this.a ^ (this.b ? 4194304 : 0)) ^ (this.c ? 8388608 : 0);
    }
}
