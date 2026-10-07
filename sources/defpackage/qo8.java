package defpackage;

import java.nio.ByteBuffer;
import org.webrtc.JniCommon;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qo8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ByteBuffer b;

    public /* synthetic */ qo8(ByteBuffer byteBuffer, int i) {
        this.a = i;
        this.b = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ByteBuffer byteBuffer = this.b;
        switch (i) {
            case 0:
                JniCommon.nativeFreeByteBuffer(byteBuffer);
                break;
            default:
                JniCommon.nativeFreeByteBuffer(byteBuffer);
                break;
        }
    }
}
