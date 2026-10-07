package one.me.inviteactions.invitebyphone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.ayb;
import defpackage.bm8;
import defpackage.ch8;
import defpackage.cm8;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.dm8;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.eph;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.gm8;
import defpackage.h;
import defpackage.ha9;
import defpackage.hu;
import defpackage.i19;
import defpackage.ifh;
import defpackage.j8e;
import defpackage.ks6;
import defpackage.ku6;
import defpackage.mc4;
import defpackage.ml9;
import defpackage.n09;
import defpackage.n1g;
import defpackage.np4;
import defpackage.nv4;
import defpackage.ny8;
import defpackage.o37;
import defpackage.oi8;
import defpackage.pi;
import defpackage.pq3;
import defpackage.q38;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.r5c;
import defpackage.rcc;
import defpackage.rt1;
import defpackage.sk8;
import defpackage.tre;
import defpackage.uf4;
import defpackage.wbc;
import defpackage.wu4;
import defpackage.x0c;
import defpackage.xx6;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import java.util.Collections;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/inviteactions/invitebyphone/InviteByPhoneScreen;", "Lone/me/sdk/arch/Widget;", "Lwu4;", "", "Lmc4;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "invite-actions"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InviteByPhoneScreen extends Widget implements wu4, mc4 {
    public static final /* synthetic */ zv8[] p = {new dwd(InviteByPhoneScreen.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), zo5.f(zfe.a, InviteByPhoneScreen.class, "descriptionView", "getDescriptionView()Landroid/widget/TextView;", 0), new dwd(InviteByPhoneScreen.class, "continueButton", "getContinueButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(InviteByPhoneScreen.class, "phoneNumberInput", "getPhoneNumberInput()Lone/me/sdk/phoneutils/OneMePhoneNumberInput;", 0), new dwd(InviteByPhoneScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    public final /* synthetic */ ku6 a;
    public final ks6 b;
    public final oi8 c;
    public final h d;
    public final ny8 e;
    public final j8e f;
    public final j8e g;
    public final j8e h;
    public final j8e i;
    public final j8e j;
    public AppCompatTextView k;
    public final ifh l;
    public final ny8 m;
    public sk8 n;
    public final rt1 o;

    public InviteByPhoneScreen(Bundle bundle) {
        super(bundle);
        this.a = new ku6(26);
        this.b = tre.G(this, new q38(12));
        this.c = oi8.f;
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.d = hVar;
        this.e = createViewModelLazy(gm8.class, new ch8(1, new bm8(this, 0)));
        this.f = viewBinding(R.id.oneme_invite_by_phone_title);
        this.g = viewBinding(R.id.oneme_invite_by_phone_description);
        this.h = viewBinding(R.id.oneme_invite_by_phone_continue_button);
        this.i = viewBinding(R.id.oneme_invite_by_phone_input);
        this.j = viewBinding(R.id.oneme_invite_by_phone_toolbar);
        this.l = new ifh(new bm8(this, 1));
        this.m = hVar.getAccessor().d(348);
        this.o = new rt1(this);
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
    public static final void o1(InviteByPhoneScreen inviteByPhoneScreen, CharSequence charSequence) {
        if (inviteByPhoneScreen.k == null && charSequence != null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(inviteByPhoneScreen.getContext());
            q9i.a(q9i.i, appCompatTextView);
            appCompatTextView.setTextColor(pq3.j.h(appCompatTextView).getText().j);
            uf4 uf4Var = new uf4(0, -2);
            uf4Var.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), gm0.K(24.0f * yl5.d().getDisplayMetrics().density), 0);
            uf4Var.j = R.id.oneme_invite_by_phone_input;
            uf4Var.t = 0;
            uf4Var.v = 0;
            appCompatTextView.setGravity(8388611);
            appCompatTextView.setLayoutParams(uf4Var);
            View view = inviteByPhoneScreen.getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                viewGroup.addView(appCompatTextView);
            }
            inviteByPhoneScreen.k = appCompatTextView;
        }
        AppCompatTextView appCompatTextView2 = inviteByPhoneScreen.k;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(charSequence);
        }
        AppCompatTextView appCompatTextView3 = inviteByPhoneScreen.k;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        }
    }

    @Override // defpackage.wu4
    public final void H0(x0c x0cVar) {
        r1().d.d(x0cVar, q1().getPhoneWithoutCode().length() > 0);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i == R.id.oneme_too_many_requests_bottomsheet_positive_button) {
            getRouter().D();
        } else if (i == R.id.oneme_contact_not_found_bottom_sheet_positive_button) {
            r1().E();
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getC() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.b;
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        q1().postDelayed(new pi(22, this), 200L);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dm8 dm8Var = new dm8(this, getContext());
        rcc rccVar = new rcc(dm8Var.getContext());
        rccVar.setId(R.id.oneme_invite_by_phone_toolbar);
        uf4 uf4Var = new uf4(-1, -2);
        uf4Var.i = 0;
        uf4Var.t = 0;
        uf4Var.v = 0;
        rccVar.setLayoutParams(uf4Var);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new nv4(20, this)));
        dm8Var.addView(rccVar);
        TextView textView = new TextView(dm8Var.getContext());
        textView.setId(R.id.oneme_invite_by_phone_title);
        q9i.a(q9i.c, textView);
        textView.setText(R.string.oneme_invite_by_phone_title);
        uf4 uf4Var2 = new uf4(0, -2);
        uf4Var2.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), 0);
        uf4Var2.j = R.id.oneme_invite_by_phone_toolbar;
        uf4Var2.t = 0;
        uf4Var2.v = 0;
        textView.setGravity(17);
        textView.setLayoutParams(uf4Var2);
        dm8Var.addView(textView);
        TextView textView2 = new TextView(dm8Var.getContext());
        textView2.setId(R.id.oneme_invite_by_phone_description);
        q9i.a(q9i.g, textView2);
        textView2.setText(R.string.oneme_invite_by_phone_description);
        uf4 uf4Var3 = new uf4(0, -2);
        uf4Var3.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density), 0);
        uf4Var3.j = R.id.oneme_invite_by_phone_title;
        uf4Var3.t = 0;
        uf4Var3.v = 0;
        textView2.setGravity(17);
        textView2.setLayoutParams(uf4Var3);
        dm8Var.addView(textView2);
        r5c r5cVar = new r5c(dm8Var.getContext());
        r5cVar.setId(R.id.oneme_invite_by_phone_input);
        uf4 uf4Var4 = new uf4(0, -2);
        uf4Var4.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0);
        uf4Var4.j = R.id.oneme_invite_by_phone_description;
        uf4Var4.t = 0;
        uf4Var4.v = 0;
        r5cVar.setLayoutParams(uf4Var4);
        r5cVar.setPhoneFormatterProvider(new hu(this, 25, r5cVar));
        r5cVar.setOnCountryViewClickListener(new bm8(this, 2));
        dm8Var.addView(r5cVar);
        cyb cybVar = new cyb(dm8Var.getContext());
        cybVar.setId(R.id.oneme_invite_by_phone_continue_button);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        uf4 uf4Var5 = new uf4(0, -2);
        uf4Var5.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(16.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        uf4Var5.l = 0;
        uf4Var5.t = 0;
        uf4Var5.v = 0;
        cybVar.setLayoutParams(uf4Var5);
        cybVar.setText(np4.q(getContext(), R.string.oneme_invite_by_phone_continue_button));
        dm8Var.addView(cybVar);
        return dm8Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.k = null;
        r5c r5cVarQ1 = q1();
        r5cVarQ1.i.removeTextChangedListener(this.n);
        this.n = null;
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        super.onDetach(view);
        ml9.d(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        getContext();
        gm8 gm8VarR1 = r1();
        gm8VarR1.d.e(gm8VarR1.b, Collections.singletonList(null));
        eph ephVar = view instanceof eph ? (eph) view : null;
        if (ephVar != null) {
            ephVar.onThemeChanged(pq3.j.h(view));
        }
        q1().setText((String) r1().d.f.getValue());
        xx6 xx6Var = r1().t;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(xx6Var, i19VarF, n09Var), new cm8(null, this, 3), 3), getViewLifecycleScope());
        qe7.H(p1(), 300L, new o37(12, this));
        q1().i.addTextChangedListener(this.o);
        e9i.j0(new fz6(n1g.v(r1().m, getViewLifecycleOwner().f(), n09Var), new cm8(null, this, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(r1().l, getViewLifecycleOwner().f(), n09Var), new cm8(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(r1().o, this.lifecycleOwner.f(), n09Var), new cm8(this, null), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(r1().p, getViewLifecycleOwner().f(), n09Var), new cm8(null, this, 0), 3), getViewLifecycleScope());
    }

    public final cyb p1() {
        return (cyb) this.h.m(this, p[2]);
    }

    public final r5c q1() {
        return (r5c) this.i.m(this, p[3]);
    }

    public final gm8 r1() {
        return (gm8) this.e.getValue();
    }

    public InviteByPhoneScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
