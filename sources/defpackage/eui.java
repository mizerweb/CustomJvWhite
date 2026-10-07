package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eui extends aq implements qih {
    public final long f;
    public final int g;
    public final boolean h;
    public final String i;

    public eui(long j, long j2, boolean z) {
        super(j);
        this.f = j2;
        this.g = 100;
        this.h = z;
        this.i = eui.class.getName();
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        fui fuiVar = (fui) kihVar;
        lw8 lw8Var = new lw8();
        long j = 0;
        long j2 = 0;
        for (pj1 pj1Var : fuiVar.c) {
            qw2 qw2VarP = p();
            long j3 = pj1Var.a;
            gda gdaVar = pj1Var.b;
            rt2 rt2VarK = qw2VarP.K(j3);
            if (j == 0 || gdaVar.b < j) {
                j = gdaVar.b;
            }
            if (j2 == 0 || gdaVar.b > j2) {
                j2 = gdaVar.b;
            }
            if (rt2VarK != null) {
                bq bqVar = this.e;
                if (bqVar == null) {
                    bqVar = null;
                }
                uoa.a(((n25) bqVar.T.getValue()).c(), rt2VarK.a, gdaVar, t().a.t());
            } else {
                lw8Var.a(Long.valueOf(pj1Var.a), Long.valueOf(gdaVar.a));
            }
        }
        String strK = vd7.K(Long.valueOf(j));
        String strK2 = vd7.K(Long.valueOf(j2));
        int iB = lw8Var.b();
        StringBuilder sbQ = qv1.q("onSuccess: startTime: ", strK, " endTime: ", strK2, " missedMessages: ");
        sbQ.append(iB);
        gm0.n(this.i, sbQ.toString());
        o().c(new gui(this.a, j, j2, fuiVar.d, fuiVar.e, fuiVar.f, lw8Var));
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        o().c(new yq0(this.a, yhhVar));
    }

    @Override // defpackage.aq
    public final Object m() {
        lrg lrgVar = new lrg((kfc) null, 10);
        long j = this.f;
        if (j > 0) {
            lrgVar.f(j, "marker");
        }
        lrgVar.c(this.g, "count");
        lrgVar.a("forward", this.h);
        return lrgVar;
    }
}
