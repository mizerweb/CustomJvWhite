package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class vib {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public vib(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:59:0x01da  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x0213  */
    /* JADX WARN: Code duplicated, block: B:76:0x023a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x026c  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x022f A[EDGE_INSN: B:91:0x022f->B:73:0x022f BREAK  A[LOOP:1: B:67:0x020b->B:93:0x020b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x020b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.ArrayList, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public final Object a(tib tibVar, nq4 nq4Var) {
        uib uibVar;
        hu4 hu4Var;
        Map map;
        Iterator it;
        fe8 ee8Var;
        fe8 ce8Var;
        Map map2;
        ArrayList arrayList;
        Object objI;
        Map map3;
        ArrayList arrayList2;
        Iterator it2;
        ArrayList arrayList3;
        Iterator it3;
        boolean zHasNext;
        ny8 ny8Var;
        m8b m8bVarJ0;
        xm xmVar;
        ?? r6;
        Object next;
        Long l;
        Object objEmit;
        if (nq4Var instanceof uib) {
            uibVar = (uib) nq4Var;
            int i = uibVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                uibVar.h = i - Integer.MIN_VALUE;
            } else {
                uibVar = new uib(this, nq4Var);
            }
        } else {
            uibVar = new uib(this, nq4Var);
        }
        Object obj = uibVar.f;
        int i2 = uibVar.h;
        ny8 ny8Var2 = this.a;
        hu4 hu4Var2 = hu4.a;
        sbi sbiVar = sbi.a;
        if (i2 == 0) {
            ch3.d0(obj);
            ny8 ny8Var3 = this.c;
            et3 et3Var = (et3) ny8Var3.getValue();
            long j = tibVar.e;
            xb9 xb9Var = (xb9) et3Var;
            gvb gvbVar = xb9Var.O0;
            zv8[] zv8VarArr = xb9.g1;
            gvbVar.B(xb9Var, zv8VarArr[32], Long.valueOf(j));
            xb9 xb9Var2 = (xb9) ((et3) ny8Var3.getValue());
            xb9Var2.K0.B(xb9Var2, zv8VarArr[28], new ew5(tibVar.c));
            List list = tibVar.d;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                ud8 ud8Var = (ud8) it4.next();
                String str = ud8Var.a;
                String str2 = ud8Var.b;
                int i3 = ud8Var.c;
                String str3 = ud8Var.d;
                String str4 = ud8Var.e;
                byte b = ud8Var.f;
                byte b2 = ud8Var.g;
                hu4 hu4Var3 = hu4Var2;
                long jG = ew5.g(ud8Var.h);
                Long l2 = ud8Var.i;
                String str5 = ud8Var.j;
                byte b3 = ud8Var.k;
                if (b3 == 0) {
                    it = it4;
                    ce8Var = new de8((byte) 0);
                } else {
                    it = it4;
                    if (b3 == 1) {
                        ce8Var = new be8((byte) 1);
                    } else {
                        if (b3 == 2) {
                            ce8Var = new ce8((byte) 2);
                        } else {
                            ee8Var = new ee8(b3);
                        }
                        ge8 ge8Var = new ge8(str, str2, i3, str3, b, b2, jG, l2, str5, ee8Var, str4);
                        linkedHashMap.put(ge8Var.a, ge8Var);
                        it4 = it;
                        hu4Var2 = hu4Var3;
                    }
                }
                ee8Var = ce8Var;
                ge8 ge8Var2 = new ge8(str, str2, i3, str3, b, b2, jG, l2, str5, ee8Var, str4);
                linkedHashMap.put(ge8Var2.a, ge8Var2);
                it4 = it;
                hu4Var2 = hu4Var3;
            }
            wd8 wd8Var = (wd8) ny8Var2.getValue();
            uibVar.d = linkedHashMap;
            uibVar.h = 1;
            Object objI2 = ch3.I(uibVar, wd8Var.a, true, false, new ik4(8));
            hu4Var = hu4Var2;
            if (objI2 != hu4Var) {
                obj = objI2;
                map = linkedHashMap;
            }
        }
        if (i2 == 1) {
            map = uibVar.d;
            ch3.d0(obj);
            hu4Var = hu4Var2;
        } else {
            if (i2 == 2) {
                arrayList = uibVar.e;
                Map map4 = uibVar.d;
                ch3.d0(obj);
                map2 = map4;
                hu4Var = hu4Var2;
                wd8 wd8Var2 = (wd8) ny8Var2.getValue();
                uibVar.d = map2;
                uibVar.e = null;
                uibVar.h = 3;
                objI = ch3.I(uibVar, wd8Var2.a, false, true, new w14(wd8Var2, 22, arrayList));
                if (objI != hu4Var) {
                    objI = sbiVar;
                }
                if (objI != hu4Var) {
                    map3 = map2;
                    arrayList2 = new ArrayList();
                    it2 = map3.entrySet().iterator();
                    while (it2.hasNext()) {
                        l = ((ge8) ((Map.Entry) it2.next()).getValue()).h;
                        if (l != null) {
                            arrayList2.add(l);
                        }
                    }
                    arrayList3 = new ArrayList();
                    it3 = arrayList2.iterator();
                    while (true) {
                        zHasNext = it3.hasNext();
                        ny8Var = this.b;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        next = it3.next();
                        if (((xm) ny8Var.getValue()).h(((Number) next).longValue()) == null) {
                            arrayList3.add(next);
                        }
                    }
                    m8bVarJ0 = rx8.j0(arrayList3);
                    if (!m8bVarJ0.i()) {
                        xmVar = (xm) ny8Var.getValue();
                        r6 = 0;
                        uibVar.d = null;
                        uibVar.e = null;
                        uibVar.h = 4;
                        if (xmVar.e(m8bVarJ0, uibVar) != hu4Var) {
                        }
                    }
                }
            }
            if (i2 == 3) {
                map3 = uibVar.d;
                ch3.d0(obj);
                hu4Var = hu4Var2;
                arrayList2 = new ArrayList();
                it2 = map3.entrySet().iterator();
                while (it2.hasNext()) {
                    l = ((ge8) ((Map.Entry) it2.next()).getValue()).h;
                    if (l != null) {
                        arrayList2.add(l);
                    }
                }
                arrayList3 = new ArrayList();
                it3 = arrayList2.iterator();
                while (true) {
                    zHasNext = it3.hasNext();
                    ny8Var = this.b;
                    if (!zHasNext) {
                        break;
                    }
                    next = it3.next();
                    if (((xm) ny8Var.getValue()).h(((Number) next).longValue()) == null) {
                        arrayList3.add(next);
                    }
                }
                m8bVarJ0 = rx8.j0(arrayList3);
                if (!m8bVarJ0.i()) {
                    xmVar = (xm) ny8Var.getValue();
                    r6 = 0;
                    uibVar.d = null;
                    uibVar.e = null;
                    uibVar.h = 4;
                    if (xmVar.e(m8bVarJ0, uibVar) != hu4Var) {
                    }
                }
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            hu4Var = hu4Var2;
            r6 = 0;
        }
        sib sibVar = (sib) this.d.getValue();
        rib ribVar = new rib();
        uibVar.d = r6;
        uibVar.e = r6;
        uibVar.h = 5;
        objEmit = sibVar.a.emit(ribVar, uibVar);
        if (objEmit != hu4Var) {
            objEmit = sbiVar;
        }
        return objEmit == hu4Var ? hu4Var : sbiVar;
        List<ge8> list2 = (List) obj;
        ArrayList arrayList4 = new ArrayList(list2.size());
        ArrayList arrayList5 = new ArrayList(list2.size());
        for (ge8 ge8Var3 : list2) {
            ge8 ge8Var4 = (ge8) map.remove(ge8Var3.a);
            if (ge8Var4 == null) {
                arrayList4.add(ge8Var3.a);
            } else {
                arrayList5.add(ge8.a(ge8Var4, ge8Var3.k, ge8Var3.l, ge8Var3.m, ge8Var3.n, 17407));
            }
        }
        arrayList5.addAll(map.values());
        wd8 wd8Var3 = (wd8) ny8Var2.getValue();
        uibVar.d = map;
        uibVar.e = arrayList5;
        uibVar.h = 2;
        if (wd8Var3.b(arrayList4, uibVar) != hu4Var) {
            map2 = map;
            arrayList = arrayList5;
            wd8 wd8Var4 = (wd8) ny8Var2.getValue();
            uibVar.d = map2;
            uibVar.e = null;
            uibVar.h = 3;
            objI = ch3.I(uibVar, wd8Var4.a, false, true, new w14(wd8Var4, 22, arrayList));
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            if (objI != hu4Var) {
                map3 = map2;
                arrayList2 = new ArrayList();
                it2 = map3.entrySet().iterator();
                while (it2.hasNext()) {
                    l = ((ge8) ((Map.Entry) it2.next()).getValue()).h;
                    if (l != null) {
                        arrayList2.add(l);
                    }
                }
                arrayList3 = new ArrayList();
                it3 = arrayList2.iterator();
                while (true) {
                    zHasNext = it3.hasNext();
                    ny8Var = this.b;
                    if (!zHasNext) {
                        break;
                        break;
                    }
                    next = it3.next();
                    if (((xm) ny8Var.getValue()).h(((Number) next).longValue()) == null) {
                        arrayList3.add(next);
                    }
                }
                m8bVarJ0 = rx8.j0(arrayList3);
                if (!m8bVarJ0.i()) {
                    xmVar = (xm) ny8Var.getValue();
                    r6 = 0;
                    uibVar.d = null;
                    uibVar.e = null;
                    uibVar.h = 4;
                    if (xmVar.e(m8bVarJ0, uibVar) != hu4Var) {
                        sib sibVar2 = (sib) this.d.getValue();
                        rib ribVar2 = new rib();
                        uibVar.d = r6;
                        uibVar.e = r6;
                        uibVar.h = 5;
                        objEmit = sibVar2.a.emit(ribVar2, uibVar);
                        if (objEmit != hu4Var) {
                            objEmit = sbiVar;
                        }
                        if (objEmit == hu4Var) {
                        }
                    }
                }
            }
        }
    }
}
