package defpackage;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class dw5 implements fy0 {
    public final Set a = Collections.newSetFromMap(new IdentityHashMap());

    @Override // defpackage.xad, defpackage.ine
    public final void d(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        this.a.remove(bitmap);
        bitmap.recycle();
    }

    @Override // defpackage.sba
    public final void e(qba qbaVar) {
    }

    @Override // defpackage.xad
    public final Object get(int i) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
        this.a.add(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }
}
