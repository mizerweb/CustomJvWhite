package one.me.login.inputname;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import defpackage.a8j;
import defpackage.ah8;
import defpackage.bk8;
import defpackage.bsb;
import defpackage.ca2;
import defpackage.ch3;
import defpackage.ch8;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.eg4;
import defpackage.eph;
import defpackage.ev;
import defpackage.f7;
import defpackage.fgd;
import defpackage.fh8;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.hsc;
import defpackage.hve;
import defpackage.i19;
import defpackage.j2g;
import defpackage.j8e;
import defpackage.jac;
import defpackage.jc4;
import defpackage.ks6;
import defpackage.ku6;
import defpackage.lq4;
import defpackage.ltb;
import defpackage.lve;
import defpackage.mc4;
import defpackage.mjg;
import defpackage.n09;
import defpackage.n1g;
import defpackage.np4;
import defpackage.nr2;
import defpackage.ny8;
import defpackage.of3;
import defpackage.oi8;
import defpackage.oj;
import defpackage.p;
import defpackage.pq3;
import defpackage.q38;
import defpackage.q9i;
import defpackage.qt4;
import defpackage.ra1;
import defpackage.rcc;
import defpackage.rx8;
import defpackage.t3f;
import defpackage.tnh;
import defpackage.tre;
import defpackage.uf4;
import defpackage.vnh;
import defpackage.vv;
import defpackage.wbc;
import defpackage.wf4;
import defpackage.wg9;
import defpackage.xga;
import defpackage.yg8;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zg8;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import kotlin.collections.a;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB)\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0007\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/login/inputname/InputNameScreen;", "Lone/me/sdk/arch/Widget;", "", "Lhsc;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.KEY_TOKEN, "phone", "Lfgd;", "presetAvatars", "Lt3f;", "scopeId", "(Ljava/lang/String;Ljava/lang/String;Lfgd;Lt3f;)V", "login"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InputNameScreen extends Widget implements hsc, mc4 {
    public static final /* synthetic */ zv8[] r = {new dwd(InputNameScreen.class, ApiProtocol.KEY_TOKEN, "getToken()Ljava/lang/String;", 0), zo5.f(zfe.a, InputNameScreen.class, "phone", "getPhone()Ljava/lang/String;", 0), new dwd(InputNameScreen.class, "nameInput", "getNameInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new dwd(InputNameScreen.class, "surnameInput", "getSurnameInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new dwd(InputNameScreen.class, "buttonsContainer", "getButtonsContainer()Lone/me/login/inputname/AnimatedOneMeButton;", 0), new z8b(InputNameScreen.class, "nameText", "getNameText()Ljava/lang/String;"), new z8b(InputNameScreen.class, "surnameText", "getSurnameText()Ljava/lang/String;")};
    public final /* synthetic */ ku6 a;
    public final vv b;
    public final vv c;
    public final ca2 d;
    public final ks6 e;
    public final oi8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final j8e m;
    public final j8e n;
    public final j8e o;
    public final vv p;
    public final vv q;

    public InputNameScreen(Bundle bundle) {
        super(bundle);
        this.a = new ku6(26);
        Class<String> cls = String.class;
        this.b = new vv("screen:input_name:token", cls);
        this.c = new vv("screen:input_name:phone", cls);
        ca2 ca2Var = new ca2(m35getAccountScopeuqN4xOY());
        this.d = ca2Var;
        this.e = tre.G(this, new q38(7));
        this.f = oi8.f;
        this.g = ca2Var.getAccessor().d(34);
        this.h = ca2Var.getAccessor().d(85);
        this.i = rx8.P(3, new yg8(this, 0));
        this.j = ca2Var.a();
        this.k = getSharedViewModel(getA(), wg9.class, null);
        this.l = createViewModelLazy(fh8.class, new ch8(0, new yg8(this, 1)));
        this.m = viewBinding(R.id.oneme_login_input_name);
        this.n = viewBinding(R.id.oneme_login_input_surname);
        this.o = viewBinding(R.id.oneme_login_input_name_btn_container);
        this.p = new vv(String.class, "", "screen:input_name:name");
        this.q = new vv(String.class, "", "screen:input_name:surname");
    }

    @Override // defpackage.hsc
    public final void Y0(boolean z) {
        mjg mjgVar = ((wg9) this.k.getValue()).e;
        Boolean bool = Boolean.FALSE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i == R.id.oneme_login_input_name_confirmation_return) {
            ((bk8) this.i.getValue()).a((2 & 1) != 0, false);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getF() {
        return this.f;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.e;
    }

    public final oj o1() {
        return (oj) this.o.m(this, r[4]);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        wf4 wf4Var = new wf4(getContext());
        wf4Var.setLayoutParams(new uf4(-1, -1));
        rcc rccVar = new rcc(wf4Var.getContext());
        rccVar.setId(R.id.oneme_login_input_name_toolbar);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new zg8(this, 0)));
        wf4Var.addView(rccVar);
        TextView textView = new TextView(wf4Var.getContext());
        textView.setId(R.id.oneme_login_input_name_title);
        textView.setLayoutParams(new uf4(-1, -2));
        textView.setGravity(17);
        q9i.a(q9i.c, textView);
        int i = 3;
        lq4 lq4Var = null;
        n1g.N(new f7(i, lq4Var, 20), textView);
        textView.setText(np4.q(getContext(), R.string.oneme_login_input_name_title));
        wf4Var.addView(textView);
        TextView textView2 = new TextView(wf4Var.getContext());
        textView2.setId(R.id.oneme_login_input_name_description);
        textView2.setLayoutParams(new uf4(-1, -2));
        textView2.setGravity(17);
        q9i.a(q9i.g, textView2);
        n1g.N(new f7(i, lq4Var, 21), textView2);
        textView2.setText(np4.q(getContext(), R.string.oneme_login_input_name_description));
        wf4Var.addView(textView2);
        jac jacVar = new jac(wf4Var.getContext());
        jacVar.setId(R.id.oneme_login_input_name);
        jacVar.setLayoutParams(new uf4(-1, -2));
        jacVar.setMinimumHeight(gm0.K(yl5.d().getDisplayMetrics().density * 76.0f));
        jacVar.setHint(np4.q(getContext(), R.string.oneme_login_input_name_hint_name));
        zv8 zv8Var = r[5];
        jacVar.setText((String) this.p.a(this));
        jacVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(60)});
        Integer numValueOf = Integer.valueOf(R.attr.button_secondary);
        jacVar.setBackgroundColorAttr(numValueOf);
        n1g.N(new of3(3, null, 1), jacVar);
        wf4Var.addView(jacVar);
        jac jacVar2 = new jac(wf4Var.getContext());
        jacVar2.setId(R.id.oneme_login_input_surname);
        jacVar2.setLayoutParams(new uf4(-1, -2));
        jacVar2.setBackgroundColorAttr(numValueOf);
        jacVar2.setMinimumHeight(gm0.K(76.0f * yl5.d().getDisplayMetrics().density));
        jacVar2.setHint(np4.q(getContext(), R.string.oneme_login_input_name_hint_surname));
        jacVar2.setText(r1());
        jacVar2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(60)});
        n1g.N(new of3(3, null, 2), jacVar2);
        wf4Var.addView(jacVar2);
        oj ojVar = new oj(wf4Var.getContext());
        ojVar.setId(R.id.oneme_login_input_name_btn_container);
        ojVar.setLayoutParams(new uf4(-1, -2));
        ojVar.setupDisabledButton(new zg8(this, 1));
        ojVar.setupActiveButton(new zg8(this, 2));
        wf4Var.addView(ojVar);
        eg4 eg4VarH = ch3.h(wf4Var);
        eg4VarH.d(R.id.oneme_login_input_name_toolbar, 6, 0, 6);
        eg4VarH.d(R.id.oneme_login_input_name_toolbar, 3, 0, 3);
        eg4VarH.d(R.id.oneme_login_input_name_toolbar, 7, 0, 7);
        eg4VarH.d(R.id.oneme_login_input_name_title, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, R.id.oneme_login_input_name_title));
        eg4VarH.d(R.id.oneme_login_input_name_title, 3, R.id.oneme_login_input_name_toolbar, 4);
        qt4.w(24.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, R.id.oneme_login_input_name_title));
        eg4VarH.d(R.id.oneme_login_input_name_title, 7, 0, 7);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, R.id.oneme_login_input_name_title));
        eg4VarH.d(R.id.oneme_login_input_name_description, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, R.id.oneme_login_input_name_description));
        eg4VarH.d(R.id.oneme_login_input_name_description, 3, R.id.oneme_login_input_name_title, 4);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, R.id.oneme_login_input_name_description));
        eg4VarH.d(R.id.oneme_login_input_name_description, 7, 0, 7);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, R.id.oneme_login_input_name_description));
        eg4VarH.d(R.id.oneme_login_input_name, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, R.id.oneme_login_input_name));
        eg4VarH.d(R.id.oneme_login_input_name, 3, R.id.oneme_login_input_name_description, 4);
        qt4.w(24.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, R.id.oneme_login_input_name));
        eg4VarH.d(R.id.oneme_login_input_name, 7, 0, 7);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, R.id.oneme_login_input_name));
        eg4VarH.d(R.id.oneme_login_input_surname, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, R.id.oneme_login_input_surname));
        eg4VarH.d(R.id.oneme_login_input_surname, 3, R.id.oneme_login_input_name, 4);
        qt4.w(8.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, R.id.oneme_login_input_surname));
        eg4VarH.d(R.id.oneme_login_input_surname, 7, 0, 7);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH, R.id.oneme_login_input_surname));
        eg4VarH.d(R.id.oneme_login_input_name_btn_container, 6, 0, 6);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, R.id.oneme_login_input_name_btn_container));
        eg4VarH.d(R.id.oneme_login_input_name_btn_container, 4, 0, 4);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(4, eg4VarH, R.id.oneme_login_input_name_btn_container));
        eg4VarH.d(R.id.oneme_login_input_name_btn_container, 7, 0, 7);
        new bsb(7, eg4VarH, R.id.oneme_login_input_name_btn_container).a(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.a(wf4Var);
        return wf4Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        q1().b.setOnFocusChangeListener(null);
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 156 || getView() == null) {
            return;
        }
        a8j.x(s1().i, j2g.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        lq4 lq4Var = null;
        eph ephVar = view instanceof eph ? (eph) view : null;
        if (ephVar != null) {
            ephVar.onThemeChanged(pq3.j.h(view));
        }
        int i = 2;
        o1().setActiveButtonClickListener(new yg8(this, 2));
        oj ojVarO1 = o1();
        zv8 zv8Var = r[5];
        int i2 = 0;
        ojVarO1.setEnabled(((String) this.p.a(this)).length() > 0);
        int i3 = 3;
        p1().k(new zg8(this, 3));
        q1().k(new zg8(this, 4));
        s1().B(r1(), q1().b.isFocused());
        q1().b.setOnFocusChangeListener(new xga(1, new zg8(this, 5)));
        ltb ltbVarH = getRouter().h();
        if (ltbVarH != null) {
            ltbVarH.a(getViewLifecycleOwner(), new ev(7, this));
        }
        nr2 nr2Var = s1().j;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(nr2Var, i19VarF, n09Var), new ah8(lq4Var, this, i), i3), getViewLifecycleScope());
        e9i.j0(new fz6(new ra1(10, n1g.v(s1().g, getViewLifecycleOwner().f(), n09Var)), new ah8(this, null), i3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((wg9) this.k.getValue()).f, getViewLifecycleOwner().f(), n09Var), new ah8(lq4Var, this, i2), i3), getViewLifecycleScope());
    }

    public final jac p1() {
        return (jac) this.m.m(this, r[2]);
    }

    public final jac q1() {
        return (jac) this.n.m(this, r[3]);
    }

    public final String r1() {
        zv8 zv8Var = r[6];
        return (String) this.q.a(this);
    }

    public final fh8 s1() {
        return (fh8) this.l.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [br4] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    public final void t1() {
        zv8[] zv8VarArr = BottomSheetWidget.t;
        jc4 jc4VarC = p.c(R.string.oneme_login_input_name_confirmation_title, null, null, 6);
        zv8 zv8Var = r[1];
        jc4VarC.g(new vnh(R.string.oneme_login_input_name_confirmation_description, a.n1(new Object[]{(String) this.c.a(this)})));
        jc4VarC.d(R.id.oneme_login_input_name_confirmation_cancel, new tnh(R.string.oneme_login_input_name_confirmation_cancel));
        jc4VarC.b(R.id.oneme_login_input_name_confirmation_return, new tnh(R.string.oneme_login_input_name_confirmation_return));
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
    }

    public InputNameScreen(String str, String str2, fgd fgdVar, t3f t3fVar) {
        this(n1g.i(new ylc("screen:input_name:token", str), new ylc("screen:input_name:phone", str2), new ylc("screen:input_name:avatars", fgdVar), new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
