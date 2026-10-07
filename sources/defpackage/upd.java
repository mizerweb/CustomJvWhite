package defpackage;

import android.content.Context;
import android.widget.ImageView;
import one.me.android.root.RootController;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.tamtam.android.util.share.ShareData;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class upd extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ProfileInviteScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upd(lq4 lq4Var, ProfileInviteScreen profileInviteScreen) {
        super(2, lq4Var);
        this.e = 2;
        this.g = profileInviteScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ProfileInviteScreen profileInviteScreen = this.g;
        switch (i) {
            case 0:
                upd updVar = new upd(profileInviteScreen, lq4Var, 0);
                updVar.f = obj;
                return updVar;
            case 1:
                upd updVar2 = new upd(profileInviteScreen, lq4Var, 1);
                updVar2.f = obj;
                return updVar2;
            default:
                upd updVar3 = new upd(lq4Var, profileInviteScreen);
                updVar3.f = obj;
                return updVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((upd) create((rpd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((upd) create((rbb) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((upd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
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
        ProfileInviteScreen profileInviteScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                rpd rpdVar = (rpd) obj2;
                ch3.d0(obj);
                if (rpdVar instanceof qpd) {
                    qpd qpdVar = (qpd) rpdVar;
                    CharSequence charSequenceB = qpdVar.a.b(profileInviteScreen.getContext());
                    if (charSequenceB == null) {
                        return sbiVar;
                    }
                    h8c h8cVar = new h8c(profileInviteScreen);
                    h8cVar.h(new w8c(qpdVar.b));
                    h8cVar.n(charSequenceB);
                    h8cVar.p();
                    return sbiVar;
                }
                if (rpdVar instanceof npd) {
                    it3.a(profileInviteScreen.getContext(), ((npd) rpdVar).a);
                    return sbiVar;
                }
                if (rpdVar instanceof ppd) {
                    opl.b(profileInviteScreen, 1).l(((ppd) rpdVar).a).f((ImageView) profileInviteScreen.f.m(profileInviteScreen, ProfileInviteScreen.g[0])).build().u(profileInviteScreen);
                    return sbiVar;
                }
                if (!(rpdVar instanceof opd)) {
                    ore.o();
                    return null;
                }
                zv8[] zv8VarArr = BottomSheetWidget.t;
                opd opdVar = (opd) rpdVar;
                jc4 jc4VarA = mol.a(opdVar.a, null, null, 6);
                jc4VarA.g(opdVar.b);
                opdVar.c.forEach(new o01(13, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 17)));
                ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(profileInviteScreen);
                confirmationBottomSheetF.setTargetController(profileInviteScreen);
                br4 parentController = profileInviteScreen;
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
            case 1:
                rbb rbbVar = (rbb) obj2;
                ch3.d0(obj);
                if (rbbVar instanceof spd) {
                    lve lveVar2 = (lve) ww3.D1(profileInviteScreen.getRouter().e());
                    trd.s(trd.b, np4.q(profileInviteScreen.getContext(), R.string.share_to_max), new ShareData(0, null, null, ((spd) rbbVar).b, null, null, null, null, 246, null), lveVar2 != null ? lveVar2.b : null, 48);
                } else if (rbbVar instanceof tpd) {
                    String str = sj8.a;
                    Context context = profileInviteScreen.getContext();
                    CharSequence charSequenceB2 = ((tpd) rbbVar).b.b(profileInviteScreen.getContext());
                    if (charSequenceB2 == null) {
                        charSequenceB2 = "";
                    }
                    sj8.j(context, charSequenceB2, null);
                } else if (rbbVar instanceof i65) {
                    trd.b.e((i65) rbbVar);
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                opd opdVar2 = (opd) obj2;
                zv8[] zv8VarArr2 = BottomSheetWidget.t;
                jc4 jc4VarA2 = mol.a(opdVar2.a, null, null, 6);
                jc4VarA2.g(opdVar2.b);
                opdVar2.c.forEach(new ob3(6, new t63(1, jc4VarA2, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 18)));
                ConfirmationBottomSheet confirmationBottomSheetF2 = jc4VarA2.f(profileInviteScreen);
                confirmationBottomSheetF2.setTargetController(profileInviteScreen);
                br4 parentController2 = profileInviteScreen;
                while (parentController2.getParentController() != null) {
                    parentController2 = parentController2.getParentController();
                }
                RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
                hve hveVarU2 = rootController2 != null ? rootController2.u1() : null;
                if (hveVarU2 != null) {
                    lve lveVar3 = new lve(confirmationBottomSheetF2, null, null, null, false, -1);
                    p.k(false, lveVar3, true, "BottomSheetWidget");
                    hveVarU2.I(lveVar3);
                }
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ upd(ProfileInviteScreen profileInviteScreen, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = profileInviteScreen;
    }
}
