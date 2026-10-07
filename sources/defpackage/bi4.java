package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import one.me.sdk.contacts.ContactBlockedOrDeletedStoreException;
import one.me.sdk.contacts.ContactStoreException;
import one.me.sdk.contacts.NullContactException;
import ru.ok.tamtam.contacts.BrokenContactException;

/* JADX INFO: loaded from: classes.dex */
public final class bi4 {
    public static final EnumSet l;
    public static final Set m;
    public static final pw n;
    public static final Set o;
    public static final Set p;
    public final dp5 e;
    public final t51 f;
    public final zed g;
    public final dp5 h;
    public final pwh i;
    public final dp5 j;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final Object c = new Object();
    public volatile boolean d = false;
    public no4 k = null;

    static {
        ji4 ji4Var = ji4.b;
        ji4 ji4Var2 = ji4.a;
        l = EnumSet.of(ji4Var, ji4Var2);
        m = Collections.singleton(ji4Var2);
        ii4 ii4Var = ii4.b;
        ii4 ii4Var2 = ii4.a;
        n = lvb.J(null, ii4Var, ii4Var2);
        o = Collections.singleton(ii4Var2);
        p = Collections.singleton(ii4Var);
    }

    public bi4(dp5 dp5Var, t51 t51Var, zed zedVar, dp5 dp5Var2, pwh pwhVar, dp5 dp5Var3) {
        this.e = dp5Var;
        this.f = t51Var;
        this.g = zedVar;
        this.h = dp5Var2;
        this.i = pwhVar;
        this.j = dp5Var3;
    }

    public static void l(vg4 vg4Var) {
        StringBuilder sb = new StringBuilder("putContact: id=");
        sb.append(vg4Var.v());
        sb.append(";status=");
        li4 li4Var = vg4Var.a;
        sb.append(li4Var.b.i);
        sb.append(";account_status=");
        sb.append(qv1.y(li4Var.b.j));
        sb.append(";names=");
        List listQ = vg4Var.q();
        for (int i = 0; i < listQ.size(); i++) {
            sb.append(((fi4) listQ.get(i)).c);
            sb.append(',');
        }
        String string = sb.toString();
        gm0.V("ContactController", string, new BrokenContactException(string));
    }

