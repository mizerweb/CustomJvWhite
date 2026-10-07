package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g8g extends rql {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ g8g(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(r8g r8gVar) {
        Object poeVar;
        switch (this.a) {
            case 0:
                s6g s6gVar = new s6g();
                r8gVar.b(s6gVar);
                if (!s6gVar.a) {
                    try {
                        poeVar = ((af7) this.b).invoke();
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                    if (!(poeVar instanceof poe) && !s6gVar.a) {
                        r8gVar.a(poeVar);
                    }
                    Throwable thA = roe.a(poeVar);
                    if (thA != null && !s6gVar.a) {
                        r8gVar.onError(thA);
                        break;
                    }
                }
                break;
            default:
                ((d8g) this.b).a(new t8g(r8gVar, this));
                break;
        }
    }
}
