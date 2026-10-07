package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class q2a {
    public final MediaSession a;
    public final p2a b;
    public final u2a c;
    public final Bundle e;
    public x2d g;
    public List h;
    public d0a i;
    public int j;
    public int k;
    public o2a l;
    public p3a m;
    public final Object d = new Object();
    public final RemoteCallbackList f = new RemoteCallbackList();

    public q2a(Context context, String str, Bundle bundle) {
        MediaSession mediaSessionA = a(context, str, bundle);
        this.a = mediaSessionA;
        p2a p2aVar = new p2a(this);
        this.b = p2aVar;
        this.c = new u2a(mediaSessionA.getSessionToken(), p2aVar);
        this.e = bundle;
        mediaSessionA.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public p3a b() {
        p3a p3aVar;
        synchronized (this.d) {
            p3aVar = this.m;
        }
        return p3aVar;
    }

    public void c(p3a p3aVar) {
        synchronized (this.d) {
            this.m = p3aVar;
        }
    }
}
