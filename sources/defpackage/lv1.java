package defpackage;

import one.me.calllist.ui.callpresettings.CallPresettingsScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class lv1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CallPresettingsScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lv1(lq4 lq4Var, CallPresettingsScreen callPresettingsScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = callPresettingsScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        CallPresettingsScreen callPresettingsScreen = this.g;
        switch (i) {
            case 0:
                lv1 lv1Var = new lv1(lq4Var, callPresettingsScreen, 0);
                lv1Var.f = obj;
                return lv1Var;
            default:
                lv1 lv1Var2 = new lv1(lq4Var, callPresettingsScreen, 1);
                lv1Var2.f = obj;
                return lv1Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((lv1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((lv1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        CallPresettingsScreen callPresettingsScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                ((cyb) callPresettingsScreen.h.m(callPresettingsScreen, CallPresettingsScreen.i[2])).setVisibility(((mv1) obj2).a ? 0 : 8);
                break;
            default:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (rbbVar instanceof rt3) {
                    callPresettingsScreen.getRouter().C(callPresettingsScreen);
                } else if (rbbVar instanceof i65) {
                    pk1.b.e((i65) rbbVar);
                }
                break;
        }
        return sbiVar;
    }
}
