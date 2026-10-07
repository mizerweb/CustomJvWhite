package defpackage;

import android.media.session.MediaController;

/* JADX INFO: loaded from: classes2.dex */
public final class pu9 extends ft0 {
    public pu9(MediaController.TransportControls transportControls) {
        super(transportControls);
    }

    @Override // defpackage.ft0
    public final void C(float f) {
        if (f != 0.0f) {
            ((MediaController.TransportControls) this.a).setPlaybackSpeed(f);
        } else {
            ore.p("speed must not be zero");
        }
    }
}
