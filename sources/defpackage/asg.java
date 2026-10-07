package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.LongSupplier;

/* JADX INFO: loaded from: classes.dex */
public final class asg {
    public final af7 a;
    public final LongSupplier b;
    public final String c;
    public final mjg d;
    public final mjg e;
    public final r8e f;
    public final mjg g;
    public final r8e h;
    public final mjg i;
    public final r8e j;
    public final LinkedHashMap k;
    public final l9b l;

    static {
        ghb ghbVar = ew5.b;
        qe7.O(5, lw5.MINUTES);
    }

    public asg(wqg wqgVar) {
        td9 td9Var = new td9(2);
        this.a = wqgVar;
        this.b = td9Var;
        this.c = asg.class.getName();
        this.d = p90.a(s66.a);
        mjg mjgVarA = p90.a(new LinkedHashMap());
        this.e = mjgVarA;
        this.f = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(new LinkedHashMap());
        this.g = mjgVarA2;
        this.h = new r8e(mjgVarA2);
        mjg mjgVarA3 = p90.a(ki9.a);
        this.i = mjgVarA3;
        this.j = new r8e(mjgVarA3);
        this.k = new LinkedHashMap();
        this.l = new l9b();
    }

    public static Map a(Map map, azg azgVar, long j, k1h k1hVar) {
        hyg hygVar;
        upc upcVar = (upc) map.get(azgVar);
        if (upcVar == null || (hygVar = (hyg) upcVar.d().get(Long.valueOf(j))) == null) {
            return map;
        }
        hyg hygVarA = hyg.a(hygVar, 0, k1hVar, 0, 3967);
        LinkedHashMap linkedHashMap = new LinkedHashMap(upcVar.d().size());
        linkedHashMap.putAll(upcVar.d());
        linkedHashMap.put(Long.valueOf(j), hygVarA);
        upc upcVarA = upc.a(upcVar, linkedHashMap, 0L, false, 13);
        if (map.isEmpty()) {
            return Collections.singletonMap(azgVar, upcVarA);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
        linkedHashMap2.put(azgVar, upcVarA);
        return linkedHashMap2;
    }

    public static i8b d(List list, u8b u8bVar) {
        m8b m8bVar = new m8b(u8bVar.b);
        int i = u8bVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            m8bVar.m(((ozg) u8bVar.g(i2)).b.a());
        }
        i8b i8bVar = new i8b();
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            long jLongValue = ((Number) list.get(i3)).longValue();
            if (!m8bVar.d(jLongValue)) {
                i8bVar.a(jLongValue);
            }
        }
        return i8bVar;
    }

    public static LinkedHashMap l(LinkedHashMap linkedHashMap, Map map) {
        if (linkedHashMap != null) {
            return linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map.size());
        linkedHashMap2.putAll(map);
        return linkedHashMap2;
    }

    public static LinkedHashMap v(Map map, int i, long j, ozg ozgVar) {
        int i2 = 0;
        int iV = oc9.v(i, 0, map.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size() + 1);
        for (Map.Entry entry : map.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            ozg ozgVar2 = (ozg) entry.getValue();
            if (i2 == iV) {
                linkedHashMap.put(Long.valueOf(j), ozgVar);
            }
            linkedHashMap.put(Long.valueOf(jLongValue), ozgVar2);
            i2++;
        }
        if (iV == map.size()) {
            linkedHashMap.put(Long.valueOf(j), ozgVar);
        }
        return linkedHashMap;
    }

    public static ozg w(ozg ozgVar, ozg ozgVar2) {
        short sMin;
        if (ozgVar2 == null || ozgVar.c != ozgVar2.c || (sMin = (short) Math.min((int) ((short) Math.max((int) ozgVar.d, (int) ozgVar2.d)), (int) ozgVar.c)) == ozgVar.d) {
            return ozgVar;
        }
        String name = ozg.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "Inconsistent readCount for " + ozgVar2.b + ". Actual = " + ((int) sMin) + ", new = " + ((int) ozgVar.d), null);
            }
        }
        return ozg.a(ozgVar, (short) 0, sMin, 0, 55);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(nq4 nq4Var) {
        rrg rrgVar;
        l9b l9bVar;
        if (nq4Var instanceof rrg) {
            rrgVar = (rrg) nq4Var;
            int i = rrgVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                rrgVar.g = i - Integer.MIN_VALUE;
            } else {
                rrgVar = new rrg(this, nq4Var);
            }
        } else {
            rrgVar = new rrg(this, nq4Var);
        }
        Object obj = rrgVar.e;
        int i2 = rrgVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = this.l;
            rrgVar.d = l9bVar2;
            rrgVar.g = 1;
            Object objB = l9bVar2.b(rrgVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9bVar = rrgVar.d;
            ch3.d0(obj);
        }
        try {
            mjg mjgVar = this.e;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            mjgVar.getClass();
            mjgVar.j(null, linkedHashMap);
            this.i.setValue(ki9.a);
            this.k.clear();
            return sbi.a;
        } finally {
            l9bVar.g(null);
        }
    }

    public final void c(m8b m8bVar) {
        mjg mjgVar;
        Object value;
        l8b l8bVar;
        long j;
        char c;
        long j2;
        boolean z;
        long j3;
        int i;
        int i2;
        int i3;
        do {
            mjgVar = this.i;
            value = mjgVar.getValue();
            l8bVar = (l8b) value;
            long[] jArr = m8bVar.b;
            long[] jArr2 = m8bVar.a;
            int length = jArr2.length - 2;
            int i4 = 8;
            if (length >= 0) {
                int i5 = 0;
                z = false;
                j = 255;
                while (true) {
                    long j4 = jArr2[i5];
                    c = 7;
                    j2 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j4 & 255) < 128) {
                                i2 = i4;
                                i3 = i5;
                                if (l8bVar.b(jArr[(i5 << 3) + i7])) {
                                    z = true;
                                }
                            } else {
                                i2 = i4;
                                i3 = i5;
                            }
                            j4 >>= i2;
                            i7++;
                            i4 = i2;
                            i5 = i3;
                        }
                        int i8 = i5;
                        if (i6 != i4) {
                            break;
                        } else {
                            i = i8;
                        }
                    } else {
                        i = i5;
                    }
                    if (i == length) {
                        break;
                    }
                    i5 = i + 1;
                    i4 = 8;
                }
            } else {
                j = 255;
                c = 7;
                j2 = -9187201950435737472L;
                z = false;
            }
            if (z) {
                l8b l8bVar2 = new l8b(l8bVar.e);
                long[] jArr3 = l8bVar.b;
                Object[] objArr = l8bVar.c;
                long[] jArr4 = l8bVar.a;
                int length2 = jArr4.length - 2;
                if (length2 >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j5 = jArr4[i9];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i10 = 8 - ((~(i9 - length2)) >>> 31);
                            int i11 = 0;
                            while (i11 < i10) {
                                if ((j5 & j) < 128) {
                                    int i12 = (i9 << 3) + i11;
                                    j3 = j5;
                                    long j6 = jArr3[i12];
                                    int iF = ((v1h) objArr[i12]).f();
                                    if (!m8bVar.d(j6)) {
                                        l8bVar2.i(j6, v1h.a(iF));
                                    }
                                } else {
                                    j3 = j5;
                                }
                                i11++;
                                j5 = j3 >> 8;
                            }
                            if (i10 != 8) {
                                break;
                            }
                        }
                        if (i9 == length2) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
                l8bVar = l8bVar2;
            }
        } while (!mjgVar.h(value, l8bVar));
    }

    public final k1h e(azg azgVar, long j, k1h k1hVar) {
        mjg mjgVar;
        Object value;
        Map map;
        Map mapD;
        hyg hygVar;
        do {
            mjgVar = this.d;
            value = mjgVar.getValue();
            map = (Map) value;
        } while (!mjgVar.h(value, a(map, azgVar, j, k1hVar)));
        upc upcVar = (upc) map.get(azgVar);
        if (upcVar == null || (mapD = upcVar.d()) == null || (hygVar = (hyg) mapD.get(Long.valueOf(j))) == null) {
            return null;
        }
        return hygVar.h;
    }

    public final upc f(azg azgVar) {
        upc upcVar = (upc) ((Map) this.d.getValue()).get(azgVar);
        if (upcVar == null) {
            return null;
        }
        if (this.b.getAsLong() - upcVar.b() < ew5.g(((ew5) this.a.invoke()).a)) {
            return upcVar;
        }
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Stories cache (size=" + upcVar.d().size() + " for " + azgVar + " is not fresh. Clear", null);
            }
        }
        o(azgVar);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object g(long j, nq4 nq4Var) {
        urg urgVar;
        l9b l9bVar;
        mjg mjgVar = this.g;
        mjg mjgVar2 = this.e;
        if (nq4Var instanceof urg) {
            urgVar = (urg) nq4Var;
            int i = urgVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                urgVar.h = i - Integer.MIN_VALUE;
            } else {
                urgVar = new urg(this, nq4Var);
            }
        } else {
            urgVar = new urg(this, nq4Var);
        }
        Object obj = urgVar.f;
        int i2 = urgVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = this.l;
            urgVar.e = l9bVar2;
            urgVar.d = j;
            urgVar.h = 1;
            Object objB = l9bVar2.b(urgVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = urgVar.d;
            l9bVar = urgVar.e;
            ch3.d0(obj);
        }
        try {
            Map map = (Map) mjgVar2.getValue();
            Map map2 = (Map) mjgVar.getValue();
            ozg ozgVar = (ozg) map.get(new Long(j));
            ozg ozgVar2 = (ozg) map2.get(new Long(j));
            if (ozgVar != null || ozgVar2 != null) {
                this.k.put(new Long(j), new qrg(ozgVar, ozgVar != null ? ww3.v1(map.keySet(), new Long(j)) : -1, ozgVar2));
            }
            if (ozgVar != null) {
                Map mapR0 = wm9.R0(map, new Long(j));
                mjgVar2.getClass();
                mjgVar2.j(null, mapR0);
            }
            if (ozgVar2 != null) {
                Map mapR1 = wm9.R0(map2, new Long(j));
                mjgVar.getClass();
                mjgVar.j(null, mapR1);
            }
            return sbi.a;
        } finally {
            l9bVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object h(azg azgVar, nq4 nq4Var) {
        vrg vrgVar;
        l9b l9bVar;
        if (nq4Var instanceof vrg) {
            vrgVar = (vrg) nq4Var;
            int i = vrgVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                vrgVar.h = i - Integer.MIN_VALUE;
            } else {
                vrgVar = new vrg(this, nq4Var);
            }
        } else {
            vrgVar = new vrg(this, nq4Var);
        }
        Object obj = vrgVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = vrgVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            l9bVar = this.l;
            vrgVar.d = azgVar;
            vrgVar.e = l9bVar;
            vrgVar.h = 1;
            if (l9bVar.b(vrgVar) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9b l9bVar2 = vrgVar.e;
            azg azgVar2 = vrgVar.d;
            ch3.d0(obj);
            l9bVar = l9bVar2;
            azgVar = azgVar2;
        }
        try {
            ozg ozgVar = (ozg) ((Map) this.e.getValue()).get(new Long(azgVar.a()));
            if (ozgVar == null) {
                String name = asg.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "markStoryAsSeen: no preview for storyOwner=" + azgVar, null);
                    }
                }
            } else {
                u8b u8bVarC = cqb.c(ozg.a(ozgVar, (short) 0, (short) Math.min(ozgVar.d + 1, (int) ozgVar.c), 0, 55));
                k(u8bVarC, false);
                t(u8bVarC, false);
            }
            return sbi.a;
        } finally {
            l9bVar.g(null);
        }
    }

    public final void i(u8b u8bVar) {
        mjg mjgVar = this.g;
        Map map = (Map) mjgVar.getValue();
        int i = u8bVar.b;
        LinkedHashMap linkedHashMapL = null;
        for (int i2 = 0; i2 < i; i2++) {
            ozg ozgVar = (ozg) u8bVar.g(i2);
            long jA = ozgVar.b.a();
            Long lValueOf = Long.valueOf(jA);
            LinkedHashMap linkedHashMap = this.k;
            qrg qrgVar = (qrg) linkedHashMap.get(lValueOf);
            if (qrgVar != null) {
                linkedHashMap.put(Long.valueOf(jA), qrg.a(qrgVar, null, ozgVar, 3));
            } else {
                ozg ozgVarW = w(ozgVar, (ozg) map.get(Long.valueOf(jA)));
                if (!cqk.d(map.get(Long.valueOf(jA)), ozgVarW)) {
                    linkedHashMapL = l(linkedHashMapL, map);
                    linkedHashMapL.put(Long.valueOf(jA), ozgVarW);
                }
            }
        }
        if (linkedHashMapL != null) {
            mjgVar.getClass();
            mjgVar.j(null, linkedHashMapL);
        }
        mjg mjgVar2 = this.e;
        Map map2 = (Map) mjgVar2.getValue();
        int i3 = u8bVar.b;
        LinkedHashMap linkedHashMapL2 = null;
        for (int i4 = 0; i4 < i3; i4++) {
            ozg ozgVar2 = (ozg) u8bVar.g(i4);
            long jA2 = ozgVar2.b.a();
            ozg ozgVarW2 = w(ozgVar2, (ozg) map2.get(Long.valueOf(jA2)));
            if (map2.containsKey(Long.valueOf(jA2)) && !cqk.d(map2.get(Long.valueOf(jA2)), ozgVarW2)) {
                linkedHashMapL2 = l(linkedHashMapL2, map2);
                linkedHashMapL2.put(Long.valueOf(jA2), ozgVarW2);
            }
        }
        if (linkedHashMapL2 != null) {
            mjgVar2.j(null, linkedHashMapL2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(u8b u8bVar, boolean z, nq4 nq4Var) {
        wrg wrgVar;
        l9b l9bVar;
        if (nq4Var instanceof wrg) {
            wrgVar = (wrg) nq4Var;
            int i = wrgVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                wrgVar.i = i - Integer.MIN_VALUE;
            } else {
                wrgVar = new wrg(this, nq4Var);
            }
        } else {
            wrgVar = new wrg(this, nq4Var);
        }
        Object obj = wrgVar.g;
        int i2 = wrgVar.i;
        if (i2 == 0) {
            ch3.d0(obj);
            wrgVar.d = u8bVar;
            l9bVar = this.l;
            wrgVar.e = l9bVar;
            wrgVar.f = z;
            wrgVar.i = 1;
            Object objB = l9bVar.b(wrgVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = wrgVar.f;
            l9b l9bVar2 = wrgVar.e;
            u8b u8bVar2 = wrgVar.d;
            ch3.d0(obj);
            l9bVar = l9bVar2;
            u8bVar = u8bVar2;
        }
        try {
            k(u8bVar, z);
            t(u8bVar, z);
            return sbi.a;
        } finally {
            l9bVar.g(null);
        }
    }

    public final void k(u8b u8bVar, boolean z) {
        Map map = (Map) this.e.getValue();
        int i = u8bVar.b;
        LinkedHashMap linkedHashMapL = null;
        for (int i2 = 0; i2 < i; i2++) {
            ozg ozgVar = (ozg) u8bVar.g(i2);
            long jA = ozgVar.b.a();
            qrg qrgVar = (qrg) this.k.get(Long.valueOf(jA));
            if (qrgVar != null) {
                this.k.put(Long.valueOf(jA), qrg.a(qrgVar, ozgVar, null, 6));
            } else {
                ozg ozgVarW = w(ozgVar, (ozg) map.get(Long.valueOf(jA)));
                if (!cqk.d(map.get(Long.valueOf(jA)), ozgVarW)) {
                    linkedHashMapL = l(linkedHashMapL, map);
                    if (z) {
                        o(ozgVar.b);
                    }
                    linkedHashMapL.put(Long.valueOf(jA), ozgVarW);
                }
            }
        }
        if (linkedHashMapL != null) {
            mjg mjgVar = this.e;
            mjgVar.getClass();
            mjgVar.j(null, linkedHashMapL);
            return;
        }
        String str = this.c;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "mergePreviews: no changes detected, skip", null);
        }
    }

    public final void m(upc upcVar, boolean z) {
        mjg mjgVar;
        Object value;
        Map mapSingletonMap;
        upc upcVarA = upc.a(upcVar, null, this.b.getAsLong(), z, 3);
        do {
            mjgVar = this.d;
            value = mjgVar.getValue();
            Map map = (Map) value;
            azg azgVarC = upcVar.c();
            if (map.isEmpty()) {
                mapSingletonMap = Collections.singletonMap(azgVarC, upcVarA);
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put(azgVarC, upcVarA);
                mapSingletonMap = linkedHashMap;
            }
        } while (!mjgVar.h(value, mapSingletonMap));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object n(azg azgVar, nq4 nq4Var) {
        xrg xrgVar;
        l9b l9bVar;
        mjg mjgVar = this.g;
        mjg mjgVar2 = this.e;
        if (nq4Var instanceof xrg) {
            xrgVar = (xrg) nq4Var;
            int i = xrgVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                xrgVar.h = i - Integer.MIN_VALUE;
            } else {
                xrgVar = new xrg(this, nq4Var);
            }
        } else {
            xrgVar = new xrg(this, nq4Var);
        }
        Object obj = xrgVar.f;
        int i2 = xrgVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            xrgVar.d = azgVar;
            l9bVar = this.l;
            xrgVar.e = l9bVar;
            xrgVar.h = 1;
            Object objB = l9bVar.b(xrgVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9bVar = xrgVar.e;
            azgVar = xrgVar.d;
            ch3.d0(obj);
        }
        try {
            long jA = azgVar.a();
            Map map = (Map) mjgVar2.getValue();
            if (map.containsKey(new Long(jA))) {
                Map mapR0 = wm9.R0(map, new Long(jA));
                mjgVar2.getClass();
                mjgVar2.j(null, mapR0);
            }
            Map map2 = (Map) mjgVar.getValue();
            if (map2.containsKey(new Long(jA))) {
                Map mapR1 = wm9.R0(map2, new Long(jA));
                mjgVar.getClass();
                mjgVar.j(null, mapR1);
            }
            return sbi.a;
        } finally {
            l9bVar.g(null);
        }
    }

    public final void o(azg azgVar) {
        mjg mjgVar;
        Object value;
        Map mapR0;
        do {
            mjgVar = this.d;
            value = mjgVar.getValue();
            mapR0 = (Map) value;
            if (mapR0.containsKey(azgVar)) {
                mapR0 = wm9.R0(mapR0, azgVar);
            }
        } while (!mjgVar.h(value, mapR0));
    }

    public final void p(long j, azg azgVar) {
        mjg mjgVar;
        Object value;
        Map mapSingletonMap;
        do {
            mjgVar = this.d;
            value = mjgVar.getValue();
            mapSingletonMap = (Map) value;
            upc upcVar = (upc) mapSingletonMap.get(azgVar);
            if (upcVar != null && upcVar.d().containsKey(Long.valueOf(j))) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(upcVar.d().size() - 1);
                for (Map.Entry entry : upcVar.d().entrySet()) {
                    long jLongValue = ((Number) entry.getKey()).longValue();
                    hyg hygVar = (hyg) entry.getValue();
                    if (jLongValue != j) {
                        linkedHashMap.put(Long.valueOf(jLongValue), hygVar);
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    mapSingletonMap = wm9.R0(mapSingletonMap, azgVar);
                } else {
                    upc upcVarA = upc.a(upcVar, linkedHashMap, this.b.getAsLong(), false, 9);
                    if (mapSingletonMap.isEmpty()) {
                        mapSingletonMap = Collections.singletonMap(azgVar, upcVarA);
                    } else {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapSingletonMap);
                        linkedHashMap2.put(azgVar, upcVarA);
                        mapSingletonMap = linkedHashMap2;
                    }
                }
            }
        } while (!mjgVar.h(value, mapSingletonMap));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object q(long j, nq4 nq4Var) {
        yrg yrgVar;
        l9b l9bVar;
        Map mapSingletonMap;
        mjg mjgVar = this.g;
        mjg mjgVar2 = this.e;
        if (nq4Var instanceof yrg) {
            yrgVar = (yrg) nq4Var;
            int i = yrgVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                yrgVar.h = i - Integer.MIN_VALUE;
            } else {
                yrgVar = new yrg(this, nq4Var);
            }
        } else {
            yrgVar = new yrg(this, nq4Var);
        }
        Object obj = yrgVar.f;
        int i2 = yrgVar.h;
        boolean z = true;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = this.l;
            yrgVar.e = l9bVar2;
            yrgVar.d = j;
            yrgVar.h = 1;
            Object objB = l9bVar2.b(yrgVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = yrgVar.d;
            l9bVar = yrgVar.e;
            ch3.d0(obj);
        }
        try {
            qrg qrgVar = (qrg) this.k.remove(new Long(j));
            if (qrgVar == null) {
                z = false;
            } else {
                ozg ozgVarD = qrgVar.d();
                if (ozgVarD != null) {
                    Map map = (Map) mjgVar2.getValue();
                    if (!map.containsKey(new Long(j))) {
                        LinkedHashMap linkedHashMapV = v(map, qrgVar.b(), j, ozgVarD);
                        mjgVar2.getClass();
                        mjgVar2.j(null, linkedHashMapV);
                    }
                }
                ozg ozgVarC = qrgVar.c();
                if (ozgVarC != null) {
                    Map map2 = (Map) mjgVar.getValue();
                    if (!map2.containsKey(new Long(j))) {
                        Long l = new Long(j);
                        if (map2.isEmpty()) {
                            mapSingletonMap = Collections.singletonMap(l, ozgVarC);
                        } else {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                            linkedHashMap.put(l, ozgVarC);
                            mapSingletonMap = linkedHashMap;
                        }
                        mjgVar.getClass();
                        mjgVar.j(null, mapSingletonMap);
                    }
                }
            }
            return Boolean.valueOf(z);
        } finally {
            l9bVar.g(null);
        }
    }

    public final void r(azg azgVar, long j, k1h k1hVar) {
        mjg mjgVar;
        Object value;
        do {
            mjgVar = this.d;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, a((Map) value, azgVar, j, k1hVar)));
    }

    public final void s(azg azgVar, u8b u8bVar) {
        Object[] objArr = u8bVar.a;
        int i = u8bVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            gyg gygVar = (gyg) objArr[i2];
            long j = gygVar.a;
            cmf cmfVar = gygVar.i;
            r(azgVar, j, cmfVar != null ? gvk.i(cmfVar) : null);
        }
    }

    public final void t(u8b u8bVar, boolean z) {
        mjg mjgVar = this.g;
        Map map = (Map) mjgVar.getValue();
        int i = u8bVar.b;
        LinkedHashMap linkedHashMapL = null;
        for (int i2 = 0; i2 < i; i2++) {
            ozg ozgVar = (ozg) u8bVar.g(i2);
            long jA = ozgVar.b.a();
            ozg ozgVarW = w(ozgVar, (ozg) map.get(Long.valueOf(jA)));
            if (map.containsKey(Long.valueOf(jA)) && !cqk.d(map.get(Long.valueOf(jA)), ozgVarW)) {
                if (z) {
                    o(ozgVar.b);
                }
                linkedHashMapL = l(linkedHashMapL, map);
                linkedHashMapL.put(Long.valueOf(jA), ozgVarW);
            }
        }
        if (linkedHashMapL != null) {
            mjgVar.getClass();
            mjgVar.j(null, linkedHashMapL);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(List list, u8b u8bVar, nq4 nq4Var) {
        zrg zrgVar;
        l9b l9bVar;
        if (nq4Var instanceof zrg) {
            zrgVar = (zrg) nq4Var;
            int i = zrgVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrgVar.i = i - Integer.MIN_VALUE;
            } else {
                zrgVar = new zrg(this, nq4Var);
            }
        } else {
            zrgVar = new zrg(this, nq4Var);
        }
        Object obj = zrgVar.g;
        int i2 = zrgVar.i;
        if (i2 == 0) {
            ch3.d0(obj);
            zrgVar.d = list;
            zrgVar.e = u8bVar;
            l9bVar = this.l;
            zrgVar.f = l9bVar;
            zrgVar.i = 1;
            Object objB = l9bVar.b(zrgVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9b l9bVar2 = zrgVar.f;
            u8bVar = zrgVar.e;
            List list2 = zrgVar.d;
            ch3.d0(obj);
            l9bVar = l9bVar2;
            list = list2;
        }
        try {
            i(u8bVar);
            if (u8bVar.b < list.size()) {
                i8b i8bVarD = d(list, u8bVar);
                mjg mjgVar = this.g;
                if (i8bVarD.b != 0) {
                    Map map = (Map) mjgVar.getValue();
                    long[] jArr = i8bVarD.a;
                    int i3 = i8bVarD.b;
                    LinkedHashMap linkedHashMapL = null;
                    for (int i4 = 0; i4 < i3; i4++) {
                        long j = jArr[i4];
                        if (map.containsKey(Long.valueOf(j))) {
                            linkedHashMapL = l(linkedHashMapL, map);
                            linkedHashMapL.remove(Long.valueOf(j));
                        }
                    }
                    if (linkedHashMapL != null) {
                        mjgVar.j(null, linkedHashMapL);
                    }
                }
            }
            return sbi.a;
        } finally {
            l9bVar.g(null);
        }
    }
}
