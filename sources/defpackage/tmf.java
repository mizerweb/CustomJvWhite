package defpackage;

import ru.ok.tamtam.errors.ProtoStateException;

/* JADX INFO: loaded from: classes3.dex */
public final class tmf {
    public final rg9 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public tmf(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, rg9 rg9Var) {
        this.a = rg9Var;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
    }

    public final void a(long j, yhh yhhVar) {
        gm0.n("tmf", "onSessionInitFail, requestId=" + j + ", error = " + yhhVar);
        if ("session.state".equals(yhhVar.b)) {
            gm0.n("tmf", "session state error: " + yhhVar.c + " do nothing");
            return;
        }
        if (yhhVar instanceof thh) {
            if (((rnf) ((onf) this.c.getValue())).q == 2) {
                pvb pvbVar = (pvb) this.d.getValue();
                pvb.s(pvbVar, new qmf(pvbVar.u().a.g()));
                return;
            }
            return;
        }
        if ("proto.state".equals(yhhVar.b)) {
            ((t1c) ((ed6) this.b.getValue())).a(new ProtoStateException(yhhVar));
        }
        ((mih) this.e.getValue()).h();
        rg9 rg9Var = this.a;
        mg9 mg9Var = mg9.SESSION_RESTART;
        rg9 rg9Var2 = rg9.i;
        rg9Var.D(mg9Var, null);
    }
}
