package defpackage;

import android.content.Context;
import android.util.Size;
import java.util.Map;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tzl {
    public static final oi7 a(Context context) {
        Size sizeW = p90.w(context);
        ylc ylcVar = context.getResources().getConfiguration().orientation == 1 ? new ylc(Integer.valueOf(sizeW.getWidth()), Integer.valueOf(sizeW.getHeight())) : new ylc(Integer.valueOf(sizeW.getHeight()), Integer.valueOf(sizeW.getWidth()));
        int iIntValue = ((Number) ylcVar.a).intValue();
        int iIntValue2 = ((Number) ylcVar.b).intValue();
        int iMax = Math.max(3, iIntValue / context.getResources().getDimensionPixelSize(R.dimen.attach_bar_thumbnail_size));
        int i = iIntValue / iMax;
        int iK = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        int iJ = gm0.J(((double) ((sizeW.getWidth() / iMax) - ((iMax - 1) * iK))) * 0.7d);
        int iJ2 = gm0.J(Math.ceil(((double) ((iIntValue2 * iMax) / i)) * 1.8d));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.gallery_album_cover_size);
        return new oi7(i, iJ2, iMax, iK, iJ, dimensionPixelSize <= 0 ? null : new bne(dimensionPixelSize, dimensionPixelSize, 0.0f, 12));
    }

    public static s5i b(s5i s5iVar, String[] strArr, Map map) {
        int i = 0;
        if (s5iVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (s5i) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                s5i s5iVar2 = new s5i();
                int length = strArr.length;
                while (i < length) {
                    s5iVar2.a((s5i) map.get(strArr[i]));
                    i++;
                }
                return s5iVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                s5iVar.a((s5i) map.get(strArr[0]));
                return s5iVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    s5iVar.a((s5i) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return s5iVar;
    }
}
