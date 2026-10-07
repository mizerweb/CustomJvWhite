package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class z8a {
    public final pzf a = e9i.b(0, 0, 7);
    public final dq4 b;

    public z8a(t51 t51Var, xhh xhhVar) {
        this.b = cqk.a(((n0c) xhhVar).a());
        t51Var.d(this);
    }

    public final void a(x8a x8aVar) {
        yab.i0(this.b, null, 0, new y8a(this, x8aVar, null, 1), 3);
    }

    @l7h
    public final void onChatMembersUpdateEvent(g73 g73Var) {
        x8a u8aVar;
        List list = g73Var.b;
        p63 p63Var = g73Var.c;
        long j = g73Var.d;
        int iOrdinal = g73Var.e.ordinal();
        if (iOrdinal == 0) {
            u8aVar = new u8a(j, p63Var, list);
        } else {
            if (iOrdinal != 1) {
                ore.o();
                return;
            }
            u8aVar = new w8a(j, p63Var, list);
        }
        yab.i0(this.b, null, 0, new y8a(this, u8aVar, null, 0), 3);
    }

    @l7h
    public final void onEvent(so4 so4Var) {
        yab.i0(this.b, null, 0, new af8(this, so4Var, (lq4) null, 14), 3);
    }
}
