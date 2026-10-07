package defpackage;

import one.me.settings.devices.SettingsDevicesScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jrf implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsDevicesScreen b;

    public /* synthetic */ jrf(SettingsDevicesScreen settingsDevicesScreen, int i) {
        this.a = i;
        this.b = settingsDevicesScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        SettingsDevicesScreen settingsDevicesScreen = this.b;
        switch (i) {
            case 0:
                wtc wtcVar = settingsDevicesScreen.c;
                rrf rrfVar = (rrf) wtcVar.getAccessor().c(807);
                kpf kpfVar = new kpf(wtcVar.getAccessor().d(116), (xhh) settingsDevicesScreen.f.getValue());
                cmf cmfVar = new cmf(wtcVar.getAccessor().d(85), 6, new jrf(settingsDevicesScreen, 1));
                rrfVar.getClass();
                return new qrf(kpfVar, cmfVar, rrfVar.a, rrfVar.b, rrfVar.c, rrfVar.d, rrfVar.e, rrfVar.f, rrfVar.g);
            default:
                return settingsDevicesScreen.getContext();
        }
    }
}
