package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xkh {
    public final rre a;
    public final pl b = new pl(27, this);

    public xkh(rre rreVar) {
        this.a = rreVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:? A[LOOP:0: B:17:0x0064->B:36:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008f -> B:24:0x0092). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Object c(defpackage.xkh r11, java.util.Collection r12, defpackage.nq4 r13) {
        /*
            boolean r0 = r13 instanceof defpackage.tkh
            if (r0 == 0) goto L13
            r0 = r13
            tkh r0 = (defpackage.tkh) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            tkh r0 = new tkh
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.l
            int r1 = r0.n
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L4d
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            java.util.ArrayList r11 = r0.f
            defpackage.ch3.d0(r13)
            goto Lb5
        L2c:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r11)
            return r4
        L32:
            int r11 = r0.k
            int r12 = r0.j
            int r1 = r0.i
            int r5 = r0.h
            int r6 = r0.g
            java.util.ArrayList r7 = r0.f
            java.util.Iterator r8 = r0.e
            xkh r9 = r0.d
            defpackage.ch3.d0(r13)
            r13 = r1
            r1 = r11
            r11 = r7
            r7 = r6
            r6 = r5
            r5 = r12
            r12 = r9
            goto L92
        L4d:
            defpackage.ch3.d0(r13)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
            java.util.ArrayList r13 = new java.util.ArrayList
            r1 = 100
            r13.<init>(r1)
            r5 = 0
            r8 = r12
            r7 = r1
            r6 = r5
            r12 = r11
            r11 = r13
            r13 = r7
        L64:
            boolean r9 = r8.hasNext()
            hu4 r10 = defpackage.hu4.a
            if (r9 == 0) goto L96
            java.lang.Object r9 = r8.next()
            r11.add(r9)
            int r9 = r11.size()
            if (r9 != r13) goto L64
            r0.d = r12
            r0.e = r8
            r0.f = r11
            r0.g = r7
            r0.h = r6
            r0.i = r13
            r0.j = r5
            r0.k = r1
            r0.n = r3
            java.lang.Object r9 = r12.a(r11, r0)
            if (r9 != r10) goto L92
            goto Lb4
        L92:
            r11.clear()
            goto L64
        L96:
            boolean r3 = r11.isEmpty()
            if (r3 != 0) goto Lb8
            r0.d = r4
            r0.e = r4
            r0.f = r11
            r0.g = r7
            r0.h = r6
            r0.i = r13
            r0.j = r5
            r0.k = r1
            r0.n = r2
            java.lang.Object r12 = r12.a(r11, r0)
            if (r12 != r10) goto Lb5
        Lb4:
            return r10
        Lb5:
            r11.clear()
        Lb8:
            sbi r11 = defpackage.sbi.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkh.c(xkh, java.util.Collection, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object d(xkh xkhVar, ArrayList arrayList, nq4 nq4Var) {
        ukh ukhVar;
        Iterator it;
        int i;
        Object obj;
        hu4 hu4Var;
        if (nq4Var instanceof ukh) {
            ukhVar = (ukh) nq4Var;
            int i2 = ukhVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ukhVar.i = i2 - Integer.MIN_VALUE;
            } else {
                ukhVar = new ukh(xkhVar, nq4Var);
            }
        } else {
            ukhVar = new ukh(xkhVar, nq4Var);
        }
        Object obj2 = ukhVar.g;
        int i3 = ukhVar.i;
        if (i3 == 0) {
            ch3.d0(obj2);
            it = arrayList.iterator();
            i = 0;
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = ukhVar.f;
            Iterator it2 = ukhVar.e;
            xkh xkhVar2 = ukhVar.d;
            ch3.d0(obj2);
            it = it2;
            i = i4;
            xkhVar = xkhVar2;
        }
        do {
            boolean zHasNext = it.hasNext();
            obj = sbi.a;
            if (!zHasNext) {
                return obj;
            }
            btc btcVar = (btc) it.next();
            long id = btcVar.getId();
            byte[] bArrG = btcVar.g();
            ukhVar.d = xkhVar;
            ukhVar.e = it;
            ukhVar.f = i;
            ukhVar.i = 1;
            Object objI = ch3.I(ukhVar, xkhVar.a, false, true, new wkh(0, id, bArrG));
            hu4Var = hu4.a;
            if (objI == hu4Var) {
                obj = objI;
            }
        } while (obj != hu4Var);
        return hu4Var;
    }

    public final Object a(ArrayList arrayList, tkh tkhVar) {
        StringBuilder sbC = nbh.C("DELETE FROM tasks WHERE id in (");
        vd7.b(sbC, arrayList.size());
        sbC.append(")");
        Object objI = ch3.I(tkhVar, this.a, false, true, new xmg(sbC.toString(), arrayList));
        return objI == hu4.a ? objI : sbi.a;
    }

    public final Object b(List list, nq4 nq4Var) {
        return ch3.I(nq4Var, this.a, true, false, new yn6(nbh.x(")", nbh.C("SELECT COUNT(*) FROM tasks where type in ("), list), list, this, 5));
    }
}
