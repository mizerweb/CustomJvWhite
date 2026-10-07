package defpackage;

import one.me.settings.twofa.creation.onboarding.TwoFAOnboardingScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u7i implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoFAOnboardingScreen b;

    public /* synthetic */ u7i(TwoFAOnboardingScreen twoFAOnboardingScreen, int i) {
        this.a = i;
        this.b = twoFAOnboardingScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        TwoFAOnboardingScreen twoFAOnboardingScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = TwoFAOnboardingScreen.g;
                int iOrdinal = twoFAOnboardingScreen.p1().ordinal();
                if (iOrdinal == 0) {
                    return y3f.AUTH_2FA_START;
                }
                if (iOrdinal == 1) {
                    return y3f.AUTH_2FA_SUCCESS;
                }
                ore.o();
                return null;
            default:
                y7i y7iVar = (y7i) twoFAOnboardingScreen.a.getAccessor().c(394);
                return new x7i(twoFAOnboardingScreen.p1(), y7iVar.a, y7iVar.b);
        }
    }
}
