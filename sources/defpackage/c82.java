package defpackage;

import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

/* JADX INFO: loaded from: classes3.dex */
public final class c82 implements CallsAudioManager.DisabledAudioDeviceUsagePolicy {
    @Override // ru.ok.android.externcalls.sdk.audio.CallsAudioManager.DisabledAudioDeviceUsagePolicy
    public final boolean isAvailableForAutoSelect(CallsAudioManager.AudioDeviceType audioDeviceType) {
        return audioDeviceType == CallsAudioManager.AudioDeviceType.BLUETOOTH;
    }
}
