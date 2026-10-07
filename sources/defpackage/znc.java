package defpackage;

import android.database.SQLException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class znc implements pzh, f5e {
    public final qf7 a;
    public final qxe b;
    public final AtomicInteger c = new AtomicInteger(0);
    public ozh d;

    public znc(qf7 qf7Var, qxe qxeVar) {
        this.a = qf7Var;
        this.b = qxeVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.gbd
    public final Object a(String str, cf7 cf7Var, nq4 nq4Var) {
        xnc xncVar;
        if (nq4Var instanceof xnc) {
            xncVar = (xnc) nq4Var;
            int i = xncVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                xncVar.h = i - Integer.MIN_VALUE;
            } else {
                xncVar = new xnc(this, nq4Var);
            }
        } else {
            xncVar = new xnc(this, nq4Var);
        }
        Object objB = xncVar.f;
        int i2 = xncVar.h;
        Object obj = hu4.a;
        if (i2 == 0) {
            ch3.d0(objB);
            xncVar.d = str;
            xncVar.e = cf7Var;
            xncVar.h = 1;
            objB = b(xncVar);
            if (objB != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objB);
                return objB;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        cf7Var = xncVar.e;
        str = xncVar.d;
        ch3.d0(objB);
        if (((Boolean) objB).booleanValue()) {
            ync yncVar = new ync(this, str, cf7Var, null);
            xncVar.d = null;
            xncVar.e = null;
            xncVar.h = 2;
            Object objInvoke = this.a.invoke(yncVar, xncVar);
            return objInvoke == obj ? obj : objInvoke;
        }
        vxe vxeVarO0 = this.b.O0(str);
        try {
            Object objInvoke2 = cf7Var.invoke(vxeVarO0);
            p90.f(vxeVarO0, null);
            return objInvoke2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p90.f(vxeVarO0, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.pzh
    public final Boolean b(lq4 lq4Var) {
        return Boolean.valueOf(this.d != null || this.b.G0());
    }

    @Override // defpackage.f5e
    public final qxe c() {
        return this.b;
    }

    @Override // defpackage.pzh
    public final Object d(ozh ozhVar, qf7 qf7Var, mdh mdhVar) {
        return this.a.invoke(new v6c(this, ozhVar, qf7Var, null), mdhVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ozh ozhVar, qf7 qf7Var, nq4 nq4Var) {
        wnc wncVar;
        if (nq4Var instanceof wnc) {
            wncVar = (wnc) nq4Var;
            int i = wncVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                wncVar.g = i - Integer.MIN_VALUE;
            } else {
                wncVar = new wnc(this, nq4Var);
            }
        } else {
            wncVar = new wnc(this, nq4Var);
        }
        Object objInvoke = wncVar.e;
        int i2 = wncVar.g;
        AtomicInteger atomicInteger = this.c;
        int i3 = 1;
        qxe qxeVar = this.b;
        try {
            if (i2 == 0) {
                ch3.d0(objInvoke);
                int iOrdinal = ozhVar.ordinal();
                if (iOrdinal == 0) {
                    n1g.u(qxeVar, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    n1g.u(qxeVar, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        ore.o();
                        return null;
                    }
                    n1g.u(qxeVar, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (atomicInteger.incrementAndGet() > 0) {
                    this.d = ozhVar;
                }
                Object vncVar = new vnc(this);
                wncVar.d = 1;
                wncVar.g = 1;
                objInvoke = qf7Var.invoke(vncVar, wncVar);
                Object obj = hu4.a;
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = wncVar.d;
                ch3.d0(objInvoke);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.d = null;
            }
            if (i3 != 0) {
                n1g.u(qxeVar, "END TRANSACTION");
                return objInvoke;
            }
            n1g.u(qxeVar, "ROLLBACK TRANSACTION");
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    n1g.u(qxeVar, "ROLLBACK TRANSACTION");
                } catch (SQLException e) {
                    gm0.b(th, e);
                }
                throw th2;
            }
        }
    }
}
