package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oa0 {
    public static final oa0 d = new na0().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public oa0(na0 na0Var) {
        this.a = na0Var.a;
        this.b = na0Var.b;
        this.c = na0Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oa0.class != obj.getClass()) {
            return false;
        }
        oa0 oa0Var = (oa0) obj;
        return this.a == oa0Var.a && this.b == oa0Var.b && this.c == oa0Var.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
