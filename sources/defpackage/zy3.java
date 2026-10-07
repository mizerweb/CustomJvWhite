package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zy3 implements bz3 {
    public final q24 a;
    public final long b;
    public final yhh c;

    public zy3(q24 q24Var, long j, yhh yhhVar) {
        this.a = q24Var;
        this.b = j;
        this.c = yhhVar;
    }

    @Override // defpackage.bz3
    public final q24 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy3)) {
            return false;
        }
        zy3 zy3Var = (zy3) obj;
        return cqk.d(this.a, zy3Var.a) && this.b == zy3Var.b && cqk.d(this.c, zy3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qt4.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ErrorEvent(commentsId=" + this.a + ", id=" + this.b + ", tamError=" + this.c + ")";
    }
}
