package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* JADX INFO: loaded from: classes4.dex */
public final class vqh implements e68 {
    public final e68 a;

    public vqh(e68 e68Var) {
        this.a = e68Var;
    }

    @Override // defpackage.e68
    public final xt3 a(p76 p76Var, int i, i1e i1eVar, d68 d68Var) {
        xt3 xt3VarA = this.a.a(p76Var, i, i1eVar, d68Var);
        if (xt3VarA == null) {
            return null;
        }
        if (!(xt3VarA instanceof CloseableStaticBitmap)) {
            return xt3VarA;
        }
        CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) xt3VarA;
        au3 au3VarConvertToBitmapReference = closeableStaticBitmap.convertToBitmapReference();
        return au3VarConvertToBitmapReference instanceof sqh ? CloseableStaticBitmap.of(au3VarConvertToBitmapReference, closeableStaticBitmap.getQualityInfo(), closeableStaticBitmap.getRotationAngle(), closeableStaticBitmap.getExifOrientation()) : CloseableStaticBitmap.of(new sqh((Bitmap) au3VarConvertToBitmapReference.K(), new vuf(13, au3VarConvertToBitmapReference), null), closeableStaticBitmap.getQualityInfo(), closeableStaticBitmap.getRotationAngle(), closeableStaticBitmap.getExifOrientation());
    }
}
