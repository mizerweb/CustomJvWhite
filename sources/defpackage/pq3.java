package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.TrafficStats;
import android.view.ViewGroup;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class pq3 implements ow2, gd4 {
    public static final a8g j = new a8g(15);
    public static volatile pq3 k;
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;

    public pq3(Context context) {
        this.a = 0;
        ifh ifhVar = new ifh(new rgb(context, 2));
        this.b = new v2a(context, 3);
        this.c = new fbc(context, 17);
        this.d = new mbc(ifhVar);
        this.e = new j55(ifhVar);
        mjg mjgVarA = p90.a(m());
        this.f = mjgVarA;
        this.g = p90.a(0);
        this.h = new r8e(mjgVarA);
        this.i = "Chroma";
    }

    public static void f(ViewGroup viewGroup, kbc kbcVar) {
        yhf.k0(yhf.t0(new kx6(new sw(4, viewGroup), new ol(new c6(4), 24, new z9(0, kbcVar)), cif.a), new z9(1, kbcVar)));
    }

    public static /* synthetic */ void g(pq3 pq3Var, ViewGroup viewGroup) {
        kbc kbcVarM = pq3Var.m();
        pq3Var.getClass();
        f(viewGroup, kbcVarM);
    }

    @Override // defpackage.ow2
    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            rt2 rt2Var = (rt2) it.next();
            ((f9b) ((ConcurrentHashMap) this.e).computeIfAbsent(Long.valueOf(rt2Var.a), new mm(5, new fn3(rt2Var, 0)))).setValue(rt2Var);
            if (rt2Var.A() == 0 && !rt2Var.y0()) {
                return;
            } else {
                ((f9b) ((ConcurrentHashMap) this.f).computeIfAbsent(Long.valueOf(rt2Var.A()), new mm(3, new fn3(rt2Var, 1)))).setValue(rt2Var);
            }
        }
    }

    @Override // defpackage.gd4
    public void b(byte[] bArr) throws IOException {
        try {
            ((DataInputStream) ((ifh) this.h).getValue()).readFully(bArr, 0, bArr.length);
        } catch (IOException e) {
            String str = (String) this.i;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "receive1, failed on " + this, null);
                }
            }
            o(e);
            throw e;
        }
    }

    @Override // defpackage.gd4
    public int c(int i, byte[] bArr, int i2) throws IOException {
        try {
            return ((DataInputStream) ((ifh) this.h).getValue()).read(bArr, i, i2);
        } catch (IOException e) {
            String str = (String) this.i;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "receive2, failed on " + this, null);
                }
            }
            o(e);
            throw e;
        }
    }

    @Override // defpackage.gd4
    public boolean close() {
        je9 je9Var = je9.f;
        String str = (String) this.i;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var2 = je9.c;
            if (a4cVar.b(je9Var2)) {
                a4cVar.c(je9Var2, str, "close, " + this, null);
            }
        }
        boolean zCompareAndSet = ((AtomicBoolean) this.e).compareAndSet(false, true);
        Socket socket = (Socket) this.b;
        if (!zCompareAndSet) {
            if (!socket.isClosed()) {
                String str2 = (String) this.i;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, "close, " + ((Socket) this.b) + " is unexpectedly NOT closed", null);
                }
            }
            return false;
        }
        TrafficStats.setThreadStatsTag(socket.hashCode());
        try {
            ((Socket) this.b).close();
        } catch (Exception e) {
            String str3 = (String) this.i;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str3, "failed to close socket for " + this, e);
            }
        }
        try {
            TrafficStats.untagSocket((Socket) this.b);
        } catch (Exception unused) {
        }
        if (((ifh) this.g).d()) {
            try {
                ((DataOutputStream) ((ifh) this.g).getValue()).close();
            } catch (Exception unused2) {
            }
        }
        if (((ifh) this.h).d()) {
            try {
                ((DataInputStream) ((ifh) this.h).getValue()).close();
            } catch (Exception unused3) {
            }
        }
        TrafficStats.clearThreadStatsTag();
        if (!((Socket) this.b).isClosed()) {
            String str4 = (String) this.i;
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, str4, "close, socket is unexpectedly NOT closed for " + this, null);
            }
        }
        return true;
    }

    @Override // defpackage.gd4
    public void d(byte[] bArr) throws IOException {
        try {
            ((DataOutputStream) ((ifh) this.g).getValue()).write(bArr, 0, bArr.length);
        } catch (IOException e) {
            String str = (String) this.i;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "send, failed on " + this, null);
                }
            }
            o(e);
            throw e;
        }
    }

    @Override // defpackage.gd4
    public vc4 e() {
        return (vc4) this.c;
    }

    public qw2 h() {
        return (qw2) ((ny8) this.c).getValue();
    }

    public gjg i(q24 q24Var) {
        return new r8e((f9b) ((ConcurrentHashMap) this.g).computeIfAbsent(q24Var, new am(6, new tc(this, 27, q24Var))));
    }

    public nbc j() {
        mbc mbcVar = (mbc) this.d;
        SharedPreferences sharedPreferences = (SharedPreferences) ((ifh) ((j55) this.e).a).getValue();
        nbc nbcVar = nbc.SPACE;
        nbc nbcVarA = mbcVar.a(sharedPreferences.getString("themename", "OneMeGlobalThemeColorSpace"));
        return nbcVarA == null ? nbc.SPACE : nbcVarA;
    }

    public ix2 k() {
        return (ix2) this.f;
    }

    public ix2 l() {
        return (ix2) this.e;
    }

    public kbc m() {
        mbc mbcVar = (mbc) this.d;
        SharedPreferences sharedPreferences = (SharedPreferences) ((ifh) ((j55) this.e).a).getValue();
        nbc nbcVar = nbc.SPACE;
        nbc nbcVarA = mbcVar.a(sharedPreferences.getString("themename", "OneMeGlobalThemeColorSpace"));
        return nbcVarA != null ? f55.l(nbcVarA, n()) : f55.l(nbc.SPACE, n());
    }

    public final boolean n() {
        return true;
    }

    public void o(IOException iOException) {
        String message;
        id4 id4Var;
        if (((AtomicBoolean) this.e).get() || !(iOException instanceof SocketException) || (message = iOException.getMessage()) == null || !z5h.K0(message, "Software caused connection abort", true) || (id4Var = (id4) this.d) == null || !((AtomicBoolean) this.f).compareAndSet(false, true)) {
            return;
        }
        id4Var.b();
    }

    public void p(ahb ahbVar) {
        j55 j55Var = (j55) this.e;
        j55Var.getClass();
        ahb.a.getClass();
        String strW = j85.w(ahbVar);
        j55Var.d = ahbVar;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) ((ifh) j55Var.a).getValue()).edit();
        editorEdit.putString("nightmode", strW);
        editorEdit.apply();
        ((pzf) j55Var.b).a("nightmode");
    }

    public void q(s04 s04Var) {
        Object value;
        f9b f9bVar = (f9b) ((ConcurrentHashMap) this.g).computeIfAbsent(s04Var.r, new am(7, new j22(17, s04Var)));
        do {
            value = f9bVar.getValue();
        } while (!f9bVar.h(value, s04Var));
    }

    public String toString() {
        switch (this.a) {
            case 3:
                String str = (String) this.i;
                Socket socket = (Socket) this.b;
                boolean zIsConnected = socket.isConnected();
                boolean zIsClosed = socket.isClosed();
                boolean z = ((AtomicBoolean) this.e).get();
                wc4 wc4VarA = ((vc4) this.c).a();
                StringBuilder sbA = zo5.A("\n        ", str, "(\n             isSocketConnected=", "\n             isSocketClosed=", zIsConnected);
                qt4.B("\n             isClosed=", "\n             ", sbA, zIsClosed, z);
                sbA.append(socket);
                sbA.append("\n             ");
                sbA.append(wc4VarA);
                sbA.append("\n        )\n    ");
                return s5h.x0(sbA.toString());
            default:
                return super.toString();
        }
    }

    public pq3(ny8 ny8Var, ny8 ny8Var2, xhh xhhVar) {
        this.a = 1;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = new ifh(new d2(9, xhhVar));
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap();
        this.h = new AtomicBoolean(false);
    }

    public pq3(Socket socket, vc4 vc4Var) {
        this.a = 3;
        this.b = socket;
        this.c = vc4Var;
        final int i = 0;
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        this.g = new ifh(new af7(this) { // from class: dlh
            public final /* synthetic */ pq3 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                pq3 pq3Var = this.b;
                switch (i2) {
                    case 0:
                        return new DataOutputStream(((Socket) pq3Var.b).getOutputStream());
                    default:
                        return new DataInputStream(((Socket) pq3Var.b).getInputStream());
                }
            }
        });
        final int i2 = 1;
        this.h = new ifh(new af7(this) { // from class: dlh
            public final /* synthetic */ pq3 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                pq3 pq3Var = this.b;
                switch (i3) {
                    case 0:
                        return new DataOutputStream(((Socket) pq3Var.b).getOutputStream());
                    default:
                        return new DataInputStream(((Socket) pq3Var.b).getInputStream());
                }
            }
        });
        this.i = zo5.h(System.identityHashCode(this), "TcpConnection@");
    }

    public pq3(fn8 fn8Var, fn8 fn8Var2, fn8 fn8Var3, ix2 ix2Var, ix2 ix2Var2, bs0 bs0Var, fn8 fn8Var4, fn8 fn8Var5) {
        this.a = 2;
        this.b = fn8Var;
        this.c = fn8Var2;
        this.d = fn8Var3;
        this.e = ix2Var;
        this.f = ix2Var2;
        this.g = bs0Var;
        this.h = fn8Var4;
        this.i = fn8Var5;
    }
}
