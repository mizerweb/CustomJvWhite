package defpackage;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class ea5 implements ev5 {
    public final UUID b;
    public final eu6 c;
    public final ae7 d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final uvc i;
    public final l6m j;
    public final xva k;
    public final long l;
    public final ArrayList m;
    public final Set n;
    public final Set o;
    public int p;
    public gf6 q;
    public ca5 r;
    public ca5 s;
    public Looper t;
    public Handler u;
    public byte[] v;
    public z3d w;
    public volatile jf x;

    public ea5(UUID uuid, ae7 ae7Var, HashMap map, boolean z, int[] iArr, boolean z2, l6m l6mVar) {
        uuid.getClass();
        lvb.O("Use C.CLEARKEY_UUID instead", !f71.b.equals(uuid));
        this.b = uuid;
        this.c = ed7.e;
        this.d = ae7Var;
        this.e = map;
        this.f = z;
        this.g = iArr;
        this.h = z2;
        this.j = l6mVar;
        this.i = new uvc(13);
        this.k = new xva(11, this);
        this.m = new ArrayList();
        this.n = Collections.newSetFromMap(new IdentityHashMap());
        this.o = Collections.newSetFromMap(new IdentityHashMap());
        this.l = 300000L;
    }

    public static boolean f(ca5 ca5Var) {
        ca5Var.o();
        if (ca5Var.p != 1) {
            return false;
        }
        DrmSession$DrmSessionException drmSession$DrmSessionExceptionC = ca5Var.c();
        drmSession$DrmSessionExceptionC.getClass();
        Throwable cause = drmSession$DrmSessionExceptionC.getCause();
        return (cause instanceof ResourceBusyException) || dtl.c(cause);
    }

    public static ArrayList i(wu5 wu5Var, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(wu5Var.d);
        for (int i = 0; i < wu5Var.d; i++) {
            vu5 vu5Var = wu5Var.a[i];
            if ((vu5Var.a(uuid) || (f71.c.equals(uuid) && vu5Var.a(f71.b))) && (vu5Var.e != null || z)) {
                arrayList.add(vu5Var);
            }
        }
        return arrayList;
    }

    @Override // defpackage.ev5
    public final xu5 a(av5 av5Var, b87 b87Var) {
        k(false);
        lvb.b0(this.p > 0);
        this.t.getClass();
        return e(this.t, av5Var, b87Var, true);
    }

    @Override // defpackage.ev5
    public final void b(Looper looper, z3d z3dVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.t;
                if (looper2 == null) {
                    this.t = looper;
                    this.u = new Handler(looper);
                } else {
                    lvb.b0(looper2 == looper);
                    this.u.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.w = z3dVar;
    }

    @Override // defpackage.ev5
    public final int c(b87 b87Var) {
        k(false);
        gf6 gf6Var = this.q;
        gf6Var.getClass();
        int iM = gf6Var.m();
        wu5 wu5Var = b87Var.r;
        if (wu5Var == null) {
            int iH = uya.h(b87Var.n);
            int i = 0;
            while (true) {
                int[] iArr = this.g;
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iH) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return 0;
            }
        } else if (this.v == null) {
            UUID uuid = this.b;
            if (i(wu5Var, uuid, true).isEmpty()) {
                if (wu5Var.d == 1 && wu5Var.a[0].a(f71.b)) {
                    lvb.G0("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = wu5Var.c;
            if (str != null && !"cenc".equals(str) && !"cbcs".equals(str) && ("cbc1".equals(str) || "cens".equals(str))) {
                return 1;
            }
        }
        return iM;
    }

    @Override // defpackage.ev5
    public final dv5 d(av5 av5Var, b87 b87Var) {
        lvb.b0(this.p > 0);
        this.t.getClass();
        da5 da5Var = new da5(this, av5Var);
        Handler handler = this.u;
        handler.getClass();
        handler.post(new f92(da5Var, 24, b87Var));
        return da5Var;
    }

    public final xu5 e(Looper looper, av5 av5Var, b87 b87Var, boolean z) {
        ArrayList arrayListI;
        if (this.x == null) {
            this.x = new jf(3, looper, this);
        }
        wu5 wu5Var = b87Var.r;
        int i = 0;
        ca5 ca5Var = null;
        if (wu5Var == null) {
            int iH = uya.h(b87Var.n);
            gf6 gf6Var = this.q;
            gf6Var.getClass();
            if (gf6Var.m() != 2 || !cd7.c) {
                int[] iArr = this.g;
                while (true) {
                    if (i >= iArr.length) {
                        i = -1;
                        break;
                    }
                    if (iArr[i] == iH) {
                        break;
                    }
                    i++;
                }
                if (i != -1 && gf6Var.m() != 1) {
                    ca5 ca5Var2 = this.r;
                    if (ca5Var2 == null) {
                        a98 a98Var = c98.b;
                        ca5 ca5VarH = h(ghe.e, true, null, z);
                        this.m.add(ca5VarH);
                        this.r = ca5VarH;
                    } else {
                        ca5Var2.g(null);
                    }
                    return this.r;
                }
            }
            return null;
        }
        if (this.v == null) {
            arrayListI = i(wu5Var, this.b, false);
            if (arrayListI.isEmpty()) {
                DefaultDrmSessionManager$MissingSchemeDataException defaultDrmSessionManager$MissingSchemeDataException = new DefaultDrmSessionManager$MissingSchemeDataException("Media does not support uuid: " + this.b);
                lvb.l0("DefaultDrmSessionMgr", "DRM error", defaultDrmSessionManager$MissingSchemeDataException);
                if (av5Var != null) {
                    av5Var.d(defaultDrmSessionManager$MissingSchemeDataException);
                }
                return new za6(new DrmSession$DrmSessionException(6003, defaultDrmSessionManager$MissingSchemeDataException));
            }
        } else {
            arrayListI = null;
        }
        if (this.f) {
            for (ca5 ca5Var3 : this.m) {
                if (Objects.equals(ca5Var3.a, arrayListI)) {
                    ca5Var = ca5Var3;
                    break;
                }
            }
        } else {
            ca5Var = this.s;
        }
        if (ca5Var != null) {
            ca5Var.g(av5Var);
            return ca5Var;
        }
        ca5 ca5VarH2 = h(arrayListI, false, av5Var, z);
        if (!this.f) {
            this.s = ca5VarH2;
        }
        this.m.add(ca5VarH2);
        return ca5VarH2;
    }

    public final ca5 g(List list, boolean z, av5 av5Var) {
        this.q.getClass();
        boolean z2 = this.h | z;
        gf6 gf6Var = this.q;
        byte[] bArr = this.v;
        Looper looper = this.t;
        looper.getClass();
        z3d z3dVar = this.w;
        z3dVar.getClass();
        ca5 ca5Var = new ca5(this.b, gf6Var, this.i, this.k, list, z2, z, bArr, this.e, this.d, looper, this.j, z3dVar);
        ca5Var.g(av5Var);
        if (this.l != -9223372036854775807L) {
            ca5Var.g(null);
        }
        return ca5Var;
    }

    public final ca5 h(List list, boolean z, av5 av5Var, boolean z2) {
        ca5 ca5VarG = g(list, z, av5Var);
        boolean zF = f(ca5VarG);
        long j = this.l;
        Set set = this.o;
        if (zF && !set.isEmpty()) {
            pci it = u98.m(set).iterator();
            while (it.hasNext()) {
                ((xu5) it.next()).f(null);
            }
            ca5VarG.f(av5Var);
            if (j != -9223372036854775807L) {
                ca5VarG.f(null);
            }
            ca5VarG = g(list, z, av5Var);
        }
        if (f(ca5VarG) && z2) {
            Set set2 = this.n;
            if (!set2.isEmpty()) {
                pci it2 = u98.m(set2).iterator();
                while (it2.hasNext()) {
                    ((da5) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    pci it3 = u98.m(set).iterator();
                    while (it3.hasNext()) {
                        ((xu5) it3.next()).f(null);
                    }
                }
                ca5VarG.f(av5Var);
                if (j != -9223372036854775807L) {
                    ca5VarG.f(null);
                }
                return g(list, z, av5Var);
            }
        }
        return ca5VarG;
    }

    public final void j() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            gf6 gf6Var = this.q;
            gf6Var.getClass();
            gf6Var.release();
            this.q = null;
        }
    }

    public final void k(boolean z) {
        if (z && this.t == null) {
            lvb.H0("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.t;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            lvb.H0("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // defpackage.ev5
    public final void prepare() {
        gf6 er3Var;
        k(true);
        int i = this.p;
        this.p = i + 1;
        if (i != 0) {
            return;
        }
        if (this.q == null) {
            UUID uuid = this.b;
            this.c.getClass();
            try {
                try {
                    try {
                        er3Var = new ed7(uuid);
                    } catch (UnsupportedSchemeException e) {
                        throw new UnsupportedDrmException(e);
                    }
                } catch (Exception e2) {
                    throw new UnsupportedDrmException(e2);
                }
            } catch (UnsupportedDrmException unused) {
                lvb.k0("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                er3Var = new er3();
            }
            this.q = er3Var;
            er3Var.k(new ks9(12, this));
            return;
        }
        if (this.l == -9223372036854775807L) {
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((ca5) arrayList.get(i2)).g(null);
            i2++;
        }
    }

    @Override // defpackage.ev5
    public final void release() {
        k(true);
        int i = this.p - 1;
        this.p = i;
        if (i != 0) {
            return;
        }
        if (this.l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.m);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((ca5) arrayList.get(i2)).f(null);
            }
        }
        pci it = u98.m(this.n).iterator();
        while (it.hasNext()) {
            ((da5) it.next()).release();
        }
        j();
    }
}
