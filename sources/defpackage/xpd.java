package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class xpd extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ dqd g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xpd(dqd dqdVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = dqdVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        dqd dqdVar = this.g;
        switch (i) {
            case 0:
                xpd xpdVar = new xpd(dqdVar, lq4Var, 0);
                xpdVar.f = obj;
                return xpdVar;
            default:
                xpd xpdVar2 = new xpd(dqdVar, lq4Var, 1);
                xpdVar2.f = obj;
                return xpdVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((xpd) create((ipd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((xpd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        dqd dqdVar = this.g;
        sbi sbiVar = sbi.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ipd ipdVar = (ipd) obj2;
                ch3.d0(obj);
                if (ipdVar instanceof gpd) {
                    Long l = ((gpd) ipdVar).a;
                    if (l.longValue() == dqdVar.s.get()) {
                        a8j.x(dqdVar.z, new qpd(R.drawable.icon_check_round_fill, new tnh(R.string.profile_invite_chat_link_update_action_success)));
                    }
                }
                break;
            default:
                gu4 gu4Var = (gu4) obj2;
                ch3.d0(obj);
                zv8[] zv8VarArr = dqd.B;
                rt2 rt2VarC = dqdVar.C();
                if (rt2VarC != null && rt2VarC.w0()) {
                    if (rt2VarC.A() != 0) {
                        dqdVar.s.set(((pvb) dqdVar.f.getValue()).g(rt2VarC.a, rt2VarC.A(), 0, null, true, null));
                    } else {
                        gm0.Y(gu4Var.getClass().getName(), "Try update revokePrivateLink with charServerId == 0");
                        ((iv4) dqdVar.m.getValue()).a("ONEME-18920", new IllegalArgumentException("Try update revokePrivateLink with charServerId == 0. ProfileInvite"));
                    }
                }
                break;
        }
        return sbiVar;
    }
}
