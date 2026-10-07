package defpackage;

import android.util.MutableLong;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.a;
import ru.ok.tamtam.messages.ChatException;

/* JADX INFO: loaded from: classes.dex */
public abstract class h03 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Comparable a(long j, nq4 nq4Var) {
        uz2 uz2Var;
        qw2 qw2Var;
        if (nq4Var instanceof uz2) {
            uz2Var = (uz2) nq4Var;
            int i = uz2Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                uz2Var.h = i - Integer.MIN_VALUE;
            } else {
                uz2Var = new uz2(this, nq4Var);
            }
        } else {
            uz2Var = new uz2(this, nq4Var);
        }
        Object obj = uz2Var.f;
        int i2 = uz2Var.h;
        if (i2 == 0) {
            ch3.d0(obj);
            qw2Var = (qw2) this;
            uz2Var.e = qw2Var;
            uz2Var.d = j;
            uz2Var.h = 1;
            Object objG = qw2Var.m.g(uz2Var);
            hu4 hu4Var = hu4.a;
            if (objG != hu4Var) {
                objG = sbi.a;
            }
            if (objG == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = uz2Var.d;
            qw2Var = uz2Var.e;
            ch3.d0(obj);
        }
        return (rt2) qw2Var.i.get(Long.valueOf(j));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Comparable b(long j, nq4 nq4Var) {
        vz2 vz2Var;
        qw2 qw2Var;
        if (nq4Var instanceof vz2) {
            vz2Var = (vz2) nq4Var;
            int i = vz2Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                vz2Var.h = i - Integer.MIN_VALUE;
            } else {
                vz2Var = new vz2(this, nq4Var);
            }
        } else {
            vz2Var = new vz2(this, nq4Var);
        }
        Object obj = vz2Var.f;
        int i2 = vz2Var.h;
        if (i2 == 0) {
            ch3.d0(obj);
            qw2Var = (qw2) this;
            vz2Var.e = qw2Var;
            vz2Var.d = j;
            vz2Var.h = 1;
            Object objG = qw2Var.m.g(vz2Var);
            hu4 hu4Var = hu4.a;
            if (objG != hu4Var) {
                objG = sbi.a;
            }
            if (objG == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = vz2Var.d;
            qw2Var = vz2Var.e;
            ch3.d0(obj);
        }
        return (rt2) qw2Var.j.get(Long.valueOf(j));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:60:0x0131 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object c(long j, boolean z, qf7 qf7Var, nq4 nq4Var) {
        wz2 wz2Var;
        boolean z2;
        qf7 qf7Var2;
        qf7 qf7Var3;
        boolean z3;
        long j2;
        boolean z4;
        long j3;
        ox2 ox2Var;
        tw2 tw2VarH;
        tw2 tw2Var;
        a4c a4cVar;
        je9 je9Var;
        Object objK;
        long j4 = j;
        if (nq4Var instanceof wz2) {
            wz2Var = (wz2) nq4Var;
            int i = wz2Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                wz2Var.j = i - Integer.MIN_VALUE;
            } else {
                wz2Var = new wz2(this, nq4Var);
            }
        } else {
            wz2Var = new wz2(this, nq4Var);
        }
        wz2 wz2Var2 = wz2Var;
        Object objF = wz2Var2.h;
        Object obj = hu4.a;
        int i2 = wz2Var2.j;
        if (i2 == 0) {
            ch3.d0(objF);
            wz2Var2.f = qf7Var;
            wz2Var2.d = j4;
            z2 = z;
            wz2Var2.e = z2;
            wz2Var2.j = 1;
            Object objF2 = f(j4, wz2Var2);
            if (objF2 != obj) {
                qf7Var2 = qf7Var;
                objF = objF2;
            }
            return obj;
        }
        if (i2 == 1) {
            boolean z5 = wz2Var2.e;
            long j5 = wz2Var2.d;
            qf7Var2 = wz2Var2.f;
            ch3.d0(objF);
            z2 = z5;
            j4 = j5;
        } else {
            if (i2 == 2) {
                z3 = wz2Var2.e;
                j2 = wz2Var2.d;
                qf7Var3 = wz2Var2.f;
                ch3.d0(objF);
                z2 = z3;
                j4 = j2;
                wz2Var2.f = qf7Var3;
                wz2Var2.d = j4;
                wz2Var2.e = z2;
                wz2Var2.j = 3;
                objF = f(j4, wz2Var2);
                if (objF != obj) {
                    long j6 = j4;
                    z4 = z2;
                    j3 = j6;
                    ox2Var = (ox2) objF;
                    if (ox2Var == null) {
                        vv2 vv2Var = qw2.I;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, "qw2", nbh.s(j3, "changeChatField: chat with id = ", " not found"), null);
                            }
                        }
                        return null;
                    }
                    tw2VarH = ox2Var.b.h();
                    wz2Var2.f = null;
                    wz2Var2.g = tw2VarH;
                    wz2Var2.d = j3;
                    wz2Var2.e = z4;
                    wz2Var2.j = 4;
                    if (qf7Var3.invoke(tw2VarH, wz2Var2) != obj) {
                        tw2Var = tw2VarH;
                    }
                }
                return obj;
            }
            if (i2 == 3) {
                z4 = wz2Var2.e;
                j3 = wz2Var2.d;
                qf7Var3 = wz2Var2.f;
                ch3.d0(objF);
                ox2Var = (ox2) objF;
                if (ox2Var == null) {
                    vv2 vv2Var2 = qw2.I;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "qw2", nbh.s(j3, "changeChatField: chat with id = ", " not found"), null);
                        }
                    }
                    return null;
                }
                tw2VarH = ox2Var.b.h();
                wz2Var2.f = null;
                wz2Var2.g = tw2VarH;
                wz2Var2.d = j3;
                wz2Var2.e = z4;
                wz2Var2.j = 4;
                if (qf7Var3.invoke(tw2VarH, wz2Var2) != obj) {
                    tw2Var = tw2VarH;
                }
                return obj;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    ch3.d0(objF);
                    return objF;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z4 = wz2Var2.e;
            j3 = wz2Var2.d;
            tw2Var = wz2Var2.g;
            ch3.d0(objF);
        }
        boolean z6 = z4;
        long j7 = j3;
        tw2Var.getClass();
        qw2 qw2Var = (qw2) this;
        qw2Var.Y(j7, new ox2(j7, new nx2(tw2Var)));
        yab.i0(qw2Var.D, null, 0, new i20(this, j7, (lq4) null, 7), 3);
        wz2Var2.f = null;
        wz2Var2.g = null;
        wz2Var2.d = j7;
        wz2Var2.e = z6;
        wz2Var2.j = 5;
        objK = k(j7, z6, wz2Var2);
        if (objK == obj) {
            return obj;
        }
        return objK;
        if (((ox2) objF) == null) {
            wz2Var2.f = qf7Var2;
            wz2Var2.d = j4;
            wz2Var2.e = z2;
            wz2Var2.j = 2;
            Object objG = ((qw2) this).m.g(wz2Var2);
            if (objG != obj) {
                objG = sbi.a;
            }
            if (objG != obj) {
                long j8 = j4;
                z3 = z2;
                j2 = j8;
                qf7Var3 = qf7Var2;
                z2 = z3;
                j4 = j2;
                wz2Var2.f = qf7Var3;
                wz2Var2.d = j4;
                wz2Var2.e = z2;
                wz2Var2.j = 3;
                objF = f(j4, wz2Var2);
                if (objF != obj) {
                    long j9 = j4;
                    z4 = z2;
                    j3 = j9;
                    ox2Var = (ox2) objF;
                    if (ox2Var == null) {
                        vv2 vv2Var3 = qw2.I;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, "qw2", nbh.s(j3, "changeChatField: chat with id = ", " not found"), null);
                            }
                        }
                        return null;
                    }
                    tw2VarH = ox2Var.b.h();
                    wz2Var2.f = null;
                    wz2Var2.g = tw2VarH;
                    wz2Var2.d = j3;
                    wz2Var2.e = z4;
                    wz2Var2.j = 4;
                    if (qf7Var3.invoke(tw2VarH, wz2Var2) != obj) {
                        tw2Var = tw2VarH;
                        boolean z7 = z4;
                        long j10 = j3;
                        tw2Var.getClass();
                        qw2 qw2Var2 = (qw2) this;
                        qw2Var2.Y(j10, new ox2(j10, new nx2(tw2Var)));
                        yab.i0(qw2Var2.D, null, 0, new i20(this, j10, (lq4) null, 7), 3);
                        wz2Var2.f = null;
                        wz2Var2.g = null;
                        wz2Var2.d = j10;
                        wz2Var2.e = z7;
                        wz2Var2.j = 5;
                        objK = k(j10, z7, wz2Var2);
                        if (objK == obj) {
                            return objK;
                        }
                    }
                }
            }
        } else {
            qf7Var3 = qf7Var2;
            wz2Var2.f = qf7Var3;
            wz2Var2.d = j4;
            wz2Var2.e = z2;
            wz2Var2.j = 3;
            objF = f(j4, wz2Var2);
            if (objF != obj) {
                long j11 = j4;
                z4 = z2;
                j3 = j11;
                ox2Var = (ox2) objF;
                if (ox2Var == null) {
                    vv2 vv2Var4 = qw2.I;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "qw2", nbh.s(j3, "changeChatField: chat with id = ", " not found"), null);
                        }
                    }
                    return null;
                }
                tw2VarH = ox2Var.b.h();
                wz2Var2.f = null;
                wz2Var2.g = tw2VarH;
                wz2Var2.d = j3;
                wz2Var2.e = z4;
                wz2Var2.j = 4;
                if (qf7Var3.invoke(tw2VarH, wz2Var2) != obj) {
                    tw2Var = tw2VarH;
                    boolean z8 = z4;
                    long j12 = j3;
                    tw2Var.getClass();
                    qw2 qw2Var3 = (qw2) this;
                    qw2Var3.Y(j12, new ox2(j12, new nx2(tw2Var)));
                    yab.i0(qw2Var3.D, null, 0, new i20(this, j12, (lq4) null, 7), 3);
                    wz2Var2.f = null;
                    wz2Var2.g = null;
                    wz2Var2.d = j12;
                    wz2Var2.e = z8;
                    wz2Var2.j = 5;
                    objK = k(j12, z8, wz2Var2);
                    if (objK == obj) {
                        return objK;
                    }
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008a  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c4 -> B:36:0x00c5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(defpackage.nq4 r18) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h03.d(nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Comparable e(long[] jArr, String str, String str2, nq4 nq4Var) {
        yz2 yz2Var;
        String str3;
        qw2 qw2Var;
        List list;
        if (nq4Var instanceof yz2) {
            yz2Var = (yz2) nq4Var;
            int i = yz2Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                yz2Var.i = i - Integer.MIN_VALUE;
            } else {
                yz2Var = new yz2(this, nq4Var);
            }
        } else {
            yz2Var = new yz2(this, nq4Var);
        }
        Object objK0 = yz2Var.g;
        hu4 hu4Var = hu4.a;
        int i2 = yz2Var.i;
        if (i2 == 0) {
            ch3.d0(objK0);
            qw2 qw2Var2 = (qw2) this;
            vv2 vv2Var = qw2.I;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "qw2", zo5.h(jArr.length, "createMultiChat, contacts.size() = "), null);
                }
            }
            List listM1 = a.m1(jArr);
            xt4 xt4VarB = ((n0c) qw2Var2.E).b();
            f00 f00Var = new f00(14, null, qw2Var2, listM1, str, str2);
            yz2Var.d = str;
            yz2Var.e = qw2Var2;
            yz2Var.f = listM1;
            yz2Var.i = 1;
            objK0 = yab.K0(xt4VarB, f00Var, yz2Var);
            if (objK0 == hu4Var) {
                return hu4Var;
            }
            str3 = str;
            qw2Var = qw2Var2;
            list = listM1;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = yz2Var.f;
            qw2Var = yz2Var.e;
            String str4 = yz2Var.d;
            ch3.d0(objK0);
            str3 = str4;
        }
        rt2 rt2Var = (rt2) objK0;
        g60 g60Var = new g60();
        g60Var.a = 2;
        g60Var.l = 3;
        g60Var.c = list;
        g60Var.d = str3;
        zjf.H(rt2Var.a, g60Var.a()).c().F((wzj) qw2Var.x.get());
        return rt2Var;
    }

    public final Object f(long j, nq4 nq4Var) {
        qw2 qw2Var = (qw2) this;
        ox2 ox2Var = (ox2) qw2Var.g.get(new Long(j));
        return (ox2Var != null || qw2Var.m.W()) ? ox2Var : ((n25) qw2Var.n.get()).a().i(j, nq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:228:0x0567  */
    /* JADX WARN: Code duplicated, block: B:251:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:288:0x0710  */
    /* JADX WARN: Code duplicated, block: B:289:0x0715  */
    /* JADX WARN: Code duplicated, block: B:292:0x0720  */
    /* JADX WARN: Code duplicated, block: B:293:0x0730  */
    /* JADX WARN: Code duplicated, block: B:357:0x0904  */
    /* JADX WARN: Code duplicated, block: B:359:0x090b  */
    /* JADX WARN: Code duplicated, block: B:360:0x0911  */
    /* JADX WARN: Code duplicated, block: B:366:0x095c  */
    /* JADX WARN: Code duplicated, block: B:368:0x0960  */
    /* JADX WARN: Code duplicated, block: B:375:0x09a5  */
    /* JADX WARN: Code duplicated, block: B:385:0x0a0b  */
    /* JADX WARN: Code duplicated, block: B:394:0x0a38  */
    /* JADX WARN: Code duplicated, block: B:413:0x0b09  */
    /* JADX WARN: Code duplicated, block: B:415:0x0b17  */
    /* JADX WARN: Code duplicated, block: B:424:0x0b3b  */
    /* JADX WARN: Code duplicated, block: B:426:0x0b45  */
    /* JADX WARN: Code duplicated, block: B:428:0x0b57  */
    /* JADX WARN: Code duplicated, block: B:431:0x0b63  */
    /* JADX WARN: Code duplicated, block: B:436:0x0b7e  */
    /* JADX WARN: Code duplicated, block: B:440:0x0b88  */
    /* JADX WARN: Code duplicated, block: B:469:0x0b6f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x0b5d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0175  */
    /* JADX WARN: Code duplicated, block: B:73:0x0187  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r5v42, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v98 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v69 */
    public final void g(st2 st2Var, l8b l8bVar, m8b m8bVar, k8b k8bVar, MutableLong mutableLong, m8b m8bVar2, ArrayList arrayList, pw pwVar, boolean z, long j, long j2, long j3, LinkedHashSet linkedHashSet, k8b k8bVar2) {
        ox2 ox2VarA;
        Object poeVar;
        boolean z2;
        vui vuiVar;
        ox2 ox2Var;
        rt2 rt2VarE0;
        qw2 qw2Var;
        long jMax;
        Iterator it;
        ?? r1;
        Comparable comparable;
        nx2 nx2Var;
        long j4;
        kx2 kx2Var;
        je9 je9Var;
        lx2 lx2Var;
        kx2 kx2Var2;
        sfa sfaVar;
        Map map;
        zw2 zw2Var;
        dx2 dx2Var;
        mx2 mx2VarA;
        long j5;
        long j6;
        Long lValueOf;
        xfa xfaVar;
        boolean z3;
        tw2 tw2Var;
        qw2 qw2Var2;
        int i;
        xva xvaVar;
        dx2 dx2Var2;
        long j7;
        long j8;
        final long millis;
        long j9;
        String str;
        sfa sfaVarF;
        a4c a4cVar;
        final Long l;
        fx2 fx2Var;
        final long jF;
        mg5 mg5Var;
        ArrayList arrayList2;
        ?? RemoveIf;
        a4c a4cVar2;
        long[] jArr;
        boolean z4;
        long j10;
        Long l2;
        long j11;
        long j12;
        Long lValueOf2;
        int i2;
        String str2;
        ox2 ox2VarJ;
        ax2 ax2Var;
        lx2 lx2Var2 = lx2.a;
        qw2 qw2Var3 = (qw2) this;
        vv2 vv2Var = qw2.I;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null) {
            je9 je9Var2 = je9.e;
            if (a4cVar3.b(je9Var2)) {
                a4cVar3.c(je9Var2, "qw2", "storeChatsFromServer: " + st2Var, null);
            }
        }
        ge3 ge3Var = l8bVar != null ? (ge3) l8bVar.f(st2Var.a) : null;
        boolean z5 = st2Var.a() && st2Var.d.size() == 1 && st2Var.d.containsKey(Long.valueOf(qw2Var3.S()));
        if (z5) {
            if (qw2Var3.b.getValue() == null) {
                qw2Var3.E();
            }
            ox2VarA = (ox2) qw2Var3.g.get(Long.valueOf(((rt2) qw2Var3.b.getValue()).a));
        } else {
            hre hreVarA = ((n25) qw2Var3.n.get()).a();
            long j13 = st2Var.a;
            ph3 ph3Var = (ph3) hreVarA.e();
            jy2 jy2Var = (jy2) ch3.G(ph3Var.a, true, false, new lh3(j13, ph3Var, 0));
            ox2VarA = jy2Var != null ? hreVarA.a(jy2Var) : null;
            if (ox2VarA == null && st2Var.a()) {
                ox2VarA = ((n25) qw2Var3.n.get()).a().j(st2Var.j);
            }
        }
        ox2 ox2Var2 = ox2VarA;
        rt2 rt2Var = ox2Var2 != null ? (rt2) qw2Var3.i.get(Long.valueOf(ox2Var2.a)) : null;
        long jD = (ox2Var2 == null || (ax2Var = ox2Var2.b.p) == null) ? 0L : ax2Var.d();
        ka3 ka3Var = st2Var.s;
        long j14 = 0;
        if (ka3Var != null) {
            boolean z6 = ka3Var.b;
            long j15 = ka3Var.c;
            LinkedHashMap linkedHashMap = st2Var.E;
            if ((z6 && jD < j15) || (!z6 && jD < j15 && linkedHashMap != null && linkedHashMap.containsKey(Long.valueOf(qw2Var3.S())))) {
                m8bVar.a(st2Var.a);
            }
        }
        kx2 kx2Var3 = kx2.h;
        je9 je9Var3 = je9.d;
        a4c a4cVar4 = gm0.f;
        if (a4cVar4 != null && a4cVar4.b(je9Var3)) {
            a4cVar4.c(je9Var3, "qw2", "storeChatFromServer, chat=" + st2Var + ", chatSettings=" + ge3Var, null);
        }
        ox2 ox2VarM = qw2Var3.M(st2Var.a);
        if (ox2VarM == null && st2Var.a()) {
            long j16 = st2Var.j;
            ConcurrentHashMap concurrentHashMap = qw2Var3.e;
            ox2 ox2Var3 = (ox2) concurrentHashMap.get(Long.valueOf(j16));
            if (ox2Var3 != null) {
                nx2 nx2Var2 = ox2Var3.b;
                if (nx2Var2.d() && nx2Var2.l == j16) {
                    ox2VarM = ox2Var3;
                } else {
                    ox2VarJ = ((n25) qw2Var3.n.get()).a().j(j16);
                    if (ox2VarJ != null) {
                        concurrentHashMap.put(Long.valueOf(j16), ox2VarJ);
                    }
                    ox2VarM = ox2VarJ;
                }
            } else {
                ox2VarJ = ((n25) qw2Var3.n.get()).a().j(j16);
                if (ox2VarJ != null) {
                    concurrentHashMap.put(Long.valueOf(j16), ox2VarJ);
                }
                ox2VarM = ox2VarJ;
            }
        }
        if (ox2VarM == null) {
            qw2Var3.t();
            ox2VarM = qw2Var3.M(st2Var.a);
        }
        ox2 ox2Var4 = ox2VarM;
        if (ox2Var4 != null && ox2Var4.b.a != st2Var.a) {
            ChatException.Store store = new ChatException.Store(st2Var, ox2Var4);
            a4c a4cVar5 = gm0.f;
            if (a4cVar5 != null) {
                je9 je9Var4 = je9.f;
                if (a4cVar5.b(je9Var4)) {
                    a4cVar5.c(je9Var4, "qw2", "storeChatFromServer: not same chat serverchat=" + st2Var + ", chatDb=" + ox2Var4, store);
                }
            }
        }
        try {
            poeVar = he3.a(st2Var.b);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            vv2 vv2Var2 = qw2.I;
            gm0.V("qw2", "fail to parse status", new ChatException.Parse(st2Var, thA));
        }
        he3 he3Var = he3.HIDDEN;
        if (poeVar instanceof poe) {
            poeVar = he3Var;
        }
        he3 he3Var2 = (he3) poeVar;
        if (ox2Var4 != null) {
            if (he3Var2 != he3Var || st2Var.j != 0 || (vuiVar = st2Var.F) == null || vuiVar.f == 0) {
                z2 = false;
            } else {
                qw2Var3.w(ox2Var4.a, kx2Var3);
            }
            ox2Var = ox2Var2;
            rt2VarE0 = null;
            qw2Var = qw2Var3;
            if (z5) {
                qw2Var = qw2Var2;
                qw2Var.b.setValue(rt2VarE0);
            }
            if (ox2Var != null && rt2VarE0 != null) {
                nx2Var = rt2VarE0.b;
                j4 = nx2Var.h0;
                if (j4 != j14 && ox2Var.b.h0 != j4) {
                    k8bVar.g(nx2Var.a, j4);
                }
            }
            if (rt2VarE0 != null) {
                jMax = st2Var.k;
                if (!st2Var.d.isEmpty()) {
                    it = st2Var.d.values().iterator();
                    if (it.hasNext()) {
                        qr7.d();
                        return;
                    }
                    r1 = (Comparable) it.next();
                    while (it.hasNext()) {
                        comparable = (Comparable) it.next();
                        if (r1.compareTo(comparable) < 0) {
                            r1 = comparable;
                        }
                    }
                    jMax = Math.max(jMax, ((Number) r1).longValue());
                }
                if (jMax > mutableLong.value) {
                    mutableLong.value = jMax;
                }
                m8bVar2.a(rt2VarE0.a);
                arrayList.add(rt2VarE0);
                pwVar.add(Long.valueOf(rt2VarE0.A()));
                ((wzj) qw2Var.x.get()).c(new vlf(rt2VarE0.a));
                if (z || !rt2VarE0.G0() || !rt2VarE0.C0() || rt2VarE0.c == null) {
                    return;
                }
                if (rt2Var != null) {
                    lw5 lw5Var = lw5.MILLISECONDS;
                    long jZ = rt2VarE0.z();
                    if (jZ <= j14 || ew5.g(j3) <= j14) {
                        ghb ghbVar = ew5.b;
                        if (ew5.d(ew5.o(j, qe7.P(rt2VarE0.c.getC(), lw5Var)), j2) >= 0) {
                            return;
                        }
                    } else if (ew5.d(ew5.o(j, qe7.P(jZ, lw5Var)), j3) >= 0) {
                        return;
                    }
                }
                linkedHashSet.add(Long.valueOf(rt2VarE0.a));
                nx2 nx2Var3 = rt2VarE0.b;
                long j17 = nx2Var3.M;
                if (j17 != j14) {
                    k8bVar2.g(j17, nx2Var3.a);
                    return;
                }
                return;
            }
        }
        tw2 tw2Var2 = new tw2();
        long j18 = st2Var.a;
        long j19 = st2Var.j;
        int i3 = st2Var.u1;
        long j20 = st2Var.c;
        LinkedHashMap linkedHashMap2 = st2Var.d;
        long j21 = st2Var.k;
        int i4 = st2Var.v1;
        long j22 = st2Var.Z;
        long j23 = st2Var.n1;
        String str3 = st2Var.f;
        String str4 = str3 == null ? "" : str3;
        String str5 = st2Var.g;
        qw2.F(tw2Var2, j18, j19, i3, j20, linkedHashMap2, j21, i4, j22, j23, str4, str5 == null ? "" : str5, st2Var.u, st2Var.q1, st2Var.t1);
        tw2Var2.f = st2Var.e;
        tw2Var2.c = cml.b(he3Var2);
        if (ge3Var != null) {
            tw2Var2.o = pm9.h(ge3Var, cx2.h);
        }
        nx2 nx2Var4 = new nx2(tw2Var2);
        long jH = ((n25) qw2Var3.n.get()).a().h(nx2Var4);
        a4c a4cVar6 = gm0.f;
        if (a4cVar6 != null && a4cVar6.b(je9Var3)) {
            a4cVar6.c(je9Var3, "qw2", zo5.j(jH, "storeChatFromServer: insert chat, chatId = "), null);
        }
        ox2Var4 = new ox2(jH, nx2Var4);
        qw2Var3.Y(jH, ox2Var4);
        z2 = true;
        sfa sfaVarT = qw2Var3.T(ox2Var4.a, st2Var.i, Long.valueOf(qw2Var3.p.a.f()));
        if (sfaVarT != null) {
            kx2Var = kx2Var3;
            je9Var = je9Var3;
            if (sfaVarT.h != ox2Var4.a) {
                qw2Var3.p.a.E(true);
                long j24 = ox2Var4.a;
                long j25 = sfaVarT.h;
                StringBuilder sbS = qt4.s(j24, "storeChatFromServer: invalid lastMessage for ", " message.chatId=");
                sbS.append(j25);
                String string = sbS.toString();
                vv2 vv2Var3 = qw2.I;
                gm0.V("qw2", string, new ChatException.WrongLastMessage(ox2Var4.a, sfaVarT));
            }
        } else {
            kx2Var = kx2Var3;
            je9Var = je9Var3;
        }
        sfa sfaVarT2 = qw2Var3.T(ox2Var4.a, st2Var.x, null);
        long j26 = ox2Var4.a;
        long j27 = st2Var.m;
        kx2 kx2Var4 = kx2.b;
        kx2 kx2Var5 = kx2.d;
        kx2 kx2Var6 = kx2.e;
        kx2 kx2Var7 = kx2.a;
        ox2 ox2VarL = qw2Var3.L(j26);
        je9 je9Var5 = je9Var;
        if (ox2VarL == null && !qw2Var3.l) {
            qw2Var3.t();
            ox2VarL = qw2Var3.L(j26);
        }
        ox2 ox2Var5 = ox2VarL;
        if (ox2Var5 == null) {
            ((t1c) ((ed6) qw2Var3.q.get())).a(new IllegalStateException(c0a.m(st2Var.a, " is not found", new StringBuilder("chat "))));
            ox2Var = ox2Var2;
            rt2VarE0 = null;
            qw2Var = qw2Var3;
        } else {
            long jS = qw2Var3.S();
            tw2 tw2VarH = ox2Var5.b.h();
            int i5 = st2Var.u1;
            ka3 ka3Var2 = st2Var.s;
            String str6 = st2Var.h;
            ox2Var = ox2Var2;
            String str7 = st2Var.g;
            ge3 ge3Var2 = ge3Var;
            String str8 = st2Var.f;
            LinkedHashMap linkedHashMap3 = st2Var.d;
            lx2 lx2Var3 = lx2.b;
            int iD = qt4.D(i5);
            long j28 = j26;
            if (iD != 1) {
                if (iD != 2) {
                    if (iD == 3) {
                        lx2Var3 = lx2.c;
                    } else if (iD == 4) {
                        lx2Var3 = lx2.d;
                    }
                }
                lx2Var = lx2Var3;
            } else {
                lx2Var = lx2Var2;
            }
            switch (he3.a(st2Var.b).ordinal()) {
                case 1:
                    kx2Var2 = kx2Var4;
                    break;
                case 2:
                    kx2Var2 = kx2Var5;
                    break;
                case 3:
                    kx2Var2 = kx2.g;
                    break;
                case 4:
                    kx2Var2 = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x03b3: MOVE (r7v14 'kx2Var2' kx2) = (r26v0 kx2) in method: h03.g(st2, l8b, m8b, k8b, android.util.MutableLong, m8b, java.util.ArrayList, pw, boolean, long, long, long, java.util.LinkedHashSet, k8b):void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                        	at java.base/java.util.ArrayList.forEach(Unknown Source)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r26v0 kx2
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 3124
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.h03.g(st2, l8b, m8b, k8b, android.util.MutableLong, m8b, java.util.ArrayList, pw, boolean, long, long, long, java.util.LinkedHashSet, k8b):void");
                }

                public final Object h(long j, nq4 nq4Var) {
                    qw2 qw2Var = (qw2) this;
                    vv2 vv2Var = qw2.I;
                    gm0.m("qw2", "localRemoveChat, chatId=%d", new Long(j));
                    qw2Var.k.remove(new Long(j));
                    ox2 ox2Var = (ox2) qw2Var.g.remove(new Long(j));
                    m8b m8bVar = qw2Var.d;
                    if (ox2Var != null) {
                        nx2 nx2Var = ox2Var.b;
                        long j2 = nx2Var.l;
                        long j3 = nx2Var.a;
                        qw2Var.f.remove(new Long(j2));
                        qw2Var.e.remove(new Long(nx2Var.l));
                        qw2Var.h.remove(new Long(j3));
                        m8bVar.n(j3);
                    }
                    rt2 rt2Var = (rt2) qw2Var.i.remove(new Long(j));
                    if (rt2Var != null) {
                        nx2 nx2Var2 = rt2Var.b;
                        qw2Var.j.remove(new Long(nx2Var2.a));
                        m8bVar.n(nx2Var2.a);
                    }
                    Object objK0 = yab.K0(((n0c) qw2Var.E).b(), new vq(qw2Var, j, rt2Var, (lq4) null, 10), nq4Var);
                    return objK0 == hu4.a ? objK0 : sbi.a;
                }

                /* JADX WARN: Code duplicated, block: B:48:0x00fe  */
                /* JADX WARN: Code duplicated, block: B:67:0x0146 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:55:0x0135, code lost:
                
                    if (r4.b(r0) == r1) goto L56;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0135 -> B:64:0x0138). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object i(java.util.List r14, defpackage.lq4 r15) {
                    /*
                        Method dump skipped, instruction units count: 329
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.h03.i(java.util.List, lq4):java.lang.Object");
                }

                public final m8b j(final List list, final l8b l8bVar, final boolean z, final boolean z2) {
                    final qw2 qw2Var = (qw2) this;
                    final m8b m8bVar = new m8b();
                    List list2 = list;
                    if (list2 != null && !list2.isEmpty()) {
                        final qw2 qw2Var2 = (qw2) this;
                        return (m8b) qw2Var.d0("storeChatsFromServer", new rah() { // from class: tz2
                            @Override // defpackage.rah
                            public final Object get() {
                                a4c a4cVar;
                                List list3 = list;
                                qw2 qw2Var3 = qw2Var;
                                m8b m8bVar2 = m8bVar;
                                h03 h03Var = qw2Var2;
                                l8b l8bVar2 = l8bVar;
                                boolean z3 = z;
                                boolean z4 = z2;
                                je9 je9Var = je9.d;
                                ghb ghbVar = ew5.b;
                                long jNanoTime = System.nanoTime();
                                lw5 lw5Var = lw5.NANOSECONDS;
                                long jP = qe7.P(jNanoTime, lw5Var);
                                vv2 vv2Var = qw2.I;
                                a4c a4cVar2 = gm0.f;
                                String str = "qw2";
                                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                    a4cVar2.c(je9Var, "qw2", zo5.h(list3.size(), "storeChatsFromServer: chats.size() = "), null);
                                }
                                long j = jP;
                                MutableLong mutableLong = new MutableLong(0L);
                                lw5 lw5Var2 = lw5Var;
                                m8b m8bVar3 = new m8b(list3.size());
                                ArrayList arrayList = new ArrayList(list3.size());
                                pw pwVar = new pw(0);
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                k8b k8bVar = new k8b(list3.size());
                                m8b m8bVar4 = new m8b();
                                je9 je9Var2 = je9Var;
                                k8b k8bVar2 = k8bVar;
                                h03 h03Var2 = h03Var;
                                k8b k8bVar3 = new k8b(list3.size());
                                b5d b5dVar = qw2Var3.p.b.I;
                                zv8[] zv8VarArr = e5d.S6;
                                int iIntValue = ((Number) b5dVar.a(zv8VarArr[27]).i()).intValue();
                                lw5 lw5Var3 = lw5.DAYS;
                                long jO = qe7.O(iIntValue, lw5Var3);
                                pw pwVar2 = pwVar;
                                long jO2 = qe7.O(((Number) qw2Var3.p.b.J.a(zv8VarArr[28]).i()).intValue(), lw5Var3);
                                long jP2 = qe7.P(qw2Var3.p.a.f(), lw5.MILLISECONDS);
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    st2 st2Var = (st2) it.next();
                                    if (!((svb) qw2Var3.C.getValue()).b()) {
                                        vv2 vv2Var2 = qw2.I;
                                        gm0.n(str, "storeChatsFromServer in loop, !isAuthorized, clear and return empty");
                                        qw2Var3.U();
                                        return m8bVar2;
                                    }
                                    if (st2Var == null) {
                                        vv2 vv2Var3 = qw2.I;
                                        gm0.Y(str, "storeChatsFromServer: chatFromServer is null!");
                                    } else {
                                        Iterator it2 = it;
                                        j = j;
                                        je9Var2 = je9Var2;
                                        jO2 = jO2;
                                        jP2 = jP2;
                                        qw2Var3 = qw2Var3;
                                        z4 = z4;
                                        str = str;
                                        pw pwVar3 = pwVar2;
                                        lw5Var2 = lw5Var2;
                                        jO = jO;
                                        try {
                                            h03Var2.g(st2Var, l8bVar2, m8bVar4, k8bVar3, mutableLong, m8bVar3, arrayList, pwVar3, z3, jP2, jO, jO2, linkedHashSet, k8bVar2);
                                            str = str;
                                            k8bVar2 = k8bVar2;
                                            jO2 = jO2;
                                            qw2Var3 = qw2Var3;
                                        } catch (Exception e) {
                                            pwVar2 = pwVar3;
                                            k8b k8bVar4 = k8bVar2;
                                            vv2 vv2Var4 = qw2.I;
                                            h03Var2 = h03Var2;
                                            ChatException.Parse parse = new ChatException.Parse(st2Var, e);
                                            a4c a4cVar3 = gm0.f;
                                            if (a4cVar3 == null) {
                                                str = str;
                                                jO2 = jO2;
                                                h03Var2 = h03Var2;
                                                qw2Var3 = qw2Var3;
                                                k8bVar2 = k8bVar4;
                                            } else {
                                                l8bVar2 = l8bVar2;
                                                je9 je9Var3 = je9.f;
                                                if (a4cVar3.b(je9Var3)) {
                                                    a4cVar3.c(je9Var3, str, "fail to store " + st2Var, parse);
                                                    z3 = z3;
                                                    m8bVar3 = m8bVar3;
                                                }
                                                k8bVar2 = k8bVar4;
                                            }
                                        }
                                        it = it2;
                                    }
                                }
                                qw2 qw2Var4 = qw2Var3;
                                m8b m8bVar5 = m8bVar3;
                                String str2 = str;
                                long j2 = j;
                                lw5 lw5Var4 = lw5Var2;
                                je9 je9Var4 = je9Var2;
                                boolean z5 = z4;
                                k8b k8bVar5 = k8bVar2;
                                vv2 vv2Var5 = qw2.I;
                                a4c a4cVar4 = gm0.f;
                                if (a4cVar4 != null && a4cVar4.b(je9Var4)) {
                                    ghb ghbVar2 = ew5.b;
                                    a4cVar4.c(je9Var4, str2, "storeChatsFromServer end, time = ".concat(ew5.t(ew5.o(qe7.P(System.nanoTime(), lw5Var4), j2))), null);
                                }
                                if (!((svb) qw2Var4.C.getValue()).b()) {
                                    gm0.n(str2, "storeChatsFromServer end, but !isAuthorized, clear and return empty");
                                    qw2Var4.U();
                                    return m8bVar2;
                                }
                                if (k8bVar3.e != 0) {
                                    ((dfh) qw2Var4.B.getValue()).b(k8bVar3);
                                }
                                long jX = qw2Var4.p.a.x();
                                if (list3.isEmpty() && jX == 0) {
                                    qw2Var4.p.a.B(1L);
                                } else if ((jX == 0 && z5) || (jX != 0 && mutableLong.value > jX)) {
                                    qw2Var4.p.a.B(mutableLong.value);
                                } else if (jX == 0 && (a4cVar = gm0.f) != null && a4cVar.b(je9Var4)) {
                                    a4cVar.c(je9Var4, str2, "storeChatsFromServer: ignore update initial chatsLastSync on " + mutableLong + " because its not from login logic", null);
                                }
                                qw2Var4.o.c(new wo3((Collection) rx8.f0(m8bVar5), true, false, mg5.REGULAR, (yq0) null, false, (Set) pwVar2));
                                ow2 ow2Var = qw2Var4.G;
                                if (ow2Var != null) {
                                    ow2Var.a(arrayList);
                                }
                                if (!linkedHashSet.isEmpty()) {
                                    a4c a4cVar5 = gm0.f;
                                    if (a4cVar5 != null && a4cVar5.b(je9Var4)) {
                                        a4cVar5.c(je9Var4, str2, zo5.h(linkedHashSet.size(), "storeChatsFromServer: chatsToSync = "), null);
                                    }
                                    ((wzj) qw2Var4.x.get()).c(new amf(qw2Var4.p.a.g(), 0L, ww3.T1(linkedHashSet)));
                                }
                                if (k8bVar5.e != 0) {
                                    a4c a4cVar6 = gm0.f;
                                    if (a4cVar6 != null && a4cVar6.b(je9Var4)) {
                                        a4cVar6.c(je9Var4, str2, zo5.h(k8bVar5.e, "storeChatsFromServer: pinsToSync = "), null);
                                    }
                                    qw2Var4.t();
                                    gm0.n(str2, "syncPins, pins size = " + k8bVar5.e);
                                    qfa qfaVar = (qfa) qw2Var4.u.get();
                                    long[] jArrA = wok.a(k8bVar5);
                                    uoa uoaVarC = qfaVar.b.c();
                                    uoaVarC.getClass();
                                    ((ose) uoaVarC).t(a.m1(jArrA)).e(new uv2(qw2Var4, 0, k8bVar5));
                                }
                                if (!m8bVar4.i()) {
                                    a4c a4cVar7 = gm0.f;
                                    if (a4cVar7 != null && a4cVar7.b(je9Var4)) {
                                        a4cVar7.c(je9Var4, str2, zo5.h(m8bVar4.d, "storeChatsFromServer: chatsReactionsSettingsForSync = "), null);
                                    }
                                    a4c a4cVar8 = gm0.f;
                                    if (a4cVar8 != null && a4cVar8.b(je9Var4)) {
                                        a4cVar8.c(je9Var4, str2, "syncChatsReactionsSettings, size = " + m8bVar4.d, null);
                                    }
                                    ((dn3) qw2Var4.F.getValue()).u(m8bVar4);
                                }
                                a4c a4cVar9 = gm0.f;
                                if (a4cVar9 != null && a4cVar9.b(je9Var4)) {
                                    a4cVar9.c(je9Var4, str2, qt4.l("storeChatsFromServer: finished, chatDbs: ", qw2Var4.g.size(), qw2Var4.i.size(), ", chats: "), null);
                                }
                                return m8bVar5;
                            }
                        });
                    }
                    vv2 vv2Var = qw2.I;
                    gm0.Y("qw2", "storeChatsFromServer: chats are empty!");
                    return m8bVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public final Object k(long j, boolean z, nq4 nq4Var) {
                    a03 a03Var;
                    if (nq4Var instanceof a03) {
                        a03Var = (a03) nq4Var;
                        int i = a03Var.f;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            a03Var.f = i - Integer.MIN_VALUE;
                        } else {
                            a03Var = new a03(this, nq4Var);
                        }
                    } else {
                        a03Var = new a03(this, nq4Var);
                    }
                    Object objK0 = a03Var.d;
                    int i2 = a03Var.f;
                    if (i2 == 0) {
                        ch3.d0(objK0);
                        xt4 xt4VarB = ((n0c) ((qw2) this).E).b();
                        c03 c03Var = new c03(this, j, z, null, 0);
                        a03Var.f = 1;
                        objK0 = yab.K0(xt4VarB, c03Var, a03Var);
                        hu4 hu4Var = hu4.a;
                        if (objK0 == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        if (i2 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(objK0);
                    }
                    return objK0;
                }

                /* JADX WARN: Code duplicated, block: B:8:0x0016  */
                public final Object l(long j, long j2, nq4 nq4Var) {
                    d03 d03Var;
                    sbi sbiVar = sbi.a;
                    if (nq4Var instanceof d03) {
                        d03Var = (d03) nq4Var;
                        int i = d03Var.h;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            d03Var.h = i - Integer.MIN_VALUE;
                        } else {
                            d03Var = new d03(this, nq4Var);
                        }
                    } else {
                        d03Var = new d03(this, nq4Var);
                    }
                    d03 d03Var2 = d03Var;
                    Object objF = d03Var2.f;
                    Object obj = hu4.a;
                    int i2 = d03Var2.h;
                    if (i2 == 0) {
                        ch3.d0(objF);
                        vv2 vv2Var = qw2.I;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                StringBuilder sbS = qt4.s(j, "updateChatLastSearchClickTime: chatId=", ", chatSearchClickTime=");
                                sbS.append(j2);
                                a4cVar.c(je9Var, "qw2", sbS.toString(), null);
                            }
                        }
                        d03Var2.d = j;
                        d03Var2.e = j2;
                        d03Var2.h = 1;
                        objF = f(j, d03Var2);
                        if (objF != obj) {
                        }
                        return obj;
                    }
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ch3.d0(objF);
                            return sbiVar;
                        }
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = d03Var2.e;
                    j = d03Var2.d;
                    ch3.d0(objF);
                    ox2 ox2Var = (ox2) objF;
                    if (ox2Var != null && (j2 == 0 || ox2Var.b.a0 < j2)) {
                        long j3 = j2;
                        qf7 e03Var = new e03(j3, null, 0);
                        d03Var2.d = j;
                        d03Var2.e = j3;
                        d03Var2.h = 2;
                        if (c(j, false, e03Var, d03Var2) == obj) {
                            return obj;
                        }
                    }
                    return sbiVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public final Object m(long j, nq4 nq4Var) {
                    f03 f03Var;
                    if (nq4Var instanceof f03) {
                        f03Var = (f03) nq4Var;
                        int i = f03Var.f;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            f03Var.f = i - Integer.MIN_VALUE;
                        } else {
                            f03Var = new f03(this, nq4Var);
                        }
                    } else {
                        f03Var = new f03(this, nq4Var);
                    }
                    Object obj = f03Var.d;
                    int i2 = f03Var.f;
                    try {
                        if (i2 == 0) {
                            ch3.d0(obj);
                            qw2 qw2Var = (qw2) this;
                            long jF = qw2Var.p.a.f();
                            xt4 xt4VarB = ((n0c) qw2Var.E).b();
                            ag0 ag0Var = new ag0(qw2Var, j, jF, null, 2);
                            f03Var.f = 1;
                            Object objK0 = yab.K0(xt4VarB, ag0Var, f03Var);
                            hu4 hu4Var = hu4.a;
                            if (objK0 == hu4Var) {
                                return hu4Var;
                            }
                        } else {
                            if (i2 != 1) {
                                ore.k("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ch3.d0(obj);
                        }
                    } catch (Throwable th) {
                        vv2 vv2Var = qw2.I;
                        gm0.V("qw2", "updateChatWriteTime fail!", th);
                    }
                    return sbi.a;
                }

                public final rt2 n(long j) {
                    vv2 vv2Var = qw2.I;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.e;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "qw2", zo5.j(j, "updateContacts for "), null);
                        }
                    }
                    qw2 qw2Var = (qw2) this;
                    rt2 rt2VarN = (rt2) qw2Var.i.get(Long.valueOf(j));
                    if (rt2VarN == null) {
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9 je9Var2 = je9.f;
                            if (a4cVar2.b(je9Var2)) {
                                a4cVar2.c(je9Var2, "qw2", "updateContacts: no chat, try to wait it", null);
                            }
                        }
                        rt2VarN = qw2Var.N(j);
                    }
                    if (rt2VarN != null) {
                        return o(rt2VarN);
                    }
                    gm0.V("qw2", "updateContacts fail", new ChatException.NotFound(zo5.j(j, "chat is null for #")));
                    return null;
                }

                public final rt2 o(rt2 rt2Var) {
                    vv2 vv2Var = qw2.I;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.e;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "qw2", zo5.j(rt2Var.a, "updateContacts for "), null);
                        }
                    }
                    qw2 qw2Var = (qw2) this;
                    ny2 ny2Var = (ny2) qw2Var.y.get();
                    rt2 rt2VarA = ny2Var.a(rt2Var.a, ((zed) ny2Var.c.getValue()).a.t(), rt2Var.b, rt2Var.c, rt2Var.d, rt2Var.e, new cw2(1, new cw2(3, this)));
                    qw2Var.X(rt2Var.a, rt2VarA);
                    return rt2VarA;
                }
            }
