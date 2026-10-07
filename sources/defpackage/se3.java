package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class se3 {
    public static final /* synthetic */ int m = 0;
    public final long a;
    public final gjf b;
    public final xn3 c;
    public final iua d;
    public final ifh e;
    public volatile sgg f;
    public volatile kx2 g;
    public volatile long h;
    public volatile long i;
    public volatile boolean j;
    public final ny8 k;
    public final vt4 l;

    public se3(long j, ft0 ft0Var, yt4 yt4Var, ny8 ny8Var, ny8 ny8Var2, gjf gjfVar, xn3 xn3Var, iua iuaVar) {
        this.a = j;
        this.b = gjfVar;
        this.c = xn3Var;
        this.d = iuaVar;
        int i = 0;
        this.e = new ifh(new oe3(ny8Var, ny8Var2, i));
        ghb ghbVar = ew5.b;
        this.i = 0L;
        this.k = rx8.P(2, new pe3(i, this));
        xt4 xt4Var = (xt4) ft0Var.a;
        xt4Var.getClass();
        this.l = lvb.x0(xt4Var, yt4Var);
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "se3", zo5.j(j, "init #"), null);
        }
    }

    public final rt2 a() {
        return (rt2) this.c.k(this.a).a.getValue();
    }

    public final Object b(long j, nq4 nq4Var) throws TamErrorException {
        sbi sbiVar = sbi.a;
        if (this.c.j().V(a())) {
            gm0.W("se3", "requestForChatSubscribeIfNeed failed, saved messages chat!", new Long(this.a));
            return sbiVar;
        }
        if (j == 0) {
            gm0.W("se3", "requestForChatSubscribeIfNeed #%d: invalid serverId == 0L", new Long(this.a));
            return sbiVar;
        }
        ghb ghbVar = ew5.b;
        long jP = qe7.P(System.nanoTime(), lw5.NANOSECONDS);
        long jO = ew5.o(jP, this.i);
        if (ew5.d(jO, ((ew5) this.k.getValue()).a) < 0) {
            gm0.W("se3", "requestForChatSubscribeIfNeed #%d: request diff = %s", new Long(this.a), new ew5(jO));
            return sbiVar;
        }
        if (!((Boolean) this.d.invoke()).booleanValue()) {
            gm0.Y("se3", "requestForChatSubscribeIfNeed: needSubscribeToPushes return false!");
            return sbiVar;
        }
        this.i = jP;
        Object objA = ((ne3) this.e.getValue()).a(j, true, 0L, nq4Var);
        hu4 hu4Var = hu4.a;
        if (objA != hu4Var) {
            objA = sbiVar;
        }
        return objA == hu4Var ? objA : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(nq4 nq4Var) {
        re3 re3Var;
        rt2 rt2VarE;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof re3) {
            re3Var = (re3) nq4Var;
            int i = re3Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                re3Var.f = i - Integer.MIN_VALUE;
            } else {
                re3Var = new re3(this, nq4Var);
            }
        } else {
            re3Var = new re3(this, nq4Var);
        }
        Object obj = re3Var.d;
        Object obj2 = hu4.a;
        int i2 = re3Var.f;
        if (i2 == 0) {
            ch3.d0(obj);
            gm0.m("se3", "subscribe() #%d", new Long(this.a));
            if (this.j) {
                re3Var.f = 1;
                if (d(re3Var) == obj2) {
                    return obj2;
                }
                return sbiVar;
            }
            rt2 rt2VarA = a();
            if (rt2VarA != null && (rt2VarE = e(rt2VarA)) != null) {
                this.g = rt2VarE.b.c;
                this.h = rt2VarE.b.a;
                long jA = rt2VarE.A();
                re3Var.f = 2;
                if (b(jA, re3Var) != obj2) {
                }
                return obj2;
            }
            return sbiVar;
        }
        if (i2 == 1) {
            ch3.d0(obj);
            return sbiVar;
        }
        if (i2 == 2) {
            ch3.d0(obj);
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                if (i2 == 5) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        if (this.j) {
            re3Var.f = 4;
            if (d(re3Var) != obj2) {
                return obj2;
            }
            return sbiVar;
        }
        re3Var.f = 5;
        if (c(re3Var) != obj2) {
            return obj2;
        }
        return sbiVar;
        long j = ((ew5) this.k.getValue()).a;
        re3Var.f = 3;
        if (rx8.u(j, re3Var) != obj2) {
            if (this.j) {
                re3Var.f = 4;
                if (d(re3Var) != obj2) {
                    return sbiVar;
                }
            } else {
                re3Var.f = 5;
                if (c(re3Var) != obj2) {
                    return sbiVar;
                }
            }
        }
        return obj2;
    }

    public final Object d(nq4 nq4Var) throws TamErrorException {
        sbi sbiVar = sbi.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "se3", zo5.j(this.a, "unsubscribe() #"), null);
            }
        }
        ghb ghbVar = ew5.b;
        this.i = 0L;
        rt2 rt2VarE = e(a());
        if (rt2VarE != null) {
            Object objA = ((ne3) this.e.getValue()).a(rt2VarE.A(), false, 0L, nq4Var);
            hu4 hu4Var = hu4.a;
            if (objA != hu4Var) {
                objA = sbiVar;
            }
            if (objA == hu4Var) {
                return objA;
            }
        }
        return sbiVar;
    }

    public final rt2 e(rt2 rt2Var) {
        rt2 rt2VarA = a();
        long j = this.a;
        if (rt2VarA == null) {
            gm0.W("se3", "validate #%d: chat is null", Long.valueOf(j));
            return null;
        }
        if (this.c.j().V(a())) {
            return null;
        }
        if (rt2VarA.A() == 0) {
            gm0.W("se3", "validate #%d: chatServerId == 0L", Long.valueOf(j));
            return null;
        }
        if (rt2VarA.W() || rt2VarA.o0()) {
            gm0.m("se3", "validate #%d: chat is valid!", Long.valueOf(j));
            return rt2Var;
        }
        gm0.W("se3", "validate #%d: invalid chat status %s", Long.valueOf(j), rt2VarA.b.c);
        return null;
    }
}
