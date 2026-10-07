package defpackage;

import ru.ok.tamtam.messages.a;

/* JADX INFO: loaded from: classes3.dex */
public final class dpa {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public dpa(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object a(long j, Long l, nq4 nq4Var) {
        cpa cpaVar;
        rt2 rt2Var;
        Object objF;
        long j2 = j;
        Long l2 = l;
        je9 je9Var = je9.f;
        if (nq4Var instanceof cpa) {
            cpaVar = (cpa) nq4Var;
            int i = cpaVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                cpaVar.i = i - Integer.MIN_VALUE;
            } else {
                cpaVar = new cpa(this, nq4Var);
            }
        } else {
            cpaVar = new cpa(this, nq4Var);
        }
        Object obj = cpaVar.g;
        hu4 hu4Var = hu4.a;
        int i2 = cpaVar.i;
        if (i2 == 0) {
            ch3.d0(obj);
            if (l2 == null) {
                gm0.Y(dpa.class.getName(), "replied message is null!");
                return null;
            }
            rt2Var = (rt2) ((xn3) this.a.getValue()).k(j2).a.getValue();
            if (rt2Var == null) {
                String name = dpa.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, nbh.s(j2, "chat for local id #", " not found"), null);
                    return null;
                }
            } else {
                sua suaVar = (sua) this.b.getValue();
                long jLongValue = l2.longValue();
                cpaVar.e = l2;
                cpaVar.f = rt2Var;
                cpaVar.d = j2;
                cpaVar.i = 1;
                objF = suaVar.f(jLongValue, cpaVar);
                if (objF == hu4Var) {
                    return hu4Var;
                }
            }
            return null;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = cpaVar.d;
        rt2 rt2Var2 = cpaVar.f;
        Long l3 = cpaVar.e;
        ch3.d0(obj);
        rt2Var = rt2Var2;
        l2 = l3;
        objF = obj;
        long j3 = j2;
        sfa sfaVar = (sfa) objF;
        if (sfaVar != null) {
            fda fdaVarA = a.a((a) this.c.getValue(), sfaVar);
            return new eia(1, j3, fdaVarA, null, null, null, 0, rt2Var.A(), fdaVarA.a.b);
        }
        String name2 = dpa.class.getName();
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, name2, iic.m(l2, "message for #", " not found!"), null);
        }
        return null;
    }
}
