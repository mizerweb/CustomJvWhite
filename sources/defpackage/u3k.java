package defpackage;

import android.os.Process;
import ru.ok.android.externcalls.sdk.g;
import ru.ok.android.webrtc.signaling.transport.exception.BadEndpointException;

/* JADX INFO: loaded from: classes3.dex */
public final class u3k implements Runnable {
    public final boolean a;
    public final /* synthetic */ y5g b;

    public u3k(y5g y5gVar, boolean z) {
        this.b = y5gVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int threadPriority = Process.getThreadPriority(Process.myTid());
        try {
            try {
                Process.setThreadPriority(10);
                Object socketLock = this.b.getSocketLock();
                y5g y5gVar = this.b;
                synchronized (socketLock) {
                    try {
                        y5gVar.safelyDoIfSocketExists(new s5g(y5gVar, 1));
                        g5g signalingLogger = y5gVar.getSignalingLogger();
                        String strB = y5gVar.u;
                        signalingLogger.getClass();
                        strB.getClass();
                        if (signalingLogger.b.shouldHideSensitiveInformation()) {
                            strB = lql.b(strB);
                            strB.getClass();
                        }
                        signalingLogger.a.log(signalingLogger.d, "Connect to ".concat(strB));
                        y5g.access$validateEndpoint(y5gVar);
                        String str = y5gVar.u;
                        ylc ylcVar = y5gVar.F;
                        y5gVar.safelyCreateNewSocket(str, ylcVar != null ? (String) ylcVar.a : null, new ch(y5gVar, 8, this));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Process.setThreadPriority(threadPriority);
            } catch (BadEndpointException e) {
                this.b.d.onFailedByException(this.b.k, e);
                g5g signalingLogger2 = this.b.getSignalingLogger();
                String str2 = e.a;
                signalingLogger2.getClass();
                str2.getClass();
                signalingLogger2.a.reportException(signalingLogger2.d, str2, e);
                m4g m4gVar = this.b.c;
                if (m4gVar != null) {
                    ((g) m4gVar).a(new j4g(e.a), this.b);
                }
                this.b.dispose();
                Process.setThreadPriority(threadPriority);
            } catch (Throwable th2) {
                y5g.access$handleSocketFailure(this.b, this.a, th2);
                Process.setThreadPriority(threadPriority);
            }
        } catch (Throwable th3) {
            Process.setThreadPriority(threadPriority);
            throw th3;
        }
    }
}
