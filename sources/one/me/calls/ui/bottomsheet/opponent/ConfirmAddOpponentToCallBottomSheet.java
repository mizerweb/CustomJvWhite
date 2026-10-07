package one.me.calls.ui.bottomsheet.opponent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a8g;
import defpackage.ap3;
import defpackage.ayb;
import defpackage.be1;
import defpackage.cyb;
import defpackage.e9i;
import defpackage.ee;
import defpackage.fj3;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.kbc;
import defpackage.ke3;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.n42;
import defpackage.np4;
import defpackage.ny8;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qjg;
import defpackage.rx8;
import defpackage.sgg;
import defpackage.so2;
import defpackage.sx1;
import defpackage.t8;
import defpackage.va4;
import defpackage.xa4;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zxb;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/calls/ui/bottomsheet/opponent/ConfirmAddOpponentToCallBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConfirmAddOpponentToCallBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ int x = 0;
    public final sx1 u;
    public final ny8 v;
    public final ny8 w;

    public ConfirmAddOpponentToCallBottomSheet(Bundle bundle) {
        super(bundle);
        this.u = new sx1(m35getAccountScopeuqN4xOY());
        this.v = createViewModelLazy(xa4.class, new fj3(4, new va4(this, 0)));
        this.w = rx8.P(3, new va4(this, 1));
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
    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(R.id.call_screen_admin_confirm_add_users_title);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        textView.setLayoutParams(marginLayoutParams);
        q9i.a(q9i.c, textView);
        a8g a8gVar = pq3.j;
        textView.setTextColor(a8gVar.l(textView).b.getText().b);
        textView.setGravity(17);
        textView.setPadding(textView.getPaddingLeft(), gm0.K(24.0f * yl5.d().getDisplayMetrics().density), textView.getPaddingRight(), textView.getPaddingBottom());
        textView.setText(textView.getContext().getString(R.string.call_screen_admin_confirm_add_users_title, ((be1) ((n42) ((xa4) this.v.getValue()).c).e.a.getValue()).c));
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setId(R.id.call_screen_admin_confirm_add_users_subtitle);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams2.bottomMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        textView2.setLayoutParams(marginLayoutParams2);
        q9i.a(q9i.i, textView2);
        textView2.setTextColor(a8gVar.l(textView2).b.getText().d);
        textView2.setGravity(17);
        textView2.setText(R.string.call_screen_admin_confirm_add_users_subtitle);
        linearLayout.addView(textView2);
        ap3 ap3Var = new ap3(linearLayout.getContext());
        ap3Var.setId(R.id.call_screen_admin_confirm_add_users_check);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams3.bottomMargin = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
        marginLayoutParams3.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        marginLayoutParams3.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        ap3Var.setLayoutParams(marginLayoutParams3);
        ap3Var.setText(R.string.call_screen_admin_confirm_add_users_check);
        q9i.a(q9i.f, ap3Var);
        ap3Var.setTextColor(a8gVar.l(ap3Var).b.getText().b);
        ny8 ny8Var = this.w;
        so2.C((qjg) ny8Var.getValue(), a8gVar.l(ap3Var).b);
        ap3Var.setButtonDrawable((qjg) ny8Var.getValue());
        ap3Var.setPaddingBetweenCheckbox(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        linearLayout.addView(ap3Var);
        cyb cybVar = new cyb(linearLayout.getContext());
        cybVar.setId(R.id.call_screen_admin_confirm_add_users_positive);
        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams4.bottomMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        cybVar.setLayoutParams(marginLayoutParams4);
        cybVar.setAppearance(zxb.PRIMARY);
        ayb aybVar = ayb.g;
        cybVar.setSize(aybVar);
        cybVar.setCustomTheme(a8gVar.l(cybVar).b);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.call_screen_admin_confirm_add_users_positive));
        qe7.H(cybVar, 300L, new ee(this, 21, ap3Var));
        linearLayout.addView(cybVar);
        cyb cybVar2 = new cyb(linearLayout.getContext());
        cybVar2.setId(R.id.call_screen_admin_confirm_add_users_neutral);
        cybVar2.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        cybVar2.setAppearance(zxb.SECONDARY);
        cybVar2.setSize(aybVar);
        cybVar2.setCustomTheme(a8gVar.l(cybVar2).b);
        cybVar2.setText(np4.q(cybVar2.getContext(), R.string.call_screen_admin_confirm_add_users_neutral));
        qe7.H(cybVar2, 300L, new t8(19, this));
        linearLayout.addView(cybVar2);
        return linearLayout;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onDestroyView(View view) throws IllegalAccessException, InvocationTargetException {
        super.onDestroyView(view);
        sgg sggVar = ((xa4) this.v.getValue()).f;
        if (sggVar != null) {
            sggVar.b(null);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(n1g.v(((xa4) this.v.getValue()).g, getViewLifecycleOwner().f(), n09.d), new ke3(8, (lq4) null, this), 3), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final kbc t1() {
        return pq3.j.k(getContext()).b;
    }

    public ConfirmAddOpponentToCallBottomSheet(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
