package defpackage;

import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class k5g {
    public final tx a;
    public final so2 b;
    public final l6m c;
    public final dul d;
    public final wmc e;
    public final ljf f;
    public final kzi g;
    public final iw8 h;
    public final cnc i;
    public final tx j;
    public final wmc k;
    public final tx l;
    public final g85 m;
    public final dc9 n;
    public final ewe o;
    public final wze p;
    public final xva q;

    public k5g(CidLogger cidLogger, du1 du1Var, zq1 zq1Var) {
        tx txVar = new tx(cidLogger);
        this.a = txVar;
        this.b = new so2(19);
        l6m l6mVar = new l6m(25);
        this.c = l6mVar;
        this.d = new dul(19);
        cnc cncVar = new cnc(cidLogger);
        wmc wmcVar = new wmc(cidLogger);
        this.e = wmcVar;
        ljf ljfVar = new ljf(cidLogger, du1Var, zq1Var, txVar, wmcVar);
        this.f = ljfVar;
        kzi kziVar = new kzi(cidLogger, ljfVar, false);
        this.g = kziVar;
        iw8 iw8Var = new iw8(8);
        this.h = iw8Var;
        cnc cncVar2 = new cnc(cidLogger, iw8Var);
        this.i = cncVar2;
        this.j = new tx(cidLogger, iw8Var);
        wmc wmcVar2 = new wmc(cidLogger, iw8Var);
        this.k = wmcVar2;
        this.l = new tx(cidLogger);
        g85 g85Var = new g85();
        g85Var.a = cidLogger;
        g85Var.b = cncVar;
        g85Var.c = kziVar;
        g85Var.d = cncVar2;
        g85Var.e = wmcVar2;
        this.m = g85Var;
        this.n = new dc9(cidLogger, iw8Var, cncVar, ljfVar);
        this.o = new ewe(cidLogger, iw8Var, g85Var);
        this.p = new wze(cidLogger, l6mVar, cncVar);
        this.q = new xva(10, cidLogger);
    }
}
