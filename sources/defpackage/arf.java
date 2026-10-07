package defpackage;

import java.util.Map;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class arf extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ SettingsBlacklistScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ arf(lq4 lq4Var, SettingsBlacklistScreen settingsBlacklistScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = settingsBlacklistScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        SettingsBlacklistScreen settingsBlacklistScreen = this.g;
        switch (i) {
            case 0:
                arf arfVar = new arf(lq4Var, settingsBlacklistScreen, 0);
                arfVar.f = obj;
                return arfVar;
            default:
                arf arfVar2 = new arf(lq4Var, settingsBlacklistScreen, 1);
                arfVar2.f = obj;
                return arfVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((arf) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((arf) create(obj, lq4Var)).invokeSuspend(sbiVar);
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
        SettingsBlacklistScreen settingsBlacklistScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                Map map = (Map) obj2;
                ((r1c) settingsBlacklistScreen.f.m(settingsBlacklistScreen, SettingsBlacklistScreen.h[1])).setVisibility(map.values().isEmpty() ? 0 : 8);
                settingsBlacklistScreen.g.H(ww3.T1(map.values()));
                break;
            default:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (rbbVar instanceof i65) {
                    uuf.b.e((i65) rbbVar);
                } else if (rbbVar instanceof tpf) {
                    tpf tpfVar = (tpf) rbbVar;
                    zv8[] zv8VarArr = SettingsBlacklistScreen.h;
                    zv8[] zv8VarArr2 = BottomSheetWidget.t;
                    jc4 jc4VarA = mol.a(tpfVar.b, tpfVar.e, null, 4);
                    for (spf spfVar : tpfVar.c) {
                        boolean z = spfVar.c;
                        tnh tnhVar = spfVar.a;
                        int i2 = spfVar.b;
                        if (z) {
                            jc4VarA.d(i2, tnhVar);
                        } else {
                            jc4VarA.c(i2, tnhVar);
                        }
                    }
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(settingsBlacklistScreen);
                    confirmationBottomSheetF.setTargetController(settingsBlacklistScreen);
                    br4 parentController = settingsBlacklistScreen;
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
                } else if (rbbVar instanceof upf) {
                    h8c h8cVar = new h8c(settingsBlacklistScreen);
                    upf upfVar = (upf) rbbVar;
                    Integer num = upfVar.c;
                    if (num != null) {
                        h8cVar.h(new w8c(num.intValue()));
                    }
                    h8cVar.a(upfVar.d);
                    h8cVar.m(upfVar.b);
                    h8cVar.p();
                }
                break;
        }
        return sbiVar;
    }
}
