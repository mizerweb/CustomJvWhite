package defpackage;

import org.webrtc.AndroidVideoDecoder;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i91 implements AndroidVideoDecoder.ErrorCallback, sah {
    public final /* synthetic */ o91 a;

    public /* synthetic */ i91(o91 o91Var) {
        this.a = o91Var;
    }

    @Override // org.webrtc.AndroidVideoDecoder.ErrorCallback
    public void error(Exception exc, String str) {
        this.a.N.logException("OKRTCCall", str, new IllegalStateException(str, exc));
    }

    @Override // defpackage.sah
    public Object get() {
        return Boolean.valueOf(this.a.E0);
    }
}
