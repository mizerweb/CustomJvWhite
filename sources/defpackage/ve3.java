package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ve3 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final String f = ve3.class.getName();
    public final l9b g = new l9b();

    public ve3(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x011f A[Catch: all -> 0x0132, LOOP:0: B:51:0x0119->B:53:0x011f, LOOP_END, TryCatch #1 {all -> 0x0132, blocks: (B:69:0x017e, B:72:0x0183, B:74:0x018a, B:77:0x0191, B:80:0x01a2, B:50:0x010d, B:51:0x0119, B:53:0x011f, B:56:0x0136), top: B:94:0x010d }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0166  */
    /* JADX WARN: Code duplicated, block: B:71:0x0182  */
    /* JADX WARN: Code duplicated, block: B:74:0x018a A[Catch: all -> 0x0132, TryCatch #1 {all -> 0x0132, blocks: (B:69:0x017e, B:72:0x0183, B:74:0x018a, B:77:0x0191, B:80:0x01a2, B:50:0x010d, B:51:0x0119, B:53:0x011f, B:56:0x0136), top: B:94:0x010d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a2 A[Catch: all -> 0x0132, TRY_LEAVE, TryCatch #1 {all -> 0x0132, blocks: (B:69:0x017e, B:72:0x0183, B:74:0x018a, B:77:0x0191, B:80:0x01a2, B:50:0x010d, B:51:0x0119, B:53:0x011f, B:56:0x0136), top: B:94:0x010d }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19, types: [j9b] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r4v10, types: [j9b] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11, types: [j9b] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2, types: [j9b] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final Object a(String str, nq4 nq4Var) throws Throwable {
        ue3 ue3Var;
        ?? r8;
        ?? r9;
        Object obj;
        r17 r17Var;
        String str2;
        int i;
        j9b j9bVar;
        String str3;
        int i2;
        pw pwVar;
        Iterator it;
        ?? r4;
        Object poeVar;
        Collection collectionValues;
        ?? r2;
        ?? r5;
        List list;
        List list2;
        r66 r66Var = r66.a;
        if (nq4Var instanceof ue3) {
            ue3Var = (ue3) nq4Var;
            int i3 = ue3Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ue3Var.k = i3 - Integer.MIN_VALUE;
            } else {
                ue3Var = new ue3(this, nq4Var);
            }
        } else {
            ue3Var = new ue3(this, nq4Var);
        }
        Object objH = ue3Var.i;
        hu4 hu4Var = hu4.a;
        int i4 = ue3Var.k;
        try {
            try {
                if (i4 == 0) {
                    ch3.d0(objH);
                    r17Var = (r17) ((sy4) this.c.getValue()).j(str).getValue();
                    if (r17Var == null) {
                        return r66Var;
                    }
                    l9b l9bVar = this.g;
                    ue3Var.d = str;
                    ue3Var.e = r17Var;
                    ue3Var.f = l9bVar;
                    ue3Var.g = 0;
                    ue3Var.k = 1;
                    if (l9bVar.b(ue3Var) != hu4Var) {
                        str2 = str;
                        i = 0;
                        j9bVar = l9bVar;
                    }
                    return hu4Var;
                }
                if (i4 == 1) {
                    int i5 = ue3Var.g;
                    j9b j9bVar2 = ue3Var.f;
                    r17Var = ue3Var.e;
                    str2 = ue3Var.d;
                    ch3.d0(objH);
                    j9bVar = j9bVar2;
                    i = i5;
                } else {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r4 = ue3Var.f;
                        try {
                            ch3.d0(objH);
                            r4 = r4;
                            poeVar = ((te3) objH).c.e();
                            r5 = r4;
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            poeVar = new poe(th);
                            r5 = r4;
                        }
                        ?? r10 = r5;
                        if (poeVar instanceof poe) {
                            poeVar = null;
                        }
                        List list3 = (List) poeVar;
                        list = list3;
                        if (list != null || list.isEmpty()) {
                            gm0.Y(this.f, "chat suggests from network is empty");
                            ((sa8) this.e.getValue()).a(r66Var);
                            list2 = r66Var;
                        } else {
                            ((sa8) this.e.getValue()).a(list3);
                            list2 = list3;
                        }
                        r2 = r10;
                        collectionValues = list2;
                        r2.g(null);
                        return collectionValues;
                    }
                    i2 = ue3Var.h;
                    i = ue3Var.g;
                    j9b j9bVar3 = ue3Var.f;
                    str3 = ue3Var.d;
                    try {
                        ch3.d0(objH);
                        r8 = j9bVar3;
                        try {
                            pwVar = new pw(0);
                            it = ((Iterable) objH).iterator();
                            while (it.hasNext()) {
                                pwVar.add(new Long(((rt2) it.next()).A()));
                            }
                            long[] jArrU1 = ww3.U1(pwVar);
                            try {
                                pvb pvbVar = (pvb) this.a.getValue();
                                String str4 = this.f;
                                ky kyVar = new ky(str3, jArrU1);
                                ed6 ed6Var = (ed6) this.d.getValue();
                                ue3Var.d = null;
                                ue3Var.e = null;
                                ue3Var.f = r8;
                                ue3Var.g = i;
                                ue3Var.h = i2;
                                ue3Var.k = 3;
                                objH = cqk.H(pvbVar, kyVar, str4, ed6Var, ue3Var);
                                if (objH != hu4Var) {
                                    r4 = r8;
                                    poeVar = ((te3) objH).c.e();
                                    r5 = r4;
                                    ?? r11 = r5;
                                    if (poeVar instanceof poe) {
                                        poeVar = null;
                                    }
                                    List list4 = (List) poeVar;
                                    list = list4;
                                    if (list != null) {
                                        gm0.Y(this.f, "chat suggests from network is empty");
                                        ((sa8) this.e.getValue()).a(r66Var);
                                        list2 = r66Var;
                                    } else {
                                        gm0.Y(this.f, "chat suggests from network is empty");
                                        ((sa8) this.e.getValue()).a(r66Var);
                                        list2 = r66Var;
                                    }
                                    r2 = r11;
                                    collectionValues = list2;
                                    r2.g(null);
                                    return collectionValues;
                                }
                                return hu4Var;
                            } catch (CancellationException e2) {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                r4 = r8;
                                poeVar = new poe(th);
                                r5 = r4;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            obj = null;
                            r9 = r8;
                            r9.g(obj);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = null;
                        r9 = j9bVar3;
                        r9.g(obj);
                        throw th;
                    }
                }
                sa8 sa8Var = (sa8) this.e.getValue();
                sa8Var.getClass();
                boolean z = System.currentTimeMillis() - sa8Var.c > sa8Var.a;
                String str5 = this.f;
                if (z) {
                    gm0.n(str5, "expired cache, load from network");
                    uy2 uy2Var = (uy2) this.b.getValue();
                    LinkedHashSet linkedHashSet = r17Var.j;
                    ni3 li3Var = r17Var.a() ? new li3(linkedHashSet) : new mi3(r17Var.a, r17Var.e, r17Var.d, r17Var.p, r17Var.q, r17Var.g, new zc6(linkedHashSet));
                    ue3Var.d = str2;
                    ue3Var.e = null;
                    ue3Var.f = j9bVar;
                    ue3Var.g = i;
                    ue3Var.h = 0;
                    ue3Var.k = 2;
                    List listC = uy2Var.c(li3Var);
                    if (listC != hu4Var) {
                        r8 = j9bVar;
                        str3 = str2;
                        objH = listC;
                        i2 = 0;
                        pwVar = new pw(0);
                        it = ((Iterable) objH).iterator();
                        while (it.hasNext()) {
                            pwVar.add(new Long(((rt2) it.next()).A()));
                        }
                        long[] jArrU2 = ww3.U1(pwVar);
                        pvb pvbVar2 = (pvb) this.a.getValue();
                        String str6 = this.f;
                        ky kyVar2 = new ky(str3, jArrU2);
                        ed6 ed6Var2 = (ed6) this.d.getValue();
                        ue3Var.d = null;
                        ue3Var.e = null;
                        ue3Var.f = r8;
                        ue3Var.g = i;
                        ue3Var.h = i2;
                        ue3Var.k = 3;
                        objH = cqk.H(pvbVar2, kyVar2, str6, ed6Var2, ue3Var);
                        if (objH != hu4Var) {
                            r4 = r8;
                            poeVar = ((te3) objH).c.e();
                            r5 = r4;
                            ?? r12 = r5;
                            if (poeVar instanceof poe) {
                                poeVar = null;
                            }
                            List list5 = (List) poeVar;
                            list = list5;
                            if (list != null) {
                                gm0.Y(this.f, "chat suggests from network is empty");
                                ((sa8) this.e.getValue()).a(r66Var);
                                list2 = r66Var;
                            } else {
                                gm0.Y(this.f, "chat suggests from network is empty");
                                ((sa8) this.e.getValue()).a(r66Var);
                                list2 = r66Var;
                            }
                            r2 = r12;
                            collectionValues = list2;
                        }
                    }
                    return hu4Var;
                }
                gm0.n(str5, "get suggests from cache");
                r2 = j9bVar;
                collectionValues = ((sa8) this.e.getValue()).b.values();
                r2.g(null);
                return collectionValues;
            } catch (Throwable th5) {
                th = th5;
                r8 = j9bVar;
                obj = null;
                r9 = r8;
                r9.g(obj);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            r8 = ue3Var;
        }
    }
}
