package defpackage;

import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;

/* JADX INFO: loaded from: classes3.dex */
public final class rh1 implements g32 {
    public final /* synthetic */ njd a;
    public final /* synthetic */ ai1 b;

    public rh1(njd njdVar, ai1 ai1Var) {
        this.a = njdVar;
        this.b = ai1Var;
    }

    @Override // defpackage.g32, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        if (connectedInfo.isFirstConnection()) {
            return;
        }
        this.a.c(xg1.c);
    }

    @Override // defpackage.g32, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
        if (((x02) this.b.d.i.a.getValue()).n()) {
            gm0.n(rh1.class.getName(), "onMediaDisconnected: ignored, call is on hold");
        } else {
            this.a.c(yg1.c);
        }
    }
}
