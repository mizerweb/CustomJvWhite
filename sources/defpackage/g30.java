package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g30 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ List f;
    public final /* synthetic */ n30 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g30(List list, n30 n30Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = list;
        this.g = n30Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        n30 n30Var = this.g;
        List list = this.f;
        switch (i) {
            case 0:
                return new g30(list, n30Var, lq4Var, 0);
            case 1:
                return new g30(list, n30Var, lq4Var, 1);
            default:
                return new g30(list, n30Var, lq4Var, 2);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((g30) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        final int i2 = 0;
        final int i3 = 1;
        n30 n30Var = this.g;
        final List list = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                if (!list.isEmpty()) {
                    nuc nucVarB = ((n25) n30Var.f.getValue()).d().b();
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Long.valueOf(((rtc) it.next()).a));
                    }
                    ch3.G(nucVarB.a, false, true, new iaa(nucVarB, 25, arrayList));
                }
                break;
            case 1:
                ch3.d0(obj);
                if (!list.isEmpty()) {
                    final sse sseVarD = ((n25) n30Var.f.getValue()).d();
                    ((j35) sseVarD.b.getValue()).a(new af7() { // from class: qse
                        @Override // defpackage.af7
                        public final Object invoke() {
                            final int i4 = 1;
                            final int i5 = 0;
                            switch (i2) {
                                case 0:
                                    List<rtc> list3 = list;
                                    sse sseVar = sseVarD;
                                    je9 je9Var = je9.f;
                                    HashSet hashSet = new HashSet(list3.size() * 2);
                                    ArrayList arrayList2 = new ArrayList(list3.size());
                                    for (rtc rtcVar : list3) {
                                        ttc ttcVar = ttc.a;
                                        String str = rtcVar.d;
                                        ttcVar.getClass();
                                        String strB = ttc.b(str);
                                        if (strB == null) {
                                            String str2 = sseVar.d;
                                            a4c a4cVar = gm0.f;
                                            if (a4cVar != null && a4cVar.b(je9Var)) {
                                                a4cVar.c(je9Var, str2, qv1.k("Invalid phone_key in insert batch: raw=", rtcVar.d), null);
                                            }
                                        } else if (hashSet.add(strB)) {
                                            arrayList2.add(sse.a(rtcVar, strB));
                                        } else {
                                            String str3 = sseVar.d;
                                            a4c a4cVar2 = gm0.f;
                                            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                                a4cVar2.c(je9Var, str3, qv1.l("Duplicate phone_key in insert batch: ", strB, ", raw=", rtcVar.d), null);
                                            }
                                        }
                                    }
                                    int i6 = 0;
                                    while (i6 < arrayList2.size()) {
                                        int iMin = Math.min(i6 + 500, arrayList2.size());
                                        final nuc nucVarB2 = sseVar.b();
                                        final List listSubList = arrayList2.subList(i6, iMin);
                                        ch3.G(nucVarB2.a, false, true, new cf7() { // from class: muc
                                            @Override // defpackage.cf7
                                            public final Object invoke(Object obj2) {
                                                int i7 = i5;
                                                sbi sbiVar = sbi.a;
                                                List list4 = listSubList;
                                                nuc nucVar = nucVarB2;
                                                qxe qxeVar = (qxe) obj2;
                                                switch (i7) {
                                                    case 0:
                                                        nucVar.b.c(qxeVar, list4);
                                                        break;
                                                    default:
                                                        nucVar.c.H(qxeVar, list4);
                                                        break;
                                                }
                                                return sbiVar;
                                            }
                                        });
                                        i6 = iMin;
                                    }
                                    break;
                                default:
                                    List<rtc> list4 = list;
                                    sse sseVar2 = sseVarD;
                                    je9 je9Var2 = je9.f;
                                    HashSet hashSet2 = new HashSet(list4.size() * 2);
                                    ArrayList arrayList3 = new ArrayList(list4.size());
                                    for (rtc rtcVar2 : list4) {
                                        ttc ttcVar2 = ttc.a;
                                        String str4 = rtcVar2.d;
                                        ttcVar2.getClass();
                                        String strB2 = ttc.b(str4);
                                        if (strB2 == null) {
                                            String str5 = sseVar2.d;
                                            a4c a4cVar3 = gm0.f;
                                            if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                                                a4cVar3.c(je9Var2, str5, qv1.k("Invalid phone_key in update batch: raw=", rtcVar2.d), null);
                                            }
                                        } else if (hashSet2.add(strB2)) {
                                            arrayList3.add(sse.a(rtcVar2, strB2));
                                        } else {
                                            String str6 = sseVar2.d;
                                            a4c a4cVar4 = gm0.f;
                                            if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                                                a4cVar4.c(je9Var2, str6, qv1.l("Duplicate phone_key in update batch: ", strB2, ", raw=", rtcVar2.d), null);
                                            }
                                        }
                                    }
                                    int i7 = 0;
                                    while (i7 < arrayList3.size()) {
                                        int iMin2 = Math.min(i7 + 500, arrayList3.size());
                                        final nuc nucVarB3 = sseVar2.b();
                                        final List listSubList2 = arrayList3.subList(i7, iMin2);
                                        ch3.G(nucVarB3.a, false, true, new cf7() { // from class: muc
                                            @Override // defpackage.cf7
                                            public final Object invoke(Object obj2) {
                                                int i8 = i4;
                                                sbi sbiVar = sbi.a;
                                                List list5 = listSubList2;
                                                nuc nucVar = nucVarB3;
                                                qxe qxeVar = (qxe) obj2;
                                                switch (i8) {
                                                    case 0:
                                                        nucVar.b.c(qxeVar, list5);
                                                        break;
                                                    default:
                                                        nucVar.c.H(qxeVar, list5);
                                                        break;
                                                }
                                                return sbiVar;
                                            }
                                        });
                                        i7 = iMin2;
                                    }
                                    break;
                            }
                            return sbi.a;
                        }
                    });
                    n30Var.b.c(new ouc());
                }
                break;
            default:
                ch3.d0(obj);
                if (!list.isEmpty()) {
                    final sse sseVarD2 = ((n25) n30Var.f.getValue()).d();
                    sseVarD2.getClass();
                    if (!list.isEmpty()) {
                        ((j35) sseVarD2.b.getValue()).a(new af7() { // from class: qse
                            @Override // defpackage.af7
                            public final Object invoke() {
                                final int i4 = 1;
                                final int i5 = 0;
                                switch (i3) {
                                    case 0:
                                        List<rtc> list3 = list;
                                        sse sseVar = sseVarD2;
                                        je9 je9Var = je9.f;
                                        HashSet hashSet = new HashSet(list3.size() * 2);
                                        ArrayList arrayList2 = new ArrayList(list3.size());
                                        for (rtc rtcVar : list3) {
                                            ttc ttcVar = ttc.a;
                                            String str = rtcVar.d;
                                            ttcVar.getClass();
                                            String strB = ttc.b(str);
                                            if (strB == null) {
                                                String str2 = sseVar.d;
                                                a4c a4cVar = gm0.f;
                                                if (a4cVar != null && a4cVar.b(je9Var)) {
                                                    a4cVar.c(je9Var, str2, qv1.k("Invalid phone_key in insert batch: raw=", rtcVar.d), null);
                                                }
                                            } else if (hashSet.add(strB)) {
                                                arrayList2.add(sse.a(rtcVar, strB));
                                            } else {
                                                String str3 = sseVar.d;
                                                a4c a4cVar2 = gm0.f;
                                                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                                    a4cVar2.c(je9Var, str3, qv1.l("Duplicate phone_key in insert batch: ", strB, ", raw=", rtcVar.d), null);
                                                }
                                            }
                                        }
                                        int i6 = 0;
                                        while (i6 < arrayList2.size()) {
                                            int iMin = Math.min(i6 + 500, arrayList2.size());
                                            final nuc nucVarB2 = sseVar.b();
                                            final List listSubList = arrayList2.subList(i6, iMin);
                                            ch3.G(nucVarB2.a, false, true, new cf7() { // from class: muc
                                                @Override // defpackage.cf7
                                                public final Object invoke(Object obj2) {
                                                    int i8 = i5;
                                                    sbi sbiVar = sbi.a;
                                                    List list5 = listSubList;
                                                    nuc nucVar = nucVarB2;
                                                    qxe qxeVar = (qxe) obj2;
                                                    switch (i8) {
                                                        case 0:
                                                            nucVar.b.c(qxeVar, list5);
                                                            break;
                                                        default:
                                                            nucVar.c.H(qxeVar, list5);
                                                            break;
                                                    }
                                                    return sbiVar;
                                                }
                                            });
                                            i6 = iMin;
                                        }
                                        break;
                                    default:
                                        List<rtc> list4 = list;
                                        sse sseVar2 = sseVarD2;
                                        je9 je9Var2 = je9.f;
                                        HashSet hashSet2 = new HashSet(list4.size() * 2);
                                        ArrayList arrayList3 = new ArrayList(list4.size());
                                        for (rtc rtcVar2 : list4) {
                                            ttc ttcVar2 = ttc.a;
                                            String str4 = rtcVar2.d;
                                            ttcVar2.getClass();
                                            String strB2 = ttc.b(str4);
                                            if (strB2 == null) {
                                                String str5 = sseVar2.d;
                                                a4c a4cVar3 = gm0.f;
                                                if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                                                    a4cVar3.c(je9Var2, str5, qv1.k("Invalid phone_key in update batch: raw=", rtcVar2.d), null);
                                                }
                                            } else if (hashSet2.add(strB2)) {
                                                arrayList3.add(sse.a(rtcVar2, strB2));
                                            } else {
                                                String str6 = sseVar2.d;
                                                a4c a4cVar4 = gm0.f;
                                                if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                                                    a4cVar4.c(je9Var2, str6, qv1.l("Duplicate phone_key in update batch: ", strB2, ", raw=", rtcVar2.d), null);
                                                }
                                            }
                                        }
                                        int i7 = 0;
                                        while (i7 < arrayList3.size()) {
                                            int iMin2 = Math.min(i7 + 500, arrayList3.size());
                                            final nuc nucVarB3 = sseVar2.b();
                                            final List listSubList2 = arrayList3.subList(i7, iMin2);
                                            ch3.G(nucVarB3.a, false, true, new cf7() { // from class: muc
                                                @Override // defpackage.cf7
                                                public final Object invoke(Object obj2) {
                                                    int i8 = i4;
                                                    sbi sbiVar = sbi.a;
                                                    List list5 = listSubList2;
                                                    nuc nucVar = nucVarB3;
                                                    qxe qxeVar = (qxe) obj2;
                                                    switch (i8) {
                                                        case 0:
                                                            nucVar.b.c(qxeVar, list5);
                                                            break;
                                                        default:
                                                            nucVar.c.H(qxeVar, list5);
                                                            break;
                                                    }
                                                    return sbiVar;
                                                }
                                            });
                                            i7 = iMin2;
                                        }
                                        break;
                                }
                                return sbi.a;
                            }
                        });
                    }
                }
                break;
        }
        return list;
    }
}
