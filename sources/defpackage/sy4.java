package defpackage;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.a;
import ru.ok.tamtam.folders.usecases.NotFoundFolderException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class sy4 implements hh9 {
    public final mzb a;
    public final r2c b;
    public final String c = sy4.class.getName();
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ite j;
    public final ConcurrentHashMap k;
    public final u8b l;
    public final pzf m;
    public final r8e n;
    public final i64 o;
    public final l9b p;
    public final ul9 q;

    public sy4(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, mzb mzbVar, r2c r2cVar, ite iteVar) {
        this.a = mzbVar;
        this.b = r2cVar;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var4;
        this.g = ny8Var3;
        this.h = ny8Var6;
        this.i = ny8Var5;
        this.j = iteVar;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.computeIfAbsent("all.chat.folder", new mm(8, new g3(12, this)));
        this.k = concurrentHashMap;
        this.l = cqb.c("all.chat.folder");
        pzf pzfVarB = e9i.b(1, 0, 6);
        this.m = pzfVarB;
        this.n = e9i.G0(new fz6(e9i.M0(pzfVarB, new vm1((lq4) null, this, 2)), new y73(this, (lq4) null, 7), 3), iteVar, j0g.b, r66.a);
        this.o = new i64();
        l9b l9bVar = new l9b();
        this.p = l9bVar;
        ul9 ul9Var = new ul9();
        Set setSingleton = Collections.singleton(i37.UNREAD);
        Context context = r2cVar.a;
        ul9Var.put(setSingleton, context.getString(R.string.folder_new));
        ul9Var.put(a.p1(new i37[]{i37.CONTACT, i37.NOT_CONTACT}), context.getString(R.string.folder_personal));
        if (((f5d) ((wo6) ny8Var7.getValue())).o()) {
            ul9Var.put(Collections.singleton(i37.CHANNEL), context.getString(R.string.folder_filter_channels));
        }
        this.q = ul9Var.b();
        yab.i0(iteVar, null, 0, new qy4(l9bVar, null, this, ny8Var3), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static final Object a(sy4 sy4Var, int i, vy2 vy2Var, nq4 nq4Var) {
        jy4 jy4Var;
        rqe rqeVar;
        r17 r17Var;
        vy2 vy2Var2 = vy2Var;
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.d;
        if (nq4Var instanceof jy4) {
            jy4Var = (jy4) nq4Var;
            int i2 = jy4Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jy4Var.h = i2 - Integer.MIN_VALUE;
            } else {
                jy4Var = new jy4(sy4Var, nq4Var);
            }
        } else {
            jy4Var = new jy4(sy4Var, nq4Var);
        }
        Object obj = jy4Var.f;
        hu4 hu4Var = hu4.a;
        int i3 = jy4Var.h;
        if (i3 == 0) {
            ch3.d0(obj);
            String str = sy4Var.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                String str2 = vy2Var2.a;
                int i4 = vy2Var2.e.d;
                StringBuilder sbR = c0a.r(i, "internalCreate of folder=", str2, " on position=", ", includeS:");
                sbR.append(i4);
                a4cVar.c(je9Var, str, sbR.toString(), null);
            }
            if (((f9b) sy4Var.k.get(vy2Var2.a)) != null) {
                gm0.Y(sy4Var.c, "Prev flow exist when we do internal create");
            }
            rqe rqeVarA = f55.A(vy2Var2, i);
            bre breVarK = sy4Var.k();
            m8b m8bVar = vy2Var2.e;
            jy4Var.d = vy2Var2;
            jy4Var.e = rqeVarA;
            jy4Var.h = 1;
            Object objH = ch3.H(jy4Var, new zqe(breVarK, rqeVarA, m8bVar, false, null), breVarK.a);
            if (objH != hu4Var) {
                objH = sbiVar;
            }
            if (objH == hu4Var) {
                return hu4Var;
            }
            rqeVar = rqeVarA;
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rqeVar = jy4Var.e;
            vy2Var2 = jy4Var.d;
            ch3.d0(obj);
        }
        sy4Var.k.put(vy2Var2.a, p90.a(f55.C(rqeVar, sy4Var.l(), rx8.l0(vy2Var2.e), 12)));
        if (vy2Var2.e.j()) {
            String str3 = sy4Var.c;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                f9b f9bVar = (f9b) sy4Var.k.get(vy2Var2.a);
                a4cVar2.c(je9Var, str3, qv1.j("Check include after save, size:", (f9bVar == null || (r17Var = (r17) f9bVar.getValue()) == null) ? null : new Integer(r17Var.e.size())), null);
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object b(sy4 sy4Var, ArrayList arrayList, nq4 nq4Var) {
        ky4 ky4Var;
        LinkedHashMap linkedHashMap;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        je9 je9Var = je9.d;
        if (nq4Var instanceof ky4) {
            ky4Var = (ky4) nq4Var;
            int i = ky4Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ky4Var.g = i - Integer.MIN_VALUE;
            } else {
                ky4Var = new ky4(sy4Var, nq4Var);
            }
        } else {
            ky4Var = new ky4(sy4Var, nq4Var);
        }
        Object obj = ky4Var.e;
        int i2 = ky4Var.g;
        if (i2 == 0) {
            ch3.d0(obj);
            String str = sy4Var.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(arrayList.size(), "internalCreateBatch: folders = "), null);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ylc ylcVar = (ylc) it.next();
                int iIntValue = ((Number) ylcVar.a).intValue();
                vy2 vy2Var = (vy2) ylcVar.b;
                linkedHashMap2.put(f55.A(vy2Var, iIntValue), vy2Var.e);
            }
            bre breVarK = sy4Var.k();
            ky4Var.d = linkedHashMap2;
            ky4Var.g = 1;
            Object objH = ch3.H(ky4Var, new are(breVarK, linkedHashMap2, false, null), breVarK.a);
            if (objH != hu4Var) {
                objH = sbiVar;
            }
            if (objH == hu4Var) {
                return hu4Var;
            }
            linkedHashMap = linkedHashMap2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashMap = ky4Var.d;
            ch3.d0(obj);
        }
        String str2 = sy4Var.c;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, zo5.h(linkedHashMap.size(), "internalCreateBatch: save folders in database. Entities were saved: "), null);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            rqe rqeVar = (rqe) entry.getKey();
            sy4Var.k.put(rqeVar.a, p90.a(f55.C(rqeVar, sy4Var.l(), rx8.l0((m8b) entry.getValue()), 12)));
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd A[LOOP:0: B:33:0x0095->B:43:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0 A[EDGE_INSN: B:46:0x00d0->B:44:0x00d0 BREAK  A[LOOP:0: B:33:0x0095->B:43:0x00cd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object d(sy4 sy4Var, c9b c9bVar, nq4 nq4Var) {
        ly4 ly4Var;
        c9b c9bVar2 = c9bVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof ly4) {
            ly4Var = (ly4) nq4Var;
            int i = ly4Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ly4Var.g = i - Integer.MIN_VALUE;
            } else {
                ly4Var = new ly4(sy4Var, nq4Var);
            }
        } else {
            ly4Var = new ly4(sy4Var, nq4Var);
        }
        Object obj = ly4Var.e;
        hu4 hu4Var = hu4.a;
        int i2 = ly4Var.g;
        if (i2 == 0) {
            ch3.d0(obj);
            if (c9bVar2.d == 0) {
                gm0.Y(sy4.class.getName(), "Early return in internalDelete cuz of folderIds.isEmpty()");
                return sbiVar;
            }
            String str = sy4Var.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "internalDelete of folders=" + c9bVar2, null);
                }
            }
            bre breVarK = sy4Var.k();
            List listA = pol.a(c9bVar2);
            ly4Var.d = c9bVar2;
            ly4Var.g = 1;
            Object objH = ch3.H(ly4Var, new wj1(breVarK, listA, null, 7), breVarK.a);
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
            c9bVar2 = ly4Var.d;
            ch3.d0(obj);
        }
        Object[] objArr = c9bVar2.b;
        long[] jArr = c9bVar2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            sy4Var.k.remove((String) objArr[(i3 << 3) + i5]);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                    if (i3 != length) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0085  */
    /* JADX WARN: Code duplicated, block: B:26:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b5 -> B:38:0x00f3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e1 -> B:37:0x00e8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(defpackage.sy4 r16, java.util.List r17, defpackage.nq4 r18) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy4.e(sy4, java.util.List, nq4):java.lang.Object");
    }

    @Override // defpackage.hh9
    public final void c() throws Throwable {
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Clearing all cache on logout", null);
            }
        }
        this.k.clear();
        this.k.computeIfAbsent("all.chat.folder", new mm(8, new g3(12, this)));
        yab.A0(k66.a, new qy3(this, null, 6));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0122  */
    /* JADX WARN: Code duplicated, block: B:44:0x013f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0142  */
    /* JADX WARN: Code duplicated, block: B:47:0x0146  */
    /* JADX WARN: Code duplicated, block: B:48:0x0149 A[Catch: all -> 0x0073, TryCatch #1 {all -> 0x0073, blocks: (B:22:0x0064, B:42:0x0137, B:49:0x014b, B:48:0x0149), top: B:63:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0177  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object f(long j, vy2 vy2Var, u8b u8bVar, nq4 nq4Var) throws Throwable {
        cy4 cy4Var;
        long j2;
        vy2 vy2Var2;
        u8b u8bVar2;
        int i;
        sy4 sy4Var;
        sy4 sy4Var2;
        long j3;
        vy2 vy2Var3;
        int i2;
        j9b j9bVar;
        int i3;
        int iH;
        int i4;
        u8b u8bVar3;
        j9b j9bVar2;
        int i5;
        int i6;
        int i7;
        sy4 sy4Var3;
        long j4;
        long j5;
        int i8;
        boolean z;
        int i9;
        pzf pzfVar;
        sy4 sy4Var4;
        long j6;
        Object obj;
        long j7 = j;
        u8b u8bVar4 = this.l;
        if (nq4Var instanceof cy4) {
            cy4Var = (cy4) nq4Var;
            int i10 = cy4Var.q;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cy4Var.q = i10 - Integer.MIN_VALUE;
            } else {
                cy4Var = new cy4(this, nq4Var);
            }
        } else {
            cy4Var = new cy4(this, nq4Var);
        }
        Object obj2 = cy4Var.o;
        int i11 = cy4Var.q;
        hu4 hu4Var = hu4.a;
        if (i11 == 0) {
            ch3.d0(obj2);
            cy4Var.f = vy2Var;
            cy4Var.g = u8bVar;
            cy4Var.h = this;
            cy4Var.d = j7;
            cy4Var.e = j7;
            cy4Var.j = 0;
            cy4Var.q = 1;
            if (this.o.p(cy4Var) != hu4Var) {
                j2 = j7;
                vy2Var2 = vy2Var;
                u8bVar2 = u8bVar;
                i = 0;
                sy4Var = this;
            }
            return hu4Var;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    int i12 = cy4Var.n;
                    int i13 = cy4Var.m;
                    i8 = cy4Var.l;
                    int i14 = cy4Var.k;
                    int i15 = cy4Var.j;
                    j4 = cy4Var.e;
                    j5 = cy4Var.d;
                    j9bVar2 = cy4Var.i;
                    sy4Var3 = cy4Var.h;
                    u8b u8bVar5 = cy4Var.g;
                    vy2Var3 = cy4Var.f;
                    try {
                        ch3.d0(obj2);
                        i6 = i13;
                        u8bVar3 = u8bVar5;
                        i7 = i15;
                        i5 = i14;
                        i4 = i12;
                        vy2 vy2Var4 = vy2Var3;
                        if (u8bVar3.h("all.chat.folder") >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            i9 = i4;
                        } else {
                            i9 = i4 + 1;
                        }
                        u8bVar4.a(i9, vy2Var4.a);
                        pzfVar = this.m;
                        cy4Var.f = null;
                        cy4Var.g = null;
                        cy4Var.h = sy4Var3;
                        cy4Var.i = j9bVar2;
                        cy4Var.d = j5;
                        cy4Var.e = j4;
                        cy4Var.j = i7;
                        cy4Var.k = i5;
                        cy4Var.l = i8;
                        cy4Var.m = i6;
                        cy4Var.n = i4;
                        cy4Var.q = 4;
                        if (pzfVar.emit(u8bVar4, cy4Var) == hu4Var) {
                            return hu4Var;
                        }
                        sy4Var4 = sy4Var3;
                        j9bVar = j9bVar2;
                        j6 = j4;
                    } catch (Throwable th) {
                        th = th;
                        j9bVar = j9bVar2;
                        obj = null;
                        j9bVar.g(obj);
                        throw th;
                    }
                } else {
                    if (i11 != 4) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j6 = cy4Var.e;
                    j9bVar = cy4Var.i;
                    sy4Var4 = cy4Var.h;
                    try {
                        ch3.d0(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        obj = null;
                        j9bVar.g(obj);
                        throw th;
                    }
                }
                ((xb9) sy4Var4.i()).h0(j6);
                j9bVar.g(null);
                return sbi.a;
            }
            int i16 = cy4Var.k;
            int i17 = cy4Var.j;
            j3 = cy4Var.e;
            long j8 = cy4Var.d;
            j9b j9bVar3 = cy4Var.i;
            sy4 sy4Var5 = cy4Var.h;
            u8b u8bVar6 = cy4Var.g;
            vy2 vy2Var5 = cy4Var.f;
            ch3.d0(obj2);
            i2 = i17;
            j9bVar = j9bVar3;
            j2 = j8;
            sy4Var2 = sy4Var5;
            u8bVar2 = u8bVar6;
            i3 = i16;
            vy2Var3 = vy2Var5;
            try {
                l9b l9bVar = sy4Var2.p;
                iH = u8bVar2.h(vy2Var3.a);
                cy4Var.f = vy2Var3;
                cy4Var.g = u8bVar2;
                cy4Var.h = sy4Var2;
                cy4Var.i = j9bVar;
                cy4Var.d = j2;
                cy4Var.e = j3;
                cy4Var.j = i2;
                cy4Var.k = i3;
                cy4Var.l = 0;
                cy4Var.m = 0;
                cy4Var.n = iH;
                cy4Var.q = 3;
                if (a(this, iH, vy2Var3, cy4Var) != hu4Var) {
                    i4 = iH;
                    u8bVar3 = u8bVar2;
                    j9bVar2 = j9bVar;
                    int i18 = i2;
                    i5 = i3;
                    i6 = 0;
                    long j9 = j2;
                    i7 = i18;
                    sy4Var3 = sy4Var2;
                    j4 = j3;
                    j5 = j9;
                    i8 = 0;
                    vy2 vy2Var6 = vy2Var3;
                    if (u8bVar3.h("all.chat.folder") >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i9 = i4;
                    } else {
                        i9 = i4 + 1;
                    }
                    u8bVar4.a(i9, vy2Var6.a);
                    pzfVar = this.m;
                    cy4Var.f = null;
                    cy4Var.g = null;
                    cy4Var.h = sy4Var3;
                    cy4Var.i = j9bVar2;
                    cy4Var.d = j5;
                    cy4Var.e = j4;
                    cy4Var.j = i7;
                    cy4Var.k = i5;
                    cy4Var.l = i8;
                    cy4Var.m = i6;
                    cy4Var.n = i4;
                    cy4Var.q = 4;
                    if (pzfVar.emit(u8bVar4, cy4Var) == hu4Var) {
                        return hu4Var;
                    }
                    sy4Var4 = sy4Var3;
                    j9bVar = j9bVar2;
                    j6 = j4;
                    ((xb9) sy4Var4.i()).h0(j6);
                    j9bVar.g(null);
                    return sbi.a;
                }
                return hu4Var;
            } catch (Throwable th3) {
                th = th3;
                obj = null;
                j9bVar.g(obj);
                throw th;
            }
        }
        int i19 = cy4Var.j;
        long j10 = cy4Var.e;
        j2 = cy4Var.d;
        sy4 sy4Var6 = cy4Var.h;
        u8bVar2 = cy4Var.g;
        vy2Var2 = cy4Var.f;
        ch3.d0(obj2);
        i = i19;
        sy4Var = sy4Var6;
        j7 = j10;
        l9b l9bVar2 = sy4Var.p;
        cy4Var.f = vy2Var2;
        cy4Var.g = u8bVar2;
        cy4Var.h = sy4Var;
        cy4Var.i = l9bVar2;
        cy4Var.d = j2;
        cy4Var.e = j7;
        cy4Var.j = i;
        cy4Var.k = 0;
        cy4Var.q = 2;
        if (l9bVar2.b(cy4Var) != hu4Var) {
            vy2 vy2Var7 = vy2Var2;
            sy4Var2 = sy4Var;
            j3 = j7;
            vy2Var3 = vy2Var7;
            i2 = i;
            j9bVar = l9bVar2;
            i3 = 0;
            l9b l9bVar3 = sy4Var2.p;
            iH = u8bVar2.h(vy2Var3.a);
            cy4Var.f = vy2Var3;
            cy4Var.g = u8bVar2;
            cy4Var.h = sy4Var2;
            cy4Var.i = j9bVar;
            cy4Var.d = j2;
            cy4Var.e = j3;
            cy4Var.j = i2;
            cy4Var.k = i3;
            cy4Var.l = 0;
            cy4Var.m = 0;
            cy4Var.n = iH;
            cy4Var.q = 3;
            if (a(this, iH, vy2Var3, cy4Var) != hu4Var) {
                i4 = iH;
                u8bVar3 = u8bVar2;
                j9bVar2 = j9bVar;
                int i110 = i2;
                i5 = i3;
                i6 = 0;
                long j11 = j2;
                i7 = i110;
                sy4Var3 = sy4Var2;
                j4 = j3;
                j5 = j11;
                i8 = 0;
                vy2 vy2Var8 = vy2Var3;
                if (u8bVar3.h("all.chat.folder") >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i9 = i4;
                } else {
                    i9 = i4 + 1;
                }
                u8bVar4.a(i9, vy2Var8.a);
                pzfVar = this.m;
                cy4Var.f = null;
                cy4Var.g = null;
                cy4Var.h = sy4Var3;
                cy4Var.i = j9bVar2;
                cy4Var.d = j5;
                cy4Var.e = j4;
                cy4Var.j = i7;
                cy4Var.k = i5;
                cy4Var.l = i8;
                cy4Var.m = i6;
                cy4Var.n = i4;
                cy4Var.q = 4;
                if (pzfVar.emit(u8bVar4, cy4Var) == hu4Var) {
                    return hu4Var;
                }
                sy4Var4 = sy4Var3;
                j9bVar = j9bVar2;
                j6 = j4;
                ((xb9) sy4Var4.i()).h0(j6);
                j9bVar.g(null);
                return sbi.a;
            }
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:40:0x0100  */
    /* JADX WARN: Code duplicated, block: B:43:0x0107 A[Catch: all -> 0x013b, TryCatch #1 {all -> 0x013b, blocks: (B:48:0x012b, B:41:0x0101, B:43:0x0107, B:44:0x010a, B:37:0x00df), top: B:57:0x00df }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0129  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object g(long j, nq4 nq4Var, String str) throws Throwable {
        dy4 dy4Var;
        String str2;
        sy4 sy4Var;
        long j2;
        int i;
        String str3;
        int i2;
        sy4 sy4Var2;
        long j3;
        j9b j9bVar;
        int i3;
        long j4;
        c9b c9bVarA;
        int i4;
        int iH;
        pzf pzfVar;
        long j5;
        sy4 sy4Var3;
        Throwable th;
        long j6 = j;
        u8b u8bVar = this.l;
        if (nq4Var instanceof dy4) {
            dy4Var = (dy4) nq4Var;
            int i5 = dy4Var.o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dy4Var.o = i5 - Integer.MIN_VALUE;
            } else {
                dy4Var = new dy4(this, nq4Var);
            }
        } else {
            dy4Var = new dy4(this, nq4Var);
        }
        Object obj = dy4Var.m;
        int i6 = dy4Var.o;
        int i7 = 0;
        Object obj2 = null;
        hu4 hu4Var = hu4.a;
        if (i6 == 0) {
            ch3.d0(obj);
            str2 = str;
            dy4Var.f = str2;
            dy4Var.g = this;
            dy4Var.d = j6;
            dy4Var.e = j6;
            dy4Var.i = 0;
            dy4Var.o = 1;
            if (this.o.p(dy4Var) != hu4Var) {
                sy4Var = this;
                j2 = j6;
                i = 0;
            }
            return hu4Var;
        }
        if (i6 == 1) {
            int i8 = dy4Var.i;
            long j7 = dy4Var.e;
            j2 = dy4Var.d;
            sy4 sy4Var4 = dy4Var.g;
            String str4 = dy4Var.f;
            ch3.d0(obj);
            str2 = str4;
            i = i8;
            sy4Var = sy4Var4;
            j6 = j7;
        } else {
            if (i6 == 2) {
                i3 = dy4Var.j;
                int i9 = dy4Var.i;
                j3 = dy4Var.e;
                j4 = dy4Var.d;
                j9b j9bVar2 = dy4Var.h;
                sy4Var2 = dy4Var.g;
                String str5 = dy4Var.f;
                ch3.d0(obj);
                i2 = i9;
                j9bVar = j9bVar2;
                str3 = str5;
                try {
                    l9b l9bVar = sy4Var2.p;
                    c9bVarA = r1f.a(str3);
                    dy4Var.f = str3;
                    dy4Var.g = sy4Var2;
                    dy4Var.h = j9bVar;
                    dy4Var.d = j4;
                    dy4Var.e = j3;
                    dy4Var.i = i2;
                    dy4Var.j = i3;
                    dy4Var.k = 0;
                    dy4Var.l = 0;
                    dy4Var.o = 3;
                    if (d(this, c9bVarA, dy4Var) == hu4Var) {
                        i4 = 0;
                        iH = u8bVar.h(str3);
                        if (iH >= 0) {
                            u8bVar.l(iH);
                        }
                        pzfVar = this.m;
                        dy4Var.f = null;
                        dy4Var.g = sy4Var2;
                        dy4Var.h = j9bVar;
                        dy4Var.d = j4;
                        dy4Var.e = j3;
                        dy4Var.i = i2;
                        dy4Var.j = i3;
                        dy4Var.k = i7;
                        dy4Var.l = i4;
                        dy4Var.o = 4;
                        if (pzfVar.emit(u8bVar, dy4Var) != hu4Var) {
                            j5 = j3;
                            sy4Var3 = sy4Var2;
                        }
                    }
                    return hu4Var;
                } catch (Throwable th2) {
                    th = th2;
                    obj2 = null;
                    j9bVar.g(obj2);
                    throw th;
                }
            }
            if (i6 == 3) {
                int i10 = dy4Var.l;
                int i11 = dy4Var.k;
                int i12 = dy4Var.j;
                int i13 = dy4Var.i;
                long j8 = dy4Var.e;
                long j9 = dy4Var.d;
                j9b j9bVar3 = dy4Var.h;
                sy4 sy4Var5 = dy4Var.g;
                str3 = dy4Var.f;
                try {
                    ch3.d0(obj);
                    i2 = i13;
                    i7 = i11;
                    i3 = i12;
                    j9bVar = j9bVar3;
                    sy4Var2 = sy4Var5;
                    j3 = j8;
                    i4 = i10;
                    j4 = j9;
                    iH = u8bVar.h(str3);
                    if (iH >= 0) {
                        u8bVar.l(iH);
                    }
                    pzfVar = this.m;
                    dy4Var.f = null;
                    dy4Var.g = sy4Var2;
                    dy4Var.h = j9bVar;
                    dy4Var.d = j4;
                    dy4Var.e = j3;
                    dy4Var.i = i2;
                    dy4Var.j = i3;
                    dy4Var.k = i7;
                    dy4Var.l = i4;
                    dy4Var.o = 4;
                    if (pzfVar.emit(u8bVar, dy4Var) != hu4Var) {
                        j5 = j3;
                        sy4Var3 = sy4Var2;
                    }
                    return hu4Var;
                } catch (Throwable th3) {
                    th = th3;
                    j9bVar = j9bVar3;
                    obj2 = null;
                    j9bVar.g(obj2);
                    throw th;
                }
            }
            if (i6 != 4) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j5 = dy4Var.e;
            j9bVar = dy4Var.h;
            sy4Var3 = dy4Var.g;
            try {
                ch3.d0(obj);
            } catch (Throwable th4) {
                th = th4;
                j9bVar.g(obj2);
                throw th;
            }
        }
        ((xb9) sy4Var3.i()).h0(j5);
        j9bVar.g(null);
        return sbi.a;
        l9b l9bVar2 = sy4Var.p;
        dy4Var.f = str2;
        dy4Var.g = sy4Var;
        dy4Var.h = l9bVar2;
        dy4Var.d = j2;
        dy4Var.e = j6;
        dy4Var.i = i;
        dy4Var.j = 0;
        dy4Var.o = 2;
        if (l9bVar2.b(dy4Var) != hu4Var) {
            str3 = str2;
            i2 = i;
            long j10 = j2;
            sy4Var2 = sy4Var;
            j3 = j6;
            j9bVar = l9bVar2;
            i3 = 0;
            j4 = j10;
            l9b l9bVar3 = sy4Var2.p;
            c9bVarA = r1f.a(str3);
            dy4Var.f = str3;
            dy4Var.g = sy4Var2;
            dy4Var.h = j9bVar;
            dy4Var.d = j4;
            dy4Var.e = j3;
            dy4Var.i = i2;
            dy4Var.j = i3;
            dy4Var.k = 0;
            dy4Var.l = 0;
            dy4Var.o = 3;
            if (d(this, c9bVarA, dy4Var) == hu4Var) {
                i4 = 0;
                iH = u8bVar.h(str3);
                if (iH >= 0) {
                    u8bVar.l(iH);
                }
                pzfVar = this.m;
                dy4Var.f = null;
                dy4Var.g = sy4Var2;
                dy4Var.h = j9bVar;
                dy4Var.d = j4;
                dy4Var.e = j3;
                dy4Var.i = i2;
                dy4Var.j = i3;
                dy4Var.k = i7;
                dy4Var.l = i4;
                dy4Var.o = 4;
                if (pzfVar.emit(u8bVar, dy4Var) != hu4Var) {
                    j5 = j3;
                    sy4Var3 = sy4Var2;
                    ((xb9) sy4Var3.i()).h0(j5);
                    j9bVar.g(null);
                    return sbi.a;
                }
            }
        }
        return hu4Var;
    }

    public final boolean h() {
        return this.o.W() && ((List) this.n.a.getValue()).size() < ((Number) ((g5d) ((gjf) this.e.getValue())).a.b2.a(e5d.S6[156]).i()).intValue() + 1;
    }

    public final et3 i() {
        return (et3) this.d.getValue();
    }

    public final gjg j(String str) {
        return (gjg) this.k.computeIfAbsent(str, new mm(7, new ol(4, this, str)));
    }

    public final bre k() {
        return (bre) this.h.getValue();
    }

    public final o4c l() {
        return (o4c) this.g.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable m(nq4 nq4Var) {
        hy4 hy4Var;
        r17 r17Var;
        if (nq4Var instanceof hy4) {
            hy4Var = (hy4) nq4Var;
            int i = hy4Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                hy4Var.f = i - Integer.MIN_VALUE;
            } else {
                hy4Var = new hy4(this, nq4Var);
            }
        } else {
            hy4Var = new hy4(this, nq4Var);
        }
        Object objN = hy4Var.d;
        int i2 = hy4Var.f;
        if (i2 == 0) {
            ch3.d0(objN);
            hy4Var.f = 1;
            objN = e9i.N(new jz(this.n, 14), hy4Var);
            hu4 hu4Var = hu4.a;
            if (objN == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objN);
        }
        Iterable iterable = (Iterable) objN;
        ArrayList arrayList = new ArrayList(yw3.W0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((r17) it.next()).d);
        }
        ArrayList arrayListX0 = yw3.X0(arrayList);
        ul9 ul9Var = this.q;
        Set setKeySet = ul9Var.keySet();
        ArrayList<Set> arrayList2 = new ArrayList();
        for (Object obj : (vl9) setKeySet) {
            if (!arrayListX0.containsAll((Set) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(yw3.W0(arrayList2, 10));
        for (Set set : arrayList2) {
            boolean zContains = set.contains(i37.CHANNEL);
            s66 s66Var = s66.a;
            r66 r66Var = r66.a;
            c76 c76Var = c76.a;
            if (zContains) {
                Object obj2 = ul9Var.get(set);
                if (obj2 == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                String str = (String) obj2;
                Set setP1 = a.p1(new s37[]{s37.CHAT_SUGGEST, s37.NO_FILTERS_EDIT});
                if ((14792 & np0.o) != 0) {
                    setP1 = null;
                }
                o4c o4cVarL = l();
                c76 c76Var2 = (14 & 2) != 0 ? c76Var : null;
                CharSequence charSequenceA = o4cVarL.a(str, null, 2, false, 0, true, false);
                if (setP1 == null) {
                    setP1 = c76Var;
                }
                r17Var = new r17("chat.channel.folder", charSequenceA, 0, set, c76Var2, r66Var, s66Var, r66Var, setP1, new LinkedHashSet(), 0L, null, null, false, null, c76Var, c76Var);
            } else {
                String string = UUID.randomUUID().toString();
                Object obj3 = ul9Var.get(set);
                if (obj3 == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                r17Var = new r17(string, l().a((String) obj3, null, 2, false, 0, true, false), 0, set, (14 & 2) != 0 ? c76Var : null, r66Var, s66Var, r66Var, c76Var, new LinkedHashSet(), 0L, null, null, false, null, c76Var, c76Var);
            }
            arrayList3.add(r17Var);
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x014c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0151  */
    /* JADX WARN: Code duplicated, block: B:56:0x0160  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v7, types: [f9b] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [f9b, r17] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final Object n(vy2 vy2Var, nq4 nq4Var) {
        my4 my4Var;
        f9b f9bVar;
        r17 r17Var;
        r17 r17Var2;
        bre breVar;
        Object obj;
        int i;
        vy2 vy2Var2;
        ?? r1;
        r17 r17Var3;
        f9b f9bVar2;
        int i2;
        vy2 vy2Var3;
        ?? r10;
        ?? r2;
        rqe rqeVar;
        ?? C;
        vy2 vy2Var4 = vy2Var;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof my4) {
            my4Var = (my4) nq4Var;
            int i3 = my4Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                my4Var.l = i3 - Integer.MIN_VALUE;
            } else {
                my4Var = new my4(this, nq4Var);
            }
        } else {
            my4Var = new my4(this, nq4Var);
        }
        Object objI = my4Var.j;
        hu4 hu4Var = hu4.a;
        int i4 = my4Var.l;
        if (i4 == 0) {
            ch3.d0(objI);
            String str = this.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "internalUpdate of folder=".concat(vy2Var4.a), null);
                }
            }
            f9bVar = (f9b) this.k.get(vy2Var4.a);
            if (f9bVar != null && (r17Var = (r17) f9bVar.getValue()) != null) {
                if (vy2Var4.c >= r17Var.k) {
                    bre breVarK = k();
                    my4Var.d = vy2Var4;
                    my4Var.e = f9bVar;
                    my4Var.f = r17Var;
                    my4Var.g = vy2Var4;
                    my4Var.h = breVarK;
                    my4Var.i = 0;
                    my4Var.l = 1;
                    Object objN = e9i.N(new jz(this.n, 14), my4Var);
                    if (objN != hu4Var) {
                        r17Var2 = r17Var;
                        breVar = breVarK;
                        obj = objN;
                        i = 0;
                        vy2Var2 = vy2Var4;
                    }
                    return hu4Var;
                }
                String str2 = this.c;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.f;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str2, "Api model is non-actual rather inmemory model, skip update", null);
                        return sbiVar;
                    }
                }
            }
            return sbiVar;
        }
        if (i4 == 1) {
            int i5 = my4Var.i;
            bre breVar2 = my4Var.h;
            vy2 vy2Var5 = (vy2) my4Var.g;
            r17Var2 = my4Var.f;
            f9bVar = my4Var.e;
            vy2Var2 = my4Var.d;
            ch3.d0(objI);
            i = i5;
            vy2Var4 = vy2Var5;
            breVar = breVar2;
            obj = objI;
        } else {
            if (i4 == 2) {
                int i6 = my4Var.i;
                r17Var3 = my4Var.f;
                f9b f9bVar3 = my4Var.e;
                vy2 vy2Var6 = my4Var.d;
                ch3.d0(objI);
                i = i6;
                r1 = 0;
                vy2Var2 = vy2Var6;
                f9bVar2 = f9bVar3;
                bre breVarK2 = k();
                String str3 = r17Var3.a;
                my4Var.d = vy2Var2;
                my4Var.e = r1;
                my4Var.f = r1;
                my4Var.g = f9bVar2;
                my4Var.i = i;
                my4Var.l = 3;
                rre rreVar = breVarK2.a;
                i2 = 12;
                objI = ch3.I(my4Var, rreVar, true, false, new qo1(str3, 12));
                if (objI != hu4Var) {
                    vy2Var3 = vy2Var2;
                    r2 = r1;
                    r10 = f9bVar2;
                }
                return hu4Var;
            }
            if (i4 != 3) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f9b f9bVar4 = (f9b) my4Var.g;
            vy2Var3 = my4Var.d;
            ch3.d0(objI);
            r10 = f9bVar4;
            r2 = 0;
            i2 = 12;
        }
        rqeVar = (rqe) objI;
        if (rqeVar != null) {
            C = f55.C(rqeVar, l(), rx8.l0(vy2Var3.e), i2);
        } else {
            C = r2;
        }
        r10.setValue(C);
        return sbiVar;
        rqe rqeVarA = f55.A(vy2Var4, ((List) obj).indexOf(r17Var2));
        m8b m8bVar = vy2Var2.e;
        my4Var.d = vy2Var2;
        my4Var.e = f9bVar;
        my4Var.f = r17Var2;
        my4Var.g = null;
        my4Var.h = null;
        my4Var.i = i;
        my4Var.l = 2;
        r1 = 0;
        f9b f9bVar5 = f9bVar;
        r17Var3 = r17Var2;
        Object objH = ch3.H(my4Var, new zqe(breVar, rqeVarA, m8bVar, true, null), breVar.a);
        if (objH != hu4Var) {
            objH = sbiVar;
        }
        if (objH != hu4Var) {
            f9bVar2 = f9bVar5;
            bre breVarK3 = k();
            String str4 = r17Var3.a;
            my4Var.d = vy2Var2;
            my4Var.e = r1;
            my4Var.f = r1;
            my4Var.g = f9bVar2;
            my4Var.i = i;
            my4Var.l = 3;
            rre rreVar2 = breVarK3.a;
            i2 = 12;
            objI = ch3.I(my4Var, rreVar2, true, false, new qo1(str4, 12));
            if (objI != hu4Var) {
                vy2Var3 = vy2Var2;
                r2 = r1;
                r10 = f9bVar2;
                rqeVar = (rqe) objI;
                if (rqeVar != null) {
                    C = f55.C(rqeVar, l(), rx8.l0(vy2Var3.e), i2);
                } else {
                    C = r2;
                }
                r10.setValue(C);
                return sbiVar;
            }
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0131  */
    /* JADX WARN: Code duplicated, block: B:47:0x0135  */
    /* JADX WARN: Code duplicated, block: B:51:0x016d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object o(long j, nq4 nq4Var, List list) throws Throwable {
        oy4 oy4Var;
        List list2;
        sy4 sy4Var;
        long j2;
        int i;
        int i2;
        List list3;
        j9b j9bVar;
        long j3;
        int i3;
        long j4;
        j9b j9bVar2;
        int i4;
        int i5;
        Object objH;
        sy4 sy4Var2;
        long j5;
        List list4;
        int i6;
        int i7;
        int i8;
        int i9;
        sbi sbiVar;
        pzf pzfVar;
        sy4 sy4Var3;
        long j6;
        Object obj;
        long j7 = j;
        u8b u8bVar = this.l;
        if (nq4Var instanceof oy4) {
            oy4Var = (oy4) nq4Var;
            int i10 = oy4Var.o;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oy4Var.o = i10 - Integer.MIN_VALUE;
            } else {
                oy4Var = new oy4(this, nq4Var);
            }
        } else {
            oy4Var = new oy4(this, nq4Var);
        }
        Object obj2 = oy4Var.m;
        int i11 = oy4Var.o;
        sbi sbiVar2 = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i11 == 0) {
            ch3.d0(obj2);
            oy4Var.f = list;
            oy4Var.g = this;
            oy4Var.d = j7;
            oy4Var.e = j7;
            oy4Var.i = 0;
            oy4Var.o = 1;
            if (this.o.p(oy4Var) != hu4Var) {
                list2 = list;
                sy4Var = this;
                j2 = j7;
                i = 0;
            }
            return hu4Var;
        }
        if (i11 == 1) {
            int i12 = oy4Var.i;
            j2 = oy4Var.e;
            long j8 = oy4Var.d;
            sy4 sy4Var4 = oy4Var.g;
            list2 = oy4Var.f;
            ch3.d0(obj2);
            i = i12;
            sy4Var = sy4Var4;
            j7 = j8;
        } else {
            if (i11 != 2) {
                if (i11 == 3) {
                    int i13 = oy4Var.l;
                    int i14 = oy4Var.k;
                    int i15 = oy4Var.j;
                    i7 = oy4Var.i;
                    long j9 = oy4Var.e;
                    j5 = oy4Var.d;
                    j9b j9bVar3 = oy4Var.h;
                    sy4Var2 = oy4Var.g;
                    List list5 = oy4Var.f;
                    try {
                        ch3.d0(obj2);
                        i8 = i14;
                        i6 = i15;
                        j9bVar = j9bVar3;
                        list4 = list5;
                        sbiVar2 = sbiVar2;
                        i9 = i13;
                        j4 = j9;
                        try {
                            u8bVar.f();
                            sbiVar = sbiVar2;
                            u8bVar.b("all.chat.folder");
                            u8bVar.d(list4);
                            pzfVar = this.m;
                            oy4Var.f = null;
                            oy4Var.g = sy4Var2;
                            oy4Var.h = j9bVar;
                            oy4Var.d = j5;
                            oy4Var.e = j4;
                            oy4Var.i = i7;
                            oy4Var.j = i6;
                            oy4Var.k = i8;
                            oy4Var.l = i9;
                            oy4Var.o = 4;
                            if (pzfVar.emit(u8bVar, oy4Var) != hu4Var) {
                                sy4Var3 = sy4Var2;
                                j6 = j4;
                            }
                            return hu4Var;
                        } catch (Throwable th) {
                            th = th;
                            obj = null;
                            j9bVar.g(obj);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        j9bVar = j9bVar3;
                    }
                } else {
                    if (i11 != 4) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j6 = oy4Var.e;
                    j9bVar = oy4Var.h;
                    sy4Var3 = oy4Var.g;
                    List list6 = oy4Var.f;
                    try {
                        ch3.d0(obj2);
                        sbiVar = sbiVar2;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                obj = null;
                j9bVar.g(obj);
                throw th;
            }
            i3 = oy4Var.j;
            int i16 = oy4Var.i;
            long j10 = oy4Var.e;
            sbiVar2 = sbiVar2;
            long j11 = oy4Var.d;
            j9b j9bVar4 = oy4Var.h;
            sy4 sy4Var5 = oy4Var.g;
            List list7 = oy4Var.f;
            ch3.d0(obj2);
            i2 = i16;
            j9bVar = j9bVar4;
            list3 = list7;
            j4 = j10;
            j3 = j11;
            sy4Var = sy4Var5;
            try {
                l9b l9bVar = sy4Var.p;
                bre breVarK = k();
                try {
                    oy4Var.f = list3;
                    oy4Var.g = sy4Var;
                    oy4Var.h = j9bVar;
                    oy4Var.d = j3;
                    oy4Var.e = j4;
                    oy4Var.i = i2;
                    oy4Var.j = i3;
                    oy4Var.k = 0;
                    oy4Var.l = 0;
                    oy4Var.o = 3;
                    i4 = i3;
                    j9bVar2 = j9bVar;
                    i5 = i2;
                    try {
                        objH = ch3.H(oy4Var, new vy6(breVarK, list3, null, 2), breVarK.a);
                        if (objH != hu4Var) {
                            objH = sbiVar2;
                        }
                        if (objH != hu4Var) {
                            sy4Var2 = sy4Var;
                            j5 = j3;
                            j9bVar = j9bVar2;
                            list4 = list3;
                            i6 = i4;
                            i7 = i5;
                            i8 = 0;
                            i9 = 0;
                            u8bVar.f();
                            sbiVar = sbiVar2;
                            u8bVar.b("all.chat.folder");
                            u8bVar.d(list4);
                            pzfVar = this.m;
                            oy4Var.f = null;
                            oy4Var.g = sy4Var2;
                            oy4Var.h = j9bVar;
                            oy4Var.d = j5;
                            oy4Var.e = j4;
                            oy4Var.i = i7;
                            oy4Var.j = i6;
                            oy4Var.k = i8;
                            oy4Var.l = i9;
                            oy4Var.o = 4;
                            if (pzfVar.emit(u8bVar, oy4Var) != hu4Var) {
                                sy4Var3 = sy4Var2;
                                j6 = j4;
                            }
                        }
                        return hu4Var;
                    } catch (Throwable th4) {
                        th = th4;
                        j9bVar = j9bVar2;
                        obj = null;
                        j9bVar.g(obj);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    j9bVar2 = j9bVar;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
        ((xb9) sy4Var3.i()).h0(j6);
        j9bVar.g(null);
        return sbiVar;
        l9b l9bVar2 = sy4Var.p;
        oy4Var.f = list2;
        oy4Var.g = sy4Var;
        oy4Var.h = l9bVar2;
        oy4Var.d = j7;
        oy4Var.e = j2;
        oy4Var.i = i;
        oy4Var.j = 0;
        oy4Var.o = 2;
        if (l9bVar2.b(oy4Var) != hu4Var) {
            long j12 = j2;
            i2 = i;
            list3 = list2;
            j9bVar = l9bVar2;
            j3 = j7;
            i3 = 0;
            j4 = j12;
            l9b l9bVar3 = sy4Var.p;
            bre breVarK2 = k();
            oy4Var.f = list3;
            oy4Var.g = sy4Var;
            oy4Var.h = j9bVar;
            oy4Var.d = j3;
            oy4Var.e = j4;
            oy4Var.i = i2;
            oy4Var.j = i3;
            oy4Var.k = 0;
            oy4Var.l = 0;
            oy4Var.o = 3;
            i4 = i3;
            j9bVar2 = j9bVar;
            i5 = i2;
            objH = ch3.H(oy4Var, new vy6(breVarK2, list3, null, 2), breVarK2.a);
            if (objH != hu4Var) {
                objH = sbiVar2;
            }
            if (objH != hu4Var) {
                sy4Var2 = sy4Var;
                j5 = j3;
                j9bVar = j9bVar2;
                list4 = list3;
                i6 = i4;
                i7 = i5;
                i8 = 0;
                i9 = 0;
                u8bVar.f();
                sbiVar = sbiVar2;
                u8bVar.b("all.chat.folder");
                u8bVar.d(list4);
                pzfVar = this.m;
                oy4Var.f = null;
                oy4Var.g = sy4Var2;
                oy4Var.h = j9bVar;
                oy4Var.d = j5;
                oy4Var.e = j4;
                oy4Var.i = i7;
                oy4Var.j = i6;
                oy4Var.k = i8;
                oy4Var.l = i9;
                oy4Var.o = 4;
                if (pzfVar.emit(u8bVar, oy4Var) != hu4Var) {
                    sy4Var3 = sy4Var2;
                    j6 = j4;
                    ((xb9) sy4Var3.i()).h0(j6);
                    j9bVar.g(null);
                    return sbiVar;
                }
            }
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b7 A[Catch: all -> 0x00de, TryCatch #0 {all -> 0x00de, blocks: (B:46:0x0113, B:30:0x00ab, B:32:0x00b7, B:40:0x00e2, B:35:0x00be, B:37:0x00c6, B:41:0x00f5), top: B:51:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be A[Catch: all -> 0x00de, TryCatch #0 {all -> 0x00de, blocks: (B:46:0x0113, B:30:0x00ab, B:32:0x00b7, B:40:0x00e2, B:35:0x00be, B:37:0x00c6, B:41:0x00f5), top: B:51:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c6 A[Catch: all -> 0x00de, TryCatch #0 {all -> 0x00de, blocks: (B:46:0x0113, B:30:0x00ab, B:32:0x00b7, B:40:0x00e2, B:35:0x00be, B:37:0x00c6, B:41:0x00f5), top: B:51:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f5 A[Catch: all -> 0x00de, TryCatch #0 {all -> 0x00de, blocks: (B:46:0x0113, B:30:0x00ab, B:32:0x00b7, B:40:0x00e2, B:35:0x00be, B:37:0x00c6, B:41:0x00f5), top: B:51:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:44:0x010d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00c6, please report this as an issue */
    public final Object p(long j, vy2 vy2Var, nq4 nq4Var) throws Throwable {
        ry4 ry4Var;
        vy2 vy2Var2;
        sy4 sy4Var;
        long j2;
        int i;
        j9b j9bVar;
        vy2 vy2Var3;
        sy4 sy4Var2;
        long j3;
        sy4 sy4Var3;
        j9b j9bVar2;
        String str;
        a4c a4cVar;
        je9 je9Var;
        Object obj;
        Throwable th;
        long j4 = j;
        if (nq4Var instanceof ry4) {
            ry4Var = (ry4) nq4Var;
            int i2 = ry4Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ry4Var.m = i2 - Integer.MIN_VALUE;
            } else {
                ry4Var = new ry4(this, nq4Var);
            }
        } else {
            ry4Var = new ry4(this, nq4Var);
        }
        Object obj2 = ry4Var.k;
        hu4 hu4Var = hu4.a;
        int i3 = ry4Var.m;
        int i4 = 0;
        if (i3 == 0) {
            ch3.d0(obj2);
            i64 i64Var = this.o;
            vy2Var2 = vy2Var;
            ry4Var.f = vy2Var2;
            ry4Var.g = this;
            ry4Var.d = j4;
            ry4Var.e = j4;
            ry4Var.i = 0;
            ry4Var.m = 1;
            if (i64Var.p(ry4Var) != hu4Var) {
                sy4Var = this;
                j2 = j4;
                i = 0;
            }
            return hu4Var;
        }
        if (i3 == 1) {
            int i5 = ry4Var.i;
            long j5 = ry4Var.e;
            j2 = ry4Var.d;
            sy4 sy4Var4 = ry4Var.g;
            vy2Var2 = ry4Var.f;
            ch3.d0(obj2);
            i = i5;
            sy4Var = sy4Var4;
            j4 = j5;
        } else {
            if (i3 == 2) {
                i4 = ry4Var.j;
                int i6 = ry4Var.i;
                long j6 = ry4Var.e;
                long j7 = ry4Var.d;
                j9b j9bVar3 = ry4Var.h;
                sy4Var2 = ry4Var.g;
                vy2Var3 = ry4Var.f;
                ch3.d0(obj2);
                i = i6;
                j2 = j7;
                j9bVar = j9bVar3;
                j4 = j6;
                try {
                    l9b l9bVar = sy4Var2.p;
                    if (this.k.containsKey(vy2Var3.a)) {
                        ry4Var.f = null;
                        ry4Var.g = sy4Var2;
                        ry4Var.h = j9bVar;
                        ry4Var.d = j2;
                        ry4Var.e = j4;
                        ry4Var.i = i;
                        ry4Var.j = i4;
                        ry4Var.m = 3;
                        if (n(vy2Var3, ry4Var) != hu4Var) {
                            j3 = j4;
                            sy4Var3 = sy4Var2;
                            j9bVar2 = j9bVar;
                        }
                        return hu4Var;
                    }
                    str = this.c;
                    a4cVar = gm0.f;
                    if (a4cVar == null) {
                        je9Var = je9.g;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "Trying to update non-existing folder(" + vy2Var3.a + ")", null);
                        }
                    }
                    npk.a((ed6) this.f.getValue(), new NotFoundFolderException(vy2Var3.a));
                    ((xb9) sy4Var2.i()).h0(j4);
                    j9bVar.g(null);
                    return sbi.a;
                } catch (Throwable th2) {
                    th = th2;
                    j9bVar2 = j9bVar;
                    obj = null;
                    j9bVar2.g(obj);
                    throw th;
                }
            }
            if (i3 != 3) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j3 = ry4Var.e;
            j9bVar2 = ry4Var.h;
            sy4Var3 = ry4Var.g;
            try {
                ch3.d0(obj2);
            } catch (Throwable th3) {
                th = th3;
                obj = null;
                j9bVar2.g(obj);
                throw th;
            }
        }
        j9bVar = j9bVar2;
        sy4Var2 = sy4Var3;
        j4 = j3;
        ((xb9) sy4Var2.i()).h0(j4);
        j9bVar.g(null);
        return sbi.a;
        j9bVar = sy4Var.p;
        ry4Var.f = vy2Var2;
        ry4Var.g = sy4Var;
        ry4Var.h = j9bVar;
        ry4Var.d = j2;
        ry4Var.e = j4;
        ry4Var.i = i;
        ry4Var.j = 0;
        ry4Var.m = 2;
        if (j9bVar.b(ry4Var) != hu4Var) {
            vy2Var3 = vy2Var2;
            sy4Var2 = sy4Var;
            l9b l9bVar2 = sy4Var2.p;
            if (this.k.containsKey(vy2Var3.a)) {
                str = this.c;
                a4cVar = gm0.f;
                if (a4cVar == null) {
                    je9Var = je9.g;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "Trying to update non-existing folder(" + vy2Var3.a + ")", null);
                    }
                }
                npk.a((ed6) this.f.getValue(), new NotFoundFolderException(vy2Var3.a));
            } else {
                ry4Var.f = null;
                ry4Var.g = sy4Var2;
                ry4Var.h = j9bVar;
                ry4Var.d = j2;
                ry4Var.e = j4;
                ry4Var.i = i;
                ry4Var.j = i4;
                ry4Var.m = 3;
                if (n(vy2Var3, ry4Var) != hu4Var) {
                    j3 = j4;
                    sy4Var3 = sy4Var2;
                    j9bVar2 = j9bVar;
                    j9bVar = j9bVar2;
                    sy4Var2 = sy4Var3;
                    j4 = j3;
                }
            }
            ((xb9) sy4Var2.i()).h0(j4);
            j9bVar.g(null);
            return sbi.a;
        }
        return hu4Var;
    }
}
