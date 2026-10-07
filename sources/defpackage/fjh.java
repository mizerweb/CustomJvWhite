package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fjh {
    public final /* synthetic */ ljh a;

    public fjh(ljh ljhVar) {
        this.a = ljhVar;
    }

    public final void a(Throwable th) {
        this.a.g(th);
    }

    public final void b(Object obj) {
        ljh ljhVar = this.a;
        synchronized (ljhVar) {
            if (ljhVar.c != null) {
                return;
            }
            ljhVar.c = new roe(obj);
            awl.a(ljhVar.a, new ik5(ljhVar, obj));
            awl.a(ljhVar.b, new jjh(ljhVar, null, 0));
        }
    }
}
