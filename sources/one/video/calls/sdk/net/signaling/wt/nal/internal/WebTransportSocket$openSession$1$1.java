package one.video.calls.sdk.net.signaling.wt.nal.internal;

import defpackage.fg7;
import defpackage.qdk;
import defpackage.qf7;
import defpackage.sbi;
import java.io.IOException;
import kotlin.Metadata;
import one.video.calls.sdk.net.signaling.wt.nal.NALSocket;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class WebTransportSocket$openSession$1$1 extends fg7 implements qf7 {
    public WebTransportSocket$openSession$1$1(Object obj) {
        super(2, 0, WebTransportSocket.class, obj, "sendStreamData", "sendStreamData(Ltech/kwik/flupke/webtransport/WebTransportStream;Lone/video/calls/sdk/net/signaling/wt/nal/NALSocket$Listener;)V");
    }

    @Override // defpackage.qf7
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
        invoke((qdk) obj, (NALSocket.Listener) obj2);
        return sbi.a;
    }

    public final void invoke(qdk qdkVar, NALSocket.Listener listener) throws IOException {
        ((WebTransportSocket) this.receiver).sendStreamData(qdkVar, listener);
    }
}
