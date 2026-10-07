package defpackage;

import android.graphics.Bitmap;
import android.os.Environment;

/* JADX INFO: loaded from: classes3.dex */
public final class uze extends bq0 {
    public final /* synthetic */ t25 a;
    public final /* synthetic */ ek2 b;
    public final /* synthetic */ vze c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public uze(t25 t25Var, ek2 ek2Var, vze vzeVar, boolean z, int i, boolean z2) {
        this.a = t25Var;
        this.b = ek2Var;
        this.c = vzeVar;
        this.d = z;
        this.e = i;
        this.f = z2;
    }

    @Override // defpackage.rq0, defpackage.d35
    public final void a() {
        ek2 ek2Var = this.b;
        if (ek2Var.t() instanceof hib) {
            ek2Var.n(new Throwable("Cancelled with fresco pipeline"));
        }
    }

    @Override // defpackage.rq0
    public final void e(t25 t25Var) {
        this.b.resumeWith(null);
    }

    @Override // defpackage.bq0
    public final void g(Bitmap bitmap) {
        boolean zG = ((q0) this.a).g();
        ek2 ek2Var = this.b;
        if (!zG) {
            ek2Var.resumeWith(null);
            return;
        }
        if (bitmap == null) {
            ek2Var.resumeWith(null);
            return;
        }
        boolean z = this.d;
        vze vzeVar = this.c;
        my0 my0Var = new my0(bitmap, z ? zo5.o(vzeVar.c.a.getCacheDir().getPath(), poc.b) : Environment.DIRECTORY_PICTURES, this.e);
        v3f v3fVar = vzeVar.a;
        boolean z2 = this.f;
        ek2Var.resumeWith(z ? v3fVar.c(my0Var, v3fVar.f(z2)) : v3fVar.b(my0Var, v3fVar.f(z2)));
    }
}
