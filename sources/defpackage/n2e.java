package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n2e extends a8j {
    public final wze c;
    public final k0f d;
    public final ib9 e;
    public final rs6 f;
    public final v3f g;
    public final c2a h;
    public final xhh i;
    public final wo6 j;
    public final boolean k;
    public final ny8 l;
    public final mjg m = p90.a(x1e.a);
    public final mjg n = p90.a(new l2e(3, 1, true, false));
    public final ic6 o = new ic6(null);
    public final ic6 p = new ic6(null);
    public final usc q = new usc(new String[]{"android.permission.RECORD_AUDIO"});
    public final usc r = new usc(new String[]{"android.permission.CAMERA"});

    public n2e(wze wzeVar, k0f k0fVar, ib9 ib9Var, rs6 rs6Var, v3f v3fVar, c2a c2aVar, xhh xhhVar, wo6 wo6Var, boolean z, ny8 ny8Var) {
        this.c = wzeVar;
        this.d = k0fVar;
        this.e = ib9Var;
        this.f = rs6Var;
        this.g = v3fVar;
        this.h = c2aVar;
        this.i = xhhVar;
        this.j = wo6Var;
        this.k = z;
        this.l = ny8Var;
    }

    public final void B(boolean z) {
        while (true) {
            mjg mjgVar = this.n;
            Object value = mjgVar.getValue();
            l2e l2eVar = (l2e) value;
            boolean z2 = z;
            if (mjgVar.h(value, l2e.a(l2eVar, 0, z ? l2eVar.b : 1, false, z2, 5))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    public final void C() {
        b2e b2eVar = (b2e) this.m.getValue();
        if (((b2eVar instanceof a2e) || (b2eVar instanceof z1e)) && ((l2e) this.n.getValue()).b != 1) {
            D();
        }
    }

    public final void D() {
        mjg mjgVar;
        Object value;
        l2e l2eVarA;
        int i;
        do {
            mjgVar = this.n;
            value = mjgVar.getValue();
            l2e l2eVar = (l2e) value;
            b2e b2eVar = (b2e) this.m.getValue();
            int i2 = 1;
            if ((b2eVar instanceof a2e) || (b2eVar instanceof z1e)) {
                int iD = qt4.D(l2eVar.b);
                if (iD == 0) {
                    i2 = 4;
                } else if (iD != 1 && iD != 2 && iD != 3) {
                    ore.o();
                    return;
                }
                l2eVarA = l2e.a(l2eVar, 0, i2, false, false, 13);
            } else {
                int iD2 = qt4.D(l2eVar.a);
                if (iD2 == 0) {
                    i = 2;
                } else if (iD2 == 1) {
                    i = 3;
                } else {
                    if (iD2 != 2 && iD2 != 3) {
                        ore.o();
                        return;
                    }
                    i = 1;
                }
                l2eVarA = l2e.a(l2eVar, i, 0, false, false, 14);
            }
        } while (!mjgVar.h(value, l2eVarA));
    }
}
