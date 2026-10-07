package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class t83 {
    public final Context a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final String j;

    public t83(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ha9 ha9Var, Context context) {
        this.a = context;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        this.h = ny8Var7;
        this.i = ny8Var8;
        this.j = zo5.p(t83.class.getName(), "#", String.valueOf(ha9Var.a));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r0 == r6) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.t83 r17, defpackage.g83 r18, defpackage.nq4 r19) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t83.a(t83, g83, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:45:0x0102  */
    /* JADX WARN: Code duplicated, block: B:46:0x0108  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b1 -> B:29:0x00b9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(defpackage.t83 r18, defpackage.g83 r19, defpackage.xf5 r20, defpackage.nq4 r21) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t83.b(t83, g83, xf5, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j, nq4 nq4Var) {
        i83 i83Var;
        if (nq4Var instanceof i83) {
            i83Var = (i83) nq4Var;
            int i = i83Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                i83Var.f = i - Integer.MIN_VALUE;
            } else {
                i83Var = new i83(this, nq4Var);
            }
        } else {
            i83Var = new i83(this, nq4Var);
        }
        Object obj = i83Var.d;
        int i2 = i83Var.f;
        String str = this.j;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                gm0.m(str, "cancel %d", new Long(j));
                un6 un6Var = (un6) this.c.getValue();
                i83Var.f = 1;
                Object objO = un6Var.o(j, i83Var);
                hu4 hu4Var = hu4.a;
                if (objO == hu4Var) {
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
            gm0.V(str, "cancel failure!", new h83(th));
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(nq4 nq4Var) {
        j83 j83Var;
        if (nq4Var instanceof j83) {
            j83Var = (j83) nq4Var;
            int i = j83Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                j83Var.f = i - Integer.MIN_VALUE;
            } else {
                j83Var = new j83(this, nq4Var);
            }
        } else {
            j83Var = new j83(this, nq4Var);
        }
        Object obj = j83Var.d;
        int i2 = j83Var.f;
        String str = this.j;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                gm0.n(str, "cancelAll");
                un6 un6Var = (un6) this.c.getValue();
                j83Var.f = 1;
                Object objP = un6Var.p(j83Var);
                hu4 hu4Var = hu4.a;
                if (objP == hu4Var) {
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
            gm0.V(str, "cancelAll failure!", new h83(th));
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x011c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x0144  */
    /* JADX WARN: Code duplicated, block: B:62:0x0195  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0203  */
    /* JADX WARN: Code duplicated, block: B:80:0x0222  */
    /* JADX WARN: Code duplicated, block: B:83:0x0265 A[LOOP:1: B:81:0x025f->B:83:0x0265, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x029f  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:92:0x02ec A[LOOP:2: B:90:0x02e6->B:92:0x02ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0327 A[RETURN] */
    public final Object e(m8b m8bVar, l8b l8bVar, nq4 nq4Var) {
        k83 k83Var;
        l8b l8bVar2;
        m8b m8bVar2;
        m8b m8bVar3;
        m8b m8bVar4;
        String str;
        a4c a4cVar;
        l8b l8bVar3;
        g83 g83Var;
        Object objR;
        l8b l8bVar4;
        g83 g83Var2;
        g83 g83Var3;
        String str2;
        a4c a4cVar2;
        pw pwVar;
        g83 g83Var4;
        Set set;
        xf5 xf5Var;
        g83 g83Var5;
        Object objG;
        g83 g83Var6;
        xf5 xf5Var2;
        g83 g83Var7;
        kmb kmbVar;
        long j;
        boolean z;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        ArrayList arrayList2;
        ohf ohfVarK0;
        nre nreVar;
        kx6 kx6Var;
        je9 je9Var = je9.d;
        if (nq4Var instanceof k83) {
            k83Var = (k83) nq4Var;
            int i = k83Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                k83Var.l = i - Integer.MIN_VALUE;
            } else {
                k83Var = new k83(this, nq4Var);
            }
        } else {
            k83Var = new k83(this, nq4Var);
        }
        k83 k83Var2 = k83Var;
        Object objP = k83Var2.j;
        Object obj = hu4.a;
        int i2 = k83Var2.l;
        if (i2 == 0) {
            ch3.d0(objP);
            if (m8bVar.i()) {
                m8bVar4 = ui9.a;
                l8bVar2 = l8bVar;
                str = this.j;
                a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "getChatsNotifications: chatServerIds=" + m8bVar4, null);
                }
                na9 na9Var = (na9) this.b.getValue();
                k83Var2.d = l8bVar2;
                k83Var2.e = m8bVar4;
                k83Var2.f = null;
                k83Var2.l = 2;
                objP = na9Var.p(m8bVar4, k83Var2);
                if (objP != obj) {
                    l8bVar3 = l8bVar2;
                    g83Var = (g83) objP;
                    un6 un6Var = (un6) this.c.getValue();
                    k83Var2.d = l8bVar3;
                    k83Var2.e = null;
                    k83Var2.f = g83Var;
                    k83Var2.l = 3;
                    objR = un6Var.r(m8bVar4, k83Var2);
                    if (objR != obj) {
                        l8bVar4 = l8bVar3;
                        g83Var2 = g83Var;
                        objP = objR;
                        g83Var3 = (g83) objP;
                        str2 = this.j;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            a4cVar2.c(je9Var, str2, "fcmNotificationData=" + g83Var3, null);
                        }
                        pwVar = new pw(ww3.M1(lof.Z(g83Var2.a.keySet(), g83Var3.a.keySet()), new m83(g83Var2, g83Var3)));
                        k83Var2.d = l8bVar4;
                        k83Var2.e = null;
                        k83Var2.f = g83Var2;
                        k83Var2.g = g83Var3;
                        k83Var2.h = pwVar;
                        k83Var2.l = 4;
                        objP = cqk.k(new o83(this, pwVar, (lq4) null, 0), k83Var2);
                        if (objP != obj) {
                            g83Var4 = g83Var3;
                            set = pwVar;
                            l8b l8bVar5 = l8bVar4;
                            xf5Var = (xf5) objP;
                            k83Var2.d = null;
                            k83Var2.e = null;
                            k83Var2.f = g83Var2;
                            k83Var2.g = g83Var4;
                            k83Var2.h = null;
                            k83Var2.i = xf5Var;
                            k83Var2.l = 5;
                            g83Var5 = g83Var2;
                            objG = g(set, g83Var5, g83Var4, xf5Var, l8bVar5, k83Var2);
                            if (objG != obj) {
                                objP = objG;
                                g83Var6 = g83Var4;
                                xf5Var2 = xf5Var;
                                g83Var7 = g83Var5;
                                kmbVar = (kmb) objP;
                                j = f().c.d.getLong("app.notification.dontDisturbUntil", 0L);
                                long jF = f().a.f();
                                if (j != -1) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                                if (!z) {
                                    yab.i0((wmi) this.i.getValue(), null, 0, new l83(this, g83Var6, xf5Var2, g83Var7, (lq4) null), 3);
                                }
                                if (!z) {
                                    return kmbVar;
                                }
                                Map map = kmbVar.a;
                                linkedHashMap = new LinkedHashMap(wm9.P0(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    m2i m2iVar = new m2i(new sw(1, ((d83) entry.getValue()).f), new xk1(29));
                                    List<apb> list = ((d83) entry.getValue()).g;
                                    arrayList2 = new ArrayList(yw3.W0(list, 10));
                                    for (apb apbVar : list) {
                                        arrayList2.add(new apb(apbVar.a, apbVar.b, apbVar.c, qv5.DO_NOT_DISTURB_MODE));
                                    }
                                    ohfVarK0 = a.K0(new ohf[]{m2iVar, new sw(1, arrayList2)});
                                    nreVar = new nre(4);
                                    if (ohfVarK0 instanceof m2i) {
                                        m2i m2iVar2 = (m2i) ohfVarK0;
                                        kx6Var = new kx6(m2iVar2.a, m2iVar2.b, nreVar);
                                    } else {
                                        kx6Var = new kx6(ohfVarK0, new nre(3), nreVar);
                                    }
                                    linkedHashMap.put(key, d83.a((d83) entry.getValue(), null, r66.a, yhf.w0(kx6Var), null, false, 65183));
                                }
                                List<apb> list2 = kmbVar.i;
                                arrayList = new ArrayList(yw3.W0(list2, 10));
                                for (apb apbVar2 : list2) {
                                    arrayList.add(new apb(apbVar2.a, apbVar2.b, apbVar2.c, qv5.DO_NOT_DISTURB_MODE));
                                }
                                return new kmb(linkedHashMap, kmbVar.b, 0, kmbVar.d, kmbVar.e, kmbVar.f, kmbVar.g, kmbVar.h, arrayList);
                            }
                        }
                    }
                }
            } else {
                m8b m8bVar5 = new m8b(m8bVar.d);
                xn3 xn3Var = (xn3) this.f.getValue();
                l8bVar2 = l8bVar;
                k83Var2.d = l8bVar2;
                k83Var2.e = m8bVar5;
                k83Var2.f = m8bVar5;
                k83Var2.l = 1;
                Object objM = xn3Var.m(m8bVar, k83Var2);
                if (objM != obj) {
                    m8bVar2 = m8bVar5;
                    objP = objM;
                    m8bVar3 = m8bVar2;
                }
            }
            return obj;
        }
        if (i2 == 1) {
            m8bVar3 = (m8b) k83Var2.f;
            m8bVar2 = k83Var2.e;
            l8bVar2 = k83Var2.d;
            ch3.d0(objP);
        } else {
            if (i2 == 2) {
                m8bVar4 = k83Var2.e;
                l8bVar3 = k83Var2.d;
                ch3.d0(objP);
                g83Var = (g83) objP;
                un6 un6Var2 = (un6) this.c.getValue();
                k83Var2.d = l8bVar3;
                k83Var2.e = null;
                k83Var2.f = g83Var;
                k83Var2.l = 3;
                objR = un6Var2.r(m8bVar4, k83Var2);
                if (objR != obj) {
                    l8bVar4 = l8bVar3;
                    g83Var2 = g83Var;
                    objP = objR;
                    g83Var3 = (g83) objP;
                    str2 = this.j;
                    a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        a4cVar2.c(je9Var, str2, "fcmNotificationData=" + g83Var3, null);
                    }
                    pwVar = new pw(ww3.M1(lof.Z(g83Var2.a.keySet(), g83Var3.a.keySet()), new m83(g83Var2, g83Var3)));
                    k83Var2.d = l8bVar4;
                    k83Var2.e = null;
                    k83Var2.f = g83Var2;
                    k83Var2.g = g83Var3;
                    k83Var2.h = pwVar;
                    k83Var2.l = 4;
                    objP = cqk.k(new o83(this, pwVar, (lq4) null, 0), k83Var2);
                    if (objP != obj) {
                        g83Var4 = g83Var3;
                        set = pwVar;
                        l8b l8bVar6 = l8bVar4;
                        xf5Var = (xf5) objP;
                        k83Var2.d = null;
                        k83Var2.e = null;
                        k83Var2.f = g83Var2;
                        k83Var2.g = g83Var4;
                        k83Var2.h = null;
                        k83Var2.i = xf5Var;
                        k83Var2.l = 5;
                        g83Var5 = g83Var2;
                        objG = g(set, g83Var5, g83Var4, xf5Var, l8bVar6, k83Var2);
                        if (objG != obj) {
                            objP = objG;
                            g83Var6 = g83Var4;
                            xf5Var2 = xf5Var;
                            g83Var7 = g83Var5;
                        }
                    }
                }
                return obj;
            }
            if (i2 == 3) {
                g83 g83Var8 = (g83) k83Var2.f;
                l8b l8bVar7 = k83Var2.d;
                ch3.d0(objP);
                l8bVar4 = l8bVar7;
                g83Var2 = g83Var8;
                g83Var3 = (g83) objP;
                str2 = this.j;
                a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, "fcmNotificationData=" + g83Var3, null);
                }
                pwVar = new pw(ww3.M1(lof.Z(g83Var2.a.keySet(), g83Var3.a.keySet()), new m83(g83Var2, g83Var3)));
                k83Var2.d = l8bVar4;
                k83Var2.e = null;
                k83Var2.f = g83Var2;
                k83Var2.g = g83Var3;
                k83Var2.h = pwVar;
                k83Var2.l = 4;
                objP = cqk.k(new o83(this, pwVar, (lq4) null, 0), k83Var2);
                if (objP != obj) {
                    g83Var4 = g83Var3;
                    set = pwVar;
                    l8b l8bVar8 = l8bVar4;
                    xf5Var = (xf5) objP;
                    k83Var2.d = null;
                    k83Var2.e = null;
                    k83Var2.f = g83Var2;
                    k83Var2.g = g83Var4;
                    k83Var2.h = null;
                    k83Var2.i = xf5Var;
                    k83Var2.l = 5;
                    g83Var5 = g83Var2;
                    objG = g(set, g83Var5, g83Var4, xf5Var, l8bVar8, k83Var2);
                    if (objG != obj) {
                        objP = objG;
                        g83Var6 = g83Var4;
                        xf5Var2 = xf5Var;
                        g83Var7 = g83Var5;
                    }
                }
                return obj;
            }
            if (i2 == 4) {
                set = k83Var2.h;
                g83Var4 = k83Var2.g;
                g83Var2 = (g83) k83Var2.f;
                l8bVar4 = k83Var2.d;
                ch3.d0(objP);
                l8b l8bVar9 = l8bVar4;
                xf5Var = (xf5) objP;
                k83Var2.d = null;
                k83Var2.e = null;
                k83Var2.f = g83Var2;
                k83Var2.g = g83Var4;
                k83Var2.h = null;
                k83Var2.i = xf5Var;
                k83Var2.l = 5;
                g83Var5 = g83Var2;
                objG = g(set, g83Var5, g83Var4, xf5Var, l8bVar9, k83Var2);
                if (objG != obj) {
                    objP = objG;
                    g83Var6 = g83Var4;
                    xf5Var2 = xf5Var;
                    g83Var7 = g83Var5;
                }
                return obj;
            }
            if (i2 != 5) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xf5 xf5Var3 = k83Var2.i;
            g83 g83Var9 = k83Var2.g;
            g83Var7 = (g83) k83Var2.f;
            ch3.d0(objP);
            xf5Var2 = xf5Var3;
            g83Var6 = g83Var9;
        }
        kmbVar = (kmb) objP;
        j = f().c.d.getLong("app.notification.dontDisturbUntil", 0L);
        long jF2 = f().a.f();
        if (j != -1 || jF2 < j) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            yab.i0((wmi) this.i.getValue(), null, 0, new l83(this, g83Var6, xf5Var2, g83Var7, (lq4) null), 3);
        }
        if (!z) {
            return kmbVar;
        }
        Map map2 = kmbVar.a;
        linkedHashMap = new LinkedHashMap(wm9.P0(map2.size()));
        while (r0.hasNext()) {
            Object key2 = entry.getKey();
            m2i m2iVar3 = new m2i(new sw(1, ((d83) entry.getValue()).f), new xk1(29));
            List<apb> list3 = ((d83) entry.getValue()).g;
            arrayList2 = new ArrayList(yw3.W0(list3, 10));
            while (r3.hasNext()) {
                arrayList2.add(new apb(apbVar.a, apbVar.b, apbVar.c, qv5.DO_NOT_DISTURB_MODE));
            }
            ohfVarK0 = a.K0(new ohf[]{m2iVar3, new sw(1, arrayList2)});
            nreVar = new nre(4);
            if (ohfVarK0 instanceof m2i) {
                m2i m2iVar4 = (m2i) ohfVarK0;
                kx6Var = new kx6(m2iVar4.a, m2iVar4.b, nreVar);
            } else {
                kx6Var = new kx6(ohfVarK0, new nre(3), nreVar);
            }
            linkedHashMap.put(key2, d83.a((d83) entry.getValue(), null, r66.a, yhf.w0(kx6Var), null, false, 65183));
        }
        List<apb> list4 = kmbVar.i;
        arrayList = new ArrayList(yw3.W0(list4, 10));
        while (r0.hasNext()) {
            arrayList.add(new apb(apbVar2.a, apbVar2.b, apbVar2.c, qv5.DO_NOT_DISTURB_MODE));
        }
        return new kmb(linkedHashMap, kmbVar.b, 0, kmbVar.d, kmbVar.e, kmbVar.f, kmbVar.g, kmbVar.h, arrayList);
        for (rt2 rt2Var : (Iterable) objP) {
            if (!rt2Var.l0(f().a, f().c)) {
                m8bVar3.a(rt2Var.b.a);
            }
        }
        m8bVar4 = m8bVar2;
        str = this.j;
        a4cVar = gm0.f;
        if (a4cVar != null) {
            a4cVar.c(je9Var, str, "getChatsNotifications: chatServerIds=" + m8bVar4, null);
        }
        na9 na9Var2 = (na9) this.b.getValue();
        k83Var2.d = l8bVar2;
        k83Var2.e = m8bVar4;
        k83Var2.f = null;
        k83Var2.l = 2;
        objP = na9Var2.p(m8bVar4, k83Var2);
        if (objP != obj) {
            l8bVar3 = l8bVar2;
            g83Var = (g83) objP;
            un6 un6Var3 = (un6) this.c.getValue();
            k83Var2.d = l8bVar3;
            k83Var2.e = null;
            k83Var2.f = g83Var;
            k83Var2.l = 3;
            objR = un6Var3.r(m8bVar4, k83Var2);
            if (objR != obj) {
                l8bVar4 = l8bVar3;
                g83Var2 = g83Var;
                objP = objR;
                g83Var3 = (g83) objP;
                str2 = this.j;
                a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    a4cVar2.c(je9Var, str2, "fcmNotificationData=" + g83Var3, null);
                }
                pwVar = new pw(ww3.M1(lof.Z(g83Var2.a.keySet(), g83Var3.a.keySet()), new m83(g83Var2, g83Var3)));
                k83Var2.d = l8bVar4;
                k83Var2.e = null;
                k83Var2.f = g83Var2;
                k83Var2.g = g83Var3;
                k83Var2.h = pwVar;
                k83Var2.l = 4;
                objP = cqk.k(new o83(this, pwVar, (lq4) null, 0), k83Var2);
                if (objP != obj) {
                    g83Var4 = g83Var3;
                    set = pwVar;
                    l8b l8bVar10 = l8bVar4;
                    xf5Var = (xf5) objP;
                    k83Var2.d = null;
                    k83Var2.e = null;
                    k83Var2.f = g83Var2;
                    k83Var2.g = g83Var4;
                    k83Var2.h = null;
                    k83Var2.i = xf5Var;
                    k83Var2.l = 5;
                    g83Var5 = g83Var2;
                    objG = g(set, g83Var5, g83Var4, xf5Var, l8bVar10, k83Var2);
                    if (objG != obj) {
                        objP = objG;
                        g83Var6 = g83Var4;
                        xf5Var2 = xf5Var;
                        g83Var7 = g83Var5;
                        kmbVar = (kmb) objP;
                        j = f().c.d.getLong("app.notification.dontDisturbUntil", 0L);
                        long jF3 = f().a.f();
                        if (j != -1) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            yab.i0((wmi) this.i.getValue(), null, 0, new l83(this, g83Var6, xf5Var2, g83Var7, (lq4) null), 3);
                        }
                        if (!z) {
                            return kmbVar;
                        }
                        Map map3 = kmbVar.a;
                        linkedHashMap = new LinkedHashMap(wm9.P0(map3.size()));
                        while (r0.hasNext()) {
                            Object key3 = entry.getKey();
                            m2i m2iVar5 = new m2i(new sw(1, ((d83) entry.getValue()).f), new xk1(29));
                            List<apb> list5 = ((d83) entry.getValue()).g;
                            arrayList2 = new ArrayList(yw3.W0(list5, 10));
                            while (r3.hasNext()) {
                                arrayList2.add(new apb(apbVar.a, apbVar.b, apbVar.c, qv5.DO_NOT_DISTURB_MODE));
                            }
                            ohfVarK0 = a.K0(new ohf[]{m2iVar5, new sw(1, arrayList2)});
                            nreVar = new nre(4);
                            if (ohfVarK0 instanceof m2i) {
                                m2i m2iVar6 = (m2i) ohfVarK0;
                                kx6Var = new kx6(m2iVar6.a, m2iVar6.b, nreVar);
                            } else {
                                kx6Var = new kx6(ohfVarK0, new nre(3), nreVar);
                            }
                            linkedHashMap.put(key3, d83.a((d83) entry.getValue(), null, r66.a, yhf.w0(kx6Var), null, false, 65183));
                        }
                        List<apb> list6 = kmbVar.i;
                        arrayList = new ArrayList(yw3.W0(list6, 10));
                        while (r0.hasNext()) {
                            arrayList.add(new apb(apbVar2.a, apbVar2.b, apbVar2.c, qv5.DO_NOT_DISTURB_MODE));
                        }
                        return new kmb(linkedHashMap, kmbVar.b, 0, kmbVar.d, kmbVar.e, kmbVar.f, kmbVar.g, kmbVar.h, arrayList);
                    }
                }
            }
        }
        return obj;
    }

    public final zed f() {
        return (zed) this.e.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object g(Set set, g83 g83Var, g83 g83Var2, xf5 xf5Var, l8b l8bVar, nq4 nq4Var) {
        p83 p83Var;
        Set set2;
        g83 g83Var3;
        l8b l8bVar2;
        g83 g83Var4;
        Object next;
        int i;
        zmb zmbVar;
        boolean z;
        je9 je9Var = je9.d;
        if (nq4Var instanceof p83) {
            p83Var = (p83) nq4Var;
            int i2 = p83Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p83Var.j = i2 - Integer.MIN_VALUE;
            } else {
                p83Var = new p83(this, nq4Var);
            }
        } else {
            p83Var = new p83(this, nq4Var);
        }
        p83 p83Var2 = p83Var;
        Object obj = p83Var2.h;
        Serializable serializable = hu4.a;
        int i3 = p83Var2.j;
        if (i3 == 0) {
            ch3.d0(obj);
            String str = this.j;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "merge: starting for " + set, null);
            }
            p83Var2.d = set;
            p83Var2.e = g83Var;
            p83Var2.f = g83Var2;
            p83Var2.g = l8bVar;
            p83Var2.j = 1;
            Serializable serializableH = h(set, g83Var, g83Var2, xf5Var, p83Var2);
            if (serializableH == serializable) {
                return serializable;
            }
            set2 = set;
            g83Var3 = g83Var2;
            obj = serializableH;
            l8bVar2 = l8bVar;
            g83Var4 = g83Var;
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l8b l8bVar3 = p83Var2.g;
            g83Var3 = p83Var2.f;
            g83Var4 = p83Var2.e;
            set2 = p83Var2.d;
            ch3.d0(obj);
            l8bVar2 = l8bVar3;
        }
        Map map = (Map) obj;
        int i4 = g83Var4.b + g83Var3.b;
        String str2 = this.j;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "merge: finished for " + set2 + ", totalUnreadMessagesCount=" + i4, null);
        }
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long j = ((d83) next).m;
                do {
                    Object next2 = it.next();
                    long j2 = ((d83) next2).m;
                    if (j < j2) {
                        next = next2;
                        j = j2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        d83 d83Var = (d83) next;
        d83 d83Var2 = (d83) (d83Var != null ? d83Var.j : false ? next : null);
        String str3 = this.j;
        if (d83Var2 == null) {
            gm0.n(str3, "buildNotificationSettings: no alert");
            zmbVar = new zmb(false, "_NONE_", 0, false, false);
        } else {
            gm0.n(str3, "buildNotificationSettings: need alert");
            boolean z2 = d83Var2.e == e83.a;
            String strJ = z2 ? f().c.j("app.notification.ringtone") : f().c.j("app.notification.chats.ringtone");
            if (((gue) this.g.getValue()).e() && !f().c.d.getBoolean("app.notification.in.app.sound", true)) {
                strJ = "_NONE_";
            }
            boolean z3 = z2 ? f().c.d.getBoolean("app.notification.vibrate", true) : f().c.d.getBoolean("app.notification.chats.vibrate", true);
            if (((gue) this.g.getValue()).e() && !f().c.d.getBoolean("app.notification.in.app.vibrate", true)) {
                z3 = false;
            }
            if (z2) {
                nni nniVar = f().c;
                i = nniVar.d.getInt("app.notification.led.color", nniVar.f());
            } else {
                nni nniVar2 = f().c;
                i = nniVar2.d.getInt("app.notification.chats.led.color", nniVar2.f());
            }
            zmbVar = new zmb(true, strJ, i, z3, !((gue) this.g.getValue()).e() && f().c.d.getBoolean("app.notification.important.priority", true));
        }
        zmb zmbVar2 = zmbVar;
        int iD = ((v4c) this.h.getValue()).d();
        String str4 = ((v4c) this.h.getValue()).k;
        Collection collectionValues = map.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            z = false;
        } else {
            Iterator it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                List list = ((d83) it2.next()).f;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (((tia) it3.next()).o) {
                            z = true;
                        }
                    }
                }
            }
            z = false;
        }
        return new kmb(map, zmbVar2, i4, iD, str4, z, ((v4c) this.h.getValue()).h, l8bVar2, ww3.G1(g83Var3.c, g83Var4.c));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:104:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:106:0x0304  */
    /* JADX WARN: Code duplicated, block: B:108:0x0309  */
    /* JADX WARN: Code duplicated, block: B:110:0x030e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0313  */
    /* JADX WARN: Code duplicated, block: B:116:0x0330  */
    /* JADX WARN: Code duplicated, block: B:118:0x0333  */
    /* JADX WARN: Code duplicated, block: B:120:0x033a  */
    /* JADX WARN: Code duplicated, block: B:123:0x034d  */
    /* JADX WARN: Code duplicated, block: B:124:0x034f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0373  */
    /* JADX WARN: Code duplicated, block: B:130:0x0389  */
    /* JADX WARN: Code duplicated, block: B:133:0x0396  */
    /* JADX WARN: Code duplicated, block: B:136:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:138:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:148:0x0401 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x0403  */
    /* JADX WARN: Code duplicated, block: B:151:0x0409 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x040b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0414  */
    /* JADX WARN: Code duplicated, block: B:159:0x041b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0449  */
    /* JADX WARN: Code duplicated, block: B:165:0x044c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0453  */
    /* JADX WARN: Code duplicated, block: B:170:0x045a  */
    /* JADX WARN: Code duplicated, block: B:173:0x047a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0488  */
    /* JADX WARN: Code duplicated, block: B:184:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:185:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:187:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:189:0x0519  */
    /* JADX WARN: Code duplicated, block: B:193:0x0524  */
    /* JADX WARN: Code duplicated, block: B:199:0x055a  */
    /* JADX WARN: Code duplicated, block: B:202:0x0570  */
    /* JADX WARN: Code duplicated, block: B:210:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:213:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:215:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:219:0x05f0 A[LOOP:0: B:217:0x05ea->B:219:0x05f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:224:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x0546 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0534 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x03ce A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x0133  */
    /* JADX WARN: Code duplicated, block: B:44:0x013d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0140  */
    /* JADX WARN: Code duplicated, block: B:48:0x0165  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x01d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x020a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x023b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0246  */
    /* JADX WARN: Code duplicated, block: B:85:0x0250  */
    /* JADX WARN: Code duplicated, block: B:86:0x0253  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01b9 -> B:60:0x01cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01c0 -> B:60:0x01cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01c2 -> B:60:0x01cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01f4 -> B:69:0x01fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x02c9 -> B:60:0x01cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x02d1 -> B:60:0x01cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x02d3 -> B:60:0x01cc). Please report as a decompilation issue!!! */
    public final Serializable h(Set set, g83 g83Var, g83 g83Var2, xf5 xf5Var, nq4 nq4Var) {
        q83 q83Var;
        long j;
        LinkedHashMap linkedHashMap;
        q83 q83Var2;
        Iterator it;
        g83 g83Var3;
        g83 g83Var4;
        xf5 xf5Var2;
        je9 je9Var;
        g83 g83Var5;
        g83 g83Var6;
        xf5 xf5Var3;
        Iterator it2;
        long j2;
        d83 d83Var;
        LinkedHashMap linkedHashMap2;
        rt2 rt2Var;
        xf5 xf5Var4;
        long j3;
        long j4;
        boolean z;
        q83 q83Var3;
        boolean z2;
        String str;
        a4c a4cVar;
        LinkedHashMap linkedHashMap3;
        nx2 nx2Var;
        cx2 cx2VarA;
        t83 t83Var;
        hu4 hu4Var;
        q83 q83Var4;
        d83 d83Var2;
        tia tiaVar;
        String string;
        rt2 rt2Var2;
        d83 d83Var3;
        Bitmap bitmap;
        String str2;
        Object objB;
        d83 d83Var4;
        String str3;
        LinkedHashMap linkedHashMap4;
        long jLongValue;
        d83 d83Var5;
        d83 d83Var6;
        t83 t83Var2;
        g83 g83Var7;
        g83 g83Var8;
        hu4 hu4Var2;
        String str4;
        xf5 xf5Var5;
        je9 je9Var2;
        String str5;
        a4c a4cVar2;
        String str6;
        long j5;
        long j6;
        boolean z3;
        boolean z4;
        int i;
        hu4 hu4Var3;
        Long l;
        long jLongValue2;
        d83 d83Var7;
        e83 e83Var;
        List list;
        ArrayList arrayList;
        Iterator it3;
        long j7;
        String str7;
        long j8;
        Bitmap bitmap2;
        long j9;
        Bitmap bitmap3;
        Bitmap bitmap4;
        boolean z5;
        Long l2;
        long jLongValue3;
        String str8;
        String str9;
        a4c a4cVar3;
        tia tiaVar2;
        List list2;
        Iterator it4;
        tia tiaVar3;
        long j10;
        String str10;
        xf5 xf5Var6;
        Object next;
        long jB;
        boolean z6;
        ao6 ao6Var;
        ArrayList arrayList2;
        Iterator it5;
        t83 t83Var3 = this;
        je9 je9Var3 = je9.f;
        je9 je9Var4 = je9.d;
        if (nq4Var instanceof q83) {
            q83Var = (q83) nq4Var;
            int i2 = q83Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q83Var.n = i2 - Integer.MIN_VALUE;
            } else {
                q83Var = new q83(t83Var3, nq4Var);
            }
        } else {
            q83Var = new q83(t83Var3, nq4Var);
        }
        Object obj = q83Var.l;
        hu4 hu4Var4 = hu4.a;
        int i3 = q83Var.n;
        String str11 = " ";
        if (i3 == 0) {
            j = 0;
            ch3.d0(obj);
            if (set.isEmpty()) {
                return s66.a;
            }
            linkedHashMap = new LinkedHashMap(set.size());
            q83Var2 = q83Var;
            it = set.iterator();
            g83Var3 = g83Var;
            g83Var4 = g83Var2;
            xf5Var2 = xf5Var;
            while (true) {
                if (it.hasNext()) {
                    jLongValue = ((Number) it.next()).longValue();
                    d83Var5 = (d83) g83Var3.a.get(new Long(jLongValue));
                    je9Var = je9Var3;
                    d83Var6 = (d83) g83Var4.a.get(new Long(jLongValue));
                    if (d83Var6 != null) {
                        if (d83Var5 != null) {
                        }
                        if (d83Var6 != null) {
                            if (d83Var5 == null) {
                                t83Var2 = t83Var3;
                            } else {
                                xf5Var5 = xf5Var2;
                                str6 = str11;
                                j5 = d83Var5.l;
                                j6 = d83Var6.l;
                                if (j5 >= j6) {
                                    z3 = d83Var5.j;
                                } else {
                                    z3 = d83Var6.j;
                                }
                                z4 = z3;
                                if (j5 >= j6) {
                                    i = d83Var5.i;
                                } else {
                                    i = d83Var6.i;
                                }
                                int i4 = i;
                                Long l3 = new Long(jLongValue);
                                g83Var8 = g83Var4;
                                hu4Var3 = hu4Var4;
                                g83Var7 = g83Var3;
                                l = new Long(d83Var6.a);
                                if (l.longValue() == j) {
                                    l = null;
                                }
                                if (l != null) {
                                    jLongValue2 = l.longValue();
                                } else {
                                    jLongValue2 = d83Var5.a;
                                }
                                long j11 = jLongValue2;
                                String str12 = d83Var6.b;
                                long j12 = d83Var5.c;
                                if (d83Var5.l >= d83Var6.l) {
                                    d83Var7 = d83Var5;
                                } else {
                                    d83Var7 = d83Var6;
                                }
                                String str13 = d83Var7.d;
                                e83Var = d83Var5.e;
                                list = d83Var5.f;
                                List list3 = d83Var6.f;
                                arrayList = new ArrayList(list);
                                it3 = list3.iterator();
                                while (it3.hasNext()) {
                                    Iterator it6 = it3;
                                    tiaVar2 = (tia) it3.next();
                                    e83 e83Var2 = e83Var;
                                    list2 = list;
                                    hu4 hu4Var5 = hu4Var3;
                                    if (list2 instanceof Collection) {
                                        it4 = list2.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                tiaVar3 = (tia) it4.next();
                                                j10 = jLongValue;
                                                str10 = str6;
                                                if (tiaVar3.c == tiaVar2.c) {
                                                }
                                                str6 = str10;
                                                jLongValue = j10;
                                            } else {
                                                j10 = jLongValue;
                                                str10 = str6;
                                                arrayList.add(tiaVar2);
                                            }
                                        }
                                    } else {
                                        it4 = list2.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                tiaVar3 = (tia) it4.next();
                                                j10 = jLongValue;
                                                str10 = str6;
                                                if (tiaVar3.c == tiaVar2.c) {
                                                }
                                                str6 = str10;
                                                jLongValue = j10;
                                            } else {
                                                j10 = jLongValue;
                                                str10 = str6;
                                                arrayList.add(tiaVar2);
                                            }
                                        }
                                    }
                                    it3 = it6;
                                    str6 = str10;
                                    e83Var = e83Var2;
                                    hu4Var3 = hu4Var5;
                                    jLongValue = j10;
                                }
                                e83 e83Var3 = e83Var;
                                hu4Var2 = hu4Var3;
                                j7 = jLongValue;
                                str7 = str6;
                                List listM1 = ww3.M1(ww3.M1(arrayList, new lv5(16)), new lv5(17));
                                j8 = d83Var5.l;
                                bitmap2 = d83Var5.h;
                                j9 = d83Var6.l;
                                bitmap3 = d83Var6.h;
                                if (j8 >= j9) {
                                    if (bitmap3 != null) {
                                        bitmap3.recycle();
                                    }
                                    bitmap4 = bitmap2;
                                } else {
                                    if (bitmap2 != null) {
                                        bitmap2.recycle();
                                    }
                                    bitmap4 = bitmap3;
                                }
                                if (d83Var5.k) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                long jMax = Math.max(d83Var5.l, d83Var6.l);
                                long jMax2 = Math.max(d83Var5.m, d83Var6.m);
                                ArrayList arrayListG1 = ww3.G1(d83Var6.g, d83Var5.g);
                                l2 = new Long(d83Var5.o);
                                if (l2.longValue() == j) {
                                    l2 = null;
                                }
                                if (l2 != null) {
                                    jLongValue3 = l2.longValue();
                                } else {
                                    jLongValue3 = d83Var6.o;
                                }
                                long j13 = jLongValue3;
                                str8 = d83Var6.n;
                                if (str8 == null) {
                                    str8 = d83Var5.n;
                                }
                                linkedHashMap.put(l3, new d83(j11, str12, j12, str13, e83Var3, listM1, arrayListG1, bitmap4, i4, z4, z5, jMax, jMax2, str8, j13));
                                if (cqk.d(d83Var6.d, d83Var5.d)) {
                                    je9Var2 = je9Var;
                                    str4 = str7;
                                } else {
                                    je9Var2 = je9Var;
                                    str4 = str7;
                                }
                                str9 = t83Var3.j;
                                a4cVar3 = gm0.f;
                                if (a4cVar3 == null) {
                                    t83Var2 = t83Var3;
                                } else {
                                    if (a4cVar3.b(je9Var4)) {
                                        long j14 = d83Var5.l;
                                        String strA = snl.a(new Long(j14), new Long(d83Var6.l));
                                        long j15 = d83Var6.l;
                                        String str14 = d83Var6.n;
                                        StringBuilder sbU = qt4.u(j7, "mergeNotificationsMap: chatServerId=", ". \n                    |using both, needNotify=", z4);
                                        qt4.z(j14, ", \n                    |cacheLastNotifiedMessageId=", " \n                    |", sbU);
                                        sbU.append(strA);
                                        sbU.append(" \n                    |fcmLastNotifiedMessageId=");
                                        sbU.append(j15);
                                        sbU.append(",\n                    |fcmPushType:");
                                        sbU.append(str14);
                                        sbU.append("\n                    |");
                                        a4cVar3.c(je9Var4, str9, s5h.y0(sbU.toString()), null);
                                    }
                                    t83Var2 = this;
                                }
                            }
                            g83Var4 = g83Var8;
                            g83Var3 = g83Var7;
                            it = it;
                            t83Var3 = t83Var2;
                            je9Var3 = je9Var2;
                            xf5Var2 = xf5Var5;
                            str11 = str4;
                            q83Var2 = q83Var2;
                            hu4Var4 = hu4Var2;
                        } else {
                            t83Var2 = this;
                        }
                        g83Var7 = g83Var3;
                        g83Var8 = g83Var4;
                        hu4Var2 = hu4Var4;
                        xf5Var5 = xf5Var2;
                        q83Var2 = q83Var2;
                        it = it;
                        je9Var2 = je9Var;
                        str4 = str11;
                        str5 = t83Var2.j;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 == null) {
                            a4cVar2.c(je9Var2, str5, zo5.j(jLongValue, "mergeNotificationsMap: failed, no notification data for chatServerId="), null);
                        }
                        g83Var4 = g83Var8;
                        g83Var3 = g83Var7;
                        it = it;
                        t83Var3 = t83Var2;
                        je9Var3 = je9Var2;
                        xf5Var2 = xf5Var5;
                        str11 = str4;
                        q83Var2 = q83Var2;
                        hu4Var4 = hu4Var2;
                    } else {
                        if (d83Var5 != null) {
                        }
                        if (d83Var6 != null) {
                            if (d83Var5 == null) {
                                t83Var2 = t83Var3;
                            } else {
                                xf5Var5 = xf5Var2;
                                str6 = str11;
                                j5 = d83Var5.l;
                                j6 = d83Var6.l;
                                if (j5 >= j6) {
                                    z3 = d83Var5.j;
                                } else {
                                    z3 = d83Var6.j;
                                }
                                z4 = z3;
                                if (j5 >= j6) {
                                    i = d83Var5.i;
                                } else {
                                    i = d83Var6.i;
                                }
                                int i5 = i;
                                Long l4 = new Long(jLongValue);
                                g83Var8 = g83Var4;
                                hu4Var3 = hu4Var4;
                                g83Var7 = g83Var3;
                                l = new Long(d83Var6.a);
                                if (l.longValue() == j) {
                                    l = null;
                                }
                                if (l != null) {
                                    jLongValue2 = l.longValue();
                                } else {
                                    jLongValue2 = d83Var5.a;
                                }
                                long j16 = jLongValue2;
                                String str15 = d83Var6.b;
                                long j17 = d83Var5.c;
                                if (d83Var5.l >= d83Var6.l) {
                                    d83Var7 = d83Var5;
                                } else {
                                    d83Var7 = d83Var6;
                                }
                                String str16 = d83Var7.d;
                                e83Var = d83Var5.e;
                                list = d83Var5.f;
                                List list4 = d83Var6.f;
                                arrayList = new ArrayList(list);
                                it3 = list4.iterator();
                                while (it3.hasNext()) {
                                    Iterator it7 = it3;
                                    tiaVar2 = (tia) it3.next();
                                    e83 e83Var4 = e83Var;
                                    list2 = list;
                                    hu4 hu4Var6 = hu4Var3;
                                    if (list2 instanceof Collection) {
                                        it4 = list2.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                tiaVar3 = (tia) it4.next();
                                                j10 = jLongValue;
                                                str10 = str6;
                                                if (tiaVar3.c == tiaVar2.c) {
                                                }
                                                str6 = str10;
                                                jLongValue = j10;
                                            } else {
                                                j10 = jLongValue;
                                                str10 = str6;
                                                arrayList.add(tiaVar2);
                                            }
                                        }
                                    } else {
                                        it4 = list2.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                tiaVar3 = (tia) it4.next();
                                                j10 = jLongValue;
                                                str10 = str6;
                                                if (tiaVar3.c == tiaVar2.c) {
                                                }
                                                str6 = str10;
                                                jLongValue = j10;
                                            } else {
                                                j10 = jLongValue;
                                                str10 = str6;
                                                arrayList.add(tiaVar2);
                                            }
                                        }
                                    }
                                    it3 = it7;
                                    str6 = str10;
                                    e83Var = e83Var4;
                                    hu4Var3 = hu4Var6;
                                    jLongValue = j10;
                                }
                                e83 e83Var5 = e83Var;
                                hu4Var2 = hu4Var3;
                                j7 = jLongValue;
                                str7 = str6;
                                List listM2 = ww3.M1(ww3.M1(arrayList, new lv5(16)), new lv5(17));
                                j8 = d83Var5.l;
                                bitmap2 = d83Var5.h;
                                j9 = d83Var6.l;
                                bitmap3 = d83Var6.h;
                                if (j8 >= j9) {
                                    if (bitmap3 != null) {
                                        bitmap3.recycle();
                                    }
                                    bitmap4 = bitmap2;
                                } else {
                                    if (bitmap2 != null) {
                                        bitmap2.recycle();
                                    }
                                    bitmap4 = bitmap3;
                                }
                                if (d83Var5.k) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                long jMax3 = Math.max(d83Var5.l, d83Var6.l);
                                long jMax4 = Math.max(d83Var5.m, d83Var6.m);
                                ArrayList arrayListG2 = ww3.G1(d83Var6.g, d83Var5.g);
                                l2 = new Long(d83Var5.o);
                                if (l2.longValue() == j) {
                                    l2 = null;
                                }
                                if (l2 != null) {
                                    jLongValue3 = l2.longValue();
                                } else {
                                    jLongValue3 = d83Var6.o;
                                }
                                long j18 = jLongValue3;
                                str8 = d83Var6.n;
                                if (str8 == null) {
                                    str8 = d83Var5.n;
                                }
                                linkedHashMap.put(l4, new d83(j16, str15, j17, str16, e83Var5, listM2, arrayListG2, bitmap4, i5, z4, z5, jMax3, jMax4, str8, j18));
                                if (cqk.d(d83Var6.d, d83Var5.d)) {
                                    je9Var2 = je9Var;
                                    str4 = str7;
                                } else {
                                    je9Var2 = je9Var;
                                    str4 = str7;
                                }
                                str9 = t83Var3.j;
                                a4cVar3 = gm0.f;
                                if (a4cVar3 == null) {
                                    t83Var2 = t83Var3;
                                } else {
                                    if (a4cVar3.b(je9Var4)) {
                                        long j19 = d83Var5.l;
                                        String strA2 = snl.a(new Long(j19), new Long(d83Var6.l));
                                        long j110 = d83Var6.l;
                                        String str17 = d83Var6.n;
                                        StringBuilder sbU2 = qt4.u(j7, "mergeNotificationsMap: chatServerId=", ". \n                    |using both, needNotify=", z4);
                                        qt4.z(j19, ", \n                    |cacheLastNotifiedMessageId=", " \n                    |", sbU2);
                                        sbU2.append(strA2);
                                        sbU2.append(" \n                    |fcmLastNotifiedMessageId=");
                                        sbU2.append(j110);
                                        sbU2.append(",\n                    |fcmPushType:");
                                        sbU2.append(str17);
                                        sbU2.append("\n                    |");
                                        a4cVar3.c(je9Var4, str9, s5h.y0(sbU2.toString()), null);
                                    }
                                    t83Var2 = this;
                                }
                            }
                            g83Var4 = g83Var8;
                            g83Var3 = g83Var7;
                            it = it;
                            t83Var3 = t83Var2;
                            je9Var3 = je9Var2;
                            xf5Var2 = xf5Var5;
                            str11 = str4;
                            q83Var2 = q83Var2;
                            hu4Var4 = hu4Var2;
                        } else {
                            t83Var2 = this;
                        }
                        g83Var7 = g83Var3;
                        g83Var8 = g83Var4;
                        hu4Var2 = hu4Var4;
                        xf5Var5 = xf5Var2;
                        q83Var2 = q83Var2;
                        it = it;
                        je9Var2 = je9Var;
                        str4 = str11;
                        str5 = t83Var2.j;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 == null) {
                            a4cVar2.c(je9Var2, str5, zo5.j(jLongValue, "mergeNotificationsMap: failed, no notification data for chatServerId="), null);
                        }
                        g83Var4 = g83Var8;
                        g83Var3 = g83Var7;
                        it = it;
                        t83Var3 = t83Var2;
                        je9Var3 = je9Var2;
                        xf5Var2 = xf5Var5;
                        str11 = str4;
                        q83Var2 = q83Var2;
                        hu4Var4 = hu4Var2;
                    }
                    return hu4Var4;
                }
                t83Var = t83Var3;
                hu4Var = hu4Var4;
                q83Var4 = q83Var2;
                d83Var2 = (d83) linkedHashMap.get(new Long(j));
                if (d83Var2 != null) {
                    long jT = t83Var.f().a.t();
                    tiaVar = (tia) ww3.D1(d83Var2.f);
                    if (tiaVar != null) {
                        string = t83Var.a.getString(R.string.tt_scheduled_reminder_title);
                        rt2Var2 = (rt2) ((mjg) ((xn3) t83Var.f.getValue()).s()).getValue();
                        if (rt2Var2 != null) {
                            v4c v4cVar = (v4c) t83Var.h.getValue();
                            q83Var4.d = null;
                            q83Var4.e = null;
                            q83Var4.f = null;
                            q83Var4.g = linkedHashMap;
                            q83Var4.h = d83Var2;
                            q83Var4.i = string;
                            q83Var4.j = null;
                            q83Var4.n = 3;
                            objB = v4cVar.b(rt2Var2, q83Var4);
                            if (objB == hu4Var) {
                                return hu4Var;
                            }
                            d83Var4 = d83Var2;
                            str3 = string;
                            obj = objB;
                            linkedHashMap4 = linkedHashMap;
                        } else {
                            d83Var3 = d83Var2;
                            bitmap = null;
                            str2 = string;
                        }
                        List list5 = d83Var3.f;
                        arrayList2 = new ArrayList(yw3.W0(list5, 10));
                        for (it5 = list5.iterator(); it5.hasNext(); it5 = it5) {
                            tia tiaVar4 = (tia) it5.next();
                            arrayList2.add(new tia(tiaVar4.a, tiaVar4.b, tiaVar4.c, tiaVar4.d, tiaVar4.e, str2, tiaVar4.g, bitmap, tiaVar4.i, tiaVar4.j, tiaVar4.k, tiaVar4.l, tiaVar4.m, tiaVar4.n, tiaVar4.o, tiaVar4.p, tiaVar4.q));
                        }
                        linkedHashMap.put(new Long(0L), d83.a(d83Var3, str2, arrayList2, null, bitmap, false, 65367));
                    }
                }
                return linkedHashMap;
            }
        }
        if (i3 == 1) {
            j = 0;
            j2 = q83Var.k;
            d83Var = q83Var.j;
            it2 = (Iterator) q83Var.h;
            LinkedHashMap linkedHashMap5 = q83Var.g;
            xf5Var3 = q83Var.f;
            g83Var6 = q83Var.e;
            g83Var5 = q83Var.d;
            ch3.d0(obj);
            je9Var = je9Var3;
            linkedHashMap2 = linkedHashMap5;
            rt2Var = (rt2) obj;
            xf5Var4 = xf5Var3;
            j3 = d83Var.l;
            if (rt2Var != null) {
                j4 = -1;
            } else {
                j4 = -1;
            }
            if (j3 > j4) {
                z = true;
            } else {
                z = false;
            }
            q83Var3 = q83Var;
            z2 = z;
            linkedHashMap2.put(new Long(j2), d83.a(d83Var, null, null, null, null, z, 65023));
            str = t83Var3.j;
            a4cVar = gm0.f;
            if (a4cVar == null) {
                linkedHashMap3 = linkedHashMap2;
                it = it2;
                xf5Var2 = xf5Var4;
                g83Var4 = g83Var6;
                g83Var3 = g83Var5;
                q83Var2 = q83Var3;
            } else {
                linkedHashMap3 = linkedHashMap2;
                it = it2;
                String strA3 = snl.a(new Long(j3), new Long(j4));
                StringBuilder sbU3 = qt4.u(j2, "mergeNotificationsMap: chatServerId=", ". using fcmNotification, needNotify=", z2);
                qt4.z(j3, ", fcmLastNotifiedMessageId=", str11, sbU3);
                sbU3.append(strA3);
                sbU3.append(" cacheLastNotifiedMessageId=");
                sbU3.append(j4);
                a4cVar.c(je9Var4, str, sbU3.toString(), null);
                xf5Var2 = xf5Var4;
                g83Var4 = g83Var6;
                g83Var3 = g83Var5;
                q83Var2 = q83Var3;
            }
            linkedHashMap = linkedHashMap3;
            it = it;
            je9Var3 = je9Var;
            while (true) {
                if (it.hasNext()) {
                    jLongValue = ((Number) it.next()).longValue();
                    d83Var5 = (d83) g83Var3.a.get(new Long(jLongValue));
                    je9Var = je9Var3;
                    d83Var6 = (d83) g83Var4.a.get(new Long(jLongValue));
                    if (d83Var6 != null) {
                        if (d83Var5 != null) {
                        }
                        if (d83Var6 != null) {
                            if (d83Var5 == null) {
                                t83Var2 = t83Var3;
                            } else {
                                xf5Var5 = xf5Var2;
                                str6 = str11;
                                j5 = d83Var5.l;
                                j6 = d83Var6.l;
                                if (j5 >= j6) {
                                    z3 = d83Var5.j;
                                } else {
                                    z3 = d83Var6.j;
                                }
                                z4 = z3;
                                if (j5 >= j6) {
                                    i = d83Var5.i;
                                } else {
                                    i = d83Var6.i;
                                }
                                int i6 = i;
                                Long l5 = new Long(jLongValue);
                                g83Var8 = g83Var4;
                                hu4Var3 = hu4Var4;
                                g83Var7 = g83Var3;
                                l = new Long(d83Var6.a);
                                if (l.longValue() == j) {
                                    l = null;
                                }
                                if (l != null) {
                                    jLongValue2 = l.longValue();
                                } else {
                                    jLongValue2 = d83Var5.a;
                                }
                                long j111 = jLongValue2;
                                String str18 = d83Var6.b;
                                long j112 = d83Var5.c;
                                if (d83Var5.l >= d83Var6.l) {
                                    d83Var7 = d83Var5;
                                } else {
                                    d83Var7 = d83Var6;
                                }
                                String str19 = d83Var7.d;
                                e83Var = d83Var5.e;
                                list = d83Var5.f;
                                List list6 = d83Var6.f;
                                arrayList = new ArrayList(list);
                                it3 = list6.iterator();
                                while (it3.hasNext()) {
                                    Iterator it8 = it3;
                                    tiaVar2 = (tia) it3.next();
                                    e83 e83Var6 = e83Var;
                                    list2 = list;
                                    hu4 hu4Var7 = hu4Var3;
                                    if (list2 instanceof Collection) {
                                        it4 = list2.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                tiaVar3 = (tia) it4.next();
                                                j10 = jLongValue;
                                                str10 = str6;
                                                if (tiaVar3.c == tiaVar2.c) {
                                                }
                                                str6 = str10;
                                                jLongValue = j10;
                                            } else {
                                                j10 = jLongValue;
                                                str10 = str6;
                                                arrayList.add(tiaVar2);
                                            }
                                        }
                                    } else {
                                        it4 = list2.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                tiaVar3 = (tia) it4.next();
                                                j10 = jLongValue;
                                                str10 = str6;
                                                if (tiaVar3.c == tiaVar2.c) {
                                                }
                                                str6 = str10;
                                                jLongValue = j10;
                                            } else {
                                                j10 = jLongValue;
                                                str10 = str6;
                                                arrayList.add(tiaVar2);
                                            }
                                        }
                                    }
                                    it3 = it8;
                                    str6 = str10;
                                    e83Var = e83Var6;
                                    hu4Var3 = hu4Var7;
                                    jLongValue = j10;
                                }
                                e83 e83Var7 = e83Var;
                                hu4Var2 = hu4Var3;
                                j7 = jLongValue;
                                str7 = str6;
                                List listM3 = ww3.M1(ww3.M1(arrayList, new lv5(16)), new lv5(17));
                                j8 = d83Var5.l;
                                bitmap2 = d83Var5.h;
                                j9 = d83Var6.l;
                                bitmap3 = d83Var6.h;
                                if (j8 >= j9) {
                                    if (bitmap3 != null) {
                                        bitmap3.recycle();
                                    }
                                    bitmap4 = bitmap2;
                                } else {
                                    if (bitmap2 != null) {
                                        bitmap2.recycle();
                                    }
                                    bitmap4 = bitmap3;
                                }
                                if (d83Var5.k) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                long jMax5 = Math.max(d83Var5.l, d83Var6.l);
                                long jMax6 = Math.max(d83Var5.m, d83Var6.m);
                                ArrayList arrayListG3 = ww3.G1(d83Var6.g, d83Var5.g);
                                l2 = new Long(d83Var5.o);
                                if (l2.longValue() == j) {
                                    l2 = null;
                                }
                                if (l2 != null) {
                                    jLongValue3 = l2.longValue();
                                } else {
                                    jLongValue3 = d83Var6.o;
                                }
                                long j113 = jLongValue3;
                                str8 = d83Var6.n;
                                if (str8 == null) {
                                    str8 = d83Var5.n;
                                }
                                linkedHashMap.put(l5, new d83(j111, str18, j112, str19, e83Var7, listM3, arrayListG3, bitmap4, i6, z4, z5, jMax5, jMax6, str8, j113));
                                if (cqk.d(d83Var6.d, d83Var5.d)) {
                                    je9Var2 = je9Var;
                                    str4 = str7;
                                } else {
                                    je9Var2 = je9Var;
                                    str4 = str7;
                                }
                                str9 = t83Var3.j;
                                a4cVar3 = gm0.f;
                                if (a4cVar3 == null) {
                                    t83Var2 = t83Var3;
                                } else {
                                    if (a4cVar3.b(je9Var4)) {
                                        long j114 = d83Var5.l;
                                        String strA4 = snl.a(new Long(j114), new Long(d83Var6.l));
                                        long j115 = d83Var6.l;
                                        String str110 = d83Var6.n;
                                        StringBuilder sbU4 = qt4.u(j7, "mergeNotificationsMap: chatServerId=", ". \n                    |using both, needNotify=", z4);
                                        qt4.z(j114, ", \n                    |cacheLastNotifiedMessageId=", " \n                    |", sbU4);
                                        sbU4.append(strA4);
                                        sbU4.append(" \n                    |fcmLastNotifiedMessageId=");
                                        sbU4.append(j115);
                                        sbU4.append(",\n                    |fcmPushType:");
                                        sbU4.append(str110);
                                        sbU4.append("\n                    |");
                                        a4cVar3.c(je9Var4, str9, s5h.y0(sbU4.toString()), null);
                                    }
                                    t83Var2 = this;
                                }
                            }
                            g83Var4 = g83Var8;
                            g83Var3 = g83Var7;
                            it = it;
                            t83Var3 = t83Var2;
                            je9Var3 = je9Var2;
                            xf5Var2 = xf5Var5;
                            str11 = str4;
                            q83Var2 = q83Var2;
                            hu4Var4 = hu4Var2;
                        } else {
                            t83Var2 = this;
                        }
                        g83Var7 = g83Var3;
                        g83Var8 = g83Var4;
                        hu4Var2 = hu4Var4;
                        xf5Var5 = xf5Var2;
                        q83Var2 = q83Var2;
                        it = it;
                        je9Var2 = je9Var;
                        str4 = str11;
                        str5 = t83Var2.j;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 == null) {
                            a4cVar2.c(je9Var2, str5, zo5.j(jLongValue, "mergeNotificationsMap: failed, no notification data for chatServerId="), null);
                        }
                        g83Var4 = g83Var8;
                        g83Var3 = g83Var7;
                        it = it;
                        t83Var3 = t83Var2;
                        je9Var3 = je9Var2;
                        xf5Var2 = xf5Var5;
                        str11 = str4;
                        q83Var2 = q83Var2;
                        hu4Var4 = hu4Var2;
                    } else {
                        if (d83Var5 != null) {
                        }
                        if (d83Var6 != null) {
                            if (d83Var5 == null) {
                                t83Var2 = t83Var3;
                            } else {
                                xf5Var5 = xf5Var2;
                                str6 = str11;
                                j5 = d83Var5.l;
                                j6 = d83Var6.l;
                                if (j5 >= j6) {
                                    z3 = d83Var5.j;
                                } else {
                                    z3 = d83Var6.j;
                                }
                                z4 = z3;
                                if (j5 >= j6) {
                                    i = d83Var5.i;
                                } else {
                                    i = d83Var6.i;
                                }
                                int i7 = i;
                                Long l6 = new Long(jLongValue);
                                g83Var8 = g83Var4;
                                hu4Var3 = hu4Var4;
                                g83Var7 = g83Var3;
                                l = new Long(d83Var6.a);
                                if (l.longValue() == j) {
                                    l = null;
                                }
                                if (l != null) {
                                    jLongValue2 = l.longValue();
                                } else {
                                    jLongValue2 = d83Var5.a;
                                }
                                long j116 = jLongValue2;
                                String str111 = d83Var6.b;
                                long j117 = d83Var5.c;
                                if (d83Var5.l >= d83Var6.l) {
                                    d83Var7 = d83Var5;
                                } else {
                                    d83Var7 = d83Var6;
                                }
                                String str112 = d83Var7.d;
                                e83Var = d83Var5.e;
                                list = d83Var5.f;
                                List list7 = d83Var6.f;
                                arrayList = new ArrayList(list);
                                it3 = list7.iterator();
                                while (it3.hasNext()) {
                                    Iterator it9 = it3;
                                    tiaVar2 = (tia) it3.next();
                                    e83 e83Var8 = e83Var;
                                    list2 = list;
                                    hu4 hu4Var8 = hu4Var3;
                                    if (list2 instanceof Collection) {
                                        it4 = list2.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                tiaVar3 = (tia) it4.next();
                                                j10 = jLongValue;
                                                str10 = str6;
                                                if (tiaVar3.c == tiaVar2.c) {
                                                }
                                                str6 = str10;
                                                jLongValue = j10;
                                            } else {
                                                j10 = jLongValue;
                                                str10 = str6;
                                                arrayList.add(tiaVar2);
                                            }
                                        }
                                    } else {
                                        it4 = list2.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                tiaVar3 = (tia) it4.next();
                                                j10 = jLongValue;
                                                str10 = str6;
                                                if (tiaVar3.c == tiaVar2.c) {
                                                }
                                                str6 = str10;
                                                jLongValue = j10;
                                            } else {
                                                j10 = jLongValue;
                                                str10 = str6;
                                                arrayList.add(tiaVar2);
                                            }
                                        }
                                    }
                                    it3 = it9;
                                    str6 = str10;
                                    e83Var = e83Var8;
                                    hu4Var3 = hu4Var8;
                                    jLongValue = j10;
                                }
                                e83 e83Var9 = e83Var;
                                hu4Var2 = hu4Var3;
                                j7 = jLongValue;
                                str7 = str6;
                                List listM4 = ww3.M1(ww3.M1(arrayList, new lv5(16)), new lv5(17));
                                j8 = d83Var5.l;
                                bitmap2 = d83Var5.h;
                                j9 = d83Var6.l;
                                bitmap3 = d83Var6.h;
                                if (j8 >= j9) {
                                    if (bitmap3 != null) {
                                        bitmap3.recycle();
                                    }
                                    bitmap4 = bitmap2;
                                } else {
                                    if (bitmap2 != null) {
                                        bitmap2.recycle();
                                    }
                                    bitmap4 = bitmap3;
                                }
                                if (d83Var5.k) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                long jMax7 = Math.max(d83Var5.l, d83Var6.l);
                                long jMax8 = Math.max(d83Var5.m, d83Var6.m);
                                ArrayList arrayListG4 = ww3.G1(d83Var6.g, d83Var5.g);
                                l2 = new Long(d83Var5.o);
                                if (l2.longValue() == j) {
                                    l2 = null;
                                }
                                if (l2 != null) {
                                    jLongValue3 = l2.longValue();
                                } else {
                                    jLongValue3 = d83Var6.o;
                                }
                                long j118 = jLongValue3;
                                str8 = d83Var6.n;
                                if (str8 == null) {
                                    str8 = d83Var5.n;
                                }
                                linkedHashMap.put(l6, new d83(j116, str111, j117, str112, e83Var9, listM4, arrayListG4, bitmap4, i7, z4, z5, jMax7, jMax8, str8, j118));
                                if (cqk.d(d83Var6.d, d83Var5.d)) {
                                    je9Var2 = je9Var;
                                    str4 = str7;
                                } else {
                                    je9Var2 = je9Var;
                                    str4 = str7;
                                }
                                str9 = t83Var3.j;
                                a4cVar3 = gm0.f;
                                if (a4cVar3 == null) {
                                    t83Var2 = t83Var3;
                                } else {
                                    if (a4cVar3.b(je9Var4)) {
                                        long j119 = d83Var5.l;
                                        String strA5 = snl.a(new Long(j119), new Long(d83Var6.l));
                                        long j1110 = d83Var6.l;
                                        String str113 = d83Var6.n;
                                        StringBuilder sbU5 = qt4.u(j7, "mergeNotificationsMap: chatServerId=", ". \n                    |using both, needNotify=", z4);
                                        qt4.z(j119, ", \n                    |cacheLastNotifiedMessageId=", " \n                    |", sbU5);
                                        sbU5.append(strA5);
                                        sbU5.append(" \n                    |fcmLastNotifiedMessageId=");
                                        sbU5.append(j1110);
                                        sbU5.append(",\n                    |fcmPushType:");
                                        sbU5.append(str113);
                                        sbU5.append("\n                    |");
                                        a4cVar3.c(je9Var4, str9, s5h.y0(sbU5.toString()), null);
                                    }
                                    t83Var2 = this;
                                }
                            }
                            g83Var4 = g83Var8;
                            g83Var3 = g83Var7;
                            it = it;
                            t83Var3 = t83Var2;
                            je9Var3 = je9Var2;
                            xf5Var2 = xf5Var5;
                            str11 = str4;
                            q83Var2 = q83Var2;
                            hu4Var4 = hu4Var2;
                        } else {
                            t83Var2 = this;
                        }
                        g83Var7 = g83Var3;
                        g83Var8 = g83Var4;
                        hu4Var2 = hu4Var4;
                        xf5Var5 = xf5Var2;
                        q83Var2 = q83Var2;
                        it = it;
                        je9Var2 = je9Var;
                        str4 = str11;
                        str5 = t83Var2.j;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 == null) {
                            a4cVar2.c(je9Var2, str5, zo5.j(jLongValue, "mergeNotificationsMap: failed, no notification data for chatServerId="), null);
                        }
                        g83Var4 = g83Var8;
                        g83Var3 = g83Var7;
                        it = it;
                        t83Var3 = t83Var2;
                        je9Var3 = je9Var2;
                        xf5Var2 = xf5Var5;
                        str11 = str4;
                        q83Var2 = q83Var2;
                        hu4Var4 = hu4Var2;
                    }
                    return hu4Var4;
                }
                t83Var = t83Var3;
                hu4Var = hu4Var4;
                q83Var4 = q83Var2;
                d83Var2 = (d83) linkedHashMap.get(new Long(j));
                if (d83Var2 != null) {
                    long jT2 = t83Var.f().a.t();
                    tiaVar = (tia) ww3.D1(d83Var2.f);
                    if (tiaVar != null) {
                        string = t83Var.a.getString(R.string.tt_scheduled_reminder_title);
                        rt2Var2 = (rt2) ((mjg) ((xn3) t83Var.f.getValue()).s()).getValue();
                        if (rt2Var2 != null) {
                            v4c v4cVar2 = (v4c) t83Var.h.getValue();
                            q83Var4.d = null;
                            q83Var4.e = null;
                            q83Var4.f = null;
                            q83Var4.g = linkedHashMap;
                            q83Var4.h = d83Var2;
                            q83Var4.i = string;
                            q83Var4.j = null;
                            q83Var4.n = 3;
                            objB = v4cVar2.b(rt2Var2, q83Var4);
                            if (objB == hu4Var) {
                                return hu4Var;
                            }
                            d83Var4 = d83Var2;
                            str3 = string;
                            obj = objB;
                            linkedHashMap4 = linkedHashMap;
                        } else {
                            d83Var3 = d83Var2;
                            bitmap = null;
                            str2 = string;
                        }
                        List list8 = d83Var3.f;
                        arrayList2 = new ArrayList(yw3.W0(list8, 10));
                        while (it5.hasNext()) {
                            tia tiaVar5 = (tia) it5.next();
                            arrayList2.add(new tia(tiaVar5.a, tiaVar5.b, tiaVar5.c, tiaVar5.d, tiaVar5.e, str2, tiaVar5.g, bitmap, tiaVar5.i, tiaVar5.j, tiaVar5.k, tiaVar5.l, tiaVar5.m, tiaVar5.n, tiaVar5.o, tiaVar5.p, tiaVar5.q));
                        }
                        linkedHashMap.put(new Long(0L), d83.a(d83Var3, str2, arrayList2, null, bitmap, false, 65367));
                    }
                }
                return linkedHashMap;
            }
        }
        if (i3 == 2) {
            j = 0;
            jLongValue = q83Var.k;
            d83 d83Var8 = (d83) q83Var.i;
            it = (Iterator) q83Var.h;
            linkedHashMap3 = q83Var.g;
            xf5 xf5Var7 = q83Var.f;
            g83 g83Var9 = q83Var.e;
            g83 g83Var10 = q83Var.d;
            ch3.d0(obj);
            je9Var = je9Var3;
            xf5 xf5Var8 = xf5Var7;
            Iterator it10 = ((Iterable) obj).iterator();
            while (true) {
                if (it10.hasNext()) {
                    xf5Var6 = xf5Var8;
                    next = null;
                    break;
                }
                next = it10.next();
                ao6Var = (ao6) next;
                Iterator it11 = it10;
                xf5Var6 = xf5Var8;
                if (ao6Var.a().a != jLongValue && ao6Var.a().a()) {
                    break;
                }
                xf5Var8 = xf5Var6;
                it10 = it11;
            }
            ao6 ao6Var2 = (ao6) next;
            long j20 = d83Var8.l;
            if (ao6Var2 != null) {
                jB = ao6Var2.b();
            } else {
                jB = -1;
            }
            if (j20 > jB) {
                z6 = true;
            } else {
                z6 = false;
            }
            q83 q83Var5 = q83Var;
            boolean z7 = z6;
            linkedHashMap3.put(new Long(jLongValue), d83.a(d83Var8, null, null, null, null, z6, 65023));
            String str20 = t83Var3.j;
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var4)) {
                String strA6 = snl.a(new Long(j20), new Long(jB));
                StringBuilder sbU6 = qt4.u(jLongValue, "mergeNotificationsMap: chatServerId=", ". using cacheNotification, needNotify=", z7);
                qt4.z(j20, ", cacheLastNotifiedMessageId=", str11, sbU6);
                sbU6.append(strA6);
                sbU6.append(" fcmLastNotifiedMessageId=");
                sbU6.append(jB);
                a4cVar4.c(je9Var4, str20, sbU6.toString(), null);
            }
            xf5Var2 = xf5Var6;
            g83Var4 = g83Var9;
            g83Var3 = g83Var10;
            q83Var2 = q83Var5;
            linkedHashMap = linkedHashMap3;
            it = it;
            je9Var3 = je9Var;
            while (true) {
                if (it.hasNext()) {
                    jLongValue = ((Number) it.next()).longValue();
                    d83Var5 = (d83) g83Var3.a.get(new Long(jLongValue));
                    je9Var = je9Var3;
                    d83Var6 = (d83) g83Var4.a.get(new Long(jLongValue));
                    if (d83Var6 != null || d83Var5 != null) {
                        if (d83Var5 != null || d83Var6 != null) {
                            if (d83Var6 != null) {
                                if (d83Var5 == null) {
                                    t83Var2 = t83Var3;
                                } else {
                                    xf5Var5 = xf5Var2;
                                    str6 = str11;
                                    j5 = d83Var5.l;
                                    j6 = d83Var6.l;
                                    if (j5 >= j6) {
                                        z3 = d83Var5.j;
                                    } else {
                                        z3 = d83Var6.j;
                                    }
                                    z4 = z3;
                                    if (j5 >= j6) {
                                        i = d83Var5.i;
                                    } else {
                                        i = d83Var6.i;
                                    }
                                    int i8 = i;
                                    Long l7 = new Long(jLongValue);
                                    g83Var8 = g83Var4;
                                    hu4Var3 = hu4Var4;
                                    g83Var7 = g83Var3;
                                    l = new Long(d83Var6.a);
                                    if (l.longValue() == j) {
                                        l = null;
                                    }
                                    if (l != null) {
                                        jLongValue2 = l.longValue();
                                    } else {
                                        jLongValue2 = d83Var5.a;
                                    }
                                    long j1111 = jLongValue2;
                                    String str114 = d83Var6.b;
                                    long j1112 = d83Var5.c;
                                    if (d83Var5.l >= d83Var6.l) {
                                        d83Var7 = d83Var5;
                                    } else {
                                        d83Var7 = d83Var6;
                                    }
                                    String str115 = d83Var7.d;
                                    e83Var = d83Var5.e;
                                    list = d83Var5.f;
                                    List list9 = d83Var6.f;
                                    arrayList = new ArrayList(list);
                                    it3 = list9.iterator();
                                    while (it3.hasNext()) {
                                        Iterator it12 = it3;
                                        tiaVar2 = (tia) it3.next();
                                        e83 e83Var10 = e83Var;
                                        list2 = list;
                                        hu4 hu4Var9 = hu4Var3;
                                        if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    tiaVar3 = (tia) it4.next();
                                                    j10 = jLongValue;
                                                    str10 = str6;
                                                    if (tiaVar3.c == tiaVar2.c || tiaVar3.e != tiaVar2.e) {
                                                        str6 = str10;
                                                        jLongValue = j10;
                                                    } else {
                                                        Bitmap bitmap5 = tiaVar2.h;
                                                        if (bitmap5 != null) {
                                                            bitmap5.recycle();
                                                        }
                                                    }
                                                } else {
                                                    j10 = jLongValue;
                                                    str10 = str6;
                                                    arrayList.add(tiaVar2);
                                                }
                                            }
                                        } else {
                                            j10 = jLongValue;
                                            str10 = str6;
                                            arrayList.add(tiaVar2);
                                        }
                                        it3 = it12;
                                        str6 = str10;
                                        e83Var = e83Var10;
                                        hu4Var3 = hu4Var9;
                                        jLongValue = j10;
                                    }
                                    e83 e83Var11 = e83Var;
                                    hu4Var2 = hu4Var3;
                                    j7 = jLongValue;
                                    str7 = str6;
                                    List listM5 = ww3.M1(ww3.M1(arrayList, new lv5(16)), new lv5(17));
                                    j8 = d83Var5.l;
                                    bitmap2 = d83Var5.h;
                                    j9 = d83Var6.l;
                                    bitmap3 = d83Var6.h;
                                    if (j8 >= j9) {
                                        if (bitmap3 != null) {
                                            bitmap3.recycle();
                                        }
                                        bitmap4 = bitmap2;
                                    } else {
                                        if (bitmap2 != null) {
                                            bitmap2.recycle();
                                        }
                                        bitmap4 = bitmap3;
                                    }
                                    if (d83Var5.k || !d83Var6.k) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    long jMax9 = Math.max(d83Var5.l, d83Var6.l);
                                    long jMax10 = Math.max(d83Var5.m, d83Var6.m);
                                    ArrayList arrayListG5 = ww3.G1(d83Var6.g, d83Var5.g);
                                    l2 = new Long(d83Var5.o);
                                    if (l2.longValue() == j) {
                                        l2 = null;
                                    }
                                    if (l2 != null) {
                                        jLongValue3 = l2.longValue();
                                    } else {
                                        jLongValue3 = d83Var6.o;
                                    }
                                    long j1113 = jLongValue3;
                                    str8 = d83Var6.n;
                                    if (str8 == null) {
                                        str8 = d83Var5.n;
                                    }
                                    linkedHashMap.put(l7, new d83(j1111, str114, j1112, str115, e83Var11, listM5, arrayListG5, bitmap4, i8, z4, z5, jMax9, jMax10, str8, j1113));
                                    if (cqk.d(d83Var6.d, d83Var5.d) || d83Var6.c == d83Var5.c) {
                                        je9Var2 = je9Var;
                                        str4 = str7;
                                    } else {
                                        String str21 = t83Var3.j;
                                        a4c a4cVar5 = gm0.f;
                                        if (a4cVar5 == null) {
                                            je9Var2 = je9Var;
                                            str4 = str7;
                                        } else {
                                            je9Var2 = je9Var;
                                            if (a4cVar5.b(je9Var2)) {
                                                long j21 = d83Var6.c;
                                                long j22 = d83Var5.c;
                                                str4 = str7;
                                                StringBuilder sbS = qt4.s(j21, "WTF, how this possible fcmServerId:", " != cacheServerId:");
                                                sbS.append(j22);
                                                a4cVar5.c(je9Var2, str21, sbS.toString(), null);
                                            } else {
                                                str4 = str7;
                                            }
                                        }
                                    }
                                    str9 = t83Var3.j;
                                    a4cVar3 = gm0.f;
                                    if (a4cVar3 == null) {
                                        t83Var2 = t83Var3;
                                    } else {
                                        if (a4cVar3.b(je9Var4)) {
                                            long j1114 = d83Var5.l;
                                            String strA7 = snl.a(new Long(j1114), new Long(d83Var6.l));
                                            long j1115 = d83Var6.l;
                                            String str116 = d83Var6.n;
                                            StringBuilder sbU7 = qt4.u(j7, "mergeNotificationsMap: chatServerId=", ". \n                    |using both, needNotify=", z4);
                                            qt4.z(j1114, ", \n                    |cacheLastNotifiedMessageId=", " \n                    |", sbU7);
                                            sbU7.append(strA7);
                                            sbU7.append(" \n                    |fcmLastNotifiedMessageId=");
                                            sbU7.append(j1115);
                                            sbU7.append(",\n                    |fcmPushType:");
                                            sbU7.append(str116);
                                            sbU7.append("\n                    |");
                                            a4cVar3.c(je9Var4, str9, s5h.y0(sbU7.toString()), null);
                                        }
                                        t83Var2 = this;
                                    }
                                }
                                g83Var4 = g83Var8;
                                g83Var3 = g83Var7;
                                it = it;
                                t83Var3 = t83Var2;
                                je9Var3 = je9Var2;
                                xf5Var2 = xf5Var5;
                                str11 = str4;
                                q83Var2 = q83Var2;
                                hu4Var4 = hu4Var2;
                            } else {
                                t83Var2 = this;
                            }
                            g83Var7 = g83Var3;
                            g83Var8 = g83Var4;
                            hu4Var2 = hu4Var4;
                            xf5Var5 = xf5Var2;
                            q83Var2 = q83Var2;
                            it = it;
                            je9Var2 = je9Var;
                            str4 = str11;
                            str5 = t83Var2.j;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 == null && a4cVar2.b(je9Var2)) {
                                a4cVar2.c(je9Var2, str5, zo5.j(jLongValue, "mergeNotificationsMap: failed, no notification data for chatServerId="), null);
                            }
                            g83Var4 = g83Var8;
                            g83Var3 = g83Var7;
                            it = it;
                            t83Var3 = t83Var2;
                            je9Var3 = je9Var2;
                            xf5Var2 = xf5Var5;
                            str11 = str4;
                            q83Var2 = q83Var2;
                            hu4Var4 = hu4Var2;
                        } else if (d83Var5.j) {
                            q83Var2.d = g83Var3;
                            q83Var2.e = g83Var4;
                            q83Var2.f = xf5Var2;
                            q83Var2.g = linkedHashMap;
                            q83Var2.h = it;
                            q83Var2.i = d83Var5;
                            q83Var2.j = null;
                            q83Var2.k = jLongValue;
                            q83Var2.n = 2;
                            Object objZ0 = xf5Var2.z0(q83Var2);
                            if (objZ0 != hu4Var4) {
                                q83 q83Var6 = q83Var2;
                                g83Var10 = g83Var3;
                                obj = objZ0;
                                xf5Var8 = xf5Var2;
                                d83Var8 = d83Var5;
                                linkedHashMap3 = linkedHashMap;
                                g83Var9 = g83Var4;
                                q83Var = q83Var6;
                                Iterator it13 = ((Iterable) obj).iterator();
                                while (true) {
                                    if (it13.hasNext()) {
                                        xf5Var6 = xf5Var8;
                                        next = null;
                                        break;
                                    }
                                    next = it13.next();
                                    ao6Var = (ao6) next;
                                    Iterator it14 = it13;
                                    xf5Var6 = xf5Var8;
                                    if (ao6Var.a().a != jLongValue) {
                                    }
                                    xf5Var8 = xf5Var6;
                                    it13 = it14;
                                }
                                ao6 ao6Var3 = (ao6) next;
                                long j23 = d83Var8.l;
                                if (ao6Var3 != null) {
                                    jB = ao6Var3.b();
                                } else {
                                    jB = -1;
                                }
                                if (j23 > jB) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                q83 q83Var7 = q83Var;
                                boolean z8 = z6;
                                linkedHashMap3.put(new Long(jLongValue), d83.a(d83Var8, null, null, null, null, z6, 65023));
                                String str22 = t83Var3.j;
                                a4c a4cVar6 = gm0.f;
                                if (a4cVar6 != null) {
                                    String strA8 = snl.a(new Long(j23), new Long(jB));
                                    StringBuilder sbU8 = qt4.u(jLongValue, "mergeNotificationsMap: chatServerId=", ". using cacheNotification, needNotify=", z8);
                                    qt4.z(j23, ", cacheLastNotifiedMessageId=", str11, sbU8);
                                    sbU8.append(strA8);
                                    sbU8.append(" fcmLastNotifiedMessageId=");
                                    sbU8.append(jB);
                                    a4cVar6.c(je9Var4, str22, sbU8.toString(), null);
                                    xf5Var2 = xf5Var6;
                                    g83Var4 = g83Var9;
                                    g83Var3 = g83Var10;
                                    q83Var2 = q83Var7;
                                    linkedHashMap = linkedHashMap3;
                                    it = it;
                                    je9Var3 = je9Var;
                                }
                                xf5Var2 = xf5Var6;
                                g83Var4 = g83Var9;
                                g83Var3 = g83Var10;
                                q83Var2 = q83Var7;
                                linkedHashMap = linkedHashMap3;
                                it = it;
                                je9Var3 = je9Var;
                            }
                        } else {
                            linkedHashMap.put(new Long(jLongValue), d83Var5);
                            String str23 = t83Var3.j;
                            a4c a4cVar7 = gm0.f;
                            if (a4cVar7 != null && a4cVar7.b(je9Var4)) {
                                a4cVar7.c(je9Var4, str23, nbh.s(jLongValue, "mergeNotificationsMap: chatServerId=", ". using cacheNotification, no notify needed"), null);
                            }
                            je9Var3 = je9Var;
                        }
                        if (it.hasNext()) {
                            jLongValue = ((Number) it.next()).longValue();
                            d83Var5 = (d83) g83Var3.a.get(new Long(jLongValue));
                            je9Var = je9Var3;
                            d83Var6 = (d83) g83Var4.a.get(new Long(jLongValue));
                            if (d83Var6 != null) {
                                if (d83Var5 != null) {
                                }
                                if (d83Var6 != null) {
                                    if (d83Var5 == null) {
                                        t83Var2 = t83Var3;
                                    } else {
                                        xf5Var5 = xf5Var2;
                                        str6 = str11;
                                        j5 = d83Var5.l;
                                        j6 = d83Var6.l;
                                        if (j5 >= j6) {
                                            z3 = d83Var5.j;
                                        } else {
                                            z3 = d83Var6.j;
                                        }
                                        z4 = z3;
                                        if (j5 >= j6) {
                                            i = d83Var5.i;
                                        } else {
                                            i = d83Var6.i;
                                        }
                                        int i9 = i;
                                        Long l8 = new Long(jLongValue);
                                        g83Var8 = g83Var4;
                                        hu4Var3 = hu4Var4;
                                        g83Var7 = g83Var3;
                                        l = new Long(d83Var6.a);
                                        if (l.longValue() == j) {
                                            l = null;
                                        }
                                        if (l != null) {
                                            jLongValue2 = l.longValue();
                                        } else {
                                            jLongValue2 = d83Var5.a;
                                        }
                                        long j1116 = jLongValue2;
                                        String str117 = d83Var6.b;
                                        long j1117 = d83Var5.c;
                                        if (d83Var5.l >= d83Var6.l) {
                                            d83Var7 = d83Var5;
                                        } else {
                                            d83Var7 = d83Var6;
                                        }
                                        String str118 = d83Var7.d;
                                        e83Var = d83Var5.e;
                                        list = d83Var5.f;
                                        List list10 = d83Var6.f;
                                        arrayList = new ArrayList(list);
                                        it3 = list10.iterator();
                                        while (it3.hasNext()) {
                                            Iterator it15 = it3;
                                            tiaVar2 = (tia) it3.next();
                                            e83 e83Var12 = e83Var;
                                            list2 = list;
                                            hu4 hu4Var10 = hu4Var3;
                                            if (list2 instanceof Collection) {
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        tiaVar3 = (tia) it4.next();
                                                        j10 = jLongValue;
                                                        str10 = str6;
                                                        if (tiaVar3.c == tiaVar2.c) {
                                                        }
                                                        str6 = str10;
                                                        jLongValue = j10;
                                                    } else {
                                                        j10 = jLongValue;
                                                        str10 = str6;
                                                        arrayList.add(tiaVar2);
                                                    }
                                                }
                                            } else {
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        tiaVar3 = (tia) it4.next();
                                                        j10 = jLongValue;
                                                        str10 = str6;
                                                        if (tiaVar3.c == tiaVar2.c) {
                                                        }
                                                        str6 = str10;
                                                        jLongValue = j10;
                                                    } else {
                                                        j10 = jLongValue;
                                                        str10 = str6;
                                                        arrayList.add(tiaVar2);
                                                    }
                                                }
                                            }
                                            it3 = it15;
                                            str6 = str10;
                                            e83Var = e83Var12;
                                            hu4Var3 = hu4Var10;
                                            jLongValue = j10;
                                        }
                                        e83 e83Var13 = e83Var;
                                        hu4Var2 = hu4Var3;
                                        j7 = jLongValue;
                                        str7 = str6;
                                        List listM6 = ww3.M1(ww3.M1(arrayList, new lv5(16)), new lv5(17));
                                        j8 = d83Var5.l;
                                        bitmap2 = d83Var5.h;
                                        j9 = d83Var6.l;
                                        bitmap3 = d83Var6.h;
                                        if (j8 >= j9) {
                                            if (bitmap3 != null) {
                                                bitmap3.recycle();
                                            }
                                            bitmap4 = bitmap2;
                                        } else {
                                            if (bitmap2 != null) {
                                                bitmap2.recycle();
                                            }
                                            bitmap4 = bitmap3;
                                        }
                                        if (d83Var5.k) {
                                            z5 = false;
                                        } else {
                                            z5 = false;
                                        }
                                        long jMax11 = Math.max(d83Var5.l, d83Var6.l);
                                        long jMax12 = Math.max(d83Var5.m, d83Var6.m);
                                        ArrayList arrayListG6 = ww3.G1(d83Var6.g, d83Var5.g);
                                        l2 = new Long(d83Var5.o);
                                        if (l2.longValue() == j) {
                                            l2 = null;
                                        }
                                        if (l2 != null) {
                                            jLongValue3 = l2.longValue();
                                        } else {
                                            jLongValue3 = d83Var6.o;
                                        }
                                        long j1118 = jLongValue3;
                                        str8 = d83Var6.n;
                                        if (str8 == null) {
                                            str8 = d83Var5.n;
                                        }
                                        linkedHashMap.put(l8, new d83(j1116, str117, j1117, str118, e83Var13, listM6, arrayListG6, bitmap4, i9, z4, z5, jMax11, jMax12, str8, j1118));
                                        if (cqk.d(d83Var6.d, d83Var5.d)) {
                                            je9Var2 = je9Var;
                                            str4 = str7;
                                        } else {
                                            je9Var2 = je9Var;
                                            str4 = str7;
                                        }
                                        str9 = t83Var3.j;
                                        a4cVar3 = gm0.f;
                                        if (a4cVar3 == null) {
                                            t83Var2 = t83Var3;
                                        } else {
                                            if (a4cVar3.b(je9Var4)) {
                                                long j1119 = d83Var5.l;
                                                String strA9 = snl.a(new Long(j1119), new Long(d83Var6.l));
                                                long j11110 = d83Var6.l;
                                                String str119 = d83Var6.n;
                                                StringBuilder sbU9 = qt4.u(j7, "mergeNotificationsMap: chatServerId=", ". \n                    |using both, needNotify=", z4);
                                                qt4.z(j1119, ", \n                    |cacheLastNotifiedMessageId=", " \n                    |", sbU9);
                                                sbU9.append(strA9);
                                                sbU9.append(" \n                    |fcmLastNotifiedMessageId=");
                                                sbU9.append(j11110);
                                                sbU9.append(",\n                    |fcmPushType:");
                                                sbU9.append(str119);
                                                sbU9.append("\n                    |");
                                                a4cVar3.c(je9Var4, str9, s5h.y0(sbU9.toString()), null);
                                            }
                                            t83Var2 = this;
                                        }
                                    }
                                    g83Var4 = g83Var8;
                                    g83Var3 = g83Var7;
                                    it = it;
                                    t83Var3 = t83Var2;
                                    je9Var3 = je9Var2;
                                    xf5Var2 = xf5Var5;
                                    str11 = str4;
                                    q83Var2 = q83Var2;
                                    hu4Var4 = hu4Var2;
                                } else {
                                    t83Var2 = this;
                                }
                                g83Var7 = g83Var3;
                                g83Var8 = g83Var4;
                                hu4Var2 = hu4Var4;
                                xf5Var5 = xf5Var2;
                                q83Var2 = q83Var2;
                                it = it;
                                je9Var2 = je9Var;
                                str4 = str11;
                                str5 = t83Var2.j;
                                a4cVar2 = gm0.f;
                                if (a4cVar2 == null) {
                                    a4cVar2.c(je9Var2, str5, zo5.j(jLongValue, "mergeNotificationsMap: failed, no notification data for chatServerId="), null);
                                }
                                g83Var4 = g83Var8;
                                g83Var3 = g83Var7;
                                it = it;
                                t83Var3 = t83Var2;
                                je9Var3 = je9Var2;
                                xf5Var2 = xf5Var5;
                                str11 = str4;
                                q83Var2 = q83Var2;
                                hu4Var4 = hu4Var2;
                            } else {
                                if (d83Var5 != null) {
                                }
                                if (d83Var6 != null) {
                                    if (d83Var5 == null) {
                                        t83Var2 = t83Var3;
                                    } else {
                                        xf5Var5 = xf5Var2;
                                        str6 = str11;
                                        j5 = d83Var5.l;
                                        j6 = d83Var6.l;
                                        if (j5 >= j6) {
                                            z3 = d83Var5.j;
                                        } else {
                                            z3 = d83Var6.j;
                                        }
                                        z4 = z3;
                                        if (j5 >= j6) {
                                            i = d83Var5.i;
                                        } else {
                                            i = d83Var6.i;
                                        }
                                        int i10 = i;
                                        Long l9 = new Long(jLongValue);
                                        g83Var8 = g83Var4;
                                        hu4Var3 = hu4Var4;
                                        g83Var7 = g83Var3;
                                        l = new Long(d83Var6.a);
                                        if (l.longValue() == j) {
                                            l = null;
                                        }
                                        if (l != null) {
                                            jLongValue2 = l.longValue();
                                        } else {
                                            jLongValue2 = d83Var5.a;
                                        }
                                        long j11111 = jLongValue2;
                                        String str1110 = d83Var6.b;
                                        long j11112 = d83Var5.c;
                                        if (d83Var5.l >= d83Var6.l) {
                                            d83Var7 = d83Var5;
                                        } else {
                                            d83Var7 = d83Var6;
                                        }
                                        String str1111 = d83Var7.d;
                                        e83Var = d83Var5.e;
                                        list = d83Var5.f;
                                        List list11 = d83Var6.f;
                                        arrayList = new ArrayList(list);
                                        it3 = list11.iterator();
                                        while (it3.hasNext()) {
                                            Iterator it16 = it3;
                                            tiaVar2 = (tia) it3.next();
                                            e83 e83Var14 = e83Var;
                                            list2 = list;
                                            hu4 hu4Var11 = hu4Var3;
                                            if (list2 instanceof Collection) {
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        tiaVar3 = (tia) it4.next();
                                                        j10 = jLongValue;
                                                        str10 = str6;
                                                        if (tiaVar3.c == tiaVar2.c) {
                                                        }
                                                        str6 = str10;
                                                        jLongValue = j10;
                                                    } else {
                                                        j10 = jLongValue;
                                                        str10 = str6;
                                                        arrayList.add(tiaVar2);
                                                    }
                                                }
                                            } else {
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        tiaVar3 = (tia) it4.next();
                                                        j10 = jLongValue;
                                                        str10 = str6;
                                                        if (tiaVar3.c == tiaVar2.c) {
                                                        }
                                                        str6 = str10;
                                                        jLongValue = j10;
                                                    } else {
                                                        j10 = jLongValue;
                                                        str10 = str6;
                                                        arrayList.add(tiaVar2);
                                                    }
                                                }
                                            }
                                            it3 = it16;
                                            str6 = str10;
                                            e83Var = e83Var14;
                                            hu4Var3 = hu4Var11;
                                            jLongValue = j10;
                                        }
                                        e83 e83Var15 = e83Var;
                                        hu4Var2 = hu4Var3;
                                        j7 = jLongValue;
                                        str7 = str6;
                                        List listM7 = ww3.M1(ww3.M1(arrayList, new lv5(16)), new lv5(17));
                                        j8 = d83Var5.l;
                                        bitmap2 = d83Var5.h;
                                        j9 = d83Var6.l;
                                        bitmap3 = d83Var6.h;
                                        if (j8 >= j9) {
                                            if (bitmap3 != null) {
                                                bitmap3.recycle();
                                            }
                                            bitmap4 = bitmap2;
                                        } else {
                                            if (bitmap2 != null) {
                                                bitmap2.recycle();
                                            }
                                            bitmap4 = bitmap3;
                                        }
                                        if (d83Var5.k) {
                                            z5 = false;
                                        } else {
                                            z5 = false;
                                        }
                                        long jMax13 = Math.max(d83Var5.l, d83Var6.l);
                                        long jMax14 = Math.max(d83Var5.m, d83Var6.m);
                                        ArrayList arrayListG7 = ww3.G1(d83Var6.g, d83Var5.g);
                                        l2 = new Long(d83Var5.o);
                                        if (l2.longValue() == j) {
                                            l2 = null;
                                        }
                                        if (l2 != null) {
                                            jLongValue3 = l2.longValue();
                                        } else {
                                            jLongValue3 = d83Var6.o;
                                        }
                                        long j11113 = jLongValue3;
                                        str8 = d83Var6.n;
                                        if (str8 == null) {
                                            str8 = d83Var5.n;
                                        }
                                        linkedHashMap.put(l9, new d83(j11111, str1110, j11112, str1111, e83Var15, listM7, arrayListG7, bitmap4, i10, z4, z5, jMax13, jMax14, str8, j11113));
                                        if (cqk.d(d83Var6.d, d83Var5.d)) {
                                            je9Var2 = je9Var;
                                            str4 = str7;
                                        } else {
                                            je9Var2 = je9Var;
                                            str4 = str7;
                                        }
                                        str9 = t83Var3.j;
                                        a4cVar3 = gm0.f;
                                        if (a4cVar3 == null) {
                                            t83Var2 = t83Var3;
                                        } else {
                                            if (a4cVar3.b(je9Var4)) {
                                                long j11114 = d83Var5.l;
                                                String strA10 = snl.a(new Long(j11114), new Long(d83Var6.l));
                                                long j11115 = d83Var6.l;
                                                String str1112 = d83Var6.n;
                                                StringBuilder sbU10 = qt4.u(j7, "mergeNotificationsMap: chatServerId=", ". \n                    |using both, needNotify=", z4);
                                                qt4.z(j11114, ", \n                    |cacheLastNotifiedMessageId=", " \n                    |", sbU10);
                                                sbU10.append(strA10);
                                                sbU10.append(" \n                    |fcmLastNotifiedMessageId=");
                                                sbU10.append(j11115);
                                                sbU10.append(",\n                    |fcmPushType:");
                                                sbU10.append(str1112);
                                                sbU10.append("\n                    |");
                                                a4cVar3.c(je9Var4, str9, s5h.y0(sbU10.toString()), null);
                                            }
                                            t83Var2 = this;
                                        }
                                    }
                                    g83Var4 = g83Var8;
                                    g83Var3 = g83Var7;
                                    it = it;
                                    t83Var3 = t83Var2;
                                    je9Var3 = je9Var2;
                                    xf5Var2 = xf5Var5;
                                    str11 = str4;
                                    q83Var2 = q83Var2;
                                    hu4Var4 = hu4Var2;
                                } else {
                                    t83Var2 = this;
                                }
                                g83Var7 = g83Var3;
                                g83Var8 = g83Var4;
                                hu4Var2 = hu4Var4;
                                xf5Var5 = xf5Var2;
                                q83Var2 = q83Var2;
                                it = it;
                                je9Var2 = je9Var;
                                str4 = str11;
                                str5 = t83Var2.j;
                                a4cVar2 = gm0.f;
                                if (a4cVar2 == null) {
                                    a4cVar2.c(je9Var2, str5, zo5.j(jLongValue, "mergeNotificationsMap: failed, no notification data for chatServerId="), null);
                                }
                                g83Var4 = g83Var8;
                                g83Var3 = g83Var7;
                                it = it;
                                t83Var3 = t83Var2;
                                je9Var3 = je9Var2;
                                xf5Var2 = xf5Var5;
                                str11 = str4;
                                q83Var2 = q83Var2;
                                hu4Var4 = hu4Var2;
                            }
                        } else {
                            t83Var = t83Var3;
                            hu4Var = hu4Var4;
                            q83Var4 = q83Var2;
                            d83Var2 = (d83) linkedHashMap.get(new Long(j));
                            if (d83Var2 != null) {
                                long jT3 = t83Var.f().a.t();
                                tiaVar = (tia) ww3.D1(d83Var2.f);
                                if (tiaVar != null && tiaVar.o && d83Var2.c == 0 && tiaVar.g == jT3) {
                                    string = t83Var.a.getString(R.string.tt_scheduled_reminder_title);
                                    rt2Var2 = (rt2) ((mjg) ((xn3) t83Var.f.getValue()).s()).getValue();
                                    if (rt2Var2 != null) {
                                        v4c v4cVar3 = (v4c) t83Var.h.getValue();
                                        q83Var4.d = null;
                                        q83Var4.e = null;
                                        q83Var4.f = null;
                                        q83Var4.g = linkedHashMap;
                                        q83Var4.h = d83Var2;
                                        q83Var4.i = string;
                                        q83Var4.j = null;
                                        q83Var4.n = 3;
                                        objB = v4cVar3.b(rt2Var2, q83Var4);
                                        if (objB == hu4Var) {
                                            return hu4Var;
                                        }
                                        d83Var4 = d83Var2;
                                        str3 = string;
                                        obj = objB;
                                        linkedHashMap4 = linkedHashMap;
                                    } else {
                                        d83Var3 = d83Var2;
                                        bitmap = null;
                                        str2 = string;
                                    }
                                    List list12 = d83Var3.f;
                                    arrayList2 = new ArrayList(yw3.W0(list12, 10));
                                    while (it5.hasNext()) {
                                        tia tiaVar6 = (tia) it5.next();
                                        arrayList2.add(new tia(tiaVar6.a, tiaVar6.b, tiaVar6.c, tiaVar6.d, tiaVar6.e, str2, tiaVar6.g, bitmap, tiaVar6.i, tiaVar6.j, tiaVar6.k, tiaVar6.l, tiaVar6.m, tiaVar6.n, tiaVar6.o, tiaVar6.p, tiaVar6.q));
                                    }
                                    linkedHashMap.put(new Long(0L), d83.a(d83Var3, str2, arrayList2, null, bitmap, false, 65367));
                                }
                            }
                        }
                    } else if (d83Var6.j) {
                        xn3 xn3Var = (xn3) t83Var3.f.getValue();
                        q83Var2.d = g83Var3;
                        q83Var2.e = g83Var4;
                        q83Var2.f = xf5Var2;
                        q83Var2.g = linkedHashMap;
                        q83Var2.h = it;
                        q83Var2.i = null;
                        q83Var2.j = d83Var6;
                        q83Var2.k = jLongValue;
                        q83Var2.n = 1;
                        Object objI = xn3Var.i(jLongValue, q83Var2);
                        if (objI != hu4Var4) {
                            Iterator it17 = it;
                            g83Var5 = g83Var3;
                            obj = objI;
                            it2 = it17;
                            xf5 xf5Var9 = xf5Var2;
                            d83Var = d83Var6;
                            linkedHashMap2 = linkedHashMap;
                            g83Var6 = g83Var4;
                            xf5Var3 = xf5Var9;
                            q83Var = q83Var2;
                            j2 = jLongValue;
                            rt2Var = (rt2) obj;
                            xf5Var4 = xf5Var3;
                            j3 = d83Var.l;
                            if (rt2Var != null || (nx2Var = rt2Var.b) == null || (cx2VarA = nx2Var.a()) == null) {
                                j4 = -1;
                            } else {
                                j4 = cx2VarA.d;
                            }
                            if (j3 > j4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            q83Var3 = q83Var;
                            z2 = z;
                            linkedHashMap2.put(new Long(j2), d83.a(d83Var, null, null, null, null, z, 65023));
                            str = t83Var3.j;
                            a4cVar = gm0.f;
                            if (a4cVar == null && a4cVar.b(je9Var4)) {
                                linkedHashMap3 = linkedHashMap2;
                                it = it2;
                                String strA11 = snl.a(new Long(j3), new Long(j4));
                                StringBuilder sbU11 = qt4.u(j2, "mergeNotificationsMap: chatServerId=", ". using fcmNotification, needNotify=", z2);
                                qt4.z(j3, ", fcmLastNotifiedMessageId=", str11, sbU11);
                                sbU11.append(strA11);
                                sbU11.append(" cacheLastNotifiedMessageId=");
                                sbU11.append(j4);
                                a4cVar.c(je9Var4, str, sbU11.toString(), null);
                                xf5Var2 = xf5Var4;
                                g83Var4 = g83Var6;
                                g83Var3 = g83Var5;
                                q83Var2 = q83Var3;
                            } else {
                                linkedHashMap3 = linkedHashMap2;
                                it = it2;
                                xf5Var2 = xf5Var4;
                                g83Var4 = g83Var6;
                                g83Var3 = g83Var5;
                                q83Var2 = q83Var3;
                            }
                            linkedHashMap = linkedHashMap3;
                            it = it;
                            je9Var3 = je9Var;
                            if (it.hasNext()) {
                                jLongValue = ((Number) it.next()).longValue();
                                d83Var5 = (d83) g83Var3.a.get(new Long(jLongValue));
                                je9Var = je9Var3;
                                d83Var6 = (d83) g83Var4.a.get(new Long(jLongValue));
                                if (d83Var6 != null) {
                                    if (d83Var5 != null) {
                                    }
                                    if (d83Var6 != null) {
                                        if (d83Var5 == null) {
                                            t83Var2 = t83Var3;
                                        } else {
                                            xf5Var5 = xf5Var2;
                                            str6 = str11;
                                            j5 = d83Var5.l;
                                            j6 = d83Var6.l;
                                            if (j5 >= j6) {
                                                z3 = d83Var5.j;
                                            } else {
                                                z3 = d83Var6.j;
                                            }
                                            z4 = z3;
                                            if (j5 >= j6) {
                                                i = d83Var5.i;
                                            } else {
                                                i = d83Var6.i;
                                            }
                                            int i11 = i;
                                            Long l10 = new Long(jLongValue);
                                            g83Var8 = g83Var4;
                                            hu4Var3 = hu4Var4;
                                            g83Var7 = g83Var3;
                                            l = new Long(d83Var6.a);
                                            if (l.longValue() == j) {
                                                l = null;
                                            }
                                            if (l != null) {
                                                jLongValue2 = l.longValue();
                                            } else {
                                                jLongValue2 = d83Var5.a;
                                            }
                                            long j11116 = jLongValue2;
                                            String str1113 = d83Var6.b;
                                            long j11117 = d83Var5.c;
                                            if (d83Var5.l >= d83Var6.l) {
                                                d83Var7 = d83Var5;
                                            } else {
                                                d83Var7 = d83Var6;
                                            }
                                            String str1114 = d83Var7.d;
                                            e83Var = d83Var5.e;
                                            list = d83Var5.f;
                                            List list13 = d83Var6.f;
                                            arrayList = new ArrayList(list);
                                            it3 = list13.iterator();
                                            while (it3.hasNext()) {
                                                Iterator it18 = it3;
                                                tiaVar2 = (tia) it3.next();
                                                e83 e83Var16 = e83Var;
                                                list2 = list;
                                                hu4 hu4Var12 = hu4Var3;
                                                if (list2 instanceof Collection) {
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            tiaVar3 = (tia) it4.next();
                                                            j10 = jLongValue;
                                                            str10 = str6;
                                                            if (tiaVar3.c == tiaVar2.c) {
                                                            }
                                                            str6 = str10;
                                                            jLongValue = j10;
                                                        } else {
                                                            j10 = jLongValue;
                                                            str10 = str6;
                                                            arrayList.add(tiaVar2);
                                                        }
                                                    }
                                                } else {
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            tiaVar3 = (tia) it4.next();
                                                            j10 = jLongValue;
                                                            str10 = str6;
                                                            if (tiaVar3.c == tiaVar2.c) {
                                                            }
                                                            str6 = str10;
                                                            jLongValue = j10;
                                                        } else {
                                                            j10 = jLongValue;
                                                            str10 = str6;
                                                            arrayList.add(tiaVar2);
                                                        }
                                                    }
                                                }
                                                it3 = it18;
                                                str6 = str10;
                                                e83Var = e83Var16;
                                                hu4Var3 = hu4Var12;
                                                jLongValue = j10;
                                            }
                                            e83 e83Var17 = e83Var;
                                            hu4Var2 = hu4Var3;
                                            j7 = jLongValue;
                                            str7 = str6;
                                            List listM8 = ww3.M1(ww3.M1(arrayList, new lv5(16)), new lv5(17));
                                            j8 = d83Var5.l;
                                            bitmap2 = d83Var5.h;
                                            j9 = d83Var6.l;
                                            bitmap3 = d83Var6.h;
                                            if (j8 >= j9) {
                                                if (bitmap3 != null) {
                                                    bitmap3.recycle();
                                                }
                                                bitmap4 = bitmap2;
                                            } else {
                                                if (bitmap2 != null) {
                                                    bitmap2.recycle();
                                                }
                                                bitmap4 = bitmap3;
                                            }
                                            if (d83Var5.k) {
                                                z5 = false;
                                            } else {
                                                z5 = false;
                                            }
                                            long jMax15 = Math.max(d83Var5.l, d83Var6.l);
                                            long jMax16 = Math.max(d83Var5.m, d83Var6.m);
                                            ArrayList arrayListG8 = ww3.G1(d83Var6.g, d83Var5.g);
                                            l2 = new Long(d83Var5.o);
                                            if (l2.longValue() == j) {
                                                l2 = null;
                                            }
                                            if (l2 != null) {
                                                jLongValue3 = l2.longValue();
                                            } else {
                                                jLongValue3 = d83Var6.o;
                                            }
                                            long j11118 = jLongValue3;
                                            str8 = d83Var6.n;
                                            if (str8 == null) {
                                                str8 = d83Var5.n;
                                            }
                                            linkedHashMap.put(l10, new d83(j11116, str1113, j11117, str1114, e83Var17, listM8, arrayListG8, bitmap4, i11, z4, z5, jMax15, jMax16, str8, j11118));
                                            if (cqk.d(d83Var6.d, d83Var5.d)) {
                                                je9Var2 = je9Var;
                                                str4 = str7;
                                            } else {
                                                je9Var2 = je9Var;
                                                str4 = str7;
                                            }
                                            str9 = t83Var3.j;
                                            a4cVar3 = gm0.f;
                                            if (a4cVar3 == null) {
                                                t83Var2 = t83Var3;
                                            } else {
                                                if (a4cVar3.b(je9Var4)) {
                                                    long j11119 = d83Var5.l;
                                                    String strA12 = snl.a(new Long(j11119), new Long(d83Var6.l));
                                                    long j111110 = d83Var6.l;
                                                    String str1115 = d83Var6.n;
                                                    StringBuilder sbU12 = qt4.u(j7, "mergeNotificationsMap: chatServerId=", ". \n                    |using both, needNotify=", z4);
                                                    qt4.z(j11119, ", \n                    |cacheLastNotifiedMessageId=", " \n                    |", sbU12);
                                                    sbU12.append(strA12);
                                                    sbU12.append(" \n                    |fcmLastNotifiedMessageId=");
                                                    sbU12.append(j111110);
                                                    sbU12.append(",\n                    |fcmPushType:");
                                                    sbU12.append(str1115);
                                                    sbU12.append("\n                    |");
                                                    a4cVar3.c(je9Var4, str9, s5h.y0(sbU12.toString()), null);
                                                }
                                                t83Var2 = this;
                                            }
                                        }
                                        g83Var4 = g83Var8;
                                        g83Var3 = g83Var7;
                                        it = it;
                                        t83Var3 = t83Var2;
                                        je9Var3 = je9Var2;
                                        xf5Var2 = xf5Var5;
                                        str11 = str4;
                                        q83Var2 = q83Var2;
                                        hu4Var4 = hu4Var2;
                                    } else {
                                        t83Var2 = this;
                                    }
                                    g83Var7 = g83Var3;
                                    g83Var8 = g83Var4;
                                    hu4Var2 = hu4Var4;
                                    xf5Var5 = xf5Var2;
                                    q83Var2 = q83Var2;
                                    it = it;
                                    je9Var2 = je9Var;
                                    str4 = str11;
                                    str5 = t83Var2.j;
                                    a4cVar2 = gm0.f;
                                    if (a4cVar2 == null) {
                                        a4cVar2.c(je9Var2, str5, zo5.j(jLongValue, "mergeNotificationsMap: failed, no notification data for chatServerId="), null);
                                    }
                                    g83Var4 = g83Var8;
                                    g83Var3 = g83Var7;
                                    it = it;
                                    t83Var3 = t83Var2;
                                    je9Var3 = je9Var2;
                                    xf5Var2 = xf5Var5;
                                    str11 = str4;
                                    q83Var2 = q83Var2;
                                    hu4Var4 = hu4Var2;
                                } else {
                                    if (d83Var5 != null) {
                                    }
                                    if (d83Var6 != null) {
                                        if (d83Var5 == null) {
                                            t83Var2 = t83Var3;
                                        } else {
                                            xf5Var5 = xf5Var2;
                                            str6 = str11;
                                            j5 = d83Var5.l;
                                            j6 = d83Var6.l;
                                            if (j5 >= j6) {
                                                z3 = d83Var5.j;
                                            } else {
                                                z3 = d83Var6.j;
                                            }
                                            z4 = z3;
                                            if (j5 >= j6) {
                                                i = d83Var5.i;
                                            } else {
                                                i = d83Var6.i;
                                            }
                                            int i12 = i;
                                            Long l11 = new Long(jLongValue);
                                            g83Var8 = g83Var4;
                                            hu4Var3 = hu4Var4;
                                            g83Var7 = g83Var3;
                                            l = new Long(d83Var6.a);
                                            if (l.longValue() == j) {
                                                l = null;
                                            }
                                            if (l != null) {
                                                jLongValue2 = l.longValue();
                                            } else {
                                                jLongValue2 = d83Var5.a;
                                            }
                                            long j111111 = jLongValue2;
                                            String str1116 = d83Var6.b;
                                            long j111112 = d83Var5.c;
                                            if (d83Var5.l >= d83Var6.l) {
                                                d83Var7 = d83Var5;
                                            } else {
                                                d83Var7 = d83Var6;
                                            }
                                            String str1117 = d83Var7.d;
                                            e83Var = d83Var5.e;
                                            list = d83Var5.f;
                                            List list14 = d83Var6.f;
                                            arrayList = new ArrayList(list);
                                            it3 = list14.iterator();
                                            while (it3.hasNext()) {
                                                Iterator it19 = it3;
                                                tiaVar2 = (tia) it3.next();
                                                e83 e83Var18 = e83Var;
                                                list2 = list;
                                                hu4 hu4Var13 = hu4Var3;
                                                if (list2 instanceof Collection) {
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            tiaVar3 = (tia) it4.next();
                                                            j10 = jLongValue;
                                                            str10 = str6;
                                                            if (tiaVar3.c == tiaVar2.c) {
                                                            }
                                                            str6 = str10;
                                                            jLongValue = j10;
                                                        } else {
                                                            j10 = jLongValue;
                                                            str10 = str6;
                                                            arrayList.add(tiaVar2);
                                                        }
                                                    }
                                                } else {
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            tiaVar3 = (tia) it4.next();
                                                            j10 = jLongValue;
                                                            str10 = str6;
                                                            if (tiaVar3.c == tiaVar2.c) {
                                                            }
                                                            str6 = str10;
                                                            jLongValue = j10;
                                                        } else {
                                                            j10 = jLongValue;
                                                            str10 = str6;
                                                            arrayList.add(tiaVar2);
                                                        }
                                                    }
                                                }
                                                it3 = it19;
                                                str6 = str10;
                                                e83Var = e83Var18;
                                                hu4Var3 = hu4Var13;
                                                jLongValue = j10;
                                            }
                                            e83 e83Var19 = e83Var;
                                            hu4Var2 = hu4Var3;
                                            j7 = jLongValue;
                                            str7 = str6;
                                            List listM9 = ww3.M1(ww3.M1(arrayList, new lv5(16)), new lv5(17));
                                            j8 = d83Var5.l;
                                            bitmap2 = d83Var5.h;
                                            j9 = d83Var6.l;
                                            bitmap3 = d83Var6.h;
                                            if (j8 >= j9) {
                                                if (bitmap3 != null) {
                                                    bitmap3.recycle();
                                                }
                                                bitmap4 = bitmap2;
                                            } else {
                                                if (bitmap2 != null) {
                                                    bitmap2.recycle();
                                                }
                                                bitmap4 = bitmap3;
                                            }
                                            if (d83Var5.k) {
                                                z5 = false;
                                            } else {
                                                z5 = false;
                                            }
                                            long jMax17 = Math.max(d83Var5.l, d83Var6.l);
                                            long jMax18 = Math.max(d83Var5.m, d83Var6.m);
                                            ArrayList arrayListG9 = ww3.G1(d83Var6.g, d83Var5.g);
                                            l2 = new Long(d83Var5.o);
                                            if (l2.longValue() == j) {
                                                l2 = null;
                                            }
                                            if (l2 != null) {
                                                jLongValue3 = l2.longValue();
                                            } else {
                                                jLongValue3 = d83Var6.o;
                                            }
                                            long j111113 = jLongValue3;
                                            str8 = d83Var6.n;
                                            if (str8 == null) {
                                                str8 = d83Var5.n;
                                            }
                                            linkedHashMap.put(l11, new d83(j111111, str1116, j111112, str1117, e83Var19, listM9, arrayListG9, bitmap4, i12, z4, z5, jMax17, jMax18, str8, j111113));
                                            if (cqk.d(d83Var6.d, d83Var5.d)) {
                                                je9Var2 = je9Var;
                                                str4 = str7;
                                            } else {
                                                je9Var2 = je9Var;
                                                str4 = str7;
                                            }
                                            str9 = t83Var3.j;
                                            a4cVar3 = gm0.f;
                                            if (a4cVar3 == null) {
                                                t83Var2 = t83Var3;
                                            } else {
                                                if (a4cVar3.b(je9Var4)) {
                                                    long j111114 = d83Var5.l;
                                                    String strA13 = snl.a(new Long(j111114), new Long(d83Var6.l));
                                                    long j111115 = d83Var6.l;
                                                    String str1118 = d83Var6.n;
                                                    StringBuilder sbU13 = qt4.u(j7, "mergeNotificationsMap: chatServerId=", ". \n                    |using both, needNotify=", z4);
                                                    qt4.z(j111114, ", \n                    |cacheLastNotifiedMessageId=", " \n                    |", sbU13);
                                                    sbU13.append(strA13);
                                                    sbU13.append(" \n                    |fcmLastNotifiedMessageId=");
                                                    sbU13.append(j111115);
                                                    sbU13.append(",\n                    |fcmPushType:");
                                                    sbU13.append(str1118);
                                                    sbU13.append("\n                    |");
                                                    a4cVar3.c(je9Var4, str9, s5h.y0(sbU13.toString()), null);
                                                }
                                                t83Var2 = this;
                                            }
                                        }
                                        g83Var4 = g83Var8;
                                        g83Var3 = g83Var7;
                                        it = it;
                                        t83Var3 = t83Var2;
                                        je9Var3 = je9Var2;
                                        xf5Var2 = xf5Var5;
                                        str11 = str4;
                                        q83Var2 = q83Var2;
                                        hu4Var4 = hu4Var2;
                                    } else {
                                        t83Var2 = this;
                                    }
                                    g83Var7 = g83Var3;
                                    g83Var8 = g83Var4;
                                    hu4Var2 = hu4Var4;
                                    xf5Var5 = xf5Var2;
                                    q83Var2 = q83Var2;
                                    it = it;
                                    je9Var2 = je9Var;
                                    str4 = str11;
                                    str5 = t83Var2.j;
                                    a4cVar2 = gm0.f;
                                    if (a4cVar2 == null) {
                                        a4cVar2.c(je9Var2, str5, zo5.j(jLongValue, "mergeNotificationsMap: failed, no notification data for chatServerId="), null);
                                    }
                                    g83Var4 = g83Var8;
                                    g83Var3 = g83Var7;
                                    it = it;
                                    t83Var3 = t83Var2;
                                    je9Var3 = je9Var2;
                                    xf5Var2 = xf5Var5;
                                    str11 = str4;
                                    q83Var2 = q83Var2;
                                    hu4Var4 = hu4Var2;
                                }
                            } else {
                                t83Var = t83Var3;
                                hu4Var = hu4Var4;
                                q83Var4 = q83Var2;
                                d83Var2 = (d83) linkedHashMap.get(new Long(j));
                                if (d83Var2 != null) {
                                    long jT4 = t83Var.f().a.t();
                                    tiaVar = (tia) ww3.D1(d83Var2.f);
                                    if (tiaVar != null) {
                                        string = t83Var.a.getString(R.string.tt_scheduled_reminder_title);
                                        rt2Var2 = (rt2) ((mjg) ((xn3) t83Var.f.getValue()).s()).getValue();
                                        if (rt2Var2 != null) {
                                            v4c v4cVar4 = (v4c) t83Var.h.getValue();
                                            q83Var4.d = null;
                                            q83Var4.e = null;
                                            q83Var4.f = null;
                                            q83Var4.g = linkedHashMap;
                                            q83Var4.h = d83Var2;
                                            q83Var4.i = string;
                                            q83Var4.j = null;
                                            q83Var4.n = 3;
                                            objB = v4cVar4.b(rt2Var2, q83Var4);
                                            if (objB == hu4Var) {
                                                return hu4Var;
                                            }
                                            d83Var4 = d83Var2;
                                            str3 = string;
                                            obj = objB;
                                            linkedHashMap4 = linkedHashMap;
                                        } else {
                                            d83Var3 = d83Var2;
                                            bitmap = null;
                                            str2 = string;
                                        }
                                        List list15 = d83Var3.f;
                                        arrayList2 = new ArrayList(yw3.W0(list15, 10));
                                        while (it5.hasNext()) {
                                            tia tiaVar7 = (tia) it5.next();
                                            arrayList2.add(new tia(tiaVar7.a, tiaVar7.b, tiaVar7.c, tiaVar7.d, tiaVar7.e, str2, tiaVar7.g, bitmap, tiaVar7.i, tiaVar7.j, tiaVar7.k, tiaVar7.l, tiaVar7.m, tiaVar7.n, tiaVar7.o, tiaVar7.p, tiaVar7.q));
                                        }
                                        linkedHashMap.put(new Long(0L), d83.a(d83Var3, str2, arrayList2, null, bitmap, false, 65367));
                                    }
                                }
                            }
                        }
                    } else {
                        linkedHashMap.put(new Long(jLongValue), d83Var6);
                        String str24 = t83Var3.j;
                        a4c a4cVar8 = gm0.f;
                        if (a4cVar8 != null && a4cVar8.b(je9Var4)) {
                            a4cVar8.c(je9Var4, str24, nbh.s(jLongValue, "mergeNotificationsMap: chatServerId=", ". using fcmNotification, no notify needed"), null);
                        }
                        je9Var3 = je9Var;
                        if (it.hasNext()) {
                            jLongValue = ((Number) it.next()).longValue();
                            d83Var5 = (d83) g83Var3.a.get(new Long(jLongValue));
                            je9Var = je9Var3;
                            d83Var6 = (d83) g83Var4.a.get(new Long(jLongValue));
                            if (d83Var6 != null) {
                                if (d83Var5 != null) {
                                }
                                if (d83Var6 != null) {
                                    if (d83Var5 == null) {
                                        t83Var2 = t83Var3;
                                    } else {
                                        xf5Var5 = xf5Var2;
                                        str6 = str11;
                                        j5 = d83Var5.l;
                                        j6 = d83Var6.l;
                                        if (j5 >= j6) {
                                            z3 = d83Var5.j;
                                        } else {
                                            z3 = d83Var6.j;
                                        }
                                        z4 = z3;
                                        if (j5 >= j6) {
                                            i = d83Var5.i;
                                        } else {
                                            i = d83Var6.i;
                                        }
                                        int i13 = i;
                                        Long l12 = new Long(jLongValue);
                                        g83Var8 = g83Var4;
                                        hu4Var3 = hu4Var4;
                                        g83Var7 = g83Var3;
                                        l = new Long(d83Var6.a);
                                        if (l.longValue() == j) {
                                            l = null;
                                        }
                                        if (l != null) {
                                            jLongValue2 = l.longValue();
                                        } else {
                                            jLongValue2 = d83Var5.a;
                                        }
                                        long j111116 = jLongValue2;
                                        String str1119 = d83Var6.b;
                                        long j111117 = d83Var5.c;
                                        if (d83Var5.l >= d83Var6.l) {
                                            d83Var7 = d83Var5;
                                        } else {
                                            d83Var7 = d83Var6;
                                        }
                                        String str11110 = d83Var7.d;
                                        e83Var = d83Var5.e;
                                        list = d83Var5.f;
                                        List list16 = d83Var6.f;
                                        arrayList = new ArrayList(list);
                                        it3 = list16.iterator();
                                        while (it3.hasNext()) {
                                            Iterator it110 = it3;
                                            tiaVar2 = (tia) it3.next();
                                            e83 e83Var110 = e83Var;
                                            list2 = list;
                                            hu4 hu4Var14 = hu4Var3;
                                            if (list2 instanceof Collection) {
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        tiaVar3 = (tia) it4.next();
                                                        j10 = jLongValue;
                                                        str10 = str6;
                                                        if (tiaVar3.c == tiaVar2.c) {
                                                        }
                                                        str6 = str10;
                                                        jLongValue = j10;
                                                    } else {
                                                        j10 = jLongValue;
                                                        str10 = str6;
                                                        arrayList.add(tiaVar2);
                                                    }
                                                }
                                            } else {
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        tiaVar3 = (tia) it4.next();
                                                        j10 = jLongValue;
                                                        str10 = str6;
                                                        if (tiaVar3.c == tiaVar2.c) {
                                                        }
                                                        str6 = str10;
                                                        jLongValue = j10;
                                                    } else {
                                                        j10 = jLongValue;
                                                        str10 = str6;
                                                        arrayList.add(tiaVar2);
                                                    }
                                                }
                                            }
                                            it3 = it110;
                                            str6 = str10;
                                            e83Var = e83Var110;
                                            hu4Var3 = hu4Var14;
                                            jLongValue = j10;
                                        }
                                        e83 e83Var111 = e83Var;
                                        hu4Var2 = hu4Var3;
                                        j7 = jLongValue;
                                        str7 = str6;
                                        List listM10 = ww3.M1(ww3.M1(arrayList, new lv5(16)), new lv5(17));
                                        j8 = d83Var5.l;
                                        bitmap2 = d83Var5.h;
                                        j9 = d83Var6.l;
                                        bitmap3 = d83Var6.h;
                                        if (j8 >= j9) {
                                            if (bitmap3 != null) {
                                                bitmap3.recycle();
                                            }
                                            bitmap4 = bitmap2;
                                        } else {
                                            if (bitmap2 != null) {
                                                bitmap2.recycle();
                                            }
                                            bitmap4 = bitmap3;
                                        }
                                        if (d83Var5.k) {
                                            z5 = false;
                                        } else {
                                            z5 = false;
                                        }
                                        long jMax19 = Math.max(d83Var5.l, d83Var6.l);
                                        long jMax110 = Math.max(d83Var5.m, d83Var6.m);
                                        ArrayList arrayListG10 = ww3.G1(d83Var6.g, d83Var5.g);
                                        l2 = new Long(d83Var5.o);
                                        if (l2.longValue() == j) {
                                            l2 = null;
                                        }
                                        if (l2 != null) {
                                            jLongValue3 = l2.longValue();
                                        } else {
                                            jLongValue3 = d83Var6.o;
                                        }
                                        long j111118 = jLongValue3;
                                        str8 = d83Var6.n;
                                        if (str8 == null) {
                                            str8 = d83Var5.n;
                                        }
                                        linkedHashMap.put(l12, new d83(j111116, str1119, j111117, str11110, e83Var111, listM10, arrayListG10, bitmap4, i13, z4, z5, jMax19, jMax110, str8, j111118));
                                        if (cqk.d(d83Var6.d, d83Var5.d)) {
                                            je9Var2 = je9Var;
                                            str4 = str7;
                                        } else {
                                            je9Var2 = je9Var;
                                            str4 = str7;
                                        }
                                        str9 = t83Var3.j;
                                        a4cVar3 = gm0.f;
                                        if (a4cVar3 == null) {
                                            t83Var2 = t83Var3;
                                        } else {
                                            if (a4cVar3.b(je9Var4)) {
                                                long j111119 = d83Var5.l;
                                                String strA14 = snl.a(new Long(j111119), new Long(d83Var6.l));
                                                long j1111110 = d83Var6.l;
                                                String str11111 = d83Var6.n;
                                                StringBuilder sbU14 = qt4.u(j7, "mergeNotificationsMap: chatServerId=", ". \n                    |using both, needNotify=", z4);
                                                qt4.z(j111119, ", \n                    |cacheLastNotifiedMessageId=", " \n                    |", sbU14);
                                                sbU14.append(strA14);
                                                sbU14.append(" \n                    |fcmLastNotifiedMessageId=");
                                                sbU14.append(j1111110);
                                                sbU14.append(",\n                    |fcmPushType:");
                                                sbU14.append(str11111);
                                                sbU14.append("\n                    |");
                                                a4cVar3.c(je9Var4, str9, s5h.y0(sbU14.toString()), null);
                                            }
                                            t83Var2 = this;
                                        }
                                    }
                                    g83Var4 = g83Var8;
                                    g83Var3 = g83Var7;
                                    it = it;
                                    t83Var3 = t83Var2;
                                    je9Var3 = je9Var2;
                                    xf5Var2 = xf5Var5;
                                    str11 = str4;
                                    q83Var2 = q83Var2;
                                    hu4Var4 = hu4Var2;
                                } else {
                                    t83Var2 = this;
                                }
                                g83Var7 = g83Var3;
                                g83Var8 = g83Var4;
                                hu4Var2 = hu4Var4;
                                xf5Var5 = xf5Var2;
                                q83Var2 = q83Var2;
                                it = it;
                                je9Var2 = je9Var;
                                str4 = str11;
                                str5 = t83Var2.j;
                                a4cVar2 = gm0.f;
                                if (a4cVar2 == null) {
                                    a4cVar2.c(je9Var2, str5, zo5.j(jLongValue, "mergeNotificationsMap: failed, no notification data for chatServerId="), null);
                                }
                                g83Var4 = g83Var8;
                                g83Var3 = g83Var7;
                                it = it;
                                t83Var3 = t83Var2;
                                je9Var3 = je9Var2;
                                xf5Var2 = xf5Var5;
                                str11 = str4;
                                q83Var2 = q83Var2;
                                hu4Var4 = hu4Var2;
                            } else {
                                if (d83Var5 != null) {
                                }
                                if (d83Var6 != null) {
                                    if (d83Var5 == null) {
                                        t83Var2 = t83Var3;
                                    } else {
                                        xf5Var5 = xf5Var2;
                                        str6 = str11;
                                        j5 = d83Var5.l;
                                        j6 = d83Var6.l;
                                        if (j5 >= j6) {
                                            z3 = d83Var5.j;
                                        } else {
                                            z3 = d83Var6.j;
                                        }
                                        z4 = z3;
                                        if (j5 >= j6) {
                                            i = d83Var5.i;
                                        } else {
                                            i = d83Var6.i;
                                        }
                                        int i14 = i;
                                        Long l13 = new Long(jLongValue);
                                        g83Var8 = g83Var4;
                                        hu4Var3 = hu4Var4;
                                        g83Var7 = g83Var3;
                                        l = new Long(d83Var6.a);
                                        if (l.longValue() == j) {
                                            l = null;
                                        }
                                        if (l != null) {
                                            jLongValue2 = l.longValue();
                                        } else {
                                            jLongValue2 = d83Var5.a;
                                        }
                                        long j1111111 = jLongValue2;
                                        String str11112 = d83Var6.b;
                                        long j1111112 = d83Var5.c;
                                        if (d83Var5.l >= d83Var6.l) {
                                            d83Var7 = d83Var5;
                                        } else {
                                            d83Var7 = d83Var6;
                                        }
                                        String str11113 = d83Var7.d;
                                        e83Var = d83Var5.e;
                                        list = d83Var5.f;
                                        List list17 = d83Var6.f;
                                        arrayList = new ArrayList(list);
                                        it3 = list17.iterator();
                                        while (it3.hasNext()) {
                                            Iterator it111 = it3;
                                            tiaVar2 = (tia) it3.next();
                                            e83 e83Var112 = e83Var;
                                            list2 = list;
                                            hu4 hu4Var15 = hu4Var3;
                                            if (list2 instanceof Collection) {
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        tiaVar3 = (tia) it4.next();
                                                        j10 = jLongValue;
                                                        str10 = str6;
                                                        if (tiaVar3.c == tiaVar2.c) {
                                                        }
                                                        str6 = str10;
                                                        jLongValue = j10;
                                                    } else {
                                                        j10 = jLongValue;
                                                        str10 = str6;
                                                        arrayList.add(tiaVar2);
                                                    }
                                                }
                                            } else {
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        tiaVar3 = (tia) it4.next();
                                                        j10 = jLongValue;
                                                        str10 = str6;
                                                        if (tiaVar3.c == tiaVar2.c) {
                                                        }
                                                        str6 = str10;
                                                        jLongValue = j10;
                                                    } else {
                                                        j10 = jLongValue;
                                                        str10 = str6;
                                                        arrayList.add(tiaVar2);
                                                    }
                                                }
                                            }
                                            it3 = it111;
                                            str6 = str10;
                                            e83Var = e83Var112;
                                            hu4Var3 = hu4Var15;
                                            jLongValue = j10;
                                        }
                                        e83 e83Var113 = e83Var;
                                        hu4Var2 = hu4Var3;
                                        j7 = jLongValue;
                                        str7 = str6;
                                        List listM11 = ww3.M1(ww3.M1(arrayList, new lv5(16)), new lv5(17));
                                        j8 = d83Var5.l;
                                        bitmap2 = d83Var5.h;
                                        j9 = d83Var6.l;
                                        bitmap3 = d83Var6.h;
                                        if (j8 >= j9) {
                                            if (bitmap3 != null) {
                                                bitmap3.recycle();
                                            }
                                            bitmap4 = bitmap2;
                                        } else {
                                            if (bitmap2 != null) {
                                                bitmap2.recycle();
                                            }
                                            bitmap4 = bitmap3;
                                        }
                                        if (d83Var5.k) {
                                            z5 = false;
                                        } else {
                                            z5 = false;
                                        }
                                        long jMax111 = Math.max(d83Var5.l, d83Var6.l);
                                        long jMax112 = Math.max(d83Var5.m, d83Var6.m);
                                        ArrayList arrayListG11 = ww3.G1(d83Var6.g, d83Var5.g);
                                        l2 = new Long(d83Var5.o);
                                        if (l2.longValue() == j) {
                                            l2 = null;
                                        }
                                        if (l2 != null) {
                                            jLongValue3 = l2.longValue();
                                        } else {
                                            jLongValue3 = d83Var6.o;
                                        }
                                        long j1111113 = jLongValue3;
                                        str8 = d83Var6.n;
                                        if (str8 == null) {
                                            str8 = d83Var5.n;
                                        }
                                        linkedHashMap.put(l13, new d83(j1111111, str11112, j1111112, str11113, e83Var113, listM11, arrayListG11, bitmap4, i14, z4, z5, jMax111, jMax112, str8, j1111113));
                                        if (cqk.d(d83Var6.d, d83Var5.d)) {
                                            je9Var2 = je9Var;
                                            str4 = str7;
                                        } else {
                                            je9Var2 = je9Var;
                                            str4 = str7;
                                        }
                                        str9 = t83Var3.j;
                                        a4cVar3 = gm0.f;
                                        if (a4cVar3 == null) {
                                            t83Var2 = t83Var3;
                                        } else {
                                            if (a4cVar3.b(je9Var4)) {
                                                long j1111114 = d83Var5.l;
                                                String strA15 = snl.a(new Long(j1111114), new Long(d83Var6.l));
                                                long j1111115 = d83Var6.l;
                                                String str11114 = d83Var6.n;
                                                StringBuilder sbU15 = qt4.u(j7, "mergeNotificationsMap: chatServerId=", ". \n                    |using both, needNotify=", z4);
                                                qt4.z(j1111114, ", \n                    |cacheLastNotifiedMessageId=", " \n                    |", sbU15);
                                                sbU15.append(strA15);
                                                sbU15.append(" \n                    |fcmLastNotifiedMessageId=");
                                                sbU15.append(j1111115);
                                                sbU15.append(",\n                    |fcmPushType:");
                                                sbU15.append(str11114);
                                                sbU15.append("\n                    |");
                                                a4cVar3.c(je9Var4, str9, s5h.y0(sbU15.toString()), null);
                                            }
                                            t83Var2 = this;
                                        }
                                    }
                                    g83Var4 = g83Var8;
                                    g83Var3 = g83Var7;
                                    it = it;
                                    t83Var3 = t83Var2;
                                    je9Var3 = je9Var2;
                                    xf5Var2 = xf5Var5;
                                    str11 = str4;
                                    q83Var2 = q83Var2;
                                    hu4Var4 = hu4Var2;
                                } else {
                                    t83Var2 = this;
                                }
                                g83Var7 = g83Var3;
                                g83Var8 = g83Var4;
                                hu4Var2 = hu4Var4;
                                xf5Var5 = xf5Var2;
                                q83Var2 = q83Var2;
                                it = it;
                                je9Var2 = je9Var;
                                str4 = str11;
                                str5 = t83Var2.j;
                                a4cVar2 = gm0.f;
                                if (a4cVar2 == null) {
                                    a4cVar2.c(je9Var2, str5, zo5.j(jLongValue, "mergeNotificationsMap: failed, no notification data for chatServerId="), null);
                                }
                                g83Var4 = g83Var8;
                                g83Var3 = g83Var7;
                                it = it;
                                t83Var3 = t83Var2;
                                je9Var3 = je9Var2;
                                xf5Var2 = xf5Var5;
                                str11 = str4;
                                q83Var2 = q83Var2;
                                hu4Var4 = hu4Var2;
                            }
                        } else {
                            t83Var = t83Var3;
                            hu4Var = hu4Var4;
                            q83Var4 = q83Var2;
                            d83Var2 = (d83) linkedHashMap.get(new Long(j));
                            if (d83Var2 != null) {
                                long jT5 = t83Var.f().a.t();
                                tiaVar = (tia) ww3.D1(d83Var2.f);
                                if (tiaVar != null) {
                                    string = t83Var.a.getString(R.string.tt_scheduled_reminder_title);
                                    rt2Var2 = (rt2) ((mjg) ((xn3) t83Var.f.getValue()).s()).getValue();
                                    if (rt2Var2 != null) {
                                        v4c v4cVar5 = (v4c) t83Var.h.getValue();
                                        q83Var4.d = null;
                                        q83Var4.e = null;
                                        q83Var4.f = null;
                                        q83Var4.g = linkedHashMap;
                                        q83Var4.h = d83Var2;
                                        q83Var4.i = string;
                                        q83Var4.j = null;
                                        q83Var4.n = 3;
                                        objB = v4cVar5.b(rt2Var2, q83Var4);
                                        if (objB == hu4Var) {
                                            return hu4Var;
                                        }
                                        d83Var4 = d83Var2;
                                        str3 = string;
                                        obj = objB;
                                        linkedHashMap4 = linkedHashMap;
                                    } else {
                                        d83Var3 = d83Var2;
                                        bitmap = null;
                                        str2 = string;
                                    }
                                    List list18 = d83Var3.f;
                                    arrayList2 = new ArrayList(yw3.W0(list18, 10));
                                    while (it5.hasNext()) {
                                        tia tiaVar8 = (tia) it5.next();
                                        arrayList2.add(new tia(tiaVar8.a, tiaVar8.b, tiaVar8.c, tiaVar8.d, tiaVar8.e, str2, tiaVar8.g, bitmap, tiaVar8.i, tiaVar8.j, tiaVar8.k, tiaVar8.l, tiaVar8.m, tiaVar8.n, tiaVar8.o, tiaVar8.p, tiaVar8.q));
                                    }
                                    linkedHashMap.put(new Long(0L), d83.a(d83Var3, str2, arrayList2, null, bitmap, false, 65367));
                                }
                            }
                        }
                    }
                    return hu4Var4;
                }
                t83Var = t83Var3;
                hu4Var = hu4Var4;
                q83Var4 = q83Var2;
                d83Var2 = (d83) linkedHashMap.get(new Long(j));
                if (d83Var2 != null) {
                    long jT6 = t83Var.f().a.t();
                    tiaVar = (tia) ww3.D1(d83Var2.f);
                    if (tiaVar != null) {
                        string = t83Var.a.getString(R.string.tt_scheduled_reminder_title);
                        rt2Var2 = (rt2) ((mjg) ((xn3) t83Var.f.getValue()).s()).getValue();
                        if (rt2Var2 != null) {
                            v4c v4cVar6 = (v4c) t83Var.h.getValue();
                            q83Var4.d = null;
                            q83Var4.e = null;
                            q83Var4.f = null;
                            q83Var4.g = linkedHashMap;
                            q83Var4.h = d83Var2;
                            q83Var4.i = string;
                            q83Var4.j = null;
                            q83Var4.n = 3;
                            objB = v4cVar6.b(rt2Var2, q83Var4);
                            if (objB == hu4Var) {
                                return hu4Var;
                            }
                            d83Var4 = d83Var2;
                            str3 = string;
                            obj = objB;
                            linkedHashMap4 = linkedHashMap;
                        } else {
                            d83Var3 = d83Var2;
                            bitmap = null;
                            str2 = string;
                        }
                        List list19 = d83Var3.f;
                        arrayList2 = new ArrayList(yw3.W0(list19, 10));
                        while (it5.hasNext()) {
                            tia tiaVar9 = (tia) it5.next();
                            arrayList2.add(new tia(tiaVar9.a, tiaVar9.b, tiaVar9.c, tiaVar9.d, tiaVar9.e, str2, tiaVar9.g, bitmap, tiaVar9.i, tiaVar9.j, tiaVar9.k, tiaVar9.l, tiaVar9.m, tiaVar9.n, tiaVar9.o, tiaVar9.p, tiaVar9.q));
                        }
                        linkedHashMap.put(new Long(0L), d83.a(d83Var3, str2, arrayList2, null, bitmap, false, 65367));
                    }
                }
                return linkedHashMap;
            }
        }
        if (i3 != 3) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str3 = (String) q83Var.i;
        d83Var4 = (d83) q83Var.h;
        linkedHashMap4 = q83Var.g;
        ch3.d0(obj);
        str2 = str3;
        d83Var3 = d83Var4;
        linkedHashMap = linkedHashMap4;
        bitmap = (Bitmap) obj;
        List list110 = d83Var3.f;
        arrayList2 = new ArrayList(yw3.W0(list110, 10));
        while (it5.hasNext()) {
            tia tiaVar10 = (tia) it5.next();
            arrayList2.add(new tia(tiaVar10.a, tiaVar10.b, tiaVar10.c, tiaVar10.d, tiaVar10.e, str2, tiaVar10.g, bitmap, tiaVar10.i, tiaVar10.j, tiaVar10.k, tiaVar10.l, tiaVar10.m, tiaVar10.n, tiaVar10.o, tiaVar10.p, tiaVar10.q));
        }
        linkedHashMap.put(new Long(0L), d83.a(d83Var3, str2, arrayList2, null, bitmap, false, 65367));
        return linkedHashMap;
    }
}
