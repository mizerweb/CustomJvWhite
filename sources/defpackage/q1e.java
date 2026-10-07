package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q1e {
    public final ry9 a;
    public final long b;
    public final long c;

    public q1e(ry9 ry9Var, long j, long j2) {
        this.a = ry9Var;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1e)) {
            return false;
        }
        q1e q1eVar = (q1e) obj;
        return this.b == q1eVar.b && this.a.equals(q1eVar.a) && this.c == q1eVar.c;
    }

    public final int hashCode() {
        long j = this.b;
        int iHashCode = (this.a.hashCode() + ((217 + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        long j2 = this.c;
        return iHashCode + ((int) ((j2 >>> 32) ^ j2));
    }
}
