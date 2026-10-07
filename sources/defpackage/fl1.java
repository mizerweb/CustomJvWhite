package defpackage;

import android.view.View;
import android.view.ViewParent;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fl1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CallHistoryPageScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fl1(lq4 lq4Var, CallHistoryPageScreen callHistoryPageScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = callHistoryPageScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        CallHistoryPageScreen callHistoryPageScreen = this.g;
        switch (i) {
            case 0:
                fl1 fl1Var = new fl1(lq4Var, callHistoryPageScreen, 0);
                fl1Var.f = obj;
                return fl1Var;
            case 1:
                fl1 fl1Var2 = new fl1(lq4Var, callHistoryPageScreen, 1);
                fl1Var2.f = obj;
                return fl1Var2;
            default:
                fl1 fl1Var3 = new fl1(callHistoryPageScreen, lq4Var);
                fl1Var3.f = obj;
                return fl1Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((fl1) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((fl1) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((fl1) create((slc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int iD;
        int i = this.e;
        sbi sbiVar = sbi.a;
        int size = 0;
        CallHistoryPageScreen callHistoryPageScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                er3 er3Var = CallHistoryPageScreen.l;
                ny8 ny8Var = callHistoryPageScreen.k;
                ((jcd) ny8Var.getValue()).getClass();
                br4 parentController = callHistoryPageScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                View view = parentController.getView();
                ViewParent parent = view != null ? view.getParent() : null;
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 != null) {
                    txb.h.getClass();
                    iD = nhb.d(view2);
                } else {
                    iD = 0;
                }
                int iB = zo5.b(12.0f, yl5.d().getDisplayMetrics().density, iD);
                h8c h8cVar = new h8c(callHistoryPageScreen);
                h8cVar.m(new tnh(R.string.portal_blocked_profile_with_reason));
                h8cVar.c(new o8c(0, 0, iB, 11));
                ((jcd) ny8Var.getValue()).getClass();
                h8cVar.h(new w8c(R.drawable.ic_block_24));
                h8cVar.p();
                return sbiVar;
            case 1:
                ch3.d0(obj);
                er3 er3Var2 = CallHistoryPageScreen.l;
                cl1 cl1Var = (cl1) callHistoryPageScreen.i.getValue();
                boolean z = ((o5b) obj2).a;
                if (cl1Var.h != z) {
                    cl1Var.h = z;
                    if (cl1Var.l() > 0) {
                        cl1Var.q(0, cl1Var.l(), new bl1(z));
                    }
                }
                return sbiVar;
            default:
                slc slcVar = (slc) obj2;
                ch3.d0(obj);
                if (!cqk.d(slcVar, rlc.a)) {
                    if (!(slcVar instanceof qlc)) {
                        ore.o();
                        return null;
                    }
                    LinkedHashMap linkedHashMap = ((qlc) slcVar).a;
                    er3 er3Var3 = CallHistoryPageScreen.l;
                    cl1 cl1Var2 = (cl1) callHistoryPageScreen.i.getValue();
                    Collection collectionValues = linkedHashMap.values();
                    cl1Var2.getClass();
                    cl1Var2.H(ww3.T1(collectionValues));
                    callHistoryPageScreen.q1().setRefreshingNext(callHistoryPageScreen.s1().C());
                    k96 k96VarQ1 = callHistoryPageScreen.q1();
                    kl1 kl1VarS1 = callHistoryPageScreen.s1();
                    boolean zE = kl1VarS1.E();
                    yl1 yl1Var = yl1.ALL;
                    k96VarQ1.setRefreshingPrev((zE || kl1VarS1.c != yl1Var || kl1VarS1.e.b.isEmpty()) ? false : true);
                    if (callHistoryPageScreen.s1().c == yl1Var) {
                        vl1 vl1VarR1 = callHistoryPageScreen.r1();
                        Iterator it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            List list = ((yw7) it.next()).m;
                            size += list.isEmpty() ? 1 : list.size();
                        }
                        vl1VarR1.j = size;
                    }
                }
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl1(CallHistoryPageScreen callHistoryPageScreen, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 2;
        this.g = callHistoryPageScreen;
    }
}
