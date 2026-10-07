package defpackage;

import one.me.login.avatar.RegistrationAvatarScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qge implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RegistrationAvatarScreen b;

    public /* synthetic */ qge(RegistrationAvatarScreen registrationAvatarScreen, int i) {
        this.a = i;
        this.b = registrationAvatarScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        int i2 = 0;
        RegistrationAvatarScreen registrationAvatarScreen = this.b;
        switch (i) {
            case 0:
                eeb eebVar = (eeb) registrationAvatarScreen.d.getAccessor().c(813);
                vv vvVar = registrationAvatarScreen.n;
                zv8 zv8Var = RegistrationAvatarScreen.q[6];
                return new deb((fgd) vvVar.a(registrationAvatarScreen), eebVar.a, eebVar.b);
            case 1:
                yeb yebVar = (yeb) registrationAvatarScreen.d.getAccessor().c(812);
                vv vvVar2 = registrationAvatarScreen.m;
                zv8 zv8Var2 = RegistrationAvatarScreen.q[5];
                return yebVar.a(null, (xge) vvVar2.a(registrationAvatarScreen), new ifh(new qge(registrationAvatarScreen, i2)));
            case 2:
                zv8[] zv8VarArr = RegistrationAvatarScreen.q;
                return new nge(registrationAvatarScreen.getContext());
            case 3:
                zv8[] zv8VarArr2 = RegistrationAvatarScreen.q;
                registrationAvatarScreen.o1().B();
                return sbiVar;
            default:
                zv8[] zv8VarArr3 = RegistrationAvatarScreen.q;
                ((kwb) registrationAvatarScreen.f.m(registrationAvatarScreen, RegistrationAvatarScreen.q[0])).setCloseBadgeVisibility(registrationAvatarScreen.o1().E());
                return sbiVar;
        }
    }
}
