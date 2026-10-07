package defpackage;

import android.widget.FrameLayout;
import one.me.android.root.RootController;
import one.me.profile.screens.joinrequests.JoinRequestsScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class fr8 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ JoinRequestsScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fr8(lq4 lq4Var, JoinRequestsScreen joinRequestsScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = joinRequestsScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        JoinRequestsScreen joinRequestsScreen = this.g;
        switch (i) {
            case 0:
                fr8 fr8Var = new fr8(lq4Var, joinRequestsScreen, 0);
                fr8Var.f = obj;
                return fr8Var;
            case 1:
                fr8 fr8Var2 = new fr8(lq4Var, joinRequestsScreen, 1);
                fr8Var2.f = obj;
                return fr8Var2;
            default:
                fr8 fr8Var3 = new fr8(lq4Var, joinRequestsScreen, 2);
                fr8Var3.f = obj;
                return fr8Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((fr8) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((fr8) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((fr8) create(obj, lq4Var)).invokeSuspend(sbiVar);
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
        int i;
        int i2;
        ylc ylcVar;
        int i3 = this.e;
        sbi sbiVar = sbi.a;
        JoinRequestsScreen joinRequestsScreen = this.g;
        Integer numValueOf = null;
        Object obj2 = this.f;
        switch (i3) {
            case 0:
                ch3.d0(obj);
                zv8[] zv8VarArr = JoinRequestsScreen.k;
                rcc rccVar = (rcc) joinRequestsScreen.f.m(joinRequestsScreen, JoinRequestsScreen.k[1]);
                CharSequence charSequenceB = ((kr8) obj2).a.b(joinRequestsScreen.getContext());
                rccVar.setTitle(charSequenceB != null ? charSequenceB : "");
                return sbiVar;
            case 1:
                ch3.d0(obj);
                jr8 jr8Var = (jr8) obj2;
                if (jr8Var instanceof ir8) {
                    ((FrameLayout) joinRequestsScreen.h.m(joinRequestsScreen, JoinRequestsScreen.k[3])).setVisibility(0);
                    joinRequestsScreen.p1().setVisibility(8);
                    joinRequestsScreen.o1().setVisibility(8);
                    return sbiVar;
                }
                if (!(jr8Var instanceof hr8)) {
                    if (!(jr8Var instanceof gr8)) {
                        ore.o();
                        return null;
                    }
                    ((FrameLayout) joinRequestsScreen.h.m(joinRequestsScreen, JoinRequestsScreen.k[3])).setVisibility(8);
                    joinRequestsScreen.p1().setVisibility(0);
                    joinRequestsScreen.o1().setVisibility(8);
                    gr8 gr8Var = (gr8) jr8Var;
                    ((qq8) joinRequestsScreen.j.getValue()).H(gr8Var.a);
                    joinRequestsScreen.p1().setRefreshingNext(gr8Var.b);
                    return sbiVar;
                }
                ((FrameLayout) joinRequestsScreen.h.m(joinRequestsScreen, JoinRequestsScreen.k[3])).setVisibility(8);
                joinRequestsScreen.p1().setVisibility(8);
                boolean z = ((hr8) jr8Var).a;
                r1c r1cVarO1 = joinRequestsScreen.o1();
                if (z) {
                    numValueOf = Integer.valueOf(R.string.empty_view_subtitle_empty_search);
                    i = R.string.empty_view_title_empty_search;
                    i2 = R.drawable.icon_search;
                } else {
                    i = R.string.join_requests_empty_title;
                    i2 = R.drawable.icon_users_add;
                }
                r1cVarO1.setIcon(i2);
                r1cVarO1.setTitle(new tnh(i));
                r1cVarO1.setSubtitle(numValueOf != null ? new tnh(numValueOf.intValue()) : new xnh(""));
                joinRequestsScreen.o1().setVisibility(0);
                return sbiVar;
            default:
                ch3.d0(obj);
                cr8 cr8Var = (cr8) obj2;
                if (cr8Var instanceof br8) {
                    ylcVar = new ylc(((br8) cr8Var).a, new Integer(R.drawable.icon_check_round_fill));
                } else if (cr8Var instanceof zq8) {
                    ylcVar = new ylc(((zq8) cr8Var).a, new Integer(R.drawable.icon_cross_squircle_fill));
                } else {
                    if (!(cr8Var instanceof ar8)) {
                        if (cr8Var instanceof xq8) {
                            trd.b.o(((xq8) cr8Var).a);
                            return sbiVar;
                        }
                        if (!(cr8Var instanceof yq8)) {
                            ore.o();
                            return null;
                        }
                        zv8[] zv8VarArr2 = BottomSheetWidget.t;
                        yq8 yq8Var = (yq8) cr8Var;
                        jc4 jc4VarA = mol.a(yq8Var.a, null, null, 6);
                        jc4VarA.g(yq8Var.b);
                        yq8Var.c.forEach(new ob3(3, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 9)));
                        ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(joinRequestsScreen);
                        confirmationBottomSheetF.setTargetController(joinRequestsScreen);
                        br4 parentController = joinRequestsScreen;
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
                    ylcVar = new ylc(((ar8) cr8Var).a, null);
                }
                ynh ynhVar = (ynh) ylcVar.a;
                Integer num = (Integer) ylcVar.b;
                h8c h8cVar = new h8c(joinRequestsScreen);
                h8cVar.m(ynhVar);
                if (num != null) {
                    h8cVar.h(new w8c(num.intValue()));
                }
                h8cVar.p();
                return sbiVar;
        }
    }
}
