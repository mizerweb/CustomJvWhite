package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nu0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final double e;
    public final double f;
    public final double g;
    public final wu0 h;
    public final wu0 i;

    public nu0(long j, long j2, long j3, long j4, double d, double d2, double d3, wu0 wu0Var, wu0 wu0Var2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = d;
        this.f = d2;
        this.g = d3;
        this.h = wu0Var;
        this.i = wu0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu0)) {
            return false;
        }
        nu0 nu0Var = (nu0) obj;
        return ew5.f(this.a, nu0Var.a) && ew5.f(this.b, nu0Var.b) && ew5.f(this.c, nu0Var.c) && ew5.f(this.d, nu0Var.d) && Double.compare(this.e, nu0Var.e) == 0 && Double.compare(this.f, nu0Var.f) == 0 && Double.compare(this.g, nu0Var.g) == 0 && this.h.equals(nu0Var.h) && this.i.equals(nu0Var.i);
    }

    public final int hashCode() {
        ghb ghbVar = ew5.b;
        return this.i.hashCode() + ((this.h.hashCode() + ((Double.hashCode(this.g) + ((Double.hashCode(this.f) + ((Double.hashCode(this.e) + qt4.g(qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String strT = ew5.t(this.a);
        String strT2 = ew5.t(this.b);
        String strT3 = ew5.t(this.c);
        String strT4 = ew5.t(this.d);
        StringBuilder sbQ = qv1.q("BatteryMetricReport(estimatedRealtime=", strT, ", cachedTime=", strT2, ", fgTime=");
        nbh.G(sbQ, strT3, ", bgTime=", strT4, ", clkTck=");
        sbQ.append(this.e);
        sbQ.append(", fgScore=");
        sbQ.append(this.f);
        sbQ.append(", bgScore=");
        sbQ.append(this.g);
        sbQ.append(", fgDiff=");
        sbQ.append(this.h);
        sbQ.append(", bgDiff=");
        sbQ.append(this.i);
        sbQ.append(")");
        return sbQ.toString();
    }
}
