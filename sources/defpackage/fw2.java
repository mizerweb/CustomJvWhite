package defpackage;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import one.video.calls.sdk.net.signaling.wt.nal.NALSocket;
import one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportSocket;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fw2 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fw2(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                rt2 rt2Var = (rt2) obj2;
                if (((m8b) obj4).d(((Long) obj).longValue())) {
                    arrayList.add(rt2Var);
                }
                break;
            default:
                WebTransportSocket.configureSession$lambda$0((WebTransportSocket) obj4, (NALSocket.Listener) obj3, (Long) obj, (String) obj2);
                break;
        }
    }
}
