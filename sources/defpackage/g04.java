package defpackage;

import android.os.Bundle;
import android.widget.FrameLayout;
import one.me.android.root.RootController;
import one.me.profile.screens.discussionsblacklist.CommentsBlackListScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class g04 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CommentsBlackListScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g04(lq4 lq4Var, CommentsBlackListScreen commentsBlackListScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = commentsBlackListScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        CommentsBlackListScreen commentsBlackListScreen = this.g;
        switch (i) {
            case 0:
                g04 g04Var = new g04(lq4Var, commentsBlackListScreen, 0);
                g04Var.f = obj;
                return g04Var;
            case 1:
                g04 g04Var2 = new g04(lq4Var, commentsBlackListScreen, 1);
                g04Var2.f = obj;
                return g04Var2;
            default:
                g04 g04Var3 = new g04(lq4Var, commentsBlackListScreen, 2);
                g04Var3.f = obj;
                return g04Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((g04) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((g04) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((g04) create(obj, lq4Var)).invokeSuspend(sbiVar);
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
        CommentsBlackListScreen commentsBlackListScreen = this.g;
        Integer numValueOf = null;
        Object obj2 = this.f;
        switch (i3) {
            case 0:
                ch3.d0(obj);
                l04 l04Var = (l04) obj2;
                zv8[] zv8VarArr = CommentsBlackListScreen.k;
                rcc rccVarQ1 = commentsBlackListScreen.q1();
                CharSequence charSequenceB = l04Var.a.b(commentsBlackListScreen.getContext());
                if (charSequenceB == null) {
                    charSequenceB = "";
                }
                rccVarQ1.setTitle(charSequenceB);
                rcc rccVarQ2 = commentsBlackListScreen.q1();
                CharSequence charSequenceB2 = l04Var.b.b(commentsBlackListScreen.getContext());
                rccVarQ2.s(charSequenceB2 != null ? charSequenceB2 : "", false);
                return sbiVar;
            case 1:
                ch3.d0(obj);
                k04 k04Var = (k04) obj2;
                if (k04Var instanceof j04) {
                    ((FrameLayout) commentsBlackListScreen.h.m(commentsBlackListScreen, CommentsBlackListScreen.k[3])).setVisibility(0);
                    commentsBlackListScreen.p1().setVisibility(8);
                    commentsBlackListScreen.o1().setVisibility(8);
                    return sbiVar;
                }
                if (!(k04Var instanceof i04)) {
                    if (!(k04Var instanceof h04)) {
                        ore.o();
                        return null;
                    }
                    ((FrameLayout) commentsBlackListScreen.h.m(commentsBlackListScreen, CommentsBlackListScreen.k[3])).setVisibility(8);
                    commentsBlackListScreen.p1().setVisibility(0);
                    commentsBlackListScreen.o1().setVisibility(8);
                    h04 h04Var = (h04) k04Var;
                    ((d04) commentsBlackListScreen.j.getValue()).H(h04Var.a);
                    commentsBlackListScreen.p1().setRefreshingNext(h04Var.b);
                    return sbiVar;
                }
                ((FrameLayout) commentsBlackListScreen.h.m(commentsBlackListScreen, CommentsBlackListScreen.k[3])).setVisibility(8);
                commentsBlackListScreen.p1().setVisibility(8);
                boolean z = ((i04) k04Var).a;
                r1c r1cVarO1 = commentsBlackListScreen.o1();
                if (z) {
                    numValueOf = Integer.valueOf(R.string.empty_view_subtitle_empty_search);
                    i = R.string.empty_view_title_empty_search;
                    i2 = R.drawable.icon_search;
                } else {
                    i = R.string.discussions_black_list_empty_title;
                    i2 = R.drawable.icon_block;
                }
                r1cVarO1.setIcon(i2);
                r1cVarO1.setTitle(new tnh(i));
                r1cVarO1.setSubtitle(numValueOf != null ? new tnh(numValueOf.intValue()) : new xnh(""));
                commentsBlackListScreen.o1().setVisibility(0);
                return sbiVar;
            default:
                ch3.d0(obj);
                c04 c04Var = (c04) obj2;
                if (c04Var instanceof a04) {
                    ylcVar = new ylc(((a04) c04Var).a, new Integer(R.drawable.icon_check));
                } else if (c04Var instanceof yz3) {
                    ylcVar = new ylc(((yz3) c04Var).a, new Integer(R.drawable.icon_cross));
                } else {
                    if (!(c04Var instanceof zz3)) {
                        if (c04Var instanceof xz3) {
                            trd.b.o(((xz3) c04Var).a);
                            return sbiVar;
                        }
                        if (!(c04Var instanceof b04)) {
                            ore.o();
                            return null;
                        }
                        Bundle bundle = new Bundle();
                        b04 b04Var = (b04) c04Var;
                        bundle.putLong("discussions_black_list:user_id", b04Var.e);
                        zv8[] zv8VarArr2 = BottomSheetWidget.t;
                        jc4 jc4VarC = p.c(R.string.discussions_black_list_confirm_unblock_title, bundle, null, 4);
                        jc4VarC.a.putParcelable("avatar", new ic4(b04Var.c, b04Var.b, b04Var.d));
                        jc4VarC.g(b04Var.a);
                        jc4VarC.a(new kc4(R.id.profile_discussions_black_list_confirm_unblock_button, new tnh(R.string.discussions_black_list_confirm_unblock_action), 3, true, 3, 4), new kc4(R.id.profile_discussions_black_list_keep_blocked_button, new tnh(R.string.discussions_black_list_keep_blocked_action), 2, true, 3, 2));
                        ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(commentsBlackListScreen);
                        confirmationBottomSheetF.setTargetController(commentsBlackListScreen);
                        br4 parentController = commentsBlackListScreen;
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
                    ylcVar = new ylc(((zz3) c04Var).a, null);
                }
                ynh ynhVar = (ynh) ylcVar.a;
                Integer num = (Integer) ylcVar.b;
                h8c h8cVar = new h8c(commentsBlackListScreen);
                h8cVar.m(ynhVar);
                if (num != null) {
                    h8cVar.h(new w8c(num.intValue()));
                }
                h8cVar.p();
                return sbiVar;
        }
    }
}
