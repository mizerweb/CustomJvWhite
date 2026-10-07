package defpackage;

import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x6f {
    public static final a80 a(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        int i = w6f.$EnumSwitchMapping$0[callsAudioDeviceInfo.getDeviceType().ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                    }
                }
            }
        }
        return new a80(i2, callsAudioDeviceInfo.getName(), p.m(i2));
    }
}
