package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ceh {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final String e = ceh.class.getName();

    public ceh(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, gu4 gu4Var, eh9 eh9Var) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var4;
        this.d = ny8Var3;
        new fh9(gu4Var, eh9Var, new ym0(this, null, 2)).a();
    }

    public static img d(fmg fmgVar) {
        long j = fmgVar.a;
        dmg dmgVar = new dmg();
        dmgVar.a = j;
        dmgVar.b = fmgVar.b;
        dmgVar.c = fmgVar.c;
        dmgVar.d = fmgVar.d;
        dmgVar.e = fmgVar.e;
        dmgVar.f = fmgVar.f;
        dmgVar.g = fmgVar.g;
        dmgVar.h = fmgVar.h;
        dmgVar.i = fmgVar.i;
        return new img(dmgVar);
    }

    public final xx6 a(long j, boolean z) {
        return e9i.I(new q0d(new dz6(new dx9(((pmg) this.a.getValue()).a(new long[]{j}), this, j, 1), new ydh(z, this, j, null)), this, 26));
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x0209  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r17v0, types: [ceh] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x017e -> B:60:0x0183). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01fe -> B:77:0x0205). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.List r18, defpackage.nq4 r19) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceh.b(java.util.List, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:57:0x0121  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122 A[Catch: all -> 0x00f8, CancellationException -> 0x0142, TryCatch #0 {CancellationException -> 0x0142, blocks: (B:14:0x0037, B:21:0x004e, B:35:0x00cb, B:37:0x00cf, B:39:0x00d3, B:40:0x00e4, B:42:0x00ea, B:47:0x00fd, B:50:0x0104, B:55:0x011b, B:58:0x0122, B:60:0x012a, B:31:0x0085), top: B:74:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:60:0x012a A[Catch: all -> 0x00f8, CancellationException -> 0x0142, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0142, blocks: (B:14:0x0037, B:21:0x004e, B:35:0x00cb, B:37:0x00cf, B:39:0x00d3, B:40:0x00e4, B:42:0x00ea, B:47:0x00fd, B:50:0x0104, B:55:0x011b, B:58:0x0122, B:60:0x012a, B:31:0x0085), top: B:74:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0141 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x014b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0153  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x012a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x0153, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(List list, nq4 nq4Var) {
        aeh aehVar;
        Throwable th;
        Object objE;
        int i;
        int i2;
        ly lyVar;
        ArrayList arrayList;
        String str;
        a4c a4cVar;
        je9 je9Var;
        Object obj;
        List list2;
        String str2;
        a4c a4cVar2;
        je9 je9Var2;
        Object obj2;
        List list3 = list;
        r66 r66Var = r66.a;
        if (nq4Var instanceof aeh) {
            aehVar = (aeh) nq4Var;
            int i3 = aehVar.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aehVar.j = i3 - Integer.MIN_VALUE;
            } else {
                aehVar = new aeh(this, nq4Var);
            }
        } else {
            aehVar = new aeh(this, nq4Var);
        }
        aeh aehVar2 = aehVar;
        Object obj3 = aehVar2.h;
        Object obj4 = hu4.a;
        int i4 = aehVar2.j;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    int i5 = aehVar2.g;
                    int i6 = aehVar2.f;
                    List list4 = aehVar2.d;
                    try {
                        ch3.d0(obj3);
                        objE = obj3;
                        th = null;
                        i2 = i6;
                        i = i5;
                        list3 = list4;
                        lyVar = (ly) objE;
                        if (lyVar != null || (list2 = lyVar.d) == null) {
                            arrayList = th;
                        } else {
                            List list5 = list2;
                            arrayList = new ArrayList(yw3.W0(list5, 10));
                            Iterator it = list5.iterator();
                            while (it.hasNext()) {
                                arrayList.add(d((fmg) it.next()));
                            }
                        }
                        if (arrayList == 0 && !arrayList.isEmpty()) {
                            aehVar2.d = list3;
                            aehVar2.e = arrayList;
                            aehVar2.f = i2;
                            aehVar2.g = i;
                            aehVar2.j = 2;
                            if (f(arrayList, aehVar2) != obj4) {
                                obj = arrayList;
                                obj2 = obj;
                            }
                            return obj4;
                        }
                        str = this.e;
                        a4cVar = gm0.f;
                        if (a4cVar == null) {
                            je9Var = je9.e;
                            if (a4cVar.b(je9Var)) {
                                obj2 = arrayList;
                                a4cVar.c(je9Var, str, "getStickersSetsFromNetwork: empty list for " + list3, th);
                                obj2 = arrayList;
                            }
                        }
                        if (obj2 != null) {
                            obj2 = arrayList;
                            return obj2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        list3 = list4;
                        str2 = this.e;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9Var2 = je9.f;
                            if (a4cVar2.b(je9Var2)) {
                                a4cVar2.c(je9Var2, str2, "getStickersSetsFromNetwork: fail request stickers set for " + list3, th);
                            }
                        }
                    }
                } else {
                    if (i4 != 2) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj5 = aehVar2.e;
                    List list6 = aehVar2.d;
                    try {
                        ch3.d0(obj3);
                        obj = obj5;
                        obj2 = obj;
                        if (obj2 != null) {
                            obj2 = arrayList;
                            return obj2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        list3 = list6;
                        str2 = this.e;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9Var2 = je9.f;
                            if (a4cVar2.b(je9Var2)) {
                                a4cVar2.c(je9Var2, str2, "getStickersSetsFromNetwork: fail request stickers set for " + list3, th);
                            }
                        }
                    }
                }
                str2 = this.e;
                a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9Var2 = je9.f;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str2, "getStickersSetsFromNetwork: fail request stickers set for " + list3, th);
                    }
                }
            } else {
                ch3.d0(obj3);
                String str3 = this.e;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null) {
                    je9 je9Var3 = je9.d;
                    if (a4cVar3.b(je9Var3)) {
                        a4cVar3.c(je9Var3, str3, "getStickersSetsFromNetwork: " + list3, null);
                    }
                }
                try {
                    pvb pvbVar = (pvb) this.d.getValue();
                    ky kyVar = new ky(3, ww3.U1(list3));
                    ghb ghbVar = ew5.b;
                    long jO = qe7.O(2, lw5.SECONDS);
                    String str4 = this.e;
                    aehVar2.d = list3;
                    aehVar2.f = 0;
                    aehVar2.g = 0;
                    aehVar2.j = 1;
                    th = null;
                    objE = qe7.E(pvbVar, kyVar, str4, jO, 4, null, null, aehVar2, 112);
                    if (objE != obj4) {
                        i = 0;
                        i2 = 0;
                        lyVar = (ly) objE;
                        if (lyVar != null) {
                            arrayList = th;
                        } else {
                            arrayList = th;
                        }
                        if (arrayList == 0) {
                        }
                        str = this.e;
                        a4cVar = gm0.f;
                        if (a4cVar == null) {
                            je9Var = je9.e;
                            if (a4cVar.b(je9Var)) {
                                obj2 = arrayList;
                                a4cVar.c(je9Var, str, "getStickersSetsFromNetwork: empty list for " + list3, th);
                                obj2 = arrayList;
                            }
                        }
                        if (obj2 != null) {
                            obj2 = arrayList;
                            return obj2;
                        }
                    }
                    return obj4;
                } catch (Throwable th4) {
                    th = th4;
                    str2 = this.e;
                    a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9Var2 = je9.f;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str2, "getStickersSetsFromNetwork: fail request stickers set for " + list3, th);
                        }
                    }
                }
            }
            obj2 = arrayList;
            return r66Var;
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(img imgVar, nq4 nq4Var) {
        beh behVar;
        if (nq4Var instanceof beh) {
            behVar = (beh) nq4Var;
            int i = behVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                behVar.g = i - Integer.MIN_VALUE;
            } else {
                behVar = new beh(this, nq4Var);
            }
        } else {
            behVar = new beh(this, nq4Var);
        }
        Object objD = behVar.e;
        int i2 = behVar.g;
        if (i2 == 0) {
            ch3.d0(objD);
            if (imgVar == null) {
                return null;
            }
            vdh vdhVar = (vdh) this.b.getValue();
            List list = imgVar.h;
            behVar.d = imgVar;
            behVar.g = 1;
            gm0.m(vdhVar.d, "getStickersByIds: ids count=%d", new Integer(list.size()));
            objD = vdhVar.d(list, behVar);
            hu4 hu4Var = hu4.a;
            if (objD == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            imgVar = behVar.d;
            ch3.d0(objD);
        }
        long j = imgVar.a;
        dmg dmgVar = new dmg();
        dmgVar.a = j;
        dmgVar.b = imgVar.b;
        dmgVar.c = imgVar.c;
        dmgVar.d = imgVar.d;
        dmgVar.e = imgVar.e;
        dmgVar.f = imgVar.f;
        dmgVar.g = imgVar.g;
        dmgVar.h = (List) objD;
        dmgVar.i = imgVar.i;
        return new emg(dmgVar);
    }

    public final Object f(ArrayList arrayList, nq4 nq4Var) {
        pmg pmgVar = (pmg) this.a.getValue();
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            img imgVar = (img) it.next();
            jmg jmgVar = new jmg();
            jmgVar.a = imgVar.a;
            jmgVar.b = imgVar.b;
            jmgVar.c = imgVar.c;
            jmgVar.d = imgVar.d;
            jmgVar.e = imgVar.e;
            jmgVar.f = imgVar.f;
            jmgVar.g = imgVar.g;
            jmgVar.h = imgVar.h;
            jmgVar.i = imgVar.i;
            arrayList2.add(jmgVar);
        }
        Object objI = ch3.I(nq4Var, pmgVar.a, false, true, new ol(pmgVar, 20, arrayList2));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    public final Object g(Collection collection, vk4 vk4Var) {
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "storeStickerSetsFromServer: sticker sets: " + collection, null);
            }
        }
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(yw3.W0(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(d((fmg) it.next()));
        }
        Object objF = f(arrayList, vk4Var);
        return objF == hu4.a ? objF : sbi.a;
    }
}
