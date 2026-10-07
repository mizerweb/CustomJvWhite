package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class vvc {
    public final ifh a;
    public final ifh b;
    public final ifh c = new ifh(new iua(20, this));

    public vvc(Context context) {
        this.a = new ifh(new bzb(context, 18));
        this.b = new ifh(new bzb(context, 19));
    }

    public final bne a(int i, int i2) {
        int i3;
        int iIntValue = ((Number) this.b.getValue()).intValue();
        ((Number) this.a.getValue()).intValue();
        if (i2 * i < iIntValue * iIntValue) {
            gm0.Y(vvc.class.getName(), "Early return in getResizeOptions cuz of sourceHeight * sourceWidth < resizeLimit * resizeLimit");
            return null;
        }
        if (i2 <= iIntValue && i <= iIntValue) {
            gm0.Y(vvc.class.getName(), "Early return in getResizeOptions cuz of sourceHeight <= resizeLimit && sourceWidth <= resizeLimit");
            return null;
        }
        if (i2 > i) {
            iIntValue = (int) ((i / i2) * iIntValue);
            i3 = iIntValue;
        } else {
            i3 = (int) ((i2 / i) * iIntValue);
        }
        return new bne(iIntValue, i3, 0.0f, 12);
    }
}
