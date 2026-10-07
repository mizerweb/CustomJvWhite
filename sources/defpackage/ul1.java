package defpackage;

import java.util.List;
import one.me.calllist.ui.CallHistoryScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class ul1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CallHistoryScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ul1(lq4 lq4Var, CallHistoryScreen callHistoryScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = callHistoryScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        CallHistoryScreen callHistoryScreen = this.g;
        switch (i) {
            case 0:
                ul1 ul1Var = new ul1(lq4Var, callHistoryScreen, 0);
                ul1Var.f = obj;
                return ul1Var;
            default:
                ul1 ul1Var2 = new ul1(lq4Var, callHistoryScreen, 1);
                ul1Var2.f = obj;
                return ul1Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((ul1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((ul1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        CallHistoryScreen callHistoryScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                k92 k92Var = (k92) obj2;
                callHistoryScreen.u.b = k92Var.a;
                dl1 dl1Var = callHistoryScreen.v;
                y8j y8jVarO1 = callHistoryScreen.o1();
                List list = k92Var.a;
                if (!dl1Var.m.isEmpty() || list.isEmpty()) {
                    wre wreVar = new wre(dl1Var, list, tre.J(new wk1(0, dl1Var.m, list)), 1);
                    qo7 qo7Var = new qo7(29, dl1Var);
                    if (y8jVarO1.isInLayout()) {
                        y8jVarO1.post(new vk1(dl1Var, y8jVarO1, 0, wreVar, qo7Var, 0));
                    } else {
                        wreVar.invoke();
                    }
                } else {
                    dl1Var.m = list;
                    dl1Var.r(0, list.size());
                }
                j8e j8eVar = callHistoryScreen.p;
                zv8[] zv8VarArr = CallHistoryScreen.D;
                List list2 = list;
                ((aac) j8eVar.m(callHistoryScreen, zv8VarArr[2])).setVisibility(!list2.isEmpty() ? 0 : 8);
                callHistoryScreen.o1().setVisibility(!list2.isEmpty() ? 0 : 8);
                callHistoryScreen.t1(!list2.isEmpty());
                callHistoryScreen.u1(k92Var);
                ((pzb) callHistoryScreen.r.m(callHistoryScreen, zv8VarArr[4])).setVisibility(k92Var.b ? 0 : 8);
                if (!list.isEmpty()) {
                    callHistoryScreen.s1(callHistoryScreen.o1().getCurrentItem());
                }
                break;
            default:
                ch3.d0(obj);
                if (!((o5b) obj2).a) {
                    zv8[] zv8VarArr2 = CallHistoryScreen.D;
                    callHistoryScreen.t1(!((k92) callHistoryScreen.r1().l.getValue()).a.isEmpty());
                }
                break;
        }
        return sbiVar;
    }
}
