package defpackage;

import android.graphics.Bitmap;
import android.os.Looper;
import androidx.media3.transformer.ExportException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class shf implements ey, dy {
    public static final b87 A;
    public static final b87 B;
    public final ghe a;
    public final u98 b;
    public final phf c;
    public final ay d;
    public final j2i e;
    public final sfh f;
    public final HashMap g;
    public final HashMap h;
    public final z88 i;
    public final AtomicInteger j;
    public final AtomicInteger k;
    public boolean l;
    public int m;
    public ey n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public b87 t;
    public b87 u;
    public volatile boolean v;
    public volatile long w;
    public volatile long x;
    public volatile boolean y;
    public volatile boolean z;

    static {
        a87 a87Var = new a87();
        a87Var.m = uya.n("audio/mp4a-latm");
        a87Var.F = 44100;
        a87Var.E = 2;
        A = new b87(a87Var);
        a87 a87Var2 = new a87();
        a87Var2.t = 1;
        a87Var2.u = 1;
        a87Var2.m = uya.n("image/raw");
        a87Var2.C = ex3.i;
        B = new b87(a87Var2);
    }

    public shf(t26 t26Var, cy cyVar, ay ayVar, j2i j2iVar, qt3 qt3Var, Looper looper) {
        u98 u98Var = t26Var.b;
        this.b = u98Var;
        ghe gheVarH = t26Var.a;
        int i = 0;
        if (!u98Var.contains(-2)) {
            z88 z88Var = new z88(4);
            a98 a98VarListIterator = gheVarH.listIterator(0);
            while (a98VarListIterator.hasNext()) {
                s26 s26Var = (s26) a98VarListIterator.next();
                if (s26.d(s26Var.a)) {
                    z88Var.c(s26Var);
                } else {
                    r26 r26VarA = s26Var.a();
                    r26VarA.b = s26Var.b || !u98Var.contains(1);
                    r26VarA.c = s26Var.c || !u98Var.contains(2);
                    z88Var.c(new s26(r26VarA));
                }
            }
            gheVarH = z88Var.h();
        }
        this.a = gheVarH;
        phf phfVar = new phf(this, i, cyVar);
        this.c = phfVar;
        this.d = ayVar;
        this.e = j2iVar;
        this.f = ((nfh) qt3Var).a(looper, null);
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new z88(4);
        this.j = new AtomicInteger();
        this.k = new AtomicInteger();
        this.l = true;
        this.n = phfVar.createAssetLoader((s26) gheVarH.get(0), looper, this, ayVar);
    }

    @Override // defpackage.dy
    public final void a(int i) {
        this.j.set(i);
        this.k.set(i);
    }

    @Override // defpackage.dy
    public final void b(ExportException exportException) {
        this.e.b(exportException);
    }

    @Override // defpackage.ey
    public final int c(ww6 ww6Var) {
        int iC = this.n.c(ww6Var);
        int i = this.a.d;
        if (i == 1 || iC == 0) {
            return iC;
        }
        int iC0 = vqi.c0(this.m, i);
        if (iC == 2) {
            iC0 += ww6Var.b / i;
        }
        ww6Var.b = iC0;
        return 2;
    }

    @Override // defpackage.dy
    public final void d(long j) {
        lvb.Q("Could not retrieve required duration for EditedMediaItem %s", this.m, j != -9223372036854775807L || j());
        this.x = ((s26) this.a.get(this.m)).b(j);
        this.w = j;
        if (this.a.d == 1) {
            this.e.getClass();
        }
    }

    @Override // defpackage.dy
    public final boolean e(int i, b87 b87Var) {
        boolean z;
        boolean z2;
        boolean z3 = izl.k(b87Var.n) == 1;
        LinkedHashMap linkedHashMap = g55.a;
        synchronized (g55.class) {
        }
        if (z3) {
            this.t = b87Var;
        } else {
            this.u = b87Var;
        }
        if (!this.l) {
            boolean z4 = z3 ? this.p : this.q;
            if (z4) {
                return z4;
            }
            lvb.R((i & 1) != 0);
            return z4;
        }
        if (this.j.get() == 1) {
            boolean z5 = this.b.contains(1) && !z3;
            if (this.b.contains(2) && z3) {
                z2 = true;
                z = z5;
            } else {
                z2 = false;
                z = z5;
            }
        } else {
            z = false;
            z2 = false;
        }
        if (!this.o) {
            this.e.a(this.j.get() + ((z || z2) ? 1 : 0));
            this.o = true;
        }
        boolean zE = this.e.e(i, b87Var);
        if (z3) {
            this.p = zE;
        } else {
            this.q = zE;
        }
        if (z) {
            this.e.e(2, A);
            this.p = true;
        }
        if (z2) {
            this.e.e(2, B);
            this.q = true;
        }
        return zE;
    }

    @Override // defpackage.ey
    public final g98 g() {
        return this.n.g();
    }

    public final void h() {
        int i = this.r;
        ghe gheVar = this.a;
        int i2 = i * gheVar.d;
        int i3 = this.m;
        if (i2 + i3 >= this.s) {
            g98 g98VarG = this.n.g();
            this.i.c(new mh6(this.w, this.t, this.u, (String) g98VarG.get(1), (String) g98VarG.get(2)));
            this.s++;
        }
    }

    public final void i(Bitmap bitmap) {
        rhf rhfVar = (rhf) this.g.get(2);
        rhfVar.getClass();
        if (rhfVar.a.e(bitmap, new lf4(0, this.w, 30.0f).a()) == 1) {
            rhfVar.f();
            return;
        }
        sfh sfhVar = this.f;
        sfhVar.a.postDelayed(new yde(this, 10, bitmap), 10L);
    }

    public final boolean j() {
        return this.m == this.a.d - 1;
    }

    public final void k(int i, b87 b87Var) {
        wtb wtbVar = (wtb) this.h.get(Integer.valueOf(i));
        if (wtbVar == null) {
            return;
        }
        s26 s26Var = (s26) this.a.get(this.m);
        long j = this.w;
        if (s26.d(s26Var.a) && i == 1) {
            b87Var = null;
        }
        wtbVar.b(s26Var, j, b87Var, j());
    }

    @Override // defpackage.dy
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final rhf f(b87 b87Var) {
        rhf rhfVar;
        int iK = izl.k(b87Var.n);
        vqi.K(iK);
        LinkedHashMap linkedHashMap = g55.a;
        synchronized (g55.class) {
        }
        if (this.l) {
            if (iK == 2) {
                this.z = true;
            } else {
                this.y = true;
            }
            rye ryeVarF = this.e.f(b87Var);
            if (ryeVarF == null) {
                return null;
            }
            rhfVar = new rhf(this, ryeVarF, iK);
            this.g.put(Integer.valueOf(iK), rhfVar);
            if (this.j.get() == 1) {
                if (this.b.contains(1) && iK == 2) {
                    j2i j2iVar = this.e;
                    a87 a87VarA = A.a();
                    a87VarA.m = uya.n("audio/raw");
                    a87VarA.G = 2;
                    rye ryeVarF2 = j2iVar.f(new b87(a87VarA));
                    ryeVarF2.getClass();
                    this.g.put(1, new rhf(this, ryeVarF2, 1));
                } else if (this.b.contains(2) && iK == 1) {
                    rye ryeVarF3 = this.e.f(B);
                    ryeVarF3.getClass();
                    this.g.put(2, new rhf(this, ryeVarF3, 2));
                }
            }
        } else {
            String str = iK == 1 ? "The preceding MediaItem does not contain any audio track. If the sequence starts with an item without audio track (like images), followed by items with audio tracks, then EditedMediaItemSequence.Builder.experimentalSetForceAudioTrack() needs to be set to true." : "The preceding MediaItem does not contain any video track. If the sequence starts with an item without video track (audio only), followed by items with video tracks, then EditedMediaItemSequence.Builder.experimentalSetForceVideoTrack() needs to be set to true.";
            rhfVar = (rhf) this.g.get(Integer.valueOf(iK));
            lvb.W(rhfVar, str);
        }
        k(iK, b87Var);
        if (this.j.get() == 1 && this.g.size() == 2) {
            if (iK == 1) {
                k(2, B);
                this.k.incrementAndGet();
                this.f.f(new h7b(23, this));
                return rhfVar;
            }
            k(1, null);
        }
        return rhfVar;
    }

    @Override // defpackage.ey
    public final void release() {
        this.n.release();
        this.v = true;
    }

    @Override // defpackage.ey
    public final void start() {
        this.n.start();
        if (this.a.d <= 1) {
            return;
        }
        this.e.getClass();
    }
}
