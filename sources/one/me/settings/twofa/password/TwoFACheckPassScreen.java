package one.me.settings.twofa.password;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import defpackage.a6i;
import defpackage.a8j;
import defpackage.a9i;
import defpackage.af7;
import defpackage.ayb;
import defpackage.b6i;
import defpackage.b9i;
import defpackage.bb;
import defpackage.bcc;
import defpackage.bdc;
import defpackage.c6i;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e6i;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.i19;
import defpackage.j0i;
import defpackage.j6i;
import defpackage.j8e;
import defpackage.j8g;
import defpackage.j95;
import defpackage.jz;
import defpackage.ks6;
import defpackage.ln5;
import defpackage.lq4;
import defpackage.mc4;
import defpackage.mk8;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.n7i;
import defpackage.nff;
import defpackage.np4;
import defpackage.ny8;
import defpackage.o65;
import defpackage.oi8;
import defpackage.pk8;
import defpackage.pq3;
import defpackage.ptf;
import defpackage.qe7;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.t2g;
import defpackage.tre;
import defpackage.uw8;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.xhh;
import defpackage.yab;
import defpackage.ybc;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yw1;
import defpackage.z5i;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.settings.twofa.password.TwoFACheckPassScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/settings/twofa/password/TwoFACheckPassScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "La9i;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "source", "trackId", "Lha9;", "localAccountId", "Lpk8;", "navData", "(Ljava/lang/String;Ljava/lang/String;Lha9;Lpk8;)V", "settings-twofa"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TwoFACheckPassScreen extends Widget implements mc4, a9i {
    public static final /* synthetic */ zv8[] n = {new dwd(TwoFACheckPassScreen.class, "twoFAView", "getTwoFAView()Lone/me/settings/twofa/creation/TwoFAView;", 0), zo5.f(zfe.a, TwoFACheckPassScreen.class, "scrollContentView", "getScrollContentView()Landroid/widget/ScrollView;", 0), new dwd(TwoFACheckPassScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(TwoFACheckPassScreen.class, "continueButton", "getContinueButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(TwoFACheckPassScreen.class, "bottomActionsWrapper", "getBottomActionsWrapper()Landroid/view/View;", 0)};
    public final wtc a;
    public final oi8 b;
    public final ny8 c;
    public final wbc d;
    public bcc e;
    public final ks6 f;
    public final ny8 g;
    public final ny8 h;
    public final j8e i;
    public final j8e j;
    public final j8e k;
    public final j8e l;
    public final j8e m;

    public TwoFACheckPassScreen(Bundle bundle) {
        super(bundle);
        this.a = new wtc(m35getAccountScopeuqN4xOY());
        this.b = oi8.f;
        this.c = rx8.P(3, new yw1(4, bundle));
        wbc wbcVar = new wbc(new ptf(22, this));
        this.d = wbcVar;
        this.e = wbcVar;
        final int i = 0;
        this.f = tre.G(this, new af7(this) { // from class: y5i
            public final /* synthetic */ TwoFACheckPassScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                TwoFACheckPassScreen twoFACheckPassScreen = this.b;
                switch (i2) {
                    case 0:
                        zv8[] zv8VarArr = TwoFACheckPassScreen.n;
                        int iOrdinal = twoFACheckPassScreen.o1().ordinal();
                        if (iOrdinal == 0) {
                            return y3f.AUTH_2FA_PASSWORD_INPUT;
                        }
                        if (iOrdinal == 1) {
                            return y3f.SETTINGS_2FA_PASSWORD_INPUT;
                        }
                        ore.o();
                        return null;
                    case 1:
                        zv8[] zv8VarArr2 = TwoFACheckPassScreen.n;
                        return new nk8(twoFACheckPassScreen.getRouter(), twoFACheckPassScreen.getB().b());
                    default:
                        zv8[] zv8VarArr3 = TwoFACheckPassScreen.n;
                        if (twoFACheckPassScreen.o1() == mk8.b) {
                            nl9.b(twoFACheckPassScreen.getActivity());
                        }
                        return sbi.a;
                }
            }
        });
        final int i2 = 1;
        this.g = createViewModelLazy(j6i.class, new t2g(22, new j0i(this, 1, bundle)));
        this.h = rx8.P(3, new af7(this) { // from class: y5i
            public final /* synthetic */ TwoFACheckPassScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                TwoFACheckPassScreen twoFACheckPassScreen = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = TwoFACheckPassScreen.n;
                        int iOrdinal = twoFACheckPassScreen.o1().ordinal();
                        if (iOrdinal == 0) {
                            return y3f.AUTH_2FA_PASSWORD_INPUT;
                        }
                        if (iOrdinal == 1) {
                            return y3f.SETTINGS_2FA_PASSWORD_INPUT;
                        }
                        ore.o();
                        return null;
                    case 1:
                        zv8[] zv8VarArr2 = TwoFACheckPassScreen.n;
                        return new nk8(twoFACheckPassScreen.getRouter(), twoFACheckPassScreen.getB().b());
                    default:
                        zv8[] zv8VarArr3 = TwoFACheckPassScreen.n;
                        if (twoFACheckPassScreen.o1() == mk8.b) {
                            nl9.b(twoFACheckPassScreen.getActivity());
                        }
                        return sbi.a;
                }
            }
        });
        this.i = viewBinding(R.id.oneme_settings_twofa_onboarding_content);
        this.j = viewBinding(R.id.oneme_settings_twofa_onboarding_scroll_content);
        this.k = viewBinding(R.id.oneme_settings_twofa_onboarding_toolbar);
        this.l = viewBinding(R.id.oneme_settings_twofa_action);
        this.m = viewBinding(R.id.oneme_settings_twofa_action_wrapper);
        final int i3 = 2;
        ln5 ln5Var = new ln5(this, new af7(this) { // from class: y5i
            public final /* synthetic */ TwoFACheckPassScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                TwoFACheckPassScreen twoFACheckPassScreen = this.b;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr = TwoFACheckPassScreen.n;
                        int iOrdinal = twoFACheckPassScreen.o1().ordinal();
                        if (iOrdinal == 0) {
                            return y3f.AUTH_2FA_PASSWORD_INPUT;
                        }
                        if (iOrdinal == 1) {
                            return y3f.SETTINGS_2FA_PASSWORD_INPUT;
                        }
                        ore.o();
                        return null;
                    case 1:
                        zv8[] zv8VarArr2 = TwoFACheckPassScreen.n;
                        return new nk8(twoFACheckPassScreen.getRouter(), twoFACheckPassScreen.getB().b());
                    default:
                        zv8[] zv8VarArr3 = TwoFACheckPassScreen.n;
                        if (twoFACheckPassScreen.o1() == mk8.b) {
                            nl9.b(twoFACheckPassScreen.getActivity());
                        }
                        return sbi.a;
                }
            }
        });
        if (getRouter() != null) {
            getRouter().a(ln5Var);
        } else {
            addLifecycleListener(new bb(this, ln5Var, 18));
        }
    }

    @Override // defpackage.a9i
    public final void Q(CharSequence charSequence) {
        j6i j6iVarP1 = p1();
        String string = charSequence.toString();
        j6iVarP1.getClass();
        j6iVarP1.x.B(j6iVarP1, j6i.y[2], a8j.t(j6iVarP1, null, new j8g(j6iVarP1, string, (lq4) null, 17), 1));
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        j6i j6iVarP1 = p1();
        j6iVarP1.getClass();
        if (i == R.id.oneme_settings_twofa_delete_user_confirmation_skip || i != R.id.oneme_settings_twofa_delete_user_confirmation_action) {
            return;
        }
        j6iVarP1.w.B(j6iVarP1, j6i.y[1], yab.h0(j6iVarP1.b, ((n0c) ((xhh) j6iVarP1.j.getValue())).b(), 2, new e6i(j6iVarP1, null, 0)));
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.f;
    }

    @Override // defpackage.br4
    public final boolean handleBack() {
        if (o1() != mk8.a) {
            return super.handleBack();
        }
        o65.c(n7i.b.b(), ":login", null, null, 6);
        return true;
    }

    public final mk8 o1() {
        return (mk8) this.c.getValue();
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
        rccVar.setLeftActions(this.e);
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
        bdc.a(rccVar, new b6i(rccVar, scrollView, 0));
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setId(R.id.oneme_settings_twofa_action_wrapper);
        linearLayout.setOrientation(1);
        cyb cybVar = new cyb(linearLayout.getContext());
        cybVar.setId(R.id.oneme_settings_twofa_action);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(getContext(), R.string.oneme_settings_twofa_creation_other_action));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        layoutParams2.setMarginStart(iK);
        layoutParams2.setMarginEnd(iK);
        layoutParams2.bottomMargin = iK;
        cybVar.setLayoutParams(layoutParams2);
        qe7.H(cybVar, 300L, new z5i(this, 0));
        linearLayout.addView(cybVar);
        cyb cybVar2 = new cyb(linearLayout.getContext());
        cybVar2.setId(R.id.oneme_settings_twofa_forget_password_action);
        cybVar2.setText(np4.q(getContext(), R.string.oneme_settings_twofa_forget_password_action));
        cybVar2.setAppearance(zxb.GHOST);
        cybVar2.setTextColor(Integer.valueOf(R.attr.text_themed));
        cybVar2.setSize(ayb.j);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int iK2 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        layoutParams3.setMarginStart(iK2);
        layoutParams3.setMarginEnd(iK2);
        layoutParams3.bottomMargin = iK2;
        cybVar2.setLayoutParams(layoutParams3);
        qe7.H(cybVar2, 300L, new z5i(this, 1));
        linearLayout.addView(cybVar2);
        bdc.a(linearLayout, new a6i(linearLayout, scrollView, 0));
        frameLayout.addView(linearLayout);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        n1g.N(new nff(this, (lq4) null, 6), view);
        jz jzVar = new jz(p1().p, 13);
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(jzVar, i19VarF, n09Var), new c6i(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().s, getViewLifecycleOwner().f(), n09Var), new c6i(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().t, getViewLifecycleOwner().f(), n09Var), new c6i(null, this, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().r, getViewLifecycleOwner().f(), n09Var), new c6i(null, this, 3), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(uw8.f, getViewLifecycleOwner().f(), n09Var), new c6i(null, this, 4), 3), getViewLifecycleScope());
    }

    public final j6i p1() {
        return (j6i) this.g.getValue();
    }

    public final void q1(boolean z) {
        this.e = z ? this.d : ybc.a;
        ((rcc) this.k.m(this, n[2])).setLeftActions(this.e);
    }

    public TwoFACheckPassScreen(String str, String str2, ha9 ha9Var, pk8 pk8Var) {
        this(n1g.i(new ylc("twofa_check_password_source_key", str), new ylc("twofa_check_password_track_id_key", str2), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("twofa_check_password_nav_data_key", pk8Var)));
    }

    public /* synthetic */ TwoFACheckPassScreen(String str, String str2, ha9 ha9Var, pk8 pk8Var, int i, j95 j95Var) {
        this(str, (i & 2) != 0 ? "" : str2, ha9Var, (i & 8) != 0 ? null : pk8Var);
    }
}
