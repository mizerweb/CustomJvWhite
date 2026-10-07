package one.me.settings.privacy.ui.pincode;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a0d;
import defpackage.ca6;
import defpackage.d4f;
import defpackage.da6;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ea6;
import defpackage.fj3;
import defpackage.fz6;
import defpackage.i19;
import defpackage.ic6;
import defpackage.j8e;
import defpackage.ks6;
import defpackage.ml9;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.tre;
import defpackage.y3f;
import defpackage.zfe;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lone/me/settings/privacy/ui/pincode/EnterPinCodeScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "one/me/settings/privacy/ui/SettingsPrivacyScreen", "settings-privacy"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EnterPinCodeScreen extends Widget {
    public static final /* synthetic */ zv8[] e;
    public final oi8 a;
    public final ks6 b;
    public final ny8 c;
    public final j8e d;

    static {
        dwd dwdVar = new dwd(EnterPinCodeScreen.class, "pinCodeView", "getPinCodeView()Lone/me/settings/privacy/ui/pincode/PinCodeView;", 0);
        zfe.a.getClass();
        e = new zv8[]{dwdVar};
    }

    public EnterPinCodeScreen() {
        super(null, 1, 0 == true ? 1 : 0);
        this.a = oi8.f;
        this.b = tre.F(this, y3f.SETTINGS_PRIVACY_INSERT_PINCODE);
        this.c = createViewModelLazy(ea6.class, new fj3(20, new ca6(this, 0)));
        this.d = viewBinding(R.id.oneme_settings_privacy_enter_pin_code_root);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.b;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a0d a0dVar = new a0d(viewGroup.getContext());
        a0dVar.setId(R.id.oneme_settings_privacy_enter_pin_code_root);
        a0dVar.setListener((ea6) this.c.getValue());
        a0dVar.setTitle(R.string.oneme_settings_privacy_enter_pin_code_title);
        a0dVar.setDescription(Integer.valueOf(R.string.oneme_settings_privacy_enter_pin_code_description));
        a0dVar.setLocked(true);
        a0dVar.setOnBackPress(new ca6(this, 1));
        a0dVar.setForgotPinCodeClickListener(new ca6(this, 2));
        return a0dVar;
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        ml9.d(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ny8 ny8Var = this.c;
        ic6 ic6Var = ((ea6) ny8Var.getValue()).f;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(ic6Var, i19VarF, n09Var), new da6(null, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((ea6) ny8Var.getValue()).g, getViewLifecycleOwner().f(), n09Var), new da6(null, this, 1), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((ea6) ny8Var.getValue()).h, getViewLifecycleOwner().f(), n09Var), new da6(null, this, 2), i), getViewLifecycleScope());
    }
}
