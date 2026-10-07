package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y34 {
    public static final /* synthetic */ zv8[] m;
    public final long a;
    public final xhh b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final long[] g;
    public final mjg h;
    public final r8e i;
    public m8b j;
    public final dq4 k;
    public final p3c l;

    static {
        z8b z8bVar = new z8b(y34.class, "loadMoreJob", "getLoadMoreJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        m = new zv8[]{z8bVar};
    }

    public y34(long j, xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = j;
        this.b = xhhVar;
        this.c = ny8Var4;
        this.d = ny8Var3;
        this.e = ny8Var2;
        this.f = ny8Var;
        this.g = new long[]{j};
        mjg mjgVarA = p90.a(a44.a);
        this.h = mjgVarA;
        this.i = new r8e(mjgVarA);
        this.j = new m8b(10);
        dq4 dq4VarA = cqk.a(((n0c) xhhVar).a());
        this.k = dq4VarA;
        this.l = qyj.S();
        yab.i0(dq4VarA, null, 0, new jhc(this, null, 20), 3);
        e9i.j0(new fz6(new q8e(((t34) ny8Var2.getValue()).b), new m20(2, this, y34.class, "handleEvent", "handleEvent(Lone/me/profile/viewmodel/commonchats/CommonChatsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 12), 3), dq4VarA);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0170  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r2 == r9) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0104, code lost:
    
        if (r2 == r9) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.y34 r16, defpackage.r34 r17, defpackage.lq4 r18) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y34.a(y34, r34, lq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:44:0x0103  */
    /* JADX WARN: Code duplicated, block: B:50:0x0136  */
    /* JADX WARN: Code duplicated, block: B:51:0x0139  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object b(y34 y34Var, nq4 nq4Var) {
        w34 w34Var;
        ae3 ae3Var;
        Object value;
        Object objA;
        LinkedHashSet linkedHashSet;
        HashSet hashSet;
        ArrayList arrayList;
        LinkedHashSet linkedHashSet2;
        Object value2;
        Object b44Var;
        mjg mjgVar = y34Var.h;
        if (nq4Var instanceof w34) {
            w34Var = (w34) nq4Var;
            int i = w34Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                w34Var.g = i - Integer.MIN_VALUE;
            } else {
                w34Var = new w34(y34Var, nq4Var);
            }
        } else {
            w34Var = new w34(y34Var, nq4Var);
        }
        Object objK0 = w34Var.e;
        int i2 = w34Var.g;
        lq4 lq4Var = null;
        Serializable serializable = hu4.a;
        if (i2 == 0) {
            ch3.d0(objK0);
            gm0.n(y34.class.getName(), "load");
            w34Var.g = 1;
            objK0 = yab.K0(((n0c) y34Var.b).b(), new k23(y34Var, lq4Var, 26), w34Var);
            if (objK0 != serializable) {
            }
            return serializable;
        }
        if (i2 == 1) {
            ch3.d0(objK0);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ae3Var = w34Var.d;
            ch3.d0(objK0);
        }
        linkedHashSet = (LinkedHashSet) objK0;
        if (ae3Var.d) {
            linkedHashSet.add(d44.a);
        }
        hashSet = new HashSet();
        arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (hashSet.add(new Long(((f44) obj).getId()))) {
                arrayList.add(obj);
            }
        }
        linkedHashSet2 = new LinkedHashSet(arrayList.size());
        ww3.P1(arrayList, linkedHashSet2);
        do {
            value2 = mjgVar.getValue();
            if (linkedHashSet2.isEmpty()) {
                b44Var = z34.a;
            } else {
                b44Var = new b44(linkedHashSet2, ae3Var.d, ae3Var.e);
            }
        } while (!mjgVar.h(value2, b44Var));
        return sbi.a;
        ae3 ae3Var2 = (ae3) objK0;
        gm0.n(y34.class.getName(), "response = " + ae3Var2);
        if (ae3Var2 != null) {
            List list = ae3Var2.c;
            gm0.n(y34.class.getName(), "response chats count = " + list.size());
            w34Var.d = ae3Var2;
            w34Var.g = 2;
            Serializable serializableC = y34Var.c(list, w34Var);
            if (serializableC != serializable) {
                objK0 = serializableC;
                ae3Var = ae3Var2;
                linkedHashSet = (LinkedHashSet) objK0;
                if (ae3Var.d) {
                    linkedHashSet.add(d44.a);
                }
                hashSet = new HashSet();
                arrayList = new ArrayList();
                while (r11.hasNext()) {
                    if (hashSet.add(new Long(((f44) obj).getId()))) {
                        arrayList.add(obj);
                    }
                }
                linkedHashSet2 = new LinkedHashSet(arrayList.size());
                ww3.P1(arrayList, linkedHashSet2);
                do {
                    value2 = mjgVar.getValue();
                    if (linkedHashSet2.isEmpty()) {
                        b44Var = z34.a;
                    } else {
                        b44Var = new b44(linkedHashSet2, ae3Var.d, ae3Var.e);
                    }
                } while (!mjgVar.h(value2, b44Var));
            }
            return serializable;
        }
        do {
            value = mjgVar.getValue();
            g44 g44Var = (g44) value;
            if (g44Var instanceof b44) {
                b44 b44Var2 = (b44) g44Var;
                LinkedHashSet linkedHashSet3 = b44Var2.a;
                LinkedHashSet linkedHashSet4 = new LinkedHashSet(linkedHashSet3.size());
                for (Object obj2 : linkedHashSet3) {
                    if (!(((f44) obj2) instanceof d44)) {
                        linkedHashSet4.add(obj2);
                    }
                }
                objA = b44.a(b44Var2, linkedHashSet4, 4);
            } else {
                objA = z34.a;
            }
        } while (!mjgVar.h(value, objA));
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:26:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ad -> B:27:0x00b0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable c(java.util.List r17, defpackage.nq4 r18) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y34.c(java.util.List, nq4):java.io.Serializable");
    }
}
