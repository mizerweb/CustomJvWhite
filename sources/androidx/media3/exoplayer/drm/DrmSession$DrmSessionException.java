package androidx.media3.exoplayer.drm;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class DrmSession$DrmSessionException extends IOException {
    public final int a;

    public DrmSession$DrmSessionException(int i, Throwable th) {
        super(th);
        this.a = i;
    }
}
