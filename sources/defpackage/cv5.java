package defpackage;

import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;

/* JADX INFO: loaded from: classes2.dex */
public final class cv5 implements ev5 {
    @Override // defpackage.ev5
    public final xu5 a(av5 av5Var, b87 b87Var) {
        if (b87Var.r == null) {
            return null;
        }
        return new za6(new DrmSession$DrmSessionException(6001, new UnsupportedDrmException()));
    }

    @Override // defpackage.ev5
    public final void b(Looper looper, z3d z3dVar) {
    }

    @Override // defpackage.ev5
    public final int c(b87 b87Var) {
        return b87Var.r != null ? 1 : 0;
    }
}
