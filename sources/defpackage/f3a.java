package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f3a implements n3a {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3a b;

    public /* synthetic */ f3a(o3a o3aVar, z4e z4eVar) {
        this.a = 3;
        this.b = o3aVar;
    }

    @Override // defpackage.n3a
    public final void b(i2a i2aVar) {
        int i = this.a;
        o3a o3aVar = this.b;
        switch (i) {
            case 0:
                j4d j4dVar = o3aVar.g.t;
                String str = vqi.a;
                if (j4dVar != null && j4dVar.c(1)) {
                    j4dVar.i0();
                    break;
                }
                break;
            case 1:
                d3a d3aVar = o3aVar.g;
                j4d j4dVar2 = d3aVar.t;
                if (!vqi.k0(j4dVar2, d3aVar.p)) {
                    if (j4dVar2 != null && j4dVar2.c(1)) {
                        j4dVar2.i0();
                        break;
                    }
                } else {
                    vqi.L(j4dVar2);
                    break;
                }
                break;
            case 2:
                o3aVar.g.n(i2aVar);
                break;
            case 3:
                d3a d3aVar2 = o3aVar.g;
                if (d3aVar2.t.V() != null) {
                    f2a f2aVar = d3aVar2.e;
                    d3aVar2.t(i2aVar);
                    f2aVar.getClass();
                    rx8.J(new wmf(-6));
                    break;
                }
                break;
            case 4:
                o3aVar.g.t.l();
                break;
            case 5:
                o3aVar.g.t.i();
                break;
            case 6:
                o3aVar.g.t.J();
                break;
            case 7:
                o3aVar.g.g(i2aVar, true);
                break;
            case 8:
                o3aVar.g.t.prepare();
                break;
            case 9:
                o3aVar.g.t.stop();
                break;
            case 10:
                o3aVar.g.t.y();
                break;
            case 11:
                o3aVar.g.t.p();
                break;
            default:
                o3aVar.g.t.I();
                break;
        }
    }

    public /* synthetic */ f3a(o3a o3aVar, int i) {
        this.a = i;
        this.b = o3aVar;
    }

    public /* synthetic */ f3a(o3a o3aVar, emf emfVar, Bundle bundle) {
        this.a = 2;
        this.b = o3aVar;
    }
}
