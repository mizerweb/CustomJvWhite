package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z0m {
    /* JADX WARN: Code duplicated, block: B:45:0x00d4  */
    public static final void a(ed7 ed7Var, String str, cf7 cf7Var) {
        ylc ylcVar;
        Object poeVar;
        if (str == null || r5h.X0(str)) {
            str = null;
        }
        if (str == null) {
            return;
        }
        List listM1 = r5h.m1(str, new String[]{","}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM1) {
            if (!r5h.X0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) cf7Var.invoke((String) it.next());
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        ArrayList<ylc> arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            List listM2 = r5h.m1((String) it2.next(), new String[]{"-"}, 6);
            if (listM2.size() != 2) {
                listM2 = null;
            }
            if (listM2 != null) {
                String str3 = (String) listM2.get(0);
                String str4 = (String) listM2.get(1);
                if (r5h.X0(str3) || r5h.X0(str4)) {
                    listM2 = null;
                }
                if (listM2 != null) {
                    try {
                        poeVar = new ylc(Long.valueOf(Long.parseLong((String) listM2.get(0))), Long.valueOf(Long.parseLong((String) listM2.get(1))));
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                    if (poeVar instanceof poe) {
                        poeVar = null;
                    }
                    ylcVar = (ylc) poeVar;
                } else {
                    ylcVar = null;
                }
            } else {
                ylcVar = null;
            }
            if (ylcVar != null) {
                arrayList3.add(ylcVar);
            }
        }
        for (ylc ylcVar2 : arrayList3) {
            long jLongValue = ((Number) ylcVar2.a).longValue();
            long jLongValue2 = (((Number) ylcVar2.b).longValue() - jLongValue) + 1;
            sq3 sq3Var = new sq3(jLongValue, jLongValue2);
            sq3Var.b(jLongValue2);
            sq3Var.a();
            ed7Var.s(((ArrayList) ed7Var.d).size(), sq3Var);
        }
    }

    public static boolean b(kj6 kj6Var, boolean z) {
        int i;
        nmc nmcVar = new nmc(16);
        boolean z2 = true;
        while (true) {
            nmcVar.K(8);
            if (!kj6Var.m(nmcVar.a, 0, 8, true)) {
                break;
            }
            long jC = nmcVar.C();
            int iM = nmcVar.m();
            if (jC != 1) {
                i = 8;
            } else {
                if (!kj6Var.m(nmcVar.a, 8, 8, true)) {
                    break;
                }
                jC = nmcVar.G();
                i = 16;
            }
            long j = i;
            if (jC < j) {
                break;
            }
            int i2 = (int) (jC - j);
            if (z2) {
                if (iM != 1718909296 || i2 < 8) {
                    break;
                }
                nmcVar.K(4);
                kj6Var.u(0, nmcVar.a, 4);
                if (nmcVar.m() != 1751476579) {
                    break;
                }
                if (!z) {
                    return true;
                }
                kj6Var.z(i2 - 4);
                z2 = false;
            } else {
                if (iM == 1836086884) {
                    return true;
                }
                if (i2 != 0) {
                    kj6Var.z(i2);
                }
            }
        }
        return false;
    }
}
