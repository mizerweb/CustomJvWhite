package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class avk {
    public static String a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((lyh) it.next()).a.g.n;
            if (uya.m(str2)) {
                return "video/mp4";
            }
            if (uya.i(str2)) {
                z = true;
            } else if (uya.k(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }

    public static void b(gx gxVar, float f, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        if (f <= 0.0f || layoutParams == null) {
            return;
        }
        int i3 = layoutParams.height;
        if (i3 == 0 || i3 == -2) {
            gxVar.b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(gxVar.a) - i) / f) + i2), gxVar.b), 1073741824);
            return;
        }
        int i4 = layoutParams.width;
        if (i4 == 0 || i4 == -2) {
            gxVar.a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(gxVar.b) - i2) * f) + i), gxVar.a), 1073741824);
        }
    }
}
