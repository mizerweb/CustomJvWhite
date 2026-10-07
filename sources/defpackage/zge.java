package defpackage;

import one.me.login.neuroavatars.RegistrationNeuroAvatarsScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zge implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RegistrationNeuroAvatarsScreen b;

    public /* synthetic */ zge(RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen, int i) {
        this.a = i;
        this.b = registrationNeuroAvatarsScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = RegistrationNeuroAvatarsScreen.u;
                return registrationNeuroAvatarsScreen.p1() != null ? y3f.AUTH_AVATARS : y3f.SETTINGS_PROFILE_AVATARS;
            case 1:
                zv8[] zv8VarArr2 = RegistrationNeuroAvatarsScreen.u;
                ((kwb) registrationNeuroAvatarsScreen.g.m(registrationNeuroAvatarsScreen, RegistrationNeuroAvatarsScreen.u[0])).setCloseBadgeVisibility(registrationNeuroAvatarsScreen.q1().E());
                return sbiVar;
            case 2:
                eeb eebVar = (eeb) registrationNeuroAvatarsScreen.e.getAccessor().c(813);
                vv vvVar = registrationNeuroAvatarsScreen.r;
                zv8 zv8Var = RegistrationNeuroAvatarsScreen.u[9];
                return new deb((fgd) vvVar.a(registrationNeuroAvatarsScreen), eebVar.a, eebVar.b);
            case 3:
                zv8[] zv8VarArr3 = RegistrationNeuroAvatarsScreen.u;
                return registrationNeuroAvatarsScreen.p1() != null ? new lmc(null, 0, null, null, 1L, null, 111) : lmc.h;
            case 4:
                yeb yebVar = (yeb) registrationNeuroAvatarsScreen.e.getAccessor().c(812);
                vv vvVar2 = registrationNeuroAvatarsScreen.q;
                zv8 zv8Var2 = RegistrationNeuroAvatarsScreen.u[8];
                return yebVar.a((Long) vvVar2.a(registrationNeuroAvatarsScreen), registrationNeuroAvatarsScreen.p1(), new ifh(new zge(registrationNeuroAvatarsScreen, 2)));
            case 5:
                zv8[] zv8VarArr4 = RegistrationNeuroAvatarsScreen.u;
                return new ydb(registrationNeuroAvatarsScreen.getContext());
            default:
                zv8[] zv8VarArr5 = RegistrationNeuroAvatarsScreen.u;
                registrationNeuroAvatarsScreen.q1().B();
                return sbiVar;
        }
    }
}
