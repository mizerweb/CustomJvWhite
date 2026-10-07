package ru.ok.android.externcalls.sdk.audio.internal.impl3;

import defpackage.cf7;
import defpackage.fg7;
import defpackage.sbi;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class CallsAudioManagerV3Impl$deviceSwitchHelper$1 extends fg7 implements cf7 {
    public CallsAudioManagerV3Impl$deviceSwitchHelper$1(Object obj) {
        super(1, 0, CallsAudioManagerV3Impl.class, obj, "selectAudioDeviceImpl", "selectAudioDeviceImpl(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;)V");
    }

    @Override // defpackage.cf7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CallsAudioDeviceInfo) obj);
        return sbi.a;
    }

    public final void invoke(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        ((CallsAudioManagerV3Impl) this.receiver).selectAudioDeviceImpl(callsAudioDeviceInfo);
    }
}
