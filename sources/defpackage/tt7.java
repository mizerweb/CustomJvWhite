package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tt7 {
    public final ny8 a;
    public final ny8 b;

    public tt7(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public final boolean a(sfa sfaVar) {
        sfa sfaVar2;
        if (!((nni) this.b.getValue()).m() || !sfaVar.E()) {
            return false;
        }
        while (true) {
            sfaVar2 = sfaVar.q;
            if (!sfaVar.E() || sfaVar2.J == 4) {
                break;
            }
            sfaVar = sfaVar2;
        }
        if (!sfaVar.E()) {
            return false;
        }
        rt2 rt2Var = (rt2) ((xn3) this.a.getValue()).l(sfaVar.p).a.getValue();
        if (!(sfaVar.E() && (sfaVar2.B & 4) == 4) && (rt2Var == null || !rt2Var.b.I.j)) {
            return false;
        }
        return rt2Var == null || !rt2Var.A0();
    }
}
