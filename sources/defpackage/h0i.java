package defpackage;

import androidx.media3.transformer.ExportException;

/* JADX INFO: loaded from: classes3.dex */
public final class h0i implements e2i {
    public final /* synthetic */ ewe a;
    public final /* synthetic */ Long b;
    public final /* synthetic */ v56 c;
    public final /* synthetic */ rj5 d;

    public h0i(ewe eweVar, Long l, v56 v56Var, rj5 rj5Var) {
        this.a = eweVar;
        this.b = l;
        this.c = v56Var;
        this.d = rj5Var;
    }

    @Override // defpackage.e2i
    public final void a(nh6 nh6Var) {
        ((ze9) this.a.c).m("Transcoder", new bpg(21, nh6Var));
        int i = nh6Var.l;
        int i2 = nh6Var.k;
        int i3 = nh6Var.i;
        long j = nh6Var.c;
        long j2 = nh6Var.b;
        Long l = this.b;
        this.c.K(new xre(this.d, 28, new yzh(i, i2, i3, j, j2, l != null ? l.longValue() / 1000 : 0L, nh6Var.n)));
    }

    @Override // defpackage.e2i
    public final void b(k84 k84Var, nh6 nh6Var, ExportException exportException) {
        String strA = czl.a(nh6Var);
        String strE = exportException.e();
        lh6 lh6Var = exportException.b;
        StringBuilder sbQ = qv1.q("Transformer exception. Export result: ", strA, ", error code: ", strE, ", codec info: ");
        sbQ.append(lh6Var);
        String string = sbQ.toString();
        ((ze9) this.a.c).r("Transcoder", new nz7(string, 4), new bpg(22, exportException));
        this.c.K(new i8f(this.d, string, exportException, 6));
    }
}
