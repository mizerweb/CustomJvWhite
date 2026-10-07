package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.a;
import ru.ok.tamtam.stickers.favorite.FavoriteStickersController$FavoriteStickerControllerException;

/* JADX INFO: loaded from: classes.dex */
public final class um6 {
    public final String a = um6.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final mjg j;
    public final tm6 k;

    public um6(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var8;
        this.h = ny8Var6;
        this.i = ny8Var7;
        mjg mjgVarA = p90.a(r66.a);
        this.j = mjgVarA;
        this.k = new tm6(new r8e(mjgVarA), 0);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00bb A[Catch: all -> 0x0062, CancellationException -> 0x00f8, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:42:0x00b1, B:44:0x00bb, B:26:0x005e, B:35:0x008a), top: B:62:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    public static final Object a(um6 um6Var, long j, nq4 nq4Var) {
        hm6 hm6Var;
        long j2;
        Object poeVar;
        Throwable thA;
        String str;
        a4c a4cVar;
        je9 je9Var;
        int i;
        int i2;
        em6 em6Var;
        long jA;
        long j3;
        um6Var.getClass();
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof hm6) {
            hm6Var = (hm6) nq4Var;
            int i3 = hm6Var.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hm6Var.j = i3 - Integer.MIN_VALUE;
            } else {
                hm6Var = new hm6(um6Var, nq4Var);
            }
        } else {
            hm6Var = new hm6(um6Var, nq4Var);
        }
        Object objG = hm6Var.h;
        hu4 hu4Var = hu4.a;
        int i4 = hm6Var.j;
        int i5 = 0;
        lq4 lq4Var = null;
        try {
            try {
                if (i4 == 0) {
                    ch3.d0(objG);
                    gm0.m(um6Var.a, "loadFromMarker: marker=%d", new Long(j));
                    hm6Var.d = j;
                    hm6Var.e = 0;
                    hm6Var.f = 0;
                    hm6Var.j = 1;
                    objG = g(um6Var, j, hm6Var);
                    if (objG != hu4Var) {
                        j2 = j;
                        i = 0;
                        i2 = 0;
                    }
                    return hu4Var;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        i = hm6Var.f;
                        i2 = hm6Var.e;
                        long j4 = hm6Var.d;
                        em6Var = hm6Var.g;
                        try {
                            ch3.d0(objG);
                            j2 = j4;
                            if (em6Var.a() != 0) {
                                jA = em6Var.a();
                                hm6Var.g = null;
                                hm6Var.d = j2;
                                hm6Var.e = i2;
                                hm6Var.f = i;
                                hm6Var.j = 3;
                                if (a(um6Var, jA, hm6Var) != hu4Var) {
                                    j3 = j2;
                                }
                                return hu4Var;
                            }
                            poeVar = sbiVar;
                        } catch (Throwable th) {
                            th = th;
                            j2 = j4;
                            poeVar = new poe(th);
                        }
                        thA = roe.a(poeVar);
                        if (thA != null) {
                            str = um6Var.a;
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, zo5.j(j2, "loadFromMarker: failed to load from marker="), thA);
                                }
                            }
                        }
                        return sbiVar;
                    }
                    if (i4 != 3) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j3 = hm6Var.d;
                    ch3.d0(objG);
                    j2 = j3;
                    poeVar = sbiVar;
                    thA = roe.a(poeVar);
                    if (thA != null) {
                        str = um6Var.a;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, zo5.j(j2, "loadFromMarker: failed to load from marker="), thA);
                            }
                        }
                    }
                    return sbiVar;
                }
                i = hm6Var.f;
                i2 = hm6Var.e;
                j2 = hm6Var.d;
                try {
                    ch3.d0(objG);
                } catch (Throwable th2) {
                    th = th2;
                    poeVar = new poe(th);
                }
                em6 em6Var2 = (em6) objG;
                an6 an6VarJ = um6Var.j();
                List listB = em6Var2.b();
                hm6Var.g = em6Var2;
                hm6Var.d = j2;
                hm6Var.e = i2;
                hm6Var.f = i;
                hm6Var.j = 2;
                Object objH = ch3.H(hm6Var, new zm6(an6VarJ, listB, lq4Var, i5), an6VarJ.a);
                if (objH != hu4Var) {
                    objH = sbiVar;
                }
                if (objH != hu4Var) {
                    em6Var = em6Var2;
                    if (em6Var.a() != 0) {
                        jA = em6Var.a();
                        hm6Var.g = null;
                        hm6Var.d = j2;
                        hm6Var.e = i2;
                        hm6Var.f = i;
                        hm6Var.j = 3;
                        if (a(um6Var, jA, hm6Var) != hu4Var) {
                            j3 = j2;
                            j2 = j3;
                        }
                    }
                    poeVar = sbiVar;
                    thA = roe.a(poeVar);
                    if (thA != null) {
                        str = um6Var.a;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, zo5.j(j2, "loadFromMarker: failed to load from marker="), thA);
                            }
                        }
                    }
                    return sbiVar;
                }
                return hu4Var;
            } catch (Throwable th3) {
                th = th3;
                j2 = j;
            }
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object b(um6 um6Var, List list, nq4 nq4Var) {
        km6 km6Var;
        Object poeVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof km6) {
            km6Var = (km6) nq4Var;
            int i = km6Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                km6Var.g = i - Integer.MIN_VALUE;
            } else {
                km6Var = new km6(um6Var, nq4Var);
            }
        } else {
            km6Var = new km6(um6Var, nq4Var);
        }
        Object obj = km6Var.e;
        hu4 hu4Var = hu4.a;
        int i2 = km6Var.g;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                gm0.m(um6Var.a, "onListUpdated: ids=%s", list);
                if (list == null) {
                    gm0.Y(um6Var.a, "onListUpdated: Warning ids is null");
                    return sbiVar;
                }
                an6 an6VarJ = um6Var.j();
                km6Var.d = list;
                km6Var.g = 1;
                if (an6VarJ.b(list, km6Var) == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = km6Var.d;
                ch3.d0(obj);
            }
            poeVar = sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            String str = um6Var.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "onListUpdated: failed to store stickers " + list, thA);
                }
            }
            um6Var.m();
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object c(um6 um6Var, long j, nq4 nq4Var) {
        lm6 lm6Var;
        long j2;
        Throwable th;
        Object poeVar;
        Throwable thA;
        String str;
        a4c a4cVar;
        je9 je9Var;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof lm6) {
            lm6Var = (lm6) nq4Var;
            int i = lm6Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                lm6Var.g = i - Integer.MIN_VALUE;
            } else {
                lm6Var = new lm6(um6Var, nq4Var);
            }
        } else {
            lm6Var = new lm6(um6Var, nq4Var);
        }
        Object obj = lm6Var.e;
        hu4 hu4Var = hu4.a;
        int i2 = lm6Var.g;
        boolean z = true;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                gm0.m(um6Var.a, "onNotifAdded: added sticker %d to cache", new Long(j));
                try {
                    an6 an6VarJ = um6Var.j();
                    lm6Var.d = j;
                    lm6Var.g = 1;
                    try {
                        try {
                            j2 = j;
                            try {
                                Object objH = ch3.H(lm6Var, new am6(an6VarJ, j2, z, null, 1), an6VarJ.a);
                                if (objH != hu4Var) {
                                    objH = sbiVar;
                                }
                                if (objH == hu4Var) {
                                    return hu4Var;
                                }
                                j = j2;
                                poeVar = sbiVar;
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                j = j2;
                                poeVar = new poe(th);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            j2 = j;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        j2 = j;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th = th;
                    poeVar = new poe(th);
                    thA = roe.a(poeVar);
                    if (thA != null) {
                        str = um6Var.a;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, nbh.s(j, "onNotifAdded: failed to add sticker ", " to cache"), thA);
                            }
                        }
                        um6Var.m();
                    }
                    return sbiVar;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = lm6Var.d;
                try {
                    ch3.d0(obj);
                    poeVar = sbiVar;
                } catch (Throwable th6) {
                    th = th6;
                    th = th;
                    poeVar = new poe(th);
                }
            }
            thA = roe.a(poeVar);
            if (thA != null) {
                str = um6Var.a;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, nbh.s(j, "onNotifAdded: failed to add sticker ", " to cache"), thA);
                    }
                }
                um6Var.m();
            }
            return sbiVar;
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object d(um6 um6Var, long j, int i, nq4 nq4Var) {
        mm6 mm6Var;
        long j2;
        int i2;
        Object poeVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof mm6) {
            mm6Var = (mm6) nq4Var;
            int i3 = mm6Var.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mm6Var.h = i3 - Integer.MIN_VALUE;
            } else {
                mm6Var = new mm6(um6Var, nq4Var);
            }
        } else {
            mm6Var = new mm6(um6Var, nq4Var);
        }
        mm6 mm6Var2 = mm6Var;
        Object obj = mm6Var2.f;
        hu4 hu4Var = hu4.a;
        int i4 = mm6Var2.h;
        try {
            if (i4 == 0) {
                ch3.d0(obj);
                gm0.m(um6Var.a, "onNotifMoved: success move id=%d to position=%d", new Long(j), new Integer(i));
                try {
                    an6 an6VarJ = um6Var.j();
                    mm6Var2.d = j;
                    mm6Var2.e = i;
                    mm6Var2.h = 1;
                    Object objH = ch3.H(mm6Var2, new cm6(an6VarJ, j, i, null, 1), an6VarJ.a);
                    if (objH != hu4Var) {
                        objH = sbiVar;
                    }
                    if (objH == hu4Var) {
                        return hu4Var;
                    }
                    j2 = j;
                    i2 = i;
                    poeVar = sbiVar;
                } catch (Throwable th) {
                    th = th;
                    j2 = j;
                    i2 = i;
                    poeVar = new poe(th);
                }
            } else {
                if (i4 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = mm6Var2.e;
                j2 = mm6Var2.d;
                try {
                    ch3.d0(obj);
                    poeVar = sbiVar;
                } catch (Throwable th2) {
                    th = th2;
                    poeVar = new poe(th);
                }
            }
            Throwable thA = roe.a(poeVar);
            if (thA != null) {
                String str = um6Var.a;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.g(i2, j2, "onNotifMoved: failed to move id=", " to position="), thA);
                    }
                }
                um6Var.m();
            }
            return sbiVar;
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object e(um6 um6Var, List list, nq4 nq4Var) {
        nm6 nm6Var;
        Object poeVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof nm6) {
            nm6Var = (nm6) nq4Var;
            int i = nm6Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                nm6Var.g = i - Integer.MIN_VALUE;
            } else {
                nm6Var = new nm6(um6Var, nq4Var);
            }
        } else {
            nm6Var = new nm6(um6Var, nq4Var);
        }
        Object obj = nm6Var.e;
        hu4 hu4Var = hu4.a;
        int i2 = nm6Var.g;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                gm0.m(um6Var.a, "onNotifRemoved: removed stickers %s from cache", list);
                an6 an6VarJ = um6Var.j();
                nm6Var.d = list;
                nm6Var.g = 1;
                if (an6VarJ.f(list, nm6Var) == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = nm6Var.d;
                ch3.d0(obj);
            }
            poeVar = sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            String str = um6Var.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, v0h.d("onNotifRemoved: failed to remove stickers ", " from cache", list), thA);
                }
            }
            um6Var.m();
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object f(um6 um6Var, long j, nq4 nq4Var) {
        om6 om6Var;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof om6) {
            om6Var = (om6) nq4Var;
            int i = om6Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                om6Var.g = i - Integer.MIN_VALUE;
            } else {
                om6Var = new om6(um6Var, nq4Var);
            }
        } else {
            om6Var = new om6(um6Var, nq4Var);
        }
        Object objP = om6Var.e;
        Object obj = hu4.a;
        int i2 = om6Var.g;
        if (i2 == 0) {
            ch3.d0(objP);
            gm0.m(um6Var.a, "onNotifUpdated: id=%d", new Long(j));
            vdh vdhVar = (vdh) um6Var.c.getValue();
            List listSingletonList = Collections.singletonList(new Long(j));
            vdhVar.getClass();
            bye byeVar = new bye(new cke(vdhVar, listSingletonList, null));
            om6Var.d = j;
            om6Var.g = 1;
            objP = e9i.P(byeVar, om6Var);
            if (objP != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            j = om6Var.d;
            ch3.d0(objP);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    ch3.d0(objP);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = om6Var.d;
            ch3.d0(objP);
        }
        om6Var.d = j;
        om6Var.g = 3;
        if (um6Var.l((List) objP, om6Var) != obj) {
            return obj;
        }
        return sbiVar;
        List list = (List) objP;
        if (list == null || list.isEmpty()) {
            String str = um6Var.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, nbh.s(j, "Can't update sticker by id ", " because can't load it"), null);
                }
            }
            um6Var.m();
            return sbiVar;
        }
        an6 an6VarJ = um6Var.j();
        om6Var.d = j;
        om6Var.g = 2;
        objP = ch3.I(om6Var, an6VarJ.a, true, false, new us5(18));
        if (objP != obj) {
            om6Var.d = j;
            om6Var.g = 3;
            if (um6Var.l((List) objP, om6Var) != obj) {
                return sbiVar;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object g(um6 um6Var, long j, nq4 nq4Var) {
        rm6 rm6Var;
        um6Var.getClass();
        if (nq4Var instanceof rm6) {
            rm6Var = (rm6) nq4Var;
            int i = rm6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                rm6Var.f = i - Integer.MIN_VALUE;
            } else {
                rm6Var = new rm6(um6Var, nq4Var);
            }
        } else {
            rm6Var = new rm6(um6Var, nq4Var);
        }
        rm6 rm6Var2 = rm6Var;
        Object objE = rm6Var2.d;
        int i2 = rm6Var2.f;
        if (i2 == 0) {
            ch3.d0(objE);
            vsb vsbVar = new vsb(0, 50, j, "FAVORITE_STICKERS", (String) null);
            pvb pvbVar = (pvb) um6Var.f.getValue();
            String str = um6Var.a;
            rm6Var2.f = 1;
            objE = qe7.E(pvbVar, vsbVar, str, 0L, 0, null, null, rm6Var2, 124);
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
        if (objE == null) {
            ore.p("Required value was null.");
            return null;
        }
        my myVar = (my) objE;
        return new em6(myVar.h(), myVar.k());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(boolean z, nq4 nq4Var) throws FavoriteStickersController$FavoriteStickerControllerException {
        fm6 fm6Var;
        if (nq4Var instanceof fm6) {
            fm6Var = (fm6) nq4Var;
            int i = fm6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                fm6Var.f = i - Integer.MIN_VALUE;
            } else {
                fm6Var = new fm6(this, nq4Var);
            }
        } else {
            fm6Var = new fm6(this, nq4Var);
        }
        Object objI = fm6Var.d;
        int i2 = fm6Var.f;
        if (i2 == 0) {
            ch3.d0(objI);
            if (z) {
                an6 an6VarJ = j();
                fm6Var.f = 1;
                objI = ch3.I(fm6Var, an6VarJ.a, true, false, new us5(19));
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
        if (((Number) objI).longValue() >= ((Number) ((g5d) ((gjf) this.e.getValue())).a.U.a(e5d.S6[40]).i()).intValue()) {
            throw new FavoriteStickersController$FavoriteStickerControllerException() { // from class: ru.ok.tamtam.stickers.favorite.FavoriteStickersController$MaxFavoriteStickersException
            };
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(nq4 nq4Var) {
        gm6 gm6Var;
        Object poeVar;
        if (nq4Var instanceof gm6) {
            gm6Var = (gm6) nq4Var;
            int i = gm6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                gm6Var.f = i - Integer.MIN_VALUE;
            } else {
                gm6Var = new gm6(this, nq4Var);
            }
        } else {
            gm6Var = new gm6(this, nq4Var);
        }
        Object obj = gm6Var.d;
        int i2 = gm6Var.f;
        sbi sbiVar = sbi.a;
        String str = this.a;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                gm0.n(str, "clear");
                an6 an6VarJ = j();
                gm6Var.f = 1;
                Object objI = ch3.I(gm6Var, an6VarJ.a, false, true, new us5(20));
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
            poeVar = sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(str, "clear: failed to clear repository", thA);
        }
        return sbiVar;
    }

    public final an6 j() {
        return (an6) this.b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object k(long j, boolean z, nq4 nq4Var) {
        im6 im6Var;
        long j2;
        boolean z2;
        boolean z3;
        long j3;
        if (nq4Var instanceof im6) {
            im6Var = (im6) nq4Var;
            int i = im6Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                im6Var.h = i - Integer.MIN_VALUE;
            } else {
                im6Var = new im6(this, nq4Var);
            }
        } else {
            im6Var = new im6(this, nq4Var);
        }
        Object obj = im6Var.f;
        int i2 = im6Var.h;
        Object obj2 = sbi.a;
        String str = this.a;
        Object obj3 = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            gm0.m(str, "markAsFavorite: stickerId=%d, favorite=%b", new Long(j), Boolean.valueOf(z));
            im6Var.d = j;
            im6Var.e = z;
            im6Var.h = 1;
            if (h(z, im6Var) != obj3) {
                j2 = j;
                z2 = z;
            }
            return obj3;
        }
        if (i2 == 1) {
            z2 = im6Var.e;
            long j4 = im6Var.d;
            ch3.d0(obj);
            j2 = j4;
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = im6Var.e;
            long j5 = im6Var.d;
            ch3.d0(obj);
            j3 = j5;
        }
        if (z3) {
            gm0.m(str, "addToFavorites: stickerId=%d", Long.valueOf(j3));
            pvb pvbVar = (pvb) this.f.getValue();
            pvbVar.getClass();
            pvb.t(pvbVar, new hy(4, pvbVar.u().a.g(), j3));
        } else {
            o(new long[]{j3});
        }
        return obj2;
        an6 an6VarJ = j();
        im6Var.d = j2;
        im6Var.e = z2;
        im6Var.h = 2;
        boolean z4 = z2;
        Object objH = ch3.H(im6Var, new am6(an6VarJ, j2, z4, null, 1), an6VarJ.a);
        if (objH != obj3) {
            objH = obj2;
        }
        if (objH != obj3) {
            z3 = z4;
            j3 = j2;
            if (z3) {
                gm0.m(str, "addToFavorites: stickerId=%d", Long.valueOf(j3));
                pvb pvbVar2 = (pvb) this.f.getValue();
                pvbVar2.getClass();
                pvb.t(pvbVar2, new hy(4, pvbVar2.u().a.g(), j3));
            } else {
                o(new long[]{j3});
            }
            return obj2;
        }
        return obj3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object l(List list, nq4 nq4Var) {
        pm6 pm6Var;
        Object poeVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof pm6) {
            pm6Var = (pm6) nq4Var;
            int i = pm6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pm6Var.f = i - Integer.MIN_VALUE;
            } else {
                pm6Var = new pm6(this, nq4Var);
            }
        } else {
            pm6Var = new pm6(this, nq4Var);
        }
        Object objD = pm6Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = pm6Var.f;
        try {
            if (i2 == 0) {
                ch3.d0(objD);
                vdh vdhVar = (vdh) this.c.getValue();
                pm6Var.f = 1;
                objD = vdhVar.d(list, pm6Var);
                if (objD == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objD);
            }
            List list2 = (List) objD;
            String str = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "publishFavoritesIds, stickers size: " + list2.size(), null);
                }
            }
            this.j.setValue(list2);
            poeVar = sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(this.a, "publishFavoritesIds: failed", thA);
        }
        return sbiVar;
    }

    public final void m() {
        String str = this.a;
        gm0.n(str, "reloadFavoritesFromServer: ");
        ((s7f) ((et3) this.d.getValue())).C(0L);
        gm0.m(str, "assetsUpdate: request, sync=%d", 0L);
        yab.i0((gu4) this.h.getValue(), null, 0, new qy3(this, null, 18), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(List list, nq4 nq4Var) {
        qm6 qm6Var;
        if (nq4Var instanceof qm6) {
            qm6Var = (qm6) nq4Var;
            int i = qm6Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                qm6Var.g = i - Integer.MIN_VALUE;
            } else {
                qm6Var = new qm6(this, nq4Var);
            }
        } else {
            qm6Var = new qm6(this, nq4Var);
        }
        Object obj = qm6Var.e;
        int i2 = qm6Var.g;
        String str = this.a;
        if (i2 == 0) {
            ch3.d0(obj);
            gm0.m(str, "removeFromFavorites: ids=%s", list);
            an6 an6VarJ = j();
            qm6Var.d = list;
            qm6Var.g = 1;
            Object objF = an6VarJ.f(list, qm6Var);
            hu4 hu4Var = hu4.a;
            if (objF == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = qm6Var.d;
            ch3.d0(obj);
        }
        o(ww3.U1(list));
        gm0.n(str, "removeFromFavorites: complete");
        return sbi.a;
    }

    public final void o(long[] jArr) {
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "removeFromFavorites: stickerIds=".concat(a.f1(63, jArr)), null);
            }
        }
        ((pvb) this.f.getValue()).c(4, jArr);
    }
}
