package defpackage;

import android.util.Size;
import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class b4h extends c4h {
    @Override // defpackage.c4h
    public final Integer[] a() {
        Integer[] numArrA = super.a();
        if (uk5.a(PixelJpegRSupportedQuirk.class) == null) {
            return numArrA;
        }
        if (numArrA == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : numArrA) {
            if (num.intValue() != 4101) {
                arrayList.add(num);
            }
        }
        return (Integer[]) arrayList.toArray(new Integer[0]);
    }

    @Override // defpackage.c4h
    public final long b(int i, Size size) {
        if (i != 4101 || uk5.a(PixelJpegRSupportedQuirk.class) == null) {
            return super.b(i, size);
        }
        return 0L;
    }

    @Override // defpackage.c4h
    public final Size[] c(int i) {
        if (i != 4101 || uk5.a(PixelJpegRSupportedQuirk.class) == null) {
            return super.c(i);
        }
        return null;
    }
}
