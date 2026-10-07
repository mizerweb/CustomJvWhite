package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class i76 extends mdh implements xf7 {
    public int e;
    public /* synthetic */ ylc f;
    public /* synthetic */ rt2 g;
    public /* synthetic */ tlg h;
    public /* synthetic */ vg4 i;
    public /* synthetic */ eic j;
    public final /* synthetic */ k76 k;
    public final /* synthetic */ t73 l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i76(k76 k76Var, t73 t73Var, boolean z, lq4 lq4Var) {
        super(6, lq4Var);
        this.k = k76Var;
        this.l = t73Var;
        this.m = z;
    }

    @Override // defpackage.xf7
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        t73 t73Var = this.l;
        boolean z = this.m;
        i76 i76Var = new i76(this.k, t73Var, z, (lq4) obj6);
        i76Var.f = (ylc) obj;
        i76Var.g = (rt2) obj2;
        i76Var.h = (tlg) obj3;
        i76Var.i = (vg4) obj4;
        i76Var.j = (eic) obj5;
        return i76Var.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i;
        Object objB;
        ylc ylcVar = this.f;
        rt2 rt2Var = this.g;
        tlg tlgVar = this.h;
        vg4 vg4Var = this.i;
        eic eicVar = this.j;
        int i2 = this.e;
        if (i2 == 0) {
            ch3.d0(obj);
            boolean zBooleanValue = ((Boolean) ylcVar.a).booleanValue();
            boolean zBooleanValue2 = ((Boolean) ylcVar.b).booleanValue();
            k76 k76Var = this.k;
            if (((jcd) k76Var.c.getValue()).c(rt2Var, vg4Var)) {
                return new f76(new tnh(jcd.b((jcd) k76Var.c.getValue(), rt2Var, 2)), new tnh(R.string.chat_screen_portal_blocked_empty_subtitle), new tnh(R.string.chat_screen_portal_blocked_empty_subtitle_footer));
            }
            if ((zBooleanValue || zBooleanValue2) && this.l.i()) {
                if (rt2Var.d0()) {
                    i = R.string.scheduled_chat_screen_empty_posts;
                } else {
                    i = rt2Var.y0() ? R.string.scheduled_chat_screen_empty_reminders : R.string.scheduled_chat_screen_empty_messages;
                }
                return new g76(new tnh(i));
            }
            rs0 rs0Var = rs0.a;
            us0 us0Var = us0.c;
            if (zBooleanValue && rt2Var.t0() && !rt2Var.b.K.i(64)) {
                hi4 hi4Var = vg4Var != null ? vg4Var.a.b.v : null;
                tnh tnhVar = new tnh(R.string.chat_screen__bot_empty_state__title);
                tnh tnhVar2 = new tnh(R.string.chat_screen__bot_empty_state__subtitle);
                if (hi4Var != null) {
                    return k76.a(k76Var, hi4Var, rt2Var, tnhVar, tnhVar2);
                }
                k76Var.getClass();
                String strS = rt2Var.s(us0Var, rs0Var);
                vg4 vg4VarW = rt2Var.w();
                return new d76(strS, vg4VarW != null ? vg4VarW.u() : null, rt2Var.q(), null, tnhVar, tnhVar2, false, hi4Var);
            }
            if (zBooleanValue && rt2Var.b0() && !rt2Var.b.K.i(64)) {
                hi4 hi4Var2 = vg4Var != null ? vg4Var.a.b.v : null;
                tnh tnhVar3 = new tnh(R.string.chat_screen__bot_cleared_history_state__title);
                tnh tnhVar4 = new tnh(R.string.chat_screen__bot_cleared_history__subtitle);
                if (hi4Var2 != null) {
                    return k76.a(k76Var, hi4Var2, rt2Var, tnhVar3, tnhVar4);
                }
                k76Var.getClass();
                String strS2 = rt2Var.s(us0Var, rs0Var);
                vg4 vg4VarW2 = rt2Var.w();
                return new d76(strS2, vg4VarW2 != null ? vg4VarW2.u() : null, rt2Var.q(), null, tnhVar3, tnhVar4, false, hi4Var2);
            }
            if ((!zBooleanValue && !zBooleanValue2) || !rt2Var.h0() || rt2Var.b0() || rt2Var.a0() || rt2Var.y0() || (this.m && eicVar != null)) {
                return null;
            }
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.e = 1;
            objB = k76.b(k76Var, vg4Var, tlgVar, this);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            objB = obj;
        }
        return (h76) objB;
    }
}
