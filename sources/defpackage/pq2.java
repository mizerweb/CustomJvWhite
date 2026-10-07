package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.collections.a;
import one.me.android.root.RootController;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class pq2 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ChangeOwnerScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pq2(lq4 lq4Var, ChangeOwnerScreen changeOwnerScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = changeOwnerScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ChangeOwnerScreen changeOwnerScreen = this.g;
        switch (i) {
            case 0:
                pq2 pq2Var = new pq2(lq4Var, changeOwnerScreen, 0);
                pq2Var.f = obj;
                return pq2Var;
            case 1:
                pq2 pq2Var2 = new pq2(lq4Var, changeOwnerScreen, 1);
                pq2Var2.f = obj;
                return pq2Var2;
            default:
                pq2 pq2Var3 = new pq2(lq4Var, changeOwnerScreen, 2);
                pq2Var3.f = obj;
                return pq2Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((pq2) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((pq2) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((pq2) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ChangeOwnerScreen changeOwnerScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                m9a m9aVar = (m9a) obj2;
                if (m9aVar instanceof i9a) {
                    zv8[] zv8VarArr = ChangeOwnerScreen.k;
                    wq2 wq2Var = (wq2) changeOwnerScreen.g.getValue();
                    long j = ((i9a) m9aVar).a;
                    boolean zP1 = changeOwnerScreen.p1();
                    vg4 vg4Var = (vg4) ((no4) wq2Var.f.getValue()).j(j).a.getValue();
                    String strK = vg4Var != null ? vg4Var.k() : null;
                    if (strK == null) {
                        strK = "";
                    }
                    rt2 rt2Var = (rt2) ((xn3) wq2Var.e.getValue()).k(wq2Var.c).a.getValue();
                    if (rt2Var != null) {
                        a8j.x(wq2Var.i, new tq2(new tnh(zP1 ? R.string.profile_change_owner_and_leave_title : R.string.profile_change_owner_title), rt2Var.d0() ? new vnh(R.string.profile_change_owner_channel_description, a.n1(new Object[]{strK, rt2Var.F()})) : new vnh(R.string.profile_change_owner_description, a.n1(new Object[]{strK, rt2Var.F()})), j));
                    }
                } else if (m9aVar instanceof l9a) {
                    h8c h8cVar = new h8c(changeOwnerScreen);
                    h8cVar.n(np4.q(changeOwnerScreen.getContext(), R.string.self_profile_click));
                    h8cVar.p();
                }
                return sbiVar;
            case 1:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (rbbVar instanceof hsd) {
                    trd.b.k(((hsd) rbbVar).b);
                } else if (rbbVar instanceof ksd) {
                    zv8[] zv8VarArr2 = ChangeOwnerScreen.k;
                    if (changeOwnerScreen.getRouter().a.a.size() != 1) {
                        o65.c(trd.b.b(), ":chat-list", null, null, 6);
                    } else {
                        lve lveVar = (lve) ww3.t1(changeOwnerScreen.getRouter().e());
                        if (cqk.d(lveVar != null ? lveVar.a : null, changeOwnerScreen)) {
                            trd.b.r();
                        } else {
                            o65.c(trd.b.b(), ":chat-list", null, null, 6);
                        }
                    }
                } else if (rbbVar instanceof tq2) {
                    tq2 tq2Var = (tq2) rbbVar;
                    Bundle bundleI = n1g.i(new ylc("new_owner_id", new Long(tq2Var.d)));
                    zv8[] zv8VarArr3 = BottomSheetWidget.t;
                    jc4 jc4VarA = mol.a(tq2Var.b, bundleI, null, 4);
                    jc4VarA.g(tq2Var.c);
                    zv8[] zv8VarArr4 = ChangeOwnerScreen.k;
                    if (changeOwnerScreen.p1()) {
                        jc4VarA.b(R.id.profile_change_owner_change_action, new tnh(R.string.profile_change_owner_chat_bottom_sheet_confirm));
                    } else {
                        tnh tnhVar = new tnh(R.string.profile_change_owner_change_action);
                        Bundle bundle = jc4VarA.a;
                        ArrayList<? extends Parcelable> parcelableArrayList = bundle.getParcelableArrayList("buttons");
                        if (parcelableArrayList == null) {
                            parcelableArrayList = new ArrayList<>();
                        }
                        parcelableArrayList.add(new kc4(R.id.profile_change_owner_change_action, tnhVar, 4, 56));
                        bundle.putParcelableArrayList("buttons", parcelableArrayList);
                    }
                    jc4VarA.c(R.id.profile_change_owner_cancel_action, new tnh(R.string.profile_change_owner_change_cancel));
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(changeOwnerScreen);
                    confirmationBottomSheetF.setTargetController(changeOwnerScreen);
                    br4 parentController = changeOwnerScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar2 = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                        p.k(false, lveVar2, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar2);
                    }
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                sq2 sq2Var = (sq2) obj2;
                if (sq2Var == null) {
                    ore.o();
                    return null;
                }
                h8c h8cVar2 = new h8c(changeOwnerScreen);
                h8cVar2.m(sq2Var.a);
                h8cVar2.h(new w8c(sq2Var.b.intValue()));
                h8cVar2.p();
                return sbiVar;
        }
    }
}
