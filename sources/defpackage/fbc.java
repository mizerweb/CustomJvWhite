package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import one.me.net.ssl.api.InvalidSslSessionException;

/* JADX INFO: loaded from: classes.dex */
public final class fbc implements fbh, hgg, l8e, i9j, lnk {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public fbc(Context context, int i) {
        this.a = i;
        switch (i) {
            case 17:
                int i2 = context.getResources().getConfiguration().uiMode & 48;
                mjg mjgVarA = p90.a(i2 != 16 ? i2 != 32 ? ix3.c : ix3.b : ix3.a);
                this.b = mjgVarA;
                this.c = new r8e(mjgVarA);
                context.registerComponentCallbacks(new x03(1, this));
                break;
            case 25:
                this.b = context;
                break;
            default:
                this.b = context;
                this.c = new ifh(new ap9(19, this));
                break;
        }
    }

    public static m4d C(m4j m4jVar) {
        return new m4d(Collections.singletonList(m4jVar));
    }

    public static void a(fbc fbcVar, boolean z, boolean z2) {
        synchronized (fbcVar) {
            boolean z3 = false;
            if (z) {
                if (((PowerManager.WakeLock) fbcVar.c) == null) {
                    if (((Context) fbcVar.b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        lvb.G0("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) fbcVar.b).getSystemService("power");
                    if (powerManager == null) {
                        lvb.G0("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        fbcVar.c = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) fbcVar.c;
            if (wakeLock == null) {
                return;
            }
            if (z && z2) {
                z3 = true;
            }
            if (z3) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public void A(kig kigVar, int i) {
        ((azj) this.c).a(new eqg((ijd) this.b, kigVar, false, i));
    }

    @Override // defpackage.l8e
    public void B(Object obj, zv8 zv8Var, Object obj2) {
        ((oqh) this.c).set(obj2);
    }

    public kig D(iyj iyjVar) {
        kig kigVarC;
        synchronized (this.c) {
            kigVarC = ((oj9) this.b).c(iyjVar);
        }
        return kigVarC;
    }

    public void E(k4j k4jVar) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new ewg(this, 22, k4jVar));
        }
    }

    public void F(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.b)) {
            map = new HashMap((Map) this.b);
        }
        synchronized (((Map) this.c)) {
            map2 = new HashMap((Map) this.c);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).c(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((qjh) entry2.getKey()).c(new ApiException(status));
            }
        }
    }

    public void b(lfe lfeVar, bs0 bs0Var) {
        h6g h6gVar = (h6g) this.b;
        s7j s7jVarA = (s7j) h6gVar.get(lfeVar);
        if (s7jVarA == null) {
            s7jVarA = s7j.a();
            h6gVar.put(lfeVar, s7jVarA);
        }
        s7jVarA.c = bs0Var;
        s7jVarA.a |= 8;
    }

    @Override // defpackage.hgg
    public long c(long j) {
        vi9 vi9Var = (vi9) this.b;
        Long lValueOf = (Long) vi9Var.b(j);
        if (lValueOf == null) {
            ggg gggVar = (ggg) this.c;
            long j2 = gggVar.a;
            gggVar.a = 1 + j2;
            lValueOf = Long.valueOf(j2);
            vi9Var.f(j, lValueOf);
        }
        return lValueOf.longValue();
    }

    @Override // defpackage.i9j
    public int d(int i) {
        return i;
    }

    @Override // defpackage.i9j
    public void dispose() {
        w4 w4Var = (w4) this.c;
        ybb ybbVar = (ybb) this.b;
        SparseArray sparseArray = (SparseArray) w4Var.a;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            List list = (List) sparseArray.valueAt(size);
            if (list.remove(ybbVar) && list.isEmpty()) {
                sparseArray.removeAt(size);
            }
        }
    }

    @Override // defpackage.i9j
    public int e(int i) {
        ybb ybbVar = (ybb) this.b;
        SparseArray sparseArray = (SparseArray) ((w4) this.c).a;
        List arrayList = (List) sparseArray.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList();
            sparseArray.put(i, arrayList);
        }
        if (!arrayList.contains(ybbVar)) {
            arrayList.add(ybbVar);
        }
        return i;
    }

    public void f(SSLSocket sSLSocket, boolean z) {
        v44 v44VarA = ((ksh) this.c).a();
        try {
            try {
                sSLSocket.startHandshake();
                SSLSession session = sSLSocket.getSession();
                if (z && !session.isValid()) {
                    throw new InvalidSslSessionException("session is not valid " + session, null);
                }
                if ("SSL_NULL_WITH_NULL_NULL".equalsIgnoreCase(session.getCipherSuite())) {
                    throw new InvalidSslSessionException("Illegal session cipher suite", null);
                }
                ew5.g(v44VarA.j());
            } catch (InvalidSslSessionException e) {
                throw e;
            } catch (Throwable th) {
                throw new InvalidSslSessionException("Failed to check session", th);
            }
        } catch (Throwable th2) {
            ew5.g(v44VarA.j());
            throw th2;
        }
    }

    public boolean g(iyj iyjVar) {
        boolean zContainsKey;
        synchronized (this.c) {
            zContainsKey = ((oj9) this.b).a.containsKey(iyjVar);
        }
        return zContainsKey;
    }

    public p4d h(rui ruiVar, boolean z, boolean z2) {
        ldc ldcVar = (ldc) this.b;
        long jMax = 0;
        if (!z || !z2) {
            if (z) {
                jMax = ldcVar.y();
            } else if (ruiVar instanceof c5i) {
                c5i c5iVar = (c5i) ruiVar;
                jMax = c5iVar.c() - c5iVar.j();
            } else if (!ruiVar.h()) {
                jMax = Math.max(ruiVar.c(), ruiVar.j());
            }
        }
        return new p4d(((ruiVar instanceof v84) && z && !z2) ? ldcVar.x() : 0, jMax);
    }

    public View i(int i, int i2, int i3, int i4) {
        abc abcVar = (abc) this.c;
        s6j s6jVar = (s6j) this.b;
        int iE = s6jVar.e();
        int iH = s6jVar.h();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewI = s6jVar.i(i);
            int iA = s6jVar.a(viewI);
            int iJ = s6jVar.j(viewI);
            abcVar.b = iE;
            abcVar.c = iH;
            abcVar.d = iA;
            abcVar.e = iJ;
            if (i3 != 0) {
                abcVar.a = i3;
                if (abcVar.a()) {
                    return viewI;
                }
            }
            if (i4 != 0) {
                abcVar.a = i4;
                if (abcVar.a()) {
                    view = viewI;
                }
            }
            i += i5;
        }
        return view;
    }

