package ru.ok.android.externcalls.sdk.audio.internal;

import defpackage.cf7;
import defpackage.o91;
import defpackage.occ;
import defpackage.thb;
import defpackage.uhb;
import defpackage.vhb;
import kotlin.Metadata;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager;
import ru.ok.android.externcalls.sdk.audio.internal.NoiseSuppressionManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J}\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001f\u001a\u00020\u00182\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0016\u0010$\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/NoiseSuppressionManagerImpl;", "Lru/ok/android/externcalls/sdk/audio/NoiseSuppressionManager;", "Lo91;", "call", "<init>", "(Lo91;)V", "", "serversideBasic", "serversideAnn", "clientsidePlatform", "clientsideAnn", "Lorg/webrtc/PeerConnectionFactory$EnhancerKind;", "enhancerKind", "", "filePath", "", "inputSampleRate", "outputSampleRate", "fallbackTimeLimitMillis", "fallbackStutterCountMillis", "fallbackTimeframeMillis", "logTimings", "Ljava/lang/Runnable;", "onNoiseSuppressorDisabledDueToStutter", "Lsbi;", "setNoiseSuppressorParams", "(ZZZZLorg/webrtc/PeerConnectionFactory$EnhancerKind;Ljava/lang/String;IIIIIZLjava/lang/Runnable;)V", "Lkotlin/Function1;", "Luhb;", "Lvhb;", "paramFun", "setNoiseSuppressionParams", "(Lcf7;)V", "Lo91;", "getNsActiveState", "()Lvhb;", "nsActiveState", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NoiseSuppressionManagerImpl implements NoiseSuppressionManager {
    private final o91 call;

    public NoiseSuppressionManagerImpl(o91 o91Var) {
        this.call = o91Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vhb setNoiseSuppressorParams$lambda$0(boolean z, boolean z2, boolean z3, boolean z4, PeerConnectionFactory.EnhancerKind enhancerKind, String str, int i, int i2, int i3, int i4, int i5, boolean z5, Runnable runnable, uhb uhbVar) {
        uhbVar.a = z;
        uhbVar.b = z2;
        uhbVar.c = z3;
        uhbVar.d = z4;
        uhbVar.f = enhancerKind;
        int i6 = enhancerKind == null ? -1 : thb.$EnumSwitchMapping$1[enhancerKind.ordinal()];
        int i7 = 1;
        if (i6 != 1) {
            i7 = 3;
            if (i6 != 2) {
                i7 = i6 != 3 ? 0 : 2;
            }
        }
        uhbVar.e = i7;
        uhbVar.g = str;
        uhbVar.h = i;
        uhbVar.i = i2;
        uhbVar.j = i3;
        uhbVar.k = i4;
        uhbVar.l = i5;
        uhbVar.m = z5;
        if (runnable != null) {
            uhbVar.n = new occ(0, runnable, Runnable.class, "run", "run()V", 0, 18);
        }
        return uhbVar.a();
    }

    @Override // ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager
    public vhb getNsActiveState() {
        return this.call.b;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager
    public void setNoiseSuppressionParams(cf7 paramFun) {
        this.call.M((vhb) paramFun.invoke(new uhb()));
    }

    @Override // ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager
    public void setNoiseSuppressorParams(final boolean serversideBasic, final boolean serversideAnn, final boolean clientsidePlatform, final boolean clientsideAnn, final PeerConnectionFactory.EnhancerKind enhancerKind, final String filePath, final int inputSampleRate, final int outputSampleRate, final int fallbackTimeLimitMillis, final int fallbackStutterCountMillis, final int fallbackTimeframeMillis, final boolean logTimings, final Runnable onNoiseSuppressorDisabledDueToStutter) {
        setNoiseSuppressionParams(new cf7() { // from class: shb
            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                return NoiseSuppressionManagerImpl.setNoiseSuppressorParams$lambda$0(serversideBasic, serversideAnn, clientsidePlatform, clientsideAnn, enhancerKind, filePath, inputSampleRate, outputSampleRate, fallbackTimeLimitMillis, fallbackStutterCountMillis, fallbackTimeframeMillis, logTimings, onNoiseSuppressorDisabledDueToStutter, (uhb) obj);
            }
        });
    }
}
