package one.me.login.avatar;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.awb;
import defpackage.bsb;
import defpackage.c1a;
import defpackage.ca2;
import defpackage.cf7;
import defpackage.ch3;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.dq4;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.eg4;
import defpackage.fgd;
import defpackage.fz6;
import defpackage.g19;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.i19;
import defpackage.ifh;
import defpackage.j1a;
import defpackage.j8e;
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
import defpackage.nge;
import defpackage.ny8;
import defpackage.o65;
import defpackage.oi8;
import defpackage.oj;
import defpackage.pdb;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qb3;
import defpackage.qdb;
import defpackage.qe7;
import defpackage.qge;
import defpackage.qt4;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.rge;
import defpackage.suc;
import defpackage.t3f;
import defpackage.tre;
import defpackage.tyd;
import defpackage.u57;
import defpackage.uf3;
import defpackage.uf4;
import defpackage.vv;
import defpackage.wbc;
import defpackage.wf4;
import defpackage.wsc;
import defpackage.xc9;
import defpackage.xeb;
import defpackage.xge;
import defpackage.xhh;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yw4;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.ztd;
import defpackage.zv8;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.login.avatar.RegistrationAvatarScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/login/avatar/RegistrationAvatarScreen;", "Lone/me/sdk/arch/Widget;", "", "Lmc4;", "Lj1a;", "Lyw4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lxge;", "registrationData", "Lfgd;", "presetAvatars", "Lt3f;", "scopeId", "(Lxge;Lfgd;Lt3f;)V", "login"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RegistrationAvatarScreen extends Widget implements mc4, j1a, yw4 {
    public static final /* synthetic */ zv8[] q = {new dwd(RegistrationAvatarScreen.class, "selectedAvatarView", "getSelectedAvatarView()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), zo5.f(zfe.a, RegistrationAvatarScreen.class, "continueBtn", "getContinueBtn()Lone/me/login/inputname/AnimatedOneMeButton;", 0), new dwd(RegistrationAvatarScreen.class, "continueEnabledBtn", "getContinueEnabledBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(RegistrationAvatarScreen.class, "continueDisabledBtn", "getContinueDisabledBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(RegistrationAvatarScreen.class, "pickPhotoTextView", "getPickPhotoTextView()Landroid/widget/TextView;", 0), new dwd(RegistrationAvatarScreen.class, "registrationData", "getRegistrationData()Lone/me/login/common/RegistrationData;", 0), new dwd(RegistrationAvatarScreen.class, "presetAvatars", "getPresetAvatars()Lone/me/login/common/avatars/PresetAvatarsModel;", 0)};
    public final /* synthetic */ ku6 a;
    public final oi8 b;
    public final ks6 c;
    public final ca2 d;
    public final ny8 e;
    public final j8e f;
    public final j8e g;
    public final j8e h;
    public final j8e i;
    public final j8e j;
    public final ny8 k;
    public final ny8 l;
    public final vv m;
    public final vv n;
    public final ny8 o;
    public final ifh p;

    public RegistrationAvatarScreen(Bundle bundle) {
        super(bundle);
        this.a = new ku6(26);
        this.b = new oi8(0, 3, 0, null, 5);
        this.c = tre.E(this, new tyd(14), new tyd(15));
        ca2 ca2Var = new ca2(m35getAccountScopeuqN4xOY());
        this.d = ca2Var;
        this.e = ca2Var.a();
        this.f = viewBinding(R.id.oneme_login_neuro_avatars_avatar);
        this.g = viewBinding(R.id.oneme_login_neuro_avatars_continue_btn);
        this.h = viewBinding(R.id.oneme_login_neuro_avatars_continue_enabled_btn);
        this.i = viewBinding(R.id.oneme_login_neuro_avatars_continue_disabled_btn);
        this.j = viewBinding(R.id.oneme_login_neuro_avatars_pick_image_text);
        this.k = ca2Var.getAccessor().d(34);
        this.l = ca2Var.getAccessor().d(231);
        this.m = new vv("registration_data_args", xge.class);
        this.n = new vv("avatars_args", fgd.class);
        this.o = createViewModelLazy(xeb.class, new ztd(6, new qge(this, 1)));
        this.p = new ifh(new qge(this, 2));
    }

    @Override // defpackage.yw4
    public final void A0(suc sucVar) {
        xeb xebVarO1 = o1();
        RectF rectF = sucVar.a;
        Rect rect = sucVar.b;
        dq4 dq4Var = xebVarO1.b;
        qdb qdbVar = xebVarO1.c;
        yab.i0(dq4Var, ((n0c) ((xhh) qdbVar.i.getValue())).b(), 0, new uf3(4, null, qdbVar, rect, rectF, dq4Var), 2);
        c1a.b.b().f();
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i == R.id.oneme_login_neuro_avatars_load_from_gallery_action) {
            o65.c(lg9.b.b(), ":media-picker/select/photo", null, null, 6);
        } else if (i == R.id.oneme_login_neuro_avatars_take_photo_action) {
            o1().J();
        } else if (i == R.id.oneme_login_neuro_avatars_remove_photo_action) {
            o1().B();
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.c;
    }

    public final xeb o1() {
        return (xeb) this.o.getValue();
    }

    @Override // defpackage.br4
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 555 && i2 == -1) {
            o1().C(intent != null ? intent.getData() : null);
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
        wf4 wf4Var = new wf4(getContext());
        wf4Var.setId(R.id.oneme_login_neuro_avatars_root_container);
        wf4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        int i = 3;
        lq4 lq4Var = null;
        final int i2 = 1;
        n1g.N(new u57(3, null, 1), wf4Var);
        rcc rccVar = new rcc(wf4Var.getContext());
        rccVar.setId(R.id.oneme_login_neuro_avatars_toolbar);
        rccVar.setForm(gcc.Compact);
        final int i3 = 2;
        rccVar.setLeftActions(new wbc(new cf7(this) { // from class: pge
            public final /* synthetic */ RegistrationAvatarScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i4 = i3;
                sbi sbiVar = sbi.a;
                RegistrationAvatarScreen registrationAvatarScreen = this.b;
                switch (i4) {
                    case 0:
                        cyb cybVar = (cyb) obj;
                        zv8[] zv8VarArr = RegistrationAvatarScreen.q;
                        cybVar.setId(R.id.oneme_login_neuro_avatars_continue_disabled_btn);
                        cybVar.setText(np4.q(registrationAvatarScreen.getContext(), R.string.oneme_login_input_continue));
                        cybVar.setTextColor(Integer.valueOf(R.attr.text_primary));
                        cybVar.setAppearance(zxb.SECONDARY);
                        cybVar.setSize(ayb.g);
                        break;
                    case 1:
                        cyb cybVar2 = (cyb) obj;
                        zv8[] zv8VarArr2 = RegistrationAvatarScreen.q;
                        cybVar2.setId(R.id.oneme_login_neuro_avatars_continue_enabled_btn);
                        cybVar2.setText(np4.q(registrationAvatarScreen.getContext(), R.string.oneme_login_neuro_avatars_continue_button));
                        cybVar2.setAppearance(zxb.PRIMARY);
                        cybVar2.setSize(ayb.g);
                        break;
                    default:
                        zv8[] zv8VarArr3 = RegistrationAvatarScreen.q;
                        registrationAvatarScreen.getRouter().D();
                        break;
                }
                return sbiVar;
            }
        }));
        wf4Var.addView(rccVar);
        TextView textView = new TextView(wf4Var.getContext());
        textView.setId(R.id.oneme_login_neuro_avatars_title);
        final int i4 = 0;
        textView.setLayoutParams(new uf4(0, -2));
        textView.setGravity(17);
        textView.setText(o1().k.a);
        q9i.a(q9i.c, textView);
        n1g.N(new xc9(i, lq4Var, 14), textView);
        wf4Var.addView(textView);
        kwb kwbVar = new kwb(wf4Var.getContext());
        kwbVar.setId(R.id.oneme_login_neuro_avatars_avatar);
        kwbVar.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 120.0f), gm0.K(yl5.d().getDisplayMetrics().density * 120.0f)));
        kwbVar.setCloseBadgeClickListener(new qge(this, 3));
        kwbVar.setOnImageLoadedListener(new qge(this, 4));
        kwb.y(kwbVar, (nge) this.p.getValue(), null, null, null, 6);
        kwbVar.setAvatarShape(awb.a);
        wf4Var.addView(kwbVar);
        TextView textView2 = new TextView(wf4Var.getContext());
        textView2.setId(R.id.oneme_login_neuro_avatars_pick_image_text);
        textView2.setLayoutParams(new uf4(0, -2));
        textView2.setGravity(17);
        textView2.setText(R.string.oneme_registration_neuro_avatars_choose_photo);
        q9i.a(q9i.h, textView2);
        n1g.N(new xc9(i, lq4Var, 13), textView2);
        wf4Var.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(wf4Var.getContext());
        frameLayout.setId(R.id.oneme_login_neuro_avatars_button_background);
        frameLayout.setLayoutParams(new uf4(0, -2));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, ((nac) pq3.j.h(frameLayout).k().r.b).a));
        frameLayout.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0);
        lvb.G(frameLayout);
        oj ojVar = new oj(frameLayout.getContext());
        ojVar.setId(R.id.oneme_login_neuro_avatars_continue_btn);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        ojVar.setLayoutParams(layoutParams);
        ojVar.setupDisabledButton(new cf7(this) { // from class: pge
            public final /* synthetic */ RegistrationAvatarScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i5 = i4;
                sbi sbiVar = sbi.a;
                RegistrationAvatarScreen registrationAvatarScreen = this.b;
                switch (i5) {
                    case 0:
                        cyb cybVar = (cyb) obj;
                        zv8[] zv8VarArr = RegistrationAvatarScreen.q;
                        cybVar.setId(R.id.oneme_login_neuro_avatars_continue_disabled_btn);
                        cybVar.setText(np4.q(registrationAvatarScreen.getContext(), R.string.oneme_login_input_continue));
                        cybVar.setTextColor(Integer.valueOf(R.attr.text_primary));
                        cybVar.setAppearance(zxb.SECONDARY);
                        cybVar.setSize(ayb.g);
                        break;
                    case 1:
                        cyb cybVar2 = (cyb) obj;
                        zv8[] zv8VarArr2 = RegistrationAvatarScreen.q;
                        cybVar2.setId(R.id.oneme_login_neuro_avatars_continue_enabled_btn);
                        cybVar2.setText(np4.q(registrationAvatarScreen.getContext(), R.string.oneme_login_neuro_avatars_continue_button));
                        cybVar2.setAppearance(zxb.PRIMARY);
                        cybVar2.setSize(ayb.g);
                        break;
                    default:
                        zv8[] zv8VarArr3 = RegistrationAvatarScreen.q;
                        registrationAvatarScreen.getRouter().D();
                        break;
                }
                return sbiVar;
            }
        });
        ojVar.setupActiveButton(new cf7(this) { // from class: pge
            public final /* synthetic */ RegistrationAvatarScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i5 = i2;
                sbi sbiVar = sbi.a;
                RegistrationAvatarScreen registrationAvatarScreen = this.b;
                switch (i5) {
                    case 0:
                        cyb cybVar = (cyb) obj;
                        zv8[] zv8VarArr = RegistrationAvatarScreen.q;
                        cybVar.setId(R.id.oneme_login_neuro_avatars_continue_disabled_btn);
                        cybVar.setText(np4.q(registrationAvatarScreen.getContext(), R.string.oneme_login_input_continue));
                        cybVar.setTextColor(Integer.valueOf(R.attr.text_primary));
                        cybVar.setAppearance(zxb.SECONDARY);
                        cybVar.setSize(ayb.g);
                        break;
                    case 1:
                        cyb cybVar2 = (cyb) obj;
                        zv8[] zv8VarArr2 = RegistrationAvatarScreen.q;
                        cybVar2.setId(R.id.oneme_login_neuro_avatars_continue_enabled_btn);
                        cybVar2.setText(np4.q(registrationAvatarScreen.getContext(), R.string.oneme_login_neuro_avatars_continue_button));
                        cybVar2.setAppearance(zxb.PRIMARY);
                        cybVar2.setSize(ayb.g);
                        break;
                    default:
                        zv8[] zv8VarArr3 = RegistrationAvatarScreen.q;
                        registrationAvatarScreen.getRouter().D();
                        break;
                }
                return sbiVar;
            }
        });
        frameLayout.addView(ojVar);
        n1g.N(new qb3(3, null, 10), frameLayout);
        wf4Var.addView(frameLayout);
        eg4 eg4VarH = ch3.h(wf4Var);
        int id = rccVar.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 7, 0, 7);
        int id2 = textView.getId();
        eg4VarH.d(id2, 3, rccVar.getId(), 4);
        qt4.w(24.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id2));
        eg4VarH.d(id2, 6, 0, 6);
        qt4.w(28.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id2));
        eg4VarH.d(id2, 7, 0, 7);
        new bsb(7, eg4VarH, id2).a(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f));
        int id3 = kwbVar.getId();
        eg4VarH.d(id3, 3, 0, 3);
        eg4VarH.d(id3, 6, 0, 6);
        eg4VarH.d(id3, 7, 0, 7);
        eg4VarH.d(id3, 4, textView2.getId(), 3);
        eg4VarH.g(id3).d.W = 2;
        int id4 = textView2.getId();
        eg4VarH.d(id4, 3, kwbVar.getId(), 4);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id4));
        eg4VarH.d(id4, 6, 0, 6);
        qt4.w(28.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id4));
        eg4VarH.d(id4, 7, 0, 7);
        new bsb(7, eg4VarH, id4).a(gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.d(id4, 4, frameLayout.getId(), 3);
        new bsb(4, eg4VarH, id4).a(gm0.K(48.0f * yl5.d().getDisplayMetrics().density));
        int id5 = frameLayout.getId();
        eg4VarH.d(id5, 4, 0, 4);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(4, eg4VarH, id5));
        eg4VarH.d(id5, 6, 0, 6);
        eg4VarH.d(id5, 7, 0, 7);
        eg4VarH.a(wf4Var);
        return wf4Var;
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((wsc) this.k.getValue()).c(strArr)) {
            o1().J();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        zv8[] zv8VarArr = q;
        final int i = 0;
        zv8 zv8Var = zv8VarArr[0];
        j8e j8eVar = this.f;
        kwb kwbVar = (kwb) j8eVar.m(this, zv8Var);
        g19 viewLifecycleOwner = getViewLifecycleOwner();
        r8e r8eVar = o1().l;
        nge ngeVar = (nge) this.p.getValue();
        i19 i19VarF = viewLifecycleOwner.f();
        n09 n09Var = n09.d;
        int i2 = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new m34(2, null, kwbVar, ngeVar, null, null), i2), tre.d0(viewLifecycleOwner));
        lzf lzfVar = o1().j;
        final int i3 = 2;
        if (lzfVar != null) {
            e9i.j0(new fz6(n1g.v(lzfVar, getViewLifecycleOwner().f(), n09Var), new rge(null, this, 2), i2), getViewLifecycleScope());
        }
        e9i.j0(new fz6(n1g.v(o1().i, getViewLifecycleOwner().f(), n09Var), new rge(null, this, 3), i2), getViewLifecycleScope());
        final int i4 = 1;
        e9i.j0(new fz6(n1g.v(o1().c.k, getViewLifecycleOwner().f(), n09Var), new rge(null, this, 1), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().l, getViewLifecycleOwner().f(), n09Var), new rge(null, this, 0), i2), getViewLifecycleScope());
        qe7.H((cyb) this.h.m(this, zv8VarArr[2]), 300L, new View.OnClickListener(this) { // from class: oge
            public final /* synthetic */ RegistrationAvatarScreen b;

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
                int i5 = i;
                RegistrationAvatarScreen registrationAvatarScreen = this.b;
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr2 = RegistrationAvatarScreen.q;
                        registrationAvatarScreen.p1(true);
                        registrationAvatarScreen.o1().F();
                        break;
                    case 1:
                        zv8[] zv8VarArr3 = RegistrationAvatarScreen.q;
                        registrationAvatarScreen.p1(true);
                        registrationAvatarScreen.o1().F();
                        break;
                    default:
                        zv8[] zv8VarArr4 = RegistrationAvatarScreen.q;
                        vv vvVar = registrationAvatarScreen.m;
                        zv8 zv8Var2 = RegistrationAvatarScreen.q[5];
                        if (((xge) vvVar.a(registrationAvatarScreen)) != null) {
                            List listD = registrationAvatarScreen.o1().D();
                            jc4 jc4VarC = p.c(R.string.oneme_login_neuro_avatars_bottomsheet_title, null, null, 6);
                            ListIterator listIterator = ((c79) listD).listIterator(0);
                            while (true) {
                                b79 b79Var = (b79) listIterator;
                                if (!b79Var.hasNext()) {
                                    zv8[] zv8VarArr5 = BottomSheetWidget.t;
                                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(registrationAvatarScreen);
                                    confirmationBottomSheetF.setTargetController(registrationAvatarScreen);
                                    br4 parentController = registrationAvatarScreen;
                                    while (parentController.getParentController() != null) {
                                        parentController = parentController.getParentController();
                                    }
                                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
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
                }
            }
        });
        qe7.H((cyb) this.i.m(this, zv8VarArr[3]), 300L, new View.OnClickListener(this) { // from class: oge
            public final /* synthetic */ RegistrationAvatarScreen b;

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
                int i5 = i4;
                RegistrationAvatarScreen registrationAvatarScreen = this.b;
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr2 = RegistrationAvatarScreen.q;
                        registrationAvatarScreen.p1(true);
                        registrationAvatarScreen.o1().F();
                        break;
                    case 1:
                        zv8[] zv8VarArr3 = RegistrationAvatarScreen.q;
                        registrationAvatarScreen.p1(true);
                        registrationAvatarScreen.o1().F();
                        break;
                    default:
                        zv8[] zv8VarArr4 = RegistrationAvatarScreen.q;
                        vv vvVar = registrationAvatarScreen.m;
                        zv8 zv8Var2 = RegistrationAvatarScreen.q[5];
                        if (((xge) vvVar.a(registrationAvatarScreen)) != null) {
                            List listD = registrationAvatarScreen.o1().D();
                            jc4 jc4VarC = p.c(R.string.oneme_login_neuro_avatars_bottomsheet_title, null, null, 6);
                            ListIterator listIterator = ((c79) listD).listIterator(0);
                            while (true) {
                                b79 b79Var = (b79) listIterator;
                                if (!b79Var.hasNext()) {
                                    zv8[] zv8VarArr5 = BottomSheetWidget.t;
                                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(registrationAvatarScreen);
                                    confirmationBottomSheetF.setTargetController(registrationAvatarScreen);
                                    br4 parentController = registrationAvatarScreen;
                                    while (parentController.getParentController() != null) {
                                        parentController = parentController.getParentController();
                                    }
                                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
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
                }
            }
        });
        qe7.H((kwb) j8eVar.m(this, zv8VarArr[0]), 300L, new View.OnClickListener(this) { // from class: oge
            public final /* synthetic */ RegistrationAvatarScreen b;

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
                int i5 = i3;
                RegistrationAvatarScreen registrationAvatarScreen = this.b;
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr2 = RegistrationAvatarScreen.q;
                        registrationAvatarScreen.p1(true);
                        registrationAvatarScreen.o1().F();
                        break;
                    case 1:
                        zv8[] zv8VarArr3 = RegistrationAvatarScreen.q;
                        registrationAvatarScreen.p1(true);
                        registrationAvatarScreen.o1().F();
                        break;
                    default:
                        zv8[] zv8VarArr4 = RegistrationAvatarScreen.q;
                        vv vvVar = registrationAvatarScreen.m;
                        zv8 zv8Var2 = RegistrationAvatarScreen.q[5];
                        if (((xge) vvVar.a(registrationAvatarScreen)) != null) {
                            List listD = registrationAvatarScreen.o1().D();
                            jc4 jc4VarC = p.c(R.string.oneme_login_neuro_avatars_bottomsheet_title, null, null, 6);
                            ListIterator listIterator = ((c79) listD).listIterator(0);
                            while (true) {
                                b79 b79Var = (b79) listIterator;
                                if (!b79Var.hasNext()) {
                                    zv8[] zv8VarArr5 = BottomSheetWidget.t;
                                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(registrationAvatarScreen);
                                    confirmationBottomSheetF.setTargetController(registrationAvatarScreen);
                                    br4 parentController = registrationAvatarScreen;
                                    while (parentController.getParentController() != null) {
                                        parentController = parentController.getParentController();
                                    }
                                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
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
                }
            }
        });
    }

    public final void p1(boolean z) {
        zv8[] zv8VarArr = q;
        zv8 zv8Var = zv8VarArr[2];
        j8e j8eVar = this.h;
        boolean z2 = !z;
        ((cyb) j8eVar.m(this, zv8Var)).setClickable(z2);
        ((cyb) j8eVar.m(this, zv8VarArr[2])).setLoading(z);
        zv8 zv8Var2 = zv8VarArr[3];
        j8e j8eVar2 = this.i;
        ((cyb) j8eVar2.m(this, zv8Var2)).setClickable(z2);
        ((cyb) j8eVar2.m(this, zv8VarArr[3])).setLoading(z);
    }

    @Override // defpackage.j1a
    public final void q(String str, RectF rectF, Rect rect) {
        xeb xebVarO1 = o1();
        dq4 dq4Var = xebVarO1.b;
        qdb qdbVar = xebVarO1.c;
        yab.i0(dq4Var, ((n0c) ((xhh) qdbVar.i.getValue())).b(), 0, new pdb(qdbVar, str, rect, rectF, 2, null), 2);
    }

    public RegistrationAvatarScreen(xge xgeVar, fgd fgdVar, t3f t3fVar) {
        this(n1g.i(new ylc("registration_data_args", xgeVar), new ylc("avatars_args", fgdVar), new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
