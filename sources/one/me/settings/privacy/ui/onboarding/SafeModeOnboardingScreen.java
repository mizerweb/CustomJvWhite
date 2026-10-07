package one.me.settings.privacy.ui.onboarding;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import defpackage.a1g;
import defpackage.a8d;
import defpackage.a8g;
import defpackage.aql;
import defpackage.atf;
import defpackage.ayb;
import defpackage.bdc;
import defpackage.bsb;
import defpackage.c9;
import defpackage.ch3;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.eg4;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.gwc;
import defpackage.ha9;
import defpackage.j11;
import defpackage.j8e;
import defpackage.ks6;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.mye;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ng7;
import defpackage.np4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.p;
import defpackage.p7d;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qt4;
import defpackage.qv1;
import defpackage.rcc;
import defpackage.tre;
import defpackage.uf4;
import defpackage.vqa;
import defpackage.wbc;
import defpackage.wf4;
import defpackage.y3f;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.ztd;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/settings/privacy/ui/onboarding/SafeModeOnboardingScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "settings-privacy"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SafeModeOnboardingScreen extends Widget {
    public static final /* synthetic */ zv8[] f = {new dwd(SafeModeOnboardingScreen.class, "withoutPinCodeButton", "getWithoutPinCodeButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), zo5.f(zfe.a, SafeModeOnboardingScreen.class, "content", "getContent()Landroidx/constraintlayout/widget/ConstraintLayout;", 0)};
    public final oi8 a;
    public final ks6 b;
    public final ny8 c;
    public final j8e d;
    public final j8e e;

    public SafeModeOnboardingScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.e;
        this.b = tre.F(this, y3f.SETTINGS_PRIVACY_SAFE_MODE);
        this.c = createViewModelLazy(mye.class, new ztd(9, new a8d(29, this)));
        this.d = viewBinding(R.id.oneme_settings_privacy_onboarding_without_code_button);
        this.e = viewBinding(R.id.oneme_settings_privacy_onboarding_content);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.b;
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        requireActivity().getWindow().setStatusBarColor(0);
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
        wf4 wf4Var = new wf4(viewGroup.getContext());
        wf4Var.setId(R.id.oneme_settings_privacy_onboarding_root);
        a8g a8gVar = pq3.j;
        wf4Var.setBackgroundColor(a8gVar.h(wf4Var).b().c);
        rcc rccVar = new rcc(wf4Var.getContext());
        rccVar.setId(R.id.oneme_settings_privacy_onboarding_toolbar);
        rccVar.setForm(gcc.Compact);
        rccVar.setBackgroundColor(0);
        lvb.I(rccVar);
        rccVar.setLayoutParams(new uf4(-1, -2));
        rccVar.setTranslationZ(1000.0f);
        rccVar.setLeftActions(new wbc(new p7d(22, this)));
        wf4Var.addView(rccVar);
        ScrollView scrollView = new ScrollView(viewGroup.getContext());
        scrollView.setId(R.id.oneme_settings_privacy_onboarding_scroll_view);
        scrollView.setLayoutParams(new uf4(-1, -2));
        scrollView.setClipChildren(false);
        scrollView.setClipToPadding(false);
        scrollView.setClipToOutline(false);
        lvb.G(scrollView);
        Context context = scrollView.getContext();
        wf4 wf4Var2 = new wf4(context);
        wf4Var2.setId(R.id.oneme_settings_privacy_onboarding_content);
        wf4Var2.setClipChildren(false);
        wf4Var2.setClipToPadding(false);
        wf4Var2.setClipToOutline(false);
        Guideline guideline = new Guideline(context);
        guideline.setId(R.id.oneme_settings_privacy_onboarding_top_guideline);
        uf4 uf4Var = new uf4(0, 0);
        uf4Var.a = gm0.K(60.0f * yl5.d().getDisplayMetrics().density);
        uf4Var.V = 0;
        guideline.setLayoutParams(uf4Var);
        wf4Var2.addView(guideline);
        View view = new View(context);
        view.setId(R.id.oneme_settings_privacy_onboarding_lock_background);
        uf4 uf4Var2 = new uf4(0, 0);
        ((ViewGroup.MarginLayoutParams) uf4Var2).topMargin = ((uf4) guideline.getLayoutParams()).a;
        view.setLayoutParams(uf4Var2);
        wf4Var2.setClipToPadding(false);
        view.setClipToOutline(false);
        a1g a1gVar = new a1g(context);
        a1gVar.c();
        int iK = gm0.K(160.0f * yl5.d().getDisplayMetrics().density);
        a1gVar.i.B(a1gVar, a1g.n[1], Integer.valueOf(iK));
        view.setBackground(a1gVar);
        wf4Var2.addView(view);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.oneme_settings_privacy_onboarding_lock);
        imageView.setLayoutParams(new uf4(0, 0));
        imageView.setImageResource(R.drawable.oneme_settings_privacy_big_lock);
        wf4Var2.addView(imageView);
        TextView textView = new TextView(context);
        textView.setId(R.id.oneme_settings_privacy_onboarding_content_title);
        uf4 uf4Var3 = new uf4(-2, -2);
        uf4Var3.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        uf4Var3.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        textView.setLayoutParams(uf4Var3);
        textView.setMaxLines(1);
        textView.setTextAlignment(4);
        textView.setTextColor(p.d(textView, q9i.c, a8gVar, textView).b);
        textView.setText(R.string.oneme_settings_privacy_screen_safe_mode);
        wf4Var2.addView(textView);
        TextView textViewE = qv1.e(context, R.id.oneme_settings_privacy_onboarding_content_subtitle);
        uf4 uf4Var4 = new uf4(-2, -2);
        uf4Var4.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        uf4Var4.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        textViewE.setLayoutParams(uf4Var4);
        textViewE.setMaxLines(2);
        textViewE.setTextAlignment(4);
        textViewE.setTextColor(p.d(textViewE, q9i.i, a8gVar, textViewE).d);
        textViewE.setText(R.string.oneme_settings_privacy_onboarding_content_subtitle);
        wf4Var2.addView(textViewE);
        atf atfVar = new atf(context);
        atfVar.setId(R.id.oneme_settings_privacy_onboarding_item_1);
        atfVar.setStartView(aql.a(R.drawable.icon_search));
        atfVar.setTitle(np4.q(atfVar.getContext(), R.string.oneme_settings_privacy_onboarding_item_1_title));
        atfVar.setDescription(np4.q(atfVar.getContext(), R.string.oneme_settings_privacy_onboarding_item_1_subtitle));
        atfVar.onThemeChanged(a8gVar.e(context).m());
        wf4Var2.addView(atfVar);
        atf atfVar2 = new atf(context);
        atfVar2.setId(R.id.oneme_settings_privacy_onboarding_item_2);
        atfVar2.setStartView(aql.a(R.drawable.icon_call));
        atfVar2.setTitle(np4.q(atfVar2.getContext(), R.string.oneme_settings_privacy_onboarding_item_2_title));
        atfVar2.setDescription(np4.q(atfVar2.getContext(), R.string.oneme_settings_privacy_onboarding_item_2_subtitle));
        atfVar2.onThemeChanged(a8gVar.e(context).m());
        wf4Var2.addView(atfVar2);
        atf atfVar3 = new atf(context);
        atfVar3.setId(R.id.oneme_settings_privacy_onboarding_item_3);
        atfVar3.setStartView(aql.a(R.drawable.icon_users_add));
        atfVar3.setTitle(np4.q(atfVar3.getContext(), R.string.oneme_settings_privacy_onboarding_item_3_title));
        atfVar3.setDescription(np4.q(atfVar3.getContext(), R.string.oneme_settings_privacy_onboarding_item_3_subtitle));
        atfVar3.onThemeChanged(a8gVar.e(context).m());
        wf4Var2.addView(atfVar3);
        atf atfVar4 = new atf(context);
        atfVar4.setId(R.id.oneme_settings_privacy_onboarding_item_4);
        atfVar4.setStartView(aql.a(R.drawable.icon_eye_crossed));
        atfVar4.setTitle(np4.q(atfVar4.getContext(), R.string.oneme_settings_privacy_onboarding_item_4_title));
        atfVar4.setDescription(np4.q(atfVar4.getContext(), R.string.oneme_settings_privacy_onboarding_item_4_subtitle));
        atfVar4.onThemeChanged(a8gVar.e(context).m());
        wf4Var2.addView(atfVar4);
        eg4 eg4VarH = ch3.h(wf4Var2);
        int id = view.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 7, 0, 7);
        eg4VarH.g(id).d.Z = gm0.K(yl5.d().getDisplayMetrics().density * 300.0f);
        eg4VarH.g(id).d.a0 = gm0.K(yl5.d().getDisplayMetrics().density * 300.0f);
        eg4VarH.g(id).d.y = "1:1";
        int id2 = imageView.getId();
        eg4VarH.d(id2, 3, guideline.getId(), 3);
        eg4VarH.d(id2, 6, view.getId(), 6);
        eg4VarH.d(id2, 7, view.getId(), 7);
        eg4VarH.d(id2, 4, view.getId(), 4);
        eg4VarH.g(id2).d.Z = gm0.K(300.0f * yl5.d().getDisplayMetrics().density);
        eg4VarH.g(id2).d.a0 = gm0.K(212.0f * yl5.d().getDisplayMetrics().density);
        int id3 = textView.getId();
        eg4VarH.d(id3, 3, view.getId(), 4);
        eg4VarH.d(id3, 6, 0, 6);
        qt4.w(32.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id3));
        eg4VarH.d(id3, 7, 0, 7);
        new bsb(7, eg4VarH, id3).a(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        int id4 = textViewE.getId();
        eg4VarH.d(id4, 3, textView.getId(), 4);
        qt4.w(8.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id4));
        eg4VarH.d(id4, 6, 0, 6);
        qt4.w(32.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id4));
        eg4VarH.d(id4, 7, 0, 7);
        new bsb(7, eg4VarH, id4).a(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        int id5 = atfVar.getId();
        eg4VarH.d(id5, 3, textViewE.getId(), 4);
        qt4.w(36.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id5));
        eg4VarH.d(id5, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id5));
        eg4VarH.d(id5, 7, 0, 7);
        new bsb(7, eg4VarH, id5).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id6 = atfVar2.getId();
        eg4VarH.d(id6, 3, atfVar.getId(), 4);
        qt4.w(4.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id6));
        eg4VarH.d(id6, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id6));
        eg4VarH.d(id6, 7, 0, 7);
        new bsb(7, eg4VarH, id6).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id7 = atfVar3.getId();
        eg4VarH.d(id7, 3, atfVar2.getId(), 4);
        qt4.w(4.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id7));
        eg4VarH.d(id7, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id7));
        eg4VarH.d(id7, 7, 0, 7);
        new bsb(7, eg4VarH, id7).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id8 = atfVar4.getId();
        eg4VarH.d(id8, 3, atfVar3.getId(), 4);
        qt4.w(4.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id8));
        eg4VarH.d(id8, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id8));
        eg4VarH.d(id8, 7, 0, 7);
        new bsb(7, eg4VarH, id8).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        eg4VarH.a(wf4Var2);
        scrollView.addView(wf4Var2);
        wf4Var.addView(scrollView);
        cyb cybVar = new cyb(wf4Var.getContext());
        cybVar.setId(R.id.oneme_settings_privacy_onboarding_without_code_button);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.enable));
        cybVar.setLayoutParams(new uf4(0, -2));
        lvb.H(cybVar, new oi8(0, 0, 0, new j11(2, 1, false), 7), null);
        qe7.H(cybVar, 300L, new gwc(17, this));
        wf4Var.addView(cybVar);
        eg4 eg4VarH2 = ch3.h(wf4Var);
        int id9 = rccVar.getId();
        eg4VarH2.d(id9, 3, 0, 3);
        eg4VarH2.d(id9, 6, 0, 6);
        eg4VarH2.d(id9, 7, 0, 7);
        int id10 = scrollView.getId();
        eg4VarH2.d(id10, 3, 0, 3);
        eg4VarH2.d(id10, 6, 0, 6);
        eg4VarH2.d(id10, 7, 0, 7);
        int id11 = cybVar.getId();
        eg4VarH2.d(id11, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH2, id11));
        eg4VarH2.d(id11, 7, 0, 7);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH2, id11));
        eg4VarH2.d(id11, 4, 0, 4);
        new bsb(4, eg4VarH2, id11).a(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH2.a(wf4Var);
        return wf4Var;
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        Window window = requireActivity().getWindow();
        pq3.j.e(view.getContext()).m();
        window.setStatusBarColor(0);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        n1g.N(new vqa(view, (lq4) null, 22), view);
        cyb cybVar = (cyb) this.d.m(this, f[0]);
        bdc.a(cybVar, new ng7(cybVar, 22, this));
        e9i.j0(new fz6(n1g.v(((mye) this.c.getValue()).f, getViewLifecycleOwner().f(), n09.d), new c9(2, null, 18), 3), getViewLifecycleScope());
    }

    public SafeModeOnboardingScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
