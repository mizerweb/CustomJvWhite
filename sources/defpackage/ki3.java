package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ki3 implements l2d {
    public static final byte[] d = {-1, -39};
    public Object a;
    public Object b;
    public Object c;

    public ki3(Runnable runnable) {
        this.b = new CopyOnWriteArrayList();
        this.c = new HashMap();
        this.a = runnable;
    }

    public static BitmapFactory.Options d(p76 p76Var, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = p76Var.g;
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z = config == Bitmap.Config.HARDWARE;
        if (!z) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        BitmapFactory.decodeStream(p76Var.A(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            ore.a();
            return null;
        }
        if (z) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    @Override // defpackage.l2d
    public au3 a(p76 p76Var, Bitmap.Config config) {
        BitmapFactory.Options optionsD = d(p76Var, config);
        boolean z = optionsD.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            InputStream inputStreamA = p76Var.A();
            inputStreamA.getClass();
            return c(inputStreamA, optionsD, null);
        } catch (RuntimeException e) {
            if (z) {
                return a(p76Var, Bitmap.Config.ARGB_8888);
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    @Override // defpackage.l2d
    public au3 b(p76 p76Var, Bitmap.Config config, int i, ColorSpace colorSpace) {
        boolean z;
        au3 au3Var = p76Var.a;
        i68 i68Var = p76Var.b;
        if (i68Var == kb5.a || i68Var == kb5.l) {
            au3Var.getClass();
            cba cbaVar = (cba) au3Var.K();
            if (i >= 2 && cbaVar.A(i - 2) == -1 && cbaVar.A(i - 1) == -39) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        BitmapFactory.Options optionsD = d(p76Var, config);
        InputStream inputStreamA = p76Var.A();
        inputStreamA.getClass();
        if (p76Var.E() > i) {
            inputStreamA = new m19(inputStreamA, i);
        }
        if (!z) {
            inputStreamA = new ohh(inputStreamA, d);
        }
        boolean z2 = optionsD.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            try {
                g95 g95VarC = c(inputStreamA, optionsD, colorSpace);
                try {
                    inputStreamA.close();
                    return g95VarC;
                } catch (IOException e) {
                    e.printStackTrace();
                    return g95VarC;
                }
            } catch (RuntimeException e2) {
                if (!z2) {
                    throw e2;
                }
                au3 au3VarB = b(p76Var, Bitmap.Config.ARGB_8888, i, colorSpace);
                try {
                    inputStreamA.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                return au3VarB;
            }
        } catch (Throwable th) {
            try {
                inputStreamA.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            throw th;
        }
    }

    public g95 c(InputStream inputStream, BitmapFactory.Options options, ColorSpace colorSpace) {
        Bitmap bitmap;
        ghb ghbVar = au3.f;
        qbd qbdVar = (qbd) this.c;
        fy0 fy0Var = (fy0) this.a;
        int i = options.outWidth;
        int i2 = options.outHeight;
        if (((PreverificationHelper) this.b).shouldUseHardwareBitmapConfig(options.inPreferredConfig)) {
            options.inMutable = false;
            bitmap = null;
        } else {
            Bitmap.Config config = options.outConfig;
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            bitmap = (Bitmap) fy0Var.get(oy0.c(i, i2, config));
            if (bitmap == null) {
                ore.n("BitmapPool.get returned null");
                return null;
            }
        }
        options.inBitmap = bitmap;
        if (colorSpace == null) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        options.inPreferredColorSpace = colorSpace;
        ByteBuffer byteBufferAllocate = (ByteBuffer) qbdVar.a();
        if (byteBufferAllocate == null) {
            int i3 = k55.a;
            byteBufferAllocate = ByteBuffer.allocate(16384);
        }
        try {
            try {
                try {
                    options.inTempStorage = byteBufferAllocate.array();
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    qbdVar.d(byteBufferAllocate);
                    if (bitmap == null || bitmap == bitmapDecodeStream) {
                        return au3.k0(bitmapDecodeStream, fy0Var, ghbVar);
                    }
                    fy0Var.d(bitmap);
                    if (bitmapDecodeStream != null) {
                        bitmapDecodeStream.recycle();
                    }
                    c.t();
                    return null;
                } catch (RuntimeException e) {
                    if (bitmap != null) {
                        fy0Var.d(bitmap);
                    }
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                if (bitmap != null) {
                    fy0Var.d(bitmap);
                }
                try {
                    inputStream.reset();
                    Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStream);
                    if (bitmapDecodeStream2 == null) {
                        throw e2;
                    }
                    g95 g95VarK0 = au3.k0(bitmapDecodeStream2, yr8.o(), ghbVar);
                    qbdVar.d(byteBufferAllocate);
                    return g95VarK0;
                } catch (IOException unused) {
                    throw e2;
                }
            }
        } catch (Throwable th) {
            qbdVar.d(byteBufferAllocate);
            throw th;
        }
    }

    public r17 e() {
        try {
            Object value = ((sy4) this.b).j((String) this.a).getValue();
            if (value != null) {
                return (r17) value;
            }
            throw new IllegalArgumentException(("folder " + ((String) this.a) + " not found").toString());
        } catch (Throwable th) {
            String name = ki3.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, qv1.k("fail to get folderValue for id ", (String) this.a), th);
                }
            }
            throw th;
        }
    }

    public /* synthetic */ ki3(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
