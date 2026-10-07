package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class fjd {
    public final Executor a;
    public li0 b;
    public yr8 c;
    public zo7 d;
    public so2 e;
    public dul f;
    public yr8 g;
    public xr8 h;
    public zpe i;
    public final s2e j;
    public final boolean k;

    public fjd(Executor executor, CameraCharacteristics cameraCharacteristics) {
        s2e s2eVar = rk5.a;
        if (rk5.a.b(LowMemoryQuirk.class) != null) {
            this.a = new eif(executor);
        } else {
            this.a = executor;
        }
        this.j = s2eVar;
        this.k = s2eVar.a(IncorrectJpegMetadataQuirk.class);
    }

    public final l78 a(mi0 mi0Var) throws Exception {
        hi0 hi0VarP;
        tvj.a("ProcessingNode", "processInMemoryCapture: request ID = " + mi0Var.a.a);
        hjd hjdVar = mi0Var.a;
        hi0 hi0Var = (hi0) this.c.apply(mi0Var);
        Object obj = hi0Var.a;
        ArrayList arrayList = this.b.d;
        qyj.i(!arrayList.isEmpty());
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        int i = hi0Var.c;
        if ((i == 35 || this.k) && iIntValue == 256) {
            zo7 zo7Var = this.d;
            rh0 rh0Var = new rh0(hi0Var, hjdVar.e);
            zo7Var.getClass();
            try {
                if (i == 35) {
                    hi0VarP = zo7.p(rh0Var);
                } else {
                    if (i != 256 && i != 4101) {
                        throw new IllegalArgumentException("Unexpected format: " + i);
                    }
                    hi0VarP = zo7Var.o(rh0Var, i);
                }
                ((l78) obj).close();
                Size size = hi0VarP.d;
                this.h.getClass();
                ls9 ls9Var = new ls9(d3m.a(size.getWidth(), size.getHeight(), np0.n, 2));
                l78 l78VarB = ImageProcessingUtil.b(ls9Var, (byte[]) hi0VarP.a);
                ls9Var.a();
                Objects.requireNonNull(l78VarB);
                ge6 ge6Var = hi0VarP.b;
                Objects.requireNonNull(ge6Var);
                Rect rect = hi0VarP.e;
                int i2 = hi0VarP.f;
                Matrix matrix = hi0VarP.g;
                gd2 gd2Var = hi0VarP.h;
                w97 w97Var = (w97) l78VarB;
                Size size2 = new Size(w97Var.getWidth(), w97Var.getHeight());
                w97Var.getFormat();
                hi0Var = new hi0(l78VarB, ge6Var, w97Var.getFormat(), size2, rect, i2, matrix, gd2Var);
            } catch (Throwable th) {
                ((l78) obj).close();
                throw th;
            }
        }
        this.g.getClass();
        l78 l78Var = (l78) hi0Var.a;
        nof nofVar = new nof(l78Var, hi0Var.d, new sh0(l78Var.getImageInfo().d(), l78Var.getImageInfo().getTimestamp(), hi0Var.f, hi0Var.g, l78Var.getImageInfo().c()));
        nofVar.g(hi0Var.e);
        if (arrayList.size() > 1) {
            hjdVar.b.b(nofVar.getFormat());
        }
        return nofVar;
    }
}
