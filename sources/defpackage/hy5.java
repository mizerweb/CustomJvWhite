package defpackage;

import android.animation.ValueAnimator;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import one.me.android.root.RootController;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.mediaeditor.editandreply.EditAndReplyScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.tamtam.messages.scheduled.widget.ScheduledSendPickerBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class hy5 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ EditAndReplyScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hy5(lq4 lq4Var, EditAndReplyScreen editAndReplyScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = editAndReplyScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        EditAndReplyScreen editAndReplyScreen = this.g;
        switch (i) {
            case 0:
                hy5 hy5Var = new hy5(lq4Var, editAndReplyScreen, 0);
                hy5Var.f = obj;
                return hy5Var;
            case 1:
                hy5 hy5Var2 = new hy5(lq4Var, editAndReplyScreen, 1);
                hy5Var2.f = obj;
                return hy5Var2;
            case 2:
                hy5 hy5Var3 = new hy5(lq4Var, editAndReplyScreen, 2);
                hy5Var3.f = obj;
                return hy5Var3;
            case 3:
                hy5 hy5Var4 = new hy5(lq4Var, editAndReplyScreen, 3);
                hy5Var4.f = obj;
                return hy5Var4;
            default:
                hy5 hy5Var5 = new hy5(lq4Var, editAndReplyScreen, 4);
                hy5Var5.f = obj;
                return hy5Var5;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((hy5) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((hy5) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((hy5) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((hy5) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((hy5) create(obj, lq4Var)).invokeSuspend(sbiVar);
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
        EditAndReplyScreen editAndReplyScreen = this.g;
        sbi sbiVar = sbi.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                zv8[] zv8VarArr = EditAndReplyScreen.w;
                hve hveVar = (hve) editAndReplyScreen.r.m(editAndReplyScreen, EditAndReplyScreen.w[10]);
                int iOrdinal = ((zka) obj2).a.ordinal();
                if (iOrdinal == 0) {
                    kz9 kz9Var = editAndReplyScreen.s;
                    if (kz9Var != null) {
                        zv8[] zv8VarArr2 = kz9.p;
                        kz9Var.i(true);
                    }
                    editAndReplyScreen.r1().setLeftIcon(R.drawable.icon_sticker);
                    editAndReplyScreen.o1(editAndReplyScreen.p1());
                } else if (iOrdinal == 1) {
                    if (!hveVar.o()) {
                        MediaKeyboardWidget mediaKeyboardWidget = new MediaKeyboardWidget(editAndReplyScreen.d, 0L, true, false, null, false, 58, null);
                        kbc kbcVarS1 = editAndReplyScreen.s1();
                        mediaKeyboardWidget.p = kbcVarS1;
                        sw8 sw8Var = mediaKeyboardWidget.o;
                        if (sw8Var != null) {
                            sw8Var.L(kbcVarS1);
                        }
                        hveVar.T(oc9.e(mediaKeyboardWidget, null, null));
                    }
                    if (ch3.o(editAndReplyScreen.getContext()).a()) {
                        LinearLayout linearLayoutP1 = editAndReplyScreen.p1();
                        WeakHashMap weakHashMap = i7j.a;
                        swj.a(linearLayoutP1, null);
                        y6j.l(editAndReplyScreen.p1(), null);
                    }
                    kz9 kz9Var2 = editAndReplyScreen.s;
                    if (kz9Var2 != null) {
                        kz9Var2.l();
                    }
                    editAndReplyScreen.r1().setLeftIcon(R.drawable.icon_keyboard);
                } else if (iOrdinal == 2) {
                    ((EditAndReplyScreen) editAndReplyScreen.v.b).r1().h(true);
                    editAndReplyScreen.r1().setLeftIcon(R.drawable.icon_keyboard);
                    e9i.j0(new fz6(n1g.v(new jz(new xc3(uw8.f, 7), 11), editAndReplyScreen.getViewLifecycleOwner().f(), n09.d), new hy5(null, editAndReplyScreen, 1), 3), editAndReplyScreen.getViewLifecycleScope());
                }
                return sbiVar;
            case 1:
                ch3.d0(obj);
                ((Boolean) obj2).getClass();
                zv8[] zv8VarArr3 = EditAndReplyScreen.w;
                editAndReplyScreen.o1(editAndReplyScreen.p1());
                return sbiVar;
            case 2:
                ch3.d0(obj);
                az5 az5Var = (az5) obj2;
                j8e j8eVar = editAndReplyScreen.l;
                j8e j8eVar2 = editAndReplyScreen.j;
                zv8[] zv8VarArr4 = EditAndReplyScreen.w;
                boolean z = az5Var.a;
                Uri uri = az5Var.f;
                j8e j8eVar3 = editAndReplyScreen.k;
                zv8[] zv8VarArr5 = EditAndReplyScreen.w;
                ((ImageView) j8eVar3.m(editAndReplyScreen, zv8VarArr5[4])).setVisibility(z ? 0 : 8);
                boolean z2 = az5Var.b;
                ((bwc) j8eVar2.m(editAndReplyScreen, zv8VarArr5[3])).setVisibility(z2 ? 0 : 8);
                ((rcc) j8eVar.m(editAndReplyScreen, zv8VarArr5[5])).setVisibility(z2 ? 0 : 8);
                editAndReplyScreen.p1().setVisibility(z2 ? 0 : 8);
                ((tp2) editAndReplyScreen.q.m(editAndReplyScreen, zv8VarArr5[9])).setVisibility(z2 ? 0 : 8);
                ((rcc) j8eVar.m(editAndReplyScreen, zv8VarArr5[5])).setRightActions(az5Var.c ? new acc(null, new jcc(R.drawable.icon_download, null, null, null, 0.0f, new ey5(editAndReplyScreen, 2), 254), null) : new acc(null, null, null));
                boolean z3 = az5Var.d;
                float f = z3 ? 1.0f : 0.0f;
                if (f != editAndReplyScreen.q1().getAlpha()) {
                    float alpha = editAndReplyScreen.q1().getAlpha();
                    ValueAnimator valueAnimator = editAndReplyScreen.p;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(alpha, f);
                    valueAnimatorOfFloat.addUpdateListener(new mk(editAndReplyScreen, 4, valueAnimatorOfFloat));
                    valueAnimatorOfFloat.addListener(new ly5(z3, editAndReplyScreen, 1));
                    valueAnimatorOfFloat.addListener(new ly5(z3, editAndReplyScreen, 0));
                    valueAnimatorOfFloat.start();
                    editAndReplyScreen.p = valueAnimatorOfFloat;
                }
                editAndReplyScreen.r1().setRightOuterIconActionState(az5Var.e ? lha.a : jha.a);
                if (uri != null) {
                    ((bwc) j8eVar2.m(editAndReplyScreen, zv8VarArr5[3])).k(new b68(uri, false, null, 60), false);
                }
                return sbiVar;
            case 3:
                ch3.d0(obj);
                vy5 vy5Var = (vy5) obj2;
                zv8[] zv8VarArr6 = EditAndReplyScreen.w;
                if ((vy5Var instanceof ny5) || (vy5Var instanceof ry5)) {
                    editAndReplyScreen.u1();
                } else if (vy5Var instanceof qy5) {
                    g8c g8cVar = editAndReplyScreen.u;
                    if (g8cVar != null) {
                        g8cVar.a();
                    }
                    h8c h8cVar = new h8c(editAndReplyScreen);
                    h8cVar.m(new tnh(R.string.edit_and_reply_save_to_gallery_success));
                    h8cVar.h(new w8c(R.drawable.download_photo_fill));
                    editAndReplyScreen.u = h8cVar.p();
                } else if (vy5Var instanceof py5) {
                    editAndReplyScreen.u1();
                } else if (vy5Var instanceof uy5) {
                    sol.g(editAndReplyScreen, editAndReplyScreen.r1().getMessagePreviewAnchor(), ((uy5) vy5Var).a, null);
                } else if (vy5Var instanceof ty5) {
                    zv8[] zv8VarArr7 = BottomSheetWidget.t;
                    ScheduledSendPickerBottomSheet scheduledSendPickerBottomSheet = new ScheduledSendPickerBottomSheet(editAndReplyScreen.d.b(), 1L, ((ty5) vy5Var).a, null, 8, null);
                    scheduledSendPickerBottomSheet.setTargetController(editAndReplyScreen);
                    br4 parentController = editAndReplyScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar = new lve(scheduledSendPickerBottomSheet, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar);
                    }
                } else if (vy5Var instanceof sy5) {
                    mrk.d(editAndReplyScreen);
                } else {
                    if (!(vy5Var instanceof oy5)) {
                        ore.o();
                        return null;
                    }
                    editAndReplyScreen.r1().h(false);
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                zv8[] zv8VarArr8 = EditAndReplyScreen.w;
                if (rbbVar instanceof aw9) {
                    aw9 aw9Var = (aw9) rbbVar;
                    yv9.b.k(aw9Var.c, aw9Var.b);
                } else if (rbbVar instanceof zv9) {
                    zv9 zv9Var = (zv9) rbbVar;
                    yv9.b.j(zv9Var.b, zv9Var.c);
                } else if (rbbVar instanceof i65) {
                    yv9.b.e((i65) rbbVar);
                } else if (cqk.d(rbbVar, rt3.b)) {
                    yv9.b.l();
                }
                return sbiVar;
        }
    }
}
