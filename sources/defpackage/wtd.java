package defpackage;

import one.me.profile.ProfileScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wtd implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileScreen b;

    public /* synthetic */ wtd(ProfileScreen profileScreen, int i) {
        this.a = i;
        this.b = profileScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ProfileScreen profileScreen = this.b;
        switch (i) {
            case 0:
                return vd7.o(profileScreen.d, new ifh(new wtd(profileScreen, 1)), profileScreen);
            default:
                ku8 ku8Var = ProfileScreen.B;
                return profileScreen.getRouter();
        }
    }
}
