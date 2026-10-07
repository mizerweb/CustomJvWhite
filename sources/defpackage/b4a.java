package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b4a implements p4a, q4a {
    public final /* synthetic */ int a;
    public final /* synthetic */ t4a b;
    public final /* synthetic */ int c;

    public /* synthetic */ b4a(t4a t4aVar, int i, int i2) {
        this.a = i2;
        this.b = t4aVar;
        this.c = i;
    }

    @Override // defpackage.q4a
    public void b(j4d j4dVar, i2a i2aVar, List list) {
        int i = this.a;
        int i2 = this.c;
        t4a t4aVar = this.b;
        switch (i) {
            case 1:
                j4dVar.d(t4aVar.m0(i2aVar, j4dVar, i2), list);
                break;
            case 2:
                if (list.size() != 1) {
                    j4dVar.k0(t4aVar.m0(i2aVar, j4dVar, i2), t4aVar.m0(i2aVar, j4dVar, i2 + 1), list);
                } else {
                    int iM0 = t4aVar.m0(i2aVar, j4dVar, i2);
                    ry9 ry9Var = (ry9) list.get(0);
                    j4dVar.q0();
                    bg6 bg6Var = j4dVar.b;
                    bg6Var.getClass();
                    bg6Var.t0(iM0, iM0 + 1, c98.r(ry9Var));
                }
                break;
            default:
                j4dVar.d(t4aVar.m0(i2aVar, j4dVar, i2), list);
                break;
        }
    }

    @Override // defpackage.p4a
    public void d(j4d j4dVar, i2a i2aVar) {
        int i = this.a;
        int i2 = this.c;
        t4a t4aVar = this.b;
        switch (i) {
            case 0:
                j4dVar.D(t4aVar.m0(i2aVar, j4dVar, i2));
                break;
            default:
                j4dVar.j0(t4aVar.m0(i2aVar, j4dVar, i2));
                break;
        }
    }
}
