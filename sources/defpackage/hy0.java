package defpackage;

import android.graphics.Bitmap;
import android.util.Base64;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class hy0 {
    public final w4 a;
    public final ny8 b;
    public final ny8 c;

    public hy0(w4 w4Var, ny8 ny8Var, ny8 ny8Var2) {
        this.a = w4Var;
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0017, code lost:
    
        if (r3 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap a(byte[] r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L2d
            int r1 = r3.length
            if (r1 != 0) goto L7
            goto L2d
        L7:
            r1 = 0
            byte[] r3 = android.util.Base64.decode(r3, r1)     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L1c
            int r2 = r3.length     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L12
            goto L1c
        L12:
            int r2 = r3.length     // Catch: java.lang.Throwable -> L1a
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r3, r1, r2)     // Catch: java.lang.Throwable -> L1a
            if (r3 != 0) goto L23
            goto L1c
        L1a:
            r3 = move-exception
            goto L1d
        L1c:
            return r0
        L1d:
            poe r1 = new poe
            r1.<init>(r3)
            r3 = r1
        L23:
            boolean r1 = r3 instanceof defpackage.poe
            if (r1 == 0) goto L29
            goto L2a
        L29:
            r0 = r3
        L2a:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            return r0
        L2d:
            java.lang.Class<hy0> r3 = defpackage.hy0.class
            java.lang.String r3 = r3.getName()
            java.lang.String r1 = "Early return in decode cuz of base64Bytes is null or empty"
            defpackage.gm0.Y(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy0.a(byte[]):android.graphics.Bitmap");
    }

    public static byte[] c(Bitmap bitmap, byte[] bArr) throws IOException {
        Object poeVar;
        if (bitmap.isRecycled()) {
            gm0.Y(hy0.class.getName(), "Early return in encode cuz of bitmap is recycled");
            return bArr;
        }
        int iD = oy0.d(bitmap);
        if (iD == 0) {
            gm0.Y(hy0.class.getName(), "Early return in encode cuz of size in bytes is 0");
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iD);
        try {
            String name = hy0.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "try to encode bitmap by size " + bitmap.getWidth() + "x" + bitmap.getHeight(), null);
                }
            }
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                poeVar = byteArray.length == 0 ? bArr : Base64.encode(byteArray, 0);
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            byte[] bArr2 = (byte[]) (poeVar instanceof poe ? bArr : poeVar);
            byteArrayOutputStream.close();
            return bArr2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                rx8.n(byteArrayOutputStream, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [byte[]] */
    public final Serializable b(v78 v78Var, nq4 nq4Var) throws IOException {
        gy0 gy0Var;
        if (nq4Var instanceof gy0) {
            gy0Var = (gy0) nq4Var;
            int i = gy0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                gy0Var.f = i - Integer.MIN_VALUE;
            } else {
                gy0Var = new gy0(this, nq4Var);
            }
        } else {
            gy0Var = new gy0(this, nq4Var);
        }
        Object objK = gy0Var.d;
        int i2 = gy0Var.f;
        if (i2 == 0) {
            ch3.d0(objK);
            b78 b78Var = (b78) this.b.getValue();
            gy0Var.f = 1;
            objK = cqk.k(new qob(new qn6(b78Var.b(v78Var, null), (lq4) null, 16), (lq4) null, 24), gy0Var);
            hu4 hu4Var = hu4.a;
            if (objK == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK);
        }
        au3 au3Var = (au3) objK;
        if (au3Var == null) {
            return null;
        }
        try {
            Object objK2 = au3Var.K();
            CloseableStaticBitmap closeableStaticBitmap = objK2 instanceof CloseableStaticBitmap ? (CloseableStaticBitmap) objK2 : null;
            ?? C = closeableStaticBitmap != null ? c(closeableStaticBitmap.getUnderlyingBitmap(), (byte[]) ((ifh) this.a.a).getValue()) : 0;
            au3Var.close();
            return C;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(au3Var, th);
                throw th2;
            }
        }
    }
}
