package defpackage;

import android.os.Handler;
import android.util.Pair;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class e94 extends e84 {
    public final c98 k;
    public final IdentityHashMap l = new IdentityHashMap();
    public Handler m;
    public boolean n;
    public ry9 o;

    public e94(ry9 ry9Var, ghe gheVar) {
        this.o = ry9Var;
        this.k = gheVar;
    }

    @Override // defpackage.e84
    public final void A(Object obj, ur0 ur0Var, ush ushVar) {
        if (this.n) {
            return;
        }
        Handler handler = this.m;
        handler.getClass();
        handler.obtainMessage(1).sendToTarget();
        this.n = true;
    }

    public final void C() {
        int i = 0;
        while (true) {
            c98 c98Var = this.k;
            if (i >= c98Var.size()) {
                return;
            }
            d94 d94Var = (d94) c98Var.get(i);
            if (d94Var.e == 0) {
                w(Integer.valueOf(d94Var.b));
            }
            i++;
        }
    }

    public final c94 D() {
        long j;
        int i;
        boolean z;
        tsh tshVar = new tsh();
        rsh rshVar = new rsh();
        z88 z88VarL = c98.l();
        z88 z88VarL2 = c98.l();
        z88 z88VarL3 = c98.l();
        c98 c98Var = this.k;
        int size = c98Var.size();
        int i2 = 0;
        boolean z2 = true;
        Object obj = null;
        int iH = 0;
        boolean z3 = false;
        boolean z4 = true;
        boolean z5 = false;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        while (i2 < size) {
            d94 d94Var = (d94) c98Var.get(i2);
            nn9 nn9Var = d94Var.a;
            int i3 = d94Var.b;
            HashMap map = d94Var.d;
            ln9 ln9Var = nn9Var.o;
            boolean zP = ln9Var.p();
            boolean z6 = true;
            ush ushVar = ln9Var.e;
            boolean z7 = !zP;
            c98 c98Var2 = c98Var;
            lvb.O("Can't concatenate empty child Timeline.", z7);
            z88VarL.c(ln9Var);
            z88VarL2.c(Integer.valueOf(iH));
            iH = ushVar.h() + iH;
            int i4 = 0;
            while (i4 < ushVar.o()) {
                ln9Var.n(i4, tshVar);
                if (!z3) {
                    obj = tshVar.c;
                    z3 = z6;
                }
                z2 = (z2 && Objects.equals(obj, tshVar.c)) ? z6 : false;
                z88 z88Var = z88VarL;
                z88 z88Var2 = z88VarL2;
                long j5 = tshVar.l;
                if (j5 == -9223372036854775807L) {
                    j5 = d94Var.c;
                    if (j5 == -9223372036854775807L) {
                        return null;
                    }
                }
                j2 += j5;
                if (i3 == 0 && i4 == 0) {
                    j3 = tshVar.k;
                    j4 = -tshVar.o;
                }
                z4 &= (tshVar.g || tshVar.j) ? z6 : false;
                z5 |= tshVar.h;
                int i5 = tshVar.m;
                while (i5 <= tshVar.n) {
                    z88VarL3.c(Long.valueOf(j4));
                    ln9Var.f(i5, rshVar, z6);
                    z88 z88Var3 = z88VarL3;
                    long j6 = rshVar.d;
                    if (j6 == -9223372036854775807L) {
                        lvb.O("Can't apply placeholder duration to multiple periods with unknown duration in a single window.", tshVar.m == tshVar.n);
                        j6 = j5 + tshVar.o;
                    }
                    long j7 = j6;
                    if (i5 != tshVar.m || ((i3 == 0 && i4 == 0) || j7 == -9223372036854775807L)) {
                        j = 0;
                    } else {
                        j = -tshVar.o;
                        j7 += j;
                    }
                    tsh tshVar2 = tshVar;
                    Object obj2 = rshVar.b;
                    obj2.getClass();
                    rsh rshVar2 = rshVar;
                    if (d94Var.e == 0 || !map.containsKey(obj2)) {
                        i = i5;
                    } else {
                        i = i5;
                        if (!((Long) map.get(obj2)).equals(Long.valueOf(j))) {
                            z = false;
                        }
                        lvb.O("Can't handle windows with changing offset in first period.", z);
                        map.put(obj2, Long.valueOf(j));
                        j4 += j7;
                        i5 = i + 1;
                        z88VarL3 = z88Var3;
                        tshVar = tshVar2;
                        rshVar = rshVar2;
                        z6 = true;
                    }
                    z = true;
                    lvb.O("Can't handle windows with changing offset in first period.", z);
                    map.put(obj2, Long.valueOf(j));
                    j4 += j7;
                    i5 = i + 1;
                    z88VarL3 = z88Var3;
                    tshVar = tshVar2;
                    rshVar = rshVar2;
                    z6 = true;
                }
                i4++;
                z88VarL = z88Var;
                z88VarL2 = z88Var2;
                z6 = true;
            }
            i2++;
            c98Var = c98Var2;
        }
        new c94(k(), z88VarL.h(), z88VarL2.h(), z88VarL3.h(), z4, z5, j2, j3, z2 ? obj : null);
        return r0;
    }

    @Override // defpackage.ur0
    public final u0a e(x4a x4aVar, qf qfVar, long j) {
        long jLongValue;
        Object obj = x4aVar.a;
        int iIntValue = ((Integer) ((Pair) obj).first).intValue();
        c98 c98Var = this.k;
        d94 d94Var = (d94) c98Var.get(iIntValue);
        x4a x4aVarA = x4aVar.a(((Pair) obj).second);
        long j2 = x4aVar.d;
        int size = c98Var.size();
        int i = d94Var.b;
        long j3 = (j2 * ((long) size)) + ((long) i);
        if (x4aVarA.d != j3) {
            x4aVarA = new x4a(x4aVarA.a, x4aVarA.b, x4aVarA.c, j3, x4aVarA.e);
        }
        d84 d84Var = (d84) this.h.get(Integer.valueOf(i));
        d84Var.getClass();
        d84Var.a.h(d84Var.b);
        d94Var.e++;
        if (x4aVar.b()) {
            jLongValue = 0;
        } else {
            Long l = (Long) d94Var.d.get(x4aVarA.a);
            l.getClass();
            jLongValue = l.longValue();
        }
        dsh dshVar = new dsh(d94Var.a.e(x4aVarA, qfVar, j - jLongValue), jLongValue);
        this.l.put(dshVar, d94Var);
        C();
        return dshVar;
    }

    @Override // defpackage.e84, defpackage.ur0
    public final void i() {
    }

    @Override // defpackage.ur0
    public final ush j() {
        return D();
    }

    @Override // defpackage.ur0
    public final synchronized ry9 k() {
        return this.o;
    }

    @Override // defpackage.ur0
    public final void o(v1i v1iVar) {
        this.j = v1iVar;
        this.i = vqi.p(null);
        this.m = new Handler(new w84(1, this));
        int i = 0;
        while (true) {
            c98 c98Var = this.k;
            if (i >= c98Var.size()) {
                break;
            }
            B(Integer.valueOf(i), ((d94) c98Var.get(i)).a);
            i++;
        }
        if (this.n) {
            return;
        }
        Handler handler = this.m;
        handler.getClass();
        handler.obtainMessage(1).sendToTarget();
        this.n = true;
    }

    @Override // defpackage.ur0
    public final void q(u0a u0aVar) {
        IdentityHashMap identityHashMap = this.l;
        d94 d94Var = (d94) identityHashMap.remove(u0aVar);
        d94Var.getClass();
        d94Var.a.q(((dsh) u0aVar).a);
        d94Var.e--;
        if (identityHashMap.isEmpty()) {
            return;
        }
        C();
    }

    @Override // defpackage.e84, defpackage.ur0
    public final void s() {
        super.s();
        Handler handler = this.m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.m = null;
        }
        this.n = false;
    }

    @Override // defpackage.ur0
    public final synchronized void v(ry9 ry9Var) {
        this.o = ry9Var;
    }

    @Override // defpackage.e84
    public final x4a x(Object obj, x4a x4aVar) {
        Integer num = (Integer) obj;
        long j = x4aVar.d;
        c98 c98Var = this.k;
        if (num.intValue() != ((int) (j % ((long) c98Var.size())))) {
            return null;
        }
        long size = x4aVar.d / ((long) c98Var.size());
        x4a x4aVarA = x4aVar.a(Pair.create(num, x4aVar.a));
        return x4aVarA.d == size ? x4aVarA : new x4a(x4aVarA.a, x4aVarA.b, x4aVarA.c, size, x4aVarA.e);
    }

    @Override // defpackage.e84
    public final long y(Object obj, long j, x4a x4aVar) {
        Long l;
        return (j == -9223372036854775807L || x4aVar == null || x4aVar.b() || (l = (Long) ((d94) this.k.get(((Integer) obj).intValue())).d.get(x4aVar.a)) == null) ? j : vqi.p0(l.longValue()) + j;
    }

    @Override // defpackage.e84
    public final /* bridge */ /* synthetic */ int z(int i, Object obj) {
        return 0;
    }
}
