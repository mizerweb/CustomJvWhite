package defpackage;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class n1e implements p86 {
    public static final HashMap f;
    public final p86 c;
    public final nf2 d;
    public final s2e e;

    static {
        HashMap map = new HashMap();
        f = map;
        map.put(1, pi0.j);
        map.put(8, pi0.h);
        map.put(6, pi0.g);
        map.put(5, pi0.f);
        map.put(4, pi0.e);
        map.put(0, pi0.i);
    }

    public n1e(p86 p86Var, nf2 nf2Var, s2e s2eVar) {
        this.c = p86Var;
        this.d = nf2Var;
        this.e = s2eVar;
    }

    @Override // defpackage.p86
    public final boolean a(int i) {
        if (!this.c.a(i)) {
            return false;
        }
        pi0 pi0Var = (pi0) f.get(Integer.valueOf(i));
        if (pi0Var == null) {
            return true;
        }
        for (VideoQualityQuirk videoQualityQuirk : this.e.c(VideoQualityQuirk.class)) {
            if (videoQualityQuirk != null && videoQualityQuirk.c(this.d, pi0Var) && (!(videoQualityQuirk instanceof SurfaceProcessingQuirk) || !((SurfaceProcessingQuirk) videoQualityQuirk).d())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.p86
    public final r86 b(int i) {
        if (a(i)) {
            return this.c.b(i);
        }
        return null;
    }
}
