package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bj8 {
    public final long a;

    public static long a(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bj8) {
            return this.a == ((bj8) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.a;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return qt4.p(sb, (int) (j & 4294967295L), ')');
    }
}
