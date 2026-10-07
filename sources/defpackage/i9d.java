package defpackage;

import one.me.polls.screens.result.PollResultScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class i9d implements z8d {
    public final /* synthetic */ PollResultScreen a;

    public i9d(PollResultScreen pollResultScreen) {
        this.a = pollResultScreen;
    }

    @Override // defpackage.z8d
    public final void a() {
        zv8[] zv8VarArr = PollResultScreen.k;
        s9d s9dVarO1 = this.a.o1();
        a8j.x(s9dVarO1.t, new agc(s9dVarO1.c, s9dVarO1.d, s9dVarO1.e));
    }

    @Override // defpackage.z8d
    public final void b(long j) {
        zv8[] zv8VarArr = PollResultScreen.k;
        s9d s9dVarO1 = this.a.o1();
        if (j == ((s7f) s9dVarO1.h).t()) {
            a8j.x(s9dVarO1.u, new p3g(new tnh(R.string.self_profile_click)));
            return;
        }
        ic6 ic6Var = s9dVarO1.t;
        mad.b.getClass();
        bc1.q(":profile?id=" + j + "&type=contact", ic6Var);
    }

    @Override // defpackage.z8d
    public final void c(int i) {
        zv8[] zv8VarArr = PollResultScreen.k;
        s9d s9dVarO1 = this.a.o1();
        s9dVarO1.s.B(s9dVarO1, s9d.v[0], yab.h0(s9dVarO1.b, ((n0c) ((xhh) s9dVarO1.l.getValue())).a(), 2, new v11(s9dVarO1, i, null)));
    }
}
