package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes.dex */
public final class uy2 {
    public final String a = uy2.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public uy2(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
    }

    public final ohf a(ohf ohfVar, ni3 ni3Var) {
        if (ni3Var instanceof li3) {
            return ohfVar;
        }
        if (!(ni3Var instanceof mi3)) {
            ore.o();
            return null;
        }
        mi3 mi3Var = (mi3) ni3Var;
        final Set set = mi3Var.e;
        final Set set2 = mi3Var.f;
        final Set set3 = mi3Var.g;
        final Set set4 = mi3Var.h;
        final Map map = mi3Var.i;
        return yhf.m0(ohfVar, new cf7() { // from class: ry2
            /* JADX WARN: Code duplicated, block: B:12:0x0039  */
            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                boolean z;
                rt2 rt2Var = (rt2) obj;
                boolean zContains = set.contains(Long.valueOf(rt2Var.A()));
                uy2 uy2Var = this.a;
                Map map2 = map;
                if (zContains || uy2Var.g(set2, map2, rt2Var)) {
                    if (set3.contains(Long.valueOf(rt2Var.A())) || uy2Var.g(set4, map2, rt2Var)) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final ohf b(sw swVar, ni3 ni3Var) {
        r17 r17Var = (r17) ((sy4) this.e.getValue()).j(ni3Var.b()).getValue();
        LinkedHashSet linkedHashSet = r17Var != null ? r17Var.j : null;
        if (linkedHashSet == null || linkedHashSet.isEmpty()) {
            return swVar;
        }
        if ((ni3Var instanceof li3) || (ni3Var instanceof mi3)) {
            return yhf.n0(swVar, new qy2(linkedHashSet, 0));
        }
        ore.o();
        return null;
    }

    public final List c(ni3 ni3Var) {
        return yhf.w0(a(new sw(1, ((qw2) this.c.getValue()).J(null)), ni3Var));
    }

    public final List d(Comparator comparator) {
        List listP = ((qw2) this.c.getValue()).P(comparator);
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(listP.size(), "Folders. getChats, chats count from controller: "), null);
            }
        }
        return listP;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0138 A[LOOP:0: B:51:0x0132->B:53:0x0138, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0187  */
    /* JADX WARN: Code duplicated, block: B:65:0x0196  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x0200  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:83:0x0210 A[LOOP:2: B:81:0x020a->B:83:0x0210, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x0233  */
    /* JADX WARN: Code duplicated, block: B:91:0x024f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0190 A[SYNTHETIC] */
    public final Object e(ni3 ni3Var, nq4 nq4Var) {
        ty2 ty2Var;
        ni3 ni3Var2;
        LinkedHashSet linkedHashSet;
        zc6 zc6Var;
        ArrayList arrayList;
        LinkedHashSet linkedHashSet2;
        ni3 ni3Var3;
        ArrayList arrayList2;
        int iP0;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList3;
        Iterator it;
        rt2 rt2Var;
        ArrayList arrayList4;
        Iterator it2;
        String str;
        a4c a4cVar;
        ArrayList arrayList5;
        String str2;
        sy2 sy2Var;
        a4c a4cVar2;
        je9 je9Var = je9.f;
        if (nq4Var instanceof ty2) {
            ty2Var = (ty2) nq4Var;
            int i = ty2Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                ty2Var.i = i - Integer.MIN_VALUE;
            } else {
                ty2Var = new ty2(this, nq4Var);
            }
        } else {
            ty2Var = new ty2(this, nq4Var);
        }
        Object objN = ty2Var.g;
        hu4 hu4Var = hu4.a;
        int i2 = ty2Var.i;
        if (i2 == 0) {
            ch3.d0(objN);
            sy4 sy4Var = (sy4) this.e.getValue();
            String strB = ni3Var.b();
            ty2Var.d = ni3Var;
            ty2Var.i = 1;
            sy4Var.getClass();
            objN = e9i.N(new jz(sy4Var.j(strB), 13), ty2Var);
            if (objN != hu4Var) {
                ni3Var2 = ni3Var;
            }
            return hu4Var;
        }
        if (i2 == 1) {
            ni3Var2 = ty2Var.d;
            ch3.d0(objN);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList2 = ty2Var.f;
            linkedHashSet2 = ty2Var.e;
            ni3Var3 = ty2Var.d;
            ch3.d0(objN);
        }
        Iterable iterable = (Iterable) objN;
        arrayList4 = new ArrayList(yw3.W0(iterable, 10));
        it2 = iterable.iterator();
        while (it2.hasNext()) {
            c0a.t(((rt2) it2.next()).A(), arrayList4);
        }
        str = this.a;
        a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            String strB2 = ni3Var3.b();
            int size = linkedHashSet2.size();
            int size2 = arrayList4.size();
            StringBuilder sbR = c0a.r(size, "Folders. getFavouritesChats \n                    |folderId:", strB2, ", \n                    |fav ids count:", ", \n                    |by serverIds count:");
            sbR.append(size2);
            sbR.append("\n                    |");
            a4cVar.c(je9Var, str, s5h.y0(sbR.toString()), null);
        }
        if (linkedHashSet2.size() > arrayList4.size()) {
            arrayList5 = new ArrayList();
            for (Object obj : linkedHashSet2) {
                if (!arrayList4.contains(new Long(((Number) obj).longValue()))) {
                    arrayList5.add(obj);
                }
            }
            int size3 = linkedHashSet2.size();
            int size4 = arrayList4.size();
            String strZ1 = ww3.z1(arrayList5, null, null, null, null, 63);
            StringBuilder sbP = qv1.p("Favorites count wrong. fav c:", size3, ", from repo:", size4, ", missed:");
            sbP.append(strZ1);
            String string = sbP.toString();
            str2 = this.a;
            sy2Var = new sy2(string);
            a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "Folders. getFavouritesChats, missed chats in controller", sy2Var);
            }
        }
        arrayList = arrayList2;
        linkedHashSet = linkedHashSet2;
        if (!linkedHashSet.isEmpty()) {
            return arrayList;
        }
        iP0 = wm9.P0(yw3.W0(arrayList, 10));
        if (iP0 < 16) {
            iP0 = 16;
        }
        linkedHashMap = new LinkedHashMap(iP0);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(new Long(((rt2) obj2).A()), obj2);
        }
        arrayList3 = new ArrayList();
        it = linkedHashSet.iterator();
        while (it.hasNext()) {
            rt2Var = (rt2) linkedHashMap.get(new Long(((Number) it.next()).longValue()));
            if (rt2Var != null) {
                arrayList3.add(rt2Var);
            }
        }
        return arrayList3;
        linkedHashSet = ((r17) objN).j;
        boolean z = ni3Var2 instanceof li3;
        if (z) {
            zc6Var = ((li3) ni3Var2).e;
        } else {
            if (!(ni3Var2 instanceof mi3)) {
                ore.o();
                return null;
            }
            zc6Var = ((mi3) ni3Var2).j;
        }
        if (!z && !(ni3Var2 instanceof mi3)) {
            ore.o();
            return null;
        }
        List listD = d(zc6Var);
        arrayList = new ArrayList();
        for (Object obj3 : listD) {
            if (linkedHashSet.contains(new Long(((rt2) obj3).A()))) {
                arrayList.add(obj3);
            }
        }
        String str3 = this.a;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null) {
            je9 je9Var2 = je9.d;
            if (a4cVar3.b(je9Var2)) {
                String strB3 = ni3Var2.b();
                int size5 = arrayList.size();
                int size6 = linkedHashSet.size();
                StringBuilder sbR2 = c0a.r(size5, "Folders. getFavouritesChats \n                |folderId:", strB3, ", \n                |fav chats count after filter:", ", \n                |fav ids count:");
                sbR2.append(size6);
                sbR2.append("\n                |");
                a4cVar3.c(je9Var2, str3, s5h.y0(sbR2.toString()), null);
            }
        }
        if (linkedHashSet.size() > arrayList.size()) {
            xn3 xn3Var = (xn3) this.d.getValue();
            ty2Var.d = ni3Var2;
            ty2Var.e = linkedHashSet;
            ty2Var.f = arrayList;
            ty2Var.i = 2;
            Object objN2 = xn3Var.n(linkedHashSet, ty2Var);
            if (objN2 != hu4Var) {
                ni3 ni3Var4 = ni3Var2;
                linkedHashSet2 = linkedHashSet;
                objN = objN2;
                ni3Var3 = ni3Var4;
                arrayList2 = arrayList;
                Iterable iterable2 = (Iterable) objN;
                arrayList4 = new ArrayList(yw3.W0(iterable2, 10));
                it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    c0a.t(((rt2) it2.next()).A(), arrayList4);
                }
                str = this.a;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    String strB4 = ni3Var3.b();
                    int size7 = linkedHashSet2.size();
                    int size8 = arrayList4.size();
                    StringBuilder sbR3 = c0a.r(size7, "Folders. getFavouritesChats \n                    |folderId:", strB4, ", \n                    |fav ids count:", ", \n                    |by serverIds count:");
                    sbR3.append(size8);
                    sbR3.append("\n                    |");
                    a4cVar.c(je9Var, str, s5h.y0(sbR3.toString()), null);
                }
                if (linkedHashSet2.size() > arrayList4.size()) {
                    arrayList5 = new ArrayList();
                    while (r1.hasNext()) {
                        if (!arrayList4.contains(new Long(((Number) obj).longValue()))) {
                            arrayList5.add(obj);
                        }
                    }
                    int size9 = linkedHashSet2.size();
                    int size10 = arrayList4.size();
                    String strZ2 = ww3.z1(arrayList5, null, null, null, null, 63);
                    StringBuilder sbP2 = qv1.p("Favorites count wrong. fav c:", size9, ", from repo:", size10, ", missed:");
                    sbP2.append(strZ2);
                    String string2 = sbP2.toString();
                    str2 = this.a;
                    sy2Var = new sy2(string2);
                    a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        a4cVar2.c(je9Var, str2, "Folders. getFavouritesChats, missed chats in controller", sy2Var);
                    }
                }
                arrayList = arrayList2;
                linkedHashSet = linkedHashSet2;
            }
            return hu4Var;
        }
        if (!linkedHashSet.isEmpty()) {
            return arrayList;
        }
        iP0 = wm9.P0(yw3.W0(arrayList, 10));
        if (iP0 < 16) {
            iP0 = 16;
        }
        linkedHashMap = new LinkedHashMap(iP0);
        while (r0.hasNext()) {
            linkedHashMap.put(new Long(((rt2) obj2).A()), obj2);
        }
        arrayList3 = new ArrayList();
        it = linkedHashSet.iterator();
        while (it.hasNext()) {
            rt2Var = (rt2) linkedHashMap.get(new Long(((Number) it.next()).longValue()));
            if (rt2Var != null) {
                arrayList3.add(rt2Var);
            }
        }
        return arrayList3;
    }

    public final List f(ni3 ni3Var, long j, int i) {
        int i2;
        List listW0 = yhf.w0(a(b(new sw(1, d(ni3Var.a())), ni3Var), ni3Var));
        Iterator it = listW0.iterator();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = -1;
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            if (j >= ((rt2) it.next()).B()) {
                break;
            }
            i4++;
        }
        if (i4 == -1) {
            String str = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.h(listW0.size(), "Can't find first index, count:"), null);
                }
            }
            return r66.a;
        }
        if (i4 == 0) {
            Iterator it2 = listW0.iterator();
            while (it2.hasNext()) {
                if (((rt2) it2.next()).B() > j) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            if (i2 > 0) {
                String strK = qt4.k(((rt2) listW0.get(i2)).B(), ", chatTime:", zo5.x(i2, j, "Incorrect chats order, index:", ", time:"));
                gm0.X(this.a, new IssueKeyException(4, "chats", strK, null), strK, new Object[0]);
            }
        }
        int iMin = Math.min(i != Integer.MAX_VALUE ? i + i4 + 1 : Integer.MAX_VALUE, listW0.size());
        List listSubList = listW0.subList(i4, iMin);
        String str2 = this.a;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            je9 je9Var2 = je9.d;
            if (a4cVar2.b(je9Var2)) {
                int size = listW0.size();
                int size2 = listSubList.size();
                StringBuilder sbP = qv1.p("Folders. getFromSortTime \n                |indexSort:", i4, ", \n                |trim index:", iMin, ", \n                |chats before trim:");
                sbP.append(size);
                sbP.append(", \n                |chats after trim:");
                sbP.append(size2);
                sbP.append("\n                |");
                a4cVar2.c(je9Var2, str2, s5h.y0(sbP.toString()), null);
            }
        }
        return listSubList;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x01c3 A[EDGE_INSN: B:147:0x01c3->B:192:0x025d BREAK  A[LOOP:4: B:134:0x018f->B:230:?]] */
    /* JADX WARN: Code duplicated, block: B:148:0x01c6 A[EDGE_INSN: B:148:0x01c6->B:192:0x025d BREAK  A[LOOP:4: B:134:0x018f->B:230:?]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5 A[EDGE_INSN: B:63:0x00b5->B:76:0x00e4 BREAK  A[LOOP:1: B:71:0x00cc->B:221:?]] */
    public final boolean g(Set set, Map map, rt2 rt2Var) {
        boolean z;
        vg4 vg4VarW;
        vg4 vg4VarW2;
        if (set.isEmpty()) {
            return false;
        }
        boolean zE0 = set.contains(i37.CONTACT) && rt2Var.h0() && (vg4VarW2 = rt2Var.w()) != null && vg4VarW2.h() && !rt2Var.b0();
        if (!zE0) {
            zE0 = set.contains(i37.NOT_CONTACT) && rt2Var.h0() && (vg4VarW = rt2Var.w()) != null && vg4VarW.a.b.k == ji4.b && !rt2Var.b0();
        }
        if (!zE0) {
            zE0 = set.contains(i37.BOT) && rt2Var.b0();
        }
        if (zE0) {
            z = false;
        } else {
            zE0 = set.contains(i37.CHANNEL) && rt2Var.d0();
            z = zE0;
        }
        if (!zE0) {
            if (set.contains(i37.CHAT)) {
                if (!set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (i37.c.contains((i37) it.next())) {
                                if (!set.contains(i37.CHAT)) {
                                    zE0 = false;
                                    break;
                                }
                                zE0 = false;
                                break;
                            }
                        }
                    }
                }
                if (!rt2Var.e0() && !rt2Var.n0()) {
                    zE0 = false;
                    break;
                }
                zE0 = true;
            } else {
                if (!set.contains(i37.CHAT) || set.isEmpty()) {
                    zE0 = false;
                    break;
                }
                Iterator it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        zE0 = false;
                        break;
                    }
                    if (i37.c.contains((i37) it2.next())) {
                        zE0 = rt2Var.e0();
                        break;
                    }
                }
            }
            z = z || zE0;
        }
        if (!zE0) {
            zE0 = set.contains(i37.DIALOG) && rt2Var.h0();
        }
        if (set.isEmpty()) {
            zE0 = true;
            break;
        }
        Iterator it3 = set.iterator();
        do {
            if (!it3.hasNext()) {
                zE0 = true;
                break;
            }
        } while (!i37.d.contains((i37) it3.next()));
        if (!set.isEmpty()) {
            Iterator it4 = set.iterator();
            while (it4.hasNext()) {
                if (i37.c.contains((i37) it4.next())) {
                    if (!z) {
                        break;
                    }
                    i37 i37Var = i37.ADMIN;
                    if (!(set.contains(i37Var) && set.contains(i37.OWNER)) ? !set.contains(i37.OWNER) ? set.contains(i37Var) && rt2Var.z0() && zE0 : rt2Var.B0() && zE0 : !((rt2Var.z0() || rt2Var.B0()) && zE0)) {
                        zE0 = true;
                        break;
                    }
                    zE0 = false;
                    break;
                }
            }
        }
        if (!set.isEmpty()) {
            Iterator it5 = set.iterator();
            while (it5.hasNext()) {
                if (i37.b.contains((i37) it5.next())) {
                    i37 i37Var2 = i37.MUTED;
                    if (!set.contains(i37Var2) || !set.contains(i37.NOT_MUTED) || !set.contains(i37.UNREAD)) {
                        boolean zContains = set.contains(i37Var2);
                        ny8 ny8Var = this.b;
                        if (!zContains || !set.contains(i37.UNREAD)) {
                            i37 i37Var3 = i37.NOT_MUTED;
                            if (!set.contains(i37Var3) || !set.contains(i37.UNREAD)) {
                                if (!set.contains(i37Var2) || !set.contains(i37Var3)) {
                                    if (!set.contains(i37Var3)) {
                                        if (!set.contains(i37Var2)) {
                                            if (!set.contains(i37.UNREAD)) {
                                                break;
                                            }
                                            if (rt2Var.b.m > 0 && zE0) {
                                                zE0 = true;
                                                break;
                                            }
                                            zE0 = false;
                                            break;
                                        }
                                        if (!rt2Var.s0((et3) ny8Var.getValue()) || !zE0) {
                                            zE0 = false;
                                            break;
                                        }
                                        zE0 = true;
                                        break;
                                    }
                                    if (!rt2Var.s0((et3) ny8Var.getValue()) && zE0) {
                                        zE0 = true;
                                        break;
                                    }
                                    zE0 = false;
                                    break;
                                }
                                break;
                            }
                            if (rt2Var.b.m > 0 && !rt2Var.s0((et3) ny8Var.getValue()) && zE0) {
                                zE0 = true;
                                break;
                            }
                            zE0 = false;
                            break;
                        }
                        if (rt2Var.b.m <= 0 || !rt2Var.s0((et3) ny8Var.getValue()) || !zE0) {
                            zE0 = false;
                            break;
                        }
                        zE0 = true;
                        break;
                    }
                    if (rt2Var.b.m > 0 && zE0) {
                        zE0 = true;
                        break;
                    }
                    zE0 = false;
                    break;
                }
            }
        }
        if (set.contains(i37.MARKED_UNREAD)) {
            zE0 = zE0 && rt2Var.b.i0;
        }
        dx2 dx2Var = rt2Var.b.D;
        if (!zE0 && dx2Var != null) {
            i37 i37Var4 = i37.ORG;
            Object obj = map.get(i37Var4);
            long[] jArr = obj instanceof long[] ? (long[]) obj : null;
            if (jArr != null && set.contains(i37Var4)) {
                for (long j : dx2Var.a()) {
                    if (a.M0(j, jArr)) {
                        return true;
                    }
                }
            }
        }
        return zE0;
    }

    public final Boolean h(long j, String str) {
        je9 je9Var = je9.f;
        rt2 rt2Var = (rt2) ((xn3) this.d.getValue()).k(j).a.getValue();
        if (rt2Var == null) {
            String str2 = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, zo5.j(j, "Not found chat with id="), null);
            }
            return Boolean.FALSE;
        }
        r17 r17Var = (r17) ((sy4) this.e.getValue()).j(str).getValue();
        if (r17Var != null) {
            return Boolean.valueOf(r17Var.a() || r17Var.e.contains(new Long(rt2Var.A())) || g(r17Var.d, r17Var.g, rt2Var));
        }
        String str3 = this.a;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str3, "Not found folder with id=".concat(str), null);
        }
        return Boolean.FALSE;
    }
}
