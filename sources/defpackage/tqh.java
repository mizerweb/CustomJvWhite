package defpackage;

import android.graphics.Bitmap;
import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class tqh extends w4 {
    public final ku8 b;

    public tqh(cy5 cy5Var) {
        super(cy5Var);
        this.b = new ku8(cy5Var);
    }

    @Override // defpackage.w4
    public final au3 j(Bitmap bitmap, ine ineVar) {
        ku8 ku8Var = this.b;
        ku8Var.getClass();
        return new sqh(bitmap, ineVar, ku8Var);
    }

    @Override // defpackage.w4
    public final au3 l(Closeable closeable) {
        if (closeable == null) {
            return super.l(closeable);
        }
        ku8 ku8Var = this.b;
        ku8Var.getClass();
        return new sqh(closeable, null, ku8Var);
    }
}
