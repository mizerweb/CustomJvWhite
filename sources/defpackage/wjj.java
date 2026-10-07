package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class wjj extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ yjj a;
    public final /* synthetic */ ny8 b;

    public wjj(yjj yjjVar, ny8 ny8Var) {
        this.a = yjjVar;
        this.b = ny8Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        je9 je9Var = je9.d;
        String string = network.toString();
        if (cqk.d((String) this.a.f.get(), string) && this.a.e.get() != null) {
            String str = this.a.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, c0a.o("Same cellular network (", string, "), skipping client rebuild"), null);
                return;
            }
            return;
        }
        String str2 = this.a.g;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "New cellular network available: ".concat(string), null);
        }
        psb psbVarA = ((gih) this.b.getValue()).a().a();
        SocketFactory socketFactory = network.getSocketFactory();
        if (socketFactory instanceof SSLSocketFactory) {
            ore.p("socketFactory instanceof SSLSocketFactory");
            return;
        }
        if (!socketFactory.equals(psbVarA.n)) {
            psbVarA.z = null;
        }
        psbVarA.n = socketFactory;
        psbVarA.h = true;
        psbVarA.i = true;
        vjj vjjVar = new vjj(this.a);
        byte[] bArr = uqi.a;
        psbVarA.e = new gve(vjjVar);
        qsb qsbVar = new qsb(psbVarA);
        this.a.f.set(string);
        this.a.e.set(qsbVar);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        String str = this.a.g;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Cellular network lost: " + network, null);
            }
        }
        this.a.e.set(null);
        this.a.f.set(null);
    }
}
