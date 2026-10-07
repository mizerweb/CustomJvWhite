package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xrh {
    public static final ifh a = new ifh(new yvg(15));
    public static final ifh b = new ifh(new yvg(16));

    public static final ByteArrayOutputStream a(String str) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(np0.n, np0.n, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawColor(Color.parseColor(str));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bitmapCreateBitmap.getAllocationByteCount());
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream;
    }
}
