package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class vyi {
    public final ny8 a;

    public vyi(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final Bitmap a(int i, byte[] bArr) {
        try {
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, i, i, true);
            Bitmap bitmapA = ((u58) this.a.getValue()).a(bitmapCreateScaledBitmap, 25, false);
            if (!bitmapDecodeByteArray.isRecycled()) {
                bitmapDecodeByteArray.recycle();
            }
            if (!bitmapCreateScaledBitmap.isRecycled()) {
                bitmapCreateScaledBitmap.recycle();
            }
            return bitmapA;
        } catch (Throwable th) {
            gm0.V(vyi.class.getName(), "getBitmapFromByteArray failed", new uyi(th));
            return null;
        }
    }
}
