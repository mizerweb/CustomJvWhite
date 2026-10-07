package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class alh {
    public final ksh a;
    public final r70 b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public v44 g;
    public int h;
    public int i;

    public alh(pfh pfhVar, r70 r70Var, long j, long j2, long j3, long j4) {
        this.a = pfhVar;
        this.b = r70Var;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
    }

    public final long a() {
        v44 v44Var = this.g;
        if (v44Var == null) {
            ghb ghbVar = ew5.b;
            return 0L;
        }
        int i = this.i;
        if (i <= 0) {
            i = this.h;
        }
        ew5 ew5Var = new ew5(this.d);
        ew5 ew5Var2 = new ew5(this.e);
        this.b.getClass();
        return ew5.v(v44Var.l(r70.d(i, ew5Var, ew5Var2)).j());
    }

    public final String toString() {
        String strT = ew5.t(this.c);
        String strT2 = ew5.t(this.d);
        String strT3 = ew5.t(this.e);
        int i = this.h;
        int i2 = this.i;
        StringBuilder sbQ = qv1.q("TcpConnectStrategy.Dispatcher(\n                minConnDelay=", strT, "\n                tlsDelay=[", strT2, ", ");
        sbQ.append(strT3);
        sbQ.append("]\n                tlsState=(c=");
        sbQ.append(i);
        sbQ.append("|e=");
        sbQ.append(i2);
        sbQ.append(")\n            )\n            ");
        return s5h.x0(sbQ.toString());
    }
}
