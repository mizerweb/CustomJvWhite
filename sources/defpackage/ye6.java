package defpackage;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ye6 {
    public String a = ye6.class.getName();

    /* JADX WARN: Code duplicated, block: B:102:0x021b  */
    /* JADX WARN: Code duplicated, block: B:112:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x017c A[EDGE_INSN: B:121:0x017c->B:85:0x017c BREAK  A[LOOP:4: B:78:0x015b->B:83:0x0178], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x010a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0119  */
    /* JADX WARN: Code duplicated, block: B:70:0x0131  */
    /* JADX WARN: Code duplicated, block: B:73:0x013b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0161  */
    /* JADX WARN: Code duplicated, block: B:83:0x0178 A[LOOP:4: B:78:0x015b->B:83:0x0178, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x017e  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f7  */
    public String a(InputStream inputStream) {
        Object poeVar;
        Throwable thA;
        boolean z;
        Object obj;
        List list;
        List list2;
        String strU1;
        List list3;
        Iterator it;
        Object next;
        String str;
        Iterator it2;
        Object next2;
        String str2;
        List listW0;
        c79 c79VarW;
        c79 c79VarJ;
        String string;
        String string2;
        Iterator it3;
        Object next3;
        String str3;
        Iterator it4;
        int i;
        c79 c79VarW2;
        String string3;
        String str4;
        a4c a4cVar;
        je9 je9Var;
        Collection collectionJ = r66.a;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, pt2.a), 8192);
            try {
                ArrayList arrayList = new ArrayList();
                int length = 0;
                for (String str5 : new nf4(new tw(1, bufferedReader))) {
                    length += str5.length() + 1;
                    if (length > 524288) {
                        break;
                    }
                    arrayList.add(str5);
                    poeVar = new poe(th);
                    thA = roe.a(poeVar);
                    if (thA != null) {
                        str4 = this.a;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str4, "extract: failed to read trace stream", thA);
                            }
                        }
                    }
                    z = poeVar instanceof poe;
                    obj = poeVar;
                    if (z) {
                        obj = null;
                    }
                    list = (List) obj;
                    list2 = list;
                    if (list2 != null && !list2.isEmpty()) {
                        list3 = list;
                        it = list3.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!z5h.K0(r5h.z1((String) next).toString(), "signal ", false));
                        str = (String) next;
                        it2 = list3.iterator();
                        do {
                            if (it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                        } while (!z5h.K0(r5h.z1((String) next2).toString(), "Abort message", false));
                        str2 = (String) next2;
                        listW0 = yhf.w0(yhf.u0(yhf.m0(new m2i(new sw(1, list3), new us5(7)), new us5(8)), 8));
                        if (str != null && str2 == null && listW0.isEmpty()) {
                            c79VarJ = null;
                        } else {
                            c79VarW = yab.w();
                            if (str != null && (string2 = r5h.y1(str).toString()) != null) {
                                c79VarW.add(string2);
                            }
                            if (str2 != null && (string = r5h.y1(str2).toString()) != null) {
                                c79VarW.add(string);
                            }
                            c79VarW.addAll(listW0);
                            c79VarJ = yab.j(c79VarW);
                        }
                        if (c79VarJ == null) {
                            it3 = list3.iterator();
                            do {
                                if (it3.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                next3 = it3.next();
                            } while (!z5h.K0(r5h.z1((String) next3).toString(), "Cmd line", false));
                            str3 = (String) next3;
                            it4 = list.iterator();
                            i = 0;
                            while (true) {
                                if (it4.hasNext()) {
                                    i = -1;
                                    break;
                                }
                                if (z5h.K0(r5h.z1((String) it4.next()).toString(), "\"main\"", false)) {
                                    break;
                                }
                                i++;
                            }
                            if (i >= 0) {
                                collectionJ = yhf.w0(yhf.u0(yhf.m0(new m2i(yhf.l0(new sw(1, list), i + 1), new us5(9)), new us5(10)), 8));
                            }
                            if (str3 == null || i >= 0) {
                                c79VarW2 = yab.w();
                                if (str3 != null && (string3 = r5h.y1(str3).toString()) != null) {
                                    c79VarW2.add(string3);
                                }
                                c79VarW2.addAll(collectionJ);
                                collectionJ = yab.j(c79VarW2);
                            } else {
                                collectionJ = null;
                            }
                            if (collectionJ == null) {
                                collectionJ = yhf.w0(yhf.u0(yhf.m0(new m2i(new sw(1, list), new us5(11)), new us5(12)), 8));
                            }
                        } else {
                            collectionJ = c79VarJ;
                        }
                    }
                    strU1 = r5h.u1(1500, r5h.y1(ww3.z1(collectionJ, "\n", null, null, null, 62)).toString());
                    if (strU1.length() == 0) {
                        return null;
                    }
                    return strU1;
                }
                bufferedReader.close();
                poeVar = arrayList;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            poeVar = new poe(th3);
        }
        thA = roe.a(poeVar);
        if (thA != null) {
            str4 = this.a;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str4, "extract: failed to read trace stream", thA);
                }
            }
        }
        z = poeVar instanceof poe;
        obj = poeVar;
        if (z) {
            obj = null;
        }
        list = (List) obj;
        list2 = list;
        if (list2 != null) {
            list3 = list;
            it = list3.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!z5h.K0(r5h.z1((String) next).toString(), "signal ", false));
            str = (String) next;
            it2 = list3.iterator();
            do {
                if (it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!z5h.K0(r5h.z1((String) next2).toString(), "Abort message", false));
            str2 = (String) next2;
            listW0 = yhf.w0(yhf.u0(yhf.m0(new m2i(new sw(1, list3), new us5(7)), new us5(8)), 8));
            if (str != null) {
                c79VarW = yab.w();
                if (str != null) {
                    c79VarW.add(string2);
                }
                if (str2 != null) {
                    c79VarW.add(string);
                }
                c79VarW.addAll(listW0);
                c79VarJ = yab.j(c79VarW);
            } else {
                c79VarW = yab.w();
                if (str != null) {
                    c79VarW.add(string2);
                }
                if (str2 != null) {
                    c79VarW.add(string);
                }
                c79VarW.addAll(listW0);
                c79VarJ = yab.j(c79VarW);
            }
            if (c79VarJ == null) {
                it3 = list3.iterator();
                do {
                    if (it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (!z5h.K0(r5h.z1((String) next3).toString(), "Cmd line", false));
                str3 = (String) next3;
                it4 = list.iterator();
                i = 0;
                while (true) {
                    if (it4.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (z5h.K0(r5h.z1((String) it4.next()).toString(), "\"main\"", false)) {
                        break;
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    collectionJ = yhf.w0(yhf.u0(yhf.m0(new m2i(yhf.l0(new sw(1, list), i + 1), new us5(9)), new us5(10)), 8));
                }
                if (str3 == null) {
                    c79VarW2 = yab.w();
                    if (str3 != null) {
                        c79VarW2.add(string3);
                    }
                    c79VarW2.addAll(collectionJ);
                    collectionJ = yab.j(c79VarW2);
                } else {
                    c79VarW2 = yab.w();
                    if (str3 != null) {
                        c79VarW2.add(string3);
                    }
                    c79VarW2.addAll(collectionJ);
                    collectionJ = yab.j(c79VarW2);
                }
                if (collectionJ == null) {
                    collectionJ = yhf.w0(yhf.u0(yhf.m0(new m2i(new sw(1, list), new us5(11)), new us5(12)), 8));
                }
            } else {
                collectionJ = c79VarJ;
            }
        }
        strU1 = r5h.u1(1500, r5h.y1(ww3.z1(collectionJ, "\n", null, null, null, 62)).toString());
        if (strU1.length() == 0) {
            return null;
        }
        return strU1;
    }
}
