package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zkh {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final ThreadLocal e = new ThreadLocal();

    public zkh(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final void a() {
        ghb ghbVar = ew5.b;
        h4e h4eVar = i4e.a;
        this.e.set(new ew5(qe7.P(i4e.b.g(ew5.g(((ew5) oc9.s(new ew5(this.d), new ew5(0L))).a)), lw5.MILLISECONDS)));
    }

    public final String toString() {
        String strT = ew5.t(this.a);
        String strT2 = ew5.t(this.b);
        String strT3 = ew5.t(this.c);
        ew5 ew5Var = (ew5) this.e.get();
        return nbh.y(qv1.q("TcpConnectStrategy.Connect(totalTimeout=", strT, "|minTimeout=", strT2, "|stepTimeout="), strT3, "|nextDelay=", ew5.t(ew5Var != null ? ew5Var.a : 0L), ")");
    }
}
