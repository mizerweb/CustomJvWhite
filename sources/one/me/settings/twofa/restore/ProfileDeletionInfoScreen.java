package one.me.settings.twofa.restore;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import defpackage.a8d;
import defpackage.a8g;
import defpackage.ayb;
import defpackage.bdc;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.hta;
import defpackage.i19;
import defpackage.j8e;
import defpackage.jz;
import defpackage.ks6;
import defpackage.lq4;
import defpackage.mmd;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nmd;
import defpackage.np4;
import defpackage.ny8;
import defpackage.og7;
import defpackage.oi8;
import defpackage.omd;
import defpackage.p;
import defpackage.p7d;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qv1;
import defpackage.rcc;
import defpackage.rmd;
import defpackage.sb8;
import defpackage.tre;
import defpackage.vqa;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.y3f;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/settings/twofa/restore/ProfileDeletionInfoScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "settings-twofa"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProfileDeletionInfoScreen extends Widget {
    public static final /* synthetic */ zv8[] g = {new dwd(ProfileDeletionInfoScreen.class, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0), zo5.f(zfe.a, ProfileDeletionInfoScreen.class, "continueButton", "getContinueButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final oi8 a;
    public final ks6 b;
    public final wtc c;
    public final ny8 d;
    public final j8e e;
    public final j8e f;

    public ProfileDeletionInfoScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        this.b = tre.F(this, y3f.SETTINGS_2FA_PROFILE_DELETE_STOP);
        this.c = new wtc(m35getAccountScopeuqN4xOY());
        this.d = createViewModelLazy(rmd.class, new hta(22, new a8d(11, this)));
        this.e = viewBinding(R.id.oneme_settings_twofa_onboarding_subtitle);
        this.f = viewBinding(R.id.oneme_settings_twofa_action);
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
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipToOutline(false);
        rcc rccVar = new rcc(frameLayout.getContext());
        rccVar.setId(R.id.oneme_settings_twofa_onboarding_toolbar);
        rccVar.setForm(gcc.Compact);
        rccVar.setBackgroundColor(0);
        rccVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        rccVar.setTranslationZ(1000.0f);
        rccVar.setLeftActions(new wbc(new p7d(7, this)));
        frameLayout.addView(rccVar);
        ScrollView scrollView = new ScrollView(viewGroup.getContext());
        scrollView.setId(R.id.oneme_settings_twofa_onboarding_scroll_content);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        Context context = scrollView.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.oneme_settings_twofa_onboarding_content);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), gm0.K(190.0f * yl5.d().getDisplayMetrics().density), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClipToOutline(false);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.oneme_settings_twofa_onboarding_picture);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 88.0f), gm0.K(yl5.d().getDisplayMetrics().density * 88.0f)));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setColorFilter(new PorterDuffColorFilter(a8gVar.h(imageView).h().d, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(shapeDrawable);
        int iK = gm0.K(28.0f * yl5.d().getDisplayMetrics().density);
        imageView.setPadding(iK, iK, iK, iK);
        a8gVar.h(imageView);
        Drawable drawableMutate = imageView.getContext().getDrawable(R.drawable.icon_delete_fill).mutate();
        sb8.m0(-1, drawableMutate);
        imageView.setImageDrawable(drawableMutate);
        linearLayout.addView(imageView);
        TextView textView = new TextView(context);
        textView.setId(R.id.oneme_settings_twofa_onboarding_title);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        layoutParams.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        layoutParams.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        textView.setLayoutParams(layoutParams);
        textView.setMaxLines(1);
        textView.setTextAlignment(4);
        textView.setGravity(17);
        textView.setTextColor(p.d(textView, q9i.c, a8gVar, textView).b);
        textView.setText(R.string.oneme_settings_twofa_delete_user_title);
        linearLayout.addView(textView);
        TextView textViewE = qv1.e(context, R.id.oneme_settings_twofa_onboarding_subtitle);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        layoutParams2.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f));
        layoutParams2.setMarginEnd(gm0.K(32.0f * yl5.d().getDisplayMetrics().density));
        textViewE.setLayoutParams(layoutParams2);
        textViewE.setTextAlignment(4);
        textViewE.setGravity(17);
        textViewE.setTextColor(p.d(textViewE, q9i.i, a8gVar, textViewE).d);
        linearLayout.addView(textViewE);
        scrollView.addView(linearLayout);
        frameLayout.addView(scrollView);
        bdc.a(rccVar, new og7(rccVar, 19, scrollView));
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2, 80);
        LinearLayout linearLayout2 = new LinearLayout(frameLayout.getContext());
        linearLayout2.setLayoutParams(layoutParams3);
        linearLayout2.setId(R.id.oneme_settings_twofa_action_wrapper);
        linearLayout2.setOrientation(1);
        cyb cybVar = new cyb(linearLayout2.getContext());
        cybVar.setId(R.id.oneme_settings_twofa_action);
        ayb aybVar = ayb.g;
        cybVar.setSize(aybVar);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.oneme_settings_twofa_delete_user_undo_delete_action));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        layoutParams4.setMarginStart(iK2);
        layoutParams4.setMarginEnd(iK2);
        layoutParams4.bottomMargin = iK2;
        cybVar.setLayoutParams(layoutParams4);
        qe7.H(cybVar, 300L, new mmd(this, 0));
        linearLayout2.addView(cybVar);
        cyb cybVar2 = new cyb(linearLayout2.getContext());
        cybVar2.setId(R.id.oneme_settings_twofa_action_secondary);
        cybVar2.setSize(aybVar);
        cybVar2.setAppearance(zxb.SECONDARY);
        cybVar2.setText(np4.q(cybVar2.getContext(), R.string.its_clear));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        int iK3 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        layoutParams5.setMarginStart(iK3);
        layoutParams5.setMarginEnd(iK3);
        layoutParams5.bottomMargin = iK3;
        cybVar2.setLayoutParams(layoutParams5);
        qe7.H(cybVar2, 300L, new mmd(this, 1));
        linearLayout2.addView(cybVar2);
        bdc.a(linearLayout2, new nmd(linearLayout2, scrollView, 0));
        frameLayout.addView(linearLayout2);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        n1g.N(new vqa(this, (lq4) null, 14), view);
        ny8 ny8Var = this.d;
        jz jzVar = new jz(((rmd) ny8Var.getValue()).h, 13);
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(jzVar, i19VarF, n09Var), new omd(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((rmd) ny8Var.getValue()).j, getViewLifecycleOwner().f(), n09Var), new omd(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((rmd) ny8Var.getValue()).i, getViewLifecycleOwner().f(), n09Var), new omd(null, this, 2), 3), getViewLifecycleScope());
    }

    public ProfileDeletionInfoScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
