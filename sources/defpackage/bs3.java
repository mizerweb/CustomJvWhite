package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class bs3 {
    public final ny8 a;
    public final ny8 b;
    public final String c = bs3.class.getName();

    public bs3(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0132  */
    /* JADX WARN: Code duplicated, block: B:35:0x013a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(q24 q24Var, final long j, final long j2, List list, nq4 nq4Var) {
        zr3 zr3Var;
        q24 q24Var2;
        long j3;
        long j4;
        List list2;
        long j5;
        long j6;
        String str;
        a4c a4cVar;
        je9 je9Var;
        if (nq4Var instanceof zr3) {
            zr3Var = (zr3) nq4Var;
            int i = zr3Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                zr3Var.j = i - Integer.MIN_VALUE;
            } else {
                zr3Var = new zr3(this, nq4Var);
            }
        } else {
            zr3Var = new zr3(this, nq4Var);
        }
        Object objI = zr3Var.h;
        hu4 hu4Var = hu4.a;
        int i2 = zr3Var.j;
        if (i2 != 0) {
            if (i2 == 1) {
                j4 = zr3Var.g;
                j3 = zr3Var.f;
                q24Var2 = zr3Var.d;
                ch3.d0(objI);
            } else {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j5 = zr3Var.g;
                j6 = zr3Var.f;
                list2 = zr3Var.e;
                ch3.d0(objI);
            }
            str = this.c;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    StringBuilder sbS = qt4.s(j6, "clean up outdated comments in range [", ",");
                    sbS.append(j5);
                    sbS.append("]: ");
                    sbS.append(list2);
                    a4cVar.c(je9Var, str, sbS.toString(), null);
                }
            }
            return list2;
        }
        ch3.d0(objI);
        final ArrayList arrayList = new ArrayList(list.size());
        arrayList.add(-1L);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((gda) it.next()).a));
        }
        final g24 g24Var = (g24) this.a.getValue();
        final long j7 = q24Var.a;
        final long j8 = q24Var.b;
        final List listP0 = xw3.P0(xfa.SENDING, xfa.ERROR);
        zr3Var.d = q24Var;
        zr3Var.f = j;
        zr3Var.g = j2;
        zr3Var.j = 1;
        final wja wjaVar = wja.DELETED;
        g24Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id FROM comments WHERE parent_chat_server_id = ? AND parent_message_server_id = ? AND time >= ? AND time <= ? AND server_id <> 0 AND inserted_from_msg_link = 0  AND server_id NOT IN (");
        final int size = arrayList.size();
        vd7.b(sb, size);
        sb.append(") AND delivery_status NOT IN (");
        final int size2 = listP0.size();
        vd7.b(sb, size2);
        sb.append(") AND status != ");
        sb.append("?");
        final String string = sb.toString();
        objI = ch3.I(zr3Var, g24Var.a, true, false, new cf7() { // from class: n14
            @Override // defpackage.cf7
            public final Object invoke(Object obj) throws Exception {
                g24 g24Var2;
                long j9 = j7;
                long j10 = j8;
                long j11 = j;
                long j12 = j2;
                ArrayList arrayList2 = arrayList;
                int i3 = size;
                List list3 = listP0;
                int i4 = size2;
                wja wjaVar2 = wjaVar;
                vxe vxeVarO0 = ((qxe) obj).O0(string);
                try {
                    vxeVarO0.c(1, j9);
                    vxeVarO0.c(2, j10);
                    vxeVarO0.c(3, j11);
                    vxeVarO0.c(4, j12);
                    Iterator it2 = arrayList2.iterator();
                    int i5 = 5;
                    while (it2.hasNext()) {
                        vxeVarO0.c(i5, ((Number) it2.next()).longValue());
                        i5++;
                    }
                    int i6 = i3 + 5;
                    Iterator it3 = list3.iterator();
                    int i7 = i6;
                    while (true) {
                        boolean zHasNext = it3.hasNext();
                        g24Var2 = g24Var;
                        if (!zHasNext) {
                            break;
                        }
                        xfa xfaVar = (xfa) it3.next();
                        g24Var2.a().getClass();
                        vxeVarO0.c(i7, xfaVar.a);
                        i7++;
                    }
                    g24Var2.a().getClass();
                    vxeVarO0.c(i6 + i4, wjaVar2.a);
                    ArrayList arrayList3 = new ArrayList();
                    while (vxeVarO0.M0()) {
                        arrayList3.add(Long.valueOf(vxeVarO0.getLong(0)));
                    }
                    return arrayList3;
                } finally {
                    vxeVarO0.close();
                }
            }
        });
        if (objI != hu4Var) {
            q24Var2 = q24Var;
            j3 = j;
            j4 = j2;
        }
        return hu4Var;
        List list3 = (List) objI;
        if (list3.isEmpty()) {
            return list3;
        }
        g24 g24Var2 = (g24) this.a.getValue();
        long j9 = q24Var2.a;
        long j10 = q24Var2.b;
        zr3Var.d = null;
        zr3Var.e = list3;
        zr3Var.f = j3;
        zr3Var.g = j4;
        zr3Var.j = 2;
        if (g24Var2.b(j9, j10, list3, zr3Var) != hu4Var) {
            list2 = list3;
            j5 = j4;
            j6 = j3;
            str = this.c;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    StringBuilder sbS2 = qt4.s(j6, "clean up outdated comments in range [", ",");
                    sbS2.append(j5);
                    sbS2.append("]: ");
                    sbS2.append(list2);
                    a4cVar.c(je9Var, str, sbS2.toString(), null);
                }
            }
            return list2;
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(q24 q24Var, long j, int i, long j2, int i2, long j3, List list, nq4 nq4Var) {
        as3 as3Var;
        long j4;
        if (nq4Var instanceof as3) {
            as3Var = (as3) nq4Var;
            int i3 = as3Var.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                as3Var.g = i3 - Integer.MIN_VALUE;
            } else {
                as3Var = new as3(this, nq4Var);
            }
        } else {
            as3Var = new as3(this, nq4Var);
        }
        Object objA = as3Var.e;
        int i4 = as3Var.g;
        if (i4 == 0) {
            ch3.d0(objA);
            List list2 = list;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (((gda) obj).b >= j) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (((gda) obj2).b <= j) {
                    arrayList2.add(obj2);
                }
            }
            if (i2 <= 0 && j3 <= 0) {
                j4 = j;
            } else if (i2 <= 0 || j3 > 0) {
                if (i2 > 0 && arrayList2.size() >= i2) {
                    gda gdaVar = (gda) ww3.t1(arrayList2);
                    if (gdaVar != null) {
                        j4 = gdaVar.b;
                    } else {
                        j4 = j;
                    }
                } else {
                    j4 = j3;
                }
            } else if (arrayList2.size() < i2) {
                j4 = 0;
            } else {
                gda gdaVar2 = (gda) ww3.t1(arrayList2);
                if (gdaVar2 != null) {
                    j4 = gdaVar2.b;
                } else {
                    j4 = j;
                }
            }
            if (i > 0 || j2 > 0) {
                if (i <= 0 || j2 > 0) {
                    if (i > 0 && arrayList.size() >= i) {
                        gda gdaVar3 = (gda) ww3.D1(arrayList);
                        if (gdaVar3 != null) {
                            j = gdaVar3.b;
                        }
                    } else {
                        j = j2;
                    }
                } else if (arrayList.size() < i) {
                    j = BuildConfig.MAX_TIME_TO_UPLOAD;
                } else {
                    gda gdaVar4 = (gda) ww3.D1(arrayList);
                    if (gdaVar4 != null) {
                        j = gdaVar4.b;
                    }
                }
            }
            as3Var.d = q24Var;
            as3Var.g = 1;
            objA = a(q24Var, j4, j, list, as3Var);
            Object obj3 = hu4.a;
            if (objA == obj3) {
                return obj3;
            }
        } else {
            if (i4 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q24Var = as3Var.d;
            ch3.d0(objA);
        }
        List list3 = (List) objA;
        if (!list3.isEmpty()) {
            ((p24) this.b.getValue()).a(new xy3(q24Var, list3));
        }
        return list3;
    }
}
