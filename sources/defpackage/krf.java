package defpackage;

import one.me.settings.devices.SettingsDevicesScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class krf implements qbf {
    public final /* synthetic */ SettingsDevicesScreen a;

    public /* synthetic */ krf(SettingsDevicesScreen settingsDevicesScreen) {
        this.a = settingsDevicesScreen;
    }

    @Override // defpackage.qbf
    public int e(int i) {
        k79 k79Var = (k79) this.a.j.F(i);
        orf orfVar = k79Var instanceof orf ? (orf) k79Var : null;
        if (orfVar != null) {
            return orfVar.a();
        }
        return 0;
    }
}
