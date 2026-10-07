package one.me.calls.ui.bottomsheet.ratecall;

import android.content.Context;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.ayb;
import defpackage.cyb;
import defpackage.dw1;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.f7;
import defpackage.fz6;
import defpackage.fze;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.i19;
import defpackage.j8e;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.o4e;
import defpackage.q4e;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qv1;
import defpackage.r;
import defpackage.r66;
import defpackage.r8e;
import defpackage.sx1;
import defpackage.t8;
import defpackage.vv;
import defpackage.w4e;
import defpackage.wv1;
import defpackage.x4e;
import defpackage.yk1;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, d2 = {"Lone/me/calls/ui/bottomsheet/ratecall/CallRateBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lo4e;", "Lw4e;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "callId", "", "isGroup", "isVideoCall", "", "sdkReasons", "Lha9;", "localAccountId", "(Ljava/lang/String;ZZLjava/util/List;Lha9;)V", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallRateBottomSheet extends BottomSheetWidget implements o4e, w4e {
    public static final /* synthetic */ zv8[] F = {new dwd(CallRateBottomSheet.class, "callId", "getCallId()Ljava/lang/String;", 0), zo5.f(zfe.a, CallRateBottomSheet.class, "isGroupCall", "isGroupCall()Z", 0), new dwd(CallRateBottomSheet.class, "isVideoCall", "isVideoCall()Z", 0), new dwd(CallRateBottomSheet.class, "sdkReasons", "getSdkReasons()Ljava/util/List;", 0), new dwd(CallRateBottomSheet.class, "title", "getTitle()Landroid/widget/TextView;", 0), new dwd(CallRateBottomSheet.class, "rateCallButtonGroup", "getRateCallButtonGroup()Lone/me/calls/ui/bottomsheet/ratecall/view/RateCallButtonGroup;", 0), new dwd(CallRateBottomSheet.class, "reasonsChipGroup", "getReasonsChipGroup()Lone/me/calls/ui/bottomsheet/ratecall/view/RateCallReasonsChipGroup;", 0), new dwd(CallRateBottomSheet.class, "sendButton", "getSendButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final ny8 A;
    public final j8e B;
    public final j8e C;
    public final j8e D;
    public final j8e E;
    public final vv u;
    public final vv v;
    public final vv w;
    public final vv x;
    public final AutoTransition y;
    public final sx1 z;

    public CallRateBottomSheet(Bundle bundle) {
        super(bundle);
        this.u = new vv("ratecall:call_id", String.class);
        Class<Boolean> cls = Boolean.class;
        this.v = new vv("ratecall:is_group_call", cls);
        this.w = new vv("ratecall:is_video_call", cls);
        this.x = new vv("ratecall:sdk_reasons", List.class);
        this.y = new AutoTransition();
        this.z = new sx1(m35getAccountScopeuqN4xOY());
        this.A = createViewModelLazy(dw1.class, new r(26, new yk1(8, this)));
        this.B = viewBinding(R.id.call_rate_toolbar);
        this.C = viewBinding(R.id.call_rate_button_group);
        this.D = viewBinding(R.id.call_rate_chip_group);
        this.E = viewBinding(R.id.call_rate_send_button);
    }

    public static final x4e F1(CallRateBottomSheet callRateBottomSheet) {
        return (x4e) callRateBottomSheet.D.m(callRateBottomSheet, F[6]);
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        TextView textViewE = qv1.e(context, R.id.call_rate_toolbar);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 24.0f);
        textViewE.setLayoutParams(layoutParams);
        textViewE.setGravity(17);
        q9i.a(q9i.c, textViewE);
        int i = 3;
        n1g.N(new f7(i, null, i), textViewE);
        q4e q4eVar = new q4e(context, null);
        q4eVar.b = 3;
        q4eVar.setOrientation(0);
        q4eVar.setGravity(17);
        q4eVar.c = r66.a;
        q4eVar.setId(R.id.call_rate_button_group);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 24.0f);
        q4eVar.setLayoutParams(layoutParams2);
        q4eVar.setGravity(17);
        q4eVar.setListener(this);
        x4e x4eVar = new x4e(context, null);
        x4eVar.setId(R.id.call_rate_chip_group);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 24.0f);
        x4eVar.setLayoutParams(layoutParams3);
        x4eVar.setListener(this);
        cyb cybVar = new cyb(context);
        cybVar.setId(R.id.call_rate_send_button);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(getContext(), R.string.call_rate_send_button_text));
        qe7.H(cybVar, 300L, new t8(8, this));
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setPaddingRelative(0, gm0.K(24.0f * yl5.d().getDisplayMetrics().density), 0, 0);
        linearLayout.addView(textViewE);
        linearLayout.addView(q4eVar);
        linearLayout.addView(x4eVar);
        linearLayout.addView(cybVar);
        return linearLayout;
    }

    public final dw1 G1() {
        return (dw1) this.A.getValue();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        r8e r8eVar = G1().j;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        lq4 lq4Var = null;
        int i = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new wv1(lq4Var, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(G1().l, getViewLifecycleOwner().f(), n09Var), new wv1(lq4Var, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(G1().n, getViewLifecycleOwner().f(), n09Var), new fze(lq4Var, view, this, 8), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(G1().o, getViewLifecycleOwner().f(), n09Var), new wv1(lq4Var, this, 2), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(G1().p, getViewLifecycleOwner().f(), n09Var), new wv1(lq4Var, this, i), i), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void z1() {
        G1().C(true);
    }

    public CallRateBottomSheet(String str, boolean z, boolean z2, List<String> list, ha9 ha9Var) {
        this(n1g.i(new ylc("ratecall:call_id", str), new ylc("ratecall:is_group_call", Boolean.valueOf(z)), new ylc("ratecall:is_video_call", Boolean.valueOf(z2)), new ylc("ratecall:sdk_reasons", list), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
