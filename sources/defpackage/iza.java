package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class iza extends pza {
    public final ha9 e;
    public final int f;
    public final ifh g;

    public iza(ny8 ny8Var, ny8 ny8Var2, ha9 ha9Var) {
        super(ny8Var);
        this.e = ha9Var;
        this.f = 12;
        this.g = new ifh(new x5(ny8Var2, 23, this));
    }

    @Override // defpackage.pza
    public final Object b() {
        List listN1 = ww3.N1((Iterable) this.b.get(), this.f);
        yf8 yf8Var = new yf8();
        int size = listN1.size();
        xf8[] xf8VarArr = new xf8[size];
        for (int i = 0; i < size; i++) {
            hza hzaVar = (hza) listN1.get(i);
            xf8 xf8Var = new xf8();
            xf8Var.a = hzaVar.a;
            xf8Var.b = hzaVar.b;
            xf8Var.c = hzaVar.c.a;
            xf8Var.d = yab.C(hzaVar.d);
            sia[] siaVarArr = hzaVar.e;
            if (siaVarArr != null) {
                xf8Var.e = (ag8[]) siaVarArr;
            }
            xf8VarArr[i] = xf8Var;
        }
        yf8Var.a = xf8VarArr;
        return yf8Var;
    }

    @Override // defpackage.pza
    public final f40 c() {
        return (f40) this.g.getValue();
    }

    @Override // defpackage.pza
    public final boolean e(byte[] bArr) {
        Object poeVar;
        je9 je9Var = je9.e;
        long jNanoTime = System.nanoTime();
        String strD = d();
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, strD, "loadData start", null);
        }
        try {
            xf8[] xf8VarArr = ((yf8) sia.mergeFrom(new yf8(), bArr)).a;
            ArrayList arrayList = new ArrayList(xf8VarArr.length);
            for (xf8 xf8Var : xf8VarArr) {
                String str = xf8Var.a;
                String str2 = xf8Var.b;
                int i = xf8Var.c;
                ou4 ou4Var = ou4.b;
                if (i != 0) {
                    ou4Var = new ou4(i);
                }
                arrayList.add(new hza(str, str2, ou4Var, yab.E(xf8Var.d), xf8Var.e));
            }
            this.b.set(arrayList);
            poeVar = Boolean.TRUE;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(d(), "loadData fail", thA);
        }
        String strD2 = d();
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            ghb ghbVar = ew5.b;
            a4cVar2.c(je9Var, strD2, "loadData finish ".concat(ew5.t(qe7.P(System.nanoTime() - jNanoTime, lw5.NANOSECONDS))), null);
        }
        Boolean bool = Boolean.FALSE;
        if (poeVar instanceof poe) {
            poeVar = bool;
        }
        return ((Boolean) poeVar).booleanValue();
    }
}
