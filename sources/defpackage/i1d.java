package defpackage;

import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class i1d implements g32 {
    public final g1d a;
    public final l92 b;
    public ev1 c;
    public final mjg d;
    public final r8e e;
    public final ny8 f;

    public i1d(g1d g1dVar, l92 l92Var, io5 io5Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = g1dVar;
        this.b = l92Var;
        lq4 lq4Var = null;
        int i = 0;
        mjg mjgVarA = p90.a(new qgc(null, null, null, false, false, true, null, 4, false, null));
        this.d = mjgVarA;
        this.e = new r8e(mjgVarA);
        int i2 = 3;
        this.f = rx8.P(3, new w40(ny8Var5, 26));
        l92Var.f(this);
        e9i.j0(new fz6(g().e, new dz1(io5Var, null, 1), i2), (gu4) ny8Var.getValue());
        e9i.j0(e9i.T(new r07(new r07(e9i.I(new xc3(((w82) ny8Var3.getValue()).r, 24)), e9i.M0(((b95) ny8Var5.getValue()).i, new sh1(i2, lq4Var, 11)), new vqa(i2, lq4Var, 9), i), e9i.M0(((b95) ny8Var5.getValue()).i, new sh1(i2, lq4Var, 12)), new vc3(this, ny8Var2, lq4Var, 5), i), ((n0c) ((xhh) ny8Var4.getValue())).a()), (gu4) ny8Var.getValue());
    }

    public final void a(ev1 ev1Var) {
        this.c = ev1Var;
    }

    public final void e() {
        this.c = null;
    }

    public final r8e f() {
        return this.e;
    }

    public final lxi g() {
        return (lxi) this.f.getValue();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        super.onDestroyed(conversationDestroyedInfo);
        this.a.onDestroy();
        this.c = null;
    }
}
