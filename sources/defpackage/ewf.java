package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ewf {
    public final int a;
    public final tnh b;
    public final boolean c;

    public ewf(int i, tnh tnhVar, boolean z) {
        this.a = i;
        this.b = tnhVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewf)) {
            return false;
        }
        ewf ewfVar = (ewf) obj;
        return this.a == ewfVar.a && cqk.d(this.b, ewfVar.b) && this.c == ewfVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + zo5.c(this.b.c, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", isNegative=");
        return qt4.r(sb, this.c, ")");
    }
}
