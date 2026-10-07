package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class tka extends wed implements oka {
    public final gjg j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final int n;

    public tka(r8e r8eVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, wmi wmiVar) {
        super(wmiVar, "MessageViewCount", 12);
        this.j = r8eVar;
        this.k = ny8Var;
        this.l = ny8Var2;
        this.m = ny8Var3;
        this.n = 100;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:58:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x014d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0156  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00eb -> B:60:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00ed -> B:50:0x0101). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x010b -> B:56:0x0143). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0140 -> B:57:0x0145). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.oka
    public final java.lang.Object a(java.util.ArrayList r23, defpackage.lq4 r24) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tka.a(java.util.ArrayList, lq4):java.lang.Object");
    }

    @Override // defpackage.wed
    public final int j() {
        return this.n;
    }

    @Override // defpackage.wed
    public final /* bridge */ /* synthetic */ Object n(Object obj, List list, Object obj2, qed qedVar) {
        return u(((Number) obj).longValue(), list, (z3b) obj2, qedVar);
    }

    @Override // defpackage.wed
    public final Object o(Object obj, List list, gz gzVar) {
        long jLongValue = ((Number) obj).longValue();
        List list2 = list;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c0a.t(((hi9) it.next()).a, arrayList);
        }
        return ((pvb) this.k.getValue()).D(new h3b(jLongValue, arrayList), gzVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object u(long j, List list, z3b z3bVar, nq4 nq4Var) {
        rka rkaVar;
        ArrayList arrayList;
        Long l;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof rka) {
            rkaVar = (rka) nq4Var;
            int i = rkaVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                rkaVar.h = i - Integer.MIN_VALUE;
            } else {
                rkaVar = new rka(this, nq4Var);
            }
        } else {
            rkaVar = new rka(this, nq4Var);
        }
        Object obj = rkaVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = rkaVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            rt2 rt2Var = (rt2) this.j.getValue();
            Long l2 = rt2Var != null ? new Long(rt2Var.a) : null;
            if (l2 == null) {
                String str = this.g;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, nbh.s(j, "Skip local update for chat with serverId=", ": localId is null"), null);
                        return sbiVar;
                    }
                }
            } else {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(yw3.W0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    c0a.t(((hi9) it.next()).b, arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (((Number) obj2).longValue() != 0) {
                        arrayList3.add(obj2);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    j44 j44Var = (j44) this.m.getValue();
                    Map map = z3bVar.c;
                    rkaVar.d = l2;
                    rkaVar.e = arrayList3;
                    rkaVar.h = 1;
                    if (j44Var.g(map, rkaVar) == hu4Var) {
                        return hu4Var;
                    }
                    arrayList = arrayList3;
                    l = l2;
                }
            }
            return sbiVar;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        arrayList = rkaVar.e;
        l = rkaVar.d;
        ch3.d0(obj);
        ((t51) this.l.getValue()).c(new lfi(l.longValue(), arrayList));
        return sbiVar;
    }
}
