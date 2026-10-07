package ru.ok.android.externcalls.sdk.video.internal;

import defpackage.jc1;
import defpackage.n8b;
import defpackage.o91;
import defpackage.oh1;
import defpackage.p8b;
import defpackage.zq1;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/video/internal/ScreenCaptureManagerImpl;", "Lru/ok/android/externcalls/sdk/video/ScreenCaptureManager;", "Lo91;", "call", "<init>", "(Lo91;)V", "", "enabled", "isFastScreenShareEnabled", "Lsbi;", "setScreenCaptureEnabled", "(ZZ)V", "setAudioCaptureEnabled", "(Z)V", "Lo91;", "isScreenCaptureEnabled", "()Z", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ScreenCaptureManagerImpl implements ScreenCaptureManager {
    private final o91 call;

    public ScreenCaptureManagerImpl(o91 o91Var) {
        this.call = o91Var;
    }

    @Override // ru.ok.android.externcalls.sdk.video.ScreenCaptureManager
    public boolean isScreenCaptureEnabled() {
        return this.call.t0.b;
    }

    @Override // ru.ok.android.externcalls.sdk.video.ScreenCaptureManager
    public void setAudioCaptureEnabled(boolean enabled) {
        this.call.J(enabled);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    @Override // ru.ok.android.externcalls.sdk.video.ScreenCaptureManager
    public void setScreenCaptureEnabled(boolean enabled, boolean isFastScreenShareEnabled) {
        p8b p8bVar;
        o91 o91Var = this.call;
        if (o91Var.q() && o91Var.q()) {
            zq1 zq1Var = o91Var.F0;
            zq1Var.getClass();
            if (enabled) {
                if (zq1.d(new jc1(0, 12, n8b.class, zq1Var.i, "screenshareState", "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;"))) {
                    p8bVar = o91Var.t0;
                    if (p8bVar.b != enabled) {
                        p8bVar.b = enabled;
                        p8bVar.c = isFastScreenShareEnabled;
                        p8bVar.a();
                        o91Var.I();
                        o91Var.n(oh1.e, null);
                    }
                    o91Var.A();
                }
            } else {
                p8bVar = o91Var.t0;
                if (p8bVar.b != enabled) {
                    p8bVar.b = enabled;
                    p8bVar.c = isFastScreenShareEnabled;
                    p8bVar.a();
                    o91Var.I();
                    o91Var.n(oh1.e, null);
                }
                o91Var.A();
            }
        }
        if (enabled) {
            return;
        }
        o91Var.J(false);
    }
}
