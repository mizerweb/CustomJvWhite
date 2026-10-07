package one.me.settings.twofa.creation.onboarding;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import defpackage.a1g;
import defpackage.a8g;
import defpackage.aah;
import defpackage.ayb;
import defpackage.bdc;
import defpackage.bsb;
import defpackage.ch3;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.eg4;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.i19;
import defpackage.ic6;
import defpackage.j8e;
import defpackage.ks6;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.n7i;
import defpackage.nff;
import defpackage.np4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.p;
import defpackage.pq3;
import defpackage.ptf;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qt4;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.t2g;
import defpackage.tre;
import defpackage.u7i;
import defpackage.uf4;
import defpackage.v7i;
import defpackage.w7i;
import defpackage.wbc;
import defpackage.wf4;
import defpackage.wtc;
import defpackage.x7i;
import defpackage.xs;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yw1;
import defpackage.zfe;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\f"}, d2 = {"Lone/me/settings/twofa/creation/onboarding/TwoFAOnboardingScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "state", "Lha9;", "localAccountId", "(Ljava/lang/String;Lha9;)V", "v7i", "settings-twofa"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TwoFAOnboardingScreen extends Widget {
    public static final /* synthetic */ zv8[] g;
    public final wtc a;
    public final oi8 b;
    public final ny8 c;
    public final ks6 d;
    public final ny8 e;
    public final j8e f;

    static {
        dwd dwdVar = new dwd(TwoFAOnboardingScreen.class, "continueButton", "getContinueButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0);
        zfe.a.getClass();
        g = new zv8[]{dwdVar};
    }

    public TwoFAOnboardingScreen(Bundle bundle) {
        super(bundle);
        this.a = new wtc(m35getAccountScopeuqN4xOY());
        this.b = oi8.f;
        this.c = rx8.P(3, new yw1(8, bundle));
        this.d = tre.G(this, new u7i(this, 0));
        this.e = createViewModelLazy(x7i.class, new t2g(24, new u7i(this, 1)));
        this.f = viewBinding(R.id.oneme_settings_twofa_action);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.d;
    }

    @Override // defpackage.br4
    public final boolean handleBack() {
        if (p1() != v7i.b) {
            return super.handleBack();
        }
        n7i.b.j();
        return true;
    }

    public final cyb o1() {
        return (cyb) this.f.m(this, g[0]);
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
        a8g a8gVar = pq3.j;
        frameLayout.setBackgroundColor(a8gVar.h(frameLayout).b().c);
        rcc rccVar = new rcc(frameLayout.getContext());
        rccVar.setId(R.id.oneme_settings_twofa_onboarding_toolbar);
        rccVar.setForm(gcc.Compact);
        rccVar.setBackgroundColor(0);
        rccVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        rccVar.setTranslationZ(1000.0f);
        v7i v7iVarP1 = p1();
        v7i v7iVar = v7i.a;
        if (v7iVarP1 == v7iVar) {
            rccVar.setLeftActions(new wbc(new ptf(24, this)));
        }
        frameLayout.addView(rccVar);
        ScrollView scrollView = new ScrollView(viewGroup.getContext());
        scrollView.setId(R.id.oneme_settings_twofa_onboarding_scroll_content);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
        scrollView.setClipChildren(false);
        scrollView.setClipToPadding(false);
        scrollView.setClipToOutline(false);
        Context context = scrollView.getContext();
        wf4 wf4Var = new wf4(context);
        wf4Var.setId(R.id.oneme_settings_twofa_onboarding_content);
        wf4Var.setClipChildren(false);
        wf4Var.setClipToPadding(false);
        wf4Var.setClipToOutline(false);
        View view = new View(context);
        view.setId(R.id.oneme_settings_twofa_onboarding_picture_background);
        view.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 240.0f), gm0.K(240.0f * yl5.d().getDisplayMetrics().density)));
        wf4Var.setClipToPadding(false);
        view.setClipToOutline(false);
        a1g a1gVar = new a1g(context);
        a1gVar.c();
        view.setBackground(a1gVar);
        wf4Var.addView(view);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.oneme_settings_twofa_onboarding_picture);
        imageView.setLayoutParams(new uf4(gm0.K(214.0f * yl5.d().getDisplayMetrics().density), gm0.K(136.0f * yl5.d().getDisplayMetrics().density)));
        imageView.setImageResource(p1() == v7iVar ? R.drawable.oneme_settings_privacy_cloud_2fa_start_icon : R.drawable.oneme_settings_privacy_cloud_2fa_end_icon);
        wf4Var.addView(imageView);
        TextView textView = new TextView(context);
        textView.setId(R.id.oneme_settings_twofa_onboarding_title);
        uf4 uf4Var = new uf4(0, -2);
        uf4Var.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        uf4Var.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        textView.setLayoutParams(uf4Var);
        textView.setMaxLines(1);
        textView.setTextAlignment(4);
        textView.setGravity(17);
        textView.setTextColor(p.d(textView, q9i.c, a8gVar, textView).b);
        textView.setText(p1() == v7iVar ? R.string.oneme_settings_twofa_onboarding_title : R.string.oneme_settings_twofa_onboarding_success_title);
        wf4Var.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setId(R.id.oneme_settings_twofa_onboarding_subtitle);
        uf4 uf4Var2 = new uf4(0, -2);
        uf4Var2.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        uf4Var2.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        textView2.setLayoutParams(uf4Var2);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setTextColor(p.d(textView2, q9i.i, a8gVar, textView2).d);
        textView2.setText(p1() == v7iVar ? R.string.oneme_settings_twofa_onboarding_description : R.string.oneme_settings_twofa_onboarding_success_description);
        wf4Var.addView(textView2);
        eg4 eg4VarH = ch3.h(wf4Var);
        int id = view.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 4, 0, 4);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 7, 0, 7);
        int id2 = imageView.getId();
        eg4VarH.d(id2, 3, view.getId(), 3);
        eg4VarH.d(id2, 6, view.getId(), 6);
        eg4VarH.d(id2, 7, view.getId(), 7);
        eg4VarH.d(id2, 4, view.getId(), 4);
        int id3 = textView.getId();
        eg4VarH.d(id3, 3, imageView.getId(), 4);
        qt4.w(68.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id3));
        eg4VarH.d(id3, 6, 0, 6);
        qt4.w(32.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id3));
        eg4VarH.d(id3, 7, 0, 7);
        new bsb(7, eg4VarH, id3).a(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        eg4VarH.g(id3).d.l0 = true;
        int id4 = textView2.getId();
        eg4VarH.d(id4, 3, textView.getId(), 4);
        qt4.w(8.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id4));
        eg4VarH.d(id4, 6, 0, 6);
        qt4.w(32.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id4));
        eg4VarH.d(id4, 7, 0, 7);
        new bsb(7, eg4VarH, id4).a(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        eg4VarH.g(id4).d.l0 = true;
        eg4VarH.a(wf4Var);
        scrollView.addView(wf4Var);
        frameLayout.addView(scrollView);
        cyb cybVar = new cyb(frameLayout.getContext());
        cybVar.setId(R.id.oneme_settings_twofa_action);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        cybVar.setText(p1() == v7iVar ? np4.q(cybVar.getContext(), R.string.oneme_settings_twofa_onboarding_set_password) : np4.q(cybVar.getContext(), R.string.go_to_settings));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.setMarginStart(iK);
        layoutParams.setMarginEnd(iK);
        layoutParams.bottomMargin = iK;
        cybVar.setLayoutParams(layoutParams);
        qe7.H(cybVar, 300L, new aah(5, this));
        bdc.a(cybVar, new xs(cybVar, scrollView, iK, 4));
        frameLayout.addView(cybVar);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        n1g.N(new nff(this, (lq4) null, 8), view);
        ny8 ny8Var = this.e;
        ic6 ic6Var = ((x7i) ny8Var.getValue()).g;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new w7i(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((x7i) ny8Var.getValue()).f, getViewLifecycleOwner().f(), n09Var), new w7i(null, this, 1), 3), getViewLifecycleScope());
    }

    public final v7i p1() {
        return (v7i) this.c.getValue();
    }

    public TwoFAOnboardingScreen(String str, ha9 ha9Var) {
        this(n1g.i(new ylc("onboarding_2fa_state_key", str), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
