package one.me.sdk.messagewrite;

import android.content.ClipData;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.vk.push.core.base.AidlException;
import defpackage.a4c;
import defpackage.a8j;
import defpackage.ad1;
import defpackage.af7;
import defpackage.bha;
import defpackage.c;
import defpackage.c0a;
import defpackage.ch8;
import defpackage.cha;
import defpackage.cka;
import defpackage.cla;
import defpackage.cqk;
import defpackage.d97;
import defpackage.dwd;
import defpackage.e5d;
import defpackage.e9i;
import defpackage.ek7;
import defpackage.et3;
import defpackage.f7j;
import defpackage.fk7;
import defpackage.fla;
import defpackage.fn9;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.hla;
import defpackage.hn9;
import defpackage.i19;
import defpackage.i7j;
import defpackage.ib9;
import defpackage.iha;
import defpackage.ixj;
import defpackage.j8e;
import defpackage.je9;
import defpackage.jha;
import defpackage.jla;
import defpackage.jz;
import defpackage.kbc;
import defpackage.kma;
import defpackage.l6m;
import defpackage.lha;
import defpackage.lla;
import defpackage.lq4;
import defpackage.m5b;
import defpackage.mha;
import defpackage.mjg;
import defpackage.mvh;
import defpackage.n09;
import defpackage.n1g;
import defpackage.n1j;
import defpackage.n40;
import defpackage.n7j;
import defpackage.ng5;
import defpackage.nha;
import defpackage.nma;
import defpackage.ny8;
import defpackage.oc9;
import defpackage.ola;
import defpackage.ore;
import defpackage.osi;
import defpackage.ow0;
import defpackage.p1j;
import defpackage.p3c;
import defpackage.p90;
import defpackage.pha;
import defpackage.pll;
import defpackage.pma;
import defpackage.q2f;
import defpackage.qbe;
import defpackage.qj9;
import defpackage.qma;
import defpackage.qp4;
import defpackage.qyj;
import defpackage.r07;
import defpackage.r5a;
import defpackage.r5h;
import defpackage.r8e;
import defpackage.r9h;
import defpackage.rda;
import defpackage.rma;
import defpackage.rt2;
import defpackage.rx8;
import defpackage.sbi;
import defpackage.sdg;
import defpackage.sma;
import defpackage.soh;
import defpackage.sol;
import defpackage.svj;
import defpackage.t3f;
import defpackage.t73;
import defpackage.tha;
import defpackage.tnh;
import defpackage.tre;
import defpackage.tw8;
import defpackage.u1j;
import defpackage.u9h;
import defpackage.ur8;
import defpackage.uv2;
import defpackage.uw8;
import defpackage.v0k;
import defpackage.vma;
import defpackage.vol;
import defpackage.vp4;
import defpackage.wk8;
import defpackage.wsc;
import defpackage.ww3;
import defpackage.x7;
import defpackage.x9h;
import defpackage.xb9;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z2e;
import defpackage.z36;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zla;
import defpackage.zo5;
import defpackage.zp3;
import defpackage.ztb;
import defpackage.zv8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/sdk/messagewrite/MessageWriteWidget;", "Lone/me/sdk/arch/Widget;", "Ltw8;", "Lvp4;", "Lq2f;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "parentScopeId", "Lha9;", "localAccountId", "(Lt3f;Lha9;)V", "message-write-widget"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MessageWriteWidget extends Widget implements tw8, vp4, q2f {
    public static final /* synthetic */ zv8[] I = {new dwd(MessageWriteWidget.class, "rootView", "getRootView()Landroid/widget/LinearLayout;", 0), zo5.f(zfe.a, MessageWriteWidget.class, "container", "getContainer()Landroid/widget/FrameLayout;", 0), new dwd(MessageWriteWidget.class, "inputView", "getInputView()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0), new dwd(MessageWriteWidget.class, "menuRecyclerView", "getMenuRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new dwd(MessageWriteWidget.class, "quoteView", "getQuoteView()Lone/me/sdk/uikit/common/chat/QuoteView;", 0), new dwd(MessageWriteWidget.class, "recordControlsContainer", "getRecordControlsContainer()Landroid/view/ViewGroup;", 0), new dwd(MessageWriteWidget.class, "recordControlsRouter", "getRecordControlsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new z8b(MessageWriteWidget.class, "popupDismissJob", "getPopupDismissJob()Lkotlinx/coroutines/Job;")};
    public mvh A;
    public int B;
    public final ny8 C;
    public final ny8 D;
    public final ny8 E;
    public final p3c F;
    public kbc G;
    public int H;
    public final String a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final v0k g;
    public final ny8 h;
    public final ib9 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final j8e p;
    public final j8e q;
    public final j8e r;
    public final j8e s;
    public final ow0 t;
    public final j8e u;
    public final j8e v;
    public fn9 w;
    public qp4 x;
    public final mjg y;
    public final r8e z;

    public MessageWriteWidget(Bundle bundle) {
        super(bundle);
        this.a = MessageWriteWidget.class.getName();
        Object objF0 = tre.f0(bundle, "arg_scope_id", t3f.class);
        if (objF0 == null) {
            c.o(c0a.o("No value passed for key arg_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
            throw null;
        }
        this.b = getSharedViewModel((t3f) ((Parcelable) objF0), nma.class, null);
        Object objF1 = tre.f0(bundle, "arg_scope_id", t3f.class);
        if (objF1 == null) {
            c.o(c0a.o("No value passed for key arg_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
            throw null;
        }
        this.c = getSharedViewModel((t3f) ((Parcelable) objF1), x9h.class, null);
        Object objF2 = tre.f0(bundle, "arg_scope_id", t3f.class);
        if (objF2 == null) {
            c.o(c0a.o("No value passed for key arg_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
            throw null;
        }
        this.d = getSharedViewModel((t3f) ((Parcelable) objF2), hn9.class, null);
        Object objF3 = tre.f0(bundle, "arg_scope_id", t3f.class);
        if (objF3 == null) {
            c.o(c0a.o("No value passed for key arg_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
            throw null;
        }
        this.e = getSharedViewModel((t3f) ((Parcelable) objF3), qbe.class, null);
        Object objF4 = tre.f0(bundle, "arg_scope_id", t3f.class);
        if (objF4 == null) {
            c.o(c0a.o("No value passed for key arg_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
            throw null;
        }
        this.f = getSharedViewModel((t3f) ((Parcelable) objF4), m5b.class, null);
        v0k v0kVar = new v0k(m35getAccountScopeuqN4xOY());
        this.g = v0kVar;
        this.h = createViewModelLazy(qj9.class, new ch8(27, new pma(this, 0)));
        this.i = (ib9) v0kVar.getAccessor().c(783);
        this.j = v0kVar.getAccessor().d(161);
        this.k = v0kVar.getAccessor().d(34);
        this.l = v0kVar.getAccessor().d(241);
        v0kVar.getAccessor().d(54);
        this.m = v0kVar.getAccessor().d(26);
        this.n = v0kVar.getAccessor().d(806);
        this.o = rx8.P(3, new pma(this, 4));
        this.p = viewBinding(R.id.writebar__root);
        this.q = viewBinding(R.id.writebar__container);
        this.r = viewBinding(R.id.oneme_message_input_view_id);
        this.s = viewBinding(R.id.writebar__miui_menu);
        this.t = binding(new pma(this, 8));
        this.u = viewBinding(R.id.writebar__record_controls);
        this.v = childSlotRouter(R.id.writebar__record_controls);
        mjg mjgVarA = p90.a(Boolean.FALSE);
        this.y = mjgVarA;
        this.z = new r8e(mjgVarA);
        this.C = v0kVar.getAccessor().d(794);
        this.D = rx8.P(3, new pma(this, 9));
        this.E = rx8.P(3, new cka(1));
        this.F = qyj.S();
    }

    public static void G1(MessageWriteWidget messageWriteWidget, CharSequence charSequence, ng5 ng5Var, int i) {
        if ((i & 1) != 0) {
            charSequence = messageWriteWidget.t1().getText();
        }
        if ((i & 2) != 0) {
            ng5Var = null;
        }
        rt2 rt2Var = (rt2) messageWriteWidget.A1().c.getValue();
        if ((charSequence == null || r5h.X0(charSequence)) && !messageWriteWidget.A1().E()) {
            return;
        }
        if (messageWriteWidget.A1().d.i() && ng5Var == null) {
            nma nmaVarA1 = messageWriteWidget.A1();
            rt2 rt2Var2 = (rt2) nmaVarA1.c.getValue();
            if (rt2Var2 == null) {
                return;
            }
            a8j.x(nmaVarA1.w, new cla(vol.c(rt2Var2)));
            return;
        }
        if (rt2Var != null) {
            if (pll.d(rt2Var, (e5d) messageWriteWidget.m.getValue(), messageWriteWidget.A1().d.h(), ng5Var != null ? Long.valueOf(ng5Var.a) : null)) {
                a8j.x(messageWriteWidget.A1().x, zla.a);
                return;
            }
        }
        t73 t73Var = messageWriteWidget.A1().d;
        t73Var.getClass();
        if (t73Var != t73.e || charSequence == null || charSequence.length() == 0) {
            nma.O(messageWriteWidget.A1(), charSequence, ng5Var, 2);
            messageWriteWidget.t1().setText(null);
        } else {
            a8j.x(messageWriteWidget.A1().y, new ola(charSequence));
            messageWriteWidget.t1().setText(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    public static void I1(z2e z2eVar, boolean z) {
        osi osiVar;
        int iI0 = oc9.i0(soh.e(z2eVar.getTitleView()));
        if (z) {
            osi osiVarA = soh.a(z2eVar.getTitleView());
            if ((osiVarA != null ? osiVarA.a : 0) == iI0) {
                return;
            }
        }
        if (z) {
            osi osiVarA2 = soh.a(z2eVar.getTitleView());
            if ((osiVarA2 != null ? osiVarA2.a : 0) != iI0) {
                osiVar = new osi(z2eVar.getContext(), iI0, l6m.i);
            } else {
                osiVar = null;
            }
        } else {
            osiVar = null;
        }
        soh.d(z2eVar.getTitleView(), osiVar);
    }

    public static final void o1(MessageWriteWidget messageWriteWidget, fla flaVar) {
        n40 n40Var;
        ow0 ow0Var = messageWriteWidget.t;
        if (messageWriteWidget.getView() != null) {
            String str = null;
            CharSequence charSequence = flaVar != null ? flaVar.b : null;
            if (flaVar == null) {
                charSequence = null;
            }
            if (flaVar == null) {
                if (messageWriteWidget.D1()) {
                    messageWriteWidget.t1().setRightOuterIconActionState(jha.a);
                    messageWriteWidget.t1().setRightInnerIconVisible(false);
                } else if (messageWriteWidget.E1()) {
                    messageWriteWidget.t1().setRightOuterIconActionState(new iha(new cha(((Boolean) messageWriteWidget.A1().w1.getValue()).booleanValue())));
                    messageWriteWidget.t1().setRightInnerIconVisible(false);
                } else {
                    messageWriteWidget.t1().setRightOuterIconActionState(new iha(bha.a));
                    messageWriteWidget.t1().setRightInnerIconVisible(true);
                }
                messageWriteWidget.t1().setText(null);
            } else {
                messageWriteWidget.t1().setRightOuterIconActionState(flaVar.d ? lha.a : mha.a);
                if (flaVar.e) {
                    messageWriteWidget.H1(charSequence);
                    messageWriteWidget.t1().postDelayed(new rda(2, messageWriteWidget), 500L);
                }
                messageWriteWidget.t1().setRightInnerIconVisible(false);
            }
            messageWriteWidget.B1().F(charSequence);
            messageWriteWidget.F1(flaVar != null ? flaVar.c : null);
            if (!n7j.o(ow0Var)) {
                if (ow0Var.d()) {
                    messageWriteWidget.w1().setImageClickListener(null);
                    return;
                }
                return;
            }
            messageWriteWidget.w1().setCounter((Integer) null);
            if (flaVar != null && (n40Var = flaVar.c.d) != null) {
                str = n40Var.c;
            }
            if (str != null && str.length() != 0) {
                messageWriteWidget.w1().setDrawOverlay(true);
            }
            messageWriteWidget.w1().setImageClickListener(new x7(5, messageWriteWidget));
        }
    }

    public static final void p1(MessageWriteWidget messageWriteWidget, hla hlaVar) {
        jla jlaVar;
        Integer num;
        jla jlaVar2;
        lla llaVar = hlaVar != null ? hlaVar.e : null;
        CharSequence charSequence = (hlaVar == null || (jlaVar2 = hlaVar.d) == null) ? null : jlaVar2.a;
        boolean z = false;
        int iIntValue = (hlaVar == null || (jlaVar = hlaVar.d) == null || (num = jlaVar.b) == null) ? 0 : num.intValue();
        if ((hlaVar != null ? hlaVar.d : null) != null && !cqk.d(messageWriteWidget.t1().getText(), charSequence)) {
            messageWriteWidget.t1().setText(charSequence);
            messageWriteWidget.t1().n(iIntValue);
        }
        tha thaVarT1 = messageWriteWidget.t1();
        if (llaVar == null && !messageWriteWidget.D1() && !messageWriteWidget.E1()) {
            z = true;
        }
        thaVarT1.setRightInnerIconVisible(z);
        tha thaVarT2 = messageWriteWidget.t1();
        nha ihaVar = jha.a;
        if (llaVar == null && !messageWriteWidget.D1()) {
            ihaVar = messageWriteWidget.E1() ? new iha(new cha(((Boolean) messageWriteWidget.A1().w1.getValue()).booleanValue())) : new iha(bha.a);
        }
        thaVarT2.setRightOuterIconActionState(ihaVar);
        messageWriteWidget.F1(llaVar);
    }

    public static final void q1(MessageWriteWidget messageWriteWidget, lla llaVar) {
        je9 je9Var = je9.d;
        String str = messageWriteWidget.a;
        if (llaVar == null) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onReplyQuoteChange: quote is null", null);
            }
            messageWriteWidget.F1(llaVar);
            return;
        }
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str, "onReplyQuoteChange: quote is not null, type=".concat(r5a.n(llaVar.a)), null);
        }
        if (messageWriteWidget.D1()) {
            messageWriteWidget.t1().setRightOuterIconActionState(jha.a);
            messageWriteWidget.t1().setRightInnerIconVisible(false);
        } else if (messageWriteWidget.E1()) {
            messageWriteWidget.t1().setRightOuterIconActionState(new iha(new cha(((Boolean) messageWriteWidget.A1().w1.getValue()).booleanValue())));
            messageWriteWidget.t1().setRightInnerIconVisible(false);
        } else {
            messageWriteWidget.t1().setRightOuterIconActionState(new iha(bha.a));
            messageWriteWidget.t1().setRightInnerIconVisible(true);
        }
        if (n7j.o(messageWriteWidget.t) && messageWriteWidget.A1().K.a.getValue() != null) {
            String str2 = messageWriteWidget.a;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str2, "onReplyQuoteChange: clear input text because quote visible and edit flow is not null", null);
            }
            messageWriteWidget.t1().setText(null);
        }
        messageWriteWidget.F1(llaVar);
    }

    public static ek7 s1(Context context, af7 af7Var) {
        GestureDetector gestureDetector = new GestureDetector(context, new fk7(1, af7Var));
        gestureDetector.setIsLongpressEnabled(false);
        return new ek7(gestureDetector, 3);
    }

    public final nma A1() {
        return (nma) this.b.getValue();
    }

    public final x9h B1() {
        return (x9h) this.c.getValue();
    }

    public final int C1() {
        boolean zC = v1().c(wsc.n);
        boolean zC2 = v1().c(wsc.i);
        if (zC || !zC2) {
            return (zC2 || !zC) ? R.string.permissions_video_message_request_title : R.string.permissions_audio_title;
        }
        return R.string.permissions_video_message_request_only_camera_title;
    }

    public final boolean D1() {
        Object objF0 = tre.f0(getArgs(), "arg_scope_id", t3f.class);
        if (objF0 != null) {
            return sol.d((t3f) ((Parcelable) objF0));
        }
        c.o(c0a.o("No value passed for key arg_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
        return false;
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        u9h u9hVar;
        Object value;
        if (i == R.id.send_context_menu_action_scheduled_send) {
            nma nmaVarA1 = A1();
            rt2 rt2Var = (rt2) nmaVarA1.c.getValue();
            if (rt2Var == null) {
                return;
            }
            a8j.x(nmaVarA1.w, new cla(vol.c(rt2Var)));
            return;
        }
        r9h r9hVar = (r9h) ww3.t1(B1().B.d());
        if (r9hVar == null || (u9hVar = r9hVar.b) == null) {
            return;
        }
        List list = u9hVar.f;
        String str = (String) ww3.u1(i, list);
        if (str != null) {
            x9h x9hVarB1 = B1();
            u9h u9hVar2 = new u9h(u9hVar.a, u9hVar.b, u9hVar.c, str, u9hVar.e, list, u9hVar.g);
            mjg mjgVar = x9hVarB1.y;
            do {
                value = mjgVar.getValue();
            } while (!mjgVar.h(value, u9hVar2));
        }
        B1().G(null);
    }

    public final boolean E1() {
        Object objF0 = tre.f0(getArgs(), "arg_scope_id", t3f.class);
        if (objF0 != null) {
            return cqk.d(((t3f) ((Parcelable) objF0)).a, "StoriesScreen");
        }
        c.o(c0a.o("No value passed for key arg_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
        return false;
    }

    public final void F1(lla llaVar) {
        je9 je9Var = je9.d;
        int i = this.H;
        this.H = llaVar != null ? llaVar.a : 0;
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            int i2 = this.H;
            a4cVar.c(je9Var, str, "onQuoteChange: previousQuoteType=" + r5a.n(i) + ", currentQuoteType=" + r5a.n(i2) + ", quoteViewVisible=" + n7j.o(this.t) + ", quoteIsNull=" + (llaVar == null), null);
        }
        if (llaVar == null && n7j.o(this.t)) {
            String str2 = this.a;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "onQuoteChange: hide quote view", null);
            }
            w1().setVisibility(8);
            return;
        }
        if (llaVar != null && !n7j.o(this.t)) {
            String str3 = this.a;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str3, "onQuoteChange: show quote view, type=".concat(r5a.n(llaVar.a)), null);
            }
            View viewRequireView = requireView();
            LinearLayout linearLayout = viewRequireView instanceof LinearLayout ? (LinearLayout) viewRequireView : null;
            if (linearLayout != null) {
                n7j.a(linearLayout, w1(), 0);
            }
            L1(w1(), llaVar);
            w1().setVisibility(0);
            t1().requestFocus();
            K1();
            return;
        }
        String str4 = this.a;
        if (llaVar == null) {
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, str4, "onQuoteChange: no-op branch", null);
                return;
            }
            return;
        }
        a4c a4cVar5 = gm0.f;
        if (a4cVar5 != null && a4cVar5.b(je9Var)) {
            a4cVar5.c(je9Var, str4, "onQuoteChange: update existing quote view, type=".concat(r5a.n(llaVar.a)), null);
        }
        L1(w1(), llaVar);
        if (i != this.H) {
            String str5 = this.a;
            a4c a4cVar6 = gm0.f;
            if (a4cVar6 != null && a4cVar6.b(je9Var)) {
                a4cVar6.c(je9Var, str5, "onQuoteChange: quote type changed, show keyboard", null);
            }
            K1();
        }
    }

    public final void H1(CharSequence charSequence) {
        if (getView() != null) {
            t1().setText(charSequence);
            if (charSequence == null || charSequence.length() == 0) {
                return;
            }
            t1().n(charSequence.length());
        }
    }

    public final void J1(tnh tnhVar, boolean z) {
        z2e z2eVarW1 = w1();
        z2eVarW1.getLocationOnScreen(new int[2]);
        WindowInsets rootWindowInsets = requireView().getRootWindowInsets();
        int i = rootWindowInsets != null ? ixj.g(rootWindowInsets, null).a.f(519).d : 0;
        int i2 = uw8.a;
        int iA = uw8.a(getContext());
        if (!uw8.b(uw8.c) || Build.VERSION.SDK_INT < 29) {
            iA = 0;
        }
        Point point = new Point(gm0.K(6.0f * yl5.d().getDisplayMetrics().density), zo5.D(4.0f, yl5.d().getDisplayMetrics().density, w1().getHeight() + t1().getHeight() + i + iA) + this.B);
        mvh mvhVar = this.A;
        if (mvhVar != null) {
            mvhVar.dismiss();
        }
        mvh mvhVar2 = new mvh(getContext(), z2eVarW1, new pma(this, 5), null, 0, 1, false, 184);
        mvhVar2.c(tnhVar);
        mvhVar2.e(point, 8388691, z ? 2500L : 800L);
        mvhVar2.setOnDismissListener(new rma(this, 0));
        this.A = mvhVar2;
    }

    public final void K1() {
        t1().h(true);
    }

    public final void L1(z2e z2eVar, lla llaVar) {
        Drawable drawableP;
        boolean z = llaVar.c;
        Integer num = llaVar.f;
        I1(z2eVar, z);
        CharSequence charSequenceB = llaVar.b.b(z2eVar.getContext());
        if (charSequenceB == null) {
            ore.p("Required value was null.");
            return;
        }
        z2eVar.setTitle(charSequenceB);
        z2eVar.setAttachDescription(llaVar.d);
        z2eVar.setDrawOverlay(false);
        if (!llaVar.g) {
            z2eVar.setStartIconClickListener(null);
            z2eVar.setStartIconDrawable(null);
            return;
        }
        if (num != null) {
            drawableP = wk8.p(z2eVar.getContext(), num.intValue());
        } else {
            drawableP = null;
        }
        z2eVar.setStartIconDrawable(drawableP);
        if (num == null || llaVar.a != 3) {
            return;
        }
        nma nmaVarA1 = A1();
        xb9 xb9Var = (xb9) ((et3) nmaVarA1.f.getValue());
        if (!((Boolean) xb9Var.E0.m(xb9Var, xb9.g1[21])).booleanValue()) {
            mjg mjgVar = nmaVarA1.X;
            mjgVar.getClass();
            mjgVar.j(null, sbi.a);
        }
        z2eVar.setStartIconClickListener(new z36(this, 25, llaVar));
    }

    @Override // defpackage.q2f
    public final void g(long j, long j2) {
        if (j == 1) {
            G1(this, null, new ng5(j2, true), 1);
        }
    }

    @Override // defpackage.tw8
    public final void i() {
        t1().h(false);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qma qmaVar = new qma(this, 3);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(R.id.writebar__root);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        qmaVar.invoke(linearLayout);
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        mvh mvhVar = this.A;
        if (mvhVar != null) {
            mvhVar.dismiss();
        }
        this.A = null;
        i();
        this.w = null;
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        sdg sdgVar;
        sdg sdgVar2;
        super.onRequestPermissionsResult(i, strArr, iArr);
        int i2 = 0;
        if (i == 160) {
            int length = iArr.length;
            while (i2 < length) {
                if (iArr[i2] == -1) {
                    wsc.v(v1(), new svj(this, 1), strArr, iArr, wsc.i, R.string.permissions_audio_denied_title, R.string.permissions_audio_request_denied, 192);
                    return;
                }
                i2++;
            }
            return;
        }
        if (i != 181) {
            return;
        }
        int length2 = iArr.length;
        while (i2 < length2) {
            if (iArr[i2] == -1) {
                boolean zC = v1().c(wsc.i);
                ny8 ny8Var = this.l;
                if (!zC && (sdgVar2 = (sdg) x1().c.invoke()) != null) {
                    p1j p1jVar = (p1j) ny8Var.getValue();
                    p1jVar.getClass();
                    p1j.b(p1jVar, 4, null, sdgVar2, null, n1j.MIC_PERMISSION, 0, AidlException.SDK_IS_NOT_INITIALIZED);
                }
                if (!v1().c(wsc.n) && (sdgVar = (sdg) x1().c.invoke()) != null) {
                    p1j p1jVar2 = (p1j) ny8Var.getValue();
                    p1jVar2.getClass();
                    p1j.b(p1jVar2, 4, null, sdgVar, null, n1j.CAMERA_PERMISSION, 0, AidlException.SDK_IS_NOT_INITIALIZED);
                }
                wsc.v(v1(), new svj(this, 1), strArr, iArr, wsc.r, C1(), R.string.permissions_video_message_request, 192);
                return;
            }
            i2++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        boolean z;
        r0(!A1().I());
        Object objF0 = tre.f0(getArgs(), "arg_scope_id", t3f.class);
        if (objF0 == null) {
            c.o(c0a.o("No value passed for key arg_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
            return;
        }
        t3f t3fVar = (t3f) ((Parcelable) objF0);
        kma kmaVar = A1().q1;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(kmaVar, i19VarF, n09Var), new d97((lq4) null, this, view, 12), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new r07(uw8.f, this.y, new ad1(3, null, 5), 0), getViewLifecycleOwner().f(), n09Var), new sma(null, this, 21), 3), getViewLifecycleScope());
        if (!sol.d(t3fVar)) {
            tha thaVarT1 = t1();
            final qma qmaVar = new qma(this, 5);
            thaVarT1.getClass();
            String[] strArr = {"image/webp", "image/jpeg", "image/png", "image/gif", "image/heic", "image/heif", "image/avif"};
            pha phaVar = thaVarT1.f;
            ztb ztbVar = new ztb() { // from class: yga
                @Override // defpackage.ztb
                public final zo4 a(View view2, zo4 zo4Var) {
                    wo4 ft0Var;
                    wo4 ft0Var2;
                    Pair pairCreate;
                    yo4 yo4Var = zo4Var.a;
                    ClipData clipDataR = yo4Var.r();
                    Uri uri = null;
                    if (clipDataR.getItemCount() == 1) {
                        boolean z2 = clipDataR.getItemAt(0).getUri() != null;
                        zo4 zo4Var2 = z2 ? zo4Var : null;
                        if (z2) {
                            zo4Var = null;
                        }
                        pairCreate = Pair.create(zo4Var2, zo4Var);
                    } else {
                        ArrayList arrayList = null;
                        ArrayList arrayList2 = null;
                        for (int i = 0; i < clipDataR.getItemCount(); i++) {
                            ClipData.Item itemAt = clipDataR.getItemAt(i);
                            if (itemAt.getUri() != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(itemAt);
                            } else {
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(itemAt);
                            }
                        }
                        Pair pairCreate2 = arrayList == null ? Pair.create(null, clipDataR) : arrayList2 == null ? Pair.create(clipDataR, null) : Pair.create(zo4.a(clipDataR.getDescription(), arrayList), zo4.a(clipDataR.getDescription(), arrayList2));
                        if (pairCreate2.first == null) {
                            pairCreate = Pair.create(null, zo4Var);
                        } else if (pairCreate2.second == null) {
                            pairCreate = Pair.create(zo4Var, null);
                        } else {
                            int i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 31) {
                                ft0Var = new ft0(zo4Var);
                            } else {
                                xo4 xo4Var = new xo4();
                                xo4Var.b = yo4Var.r();
                                xo4Var.c = yo4Var.q();
                                xo4Var.d = yo4Var.getFlags();
                                xo4Var.e = yo4Var.t();
                                xo4Var.f = yo4Var.getExtras();
                                ft0Var = xo4Var;
                            }
                            ft0Var.i((ClipData) pairCreate2.first);
                            zo4 zo4VarBuild = ft0Var.build();
                            if (i2 >= 31) {
                                ft0Var2 = new ft0(zo4Var);
                            } else {
                                xo4 xo4Var2 = new xo4();
                                xo4Var2.b = yo4Var.r();
                                xo4Var2.c = yo4Var.q();
                                xo4Var2.d = yo4Var.getFlags();
                                xo4Var2.e = yo4Var.t();
                                xo4Var2.f = yo4Var.getExtras();
                                ft0Var2 = xo4Var2;
                            }
                            ft0Var2.i((ClipData) pairCreate2.second);
                            pairCreate = Pair.create(zo4VarBuild, ft0Var2.build());
                        }
                    }
                    zo4 zo4Var3 = (zo4) pairCreate.first;
                    zo4 zo4Var4 = (zo4) pairCreate.second;
                    if (zo4Var3 != null) {
                        yo4 yo4Var2 = zo4Var3.a;
                        if (yo4Var2.r().getItemCount() > 0) {
                            uri = yo4Var2.r().getItemAt(0).getUri();
                        }
                    }
                    if (uri != null) {
                        qmaVar.invoke(uri);
                    }
                    return zo4Var4;
                }
            };
            WeakHashMap weakHashMap = i7j.a;
            if (Build.VERSION.SDK_INT >= 31) {
                f7j.c(phaVar, strArr, ztbVar);
            } else {
                int i = 0;
                while (true) {
                    if (i >= 7) {
                        z = false;
                        break;
                    } else {
                        if (strArr[i].startsWith("*")) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
                qyj.h("A MIME type set here must not start with *: " + Arrays.toString(strArr), !z);
                phaVar.setTag(R.id.tag_on_receive_content_mime_types, strArr);
                phaVar.setTag(R.id.tag_on_receive_content_listener, ztbVar);
            }
        }
        x9h x9hVarB1 = B1();
        x9hVarB1.I = new uv2(this, 2, x9hVarB1);
        e9i.j0(new fz6(n1g.v(t1().getMessageState(), getViewLifecycleOwner().f(), n09Var), new sma(null, this, 13), 3), getViewLifecycleScope());
        e9i.j0(new fz6(t1().getMessagePosition(), new ur8(this, null, 8), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(B1().v, 13), getViewLifecycleOwner().f(), n09Var), new sma(null, this, 14), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(B1().B, getViewLifecycleOwner().f(), n09Var), new sma(null, this, 15), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(B1().z, 13), getViewLifecycleOwner().f(), n09Var), new sma(null, this, 16), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(((hn9) this.d.getValue()).c, 13), getViewLifecycleOwner().f(), n09Var), new sma(null, this, 17), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(A1().E, getViewLifecycleOwner().f(), n09Var), new sma(null, this, 18), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(A1().A, getViewLifecycleOwner().f(), n09Var), new sma(null, this, 19), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(A1().t1, getViewLifecycleOwner().f(), n09Var), new sma(null, this, 20), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new vma(A1().I, this, 0), getViewLifecycleOwner().f(), n09Var), new sma(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new vma(A1().K, this, 1), getViewLifecycleOwner().f(), n09Var), new sma(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new vma(A1().p1, this, 2), getViewLifecycleOwner().f(), n09Var), new sma(null, this, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(A1().Y, 13), getViewLifecycleOwner().f(), n09Var), new sma(null, this, 3), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((m5b) this.f.getValue()).f, getViewLifecycleOwner().f(), n09Var), new sma(null, this, 4), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(A1().s1, 13), getViewLifecycleOwner().f(), n09Var), new sma(null, this, 5), 3), getViewLifecycleScope());
        if (((Boolean) ((u1j) this.C.getValue()).a.getValue()).booleanValue() && !sol.d(t3fVar)) {
            e9i.j0(new fz6(n1g.v(A1().u1, getViewLifecycleOwner().f(), n09Var), new sma(null, this, 6), 3), getViewLifecycleScope());
        }
        e9i.j0(new fz6(n1g.v(A1().v1, getViewLifecycleOwner().f(), n09Var), new sma(null, this, 7), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(x1().h, getViewLifecycleOwner().f(), n09Var), new sma(null, this, 8), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(A1().w, getViewLifecycleOwner().f(), n09Var), new sma(null, this, 9), 3), getViewLifecycleScope());
        if (E1()) {
            e9i.j0(new fz6(n1g.v(A1().w1, getViewLifecycleOwner().f(), n09Var), new sma(null, this, 10), 3), getViewLifecycleScope());
        }
        if (((Boolean) this.E.getValue()).booleanValue()) {
            e9i.j0(new fz6(n1g.v(u1().h, getViewLifecycleOwner().f(), n09Var), new sma(null, this, 11), 3), getViewLifecycleScope());
            e9i.j0(new fz6(n1g.v(u1().i, getViewLifecycleOwner().f(), n09Var), new sma(null, this, 12), 3), getViewLifecycleScope());
        }
        if (((Boolean) uw8.f.getValue()).booleanValue()) {
            t1().requestFocus();
        }
    }

    @Override // defpackage.tw8
    public final void r0(boolean z) {
        pha phaVar = t1().f;
        phaVar.setShowSoftInputOnFocus(z);
        phaVar.setOnFocusChangeListener(null);
    }

    public final void r1(boolean z) {
        if (isAttached()) {
            zv8[] zv8VarArr = I;
            zv8 zv8Var = zv8VarArr[5];
            j8e j8eVar = this.u;
            ((ViewGroup) j8eVar.m(this, zv8Var)).setClipChildren(z);
            ((ViewGroup) j8eVar.m(this, zv8VarArr[5])).setClipToPadding(z);
            zv8 zv8Var2 = zv8VarArr[1];
            j8e j8eVar2 = this.q;
            ((FrameLayout) j8eVar2.m(this, zv8Var2)).setClipChildren(z);
            ((FrameLayout) j8eVar2.m(this, zv8VarArr[1])).setClipToPadding(z);
            z1().setClipChildren(z);
            z1().setClipToPadding(z);
            ViewParent parent = z1().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
            }
            ViewParent parent2 = z1().getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.setClipToPadding(z);
            }
            ViewParent parent3 = z1().getParent().getParent();
            ViewGroup viewGroup3 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
            if (viewGroup3 != null) {
                viewGroup3.setClipChildren(z);
            }
            ViewParent parent4 = z1().getParent().getParent();
            ViewGroup viewGroup4 = parent4 instanceof ViewGroup ? (ViewGroup) parent4 : null;
            if (viewGroup4 != null) {
                viewGroup4.setClipToPadding(z);
            }
        }
    }

    public final tha t1() {
        return (tha) this.r.m(this, I[2]);
    }

    public final qj9 u1() {
        return (qj9) this.h.getValue();
    }

    public final wsc v1() {
        return (wsc) this.k.getValue();
    }

    public final z2e w1() {
        zv8 zv8Var = I[4];
        return (z2e) this.t.getValue();
    }

    public final qbe x1() {
        return (qbe) this.e.getValue();
    }

    public final zp3 y1() {
        return (zp3) this.v.m(this, I[6]);
    }

    public final LinearLayout z1() {
        return (LinearLayout) this.p.m(this, I[0]);
    }

    public MessageWriteWidget(t3f t3fVar, ha9 ha9Var) {
        this(n1g.i(new ylc("arg_scope_id", t3fVar), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
