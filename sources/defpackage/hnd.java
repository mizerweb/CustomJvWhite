package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import one.me.android.root.RootController;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* JADX INFO: loaded from: classes3.dex */
public final class hnd extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ProfileEditAdminPermissionsWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hnd(lq4 lq4Var, ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = profileEditAdminPermissionsWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.g;
        switch (i) {
            case 0:
                hnd hndVar = new hnd(lq4Var, profileEditAdminPermissionsWidget, 0);
                hndVar.f = obj;
                return hndVar;
            case 1:
                hnd hndVar2 = new hnd(lq4Var, profileEditAdminPermissionsWidget, 1);
                hndVar2.f = obj;
                return hndVar2;
            default:
                hnd hndVar3 = new hnd(lq4Var, profileEditAdminPermissionsWidget, 2);
                hndVar3.f = obj;
                return hndVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((hnd) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((hnd) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((hnd) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010f  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
        int i;
        Integer numG;
        int i2 = this.e;
        o8c o8cVar = null;
        sbi sbiVar = sbi.a;
        ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.g;
        Object obj2 = this.f;
        switch (i2) {
            case 0:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (rbbVar instanceof ymd) {
                    wnd.b.j(((ymd) rbbVar).b);
                } else if (rbbVar instanceof rt3) {
                    sgg sggVar = profileEditAdminPermissionsWidget.m;
                    if (sggVar != null) {
                        sggVar.b(null);
                    }
                    ml9.b(profileEditAdminPermissionsWidget);
                    profileEditAdminPermissionsWidget.getRouter().C(profileEditAdminPermissionsWidget);
                } else if (rbbVar instanceof i65) {
                    wnd.b.e((i65) rbbVar);
                }
                return sbiVar;
            case 1:
                ch3.d0(obj);
                vmd vmdVar = (vmd) obj2;
                if (vmdVar instanceof tmd) {
                    ml9.b(profileEditAdminPermissionsWidget);
                    zv8[] zv8VarArr = BottomSheetWidget.t;
                    tmd tmdVar = (tmd) vmdVar;
                    jc4 jc4VarA = mol.a(tmdVar.a, null, null, 6);
                    jc4VarA.g(tmdVar.b);
                    tmdVar.c.forEach(new ob3(5, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 15)));
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(profileEditAdminPermissionsWidget);
                    confirmationBottomSheetF.setTargetController(profileEditAdminPermissionsWidget);
                    br4 parentController = profileEditAdminPermissionsWidget;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar);
                    }
                } else {
                    if (!(vmdVar instanceof umd)) {
                        ore.o();
                        return null;
                    }
                    g8c g8cVar = profileEditAdminPermissionsWidget.l;
                    if (g8cVar != null) {
                        g8cVar.a();
                    }
                    h8c h8cVar = new h8c(profileEditAdminPermissionsWidget);
                    umd umdVar = (umd) vmdVar;
                    h8cVar.m(umdVar.a);
                    Integer num = umdVar.b;
                    if (num != null) {
                        h8cVar.h(new w8c(num.intValue()));
                    }
                    if (umdVar.c) {
                        xme xmeVar = profileEditAdminPermissionsWidget.j;
                        if (n7j.o(xmeVar)) {
                            View view = profileEditAdminPermissionsWidget.getView();
                            int iIntValue = (view == null || (numG = n7j.g(view)) == null) ? 0 : numG.intValue();
                            int iJ = n7j.j(xmeVar);
                            if (iIntValue == 0 && xmeVar.d()) {
                                ViewGroup.LayoutParams layoutParams = ((View) xmeVar.getValue()).getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                                if (marginLayoutParams != null) {
                                    i = marginLayoutParams.bottomMargin;
                                } else {
                                    i = 0;
                                }
                            } else {
                                i = 0;
                            }
                            o8cVar = new o8c(0, 0, iJ + i, 11);
                        }
                        if (o8cVar != null) {
                            h8cVar.c(o8cVar);
                        }
                    }
                    profileEditAdminPermissionsWidget.l = h8cVar.p();
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                bnd bndVar = (bnd) obj2;
                xme xmeVar2 = profileEditAdminPermissionsWidget.j;
                if (xmeVar2.d()) {
                    ((cyb) xmeVar2.getValue()).setVisibility(bndVar.b ? 0 : 8);
                    profileEditAdminPermissionsWidget.q1();
                }
                profileEditAdminPermissionsWidget.g.H(bndVar.a);
                return sbiVar;
        }
    }
}
