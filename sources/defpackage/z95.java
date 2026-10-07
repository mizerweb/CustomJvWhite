package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* JADX INFO: loaded from: classes.dex */
public final class z95 implements ot5 {
    public final Resources a;
    public final ot5 b;

    public z95(Resources resources, ot5 ot5Var) {
        this.a = resources;
        this.b = ot5Var;
    }

    @Override // defpackage.ot5
    public final Drawable a(xt3 xt3Var) {
        try {
            qe7.v();
            if (!(xt3Var instanceof CloseableStaticBitmap)) {
                ot5 ot5Var = this.b;
                if (ot5Var == null || !ot5Var.b(xt3Var)) {
                    return null;
                }
                return ot5Var.a(xt3Var);
            }
            CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) xt3Var;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.a, closeableStaticBitmap.getUnderlyingBitmap());
            if ((closeableStaticBitmap.getRotationAngle() == 0 || closeableStaticBitmap.getRotationAngle() == -1) && (closeableStaticBitmap.getExifOrientation() == 1 || closeableStaticBitmap.getExifOrientation() == 0)) {
                return bitmapDrawable;
            }
            return new tic(bitmapDrawable, closeableStaticBitmap.getRotationAngle(), closeableStaticBitmap.getExifOrientation());
        } finally {
            qe7.v();
        }
    }

    @Override // defpackage.ot5
    public final boolean b(xt3 xt3Var) {
        return true;
    }
}
