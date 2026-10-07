package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class hc0 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ dc9 a;

    public hc0(dc9 dc9Var) {
        this.a = dc9Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        ((ic0) this.a.d).i.f(-1, new p51(11));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        ((ic0) this.a.d).i.f(-1, new p51(12));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        ((ic0) this.a.d).i.f(-1, new p51(11));
    }
}
