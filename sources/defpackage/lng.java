package defpackage;

import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class lng extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ StickersScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lng(lq4 lq4Var, StickersScreen stickersScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = stickersScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        StickersScreen stickersScreen = this.g;
        switch (i) {
            case 0:
                lng lngVar = new lng(lq4Var, stickersScreen, 0);
                lngVar.f = obj;
                return lngVar;
            case 1:
                lng lngVar2 = new lng(lq4Var, stickersScreen, 1);
                lngVar2.f = obj;
                return lngVar2;
            case 2:
                lng lngVar3 = new lng(lq4Var, stickersScreen, 2);
                lngVar3.f = obj;
                return lngVar3;
            default:
                lng lngVar4 = new lng(lq4Var, stickersScreen, 3);
                lngVar4.f = obj;
                return lngVar4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((lng) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((lng) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((lng) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((lng) create(obj, lq4Var)).invokeSuspend(sbiVar);
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
        StickersScreen stickersScreen = this.g;
        sbi sbiVar = sbi.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                kpg kpgVar = (kpg) obj2;
                zv8[] zv8VarArr = StickersScreen.m;
                rcc rccVarQ1 = stickersScreen.q1();
                CharSequence charSequenceB = kpgVar.a.b(stickersScreen.getContext());
                rccVarQ1.setTitle(charSequenceB != null ? charSequenceB : "");
                String str = kpgVar.b;
                if (str != null) {
                    stickersScreen.q1().s(str, false);
                }
                return sbiVar;
            case 1:
                ch3.d0(obj);
                gpg gpgVar = (gpg) obj2;
                cyb cybVarO1 = StickersScreen.o1(stickersScreen);
                bdc.a(cybVarO1, new ng7(cybVarO1, 25, stickersScreen));
                if (cqk.d(gpgVar, dpg.a)) {
                    StickersScreen.o1(stickersScreen).setVisibility(0);
                    qe7.H(StickersScreen.o1(stickersScreen), 300L, new mng(stickersScreen, 0));
                    StickersScreen.o1(stickersScreen).setText(np4.q(stickersScreen.getContext(), R.string.add));
                    StickersScreen.o1(stickersScreen).setAppearance(zxb.PRIMARY);
                } else {
                    boolean zD = cqk.d(gpgVar, fpg.a);
                    zxb zxbVar = zxb.SECONDARY;
                    if (zD) {
                        StickersScreen.o1(stickersScreen).setVisibility(0);
                        qe7.H(StickersScreen.o1(stickersScreen), 300L, new mng(stickersScreen, 1));
                        StickersScreen.o1(stickersScreen).setText(np4.q(stickersScreen.getContext(), R.string.delete));
                        StickersScreen.o1(stickersScreen).setAppearance(zxbVar);
                    } else if (cqk.d(gpgVar, epg.a)) {
                        StickersScreen.o1(stickersScreen).setVisibility(0);
                        qe7.H(StickersScreen.o1(stickersScreen), 300L, new mng(stickersScreen, 2));
                        StickersScreen.o1(stickersScreen).setText(np4.q(stickersScreen.getContext(), R.string.oneme_stickers_settings_menu_forward_title));
                        StickersScreen.o1(stickersScreen).setAppearance(zxbVar);
                    } else {
                        if (gpgVar != null) {
                            ore.o();
                            return null;
                        }
                        StickersScreen.o1(stickersScreen).setVisibility(8);
                    }
                }
                return sbiVar;
            case 2:
                ch3.d0(obj);
                xrf xrfVar = (xrf) obj2;
                zv8[] zv8VarArr2 = StickersScreen.m;
                if (xrfVar instanceof urf) {
                    urf urfVar = (urf) xrfVar;
                    zv8[] zv8VarArr3 = BottomSheetWidget.t;
                    jc4 jc4VarA = mol.a(urfVar.a, null, null, 6);
                    jc4VarA.g(urfVar.b);
                    urfVar.c.forEach(new o01(17, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 22)));
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(stickersScreen);
                    confirmationBottomSheetF.setTargetController(stickersScreen);
                    br4 parentController = stickersScreen;
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
                } else if (xrfVar instanceof wrf) {
                    h8c h8cVar = new h8c(stickersScreen);
                    wrf wrfVar = (wrf) xrfVar;
                    h8cVar.h(new w8c(wrfVar.a));
                    CharSequence charSequenceB2 = wrfVar.b.b(stickersScreen.getContext());
                    h8cVar.n(charSequenceB2 != null ? charSequenceB2 : "");
                    h8cVar.p();
                } else if (xrfVar instanceof srf) {
                    lve lveVar2 = (lve) ww3.D1(stickersScreen.getRouter().e());
                    log.b.k(((srf) xrfVar).a, lveVar2 != null ? lveVar2.b : null);
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                zv8[] zv8VarArr4 = StickersScreen.m;
                if (rbbVar instanceof i65) {
                    log.b.e((i65) rbbVar);
                }
                return sbiVar;
        }
    }
}
