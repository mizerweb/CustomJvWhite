package defpackage;

import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class vbk {
    public volatile DatagramSocket a;
    public final w7k b;
    public final u6 c;
    public final Thread d;
    public final LinkedBlockingQueue e;
    public volatile boolean f = false;

    public vbk(DatagramSocket datagramSocket, ku8 ku8Var, w7k w7kVar, u6 u6Var) {
        Objects.requireNonNull(datagramSocket);
        this.a = datagramSocket;
        this.b = w7kVar;
        this.c = u6Var;
        Thread thread = new Thread(new myj(3, this), "receiver");
        this.d = thread;
        thread.setDaemon(true);
        this.e = new LinkedBlockingQueue();
        try {
            datagramSocket.getReceiveBufferSize();
        } catch (SocketException unused) {
        }
    }
}
