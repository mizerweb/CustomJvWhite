package one.me.calls.ui.bottomsheet.unkowncontact;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.i19;
import defpackage.j8e;
import defpackage.j8g;
import defpackage.jci;
import defpackage.jyf;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.q9i;
import defpackage.qa2;
import defpackage.r8e;
import defpackage.sx1;
import defpackage.t2g;
import defpackage.vbi;
import defpackage.vuf;
import defpackage.vv;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yvf;
import defpackage.zbi;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lone/me/calls/ui/bottomsheet/unkowncontact/UnknownContactBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "callId", "", "callerId", "Lha9;", "localAccountId", "(Ljava/lang/String;JLha9;)V", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UnknownContactBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] C = {new dwd(UnknownContactBottomSheet.class, "callId", "getCallId()Ljava/lang/String;", 0), zo5.f(zfe.a, UnknownContactBottomSheet.class, "callerServerId", "getCallerServerId()J", 0), new dwd(UnknownContactBottomSheet.class, "title", "getTitle()Landroid/widget/TextView;", 0), new dwd(UnknownContactBottomSheet.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0), new dwd(UnknownContactBottomSheet.class, "buttons", "getButtons()Lone/me/calls/ui/bottomsheet/unkowncontact/view/UnknownContactButtonGroup;", 0)};
    public final ny8 A;
    public final AutoTransition B;
    public final vv u;
    public final vv v;
    public final j8e w;
    public final j8e x;
    public final j8e y;
    public final sx1 z;

    public UnknownContactBottomSheet(Bundle bundle) {
        super(bundle);
        this.u = new vv("unknowncall:call_id", String.class);
        this.v = new vv("unknowncall:caller_id", Long.class);
        this.w = viewBinding(R.id.unknown_call_bottom_sheet_title);
        this.x = viewBinding(R.id.unknown_call_bottom_sheet_subtitle);
        this.y = viewBinding(R.id.unknown_call_bottom_sheet_button_group);
        this.z = new sx1(m35getAccountScopeuqN4xOY());
        this.A = createViewModelLazy(jci.class, new t2g(27, new vbi(0, this)));
        this.B = new AutoTransition();
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(R.id.unknown_call_bottom_sheet_title);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), textView.getPaddingBottom());
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        q9i.a(q9i.c, textView);
        n1g.N(new yvf(3, null, 5), textView);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setId(R.id.unknown_call_bottom_sheet_subtitle);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView2.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density), textView2.getPaddingBottom());
        textView2.setLayoutParams(layoutParams2);
        textView2.setGravity(17);
        q9i.a(q9i.i, textView2);
        n1g.N(new yvf(3, null, 6), textView2);
        linearLayout.addView(textView2);
        zbi zbiVar = new zbi(linearLayout.getContext(), null);
        zbiVar.setOrientation(1);
        zbiVar.setGravity(17);
        zbiVar.setId(R.id.unknown_call_bottom_sheet_button_group);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin, gm0.K(24.0f * yl5.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin, gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        zbiVar.setListener(new vuf(20, this));
        zbiVar.setLayoutParams(layoutParams3);
        linearLayout.addView(zbiVar);
        return linearLayout;
    }

    public final jci F1() {
        return (jci) this.A.getValue();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        r8e r8eVar = F1().p;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new jyf((lq4) null, view, this, 10), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(F1().q, getViewLifecycleOwner().f(), n09Var), new j8g((lq4) null, this, 19), 3), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void u1() {
        jci jciVarF1 = F1();
        jciVarF1.B().h(qa2.CLOSE, jciVarF1.c);
    }

    public UnknownContactBottomSheet(String str, long j, ha9 ha9Var) {
        this(n1g.i(new ylc("unknowncall:call_id", str), new ylc("unknowncall:caller_id", Long.valueOf(j)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