    public ix2 j() {
        return (ix2) this.b;
    }

    public rac k() {
        return (rac) this.b;
    }

    @Override // defpackage.fbh
    public String l() {
        return (String) this.b;
    }

    @Override // defpackage.j8e
    public Object m(Object obj, zv8 zv8Var) {
        return ((oqh) this.c).get();
    }

    public rac n() {
        return (rac) this.b;
    }

    public ix2 o() {
        return (ix2) this.b;
    }

    public ix2 p() {
        return (ix2) this.c;
    }

    public ix2 q() {
        return (ix2) this.c;
    }

    public boolean r(String[] strArr) {
        for (String str : strArr) {
            if (!((SharedPreferences) ((ifh) this.c).getValue()).getBoolean(str.concat("_req"), false)) {
                return false;
            }
        }
        return true;
    }

    public boolean s(View view) {
        abc abcVar = (abc) this.c;
        s6j s6jVar = (s6j) this.b;
        int iE = s6jVar.e();
        int iH = s6jVar.h();
        int iA = s6jVar.a(view);
        int iJ = s6jVar.j(view);
        abcVar.b = iE;
        abcVar.c = iH;
        abcVar.d = iA;
        abcVar.e = iJ;
        abcVar.a = 24579;
        return abcVar.a();
    }

