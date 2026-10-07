package one.me.android.join;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.awb;
import defpackage.ayb;
import defpackage.cel;
import defpackage.ch8;
import defpackage.cyb;
import defpackage.dq8;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.f7;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.i19;
import defpackage.kwb;
import defpackage.ldf;
import defpackage.lq4;
import defpackage.ltb;
import defpackage.mp5;
import defpackage.mt5;
import defpackage.n09;
import defpackage.n1g;
import defpackage.np4;
import defpackage.nv4;
import defpackage.ny8;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.r5h;
import defpackage.r8e;
import defpackage.vp8;
import defpackage.vr8;
import defpackage.vv;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z36;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.android.deeplink.LinkInterceptorActivity;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lone/me/android/join/JoinChatWidget;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "", "link", "Lha9;", "localAccountId", "(JLjava/lang/String;Lha9;)V", "oneme"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JoinChatWidget extends BaseBottomSheetWidget {
    public static final /* synthetic */ zv8[] t = {new dwd(JoinChatWidget.class, "id", "getId()J", 0), zo5.f(zfe.a, JoinChatWidget.class, "link", "getLink()Ljava/lang/String;", 0)};
    public final vv m;
    public final vv n;
    public final h o;
    public final ny8 p;
    public final boolean q;
    public vp8 r;
    public LinearLayout s;

    public JoinChatWidget(Bundle bundle) {
        super(bundle);
        this.m = new vv("join:id", Long.class);
        this.n = new vv("join:link", String.class);
        this.o = new h(m35getAccountScopeuqN4xOY());
        ny8 ny8VarCreateViewModelLazy = createViewModelLazy(vr8.class, new ch8(4, new mp5(28, this)));
        this.p = ny8VarCreateViewModelLazy;
        this.q = true;
        r8e r8eVar = ((vr8) ny8VarCreateViewModelLazy.getValue()).g;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new dq8(this, null, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((vr8) ny8VarCreateViewModelLazy.getValue()).h, this.lifecycleOwner.f(), n09Var), new dq8(this, null, 1), i), getLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void C1(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        int iK = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        frameLayout.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), iK, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), gm0.K(24.0f * yl5.d().getDisplayMetrics().density), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
        this.s = linearLayout;
        vp8 vp8Var = this.r;
        if (vp8Var != null) {
            E1(linearLayout, vp8Var);
        }
        frameLayout.addView(linearLayout, -1, -2);
        mt5 mt5Var = new mt5(frameLayout.getContext());
        mt5Var.setTranslationY(zo5.b(6.0f, yl5.d().getDisplayMetrics().density, -iK));
        frameLayout.addView(mt5Var);
    }

    public final cyb D1(int i) {
        cyb cybVar = new cyb(getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        marginLayoutParams.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        marginLayoutParams.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        marginLayoutParams.bottomMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        cybVar.setLayoutParams(marginLayoutParams);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(getContext(), i));
        qe7.H(cybVar, 300L, new z36(cybVar, 11, this));
        return cybVar;
    }

    public final void E1(LinearLayout linearLayout, vp8 vp8Var) {
        float f;
        int iK;
        linearLayout.removeAllViews();
        boolean z = vp8Var instanceof vp8;
        int i = R.string.join_chat_confirm_chat_button;
        if (!z) {
            linearLayout.addView(D1(R.string.join_chat_confirm_chat_button));
            return;
        }
        boolean z2 = vp8Var.h;
        String str = vp8Var.c;
        int i2 = vp8Var.d;
        boolean z3 = vp8Var.b;
        boolean z4 = z3 && i2 > 0;
        boolean z5 = (!z3 || str == null || r5h.X0(str)) ? false : true;
        boolean z6 = z3 && z2;
        boolean z7 = vp8Var.i == null;
        if (z3 && z2) {
            i = R.string.join_chat_apply_button;
        } else if (z3) {
            i = R.string.join_chat_confirm_channel_button;
        }
        kwb kwbVar = new kwb(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 80.0f), gm0.K(yl5.d().getDisplayMetrics().density * 80.0f));
        layoutParams.gravity = 1;
        kwbVar.setLayoutParams(layoutParams);
        kwb.w(kwbVar, gm0.K(80.0f * yl5.d().getDisplayMetrics().density));
        kwbVar.setAvatarShape(awb.a);
        kwb.v(kwbVar, vp8Var.e, Long.valueOf(vp8Var.f.longValue()), vp8Var.g);
        linearLayout.addView(kwbVar);
        TextView textView = new TextView(getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        if (z4) {
            f = 20.0f;
            iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        } else {
            f = 20.0f;
            iK = gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
        }
        marginLayoutParams.bottomMargin = iK;
        textView.setLayoutParams(marginLayoutParams);
        textView.setGravity(17);
        textView.setText(vp8Var.a);
        textView.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        q9i.a(q9i.c, textView);
        int i3 = 3;
        lq4 lq4Var = null;
        n1g.N(new f7(i3, lq4Var, 25), textView);
        linearLayout.addView(textView);
        if (z4) {
            TextView textView2 = new TextView(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams2.bottomMargin = z5 ? gm0.K(yl5.d().getDisplayMetrics().density * f) : gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
            textView2.setLayoutParams(marginLayoutParams2);
            textView2.setGravity(17);
            textView2.setText(ldf.j.h(textView2.getContext(), i2));
            q9i.a(q9i.g, textView2);
            n1g.N(new f7(i3, lq4Var, 24), textView2);
            linearLayout.addView(textView2);
        }
        if (z5) {
            TextView textView3 = new TextView(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams3.bottomMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
            marginLayoutParams3.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f));
            marginLayoutParams3.setMarginEnd(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
            textView3.setLayoutParams(marginLayoutParams3);
            textView3.setGravity(17);
            textView3.setText(str);
            textView3.setMaxLines(8);
            textView3.setEllipsize(truncateAt);
            q9i.a(q9i.e, textView3);
            n1g.N(new f7(i3, lq4Var, 23), textView3);
            linearLayout.addView(textView3);
        }
        if (z7) {
            linearLayout.addView(D1(i));
        }
        if (z6) {
            TextView textView4 = new TextView(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams4.topMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
            marginLayoutParams4.setMarginStart(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
            marginLayoutParams4.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
            marginLayoutParams4.bottomMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
            textView4.setLayoutParams(marginLayoutParams4);
            textView4.setGravity(17);
            textView4.setText(np4.q(getContext(), R.string.join_chat_application_note));
            q9i.a(q9i.g, textView4);
            n1g.N(new f7(i3, lq4Var, 22), textView4);
            linearLayout.addView(textView4);
        }
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: isDialog, reason: from getter */
    public final boolean getQ() {
        return this.q;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onDestroyView(View view) {
        this.s = null;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ltb onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            cel.a(onBackPressedDispatcher, getViewLifecycleOwner(), new nv4(21, this));
        }
        getRouter().K();
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void w1() {
        super.w1();
        Activity activityD = getRouter().d();
        LinkInterceptorActivity linkInterceptorActivity = activityD instanceof LinkInterceptorActivity ? (LinkInterceptorActivity) activityD : null;
        if (linkInterceptorActivity != null) {
            linkInterceptorActivity.finish();
        }
    }

    public JoinChatWidget(long j, String str, ha9 ha9Var) {
        this(n1g.i(new ylc("join:id", Long.valueOf(j)), new ylc("join:link", str), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
