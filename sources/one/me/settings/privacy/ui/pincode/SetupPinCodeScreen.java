package one.me.settings.privacy.ui.pincode;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a0d;
import defpackage.c9;
import defpackage.d4f;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.ha9;
import defpackage.ize;
import defpackage.jz;
import defpackage.ks6;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nwf;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.tre;
import defpackage.xre;
import defpackage.y3f;
import defpackage.ylc;
import defpackage.ztd;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/settings/privacy/ui/pincode/SetupPinCodeScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "settings-privacy"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SetupPinCodeScreen extends Widget {
    public final ny8 a;
    public final ks6 b;
    public final oi8 c;

    public SetupPinCodeScreen(Bundle bundle) {
        super(bundle);
        this.a = createViewModelLazy(nwf.class, new ztd(28, new ize(20, this)));
        this.b = tre.F(this, y3f.SETTINGS_PRIVACY_NEW_PINCODE);
        this.c = oi8.f;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getC() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.b;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a0d a0dVar = new a0d(viewGroup.getContext());
        a0dVar.setId(R.id.oneme_settings_privacy_setup_pin_code_root_view);
        a0dVar.setListener((nwf) this.a.getValue());
        a0dVar.setTitle(R.string.oneme_settings_privacy_onboarding_come_up_pin_code);
        a0dVar.setLocked(false);
        a0dVar.setOnBackPress(new xre(a0dVar, 11, this));
        return a0dVar;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        e9i.j0(new fz6(n1g.v(new jz(((nwf) this.a.getValue()).f, 13), getViewLifecycleOwner().f(), n09.d), new c9(2, null, 20), 3), getViewLifecycleScope());
    }

    public SetupPinCodeScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
