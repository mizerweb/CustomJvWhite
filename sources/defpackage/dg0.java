package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class dg0 {
    public static final /* synthetic */ int q = 0;
    public final wmi a;
    public final xhh b;
    public final ifh c = new ifh(new qo7(16, this));
    public final m8b d;
    public final ConcurrentHashMap.KeySetView e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final m31 p;

    public dg0(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, e9 e9Var, ny8 ny8Var10, wmi wmiVar, xhh xhhVar) {
        this.a = wmiVar;
        this.b = xhhVar;
        m8b m8bVar = ui9.a;
        this.d = new m8b();
        this.e = ConcurrentHashMap.newKeySet();
        this.f = ny8Var;
        this.g = ny8Var2;
        this.h = ny8Var3;
        this.i = ny8Var4;
        this.j = ny8Var5;
        this.k = ny8Var6;
        this.l = ny8Var7;
        this.m = ny8Var8;
        this.n = ny8Var9;
        this.o = ny8Var10;
        n0c n0cVar = (n0c) xhhVar;
        lq4 lq4Var = null;
        this.p = new m31("dg0", n0cVar.a(), n0cVar.a(), wmiVar, 0L, new i26(this, lq4Var, 8), new vi2(21), new wf0(0), 16);
        tre.m0(new fz6(e9Var.a, new i20(this, lq4Var, 1), 3), wmiVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final Object a(dg0 dg0Var, yf0 yf0Var, nq4 nq4Var) {
        cg0 cg0Var;
        char c;
        long j;
        long j2;
        long j3;
        sbi sbiVar;
        Object[] objArr;
        dg0 dg0Var2 = dg0Var;
        je9 je9Var = je9.d;
        sbi sbiVar2 = sbi.a;
        if (nq4Var instanceof cg0) {
            cg0Var = (cg0) nq4Var;
            int i = cg0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                cg0Var.f = i - Integer.MIN_VALUE;
            } else {
                cg0Var = new cg0(dg0Var2, nq4Var);
            }
        } else {
            cg0Var = new cg0(dg0Var2, nq4Var);
        }
        Object objC = cg0Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = cg0Var.f;
        if (i2 == 0) {
            ch3.d0(objC);
            Set set = yf0Var.a;
            m8b m8bVar = dg0Var2.d;
            HashSet hashSet = new HashSet(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                if (!m8bVar.d(jLongValue)) {
                    hashSet.add(Long.valueOf(jLongValue));
                    m8bVar.a(jLongValue);
                }
            }
            if (hashSet.isEmpty()) {
                String strConcat = "dg0".concat("");
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, strConcat, "processVisible: all messages already processed, skip it", null);
                }
                return sbiVar2;
            }
            String strConcat2 = "dg0".concat("");
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, strConcat2, "processVisible: ready to process ids -> ".concat(ww3.z1(hashSet, null, null, null, null, 63)), null);
            }
            ArrayList arrayList = yf0Var.b;
            cg0Var.f = 1;
            objC = dg0Var2.c(hashSet, arrayList, cg0Var);
            if (objC == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objC);
        }
        p1f p1fVar = (p1f) objC;
        if (p1fVar.e()) {
            String strConcat3 = "dg0".concat("");
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar3.b(je9Var2)) {
                    a4cVar3.c(je9Var2, strConcat3, "processVisible: no attaches for process, skip it", null);
                }
            }
            return sbiVar2;
        }
        Object[] objArr2 = p1fVar.c;
        long[] jArr = p1fVar.a;
        int length = jArr.length - 2;
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i3 = 8;
        if (length >= 0) {
            int i4 = 0;
            j2 = 128;
            while (true) {
                long j5 = jArr[i4];
                j3 = 255;
                if ((((~j5) << c2) & j5 & j4) != j4) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j5 & 255) < 128) {
                            u8b u8bVar = (u8b) objArr2[(i4 << 3) + i6];
                            Object[] objArr3 = u8bVar.a;
                            int i7 = u8bVar.b;
                            int i8 = 0;
                            while (i8 < i7) {
                                dg0Var2.e.add(((e70) objArr3[i8]).t);
                                i8++;
                                i3 = i3;
                            }
                        }
                        int i9 = i3;
                        j5 >>= i9;
                        i6++;
                        c2 = c2;
                        j4 = j4;
                        i3 = i9;
                    }
                    c = c2;
                    j = j4;
                    if (i5 != i3) {
                        break;
                    }
                } else {
                    c = c2;
                    j = j4;
                }
                if (i4 == length) {
                    break;
                }
                i4++;
                c2 = c;
                j4 = j;
                i3 = 8;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        Object[] objArr4 = p1fVar.b;
        Object[] objArr5 = p1fVar.c;
        long[] jArr2 = p1fVar.a;
        int length2 = jArr2.length - 2;
        if (length2 < 0) {
            return sbiVar2;
        }
        int i10 = 0;
        while (true) {
            long j6 = jArr2[i10];
            if ((((~j6) << c) & j6 & j) != j) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length2)) >>> 31);
                long j7 = j6;
                int i13 = 0;
                while (i13 < i12) {
                    if ((j7 & j3) < j2) {
                        int i14 = (i10 << 3) + i13;
                        Object obj = objArr4[i14];
                        u8b u8bVar2 = (u8b) objArr5[i14];
                        long jLongValue2 = ((Number) obj).longValue();
                        Object[] objArr6 = u8bVar2.a;
                        int i15 = u8bVar2.b;
                        int i16 = 0;
                        while (i16 < i15) {
                            yab.i0((gu4) dg0Var2.c.getValue(), null, 0, new f1j((e70) objArr6[i16], dg0Var2, jLongValue2, (lq4) null, 1), 3);
                            i16++;
                            dg0Var2 = dg0Var;
                            i15 = i15;
                            sbiVar2 = sbiVar2;
                            i13 = i13;
                            objArr4 = objArr4;
                            objArr6 = objArr6;
                            i11 = i11;
                        }
                    }
                    int i17 = i11;
                    j7 >>= i17;
                    i13++;
                    dg0Var2 = dg0Var;
                    i11 = i17;
                    sbiVar2 = sbiVar2;
                    objArr4 = objArr4;
                }
                sbiVar = sbiVar2;
                objArr = objArr4;
                if (i12 != i11) {
                    return sbiVar;
                }
            } else {
                sbiVar = sbiVar2;
                objArr = objArr4;
            }
            if (i10 == length2) {
                return sbiVar;
            }
            i10++;
            dg0Var2 = dg0Var;
            sbiVar2 = sbiVar;
            objArr4 = objArr;
        }
    }

    public static fg0 e(e70 e70Var) {
        boolean zD = e70Var.d();
        o60 o60Var = e70Var.b;
        if (zD) {
            return new fg0(o60Var.i, 3);
        }
        if (e70Var.e()) {
            return new fg0(o60Var.i, 1);
        }
        if (e70Var.f()) {
            return new fg0(e70Var.d.a, 2);
        }
        return null;
    }

    public final void b(long j, long j2) {
        if (((Boolean) ((e5d) this.h.getValue()).k().i()).booleanValue()) {
            yab.i0(this.a, null, 0, new ag0(this, j, j2, null, 0), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:171:0x037f  */
    /* JADX WARN: Code duplicated, block: B:174:0x038c  */
    /* JADX WARN: Code duplicated, block: B:176:0x0398  */
    /* JADX WARN: Code duplicated, block: B:178:0x039e  */
    /* JADX WARN: Code duplicated, block: B:180:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:186:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:188:0x03d7 A[LOOP:2: B:181:0x03ba->B:188:0x03d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:189:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:192:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:197:0x0407  */
    /* JADX WARN: Code duplicated, block: B:199:0x040d A[LOOP:0: B:172:0x0380->B:199:0x040d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:202:0x041e  */
    /* JADX WARN: Code duplicated, block: B:205:0x042b  */
    /* JADX WARN: Code duplicated, block: B:207:0x0437  */
    /* JADX WARN: Code duplicated, block: B:209:0x043d  */
    /* JADX WARN: Code duplicated, block: B:211:0x0455  */
    /* JADX WARN: Code duplicated, block: B:216:0x0463  */
    /* JADX WARN: Code duplicated, block: B:218:0x0467 A[LOOP:3: B:203:0x041f->B:218:0x0467, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:226:0x0415 A[EDGE_INSN: B:226:0x0415->B:200:0x0415 BREAK  A[LOOP:0: B:172:0x0380->B:199:0x040d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0415 A[EDGE_INSN: B:227:0x0415->B:200:0x0415 BREAK  A[LOOP:0: B:172:0x0380->B:199:0x040d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x03e0 A[EDGE_INSN: B:229:0x03e0->B:190:0x03e0 BREAK  A[LOOP:2: B:181:0x03ba->B:188:0x03d7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x046a A[EDGE_INSN: B:230:0x046a->B:219:0x046a BREAK  A[LOOP:3: B:203:0x041f->B:218:0x0467], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x046a A[EDGE_INSN: B:231:0x046a->B:219:0x046a BREAK  A[LOOP:3: B:203:0x041f->B:218:0x0467], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x0458 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0458 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object c(HashSet hashSet, ArrayList arrayList, nq4 nq4Var) {
        bg0 bg0Var;
        ArrayList arrayList2;
        char c;
        String str;
        long j;
        ArrayList arrayList3;
        b9b b9bVar;
        Object[] objArr;
        int i;
        Iterator it;
        ArrayList arrayList4;
        String str2;
        List list;
        Iterator it2;
        Object next;
        String str3;
        Set set;
        String strConcat;
        a4c a4cVar;
        Object[] objArr2;
        long[] jArr;
        int length;
        long[] jArr2;
        int length2;
        String strConcat2;
        a4c a4cVar2;
        int i2;
        long j2;
        int i3;
        int i4;
        int i5;
        u8b u8bVar;
        int i6;
        long j3;
        Object[] objArr3;
        long[] jArr3;
        int i7;
        int i8;
        int i9;
        Object[] objArr4;
        int i10;
        int i11;
        int i12;
        fg0 fg0VarE;
        je9 je9Var = je9.d;
        je9 je9Var2 = je9.f;
        if (nq4Var instanceof bg0) {
            bg0Var = (bg0) nq4Var;
            int i13 = bg0Var.h;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bg0Var.h = i13 - Integer.MIN_VALUE;
            } else {
                bg0Var = new bg0(this, nq4Var);
            }
        } else {
            bg0Var = new bg0(this, nq4Var);
        }
        Object objQ = bg0Var.f;
        hu4 hu4Var = hu4.a;
        int i14 = bg0Var.h;
        String str4 = "";
        int i15 = 2;
        boolean z = true;
        Throwable th = null;
        if (i14 == 0) {
            ch3.d0(objQ);
            sua suaVar = (sua) this.k.getValue();
            arrayList2 = arrayList;
            bg0Var.d = arrayList2;
            bg0Var.h = 1;
            c = 7;
            objQ = ((ose) suaVar.a).q(hashSet, bg0Var);
            if (objQ != hu4Var) {
            }
            return hu4Var;
        }
        if (i14 == 1) {
            arrayList2 = bg0Var.d;
            ch3.d0(objQ);
            c = 7;
        } else {
            if (i14 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b9bVar = bg0Var.e;
            ch3.d0(objQ);
            str = "";
            c = 7;
            j = -9187201950435737472L;
        }
        set = (Set) objQ;
        strConcat = "dg0".concat(str);
        a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, strConcat, "prepareAttaches: missing entities -> " + set, null);
        }
        objArr2 = b9bVar.c;
        jArr = b9bVar.a;
        length = jArr.length - 2;
        if (length >= 0) {
            i6 = 0;
            while (true) {
                j3 = jArr[i6];
                if ((((~j3) << c) & j3 & j) != j) {
                    i7 = 8 - ((~(i6 - length)) >>> 31);
                    i8 = 0;
                    while (i8 < i7) {
                        if ((j3 & 255) < 128) {
                            u8b u8bVar2 = (u8b) objArr2[(i6 << 3) + i8];
                            int i16 = u8bVar2.b;
                            objArr4 = u8bVar2.a;
                            hj8 hj8VarF0 = oc9.f0(0, i16);
                            i10 = hj8VarF0.a;
                            i11 = hj8VarF0.b;
                            if (i10 <= i11) {
                                i12 = 0;
                                while (true) {
                                    objArr4[i10 - i12] = objArr4[i10];
                                    i9 = i8;
                                    fg0VarE = e((e70) objArr4[i10]);
                                    if (fg0VarE != null || !set.contains(fg0VarE)) {
                                        i12++;
                                    }
                                    if (i10 != i11) {
                                        break;
                                    }
                                    i10++;
                                    i8 = i9;
                                }
                            } else {
                                i9 = i8;
                                i12 = 0;
                            }
                            Arrays.fill(objArr4, i16 - i12, i16, (Object) null);
                            u8bVar2.b -= i12;
                        } else {
                            i9 = i8;
                        }
                        j3 >>= 8;
                        i8 = i9 + 1;
                        jArr = jArr;
                        objArr2 = objArr2;
                    }
                    objArr3 = objArr2;
                    jArr3 = jArr;
                    if (i7 == 8) {
                        break;
                    }
                } else {
                    objArr3 = objArr2;
                    jArr3 = jArr;
                }
                if (i6 != length) {
                    break;
                }
                i6++;
                jArr = jArr3;
                objArr2 = objArr3;
            }
        }
        jArr2 = b9bVar.a;
        length2 = jArr2.length - 2;
        if (length2 >= 0) {
            i2 = 0;
            while (true) {
                j2 = jArr2[i2];
                if ((((~j2) << c) & j2 & j) != j) {
                    i3 = 8 - ((~(i2 - length2)) >>> 31);
                    for (i4 = 0; i4 < i3; i4++) {
                        if ((j2 & 255) < 128) {
                            i5 = (i2 << 3) + i4;
                            Object obj = b9bVar.b[i5];
                            u8bVar = (u8b) b9bVar.c[i5];
                            ((Number) obj).longValue();
                            if (u8bVar.i()) {
                                b9bVar.n(i5);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 == 8) {
                        break;
                    }
                }
                if (i2 != length2) {
                    break;
                }
                i2++;
            }
        }
        strConcat2 = "dg0".concat(str);
        a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, strConcat2, "prepareAttaches: filtered saved -> " + b9bVar, null);
        }
        return b9bVar;
        long[] jArr4 = q1f.a;
        b9b b9bVar2 = new b9b();
        Iterator it3 = ((List) objQ).iterator();
        while (it3.hasNext()) {
            sfa sfaVar = (sfa) it3.next();
            boolean zN = sfaVar.N();
            c46 c46Var = sfaVar.n;
            if (zN) {
                String strConcat3 = "dg0".concat(str4);
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                    i = i15;
                    a4cVar3.c(je9Var2, strConcat3, "shouldProcessMessage: skip message cuz it delayed", th);
                } else {
                    i = i15;
                }
            } else {
                i = i15;
                if (sfaVar.O()) {
                    String strConcat4 = "dg0".concat(str4);
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                        a4cVar4.c(je9Var2, strConcat4, "shouldProcessMessage: skip message cuz it deleted", th);
                    }
                } else {
                    if (c46Var == null || ((list = (List) c46Var.a) != null && list.isEmpty() == z)) {
                        it = it3;
                        arrayList4 = arrayList2;
                        str2 = str4;
                        String strConcat5 = "dg0".concat(str2);
                        a4c a4cVar5 = gm0.f;
                        if (a4cVar5 != null && a4cVar5.b(je9Var2)) {
                            a4cVar5.c(je9Var2, strConcat5, zo5.j(sfaVar.a, "shouldProcessMessage: no attaches in message -> "), null);
                        }
                    } else if (sfaVar.e == ((s7f) ((et3) this.f.getValue())).t()) {
                        String strConcat6 = "dg0".concat(str4);
                        a4c a4cVar6 = gm0.f;
                        if (a4cVar6 != null && a4cVar6.b(je9Var2)) {
                            a4cVar6.c(je9Var2, strConcat6, "shouldProcessMessage: skip message cuz it ours", null);
                        }
                    } else {
                        int i17 = c46Var.i();
                        int i18 = 0;
                        while (i18 < i17) {
                            e70 e70VarH = c46Var.h(i18);
                            if (e70VarH == null) {
                                it2 = it3;
                            } else {
                                Iterator it4 = arrayList2.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        it2 = it3;
                                        next = null;
                                        break;
                                    }
                                    next = it4.next();
                                    mq9 mq9Var = (mq9) next;
                                    if (!e70VarH.e()) {
                                        it2 = it3;
                                        if (e70VarH.f() && mq9Var.b == pq9.VIDEO) {
                                            break;
                                        }
                                        it3 = it2;
                                    } else {
                                        it2 = it3;
                                        if (mq9Var.b == pq9.PHOTO) {
                                            break;
                                        }
                                        it3 = it2;
                                    }
                                    i18++;
                                    it3 = it2;
                                    str4 = str3;
                                    arrayList2 = arrayList2;
                                    c46Var = c46Var;
                                }
                                mq9 mq9Var2 = (mq9) next;
                                if (mq9Var2 == null) {
                                    String strConcat7 = "dg0".concat(str4);
                                    a4c a4cVar7 = gm0.f;
                                    if (a4cVar7 != null && a4cVar7.b(je9Var2)) {
                                        a4cVar7.c(je9Var2, strConcat7, "shouldProcessAttach: no autosave setting for -> " + e70VarH, null);
                                    }
                                } else {
                                    arrayList2 = arrayList2;
                                    c46Var = c46Var;
                                    str3 = str4;
                                    if (sfaVar.c < mq9Var2.c) {
                                        String strConcat8 = "dg0".concat(str3);
                                        a4c a4cVar8 = gm0.f;
                                        if (a4cVar8 != null && a4cVar8.b(je9Var2)) {
                                            a4cVar8.c(je9Var2, strConcat8, "shouldProcessAttach: message is posted before setting enabling", null);
                                        }
                                    } else if (this.e.contains(e70VarH.t)) {
                                        String strConcat9 = "dg0".concat(str3);
                                        a4c a4cVar9 = gm0.f;
                                        if (a4cVar9 != null && a4cVar9.b(je9Var)) {
                                            a4cVar9.c(je9Var, strConcat9, "shouldProcessAttach: already processing attach -> " + e70VarH, null);
                                        }
                                    } else if (e70VarH.f() && ((nni) this.g.getValue()).k() == -1) {
                                        String strConcat10 = "dg0".concat(str3);
                                        a4c a4cVar10 = gm0.f;
                                        if (a4cVar10 != null && a4cVar10.b(je9Var2)) {
                                            a4cVar10.c(je9Var2, strConcat10, "shouldProcessAttach: video prefetch is disabled", null);
                                        }
                                    } else {
                                        Long l = new Long(sfaVar.a);
                                        Object objD = b9bVar2.d(l);
                                        if (objD == null) {
                                            objD = new u8b();
                                            b9bVar2.o(l, objD);
                                        }
                                        ((u8b) objD).b(e70VarH);
                                    }
                                }
                                i18++;
                                it3 = it2;
                                str4 = str3;
                                arrayList2 = arrayList2;
                                c46Var = c46Var;
                            }
                            str3 = str4;
                            i18++;
                            it3 = it2;
                            str4 = str3;
                            arrayList2 = arrayList2;
                            c46Var = c46Var;
                        }
                    }
                    it3 = it;
                    str4 = str2;
                    i15 = i;
                    arrayList2 = arrayList4;
                    z = true;
                    th = null;
                }
            }
            it = it3;
            arrayList4 = arrayList2;
            str2 = str4;
            it3 = it;
            str4 = str2;
            i15 = i;
            arrayList2 = arrayList4;
            z = true;
            th = null;
        }
        str = str4;
        int i19 = i15;
        j = -9187201950435737472L;
        int i20 = 8;
        String strConcat11 = "dg0".concat(str);
        a4c a4cVar11 = gm0.f;
        if (a4cVar11 != null && a4cVar11.b(je9Var)) {
            a4cVar11.c(je9Var, strConcat11, "prepareAttaches: collected -> " + b9bVar2, null);
        }
        if (b9bVar2.e()) {
            return q1f.b;
        }
        gof gofVar = new gof();
        Object[] objArr5 = b9bVar2.c;
        long[] jArr5 = b9bVar2.a;
        int length3 = jArr5.length - 2;
        if (length3 >= 0) {
            int i21 = 0;
            while (true) {
                long j4 = jArr5[i21];
                int i22 = i21;
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i23 = 8 - ((~(i22 - length3)) >>> 31);
                    int i24 = 0;
                    while (i24 < i23) {
                        if ((j4 & 255) < 128) {
                            u8b u8bVar3 = (u8b) objArr5[(i22 << 3) + i24];
                            Object[] objArr6 = u8bVar3.a;
                            int i25 = u8bVar3.b;
                            int i26 = 0;
                            while (i26 < i25) {
                                int i27 = i26;
                                fg0 fg0VarE2 = e((e70) objArr6[i26]);
                                if (fg0VarE2 != null) {
                                    gofVar.add(fg0VarE2);
                                }
                                i26 = i27 + 1;
                            }
                        }
                        j4 >>= i20;
                        i24++;
                        objArr5 = objArr5;
                    }
                    objArr = objArr5;
                    if (i23 != i20) {
                        break;
                    }
                } else {
                    objArr = objArr5;
                }
                if (i22 == length3) {
                    break;
                }
                i21 = i22 + 1;
                objArr5 = objArr;
                i20 = 8;
            }
        }
        gof gofVarE = p90.e(gofVar);
        String strConcat12 = "dg0".concat(str);
        a4c a4cVar12 = gm0.f;
        if (a4cVar12 != null && a4cVar12.b(je9Var)) {
            arrayList3 = null;
            a4cVar12.c(je9Var, strConcat12, "prepareAttaches: requested entities -> " + gofVarE, null);
        } else {
            arrayList3 = null;
        }
        jg0 jg0Var = (jg0) this.j.getValue();
        bg0Var.d = arrayList3;
        bg0Var.e = b9bVar2;
        bg0Var.h = i19;
        objQ = jg0Var.a(gofVarE, bg0Var);
        if (objQ != hu4Var) {
            b9bVar = b9bVar2;
            set = (Set) objQ;
            strConcat = "dg0".concat(str);
            a4cVar = gm0.f;
            if (a4cVar != null) {
                a4cVar.c(je9Var, strConcat, "prepareAttaches: missing entities -> " + set, null);
            }
            objArr2 = b9bVar.c;
            jArr = b9bVar.a;
            length = jArr.length - 2;
            if (length >= 0) {
                i6 = 0;
                while (true) {
                    j3 = jArr[i6];
                    if ((((~j3) << c) & j3 & j) != j) {
                        i7 = 8 - ((~(i6 - length)) >>> 31);
                        i8 = 0;
                        while (i8 < i7) {
                            if ((j3 & 255) < 128) {
                                u8b u8bVar4 = (u8b) objArr2[(i6 << 3) + i8];
                                int i110 = u8bVar4.b;
                                objArr4 = u8bVar4.a;
                                hj8 hj8VarF1 = oc9.f0(0, i110);
                                i10 = hj8VarF1.a;
                                i11 = hj8VarF1.b;
                                if (i10 <= i11) {
                                    i12 = 0;
                                    while (true) {
                                        objArr4[i10 - i12] = objArr4[i10];
                                        i9 = i8;
                                        fg0VarE = e((e70) objArr4[i10]);
                                        if (fg0VarE != null) {
                                            i12++;
                                        } else {
                                            i12++;
                                        }
                                        if (i10 != i11) {
                                            break;
                                            break;
                                        }
                                        i10++;
                                        i8 = i9;
                                    }
                                } else {
                                    i9 = i8;
                                    i12 = 0;
                                }
                                Arrays.fill(objArr4, i110 - i12, i110, (Object) null);
                                u8bVar4.b -= i12;
                            } else {
                                i9 = i8;
                            }
                            j3 >>= 8;
                            i8 = i9 + 1;
                            jArr = jArr;
                            objArr2 = objArr2;
                        }
                        objArr3 = objArr2;
                        jArr3 = jArr;
                        if (i7 == 8) {
                            break;
                            break;
                        }
                    } else {
                        objArr3 = objArr2;
                        jArr3 = jArr;
                    }
                    if (i6 != length) {
                        break;
                        break;
                    }
                    i6++;
                    jArr = jArr3;
                    objArr2 = objArr3;
                }
            }
            jArr2 = b9bVar.a;
            length2 = jArr2.length - 2;
            if (length2 >= 0) {
                i2 = 0;
                while (true) {
                    j2 = jArr2[i2];
                    if ((((~j2) << c) & j2 & j) != j) {
                        i3 = 8 - ((~(i2 - length2)) >>> 31);
                        while (i4 < i3) {
                            if ((j2 & 255) < 128) {
                                i5 = (i2 << 3) + i4;
                                Object obj2 = b9bVar.b[i5];
                                u8bVar = (u8b) b9bVar.c[i5];
                                ((Number) obj2).longValue();
                                if (u8bVar.i()) {
                                    b9bVar.n(i5);
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 == 8) {
                            break;
                            break;
                        }
                    }
                    if (i2 != length2) {
                        break;
                        break;
                    }
                    i2++;
                }
            }
            strConcat2 = "dg0".concat(str);
            a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                a4cVar2.c(je9Var, strConcat2, "prepareAttaches: filtered saved -> " + b9bVar, null);
            }
            return b9bVar;
        }
        return hu4Var;
    }

    public final ArrayList d(Set set, long j) {
        nq9 nq9Var;
        String str;
        je9 je9Var = je9.f;
        rt2 rt2Var = (rt2) ((xn3) this.l.getValue()).k(j).a.getValue();
        if (rt2Var == null) {
            String strConcat = "dg0".concat("");
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, strConcat, nbh.s(j, "no chat by id -> ", ", skip it"), null);
            }
            return null;
        }
        if (set.isEmpty()) {
            String strConcat2 = "dg0".concat("");
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, strConcat2, "resolveAutoSaveSettings: empty messageIds, skip it", null);
            }
            return null;
        }
        if (!((ju6) ((rs6) this.i.getValue())).a()) {
            String strConcat3 = "dg0".concat("");
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, strConcat3, "resolveAutoSaveSettings: no permissions for download directory, skip it", null);
            }
            return null;
        }
        if (rt2Var instanceof s04) {
            String strConcat4 = "dg0".concat("");
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, strConcat4, "resolveAutoSaveSettings: comments are not supported", null);
            }
            return null;
        }
        if (rt2Var.d0() && !rt2Var.A0()) {
            String strConcat5 = "dg0".concat("");
            a4c a4cVar5 = gm0.f;
            if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                a4cVar5.c(je9Var, strConcat5, "resolveAutoSaveSettings: channel is not subscribed", null);
            }
            return null;
        }
        if (rt2Var.k0((e5d) this.h.getValue())) {
            String strConcat6 = "dg0".concat("");
            a4c a4cVar6 = gm0.f;
            if (a4cVar6 != null && a4cVar6.b(je9Var)) {
                a4cVar6.c(je9Var, strConcat6, "resolveAutoSaveSettings: forwarding is disabled in chat", null);
            }
            return null;
        }
        if (rt2Var.b0()) {
            nq9Var = nq9.DIALOG_WITH_BOT;
        } else if (rt2Var.h0()) {
            nq9Var = nq9.DIALOG;
        } else if (rt2Var.e0()) {
            nq9Var = nq9.CHAT;
        } else {
            nq9Var = rt2Var.d0() ? nq9.CHANNEL : null;
        }
        if (nq9Var != null) {
            qq9 qq9VarU = ((xb9) ((et3) this.f.getValue())).U();
            oq9 oq9Var = qq9.Companion;
            ArrayList arrayListA = qq9VarU.a(nq9Var, null);
            if (!arrayListA.isEmpty()) {
                return arrayListA;
            }
            String strConcat7 = "dg0".concat("");
            a4c a4cVar7 = gm0.f;
            if (a4cVar7 != null && a4cVar7.b(je9Var)) {
                a4cVar7.c(je9Var, strConcat7, "resolveAutoSaveSettings: autosave is disabled for chat type -> " + nq9Var, null);
            }
            return null;
        }
        String strConcat8 = "dg0".concat("");
        a4c a4cVar8 = gm0.f;
        if (a4cVar8 != null && a4cVar8.b(je9Var)) {
            switch (rt2Var.p()) {
                case 1:
                    str = "UNKNOWN";
                    break;
                case 2:
                    str = "DIALOG";
                    break;
                case 3:
                    str = "DIALOG_WITH_BOT";
                    break;
                case 4:
                    str = "DIALOG_SAVED_MESSAGES";
                    break;
                case 5:
                    str = "PUBLIC_CHAT";
                    break;
                case 6:
                    str = "PRIVATE_CHAT";
                    break;
                case 7:
                    str = "PUBLIC_CHANNEL";
                    break;
                case 8:
                    str = "PRIVATE_CHANNEL";
                    break;
                case 9:
                    str = "COMMENTS";
                    break;
                default:
                    str = "null";
                    break;
            }
            a4cVar8.c(je9Var, strConcat8, "resolveAutoSaveSettings: chat has unsupported type -> ".concat(str), null);
        }
        return null;
    }
}
