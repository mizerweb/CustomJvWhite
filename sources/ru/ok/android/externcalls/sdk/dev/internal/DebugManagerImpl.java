package ru.ok.android.externcalls.sdk.dev.internal;

import defpackage.bkg;
import defpackage.cf7;
import defpackage.gi2;
import defpackage.j95;
import defpackage.o91;
import defpackage.t81;
import defpackage.wpc;
import defpackage.y3e;
import defpackage.y81;
import defpackage.yig;
import defpackage.zu4;
import defpackage.zzf;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.dev.DebugManager;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 42\u00020\u0001:\u00014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u001a\u00100\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ok/android/externcalls/sdk/dev/internal/DebugManagerImpl;", "Lru/ok/android/externcalls/sdk/dev/DebugManager;", "Lo91;", "underlyingCall", "Ly3e;", "log", "Lwpc;", "peerVideoSettingsAdapter", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "<init>", "(Lo91;Ly3e;Lwpc;Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;)V", "", "error", "Lsbi;", "reportError", "(Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lgi2;", "updater", "updateCameraToggles", "(Lcf7;)V", "", "dumpPath", "enableFullAudioDump", "(Ljava/lang/String;)V", "Lbkg;", "listener", "", "period", "Ljava/util/concurrent/TimeUnit;", "unit", "registerStatListener", "(Lbkg;ILjava/util/concurrent/TimeUnit;)V", "removeStatListener", "(Lbkg;)V", "Lru/ok/android/externcalls/sdk/dev/DebugManager$VideoSettingsOverride;", "videoSettingsOverride", "setVideoSettingsOverride", "(Lru/ok/android/externcalls/sdk/dev/DebugManager$VideoSettingsOverride;)V", "getCurrentVideoSettingsOverride", "()Lru/ok/android/externcalls/sdk/dev/DebugManager$VideoSettingsOverride;", "Lo91;", "getUnderlyingCall", "()Lo91;", "Ly3e;", "Lwpc;", "Lru/ok/android/externcalls/sdk/dev/internal/MediaDumpManagerImpl;", "mediaDumpManager", "Lru/ok/android/externcalls/sdk/dev/internal/MediaDumpManagerImpl;", "getMediaDumpManager", "()Lru/ok/android/externcalls/sdk/dev/internal/MediaDumpManagerImpl;", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DebugManagerImpl implements DebugManager {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "DebugManager";
    private final y3e log;
    private final MediaDumpManagerImpl mediaDumpManager;
    private final wpc peerVideoSettingsAdapter;
    private final o91 underlyingCall;

    public DebugManagerImpl(o91 o91Var, y3e y3eVar, wpc wpcVar, SignalingProvider signalingProvider) {
        this.underlyingCall = o91Var;
        this.log = y3eVar;
        this.peerVideoSettingsAdapter = wpcVar;
        this.mediaDumpManager = new MediaDumpManagerImpl(getUnderlyingCall(), signalingProvider);
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void enableFullAudioDump(String dumpPath) {
        o91 underlyingCall = getUnderlyingCall();
        zzf zzfVar = underlyingCall.e0;
        if (zzfVar == null) {
            return;
        }
        int i = 0;
        zzfVar.a(new y81(underlyingCall, i, dumpPath), new t81(i));
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public DebugManager.VideoSettingsOverride getCurrentVideoSettingsOverride() {
        wpc wpcVar = this.peerVideoSettingsAdapter;
        return new DebugManager.VideoSettingsOverride(wpcVar.a, wpcVar.b);
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public o91 getUnderlyingCall() {
        return this.underlyingCall;
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void registerStatListener(bkg listener, int period, TimeUnit unit) {
        getUnderlyingCall().L0.a(listener, period, unit);
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void removeStatListener(bkg listener) {
        yig yigVar = getUnderlyingCall().L0;
        yigVar.getClass();
        yigVar.i.remove(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void reportError(Throwable error) {
        this.log.reportException(LOG_TAG, "error", error);
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void setVideoSettingsOverride(DebugManager.VideoSettingsOverride videoSettingsOverride) {
        this.peerVideoSettingsAdapter.b = videoSettingsOverride.getMaxDimension();
        this.peerVideoSettingsAdapter.a = videoSettingsOverride.getIsMaxDimensionOverrideEnabled();
        getUnderlyingCall().A();
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public void updateCameraToggles(cf7 updater) {
        zu4 zu4Var = (zu4) getUnderlyingCall().g0.h;
        synchronized (zu4Var.a) {
            zu4Var.b = (gi2) updater.invoke((gi2) zu4Var.b);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/dev/internal/DebugManagerImpl$Companion;", "", "<init>", "()V", "LOG_TAG", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }

    @Override // ru.ok.android.externcalls.sdk.dev.DebugManager
    public MediaDumpManagerImpl getMediaDumpManager() {
        return this.mediaDumpManager;
    }
}
