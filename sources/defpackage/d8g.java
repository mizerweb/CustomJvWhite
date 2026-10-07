package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d8g extends rql {
    public final /* synthetic */ int a;
    public final rql b;
    public final Object c;

    public /* synthetic */ d8g(rql rqlVar, Object obj, int i) {
        this.a = i;
        this.b = rqlVar;
        this.c = obj;
    }

    public final void a(r8g r8gVar) {
        switch (this.a) {
            case 0:
                ((d8g) this.b).a(new c8g(r8gVar, this));
                break;
            default:
                ((vn5) this.c).a(new kr0(this, 5, r8gVar));
                break;
        }
    }
}
