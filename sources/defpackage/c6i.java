package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.twofa.configuration.TwoFASettingsScreen;
import one.me.settings.twofa.password.TwoFACheckPassScreen;
import one.me.settings.twofa.restore.TwoFAStartRestoreScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class c6i extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ TwoFACheckPassScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6i(lq4 lq4Var, TwoFACheckPassScreen twoFACheckPassScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = twoFACheckPassScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        TwoFACheckPassScreen twoFACheckPassScreen = this.g;
        switch (i) {
            case 0:
                c6i c6iVar = new c6i(lq4Var, twoFACheckPassScreen, 0);
                c6iVar.f = obj;
                return c6iVar;
            case 1:
                c6i c6iVar2 = new c6i(lq4Var, twoFACheckPassScreen, 1);
                c6iVar2.f = obj;
                return c6iVar2;
            case 2:
                c6i c6iVar3 = new c6i(lq4Var, twoFACheckPassScreen, 2);
                c6iVar3.f = obj;
                return c6iVar3;
            case 3:
                c6i c6iVar4 = new c6i(lq4Var, twoFACheckPassScreen, 3);
                c6iVar4.f = obj;
                return c6iVar4;
            default:
                c6i c6iVar5 = new c6i(lq4Var, twoFACheckPassScreen, 4);
                c6iVar5.f = obj;
                return c6iVar5;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((c6i) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((c6i) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((c6i) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((c6i) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((c6i) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
        int i2 = 14;
        sbi sbiVar = sbi.a;
        TwoFACheckPassScreen twoFACheckPassScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                x8i x8iVar = (x8i) obj2;
                j8e j8eVar = twoFACheckPassScreen.i;
                zv8[] zv8VarArr = TwoFACheckPassScreen.n;
                ((b9i) j8eVar.m(twoFACheckPassScreen, zv8VarArr[0])).f(x8iVar);
                if (x8iVar.a()) {
                    ((ScrollView) twoFACheckPassScreen.j.m(twoFACheckPassScreen, zv8VarArr[1])).post(new f4g(i2, twoFACheckPassScreen));
                }
                return sbiVar;
            case 1:
                ch3.d0(obj);
                x5i x5iVar = (x5i) obj2;
                ny8 ny8Var = twoFACheckPassScreen.h;
                zv8[] zv8VarArr2 = TwoFACheckPassScreen.n;
                if (cqk.d(x5iVar, u5i.a)) {
                    nl9.b(twoFACheckPassScreen.getActivity());
                    o65.c(n7i.b.b(), ":chat-list", null, null, 6);
                } else if (x5iVar instanceof w5i) {
                    nl9.b(twoFACheckPassScreen.getActivity());
                    nk8 nk8Var = (nk8) ny8Var.getValue();
                    nk8Var.a(oc9.e(new TwoFASettingsScreen(((w5i) x5iVar).a, nk8Var.b), null, null), "twofa_settings_screen");
                } else {
                    if (!(x5iVar instanceof v5i)) {
                        ore.o();
                        return null;
                    }
                    nl9.b(twoFACheckPassScreen.getActivity());
                    ((cyb) twoFACheckPassScreen.l.m(twoFACheckPassScreen, TwoFACheckPassScreen.n[3])).setLoading(false);
                    twoFACheckPassScreen.q1(true);
                    nk8 nk8Var2 = (nk8) ny8Var.getValue();
                    v5i v5iVar = (v5i) x5iVar;
                    String str = v5iVar.a;
                    pk8 pk8Var = v5iVar.b;
                    mk8 mk8VarO1 = twoFACheckPassScreen.o1();
                    nk8Var2.getClass();
                    nk8Var2.a(oc9.e(new TwoFAStartRestoreScreen(mk8VarO1.name(), nk8Var2.b, str, pk8Var), null, null), "twofa_start_restore_screen");
                }
                return sbiVar;
            case 2:
                ch3.d0(obj);
                zv8[] zv8VarArr3 = TwoFACheckPassScreen.n;
                ((nk8) twoFACheckPassScreen.h.getValue()).a.E();
                return sbiVar;
            case 3:
                ch3.d0(obj);
                m7i m7iVar = (m7i) obj2;
                j8e j8eVar2 = twoFACheckPassScreen.l;
                j8e j8eVar3 = twoFACheckPassScreen.m;
                zv8[] zv8VarArr4 = TwoFACheckPassScreen.n;
                if (m7iVar instanceof j7i) {
                    twoFACheckPassScreen.q1(true);
                    zv8[] zv8VarArr5 = BottomSheetWidget.t;
                    j7i j7iVar = (j7i) m7iVar;
                    jc4 jc4VarA = mol.a(j7iVar.a, null, j7iVar.d, 2);
                    jc4VarA.g(j7iVar.b);
                    j7iVar.c.forEach(new o01(19, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 24)));
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(twoFACheckPassScreen);
                    confirmationBottomSheetF.setTargetController(twoFACheckPassScreen);
                    br4 parentController = twoFACheckPassScreen;
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
                } else if (m7iVar instanceof k7i) {
                    h8c h8cVar = new h8c(twoFACheckPassScreen);
                    k7i k7iVar = (k7i) m7iVar;
                    h8cVar.h(new w8c(k7iVar.b));
                    h8cVar.m(k7iVar.a);
                    zv8[] zv8VarArr6 = TwoFACheckPassScreen.n;
                    ViewGroup.LayoutParams layoutParams = ((View) j8eVar3.m(twoFACheckPassScreen, zv8VarArr6[4])).getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    h8cVar.c(new o8c(0, 0, ((View) j8eVar3.m(twoFACheckPassScreen, zv8VarArr6[4])).getMeasuredHeight() + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0), 11));
                    h8cVar.p();
                    ((cyb) j8eVar2.m(twoFACheckPassScreen, zv8VarArr6[3])).setLoading(false);
                    twoFACheckPassScreen.q1(true);
                } else if (m7iVar instanceof l7i) {
                    cyb cybVar = (cyb) j8eVar2.m(twoFACheckPassScreen, TwoFACheckPassScreen.n[3]);
                    boolean z = ((l7i) m7iVar).a;
                    cybVar.setLoading(z);
                    if (twoFACheckPassScreen.o1() == mk8.a) {
                        twoFACheckPassScreen.q1(!z);
                    }
                } else if (!(m7iVar instanceof i7i)) {
                    ore.o();
                    return null;
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                if (((Boolean) obj2).booleanValue()) {
                    ((ScrollView) twoFACheckPassScreen.j.m(twoFACheckPassScreen, TwoFACheckPassScreen.n[1])).post(new f4g(i2, twoFACheckPassScreen));
                }
                return sbiVar;
        }
    }
}
