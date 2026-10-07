package defpackage;

import java.util.function.Consumer;
import org.webrtc.NativeDoubleArrayConsumer;
import org.webrtc.PeerConnectionFactory;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cm implements Consumer {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ js8 b;

    public /* synthetic */ cm(boolean z, js8 js8Var) {
        this.a = z;
        this.b = js8Var;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        js8 js8Var = this.b;
        ((PeerConnectionFactory) obj).setAnimojiParams(this.a, (String) js8Var.e, (NativeDoubleArrayConsumer.Consumer) js8Var.f);
    }
}
