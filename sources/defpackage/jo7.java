package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class jo7 implements Handler.Callback {
    public static final Status o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status p = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object q = new Object();
    public static jo7 r;
    public long a;
    public boolean b;
    public mlh c;
    public wlk d;
    public final Context e;
    public final fo7 f;
    public final fbc g;
    public final AtomicInteger h;
    public final AtomicInteger i;
    public final ConcurrentHashMap j;
    public final pw k;
    public final pw l;
    public final bmk m;
    public volatile boolean n;

    public jo7(Context context, Looper looper) {
        fo7 fo7Var = fo7.d;
        this.a = 10000L;
        this.b = false;
        this.h = new AtomicInteger(1);
        this.i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.k = new pw(0);
        this.l = new pw(0);
        this.n = true;
        this.e = context;
        bmk bmkVar = new bmk(looper, this);
        Looper.getMainLooper();
        this.m = bmkVar;
        this.f = fo7Var;
        this.g = new fbc(28);
        PackageManager packageManager = context.getPackageManager();
        if (tre.k == null) {
            tre.k = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (tre.k.booleanValue()) {
            this.n = false;
        }
        bmkVar.sendMessage(bmkVar.obtainMessage(6));
    }

    public static Status c(jp jpVar, le4 le4Var) {
        return new Status(17, qv1.l("API: ", (String) jpVar.b.c, " is not available on this device. Connection failed with: ", String.valueOf(le4Var)), le4Var.c, le4Var);
    }

    public static jo7 e(Context context) {
        jo7 jo7Var;
        synchronized (q) {
            try {
                if (r == null) {
                    Looper looper = c1m.a().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = fo7.c;
                    r = new jo7(applicationContext, looper);
                }
                jo7Var = r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jo7Var;
    }

    public final boolean a() {
        if (this.b) {
            return false;
        }
        eue eueVarU = due.x().u();
        if (eueVarU != null && !eueVarU.b()) {
            return false;
        }
        int i = ((SparseIntArray) this.g.b).get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean b(le4 le4Var, int i) {
        fo7 fo7Var = this.f;
        fo7Var.getClass();
        Context context = this.e;
        if (!ti8.k(context)) {
            int i2 = le4Var.b;
            PendingIntent pendingIntentA = le4Var.c;
            if (!((i2 == 0 || pendingIntentA == null) ? false : true)) {
                pendingIntentA = null;
                Intent intentB = fo7Var.b(i2, context, null);
                if (intentB != null) {
                    pendingIntentA = qgl.a(context, intentB);
                }
            }
            if (pendingIntentA != null) {
                fo7Var.e(context, i2, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentA, i, true), ylk.a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final skk d(eo7 eo7Var) {
        jp jpVar = eo7Var.e;
        ConcurrentHashMap concurrentHashMap = this.j;
        skk skkVar = (skk) concurrentHashMap.get(jpVar);
        if (skkVar == null) {
            skkVar = new skk(this, eo7Var);
            concurrentHashMap.put(jpVar, skkVar);
        }
        if (skkVar.d.d()) {
            this.l.add(jpVar);
        }
        skkVar.j();
        return skkVar;
    }

    public final void f(le4 le4Var, int i) {
        if (b(le4Var, i)) {
            return;
        }
        bmk bmkVar = this.m;
        bmkVar.sendMessage(bmkVar.obtainMessage(5, i, 0, le4Var));
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0353  */
    /* JADX WARN: Code duplicated, block: B:174:0x0359  */
    /* JADX WARN: Code duplicated, block: B:176:0x0377  */
    /* JADX WARN: Code duplicated, block: B:178:0x0381  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v5 skk, still in use, count: 2, list:
          (r3v5 skk) from 0x034b: IGET (r3v5 skk) A[WRAPPED] skk.i int
          (r3v5 skk) from 0x0351: PHI (r3 I:??) = (r3v2 skk), (r3v5 skk) binds: [B:170:0x0350, B:225:0x0351] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instruction units count: 1104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo7.handleMessage(android.os.Message):boolean");
    }
}
