package defpackage;

import android.database.SQLException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class obd implements pzh, f5e {
    public final zpe a;
    public final af4 b;
    public final boolean c;
    public final zv d = new zv();
    public volatile boolean e;

    public obd(zpe zpeVar, af4 af4Var, boolean z) {
        this.a = zpeVar;
        this.b = af4Var;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.gbd
    public final Object a(String str, cf7 cf7Var, nq4 nq4Var) {
        nbd nbdVar;
        af4 af4Var;
        if (nq4Var instanceof nbd) {
            nbdVar = (nbd) nq4Var;
            int i = nbdVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                nbdVar.i = i - Integer.MIN_VALUE;
            } else {
                nbdVar = new nbd(this, nq4Var);
            }
        } else {
            nbdVar = new nbd(this, nq4Var);
        }
        Object obj = nbdVar.g;
        hu4 hu4Var = hu4.a;
        int i2 = nbdVar.i;
        if (i2 == 0) {
            ch3.d0(obj);
            if (this.e) {
                n1g.a0(21, "Connection is recycled");
                throw null;
            }
            qd4 qd4Var = (qd4) nbdVar.getContext().x0(this.a);
            if (qd4Var == null || qd4Var.b != this) {
                n1g.a0(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            af4Var = this.b;
            nbdVar.d = str;
            nbdVar.e = cf7Var;
            nbdVar.f = af4Var;
            nbdVar.i = 1;
            if (af4Var.b.b(nbdVar) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            af4 af4Var2 = nbdVar.f;
            cf7Var = nbdVar.e;
            String str2 = nbdVar.d;
            ch3.d0(obj);
            af4Var = af4Var2;
            str = str2;
        }
        try {
            hbd hbdVar = new hbd(this, this.b.O0(str));
            try {
                Object objInvoke = cf7Var.invoke(hbdVar);
                p90.f(hbdVar, null);
                af4Var.g(null);
                return objInvoke;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p90.f(hbdVar, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            af4Var.g(null);
            throw th3;
        }
    }

    @Override // defpackage.pzh
    public final Boolean b(lq4 lq4Var) {
        if (this.e) {
            n1g.a0(21, "Connection is recycled");
            throw null;
        }
        qd4 qd4Var = (qd4) lq4Var.getContext().x0(this.a);
        if (qd4Var != null && qd4Var.b == this) {
            return Boolean.valueOf(!this.d.isEmpty() || this.b.a.G0());
        }
        n1g.a0(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // defpackage.f5e
    public final qxe c() {
        return this.b;
    }

    @Override // defpackage.pzh
    public final Object d(ozh ozhVar, qf7 qf7Var, mdh mdhVar) {
        if (this.e) {
            n1g.a0(21, "Connection is recycled");
            throw null;
        }
        qd4 qd4Var = (qd4) mdhVar.getContext().x0(this.a);
        if (qd4Var != null && qd4Var.b == this) {
            return g(ozhVar, qf7Var, mdhVar);
        }
        n1g.a0(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(ozh ozhVar, nq4 nq4Var) {
        kbd kbdVar;
        af4 af4Var;
        zv zvVar = this.d;
        if (nq4Var instanceof kbd) {
            kbdVar = (kbd) nq4Var;
            int i = kbdVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                kbdVar.h = i - Integer.MIN_VALUE;
            } else {
                kbdVar = new kbd(this, nq4Var);
            }
        } else {
            kbdVar = new kbd(this, nq4Var);
        }
        Object obj = kbdVar.f;
        int i2 = kbdVar.h;
        af4 af4Var2 = this.b;
        if (i2 == 0) {
            ch3.d0(obj);
            kbdVar.d = ozhVar;
            kbdVar.e = af4Var2;
            kbdVar.h = 1;
            Object objB = af4Var2.b.b(kbdVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            af4Var = af4Var2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            af4 af4Var3 = kbdVar.e;
            ozh ozhVar2 = kbdVar.d;
            ch3.d0(obj);
            af4Var = af4Var3;
            ozhVar = ozhVar2;
        }
        try {
            int i3 = zvVar.c;
            if (zvVar.isEmpty()) {
                int iOrdinal = ozhVar.ordinal();
                if (iOrdinal == 0) {
                    n1g.u(af4Var2, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    n1g.u(af4Var2, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n1g.u(af4Var2, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                n1g.u(af4Var2, "SAVEPOINT '" + i3 + '\'');
            }
            zvVar.addLast(new jbd(i3));
            sbi sbiVar = sbi.a;
            af4Var.g(null);
            return sbiVar;
        } catch (Throwable th) {
            af4Var.g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(boolean z, nq4 nq4Var) {
        lbd lbdVar;
        af4 af4Var;
        zv zvVar = this.d;
        if (nq4Var instanceof lbd) {
            lbdVar = (lbd) nq4Var;
            int i = lbdVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                lbdVar.h = i - Integer.MIN_VALUE;
            } else {
                lbdVar = new lbd(this, nq4Var);
            }
        } else {
            lbdVar = new lbd(this, nq4Var);
        }
        Object obj = lbdVar.f;
        int i2 = lbdVar.h;
        af4 af4Var2 = this.b;
        if (i2 == 0) {
            ch3.d0(obj);
            lbdVar.e = af4Var2;
            lbdVar.d = z;
            lbdVar.h = 1;
            Object objB = af4Var2.b.b(lbdVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            af4Var = af4Var2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = lbdVar.d;
            af4Var = lbdVar.e;
            ch3.d0(obj);
        }
        try {
            if (zvVar.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            jbd jbdVar = (jbd) cx3.f1(zvVar);
            if (z) {
                jbdVar.getClass();
                if (zvVar.isEmpty()) {
                    n1g.u(af4Var2, "END TRANSACTION");
                } else {
                    n1g.u(af4Var2, "RELEASE SAVEPOINT '" + jbdVar.a + '\'');
                }
            } else if (zvVar.isEmpty()) {
                n1g.u(af4Var2, "ROLLBACK TRANSACTION");
            } else {
                n1g.u(af4Var2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + jbdVar.a + '\'');
            }
            sbi sbiVar = sbi.a;
            af4Var.g(null);
            return sbiVar;
        } catch (Throwable th) {
            af4Var.g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(ozh ozhVar, qf7 qf7Var, nq4 nq4Var) throws Throwable {
        mbd mbdVar;
        SQLException e;
        Throwable th;
        int i;
        boolean z;
        if (nq4Var instanceof mbd) {
            mbdVar = (mbd) nq4Var;
            int i2 = mbdVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mbdVar.i = i2 - Integer.MIN_VALUE;
            } else {
                mbdVar = new mbd(this, nq4Var);
            }
        } else {
            mbdVar = new mbd(this, nq4Var);
        }
        Object objInvoke = mbdVar.g;
        int i3 = mbdVar.i;
        Object obj = hu4.a;
        try {
            if (i3 == 0) {
                ch3.d0(objInvoke);
                if (ozhVar == null) {
                    ozhVar = ozh.a;
                }
                mbdVar.d = qf7Var;
                mbdVar.i = 1;
                if (e(ozhVar, mbdVar) != obj) {
                }
                return obj;
            }
            if (i3 == 1) {
                qf7Var = (qf7) mbdVar.d;
                ch3.d0(objInvoke);
            } else {
                if (i3 != 2) {
                    if (i3 == 3 || i3 == 4) {
                        Object obj2 = mbdVar.d;
                        ch3.d0(objInvoke);
                        return obj2;
                    }
                    if (i3 != 5) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = mbdVar.e;
                    th = (Throwable) mbdVar.d;
                    try {
                        ch3.d0(objInvoke);
                        throw th;
                    } catch (SQLException e2) {
                        e = e2;
                        if (th != null) {
                            throw e;
                        }
                        gm0.b(th, e);
                        throw th;
                    }
                }
                i = mbdVar.f;
                ch3.d0(objInvoke);
            }
            z = i != 0;
            mbdVar.d = objInvoke;
            mbdVar.i = 3;
            if (f(z, mbdVar) != obj) {
                return obj;
            }
            return objInvoke;
            ibd ibdVar = new ibd(this);
            mbdVar.d = null;
            mbdVar.f = 1;
            mbdVar.i = 2;
            objInvoke = qf7Var.invoke(ibdVar, mbdVar);
            if (objInvoke != obj) {
                i = 1;
                if (i != 0) {
                }
                mbdVar.d = objInvoke;
                mbdVar.i = 3;
                if (f(z, mbdVar) != obj) {
                    return objInvoke;
                }
            }
            return obj;
        } catch (Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (Throwable th3) {
                try {
                    mbdVar.d = th;
                    mbdVar.e = th3;
                    mbdVar.i = 5;
                    if (f(false, mbdVar) != obj) {
                        throw th3;
                    }
                } catch (SQLException e3) {
                    e = e3;
                    th = th3;
                    if (th != null) {
                        throw e;
                    }
                    gm0.b(th, e);
                    throw th;
                }
            }
        }
    }
}
