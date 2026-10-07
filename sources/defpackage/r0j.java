package defpackage;

import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class r0j implements ug4 {
    public final cch a;
    public final /* synthetic */ t0j b;

    public r0j(t0j t0jVar, cch cchVar) {
        this.b = t0jVar;
        this.a = cchVar;
    }

    @Override // defpackage.ug4
    public final void accept(Object obj) {
        String str = this.b.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onOutputSurface close event=0", null);
            }
        }
        this.b.b();
        this.a.close();
        Surface surface = (Surface) this.b.g.remove(this.a);
        if (surface != null) {
            h1j h1jVar = this.b.j;
            if (h1jVar == null) {
                ore.p("Required value was null.");
                return;
            }
            xg7.d((AtomicBoolean) h1jVar.b, true);
            xg7.c((Thread) h1jVar.d);
            h1jVar.s(surface, true);
        }
    }
}
