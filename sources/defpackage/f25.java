package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.webrtc.DataChannel;
import ru.ok.android.webrtc.protocol.exceptions.RtcInternalHandleException;

/* JADX INFO: loaded from: classes3.dex */
public final class f25 {
    public final DataChannel a;
    public final y3e b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();

    public f25(DataChannel dataChannel, y3e y3eVar) {
        this.a = dataChannel;
        this.b = y3eVar;
        dataChannel.registerObserver(new ih(this, dataChannel, false));
    }

    public final void a(bwe bweVar) {
        if (bweVar != null) {
            this.d.add(bweVar);
        } else {
            ore.p("Illegal 'listener' value: null");
        }
    }

    public final boolean b() {
        return this.a.state() == DataChannel.State.OPEN;
    }

    public final void c(bwe bweVar) {
        if (bweVar != null) {
            this.d.remove(bweVar);
        } else {
            ore.p("Illegal 'listener' value: null");
        }
    }

    public final void d(ByteBuffer... byteBufferArr) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            try {
                ((bwe) it.next()).getClass();
            } catch (Throwable th) {
                this.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.send", new RtcInternalHandleException(th));
            }
        }
        this.a.sendMultiple(true, byteBufferArr);
    }

    public final boolean e(int i, byte[] bArr) {
        if (bArr == null) {
            ore.p("Illegal 'command' value: null");
            return false;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            try {
                ((bwe) it.next()).getClass();
                ByteBuffer.wrap(bArr);
            } catch (Throwable th) {
                this.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.send", new RtcInternalHandleException(th));
            }
        }
        return this.a.send(new DataChannel.Buffer(ByteBuffer.wrap(bArr), i == 2));
    }
}
