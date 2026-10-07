package defpackage;

import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.twofa.creation.TwoFACreationScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class x6i extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ TwoFACreationScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x6i(lq4 lq4Var, TwoFACreationScreen twoFACreationScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = twoFACreationScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        TwoFACreationScreen twoFACreationScreen = this.g;
        switch (i) {
            case 0:
                x6i x6iVar = new x6i(lq4Var, twoFACreationScreen, 0);
                x6iVar.f = obj;
                return x6iVar;
            case 1:
                x6i x6iVar2 = new x6i(lq4Var, twoFACreationScreen, 1);
                x6iVar2.f = obj;
                return x6iVar2;
            case 2:
                x6i x6iVar3 = new x6i(lq4Var, twoFACreationScreen, 2);
                x6iVar3.f = obj;
                return x6iVar3;
            case 3:
                x6i x6iVar4 = new x6i(lq4Var, twoFACreationScreen, 3);
                x6iVar4.f = obj;
                return x6iVar4;
            case 4:
                x6i x6iVar5 = new x6i(lq4Var, twoFACreationScreen, 4);
                x6iVar5.f = obj;
                return x6iVar5;
            default:
                x6i x6iVar6 = new x6i(lq4Var, twoFACreationScreen, 5);
                x6iVar6.f = obj;
                return x6iVar6;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((x6i) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((x6i) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((x6i) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((x6i) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((x6i) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((x6i) create(obj, lq4Var)).invokeSuspend(sbiVar);
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
        v6i v6iVar = v6i.b;
        boolean z = true;
        sbi sbiVar = sbi.a;
        TwoFACreationScreen twoFACreationScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                x8i x8iVar = (x8i) obj2;
                zv8[] zv8VarArr = TwoFACreationScreen.n;
                twoFACreationScreen.q1().f(x8iVar);
                if (x8iVar.a()) {
                    ((ScrollView) twoFACreationScreen.j.m(twoFACreationScreen, TwoFACreationScreen.n[1])).post(new f4g(15, twoFACreationScreen));
                }
                return sbiVar;
            case 1:
                ch3.d0(obj);
                s7i s7iVar = (s7i) obj2;
                ny8 ny8Var = twoFACreationScreen.g;
                ny8 ny8Var2 = twoFACreationScreen.e;
                zv8[] zv8VarArr2 = TwoFACreationScreen.n;
                if (s7iVar instanceof p7i) {
                    nk8 nk8Var = (nk8) ny8Var.getValue();
                    p7i p7iVar = (p7i) s7iVar;
                    String str = p7iVar.a;
                    pk8 pk8Var = p7iVar.b;
                    w6i w6iVarR1 = twoFACreationScreen.r1();
                    mk8 mk8Var = (mk8) ny8Var2.getValue();
                    nk8Var.getClass();
                    nk8Var.a(oc9.e(new TwoFACreationScreen(w6iVarR1.name(), "CREATE_HINT", mk8Var.name(), str, nk8Var.b, pk8Var), null, null), "CREATE_HINT");
                } else if (s7iVar instanceof o7i) {
                    nk8 nk8Var2 = (nk8) ny8Var.getValue();
                    o7i o7iVar = (o7i) s7iVar;
                    String str2 = o7iVar.a;
                    pk8 pk8Var2 = o7iVar.b;
                    w6i w6iVarR2 = twoFACreationScreen.r1();
                    mk8 mk8Var2 = (mk8) ny8Var2.getValue();
                    nk8Var2.getClass();
                    nk8Var2.a(oc9.e(new TwoFACreationScreen(w6iVarR2.name(), "ADD_EMAIL", mk8Var2.name(), str2, nk8Var2.b, pk8Var2), null, null), "ADD_EMAIL");
                } else if (s7iVar instanceof r7i) {
                    nk8 nk8Var3 = (nk8) ny8Var.getValue();
                    r7i r7iVar = (r7i) s7iVar;
                    String str3 = r7iVar.a;
                    pk8 pk8Var3 = r7iVar.b;
                    w6i w6iVarR3 = twoFACreationScreen.r1();
                    mk8 mk8Var3 = (mk8) ny8Var2.getValue();
                    nk8Var3.getClass();
                    nk8Var3.a(oc9.e(new TwoFACreationScreen(w6iVarR3.name(), "VERIFY_EMAIL", mk8Var3.name(), str3, nk8Var3.b, pk8Var3), null, null), "VERIFY_EMAIL");
                } else {
                    if (!cqk.d(s7iVar, q7i.a)) {
                        ore.o();
                        return null;
                    }
                    nl9.b(twoFACreationScreen.getActivity());
                    int iOrdinal = twoFACreationScreen.r1().ordinal();
                    if (iOrdinal == 0) {
                        o65.c(n7i.b.b(), ":settings/privacy/onboarding-twofa?state=finish", null, null, 6);
                    } else if (iOrdinal == 1) {
                        n7i.b.j();
                    } else {
                        if (iOrdinal != 2) {
                            ore.o();
                            return null;
                        }
                        int iOrdinal2 = ((mk8) ny8Var2.getValue()).ordinal();
                        if (iOrdinal2 == 0) {
                            o65.c(n7i.b.b(), ":chat-list", null, null, 6);
                        } else {
                            if (iOrdinal2 != 1) {
                                ore.o();
                                return null;
                            }
                            n7i.b.j();
                        }
                    }
                }
                return sbiVar;
            case 2:
                ch3.d0(obj);
                zv8[] zv8VarArr3 = TwoFACreationScreen.n;
                ((nk8) twoFACreationScreen.g.getValue()).a.E();
                return sbiVar;
            case 3:
                ch3.d0(obj);
                m7i m7iVar = (m7i) obj2;
                zv8[] zv8VarArr4 = TwoFACreationScreen.n;
                if (m7iVar instanceof j7i) {
                    zv8[] zv8VarArr5 = BottomSheetWidget.t;
                    j7i j7iVar = (j7i) m7iVar;
                    jc4 jc4VarA = mol.a(j7iVar.a, null, j7iVar.d, 2);
                    jc4VarA.g(j7iVar.b);
                    j7iVar.c.forEach(new o01(20, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 25)));
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(twoFACreationScreen);
                    confirmationBottomSheetF.setTargetController(twoFACreationScreen);
                    br4 parentController = twoFACreationScreen;
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
                    h8c h8cVar = new h8c(twoFACreationScreen);
                    k7i k7iVar = (k7i) m7iVar;
                    h8cVar.h(new w8c(k7iVar.b));
                    h8cVar.m(k7iVar.a);
                    if (twoFACreationScreen.p1() != v6iVar && k7iVar.c) {
                        ViewGroup.LayoutParams layoutParams = twoFACreationScreen.o1().getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        h8cVar.c(new o8c(0, 0, twoFACreationScreen.o1().getMeasuredHeight() + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0), 11));
                        twoFACreationScreen.o1().setLoading(false);
                    }
                    h8cVar.p();
                } else if (m7iVar instanceof l7i) {
                    twoFACreationScreen.o1().setLoading(((l7i) m7iVar).a);
                } else {
                    if (!(m7iVar instanceof i7i)) {
                        ore.o();
                        return null;
                    }
                    i7i i7iVar = (i7i) m7iVar;
                    twoFACreationScreen.q1().d(i7iVar.a);
                    twoFACreationScreen.q1().c(i7iVar.b);
                }
                return sbiVar;
            case 4:
                ch3.d0(obj);
                String str4 = (String) obj2;
                j8e j8eVar = twoFACreationScreen.l;
                zv8[] zv8VarArr6 = TwoFACreationScreen.n;
                if (twoFACreationScreen.p1() == v6iVar) {
                    if (str4 != null && str4.length() != 0) {
                        z = false;
                    }
                    j8e j8eVar2 = twoFACreationScreen.m;
                    zv8[] zv8VarArr7 = TwoFACreationScreen.n;
                    ((cyb) j8eVar2.m(twoFACreationScreen, zv8VarArr7[4])).setVisibility(z ? 0 : 8);
                    ((TextView) j8eVar.m(twoFACreationScreen, zv8VarArr7[3])).setVisibility(z ? 8 : 0);
                    if (!z) {
                        ((TextView) j8eVar.m(twoFACreationScreen, zv8VarArr7[3])).setText(twoFACreationScreen.getContext().getString(R.string.oneme_settings_twofa_creation_email_verify_resend_code_timer, str4));
                    }
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                if (((Boolean) obj2).booleanValue()) {
                    ((ScrollView) twoFACreationScreen.j.m(twoFACreationScreen, TwoFACreationScreen.n[1])).post(new f4g(15, twoFACreationScreen));
                }
                return sbiVar;
        }
    }
}
