package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class ule implements qih {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final /* synthetic */ ek2 b;
    public final /* synthetic */ aq c;

    public ule(ek2 ek2Var, aq aqVar) {
        this.b = ek2Var;
        this.c = aqVar;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.qih
    public final Object i(yhh yhhVar, nq4 nq4Var) {
        sle sleVar;
        if (nq4Var instanceof sle) {
            sleVar = (sle) nq4Var;
            int i = sleVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                sleVar.g = i - Integer.MIN_VALUE;
            } else {
                sleVar = new sle(this, nq4Var);
            }
        } else {
            sleVar = new sle(this, nq4Var);
        }
        Object obj = sleVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = sleVar.g;
        String strG = null;
        if (i2 == 0) {
            ch3.d0(obj);
            if ((this.b.t() instanceof hib) && this.a.compareAndSet(false, true)) {
                boolean zA = ((qih) this.c).a();
                Object obj2 = this.c;
                if (zA) {
                    sleVar.d = yhhVar;
                    sleVar.g = 1;
                    if (((qih) obj2).i(yhhVar, sleVar) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    ((qih) obj2).f(yhhVar);
                }
            }
            return sbi.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        yhhVar = sleVar.d;
        ch3.d0(obj);
        hih hihVar = this.c.b;
        if (hihVar != null) {
            short sK = hihVar.k();
            kfc.c.getClass();
            strG = lhb.g(sK);
        }
        this.b.resumeWith(new poe(new TamErrorException(yhhVar, strG)));
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.qih
    public final Object k(kih kihVar, nq4 nq4Var) {
        tle tleVar;
        if (nq4Var instanceof tle) {
            tleVar = (tle) nq4Var;
            int i = tleVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                tleVar.g = i - Integer.MIN_VALUE;
            } else {
                tleVar = new tle(this, nq4Var);
            }
        } else {
            tleVar = new tle(this, nq4Var);
        }
        Object obj = tleVar.e;
        int i2 = tleVar.g;
        ek2 ek2Var = this.b;
        if (i2 == 0) {
            ch3.d0(obj);
            if ((ek2Var.t() instanceof hib) && this.a.compareAndSet(false, true)) {
                qih qihVar = (qih) this.c;
                if (qihVar.a()) {
                    tleVar.d = kihVar;
                    tleVar.g = 1;
                    Object objK = qihVar.k(kihVar, tleVar);
                    hu4 hu4Var = hu4.a;
                    if (objK == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    qihVar.b(kihVar);
                }
            }
            return sbi.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kihVar = tleVar.d;
        ch3.d0(obj);
        ek2Var.resumeWith(kihVar);
        return sbi.a;
    }
}
