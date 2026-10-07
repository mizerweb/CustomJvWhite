package ru.ok.android.externcalls.sdk.audio.internal.impl;

import defpackage.cf7;
import defpackage.fg7;
import defpackage.sbi;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class CallsAudioManagerV2Impl$deviceSwitchHelper$1 extends fg7 implements cf7 {
    public CallsAudioManagerV2Impl$deviceSwitchHelper$1(Object obj) {
        super(1, 0, CallsAudioManagerV2Impl.class, obj, "selectAudioDeviceImpl", "selectAudioDeviceImpl(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;)V");
    }

    @Override // defpackage.cf7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CallsAudioManager.AudioDeviceType) obj);
        return sbi.a;
    }

    public final void invoke(CallsAudioManager.AudioDeviceType audioDeviceType) {
        ((CallsAudioManagerV2Impl) this.receiver).selectAudioDeviceImpl(audioDeviceType);
    }
}
