package defpackage;

import one.me.polls.screens.result.voterslist.PollAnswerVotersListScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class f6d implements z8d {
    public final /* synthetic */ PollAnswerVotersListScreen a;

    public f6d(PollAnswerVotersListScreen pollAnswerVotersListScreen) {
        this.a = pollAnswerVotersListScreen;
    }

    @Override // defpackage.z8d
    public final void b(long j) {
        zv8[] zv8VarArr = PollAnswerVotersListScreen.n;
        l6d l6dVarO1 = this.a.o1();
        if (j == ((s7f) l6dVarO1.f).t()) {
            a8j.x(l6dVarO1.r, new p3g(new tnh(R.string.self_profile_click)));
            return;
        }
        ic6 ic6Var = l6dVarO1.q;
        mad.b.getClass();
        bc1.q(":profile?id=" + j + "&type=contact", ic6Var);
    }
}
