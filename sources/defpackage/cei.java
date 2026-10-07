package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cei {
    public final long a;
    public final c46 b;
    public final int c;

    public cei(long j, c46 c46Var, int i) {
        this.a = j;
        this.b = c46Var;
        this.c = i;
    }

    public final c46 a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cei)) {
            return false;
        }
        cei ceiVar = (cei) obj;
        return this.a == ceiVar.a && cqk.d(this.b, ceiVar.b) && this.c == ceiVar.c;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        c46 c46Var = this.b;
        return Integer.hashCode(this.c) + ((iHashCode + (c46Var == null ? 0 : c46Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateAttachesEntity(id=");
        sb.append(this.a);
        sb.append(", attaches=");
        sb.append(this.b);
        return qv1.o(sb, ", mediaType=", this.c, ")");
    }
}
