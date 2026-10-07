package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class weg extends nql {
    public final nmc a = new nmc();
    public final mo2 b = new mo2();
    public dth c;

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    @Override // defpackage.nql
    public final lwa b(rwa rwaVar, ByteBuffer byteBuffer) {
        jwa xegVar;
        long j;
        long j2;
        nmc nmcVar = this.a;
        mo2 mo2Var = this.b;
        dth dthVar = this.c;
        if (dthVar != null) {
            long j3 = rwaVar.i;
            synchronized (dthVar) {
                j2 = dthVar.b;
            }
            if (j3 != j2) {
                dth dthVar2 = new dth(rwaVar.f);
                this.c = dthVar2;
                dthVar2.a(rwaVar.f - rwaVar.i);
            }
        } else {
            dth dthVar3 = new dth(rwaVar.f);
            this.c = dthVar3;
            dthVar3.a(rwaVar.f - rwaVar.i);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        nmcVar.L(iLimit, bArrArray);
        mo2Var.o(iLimit, bArrArray);
        mo2Var.t(39);
        long jI = (((long) mo2Var.i(1)) << 32) | ((long) mo2Var.i(32));
        mo2Var.t(20);
        int i = mo2Var.i(12);
        int i2 = mo2Var.i(8);
        nmcVar.O(14);
        if (i2 == 0) {
            xegVar = new xeg();
        } else if (i2 == 255) {
            long jC = nmcVar.C();
            int i3 = i - 4;
            nmcVar.k(0, new byte[i3], i3);
            xegVar = new eid(0, jC, jI);
        } else if (i2 == 4) {
            int iA = nmcVar.A();
            ArrayList arrayList = new ArrayList(iA);
            for (int i4 = 0; i4 < iA; i4++) {
                nmcVar.C();
                boolean z = (nmcVar.A() & np0.m) != 0;
                ArrayList arrayList2 = new ArrayList();
                int i5 = 9;
                if (!z) {
                    int iA2 = nmcVar.A();
                    boolean z2 = (iA2 & 64) != 0;
                    boolean z3 = (iA2 & 32) != 0;
                    if (z2) {
                        nmcVar.C();
                    }
                    if (!z2) {
                        int iA3 = nmcVar.A();
                        ArrayList arrayList3 = new ArrayList(iA3);
                        for (int i6 = 0; i6 < iA3; i6++) {
                            nmcVar.A();
                            nmcVar.C();
                            arrayList3.add(new nv8(i5));
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z3) {
                        nmcVar.A();
                        nmcVar.C();
                    }
                    nmcVar.H();
                    nmcVar.A();
                    nmcVar.A();
                }
                iw8 iw8Var = new iw8(i5);
                Collections.unmodifiableList(arrayList2);
                arrayList.add(iw8Var);
            }
            xegVar = new xeg();
            Collections.unmodifiableList(arrayList);
        } else if (i2 == 5) {
            dth dthVar4 = this.c;
            nmcVar.C();
            boolean z4 = (nmcVar.A() & np0.m) != 0;
            List list = Collections.EMPTY_LIST;
            if (z4) {
                j = -9223372036854775807L;
            } else {
                int iA4 = nmcVar.A();
                boolean z5 = (iA4 & 64) != 0;
                boolean z6 = (iA4 & 32) != 0;
                boolean z7 = (iA4 & 16) != 0;
                long jD = (!z5 || z7) ? -9223372036854775807L : eid.d(jI, nmcVar);
                if (!z5) {
                    int iA5 = nmcVar.A();
                    ArrayList arrayList4 = new ArrayList(iA5);
                    for (int i7 = 0; i7 < iA5; i7++) {
                        nmcVar.A();
                        dthVar4.b(!z7 ? eid.d(jI, nmcVar) : -9223372036854775807L);
                        arrayList4.add(new lu8());
                    }
                    list = arrayList4;
                }
                if (z6) {
                    nmcVar.A();
                    nmcVar.C();
                }
                nmcVar.H();
                nmcVar.A();
                nmcVar.A();
                j = jD;
            }
            xegVar = new eid(j, dthVar4.b(j), list);
        } else if (i2 != 6) {
            xegVar = null;
        } else {
            dth dthVar5 = this.c;
            long jD2 = eid.d(jI, nmcVar);
            xegVar = new eid(2, jD2, dthVar5.b(jD2));
        }
        return xegVar == null ? new lwa(new jwa[0]) : new lwa(xegVar);
    }
}
