package defpackage;

import android.app.Notification;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class u5a extends emb {
    public final k2a e;
    public int[] f;

    public u5a(k2a k2aVar) {
        this.e = k2aVar;
    }

    @Override // defpackage.emb
    public final void b(vyh vyhVar) {
        Notification.Builder builder = (Notification.Builder) vyhVar.d;
        Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
        k2a k2aVar = this.e;
        Notification.MediaStyle mediaSession = mediaStyle.setMediaSession(((q2a) k2aVar.a.h.m.b).c.b);
        int[] iArr = this.f;
        if (iArr != null) {
            mediaSession.setShowActionsInCompactView(iArr);
        }
        builder.setStyle(mediaSession);
        Bundle bundle = new Bundle();
        bundle.putBundle("androidx.media3.session", k2aVar.a.j.b());
        builder.addExtras(bundle);
    }

    public final void d(int... iArr) {
        this.f = iArr;
    }
}
