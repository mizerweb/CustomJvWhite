package defpackage;

import android.net.Uri;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class fz1 extends mdh implements wf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public /* synthetic */ Object g;
    public /* synthetic */ Object h;
    public /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fz1(Object obj, lq4 lq4Var, int i) {
        super(5, lq4Var);
        this.e = i;
        this.i = obj;
    }

    @Override // defpackage.wf7
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) throws IllegalAccessException, InvocationTargetException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((Number) obj4).longValue();
                fz1 fz1Var = new fz1((h02) this.i, (lq4) serializable, 0);
                fz1Var.f = (l9) obj;
                fz1Var.g = (t4f) obj2;
                fz1Var.h = (gc) obj3;
                fz1Var.invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                fz1 fz1Var2 = new fz1((vl4) this.i, (lq4) serializable, 1);
                fz1Var2.f = (ylc) obj;
                fz1Var2.g = (List) obj3;
                fz1Var2.h = (ozg) obj4;
                return fz1Var2.invokeSuspend(sbiVar);
            case 2:
                fz1 fz1Var3 = new fz1(5, (lq4) serializable, 2);
                fz1Var3.f = (y16) obj;
                fz1Var3.g = (n16) obj2;
                fz1Var3.h = (f16) obj3;
                fz1Var3.i = (omh) obj4;
                return fz1Var3.invokeSuspend(sbiVar);
            default:
                fz1 fz1Var4 = new fz1(5, (lq4) serializable, 3);
                fz1Var4.f = (List) obj;
                fz1Var4.g = (List) obj2;
                fz1Var4.h = (List) obj3;
                fz1Var4.i = (a4g) obj4;
                return fz1Var4.invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x028f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0291 A[LOOP:4: B:98:0x0245->B:113:0x0291, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:255:0x059b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:256:0x059d A[LOOP:18: B:241:0x0552->B:256:0x059d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:278:0x0618 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:279:0x061a A[LOOP:21: B:264:0x05cd->B:279:0x061a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:459:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x029c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x05a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x0620 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0227 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0229 A[LOOP:2: B:78:0x01e0->B:93:0x0229, LOOP_END] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
        h02 h02Var;
        l9 l9Var;
        ao1 ao1Var;
        fu1 fu1Var;
        Map mapB;
        Map map;
        enc encVar;
        long j;
        tmc tmcVar;
        c9b c9bVar;
        Map map2;
        LinkedHashMap linkedHashMap;
        boolean z;
        LinkedHashMap linkedHashMap2;
        int i;
        ArrayList arrayList;
        tmc tmcVar2;
        int i2;
        int i3;
        tmc tmcVar3;
        int i4;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        long[] jArr;
        Object[] objArr4;
        long[] jArr2;
        Object[] objArr5;
        Object[] objArr6;
        long j2;
        long j3;
        boolean z2;
        switch (this.e) {
            case 0:
                l9 l9Var2 = (l9) this.f;
                t4f t4fVar = (t4f) this.g;
                gc gcVar = (gc) this.h;
                ch3.d0(obj);
                h02 h02Var2 = (h02) this.i;
                yp9 yp9Var = yp9.b;
                w82 w82Var = h02Var2.e;
                enc encVar2 = l9Var2.c;
                String str = l9Var2.a;
                if (!encVar2.a.a.c()) {
                    w82Var.h(null);
                }
                mjg mjgVar = h02Var2.s;
                while (true) {
                    Object value = mjgVar.getValue();
                    ao1 ao1Var2 = (ao1) value;
                    if (!r5h.X0(str) && !r5h.X0(ao1Var2.b) && !cqk.d(ao1Var2.b, str)) {
                        ao1Var2 = new ao1(false, null, false, false, 16777215);
                    }
                    jj0 jj0Var = h02Var2.q;
                    jj0Var.a = str;
                    jj0Var.f = l9Var2.b;
                    jj0Var.g = encVar2;
                    jj0Var.h = l9Var2.d;
                    jj0Var.i = t4fVar;
                    jj0Var.j = gcVar;
                    ao1 ao1VarB = jj0Var.b(ao1Var2);
                    if (ao1VarB.w) {
                        w82Var.d(ao1VarB.t == yp9Var);
                        w82Var.e(ao1VarB.s == yp9Var);
                    }
                    if (mjgVar.h(value, ao1VarB)) {
                        fu1 fu1Var2 = l9Var2.e.a;
                        pu1 pu1Var = (pu1) h02Var2.r.getValue();
                        boolean z3 = ao1VarB.h;
                        v8b v8bVar = pu1Var.e;
                        ny8 ny8Var = pu1Var.d;
                        c9b c9bVar2 = pu1Var.f;
                        Map map3 = encVar2.g;
                        Map map4 = encVar2.f;
                        tmc tmcVar4 = encVar2.a;
                        Map map5 = encVar2.c;
                        boolean z4 = z3 && ((Boolean) ((e5d) pu1Var.c.getValue()).I0.a(e5d.S6[85]).i()).booleanValue();
                        long asLong = pu1Var.b.getAsLong();
                        if (z4) {
                            v8b v8bVar2 = pu1Var.g;
                            c9b c9bVar3 = new c9b();
                            Iterator it = map5.values().iterator();
                            while (it.hasNext()) {
                                ny8 ny8Var2 = ny8Var;
                                hu1 hu1Var = ((tmc) it.next()).a;
                                if (hu1Var.h() && !hu1Var.l()) {
                                    c9bVar3.a(hu1Var.getId());
                                }
                                ny8Var = ny8Var2;
                            }
                            ny8 ny8Var3 = ny8Var;
                            Object[] objArr7 = c9bVar3.b;
                            long[] jArr3 = c9bVar3.a;
                            int length = jArr3.length - 2;
                            h02Var = h02Var2;
                            l9Var = l9Var2;
                            if (length >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j4 = jArr3[i5];
                                    map = map3;
                                    ao1Var = ao1VarB;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                                        for (int i7 = 0; i7 < i6; i7++) {
                                            if ((j4 & 255) < 128) {
                                                j3 = j4;
                                                fu1 fu1Var3 = (fu1) objArr7[(i5 << 3) + i7];
                                                if (v8bVar.b(fu1Var3) < 0) {
                                                    v8bVar.g(asLong, fu1Var3);
                                                    v8bVar2.f(fu1Var3);
                                                }
                                            } else {
                                                j3 = j4;
                                            }
                                            j4 = j3 >> 8;
                                        }
                                        if (i6 == 8) {
                                            if (i5 != length) {
                                                i5++;
                                                ao1VarB = ao1Var;
                                                map3 = map;
                                            }
                                        }
                                    } else if (i5 != length) {
                                        i5++;
                                        ao1VarB = ao1Var;
                                        map3 = map;
                                    }
                                }
                            } else {
                                map = map3;
                                ao1Var = ao1VarB;
                            }
                            Object[] objArr8 = v8bVar.b;
                            long[] jArr4 = v8bVar.c;
                            long[] jArr5 = v8bVar.a;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i8 = 0;
                                j = 2000;
                                while (true) {
                                    long j5 = jArr5[i8];
                                    encVar = encVar2;
                                    long[] jArr6 = jArr5;
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        int i10 = 0;
                                        while (i10 < i9) {
                                            if ((j5 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                j2 = j5;
                                                fu1 fu1Var4 = (fu1) objArr8[i11];
                                                if (asLong - jArr4[i11] >= 2000) {
                                                    c9bVar2.a(fu1Var4);
                                                }
                                            } else {
                                                j2 = j5;
                                            }
                                            i10++;
                                            j5 = j2 >> 8;
                                        }
                                        if (i9 == 8) {
                                            if (i8 != length2) {
                                                i8++;
                                                jArr5 = jArr6;
                                                encVar2 = encVar;
                                            }
                                        }
                                    } else if (i8 != length2) {
                                        i8++;
                                        jArr5 = jArr6;
                                        encVar2 = encVar;
                                    }
                                }
                            } else {
                                encVar = encVar2;
                                j = 2000;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Object[] objArr9 = v8bVar.b;
                            long[] jArr7 = v8bVar.c;
                            long[] jArr8 = v8bVar.a;
                            int length3 = jArr8.length - 2;
                            if (length3 >= 0) {
                                long[] jArr9 = jArr7;
                                int i12 = 0;
                                while (true) {
                                    long j6 = jArr8[i12];
                                    long[] jArr10 = jArr9;
                                    tmcVar = tmcVar4;
                                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        int i14 = 0;
                                        while (i14 < i13) {
                                            if ((j6 & 255) < 128) {
                                                int i15 = (i12 << 3) + i14;
                                                Object obj2 = objArr9[i15];
                                                long j7 = jArr10[i15];
                                                objArr6 = objArr9;
                                                fu1 fu1Var5 = (fu1) obj2;
                                                if (!c9bVar3.c(fu1Var5)) {
                                                    arrayList2.add(fu1Var5);
                                                }
                                            } else {
                                                objArr6 = objArr9;
                                            }
                                            j6 >>= 8;
                                            i14++;
                                            objArr9 = objArr6;
                                        }
                                        objArr5 = objArr9;
                                        if (i13 == 8) {
                                        }
                                    } else {
                                        objArr5 = objArr9;
                                    }
                                    if (i12 != length3) {
                                        i12++;
                                        jArr9 = jArr10;
                                        tmcVar4 = tmcVar;
                                        objArr9 = objArr5;
                                    }
                                }
                            } else {
                                tmcVar = tmcVar4;
                            }
                            int size = arrayList2.size();
                            for (int i16 = 0; i16 < size; i16++) {
                                v8bVar2.g(asLong, arrayList2.get(i16));
                                v8bVar.f(arrayList2.get(i16));
                            }
                            Set setKeySet = map5.keySet();
                            Object[] objArr10 = c9bVar2.b;
                            long[] jArr11 = c9bVar2.a;
                            int length4 = jArr11.length - 2;
                            if (length4 >= 0) {
                                int i17 = 0;
                                while (true) {
                                    long j8 = jArr11[i17];
                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i18 = 8 - ((~(i17 - length4)) >>> 31);
                                        int i19 = 0;
                                        while (i19 < i18) {
                                            if ((j8 & 255) < 128) {
                                                objArr4 = objArr10;
                                                int i20 = (i17 << 3) + i19;
                                                jArr2 = jArr11;
                                                if (!ww3.j1(setKeySet, objArr4[i20])) {
                                                    c9bVar2.h(i20);
                                                }
                                            } else {
                                                objArr4 = objArr10;
                                                jArr2 = jArr11;
                                            }
                                            j8 >>= 8;
                                            i19++;
                                            jArr11 = jArr2;
                                            objArr10 = objArr4;
                                        }
                                        objArr3 = objArr10;
                                        jArr = jArr11;
                                        if (i18 == 8) {
                                        }
                                    } else {
                                        objArr3 = objArr10;
                                        jArr = jArr11;
                                    }
                                    if (i17 != length4) {
                                        i17++;
                                        jArr11 = jArr;
                                        objArr10 = objArr3;
                                    }
                                }
                            }
                            Set setKeySet2 = map5.keySet();
                            ArrayList arrayList3 = new ArrayList();
                            Object[] objArr11 = v8bVar2.b;
                            long[] jArr12 = v8bVar2.c;
                            long[] jArr13 = v8bVar2.a;
                            int length5 = jArr13.length - 2;
                            if (length5 >= 0) {
                                int i21 = 0;
                                while (true) {
                                    long j9 = jArr13[i21];
                                    long[] jArr14 = jArr12;
                                    long[] jArr15 = jArr13;
                                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i22 = 8 - ((~(i21 - length5)) >>> 31);
                                        int i23 = 0;
                                        while (i23 < i22) {
                                            if ((j9 & 255) < 128) {
                                                int i24 = (i21 << 3) + i23;
                                                Object obj3 = objArr11[i24];
                                                long j10 = jArr14[i24];
                                                objArr2 = objArr11;
                                                fu1 fu1Var6 = (fu1) obj3;
                                                if (!setKeySet2.contains(fu1Var6)) {
                                                    arrayList3.add(fu1Var6);
                                                }
                                            } else {
                                                objArr2 = objArr11;
                                            }
                                            j9 >>= 8;
                                            i23++;
                                            objArr11 = objArr2;
                                        }
                                        objArr = objArr11;
                                        if (i22 == 8) {
                                        }
                                    } else {
                                        objArr = objArr11;
                                    }
                                    if (i21 != length5) {
                                        i21++;
                                        jArr12 = jArr14;
                                        jArr13 = jArr15;
                                        objArr11 = objArr;
                                    }
                                }
                            }
                            int size2 = arrayList3.size();
                            for (int i25 = 0; i25 < size2; i25++) {
                                v8bVar2.f(arrayList3.get(i25));
                            }
                            if (v8bVar.e == 0 || !pu1Var.a(asLong)) {
                                sgg sggVar = pu1Var.k;
                                if (sggVar != null) {
                                    sggVar.b(null);
                                }
                                pu1Var.k = null;
                            } else {
                                sgg sggVar2 = pu1Var.k;
                                if (sggVar2 != null) {
                                    i4 = 1;
                                    if (!sggVar2.isActive()) {
                                    }
                                } else {
                                    i4 = 1;
                                }
                                pu1Var.k = yab.i0(pu1Var.a, null, 0, new qt1(pu1Var, null, i4), 3);
                            }
                            if (((h22) ny8Var3.getValue()).a() && map4.isEmpty()) {
                                mapB = new LinkedHashMap();
                                pw pwVar = new pw(0);
                                tmc tmcVar5 = tmcVar;
                                mapB.put(tmcVar5.a.getId(), tmcVar5);
                                pwVar.add(tmcVar5.a.getId());
                                fu1Var = fu1Var2;
                                tmc tmcVar6 = (tmc) map5.get(fu1Var);
                                if (tmcVar6 != null) {
                                    hu1 hu1Var2 = tmcVar6.a;
                                    mapB.put(hu1Var2.getId(), tmcVar6);
                                    pwVar.add(hu1Var2.getId());
                                }
                                for (fu1 fu1Var7 : pu1Var.i) {
                                    if (!pwVar.contains(fu1Var7) && (tmcVar3 = (tmc) map5.get(fu1Var7)) != null) {
                                        mapB.put(fu1Var7, tmcVar3);
                                        pwVar.add(fu1Var7);
                                    }
                                }
                                for (Map.Entry entry : map5.entrySet()) {
                                    fu1 fu1Var8 = (fu1) entry.getKey();
                                    tmc tmcVar7 = (tmc) entry.getValue();
                                    if (!pwVar.contains(fu1Var8)) {
                                        mapB.put(fu1Var8, tmcVar7);
                                    }
                                }
                            } else {
                                fu1Var = fu1Var2;
                                tmc tmcVar8 = tmcVar;
                                if (((h22) ny8Var3.getValue()).a()) {
                                    h22 h22Var = (h22) ny8Var3.getValue();
                                    h22Var.f = false;
                                    h22Var.g = false;
                                    sgg sggVar3 = h22Var.e;
                                    if (sggVar3 != null) {
                                        sggVar3.b(null);
                                    }
                                    h22Var.e = null;
                                }
                                ArrayList arrayList4 = new ArrayList(map.keySet());
                                if (arrayList4.size() > 1) {
                                    bx3.Y0(arrayList4, new mu1(1, encVar));
                                }
                                c9b c9bVar4 = new c9b();
                                Set<fu1> setKeySet3 = map4.keySet();
                                v8b v8bVar3 = pu1Var.h;
                                for (fu1 fu1Var9 : setKeySet3) {
                                    if (v8bVar3.b(fu1Var9) < 0) {
                                        v8bVar3.g(asLong, fu1Var9);
                                    }
                                }
                                ArrayList arrayList5 = new ArrayList();
                                Object[] objArr12 = v8bVar3.b;
                                long[] jArr16 = v8bVar3.c;
                                long[] jArr17 = v8bVar3.a;
                                int length6 = jArr17.length - 2;
                                if (length6 >= 0) {
                                    int i26 = 0;
                                    while (true) {
                                        long j11 = jArr17[i26];
                                        c9bVar = c9bVar4;
                                        long[] jArr18 = jArr17;
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i27 = 8 - ((~(i26 - length6)) >>> 31);
                                            for (int i28 = 0; i28 < i27; i28 = i3 + 1) {
                                                if ((j11 & 255) < 128) {
                                                    int i29 = (i26 << 3) + i28;
                                                    Object obj4 = objArr12[i29];
                                                    long j12 = jArr16[i29];
                                                    i3 = i28;
                                                    fu1 fu1Var10 = (fu1) obj4;
                                                    if (!setKeySet3.contains(fu1Var10)) {
                                                        arrayList5.add(fu1Var10);
                                                    }
                                                } else {
                                                    i3 = i28;
                                                }
                                                j11 >>= 8;
                                            }
                                            if (i27 == 8) {
                                                if (i26 != length6) {
                                                    i26++;
                                                    c9bVar4 = c9bVar;
                                                    jArr17 = jArr18;
                                                }
                                            }
                                        } else if (i26 != length6) {
                                            i26++;
                                            c9bVar4 = c9bVar;
                                            jArr17 = jArr18;
                                        }
                                    }
                                } else {
                                    c9bVar = c9bVar4;
                                }
                                int size3 = arrayList5.size();
                                for (int i30 = 0; i30 < size3; i30++) {
                                    v8bVar3.f(arrayList5.get(i30));
                                }
                                c9b c9bVar5 = new c9b();
                                ArrayList arrayList6 = new ArrayList();
                                Object[] objArr13 = v8bVar.b;
                                long[] jArr19 = v8bVar.c;
                                long[] jArr20 = v8bVar.a;
                                int length7 = jArr20.length - 2;
                                if (length7 >= 0) {
                                    int i31 = 0;
                                    while (true) {
                                        long j13 = jArr20[i31];
                                        Object[] objArr14 = objArr13;
                                        long[] jArr21 = jArr19;
                                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i32 = 8 - ((~(i31 - length7)) >>> 31);
                                            for (int i33 = 0; i33 < i32; i33 = i2 + 1) {
                                                if ((j13 & 255) < 128) {
                                                    int i34 = (i31 << 3) + i33;
                                                    Object obj5 = objArr14[i34];
                                                    long j14 = jArr21[i34];
                                                    i2 = i33;
                                                    fu1 fu1Var11 = (fu1) obj5;
                                                    if (asLong - j14 >= j) {
                                                        c9bVar5.a(fu1Var11);
                                                        arrayList6.add(fu1Var11);
                                                    }
                                                } else {
                                                    i2 = i33;
                                                }
                                                j13 >>= 8;
                                            }
                                            if (i32 == 8) {
                                                if (i31 != length7) {
                                                    i31++;
                                                    objArr13 = objArr14;
                                                    jArr19 = jArr21;
                                                }
                                            }
                                        } else if (i31 != length7) {
                                            i31++;
                                            objArr13 = objArr14;
                                            jArr19 = jArr21;
                                        }
                                    }
                                }
                                ArrayList arrayList7 = new ArrayList();
                                for (fu1 fu1Var12 : pu1Var.i) {
                                    if (map5.keySet().contains(fu1Var12)) {
                                        arrayList7.add(fu1Var12);
                                    }
                                }
                                for (fu1 fu1Var13 : map5.keySet()) {
                                    if (!arrayList7.contains(fu1Var13)) {
                                        arrayList7.add(fu1Var13);
                                    }
                                }
                                q8b q8bVar = new q8b(arrayList7.size());
                                int size4 = arrayList7.size();
                                for (int i35 = 0; i35 < size4; i35++) {
                                    q8bVar.e(i35, arrayList7.get(i35));
                                }
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                linkedHashMap3.put(tmcVar8.a.getId(), tmcVar8);
                                c9b c9bVar6 = c9bVar;
                                c9bVar6.a(tmcVar8.a.getId());
                                tmc tmcVar9 = (tmc) map5.get(fu1Var);
                                if (tmcVar9 != null) {
                                    hu1 hu1Var3 = tmcVar9.a;
                                    linkedHashMap3.put(hu1Var3.getId(), tmcVar9);
                                    c9bVar6.a(hu1Var3.getId());
                                }
                                int size5 = arrayList4.size();
                                for (int i36 = 0; i36 < size5; i36++) {
                                    fu1 fu1Var14 = (fu1) arrayList4.get(i36);
                                    if (!cqk.d(fu1Var14, fu1Var) && (tmcVar2 = (tmc) map5.get(fu1Var14)) != null) {
                                        linkedHashMap3.put(fu1Var14, tmcVar2);
                                        c9bVar6.a(fu1Var14);
                                    }
                                }
                                ArrayList arrayList8 = new ArrayList(map4.entrySet());
                                if (arrayList8.size() > 1) {
                                    bx3.Y0(arrayList8, new nu1(pu1Var, 0));
                                }
                                int size6 = arrayList8.size();
                                for (int i37 = 0; i37 < size6; i37++) {
                                    Map.Entry entry2 = (Map.Entry) arrayList8.get(i37);
                                    fu1 fu1Var15 = (fu1) entry2.getKey();
                                    tmc tmcVar10 = (tmc) entry2.getValue();
                                    if (!c9bVar6.c(fu1Var15)) {
                                        linkedHashMap3.put(fu1Var15, tmcVar10);
                                        c9bVar6.a(fu1Var15);
                                    }
                                }
                                ArrayList arrayList9 = new ArrayList();
                                ArrayList arrayList10 = new ArrayList();
                                ArrayList arrayList11 = new ArrayList();
                                int size7 = arrayList6.size();
                                boolean z5 = false;
                                int i38 = 0;
                                while (i38 < size7) {
                                    fu1 fu1Var16 = (fu1) arrayList6.get(i38);
                                    if (c9bVar6.c(fu1Var16)) {
                                        arrayList = arrayList6;
                                    } else {
                                        arrayList9.add(fu1Var16);
                                        arrayList = arrayList6;
                                        if (pu1Var.j.c(fu1Var16)) {
                                            arrayList11.add(fu1Var16);
                                        } else {
                                            arrayList10.add(fu1Var16);
                                            z5 = true;
                                        }
                                    }
                                    i38++;
                                    arrayList6 = arrayList;
                                }
                                if (arrayList10.size() > 1) {
                                    bx3.Y0(arrayList10, new ou1(q8bVar, 0));
                                }
                                if (arrayList11.size() > 1) {
                                    bx3.Y0(arrayList11, new ou1(q8bVar, 1));
                                }
                                ArrayList arrayList12 = new ArrayList();
                                Object[] objArr15 = c9bVar2.b;
                                long[] jArr22 = c9bVar2.a;
                                int length8 = jArr22.length - 2;
                                if (length8 >= 0) {
                                    z = z5;
                                    int i39 = 0;
                                    while (true) {
                                        long j15 = jArr22[i39];
                                        map2 = map5;
                                        linkedHashMap = linkedHashMap3;
                                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i40 = 8 - ((~(i39 - length8)) >>> 31);
                                            for (int i41 = 0; i41 < i40; i41 = i + 1) {
                                                if ((j15 & 255) < 128) {
                                                    i = i41;
                                                    fu1 fu1Var17 = (fu1) objArr15[(i39 << 3) + i41];
                                                    if (!c9bVar6.c(fu1Var17) && !c9bVar5.c(fu1Var17)) {
                                                        arrayList12.add(fu1Var17);
                                                    }
                                                } else {
                                                    i = i41;
                                                }
                                                j15 >>= 8;
                                            }
                                            if (i40 == 8) {
                                            }
                                        }
                                        if (i39 != length8) {
                                            i39++;
                                            map5 = map2;
                                            linkedHashMap3 = linkedHashMap;
                                        }
                                    }
                                } else {
                                    map2 = map5;
                                    linkedHashMap = linkedHashMap3;
                                    z = z5;
                                }
                                zv zvVar = new zv();
                                if (z) {
                                    ArrayList arrayList13 = new ArrayList(arrayList12);
                                    if (arrayList13.size() > 1) {
                                        bx3.Y0(arrayList13, new nu1(pu1Var, 1));
                                    }
                                    int iMin = Math.min(arrayList10.size(), arrayList13.size());
                                    q8b q8bVar2 = new q8b();
                                    int size8 = arrayList10.size();
                                    int i42 = 0;
                                    while (i42 < size8) {
                                        fu1 fu1Var18 = (fu1) arrayList10.get(i42);
                                        q8bVar2.e(i42 < iMin ? q8bVar.c(Integer.MAX_VALUE, arrayList13.get(i42)) : q8bVar.c(Integer.MAX_VALUE, fu1Var18), fu1Var18);
                                        i42++;
                                    }
                                    int size9 = arrayList11.size();
                                    for (int i43 = 0; i43 < size9; i43++) {
                                        q8bVar2.e(q8bVar.c(Integer.MAX_VALUE, arrayList11.get(i43)), arrayList11.get(i43));
                                    }
                                    int size10 = arrayList13.size();
                                    for (int i44 = iMin; i44 < size10; i44++) {
                                        q8bVar2.e(q8bVar.c(Integer.MAX_VALUE, arrayList13.get(i44)), arrayList13.get(i44));
                                    }
                                    zvVar.addAll(arrayList10);
                                    zvVar.addAll(arrayList11);
                                    int size11 = arrayList13.size();
                                    while (iMin < size11) {
                                        zvVar.addLast(arrayList13.get(iMin));
                                        iMin++;
                                    }
                                    if (zvVar.getSize() > 1) {
                                        bx3.Y0(zvVar, new ou1(q8bVar2, 3));
                                    }
                                } else {
                                    zvVar.addAll(arrayList9);
                                    zvVar.addAll(arrayList12);
                                    if (zvVar.getSize() > 1) {
                                        bx3.Y0(zvVar, new ou1(q8bVar, 2));
                                    }
                                }
                                if (!zvVar.isEmpty()) {
                                    int size12 = c9bVar6.d;
                                    while (!zvVar.isEmpty()) {
                                        int iMin2 = Math.min((((size12 / 6) + 1) * 6) - size12, zvVar.c);
                                        if (iMin2 < 0) {
                                            iMin2 = 0;
                                        }
                                        ArrayList arrayList14 = new ArrayList(iMin2);
                                        for (int i45 = 0; i45 < iMin2; i45++) {
                                            arrayList14.add(zvVar.removeFirst());
                                        }
                                        int size13 = arrayList14.size();
                                        int i46 = 0;
                                        while (i46 < size13) {
                                            fu1 fu1Var19 = (fu1) arrayList14.get(i46);
                                            Map map6 = map2;
                                            tmc tmcVar11 = (tmc) map6.get(fu1Var19);
                                            if (tmcVar11 == null) {
                                                linkedHashMap2 = linkedHashMap;
                                            } else {
                                                linkedHashMap2 = linkedHashMap;
                                                linkedHashMap2.put(fu1Var19, tmcVar11);
                                                c9bVar6.a(fu1Var19);
                                            }
                                            i46++;
                                            map2 = map6;
                                            linkedHashMap = linkedHashMap2;
                                        }
                                        size12 += arrayList14.size();
                                    }
                                }
                                LinkedHashMap linkedHashMap4 = linkedHashMap;
                                ArrayList arrayList15 = new ArrayList();
                                for (Object obj6 : map2.entrySet()) {
                                    if (!c9bVar6.c(((Map.Entry) obj6).getKey())) {
                                        arrayList15.add(obj6);
                                    }
                                }
                                if (arrayList15.size() > 1) {
                                    bx3.Y0(arrayList15, new lv5(14));
                                }
                                int size14 = arrayList15.size();
                                for (int i47 = 0; i47 < size14; i47++) {
                                    Map.Entry entry3 = (Map.Entry) arrayList15.get(i47);
                                    fu1 fu1Var20 = (fu1) entry3.getKey();
                                    tmc tmcVar12 = (tmc) entry3.getValue();
                                    if (tmcVar12.a.c()) {
                                        linkedHashMap4.put(fu1Var20, tmcVar12);
                                        c9bVar6.a(fu1Var20);
                                    }
                                }
                                int size15 = arrayList15.size();
                                for (int i48 = 0; i48 < size15; i48++) {
                                    Map.Entry entry4 = (Map.Entry) arrayList15.get(i48);
                                    fu1 fu1Var21 = (fu1) entry4.getKey();
                                    tmc tmcVar13 = (tmc) entry4.getValue();
                                    if (!c9bVar6.c(fu1Var21)) {
                                        linkedHashMap4.put(fu1Var21, tmcVar13);
                                    }
                                }
                                pu1Var.i = ww3.T1(linkedHashMap4.keySet());
                                pu1Var.j = c9bVar5;
                                mapB = linkedHashMap4;
                            }
                        } else {
                            h02Var = h02Var2;
                            l9Var = l9Var2;
                            ao1Var = ao1VarB;
                            fu1Var = fu1Var2;
                            enc encVar3 = encVar2;
                            Set<fu1> setW1 = ww3.W1(ww3.M1(map3.keySet(), new mu1(0, map3)));
                            ul9 ul9Var = new ul9();
                            ul9Var.put(tmcVar4.a.getId(), tmcVar4);
                            tmc tmcVar14 = (tmc) map5.get(fu1Var);
                            if (tmcVar14 != null) {
                                hu1 hu1Var4 = tmcVar14.a;
                                ul9Var.put(hu1Var4.getId(), tmcVar14);
                                setW1.remove(hu1Var4.getId());
                            }
                            for (fu1 fu1Var22 : setW1) {
                                tmc tmcVar15 = (tmc) map5.get(fu1Var22);
                                if (tmcVar15 != null) {
                                    ul9Var.put(fu1Var22, tmcVar15);
                                }
                            }
                            tmc tmcVar16 = (tmc) map5.get(encVar3.a());
                            if (tmcVar16 != null) {
                            }
                            for (Map.Entry entry5 : map5.entrySet()) {
                                fu1 fu1Var23 = (fu1) entry5.getKey();
                                tmc tmcVar17 = (tmc) entry5.getValue();
                                if (!ul9Var.containsKey(fu1Var23)) {
                                    ul9Var.put(fu1Var23, tmcVar17);
                                }
                            }
                            mapB = ul9Var.b();
                        }
                        Collection<tmc> collectionValues = mapB.values();
                        int iP0 = wm9.P0(yw3.W0(collectionValues, 10));
                        if (iP0 < 16) {
                            iP0 = 16;
                        }
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap(iP0);
                        for (tmc tmcVar18 : collectionValues) {
                            ao1 ao1Var3 = ao1Var;
                            linkedHashMap5.put(tmcVar18.a.getId(), kpk.c(tmcVar18, tmcVar18.a.l(), ao1Var3.h, ao1Var3.n, h02Var.f, ao1Var3.f, fu1Var));
                        }
                        h02 h02Var3 = h02Var;
                        mjg mjgVar2 = h02Var3.v;
                        mjgVar2.getClass();
                        mjgVar2.j(null, linkedHashMap5);
                        h02.B(h02Var3, l9Var, ao1Var, linkedHashMap5);
                        return sbi.a;
                    }
                    h02Var2 = h02Var2;
                    encVar2 = encVar2;
                }
                break;
            case 1:
                ylc ylcVar = (ylc) this.f;
                List list = (List) this.g;
                ozg ozgVar = (ozg) this.h;
                ch3.d0(obj);
                vg4 vg4Var = (vg4) ylcVar.a;
                yhc yhcVar = (yhc) ylcVar.b;
                ((vl4) this.i).L = ozgVar;
                ylc ylcVarK = ((vl4) this.i).K(vg4Var, yhcVar, ozgVar);
                return new tjd((bkd) ylcVarK.a, (List) ylcVarK.b, list);
            case 2:
                y16 y16Var = (y16) this.f;
                n16 n16Var = (n16) this.g;
                f16 f16Var = (f16) this.h;
                omh omhVar = (omh) this.i;
                ch3.d0(obj);
                e16 e16Var = f16Var instanceof e16 ? (e16) f16Var : null;
                kb9 kb9Var = e16Var != null ? e16Var.a : null;
                if (!(n16Var instanceof k16)) {
                    z2 = false;
                } else if ((kb9Var != null ? kb9Var.l : null) == jb9.d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                rui ruiVar = y16Var.b;
                Uri uriD = ruiVar != null ? ruiVar.d() : null;
                return (!z2 || uriD == null || (omhVar instanceof nmh)) ? r16.a : new s16(uriD);
            default:
                List list2 = (List) this.f;
                List list3 = (List) this.g;
                List list4 = (List) this.h;
                a4g a4gVar = (a4g) this.i;
                ch3.d0(obj);
                hpg hpgVar = new hpg();
                hpgVar.a = list2;
                hpgVar.b = list3;
                hpgVar.c = list4;
                hpgVar.d = a4gVar;
                return hpgVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fz1(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }
}
