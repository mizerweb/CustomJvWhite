package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes3.dex */
public final class jxb extends ds0 {
    public final ifh c;

    public jxb(Context context) {
        this.c = new ifh(new n52(context, 23));
    }

    public static void e(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        try {
            bitmap.recycle();
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.ds0, defpackage.qcd
    public final v71 b() {
        return new l6g("radius=6,sampling=8");
    }

    @Override // defpackage.ds0
    public final void d(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap bitmap3;
        Bitmap bitmapCreateScaledBitmap = null;
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2.getWidth() / 8, bitmap2.getHeight() / 8, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.scale(0.125f, 0.125f);
                Paint paint = new Paint();
                paint.setFlags(2);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                Bitmap bitmapA = ((u58) this.c.getValue()).a(bitmapCreateBitmap, 6, true);
                try {
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA, bitmap.getWidth(), bitmap.getHeight(), true);
                    if (bitmapA != null) {
                        bitmapA.recycle();
                    }
                    super.d(bitmap, bitmapCreateScaledBitmap);
                    e(bitmapA);
                    e(bitmapCreateScaledBitmap);
                } catch (Throwable th) {
                    th = th;
                    bitmap3 = bitmapCreateScaledBitmap;
                    bitmapCreateScaledBitmap = bitmapA;
                    try {
                        String name = jxb.class.getName();
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, name, "process: failed to process blur", th);
                            }
                        }
                        throw th;
                    } catch (Throwable th2) {
                        e(bitmapCreateScaledBitmap);
                        e(bitmap3);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bitmap3 = null;
                bitmapCreateScaledBitmap = bitmapCreateBitmap;
            }
        } catch (Throwable th4) {
            th = th4;
            bitmap3 = null;
        }
    }

    @Override // defpackage.ds0, defpackage.qcd
    public final String getName() {
        return jxb.class.getSimpleName();
    }
}
