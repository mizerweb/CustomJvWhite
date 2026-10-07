package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class un6 extends f83 {
    public static final /* synthetic */ int o = 0;
    public final Context c;
    public final zed d;
    public final xhh e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;

    public un6(Context context, zed zedVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, xhh xhhVar) {
        super(ny8Var);
        this.c = context;
        this.d = zedVar;
        this.e = xhhVar;
        this.f = ny8Var2;
        this.g = ny8Var3;
        this.h = ny8Var4;
        this.i = ny8Var5;
        this.j = ny8Var6;
        this.k = ny8Var7;
        this.l = ny8Var8;
        this.m = ny8Var9;
        this.n = ny8Var10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object o(long j, nq4 nq4Var) {
        mn6 mn6Var;
        if (nq4Var instanceof mn6) {
            mn6Var = (mn6) nq4Var;
            int i = mn6Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                mn6Var.g = i - Integer.MIN_VALUE;
            } else {
                mn6Var = new mn6(this, nq4Var);
            }
        } else {
            mn6Var = new mn6(this, nq4Var);
        }
        Object obj = mn6Var.e;
        int i2 = mn6Var.g;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                rob robVar = (rob) this.f.getValue();
                mn6Var.d = j;
                mn6Var.g = 1;
                Object objD = robVar.d(j, mn6Var);
                hu4 hu4Var = hu4.a;
                j = hu4Var;
                if (objD == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j2 = mn6Var.d;
                ch3.d0(obj);
                j = j2;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            kn6 kn6Var = new kn6(zo5.j(j, "failed to delete "), th);
            gm0.V("un6", kn6Var.getMessage(), kn6Var);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(nq4 nq4Var) {
        nn6 nn6Var;
        if (nq4Var instanceof nn6) {
            nn6Var = (nn6) nq4Var;
            int i = nn6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                nn6Var.f = i - Integer.MIN_VALUE;
            } else {
                nn6Var = new nn6(this, nq4Var);
            }
        } else {
            nn6Var = new nn6(this, nq4Var);
        }
        Object obj = nn6Var.d;
        int i2 = nn6Var.f;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                rob robVar = (rob) this.f.getValue();
                nn6Var.f = 1;
                Object objA = robVar.a(nn6Var);
                hu4 hu4Var = hu4.a;
                if (objA == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            kn6 kn6Var = new kn6("failed to delete", th);
            gm0.V("un6", kn6Var.getMessage(), kn6Var);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(xn6 xn6Var, nq4 nq4Var) {
        on6 on6Var;
        rt2 rt2VarK;
        String strC;
        if (nq4Var instanceof on6) {
            on6Var = (on6) nq4Var;
            int i = on6Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                on6Var.g = i - Integer.MIN_VALUE;
            } else {
                on6Var = new on6(this, nq4Var);
            }
        } else {
            on6Var = new on6(this, nq4Var);
        }
        Object objB = on6Var.e;
        int i2 = on6Var.g;
        Bitmap bitmap = null;
        if (i2 == 0) {
            ch3.d0(objB);
            if (xn6Var.b().a != 0 && (rt2VarK = ((qw2) this.i.getValue()).K(xn6Var.b().a)) != null) {
                v4c v4cVarS = s();
                on6Var.d = xn6Var;
                on6Var.g = 1;
                objB = v4cVarS.b(rt2VarK, on6Var);
                hu4 hu4Var = hu4.a;
                if (objB == hu4Var) {
                    return hu4Var;
                }
            }
            if (bitmap == null || (strC = xn6Var.c()) == null || strC.length() == 0) {
                return bitmap;
            }
            return s().a().f(xn6Var.c(), Long.valueOf(xn6Var.b().a));
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        xn6Var = on6Var.d;
        ch3.d0(objB);
        bitmap = (Bitmap) objB;
        if (bitmap == null) {
        }
        return bitmap;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:42:0x0109  */
    /* JADX WARN: Code duplicated, block: B:47:0x0128  */
    /* JADX WARN: Code duplicated, block: B:52:0x013d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0153  */
    /* JADX WARN: Code duplicated, block: B:59:0x0173  */
    /* JADX WARN: Code duplicated, block: B:63:0x0194  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x015b A[SYNTHETIC] */
    public final Object r(m8b m8bVar, nq4 nq4Var) {
        pn6 pn6Var;
        m8b m8bVar2;
        Object objK0;
        List list;
        m8b m8bVar3;
        k8b k8bVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap;
        Object objT;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList3;
        Long l;
        Object arrayList4;
        xn6 xn6Var;
        boolean z;
        boolean z2;
        Map map;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        d83 d83VarA;
        List list2;
        if (nq4Var instanceof pn6) {
            pn6Var = (pn6) nq4Var;
            int i = pn6Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                pn6Var.j = i - Integer.MIN_VALUE;
            } else {
                pn6Var = new pn6(this, nq4Var);
            }
        } else {
            pn6Var = new pn6(this, nq4Var);
        }
        Object obj = pn6Var.h;
        int i2 = pn6Var.j;
        int i3 = 0;
        lq4 lq4Var = null;
        Object obj2 = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            m8bVar2 = m8bVar;
            pn6Var.d = m8bVar2;
            pn6Var.j = 1;
            objK0 = yab.K0(((n0c) this.e).b(), new qn6(this, lq4Var, i3), pn6Var);
            if (objK0 != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            m8b m8bVar4 = pn6Var.d;
            ch3.d0(obj);
            objK0 = obj;
            m8bVar2 = m8bVar4;
        } else {
            if (i2 == 2) {
                list = pn6Var.e;
                m8bVar3 = pn6Var.d;
                ch3.d0(obj);
                k8bVar = (k8b) obj;
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    xn6Var = (xn6) obj3;
                    if (k8bVar.d(xn6Var.b().a, Long.MIN_VALUE) < xn6Var.n()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!m8bVar3.i() || m8bVar3.d(xn6Var.b().a)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z && z2) {
                        arrayList.add(new apb(xn6Var.b(), xn6Var.h(), xn6Var.n(), qv5.NOTIFICATIONS_READ_MARK));
                    }
                    if (z) {
                        arrayList2.add(obj3);
                    }
                }
                linkedHashMap = new LinkedHashMap();
                for (Object obj4 : arrayList) {
                    l = new Long(((apb) obj4).a.a);
                    arrayList4 = linkedHashMap.get(l);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        linkedHashMap.put(l, arrayList4);
                    }
                    ((List) arrayList4).add(obj4);
                }
                pn6Var.d = null;
                pn6Var.e = null;
                pn6Var.f = arrayList2;
                pn6Var.g = linkedHashMap;
                pn6Var.j = 3;
                objT = t(arrayList2, m8bVar3, pn6Var);
                if (objT != obj2) {
                    obj = objT;
                    linkedHashMap2 = linkedHashMap;
                    arrayList3 = arrayList2;
                }
                return obj2;
            }
            if (i2 != 3) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashMap2 = pn6Var.g;
            arrayList3 = pn6Var.f;
            List list3 = pn6Var.e;
            ch3.d0(obj);
        }
        map = (Map) obj;
        linkedHashMap3 = new LinkedHashMap(wm9.P0(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            long jLongValue = ((Number) entry.getKey()).longValue();
            d83VarA = (d83) entry.getValue();
            list2 = (List) linkedHashMap2.get(new Long(jLongValue));
            if (list2 == null) {
                d83VarA = d83.a(d83VarA, null, null, ww3.G1(list2, d83VarA.g), null, false, 65471);
            }
            linkedHashMap3.put(key, d83VarA);
        }
        linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!map.containsKey(new Long(((Number) entry2.getKey()).longValue()))) {
                linkedHashMap4.put(entry2.getKey(), entry2.getValue());
            }
        }
        return new g83(arrayList3.size(), yw3.X0(linkedHashMap4.values()), linkedHashMap3);
        list = (List) objK0;
        List list4 = list;
        ArrayList arrayList5 = new ArrayList(yw3.W0(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            c0a.t(((xn6) it.next()).b().a, arrayList5);
        }
        List listF0 = rx8.f0(rx8.j0(arrayList5));
        pn6Var.d = m8bVar2;
        pn6Var.e = list;
        pn6Var.j = 2;
        Object objV = v(listF0, pn6Var);
        if (objV != obj2) {
            m8bVar3 = m8bVar2;
            obj = objV;
            k8bVar = (k8b) obj;
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            while (r3.hasNext()) {
                xn6Var = (xn6) obj3;
                if (k8bVar.d(xn6Var.b().a, Long.MIN_VALUE) < xn6Var.n()) {
                    z = true;
                } else {
                    z = false;
                }
                if (m8bVar3.i()) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (!z) {
                    arrayList.add(new apb(xn6Var.b(), xn6Var.h(), xn6Var.n(), qv5.NOTIFICATIONS_READ_MARK));
                }
                if (z) {
                    arrayList2.add(obj3);
                }
            }
            linkedHashMap = new LinkedHashMap();
            while (r3.hasNext()) {
                l = new Long(((apb) obj4).a.a);
                arrayList4 = linkedHashMap.get(l);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap.put(l, arrayList4);
                }
                ((List) arrayList4).add(obj4);
            }
            pn6Var.d = null;
            pn6Var.e = null;
            pn6Var.f = arrayList2;
            pn6Var.g = linkedHashMap;
            pn6Var.j = 3;
            objT = t(arrayList2, m8bVar3, pn6Var);
            if (objT != obj2) {
                obj = objT;
                linkedHashMap2 = linkedHashMap;
                arrayList3 = arrayList2;
                map = (Map) obj;
                linkedHashMap3 = new LinkedHashMap(wm9.P0(map.size()));
                while (r4.hasNext()) {
                    Object key2 = entry.getKey();
                    long jLongValue2 = ((Number) entry.getKey()).longValue();
                    d83VarA = (d83) entry.getValue();
                    list2 = (List) linkedHashMap2.get(new Long(jLongValue2));
                    if (list2 == null) {
                        d83VarA = d83.a(d83VarA, null, null, ww3.G1(list2, d83VarA.g), null, false, 65471);
                    }
                    linkedHashMap3.put(key2, d83VarA);
                }
                linkedHashMap4 = new LinkedHashMap();
                while (r0.hasNext()) {
                    if (!map.containsKey(new Long(((Number) entry2.getKey()).longValue()))) {
                        linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                    }
                }
                return new g83(arrayList3.size(), yw3.X0(linkedHashMap4.values()), linkedHashMap3);
            }
        }
        return obj2;
    }

    public final v4c s() {
        return (v4c) this.k.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:103:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:107:0x057a  */
    /* JADX WARN: Code duplicated, block: B:110:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:117:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:290:0x0412 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:70:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:72:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:76:0x0406  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0426  */
    /* JADX WARN: Code duplicated, block: B:82:0x0441  */
    /* JADX WARN: Code duplicated, block: B:84:0x044b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0452  */
    /* JADX WARN: Code duplicated, block: B:88:0x045e  */
    /* JADX WARN: Code duplicated, block: B:89:0x046f  */
    /* JADX WARN: Code duplicated, block: B:91:0x048f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0499  */
    /* JADX WARN: Code duplicated, block: B:96:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:99:0x04cb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:277:0x0b1c -> B:278:0x0b24). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:279:0x0b2f -> B:37:0x031a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:284:0x0b4f -> B:278:0x0b24). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable t(java.util.ArrayList r74, defpackage.m8b r75, defpackage.nq4 r76) {
        /*
            Method dump skipped, instruction units count: 2920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.un6.t(java.util.ArrayList, m8b, nq4):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(Set set, nq4 nq4Var) {
        sn6 sn6Var;
        if (nq4Var instanceof sn6) {
            sn6Var = (sn6) nq4Var;
            int i = sn6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                sn6Var.f = i - Integer.MIN_VALUE;
            } else {
                sn6Var = new sn6(this, nq4Var);
            }
        } else {
            sn6Var = new sn6(this, nq4Var);
        }
        Object obj = sn6Var.d;
        int i2 = sn6Var.f;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            zn6 zn6Var = (zn6) this.g.getValue();
            List listT1 = ww3.T1(set);
            sn6Var.f = 1;
            Object objA = zn6Var.a(listT1, sn6Var);
            hu4 hu4Var = hu4.a;
            return objA == hu4Var ? hu4Var : objA;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            kn6 kn6Var = new kn6("failed to get notifications history items", th);
            gm0.V("un6", kn6Var.getMessage(), kn6Var);
            return r66.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(List list, nq4 nq4Var) {
        tn6 tn6Var;
        if (nq4Var instanceof tn6) {
            tn6Var = (tn6) nq4Var;
            int i = tn6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                tn6Var.f = i - Integer.MIN_VALUE;
            } else {
                tn6Var = new tn6(this, nq4Var);
            }
        } else {
            tn6Var = new tn6(this, nq4Var);
        }
        Object objA = tn6Var.d;
        int i2 = tn6Var.f;
        try {
            if (i2 == 0) {
                ch3.d0(objA);
                tnb tnbVar = (tnb) this.h.getValue();
                tn6Var.f = 1;
                objA = tnbVar.a(list, tn6Var);
                hu4 hu4Var = hu4.a;
                if (objA == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objA);
            }
            List<xmb> list2 = (List) objA;
            k8b k8bVar = new k8b(list2.size());
            for (xmb xmbVar : list2) {
                k8bVar.g(xmbVar.a().a, xmbVar.b());
            }
            return k8bVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            kn6 kn6Var = new kn6("getSystemReadMarks: failed", th);
            gm0.V("un6", kn6Var.getMessage(), kn6Var);
            return gi9.a;
        }
    }

    public final Object w(xn6 xn6Var, rn6 rn6Var) {
        if (ln6.$EnumSwitchMapping$0[xn6Var.e().ordinal()] != 1) {
            return xn6Var.j() != 0 ? x(xn6Var, rn6Var) : q(xn6Var, rn6Var);
        }
        if (xn6Var.j() != 0) {
            return x(xn6Var, rn6Var);
        }
        return null;
    }

    public final Object x(xn6 xn6Var, rn6 rn6Var) {
        vg4 vg4VarF = ((bi4) this.j.getValue()).f(xn6Var.j(), false);
        if (vg4VarF != null) {
            return s().c(vg4VarF, rn6Var);
        }
        v4c v4cVarS = s();
        String strK = xn6Var.k();
        if (strK == null) {
            strK = "";
        }
        return v4cVarS.a().f(strK, Long.valueOf(xn6Var.j()));
    }
}
