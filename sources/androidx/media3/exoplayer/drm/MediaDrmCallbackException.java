package androidx.media3.exoplayer.drm;

import android.net.Uri;
import defpackage.a35;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaDrmCallbackException extends IOException {
    public final a35 a;
    public final Uri b;
    public final Map c;
    public final long d;

    public MediaDrmCallbackException(a35 a35Var, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.a = a35Var;
        this.b = uri;
        this.c = map;
        this.d = j;
    }
}
