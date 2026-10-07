package defpackage;

import one.me.settings.ringtone.ui.SettingRingtoneScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vpf implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingRingtoneScreen b;

    public /* synthetic */ vpf(SettingRingtoneScreen settingRingtoneScreen, int i) {
        this.a = i;
        this.b = settingRingtoneScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        SettingRingtoneScreen settingRingtoneScreen = this.b;
        switch (i) {
            case 0:
                wtc wtcVar = settingRingtoneScreen.c;
                return new ymb(wtcVar.getAccessor().d(161), wtcVar.getAccessor().d(162));
            default:
                wtc wtcVar2 = settingRingtoneScreen.c;
                ifh ifhVarD = wtcVar2.getAccessor().d(23);
                wtcVar2.getAccessor().getClass();
                return new xpf(ifhVarD, wtcVar2.getAccessor().d(179), wtcVar2.getAccessor().d(7), wtcVar2.getAccessor().d(367), (ymb) settingRingtoneScreen.d.getValue(), wtcVar2.getAccessor().d(236), (lqe) wtcVar2.getAccessor().c(366));
        }
    }
}
