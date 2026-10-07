package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class hfa {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public hfa(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:57:0x014a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0173  */
    /* JADX WARN: Code duplicated, block: B:65:0x0181 A[Catch: all -> 0x01a2, CancellationException -> 0x01c7, LOOP:0: B:63:0x017b->B:65:0x0181, LOOP_END, TryCatch #0 {all -> 0x01a2, blocks: (B:62:0x0176, B:63:0x017b, B:65:0x0181, B:68:0x01a4, B:71:0x01a9, B:73:0x01b1, B:58:0x0158), top: B:80:0x0158 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a9 A[Catch: all -> 0x01a2, CancellationException -> 0x01c7, TryCatch #0 {all -> 0x01a2, blocks: (B:62:0x0176, B:63:0x017b, B:65:0x0181, B:68:0x01a4, B:71:0x01a9, B:73:0x01b1, B:58:0x0158), top: B:80:0x0158 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01b1 A[Catch: all -> 0x01a2, CancellationException -> 0x01c7, TRY_LEAVE, TryCatch #0 {all -> 0x01a2, blocks: (B:62:0x0176, B:63:0x017b, B:65:0x0181, B:68:0x01a4, B:71:0x01a9, B:73:0x01b1, B:58:0x0158), top: B:80:0x0158 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x01b1, please report this as an issue */
    public final Object a(long j, l8b l8bVar, nq4 nq4Var) {
        gfa gfaVar;
        l8b l8bVar2;
        List list;
        l8b l8bVar3;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        Iterator it;
        String str;
        long jF;
        sua suaVar;
        ArrayList arrayList2;
        sfa sfaVar;
        Integer num;
        Throwable th;
        long j2;
        Iterator it2;
        int i;
        a4c a4cVar;
        je9 je9Var;
        long j3 = j;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof gfa) {
            gfaVar = (gfa) nq4Var;
            int i2 = gfaVar.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gfaVar.j = i2 - Integer.MIN_VALUE;
            } else {
                gfaVar = new gfa(this, nq4Var);
            }
        } else {
            gfaVar = new gfa(this, nq4Var);
        }
        Object objW = gfaVar.h;
        hu4 hu4Var = hu4.a;
        int i3 = gfaVar.j;
        String str2 = "MessageCommentsUpdateLogic";
        try {
            if (i3 == 0) {
                ch3.d0(objW);
                if (!l8bVar.h()) {
                    sua suaVar2 = (sua) this.b.getValue();
                    ArrayList arrayListA = bpk.a(l8bVar);
                    l8bVar2 = l8bVar;
                    gfaVar.e = l8bVar2;
                    gfaVar.d = j3;
                    gfaVar.j = 1;
                    objW = ((ose) suaVar2.a).w(j3, gfaVar, arrayListA);
                    if (objW != hu4Var) {
                    }
                    return hu4Var;
                }
                return sbiVar;
            }
            if (i3 == 1) {
                j3 = gfaVar.d;
                l8b l8bVar4 = gfaVar.e;
                ch3.d0(objW);
                l8bVar2 = l8bVar4;
            } else {
                if (i3 == 2) {
                    j3 = gfaVar.d;
                    list = gfaVar.f;
                    l8bVar3 = gfaVar.e;
                    ch3.d0(objW);
                    h8b h8bVar = (h8b) objW;
                    linkedHashMap = new LinkedHashMap();
                    arrayList = new ArrayList();
                    it = list.iterator();
                    while (it.hasNext()) {
                        sfaVar = (sfa) it.next();
                        if (!l8bVar3.b(sfaVar.b) && (num = (Integer) l8bVar3.f(sfaVar.b)) != null) {
                            int iIntValue = num.intValue();
                            Iterator it3 = it;
                            String str3 = str2;
                            linkedHashMap.put(new Long(sfaVar.a), new Integer(iIntValue));
                            int iB = h8bVar.b(sfaVar.a);
                            if ((iB >= 0 ? h8bVar.c[iB] : -1) != iIntValue) {
                                arrayList.add(sfaVar);
                            }
                            it = it3;
                            str2 = str3;
                        }
                    }
                    str = str2;
                    if (!linkedHashMap.isEmpty()) {
                        jF = ((s7f) ((et3) this.c.getValue())).f();
                        try {
                            suaVar = (sua) this.b.getValue();
                            gfaVar.e = null;
                            gfaVar.f = null;
                            gfaVar.g = arrayList;
                            gfaVar.d = j3;
                            gfaVar.j = 3;
                            if (suaVar.n(linkedHashMap, jF, gfaVar) != hu4Var) {
                                arrayList2 = arrayList;
                            }
                            return hu4Var;
                        } catch (Throwable th2) {
                            th = th2;
                            gm0.V(str, "fail to update comments counters", th);
                            return sbiVar;
                        }
                    }
                    return sbiVar;
                }
                if (i3 != 3) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = gfaVar.d;
                arrayList2 = gfaVar.g;
                List list2 = gfaVar.f;
                try {
                    ch3.d0(objW);
                    str = "MessageCommentsUpdateLogic";
                } catch (Throwable th3) {
                    th = th3;
                    str = "MessageCommentsUpdateLogic";
                    gm0.V(str, "fail to update comments counters", th);
                    return sbiVar;
                }
            }
            j2 = j3;
            it2 = arrayList2.iterator();
            i = 0;
            while (it2.hasNext()) {
                i++;
                ((t51) this.a.getValue()).c(new kfi(j2, ((sfa) it2.next()).a, true));
            }
            a4cVar = gm0.f;
            if (a4cVar == null) {
                je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "updateMessages: " + i, null);
                }
            }
            return sbiVar;
            list = (List) objW;
            if (!list.isEmpty()) {
                sua suaVar3 = (sua) this.b.getValue();
                List list3 = list;
                ArrayList arrayList3 = new ArrayList(yw3.W0(list3, 10));
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    c0a.t(((sfa) it4.next()).a, arrayList3);
                }
                long[] jArrU1 = ww3.U1(arrayList3);
                gfaVar.e = l8bVar2;
                gfaVar.f = list;
                gfaVar.d = j3;
                gfaVar.j = 2;
                objW = ((ose) suaVar3.a).v(jArrU1, gfaVar);
                if (objW != hu4Var) {
                    l8bVar3 = l8bVar2;
                    h8b h8bVar2 = (h8b) objW;
                    linkedHashMap = new LinkedHashMap();
                    arrayList = new ArrayList();
                    it = list.iterator();
                    while (it.hasNext()) {
                        sfaVar = (sfa) it.next();
                        if (!l8bVar3.b(sfaVar.b)) {
                        }
                    }
                    str = str2;
                    if (!linkedHashMap.isEmpty()) {
                        jF = ((s7f) ((et3) this.c.getValue())).f();
                        suaVar = (sua) this.b.getValue();
                        gfaVar.e = null;
                        gfaVar.f = null;
                        gfaVar.g = arrayList;
                        gfaVar.d = j3;
                        gfaVar.j = 3;
                        if (suaVar.n(linkedHashMap, jF, gfaVar) != hu4Var) {
                            arrayList2 = arrayList;
                            j2 = j3;
                            it2 = arrayList2.iterator();
                            i = 0;
                            while (it2.hasNext()) {
                                i++;
                                ((t51) this.a.getValue()).c(new kfi(j2, ((sfa) it2.next()).a, true));
                            }
                            a4cVar = gm0.f;
                            if (a4cVar == null) {
                                je9Var = je9.d;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, "updateMessages: " + i, null);
                                }
                            }
                        }
                    }
                }
                return hu4Var;
            }
            return sbiVar;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
