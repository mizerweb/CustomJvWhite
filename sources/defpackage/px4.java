package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class px4 extends ds0 {
    public final /* synthetic */ rx4 c;

    public px4(rx4 rx4Var) {
        this.c = rx4Var;
    }

    @Override // defpackage.ds0, defpackage.qcd
    public final au3 a(Bitmap bitmap, k2d k2dVar) throws IOException {
        ux4 ux4Var = this.c.q;
        if (ux4Var != null) {
            return au3.k0(this.c.C(bitmap, ux4Var), new hs4(8), au3.f);
        }
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = ds0.a;
        }
        au3 au3VarC = k2dVar.c(bitmap.getWidth(), bitmap.getHeight(), config);
        rx4 rx4Var = this.c;
        try {
            rx4Var.F().setBitmap((Bitmap) au3VarC.K());
            rx4Var.F().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            au3 au3VarClone = au3VarC.clone();
            au3VarC.close();
            return au3VarClone;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(au3VarC, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.ds0
    public final void d(Bitmap bitmap, Bitmap bitmap2) {
        if (this.c.s) {
            this.c.l.postTranslate((bitmap2.getHeight() - bitmap2.getWidth()) / 2.0f, (bitmap2.getWidth() - bitmap2.getHeight()) / 2.0f);
        }
        this.c.F().setBitmap(bitmap);
        this.c.F().drawBitmap(bitmap2, this.c.l, null);
    }
}
