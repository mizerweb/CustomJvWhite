package defpackage;

import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.twofa.configuration.TwoFASettingsScreen;
import one.me.settings.twofa.creation.TwoFACreationScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class g8i extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ TwoFASettingsScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g8i(lq4 lq4Var, TwoFASettingsScreen twoFASettingsScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = twoFASettingsScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        TwoFASettingsScreen twoFASettingsScreen = this.g;
        switch (i) {
            case 0:
                g8i g8iVar = new g8i(lq4Var, twoFASettingsScreen, 0);
                g8iVar.f = obj;
                return g8iVar;
            default:
                g8i g8iVar2 = new g8i(lq4Var, twoFASettingsScreen, 1);
                g8iVar2.f = obj;
                return g8iVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((g8i) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((g8i) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        TwoFASettingsScreen twoFASettingsScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                ny8 ny8Var = twoFASettingsScreen.f;
                if (rbbVar instanceof i65) {
                    n7i.b.e((i65) rbbVar);
                    return sbiVar;
                }
                if (!(rbbVar instanceof s6i)) {
                    return sbiVar;
                }
                s6i s6iVar = (s6i) rbbVar;
                if (s6iVar instanceof r6i) {
                    nk8 nk8Var = (nk8) ny8Var.getValue();
                    String str = ((r6i) s6iVar).b;
                    nk8Var.getClass();
                    nk8Var.a(oc9.e(new TwoFACreationScreen("EDIT", "CREATE_PASSWORD", "SETTINGS", str, nk8Var.b, null), null, null), "CREATE_PASSWORD");
                    return sbiVar;
                }
                if (!(s6iVar instanceof q6i)) {
                    ore.o();
                    return null;
                }
                nk8 nk8Var2 = (nk8) ny8Var.getValue();
                q6i q6iVar = (q6i) s6iVar;
                String str2 = q6iVar.b;
                pk8 pk8Var = q6iVar.c;
                nk8Var2.getClass();
                nk8Var2.a(oc9.e(new TwoFACreationScreen("EDIT", "ADD_EMAIL", "SETTINGS", str2, nk8Var2.b, pk8Var), null, null), "ADD_EMAIL");
                return sbiVar;
            default:
                ch3.d0(obj);
                p6i p6iVar = (p6i) obj2;
                if (p6iVar instanceof n6i) {
                    h8c h8cVar = new h8c(twoFASettingsScreen);
                    n6i n6iVar = (n6i) p6iVar;
                    h8cVar.m(n6iVar.a);
                    h8cVar.h(new w8c(n6iVar.b));
                    h8cVar.p();
                    return sbiVar;
                }
                if (!(p6iVar instanceof o6i)) {
                    ore.o();
                    return null;
                }
                zv8[] zv8VarArr = BottomSheetWidget.t;
                o6i o6iVar = (o6i) p6iVar;
                jc4 jc4VarA = mol.a(o6iVar.a, null, y3f.SETTINGS_2FA_PASSWORD_DROP, 2);
                jc4VarA.g(o6iVar.b);
                o6iVar.c.forEach(new o01(21, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 26)));
                ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(twoFASettingsScreen);
                confirmationBottomSheetF.setTargetController(twoFASettingsScreen);
                br4 parentController = twoFASettingsScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                hve hveVarU1 = rootController != null ? rootController.u1() : null;
                if (hveVarU1 == null) {
                    return sbiVar;
                }
                lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                p.k(false, lveVar, true, "BottomSheetWidget");
                hveVarU1.I(lveVar);
                return sbiVar;
        }
    }
}