    public final void a() {
        if (this.d) {
            return;
        }
        synchronized (this.c) {
            try {
                if (!this.d) {
                    j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final vg4 b(long j, Consumer consumer) {
        a();
        vg4 vg4VarF = f(j, false);
        if (vg4VarF == null) {
            gm0.V("ContactController", "changeContactField error: contact is null", new NullContactException());
            return null;
        }
        li4 li4Var = vg4VarF.a;
        di4 di4VarB = li4Var.b.b();
        try {
            consumer.accept(di4VarB);
            ki4 ki4VarA = di4VarB.a();
            vg4 vg4Var = new vg4(new li4(li4Var.a, ki4VarA), ki4VarA.a == this.g.a.t(), (p4c) this.h.get());
            k(j, vg4Var, false, true);
            vi9 vi9Var = new vi9(1);
            vi9Var.f(j, vg4Var);
            c(vi9Var);
            return vg4Var;
        } catch (Throwable th) {
            qr7.o(th);
            return null;
        }
    }

    public final void c(vi9 vi9Var) {
        no4 no4Var = this.k;
        if (no4Var == null || vi9Var.d()) {
            return;
        }
        int i = vi9Var.i();
        for (int i2 = 0; i2 < i; i2++) {
            long jE = vi9Var.e(i2);
            vg4 vg4Var = (vg4) vi9Var.j(i2);
            if (jE > 0) {
                ((f9b) no4Var.f.computeIfAbsent(Long.valueOf(jE), new mm(6, new lh3(no4Var, jE, 2)))).setValue(vg4Var);
            }
        }
    }

    public final vg4 d(long j, boolean z) {
        vg4 vg4Var = (vg4) this.a.get(Long.valueOf(j));
        if (vg4Var != null || !z) {
            return vg4Var;
        }
        vg4 vg4VarB = vg4.b(j, this.g.a.f(), (p4c) this.h.get());
        k(j, vg4VarB, true, true);
        return vg4VarB;
    }

    public final vg4 e(long j) {
        return (vg4) this.a.get(Long.valueOf(j));
    }

    public final vg4 f(long j, boolean z) {
        vg4 vg4Var;
        if (j > 0 && ((vg4Var = (vg4) this.a.get(Long.valueOf(j))) == null || vg4Var.a.a == 0 || vg4Var.I())) {
            a();
        }
        return d(j, z);
    }

    public final List g(Set set, Set set2) {
        vg4 vg4VarF = f(this.g.a.t(), false);
        ArrayList arrayList = null;
        for (vg4 vg4Var : this.a.values()) {
            if (vg4VarF != null && vg4Var != vg4VarF && set.contains(vg4Var.a.b.k) && (set2 == null || set2.contains(vg4Var.a.b.i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(vg4Var);
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public final List h() {
        return g(m, null);
    }

    public final boolean i(long j) {
        a();
        if (j > 0 && j != -1) {
            zed zedVar = this.g;
            if (j != zedVar.a.t()) {
                vg4 vg4VarD = d(j, false);
                if (f55.q(vg4VarD)) {
                    return true;
                }
                if (!vg4VarD.h()) {
                    if (zedVar.a.f() - TimeUnit.SECONDS.toMillis(((Number) zedVar.b.b().a.C0.a(e5d.S6[79]).i()).longValue()) >= vg4VarD.a.b.r) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void j() {
        if (this.d) {
            return;
        }
        this.i.getClass();
        Trace.beginSection("ContactController.load()");
        gm0.n("Trace", "ContactController.load()");
        gm0.n("ContactController", "contacts loading started");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.i.getClass();
        Trace.beginSection("ContactController.selectContacts()");
        gm0.n("Trace", "ContactController.selectContacts()");
        vi9 vi9Var = new vi9(32);
        mre mreVarB = ((n25) this.e.get()).b();
        List<xi4> list = (List) ch3.G(((in4) mreVarB.b()).a, true, false, new ik4(1));
        ArrayList<li4> arrayList = new ArrayList(yw3.W0(list, 10));
        for (xi4 xi4Var : list) {
            ConcurrentHashMap concurrentHashMap = ((se7) mreVarB.b.getValue()).a;
            long j = xi4Var.a;
            ki4 ki4Var = xi4Var.c;
            concurrentHashMap.put(Long.valueOf(j), Integer.valueOf(ki4Var.f.hashCode()));
            arrayList.add(new li4(xi4Var.a, ki4Var));
        }
        for (li4 li4Var : arrayList) {
            long j2 = li4Var.b.a;
            vg4 vg4Var = new vg4(li4Var, j2 == this.g.a.t(), (p4c) this.h.get());
            vi9Var.f(j2, vg4Var);
            k(vg4Var.v(), vg4Var, false, false);
        }
        Trace.endSection();
        this.d = true;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "ContactController", "contacts loaded in " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms", null);
            }
        }
        this.i.getClass();
        Trace.endSection();
        c(vi9Var);
    }

    public final void k(long j, vg4 vg4Var, boolean z, boolean z2) {
        if (z && j != 0) {
            a();
        }
        this.a.put(Long.valueOf(j), vg4Var);
        boolean zR = ch3.r(vg4Var.a.b.o);
        ConcurrentHashMap concurrentHashMap = this.b;
        if (zR) {
            concurrentHashMap.remove(Long.valueOf(j));
        } else {
            concurrentHashMap.put(Long.valueOf(j), vg4Var);
        }
        if (!z2 || vg4Var.I()) {
            return;
        }
        mre mreVarB = ((n25) this.e.get()).b();
        li4 li4Var = vg4Var.a;
        final long j2 = li4Var.a;
        final ki4 ki4Var = li4Var.b;
        dn4 dn4VarB = mreVarB.b();
        final long j3 = ki4Var.a;
        final ConcurrentHashMap concurrentHashMap2 = ((se7) mreVarB.b.getValue()).a;
        final in4 in4Var = (in4) dn4VarB;
        ch3.G(in4Var.a, false, true, new cf7() { // from class: fn4
            /* JADX WARN: Code duplicated, block: B:9:0x0017  */
            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                in4 in4Var2 = in4Var;
                rre rreVar = in4Var2.a;
                ki4 ki4Var2 = ki4Var;
                if (ki4Var2.a()) {
                    int i = ki4Var2.j;
                    if (i == 0) {
                        i = 1;
                    }
                    if (i != 1) {
                        long j4 = j3;
                        long j5 = j2;
                        ch3.G(rreVar, false, true, new hn4(j4, j5, ki4Var2));
                        ch3.G(rreVar, false, true, new gn4(in4Var2, j5, ki4Var2, concurrentHashMap2));
                    }
                } else {
                    long j6 = j3;
                    long j7 = j2;
                    ch3.G(rreVar, false, true, new hn4(j6, j7, ki4Var2));
                    ch3.G(rreVar, false, true, new gn4(in4Var2, j7, ki4Var2, concurrentHashMap2));
                }
                return sbi.a;
            }
        });
    }

    public final void m(List list, long[] jArr) {
        List arrayList;
        String str;
        dp5 dp5Var = this.h;
        if (jArr == null || jArr.length == 0) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            pw pwVar = new pw(jArr.length);
            for (long j : jArr) {
                pwVar.add(Long.valueOf(j));
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                pwVar.remove(Long.valueOf(((pj4) it.next()).a));
            }
            arrayList = new ArrayList(pwVar);
        }
        List<Long> list2 = arrayList;
        if (!list2.isEmpty()) {
            final long jF = this.g.a.f();
            for (Long l2 : list2) {
                gm0.y("ContactController", "storeContact #" + l2, new Object[0]);
                try {
                    vg4 vg4VarF = f(l2.longValue(), false);
                    if (vg4VarF == null || vg4VarF.a.a == 0) {
                        vg4 vg4VarA = vg4.a(l2.longValue(), jF, (p4c) dp5Var.get());
                        try {
                            str = "ContactController";
                            k(l2.longValue(), new vg4(new li4(((n25) this.e.get()).b().c(vg4VarA.a.b), vg4VarA.a.b), false, (p4c) dp5Var.get()), true, true);
                        } catch (Throwable th) {
                            th = th;
                            str = "ContactController";
                            gm0.V(str, "fail to store blocked or deleted user on portal #" + l2, new ContactBlockedOrDeletedStoreException(th));
                        }
                    } else {
                        b(l2.longValue(), new Consumer() { // from class: ai4
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                di4 di4Var = (di4) obj;
                                di4Var.j = 3;
                                di4Var.r = jF;
                            }
                        });
                        str = "ContactController";
                    }
                    try {
                        vg4 vg4VarF2 = f(l2.longValue(), false);
                        if (vg4VarF2 != null) {
                            vg4VarF2.b = null;
                            vg4VarF2.c = null;
                            vg4VarF2.d = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        gm0.V(str, "fail to store blocked or deleted user on portal #" + l2, new ContactBlockedOrDeletedStoreException(th));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = "ContactController";
                }
            }
            ij4 ij4Var = (ij4) this.j.get();
            yab.i0(ij4Var.b, null, 0, new jd3(list2, ij4Var, (lq4) null), 3);
            this.f.c(new so4(list2));
        }
        if (jArr == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            pj4 pj4Var = (pj4) it2.next();
            ix2 ix2Var = pj4Var.s;
            if (ix2Var == null) {
                vg4 vg4VarF3 = f(pj4Var.a, false);
                if (vg4VarF3 == null || !vg4VarF3.h()) {
                    arrayList3.add(pj4Var);
                } else {
                    arrayList2.add(pj4Var);
                }
            } else if ((ix2Var.b & np0.o) != 0) {
                arrayList2.add(pj4Var);
            } else {
                arrayList3.add(pj4Var);
            }
        }
        n(arrayList2, ji4.a);
        n(arrayList3, ji4.b);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x021a  */
    /* JADX WARN: Code duplicated, block: B:103:0x021c  */
    /* JADX WARN: Code duplicated, block: B:106:0x023f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0242  */
    /* JADX WARN: Code duplicated, block: B:109:0x0248  */
    /* JADX WARN: Code duplicated, block: B:111:0x024b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0255  */
    /* JADX WARN: Code duplicated, block: B:116:0x025c  */
    /* JADX WARN: Code duplicated, block: B:117:0x025f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0269  */
    /* JADX WARN: Code duplicated, block: B:121:0x026c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x026e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0276  */
    /* JADX WARN: Code duplicated, block: B:126:0x0279 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x027b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:130:0x0287  */
    /* JADX WARN: Code duplicated, block: B:132:0x0291  */
    /* JADX WARN: Code duplicated, block: B:133:0x0299  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:138:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:139:0x02af  */
    /* JADX WARN: Code duplicated, block: B:142:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:144:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:146:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:191:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0133  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:98:0x0200  */
    /* JADX WARN: Code duplicated, block: B:99:0x0203  */
    public final int n(List list, ji4 ji4Var) {
        List<ki4> list2;
        pj4 pj4Var;
        ki4 ki4VarC;
        rtc rtcVar;
        ji4 ji4Var2;
        String str;
        String str2;
        di4 di4VarB;
        rtc rtcVar2;
        int i;
        int i2;
        int i3;
        int iD;
        int i4;
        zba zbaVar;
        gi4 gi4Var;
        int i5;
        int iD2;
        boolean z;
        ii4 ii4Var;
        boolean z2;
        String strO;
        String str3;
        vg4 vg4Var;
        ji4 ji4Var3 = ji4.b;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        a();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "ContactController", "storeContactsFromServer, size = " + list.size() + ", type = " + ji4Var, null);
            }
        }
        long jF = this.g.a.f();
        long millis = TimeUnit.SECONDS.toMillis(((Number) this.g.b.b().a.C0.a(e5d.S6[79]).i()).longValue());
        long jT = this.g.a.t();
        Pattern pattern = rm4.a;
        if (list.isEmpty()) {
            list2 = Collections.EMPTY_LIST;
        } else {
            String str4 = "rm4";
            if (jT == 0) {
                gm0.W("rm4", "updateContactsFromServer: self is zero!", new Object[0]);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long j = ((pj4) it.next()).g;
                if (j != 0) {
                    arrayList2.add(Long.valueOf(j));
                }
            }
            List listD = !arrayList2.isEmpty() ? ((n25) this.e.get()).d().d(arrayList2) : Collections.EMPTY_LIST;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                pj4 pj4Var2 = (pj4) it2.next();
                StringBuilder sb = new StringBuilder("storeContact #");
                millis = millis;
                List list3 = listD;
                long j2 = pj4Var2.a;
                listD = list3;
                it2 = it2;
                long j3 = pj4Var2.g;
                long j4 = pj4Var2.b;
                sb.append(j2);
                gm0.y(str4, sb.toString(), new Object[0]);
                vg4 vg4VarF = f(j2, false);
                if (vg4VarF == null || vg4VarF.a.b.g <= j4) {
                    if (vg4VarF != null) {
                        li4 li4Var = vg4VarF.a;
                        if (li4Var.a == 0) {
                            pj4Var = pj4Var2;
                            ki4VarC = rm4.c(pj4Var, ji4Var, jF, 0L, jT);
                        } else {
                            ki4VarC = li4Var.b;
                            long j5 = jF;
                            if (ki4VarC.r + millis <= j5) {
                                gm0.n(str4, "force update non-contact");
                                pj4Var = pj4Var2;
                                jF = j5;
                                ki4VarC = rm4.c(pj4Var, ji4Var, jF, li4Var.b.s, jT);
                            } else {
                                pj4Var = pj4Var2;
                                jF = j5;
                            }
                        }
                    } else {
                        pj4Var = pj4Var2;
                        ki4VarC = rm4.c(pj4Var, ji4Var, jF, 0L, jT);
                    }
                    if (j3 == 0) {
                        rtcVar = null;
                        break;
                    }
                    Iterator it3 = listD.iterator();
                    do {
                        if (!it3.hasNext()) {
                            rtcVar = null;
                            break;
                        }
                        rtcVar = (rtc) it3.next();
                    } while (rtcVar.r() != j3);
                    ii4 ii4Var2 = ii4.b;
                    ji4 ji4Var4 = ji4.a;
                    String str5 = str4;
                    ix2 ix2Var = pj4Var.s;
                    if (ix2Var != null) {
                        if ((ix2Var.b & np0.o) != 0) {
                            ji4Var2 = ji4Var4;
                        } else {
                            ji4Var2 = ji4Var3;
                        }
                        if (pj4Var.a == jT) {
                            ji4Var2 = ji4Var4;
                        }
                        str = pj4Var.d;
                        str2 = pj4Var.c;
                        di4VarB = ki4VarC.b();
                        rtcVar2 = rtcVar;
                        i = pj4Var.i;
                        long j6 = jT;
                        if (i != 0 || i == 1) {
                            i2 = 1;
                        } else {
                            int iD3 = qt4.D(i);
                            if (iD3 == 1) {
                                i2 = 2;
                            } else if (iD3 != 2) {
                                i2 = 1;
                            } else {
                                i2 = 3;
                            }
                        }
                        di4VarB.a = j2;
                        di4VarB.g = j4;
                        di4VarB.h = j3;
                        di4VarB.j = i2;
                        i3 = pj4Var.j;
                        iD = qt4.D(i3);
                        if (iD != 0) {
                            i4 = 1;
                        } else if (iD != 1) {
                            i4 = 2;
                        } else {
                            if (iD == 2) {
                                if (i3 != 1) {
                                    str3 = "UNKNOWN";
                                } else if (i3 != 2) {
                                    str3 = "MALE";
                                } else if (i3 != 3) {
                                    str3 = "null";
                                } else {
                                    str3 = "FEMALE";
                                }
                                c.f(str3, " in proto model", "No such value for ");
                                return 0;
                            }
                            i4 = 3;
                        }
                        di4VarB.l = i4;
                        di4VarB.n = pj4Var.k;
                        di4VarB.o = pj4Var.l;
                        di4VarB.e = pj4Var.f;
                        di4VarB.p = pj4Var.m;
                        zbaVar = pj4Var.n;
                        if (zbaVar == null) {
                            gi4Var = null;
                        } else {
                            gi4Var = new gi4(zbaVar.a());
                        }
                        di4VarB.t = gi4Var;
                        di4VarB.u = pj4Var.o;
                        di4VarB.w = pj4Var.p;
                        di4VarB.x = pj4Var.q;
                        di4VarB.y = pj4Var.r;
                        di4VarB.z = pj4Var.s;
                        i5 = pj4Var.h;
                        if (i5 == 0) {
                            ii4Var = null;
                            z = true;
                        } else {
                            iD2 = qt4.D(i5);
                            if (iD2 != 0) {
                                z = true;
                                if (iD2 == 1) {
                                    c.f(qv1.z(i5), " in proto model", "No such value for ");
                                    return 0;
                                }
                                ii4Var = ii4Var2;
                            } else {
                                z = true;
                                ii4Var = ii4.a;
                            }
                        }
                        di4VarB.i = ii4Var;
                        if (ii4Var == ii4Var2) {
                            di4VarB.k = ji4Var3;
                        } else {
                            di4VarB.k = ji4Var2;
                        }
                        if (!ch3.r(str2)) {
                            di4VarB.b = str2;
                        } else if (ii4Var != ii4Var2) {
                            di4VarB.b = "";
                        }
                        if (!ch3.r(str)) {
                            di4VarB.c = str;
                        } else if (ii4Var != ii4Var2) {
                            di4VarB.c = "";
                        }
                        di4VarB.f = pm9.i(pj4Var.e);
                        if (rtcVar2 != null) {
                            if (ch3.r(rtcVar2.h())) {
                                z2 = false;
                            } else {
                                di4VarB.d = rtcVar2.h();
                                z2 = z;
                            }
                            if (!ch3.r(rtcVar2.m())) {
                                if (rtcVar2.o() != null) {
                                    strO = rtcVar2.o();
                                } else {
                                    strO = "";
                                }
                                fi4 fi4Var = new fi4(rtcVar2.m(), ei4.b, strO);
                                if (di4VarB.f == null) {
                                    di4VarB.f = new ArrayList();
                                }
                                di4VarB.f.add(fi4Var);
                            }
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            di4VarB.d = "";
                        }
                        arrayList.add(di4VarB.a());
                        str4 = str5;
                        jF = jF;
                        jT = j6;
                    } else {
                        ji4Var2 = ji4Var;
                    }
                    if (pj4Var.a == jT) {
                        ji4Var2 = ji4Var4;
                    }
                    str = pj4Var.d;
                    str2 = pj4Var.c;
                    di4VarB = ki4VarC.b();
                    rtcVar2 = rtcVar;
                    i = pj4Var.i;
                    long j7 = jT;
                    if (i != 0) {
                        i2 = 1;
                    } else {
                        i2 = 1;
                    }
                    di4VarB.a = j2;
                    di4VarB.g = j4;
                    di4VarB.h = j3;
                    di4VarB.j = i2;
                    i3 = pj4Var.j;
                    iD = qt4.D(i3);
                    if (iD != 0) {
                        i4 = 1;
                    } else if (iD != 1) {
                        i4 = 2;
                    } else {
                        if (iD == 2) {
                            if (i3 != 1) {
                                str3 = "UNKNOWN";
                            } else if (i3 != 2) {
                                str3 = "MALE";
                            } else if (i3 != 3) {
                                str3 = "null";
                            } else {
                                str3 = "FEMALE";
                            }
                            c.f(str3, " in proto model", "No such value for ");
                            return 0;
                        }
                        i4 = 3;
                    }
                    di4VarB.l = i4;
                    di4VarB.n = pj4Var.k;
                    di4VarB.o = pj4Var.l;
                    di4VarB.e = pj4Var.f;
                    di4VarB.p = pj4Var.m;
                    zbaVar = pj4Var.n;
                    if (zbaVar == null) {
                        gi4Var = null;
                    } else {
                        gi4Var = new gi4(zbaVar.a());
                    }
                    di4VarB.t = gi4Var;
                    di4VarB.u = pj4Var.o;
                    di4VarB.w = pj4Var.p;
                    di4VarB.x = pj4Var.q;
                    di4VarB.y = pj4Var.r;
                    di4VarB.z = pj4Var.s;
                    i5 = pj4Var.h;
                    if (i5 == 0) {
                        ii4Var = null;
                        z = true;
                    } else {
                        iD2 = qt4.D(i5);
                        if (iD2 != 0) {
                            z = true;
                            if (iD2 == 1) {
                                c.f(qv1.z(i5), " in proto model", "No such value for ");
                                return 0;
                            }
                            ii4Var = ii4Var2;
                        } else {
                            z = true;
                            ii4Var = ii4.a;
                        }
                    }
                    di4VarB.i = ii4Var;
                    if (ii4Var == ii4Var2) {
                        di4VarB.k = ji4Var3;
                    } else {
                        di4VarB.k = ji4Var2;
                    }
                    if (!ch3.r(str2)) {
                        di4VarB.b = str2;
                    } else if (ii4Var != ii4Var2) {
                        di4VarB.b = "";
                    }
                    if (!ch3.r(str)) {
                        di4VarB.c = str;
                    } else if (ii4Var != ii4Var2) {
                        di4VarB.c = "";
                    }
                    di4VarB.f = pm9.i(pj4Var.e);
                    if (rtcVar2 != null) {
                        if (ch3.r(rtcVar2.h())) {
                            di4VarB.d = rtcVar2.h();
                            z2 = z;
                        } else {
                            z2 = false;
                        }
                        if (!ch3.r(rtcVar2.m())) {
                            if (rtcVar2.o() != null) {
                                strO = rtcVar2.o();
                            } else {
                                strO = "";
                            }
                            fi4 fi4Var2 = new fi4(rtcVar2.m(), ei4.b, strO);
                            if (di4VarB.f == null) {
                                di4VarB.f = new ArrayList();
                            }
                            di4VarB.f.add(fi4Var2);
                        }
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        di4VarB.d = "";
                    }
                    arrayList.add(di4VarB.a());
                    str4 = str5;
                    jF = jF;
                    jT = j7;
                }
            }
            list2 = arrayList;
        }
        vi9 vi9Var = new vi9(list2.size());
        pw pwVar = new pw(list2.size());
        for (ki4 ki4Var : list2) {
            try {
                vg4 vg4VarF2 = f(ki4Var.a, false);
                boolean z3 = ki4Var.a == this.g.a.t();
                if (vg4VarF2 != null) {
                    long j8 = vg4VarF2.a.a;
                    if (j8 == 0) {
                        vg4Var = new vg4(new li4(((n25) this.e.get()).b().c(ki4Var), ki4Var), z3, (p4c) this.h.get());
                    } else {
                        vg4Var = new vg4(new li4(j8, ki4Var), z3, (p4c) this.h.get());
                        if (((Boolean) this.g.b.a().a.K3.a(e5d.S6[246]).i()).booleanValue() && vg4VarF2.w() != 0 && vg4Var.w() == 0) {
                            l(vg4Var);
                        }
                    }
                } else {
                    vg4Var = new vg4(new li4(((n25) this.e.get()).b().c(ki4Var), ki4Var), z3, (p4c) this.h.get());
                }
                k(vg4Var.v(), vg4Var, true, true);
                vi9Var.f(vg4Var.v(), vg4Var);
                pwVar.add(Long.valueOf(ki4Var.a));
            } catch (Throwable th) {
                gm0.V("ContactController", "fail to store contact #" + ki4Var.a, new ContactStoreException(th));
            }
        }
        c(vi9Var);
        this.f.c(new so4(pwVar));
        return pwVar.c;
    }
}
