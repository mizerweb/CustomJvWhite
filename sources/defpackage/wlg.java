package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.Iterator;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.stickerspreview.StickerPreviewScreen;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import ru.ok.tamtam.messages.scheduled.widget.ScheduledSendPickerBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class wlg extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ StickerPreviewScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wlg(lq4 lq4Var, StickerPreviewScreen stickerPreviewScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = stickerPreviewScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        StickerPreviewScreen stickerPreviewScreen = this.g;
        switch (i) {
            case 0:
                wlg wlgVar = new wlg(lq4Var, stickerPreviewScreen, 0);
                wlgVar.f = obj;
                return wlgVar;
            case 1:
                wlg wlgVar2 = new wlg(lq4Var, stickerPreviewScreen, 1);
                wlgVar2.f = obj;
                return wlgVar2;
            case 2:
                wlg wlgVar3 = new wlg(lq4Var, stickerPreviewScreen, 2);
                wlgVar3.f = obj;
                return wlgVar3;
            default:
                wlg wlgVar4 = new wlg(lq4Var, stickerPreviewScreen, 3);
                wlgVar4.f = obj;
                return wlgVar4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((wlg) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((wlg) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((wlg) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((wlg) create(obj, lq4Var)).invokeSuspend(sbiVar);
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
        Object next;
        String str;
        int i = this.e;
        sbi sbiVar = sbi.a;
        StickerPreviewScreen stickerPreviewScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                j8e j8eVar = stickerPreviewScreen.p;
                zv8[] zv8VarArr = StickerPreviewScreen.v;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = ((tp2) j8eVar.m(stickerPreviewScreen, zv8VarArr[9])).animate();
                viewPropertyAnimatorAnimate.cancel();
                viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(300L).start();
                if (!((hve) stickerPreviewScreen.q.m(stickerPreviewScreen, zv8VarArr[10])).o()) {
                    hve hveVar = (hve) stickerPreviewScreen.q.m(stickerPreviewScreen, zv8VarArr[10]);
                    t3f t3fVar = stickerPreviewScreen.f;
                    vv vvVar = stickerPreviewScreen.d;
                    zv8 zv8Var = zv8VarArr[4];
                    StickerSetBottomSheet stickerSetBottomSheet = new StickerSetBottomSheet(t3fVar, ((bdj) vvVar.a(stickerPreviewScreen)) == bdj.WEB_APP);
                    stickerSetBottomSheet.p = stickerPreviewScreen.k;
                    hveVar.T(oc9.e(stickerSetBottomSheet, null, null));
                }
                return sbiVar;
            case 1:
                ch3.d0(obj);
                tlg tlgVar = (tlg) obj2;
                j8e j8eVar2 = stickerPreviewScreen.o;
                j8e j8eVar3 = stickerPreviewScreen.n;
                dj9 dj9Var = stickerPreviewScreen.k;
                xme xmeVar = stickerPreviewScreen.t;
                xme xmeVar2 = stickerPreviewScreen.s;
                xme xmeVar3 = stickerPreviewScreen.u;
                if (tlgVar != null) {
                    boolean z = tlgVar.i;
                    String str2 = tlgVar.f;
                    if (str2 == null || str2.length() == 0) {
                        String str3 = tlgVar.e;
                        if (str3 == null || str3.length() == 0) {
                            hlg hlgVar = (hlg) xmeVar2.getValue();
                            yab.e((FrameLayout) j8eVar3.m(stickerPreviewScreen, StickerPreviewScreen.v[7]), hlgVar, -1);
                            hlgVar.a(tlgVar);
                            hlgVar.setVisibility(0);
                            if (n7j.o(xmeVar3)) {
                                ((ouj) xmeVar3.getValue()).setVisibility(8);
                            }
                            if (n7j.o(xmeVar)) {
                                ((fj9) xmeVar.getValue()).setVisibility(8);
                            }
                        } else {
                            fj9 fj9Var = (fj9) xmeVar.getValue();
                            yab.e((FrameLayout) j8eVar3.m(stickerPreviewScreen, StickerPreviewScreen.v[7]), fj9Var, -1);
                            fj9Var.a(tlgVar, gm0.K(160.0f * yl5.d().getDisplayMetrics().density));
                            fj9Var.setVisibility(0);
                            fj9Var.b(dj9Var);
                            if (n7j.o(xmeVar2)) {
                                ((hlg) xmeVar2.getValue()).setVisibility(8);
                            }
                            if (n7j.o(xmeVar3)) {
                                ((ouj) xmeVar3.getValue()).setVisibility(8);
                            }
                        }
                    } else {
                        ouj oujVar = (ouj) xmeVar3.getValue();
                        yab.e((FrameLayout) j8eVar3.m(stickerPreviewScreen, StickerPreviewScreen.v[7]), oujVar, -1);
                        oujVar.a(tlgVar, gm0.K(160.0f * yl5.d().getDisplayMetrics().density));
                        oujVar.setVisibility(0);
                        oujVar.b(dj9Var);
                        if (n7j.o(xmeVar2)) {
                            ((hlg) xmeVar2.getValue()).setVisibility(8);
                        }
                        if (n7j.o(xmeVar)) {
                            ((fj9) xmeVar.getValue()).setVisibility(8);
                        }
                    }
                    zv8[] zv8VarArr2 = StickerPreviewScreen.v;
                    ((t38) j8eVar2.m(stickerPreviewScreen, zv8VarArr2[8])).setIcon(z ? R.drawable.icon_bookmark_fill : R.drawable.icon_bookmark);
                    ((t38) j8eVar2.m(stickerPreviewScreen, zv8VarArr2[8])).setLabel(z ? R.string.oneme_stickers_preview_action_in_favorite_title : R.string.oneme_stickers_preview_action_favorite_title);
                }
                return sbiVar;
            case 2:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                zv8[] zv8VarArr3 = StickerPreviewScreen.v;
                if (rbbVar instanceof rt3) {
                    vv vvVar2 = stickerPreviewScreen.b;
                    zv8 zv8Var2 = StickerPreviewScreen.v[2];
                    String strJ = sol.e((t3f) vvVar2.a(stickerPreviewScreen)) ? zo5.j(stickerPreviewScreen.o1(), "scheduled-messages?id=") : zo5.j(stickerPreviewScreen.o1(), "chats?id=");
                    Iterator it = stickerPreviewScreen.getRouter().e().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            String str4 = ((lve) next).b;
                            if (str4 == null || !r5h.L0(str4, strJ, false)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    lve lveVar = (lve) next;
                    String str5 = lveVar != null ? lveVar.b : null;
                    lve lveVar2 = (lve) ww3.u1(xw3.O0(stickerPreviewScreen.getRouter().e()) - 1, stickerPreviewScreen.getRouter().e());
                    if (str5 == null || str5.length() == 0 || !(lveVar2 == null || (str = lveVar2.b) == null || !r5h.L0(str, strJ, false))) {
                        stickerPreviewScreen.getRouter().D();
                    } else {
                        stickerPreviewScreen.getRouter().F(str5);
                    }
                } else if (rbbVar instanceof i65) {
                    ang.b.e((i65) rbbVar);
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                vgd vgdVar = (vgd) obj2;
                zv8[] zv8VarArr4 = StickerPreviewScreen.v;
                if (vgdVar instanceof q3g) {
                    h8c h8cVar = new h8c(stickerPreviewScreen);
                    q3g q3gVar = (q3g) vgdVar;
                    h8cVar.h(new w8c(q3gVar.a));
                    h8cVar.m(q3gVar.b);
                    h8cVar.p();
                    return sbiVar;
                }
                if (vgdVar instanceof k3g) {
                    sol.g(stickerPreviewScreen, (t38) stickerPreviewScreen.r.m(stickerPreviewScreen, StickerPreviewScreen.v[11]), ((k3g) vgdVar).a, null);
                    return sbiVar;
                }
                if (vgdVar instanceof j3g) {
                    zv8[] zv8VarArr5 = BottomSheetWidget.t;
                    ScheduledSendPickerBottomSheet scheduledSendPickerBottomSheet = new ScheduledSendPickerBottomSheet(stickerPreviewScreen.f.b(), 100L, ((j3g) vgdVar).a, null, 8, null);
                    scheduledSendPickerBottomSheet.setTargetController(stickerPreviewScreen);
                    br4 parentController = stickerPreviewScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 == null) {
                        return sbiVar;
                    }
                    lve lveVar3 = new lve(scheduledSendPickerBottomSheet, null, null, null, false, -1);
                    p.k(false, lveVar3, true, "BottomSheetWidget");
                    hveVarU1.I(lveVar3);
                    return sbiVar;
                }
                if (vgdVar instanceof z1g) {
                    z1g z1gVar = (z1g) vgdVar;
                    View viewFindViewById = stickerPreviewScreen.findViewById(z1gVar.b);
                    if (viewFindViewById == null) {
                        return sbiVar;
                    }
                    opl.b(stickerPreviewScreen, 1).l(z1gVar.a).f(viewFindViewById).g().build().u(stickerPreviewScreen);
                    return sbiVar;
                }
                if (vgdVar instanceof p97) {
                    lve lveVar4 = (lve) ww3.D1(stickerPreviewScreen.getRouter().e());
                    o65.c(ang.b.b(), ":chats/share", n1g.i(new ylc("share_data", ((p97) vgdVar).a), new ylc("tag", lveVar4 != null ? lveVar4.b : null)), null, 4);
                    return sbiVar;
                }
                if (!(vgdVar instanceof i3g)) {
                    if (vgdVar instanceof ogf) {
                        stickerPreviewScreen.s1().H(((h4b) stickerPreviewScreen.i.getValue()).J(2), null);
                        return sbiVar;
                    }
                    ore.o();
                    return null;
                }
                zv8[] zv8VarArr6 = BottomSheetWidget.t;
                i3g i3gVar = (i3g) vgdVar;
                jc4 jc4VarA = mol.a(i3gVar.a, null, null, 6);
                jc4VarA.g(i3gVar.b);
                i3gVar.c.forEach(new o01(16, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 21)));
                ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(stickerPreviewScreen);
                confirmationBottomSheetF.setTargetController(stickerPreviewScreen);
                br4 parentController2 = stickerPreviewScreen;
                while (parentController2.getParentController() != null) {
                    parentController2 = parentController2.getParentController();
                }
                RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
                hve hveVarU2 = rootController2 != null ? rootController2.u1() : null;
                if (hveVarU2 == null) {
                    return sbiVar;
                }
                lve lveVar5 = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                p.k(false, lveVar5, true, "BottomSheetWidget");
                hveVarU2.I(lveVar5);
                return sbiVar;
        }
    }
}
