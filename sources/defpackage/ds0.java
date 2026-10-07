package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class ds0 implements qcd {
    public static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    public static Method b;

    @Override // defpackage.qcd
    public au3 a(Bitmap bitmap, k2d k2dVar) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = a;
        }
        au3 au3VarC = k2dVar.c(width, height, config);
        try {
            d((Bitmap) au3VarC.K(), bitmap);
            return au3VarC.l();
        } finally {
            au3VarC.close();
        }
    }

    @Override // defpackage.qcd
    public v71 b() {
        return null;
    }

    public void c(Bitmap bitmap) {
    }

    public void d(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.getConfig() == bitmap2.getConfig()) {
            try {
                if (b == null) {
                    int i = Bitmaps.a;
                    b = Bitmaps.class.getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
                }
                b.invoke(null, bitmap, bitmap2);
            } catch (ClassNotFoundException e) {
                ore.h("Wrong Native code setup, reflection failed.", e);
                return;
            } catch (IllegalAccessException e2) {
                ore.h("Wrong Native code setup, reflection failed.", e2);
                return;
            } catch (NoSuchMethodException e3) {
                ore.h("Wrong Native code setup, reflection failed.", e3);
                return;
            } catch (InvocationTargetException e4) {
                ore.h("Wrong Native code setup, reflection failed.", e4);
                return;
            }
        } else {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
        c(bitmap);
    }

    @Override // defpackage.qcd
    public String getName() {
        return "Unknown postprocessor";
    }
}
