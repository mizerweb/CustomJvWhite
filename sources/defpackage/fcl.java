package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fcl extends qkk {
    public final qd2 d;
    public final qjh e;
    public final /* synthetic */ gfl f;

    public fcl(gfl gflVar, qjh qjhVar) {
        qd2 qd2Var = new qd2("OnRequestInstallCallback");
        this.f = gflVar;
        super(2);
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.d = qd2Var;
        this.e = qjhVar;
    }
}
