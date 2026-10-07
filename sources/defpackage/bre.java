package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bre {
    public final rre a;
    public final pl b = new pl(14);
    public final pl c = new pl(15);

    public bre(rre rreVar) {
        this.a = rreVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(bre breVar, List list, nq4 nq4Var) {
        sqe sqeVar;
        Iterator it;
        int i;
        int i2;
        if (nq4Var instanceof sqe) {
            sqeVar = (sqe) nq4Var;
            int i3 = sqeVar.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sqeVar.j = i3 - Integer.MIN_VALUE;
            } else {
                sqeVar = new sqe(breVar, nq4Var);
            }
        } else {
            sqeVar = new sqe(breVar, nq4Var);
        }
        Object obj = sqeVar.h;
        int i4 = sqeVar.j;
        int i5 = 0;
        if (i4 == 0) {
            ch3.d0(obj);
            it = list.iterator();
            i = 0;
            i2 = 0;
        } else {
            if (i4 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = sqeVar.g;
            i = sqeVar.f;
            it = sqeVar.e;
            bre breVar2 = sqeVar.d;
            ch3.d0(obj);
            i2 = i6;
            breVar = breVar2;
        }
        while (true) {
            boolean zHasNext = it.hasNext();
            Object obj2 = sbi.a;
            if (!zHasNext) {
                return obj2;
            }
            Object next = it.next();
            int i7 = i2 + 1;
            if (i2 < 0) {
                xw3.V0();
                throw null;
            }
            sqeVar.d = breVar;
            sqeVar.e = it;
            sqeVar.f = i;
            sqeVar.g = i7;
            sqeVar.j = 1;
            Object objI = ch3.I(sqeVar, breVar.a, false, true, new yqe(i2, (String) next, i5));
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                obj2 = objI;
            }
            if (obj2 == hu4Var) {
                return hu4Var;
            }
            i2 = i7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(bre breVar, nq4 nq4Var) {
        tqe tqeVar;
        if (nq4Var instanceof tqe) {
            tqeVar = (tqe) nq4Var;
            int i = tqeVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                tqeVar.g = i - Integer.MIN_VALUE;
            } else {
                tqeVar = new tqe(breVar, nq4Var);
            }
        } else {
            tqeVar = new tqe(breVar, nq4Var);
        }
        Object obj = tqeVar.e;
        int i2 = tqeVar.g;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            tqeVar.d = breVar;
            tqeVar.g = 1;
            Object objI = ch3.I(tqeVar, breVar.a, false, true, new skd(21));
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            if (objI != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        breVar = tqeVar.d;
        ch3.d0(obj);
        tqeVar.d = null;
        tqeVar.g = 2;
        Object objI2 = ch3.I(tqeVar, breVar.a, false, true, new skd(22));
        if (objI2 != hu4Var) {
            objI2 = sbiVar;
        }
        return objI2 == hu4Var ? hu4Var : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object d(bre breVar, List list, nq4 nq4Var) {
        uqe uqeVar;
        if (nq4Var instanceof uqe) {
            uqeVar = (uqe) nq4Var;
            int i = uqeVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                uqeVar.h = i - Integer.MIN_VALUE;
            } else {
                uqeVar = new uqe(breVar, nq4Var);
            }
        } else {
            uqeVar = new uqe(breVar, nq4Var);
        }
        Object obj = uqeVar.f;
        int i2 = uqeVar.h;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            uqeVar.d = breVar;
            uqeVar.e = list;
            uqeVar.h = 1;
            Object objI = ch3.I(uqeVar, breVar.a, false, true, new tj1(7, nbh.x(")", nbh.C("DELETE FROM chat_folder WHERE id IN ("), list), list));
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            if (objI != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list2 = uqeVar.e;
            ch3.d0(obj);
            return sbiVar;
        }
        list = uqeVar.e;
        breVar = uqeVar.d;
        ch3.d0(obj);
        uqeVar.d = null;
        uqeVar.e = null;
        uqeVar.h = 2;
        return breVar.c(list, uqeVar) == hu4Var ? hu4Var : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0140 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [bre, java.util.ArrayList, rqe] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static Object e(bre breVar, rqe rqeVar, m8b m8bVar, boolean z, nq4 nq4Var) {
        vqe vqeVar;
        ArrayList arrayList;
        long[] jArr;
        long[] jArr2;
        bre breVar2;
        boolean z2;
        ?? r3;
        bre breVar3 = breVar;
        rqe rqeVar2 = rqeVar;
        boolean z3 = z;
        if (nq4Var instanceof vqe) {
            vqeVar = (vqe) nq4Var;
            int i = vqeVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                vqeVar.j = i - Integer.MIN_VALUE;
            } else {
                vqeVar = new vqe(breVar3, nq4Var);
            }
        } else {
            vqeVar = new vqe(breVar3, nq4Var);
        }
        Object obj = vqeVar.h;
        int i2 = vqeVar.j;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z4 = vqeVar.g;
                ArrayList arrayList2 = vqeVar.f;
                rqe rqeVar3 = vqeVar.e;
                bre breVar4 = vqeVar.d;
                ch3.d0(obj);
                z3 = z4;
                breVar3 = breVar4;
                arrayList = arrayList2;
                rqeVar2 = rqeVar3;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = vqeVar.g;
                rqeVar2 = vqeVar.e;
                breVar2 = vqeVar.d;
                ch3.d0(obj);
                r3 = 0;
            }
            vqeVar.d = r3;
            vqeVar.e = r3;
            vqeVar.f = r3;
            vqeVar.g = z2;
            vqeVar.j = 3;
            if (ch3.I(vqeVar, breVar2.a, false, true, new bad(breVar2, 4, rqeVar2)) != hu4Var) {
                return hu4Var;
            }
            return sbiVar;
        }
        ch3.d0(obj);
        arrayList = new ArrayList(m8bVar.d);
        long[] jArr3 = m8bVar.b;
        long[] jArr4 = m8bVar.a;
        int length = jArr4.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr4[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            arrayList.add(new iu2(jArr3[(i3 << 3) + i6], rqeVar2.a));
                        }
                        j >>= i4;
                        i6++;
                        i4 = i4;
                        jArr4 = jArr4;
                        jArr3 = jArr3;
                    }
                    jArr = jArr4;
                    jArr2 = jArr3;
                    if (i5 != i4) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    jArr2 = jArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                jArr4 = jArr;
                jArr3 = jArr2;
            }
        }
        if (z3) {
            String str = rqeVar2.a;
            vqeVar.d = breVar3;
            vqeVar.e = rqeVar2;
            vqeVar.f = arrayList;
            vqeVar.g = z3;
            vqeVar.j = 1;
            Object objI = ch3.I(vqeVar, breVar3.a, false, true, new qo1(str, 13));
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            if (objI != hu4Var) {
            }
        }
        return hu4Var;
        vqeVar.d = breVar3;
        vqeVar.e = rqeVar2;
        vqeVar.f = null;
        vqeVar.g = z3;
        vqeVar.j = 2;
        Object objI2 = ch3.I(vqeVar, breVar3.a, false, true, new xqe(breVar3, arrayList, 1));
        if (objI2 != hu4Var) {
            objI2 = sbiVar;
        }
        if (objI2 != hu4Var) {
            breVar2 = breVar3;
            z2 = z3;
            r3 = 0;
            vqeVar.d = r3;
            vqeVar.e = r3;
            vqeVar.f = r3;
            vqeVar.g = z2;
            vqeVar.j = 3;
            if (ch3.I(vqeVar, breVar2.a, false, true, new bad(breVar2, 4, rqeVar2)) != hu4Var) {
                return sbiVar;
            }
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec A[LOOP:2: B:32:0x00ba->B:43:0x00ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:89:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:92:0x0202 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b0, code lost:
    
        if (r34.c(r2, r3) == r6) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object f(defpackage.bre r34, java.util.Map r35, boolean r36, defpackage.nq4 r37) {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bre.f(bre, java.util.Map, boolean, nq4):java.lang.Object");
    }

    public final Object c(List list, nq4 nq4Var) {
        Object objI = ch3.I(nq4Var, this.a, false, true, new yn6(3, nbh.x(")", nbh.C("DELETE FROM folder_and_chats WHERE folderId IN ("), list), list));
        return objI == hu4.a ? objI : sbi.a;
    }
}
