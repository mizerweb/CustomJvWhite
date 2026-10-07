package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class l4l extends y3l {
    final /* synthetic */ p4l c;
    private final bcm d;

    public l4l(p4l p4lVar, bcm bcmVar) {
        this.c = p4lVar;
        this.d = bcmVar;
    }

    @Override // defpackage.y3l
    public final /* bridge */ /* synthetic */ Object a() throws Exception {
        return this.d.a();
    }

    @Override // defpackage.y3l
    public final String b() {
        return this.d.toString();
    }

    @Override // defpackage.y3l
    public final void c(Throwable th) {
        this.c.o(th);
    }

    @Override // defpackage.y3l
    public final /* synthetic */ void d(Object obj) {
        this.c.p((e4l) obj);
    }

    @Override // defpackage.y3l
    public final boolean f() {
        return this.c.isDone();
    }
}
