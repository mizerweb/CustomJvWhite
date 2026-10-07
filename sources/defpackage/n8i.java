package defpackage;

import android.widget.TextView;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.twofa.creation.TwoFACreationScreen;
import one.me.settings.twofa.restore.TwoFAStartRestoreScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class n8i extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ TwoFAStartRestoreScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n8i(lq4 lq4Var, TwoFAStartRestoreScreen twoFAStartRestoreScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = twoFAStartRestoreScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        TwoFAStartRestoreScreen twoFAStartRestoreScreen = this.g;
        switch (i) {
            case 0:
                n8i n8iVar = new n8i(lq4Var, twoFAStartRestoreScreen, 0);
                n8iVar.f = obj;
                return n8iVar;
            case 1:
                n8i n8iVar2 = new n8i(lq4Var, twoFAStartRestoreScreen, 1);
                n8iVar2.f = obj;
                return n8iVar2;
            default:
                n8i n8iVar3 = new n8i(lq4Var, twoFAStartRestoreScreen, 2);
                n8iVar3.f = obj;
                return n8iVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((n8i) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((n8i) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((n8i) create(obj, lq4Var)).invokeSuspend(sbiVar);
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
        TwoFAStartRestoreScreen twoFAStartRestoreScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                z7i z7iVar = (z7i) obj2;
                zv8[] zv8VarArr = TwoFAStartRestoreScreen.j;
                if (z7iVar == null) {
                    ore.o();
                    return null;
                }
                twoFAStartRestoreScreen.getRouter().D();
                nk8 nk8Var = (nk8) twoFAStartRestoreScreen.f.getValue();
                String str = z7iVar.b;
                mk8 mk8Var = (mk8) twoFAStartRestoreScreen.c.getValue();
                pk8 pk8Var = z7iVar.c;
                nk8Var.getClass();
                nk8Var.a(oc9.e(new TwoFACreationScreen("RESTORE", "CREATE_PASSWORD", mk8Var.name(), str, nk8Var.b, pk8Var), null, null), "CREATE_PASSWORD");
                return sbiVar;
            case 1:
                ch3.d0(obj);
                m7i m7iVar = (m7i) obj2;
                j8e j8eVar = twoFAStartRestoreScreen.g;
                zv8[] zv8VarArr2 = TwoFAStartRestoreScreen.j;
                if (!(m7iVar instanceof j7i)) {
                    if (m7iVar instanceof k7i) {
                        h8c h8cVar = new h8c(twoFAStartRestoreScreen);
                        k7i k7iVar = (k7i) m7iVar;
                        h8cVar.h(new w8c(k7iVar.b));
                        h8cVar.m(k7iVar.a);
                        h8cVar.p();
                        return sbiVar;
                    }
                    if (m7iVar instanceof l7i) {
                        return sbiVar;
                    }
                    if (!(m7iVar instanceof i7i)) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr3 = TwoFAStartRestoreScreen.j;
                    i7i i7iVar = (i7i) m7iVar;
                    ((b9i) j8eVar.m(twoFAStartRestoreScreen, zv8VarArr3[0])).d(i7iVar.a);
                    ((b9i) j8eVar.m(twoFAStartRestoreScreen, zv8VarArr3[0])).c(i7iVar.b);
                    return sbiVar;
                }
                zv8[] zv8VarArr4 = BottomSheetWidget.t;
                j7i j7iVar = (j7i) m7iVar;
                jc4 jc4VarA = mol.a(j7iVar.a, null, j7iVar.d, 2);
                jc4VarA.g(j7iVar.b);
                j7iVar.c.forEach(new o01(22, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 27)));
                ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(twoFAStartRestoreScreen);
                confirmationBottomSheetF.setTargetController(twoFAStartRestoreScreen);
                br4 parentController = twoFAStartRestoreScreen;
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
            default:
                ch3.d0(obj);
                String str2 = (String) obj2;
                j8e j8eVar2 = twoFAStartRestoreScreen.h;
                zv8[] zv8VarArr5 = TwoFAStartRestoreScreen.j;
                boolean z = str2 == null || str2.length() == 0;
                j8e j8eVar3 = twoFAStartRestoreScreen.i;
                zv8[] zv8VarArr6 = TwoFAStartRestoreScreen.j;
                ((cyb) j8eVar3.m(twoFAStartRestoreScreen, zv8VarArr6[2])).setVisibility(z ? 0 : 8);
                ((TextView) j8eVar2.m(twoFAStartRestoreScreen, zv8VarArr6[1])).setVisibility(z ? 8 : 0);
                if (!z) {
                    ((TextView) j8eVar2.m(twoFAStartRestoreScreen, zv8VarArr6[1])).setText(twoFAStartRestoreScreen.getContext().getString(R.string.oneme_settings_twofa_creation_email_verify_resend_code_timer, str2));
                }
                return sbiVar;
        }
    }
}
