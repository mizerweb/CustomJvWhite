package defpackage;

import android.media.MediaCodec;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class l86 implements t76 {
    public final Object a = new Object();
    public Surface b;
    public final /* synthetic */ m86 c;

    public l86(m86 m86Var) {
        this.c = m86Var;
    }

    public final Surface a() {
        Surface surface;
        synchronized (this.a) {
            try {
                if (this.b == null) {
                    this.b = MediaCodec.createPersistentInputSurface();
                }
                surface = this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return surface;
    }
}
