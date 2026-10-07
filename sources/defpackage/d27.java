package defpackage;

import one.me.folders.edit.FolderEditScreen;
import one.me.settings.media.autosave.SettingsAutoSaveScreen;
import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;
import one.me.settings.twofa.creation.onboarding.TwoFAOnboardingScreen;
import one.me.settings.twofa.password.TwoFACheckPassScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d27 implements t65 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha9 b;
    public final /* synthetic */ String c;

    public /* synthetic */ d27(String str, ha9 ha9Var) {
        this.a = 1;
        this.b = ha9Var;
        this.c = str;
    }

    @Override // defpackage.t65
    public final Object t() {
        int i = this.a;
        ha9 ha9Var = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                return new FolderEditScreen(str, ha9Var);
            case 1:
                qf0.d.getClass();
                return new SettingsAutoSaveScreen(ha9Var, er3.E(str));
            case 2:
                return new ConfirmPinCodeScreen(str, ha9Var);
            case 3:
                return new TwoFAOnboardingScreen(str, ha9Var);
            default:
                return new TwoFACheckPassScreen("SETTINGS", null, this.b, new pk8(null, this.c, null, null, null, 29), 2, null);
        }
    }

    public /* synthetic */ d27(String str, ha9 ha9Var, int i) {
        this.a = i;
        this.c = str;
        this.b = ha9Var;
    }
}
