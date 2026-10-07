package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gvk {
    public static final b40 a(boolean z) {
        b40 b40Var = new b40();
        b40Var.a = z ? 1 : 0;
        return b40Var;
    }

    public static final g40 b(int i) {
        g40 g40Var = new g40();
        g40Var.a = i;
        return g40Var;
    }

    public static final i40 c(Object obj) {
        i40 i40Var = new i40();
        i40Var.a = obj;
        return i40Var;
    }

    public static final cmf d(k1h k1hVar) {
        boolean z = false;
        int i = 3;
        if (k1hVar instanceof i1h) {
            return new cmf(l1h.EMOJI, ((i1h) k1hVar).a, z, i);
        }
        if (k1hVar instanceof j1h) {
            return new cmf(l1h.STICKER, String.valueOf(((j1h) k1hVar).a), z, i);
        }
        ore.o();
        return null;
    }

    public static final upc e(tpc tpcVar) {
        azg azgVarG0 = yab.G0(tpcVar.a);
        u8b u8bVar = tpcVar.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(u8bVar.b);
        ArrayList arrayList = new ArrayList(u8bVar.b);
        Object[] objArr = u8bVar.a;
        int i = u8bVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            hyg hygVarF = f((gyg) objArr[i2]);
            if (hygVarF != null) {
                arrayList.add(hygVarF);
            }
        }
        for (hyg hygVar : Collections.unmodifiableList(arrayList)) {
            linkedHashMap.put(Long.valueOf(hygVar.a), hygVar);
        }
        return new upc(azgVarG0, linkedHashMap);
    }

    public static final hyg f(gyg gygVar) {
        Object[] objArr;
        Object qygVar;
        je9 je9Var = je9.f;
        if (gygVar.g == null) {
            String name = gyg.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "Media in StoryItem cannot be null", null);
            }
            return null;
        }
        long j = gygVar.a;
        azg azgVarG0 = yab.G0(gygVar.c);
        int i = gygVar.d;
        long j2 = gygVar.e;
        int i2 = gygVar.f;
        l40 l40Var = gygVar.g;
        long j3 = gygVar.h;
        cmf cmfVar = gygVar.i;
        k1h k1hVarI = cmfVar != null ? i(cmfVar) : null;
        u8b u8bVar = gygVar.k;
        u8b u8bVar2 = new u8b(u8bVar.b);
        Object[] objArr2 = u8bVar.a;
        int i3 = u8bVar.b;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i3;
            jyg jygVar = (jyg) objArr2[i4];
            int i6 = i4;
            int iOrdinal = jygVar.a.ordinal();
            if (iOrdinal != 0) {
                objArr = objArr2;
                if (iOrdinal != 1) {
                    ore.o();
                    return null;
                }
                ys3 ys3Var = jygVar.c;
                if (ys3Var == null) {
                    String name2 = jyg.class.getName();
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, name2, "Link layer has to have clickableLink", null);
                    }
                    qygVar = null;
                } else {
                    j = j;
                    cy8 cy8Var = jygVar.b;
                    qygVar = new pyg(new dy8(cy8Var.a, cy8Var.b, cy8Var.c, cy8Var.d, cy8Var.e), ys3Var.a, ys3Var.b);
                }
            } else {
                je9Var = je9Var;
                objArr = objArr2;
                j = j;
                ys3 ys3Var2 = jygVar.c;
                if (ys3Var2 == null) {
                    qygVar = null;
                } else {
                    cy8 cy8Var2 = jygVar.b;
                    qygVar = new qyg(new dy8(cy8Var2.a, cy8Var2.b, cy8Var2.c, cy8Var2.d, cy8Var2.e), ys3Var2.a, ys3Var2.b);
                }
            }
            if (qygVar != null) {
                u8bVar2.b(qygVar);
            }
            i4 = i6 + 1;
            i3 = i5;
            objArr2 = objArr;
            j = j;
            je9Var = je9Var;
        }
        return new hyg(j, azgVarG0, i, j2, i2, l40Var, j3, k1hVarI, u8bVar2, null, 0, gygVar.j, 1536);
    }

    public static final ozg g(ysg ysgVar, vg4 vg4Var) {
        return new ozg(vg4Var, yab.G0(ysgVar.a), ysgVar.c, ysgVar.d, ysgVar.e, 2);
    }

    public static final ozg h(ysg ysgVar, Map map) {
        vg4 vg4Var = (vg4) map.get(Long.valueOf(ysgVar.a.a));
        if (vg4Var != null) {
            return g(ysgVar, vg4Var);
        }
        String name = ysg.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, nbh.s(ysgVar.a.a, "We couldn't find contact(id#", ")"), null);
            }
        }
        return null;
    }

    public static final k1h i(cmf cmfVar) {
        String str = (String) cmfVar.c;
        int iOrdinal = ((l1h) cmfVar.b).ordinal();
        if (iOrdinal == 0) {
            return new i1h(str);
        }
        if (iOrdinal != 1) {
            ore.o();
            return null;
        }
        Long lC0 = y5h.C0(str);
        if (lC0 != null) {
            return new j1h(lC0.longValue());
        }
        return null;
    }
}
