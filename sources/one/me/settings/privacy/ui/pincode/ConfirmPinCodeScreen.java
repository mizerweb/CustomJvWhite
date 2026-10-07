package one.me.settings.privacy.ui.pincode;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a0d;
import defpackage.c9;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fj3;
import defpackage.fz6;
import defpackage.ha9;
import defpackage.i19;
import defpackage.j8e;
import defpackage.jz;
import defpackage.ks6;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.sb4;
import defpackage.tb4;
import defpackage.tre;
import defpackage.vb4;
import defpackage.vv;
import defpackage.y3f;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/settings/privacy/ui/pincode/ConfirmPinCodeScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "hash", "Lha9;", "localAccountId", "(Ljava/lang/String;Lha9;)V", "settings-privacy"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConfirmPinCodeScreen extends Widget {
    public static final /* synthetic */ zv8[] f = {new dwd(ConfirmPinCodeScreen.class, "hash", "getHash()Ljava/lang/String;", 0), zo5.f(zfe.a, ConfirmPinCodeScreen.class, "pinCodeView", "getPinCodeView()Lone/me/settings/privacy/ui/pincode/PinCodeView;", 0)};
    public final vv a;
    public final ny8 b;
    public final ks6 c;
    public final oi8 d;
    public final j8e e;

    public ConfirmPinCodeScreen(Bundle bundle) {
        super(bundle);
        this.a = new vv("confirm_pin_code:hash", String.class);
        this.b = createViewModelLazy(vb4.class, new fj3(6, new sb4(this, 1)));
        this.c = tre.F(this, y3f.SETTINGS_PRIVACY_ACCEPT_PINCODE);
        this.d = oi8.f;
        this.e = viewBinding(R.id.oneme_settings_privacy_setup_pin_code_root_view);
    }

    public static final a0d o1(ConfirmPinCodeScreen confirmPinCodeScreen) {
        return (a0d) confirmPinCodeScreen.e.m(confirmPinCodeScreen, f[1]);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getD() {
        return this.d;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.c;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a0d a0dVar = new a0d(viewGroup.getContext());
        a0dVar.setId(R.id.oneme_settings_privacy_setup_pin_code_root_view);
        a0dVar.setListener((vb4) this.b.getValue());
        a0dVar.setTitle(R.string.oneme_settings_privacy_onboarding_re_enter_pin_code);
        a0dVar.setLocked(true);
        a0dVar.setOnBackPress(new sb4(this, 0));
        return a0dVar;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ny8 ny8Var = this.b;
        jz jzVar = ((vb4) ny8Var.getValue()).i;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(jzVar, i19VarF, n09Var), new tb4(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((vb4) ny8Var.getValue()).l, getViewLifecycleOwner().f(), n09Var), new c9(2, null, 8), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((vb4) ny8Var.getValue()).k, getViewLifecycleOwner().f(), n09Var), new tb4(null, this, 1), 3), getViewLifecycleScope());
    }

    public ConfirmPinCodeScreen(String str, ha9 ha9Var) {
        this(n1g.i(new ylc("confirm_pin_code:hash", str), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
