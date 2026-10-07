package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z3a implements p4a, q4a, qg4 {
    public final /* synthetic */ t4a a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ z3a(t4a t4aVar, int i, int i2) {
        this.a = t4aVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.qg4
    public void accept(Object obj) {
        t4a t4aVar = this.a;
        ((d3a) t4aVar.c.get()).getClass();
        s4a s4aVar = t4aVar.h;
        if (s4aVar != null) {
            s4aVar.setFixedSize(this.b, this.c);
        }
    }

    @Override // defpackage.q4a
    public void b(j4d j4dVar, i2a i2aVar, List list) {
        t4a t4aVar = this.a;
        j4dVar.k0(t4aVar.m0(i2aVar, j4dVar, this.b), t4aVar.m0(i2aVar, j4dVar, this.c), list);
    }

    @Override // defpackage.p4a
    public void d(j4d j4dVar, i2a i2aVar) {
        t4a t4aVar = this.a;
        int iM0 = t4aVar.m0(i2aVar, j4dVar, this.b);
        int iM1 = t4aVar.m0(i2aVar, j4dVar, this.c);
        j4dVar.q0();
        j4dVar.b.q0(iM0, iM1);
    }
}
