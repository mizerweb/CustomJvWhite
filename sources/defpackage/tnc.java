package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: loaded from: classes2.dex */
public final class tnc extends LruCache {
    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Bitmap bitmap = (Bitmap) obj2;
        Bitmap bitmap2 = (Bitmap) obj3;
        if ((z || !(bitmap2 == null || bitmap == bitmap2)) && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        return oy0.d((Bitmap) obj2);
    }
}
