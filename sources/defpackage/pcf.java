package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pcf {
    public final j71 a;
    public qmc b;
    public long d;
    public Executor c = new sv(1);
    public long e = -9223372036854775807L;

    public pcf(j71 j71Var, qmc qmcVar) {
        this.a = j71Var;
        this.b = qmcVar;
    }

    public abstract tcf a(ry9 ry9Var);

    public abstract pcf b(long j);

    public abstract pcf c(Executor executor);

    public abstract pcf d(long j);
}
