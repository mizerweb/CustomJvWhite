package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class rt0 extends cr0 {
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final String h;

    public rt0(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ed6 ed6Var, ny8 ny8Var4) {
        super(ny8Var, ny8Var2, ed6Var);
        this.e = ny8Var;
        this.f = ny8Var3;
        this.g = ny8Var4;
        this.h = rt0.class.getName();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        if (r9.i(r6, r0) == r5) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(defpackage.rt0 r9, java.lang.String r10, java.util.Set r11, defpackage.nq4 r12) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rt0.h(rt0, java.lang.String, java.util.Set, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:45:0x0121  */
    /* JADX WARN: Code duplicated, block: B:48:0x0125  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0125 -> B:14:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i(java.util.Collection r21, defpackage.nq4 r22) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rt0.i(java.util.Collection, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(String str, Set set, nq4 nq4Var) {
        pt0 pt0Var;
        if (nq4Var instanceof pt0) {
            pt0Var = (pt0) nq4Var;
            int i = pt0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pt0Var.f = i - Integer.MIN_VALUE;
            } else {
                pt0Var = new pt0(this, nq4Var);
            }
        } else {
            pt0Var = new pt0(this, nq4Var);
        }
        Object obj = pt0Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = pt0Var.f;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            if (set.isEmpty()) {
                return Boolean.TRUE;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                rt2 rt2Var = (rt2) ((xn3) this.f.getValue()).k(((Number) it.next()).longValue()).a.getValue();
                Long l = rt2Var != null ? new Long(rt2Var.A()) : null;
                if (l != null) {
                    arrayList.add(l);
                }
            }
            Set setX1 = ww3.X1(arrayList);
            pt0Var.f = 1;
            Object objH = h(this, str, setX1, pt0Var);
            return objH == hu4Var ? hu4Var : objH;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String str2 = this.h;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, qv1.k("Fail to pin chat with multiselect, because ", th.getMessage()), null);
                }
            }
            return Boolean.FALSE;
        }
    }
}
