package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import one.me.android.initialization.AccountInitializer;
import one.me.chats.list.ChatsListWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.exception.UserNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        mdb mdbVar = (mdb) this.b;
        c85 c85Var = (c85) mdbVar.a.get();
        if (c85Var != null) {
            int iB = mdbVar.c.b();
            int i = c85Var.a;
            Object obj = c85Var.b;
            switch (i) {
                case 0:
                    d85 d85Var = (d85) obj;
                    synchronized (d85Var) {
                        int i2 = d85Var.n;
                        if (i2 == 0 || d85Var.e) {
                            if (i2 != iB || d85Var.o == null) {
                                d85Var.n = iB;
                                if (iB != 1 && iB != 0 && iB != 8) {
                                    if (d85Var.o == null) {
                                        d85Var.o = vqi.z(d85Var.a);
                                    }
                                    d85Var.l = d85Var.j(iB);
                                    d85Var.d.getClass();
                                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                                    int i3 = d85Var.g > 0 ? (int) (jElapsedRealtime - d85Var.h) : 0;
                                    long j = d85Var.i;
                                    long j2 = d85Var.l;
                                    if (i3 != 0 || j != 0 || j2 != d85Var.m) {
                                        d85Var.m = j2;
                                        d85Var.c.b(i3, j, j2);
                                    }
                                    d85Var.h = jElapsedRealtime;
                                    d85Var.i = 0L;
                                    d85Var.k = 0L;
                                    d85Var.j = 0L;
                                    uag uagVar = d85Var.f;
                                    uagVar.b.clear();
                                    uagVar.d = -1;
                                    uagVar.e = 0;
                                    uagVar.f = 0;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                default:
                    zg6 zg6Var = (zg6) obj;
                    synchronized (zg6Var) {
                        int i4 = zg6Var.f;
                        if (i4 == 0 || zg6Var.c) {
                            if (i4 != iB || zg6Var.h == null) {
                                zg6Var.f = iB;
                                if (iB != 1 && iB != 0 && iB != 8) {
                                    if (zg6Var.h == null) {
                                        zg6Var.h = vqi.z(zg6Var.a);
                                    }
                                    long j3 = zg6Var.j(iB);
                                    zg6Var.g = j3;
                                    zeg zegVar = zg6Var.e;
                                    zegVar.d.getClass();
                                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                    zegVar.a(zegVar.f > 0 ? (int) (jElapsedRealtime2 - zegVar.g) : 0, zegVar.h, j3);
                                    zegVar.a.reset();
                                    zegVar.i = Long.MIN_VALUE;
                                    zegVar.g = jElapsedRealtime2;
                                    zegVar.h = 0L;
                                    zegVar.k = 0;
                                    zegVar.l = 0L;
                                    jqc jqcVar = zg6Var.d;
                                    uag uagVar2 = jqcVar.b;
                                    uagVar2.b.clear();
                                    uagVar2.d = -1;
                                    uagVar2.e = 0;
                                    uagVar2.f = 0;
                                    jqcVar.e = true;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:177:0x0397  */
    /* JADX WARN: Code duplicated, block: B:222:0x045e  */
    /* JADX WARN: Code duplicated, block: B:242:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:246:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:248:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:250:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:253:0x04eb A[Catch: all -> 0x0522, TryCatch #2 {all -> 0x0522, blocks: (B:251:0x04e7, B:253:0x04eb, B:255:0x04f5), top: B:478:0x04e7 }] */
    /* JADX WARN: Code duplicated, block: B:255:0x04f5 A[Catch: all -> 0x0522, TRY_LEAVE, TryCatch #2 {all -> 0x0522, blocks: (B:251:0x04e7, B:253:0x04eb, B:255:0x04f5), top: B:478:0x04e7 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:261:0x0508 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:262:0x050a A[Catch: all -> 0x0515, TryCatch #9 {all -> 0x0515, blocks: (B:259:0x0502, B:262:0x050a, B:265:0x0518, B:258:0x04fc), top: B:492:0x0502 }] */
    /* JADX WARN: Code duplicated, block: B:270:0x0528  */
    /* JADX WARN: Code duplicated, block: B:274:0x0539  */
    /* JADX WARN: Code duplicated, block: B:276:0x053e A[LOOP:6: B:243:0x04c8->B:276:0x053e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:279:0x0547  */
    /* JADX WARN: Code duplicated, block: B:290:0x056c  */
    /* JADX WARN: Code duplicated, block: B:305:0x059e  */
    /* JADX WARN: Code duplicated, block: B:409:0x093a  */
    /* JADX WARN: Code duplicated, block: B:443:0x0a47  */
    /* JADX WARN: Code duplicated, block: B:529:0x05a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x054b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:570:0x0a4b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0265  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v36, types: [xd6] */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v2, types: [int] */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r9v47 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i;
        boolean z;
        boolean z2;
        lq4 lq4Var;
        long jB;
        ReentrantReadWriteLock.ReadLock lock;
        ReentrantReadWriteLock.ReadLock readLock;
        ji9 ji9Var;
        long[] jArr;
        long[] jArr2;
        Object[] objArr;
        int length;
        xd6 xd6Var;
        sbi sbiVar;
        ReentrantReadWriteLock.ReadLock readLock2;
        ArrayList arrayList;
        Object poeVar;
        Throwable thA;
        int i2;
        long j;
        long[] jArr3;
        int i3;
        int i4;
        long j2;
        int i5;
        ncj ncjVar;
        long jO;
        ArrayList arrayList2;
        Object poeVar2;
        int i6;
        long jO2;
        long j3 = 0;
        char c = 2;
        ViewGroup viewGroup = null;
        boolean z3 = true;
        boolean z4 = false;
        switch (this.a) {
            case 0:
                svb svbVarA = ((AccountInitializer) this.b).d().a();
                svbVarA.getClass();
                gm0.n("svb", "invalidate");
                if (svbVarA.b()) {
                    return;
                }
                svbVarA.d(false);
                return;
            case 1:
                ((a6) this.b).invoke();
                return;
            case 2:
                ((RecyclerView) ((View) this.b)).X();
                return;
            case 3:
                hk hkVar = (hk) ((hk) this.b).c.b;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList3 = hkVar.b;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                    ifg ifgVar = (ifg) arrayList3.get(i7);
                    if (ifgVar != null) {
                        h6g h6gVar = hkVar.a;
                        Long l = (Long) h6gVar.get(ifgVar);
                        if (l != null) {
                            if (l.longValue() < jUptimeMillis2) {
                                h6gVar.remove(ifgVar);
                            }
                        }
                        long j4 = ifgVar.i;
                        if (j4 == 0) {
                            ifgVar.i = jUptimeMillis;
                            ifgVar.e(ifgVar.b);
                        } else {
                            long j5 = jUptimeMillis - j4;
                            ifgVar.i = jUptimeMillis;
                            float f = ifg.d().g;
                            long j6 = f == 0.0f ? 2147483647L : (long) (j5 / f);
                            boolean z5 = ifgVar.o;
                            float f2 = ifgVar.n;
                            if (z5) {
                                if (f2 != Float.MAX_VALUE) {
                                    ifgVar.m.i = f2;
                                    ifgVar.n = Float.MAX_VALUE;
                                }
                                ifgVar.b = (float) ifgVar.m.i;
                                ifgVar.a = 0.0f;
                                ifgVar.o = false;
                            } else {
                                jfg jfgVar = ifgVar.m;
                                float f3 = ifgVar.b;
                                float f4 = ifgVar.a;
                                if (f2 != Float.MAX_VALUE) {
                                    long j7 = j6 / 2;
                                    xw5 xw5VarC = jfgVar.c(f3, f4, j7);
                                    jfg jfgVar2 = ifgVar.m;
                                    jfgVar2.i = ifgVar.n;
                                    ifgVar.n = Float.MAX_VALUE;
                                    xw5 xw5VarC2 = jfgVar2.c(xw5VarC.a, xw5VarC.b, j7);
                                    ifgVar.b = xw5VarC2.a;
                                    ifgVar.a = xw5VarC2.b;
                                } else {
                                    xw5 xw5VarC3 = jfgVar.c(f3, f4, j6);
                                    ifgVar.b = xw5VarC3.a;
                                    ifgVar.a = xw5VarC3.b;
                                }
                                float fMax = Math.max(ifgVar.b, ifgVar.h);
                                ifgVar.b = fMax;
                                float fMin = Math.min(fMax, ifgVar.g);
                                ifgVar.b = fMin;
                                float f5 = ifgVar.a;
                                jfg jfgVar3 = ifgVar.m;
                                jfgVar3.getClass();
                                if (Math.abs(f5) >= jfgVar3.e || Math.abs(fMin - ((float) jfgVar3.i)) >= jfgVar3.d) {
                                    z = false;
                                } else {
                                    ifgVar.b = (float) ifgVar.m.i;
                                    ifgVar.a = 0.0f;
                                }
                                float fMin2 = Math.min(ifgVar.b, ifgVar.g);
                                ifgVar.b = fMin2;
                                float fMax2 = Math.max(fMin2, ifgVar.h);
                                ifgVar.b = fMax2;
                                ifgVar.e(fMax2);
                                if (z) {
                                    ifgVar.c(false);
                                }
                            }
                            z = true;
                            float fMin3 = Math.min(ifgVar.b, ifgVar.g);
                            ifgVar.b = fMin3;
                            float fMax3 = Math.max(fMin3, ifgVar.h);
                            ifgVar.b = fMax3;
                            ifgVar.e(fMax3);
                            if (z) {
                                ifgVar.c(false);
                            }
                        }
                    }
                }
                if (hkVar.f) {
                    for (int size = arrayList3.size() - 1; size >= 0; size--) {
                        if (arrayList3.get(size) == null) {
                            arrayList3.remove(size);
                        }
                    }
                    if (arrayList3.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        hkVar.h.y();
                    }
                    i = 0;
                    hkVar.f = false;
                } else {
                    i = 0;
                }
                if (arrayList3.size() > 0) {
                    ((Choreographer) hkVar.e.b).postFrameCallback(new gk(i, hkVar.d));
                    return;
                }
                return;
            case 4:
                qu quVar = (qu) this.b;
                naj najVar = (naj) ((ny8) quVar.a).getValue();
                ny8 ny8Var = (ny8) quVar.c;
                wsc wscVar = (wsc) ny8Var.getValue();
                String[] strArr = wsc.e;
                String str = strArr[0];
                if (((SharedPreferences) ((ifh) wscVar.c.c).getValue()).getBoolean(str, false) || np4.c(wscVar.a, str) != 0) {
                    z2 = false;
                } else {
                    gm0.n((String) quVar.e, "forceContactsSync");
                    fbc fbcVar = wscVar.c;
                    boolean zC = wscVar.c(wsc.g);
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) ((ifh) fbcVar.c).getValue()).edit();
                    editorEdit.putBoolean(strArr[0], zC);
                    editorEdit.apply();
                    z2 = true;
                }
                najVar.b(z2);
                ((wsc) ny8Var.getValue()).d();
                return;
            case 5:
                r70 r70Var = (r70) this.b;
                ((Context) r70Var.b).unregisterReceiver((q70) r70Var.c);
                return;
            case 6:
                i92 i92Var = (i92) this.b;
                try {
                    i92Var.q.d(i92Var);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 7:
                xu2 xu2Var = (xu2) this.b;
                xu2Var.n1 = false;
                xu2Var.requestLayout();
                return;
            case 8:
                je9 je9Var = je9.d;
                qw2 qw2Var = (qw2) this.b;
                if (qw2Var.l) {
                    return;
                }
                gm0.n("qw2", "load 1: start");
                if (qw2Var.l) {
                    return;
                }
                ((pwh) qw2Var.z.get()).getClass();
                Trace.beginSection("ChatController.load()");
                gm0.n("Trace", "ChatController.load()");
                long jNanoTime = System.nanoTime();
                pw pwVar = new pw(0);
                ArrayList arrayList4 = new ArrayList();
                dp5 dp5Var = qw2Var.z;
                ((pwh) dp5Var.get()).getClass();
                Trace.beginSection("ChatController.selectChats()");
                gm0.n("Trace", "ChatController.selectChats()");
                hre hreVarA = ((n25) qw2Var.n.get()).a();
                ph3 ph3Var = (ph3) hreVarA.e();
                List list = (List) ch3.G(ph3Var.a, true, false, new g3(7, ph3Var));
                TreeSet treeSet = new TreeSet(hre.g);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    treeSet.add(hreVarA.a((jy2) it.next()));
                }
                List<ox2> listT1 = ww3.T1(treeSet);
                ((pwh) dp5Var.get()).getClass();
                Trace.endSection();
                m8b m8bVar = new m8b();
                gm0.n("qw2", "load 2");
                for (ox2 ox2Var : listT1) {
                    nx2 nx2Var = ox2Var.b;
                    lx2 lx2Var = nx2Var.b;
                    if ((lx2Var == lx2.b || lx2Var == lx2.c) && !nx2Var.e.containsKey(Long.valueOf(qw2Var.S()))) {
                        m8bVar.a(ox2Var.a);
                    } else {
                        qw2Var.Y(ox2Var.a, ox2Var);
                        pwVar.add(Long.valueOf(ox2Var.a));
                        long j8 = ox2Var.b.j;
                        if (j8 > 0) {
                            arrayList4.add(Long.valueOf(j8));
                        }
                    }
                }
                gm0.n("qw2", "load 3");
                if (!m8bVar.i()) {
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        lq4Var = null;
                        a4cVar.c(je9Var, "qw2", "clearNonParticipantChats ".concat(m8b.k(m8bVar, 25)), null);
                    } else {
                        lq4Var = null;
                    }
                    yab.i0(qw2Var.D, ((n0c) qw2Var.E).b(), 0, new dn0(qw2Var, m8bVar, lq4Var, 21), 2);
                }
                gm0.n("qw2", "load 4");
                ((pwh) qw2Var.z.get()).getClass();
                Trace.beginSection("ChatController.load().processedChats");
                gm0.n("Trace", "ChatController.load().processedChats");
                l8b l8bVarT = ((ose) ((qfa) qw2Var.u.get()).b.c()).t(arrayList4);
                gm0.n("qw2", "load 5");
                hw hwVar = new hw(pwVar);
                while (hwVar.hasNext()) {
                    Long l2 = (Long) hwVar.next();
                    ox2 ox2Var2 = (ox2) qw2Var.g.get(l2);
                    if (ox2Var2 == null) {
                        gm0.W("qw2", "Can't build and put chat, because chatDb is null, id: %d", l2);
                    } else {
                        rt2 rt2VarU = qw2Var.u(ox2Var2, (sfa) l8bVarT.f(ox2Var2.b.j));
                        if (qw2Var.b.getValue() == null && rt2VarU.y0()) {
                            mjg mjgVar = qw2Var.b;
                            mjgVar.getClass();
                            mjgVar.j(null, rt2VarU);
                        }
                    }
                }
                gm0.n("qw2", "load 6");
                ((pwh) qw2Var.z.get()).getClass();
                Trace.endSection();
                qw2Var.l = true;
                gm0.n("qw2", "load 7");
                qw2Var.m.j0();
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    Locale locale = Locale.ROOT;
                    StringBuilder sbX = zo5.x(pwVar.c, (System.nanoTime() - jNanoTime) / 1000000, "chats loaded to memory cache size: ", " by time ");
                    sbX.append("ms");
                    a4cVar2.c(je9Var, "qw2", sbX.toString(), null);
                }
                qw2Var.o.c(new wo3((Collection) pwVar, true, true, (mg5) null, (cid) null, (Set) null, 120));
                ((pwh) qw2Var.z.get()).getClass();
                Trace.endSection();
                if (qw2Var.b.getValue() == null) {
                    try {
                        qw2Var.E();
                        List listSingletonList = Collections.singletonList((rt2) qw2Var.b.getValue());
                        ow2 ow2Var = qw2Var.G;
                        if (ow2Var != null) {
                            ow2Var.a(listSingletonList);
                        }
                        break;
                    } catch (UserNotFoundException unused2) {
                    }
                }
                gm0.m("qw2", "load 8: finish, chatDbs: %d, chats: %d", Integer.valueOf(qw2Var.g.size()), Integer.valueOf(qw2Var.i.size()));
                return;
            case 9:
                ChatsListWidget chatsListWidget = (ChatsListWidget) this.b;
                String str2 = chatsListWidget.d;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 == null) {
                    return;
                }
                je9 je9Var2 = je9.f;
                if (a4cVar3.b(je9Var2)) {
                    a4cVar3.c(je9Var2, str2, qv1.k("Can't update chats list for folder: ", chatsListWidget.e), null);
                    return;
                }
                return;
            case 10:
                Iterator it2 = ((de4) this.b).m.iterator();
                while (it2.hasNext()) {
                    ((vd4) it2.next()).a();
                }
                return;
            case 11:
                jt5.K((jt5) this.b);
                return;
            case 12:
                nt5 nt5Var = (nt5) this.b;
                View view = nt5Var.a;
                if (nt5Var.d.isAlive()) {
                    nt5Var.d.removeOnPreDrawListener(nt5Var);
                } else {
                    view.getViewTreeObserver().removeOnPreDrawListener(nt5Var);
                }
                view.removeOnAttachStateChangeListener(nt5Var);
                return;
            case 13:
                ((j96) this.b).a.set(true);
                return;
            case 14:
                ce6 ce6Var = (ce6) this.b;
                sbi sbiVar2 = sbi.a;
                ce6Var.r = Thread.currentThread();
                boolean z6 = ce6Var.f;
                zd6 zd6Var = ce6Var.b;
                zd6 zd6Var2 = ce6Var.b;
                if (z6) {
                    long jB2 = zd6Var.b();
                    long jA = zd6Var2.a();
                    xd6 xd6Var2 = new xd6(ce6Var, jA);
                    ce6Var.s = xd6Var2;
                    if (ew5.d(jB2, jA) <= 0) {
                        jA = jB2;
                    }
                    while (!ce6Var.a.isTerminated() && !ce6Var.i) {
                        if (ce6Var.q.get() == 0) {
                            long j9 = ce6Var.o.get();
                            ce6Var.n.set(z3);
                            if (ce6Var.q.get() == 0 && ce6Var.o.get() == j9) {
                                LockSupport.park(ce6Var);
                            }
                            ce6Var.n.set(z4);
                            if (ce6Var.i || ce6Var.a.isTerminated()) {
                                ce6Var.s = viewGroup;
                                return;
                            }
                        }
                        c = c;
                        long jP = ew5.p(ce6Var.e.b(), jB2);
                        while (true) {
                            xd6Var2 = xd6Var2;
                            if (ew5.d(ce6Var.e.b(), jP) < 0 && !ce6Var.i) {
                                long jO3 = ew5.o(jP, ce6Var.e.b());
                                if (ew5.d(jO3, j3) > 0) {
                                    if (ce6Var.y() > 0 || ce6Var.A() > 0) {
                                        xd6Var2.a();
                                    } else {
                                        ReentrantReadWriteLock.ReadLock lock2 = ce6Var.l.readLock();
                                        lock2.lock();
                                        try {
                                            boolean zD = ce6Var.k.d();
                                            lock2.unlock();
                                            if (zD) {
                                                xd6Var2.a();
                                            }
                                        } catch (Throwable th) {
                                            lock2.unlock();
                                            throw th;
                                        }
                                    }
                                    if (ew5.d(jA, jO3) <= 0) {
                                        jO3 = jA;
                                    }
                                    long j10 = ce6Var.o.get();
                                    try {
                                        ce6Var.n.set(z3);
                                        if (ce6Var.o.get() != j10) {
                                            ce6Var.n.set(z4);
                                        } else {
                                            LockSupport.parkNanos(ce6Var, ew5.h(jO3));
                                            Thread.interrupted();
                                            ce6Var.n.set(z4);
                                        }
                                        xd6Var2 = xd6Var2;
                                    } catch (Throwable th2) {
                                        ce6Var.n.set(z4);
                                        throw th2;
                                    }
                                }
                            }
                        }
                        if (ce6Var.i) {
                            viewGroup = null;
                        } else {
                            long jB3 = ce6Var.e.b();
                            ReentrantReadWriteLock.ReadLock lock3 = ce6Var.l.readLock();
                            lock3.lock();
                            try {
                                ji9 ji9Var2 = ce6Var.k;
                                long[] jArr4 = ji9Var2.c;
                                long[] jArr5 = ji9Var2.d;
                                Object[] objArr2 = ji9Var2.e;
                                int length2 = jArr4.length - 2;
                                boolean z7 = z3;
                                if (length2 >= 0) {
                                    ?? r31 = z4;
                                    ArrayList arrayList5 = null;
                                    while (true) {
                                        long j11 = jArr4[r31];
                                        long[] jArr6 = jArr5;
                                        Object[] objArr3 = objArr2;
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            for (int i8 = 0; i8 < 8; i8 = i6 + 1) {
                                                if ((j11 & 255) < 128) {
                                                    int i9 = (r31 << 3) + i8;
                                                    i6 = i8;
                                                    if (i9 < ji9Var2.a) {
                                                        long j12 = jArr6[i9];
                                                        ncj ncjVar2 = (ncj) objArr3[i9];
                                                        if (ncjVar2.d == null) {
                                                            ghb ghbVar = ew5.b;
                                                            jO2 = 0;
                                                        } else {
                                                            jO2 = ew5.o(jB3, ncjVar2.c);
                                                        }
                                                        if (ew5.d(jO2, jB2) > 0) {
                                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList(ce6Var.k.b) : arrayList5;
                                                            arrayList6.add(ncjVar2.a());
                                                            arrayList5 = arrayList6;
                                                        }
                                                    }
                                                    j11 >>= 8;
                                                } else {
                                                    i6 = i8;
                                                }
                                                j11 = j11;
                                                j11 >>= 8;
                                            }
                                        }
                                        ?? r9 = r31;
                                        if (r9 != length2) {
                                            jArr5 = jArr6;
                                            objArr2 = objArr3;
                                            r31 = (r9 == true ? 1 : 0) + 1;
                                        } else {
                                            arrayList2 = arrayList5;
                                        }
                                    }
                                } else {
                                    arrayList2 = null;
                                }
                                lock3.unlock();
                                if (arrayList2 != null && (!arrayList2.isEmpty()) == z7) {
                                    try {
                                        ce6Var.b.d(arrayList2);
                                        poeVar2 = sbiVar2;
                                    } catch (Throwable th3) {
                                        poeVar2 = new poe(th3);
                                    }
                                    Throwable thA2 = roe.a(poeVar2);
                                    if (thA2 != null) {
                                        thA2.printStackTrace();
                                    }
                                }
                                boolean z8 = ce6Var.y() > 0 || ce6Var.A() > 0;
                                if (z8) {
                                    xd6Var2.a();
                                } else {
                                    ReentrantReadWriteLock.ReadLock lock4 = ce6Var.l.readLock();
                                    lock4.lock();
                                    try {
                                        boolean zD2 = ce6Var.k.d();
                                        lock4.unlock();
                                        if (zD2) {
                                            xd6Var2.a();
                                        }
                                    } catch (Throwable th4) {
                                        lock4.unlock();
                                        throw th4;
                                    }
                                }
                                if (!z8) {
                                    ReentrantReadWriteLock.ReadLock lock5 = ce6Var.l.readLock();
                                    lock5.lock();
                                    try {
                                        boolean z9 = ce6Var.k.b == 0;
                                        lock5.unlock();
                                        if (z9) {
                                            ce6Var.q.set(0);
                                            z4 = false;
                                            j3 = 0;
                                            viewGroup = null;
                                            z3 = true;
                                        }
                                    } catch (Throwable th5) {
                                        lock5.unlock();
                                        throw th5;
                                    }
                                }
                                j3 = 0;
                                viewGroup = null;
                                z3 = true;
                                z4 = false;
                            } catch (Throwable th6) {
                                lock3.unlock();
                                throw th6;
                            }
                        }
                    }
                    ce6Var.s = viewGroup;
                    return;
                }
                long jB4 = zd6Var.b();
                long jA2 = zd6Var2.a();
                xd6 xd6Var3 = new xd6(ce6Var, jA2);
                ce6Var.s = xd6Var3;
                if (ew5.d(jB4, jA2) <= 0) {
                    jA2 = jB4;
                }
                while (!ce6Var.a.isTerminated() && !ce6Var.i) {
                    long jP2 = ew5.p(ce6Var.e.b(), jB4);
                    while (ew5.d(ce6Var.e.b(), jP2) < 0 && !ce6Var.i) {
                        long jO4 = ew5.o(jP2, ce6Var.e.b());
                        if (ew5.d(jO4, 0L) > 0) {
                            if (ce6Var.y() > 0 || ce6Var.A() > 0) {
                                xd6Var3.a();
                            } else {
                                ReentrantReadWriteLock.ReadLock lock6 = ce6Var.l.readLock();
                                lock6.lock();
                                try {
                                    boolean zD3 = ce6Var.k.d();
                                    lock6.unlock();
                                    if (zD3) {
                                        xd6Var3.a();
                                    }
                                } catch (Throwable th7) {
                                    lock6.unlock();
                                    throw th7;
                                }
                            }
                            if (ew5.d(jA2, jO4) <= 0) {
                                jO4 = jA2;
                            }
                            long j13 = ce6Var.o.get();
                            try {
                                ce6Var.n.set(true);
                                if (ce6Var.o.get() != j13) {
                                    ce6Var.n.set(false);
                                } else {
                                    LockSupport.parkNanos(ce6Var, ew5.h(jO4));
                                    Thread.interrupted();
                                    ce6Var.n.set(false);
                                }
                            } catch (Throwable th8) {
                                ce6Var.n.set(false);
                                throw th8;
                            }
                        } else if (!ce6Var.i) {
                            jB = ce6Var.e.b();
                            lock = ce6Var.l.readLock();
                            lock.lock();
                            try {
                                ji9Var = ce6Var.k;
                                jArr = ji9Var.c;
                                jArr2 = ji9Var.d;
                                objArr = ji9Var.e;
                                length = jArr.length - 2;
                                xd6Var = xd6Var3;
                                sbiVar = sbiVar2;
                                long j14 = jA2;
                                if (length >= 0) {
                                    i2 = 0;
                                    arrayList = null;
                                    while (true) {
                                        j = jArr[i2];
                                        readLock = lock;
                                        jArr3 = jArr;
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            i3 = 0;
                                            i4 = 8;
                                            while (i3 < i4) {
                                                if ((j & 255) < 128) {
                                                    i5 = (i2 << 3) + i3;
                                                    j2 = j;
                                                    try {
                                                        if (i5 < ji9Var.a) {
                                                            long j15 = jArr2[i5];
                                                            ncjVar = (ncj) objArr[i5];
                                                            if (ncjVar.d == null) {
                                                                ghb ghbVar2 = ew5.b;
                                                                jO = 0;
                                                            } else {
                                                                jO = ew5.o(jB, ncjVar.c);
                                                            }
                                                            try {
                                                                if (ew5.d(jO, jB4) > 0) {
                                                                    if (arrayList == null) {
                                                                        arrayList = new ArrayList(ce6Var.k.b);
                                                                    }
                                                                    arrayList.add(ncjVar.a());
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                                readLock.unlock();
                                                                throw th;
                                                            }
                                                        }
                                                        i3++;
                                                        ReentrantReadWriteLock.ReadLock readLock3 = readLock;
                                                        i4 = 8;
                                                        j = j2 >> 8;
                                                        readLock = readLock3;
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                        readLock = readLock;
                                                    }
                                                } else {
                                                    j2 = j;
                                                }
                                                readLock = readLock;
                                                i3++;
                                                ReentrantReadWriteLock.ReadLock readLock4 = readLock;
                                                i4 = 8;
                                                j = j2 >> 8;
                                                readLock = readLock4;
                                            }
                                        }
                                        readLock2 = readLock;
                                        if (i2 != length) {
                                            i2++;
                                            lock = readLock2;
                                            jArr = jArr3;
                                        }
                                    }
                                } else {
                                    readLock2 = lock;
                                    arrayList = null;
                                }
                                readLock2.unlock();
                                if (arrayList != null && (!arrayList.isEmpty())) {
                                    try {
                                        ce6Var.b.d(arrayList);
                                        poeVar = sbiVar;
                                    } catch (Throwable th11) {
                                        poeVar = new poe(th11);
                                    }
                                    thA = roe.a(poeVar);
                                    if (thA != null) {
                                        thA.printStackTrace();
                                    }
                                }
                                if (ce6Var.y() <= 0 || ce6Var.A() > 0) {
                                    xd6Var.a();
                                } else {
                                    ReentrantReadWriteLock.ReadLock lock7 = ce6Var.l.readLock();
                                    lock7.lock();
                                    try {
                                        boolean zD4 = ce6Var.k.d();
                                        lock7.unlock();
                                        if (zD4) {
                                            xd6Var.a();
                                        }
                                    } catch (Throwable th12) {
                                        lock7.unlock();
                                        throw th12;
                                    }
                                }
                                xd6Var3 = xd6Var;
                                sbiVar2 = sbiVar;
                                jA2 = j14;
                            } catch (Throwable th13) {
                                th = th13;
                                readLock = lock;
                            }
                        }
                    }
                    if (!ce6Var.i) {
                        jB = ce6Var.e.b();
                        lock = ce6Var.l.readLock();
                        lock.lock();
                        ji9Var = ce6Var.k;
                        jArr = ji9Var.c;
                        jArr2 = ji9Var.d;
                        objArr = ji9Var.e;
                        length = jArr.length - 2;
                        xd6Var = xd6Var3;
                        sbiVar = sbiVar2;
                        long j16 = jA2;
                        if (length >= 0) {
                            i2 = 0;
                            arrayList = null;
                            while (true) {
                                j = jArr[i2];
                                readLock = lock;
                                jArr3 = jArr;
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    i3 = 0;
                                    i4 = 8;
                                    while (i3 < i4) {
                                        if ((j & 255) < 128) {
                                            i5 = (i2 << 3) + i3;
                                            j2 = j;
                                            if (i5 < ji9Var.a) {
                                                long j17 = jArr2[i5];
                                                ncjVar = (ncj) objArr[i5];
                                                if (ncjVar.d == null) {
                                                    ghb ghbVar3 = ew5.b;
                                                    jO = 0;
                                                } else {
                                                    jO = ew5.o(jB, ncjVar.c);
                                                }
                                                if (ew5.d(jO, jB4) > 0) {
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList(ce6Var.k.b);
                                                    }
                                                    arrayList.add(ncjVar.a());
                                                }
                                            }
                                            i3++;
                                            ReentrantReadWriteLock.ReadLock readLock5 = readLock;
                                            i4 = 8;
                                            j = j2 >> 8;
                                            readLock = readLock5;
                                        } else {
                                            j2 = j;
                                        }
                                        readLock = readLock;
                                        i3++;
                                        ReentrantReadWriteLock.ReadLock readLock6 = readLock;
                                        i4 = 8;
                                        j = j2 >> 8;
                                        readLock = readLock6;
                                    }
                                }
                                readLock2 = readLock;
                                if (i2 != length) {
                                    i2++;
                                    lock = readLock2;
                                    jArr = jArr3;
                                }
                            }
                        } else {
                            readLock2 = lock;
                            arrayList = null;
                        }
                        readLock2.unlock();
                        if (arrayList != null) {
                            ce6Var.b.d(arrayList);
                            poeVar = sbiVar;
                            thA = roe.a(poeVar);
                            if (thA != null) {
                                thA.printStackTrace();
                            }
                        }
                        if (ce6Var.y() <= 0) {
                            xd6Var.a();
                        } else {
                            xd6Var.a();
                        }
                        xd6Var3 = xd6Var;
                        sbiVar2 = sbiVar;
                        jA2 = j16;
                    }
                }
                ce6Var.s = null;
                return;
            case 15:
                ((xd6) this.b).b.set(true);
                return;
            case 16:
                bg6 bg6Var = (bg6) this.b;
                ma maVar = bg6Var.D;
                Context context = bg6Var.f;
                String str3 = vqi.a;
                int iGenerateAudioSessionId = p90.q(context).generateAudioSessionId();
                Integer numValueOf = Integer.valueOf(iGenerateAudioSessionId != -1 ? iGenerateAudioSessionId : 0);
                maVar.f = numValueOf;
                o90 o90Var = new o90(maVar, 1, numValueOf);
                sfh sfhVar = (sfh) maVar.c;
                if (sfhVar.a.getLooper().getThread().isAlive()) {
                    sfhVar.f(o90Var);
                    return;
                }
                return;
            case 17:
                ((y8e) this.b).d();
                return;
            case 18:
                d09 d09Var = (d09) this.b;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(d09Var, "translationY", -8.0f, 8.0f);
                objectAnimatorOfFloat.setDuration(2500L);
                objectAnimatorOfFloat.setRepeatCount(-1);
                objectAnimatorOfFloat.setRepeatMode(2);
                objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat.addUpdateListener(new hn7(d09Var, 1));
                objectAnimatorOfFloat.start();
                return;
            case 19:
                vo8 vo8Var = (vo8) this.b;
                if (vo8Var != null) {
                    vo8Var.b(null);
                    return;
                }
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((xyj) ((ec9) this.b).c.getValue()).c("TIME_CHANGE");
                return;
            case 21:
                ((iu9) this.b).Q();
                return;
            case 22:
                o3a o3aVar = (o3a) this.b;
                vqi.d0(o3aVar.g.l, new k36(22, o3aVar));
                return;
            case 23:
                ika ikaVar = (ika) this.b;
                if (!((svb) ikaVar.c.getValue()).b()) {
                    gm0.Y("ika", "restoreUploads: not authorized");
                    return;
                } else {
                    gm0.n("ika", "restoreUploadsFromStorage");
                    yab.i0(ikaVar.a, null, 0, new gz(ikaVar, null, 11), 3).Y(new g3(18, ikaVar));
                    return;
                }
            case 24:
                a();
                return;
            case 25:
                ytb ytbVar = (ytb) this.b;
                View view2 = ytbVar.a;
                if (ytbVar.c.isAlive()) {
                    ytbVar.c.removeOnPreDrawListener(ytbVar);
                } else {
                    view2.getViewTreeObserver().removeOnPreDrawListener(ytbVar);
                }
                view2.removeOnAttachStateChangeListener(ytbVar);
                return;
            case 26:
                v0c.setCounter$lambda$1((v0c) this.b);
                return;
            case 27:
                View childAt = ((aac) this.b).getChildAt(0);
                viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
                if (viewGroup != null) {
                    viewGroup.post(new e6(28, viewGroup));
                    return;
                }
                return;
            case 28:
                ViewGroup viewGroup2 = (ViewGroup) this.b;
                viewGroup2.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), viewGroup2.getPaddingTop(), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), viewGroup2.getPaddingBottom());
                viewGroup2.setClipToPadding(false);
                return;
            default:
                guc gucVar = (guc) this.b;
                try {
                    gucVar.f();
                    return;
                } catch (Exception e) {
                    gm0.l("guc", "syncInternal: exception", e);
                    ((t1c) gucVar.l).a(new IllegalStateException("guc".concat(" syncInternal: exception"), e));
                    return;
                }
        }
    }
}
