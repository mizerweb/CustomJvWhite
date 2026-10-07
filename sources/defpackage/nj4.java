package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nj4 {
    public final wmi a;
    public final ny8 b;
    public final ny8 c;
    public final String d = nj4.class.getName();

    public nj4(ny8 ny8Var, ny8 ny8Var2, wmi wmiVar) {
        this.a = wmiVar;
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object a(nj4 nj4Var, long j, boolean z, nq4 nq4Var) {
        lj4 lj4Var;
        Object objS;
        nj4Var.getClass();
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof lj4) {
            lj4Var = (lj4) nq4Var;
            int i = lj4Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                lj4Var.h = i - Integer.MIN_VALUE;
            } else {
                lj4Var = new lj4(nj4Var, nq4Var);
            }
        } else {
            lj4Var = new lj4(nj4Var, nq4Var);
        }
        Object objC = lj4Var.f;
        hu4 hu4Var = hu4.a;
        int i2 = lj4Var.h;
        if (i2 == 0) {
            ch3.d0(objC);
            nv7 nv7Var = (nv7) nj4Var.b.getValue();
            lj4Var.d = j;
            lj4Var.e = z;
            lj4Var.h = 1;
            objC = nv7Var.c(j, z, lj4Var);
            if (objC != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objC);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = lj4Var.e;
        j = lj4Var.d;
        ch3.d0(objC);
        boolean zBooleanValue = ((Boolean) objC).booleanValue();
        String str = nj4Var.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                StringBuilder sbU = qt4.u(j, "applyNetwork: userId=", ", hidden=", z);
                sbU.append(", enqueued=");
                sbU.append(zBooleanValue);
                a4cVar.c(je9Var, str, sbU.toString(), null);
            }
        }
        if (!zBooleanValue) {
            lj4Var.d = j;
            lj4Var.e = z;
            lj4Var.h = 2;
            ny8 ny8Var = nj4Var.c;
            if (z) {
                objS = ((aj5) ny8Var.getValue()).s(j, lj4Var);
                if (objS != hu4Var) {
                    objS = sbiVar;
                }
            } else {
                objS = ((aj5) ny8Var.getValue()).e().g(j, lj4Var);
                if (objS != hu4Var) {
                    objS = sbiVar;
                }
                if (objS != hu4Var) {
                    objS = sbiVar;
                }
            }
            if (objS == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0082 A[PHI: r5
  0x0082: PHI (r5v5 java.lang.Object) = (r5v4 java.lang.Object), (r5v10 java.lang.Object) binds: [B:33:0x008e, B:30:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, boolean z, nq4 nq4Var) {
        kj4 kj4Var;
        Object objS;
        if (nq4Var instanceof kj4) {
            kj4Var = (kj4) nq4Var;
            int i = kj4Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                kj4Var.f = i - Integer.MIN_VALUE;
            } else {
                kj4Var = new kj4(this, nq4Var);
            }
        } else {
            kj4Var = new kj4(this, nq4Var);
        }
        Object obj = kj4Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = kj4Var.f;
        if (i2 == 0) {
            ch3.d0(obj);
            if (((nv7) this.b.getValue()).b(j) == z) {
                String str = this.d;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        StringBuilder sbU = qt4.u(j, "applyLocal: userId=", " already at hidden=", z);
                        sbU.append(", skip");
                        a4cVar.c(je9Var, str, sbU.toString(), null);
                    }
                }
                return Boolean.FALSE;
            }
            kj4Var.f = 1;
            Object obj2 = sbi.a;
            ny8 ny8Var = this.c;
            if (z) {
                objS = ((aj5) ny8Var.getValue()).e().g(j, kj4Var);
                if (objS != hu4Var) {
                    objS = obj2;
                }
                if (objS == hu4Var) {
                    obj2 = objS;
                }
            } else {
                objS = ((aj5) ny8Var.getValue()).s(j, kj4Var);
                if (objS == hu4Var) {
                    obj2 = objS;
                }
            }
            if (obj2 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j, boolean z, nq4 nq4Var) {
        mj4 mj4Var;
        if (nq4Var instanceof mj4) {
            mj4Var = (mj4) nq4Var;
            int i = mj4Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                mj4Var.h = i - Integer.MIN_VALUE;
            } else {
                mj4Var = new mj4(this, nq4Var);
            }
        } else {
            mj4Var = new mj4(this, nq4Var);
        }
        Object objB = mj4Var.f;
        Object obj = hu4.a;
        int i2 = mj4Var.h;
        if (i2 == 0) {
            ch3.d0(objB);
            String str = this.d;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, bc1.l(j, "execute: userId=", ", hidden=", z), null);
                }
            }
            mj4Var.d = j;
            mj4Var.e = z;
            mj4Var.h = 1;
            objB = b(j, z, mj4Var);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = mj4Var.e;
            j = mj4Var.d;
            ch3.d0(objB);
        }
        long j2 = j;
        boolean z2 = z;
        if (((Boolean) objB).booleanValue()) {
            yab.i0(this.a, null, 0, new c03(this, j2, z2, null, 5), 3);
        }
        return sbi.a;
    }
}
