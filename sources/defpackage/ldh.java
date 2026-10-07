package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import ru.ok.tamtam.stickersets.favorite.FavoriteStickerSetController$FavoriteStickerSetsControllerException;

/* JADX INFO: loaded from: classes.dex */
public final class ldh {
    public final gu4 a;
    public final gu4 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final mjg i = p90.a(r66.a);
    public final String j = ldh.class.getName();

    public ldh(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, eh9 eh9Var, ite iteVar, wmi wmiVar) {
        this.a = iteVar;
        this.b = wmiVar;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
        this.f = ny8Var4;
        this.g = ny8Var5;
        this.h = ny8Var6;
        new fh9(iteVar, eh9Var, new w6(this, null, 1)).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object a(ldh ldhVar, List list, nq4 nq4Var) {
        cdh cdhVar;
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.d;
        if (nq4Var instanceof cdh) {
            cdhVar = (cdh) nq4Var;
            int i = cdhVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                cdhVar.g = i - Integer.MIN_VALUE;
            } else {
                cdhVar = new cdh(ldhVar, nq4Var);
            }
        } else {
            cdhVar = new cdh(ldhVar, nq4Var);
        }
        Object obj = cdhVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = cdhVar.g;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                String str = ldhVar.j;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "onListUpdated: ids=" + list, null);
                }
                if (list == null) {
                    gm0.Y(ldhVar.j, "onListUpdated: Warning ids is null");
                    return sbiVar;
                }
                dm6 dm6VarM = ldhVar.m();
                cdhVar.d = list;
                cdhVar.g = 1;
                if (dm6VarM.b(list, cdhVar) == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = cdhVar.d;
                ch3.d0(obj);
            }
            String str2 = ldhVar.j;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "onListUpdated: success store stickers sets=" + list, null);
            }
            return sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String str3 = ldhVar.j;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar3.b(je9Var2)) {
                    a4cVar3.c(je9Var2, str3, "onListUpdated: failed to store sticker sets=" + list, th);
                }
            }
            ldhVar.r();
            return sbiVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object b(ldh ldhVar, long j, nq4 nq4Var) {
        ddh ddhVar;
        long j2;
        String str;
        a4c a4cVar;
        je9 je9Var;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof ddh) {
            ddhVar = (ddh) nq4Var;
            int i = ddhVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ddhVar.g = i - Integer.MIN_VALUE;
            } else {
                ddhVar = new ddh(ldhVar, nq4Var);
            }
        } else {
            ddhVar = new ddh(ldhVar, nq4Var);
        }
        Object obj = ddhVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = ddhVar.g;
        boolean z = true;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                try {
                    dm6 dm6VarM = ldhVar.m();
                    ddhVar.d = j;
                    ddhVar.g = 1;
                    Object objH = ch3.H(ddhVar, new am6(dm6VarM, j, z, null, 0), dm6VarM.a);
                    if (objH != hu4Var) {
                        objH = sbiVar;
                    }
                    if (objH == hu4Var) {
                        return hu4Var;
                    }
                    j2 = j;
                } catch (Throwable th) {
                    th = th;
                    j2 = j;
                    str = ldhVar.j;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, nbh.s(j2, "onNotifAdded: failed to add sticker set ", " to cache"), th);
                        }
                    }
                    ldhVar.r();
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = ddhVar.d;
                try {
                    ch3.d0(obj);
                } catch (Throwable th2) {
                    th = th2;
                    str = ldhVar.j;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, nbh.s(j2, "onNotifAdded: failed to add sticker set ", " to cache"), th);
                        }
                    }
                    ldhVar.r();
                }
            }
            String str2 = ldhVar.j;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.d;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, "onNotifAdded: added sticker set " + j2 + " to cache", null);
                }
            }
            return sbiVar;
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object c(ldh ldhVar, long j, int i, nq4 nq4Var) {
        edh edhVar;
        long j2;
        int i2;
        String str;
        a4c a4cVar;
        je9 je9Var;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof edh) {
            edhVar = (edh) nq4Var;
            int i3 = edhVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                edhVar.h = i3 - Integer.MIN_VALUE;
            } else {
                edhVar = new edh(ldhVar, nq4Var);
            }
        } else {
            edhVar = new edh(ldhVar, nq4Var);
        }
        Object obj = edhVar.f;
        hu4 hu4Var = hu4.a;
        int i4 = edhVar.h;
        try {
            if (i4 == 0) {
                ch3.d0(obj);
                try {
                    dm6 dm6VarM = ldhVar.m();
                    edhVar.d = j;
                    edhVar.e = i;
                    edhVar.h = 1;
                    Object objH = ch3.H(edhVar, new cm6(dm6VarM, j, i, null, 0), dm6VarM.a);
                    if (objH != hu4Var) {
                        objH = sbiVar;
                    }
                    if (objH == hu4Var) {
                        return hu4Var;
                    }
                    j2 = j;
                    i2 = i;
                } catch (Throwable th) {
                    th = th;
                    j2 = j;
                    i2 = i;
                    str = ldhVar.j;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, zo5.g(i2, j2, "onNotifMoved: failed to move id=", " to position="), th);
                        }
                    }
                    ldhVar.r();
                    return sbiVar;
                }
            } else {
                if (i4 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = edhVar.e;
                j2 = edhVar.d;
                try {
                    ch3.d0(obj);
                } catch (Throwable th2) {
                    th = th2;
                    str = ldhVar.j;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, zo5.g(i2, j2, "onNotifMoved: failed to move id=", " to position="), th);
                        }
                    }
                    ldhVar.r();
                    return sbiVar;
                }
            }
            String str2 = ldhVar.j;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.d;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, "onNotifMoved: success move id=" + j2 + " to position=" + i2, null);
                }
            }
            return sbiVar;
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object d(ldh ldhVar, List list, nq4 nq4Var) {
        fdh fdhVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof fdh) {
            fdhVar = (fdh) nq4Var;
            int i = fdhVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                fdhVar.g = i - Integer.MIN_VALUE;
            } else {
                fdhVar = new fdh(ldhVar, nq4Var);
            }
        } else {
            fdhVar = new fdh(ldhVar, nq4Var);
        }
        Object obj = fdhVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = fdhVar.g;
        lq4 lq4Var = null;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                dm6 dm6VarM = ldhVar.m();
                fdhVar.d = list;
                fdhVar.g = 1;
                Object objH = ch3.H(fdhVar, new zl6(dm6VarM, list, lq4Var, 2), dm6VarM.a);
                if (objH != hu4Var) {
                    objH = sbiVar;
                }
                if (objH == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = fdhVar.d;
                ch3.d0(obj);
            }
            String str = ldhVar.j;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "onNotifRemoved: removed sticker sets " + list + " from cache", null);
                }
            }
            return sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String str2 = ldhVar.j;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, v0h.d("onNotifRemoved: failed to remove sticker sets ", " from cache", list), th);
                }
            }
            ldhVar.r();
            return sbiVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dc, code lost:
    
        if (g(r17, r0, r6) == r7) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(defpackage.ldh r17, long r18, defpackage.nq4 r20) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ldh.e(ldh, long, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object f(ldh ldhVar, List list, long j, boolean z, nq4 nq4Var) {
        hdh hdhVar;
        ldhVar.getClass();
        if (nq4Var instanceof hdh) {
            hdhVar = (hdh) nq4Var;
            int i = hdhVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                hdhVar.g = i - Integer.MIN_VALUE;
            } else {
                hdhVar = new hdh(ldhVar, nq4Var);
            }
        } else {
            hdhVar = new hdh(ldhVar, nq4Var);
        }
        Object objB = hdhVar.e;
        int i2 = hdhVar.g;
        if (i2 == 0) {
            ch3.d0(objB);
            if (!z) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((emg) obj).a != j) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((emg) it.next()).a == j) {
                        return list;
                    }
                }
            }
            ceh cehVar = (ceh) ldhVar.d.getValue();
            List listS = c0a.s(j);
            hdhVar.d = list;
            hdhVar.g = 1;
            objB = cehVar.b(listS, hdhVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = hdhVar.d;
            ch3.d0(objB);
        }
        emg emgVar = (emg) ww3.t1((List) objB);
        if (emgVar == null) {
            return list;
        }
        return ww3.G1(list, Collections.singletonList(emgVar));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object g(ldh ldhVar, List list, nq4 nq4Var) {
        idh idhVar;
        if (nq4Var instanceof idh) {
            idhVar = (idh) nq4Var;
            int i = idhVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                idhVar.f = i - Integer.MIN_VALUE;
            } else {
                idhVar = new idh(ldhVar, nq4Var);
            }
        } else {
            idhVar = new idh(ldhVar, nq4Var);
        }
        Object objB = idhVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = idhVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(objB);
                ceh cehVar = (ceh) ldhVar.d.getValue();
                idhVar.f = 1;
                objB = cehVar.b(list, idhVar);
                if (objB == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objB);
            }
            List list2 = (List) objB;
            String str = ldhVar.j;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "on next favorite sticker sets: " + list2, null);
                }
            }
            ldhVar.i.setValue(list2);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.V(ldhVar.j, "publishFavoritesIds: failed", new tch("publishFavoritesIds: failed", th));
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object h(ldh ldhVar, long j, nq4 nq4Var) {
        jdh jdhVar;
        if (nq4Var instanceof jdh) {
            jdhVar = (jdh) nq4Var;
            int i = jdhVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                jdhVar.f = i - Integer.MIN_VALUE;
            } else {
                jdhVar = new jdh(ldhVar, nq4Var);
            }
        } else {
            jdhVar = new jdh(ldhVar, nq4Var);
        }
        jdh jdhVar2 = jdhVar;
        Object objE = jdhVar2.d;
        int i2 = jdhVar2.f;
        if (i2 == 0) {
            ch3.d0(objE);
            pvb pvbVarL = ldhVar.l();
            vsb vsbVar = new vsb(0, 50, j, "FAVORITE_STICKER_SETS", (String) null);
            String str = ldhVar.j;
            jdhVar2.f = 1;
            objE = qe7.E(pvbVarL, vsbVar, str, 0L, 1, null, null, jdhVar2, 116);
            hu4 hu4Var = hu4.a;
            if (objE == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objE);
        }
        my myVar = (my) objE;
        if (myVar == null) {
            return null;
        }
        return new uch(myVar.h(), myVar.i());
    }

    public final void i(long j) {
        gm0.m(this.j, "assetsUpdate: request, sync=%d", Long.valueOf(j));
        yab.i0(this.b, null, 0, new vch(this, j, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(boolean z, nq4 nq4Var) throws FavoriteStickerSetController$FavoriteStickerSetsControllerException {
        wch wchVar;
        if (nq4Var instanceof wch) {
            wchVar = (wch) nq4Var;
            int i = wchVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                wchVar.f = i - Integer.MIN_VALUE;
            } else {
                wchVar = new wch(this, nq4Var);
            }
        } else {
            wchVar = new wch(this, nq4Var);
        }
        Object objI = wchVar.d;
        int i2 = wchVar.f;
        if (i2 == 0) {
            ch3.d0(objI);
            if (z) {
                dm6 dm6VarM = m();
                wchVar.f = 1;
                objI = ch3.I(wchVar, dm6VarM.a, true, false, new us5(15));
                hu4 hu4Var = hu4.a;
                if (objI == hu4Var) {
                    return hu4Var;
                }
            }
            return sbi.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(objI);
        if (((Number) objI).longValue() >= ((Number) ((g5d) ((gjf) this.h.getValue())).a.V.a(e5d.S6[41]).i()).intValue()) {
            throw new FavoriteStickerSetController$FavoriteStickerSetsControllerException() { // from class: ru.ok.tamtam.stickersets.favorite.FavoriteStickerSetController$MaxFavoriteStickerSetsException
            };
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(nq4 nq4Var) {
        xch xchVar;
        if (nq4Var instanceof xch) {
            xchVar = (xch) nq4Var;
            int i = xchVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                xchVar.f = i - Integer.MIN_VALUE;
            } else {
                xchVar = new xch(this, nq4Var);
            }
        } else {
            xchVar = new xch(this, nq4Var);
        }
        Object obj = xchVar.d;
        int i2 = xchVar.f;
        sbi sbiVar = sbi.a;
        String str = this.j;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                gm0.n(str, "clear");
                dm6 dm6VarM = m();
                xchVar.f = 1;
                Object objI = ch3.I(xchVar, dm6VarM.a, false, true, new us5(14));
                hu4 hu4Var = hu4.a;
                if (objI != hu4Var) {
                    objI = sbiVar;
                }
                if (objI == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
            gm0.x(str, "clear: cleared fav stickers repository", null);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.V(str, "clear: failed to clear fav stickers repository", th);
        }
        mjg mjgVar = this.i;
        mjgVar.getClass();
        mjgVar.j(null, r66.a);
        return sbiVar;
    }

    public final pvb l() {
        return (pvb) this.e.getValue();
    }

    public final dm6 m() {
        return (dm6) this.c.getValue();
    }

    public final boolean n(long j) {
        Iterable iterable = (Iterable) this.i.getValue();
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((emg) it.next()).a == j) {
                return true;
            }
        }
        return false;
    }

    public final void o(long j) {
        String str = this.j;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(j, "loadFromMarker: marker="), null);
            }
        }
        yab.i0(this.b, null, 0, new zch(this, j, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x0101 A[Catch: all -> 0x01a6, CancellationException -> 0x01ea, TRY_LEAVE, TryCatch #2 {all -> 0x01a6, blocks: (B:46:0x00f9, B:48:0x0101, B:51:0x010b), top: B:105:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0134  */
    /* JADX WARN: Code duplicated, block: B:60:0x0138  */
    /* JADX WARN: Code duplicated, block: B:68:0x0160 A[Catch: all -> 0x0049, CancellationException -> 0x01ea, TryCatch #5 {all -> 0x0049, blocks: (B:14:0x0041, B:65:0x0158, B:69:0x016e, B:72:0x0176, B:74:0x017c, B:68:0x0160), top: B:111:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0174 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x0176 A[Catch: all -> 0x0049, CancellationException -> 0x01ea, TryCatch #5 {all -> 0x0049, blocks: (B:14:0x0041, B:65:0x0158, B:69:0x016e, B:72:0x0176, B:74:0x017c, B:68:0x0160), top: B:111:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ad  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ec -> B:105:0x00f9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object p(long r29, boolean r31, defpackage.nq4 r32) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ldh.p(long, boolean, nq4):java.lang.Object");
    }

    public final void q(ArrayList arrayList) {
        List list = (List) this.i.getValue();
        if (list.isEmpty()) {
            return;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (arrayList.contains(Long.valueOf(((emg) it.next()).a))) {
                ArrayList arrayList2 = new ArrayList(yw3.W0(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(((emg) it2.next()).a));
                }
                yab.i0(this.b, null, 0, new ryf(this, arrayList2, null, 17), 3);
                return;
            }
        }
    }

    public final void r() {
        gm0.n(this.j, "reloadFavoritesFromServer");
        ((s7f) ((et3) this.g.getValue())).C(0L);
        i(0L);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public final Object s(long j, long j2, nq4 nq4Var) {
        kdh kdhVar;
        long j3;
        long j4;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof kdh) {
            kdhVar = (kdh) nq4Var;
            int i = kdhVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                kdhVar.h = i - Integer.MIN_VALUE;
            } else {
                kdhVar = new kdh(this, nq4Var);
            }
        } else {
            kdhVar = new kdh(this, nq4Var);
        }
        kdh kdhVar2 = kdhVar;
        Object obj = kdhVar2.f;
        hu4 hu4Var = hu4.a;
        int i2 = kdhVar2.h;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                String str = this.j;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        StringBuilder sbS = qt4.s(j, "setFavoriteStickerSetMoved: stickerSetId=", ", targetPositionStickerSetId=");
                        sbS.append(j2);
                        a4cVar.c(je9Var, str, sbS.toString(), null);
                    }
                }
                dm6 dm6VarM = m();
                kdhVar2.d = j;
                kdhVar2.e = j2;
                kdhVar2.h = 1;
                Object objH = ch3.H(kdhVar2, new bm6(dm6VarM, j, j2, null), dm6VarM.a);
                if (objH != hu4Var) {
                    objH = sbiVar;
                }
                if (objH == hu4Var) {
                    return hu4Var;
                }
                j3 = j;
                j4 = j2;
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j5 = kdhVar2.e;
                long j6 = kdhVar2.d;
                ch3.d0(obj);
                j4 = j5;
                j3 = j6;
            }
            pvb pvbVarL = l();
            pvbVarL.getClass();
            long j7 = j3;
            long j8 = j4;
            pvb.t(pvbVarL, new ry(5, -1, pvbVarL.u().a.g(), j3, j4));
            String str2 = this.j;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.e;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, "setFavoriteStickerSetMoved: success move stickerSetId=" + j7 + ", to position of stickerSetId=" + j8, null);
                }
            }
            return sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.V(this.j, "setFavoriteStickerSetMoved: failed", th);
            return sbiVar;
        }
    }

    public final void t(long j) {
        String str = this.j;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(j, "setSectionUpdateTime: "), null);
            }
        }
        s7f s7fVar = (s7f) ((et3) this.g.getValue());
        s7fVar.U.B(s7fVar, s7f.j0[43], Long.valueOf(j));
    }
}
