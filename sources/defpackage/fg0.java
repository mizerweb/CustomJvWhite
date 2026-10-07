package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fg0 {
    public final long a;
    public final int b;

    public fg0(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final long a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg0)) {
            return false;
        }
        fg0 fg0Var = (fg0) obj;
        return this.a == fg0Var.a && this.b == fg0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = c0a.q(this.b, this.a, "AutoSavedEntity(attachId=", ", type=");
        sbQ.append(")");
        return sbQ.toString();
    }
}
