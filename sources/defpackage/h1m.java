package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h1m extends qkk {
    public final ste d;
    public final qjh e;
    public final /* synthetic */ i3m f;
    public final /* synthetic */ i3m g;

    public h1m(i3m i3mVar, qjh qjhVar, String str) {
        this.g = i3mVar;
        ste steVar = new ste("OnRequestInstallCallback", 3);
        this.f = i3mVar;
        super(1);
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.d = steVar;
        this.e = qjhVar;
    }
}
