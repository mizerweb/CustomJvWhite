package ru.ok.android.externcalls.sdk.video.internal;

import defpackage.af7;
import defpackage.eg2;
import defpackage.j95;
import defpackage.o91;
import defpackage.szf;
import defpackage.yde;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ok/android/externcalls/sdk/video/internal/CameraManagerImpl;", "Lru/ok/android/externcalls/sdk/video/CameraManager;", "Lo91;", "call", "Lkotlin/Function0;", "", "isPrepared", "isEarlyVideoEnabled", "<init>", "(Lo91;Laf7;Z)V", "Leg2;", "cameraParams", "Lsbi;", "switchCamera", "(Leg2;)V", "Lo91;", "Laf7;", "Z", "isCapturingFromFrontCamera", "()Z", "", "getNumberOfCameras", "()I", "numberOfCameras", SdkMetricStatEvent.VALUE_KEY, "isCameraEnabled", "setCameraEnabled", "(Z)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CameraManagerImpl implements CameraManager {
    private final o91 call;
    private final boolean isEarlyVideoEnabled;
    private final af7 isPrepared;

    public CameraManagerImpl(o91 o91Var, af7 af7Var, boolean z) {
        this.call = o91Var;
        this.isPrepared = af7Var;
        this.isEarlyVideoEnabled = z;
    }

    @Override // ru.ok.android.externcalls.sdk.video.CameraManager
    public int getNumberOfCameras() {
        return this.call.H;
    }

    @Override // ru.ok.android.externcalls.sdk.video.CameraManager
    public boolean isCameraEnabled() {
        return this.call.t0.f;
    }

    @Override // ru.ok.android.externcalls.sdk.video.CameraManager
    public boolean isCapturingFromFrontCamera() {
        return this.call.f0.c() == 1;
    }

    @Override // ru.ok.android.externcalls.sdk.video.CameraManager
    public void setCameraEnabled(boolean z) {
        if (this.isEarlyVideoEnabled || ((Boolean) this.isPrepared.invoke()).booleanValue()) {
            o91 o91Var = this.call;
            if (o91Var.q()) {
                o91Var.p(z);
                o91Var.I();
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.CameraManager
    public void switchCamera(eg2 cameraParams) {
        o91 o91Var = this.call;
        if (o91Var.q() && o91Var.h0.d) {
            o91Var.N.log("OKRTCCall", "switchCamera");
            szf szfVar = o91Var.f0;
            szfVar.k.log("SlmsSource", "switchCamera");
            szfVar.c.a.execute(new yde(szfVar, 17, cameraParams));
        }
    }

    public /* synthetic */ CameraManagerImpl(o91 o91Var, af7 af7Var, boolean z, int i, j95 j95Var) {
        this(o91Var, af7Var, (i & 4) != 0 ? false : z);
    }
}
