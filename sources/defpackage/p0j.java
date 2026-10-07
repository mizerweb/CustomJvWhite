package defpackage;

import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.view.Surface;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class p0j implements SurfaceTexture.OnFrameAvailableListener {
    public final boolean a;
    public final /* synthetic */ t0j b;

    public p0j(t0j t0jVar, boolean z) {
        this.b = t0jVar;
        this.a = z;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) throws IOException {
        t0j t0jVar = this.b;
        if (surfaceTexture == null) {
            gm0.Y(t0jVar.a, "onFrameAvailable, surface texture is null!");
            return;
        }
        if (t0jVar.k || t0jVar.b.get()) {
            gm0.Y(this.b.a, "onFrameAvailable, called in released state");
            return;
        }
        t0j t0jVar2 = this.b;
        h1j h1jVar = t0jVar2.j;
        if (h1jVar == null) {
            ore.p("Required value was null.");
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (Map.Entry entry : t0jVar2.g.entrySet()) {
            cch cchVar = (cch) entry.getKey();
            Surface surface = (Surface) entry.getValue();
            int i = cchVar.c;
            if (i == 34) {
                if (!z2) {
                    surfaceTexture.updateTexImage();
                    surfaceTexture.getTransformMatrix(t0jVar2.h);
                    z2 = true;
                }
                cchVar.y(t0jVar2.i, t0jVar2.h, true);
                try {
                    h1jVar.v(surfaceTexture, surface, t0jVar2.i, this.a);
                    z = true;
                } catch (RuntimeException e) {
                    gm0.V(t0jVar2.a, "failed to render with GL renderer", e);
                }
            } else {
                gm0.Y(t0jVar2.a, "onFrameAvailable, unsupported format=" + i + " for surfaceOutput=" + cchVar);
            }
        }
        if (z) {
            t0j t0jVar3 = this.b;
            if (t0jVar3.m) {
                return;
            }
            t0jVar3.m = true;
            String str = t0jVar3.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    q0j q0jVar = t0jVar3.c;
                    q0jVar.getClass();
                    a4cVar.c(je9Var, str, nbh.s(SystemClock.elapsedRealtime() - q0jVar.c, "notifyFirstFrameRendered, in ", " ms after video message processor started"), null);
                }
            }
            for (u0j u0jVar : t0jVar3.f) {
                u0jVar.b.post(new f4g(23, u0jVar.a));
            }
        }
    }
}
