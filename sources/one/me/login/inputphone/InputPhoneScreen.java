package one.me.login.inputphone;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import defpackage.a4c;
import defpackage.a8j;
import defpackage.acc;
import defpackage.ayb;
import defpackage.bdc;
import defpackage.bi8;
import defpackage.c0a;
import defpackage.ca2;
import defpackage.cyb;
import defpackage.d09;
import defpackage.d4f;
import defpackage.dbc;
import defpackage.dq4;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ei3;
import defpackage.et3;
import defpackage.fz6;
import defpackage.g3;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.hcc;
import defpackage.i19;
import defpackage.j11;
import defpackage.j68;
import defpackage.j8e;
import defpackage.jcc;
import defpackage.je9;
import defpackage.kbc;
import defpackage.ks6;
import defpackage.ku6;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nh8;
import defpackage.noh;
import defpackage.np4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ol;
import defpackage.pq3;
import defpackage.q8e;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qv1;
import defpackage.r5c;
import defpackage.r5h;
import defpackage.rcc;
import defpackage.rh8;
import defpackage.rx8;
import defpackage.s7f;
import defpackage.sbi;
import defpackage.sh8;
import defpackage.sk8;
import defpackage.sza;
import defpackage.t3f;
import defpackage.t41;
import defpackage.th8;
import defpackage.tre;
import defpackage.uf4;
import defpackage.uh8;
import defpackage.vh8;
import defpackage.vv;
import defpackage.wf4;
import defpackage.wh8;
import defpackage.wu4;
import defpackage.wxb;
import defpackage.x0c;
import defpackage.xh8;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.ysc;
import defpackage.z8b;
import defpackage.zbc;
import defpackage.ze3;
import defpackage.zfe;
import defpackage.zn;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import java.util.Collections;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.settings.multilang.LocaleBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/login/inputphone/InputPhoneScreen;", "Lone/me/sdk/arch/Widget;", "", "Lwu4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "(Lt3f;)V", "login"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InputPhoneScreen extends Widget implements wu4 {
    public static final /* synthetic */ zv8[] v = {new z8b(InputPhoneScreen.class, "phone", "getPhone()Ljava/lang/String;"), zo5.f(zfe.a, InputPhoneScreen.class, "gradientBgView", "getGradientBgView()Landroid/view/View;", 0), new dwd(InputPhoneScreen.class, "continueButton", "getContinueButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(InputPhoneScreen.class, "phoneNumberInput", "getPhoneNumberInput()Lone/me/sdk/phoneutils/OneMePhoneNumberInput;", 0), new dwd(InputPhoneScreen.class, "inputDescription", "getInputDescription()Landroid/widget/TextView;", 0), new dwd(InputPhoneScreen.class, "termsTextView", "getTermsTextView()Landroid/widget/TextView;", 0)};
    public final /* synthetic */ ku6 a;
    public final String b;
    public final oi8 c;
    public final ks6 d;
    public final ca2 e;
    public final vv f;
    public final ny8 g;
    public final ny8 h;
    public final j8e i;
    public final j8e j;
    public final j8e k;
    public final j8e l;
    public final j8e m;
    public final ny8 n;
    public sk8 o;
    public final ny8 p;
    public final ny8 q;
    public final ny8 r;
    public LocaleBottomSheet s;
    public final ny8 t;
    public final xh8 u;

    public InputPhoneScreen(Bundle bundle) {
        super(bundle);
        this.a = new ku6(26);
        this.b = InputPhoneScreen.class.getName();
        int i = 0;
        this.c = new oi8(i, 0, 0, new j11(3, 3, false), 7);
        this.d = tre.G(this, new j68(1));
        ca2 ca2Var = new ca2(m35getAccountScopeuqN4xOY());
        this.e = ca2Var;
        this.f = new vv(String.class, "", "screen:input_phone:phone");
        this.g = createViewModelLazy(bi8.class, new ei3(8, new rh8(this, 0)));
        this.h = rx8.P(3, new rh8(this, 1));
        bi8 bi8VarS1 = s1();
        nh8 nh8Var = bi8VarS1.d;
        dq4 dq4Var = bi8VarS1.b;
        nh8Var.e(dq4Var, Collections.singletonList(null));
        this.i = viewBinding(R.id.oneme_login_input_gradient_bg);
        this.j = viewBinding(R.id.oneme_login_input_continue_button);
        this.k = viewBinding(R.id.oneme_login_input_phone_number_input);
        this.l = viewBinding(R.id.oneme_login_input_input_description);
        this.m = viewBinding(R.id.oneme_login_input_help_button);
        this.n = ca2Var.getAccessor().d(348);
        this.p = rx8.P(3, new rh8(this, 2));
        ysc.a.a();
        this.q = ca2Var.a();
        this.r = ca2Var.getAccessor().d(82);
        this.t = ca2Var.getAccessor().d(85);
        this.u = new xh8(this);
    }

    public static final void o1(InputPhoneScreen inputPhoneScreen, CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = inputPhoneScreen.s1().r.b(inputPhoneScreen.getContext());
        }
        inputPhoneScreen.q1().setText(charSequence);
        TextView textViewQ1 = inputPhoneScreen.q1();
        kbc kbcVarH = pq3.j.h(inputPhoneScreen.q1());
        boolean z = inputPhoneScreen.s1().q;
        dbc text = kbcVarH.getText();
        textViewQ1.setTextColor(z ? text.j : text.e);
        inputPhoneScreen.q1().setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
    }

    @Override // defpackage.wu4
    public final void H0(x0c x0cVar) {
        s1().d.d(x0cVar, r1().getPhoneWithoutCode().length() > 0);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getC() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.d;
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        requireActivity().getWindow().setStatusBarColor(0);
        if (this.s == null) {
            a8j.x(s1().k, sbi.a);
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ScrollView scrollView = new ScrollView(getContext());
        int i = 1;
        scrollView.setFillViewport(true);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        wf4 wf4Var = new wf4(scrollView.getContext());
        wf4Var.setId(R.id.oneme_login_input_constraint_layout);
        wf4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        lq4 lq4Var = null;
        int i2 = 0;
        n1g.N(new th8(this, null, 0), wf4Var);
        View view = new View(wf4Var.getContext());
        view.setId(R.id.oneme_login_input_gradient_bg);
        uf4 uf4Var = new uf4(-1, gm0.K(283.0f * yl5.d().getDisplayMetrics().density));
        uf4Var.i = 0;
        uf4Var.t = 0;
        uf4Var.v = 0;
        view.setLayoutParams(uf4Var);
        if (Build.VERSION.SDK_INT <= 29) {
            view.setLayerType(1, null);
        }
        Drawable szaVar = new sza();
        szaVar.setAlpha(127);
        view.setBackground(szaVar);
        n1g.N(new th8(this, null, 1), view);
        wf4Var.addView(view);
        rcc rccVar = new rcc(wf4Var.getContext());
        rccVar.setId(R.id.oneme_login_input_toolbar);
        uf4 uf4Var2 = new uf4(-1, -2);
        uf4Var2.i = 0;
        uf4Var2.t = 0;
        uf4Var2.v = 0;
        rccVar.setLayoutParams(uf4Var2);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new zbc(new hcc(R.drawable.icon_globe, new g3(14, this))));
        rccVar.setRightActions(new acc(null, new jcc(R.drawable.icon_question, null, null, null, 0.0f, new ol(rccVar, 6, this), 238), null));
        ((wxb) this.r.getValue()).getClass();
        int i3 = 3;
        lvb.H(rccVar, new oi8(0, i3, 0, null, 13), null);
        wf4Var.addView(rccVar);
        View d09Var = new d09(wf4Var.getContext());
        d09Var.setId(R.id.oneme_login_input_logo);
        uf4 uf4Var3 = new uf4(-1, 0);
        uf4Var3.i = 0;
        uf4Var3.t = 0;
        uf4Var3.v = 0;
        uf4Var3.l = R.id.oneme_login_input_toolbar;
        d09Var.setLayoutParams(uf4Var3);
        lvb.H(d09Var, new oi8(0, i3, 0, null, 13), null);
        wf4Var.addView(d09Var);
        TextView textView = new TextView(wf4Var.getContext());
        textView.setId(R.id.oneme_login_input_title);
        q9i.a(q9i.c, textView);
        textView.setText(R.string.oneme_login_input_title);
        uf4 uf4Var4 = new uf4(0, -2);
        uf4Var4.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), 0);
        uf4Var4.j = R.id.oneme_login_input_toolbar;
        uf4Var4.t = 0;
        uf4Var4.v = 0;
        textView.setGravity(17);
        textView.setLayoutParams(uf4Var4);
        n1g.N(new vh8(3, null, 1), textView);
        wf4Var.addView(textView);
        TextView textView2 = new TextView(wf4Var.getContext());
        textView2.setId(R.id.oneme_login_input_description);
        q9i.a(q9i.g, textView2);
        textView2.setText(R.string.oneme_login_input_description);
        uf4 uf4Var5 = new uf4(0, -2);
        uf4Var5.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), 0);
        uf4Var5.j = R.id.oneme_login_input_title;
        uf4Var5.t = 0;
        uf4Var5.v = 0;
        textView2.setGravity(17);
        textView2.setLayoutParams(uf4Var5);
        n1g.N(new vh8(3, null, 0), textView2);
        wf4Var.addView(textView2);
        r5c r5cVar = new r5c(wf4Var.getContext());
        r5cVar.setId(R.id.oneme_login_input_phone_number_input);
        uf4 uf4Var6 = new uf4(0, -2);
        uf4Var6.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f));
        uf4Var6.j = R.id.oneme_login_input_description;
        uf4Var6.t = 0;
        uf4Var6.v = 0;
        r5cVar.setLayoutParams(uf4Var6);
        r5cVar.setPhoneFormatterProvider(new t41(this, r5cVar));
        r5cVar.setOnCountryViewClickListener(new rh8(this, 3));
        wf4Var.addView(r5cVar);
        TextView textView3 = new TextView(wf4Var.getContext());
        textView3.setId(R.id.oneme_login_input_input_description);
        noh nohVar = q9i.i;
        q9i.a(nohVar, textView3);
        textView3.setText(s1().r.b(textView3.getContext()));
        uf4 uf4Var7 = new uf4(0, -2);
        uf4Var7.setMargins(gm0.K(24.0f * yl5.d().getDisplayMetrics().density), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), gm0.K(24.0f * yl5.d().getDisplayMetrics().density), 0);
        uf4Var7.j = R.id.oneme_login_input_phone_number_input;
        uf4Var7.t = 0;
        uf4Var7.v = 0;
        textView3.setGravity(8388611);
        textView3.setLayoutParams(uf4Var7);
        n1g.N(new wh8(this, lq4Var, i2), textView3);
        wf4Var.addView(textView3);
        cyb cybVar = new cyb(wf4Var.getContext());
        cybVar.setId(R.id.oneme_login_input_continue_button);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        uf4 uf4Var8 = new uf4(0, -2);
        uf4Var8.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        uf4Var8.j = R.id.oneme_login_input_phone_number_input;
        uf4Var8.k = R.id.oneme_login_input_help_button;
        uf4Var8.t = 0;
        uf4Var8.v = 0;
        uf4Var8.F = 1.0f;
        cybVar.setLayoutParams(uf4Var8);
        cybVar.setText(np4.q(getContext(), R.string.oneme_login_input_continue));
        wf4Var.addView(cybVar);
        TextView textView4 = new TextView(wf4Var.getContext());
        textView4.setId(R.id.oneme_login_input_help_button);
        textView4.setGravity(1);
        uf4 uf4Var9 = new uf4(-1, -2);
        uf4Var9.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(16.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        uf4Var9.l = 0;
        uf4Var9.t = 0;
        uf4Var9.v = 0;
        textView4.setLayoutParams(uf4Var9);
        q9i.a(nohVar, textView4);
        n1g.N(new wh8(this, lq4Var, i), textView4);
        wf4Var.addView(textView4);
        scrollView.addView(wf4Var);
        return scrollView;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        r5c r5cVarR1 = r1();
        r5cVarR1.i.removeTextChangedListener(this.o);
        this.o = null;
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        Window window = requireActivity().getWindow();
        pq3.j.e(view.getContext()).m();
        window.setStatusBarColor(0);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        zv8[] zv8VarArr = v;
        int i = 1;
        Drawable background = ((View) this.i.m(this, zv8VarArr[1])).getBackground();
        lq4 lq4Var = null;
        sza szaVar = background instanceof sza ? (sza) background : null;
        if (szaVar != null) {
            szaVar.start();
        }
        int i2 = 5;
        ((TextView) this.m.m(this, zv8VarArr[5])).setMovementMethod(LinkMovementMethod.getInstance());
        int i3 = 0;
        zv8 zv8Var = zv8VarArr[0];
        String str = (String) this.f.a(this);
        r1().setText(str);
        p1().setEnabled(str.length() > 0);
        int i4 = 2;
        qe7.H(p1(), 300L, new ze3(i4, this));
        r1().i.addTextChangedListener(this.u);
        int i5 = 3;
        e9i.j0(new fz6(s1().i, new sh8(this, lq4Var, i3), i5), getViewLifecycleScope());
        bdc.a(view, new zn(8, view, this));
        q8e q8eVar = s1().l;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(q8eVar, i19VarF, n09Var), new sh8(lq4Var, this, i), i5), getViewLifecycleScope());
        e9i.j0(new fz6(s1().n, new sh8(this, lq4Var, 4), i5), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(s1().s, getViewLifecycleOwner().f(), n09Var), new sh8(lq4Var, this, i4), i5), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(s1().k, getViewLifecycleOwner().f(), n09Var), new sh8(lq4Var, this, i5), i5), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(s1().t, getViewLifecycleOwner().f(), n09Var), new sh8(lq4Var, this, i2), i5), getViewLifecycleScope());
    }

    public final cyb p1() {
        return (cyb) this.j.m(this, v[2]);
    }

    public final TextView q1() {
        return (TextView) this.l.m(this, v[4]);
    }

    public final r5c r1() {
        return (r5c) this.k.m(this, v[3]);
    }

    public final bi8 s1() {
        return (bi8) this.g.getValue();
    }

    public final void t1(String str, String str2, SpannableString spannableString, uh8 uh8Var, kbc kbcVar) {
        int iV0 = r5h.V0(str, str2, 0, false, 6);
        if (iV0 != -1) {
            int length = str2.length() + iV0;
            spannableString.setSpan(uh8Var, iV0, length, 33);
            spannableString.setSpan(new ForegroundColorSpan(kbcVar.getText().b), iV0, length, 33);
            return;
        }
        a aVar = new a(c0a.o("text=", str2, " not found in source text"), null, 2, null);
        String str3 = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str3, qv1.k("locale=", ((s7f) ((et3) this.t.getValue())).m()), aVar);
        }
    }

    public InputPhoneScreen(t3f t3fVar) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
