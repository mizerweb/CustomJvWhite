package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class vq1 extends a8j {
    public final uq1 c;
    public final xu1 d;
    public final co1 e;
    public final pfb f;
    public final ny8 g;
    public final ny8 h;
    public volatile Long i;
    public final mjg j;
    public final r8e k;
    public final ny8 l;
    public final ic6 m;

    public vq1(uq1 uq1Var, xu1 xu1Var, co1 co1Var, pfb pfbVar, d92 d92Var, ny8 ny8Var, ny8 ny8Var2) {
        Object value;
        lq1 lq1Var;
        String str;
        long j;
        this.c = uq1Var;
        this.d = xu1Var;
        this.e = co1Var;
        this.f = pfbVar;
        this.g = ny8Var2;
        this.h = ny8Var;
        mjg mjgVarA = p90.a(lq1.l);
        this.j = mjgVarA;
        this.k = new r8e(mjgVarA);
        this.l = rx8.P(3, new yk1(5, this));
        this.m = new ic6(null);
        e9i.j0(new fz6(new q8e(d92Var.a), new in1(this, (lq4) null, 1), 3), this.b);
        if (uq1Var instanceof sq1) {
            D();
            return;
        }
        if (!(uq1Var instanceof tq1)) {
            ore.o();
            throw null;
        }
        tq1 tq1Var = (tq1) uq1Var;
        CharSequence charSequence = tq1Var.d;
        do {
            value = mjgVarA.getValue();
            lq1Var = (lq1) value;
            str = tq1Var.b;
            j = tq1Var.a;
        } while (!mjgVarA.h(value, lq1.a(lq1Var, co1Var.a(!tq1Var.c ? charSequence : null, Long.valueOf(j)), v3e.c(str), charSequence, new jq1(co1Var.b(str)), new xnh(charSequence), lq1.k, dq1.a, false, Long.valueOf(j), null, 1025)));
        r8e r8eVarL = ((xn3) this.h.getValue()).l(((tq1) this.c).a);
        ghb ghbVar = ew5.b;
        e9i.j0(e9i.G0(new fz6(e9i.H(tre.G0(r8eVarL, qe7.O(1, lw5.SECONDS)), new wf0(3)), new w8(2, this, vq1.class, "updateActions", "updateActions(Lru/ok/tamtam/chats/Chat;)V", 4, 4), 3), this.b, j0g.a, 0), this.b);
    }

    public final dcc B(Long l, boolean z) {
        return (((Boolean) this.l.getValue()).booleanValue() && l != null && z) ? new acc(null, new hcc(R.drawable.icon_edit, new m(25, this)), null) : ybc.a;
    }

    public final void C(long j) {
        long j2 = R.id.call_history_info_recreate;
        if (j == j2) {
            D();
            return;
        }
        r8e r8eVar = this.k;
        CharSequence charSequence = ((lq1) r8eVar.a.getValue()).b;
        ic6 ic6Var = this.m;
        if (charSequence == null) {
            a8j.x(ic6Var, new yn1(new tnh(R.string.call_history_link_action_error)));
            return;
        }
        if (j == R.id.call_history_info_open_chat_call) {
            Long l = ((lq1) r8eVar.a.getValue()).i;
            if (l != null) {
                long jLongValue = l.longValue();
                pk1.b.getClass();
                bc1.q(":chats?id=" + jLongValue + "&type=server", ic6Var);
                return;
            }
            return;
        }
        if (j == R.id.call_history_info_copy_link) {
            CharSequence charSequence2 = ((lq1) r8eVar.a.getValue()).b;
            if (charSequence2 != null) {
                a8j.x(ic6Var, new vn1(charSequence2));
                return;
            }
            return;
        }
        if (j == R.id.call_history_info_send_to_chat) {
            a8j.x(ic6Var, new wn1(charSequence));
            return;
        }
        if (j == R.id.call_history_info_share_link) {
            a8j.x(ic6Var, new xn1(charSequence));
            return;
        }
        if (j != R.id.call_history_info_start_call) {
            if (j == j2) {
                D();
            }
        } else {
            this.d.k(charSequence.toString(), !((lq1) r8eVar.a.getValue()).h, false, ((lq1) r8eVar.a.getValue()).h, new z2(this, 17, charSequence));
        }
    }

    public final void D() {
        if (((lq1) this.k.a.getValue()).b == null && this.i == null) {
            yab.i0(this.b, null, 0, new i26(this, (lq4) null, 28), 3);
            return;
        }
        String name = vq1.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            boolean z = ((lq1) this.k.a.getValue()).b != null;
            a4cVar.c(je9Var, name, "Skip creating call link: callLink=" + z + " createJoinLinkRequestId=" + this.i, null);
        }
    }
}
