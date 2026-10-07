package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class si9 implements cu3, Iterable, uv8 {
    public final long a;
    public final long b;
    public final long c;

    public si9(long j, long j2, boolean z) {
        this.a = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.b = j2;
        this.c = 1L;
    }

    @Override // defpackage.cu3
    public final Comparable a() {
        return Long.valueOf(this.a);
    }

    @Override // defpackage.cu3
    public final Comparable b() {
        return Long.valueOf(this.b);
    }

    public final long c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof si9)) {
            return false;
        }
        if (isEmpty() && ((si9) obj).isEmpty()) {
            return true;
        }
        si9 si9Var = (si9) obj;
        return this.a == si9Var.a && this.b == si9Var.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.a;
        long j2 = 31 * (j ^ (j >>> 32));
        long j3 = this.b;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    @Override // defpackage.cu3
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ri9(this.a, this.b, this.c);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }

    public si9(long j, long j2) {
        this(j, j2, false);
    }
}
