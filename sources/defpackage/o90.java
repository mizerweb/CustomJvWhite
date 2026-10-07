package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackStateEvent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.view.Surface;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.b;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.MediaSessionService;
import com.android.installreferrer.api.ReferrerDetails;
import com.my.tracker.applifecycle.o.a;
import com.my.tracker.core.o.h;
import com.my.tracker.core.utils.Consumer;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.conn.params.ConnManagerParams;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o90(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        PowerManager.WakeLock wakeLock;
        fbc fbcVar = (fbc) this.b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        synchronized (fbcVar) {
            if (atomicBoolean.get() && (wakeLock = (PowerManager.WakeLock) fbcVar.c) != null) {
                wakeLock.release();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:101:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01de  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        zy4 zy4Var;
        Object poeVar;
        boolean zB;
        int i = 2;
        File file = 0;
        switch (this.a) {
            case 0:
                Context context = (Context) this.b;
                r94 r94Var = (r94) this.c;
                p90.a = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                r94Var.f();
                return;
            case 1:
                ma maVar = (ma) this.b;
                Object obj = this.c;
                if (maVar.a == 0) {
                    maVar.G(obj);
                    return;
                }
                return;
            case 2:
                i92 i92Var = (i92) this.b;
                wo3 wo3Var = (wo3) this.c;
                if (i92Var.c == null || !i92Var.a) {
                    return;
                }
                if (!Collections.disjoint(((LinkedHashMap) i92Var.c.f.a).keySet(), wo3Var.h)) {
                    i92Var.b();
                }
                Collection collection = wo3Var.b;
                CopyOnWriteArrayList copyOnWriteArrayList = i92Var.d;
                if (collection == null || collection.isEmpty() || copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (collection.contains(Long.valueOf(((fda) it.next()).a.h))) {
                        i92Var.f();
                        return;
                    }
                }
                return;
            case 3:
                b bVar = (b) this.b;
                bVar.a.a(new a74((ltb) this.c, 0, bVar));
                return;
            case 4:
                ((bhc) this.b).b((xwd) this.c);
                return;
            case 5:
                vy8 vy8Var = (vy8) this.b;
                xwd xwdVar = (xwd) this.c;
                synchronized (vy8Var) {
                    try {
                        if (vy8Var.b == null) {
                            vy8Var.a.add(xwdVar);
                        } else {
                            vy8Var.b.add(xwdVar.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 6:
                rz4 rz4Var = (rz4) this.b;
                Runnable runnable = (Runnable) this.c;
                try {
                    Process.setThreadPriority(rz4Var.b);
                    break;
                } catch (Throwable unused) {
                }
                runnable.run();
                return;
            case 7:
                j96 j96Var = (j96) this.b;
                k96 k96Var = (k96) this.c;
                if (j96Var.a.compareAndSet(true, false)) {
                    k96Var.X();
                    k96Var.post(new e6(13, j96Var));
                    return;
                }
                return;
            case 8:
                ((ek2) this.b).E((rs7) this.c);
                return;
            case 9:
                oe9 oe9Var = (oe9) this.b;
                be9 be9Var = (be9) this.c;
                oe9Var.d();
                oe9Var.a(2);
                int i2 = oe9Var.a;
                Context context2 = oe9Var.b;
                String strP = ch3.p();
                File fileQ0 = lu6.q0(new File(context2.getCacheDir(), strP.equals(context2.getPackageName()) ? "tracer" : "tracer-" + ((Object) Uri.encode(z5h.I0(strP, ':', '-', false)))), "logs");
                try {
                    sb8.U(fileQ0);
                    break;
                } catch (IOException unused2) {
                    fileQ0.toString();
                }
                int iD = qt4.D(oe9Var.g);
                if (iD == 0) {
                    File fileQ1 = lu6.q0(fileQ0, "a.log");
                    ku6.e(lu6.q0(fileQ0, "b.log"));
                    oe9Var.h = fileQ1;
                    oe9Var.g = 2;
                    oe9Var.c(oe9Var.i, false);
                    return;
                }
                if (iD == 1) {
                    File file2 = oe9Var.h;
                    if ((file2 != null ? file2 : 0).length() > i2) {
                        File fileQ2 = lu6.q0(fileQ0, "b.log");
                        ku6.e(fileQ2);
                        oe9Var.h = fileQ2;
                        oe9Var.g = 3;
                    }
                } else if (iD == 2) {
                    File file3 = oe9Var.h;
                    if ((file3 != null ? file3 : null).length() > i2) {
                        File fileQ3 = lu6.q0(fileQ0, "a.log");
                        ku6.e(fileQ3);
                        oe9Var.h = fileQ3;
                        oe9Var.g = 2;
                    }
                }
                oe9Var.c(Collections.singletonList(be9Var), true);
                return;
            case 10:
                jv9 jv9Var = (jv9) this.b;
                rv9 rv9Var = (rv9) this.c;
                if (jv9Var.p) {
                    return;
                }
                rv9Var.l(jv9Var);
                return;
            case 11:
                ((g0a) this.b).d.reportNetworkEvent((NetworkEvent) this.c);
                return;
            case 12:
                ((g0a) this.b).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.c);
                return;
            case 13:
                ((g0a) this.b).d.reportPlaybackStateEvent((PlaybackStateEvent) this.c);
                return;
            case 14:
                d3a d3aVar = (d3a) this.b;
                j4d j4dVar = (j4d) this.c;
                o3a o3aVar = d3aVar.h;
                d3aVar.t = j4dVar;
                b3a b3aVar = new b3a(d3aVar, j4dVar);
                j4dVar.q0();
                synchronized (j4dVar.c) {
                    try {
                        ja7 ja7Var = (ja7) j4dVar.c.get(b3aVar);
                        if (ja7Var == null) {
                            ja7Var = new ja7(j4dVar, b3aVar);
                        }
                        j4dVar.b.n.a(ja7Var);
                        j4dVar.c.put(b3aVar, ja7Var);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                d3aVar.v = b3aVar;
                try {
                    o3aVar.i.l(0, j4dVar);
                    break;
                } catch (RemoteException e) {
                    lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
                }
                ((q2a) o3aVar.m.b).a.setActive(true);
                PlaybackException playbackExceptionM = j4dVar.m();
                umf umfVarN = j4dVar.N();
                k3d k3dVarM = j4dVar.M();
                k3d k3dVarM2 = j4dVar.M();
                s2d s2dVarA0 = j4dVar.a0();
                int repeatMode = j4dVar.getRepeatMode();
                boolean zH = j4dVar.H();
                j4dVar.q0();
                bg6 bg6Var = j4dVar.b;
                bg6Var.I0();
                k4j k4jVar = bg6Var.o0;
                ush ushVarW = j4dVar.W();
                b0a b0aVarB0 = j4dVar.c(18) ? j4dVar.b0() : b0a.K;
                float fA = j4dVar.c(22) ? j4dVar.a() : 1.0f;
                p70 p70VarQ = j4dVar.c(21) ? j4dVar.Q() : p70.i;
                if (j4dVar.c(28)) {
                    j4dVar.q0();
                    bg6 bg6Var2 = j4dVar.b;
                    bg6Var2.I0();
                    zy4Var = bg6Var2.g0;
                } else {
                    zy4Var = zy4.d;
                }
                zy4 zy4Var2 = zy4Var;
                ok5 ok5VarX = j4dVar.X();
                if (j4dVar.c(23)) {
                    j4dVar.Y();
                }
                j4dVar.f0();
                boolean z = j4dVar.z();
                int iU = j4dVar.u();
                int playbackState = j4dVar.getPlaybackState();
                boolean zH0 = j4dVar.h0();
                boolean zG0 = j4dVar.g0();
                b0a b0aVarZ = j4dVar.Z();
                j4dVar.q0();
                bg6 bg6Var3 = j4dVar.b;
                bg6Var3.I0();
                long j = bg6Var3.p0;
                j4dVar.q0();
                bg6 bg6Var4 = j4dVar.b;
                bg6Var4.I0();
                long j2 = bg6Var4.q0;
                j4dVar.q0();
                bg6 bg6Var5 = j4dVar.b;
                bg6Var5.I0();
                long j3 = bg6Var5.r0;
                fzh fzhVarQ = j4dVar.c(30) ? j4dVar.q() : fzh.b;
                j4dVar.q0();
                d3aVar.s = new c4d(playbackExceptionM, 0, umfVarN, k3dVarM, k3dVarM2, 0, s2dVarA0, repeatMode, zH, k4jVar, ushVarW, 0, b0aVarB0, fA, 1.0f, p70VarQ, 0, zy4Var2, ok5VarX, 0, false, z, 1, iU, playbackState, zH0, zG0, b0aVarZ, j, j2, j3, fzhVarQ, j4dVar.b.b0());
                d3aVar.f(j4dVar.R());
                return;
            case 15:
                o3a o3aVar2 = (o3a) this.b;
                o3aVar2.m.O(o3aVar2.E((j4d) this.c));
                return;
            case 16:
                MediaSessionService mediaSessionService = (MediaSessionService) this.b;
                k2a k2aVar = (k2a) this.c;
                d3a d3aVar2 = k2aVar.a;
                int i3 = MediaSessionService.g;
                m0a m0aVarB = mediaSessionService.b();
                MediaSessionService mediaSessionService2 = m0aVarB.a;
                HashMap map = m0aVarB.g;
                if (!map.containsKey(k2aVar)) {
                    l0a l0aVar = new l0a(m0aVarB, mediaSessionService2, k2aVar);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("androidx.media3.session.MediaNotificationManager", true);
                    xnf xnfVar = d3aVar2.j;
                    xnfVar.getClass();
                    Bundle bundle2 = Bundle.EMPTY;
                    vqi.B();
                    Bundle bundle3 = new Bundle(bundle);
                    Looper mainLooper = Looper.getMainLooper();
                    mainLooper.getClass();
                    qu9 qu9Var = new qu9(mainLooper);
                    vqi.d0(new Handler(mainLooper), new fu9(qu9Var, new iu9(mediaSessionService2, xnfVar, bundle3, l0aVar, mainLooper, qu9Var, xnfVar.a.g() ? new v2a(11, new w25(new s84(mediaSessionService2))) : null), 0));
                    map.put(k2aVar, new k0a(qu9Var));
                    qu9Var.b(new w77(m0aVarB, qu9Var, l0aVar, k2aVar, 1), m0aVarB.e);
                }
                d3aVar2.w = new w4(mediaSessionService);
                return;
            case 17:
                ndb ndbVar = (ndb) this.c;
                Context context3 = (Context) this.b;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context3.registerReceiver(new gu0(3, ndbVar), intentFilter);
                return;
            case 18:
                gu0 gu0Var = (gu0) this.c;
                Context context4 = (Context) this.b;
                ndb ndbVar2 = (ndb) gu0Var.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context4.getSystemService("connectivity");
                if (connectivityManager == null) {
                    i = 0;
                } else {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i = 4;
                                        break;
                                    case 13:
                                        i = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i = 6;
                                        break;
                                    case 18:
                                        break;
                                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i = 0;
                                        } else {
                                            i = 9;
                                        }
                                        break;
                                }
                            } else if (type != 1) {
                                if (type == 4 || type == 5) {
                                    switch (activeNetworkInfo.getSubtype()) {
                                        case 1:
                                        case 2:
                                            i = 3;
                                            break;
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 14:
                                        case 15:
                                        case 17:
                                            i = 4;
                                            break;
                                        case 13:
                                            i = 5;
                                            break;
                                        case 16:
                                        case 19:
                                        default:
                                            i = 6;
                                            break;
                                        case 18:
                                            break;
                                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                i = 0;
                                            } else {
                                                i = 9;
                                            }
                                            break;
                                    }
                                } else if (type != 6) {
                                    i = type != 9 ? 8 : 7;
                                } else {
                                    i = 5;
                                }
                            }
                        }
                    } catch (SecurityException unused3) {
                    }
                }
                if (Build.VERSION.SDK_INT < 31 || i != 5) {
                    ndbVar2.d(i);
                    return;
                } else {
                    qwk.c(context4, ndbVar2);
                    return;
                }
            case 19:
                ((sdf) ((tdf) this.b)).l((eub) this.c, sbi.a);
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((InputMethodManager) ((r5c) this.b).getContext().getSystemService("input_method")).showSoftInput((EditText) this.c, 1);
                return;
            case 21:
                fbc fbcVar = (fbc) this.b;
                Object obj2 = ((wfe) this.c).a;
                ((bg6) fbcVar.b).C0(obj2 != null ? (Surface) obj2 : null);
                return;
            case 22:
                xte xteVar = (xte) this.b;
                try {
                    iu9 iu9Var = (iu9) ((qu9) this.c).get();
                    xteVar.g = iu9Var;
                    if (iu9Var != null && iu9Var.d.isConnected()) {
                        xte.e(xteVar);
                    }
                    poeVar = sbi.a;
                    break;
                } catch (Throwable th3) {
                    poeVar = new poe(th3);
                }
                if (roe.a(poeVar) != null) {
                    xteVar.f(true);
                    gm0.n(xteVar.c, "retry connect");
                    int i4 = xteVar.f;
                    if (i4 < 5) {
                        xteVar.f = i4 + 1;
                        xteVar.d();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                elh elhVar = (elh) this.b;
                clh clhVar = (clh) this.c;
                v44 v44VarA = elhVar.b.a();
                try {
                    clhVar.run();
                    elhVar.i.addAndGet(1);
                    synchronized (elhVar.c) {
                        elhVar.c.notifyAll();
                    }
                    String str = elhVar.m;
                    if (gm0.f == 0) {
                        return;
                    }
                    if (zB) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    elhVar.i.addAndGet(1);
                    synchronized (elhVar.c) {
                        elhVar.c.notifyAll();
                        String str2 = elhVar.m;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                int i5 = elhVar.i.get();
                                int i6 = elhVar.j.get();
                                String strT = ew5.t(((e2) v44VarA).j());
                                StringBuilder sbP = qv1.p("process, thread ", i5, "/", i6, " finished after ");
                                sbP.append(strT);
                                a4cVar.c(je9Var, str2, sbP.toString(), null);
                            }
                        }
                    }
                }
            case 24:
                ((fbc) ((gvb) this.b).c).A((kig) this.c, 3);
                return;
            case 25:
                Runnable runnable2 = (Runnable) this.b;
                iif iifVar = (iif) this.c;
                try {
                    runnable2.run();
                    return;
                } finally {
                    iifVar.a();
                }
            case 26:
                bbh bbhVar = (bbh) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                fbc fbcVar2 = (fbc) bbhVar.c;
                fbcVar2.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new o90(fbcVar2, 27, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 27:
                a();
                return;
            case 28:
                ((a) this.b).b((ReferrerDetails) this.c);
                return;
            default:
                ((h) this.b).a((Consumer) this.c);
                return;
        }
    }

    public /* synthetic */ o90(Object obj, Context context, int i) {
        this.a = i;
        this.c = obj;
        this.b = context;
    }
}
