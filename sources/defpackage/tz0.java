package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class tz0 extends ds0 {
    public final int c;
    public final Context d;
    public final l6g e;

    public tz0(Context context, int i) {
        this.c = i;
        this.d = context;
        oc9.i(Boolean.valueOf(i > 0 && i <= 25));
        oc9.i(true);
        this.e = new l6g(String.format(null, "IntrinsicBlur;%d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
    }

    @Override // defpackage.ds0, defpackage.qcd
    public final v71 b() {
        return this.e;
    }

    @Override // defpackage.ds0
    public final void c(Bitmap bitmap) {
        oc9.i(Boolean.valueOf(bitmap.isMutable()));
        boolean z = false;
        oc9.i(Boolean.valueOf(((float) bitmap.getHeight()) <= 2048.0f));
        oc9.i(Boolean.valueOf(((float) bitmap.getWidth()) <= 2048.0f));
        int i = this.c;
        if (i > 0 && i <= 25) {
            z = true;
        }
        oc9.i(Boolean.valueOf(z));
        oc9.i(true);
        try {
            o4m.d(bitmap, i);
        } catch (OutOfMemoryError e) {
            String str = String.format(null, "OOM: %d iterations on %dx%d with %d radius", Arrays.copyOf(new Object[]{3, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(i)}, 4));
            if (pj6.a.h(6)) {
                pj6.a.e("IterativeBoxBlurFilter", str);
            }
            throw e;
        }
    }

    @Override // defpackage.ds0
    public final void d(Bitmap bitmap, Bitmap bitmap2) throws Throwable {
        Context context = this.d;
        int i = this.c;
        oc9.i(Boolean.valueOf(i > 0 && i <= 25));
        RenderScript renderScript = null;
        try {
            RenderScript renderScriptCreate = RenderScript.create(context);
            if (renderScriptCreate == null) {
                throw new IllegalStateException("Required value was null.");
            }
            try {
                ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap2);
                if (allocationCreateFromBitmap == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmap);
                if (allocationCreateFromBitmap2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                scriptIntrinsicBlurCreate.setRadius(i);
                scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                allocationCreateFromBitmap2.copyTo(bitmap);
                scriptIntrinsicBlurCreate.destroy();
                allocationCreateFromBitmap.destroy();
                allocationCreateFromBitmap2.destroy();
                renderScriptCreate.destroy();
                return;
            } catch (Throwable th) {
                th = th;
                renderScript = renderScriptCreate;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (renderScript != null) {
            renderScript.destroy();
        }
        throw th;
    }
}
