package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p4d {
    public static final p4d d = new p4d(0, 0, null);
    public final int a;
    public final long b;
    public final Long c;

    public p4d(int i, long j, Long l) {
        this.a = i;
        this.b = j;
        this.c = l;
    }

    public final int a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final p4d c(long j) {
        Long lValueOf;
        Long l = this.c;
        if (l == null) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf((j - this.b) + l.longValue());
        }
        return new p4d(this.a, j, lValueOf);
    }

    public final String toString() {
        StringBuilder sbX = zo5.x(this.a, this.b, "itemIndex: ", ", position: ");
        sbX.append(" real: ");
        sbX.append(this.c);
        return sbX.toString();
    }

    public p4d(int i, long j) {
        this(i, j, null);
    }
}
