package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class xjf extends mjf {
    public final long b;
    public final boolean c;
    public final String d = xjf.class.getName();

    public xjf(long j, boolean z) {
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.mjf
    public final void B() {
        long j = this.b;
        boolean z = this.c;
        gm0.n(this.d, bc1.l(j, "process, chatsIds = ", " , forAll = ", z));
        if (j == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        rt2 rt2VarN = i().N(j);
        if (rt2VarN == null) {
            return;
        }
        nx2 nx2Var = rt2VarN.b;
        long j2 = nx2Var.k;
        s().r(this.b, j2, wja.DELETED);
        qw2 qw2VarI = i();
        qw2VarI.getClass();
        qw2VarI.v(j, true, new jw2(qw2VarI, (Object) null, j, 0));
        i().I(j);
        qw2 qw2VarI2 = i();
        qw2VarI2.getClass();
        long j3 = rt2VarN.a;
        qw2VarI2.r(j3, uw2.d);
        qw2VarI2.v(j3, false, new p51(24));
        pvb pvbVarB = b();
        long j4 = rt2VarN.a;
        long j5 = nx2Var.a;
        boolean z2 = rt2VarN.Z() || z;
        if (pvbVarB.j(j4)) {
            pvb.t(pvbVarB, new qv2(pvbVarB.u().a.g(), j4, j5, j2, z2));
        }
        vg4 vg4VarW = rt2VarN.w();
        if (vg4VarW != null) {
            arrayList.add(Long.valueOf(vg4VarW.v()));
        }
        id9 id9VarQ = q();
        s().e(j);
        id9VarQ.getClass();
        njf njfVar = this.a;
        ((h5c) (njfVar != null ? njfVar : null).E.getValue()).b(nx2Var.a);
        if (!arrayList.isEmpty()) {
            w().c(new so4(arrayList));
        }
        w().c(new wo3((Collection) Collections.singletonList(Long.valueOf(j)), true, false, (mg5) null, (cid) null, (Set) null, 124));
    }
}
