package defpackage;

import android.graphics.Bitmap;
import com.facebook.animated.webp.WebPFrame;
import com.facebook.animated.webp.WebPImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class jbb implements e68 {
    public final String a = jbb.class.getName();
    public final ny8 b;

    public jbb(ny8 ny8Var) {
        this.b = ny8Var;
    }

    @Override // defpackage.e68
    public final xt3 a(p76 p76Var, int i, i1e i1eVar, d68 d68Var) throws IOException {
        byte[] bArr;
        WebPImage webPImageJ;
        je9 je9Var = je9.f;
        au3 au3VarA = au3.A(p76Var.a);
        if (au3VarA == null) {
            bArr = null;
        } else {
            try {
                int iE = p76Var.E();
                bArr = new byte[iE];
                ((cba) au3VarA.K()).E(0, 0, iE, bArr);
                au3VarA.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(au3VarA, th);
                    throw th2;
                }
            }
        }
        if (bArr == null) {
            String str = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "WebP decode skipped: null byteBufferRef", null);
                return null;
            }
        } else {
            try {
                webPImageJ = WebPImage.j(bArr, d68Var);
                try {
                    int i2 = p76Var.g;
                    int i3 = 1;
                    if (i2 < 1) {
                        i2 = 1;
                    }
                    int width = webPImageJ.getWidth() / i2;
                    if (width < 1) {
                        width = 1;
                    }
                    int height = webPImageJ.getHeight() / i2;
                    if (height >= 1) {
                        i3 = height;
                    }
                    WebPFrame webPFrameL = webPImageJ.l();
                    try {
                        au3 au3VarC = ((k2d) this.b.getValue()).c(width, i3, d68Var.a);
                        try {
                            webPFrameL.a(width, i3, (Bitmap) au3VarC.K());
                            p76Var.Y();
                            int i4 = p76Var.c;
                            p76Var.Y();
                            CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(au3VarC, i1eVar, i4, p76Var.d);
                            au3VarC.close();
                            webPFrameL.dispose();
                            webPImageJ.k();
                            return closeableStaticBitmapOf;
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                rx8.n(au3VarC, th3);
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        webPFrameL.dispose();
                        throw th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    try {
                        String str2 = this.a;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, str2, "Error decoding static WebP via native libwebp", th);
                        }
                        return null;
                    } finally {
                        if (webPImageJ != null) {
                            webPImageJ.k();
                        }
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                webPImageJ = null;
            }
        }
        return null;
    }
}
