package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class n42 implements k42 {
    public static final Set g = a.p1(new gi6[]{gi6.m, gi6.a, gi6.e, gi6.f});
    public final b95 a;
    public final ha9 b;
    public final j72 c;
    public final sa2 d;
    public final r8e e;
    public final r8e f;

    public n42(b95 b95Var, ha9 ha9Var, j72 j72Var, sa2 sa2Var, y82 y82Var) {
        this.a = b95Var;
        this.b = ha9Var;
        this.c = j72Var;
        this.d = sa2Var;
        r8e r8eVar = b95Var.i;
        ur2 ur2VarM0 = e9i.M0(r8eVar, new l42(3, null, 0));
        be1 be1Var = be1.n;
        a8g a8gVar = j0g.a;
        r8e r8eVarG0 = e9i.G0(ur2VarM0, y82Var, a8gVar, be1Var);
        this.e = r8eVarG0;
        this.f = e9i.G0(e9i.B(e9i.M0(r8eVar, new l42(3, null, 1)), e9i.M0(r8eVar, new l42(3, null, 2)), e9i.M0(r8eVar, new l42(3, null, 3)), r8eVarG0, new m42(this, null)), y82Var, a8gVar, b());
    }

    /* JADX WARN: Code duplicated, block: B:59:0x011b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0158 A[EDGE_INSN: B:75:0x0158->B:76:0x015a BREAK  A[LOOP:0: B:68:0x0139->B:118:0x0139]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0183  */
    /* JADX WARN: Code duplicated, block: B:96:0x018b  */
    public final f62 b() {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        dz4 dz4Var = (dz4) c().z().getValue();
        enc encVar = (enc) c().getParticipants().a().getValue();
        be1 be1Var = (be1) c().b().getValue();
        boolean zC = c().C();
        boolean zM = c().m();
        boolean zK = c().k();
        tmc tmcVar = encVar.a;
        Map map = encVar.c;
        boolean zIsScreenCaptureEnabled = tmcVar.a.isScreenCaptureEnabled();
        boolean z4 = encVar.h;
        boolean z5 = dz4Var.i;
        boolean z6 = dz4Var.h;
        pi6 pi6Var = dz4Var.q;
        boolean z7 = !z5 ? !z4 || zIsScreenCaptureEnabled : zIsScreenCaptureEnabled;
        m4f m4fVar = ((t4f) c().u().j().getValue()).b;
        int i2 = cqk.d(m4fVar != null ? m4fVar.a() : null, c().getParticipants().getMe().a.getId()) ? 2 : 1;
        Collection collectionValues = map.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                tmc tmcVar2 = (tmc) it.next();
                if (!tmcVar2.a.l() && tmcVar2.a.h()) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        boolean z8 = encVar.a.a.u() == 3 && (pi6Var instanceof mi6);
        hi6 hi6Var = pi6Var instanceof hi6 ? (hi6) pi6Var : null;
        if ((hi6Var != null ? hi6Var.a : null) == gi6.f) {
            z2 = false;
        } else {
            hi6 hi6Var2 = pi6Var instanceof hi6 ? (hi6) pi6Var : null;
            if ((hi6Var2 != null ? hi6Var2.a : null) == gi6.e || (z6 && !dz4Var.g)) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (!dz4Var.i) {
            Collection collectionValues2 = map.values();
            if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                Iterator it2 = collectionValues2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z3 = false;
                        break;
                    }
                    tmc tmcVar3 = (tmc) it2.next();
                    if (!tmcVar3.a.l() && tmcVar3.a.m()) {
                        z3 = true;
                        break;
                    }
                }
            } else {
                z3 = false;
                break;
            }
        } else {
            z3 = false;
            break;
        }
        boolean z9 = pi6Var instanceof hi6;
        hi6 hi6Var3 = z9 ? (hi6) pi6Var : null;
        boolean z10 = z9 && z6 == 0 && ww3.j1(g, hi6Var3 != null ? hi6Var3.a : null);
        boolean z11 = dz4Var.f;
        if (z11 && (pi6Var instanceof ni6)) {
            i = 5;
        } else if (pi6Var instanceof ii6) {
            i = 4;
        } else if (z10) {
            i = 5;
        } else if (pi6Var instanceof ki6) {
            i = 1;
        } else if (!z11 && !be1Var.l) {
            i = 3;
        } else if (z11) {
            i = 4;
        } else {
            i = 2;
        }
        return new f62(zC, zM, zK, z7, zC && z7, i2, new fd8(i, z2, z, z8, z3), c().s(), dz4Var.c, dz4Var.i, dz4Var.q, dz4Var.h, dz4Var.f, dz4Var.m, dz4Var.a, dz4Var.k);
    }

    public final x02 c() {
        return (x02) this.a.i.a.getValue();
    }

    public final void d(hhg hhgVar) {
        b95 b95Var = this.a;
        yab.i0(b95Var.a, ((n0c) ((xhh) b95Var.c.getValue())).c().S0(), 0, new fze(b95Var, hhgVar, this.b, null, 26), 2);
    }
}
