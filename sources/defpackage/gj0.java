package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class gj0 {
    public int a;
    public final HashMap b;
    public final Executor c;
    public final gj2 d;
    public final Rect e;
    public final Matrix f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final List k;

    public gj0(Executor executor, gj2 gj2Var, Rect rect, Matrix matrix, int i, int i2, int i3, boolean z, List list) {
        this.a = ((CaptureFailedRetryQuirk) rk5.a.b(CaptureFailedRetryQuirk.class)) == null ? 0 : 1;
        this.b = new HashMap();
        if (executor == null) {
            ore.n("Null appExecutor");
            throw null;
        }
        this.c = executor;
        this.d = gj2Var;
        this.e = rect;
        if (matrix == null) {
            ore.n("Null sensorToBufferTransform");
            throw null;
        }
        this.f = matrix;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = z;
        if (list != null) {
            this.k = list;
        } else {
            ore.n("Null sessionConfigCameraCaptureCallbacks");
            throw null;
        }
    }

    public final boolean a() {
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final void b(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.b;
        if (map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), Boolean.TRUE);
        } else {
            tvj.c("TakePictureRequest", "The format is not supported in simultaneous capture");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gj0) {
            gj0 gj0Var = (gj0) obj;
            if (this.c.equals(gj0Var.c)) {
                gj2 gj2Var = gj0Var.d;
                gj2 gj2Var2 = this.d;
                if (gj2Var2 != null ? gj2Var2.equals(gj2Var) : gj2Var == null) {
                    if (this.e.equals(gj0Var.e) && this.f.equals(gj0Var.f) && this.g == gj0Var.g && this.h == gj0Var.h && this.i == gj0Var.i && this.j == gj0Var.j && this.k.equals(gj0Var.k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() ^ 1000003) * 1000003;
        gj2 gj2Var = this.d;
        return this.k.hashCode() ^ ((((((((((((((iHashCode ^ (gj2Var == null ? 0 : gj2Var.hashCode())) * 1525764945) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TakePictureRequest{appExecutor=");
        sb.append(this.c);
        sb.append(", inMemoryCallback=");
        sb.append(this.d);
        sb.append(", onDiskCallback=null, outputFileOptions=null, secondaryOutputFileOptions=null, cropRect=");
        sb.append(this.e);
        sb.append(", sensorToBufferTransform=");
        sb.append(this.f);
        sb.append(", rotationDegrees=");
        sb.append(this.g);
        sb.append(", jpegQuality=");
        sb.append(this.h);
        sb.append(", captureMode=");
        sb.append(this.i);
        sb.append(", simultaneousCapture=");
        sb.append(this.j);
        sb.append(", sessionConfigCameraCaptureCallbacks=");
        return qv1.n("}", sb, this.k);
    }
}
