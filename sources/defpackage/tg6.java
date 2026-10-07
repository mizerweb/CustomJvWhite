package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tg6 {
    public final long a;
    public final long b;

    public /* synthetic */ tg6() {
        this(-1L, -9223372036854775807L);
    }

    public final boolean a() {
        return this.a == -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg6)) {
            return false;
        }
        tg6 tg6Var = (tg6) obj;
        return this.a == tg6Var.a && this.b == tg6Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        if (a()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.a + "]");
        long j = this.b;
        if (j != -9223372036854775807L) {
            sb.append(" ");
            sb.append(vqi.p0(j));
            sb.append(" ms");
        }
        return sb.toString();
    }

    public tg6(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
