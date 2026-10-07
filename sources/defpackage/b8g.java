package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class b8g extends AtomicReference implements f8g, ko5, s8g {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public b8g(s8g s8gVar) {
        this.b = s8gVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:57:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[LOOP:0: B:24:0x005f->B:63:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.s8g
    public final void a(Object obj) {
        ko5 ko5Var;
        AtomicReference atomicReference;
        nfg nfgVar;
        nfg nfgVar2;
        switch (this.a) {
            case 0:
                Object obj2 = get();
                oo5 oo5Var = oo5.a;
                if (obj2 == oo5Var || (ko5Var = (ko5) getAndSet(oo5Var)) == oo5Var) {
                    return;
                }
                s8g s8gVar = (s8g) this.b;
                try {
                    if (obj == null) {
                        s8gVar.onError(gd6.a("onSuccess called with a null value."));
                    } else {
                        s8gVar.a(obj);
                    }
                    if (ko5Var != null) {
                        ko5Var.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (ko5Var != null) {
                        ko5Var.dispose();
                    }
                    throw th;
                }
            default:
                wqb wqbVar = (wqb) this.b;
                ((w74) wqbVar.g).c(this);
                if (wqbVar.get() == 0) {
                    if (wqbVar.compareAndSet(0, 1)) {
                        wqbVar.b.d(obj);
                        boolean z = wqbVar.c.decrementAndGet() == 0;
                        nfg nfgVar3 = (nfg) wqbVar.e.get();
                        if (z && (nfgVar3 == null || nfgVar3.isEmpty())) {
                            wqbVar.d.c(wqbVar.b);
                            return;
                        } else if (wqbVar.decrementAndGet() == 0) {
                            return;
                        }
                    } else {
                        atomicReference = wqbVar.e;
                        nfgVar = (nfg) atomicReference.get();
                        if (nfgVar == null) {
                            nfgVar2 = new nfg(w07.a);
                            while (true) {
                                if (atomicReference.compareAndSet(null, nfgVar2)) {
                                    nfgVar = nfgVar2;
                                } else if (atomicReference.get() != null) {
                                    nfgVar = (nfg) atomicReference.get();
                                }
                            }
                        }
                        synchronized (nfgVar) {
                            nfgVar.offer(obj);
                            break;
                        }
                        wqbVar.c.decrementAndGet();
                        if (wqbVar.getAndIncrement() != 0) {
                            return;
                        }
                    }
                } else {
                    atomicReference = wqbVar.e;
                    nfgVar = (nfg) atomicReference.get();
                    if (nfgVar == null) {
                        nfgVar2 = new nfg(w07.a);
                        while (true) {
                            if (atomicReference.compareAndSet(null, nfgVar2)) {
                                nfgVar = nfgVar2;
                            } else if (atomicReference.get() != null) {
                                nfgVar = (nfg) atomicReference.get();
                            }
                        }
                    }
                    synchronized (nfgVar) {
                        nfgVar.offer(obj);
                        wqbVar.c.decrementAndGet();
                        if (wqbVar.getAndIncrement() != 0) {
                            return;
                        }
                    }
                }
                wqbVar.e();
                return;
        }
    }

    public boolean b() {
        return oo5.b((ko5) get());
    }

    @Override // defpackage.s8g
    public void c(ko5 ko5Var) {
        oo5.e(this, ko5Var);
    }

    public boolean d(Throwable th) {
        ko5 ko5Var;
        Object obj = get();
        oo5 oo5Var = oo5.a;
        if (obj == oo5Var || (ko5Var = (ko5) getAndSet(oo5Var)) == oo5Var) {
            return false;
        }
        try {
            ((s8g) this.b).onError(th);
        } finally {
            if (ko5Var != null) {
                ko5Var.dispose();
            }
        }
    }

    @Override // defpackage.ko5
    public final void dispose() {
        switch (this.a) {
            case 0:
                oo5.a(this);
                break;
            default:
                oo5.a(this);
                break;
        }
    }

    @Override // defpackage.s8g
    public void onError(Throwable th) {
        wqb wqbVar = (wqb) this.b;
        w74 w74Var = (w74) wqbVar.g;
        w74Var.c(this);
        if (wqbVar.d.b(th)) {
            ((ko5) wqbVar.i).dispose();
            w74Var.dispose();
            wqbVar.c.decrementAndGet();
            wqbVar.a();
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.a) {
            case 0:
                return nbh.v(b8g.class.getSimpleName(), "{", super.toString(), "}");
            default:
                return super.toString();
        }
    }

    public b8g(wqb wqbVar) {
        this.b = wqbVar;
    }
}
