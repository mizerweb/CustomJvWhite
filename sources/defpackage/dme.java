package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class dme implements nnf {
    public final pfh a;
    public final pfh b;
    public final fi3 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ifh j;
    public final ifh k;
    public final ifh l;
    public final ny8 m;
    public final nah n;
    public volatile boolean o;
    public final ifh p;
    public final ConcurrentHashMap q;
    public final ConcurrentHashMap.KeySetView r;
    public final String s;

    public dme(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ifh ifhVar, ifh ifhVar2, ifh ifhVar3, ny8 ny8Var4, ny8 ny8Var5, rc5 rc5Var, ny8 ny8Var6, onf onfVar, ny8 ny8Var7, ite iteVar, fi3 fi3Var) {
        pfh pfhVar = new pfh(0);
        pfh pfhVar2 = new pfh(2);
        this.a = pfhVar;
        this.b = pfhVar2;
        this.c = fi3Var;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var4;
        this.h = ny8Var5;
        this.i = ny8Var7;
        this.j = ifhVar;
        this.k = ifhVar2;
        this.l = ifhVar3;
        this.m = ny8Var6;
        this.n = wk8.a();
        this.p = new ifh(new z5(iteVar, this, ifhVar2, 10));
        this.q = new ConcurrentHashMap();
        this.r = ConcurrentHashMap.newKeySet();
        this.s = dme.class.getName();
        ((rnf) onfVar).c(this);
        rc5Var.n = this;
    }

    public static final long a(dme dmeVar, hih hihVar) {
        long jG = ew5.g(dmeVar.a.m());
        ole oleVar = (ole) dmeVar.q.get(Short.valueOf(hihVar.k()));
        if (oleVar == null) {
            return jG;
        }
        float fB = i4e.b.b() * 0.2f;
        return hihVar.n().d(oleVar.a, oleVar.b, fB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(dme dmeVar, long j, nq4 nq4Var) {
        zle zleVar;
        boolean zRemove;
        boolean z;
        if (nq4Var instanceof zle) {
            zleVar = (zle) nq4Var;
            int i = zleVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                zleVar.g = i - Integer.MIN_VALUE;
            } else {
                zleVar = new zle(dmeVar, nq4Var);
            }
        } else {
            zleVar = new zle(dmeVar, nq4Var);
        }
        Object obj = zleVar.e;
        int i2 = zleVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            zRemove = dmeVar.r.remove(new Long(j));
            if (zRemove) {
                okh okhVar = (okh) dmeVar.d.getValue();
                zleVar.d = zRemove;
                zleVar.g = 1;
                Object objM = okhVar.m(j, zleVar);
                hu4 hu4Var = hu4.a;
                if (objM == hu4Var) {
                    return hu4Var;
                }
                z = zRemove;
            }
            return Boolean.valueOf(zRemove);
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = zleVar.d;
        ch3.d0(obj);
        zRemove = z;
        return Boolean.valueOf(zRemove);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object d(dme dmeVar, aq aqVar, yhh yhhVar, nq4 nq4Var) {
        bme bmeVar;
        dmeVar.getClass();
        je9 je9Var = je9.f;
        if (nq4Var instanceof bme) {
            bmeVar = (bme) nq4Var;
            int i = bmeVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                bmeVar.h = i - Integer.MIN_VALUE;
            } else {
                bmeVar = new bme(dmeVar, nq4Var);
            }
        } else {
            bmeVar = new bme(dmeVar, nq4Var);
        }
        Object obj = bmeVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = bmeVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            String str = dmeVar.s;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onTaskFailed " + aqVar + "|" + yhhVar, null);
            }
            if ("proto.ver".equals(yhhVar.b)) {
                gm0.x(dmeVar.s, "got version error: mark current version as deprecated, close connection", null);
                ((agb) dmeVar.j().i.get()).w(false);
            }
            if (aqVar instanceof btc) {
                ate ateVar = (ate) dmeVar.e.getValue();
                long j = aqVar.a;
                bmeVar.d = aqVar;
                bmeVar.e = yhhVar;
                bmeVar.h = 1;
                if (ateVar.a(j, bmeVar) == hu4Var) {
                    return hu4Var;
                }
            }
            return sbi.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        yhhVar = bmeVar.e;
        aqVar = bmeVar.d;
        ch3.d0(obj);
        if ("proto.payload".equals(yhhVar.b)) {
            try {
                ((btc) aqVar).d();
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                String str2 = dmeVar.s;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, "fail to onMaxFailCount for " + aqVar + " type=" + ((btc) aqVar).getType(), th);
                }
            }
        }
        ((dkh) dmeVar.h.getValue()).a();
        ((wzj) dmeVar.g.getValue()).b();
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ea, code lost:
    
        if (r15 == r2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011b, code lost:
    
        if (r15 == r2) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(defpackage.dme r13, defpackage.aq r14, defpackage.nq4 r15) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dme.e(dme, aq, nq4):java.lang.Object");
    }

    @Override // defpackage.nnf
    public final void b(int i) {
        if (i == 2) {
            qmf qmfVar = new qmf(((s7f) i()).g());
            h(qmfVar, qmfVar, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ea, code lost:
    
        if (r0.e(r7, r3) == r4) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.ctc r18, defpackage.cf7 r19, defpackage.nq4 r20) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dme.f(ctc, cf7, nq4):java.lang.Object");
    }

    public final Object g(hih hihVar, lq4 lq4Var) {
        ek2 ek2Var = new ek2(1, p90.B(lq4Var));
        ek2Var.u();
        ek2Var.w(new jl3(this, 1, hihVar));
        j().e(false);
        vbf vbfVar = new vbf();
        vbfVar.b = ek2Var;
        vbfVar.c = hihVar;
        vbfVar.a = new AtomicBoolean(false);
        mih mihVarJ = j();
        long jA = a(this, hihVar);
        agb agbVar = (agb) mihVarJ.i.get();
        if (agbVar != null) {
            agbVar.j(hihVar, false, jA, vbfVar);
        }
        return ek2Var.s();
    }

    public final long h(aq aqVar, qih qihVar, boolean z) {
        String str = this.s;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "executeTask " + aqVar + ", isRetry=" + z, null);
            }
        }
        j().e(false);
        yab.i0(k(), (xt4) this.j.getValue(), 0, new rle(aqVar, this, z, new yle(this, aqVar, qihVar), qihVar, null), 2);
        return aqVar.a;
    }

    public final et3 i() {
        return (et3) this.f.getValue();
    }

    public final mih j() {
        return (mih) this.m.getValue();
    }

    public final gu4 k() {
        return (gu4) this.p.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(nq4 nq4Var) {
        ame ameVar;
        if (nq4Var instanceof ame) {
            ameVar = (ame) nq4Var;
            int i = ameVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ameVar.f = i - Integer.MIN_VALUE;
            } else {
                ameVar = new ame(this, nq4Var);
            }
        } else {
            ameVar = new ame(this, nq4Var);
        }
        Object objM0 = ameVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = ameVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(objM0);
                gm0.x(this.s, "logoutAndSessionClose started", null);
                this.o = true;
                vd7.g(this.n);
                ah9 ah9Var = (ah9) this.c.invoke();
                ghb ghbVar = ew5.b;
                long jO = qe7.O(5, lw5.SECONDS);
                gce gceVar = new gce(this, ah9Var, null, 4);
                ameVar.f = 1;
                objM0 = lvb.M0(jO, gceVar, ameVar);
                if (objM0 == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objM0);
            }
            if (((kih) objM0) == null) {
                gm0.Y(this.s, "logoutAndSessionClose: timeout!");
            }
            ((agb) j().i.get()).h(true);
            gm0.x(this.s, "logoutAndSessionClose finished", null);
            this.o = false;
            return sbi.a;
        } catch (Throwable th) {
            this.o = false;
            throw th;
        }
    }

    public final void m(boolean z) {
        mih mihVarJ = j();
        mihVarJ.j.set(ew5.g(mihVarJ.b.m()));
        if (z) {
            this.q.clear();
            if (this.m.d()) {
                agb agbVar = (agb) j().i.get();
                agbVar.j.set(0L);
                agbVar.i.set(0);
                gm0.n(agbVar.a, "resetConnectionTimeout");
            }
        }
    }
}
