package defpackage;

import android.content.Context;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class g5e {
    public final ThreadLocal a = new ThreadLocal();
    public final ThreadLocal b = new ThreadLocal();

    public final String a(Context context, int i) {
        Object poeVar;
        ThreadLocal threadLocal = this.b;
        ThreadLocal threadLocal2 = this.a;
        byte[] bArr = (byte[]) threadLocal2.get();
        if (bArr == null) {
            bArr = new byte[65536];
            threadLocal2.set(bArr);
        }
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
            byte[] bArr2 = (byte[]) threadLocal.get();
            if (bArr2 == null) {
                bArr2 = new byte[np0.r];
                threadLocal.set(bArr2);
            }
            int i2 = 0;
            while (true) {
                try {
                    int i3 = inputStreamOpenRawResource.read(bArr2, 0, bArr2.length);
                    if (i3 < 0) {
                        break;
                    }
                    int i4 = i2 + i3;
                    if (bArr.length < i4) {
                        byte[] bArr3 = new byte[bArr.length * 2];
                        System.arraycopy(bArr, 0, bArr3, 0, i2);
                        threadLocal2.set(bArr3);
                        bArr = bArr3;
                    }
                    if (i3 > 0) {
                        System.arraycopy(bArr2, 0, bArr, i2, i3);
                        i2 = i4;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        rx8.n(inputStreamOpenRawResource, th);
                        throw th2;
                    }
                }
            }
            inputStreamOpenRawResource.close();
            poeVar = new String(bArr, 0, i2, pt2.a);
        } catch (Throwable th3) {
            poeVar = new poe(th3);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        return (String) poeVar;
    }
}
