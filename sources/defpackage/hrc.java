package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class hrc {
    public static final grc Companion = new grc();
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public /* synthetic */ hrc(int i, long j, long j2, long j3, ew5 ew5Var, ew5 ew5Var2) {
        long jP;
        long jP2;
        this.a = (i & 1) == 0 ? 25L : j;
        if ((i & 2) == 0) {
            ghb ghbVar = ew5.b;
            this.b = ew5.g(qe7.O(15, lw5.SECONDS));
        } else {
            this.b = j2;
        }
        if ((i & 4) == 0) {
            ghb ghbVar2 = ew5.b;
            this.c = ew5.g(qe7.O(3, lw5.DAYS));
        } else {
            this.c = j3;
        }
        int i2 = i & 8;
        lw5 lw5Var = lw5.MILLISECONDS;
        if (i2 == 0) {
            ghb ghbVar3 = ew5.b;
            jP = qe7.P(this.b, lw5Var);
        } else {
            jP = ew5Var.a;
        }
        this.d = jP;
        if ((i & 16) == 0) {
            ghb ghbVar4 = ew5.b;
            jP2 = qe7.P(this.c, lw5Var);
        } else {
            jP2 = ew5Var2.a;
        }
        this.e = jP2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrc)) {
            return false;
        }
        hrc hrcVar = (hrc) obj;
        return this.a == hrcVar.a && this.b == hrcVar.b && this.c == hrcVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qt4.g(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "PerfRegistrarServerSettings(maxAttemptsForPersistentMetric=", ", rawPersistInterval=");
        sbS.append(this.b);
        return zo5.k(this.c, ", rawCleanupThreshold=", ")", sbS);
    }

    public hrc() {
        ghb ghbVar = ew5.b;
        long jG = ew5.g(qe7.O(15, lw5.SECONDS));
        long jG2 = ew5.g(qe7.O(3, lw5.DAYS));
        this.a = 25L;
        this.b = jG;
        this.c = jG2;
        lw5 lw5Var = lw5.MILLISECONDS;
        this.d = qe7.P(jG, lw5Var);
        this.e = qe7.P(jG2, lw5Var);
    }
}
