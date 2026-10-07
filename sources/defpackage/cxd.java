package defpackage;

import ru.ok.android.externcalls.sdk.audio.ProximityTracker;

/* JADX INFO: loaded from: classes3.dex */
public final class cxd implements ProximityTracker {
    public final ny8 a;

    public cxd(ny8 ny8Var) {
        this.a = ny8Var;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.ProximityTracker
    public final boolean getCanUseSpeaker() {
        return ((bxd) this.a.getValue()).f == null || !((bxd) this.a.getValue()).e;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.ProximityTracker
    public final void startTrackingProximity() {
        ((bxd) this.a.getValue()).a();
    }

    @Override // ru.ok.android.externcalls.sdk.audio.ProximityTracker
    public final void stopTrackingProximity() {
        ((bxd) this.a.getValue()).b();
    }
}
