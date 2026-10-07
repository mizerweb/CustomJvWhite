package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class n11 implements vs6, bn7, an7, g96 {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;

    public n11(Context context, fh2 fh2Var) {
        this.a = 2;
        boolean z = false;
        this.b = Build.VERSION.SDK_INT >= 34 && context.getDeviceId() != 0;
        PackageManager packageManager = context.getPackageManager();
        Integer numB = fh2Var != null ? fh2Var.b() : null;
        boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        boolean zHasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.camera.front");
        boolean z2 = zHasSystemFeature && (numB == null || numB.intValue() == 1);
        if (zHasSystemFeature2 && (numB == null || numB.intValue() == 0)) {
            z = true;
        }
        this.c = new pi2(z2, z);
    }

    public static boolean c(Set set, fh2 fh2Var) {
        try {
            fh2Var.c(new LinkedHashSet(set));
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.c;
                if (cancellationSignal != null) {
                    try {
                        cancellationSignal.cancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public eu5 b(int i) {
        return (eu5) ((ArrayList) this.c).get(i);
    }

    @Override // defpackage.vs6
    public void d(File file) {
        h81 h81Var = (h81) this.c;
        if (!((File) h81Var.b).equals(file) && !this.b) {
            file.delete();
        }
        if (this.b && file.equals((File) h81Var.c)) {
            this.b = false;
        }
    }

    @Override // defpackage.vs6
    public void e(File file) {
        h81 h81Var;
        v2a v2aVarP;
        if (this.b && (v2aVarP = h81.p((h81Var = (h81) this.c), file)) != null) {
            String str = (String) v2aVarP.b;
            if (str != ".tmp") {
                oc9.r(str == ".cnt");
                return;
            }
            long jLastModified = file.lastModified();
            ((j85) h81Var.e).getClass();
            if (jLastModified > System.currentTimeMillis() - 1800000) {
                return;
            }
        }
        file.delete();
    }

    @Override // defpackage.vs6
    public void f(File file) {
        if (this.b || !file.equals((File) ((h81) this.c).c)) {
            return;
        }
        this.b = true;
    }

    @Override // defpackage.g96
    public void g() {
        switch (this.a) {
            case 9:
                if (!this.b) {
                    this.b = true;
                    qh1 qh1Var = (qh1) this.c;
                    ArrayList arrayList = new ArrayList(3);
                    for (int i = 0; i < 3; i++) {
                        arrayList.add(new s0g(i));
                    }
                    qh1Var.H(arrayList);
                }
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    qh1 qh1Var2 = (qh1) this.c;
                    ArrayList arrayList2 = new ArrayList(3);
                    for (int i2 = 0; i2 < 3; i2++) {
                        arrayList2.add(new r0g(i2));
                    }
                    qh1Var2.H(arrayList2);
                }
                break;
        }
    }

    public boolean h(LinkedHashSet linkedHashSet, Set set) {
        pi2 pi2Var = (pi2) this.c;
        if (!this.b) {
            boolean z = pi2Var.a;
            boolean z2 = pi2Var.b;
            if (z || z2) {
                boolean zC = c(linkedHashSet, fh2.c);
                boolean zC2 = c(linkedHashSet, fh2.b);
                ArrayList arrayList = new ArrayList(yw3.W0(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ff2) it.next()).a());
                }
                Set setX1 = ww3.X1(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSet) {
                    if (!setX1.contains(((pf2) obj).j().g())) {
                        arrayList2.add(obj);
                    }
                }
                Set setX2 = ww3.X1(arrayList2);
                boolean zC3 = c(setX2, fh2.c);
                boolean zC4 = c(setX2, fh2.b);
                boolean z3 = pi2Var.a && zC && !zC3;
                boolean z4 = z2 && zC2 && !zC4;
                if (z3 || z4) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.g96
    public void i() {
        int i = this.a;
        r66 r66Var = r66.a;
        switch (i) {
            case 9:
                if (this.b) {
                    this.b = false;
                    ((qh1) this.c).H(r66Var);
                }
                break;
            default:
                if (this.b) {
                    this.b = false;
                    ((qh1) this.c).H(r66Var);
                }
                break;
        }
    }

    public void j() {
        ArrayList arrayList = (ArrayList) this.c;
        if (this.b) {
            return;
        }
        this.b = true;
        for (int i = 0; i < arrayList.size(); i++) {
            ((eu5) arrayList.get(i)).f();
        }
    }

    @Override // defpackage.an7
    public synchronized void k() {
        if (this.b) {
            ((euc) this.c).k();
        }
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.c;
        if (this.b) {
            this.b = false;
            for (int i = 0; i < arrayList.size(); i++) {
                ((eu5) arrayList.get(i)).g();
            }
        }
    }

    public void m(dh2 dh2Var) throws CameraValidator$CameraIdListIncorrectException {
        pi2 pi2Var = (pi2) this.c;
        if (this.b) {
            tvj.a("CameraValidator", "Virtual device with " + dh2Var.c().size() + " cameras. Skipping validation.");
            return;
        }
        tvj.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE);
        if (pi2Var.a) {
            try {
                fh2.c.c(dh2Var.c());
            } catch (RuntimeException e) {
                e = e;
                tvj.i("CameraValidator", "Camera LENS_FACING_BACK verification failed", e);
            }
        }
        e = null;
        if (pi2Var.b) {
            try {
                fh2.b.c(dh2Var.c());
            } catch (RuntimeException e2) {
                tvj.i("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e2);
                if (e == null) {
                    e = e2;
                }
            }
        }
        if (e != null) {
            throw new CameraValidator$CameraIdListIncorrectException(dh2Var.c().size(), e);
        }
    }

    @Override // defpackage.bn7
    public synchronized void o(dn7 dn7Var, long j) {
        if (this.b) {
            ((euc) this.c).o(dn7Var, j);
        }
    }

    @Override // defpackage.bn7
    public synchronized void q() {
        if (this.b) {
            ((euc) this.c).q();
        }
    }

    @Override // defpackage.an7
    public void y() {
        if (this.b) {
            ((euc) this.c).y();
        }
    }

    @Override // defpackage.an7
    public void z(dn7 dn7Var) {
        if (this.b) {
            ((euc) this.c).z(dn7Var);
        }
    }

    public /* synthetic */ n11(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    public /* synthetic */ n11(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ n11(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    public /* synthetic */ n11(int i) {
        this.a = i;
    }

    public n11(wm7 wm7Var, md5 md5Var, cn7 cn7Var, o02 o02Var) {
        this.a = 8;
        this.c = new euc(wm7Var, md5Var, cn7Var, o02Var);
    }
}
