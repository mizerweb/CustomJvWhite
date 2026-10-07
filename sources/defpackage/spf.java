package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class spf {
    public final tnh a;
    public final int b;
    public final boolean c;

    public spf(int i, tnh tnhVar, boolean z) {
        this.a = tnhVar;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spf)) {
            return false;
        }
        spf spfVar = (spf) obj;
        return cqk.d(this.a, spfVar.a) && this.b == spfVar.b && this.c == spfVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + zo5.c(this.b, Integer.hashCode(this.a.c) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(title=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", isNegative=");
        return qt4.r(sb, this.c, ")");
    }
}
