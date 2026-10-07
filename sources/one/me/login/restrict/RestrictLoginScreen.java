package one.me.login.restrict;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import defpackage.a1g;
import defpackage.a8g;
import defpackage.ayb;
import defpackage.bdc;
import defpackage.bsb;
import defpackage.ca2;
import defpackage.ch3;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.doe;
import defpackage.dtd;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.eg4;
import defpackage.eoe;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.j8e;
import defpackage.ks6;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nmd;
import defpackage.np4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.p;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qt4;
import defpackage.qv1;
import defpackage.rx8;
import defpackage.t3f;
import defpackage.tre;
import defpackage.uf4;
import defpackage.vqa;
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
import one.me.login.restrict.RestrictLoginScreen;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/login/restrict/RestrictLoginScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "(Lt3f;)V", "login"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RestrictLoginScreen extends Widget {
    public static final /* synthetic */ zv8[] m = {new dwd(RestrictLoginScreen.class, "primaryButton", "getPrimaryButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), zo5.f(zfe.a, RestrictLoginScreen.class, "secondaryButton", "getSecondaryButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(RestrictLoginScreen.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), new dwd(RestrictLoginScreen.class, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0)};
    public final ks6 a;
    public final ca2 b;
    public final ny8 c;
    public final oi8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final j8e i;
    public final j8e j;
    public final j8e k;
    public final j8e l;

    public RestrictLoginScreen(Bundle bundle) {
        super(bundle);
        this.a = tre.F(this, y3f.AUTH_NO_2FA);
        this.b = new ca2(m35getAccountScopeuqN4xOY());
        this.c = rx8.P(3, new doe(this, 0));
        this.d = oi8.f;
        this.e = rx8.P(3, new doe(this, 1));
        this.f = rx8.P(3, new doe(this, 2));
        this.g = rx8.P(3, new doe(this, 3));
        this.h = createViewModelLazy(eoe.class, new ztd(8, new doe(this, 4)));
        this.i = viewBinding(R.id.oneme_login_restrict_primary_action);
        this.j = viewBinding(R.id.oneme_login_restrict_secondary_action);
        this.k = viewBinding(R.id.oneme_login_restrict_content_title);
        this.l = viewBinding(R.id.oneme_login_restrict_content_subtitle);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getD() {
        return this.d;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.a;
    }

    @Override // defpackage.br4
    public final boolean handleBack() {
        return true;
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        ny8 ny8Var = this.g;
        if (((a1g) ny8Var.getValue()).isRunning()) {
            return;
        }
        ((a1g) ny8Var.getValue()).start();
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
        frameLayout.setId(R.id.oneme_login_restrict_root);
        a8g a8gVar = pq3.j;
        frameLayout.setBackgroundColor(a8gVar.h(frameLayout).b().c);
        final int i = 0;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipToOutline(false);
        ScrollView scrollView = new ScrollView(viewGroup.getContext());
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        scrollView.setClipChildren(false);
        scrollView.setClipToPadding(false);
        scrollView.setClipToOutline(false);
        Context context = scrollView.getContext();
        wf4 wf4Var = new wf4(context);
        wf4Var.setId(R.id.oneme_login_restrict_content);
        wf4Var.setClipChildren(false);
        wf4Var.setClipToPadding(false);
        wf4Var.setClipToOutline(false);
        View view = new View(context);
        view.setId(R.id.oneme_login_restrict_content_background);
        view.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 240.0f), gm0.K(240.0f * yl5.d().getDisplayMetrics().density)));
        wf4Var.setClipToPadding(false);
        view.setClipToOutline(false);
        view.setBackground((a1g) this.g.getValue());
        wf4Var.addView(view);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.oneme_login_restrict_content_icon);
        imageView.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 80.0f), gm0.K(80.0f * yl5.d().getDisplayMetrics().density)));
        imageView.setImageDrawable((LayerDrawable) this.f.getValue());
        wf4Var.addView(imageView);
        TextView textView = new TextView(context);
        textView.setId(R.id.oneme_login_restrict_content_title);
        uf4 uf4Var = new uf4(0, -2);
        uf4Var.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        uf4Var.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        textView.setLayoutParams(uf4Var);
        textView.setTextAlignment(4);
        textView.setGravity(17);
        textView.setTextColor(p.d(textView, q9i.c, a8gVar, textView).b);
        textView.setText(R.string.oneme_restrict_login_twofa_title);
        wf4Var.addView(textView);
        TextView textViewE = qv1.e(context, R.id.oneme_login_restrict_content_subtitle);
        uf4 uf4Var2 = new uf4(0, -2);
        uf4Var2.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        uf4Var2.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        textViewE.setLayoutParams(uf4Var2);
        textViewE.setTextAlignment(4);
        textViewE.setGravity(17);
        textViewE.setTextColor(p.d(textViewE, q9i.g, a8gVar, textViewE).d);
        textViewE.setText(R.string.oneme_restrict_login_twofa_subtitle);
        wf4Var.addView(textViewE);
        eg4 eg4VarH = ch3.h(wf4Var);
        int id = view.getId();
        eg4VarH.d(id, 3, 0, 3);
        qt4.w(76.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id));
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 7, 0, 7);
        int id2 = imageView.getId();
        eg4VarH.d(id2, 3, view.getId(), 3);
        eg4VarH.d(id2, 6, view.getId(), 6);
        eg4VarH.d(id2, 7, view.getId(), 7);
        eg4VarH.d(id2, 4, view.getId(), 4);
        int id3 = textView.getId();
        eg4VarH.d(id3, 3, imageView.getId(), 4);
        qt4.w(32.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id3));
        eg4VarH.d(id3, 6, 0, 6);
        qt4.w(32.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id3));
        eg4VarH.d(id3, 7, 0, 7);
        new bsb(7, eg4VarH, id3).a(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        final int i2 = 1;
        eg4VarH.g(id3).d.l0 = true;
        int id4 = textViewE.getId();
        eg4VarH.d(id4, 3, textView.getId(), 4);
        qt4.w(8.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id4));
        eg4VarH.d(id4, 6, 0, 6);
        qt4.w(32.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id4));
        eg4VarH.d(id4, 7, 0, 7);
        new bsb(7, eg4VarH, id4).a(gm0.K(32.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.g(id4).d.l0 = true;
        eg4VarH.a(wf4Var);
        scrollView.addView(wf4Var);
        frameLayout.addView(scrollView);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        linearLayout.setOrientation(1);
        cyb cybVar = new cyb(linearLayout.getContext());
        cybVar.setId(R.id.oneme_login_restrict_primary_action);
        ayb aybVar = ayb.g;
        cybVar.setSize(aybVar);
        cybVar.setAppearance(zxb.PRIMARY);
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.oneme_restrict_login_go_to_login));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.setMarginStart(iK);
        layoutParams.setMarginEnd(iK);
        layoutParams.bottomMargin = iK;
        cybVar.setLayoutParams(layoutParams);
        qe7.H(cybVar, 300L, new View.OnClickListener(this) { // from class: coe
            public final /* synthetic */ RestrictLoginScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i;
                RestrictLoginScreen restrictLoginScreen = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = RestrictLoginScreen.m;
                        eoe eoeVar = (eoe) restrictLoginScreen.h.getValue();
                        eoeVar.B((byte) 1);
                        a8j.x(eoeVar.f, aoe.b);
                        break;
                    default:
                        zv8[] zv8VarArr2 = RestrictLoginScreen.m;
                        eoe eoeVar2 = (eoe) restrictLoginScreen.h.getValue();
                        eoeVar2.B((byte) 2);
                        a8j.x(eoeVar2.f, new boe(lpl.a((String) ((e5d) eoeVar2.c.getValue()).x.a(e5d.S6[15]).i())));
                        break;
                }
            }
        });
        linearLayout.addView(cybVar);
        cyb cybVar2 = new cyb(linearLayout.getContext());
        cybVar2.setId(R.id.oneme_login_restrict_secondary_action);
        cybVar2.setSize(aybVar);
        cybVar2.setAppearance(zxb.SECONDARY);
        int iK2 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        cybVar2.setText(np4.q(cybVar2.getContext(), R.string.oneme_restrict_login_go_to_recovery));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams2.setMarginStart(iK2);
        layoutParams2.setMarginEnd(iK2);
        layoutParams2.bottomMargin = iK2;
        cybVar2.setLayoutParams(layoutParams2);
        qe7.H(cybVar2, 300L, new View.OnClickListener(this) { // from class: coe
            public final /* synthetic */ RestrictLoginScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                RestrictLoginScreen restrictLoginScreen = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = RestrictLoginScreen.m;
                        eoe eoeVar = (eoe) restrictLoginScreen.h.getValue();
                        eoeVar.B((byte) 1);
                        a8j.x(eoeVar.f, aoe.b);
                        break;
                    default:
                        zv8[] zv8VarArr2 = RestrictLoginScreen.m;
                        eoe eoeVar2 = (eoe) restrictLoginScreen.h.getValue();
                        eoeVar2.B((byte) 2);
                        a8j.x(eoeVar2.f, new boe(lpl.a((String) ((e5d) eoeVar2.c.getValue()).x.a(e5d.S6[15]).i())));
                        break;
                }
            }
        });
        linearLayout.addView(cybVar2);
        bdc.a(linearLayout, new nmd(linearLayout, scrollView, 1));
        frameLayout.addView(linearLayout);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        super.onDetach(view);
        ((a1g) this.g.getValue()).stop();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        lq4 lq4Var = null;
        n1g.N(new vqa(this, lq4Var, 20), view);
        e9i.j0(new fz6(n1g.v(((eoe) this.h.getValue()).f, getViewLifecycleOwner().f(), n09.d), new dtd(lq4Var, this, 11), 3), getViewLifecycleScope());
    }

    public RestrictLoginScreen(t3f t3fVar) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
