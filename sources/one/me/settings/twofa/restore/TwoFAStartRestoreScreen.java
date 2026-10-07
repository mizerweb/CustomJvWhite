package one.me.settings.twofa.restore;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import defpackage.a6i;
import defpackage.a8j;
import defpackage.a9i;
import defpackage.ayb;
import defpackage.b2f;
import defpackage.b6i;
import defpackage.b9i;
import defpackage.bdc;
import defpackage.bpg;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fpf;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.i19;
import defpackage.j0i;
import defpackage.j8e;
import defpackage.j8g;
import defpackage.j95;
import defpackage.jz;
import defpackage.ks6;
import defpackage.lq4;
import defpackage.m8i;
import defpackage.mc4;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.n8i;
import defpackage.nff;
import defpackage.np4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.p8i;
import defpackage.pk8;
import defpackage.pq3;
import defpackage.ptf;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.sgg;
import defpackage.t2g;
import defpackage.tre;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.xhh;
import defpackage.y3f;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yw1;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/settings/twofa/restore/TwoFAStartRestoreScreen;", "Lone/me/sdk/arch/Widget;", "La9i;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "source", "Lha9;", "localAccountId", "trackId", "Lpk8;", "navData", "(Ljava/lang/String;Lha9;Ljava/lang/String;Lpk8;)V", "settings-twofa"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TwoFAStartRestoreScreen extends Widget implements a9i, mc4 {
    public static final /* synthetic */ zv8[] j = {new dwd(TwoFAStartRestoreScreen.class, "twoFAView", "getTwoFAView()Lone/me/settings/twofa/creation/TwoFAView;", 0), zo5.f(zfe.a, TwoFAStartRestoreScreen.class, "resendCodeTimerView", "getResendCodeTimerView()Landroid/widget/TextView;", 0), new dwd(TwoFAStartRestoreScreen.class, "resendCodeButton", "getResendCodeButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final wtc a;
    public final oi8 b;
    public final ny8 c;
    public final ks6 d;
    public final ny8 e;
    public final ny8 f;
    public final j8e g;
    public final j8e h;
    public final j8e i;

    public TwoFAStartRestoreScreen(Bundle bundle) {
        super(bundle);
        this.a = new wtc(m35getAccountScopeuqN4xOY());
        this.b = oi8.f;
        this.c = rx8.P(3, new yw1(9, bundle));
        this.d = tre.F(this, y3f.SETTINGS_2FA_PASSWORD_RESET_EMAIL_CODE);
        this.e = createViewModelLazy(p8i.class, new t2g(26, new j0i(this, 4, bundle)));
        this.f = rx8.P(3, new bpg(29, this));
        this.g = viewBinding(R.id.oneme_settings_twofa_onboarding_content);
        this.h = viewBinding(R.id.oneme_settings_twofa_verify_email_resend_timer);
        this.i = viewBinding(R.id.oneme_settings_twofa_verify_email_resend_action);
    }

    @Override // defpackage.a9i
    public final void a(String str) {
        p8i p8iVarO1 = o1();
        if (str.length() == 0) {
            gm0.Y(p8iVarO1.g, "Add email step: Can't check code because is empty");
            return;
        }
        sgg sggVar = p8iVarO1.t;
        if (sggVar == null || !sggVar.isActive()) {
            p8iVarO1.t = a8j.t(p8iVarO1, ((n0c) ((xhh) p8iVarO1.i.getValue())).b(), new b2f(p8iVarO1, str, (lq4) null, 4), 2);
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        p8i p8iVarO1 = o1();
        p8iVarO1.getClass();
        if (i == R.id.oneme_settings_twofa_delete_user_confirmation_skip || i != R.id.oneme_settings_twofa_delete_user_confirmation_action) {
            return;
        }
        p8iVarO1.s.B(p8iVarO1, p8i.u[1], yab.h0(p8iVarO1.b, ((n0c) ((xhh) p8iVarO1.i.getValue())).b(), 2, new fpf(p8iVarO1, null, 13)));
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.d;
    }

    public final p8i o1() {
        return (p8i) this.e.getValue();
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
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(R.id.oneme_settings_twofa_onboarding_root);
        frameLayout.setBackgroundColor(pq3.j.h(frameLayout).b().c);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipToOutline(false);
        rcc rccVar = new rcc(frameLayout.getContext());
        rccVar.setId(R.id.oneme_settings_twofa_onboarding_toolbar);
        rccVar.setForm(gcc.Compact);
        rccVar.setBackgroundColor(0);
        rccVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        rccVar.setTranslationZ(1000.0f);
        rccVar.setLeftActions(new wbc(new ptf(26, this)));
        frameLayout.addView(rccVar);
        ScrollView scrollView = new ScrollView(viewGroup.getContext());
        scrollView.setId(R.id.oneme_settings_twofa_onboarding_scroll_content);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        b9i b9iVar = new b9i(scrollView.getContext());
        b9iVar.setId(R.id.oneme_settings_twofa_onboarding_content);
        b9iVar.setPadding(b9iVar.getPaddingLeft(), gm0.K(24.0f * yl5.d().getDisplayMetrics().density), b9iVar.getPaddingRight(), b9iVar.getPaddingBottom());
        b9iVar.setListener(this);
        scrollView.addView(b9iVar);
        frameLayout.addView(scrollView);
        bdc.a(rccVar, new b6i(rccVar, scrollView, 2));
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        cyb cybVar = new cyb(linearLayout.getContext());
        cybVar.setId(R.id.oneme_settings_twofa_forget_password_action);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.oneme_settings_twofa_lost_email_action));
        zxb zxbVar = zxb.GHOST;
        cybVar.setAppearance(zxbVar);
        ayb aybVar = ayb.j;
        cybVar.setSize(aybVar);
        Integer numValueOf = Integer.valueOf(R.attr.text_themed);
        cybVar.setTextColor(numValueOf);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        layoutParams2.setMarginStart(iK);
        layoutParams2.setMarginEnd(iK);
        layoutParams2.bottomMargin = iK;
        cybVar.setLayoutParams(layoutParams2);
        qe7.H(cybVar, 300L, new m8i(this, 0));
        linearLayout.addView(cybVar);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(R.id.oneme_settings_twofa_verify_email_resend_timer);
        q9i.a(q9i.i, textView);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2, 80);
        int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        layoutParams3.setMarginStart(iK2);
        layoutParams3.setMarginEnd(iK2);
        layoutParams3.bottomMargin = iK2;
        textView.setLayoutParams(layoutParams3);
        textView.setGravity(17);
        linearLayout.addView(textView);
        cyb cybVar2 = new cyb(linearLayout.getContext());
        cybVar2.setId(R.id.oneme_settings_twofa_verify_email_resend_action);
        cybVar2.setText(np4.q(cybVar2.getContext(), R.string.oneme_settings_twofa_creation_email_verify_resend_code));
        cybVar2.setAppearance(zxbVar);
        cybVar2.setSize(aybVar);
        cybVar2.setTextColor(numValueOf);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2, 80);
        int iK3 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        layoutParams4.setMarginStart(iK3);
        layoutParams4.setMarginEnd(iK3);
        layoutParams4.bottomMargin = iK3;
        cybVar2.setLayoutParams(layoutParams4);
        qe7.H(cybVar2, 300L, new m8i(this, 1));
        linearLayout.addView(cybVar2);
        bdc.a(linearLayout, new a6i(linearLayout, scrollView, 1));
        frameLayout.addView(linearLayout);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        lq4 lq4Var = null;
        n1g.N(new nff(this, lq4Var, 9), view);
        jz jzVar = new jz(o1().l, 13);
        b9i b9iVar = (b9i) this.g.m(this, j[0]);
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(jzVar, i19VarF, n09Var), new j8g(lq4Var, b9iVar, 18), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().p, getViewLifecycleOwner().f(), n09Var), new n8i(null, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().o, getViewLifecycleOwner().f(), n09Var), new n8i(null, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().n, getViewLifecycleOwner().f(), n09Var), new n8i(null, this, 2), i), getViewLifecycleScope());
    }

    public TwoFAStartRestoreScreen(String str, ha9 ha9Var, String str2, pk8 pk8Var) {
        this(n1g.i(new ylc("twofa_check_password_source_key", str), new ylc("twofa_check_password_track_id_key", str2), new ylc("twofa_check_password_nav_data_key", pk8Var), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }

    public /* synthetic */ TwoFAStartRestoreScreen(String str, ha9 ha9Var, String str2, pk8 pk8Var, int i, j95 j95Var) {
        this(str, ha9Var, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : pk8Var);
    }
}
