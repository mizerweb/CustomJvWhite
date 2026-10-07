package defpackage;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class qwa implements o78, v97 {
    public final Object a;
    public final ad2 b;
    public int c;
    public final oo6 d;
    public boolean e;
    public final ch f;
    public n78 g;
    public Executor h;
    public final LongSparseArray i;
    public final LongSparseArray j;
    public int k;
    public final ArrayList l;
    public final ArrayList m;

    public qwa(int i, int i2, int i3, int i4) {
        ch chVar = new ch(ImageReader.newInstance(i, i2, i3, i4));
        this.a = new Object();
        this.b = new ad2(2, this);
        this.c = 0;
        this.d = new oo6(26, this);
        this.e = false;
        this.i = new LongSparseArray();
        this.j = new LongSparseArray();
        this.m = new ArrayList();
        this.f = chVar;
        this.k = 0;
        this.l = new ArrayList(n());
    }

    @Override // defpackage.o78
    public final void D(n78 n78Var, Executor executor) {
        synchronized (this.a) {
            n78Var.getClass();
            this.g = n78Var;
            executor.getClass();
            this.h = executor;
            this.f.D(this.d, executor);
        }
    }

    @Override // defpackage.o78
    public final l78 H() {
        synchronized (this.a) {
            try {
                if (this.l.isEmpty()) {
                    return null;
                }
                if (this.k >= this.l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.l;
                int i = this.k;
                this.k = i + 1;
                l78 l78Var = (l78) arrayList.get(i);
                this.m.add(l78Var);
                return l78Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v97
    public final void a(w97 w97Var) {
        synchronized (this.a) {
            b(w97Var);
        }
    }

    public final void b(w97 w97Var) {
        synchronized (this.a) {
            try {
                int iIndexOf = this.l.indexOf(w97Var);
                if (iIndexOf >= 0) {
                    this.l.remove(iIndexOf);
                    int i = this.k;
                    if (iIndexOf <= i) {
                        this.k = i - 1;
                    }
                }
                this.m.remove(w97Var);
                if (this.c > 0) {
                    g(this.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(nof nofVar) {
        n78 n78Var;
        Executor executor;
        synchronized (this.a) {
            try {
                if (this.l.size() < n()) {
                    nofVar.b(this);
                    this.l.add(nofVar);
                    n78Var = this.g;
                    executor = this.h;
                } else {
                    tvj.a("TAG", "Maximum image number reached.");
                    nofVar.close();
                    n78Var = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (n78Var != null) {
            if (executor != null) {
                executor.execute(new su6(this, 28, n78Var));
            } else {
                n78Var.n(this);
            }
        }
    }

    @Override // defpackage.o78
    public final void close() {
        synchronized (this.a) {
            try {
                if (this.e) {
                    return;
                }
                Iterator it = new ArrayList(this.l).iterator();
                while (it.hasNext()) {
                    ((l78) it.next()).close();
                }
                this.l.clear();
                this.f.close();
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.o78
    public final l78 d() {
        synchronized (this.a) {
            try {
                if (this.l.isEmpty()) {
                    return null;
                }
                if (this.k >= this.l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.l.size() - 1; i++) {
                    if (!this.m.contains(this.l.get(i))) {
                        arrayList.add((l78) this.l.get(i));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((l78) it.next()).close();
                }
                int size = this.l.size();
                ArrayList arrayList2 = this.l;
                this.k = size;
                l78 l78Var = (l78) arrayList2.get(size - 1);
                this.m.add(l78Var);
                return l78Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.o78
    public final int e() {
        int iE;
        synchronized (this.a) {
            iE = this.f.e();
        }
        return iE;
    }

    @Override // defpackage.o78
    public final void f() {
        synchronized (this.a) {
            this.f.f();
            this.g = null;
            this.h = null;
            this.c = 0;
        }
    }

    public final void g(o78 o78Var) {
        l78 l78VarH;
        synchronized (this.a) {
            try {
                if (this.e) {
                    return;
                }
                int size = this.j.size() + this.l.size();
                if (size >= o78Var.n()) {
                    tvj.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        l78VarH = o78Var.H();
                        if (l78VarH != null) {
                            this.c--;
                            size++;
                            this.j.put(l78VarH.getImageInfo().getTimestamp(), l78VarH);
                            h();
                        }
                    } catch (IllegalStateException e) {
                        tvj.b("MetadataImageReader", "Failed to acquire next image.", e);
                        l78VarH = null;
                    }
                    if (l78VarH == null || this.c <= 0) {
                        break;
                    }
                } while (size < o78Var.n());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.o78
    public final int getHeight() {
        int height;
        synchronized (this.a) {
            height = this.f.getHeight();
        }
        return height;
    }

    @Override // defpackage.o78
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.f.getSurface();
        }
        return surface;
    }

    @Override // defpackage.o78
    public final int getWidth() {
        int width;
        synchronized (this.a) {
            width = this.f.getWidth();
        }
        return width;
    }

    public final void h() {
        synchronized (this.a) {
            try {
                for (int size = this.i.size() - 1; size >= 0; size--) {
                    m68 m68Var = (m68) this.i.valueAt(size);
                    long timestamp = m68Var.getTimestamp();
                    l78 l78Var = (l78) this.j.get(timestamp);
                    if (l78Var != null) {
                        this.j.remove(timestamp);
                        this.i.removeAt(size);
                        c(new nof(l78Var, null, m68Var));
                    }
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.a) {
            try {
                if (this.j.size() != 0 && this.i.size() != 0) {
                    long jKeyAt = this.j.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.i.keyAt(0);
                    qyj.i(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.j.size() - 1; size >= 0; size--) {
                            if (this.j.keyAt(size) < jKeyAt2) {
                                ((l78) this.j.valueAt(size)).close();
                                this.j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.i.size() - 1; size2 >= 0; size2--) {
                            if (this.i.keyAt(size2) < jKeyAt) {
                                this.i.removeAt(size2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.o78
    public final int n() {
        int iN;
        synchronized (this.a) {
            iN = this.f.n();
        }
        return iN;
    }
}
