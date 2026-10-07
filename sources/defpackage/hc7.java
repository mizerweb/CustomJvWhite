package defpackage;

import org.webrtc.VpxEncoderWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hc7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ic7 b;

    public /* synthetic */ hc7(ic7 ic7Var, int i) {
        this.a = i;
        this.b = ic7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ic7 ic7Var = this.b;
        switch (i) {
            case 0:
                ic7Var.k = true;
                VpxEncoderWrapper vpxEncoderWrapper = new VpxEncoderWrapper();
                vpxEncoderWrapper.setConsumerCallback(ic7Var);
                ic7Var.d = vpxEncoderWrapper;
                break;
            case 1:
                ic7Var.a();
                break;
            default:
                ic7Var.a();
                ic7Var.e = null;
                ic7Var.f = null;
                break;
        }
    }
}
