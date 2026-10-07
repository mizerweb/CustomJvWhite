package defpackage;

import java.util.List;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.stickerssettings.StickersSettingsScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class nog extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ StickersSettingsScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nog(StickersSettingsScreen stickersSettingsScreen, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.g = stickersSettingsScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        StickersSettingsScreen stickersSettingsScreen = this.g;
        switch (i) {
            case 0:
                nog nogVar = new nog(stickersSettingsScreen, lq4Var);
                nogVar.f = obj;
                return nogVar;
            case 1:
                nog nogVar2 = new nog(lq4Var, stickersSettingsScreen, 1);
                nogVar2.f = obj;
                return nogVar2;
            default:
                nog nogVar3 = new nog(lq4Var, stickersSettingsScreen, 2);
                nogVar3.f = obj;
                return nogVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((nog) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((nog) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((nog) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        StickersSettingsScreen stickersSettingsScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                stickersSettingsScreen.f.H((List) obj2);
                return sbiVar;
            case 1:
                ch3.d0(obj);
                xrf xrfVar = (xrf) obj2;
                zv8[] zv8VarArr = StickersSettingsScreen.g;
                if (xrfVar instanceof vrf) {
                    opl.b(stickersSettingsScreen, 2).l(((vrf) xrfVar).a).g().build().u(stickersSettingsScreen);
                    return sbiVar;
                }
                if (xrfVar instanceof srf) {
                    lve lveVar = (lve) ww3.D1(stickersSettingsScreen.getRouter().e());
                    log.b.k(((srf) xrfVar).a, lveVar != null ? lveVar.b : null);
                    return sbiVar;
                }
                if (xrfVar instanceof trf) {
                    String str = sj8.a;
                    sj8.j(stickersSettingsScreen.getContext(), ((trf) xrfVar).a, null);
                    return sbiVar;
                }
                if (!(xrfVar instanceof urf)) {
                    if (!(xrfVar instanceof wrf)) {
                        ore.o();
                        return null;
                    }
                    h8c h8cVar = new h8c(stickersSettingsScreen);
                    wrf wrfVar = (wrf) xrfVar;
                    h8cVar.h(new w8c(wrfVar.a));
                    CharSequence charSequenceB = wrfVar.b.b(stickersSettingsScreen.getContext());
                    if (charSequenceB == null) {
                        charSequenceB = "";
                    }
                    h8cVar.n(charSequenceB);
                    h8cVar.p();
                    return sbiVar;
                }
                urf urfVar = (urf) xrfVar;
                zv8[] zv8VarArr2 = BottomSheetWidget.t;
                jc4 jc4VarA = mol.a(urfVar.a, null, null, 6);
                jc4VarA.g(urfVar.b);
                urfVar.c.forEach(new o01(18, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 23)));
                ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(stickersSettingsScreen);
                confirmationBottomSheetF.setTargetController(stickersSettingsScreen);
                br4 parentController = stickersSettingsScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                hve hveVarU1 = rootController != null ? rootController.u1() : null;
                if (hveVarU1 == null) {
                    return sbiVar;
                }
                lve lveVar2 = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                p.k(false, lveVar2, true, "BottomSheetWidget");
                hveVarU1.I(lveVar2);
                return sbiVar;
            default:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                zv8[] zv8VarArr3 = StickersSettingsScreen.g;
                if (rbbVar instanceof rt3) {
                    stickersSettingsScreen.getRouter().D();
                } else if (rbbVar instanceof i65) {
                    log.b.e((i65) rbbVar);
                }
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nog(lq4 lq4Var, StickersSettingsScreen stickersSettingsScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = stickersSettingsScreen;
    }
}
