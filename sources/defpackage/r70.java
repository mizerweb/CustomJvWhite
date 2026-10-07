package defpackage;

import android.net.TrafficStats;
import androidx.core.graphics.drawable.IconCompat;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class r70 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public static long d(int i, ew5 ew5Var, ew5 ew5Var2) {
        long j = ew5Var.a;
        return ew5Var2 != null ? sn0.a(i, j, ew5Var2.a) : sn0.b(i, 4, j, 0L);
    }

    public htc a() {
        htc htcVar = new htc();
        htcVar.a = (CharSequence) this.b;
        htcVar.b = (IconCompat) this.c;
        htcVar.c = (String) this.d;
        htcVar.d = this.a;
        return htcVar;
    }

    public void b(Socket socket) {
        gl6.a(socket);
        try {
            TrafficStats.untagSocket(socket);
        } catch (Exception unused) {
        }
    }

    public void c(String str, SSLSocket sSLSocket, vc4 vc4Var) throws IOException {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.c;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "FastClient", "connectTls -> " + sSLSocket, null);
            }
        }
        try {
            InetAddress inetAddress = sSLSocket.getInetAddress();
            if (inetAddress == null) {
                throw new SocketException("Has no remote address, " + sSLSocket + ".");
            }
            v44 v44VarA = ((pfh) this.b).a();
            vo5 vo5Var = (vo5) this.c;
            gl6 gl6Var = (gl6) this.d;
            vo5Var.g(str, inetAddress);
            try {
                gl6Var.c.d(sSLSocket, str, gl6Var.d);
                vo5Var.f(str, inetAddress, true);
                vc4Var.g = Math.max(ew5.g(((e2) v44VarA).j()), 0L);
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 == null) {
                    return;
                }
                je9 je9Var2 = je9.e;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, "FastClient", "<- connectTls, success for " + sSLSocket, null);
                }
            } catch (Throwable th) {
                vo5Var.f(str, inetAddress, false);
                throw th;
            }
        } catch (IOException e) {
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null) {
                je9 je9Var3 = je9.f;
                if (a4cVar3.b(je9Var3)) {
                    a4cVar3.c(je9Var3, "FastClient", "<- connectTls, failed for " + sSLSocket, e);
                }
            }
            b(sSLSocket);
            throw e;
        }
    }

    public void e() {
        if (this.a) {
            ((sfh) this.d).f(new e6(5, this));
            this.a = false;
        }
    }
}