    public bs0 t(lfe lfeVar, int i) {
        s7j s7jVar;
        bs0 bs0Var;
        h6g h6gVar = (h6g) this.b;
        int iD = h6gVar.d(lfeVar);
        if (iD >= 0 && (s7jVar = (s7j) h6gVar.i(iD)) != null) {
            int i2 = s7jVar.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                s7jVar.a = i3;
                if (i == 4) {
                    bs0Var = s7jVar.b;
                } else if (i == 8) {
                    bs0Var = s7jVar.c;
                } else {
                    ore.p("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    h6gVar.g(iD);
                    s7jVar.a = 0;
                    s7jVar.b = null;
                    s7jVar.c = null;
                    s7j.d.d(s7jVar);
                }
                return bs0Var;
            }
        }
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 11:
                String string = "[ ";
                if (((adg) this.b) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder sbC = nbh.C(string);
                        sbC.append(((adg) this.b).h[i]);
                        sbC.append(" ");
                        string = sbC.toString();
                    }
                }
                StringBuilder sbZ = zo5.z(string, "] ");
                sbZ.append((adg) this.b);
                return sbZ.toString();
            default:
                return super.toString();
        }
    }

    public void u(Object obj, String str) {
        AtomicReference atomicReference = (AtomicReference) ((ifh) this.c).getValue();
        while (true) {
            Map map = (Map) atomicReference.get();
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(str, obj);
            while (!atomicReference.compareAndSet(map, linkedHashMap)) {
                if (atomicReference.get() != map) {
                }
            }
            return;
        }
    }

    public kig v(iyj iyjVar) {
        kig kigVarA;
        synchronized (this.c) {
            kigVarA = ((oj9) this.b).a(iyjVar);
        }
        return kigVarA;
    }

    public void w(lfe lfeVar) {
        s7j s7jVar = (s7j) ((h6g) this.b).get(lfeVar);
        if (s7jVar == null) {
            return;
        }
        s7jVar.a &= -2;
    }

    public void x(lfe lfeVar) {
        vi9 vi9Var = (vi9) this.c;
        for (int i = vi9Var.i() - 1; i >= 0; i--) {
            if (lfeVar == vi9Var.j(i)) {
                Object[] objArr = vi9Var.c;
                Object obj = objArr[i];
                Object obj2 = qyj.c;
                if (obj == obj2) {
                    break;
                }
                objArr[i] = obj2;
                vi9Var.a = true;
                break;
            }
        }
        s7j s7jVar = (s7j) ((h6g) this.b).remove(lfeVar);
        if (s7jVar != null) {
            s7jVar.a = 0;
            s7jVar.b = null;
            s7jVar.c = null;
            s7j.d.d(s7jVar);
        }
    }

    @Override // defpackage.fbh
    public void y(ebh ebhVar) {
        vd7.c(ebhVar, (Object[]) this.c);
    }

    public void z() {
        yxh.a(new hed(7, this));
    }

    @Override // defpackage.lnk
    public Object zza() {
        return new i3m(((c1k) ((v56) this.b).b).a, (r6m) ((lnk) this.c).zza());
    }

    public fbc(a5d a5dVar) {
        this.a = 10;
        this.b = new ConcurrentLinkedDeque();
        this.c = new ReentrantLock();
    }

    public fbc(int i) {
        this.a = i;
        switch (i) {
            case 23:
                this.b = new h6g(0);
                this.c = new vi9((Object) null);
                break;
            case 27:
                this.b = Collections.synchronizedMap(new WeakHashMap());
                this.c = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 28:
                fo7 fo7Var = fo7.d;
                this.b = new SparseIntArray();
                this.c = fo7Var;
                break;
            default:
                this.b = new char[np0.n];
                this.c = new byte[np0.n];
                break;
        }
    }

    public /* synthetic */ fbc(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public fbc(Looper looper) {
        this.a = 20;
        this.b = new LinkedHashSet();
        this.c = new hsh(this, looper);
    }

    public fbc(int i, af7 af7Var) {
        this.a = i;
        switch (i) {
            case 19:
                this.b = af7Var;
                this.c = new oqh(this);
                break;
            default:
                this.b = af7Var;
                this.c = new ifh(new ys7(4, this));
                break;
        }
    }

    public fbc(Executor executor) {
        this.a = 18;
        this.b = executor;
        this.c = new ArrayDeque();
    }

    public fbc(xhd xhdVar) {
        this.a = 11;
        this.c = xhdVar;
    }

    public fbc(oj9 oj9Var) {
        this.a = 16;
        this.b = oj9Var;
        this.c = new Object();
    }

    public fbc(w4 w4Var, ybb ybbVar) {
        this.a = 24;
        this.c = w4Var;
        this.b = ybbVar;
    }

    public fbc(ggg gggVar) {
        this.a = 15;
        this.c = gggVar;
        this.b = new vi9((Object) null);
    }

    public fbc(s6j s6jVar) {
        this.a = 22;
        this.b = s6jVar;
        abc abcVar = new abc();
        abcVar.a = 0;
        this.c = abcVar;
    }

    public fbc(Handler handler, y3j y3jVar) {
        this.a = 21;
        if (y3jVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = y3jVar;
    }
}
