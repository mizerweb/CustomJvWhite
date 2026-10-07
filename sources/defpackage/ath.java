package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ath implements gpe {
    public final long b;
    public final gpe c;

    public ath(long j, gpe gpeVar) {
        qyj.h("Timeout must be non-negative.", j >= 0);
        this.b = j;
        this.c = gpeVar;
    }

    @Override // defpackage.gpe
    public final long a() {
        return this.b;
    }

    @Override // defpackage.gpe
    public final fpe b(zg2 zg2Var) {
        fpe fpeVarB = this.c.b(zg2Var);
        long j = this.b;
        return (j <= 0 || zg2Var.b < j - fpeVarB.a) ? fpeVarB : fpe.d;
    }
}
