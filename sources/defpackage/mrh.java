package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Base64;
import android.util.LruCache;
import android.util.Size;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class mrh implements e68 {
    public static final ifh c = new ifh(new a5d(29));
    public static final Paint d;
    public static final r51 e;
    public static final r51 f;
    public final fy0 a;
    public final String b = mrh.class.getName();

    static {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        d = paint;
        e = new r51(7);
        f = new r51(6);
    }

    public mrh(fy0 fy0Var) {
        this.a = fy0Var;
    }

    @Override // defpackage.e68
    public final xt3 a(p76 p76Var, int i, i1e i1eVar, d68 d68Var) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        try {
            int length = ((byte[]) lrh.a.getValue()).length;
            int i2 = i - length;
            byte[] bArr = new byte[i2];
            ((cba) au3.A(p76Var.a).K()).E(length, 0, i2, bArr);
            String strEncodeToString = Base64.encodeToString(bArr, 2);
            ifh ifhVar = c;
            krh krhVarB = (krh) ((LruCache) ifhVar.getValue()).get(strEncodeToString);
            if (krhVarB == null) {
                krhVarB = lrh.b(bArr);
                ((LruCache) ifhVar.getValue()).put(strEncodeToString, krhVarB);
            }
            Size size = new Size(krhVarB.c(), krhVarB.a());
            int width = size.getWidth();
            int height = size.getHeight();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap bitmap3 = (Bitmap) this.a.get(width * height * oy0.b(config));
            try {
                bitmap3.reconfigure(width, height, config);
                bitmap3.copyPixelsFromBuffer(ByteBuffer.wrap(krhVarB.b()));
                int width2 = size.getWidth() * 3;
                int height2 = size.getHeight() * 3;
                bitmap = (Bitmap) this.a.get(width2 * height2 * oy0.b(config));
                try {
                    bitmap.reconfigure(width2, height2, config);
                    ghb.a(bitmap3, bitmap);
                    fy0 fy0Var = this.a;
                    s98 s98Var = new s98();
                    s98Var.a = 0;
                    s98Var.b = false;
                    s98Var.c = false;
                    CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(bitmap, fy0Var, s98Var, 0);
                    this.a.d(bitmap3);
                    return closeableStaticBitmapOf;
                } catch (Throwable th) {
                    th = th;
                    bitmap2 = bitmap3;
                    try {
                        String str = this.b;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "Error decoding thumbhash image", th);
                            }
                        }
                        if (bitmap != null) {
                            this.a.d(bitmap);
                        }
                        throw th;
                    } catch (Throwable th2) {
                        if (bitmap2 != null) {
                            this.a.d(bitmap2);
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bitmap = null;
            }
        } catch (Throwable th4) {
            th = th4;
            bitmap = null;
        }
    }
}
