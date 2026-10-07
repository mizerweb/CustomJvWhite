package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l75 implements r89, n3a {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l75(Object obj, float f) {
        this.b = obj;
        this.a = f;
    }

    @Override // defpackage.n3a
    public void b(i2a i2aVar) {
        ((o3a) this.b).g.t.setPlaybackSpeed(this.a);
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        ((xf) obj).H0((wf) this.b, this.a);
    }
}
