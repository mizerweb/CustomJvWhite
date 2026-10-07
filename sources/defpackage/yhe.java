package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class yhe extends bq0 {
    public final /* synthetic */ ek2 a;
    public final /* synthetic */ t25 b;
    public final /* synthetic */ zhe c;

    public yhe(ek2 ek2Var, t25 t25Var, zhe zheVar) {
        this.a = ek2Var;
        this.b = t25Var;
        this.c = zheVar;
    }

    @Override // defpackage.rq0, defpackage.d35
    public final void a() {
        ek2 ek2Var = this.a;
        if (ek2Var.t() instanceof hib) {
            ek2Var.n(new Throwable("Cancelled with fresco pipeline"));
        }
    }

    @Override // defpackage.rq0
    public final void e(t25 t25Var) {
        ek2 ek2Var = this.a;
        if (ek2Var.t() instanceof hib) {
            ek2Var.resumeWith(null);
        }
    }

    @Override // defpackage.bq0
    public final void g(Bitmap bitmap) {
        ek2 ek2Var = this.a;
        if (!(ek2Var.t() instanceof hib)) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        } else if (!((q0) this.b).g()) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            ek2Var.resumeWith(null);
        } else if (bitmap == null) {
            ek2Var.resumeWith(null);
        } else {
            jc7 jc7Var = this.c.c;
            ek2Var.resumeWith(new kc7(jc7Var.b, jc7Var.c, bitmap));
        }
    }
}
