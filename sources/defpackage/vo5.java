package defpackage;

import android.net.TrafficStats;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class vo5 {
    public final long a;
    public final long b;
    public final ksh c;
    public final fik d;
    public final String e;
    public final ReentrantReadWriteLock f;
    public final b9b g;
    public v44 h;
    public final en8 i;
    public final w4 j;

    public vo5(fik fikVar) {
        ghb ghbVar = ew5.b;
        long jO = qe7.O(15, lw5.MINUTES);
        long jO2 = qe7.O(25, lw5.MILLISECONDS);
        pfh pfhVar = new pfh(3);
        this.a = jO;
        this.b = jO2;
        this.c = pfhVar;
        this.d = fikVar;
        this.e = vo5.class.getName();
        this.f = new ReentrantReadWriteLock();
        this.g = new b9b();
        this.i = new en8();
        this.j = new w4(this);
        if (ew5.n(jO)) {
            return;
        }
        c.o(c0a.o("An illegal cache_ttl=", ew5.t(jO), " specified"));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x008b A[LOOP:0: B:13:0x0023->B:36:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x008e A[EDGE_INSN: B:47:0x008e->B:37:0x008e BREAK  A[LOOP:0: B:13:0x0023->B:36:0x008b], SYNTHETIC] */
    public static void c(vo5 vo5Var, v44 v44Var, int i) {
        v44 v44VarA = (i & 1) != 0 ? vo5Var.c.a() : v44Var;
        boolean z = (i & 2) == 0;
        b9b b9bVar = vo5Var.g;
        Object[] objArr = b9bVar.c;
        long[] jArr = b9bVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            ez7 ez7Var = (ez7) objArr[(i2 << 3) + i4];
                            if (z) {
                                ez7Var.b();
                            } else {
                                ReentrantReadWriteLock.WriteLock writeLock = ez7Var.c.writeLock();
                                writeLock.lock();
                                try {
                                    Iterator it = ez7Var.d.iterator();
                                    while (it.hasNext()) {
                                        fn8 fn8Var = ((cn8) it.next()).b;
                                        fn8Var.b = 0;
                                        fn8Var.c = 0;
                                        fn8Var.d = 0;
                                    }
                                    writeLock.unlock();
                                } catch (Throwable th) {
                                    writeLock.unlock();
                                    throw th;
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    } else if (i2 != length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        vo5Var.h = v44VarA;
        String str = vo5Var.e;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.c;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "resetHosts, epoch=".concat(ew5.t(v44VarA.j())), null);
        }
    }

    public final ez7 a(String str) {
        ReentrantReadWriteLock.ReadLock lock = this.f.readLock();
        lock.lock();
        try {
            return (ez7) this.g.d(str);
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d2  */
    public final boolean b(long j, String str) {
        InetAddress[] inetAddressArr;
        boolean z;
        boolean zIsReachable;
        Throwable th;
        vo5 vo5Var = this;
        je9 je9Var = je9.c;
        String str2 = vo5Var.e;
        a4c a4cVar = gm0.f;
        Throwable th2 = null;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str2, nbh.w("isHostReachable, host=", str, ", timeout=", ew5.t(j), " ..."), null);
        }
        v44 v44VarA = vo5Var.c.a();
        xp3 xp3VarD = vo5Var.d(str);
        if (xp3VarD == null || (inetAddressArr = (InetAddress[]) xp3VarD.c) == null) {
            return false;
        }
        v44 v44VarL = v44VarA.l(j);
        TrafficStats.setThreadStatsTag(str.hashCode());
        try {
            int length = inetAddressArr.length;
            int i = 0;
            while (i < length) {
                InetAddress inetAddress = inetAddressArr[i];
                long jV = ew5.v(v44VarL.j());
                v44 v44Var = v44VarL;
                int iD = ew5.d(jV, vo5Var.b);
                String str3 = vo5Var.e;
                if (iD < 0) {
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.f;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str3, "isHostReachable, time's up, abort pinging " + str, th2);
                        }
                    }
                    th = th2;
                    zIsReachable = false;
                } else {
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                        a4cVar3.c(je9Var, str3, "isHostReachable, ping " + inetAddress + " ...", null);
                    }
                    try {
                        zIsReachable = inetAddress.isReachable((int) oc9.x(ew5.s(jV, lw5.MILLISECONDS), -2147483648L, 2147483647L));
                    } catch (IOException | RuntimeException unused) {
                        zIsReachable = false;
                    }
                    if (zIsReachable) {
                        String str4 = vo5Var.e;
                        a4c a4cVar4 = gm0.f;
                        if (a4cVar4 == null) {
                            th = null;
                        } else {
                            je9 je9Var3 = je9.e;
                            if (a4cVar4.b(je9Var3)) {
                                th = null;
                                a4cVar4.c(je9Var3, str4, "isHostReachable, host=" + str + " is REACHABLE (" + inetAddress + "), took=" + ew5.t(v44VarA.j()), null);
                            } else {
                                th = null;
                            }
                        }
                    } else {
                        th = null;
                    }
                }
                if (zIsReachable) {
                    z = true;
                    return z;
                }
                i++;
                vo5Var = this;
                v44VarL = v44Var;
                th2 = th;
            }
            z = false;
            return z;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final xp3 d(String str) {
        InetAddress[] inetAddressArrU;
        je9 je9Var = je9.c;
        String str2 = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str2, "resolve -> ".concat(str), null);
        }
        v44 v44VarA = this.c.a();
        ez7 ez7VarA = a(str);
        if (ez7VarA == null) {
            fik fikVar = this.d;
            if (fikVar == null || (inetAddressArrU = fikVar.u(str)) == null) {
                ez7VarA = null;
            } else {
                ReentrantReadWriteLock.WriteLock writeLock = this.f.writeLock();
                writeLock.lock();
                try {
                    b9b b9bVar = this.g;
                    int i = b9bVar.i(str);
                    boolean z = i < 0;
                    ez7 ez7Var = (ez7) (z ? null : b9bVar.c[i]);
                    if (ez7Var == null) {
                        ez7Var = new ez7(str, inetAddressArrU, false);
                        String str3 = this.e;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, str3, "maybeLoadHost, " + str + " loaded (" + inetAddressArrU.length + ")", null);
                        }
                    }
                    ez7VarA = ez7Var;
                    if (z) {
                        int i2 = ~i;
                        b9bVar.b[i2] = str;
                        b9bVar.c[i2] = ez7VarA;
                    } else {
                        b9bVar.c[i] = ez7VarA;
                    }
                    writeLock.unlock();
                } catch (Throwable th) {
                    writeLock.unlock();
                    throw th;
                }
            }
        }
        boolean andSet = ez7VarA != null ? ez7VarA.e.getAndSet(false) : true;
        xp3 xp3VarU = andSet ? this.j.u(str) : null;
        if (xp3VarU != null) {
            ez7VarA = e(str, (InetAddress[]) xp3VarU.c);
        }
        InetAddress[] inetAddressArrA = ez7VarA != null ? ez7VarA.a() : null;
        if (inetAddressArrA == null && !andSet) {
            String str4 = this.e;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar3.b(je9Var2)) {
                    a4cVar3.c(je9Var2, str4, c0a.o("resolve, addresses not found for ", str, ", refresh cache ..."), null);
                }
            }
            xp3VarU = this.j.u(str);
            if (xp3VarU != null) {
                ez7VarA = e(str, (InetAddress[]) xp3VarU.c);
                inetAddressArrA = ez7VarA != null ? ez7VarA.a() : null;
            } else {
                xp3VarU = null;
            }
        }
        if ((inetAddressArrA == null || (andSet && xp3VarU == null)) && ez7VarA != null) {
            ez7VarA.e.set(true);
        }
        long j = v44VarA.j();
        xp3 xp3Var = inetAddressArrA != null ? new xp3(inetAddressArrA, ew5.g(j)) : null;
        String str5 = this.e;
        a4c a4cVar4 = gm0.f;
        if (a4cVar4 != null && a4cVar4.b(je9Var)) {
            a4cVar4.c(je9Var, str5, qv1.l("<- resolve (", ew5.t(j), "), ", str), null);
        }
        return xp3Var;
    }

    public final ez7 e(String str, InetAddress[] inetAddressArr) {
        ez7 ez7Var;
        boolean zC;
        fik fikVar;
        ReentrantReadWriteLock.WriteLock writeLock = this.f.writeLock();
        writeLock.lock();
        b9b b9bVar = this.g;
        try {
            if (inetAddressArr != null) {
                int i = b9bVar.i(str);
                boolean z = i < 0;
                ez7Var = (ez7) (z ? null : b9bVar.c[i]);
                if (ez7Var != null) {
                    zC = ez7Var.c(inetAddressArr);
                } else {
                    ez7Var = new ez7(str, inetAddressArr, true);
                    ReentrantReadWriteLock.ReadLock lock = ez7Var.c.readLock();
                    lock.lock();
                    try {
                        boolean zIsEmpty = true ^ ez7Var.d.isEmpty();
                        lock.unlock();
                        zC = zIsEmpty;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                }
                if (z) {
                    int i2 = ~i;
                    b9bVar.b[i2] = str;
                    b9bVar.c[i2] = ez7Var;
                } else {
                    b9bVar.c[i] = ez7Var;
                }
            } else {
                ez7Var = (ez7) b9bVar.d(str);
                zC = false;
            }
            v44 v44VarA = this.c.a();
            v44 v44Var = this.h;
            if (v44Var == null || ew5.d(v44Var.j(), this.a) > 0) {
                c(this, v44VarA, 2);
            }
            writeLock.unlock();
            if (ez7Var != null) {
                en8 en8Var = this.i;
                ReentrantReadWriteLock.WriteLock writeLock2 = ez7Var.c.writeLock();
                writeLock2.lock();
                try {
                    ArrayList arrayList = ez7Var.d;
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        bx3.Y0(arrayList, (dn8) en8Var.a.getValue());
                    }
                    writeLock2.unlock();
                } catch (Throwable th2) {
                    writeLock2.unlock();
                    throw th2;
                }
            }
            if (zC && (fikVar = this.d) != null) {
                fikVar.D(str, ez7Var != null ? ez7Var.a() : null);
            }
            return ez7Var;
        } catch (Throwable th3) {
            writeLock.unlock();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0073 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #0 {all -> 0x002b, blocks: (B:5:0x0011, B:6:0x0015, B:8:0x001b, B:14:0x002e, B:16:0x0034, B:18:0x0038, B:19:0x0040, B:21:0x0049, B:23:0x004d, B:24:0x0053, B:26:0x0059, B:28:0x0063, B:32:0x006a, B:36:0x0073), top: B:42:0x0011 }] */
    public final void f(String str, InetAddress inetAddress, boolean z) {
        Object next;
        ez7 ez7VarA = a(str);
        if (ez7VarA != null) {
            ArrayList arrayList = ez7VarA.d;
            ReentrantReadWriteLock.WriteLock writeLock = ez7VarA.c.writeLock();
            writeLock.lock();
            try {
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!cqk.d(((cn8) next).a, inetAddress));
                cn8 cn8Var = (cn8) next;
                if (cn8Var != null) {
                    fn8 fn8Var = cn8Var.b;
                    if (z) {
                        fn8Var.c++;
                        fn8Var.d = 0;
                    } else {
                        fn8Var.d++;
                        fn8Var.c = 0;
                    }
                }
                if (!z) {
                    if (ez7VarA.f) {
                        Iterator it2 = arrayList.iterator();
                        boolean z2 = true;
                        int i = 0;
                        while (it2.hasNext()) {
                            fn8 fn8Var2 = ((cn8) it2.next()).b;
                            z2 = z2 && fn8Var2.d > 0;
                            i += fn8Var2.d;
                        }
                        if (z2 && i > 3) {
                            ez7VarA.e.set(true);
                        }
                    } else {
                        ez7VarA.e.set(true);
                    }
                }
            } finally {
                writeLock.unlock();
            }
        }
    }

    public final void g(String str, InetAddress inetAddress) {
        Object next;
        ez7 ez7VarA = a(str);
        if (ez7VarA != null) {
            ReentrantReadWriteLock.WriteLock writeLock = ez7VarA.c.writeLock();
            writeLock.lock();
            try {
                Iterator it = ez7VarA.d.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!cqk.d(((cn8) next).a, inetAddress));
                cn8 cn8Var = (cn8) next;
                if (cn8Var != null) {
                    cn8Var.b.b++;
                }
            } finally {
                writeLock.unlock();
            }
        }
    }
}
