package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class e2 implements v44 {
    public final long a;
    public final f2 b;
    public final long c;

    public e2(long j, f2 f2Var, long j2) {
        this.a = j;
        this.b = f2Var;
        this.c = j2;
    }

    @Override // defpackage.v44
    public final long c(v44 v44Var) {
        if (v44Var instanceof e2) {
            e2 e2Var = (e2) v44Var;
            f2 f2Var = e2Var.b;
            f2 f2Var2 = this.b;
            if (f2Var2.equals(f2Var)) {
                return ew5.p(wk8.C(this.a, e2Var.a, (lw5) f2Var2.a), ew5.o(this.c, e2Var.c));
            }
        }
        c.v("Subtracting or comparing time marks from different time sources is not possible: ", this, " and ", v44Var);
        return 0L;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ int compareTo(Object obj) {
        return pnl.c(this, (v44) obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e2) {
            return this.b.equals(((e2) obj).b) && ew5.f(c((v44) obj), 0L);
        }
        return false;
    }

    public final int hashCode() {
        ghb ghbVar = ew5.b;
        return Long.hashCode(this.a) + (Long.hashCode(this.c) * 37);
    }

    @Override // defpackage.v44
    public final long j() {
        f2 f2Var = this.b;
        return ew5.o(wk8.C(f2Var.h() - ((Number) ((ifh) f2Var.b).getValue()).longValue(), this.a, (lw5) f2Var.a), this.c);
    }

    @Override // defpackage.v44
    public final v44 l(long j) {
        f2 f2Var = this.b;
        lw5 lw5Var = (lw5) f2Var.a;
        boolean zK = ew5.k(j);
        long j2 = this.a;
        if (zK) {
            return new e2(wk8.A(j2, j, lw5Var), f2Var, 0L);
        }
        long jU = ew5.u(j, lw5Var);
        long jP = ew5.p(ew5.o(j, jU), this.c);
        long jA = wk8.A(j2, jU, lw5Var);
        long jU2 = ew5.u(jP, lw5Var);
        long jA2 = wk8.A(jA, jU2, lw5Var);
        long jO = ew5.o(jP, jU2);
        long jH = ew5.h(jO);
        if (jA2 != 0 && jH != 0 && (jA2 ^ jH) < 0) {
            long jO2 = qe7.O(Long.signum(jH), lw5Var);
            jA2 = wk8.A(jA2, jO2, lw5Var);
            jO = ew5.o(jO, jO2);
        }
        return new e2(jA2, f2Var, (1 | (jA2 - 1)) == BuildConfig.MAX_TIME_TO_UPLOAD ? 0L : jO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LongTimeMark(");
        sb.append(this.a);
        f2 f2Var = this.b;
        sb.append(sb8.n0((lw5) f2Var.a));
        sb.append(" + ");
        sb.append((Object) ew5.t(this.c));
        sb.append(", ");
        sb.append(f2Var);
        sb.append(')');
        return sb.toString();
    }
}
