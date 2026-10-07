package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class aq {
    public final long a;
    public volatile hih b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final i64 d = new i64();
    public bq e;

    public aq(long j) {
        this.a = j;
    }

    public abstract Object m();

    public final pvb n() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        return bqVar.a();
    }

    public final t51 o() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        return bqVar.b();
    }

    public final qw2 p() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        return bqVar.c();
    }

    public final bi4 q() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        return (bi4) bqVar.l.getValue();
    }

    public final qfa r() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        return bqVar.i();
    }

    public final a0b s() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        return (a0b) bqVar.n.getValue();
    }

    public final zed t() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        return (zed) bqVar.c.getValue();
    }

    public String toString() {
        return getClass().getSimpleName() + "/requestId: " + this.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(nq4 nq4Var) {
        zp zpVar;
        if (nq4Var instanceof zp) {
            zpVar = (zp) nq4Var;
            int i = zpVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                zpVar.f = i - Integer.MIN_VALUE;
            } else {
                zpVar = new zp(this, nq4Var);
            }
        } else {
            zpVar = new zp(this, nq4Var);
        }
        Object objM = zpVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = zpVar.f;
        try {
            try {
                if (i2 == 0) {
                    ch3.d0(objM);
                    if (this.c.getAndSet(true)) {
                        i64 i64Var = this.d;
                        zpVar.f = 2;
                        Object objP = i64Var.p(zpVar);
                        if (objP != hu4Var) {
                            return objP;
                        }
                    } else {
                        zpVar.f = 1;
                        objM = m();
                        if (objM == hu4Var) {
                        }
                    }
                    return hu4Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        ch3.d0(objM);
                        return objM;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objM);
                hih hihVar = (hih) objM;
                this.b = hihVar;
                this.d.Q(hihVar);
                return hihVar;
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                gm0.V(getClass().getName(), "fail to await for requestJob", th);
                return null;
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th2) {
            gm0.V(getClass().getName(), "fail to create request", th2);
            this.d.j0(th2);
            this.c.set(false);
            return null;
        }
    }

    public final okh v() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        return bqVar.k();
    }
}
