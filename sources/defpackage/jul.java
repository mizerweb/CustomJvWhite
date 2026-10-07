package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jul extends lil {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jul(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.lil
    public final void a() {
        switch (this.b) {
            case 0:
                synchronized (((t6m) this.c).f) {
                    try {
                        if (((t6m) this.c).k.get() > 0 && ((t6m) this.c).k.decrementAndGet() > 0) {
                            ((t6m) this.c).b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        t6m t6mVar = (t6m) this.c;
                        if (t6mVar.m != null) {
                            t6mVar.b.a("Unbind from service.", new Object[0]);
                            t6m t6mVar2 = (t6m) this.c;
                            t6mVar2.a.unbindService(t6mVar2.l);
                            t6m t6mVar3 = (t6m) this.c;
                            t6mVar3.g = false;
                            t6mVar3.m = null;
                            t6mVar3.l = null;
                        }
                        ((t6m) this.c).c();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                t6m t6mVar4 = (t6m) ((h5b) this.c).b;
                t6mVar4.b.a("unlinkToDeath", new Object[0]);
                t6mVar4.m.asBinder().unlinkToDeath(t6mVar4.j, 0);
                t6mVar4.m = null;
                t6mVar4.g = false;
                return;
        }
    }
}
