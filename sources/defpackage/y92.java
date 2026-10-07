package defpackage;

import android.content.Context;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class y92 implements cs3 {
    public final xhh a;
    public final String b = y92.class.getName();
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public y92(ny8 ny8Var, ny8 ny8Var2, Context context, xhh xhhVar) {
        this.a = xhhVar;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = rx8.P(3, new n52(context, 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(y92 y92Var, sv1 sv1Var, nq4 nq4Var) {
        w92 w92Var;
        if (nq4Var instanceof w92) {
            w92Var = (w92) nq4Var;
            int i = w92Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                w92Var.f = i - Integer.MIN_VALUE;
            } else {
                w92Var = new w92(y92Var, nq4Var);
            }
        } else {
            w92Var = new w92(y92Var, nq4Var);
        }
        Object obj = w92Var.d;
        int i2 = w92Var.f;
        if (i2 == 0) {
            ch3.d0(obj);
            int currentInterruptionFilter = ((umb) y92Var.e.getValue()).b.getCurrentInterruptionFilter();
            if (currentInterruptionFilter == 0 || currentInterruptionFilter == 1 || !(currentInterruptionFilter == 2 || currentInterruptionFilter == 3 || currentInterruptionFilter == 4)) {
                return Boolean.FALSE;
            }
            qv5 qv5Var = qv5.SYSTEM_DO_NOT_DISTURB_MODE;
            w92Var.f = 1;
            Object objC = y92Var.c(sv1Var, qv5Var, w92Var);
            Object obj2 = hu4.a;
            if (objC == obj2) {
                return obj2;
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

    @Override // defpackage.cs3
    public final Object a(long j, ds3 ds3Var) {
        Object objK0 = yab.K0(((n0c) this.a).a(), new vq(this, j, (lq4) null, 7), ds3Var);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(sv1 sv1Var, qv5 qv5Var, nq4 nq4Var) {
        x92 x92Var;
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.f;
        if (nq4Var instanceof x92) {
            x92Var = (x92) nq4Var;
            int i = x92Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                x92Var.h = i - Integer.MIN_VALUE;
            } else {
                x92Var = new x92(this, nq4Var);
            }
        } else {
            x92Var = new x92(this, nq4Var);
        }
        Object num = x92Var.f;
        hu4 hu4Var = hu4.a;
        int i2 = x92Var.h;
        try {
            if (i2 == 0) {
                ch3.d0(num);
                ba2 ba2Var = (ba2) this.c.getValue();
                String strG = sv1Var.g();
                String str = qv5Var.a;
                x92Var.d = sv1Var;
                x92Var.e = qv5Var;
                x92Var.h = 1;
                num = ch3.I(x92Var, ba2Var.a, false, true, new z92(str, strG, 0));
                if (num == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qv5Var = x92Var.e;
                sv1Var = x92Var.d;
                ch3.d0(num);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String str2 = this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, "markDroppedAndSend: failed to update entry", th);
            }
            num = new Integer(0);
        }
        if (((Number) num).intValue() <= 0) {
            String str3 = this.b;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str3, "markDroppedAndSend: drop reason wasn't persisted, skip sending analytics", null);
            }
            return sbiVar;
        }
        ae9 ae9Var = (ae9) this.d.getValue();
        ul9 ul9Var = new ul9();
        ul9Var.put("p_op", "drop");
        ul9Var.put("chat_id", Long.valueOf(sv1Var.h()));
        ul9Var.put("call_id", sv1Var.g());
        ul9Var.put("p_dr", qv5Var.a);
        if (sv1Var instanceof pv1) {
            pv1 pv1Var = (pv1) sv1Var;
            ul9Var.put("trid", Long.valueOf(pv1Var.a));
            String str4 = pv1Var.b;
            if (str4 != null) {
                ul9Var.put("eKey", str4);
            }
            Long l = pv1Var.c;
            if (l != null) {
                ul9Var.put("suid", Long.valueOf(l.longValue()));
            }
        }
        ae9.k(ae9Var, "PUSH", "InboundCall", ul9Var.b(), 8);
        return sbiVar;
    }

    public final Object d(sv1 sv1Var, qv5 qv5Var, hki hkiVar) {
        Object objK0 = yab.K0(((n0c) this.a).a(), new f00(this, sv1Var, qv5Var, (lq4) null, 8), hkiVar);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }
}
