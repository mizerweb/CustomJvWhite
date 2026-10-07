package defpackage;

import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class prl {
    public static Size a(tlg tlgVar, int i, int i2, int i3, int i4) {
        int i5 = tlgVar.h;
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 170.0f);
        int iK2 = gm0.K(170.0f * yl5.d().getDisplayMetrics().density);
        if (i5 >= iK) {
            iK = i5 > iK2 ? iK2 : i5;
        }
        if (i4 >= 0) {
            iK = Math.min(iK, i4 - i3);
        }
        int i6 = (int) (iK * (tlgVar.g / i5));
        int i7 = i - i2;
        if (i6 > i7) {
            i6 = i7;
        }
        return new Size(i6 + i2, iK + i3);
    }

    public static void b(List list) throws DeferrableSurface$SurfaceClosedException {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                ((wf5) list.get(i)).d();
                i++;
            } catch (DeferrableSurface$SurfaceClosedException e) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    ((wf5) list.get(i2)).b();
                }
                throw e;
            }
        } while (i < list.size());
    }
}
