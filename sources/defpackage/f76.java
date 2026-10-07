package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f76 implements h76 {
    public final tnh a;
    public final tnh b;
    public final tnh c;

    public f76(tnh tnhVar, tnh tnhVar2, tnh tnhVar3) {
        this.a = tnhVar;
        this.b = tnhVar2;
        this.c = tnhVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f76)) {
            return false;
        }
        f76 f76Var = (f76) obj;
        return this.a.equals(f76Var.a) && this.b.equals(f76Var.b) && this.c.equals(f76Var.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.c) + zo5.c(this.b.c, Integer.hashCode(this.a.c) * 31, 31);
    }

    public final String toString() {
        return "PortalBlocked(title=" + this.a + ", subtitle=" + this.b + ", subtitleFooter=" + this.c + ")";
    }
}
