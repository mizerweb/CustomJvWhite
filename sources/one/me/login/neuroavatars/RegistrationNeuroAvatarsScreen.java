package one.me.login.neuroavatars;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.a8g;
import defpackage.awb;
import defpackage.ca2;
import defpackage.cf7;
import defpackage.che;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.dk6;
import defpackage.dq4;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.er3;
import defpackage.fgd;
import defpackage.fn8;
import defpackage.fz6;
import defpackage.g19;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.i19;
import defpackage.i7j;
import defpackage.ifh;
import defpackage.j1a;
import defpackage.j8e;
import defpackage.kbc;
import defpackage.ks6;
import defpackage.ku6;
import defpackage.kwb;
import defpackage.lg9;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.lzf;
import defpackage.m34;
import defpackage.mc4;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.nac;
import defpackage.noh;
import defpackage.ny8;
import defpackage.o65;
import defpackage.oi8;
import defpackage.oj;
import defpackage.pdb;
import defpackage.pj;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qb3;
import defpackage.qdb;
import defpackage.qe7;
import defpackage.r8e;
import defpackage.skd;
import defpackage.t3f;
import defpackage.tnh;
import defpackage.tre;
import defpackage.vv;
import defpackage.vzc;
import defpackage.wsc;
import defpackage.xc0;
import defpackage.xeb;
import defpackage.xge;
import defpackage.xhh;
import defpackage.xr1;
import defpackage.yab;
import defpackage.ydb;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zge;
import defpackage.zo5;
import defpackage.ztd;
import defpackage.zv8;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.login.neuroavatars.NeuroAvatarPickerBottomSheet;
import one.me.login.neuroavatars.RegistrationNeuroAvatarsScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\rB!\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Lone/me/login/neuroavatars/RegistrationNeuroAvatarsScreen;", "Lone/me/sdk/arch/Widget;", "", "Lmc4;", "Lj1a;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lha9;", "localAccountId", "(JLha9;)V", "Lxge;", "registrationData", "Lfgd;", "presetAvatars", "(Lxge;Lfgd;Lha9;)V", "login"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RegistrationNeuroAvatarsScreen extends Widget implements mc4, j1a {
    public static final /* synthetic */ zv8[] u = {new dwd(RegistrationNeuroAvatarsScreen.class, "selectedAvatarView", "getSelectedAvatarView()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), zo5.f(zfe.a, RegistrationNeuroAvatarsScreen.class, "selectAvatarBtn", "getSelectAvatarBtn()Landroid/view/View;", 0), new dwd(RegistrationNeuroAvatarsScreen.class, "selectAvatarIcon", "getSelectAvatarIcon()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), new dwd(RegistrationNeuroAvatarsScreen.class, "continueBtn", "getContinueBtn()Lone/me/login/inputname/AnimatedOneMeButton;", 0), new dwd(RegistrationNeuroAvatarsScreen.class, "continueEnabledBtn", "getContinueEnabledBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(RegistrationNeuroAvatarsScreen.class, "continueDisabledBtn", "getContinueDisabledBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(RegistrationNeuroAvatarsScreen.class, "pickPhotoTextView", "getPickPhotoTextView()Landroid/widget/TextView;", 0), new dwd(RegistrationNeuroAvatarsScreen.class, "registrationData", "getRegistrationData()Lone/me/login/common/RegistrationData;", 0), new dwd(RegistrationNeuroAvatarsScreen.class, "contactId", "getContactId()Ljava/lang/Long;", 0), new dwd(RegistrationNeuroAvatarsScreen.class, "presetAvatars", "getPresetAvatars()Lone/me/login/common/avatars/PresetAvatarsModel;", 0)};
    public final /* synthetic */ ku6 a;
    public final oi8 b;
    public final t3f c;
    public final ks6 d;
    public final ca2 e;
    public final ny8 f;
    public final j8e g;
    public final j8e h;
    public final j8e i;
    public final j8e j;
    public final j8e k;
    public final j8e l;
    public final j8e m;
    public final ny8 n;
    public final ny8 o;
    public final vv p;
    public final vv q;
    public final vv r;
    public final ny8 s;
    public final ifh t;

    public RegistrationNeuroAvatarsScreen(Bundle bundle) {
        super(bundle);
        this.a = new ku6(26);
        this.b = new oi8(0, 3, 0, null, 5);
        this.c = new t3f("RegistrationNeuroAvatarsScreen", null, 2);
        this.d = tre.E(this, new zge(this, 0), new zge(this, 3));
        ca2 ca2Var = new ca2(m35getAccountScopeuqN4xOY());
        this.e = ca2Var;
        this.f = ca2Var.a();
        this.g = viewBinding(R.id.oneme_login_neuro_avatars_avatar);
        this.h = viewBinding(R.id.oneme_login_neuro_avatars_pick_neuroavatar_button);
        this.i = viewBinding(R.id.oneme_login_neuro_avatars_pick_neuroavatar_icon);
        this.j = viewBinding(R.id.oneme_login_neuro_avatars_continue_btn);
        this.k = viewBinding(R.id.oneme_login_neuro_avatars_continue_enabled_btn);
        this.l = viewBinding(R.id.oneme_login_neuro_avatars_continue_disabled_btn);
        this.m = viewBinding(R.id.oneme_login_neuro_avatars_pick_image_text);
        this.n = ca2Var.getAccessor().d(34);
        this.o = ca2Var.getAccessor().d(231);
        this.p = new vv("registration_data_args", xge.class);
        this.q = new vv("contact_id_args", Long.class);
        this.r = new vv("avatars_args", fgd.class);
        this.s = createViewModelLazy(xeb.class, new ztd(7, new zge(this, 4)));
        this.t = new ifh(new zge(this, 5));
    }

    public static final void o1(View view, kbc kbcVar) {
        float fMin = Math.min(view.getWidth(), view.getHeight());
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = fMin;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(((fn8) kbcVar.u().c.b).c), shapeDrawable, shapeDrawable);
        shapeDrawable.getPaint().setColor(kbcVar.h().i);
        view.setBackground(rippleDrawable);
    }

    public static void s1(RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen, LinearLayout linearLayout, int i) {
        View view = new View(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, i);
        layoutParams.weight = 0.0f;
        view.setLayoutParams(layoutParams);
        linearLayout.addView(view);
    }

    public static void t1(RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen, LinearLayout linearLayout, tnh tnhVar, noh nohVar, cf7 cf7Var, int i, int i2, int i3) {
        int i4 = (i3 & 8) != 0 ? -1 : R.id.oneme_login_neuro_avatars_pick_image_text;
        if ((i3 & 32) != 0) {
            i2 = 0;
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext());
        appCompatTextView.setId(i4);
        appCompatTextView.setText(tnhVar.b(appCompatTextView.getContext()));
        q9i.a(nohVar, appCompatTextView);
        n1g.N(new vzc(cf7Var, (lq4) null, 7), appCompatTextView);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, i, 0, i2);
        appCompatTextView.setLayoutParams(layoutParams);
        linearLayout.addView(appCompatTextView);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i == R.id.oneme_login_neuro_avatars_load_from_gallery_action) {
            o65.c(lg9.b.b(), ":media-picker/select/photo", null, null, 6);
        } else if (i == R.id.oneme_login_neuro_avatars_take_photo_action) {
            q1().J();
        } else if (i == R.id.oneme_login_neuro_avatars_remove_photo_action) {
            q1().B();
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getC() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.d;
    }

    @Override // defpackage.br4
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 555 && i2 == -1) {
            q1().C(intent != null ? intent.getData() : null);
        }
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
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(R.id.oneme_login_neuro_avatars_root_container);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        int i = 3;
        lq4 lq4Var = null;
        n1g.N(new qb3(3, null, 11), frameLayout);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        final int i2 = 2;
        er3.M(linearLayout, q1().k, new cf7(this) { // from class: ahe
            public final /* synthetic */ RegistrationNeuroAvatarsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i3 = i2;
                sbi sbiVar = sbi.a;
                RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen = this.b;
                switch (i3) {
                    case 0:
                        cyb cybVar = (cyb) obj;
                        zv8[] zv8VarArr = RegistrationNeuroAvatarsScreen.u;
                        cybVar.setId(R.id.oneme_login_neuro_avatars_continue_disabled_btn);
                        cybVar.setText(np4.q(registrationNeuroAvatarsScreen.getContext(), R.string.oneme_login_neuro_avatars_continue_without_avatar_button));
                        cybVar.setAppearance(zxb.SECONDARY);
                        cybVar.setSize(ayb.g);
                        break;
                    case 1:
                        cyb cybVar2 = (cyb) obj;
                        zv8[] zv8VarArr2 = RegistrationNeuroAvatarsScreen.u;
                        cybVar2.setId(R.id.oneme_login_neuro_avatars_continue_enabled_btn);
                        cybVar2.setText(np4.q(registrationNeuroAvatarsScreen.getContext(), R.string.oneme_login_neuro_avatars_continue_button));
                        cybVar2.setAppearance(zxb.PRIMARY);
                        cybVar2.setSize(ayb.g);
                        break;
                    default:
                        zv8[] zv8VarArr3 = RegistrationNeuroAvatarsScreen.u;
                        registrationNeuroAvatarsScreen.getRouter().D();
                        break;
                }
                return sbiVar;
            }
        });
        s1(this, linearLayout, gm0.K(yl5.d().getDisplayMetrics().density * 24.0f));
        er3.L(linearLayout, q1().k);
        s1(this, linearLayout, gm0.K(80.0f * yl5.d().getDisplayMetrics().density));
        ifh ifhVar = this.t;
        int i3 = 6;
        kwb kwbVarI = er3.I(linearLayout, (ydb) ifhVar.getValue(), new zge(this, 6), new zge(this, 1), gm0.K(yl5.d().getDisplayMetrics().density * 120.0f), gm0.K(120.0f * yl5.d().getDisplayMetrics().density), null, null);
        pj pjVar = new pj(i3, new WeakReference(kwbVarI));
        kwbVarI.setTag(pjVar);
        ((ydb) ifhVar.getValue()).setCallback(pjVar);
        t1(this, linearLayout, new tnh(R.string.oneme_registration_neuro_avatars_choose_photo), q9i.h, new skd(16), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), 0, 32);
        tnh tnhVar = new tnh(R.string.oneme_registration_neuro_avatars_or);
        noh nohVar = q9i.e;
        t1(this, linearLayout, tnhVar, nohVar, new skd(17), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density), 8);
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setId(R.id.oneme_login_neuro_avatars_pick_neuroavatar_button);
        linearLayout2.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f));
        linearLayout2.setOrientation(0);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        linearLayout2.setGravity(17);
        linearLayout2.setLayoutParams(layoutParams);
        WeakHashMap weakHashMap = i7j.a;
        boolean zIsLaidOut = linearLayout2.isLaidOut();
        a8g a8gVar = pq3.j;
        if (!zIsLaidOut || linearLayout2.isLayoutRequested()) {
            linearLayout2.addOnLayoutChangeListener(new xc0(18, linearLayout2));
        } else {
            o1(linearLayout2, a8gVar.h(linearLayout2));
        }
        n1g.N(new xr1(i, lq4Var, i3), linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(linearLayout2.getContext());
        frameLayout2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        int iK = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        frameLayout2.setPadding(iK, iK, iK, iK);
        frameLayout2.setBackground(new ShapeDrawable(new OvalShape()));
        n1g.N(new qb3(3, null, 12), frameLayout2);
        kwb kwbVar = new kwb(frameLayout2.getContext());
        kwbVar.setLayoutParams(new ViewGroup.MarginLayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density)));
        kwbVar.setId(R.id.oneme_login_neuro_avatars_pick_neuroavatar_icon);
        kwbVar.setAvatarShape(awb.a);
        frameLayout2.addView(kwbVar);
        linearLayout2.addView(frameLayout2);
        TextView textView = new TextView(linearLayout2.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        textView.setLayoutParams(marginLayoutParams);
        q9i.a(nohVar, textView);
        textView.setText(R.string.oneme_registration_neuro_avatars_choose_avatar);
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, getContext().getDrawable(R.drawable.icon_chevron_right_mini), (Drawable) null);
        textView.setCompoundDrawablePadding(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        n1g.N(new dk6(i, lq4Var, i3), textView);
        linearLayout2.addView(textView);
        linearLayout.addView(linearLayout2);
        frameLayout.addView(linearLayout);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        FrameLayout frameLayout3 = new FrameLayout(frameLayout.getContext());
        frameLayout3.setId(R.id.oneme_login_neuro_avatars_button_background);
        frameLayout3.setLayoutParams(layoutParams2);
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, ((nac) a8gVar.h(frameLayout3).k().r.b).a));
        frameLayout3.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), 0);
        lvb.G(frameLayout3);
        oj ojVar = new oj(frameLayout3.getContext());
        ojVar.setId(R.id.oneme_login_neuro_avatars_continue_btn);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 48;
        ojVar.setLayoutParams(layoutParams3);
        final int i4 = 0;
        ojVar.setupDisabledButton(new cf7(this) { // from class: ahe
            public final /* synthetic */ RegistrationNeuroAvatarsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i5 = i4;
                sbi sbiVar = sbi.a;
                RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen = this.b;
                switch (i5) {
                    case 0:
                        cyb cybVar = (cyb) obj;
                        zv8[] zv8VarArr = RegistrationNeuroAvatarsScreen.u;
                        cybVar.setId(R.id.oneme_login_neuro_avatars_continue_disabled_btn);
                        cybVar.setText(np4.q(registrationNeuroAvatarsScreen.getContext(), R.string.oneme_login_neuro_avatars_continue_without_avatar_button));
                        cybVar.setAppearance(zxb.SECONDARY);
                        cybVar.setSize(ayb.g);
                        break;
                    case 1:
                        cyb cybVar2 = (cyb) obj;
                        zv8[] zv8VarArr2 = RegistrationNeuroAvatarsScreen.u;
                        cybVar2.setId(R.id.oneme_login_neuro_avatars_continue_enabled_btn);
                        cybVar2.setText(np4.q(registrationNeuroAvatarsScreen.getContext(), R.string.oneme_login_neuro_avatars_continue_button));
                        cybVar2.setAppearance(zxb.PRIMARY);
                        cybVar2.setSize(ayb.g);
                        break;
                    default:
                        zv8[] zv8VarArr3 = RegistrationNeuroAvatarsScreen.u;
                        registrationNeuroAvatarsScreen.getRouter().D();
                        break;
                }
                return sbiVar;
            }
        });
        final int i5 = 1;
        ojVar.setupActiveButton(new cf7(this) { // from class: ahe
            public final /* synthetic */ RegistrationNeuroAvatarsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i6 = i5;
                sbi sbiVar = sbi.a;
                RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen = this.b;
                switch (i6) {
                    case 0:
                        cyb cybVar = (cyb) obj;
                        zv8[] zv8VarArr = RegistrationNeuroAvatarsScreen.u;
                        cybVar.setId(R.id.oneme_login_neuro_avatars_continue_disabled_btn);
                        cybVar.setText(np4.q(registrationNeuroAvatarsScreen.getContext(), R.string.oneme_login_neuro_avatars_continue_without_avatar_button));
                        cybVar.setAppearance(zxb.SECONDARY);
                        cybVar.setSize(ayb.g);
                        break;
                    case 1:
                        cyb cybVar2 = (cyb) obj;
                        zv8[] zv8VarArr2 = RegistrationNeuroAvatarsScreen.u;
                        cybVar2.setId(R.id.oneme_login_neuro_avatars_continue_enabled_btn);
                        cybVar2.setText(np4.q(registrationNeuroAvatarsScreen.getContext(), R.string.oneme_login_neuro_avatars_continue_button));
                        cybVar2.setAppearance(zxb.PRIMARY);
                        cybVar2.setSize(ayb.g);
                        break;
                    default:
                        zv8[] zv8VarArr3 = RegistrationNeuroAvatarsScreen.u;
                        registrationNeuroAvatarsScreen.getRouter().D();
                        break;
                }
                return sbiVar;
            }
        });
        frameLayout3.addView(ojVar);
        n1g.N(new qb3(3, null, 8), frameLayout3);
        frameLayout.addView(frameLayout3);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((wsc) this.n.getValue()).c(strArr)) {
            q1().J();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        zv8[] zv8VarArr = u;
        final int i = 0;
        zv8 zv8Var = zv8VarArr[0];
        j8e j8eVar = this.g;
        kwb kwbVar = (kwb) j8eVar.m(this, zv8Var);
        g19 viewLifecycleOwner = getViewLifecycleOwner();
        r8e r8eVar = q1().l;
        ydb ydbVar = (ydb) this.t.getValue();
        i19 i19VarF = viewLifecycleOwner.f();
        n09 n09Var = n09.d;
        final int i2 = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new m34(2, null, kwbVar, ydbVar, null, null), i2), tre.d0(viewLifecycleOwner));
        lzf lzfVar = q1().j;
        if (lzfVar != null) {
            e9i.j0(new fz6(n1g.v(lzfVar, getViewLifecycleOwner().f(), n09Var), new che(null, this, 3), i2), getViewLifecycleScope());
        }
        e9i.j0(new fz6(n1g.v(q1().i, getViewLifecycleOwner().f(), n09Var), new che(null, this, 4), i2), getViewLifecycleScope());
        final int i3 = 2;
        e9i.j0(new fz6(n1g.v(q1().c.k, getViewLifecycleOwner().f(), n09Var), new che(null, this, 2), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(q1().o, getViewLifecycleOwner().f(), n09Var), new che(null, this, 0), i2), getViewLifecycleScope());
        final int i4 = 1;
        e9i.j0(new fz6(n1g.v(q1().l, getViewLifecycleOwner().f(), n09Var), new che(null, this, 1), i2), getViewLifecycleScope());
        qe7.H((cyb) this.k.m(this, zv8VarArr[4]), 300L, new View.OnClickListener(this) { // from class: bhe
            public final /* synthetic */ RegistrationNeuroAvatarsScreen b;

            {
                this.b = this;
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
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hve hveVarU1;
                int i5 = i;
                RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen = this.b;
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr2 = RegistrationNeuroAvatarsScreen.u;
                        registrationNeuroAvatarsScreen.r1(true);
                        registrationNeuroAvatarsScreen.q1().F();
                        break;
                    case 1:
                        zv8[] zv8VarArr3 = RegistrationNeuroAvatarsScreen.u;
                        registrationNeuroAvatarsScreen.r1(true);
                        registrationNeuroAvatarsScreen.q1().F();
                        break;
                    case 2:
                        zv8[] zv8VarArr4 = RegistrationNeuroAvatarsScreen.u;
                        if (registrationNeuroAvatarsScreen.p1() != null) {
                            List listD = registrationNeuroAvatarsScreen.q1().D();
                            jc4 jc4VarC = p.c(R.string.oneme_login_neuro_avatars_bottomsheet_title, null, null, 6);
                            ListIterator listIterator = ((c79) listD).listIterator(0);
                            while (true) {
                                b79 b79Var = (b79) listIterator;
                                if (!b79Var.hasNext()) {
                                    zv8[] zv8VarArr5 = BottomSheetWidget.t;
                                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(registrationNeuroAvatarsScreen);
                                    confirmationBottomSheetF.setTargetController(registrationNeuroAvatarsScreen);
                                    br4 parentController = registrationNeuroAvatarsScreen;
                                    while (parentController.getParentController() != null) {
                                        parentController = parentController.getParentController();
                                    }
                                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                                    hveVarU1 = rootController != null ? rootController.u1() : null;
                                    if (hveVarU1 != null) {
                                        lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                                        p.k(false, lveVar, true, "BottomSheetWidget");
                                        hveVarU1.I(lveVar);
                                    }
                                } else {
                                    jc4VarC.a((kc4) b79Var.next());
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        zv8[] zv8VarArr6 = RegistrationNeuroAvatarsScreen.u;
                        View view3 = registrationNeuroAvatarsScreen.getView();
                        if (view3 != null) {
                            Rect rect = new Rect();
                            ((TextView) registrationNeuroAvatarsScreen.m.m(registrationNeuroAvatarsScreen, RegistrationNeuroAvatarsScreen.u[6])).getGlobalVisibleRect(rect);
                            zv8[] zv8VarArr7 = BottomSheetWidget.t;
                            NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = new NeuroAvatarPickerBottomSheet(registrationNeuroAvatarsScreen.c, zo5.D(16.0f, yl5.d().getDisplayMetrics().density, view3.getHeight() - rect.bottom));
                            neuroAvatarPickerBottomSheet.setTargetController(registrationNeuroAvatarsScreen);
                            br4 parentController2 = registrationNeuroAvatarsScreen;
                            while (parentController2.getParentController() != null) {
                                parentController2 = parentController2.getParentController();
                            }
                            RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
                            hveVarU1 = rootController2 != null ? rootController2.u1() : null;
                            if (hveVarU1 != null) {
                                lve lveVar2 = new lve(neuroAvatarPickerBottomSheet, null, null, null, false, -1);
                                p.k(false, lveVar2, true, "BottomSheetWidget");
                                hveVarU1.I(lveVar2);
                            }
                        }
                        break;
                }
            }
        });
        qe7.H((cyb) this.l.m(this, zv8VarArr[5]), 300L, new View.OnClickListener(this) { // from class: bhe
            public final /* synthetic */ RegistrationNeuroAvatarsScreen b;

            {
                this.b = this;
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
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hve hveVarU1;
                int i5 = i4;
                RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen = this.b;
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr2 = RegistrationNeuroAvatarsScreen.u;
                        registrationNeuroAvatarsScreen.r1(true);
                        registrationNeuroAvatarsScreen.q1().F();
                        break;
                    case 1:
                        zv8[] zv8VarArr3 = RegistrationNeuroAvatarsScreen.u;
                        registrationNeuroAvatarsScreen.r1(true);
                        registrationNeuroAvatarsScreen.q1().F();
                        break;
                    case 2:
                        zv8[] zv8VarArr4 = RegistrationNeuroAvatarsScreen.u;
                        if (registrationNeuroAvatarsScreen.p1() != null) {
                            List listD = registrationNeuroAvatarsScreen.q1().D();
                            jc4 jc4VarC = p.c(R.string.oneme_login_neuro_avatars_bottomsheet_title, null, null, 6);
                            ListIterator listIterator = ((c79) listD).listIterator(0);
                            while (true) {
                                b79 b79Var = (b79) listIterator;
                                if (!b79Var.hasNext()) {
                                    zv8[] zv8VarArr5 = BottomSheetWidget.t;
                                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(registrationNeuroAvatarsScreen);
                                    confirmationBottomSheetF.setTargetController(registrationNeuroAvatarsScreen);
                                    br4 parentController = registrationNeuroAvatarsScreen;
                                    while (parentController.getParentController() != null) {
                                        parentController = parentController.getParentController();
                                    }
                                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                                    hveVarU1 = rootController != null ? rootController.u1() : null;
                                    if (hveVarU1 != null) {
                                        lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                                        p.k(false, lveVar, true, "BottomSheetWidget");
                                        hveVarU1.I(lveVar);
                                    }
                                } else {
                                    jc4VarC.a((kc4) b79Var.next());
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        zv8[] zv8VarArr6 = RegistrationNeuroAvatarsScreen.u;
                        View view3 = registrationNeuroAvatarsScreen.getView();
                        if (view3 != null) {
                            Rect rect = new Rect();
                            ((TextView) registrationNeuroAvatarsScreen.m.m(registrationNeuroAvatarsScreen, RegistrationNeuroAvatarsScreen.u[6])).getGlobalVisibleRect(rect);
                            zv8[] zv8VarArr7 = BottomSheetWidget.t;
                            NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = new NeuroAvatarPickerBottomSheet(registrationNeuroAvatarsScreen.c, zo5.D(16.0f, yl5.d().getDisplayMetrics().density, view3.getHeight() - rect.bottom));
                            neuroAvatarPickerBottomSheet.setTargetController(registrationNeuroAvatarsScreen);
                            br4 parentController2 = registrationNeuroAvatarsScreen;
                            while (parentController2.getParentController() != null) {
                                parentController2 = parentController2.getParentController();
                            }
                            RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
                            hveVarU1 = rootController2 != null ? rootController2.u1() : null;
                            if (hveVarU1 != null) {
                                lve lveVar2 = new lve(neuroAvatarPickerBottomSheet, null, null, null, false, -1);
                                p.k(false, lveVar2, true, "BottomSheetWidget");
                                hveVarU1.I(lveVar2);
                            }
                        }
                        break;
                }
            }
        });
        qe7.H((kwb) j8eVar.m(this, zv8VarArr[0]), 300L, new View.OnClickListener(this) { // from class: bhe
            public final /* synthetic */ RegistrationNeuroAvatarsScreen b;

            {
                this.b = this;
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
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hve hveVarU1;
                int i5 = i3;
                RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen = this.b;
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr2 = RegistrationNeuroAvatarsScreen.u;
                        registrationNeuroAvatarsScreen.r1(true);
                        registrationNeuroAvatarsScreen.q1().F();
                        break;
                    case 1:
                        zv8[] zv8VarArr3 = RegistrationNeuroAvatarsScreen.u;
                        registrationNeuroAvatarsScreen.r1(true);
                        registrationNeuroAvatarsScreen.q1().F();
                        break;
                    case 2:
                        zv8[] zv8VarArr4 = RegistrationNeuroAvatarsScreen.u;
                        if (registrationNeuroAvatarsScreen.p1() != null) {
                            List listD = registrationNeuroAvatarsScreen.q1().D();
                            jc4 jc4VarC = p.c(R.string.oneme_login_neuro_avatars_bottomsheet_title, null, null, 6);
                            ListIterator listIterator = ((c79) listD).listIterator(0);
                            while (true) {
                                b79 b79Var = (b79) listIterator;
                                if (!b79Var.hasNext()) {
                                    zv8[] zv8VarArr5 = BottomSheetWidget.t;
                                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(registrationNeuroAvatarsScreen);
                                    confirmationBottomSheetF.setTargetController(registrationNeuroAvatarsScreen);
                                    br4 parentController = registrationNeuroAvatarsScreen;
                                    while (parentController.getParentController() != null) {
                                        parentController = parentController.getParentController();
                                    }
                                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                                    hveVarU1 = rootController != null ? rootController.u1() : null;
                                    if (hveVarU1 != null) {
                                        lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                                        p.k(false, lveVar, true, "BottomSheetWidget");
                                        hveVarU1.I(lveVar);
                                    }
                                } else {
                                    jc4VarC.a((kc4) b79Var.next());
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        zv8[] zv8VarArr6 = RegistrationNeuroAvatarsScreen.u;
                        View view3 = registrationNeuroAvatarsScreen.getView();
                        if (view3 != null) {
                            Rect rect = new Rect();
                            ((TextView) registrationNeuroAvatarsScreen.m.m(registrationNeuroAvatarsScreen, RegistrationNeuroAvatarsScreen.u[6])).getGlobalVisibleRect(rect);
                            zv8[] zv8VarArr7 = BottomSheetWidget.t;
                            NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = new NeuroAvatarPickerBottomSheet(registrationNeuroAvatarsScreen.c, zo5.D(16.0f, yl5.d().getDisplayMetrics().density, view3.getHeight() - rect.bottom));
                            neuroAvatarPickerBottomSheet.setTargetController(registrationNeuroAvatarsScreen);
                            br4 parentController2 = registrationNeuroAvatarsScreen;
                            while (parentController2.getParentController() != null) {
                                parentController2 = parentController2.getParentController();
                            }
                            RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
                            hveVarU1 = rootController2 != null ? rootController2.u1() : null;
                            if (hveVarU1 != null) {
                                lve lveVar2 = new lve(neuroAvatarPickerBottomSheet, null, null, null, false, -1);
                                p.k(false, lveVar2, true, "BottomSheetWidget");
                                hveVarU1.I(lveVar2);
                            }
                        }
                        break;
                }
            }
        });
        ((View) this.h.m(this, zv8VarArr[1])).setOnClickListener(new View.OnClickListener(this) { // from class: bhe
            public final /* synthetic */ RegistrationNeuroAvatarsScreen b;

            {
                this.b = this;
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
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hve hveVarU1;
                int i5 = i2;
                RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen = this.b;
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr2 = RegistrationNeuroAvatarsScreen.u;
                        registrationNeuroAvatarsScreen.r1(true);
                        registrationNeuroAvatarsScreen.q1().F();
                        break;
                    case 1:
                        zv8[] zv8VarArr3 = RegistrationNeuroAvatarsScreen.u;
                        registrationNeuroAvatarsScreen.r1(true);
                        registrationNeuroAvatarsScreen.q1().F();
                        break;
                    case 2:
                        zv8[] zv8VarArr4 = RegistrationNeuroAvatarsScreen.u;
                        if (registrationNeuroAvatarsScreen.p1() != null) {
                            List listD = registrationNeuroAvatarsScreen.q1().D();
                            jc4 jc4VarC = p.c(R.string.oneme_login_neuro_avatars_bottomsheet_title, null, null, 6);
                            ListIterator listIterator = ((c79) listD).listIterator(0);
                            while (true) {
                                b79 b79Var = (b79) listIterator;
                                if (!b79Var.hasNext()) {
                                    zv8[] zv8VarArr5 = BottomSheetWidget.t;
                                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(registrationNeuroAvatarsScreen);
                                    confirmationBottomSheetF.setTargetController(registrationNeuroAvatarsScreen);
                                    br4 parentController = registrationNeuroAvatarsScreen;
                                    while (parentController.getParentController() != null) {
                                        parentController = parentController.getParentController();
                                    }
                                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                                    hveVarU1 = rootController != null ? rootController.u1() : null;
                                    if (hveVarU1 != null) {
                                        lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                                        p.k(false, lveVar, true, "BottomSheetWidget");
                                        hveVarU1.I(lveVar);
                                    }
                                } else {
                                    jc4VarC.a((kc4) b79Var.next());
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        zv8[] zv8VarArr6 = RegistrationNeuroAvatarsScreen.u;
                        View view3 = registrationNeuroAvatarsScreen.getView();
                        if (view3 != null) {
                            Rect rect = new Rect();
                            ((TextView) registrationNeuroAvatarsScreen.m.m(registrationNeuroAvatarsScreen, RegistrationNeuroAvatarsScreen.u[6])).getGlobalVisibleRect(rect);
                            zv8[] zv8VarArr7 = BottomSheetWidget.t;
                            NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = new NeuroAvatarPickerBottomSheet(registrationNeuroAvatarsScreen.c, zo5.D(16.0f, yl5.d().getDisplayMetrics().density, view3.getHeight() - rect.bottom));
                            neuroAvatarPickerBottomSheet.setTargetController(registrationNeuroAvatarsScreen);
                            br4 parentController2 = registrationNeuroAvatarsScreen;
                            while (parentController2.getParentController() != null) {
                                parentController2 = parentController2.getParentController();
                            }
                            RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
                            hveVarU1 = rootController2 != null ? rootController2.u1() : null;
                            if (hveVarU1 != null) {
                                lve lveVar2 = new lve(neuroAvatarPickerBottomSheet, null, null, null, false, -1);
                                p.k(false, lveVar2, true, "BottomSheetWidget");
                                hveVarU1.I(lveVar2);
                            }
                        }
                        break;
                }
            }
        });
    }

    public final xge p1() {
        zv8 zv8Var = u[7];
        return (xge) this.p.a(this);
    }

    @Override // defpackage.j1a
    public final void q(String str, RectF rectF, Rect rect) {
        xeb xebVarQ1 = q1();
        dq4 dq4Var = xebVarQ1.b;
        qdb qdbVar = xebVarQ1.c;
        yab.i0(dq4Var, ((n0c) ((xhh) qdbVar.i.getValue())).b(), 0, new pdb(qdbVar, str, rect, rectF, 2, null), 2);
    }

    public final xeb q1() {
        return (xeb) this.s.getValue();
    }

    public final void r1(boolean z) {
        zv8[] zv8VarArr = u;
        zv8 zv8Var = zv8VarArr[4];
        j8e j8eVar = this.k;
        boolean z2 = !z;
        ((cyb) j8eVar.m(this, zv8Var)).setClickable(z2);
        ((cyb) j8eVar.m(this, zv8VarArr[4])).setLoading(z);
        zv8 zv8Var2 = zv8VarArr[5];
        j8e j8eVar2 = this.l;
        ((cyb) j8eVar2.m(this, zv8Var2)).setClickable(z2);
        ((cyb) j8eVar2.m(this, zv8VarArr[5])).setLoading(z);
    }

    public RegistrationNeuroAvatarsScreen(xge xgeVar, fgd fgdVar, ha9 ha9Var) {
        this(n1g.i(new ylc("registration_data_args", xgeVar), new ylc("avatars_args", fgdVar), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }

    public RegistrationNeuroAvatarsScreen(long j, ha9 ha9Var) {
        this(n1g.i(new ylc("contact_id_args", Long.valueOf(j)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
