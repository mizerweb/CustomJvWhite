package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class rd7 {
    public static final qd7 Companion = new qd7();
    public final long a;
    public final long b;

    public rd7(int i, long j, long j2) {
        this.a = (i & 1) == 0 ? 20971520L : j;
        if ((i & 2) == 0) {
            this.b = 524288000L;
        } else {
            this.b = j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd7)) {
            return false;
        }
        rd7 rd7Var = (rd7) obj;
        return this.a == rd7Var.a && this.b == rd7Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return c0a.m(this.b, ")", qt4.s(this.a, "FreeSpaceThreshold(critical=", ", dangerous="));
    }

    public rd7() {
        this.a = 20971520L;
        this.b = 524288000L;
    }
}
