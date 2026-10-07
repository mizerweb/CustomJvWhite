package defpackage;

import ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oie implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RemoteSettingsShared b;

    public /* synthetic */ oie(RemoteSettingsShared remoteSettingsShared, int i) {
        this.a = i;
        this.b = remoteSettingsShared;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        RemoteSettingsShared remoteSettingsShared = this.b;
        switch (i) {
            case 0:
                RemoteSettingsShared.scheduleCreateNewSettings$lambda$0$0(remoteSettingsShared);
                break;
            default:
                RemoteSettingsShared._init_$lambda$0(remoteSettingsShared);
                break;
        }
    }
}
