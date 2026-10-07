package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import defpackage.au3;
import defpackage.ayl;
import defpackage.bu3;
import defpackage.cba;
import defpackage.fbd;
import defpackage.m19;
import defpackage.np0;
import defpackage.oc9;
import defpackage.puj;
import defpackage.qr7;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {
    public static Method d;
    public final WebpBitmapFactoryImpl c;

    public GingerbreadPurgeableDecoder() {
        WebpBitmapFactoryImpl webpBitmapFactoryImpl = null;
        if (!puj.a) {
            try {
                webpBitmapFactoryImpl = (WebpBitmapFactoryImpl) WebpBitmapFactoryImpl.class.newInstance();
            } catch (Throwable unused) {
            }
            puj.a = true;
        }
        this.c = webpBitmapFactoryImpl;
    }

    public static MemoryFile g(au3 au3Var, int i, byte[] bArr) throws Throwable {
        OutputStream outputStream;
        m19 m19Var;
        fbd fbdVar = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            fbd fbdVar2 = new fbd((cba) au3Var.K());
            try {
                m19Var = new m19(fbdVar2, i);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    outputStream2.getClass();
                    byte[] bArr2 = new byte[np0.r];
                    while (true) {
                        int i2 = m19Var.read(bArr2);
                        if (i2 == -1) {
                            break;
                        }
                        outputStream2.write(bArr2, 0, i2);
                    }
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    au3Var.close();
                    bu3.b(fbdVar2);
                    bu3.b(m19Var);
                    bu3.a(outputStream2);
                    return memoryFile;
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    fbdVar = fbdVar2;
                    au3Var.close();
                    bu3.b(fbdVar);
                    bu3.b(m19Var);
                    bu3.a(outputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                m19Var = null;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            m19Var = null;
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap c(au3 au3Var, BitmapFactory.Options options) {
        return h(au3Var, ((cba) au3Var.K()).I(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap d(au3 au3Var, int i, BitmapFactory.Options options) {
        return h(au3Var, i, DalvikPurgeableDecoder.e(i, au3Var) ? null : DalvikPurgeableDecoder.b, options);
    }

    public final Bitmap h(au3 au3Var, int i, byte[] bArr, BitmapFactory.Options options) throws Throwable {
        MemoryFile memoryFile = null;
        try {
            try {
                MemoryFile memoryFileG = g(au3Var, i, bArr);
                try {
                    FileDescriptor fileDescriptorI = i(memoryFileG);
                    if (this.c == null) {
                        throw new IllegalStateException("WebpBitmapFactory is null");
                    }
                    Bitmap bitmapHookDecodeFileDescriptor = WebpBitmapFactoryImpl.hookDecodeFileDescriptor(fileDescriptorI, null, options);
                    oc9.q(bitmapHookDecodeFileDescriptor, "BitmapFactory returned null");
                    memoryFileG.close();
                    return bitmapHookDecodeFileDescriptor;
                } catch (IOException e) {
                    e = e;
                    memoryFile = memoryFileG;
                    ayl.c(e);
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    th = th;
                    memoryFile = memoryFileG;
                    if (memoryFile != null) {
                        memoryFile.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public final FileDescriptor i(MemoryFile memoryFile) throws Throwable {
        Method method;
        try {
            synchronized (this) {
                if (d == null) {
                    try {
                        d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", null);
                    } catch (Exception e) {
                        ayl.c(e);
                        throw new RuntimeException(e);
                    }
                }
                method = d;
            }
            Object objInvoke = method.invoke(memoryFile, null);
            objInvoke.getClass();
            return (FileDescriptor) objInvoke;
        } catch (Exception e2) {
            ayl.c(e2);
            qr7.o(e2);
            return null;
        }
    }
}
