package defpackage;

import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cv9 implements gv9, qg4 {
    public final /* synthetic */ Surface a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cv9(Object obj, Surface surface, int i, int i2) {
        this.d = obj;
        this.a = surface;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.qg4
    public void accept(Object obj) {
        t4a t4aVar = (t4a) this.d;
        j4d j4dVar = (j4d) obj;
        ((d3a) t4aVar.c.get()).getClass();
        Surface surface = this.a;
        if (surface == null) {
            j4dVar.p0(null);
            t4aVar.h = null;
        } else {
            s4a s4aVar = new s4a(surface, this.b, this.c);
            t4aVar.h = s4aVar;
            j4dVar.p0(s4aVar);
        }
    }

    @Override // defpackage.gv9
    public void c(e38 e38Var, int i) {
        jv9 jv9Var = (jv9) this.d;
        e38Var.A(jv9Var.c, i, this.a, this.b, this.c);
    }
}
