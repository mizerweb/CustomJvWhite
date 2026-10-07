package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m9f implements q9f {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public m9f(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9f)) {
            return false;
        }
        m9f m9fVar = (m9f) obj;
        return this.a == m9fVar.a && this.b == m9fVar.b && this.c == m9fVar.c && this.d == m9fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + nbh.n(zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return bc1.m(", hasAfter=", ")", qv1.p("Active(totalMessages=", this.a, ", selectMessagePosition=", this.b, ", hasPrev="), this.c, this.d);
    }
}
