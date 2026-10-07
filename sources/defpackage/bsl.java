package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bsl extends lil {
    public final /* synthetic */ qjh b;
    public final /* synthetic */ f5l c;
    public final /* synthetic */ t6m d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsl(t6m t6mVar, qjh qjhVar, qjh qjhVar2, f5l f5lVar) {
        super(qjhVar);
        this.b = qjhVar2;
        this.c = f5lVar;
        this.d = t6mVar;
    }

    @Override // defpackage.lil
    public final void a() {
        synchronized (this.d.f) {
            try {
                t6m t6mVar = this.d;
                qjh qjhVar = this.b;
                t6mVar.e.add(qjhVar);
                qjhVar.a.b(new ewe(t6mVar, qjhVar, false, 16));
                if (this.d.k.getAndIncrement() > 0) {
                    this.d.b.a("Already connected to the service.", new Object[0]);
                }
                t6m.b(this.d, this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
