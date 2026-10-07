package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j3m extends iul {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j3m(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.iul
    public final void a() {
        switch (this.b) {
            case 0:
                synchronized (((sbm) this.c).f) {
                    try {
                        if (((sbm) this.c).k.get() > 0 && ((sbm) this.c).k.decrementAndGet() > 0) {
                            ((sbm) this.c).b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        sbm sbmVar = (sbm) this.c;
                        if (sbmVar.m != null) {
                            sbmVar.b.c("Unbind from service.", new Object[0]);
                            sbm sbmVar2 = (sbm) this.c;
                            sbmVar2.a.unbindService(sbmVar2.l);
                            sbm sbmVar3 = (sbm) this.c;
                            sbmVar3.g = false;
                            sbmVar3.m = null;
                            sbmVar3.l = null;
                        }
                        ((sbm) this.c).e();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                sbm sbmVar4 = (sbm) ((h5b) this.c).b;
                sbmVar4.b.c("unlinkToDeath", new Object[0]);
                sbmVar4.m.asBinder().unlinkToDeath(sbmVar4.j, 0);
                sbmVar4.m = null;
                sbmVar4.g = false;
                return;
        }
    }
}
