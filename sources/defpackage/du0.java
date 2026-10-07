package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class du0 extends cr0 {
    public final ny8 e;
    public final ny8 f;
    public final String g;

    public du0(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ed6 ed6Var) {
        super(ny8Var, ny8Var2, ed6Var);
        this.e = ny8Var;
        this.f = ny8Var3;
        this.g = du0.class.getName();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object h(du0 du0Var, String str, Set set, nq4 nq4Var) {
        bu0 bu0Var;
        ArrayList arrayList;
        du0Var.getClass();
        je9 je9Var = je9.f;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof bu0) {
            bu0Var = (bu0) nq4Var;
            int i = bu0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                bu0Var.h = i - Integer.MIN_VALUE;
            } else {
                bu0Var = new bu0(du0Var, nq4Var);
            }
        } else {
            bu0Var = new bu0(du0Var, nq4Var);
        }
        Object obj = bu0Var.f;
        Object obj2 = hu4.a;
        int i2 = bu0Var.h;
        if (i2 == 0) {
            ch3.d0(obj);
            r17 r17Var = (r17) ((sy4) du0Var.e.getValue()).j(str).getValue();
            if (r17Var == null) {
                String str2 = du0Var.g;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, "early return cuz no folder found for ".concat(str), null);
                    return sbiVar;
                }
            } else {
                LinkedHashSet linkedHashSet = r17Var.j;
                arrayList = new ArrayList();
                for (Object obj3 : set) {
                    if (linkedHashSet.contains((Long) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(r17Var.j);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        linkedHashSet2.remove((Long) it.next());
                    }
                    o67 o67VarF = cr0.f(du0Var, r17Var, null, linkedHashSet2, 11);
                    bu0Var.d = str;
                    bu0Var.e = arrayList;
                    bu0Var.h = 1;
                    if (du0Var.g(o67VarF, bu0Var) != obj2) {
                    }
                    return obj2;
                }
                String str3 = du0Var.g;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str3, "early return cuz of empty removableChatIds for ".concat(str), null);
                    return sbiVar;
                }
            }
            return sbiVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ArrayList arrayList2 = bu0Var.e;
        String str4 = bu0Var.d;
        ch3.d0(obj);
        arrayList = arrayList2;
        str = str4;
        if (cqk.d(str, "all.chat.folder")) {
            bu0Var.d = null;
            bu0Var.e = null;
            bu0Var.h = 2;
            if (du0Var.j(arrayList, bu0Var) == obj2) {
                return obj2;
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object i(String str, Set set, nq4 nq4Var) {
        au0 au0Var;
        je9 je9Var = je9.f;
        if (nq4Var instanceof au0) {
            au0Var = (au0) nq4Var;
            int i = au0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                au0Var.f = i - Integer.MIN_VALUE;
            } else {
                au0Var = new au0(this, nq4Var);
            }
        } else {
            au0Var = new au0(this, nq4Var);
        }
        Object obj = au0Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = au0Var.f;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                if (set.isEmpty()) {
                    String str2 = this.g;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str2, "early return cuz of empty chatIds for folder: " + str, null);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        rt2 rt2Var = (rt2) ((xn3) this.f.getValue()).k(((Number) it.next()).longValue()).a.getValue();
                        Long l = rt2Var != null ? new Long(rt2Var.A()) : null;
                        if (l != null) {
                            arrayList.add(l);
                        }
                    }
                    Set setX1 = ww3.X1(arrayList);
                    au0Var.f = 1;
                    if (h(this, str, setX1, au0Var) == hu4Var) {
                        return hu4Var;
                    }
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
            String str3 = this.g;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str3, qv1.k("Fail to unpin chat with multiselect, because ", th.getMessage()), null);
            }
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:45:0x0121  */
    /* JADX WARN: Code duplicated, block: B:48:0x0125  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0125 -> B:14:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object j(java.util.Collection r21, defpackage.nq4 r22) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.du0.j(java.util.Collection, nq4):java.lang.Object");
    }
}
