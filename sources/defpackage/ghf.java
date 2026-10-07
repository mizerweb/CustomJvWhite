package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ghf {
    public final String a;
    public final int b;
    public final hhf c;

    public ghf(String str, int i, hhf hhfVar) {
        this.a = str;
        this.b = i;
        this.c = hhfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghf)) {
            return false;
        }
        ghf ghfVar = (ghf) obj;
        return cqk.d(this.a, ghfVar.a) && this.b == ghfVar.b && cqk.d(this.c, ghfVar.c);
    }

    public final int hashCode() {
        int iC = zo5.c(this.b, this.a.hashCode() * 31, 31);
        hhf hhfVar = this.c;
        return iC + (hhfVar == null ? 0 : hhfVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbR = c0a.r(this.b, "CacheKey(sender=", this.a, ", maxWidth=", ", verification=");
        sbR.append(this.c);
        sbR.append(")");
        return sbR.toString();
    }
}
