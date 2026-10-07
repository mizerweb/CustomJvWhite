package defpackage;

import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class rm2 implements pl2 {
    public static final boolean f;
    public final Provider a;
    public final omi b;
    public final iwh c;
    public final ifh d;
    public final ifh e = new ifh(new yk1(19, this));

    static {
        f = uk5.a(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public rm2(kg2 kg2Var, Provider provider, omi omiVar, iwh iwhVar) {
        this.a = provider;
        this.b = omiVar;
        this.c = iwhVar;
        this.d = new ifh(new ql2(kg2Var, 1));
    }

    @Override // defpackage.pl2
    public final am2 a(int i, int i2) {
        pm2 pm2Var = (pm2) this.e.getValue();
        pm2Var.getClass();
        return new am2(pm2Var, i, i2);
    }

    @Override // defpackage.pl2
    public final void b(int i) {
        ((pm2) this.e.getValue()).l = i;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.pl2
    public final Object c(List list, int i, t94 t94Var, int i2, int i3, int i4, nq4 nq4Var) {
        qm2 qm2Var;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        if (nq4Var instanceof qm2) {
            qm2Var = (qm2) nq4Var;
            int i7 = qm2Var.g;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                qm2Var.g = i7 - Integer.MIN_VALUE;
            } else {
                qm2Var = new qm2(this, nq4Var);
            }
        } else {
            qm2Var = new qm2(this, nq4Var);
        }
        qm2 qm2Var2 = qm2Var;
        Object obj = qm2Var2.e;
        int i8 = qm2Var2.g;
        lq4 lq4Var = null;
        if (i8 == 0) {
            ch3.d0(obj);
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        hl2 hl2Var = (hl2) it.next();
                        boolean zBooleanValue = ((Boolean) this.d.getValue()).booleanValue();
                        int i9 = hl2Var.c;
                        i5 = i;
                        if (i5 != 3 || zBooleanValue) {
                            i6 = (i9 == -1 || i9 == 5) ? 2 : -1;
                        } else {
                            i6 = 4;
                        }
                        if (i6 != -1) {
                            i9 = i6;
                        }
                        if (i9 == 2) {
                            Integer num = (Integer) this.c.e.d();
                            z = num != null && num.intValue() == 1;
                        }
                    } else {
                        i5 = i;
                    }
                }
            } else {
                i5 = i;
            }
            pm2 pm2Var = (pm2) this.e.getValue();
            qm2Var2.d = z;
            qm2Var2.g = 1;
            Object objC = pm2Var.c(list, i5, t94Var, i2, i3, i4, qm2Var2);
            hu4 hu4Var = hu4.a;
            if (objC == hu4Var) {
                return hu4Var;
            }
            boolean z3 = z;
            obj = objC;
            z2 = z3;
        } else {
            if (i8 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = qm2Var2.d;
            ch3.d0(obj);
        }
        List list2 = (List) obj;
        if (z2) {
            yab.i0(this.b.f, null, 0, new qt1(list2, this, lq4Var, 20), 3);
        }
        return list2;
    }
}
