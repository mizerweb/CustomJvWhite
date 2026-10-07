package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ufk {
    public final /* synthetic */ o91 a;

    public /* synthetic */ ufk(o91 o91Var) {
        this.a = o91Var;
    }

    public void a(boolean z) {
        o91 o91Var = this.a;
        o91Var.N.log("OKRTCCall", "Screen capture has stopped, fast=" + z);
        o91Var.l.post(new nb0(this, z, 10));
    }
}
