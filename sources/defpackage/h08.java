package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class h08 implements mdg {
    public final oa7 a;
    public boolean b;
    public final /* synthetic */ ma c;

    public h08(ma maVar) {
        this.c = maVar;
        this.a = new oa7(((y41) maVar.d).m());
    }

    @Override // defpackage.mdg
    public long S(long j, l31 l31Var) {
        ma maVar = this.c;
        try {
            return ((y41) maVar.d).S(j, l31Var);
        } catch (IOException e) {
            ((c9e) maVar.c).k();
            l();
            throw e;
        }
    }

    public final void l() {
        ma maVar = this.c;
        int i = maVar.a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            qr7.g(maVar.a, "state: ");
            return;
        }
        oa7 oa7Var = this.a;
        xsh xshVar = oa7Var.e;
        oa7Var.e = xsh.d;
        xshVar.a();
        xshVar.b();
        maVar.a = 6;
    }

    @Override // defpackage.mdg
    public final xsh m() {
        return this.a;
    }
}
