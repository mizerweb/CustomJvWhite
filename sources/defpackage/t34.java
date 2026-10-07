package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t34 {
    public final t51 a;
    public final pzf b = e9i.b(0, 0, 7);
    public final ny8 c;
    public final dq4 d;

    public t34(t51 t51Var, xhh xhhVar, ny8 ny8Var) {
        this.a = t51Var;
        this.c = ny8Var;
        this.d = cqk.a(((n0c) xhhVar).a());
        t51Var.d(this);
    }

    public final void a(r34 r34Var) {
        yab.i0(this.d, null, 0, new k23(this, r34Var, null, 25), 3);
    }

    @l7h
    public final void onAddChatEvent(xa xaVar) {
        a(new p34(xaVar.b));
    }

    @l7h
    public final void onChatMembersUpdateEvent(g73 g73Var) {
        long j = g73Var.d;
        int iOrdinal = g73Var.e.ordinal();
        if (iOrdinal == 0) {
            a(new p34(j));
        } else if (iOrdinal == 1) {
            a(new q34(j));
        } else {
            ore.o();
        }
    }

    @l7h
    public final void onIncomingMessageEvent(lc8 lc8Var) {
        if (lc8Var.f) {
            yab.i0(this.d, null, 0, new fze(lc8Var, this, (lq4) null, 20), 3);
        }
    }

    @l7h
    public final void onLeaveChatEvent(l03 l03Var) {
        a(new q34(l03Var.b));
    }

    @l7h
    public final void onRemoveChatEvent(pie pieVar) {
        a(new q34(pieVar.b));
    }
}
