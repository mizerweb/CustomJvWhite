package defpackage;

import one.me.settings.SettingsListScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ktf implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsListScreen b;

    public /* synthetic */ ktf(SettingsListScreen settingsListScreen, int i) {
        this.a = i;
        this.b = settingsListScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        SettingsListScreen settingsListScreen = this.b;
        switch (i) {
            case 0:
                cpf cpfVar = (cpf) settingsListScreen.d.getAccessor().c(904);
                cpfVar.getClass();
                return new bpf(cpfVar.a, cpfVar.b, cpfVar.c, cpfVar.d, cpfVar.e, cpfVar.f, cpfVar.g, cpfVar.h, cpfVar.i, cpfVar.j, cpfVar.k, cpfVar.l, cpfVar.m, cpfVar.n, cpfVar.o, cpfVar.p, cpfVar.q, cpfVar.r, cpfVar.s, cpfVar.t, cpfVar.u, cpfVar.v, cpfVar.w, cpfVar.x, cpfVar.y);
            case 1:
                return new uj4(settingsListScreen.d.getAccessor().d(97));
            default:
                zv8[] zv8VarArr = SettingsListScreen.r;
                return new h8c(settingsListScreen);
        }
    }
}
