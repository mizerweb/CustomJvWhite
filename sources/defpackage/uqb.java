package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class uqb extends AtomicInteger implements ko5, rrb {
    public static final tqb[] n = new tqb[0];
    public static final tqb[] o = new tqb[0];
    public final rrb a;
    public final g85 b;
    public final int d;
    public volatile y6g e;
    public volatile boolean f;
    public volatile boolean h;
    public ko5 j;
    public long k;
    public int l;
    public int m;
    public final j40 g = new j40();
    public final int c = Integer.MAX_VALUE;
    public final AtomicReference i = new AtomicReference(n);

    public uqb(rrb rrbVar, g85 g85Var, int i) {
        this.a = rrbVar;
        this.b = g85Var;
        this.d = i;
    }

    public final boolean a() {
        if (this.h) {
            return true;
        }
        if (((Throwable) this.g.get()) == null) {
            return false;
        }
        e();
        this.g.c(this.a);
        return true;
    }

    @Override // defpackage.rrb
    public final void b() {
        if (this.f) {
            return;
        }
        this.f = true;
        f();
    }

    @Override // defpackage.rrb
    public final void c(ko5 ko5Var) {
        if (oo5.f(this.j, ko5Var)) {
            this.j = ko5Var;
            this.a.c(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rrb
    public final void d(Object obj) {
        if (this.f) {
            return;
        }
        try {
            fqb fqbVar = (fqb) this.b.mo41apply(obj);
            if (this.c != Integer.MAX_VALUE) {
                synchronized (this) {
                    try {
                        int i = this.m;
                        if (i == this.c) {
                            throw null;
                        }
                        this.m = i + 1;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (fqbVar instanceof qah) {
                try {
                    Object obj2 = ((qah) fqbVar).get();
                    if (obj2 != null) {
                        if (get() == 0 && compareAndSet(0, 1)) {
                            this.a.d(obj2);
                            if (decrementAndGet() != 0) {
                            }
                        } else {
                            y6g nfgVar = this.e;
                            if (nfgVar == null) {
                                nfgVar = this.c == Integer.MAX_VALUE ? new nfg(this.d) : new mfg(this.c);
                                this.e = nfgVar;
                            }
                            nfgVar.offer(obj2);
                            if (getAndIncrement() != 0) {
                                return;
                            }
                        }
                        g();
                    }
                } catch (Throwable th2) {
                    iwl.a(th2);
                    this.g.b(th2);
                    f();
                }
                if (this.c == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        throw null;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            this.k++;
            tqb tqbVar = new tqb(this);
            AtomicReference atomicReference = this.i;
            while (true) {
                tqb[] tqbVarArr = (tqb[]) atomicReference.get();
                if (tqbVarArr == o) {
                    oo5.a(tqbVar);
                    return;
                }
                int length = tqbVarArr.length;
                tqb[] tqbVarArr2 = new tqb[length + 1];
                System.arraycopy(tqbVarArr, 0, tqbVarArr2, 0, length);
                tqbVarArr2[length] = tqbVar;
                do {
                    if (atomicReference.compareAndSet(tqbVarArr, tqbVarArr2)) {
                        fqbVar.f(tqbVar);
                        return;
                    }
                } while (atomicReference.get() == tqbVarArr);
            }
        } catch (Throwable th4) {
            iwl.a(th4);
            this.j.dispose();
            onError(th4);
        }
    }

    @Override // defpackage.ko5
    public final void dispose() {
        Throwable thA;
        this.h = true;
        if (!e() || (thA = this.g.a()) == null || thA == gd6.a) {
            return;
        }
        tre.s0(thA);
    }

    public final boolean e() {
        this.j.dispose();
        AtomicReference atomicReference = this.i;
        tqb[] tqbVarArr = o;
        tqb[] tqbVarArr2 = (tqb[]) atomicReference.getAndSet(tqbVarArr);
        if (tqbVarArr2 == tqbVarArr) {
            return false;
        }
        for (tqb tqbVar : tqbVarArr2) {
            tqbVar.getClass();
            oo5.a(tqbVar);
        }
        return true;
    }

    public final void f() {
        if (getAndIncrement() == 0) {
            g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad A[PHI: r9
  0x00ad: PHI (r9v4 int) = (r9v2 int), (r9v5 int) binds: [B:44:0x0093, B:53:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    public final void g() {
        boolean z;
        rrb rrbVar = this.a;
        int iAddAndGet = 1;
        while (!a()) {
            y6g y6gVar = this.e;
            if (y6gVar != null) {
                while (!a()) {
                    Object objPoll = y6gVar.poll();
                    if (objPoll != null) {
                        rrbVar.d(objPoll);
                    }
                }
                return;
            }
            boolean z2 = this.f;
            y6g y6gVar2 = this.e;
            tqb[] tqbVarArr = (tqb[]) this.i.get();
            int length = tqbVarArr.length;
            if (this.c != Integer.MAX_VALUE) {
                synchronized (this) {
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z2 && ((y6gVar2 == null || y6gVar2.isEmpty()) && length == 0)) {
                this.g.c(this.a);
                return;
            }
            int i = 0;
            if (length != 0) {
                int iMin = Math.min(length - 1, this.l);
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (a()) {
                        return;
                    }
                    tqb tqbVar = tqbVarArr[iMin];
                    b7g b7gVar = tqbVar.c;
                    if (b7gVar != null) {
                        do {
                            try {
                                Object objPoll2 = b7gVar.poll();
                                if (objPoll2 == null) {
                                    z = tqbVar.b;
                                    b7g b7gVar2 = tqbVar.c;
                                    if (z && (b7gVar2 == null || b7gVar2.isEmpty())) {
                                        h(tqbVar);
                                        i2++;
                                    }
                                    iMin++;
                                    if (iMin == length) {
                                        iMin = 0;
                                    }
                                } else {
                                    rrbVar.d(objPoll2);
                                }
                            } catch (Throwable th2) {
                                iwl.a(th2);
                                oo5.a(tqbVar);
                                this.g.b(th2);
                                if (a()) {
                                    return;
                                }
                                h(tqbVar);
                                i2++;
                                iMin++;
                                if (iMin == length) {
                                }
                            }
                        } while (!a());
                        return;
                    }
                    z = tqbVar.b;
                    b7g b7gVar3 = tqbVar.c;
                    if (z) {
                        h(tqbVar);
                        i2++;
                    }
                    iMin++;
                    if (iMin == length) {
                        iMin = 0;
                    }
                }
                this.l = iMin;
                i = i2;
            }
            if (i == 0) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else if (this.c != Integer.MAX_VALUE && i != 0) {
                synchronized (this) {
                    try {
                        throw null;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(tqb tqbVar) {
        tqb[] tqbVarArr;
        while (true) {
            AtomicReference atomicReference = this.i;
            tqb[] tqbVarArr2 = (tqb[]) atomicReference.get();
            int length = tqbVarArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (tqbVarArr2[i] == tqbVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                tqbVarArr = n;
            } else {
                tqb[] tqbVarArr3 = new tqb[length - 1];
                System.arraycopy(tqbVarArr2, 0, tqbVarArr3, 0, i);
                System.arraycopy(tqbVarArr2, i + 1, tqbVarArr3, i, (length - i) - 1);
                tqbVarArr = tqbVarArr3;
            }
            while (!atomicReference.compareAndSet(tqbVarArr2, tqbVarArr)) {
                if (atomicReference.get() != tqbVarArr2) {
                }
            }
            return;
        }
    }

    @Override // defpackage.rrb
    public final void onError(Throwable th) {
        if (this.f) {
            tre.s0(th);
        } else if (this.g.b(th)) {
            this.f = true;
            f();
        }
    }
}
