package defpackage;

import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class w6f {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[CallsAudioManager.AudioDeviceType.values().length];
        try {
            iArr[CallsAudioManager.AudioDeviceType.EARPIECE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CallsAudioManager.AudioDeviceType.SPEAKER_PHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CallsAudioManager.AudioDeviceType.BLUETOOTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CallsAudioManager.AudioDeviceType.WIRED_HEADSET.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[qt4.H(5).length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[4] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
