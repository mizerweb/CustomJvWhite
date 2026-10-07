package one.me.calls.ui.ui.previewjoinlink;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.a8g;
import defpackage.ayb;
import defpackage.bsb;
import defpackage.ca2;
import defpackage.ch3;
import defpackage.chb;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.eg4;
import defpackage.fu1;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.i19;
import defpackage.ic6;
import defpackage.j11;
import defpackage.j8e;
import defpackage.ks6;
import defpackage.lq4;
import defpackage.mc4;
import defpackage.msc;
import defpackage.n09;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.op1;
import defpackage.ore;
import defpackage.p51;
import defpackage.pq3;
import defpackage.q52;
import defpackage.q9c;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qt4;
import defpackage.r;
import defpackage.rp1;
import defpackage.rue;
import defpackage.rx8;
import defpackage.s52;
import defpackage.sue;
import defpackage.svj;
import defpackage.sx1;
import defpackage.tnh;
import defpackage.tp1;
import defpackage.tre;
import defpackage.tue;
import defpackage.uf4;
import defpackage.ufe;
import defpackage.up1;
import defpackage.va;
import defpackage.vp1;
import defpackage.wf4;
import defpackage.wsc;
import defpackage.wue;
import defpackage.xu1;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yp9;
import defpackage.ysc;
import defpackage.z2;
import defpackage.z4f;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import java.util.HashMap;
import kotlin.Metadata;
import one.me.calls.ui.ui.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/calls/ui/ui/previewjoinlink/CallJoinLinkPreviewWidget;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Lchb;", "Lz4f;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "link", "", "videoCall", "Lha9;", "localAccountId", "(Ljava/lang/String;Ljava/lang/Boolean;Lha9;)V", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallJoinLinkPreviewWidget extends Widget implements mc4, chb, z4f {
    public static final /* synthetic */ zv8[] v = {new dwd(CallJoinLinkPreviewWidget.class, "previewView", "getPreviewView()Lone/me/calls/ui/view/CallUserView;", 0), zo5.f(zfe.a, CallJoinLinkPreviewWidget.class, "previewViewContainer", "getPreviewViewContainer()Landroid/view/View;", 0), new dwd(CallJoinLinkPreviewWidget.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), new dwd(CallJoinLinkPreviewWidget.class, "actionButton", "getActionButton()Landroid/view/View;", 0), new dwd(CallJoinLinkPreviewWidget.class, "microphoneSwitch", "getMicrophoneSwitch()Lone/me/calls/ui/view/RoundButtonView;", 0), new dwd(CallJoinLinkPreviewWidget.class, "videoSwitch", "getVideoSwitch()Lone/me/calls/ui/view/RoundButtonView;", 0), new dwd(CallJoinLinkPreviewWidget.class, "closeView", "getCloseView()Lone/me/calls/ui/view/RoundButtonView;", 0), new dwd(CallJoinLinkPreviewWidget.class, "oneMeStackAvatarView", "getOneMeStackAvatarView()Lone/me/sdk/uikit/common/avatar/OneMeStackAvatarView;", 0)};
    public final ca2 a;
    public final sx1 b;
    public final svj c;
    public final msc d;
    public final ny8 e;
    public final ny8 f;
    public final j8e g;
    public final j8e h;
    public final j8e i;
    public final j8e j;
    public final j8e k;
    public final j8e l;
    public final j8e m;
    public final j8e n;
    public final ny8 o;
    public final ny8 p;
    public final ny8 q;
    public final ny8 r;
    public final oi8 s;
    public final ks6 t;
    public vp1 u;

    public CallJoinLinkPreviewWidget(Bundle bundle) {
        super(bundle);
        this.a = new ca2(m35getAccountScopeuqN4xOY());
        this.b = new sx1(m35getAccountScopeuqN4xOY());
        this.c = new svj(this, 1);
        this.d = new msc(ysc.a.a());
        this.e = rx8.P(3, new rp1(this, 1));
        this.f = createViewModelLazy(op1.class, new r(21, new z2(this, 15, bundle)));
        this.g = viewBinding(R.id.call_join_link_with_ask_device_preview);
        this.h = viewBinding(R.id.call_join_link_with_ask_device_preview_container);
        this.i = viewBinding(R.id.call_join_link_title);
        this.j = viewBinding(R.id.call_join_link_with_ask_device_action_button);
        this.k = viewBinding(R.id.call_join_link_with_ask_device_microphone_switch);
        this.l = viewBinding(R.id.call_join_link_with_ask_device_video_switch);
        this.m = viewBinding(R.id.call_join_link_cancel);
        this.n = viewBinding(R.id.call_join_link_stack_avatar);
        this.o = rx8.P(3, new rp1(this, 2));
        this.p = rx8.P(3, new rp1(this, 3));
        this.q = rx8.P(3, new rp1(this, 4));
        this.r = rx8.P(3, new rp1(this, 5));
        this.s = new oi8(3, 3, 3, new j11(3, 3, false));
        this.t = tre.G(this, new va(28));
    }

    public static void p1(wf4 wf4Var, View view, View view2, s52 s52Var, TextView textView, wue wueVar, q9c q9cVar, wue wueVar2, wue wueVar3) {
        eg4 eg4VarH = ch3.h(wf4Var);
        int id = textView.getId();
        eg4VarH.d(id, 6, view.getId(), 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id));
        eg4VarH.d(id, 3, 0, 3);
        new bsb(3, eg4VarH, id).a(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        eg4VarH.d(id, 7, wueVar.getId(), 6);
        new bsb(7, eg4VarH, id).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        eg4VarH.g(id).d.w = 0.0f;
        eg4VarH.g(id).d.l0 = true;
        int id2 = wueVar.getId();
        eg4VarH.d(id2, 3, textView.getId(), 3);
        eg4VarH.d(id2, 4, textView.getId(), 4);
        eg4VarH.d(id2, 7, 0, 7);
        new bsb(7, eg4VarH, id2).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id3 = q9cVar.getId();
        eg4VarH.d(id3, 3, textView.getId(), 4);
        qt4.w(24.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id3));
        eg4VarH.d(id3, 7, 0, 7);
        new bsb(7, eg4VarH, id3).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        eg4VarH.d(id3, 6, view.getId(), 6);
        new bsb(6, eg4VarH, id3).a(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.g(id3).d.l0 = true;
        eg4VarH.g(id3).d.w = 0.0f;
        int id4 = view2.getId();
        HashMap map = eg4VarH.c;
        map.remove(Integer.valueOf(id4));
        eg4VarH.d(id4, 3, 0, 3);
        eg4VarH.d(id4, 6, 0, 6);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id4));
        eg4VarH.d(id4, 4, 0, 4);
        eg4VarH.d(id4, 7, view.getId(), 6);
        new bsb(7, eg4VarH, id4).a(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        int id5 = wueVar2.getId();
        eg4VarH.d(id5, 4, view2.getId(), 4);
        new bsb(4, eg4VarH, id5).a(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.d(id5, 7, wueVar3.getId(), 6);
        eg4VarH.d(id5, 6, view2.getId(), 6);
        eg4VarH.g(id5).d.V = 2;
        int id6 = wueVar3.getId();
        eg4VarH.d(id6, 4, wueVar2.getId(), 4);
        eg4VarH.d(id6, 3, wueVar2.getId(), 3);
        eg4VarH.d(id6, 7, view2.getId(), 7);
        eg4VarH.d(id6, 6, wueVar2.getId(), 7);
        new bsb(6, eg4VarH, id6).a(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        int id7 = view.getId();
        map.remove(Integer.valueOf(id7));
        eg4VarH.d(id7, 7, 0, 7);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id7));
        eg4VarH.d(id7, 4, 0, 4);
        eg4VarH.a(wf4Var);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            p51.d();
            return;
        }
        layoutParams.width = -2;
        layoutParams.height = -2;
        view.setLayoutParams(layoutParams);
        view.setMinimumWidth(gm0.K(252.0f * yl5.d().getDisplayMetrics().density));
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 == null) {
            p51.d();
            return;
        }
        layoutParams2.width = 0;
        layoutParams2.height = -1;
        view2.setLayoutParams(layoutParams2);
        s52Var.setMode(q52.PREVIEW_LANDSCAPE);
    }

    public static void q1(wf4 wf4Var, View view, View view2, s52 s52Var, TextView textView, wue wueVar, q9c q9cVar, wue wueVar2, wue wueVar3) {
        eg4 eg4VarH = ch3.h(wf4Var);
        int id = textView.getId();
        eg4VarH.d(id, 6, 0, 6);
        qt4.w(60.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id));
        eg4VarH.d(id, 3, 0, 3);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id));
        eg4VarH.d(id, 7, 0, 7);
        new bsb(7, eg4VarH, id).a(gm0.K(60.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.g(id).d.w = 0.5f;
        eg4VarH.g(id).d.l0 = true;
        int id2 = wueVar.getId();
        eg4VarH.d(id2, 3, textView.getId(), 3);
        eg4VarH.d(id2, 4, textView.getId(), 4);
        eg4VarH.d(id2, 7, 0, 7);
        new bsb(7, eg4VarH, id2).a(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        int id3 = q9cVar.getId();
        eg4VarH.d(id3, 3, textView.getId(), 4);
        qt4.w(24.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id3));
        eg4VarH.d(id3, 7, 0, 7);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id3));
        eg4VarH.d(id3, 6, 0, 6);
        new bsb(6, eg4VarH, id3).a(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        eg4VarH.g(id3).d.w = 0.5f;
        int id4 = view2.getId();
        eg4VarH.d(id4, 3, q9cVar.getId(), 4);
        qt4.w(24.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id4));
        eg4VarH.d(id4, 7, 0, 7);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, id4));
        eg4VarH.d(id4, 6, 0, 6);
        new bsb(6, eg4VarH, id4).a(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        eg4VarH.d(id4, 4, view.getId(), 3);
        new bsb(4, eg4VarH, id4).a(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        int id5 = wueVar2.getId();
        eg4VarH.d(id5, 4, view2.getId(), 4);
        new bsb(4, eg4VarH, id5).a(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.d(id5, 7, wueVar3.getId(), 6);
        eg4VarH.d(id5, 6, 0, 6);
        eg4VarH.g(id5).d.V = 2;
        int id6 = wueVar3.getId();
        eg4VarH.d(id6, 4, wueVar2.getId(), 4);
        eg4VarH.d(id6, 3, wueVar2.getId(), 3);
        eg4VarH.d(id6, 7, 0, 7);
        eg4VarH.d(id6, 6, wueVar2.getId(), 7);
        new bsb(6, eg4VarH, id6).a(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        int id7 = view.getId();
        eg4VarH.c.remove(Integer.valueOf(id7));
        eg4VarH.d(id7, 7, s52Var.getId(), 7);
        new bsb(7, eg4VarH, id7).a(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        eg4VarH.d(id7, 6, s52Var.getId(), 6);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id7));
        eg4VarH.d(id7, 4, 0, 4);
        new bsb(4, eg4VarH, id7).a(gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.a(wf4Var);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            p51.d();
            return;
        }
        layoutParams.width = -1;
        layoutParams.height = -2;
        view.setLayoutParams(layoutParams);
        view.setMinimumWidth(0);
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 == null) {
            p51.d();
            return;
        }
        layoutParams2.width = 0;
        layoutParams2.height = 0;
        view2.setLayoutParams(layoutParams2);
        s52Var.setMode(q52.PREVIEW);
    }

    public static void r1(wue wueVar, Drawable drawable, Drawable drawable2, yp9 yp9Var, tnh tnhVar, tnh tnhVar2) {
        wueVar.setVisibility(yp9Var != yp9.d ? 0 : 8);
        int iOrdinal = yp9Var.ordinal();
        rue rueVar = rue.e;
        a8g a8gVar = pq3.j;
        if (iOrdinal == 0) {
            wueVar.y(a8gVar.l(wueVar).b.getIcon().f, drawable2);
            wueVar.setMode(rueVar);
            wueVar.setAccessibility(tnhVar2);
            return;
        }
        if (iOrdinal == 1) {
            a8gVar.l(wueVar);
            wueVar.y(-1, drawable);
            wueVar.setMode(rue.f);
            wueVar.setAccessibility(tnhVar);
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                ore.o();
                return;
            }
        }
        wueVar.y(a8gVar.l(wueVar).b.getIcon().j, drawable2);
        wueVar.setMode(rueVar);
        wueVar.setAccessibility(tnhVar2);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        ((xu1) this.e.getValue()).g(i);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getS() {
        return this.s;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.t;
    }

    public final op1 o1() {
        return (op1) this.f.getValue();
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
    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        wf4 wf4Var = new wf4(layoutInflater.getContext());
        wf4Var.setLayoutParams(new uf4(-1, -1));
        a8g a8gVar = pq3.j;
        wf4Var.setBackgroundColor(a8gVar.l(wf4Var).b.b().b);
        s52 s52Var = new s52(wf4Var.getContext(), getD().b());
        s52Var.setId(R.id.call_join_link_with_ask_device_preview);
        s52Var.setMode(q52.PREVIEW);
        s52Var.I(null, s52Var.getContext().getString(R.string.call_me_member));
        tp1 tp1Var = new tp1(this);
        s52Var.x1 = fu1.c;
        s52Var.s1 = tp1Var;
        s52Var.setCustomTheme(a8gVar.l(s52Var).b);
        FrameLayout frameLayout = new FrameLayout(wf4Var.getContext());
        frameLayout.setId(R.id.call_join_link_with_ask_device_preview_container);
        frameLayout.addView(s52Var);
        wf4Var.addView(frameLayout);
        TextView textView = new TextView(wf4Var.getContext());
        textView.setId(R.id.call_join_link_title);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        textView.setText(R.string.call_join_by_link_ask_start_title);
        q9i.a(q9i.f, textView);
        textView.setTextColor(a8gVar.l(textView).b.getText().b);
        wf4Var.addView(textView, -2, -2);
        wue wueVar = new wue(wf4Var.getContext());
        wueVar.setId(R.id.call_join_link_cancel);
        wueVar.setContentDescription(wueVar.getContext().getString(R.string.call_close_dialog_accessibility));
        wueVar.x(R.drawable.icon_cross, a8gVar.l(wueVar).b.getIcon().b);
        final int i = 0;
        qe7.H(wueVar, 300L, new View.OnClickListener(this) { // from class: qp1
            public final /* synthetic */ CallJoinLinkPreviewWidget b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.b;
                switch (i2) {
                    case 0:
                        zv8[] zv8VarArr = CallJoinLinkPreviewWidget.v;
                        callJoinLinkPreviewWidget.getRouter().C(callJoinLinkPreviewWidget);
                        break;
                    default:
                        zv8[] zv8VarArr2 = CallJoinLinkPreviewWidget.v;
                        op1 op1VarO1 = callJoinLinkPreviewWidget.o1();
                        lp1 lp1Var = (lp1) op1VarO1.o.getValue();
                        ic6 ic6Var = op1VarO1.r;
                        String str = op1VarO1.c;
                        boolean z = op1VarO1.g;
                        yp9 yp9Var = lp1Var.c;
                        boolean z2 = false;
                        yp9 yp9Var2 = yp9.b;
                        if (yp9Var == yp9Var2) {
                            z2 = true;
                        }
                        a8j.x(ic6Var, new un1(str, z, z2, lp1Var.b == yp9Var2, lp1Var.d));
                        break;
                }
            }
        });
        wueVar.setImageSize(new sue(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
        wueVar.setButtonPadding(gm0.K(3.0f * yl5.d().getDisplayMetrics().density));
        rue rueVar = rue.a;
        wueVar.setMode(rueVar);
        wf4Var.addView(wueVar);
        q9c q9cVar = new q9c(wf4Var.getContext());
        q9cVar.setId(R.id.call_join_link_stack_avatar);
        q9cVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        wf4Var.addView(q9cVar);
        wue wueVar2 = new wue(wf4Var.getContext());
        wueVar2.setId(R.id.call_join_link_with_ask_device_microphone_switch);
        wueVar2.setAccessibility(Integer.valueOf(R.string.call_join_by_link_ask_microphone));
        wueVar2.setTextColor(a8gVar.l(wueVar2).b.getText().b);
        wueVar2.setListener(new tue(this) { // from class: sp1
            public final /* synthetic */ CallJoinLinkPreviewWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.tue
            public final void a() {
                int i2 = i;
                yp9 yp9Var = yp9.b;
                CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.b;
                switch (i2) {
                    case 0:
                        zv8[] zv8VarArr = CallJoinLinkPreviewWidget.v;
                        callJoinLinkPreviewWidget.o1().C(!(((lp1) callJoinLinkPreviewWidget.o1().o.getValue()).b == yp9Var));
                        break;
                    default:
                        zv8[] zv8VarArr2 = CallJoinLinkPreviewWidget.v;
                        callJoinLinkPreviewWidget.o1().D(!(((lp1) callJoinLinkPreviewWidget.o1().o.getValue()).c == yp9Var));
                        break;
                }
            }
        });
        wueVar2.setMode(rueVar);
        wueVar2.x(R.drawable.icon_microphone, a8gVar.l(wueVar2).b.getIcon().b);
        wueVar2.setImageSize(new sue(gm0.K(yl5.d().getDisplayMetrics().density * 54.0f), gm0.K(yl5.d().getDisplayMetrics().density * 54.0f)));
        wueVar2.setButtonPadding(gm0.K(yl5.d().getDisplayMetrics().density * 5.0f));
        wf4Var.addView(wueVar2, -2, -2);
        wue wueVar3 = new wue(wf4Var.getContext());
        wueVar3.setId(R.id.call_join_link_with_ask_device_video_switch);
        wueVar3.x(R.drawable.icon_video_call, a8gVar.l(wueVar3).b.getIcon().b);
        wueVar3.setAccessibility(Integer.valueOf(R.string.call_join_by_link_ask_video));
        wueVar3.setTextColor(a8gVar.l(wueVar3).b.getText().b);
        wueVar3.setMode(rueVar);
        final int i2 = 1;
        wueVar3.setListener(new tue(this) { // from class: sp1
            public final /* synthetic */ CallJoinLinkPreviewWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.tue
            public final void a() {
                int i3 = i2;
                yp9 yp9Var = yp9.b;
                CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = CallJoinLinkPreviewWidget.v;
                        callJoinLinkPreviewWidget.o1().C(!(((lp1) callJoinLinkPreviewWidget.o1().o.getValue()).b == yp9Var));
                        break;
                    default:
                        zv8[] zv8VarArr2 = CallJoinLinkPreviewWidget.v;
                        callJoinLinkPreviewWidget.o1().D(!(((lp1) callJoinLinkPreviewWidget.o1().o.getValue()).c == yp9Var));
                        break;
                }
            }
        });
        wueVar3.setImageSize(new sue(gm0.K(yl5.d().getDisplayMetrics().density * 54.0f), gm0.K(54.0f * yl5.d().getDisplayMetrics().density)));
        wueVar3.setButtonPadding(gm0.K(5.0f * yl5.d().getDisplayMetrics().density));
        wf4Var.addView(wueVar3, -2, -2);
        cyb cybVar = new cyb(wf4Var.getContext());
        cybVar.setId(R.id.call_join_link_with_ask_device_action_button);
        cybVar.setText(np4.q(getContext(), R.string.call_join_by_link_ask_start_call));
        cybVar.setCustomTheme(a8gVar.l(cybVar).b);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        qe7.H(cybVar, 300L, new View.OnClickListener(this) { // from class: qp1
            public final /* synthetic */ CallJoinLinkPreviewWidget b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = CallJoinLinkPreviewWidget.v;
                        callJoinLinkPreviewWidget.getRouter().C(callJoinLinkPreviewWidget);
                        break;
                    default:
                        zv8[] zv8VarArr2 = CallJoinLinkPreviewWidget.v;
                        op1 op1VarO1 = callJoinLinkPreviewWidget.o1();
                        lp1 lp1Var = (lp1) op1VarO1.o.getValue();
                        ic6 ic6Var = op1VarO1.r;
                        String str = op1VarO1.c;
                        boolean z = op1VarO1.g;
                        yp9 yp9Var = lp1Var.c;
                        boolean z2 = false;
                        yp9 yp9Var2 = yp9.b;
                        if (yp9Var == yp9Var2) {
                            z2 = true;
                        }
                        a8j.x(ic6Var, new un1(str, z, z2, lp1Var.b == yp9Var2, lp1Var.d));
                        break;
                }
            }
        });
        wf4Var.addView(cybVar);
        if (wf4Var.getContext().getResources().getConfiguration().orientation == 1) {
            q1(wf4Var, cybVar, frameLayout, s52Var, textView, wueVar, q9cVar, wueVar2, wueVar3);
            return wf4Var;
        }
        p1(wf4Var, cybVar, frameLayout, s52Var, textView, wueVar, q9cVar, wueVar2, wueVar3);
        return wf4Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        vp1 vp1Var = this.u;
        if (vp1Var != null) {
            view.getContext().unregisterComponentCallbacks(vp1Var);
        }
        this.u = null;
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        msc mscVar = this.d;
        if (i == 159 && mscVar.b().c(wsc.n)) {
            o1().D(true);
        } else if (i == 160 && mscVar.b().c(wsc.i)) {
            o1().C(true);
        } else {
            ((xu1) this.e.getValue()).b(i, iArr);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ic6 ic6Var = o1().r;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        lq4 lq4Var = null;
        int i = 3;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new up1(lq4Var, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().o, getViewLifecycleOwner().f(), n09Var), new up1(lq4Var, this, 1), i), getViewLifecycleScope());
        wf4 wf4Var = (wf4) view;
        Context context = view.getContext();
        ufe ufeVar = new ufe();
        ufeVar.a = context.getResources().getConfiguration().orientation;
        vp1 vp1Var = new vp1(ufeVar, this, wf4Var, wf4Var);
        context.registerComponentCallbacks(vp1Var);
        this.u = vp1Var;
    }

    public CallJoinLinkPreviewWidget(String str, Boolean bool, ha9 ha9Var) {
        this(n1g.i(new ylc("call_join_link", str), new ylc("is_video_call", bool), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
