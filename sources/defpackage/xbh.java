package defpackage;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xbh implements u00 {
    public final /* synthetic */ zbh a;
    public final /* synthetic */ ybh b;
    public final /* synthetic */ int c;
    public final /* synthetic */ zi0 d;
    public final /* synthetic */ zi0 e;

    public /* synthetic */ xbh(zbh zbhVar, ybh ybhVar, int i, zi0 zi0Var, zi0 zi0Var2) {
        this.a = zbhVar;
        this.b = ybhVar;
        this.c = i;
        this.d = zi0Var;
        this.e = zi0Var2;
    }

    @Override // defpackage.u00
    public final e89 apply(Object obj) {
        ybh ybhVar = this.b;
        Surface surface = (Surface) obj;
        zbh zbhVar = this.a;
        zbhVar.getClass();
        surface.getClass();
        try {
            ybhVar.d();
            cch cchVar = new cch(surface, this.c, zbhVar.g.a, this.d, this.e);
            cchVar.k.b.b(new vbh(ybhVar, 1), zjl.a());
            qyj.l("Consumer can only be linked once.", ybhVar.q == null);
            ybhVar.q = cchVar;
            return o9b.f(cchVar);
        } catch (DeferrableSurface$SurfaceClosedException e) {
            return new g88(1, e);
        }
    }
}
