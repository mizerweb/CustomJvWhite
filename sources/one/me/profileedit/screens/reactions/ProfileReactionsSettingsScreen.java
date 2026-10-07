package one.me.profileedit.screens.reactions;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import defpackage.a3;
import defpackage.a8d;
import defpackage.a8g;
import defpackage.aeb;
import defpackage.aql;
import defpackage.atf;
import defpackage.ayb;
import defpackage.bs0;
import defpackage.bsb;
import defpackage.btd;
import defpackage.ch3;
import defpackage.ci5;
import defpackage.col;
import defpackage.ctd;
import defpackage.cyb;
import defpackage.d97;
import defpackage.dc;
import defpackage.dsc;
import defpackage.dvc;
import defpackage.dwd;
import defpackage.e30;
import defpackage.e8c;
import defpackage.e9i;
import defpackage.eg4;
import defpackage.ez9;
import defpackage.fz6;
import defpackage.g6c;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.hta;
import defpackage.hve;
import defpackage.i19;
import defpackage.j11;
import defpackage.j8e;
import defpackage.jc4;
import defpackage.jtd;
import defpackage.jz;
import defpackage.k9d;
import defpackage.ksf;
import defpackage.kz9;
import defpackage.la3;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.lve;
import defpackage.m6c;
import defpackage.mc4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.noh;
import defpackage.np4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.osf;
import defpackage.p;
import defpackage.p7d;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qt4;
import defpackage.qz9;
import defpackage.r6c;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.sb8;
import defpackage.t3f;
import defpackage.tnh;
import defpackage.tp2;
import defpackage.uf3;
import defpackage.uw8;
import defpackage.vbd;
import defpackage.vt3;
import defpackage.wa3;
import defpackage.wbc;
import defpackage.wf4;
import defpackage.wtc;
import defpackage.xva;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yp4;
import defpackage.z4f;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0011²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lone/me/profileedit/screens/reactions/ProfileReactionsSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Lz4f;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lha9;", "localAccountId", "(JLha9;)V", "Landroid/widget/FrameLayout;", "loadingContainer", "Lr1c;", "loadingErrorView", "profile-edit"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProfileReactionsSettingsScreen extends Widget implements mc4, z4f {
    public static final /* synthetic */ zv8[] p = {new dwd(ProfileReactionsSettingsScreen.class, "mediaKeyboardContainer", "getMediaKeyboardContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), zo5.f(zfe.a, ProfileReactionsSettingsScreen.class, "mediaKeyboardRouter", "getMediaKeyboardRouter()Lcom/bluelinelabs/conductor/Router;", 0), new dwd(ProfileReactionsSettingsScreen.class, "linearLayout", "getLinearLayout()Landroid/widget/LinearLayout;", 0), new dwd(ProfileReactionsSettingsScreen.class, "contentScrollView", "getContentScrollView()Landroid/widget/ScrollView;", 0), new dwd(ProfileReactionsSettingsScreen.class, "addedReactionsEditText", "getAddedReactionsEditText()Lone/me/profileedit/screens/reactions/AddedReactionsEditText;", 0), new dwd(ProfileReactionsSettingsScreen.class, "saveBtn", "getSaveBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public static final oi8 q = new oi8(0, 4, 0, new j11(4, 3, false), 5);
    public final oi8 a;
    public final t3f b;
    public final vt3 c;
    public final wtc d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final j8e h;
    public final j8e i;
    public kz9 j;
    public final j8e k;
    public final j8e l;
    public final j8e m;
    public final j8e n;
    public final ny8 o;

    public ProfileReactionsSettingsScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.e;
        this.b = new t3f("ProfileReactionsSettingsScreen", super.getB().b());
        this.c = new vt3(3, this);
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.d = wtcVar;
        this.e = createViewModelLazy(jtd.class, new hta(27, new k9d(this, 13, bundle)));
        this.f = wtcVar.getAccessor().d(79);
        ny8 ny8VarCreateViewModelLazy = createViewModelLazy(ez9.class, new hta(28, new a8d(15, this)));
        this.g = ny8VarCreateViewModelLazy;
        this.h = viewBinding(R.id.profile_edit_reactions_settings_media_keyboard_container);
        this.i = Widget.childRouter$default(this, R.id.profile_edit_reactions_settings_media_keyboard_container, null, 2, null);
        this.k = viewBinding(R.id.profile_edit_reactions_settings_linear_layout);
        this.l = viewBinding(R.id.profile_edit_reactions_settings_scrollview);
        this.m = viewBinding(R.id.profile_edit_reactions_settings_added_reactions);
        this.n = viewBinding(R.id.profile_edit_reactions_settings_save);
        this.o = wtcVar.getAccessor().d(316);
        p1();
    }

    @Override // defpackage.z4f
    public final Integer L() {
        return Integer.valueOf(pq3.j.e(getContext()).m().b().b);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        ((cyb) this.n.m(this, p[5])).setVisibility(8);
        q1();
        if (i == R.id.profile_edit_reactions_settings_save_and_exit) {
            p1().F();
        } else if (i == R.id.profile_edit_reactions_settings_exit_without_save) {
            getRouter().D();
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getB() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [br4] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // defpackage.br4
    public final boolean handleBack() {
        Object value = p1().o.a.getValue();
        la3 la3Var = value instanceof la3 ? (la3) value : null;
        if (la3Var == null || !la3Var.f) {
            q1();
            return super.handleBack();
        }
        zv8[] zv8VarArr = BottomSheetWidget.t;
        jc4 jc4VarC = p.c(R.string.profile_edit_reactions_settings_to_save_changes, null, null, 6);
        jc4VarC.d(R.id.profile_edit_reactions_settings_save_and_exit, new tnh(R.string.to_save));
        jc4VarC.b(R.id.profile_edit_reactions_settings_exit_without_save, new tnh(R.string.profile_edit_reactions_settings_to_exit_without_save));
        ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(this);
        confirmationBottomSheetF.setTargetController(this);
        ?? parentController = this;
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
        return true;
    }

    @Override // defpackage.z4f
    public final boolean l0() {
        return pq3.j.e(getContext()).n();
    }

    public final LinearLayout o1() {
        return (LinearLayout) this.k.m(this, p[2]);
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        getRouter().a(this.c);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        rcc rccVar = new rcc(getContext());
        rccVar.setId(R.id.profile_edit_reactions_settings_toolbar);
        rccVar.setForm(gcc.Compact);
        rccVar.setTitle(R.string.profile_edit_reactions_settings_toolbar_title);
        rccVar.setLeftActions(new wbc(new p7d(9, this)));
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = yl5.d().getDisplayMetrics().density * 16.0f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        Context context = getContext();
        a8g a8gVar = pq3.j;
        sb8.m0(a8gVar.e(context).m().b().f, shapeDrawable);
        atf atfVar = new atf(getContext());
        atfVar.setId(R.id.profile_edit_reactions_settings_activation_switch);
        atfVar.setMinimumHeight(gm0.K(yl5.d().getDisplayMetrics().density * 56.0f));
        atfVar.setBackground(shapeDrawable);
        atfVar.setStartView(null);
        atfVar.setTitle(atfVar.getContext().getString(R.string.profile_edit_reactions_settings_switcher_title));
        atfVar.setEndView(new ksf(true, true));
        atfVar.setOnSwitchListener(new xva(23, this));
        atfVar.onThemeChanged(a8gVar.e(atfVar.getContext()).m());
        TextView textView = new TextView(getContext());
        textView.setId(R.id.profile_edit_reactions_settings_slider_title);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView.setText(np4.q(textView.getContext(), R.string.profile_edit_reactions_settings_slider_title));
        q9i.a(q9i.k.g(), textView);
        textView.setTextColor(a8gVar.h(textView).getText().d);
        TextView textView2 = new TextView(getContext());
        textView2.setId(R.id.profile_edit_reactions_settings_count_slider_min_value);
        textView2.setText("1");
        noh nohVar = q9i.i;
        textView2.setTextColor(p.d(textView2, nohVar, a8gVar, textView2).e);
        TextView textView3 = new TextView(getContext());
        textView3.setId(R.id.profile_edit_reactions_settings_count_slider_current_value);
        textView3.setTextColor(p.d(textView3, q9i.e, a8gVar, textView3).b);
        TextView textView4 = new TextView(getContext());
        textView4.setId(R.id.profile_edit_reactions_settings_count_slider_max_value);
        textView4.setText(String.valueOf(p1().C().b));
        q9i.a(nohVar, textView4);
        textView4.setTextColor(a8gVar.h(textView4).getText().e);
        e8c e8cVar = new e8c(getContext());
        e8cVar.setId(R.id.profile_edit_reactions_settings_count_slider);
        e8cVar.p = false;
        e8cVar.setValueFrom(1.0f);
        e8cVar.setValueTo(p1().C().b);
        e8cVar.setStepSize(1.0f);
        e8cVar.v.add(new dvc(1, this));
        float[] fArr2 = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr2[i2] = yl5.d().getDisplayMetrics().density * 16.0f;
        }
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr2, null, null));
        sb8.m0(a8gVar.e(getContext()).m().b().f, shapeDrawable2);
        wf4 wf4Var = new wf4(getContext());
        wf4Var.setId(R.id.profile_edit_reactions_settings_slider_container);
        wf4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        wf4Var.setMinHeight(gm0.K(100.0f * yl5.d().getDisplayMetrics().density));
        wf4Var.setBackground(shapeDrawable2);
        wf4Var.addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        wf4Var.addView(textView3, new ViewGroup.LayoutParams(-2, -2));
        wf4Var.addView(textView4, new ViewGroup.LayoutParams(-2, -2));
        wf4Var.addView(e8cVar, new ViewGroup.LayoutParams(-1, -2));
        eg4 eg4VarH = ch3.h(wf4Var);
        int id = textView3.getId();
        eg4VarH.d(id, 3, 0, 3);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id));
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 7, 0, 7);
        int id2 = textView2.getId();
        eg4VarH.d(id2, 3, textView3.getId(), 3);
        eg4VarH.d(id2, 4, textView3.getId(), 4);
        eg4VarH.d(id2, 6, 0, 6);
        new bsb(6, eg4VarH, id2).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id3 = textView4.getId();
        eg4VarH.d(id3, 3, textView3.getId(), 3);
        eg4VarH.d(id3, 4, textView3.getId(), 4);
        eg4VarH.d(id3, 7, 0, 7);
        new bsb(7, eg4VarH, id3).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id4 = e8cVar.getId();
        eg4VarH.d(id4, 4, 0, 4);
        eg4VarH.d(id4, 6, 0, 6);
        eg4VarH.d(id4, 7, 0, 7);
        eg4VarH.a(wf4Var);
        TextView textView5 = new TextView(getContext());
        textView5.setId(R.id.profile_edit_reactions_settings_added_reactions_title);
        textView5.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView5.setText(np4.q(textView5.getContext(), R.string.profile_edit_reactions_settings_added_reactions_title));
        q9i.a(q9i.k.g(), textView5);
        textView5.setTextColor(a8gVar.h(textView5).getText().d);
        float[] fArr3 = new float[8];
        int i3 = 0;
        for (int i4 = 8; i3 < i4; i4 = 8) {
            fArr3[i3] = yl5.d().getDisplayMetrics().density * 16.0f;
            i3++;
        }
        ShapeDrawable shapeDrawable3 = new ShapeDrawable(new RoundRectShape(fArr3, null, null));
        sb8.m0(a8gVar.e(getContext()).m().b().f, shapeDrawable3);
        dc dcVar = new dc(getContext());
        dcVar.setId(R.id.profile_edit_reactions_settings_added_reactions);
        dcVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        dcVar.setBackground(shapeDrawable3);
        dcVar.setOnFocusChangeListener(new ci5(1, this));
        dcVar.addTextChangedListener(new a3(8, this));
        float[] fArr4 = new float[8];
        int i5 = 0;
        for (int i6 = 8; i5 < i6; i6 = 8) {
            fArr4[i5] = yl5.d().getDisplayMetrics().density * 16.0f;
            i5++;
        }
        ShapeDrawable shapeDrawable4 = new ShapeDrawable(new RoundRectShape(fArr4, null, null));
        sb8.m0(a8gVar.e(getContext()).m().b().f, shapeDrawable4);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(R.id.profile_edit_reactions_settings_loading_reactions_container);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setBackground(shapeDrawable4);
        frameLayout.setPaddingRelative(0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        r6c r6cVar = new r6c(frameLayout.getContext());
        r6cVar.setAppearance(g6c.a);
        r6cVar.setSize(m6c.a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        r6cVar.setLayoutParams(layoutParams);
        frameLayout.addView(r6cVar);
        float[] fArr5 = new float[8];
        int i7 = 0;
        for (int i8 = 8; i7 < i8; i8 = 8) {
            fArr5[i7] = yl5.d().getDisplayMetrics().density * 16.0f;
            i7++;
        }
        ShapeDrawable shapeDrawable5 = new ShapeDrawable(new RoundRectShape(fArr5, null, null));
        sb8.m0(a8gVar.e(getContext()).m().b().f, shapeDrawable5);
        int i9 = ((bs0) a8gVar.e(getContext()).m().u().c.g).c;
        float[] fArr6 = new float[8];
        int i10 = 0;
        for (int i11 = 8; i10 < i11; i11 = 8) {
            fArr6[i10] = yl5.d().getDisplayMetrics().density * 16.0f;
            i10++;
        }
        RippleDrawable rippleDrawableB = col.b(i9, shapeDrawable5, new ShapeDrawable(new RoundRectShape(fArr6, null, null)));
        atf atfVar2 = new atf(getContext());
        atfVar2.setId(R.id.profile_edit_reactions_settings_to_default_settings);
        atfVar2.setMinimumHeight(gm0.K(yl5.d().getDisplayMetrics().density * 56.0f));
        atfVar2.setBackground(rippleDrawableB);
        atfVar2.setStartView(aql.a(R.drawable.icon_change_camera));
        atfVar2.setTitle(atfVar2.getContext().getString(R.string.profile_edit_reactions_settings_to_default_settings));
        atfVar2.setType(osf.d);
        qe7.H(atfVar2, 300L, new aeb(atfVar2, 11, this));
        cyb cybVar = new cyb(getContext());
        cybVar.setId(R.id.profile_edit_reactions_settings_save);
        cybVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setSize(ayb.g);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.to_save));
        qe7.H(cybVar, 300L, new aeb(cybVar, 12, this));
        wf4 wf4Var2 = new wf4(getContext());
        wf4Var2.setId(R.id.profile_edit_reactions_settings_constraint_layout);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        wf4Var2.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        wf4Var2.setLayoutParams(layoutParams2);
        wf4Var2.addView(atfVar);
        wf4Var2.addView(textView);
        wf4Var2.addView(wf4Var);
        wf4Var2.addView(textView5);
        wf4Var2.addView(dcVar);
        wf4Var2.addView(frameLayout);
        wf4Var2.addView(atfVar2);
        wf4Var2.addView(cybVar);
        eg4 eg4VarH2 = ch3.h(wf4Var2);
        int id5 = atfVar.getId();
        eg4VarH2.d(id5, 3, 0, 3);
        eg4VarH2.d(id5, 6, 0, 6);
        eg4VarH2.d(id5, 7, 0, 7);
        int id6 = textView.getId();
        eg4VarH2.d(id6, 3, atfVar.getId(), 4);
        new bsb(3, eg4VarH2, id6).a(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f) + gm0.K(yl5.d().getDisplayMetrics().density * 4.0f));
        eg4VarH2.d(id6, 6, 0, 6);
        new bsb(6, eg4VarH2, id6).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id7 = wf4Var.getId();
        eg4VarH2.d(id7, 3, textView.getId(), 4);
        new bsb(3, eg4VarH2, id7).a(gm0.K(yl5.d().getDisplayMetrics().density * 7.0f));
        int id8 = textView5.getId();
        eg4VarH2.d(id8, 3, wf4Var.getId(), 4);
        new bsb(3, eg4VarH2, id8).a(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f) + gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH2.d(id8, 6, 0, 6);
        new bsb(6, eg4VarH2, id8).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id9 = dcVar.getId();
        eg4VarH2.d(id9, 3, textView5.getId(), 4);
        qt4.w(7.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH2, id9));
        eg4VarH2.d(id9, 6, 0, 6);
        eg4VarH2.d(id9, 7, 0, 7);
        int id10 = frameLayout.getId();
        eg4VarH2.d(id10, 3, textView5.getId(), 4);
        qt4.w(7.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH2, id10));
        eg4VarH2.d(id10, 6, 0, 6);
        eg4VarH2.d(id10, 7, 0, 7);
        int id11 = atfVar2.getId();
        eg4VarH2.d(id11, 3, dcVar.getId(), 4);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH2, id11));
        eg4VarH2.d(id11, 6, 0, 6);
        eg4VarH2.d(id11, 7, 0, 7);
        int id12 = cybVar.getId();
        eg4VarH2.d(id12, 3, atfVar2.getId(), 4);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH2, id12));
        eg4VarH2.d(id12, 4, 0, 4);
        eg4VarH2.d(id12, 6, 0, 6);
        eg4VarH2.d(id12, 7, 0, 7);
        eg4VarH2.g(id12).d.x = 1.0f;
        eg4VarH2.a(wf4Var2);
        ny8 ny8VarP = rx8.P(3, new a8d(16, wf4Var2));
        ny8 ny8VarP2 = rx8.P(3, new k9d(wf4Var2, 12, this));
        jz jzVar = new jz(p1().o, 13);
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(jzVar, i19VarF, n09Var), new ctd(null, this, textView, wf4Var, textView5, dcVar, frameLayout, atfVar2, atfVar, textView3, wf4Var2, e8cVar, cybVar, ny8VarP, ny8VarP2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().p, getViewLifecycleOwner().f(), n09Var), new qz9((lq4) null, dcVar, 29), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((ez9) this.g.getValue()).f, getViewLifecycleOwner().f(), n09Var), new d97((lq4) null, dcVar, this, 23), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().l, getViewLifecycleOwner().f(), n09Var), new uf3((lq4) null, this, wf4Var2, cybVar), 3), getViewLifecycleScope());
        Context context2 = getContext();
        ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        frameLayout2.setLayoutParams(layoutParams3);
        Context context3 = frameLayout2.getContext();
        ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context3);
        linearLayout.setLayoutParams(layoutParams4);
        linearLayout.setId(R.id.profile_edit_reactions_settings_linear_layout);
        linearLayout.setOrientation(1);
        lvb.H(linearLayout, q, null);
        linearLayout.addView(rccVar);
        ScrollView scrollView = new ScrollView(linearLayout.getContext());
        scrollView.setId(R.id.profile_edit_reactions_settings_scrollview);
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        scrollView.setFillViewport(true);
        scrollView.addView(wf4Var2);
        linearLayout.addView(scrollView);
        n1g.N(new btd(textView, textView2, textView3, textView4, textView5, shapeDrawable, shapeDrawable2, shapeDrawable3, shapeDrawable4, shapeDrawable5, rippleDrawableB, this, null), linearLayout);
        frameLayout2.addView(linearLayout);
        View tp2Var = new tp2(frameLayout2.getContext());
        tp2Var.setId(R.id.profile_edit_reactions_settings_media_keyboard_container);
        n1g.N(new wa3(3, null, 1), tp2Var);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.gravity = 80;
        tp2Var.setLayoutParams(layoutParams5);
        int i12 = uw8.a;
        tp2Var.setTranslationY(uw8.a(tp2Var.getContext()));
        lvb.H(tp2Var, new oi8(0, 0, 0, new j11(5, 1, false), 7), null);
        frameLayout2.addView(tp2Var);
        return frameLayout2;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        kz9 kz9Var = this.j;
        if (kz9Var != null) {
            kz9Var.c();
        }
        this.j = null;
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        super.onDetach(view);
        getRouter().M(this.c);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        LinearLayout linearLayoutO1 = o1();
        zv8[] zv8VarArr = p;
        dc dcVar = (dc) this.m.m(this, zv8VarArr[4]);
        hve hveVar = (hve) this.i.m(this, zv8VarArr[1]);
        boolean z = false;
        tp2 tp2Var = (tp2) this.h.m(this, zv8VarArr[0]);
        vbd vbdVar = new vbd(25);
        if (((dsc) this.f.getValue()).b && Build.VERSION.SDK_INT >= 30) {
            z = true;
        }
        this.j = new kz9(hveVar, tp2Var, linearLayoutO1, vbdVar, z, getViewLifecycleScope(), false, null, null, new yp4(linearLayoutO1, 7), 1920);
        r8e r8eVar = ((ez9) this.g.getValue()).h;
        e9i.j0(new e30(new fz6(new jz(r8eVar, 13), new uf3(r8eVar, (lq4) null, dcVar, this), 3), 6), getViewLifecycleScope());
    }

    public final jtd p1() {
        return (jtd) this.e.getValue();
    }

    public final void q1() {
        kz9 kz9Var = this.j;
        if (kz9Var != null && kz9Var.o) {
            ((tp2) this.h.m(this, p[0])).setElevation(0.0f);
            r1(false);
        }
        kz9 kz9Var2 = this.j;
        if (kz9Var2 != null) {
            zv8[] zv8VarArr = kz9.p;
            kz9Var2.i(true);
        }
    }

    public final void r1(boolean z) {
        Window window;
        Activity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        a8g a8gVar = pq3.j;
        x0(window, null, Integer.valueOf(z ? a8gVar.e(getContext()).m().b().d : a8gVar.e(getContext()).m().b().b));
        window.getDecorView().requestApplyInsets();
    }

    @Override // defpackage.z4f
    /* JADX INFO: renamed from: v */
    public final int getA() {
        return 3;
    }

    public ProfileReactionsSettingsScreen(long j, ha9 ha9Var) {
        this(n1g.i(new ylc("id", Long.valueOf(j)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
