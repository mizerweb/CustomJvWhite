package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aob {
    public static final /* synthetic */ int i = 0;
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ifh g;
    public final ny8 h;

    public aob(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var8;
        this.g = new ifh(new w40(ny8Var7, 24));
        this.h = ny8Var6;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public static final Object a(aob aobVar, rt2 rt2Var, long j, nq4 nq4Var) {
        xnb xnbVar;
        xnb xnbVar2;
        long j2;
        long j3;
        boolean z;
        aobVar.getClass();
        if (nq4Var instanceof xnb) {
            xnbVar = (xnb) nq4Var;
            int i2 = xnbVar.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xnbVar.j = i2 - Integer.MIN_VALUE;
            } else {
                xnbVar = new xnb(aobVar, nq4Var);
            }
        } else {
            xnbVar = new xnb(aobVar, nq4Var);
        }
        xnb xnbVar3 = xnbVar;
        Object objC = xnbVar3.h;
        int i3 = xnbVar3.j;
        boolean z2 = true;
        Object obj = hu4.a;
        if (i3 == 0) {
            ch3.d0(objC);
            long jT = ((s7f) ((et3) aobVar.c.getValue())).t();
            if (jT == -1) {
                ore.k("logged out");
                return null;
            }
            xnbVar3.d = rt2Var;
            xnbVar3.e = j;
            xnbVar3.f = jT;
            xnbVar3.j = 1;
            xnbVar2 = xnbVar3;
            objC = aobVar.c(rt2Var, j, jT, xnbVar2);
            if (objC != obj) {
                j2 = jT;
                j3 = j;
            }
            return obj;
        }
        if (i3 == 1) {
            j2 = xnbVar3.f;
            long j4 = xnbVar3.e;
            rt2Var = xnbVar3.d;
            ch3.d0(objC);
            j3 = j4;
            xnbVar2 = xnbVar3;
        } else {
            if (i3 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = xnbVar3.g;
            ch3.d0(objC);
        }
        if (!((Boolean) objC).booleanValue() && !z) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
        boolean zBooleanValue = ((Boolean) objC).booleanValue();
        long j5 = rt2Var.b.a;
        xnbVar2.d = null;
        xnbVar2.e = j3;
        xnbVar2.f = j2;
        xnbVar2.g = zBooleanValue;
        xnbVar2.j = 2;
        Object objB = aobVar.b(j5, j3, xnbVar2);
        if (objB != obj) {
            objC = objB;
            z = zBooleanValue;
            if (!((Boolean) objC).booleanValue()) {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }
        return obj;
    }

    public final Object b(long j, long j2, nq4 nq4Var) {
        tnb tnbVar = (tnb) this.a.getValue();
        xmb xmbVar = new xmb(new ilb(j), j2);
        return ch3.H(nq4Var, new wj1(tnbVar, xmbVar, null, 4), tnbVar.a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object c(rt2 rt2Var, long j, long j2, nq4 nq4Var) {
        ynb ynbVar;
        if (nq4Var instanceof ynb) {
            ynbVar = (ynb) nq4Var;
            int i2 = ynbVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ynbVar.f = i2 - Integer.MIN_VALUE;
            } else {
                ynbVar = new ynb(this, nq4Var);
            }
        } else {
            ynbVar = new ynb(this, nq4Var);
        }
        ynb ynbVar2 = ynbVar;
        Object objA = ynbVar2.d;
        Object obj = hu4.a;
        int i3 = ynbVar2.f;
        if (i3 == 0) {
            ch3.d0(objA);
            if (rt2Var.z() >= j) {
                return Boolean.FALSE;
            }
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    StringBuilder sbS = qt4.s(rt2Var.a, "changeSelfReadMarkInChatsCache: chatId=", ", mark=");
                    sbS.append(j);
                    a4cVar.c(je9Var, "aob", sbS.toString(), null);
                }
            }
            lei leiVar = (lei) this.f.getValue();
            long j3 = rt2Var.a;
            ynbVar2.f = 1;
            objA = leiVar.a(j3, j2, j, (32 & 8) != 0 ? -1 : 0, (32 & 16) == 0, false, ynbVar2);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objA);
        }
        return Boolean.valueOf(objA != null);
    }

    public final void d(long j, long j2) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                StringBuilder sbS = qt4.s(j, "onNotificationsSelfReadMarkChanged: chatServerId=", ", mark=");
                sbS.append(j2);
                a4cVar.c(je9Var, "aob", sbS.toString(), null);
            }
        }
        yab.i0((wmi) this.h.getValue(), (xt4) this.g.getValue(), 0, new ag0(this, j, j2, null, 5), 2);
    }

    public final void e(long j, long j2) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                StringBuilder sbS = qt4.s(j, "onSelfReadMarkChangedByServerId: chatServerId=", ", mark=");
                sbS.append(j2);
                a4cVar.c(je9Var, "aob", sbS.toString(), null);
            }
        }
        yab.i0((wmi) this.h.getValue(), (xt4) this.g.getValue(), 0, new znb(this, j, j2, null), 2);
    }
}
