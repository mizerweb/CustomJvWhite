package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bq0 extends rq0 {
    @Override // defpackage.rq0
    public final void f(q0 q0Var) {
        if (q0Var.g()) {
            au3 au3Var = (au3) q0Var.e();
            try {
                g((au3Var == null || !(au3Var.K() instanceof CloseableStaticBitmap)) ? null : ((CloseableStaticBitmap) au3Var.K()).getUnderlyingBitmap());
            } finally {
                au3.E(au3Var);
            }
        }
    }

    public abstract void g(Bitmap bitmap);
}
