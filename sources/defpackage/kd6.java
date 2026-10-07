package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.a;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes.dex */
public final class kd6 {
    public final e9e a;
    public final ec b;
    public final y8e c;
    public final lc6 d;
    public qf4 e;
    public ma f;
    public int g;
    public int h;
    public int i;
    public fve j;

    public kd6(e9e e9eVar, ec ecVar, y8e y8eVar, lc6 lc6Var) {
        this.a = e9eVar;
        this.b = ecVar;
        this.c = y8eVar;
        this.d = lc6Var;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0242  */
    /* JADX WARN: Code duplicated, block: B:122:0x025d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0269  */
    /* JADX WARN: Code duplicated, block: B:125:0x026f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0275  */
    /* JADX WARN: Code duplicated, block: B:136:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:137:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:179:0x02a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x02c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0328 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x021a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x031e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:72:0x0130  */
    public final c9e a(int i, int i2, int i3, boolean z, boolean z2) throws IOException {
        fve fveVar;
        qf4 qf4Var;
        ma maVar;
        ArrayList arrayList;
        qf4 qf4Var2;
        ec ecVar;
        Proxy proxy;
        String hostName;
        int port;
        List listSingletonList;
        boolean zContains;
        c9e c9eVar;
        w4 w4Var;
        Socket socketK;
        while (!this.c.p) {
            c9e c9eVar2 = this.c.j;
            if (c9eVar2 != null) {
                synchronized (c9eVar2) {
                    try {
                        if (!c9eVar2.j) {
                            k28 k28Var = c9eVar2.b.a.h;
                            k28 k28Var2 = this.b.h;
                            socketK = !(k28Var.e == k28Var2.e && cqk.d(k28Var.d, k28Var2.d)) ? this.c.k() : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.c.j == null) {
                    if (socketK != null) {
                        uqi.e(socketK);
                    }
                    this.g = 0;
                    this.h = 0;
                    this.i = 0;
                    if (this.a.a(this.b, this.c, null, false)) {
                        c9eVar2 = this.c.j;
                    } else {
                        fveVar = this.j;
                        try {
                            if (fveVar != null) {
                                this.j = null;
                            } else {
                                qf4Var = this.e;
                                if (qf4Var == null && qf4Var.l()) {
                                    qf4 qf4Var3 = this.e;
                                    if (!qf4Var3.l()) {
                                        qr7.d();
                                        return null;
                                    }
                                    ArrayList arrayList2 = (ArrayList) qf4Var3.c;
                                    int i4 = qf4Var3.b;
                                    qf4Var3.b = i4 + 1;
                                    fveVar = (fve) arrayList2.get(i4);
                                } else {
                                    maVar = this.f;
                                    if (maVar == null) {
                                        ec ecVar2 = this.b;
                                        y8e y8eVar = this.c;
                                        maVar = new ma(ecVar2, y8eVar.a.z, y8eVar, this.d);
                                        this.f = maVar;
                                    }
                                    if (maVar.r()) {
                                        qr7.d();
                                        return null;
                                    }
                                    arrayList = new ArrayList();
                                    while (maVar.a < ((List) maVar.e).size()) {
                                        ecVar = (ec) maVar.b;
                                        if (maVar.a < ((List) maVar.e).size()) {
                                            throw new SocketException("No route to " + ecVar.h.d + "; exhausted proxy configurations: " + ((List) maVar.e));
                                        }
                                        List list = (List) maVar.e;
                                        int i5 = maVar.a;
                                        maVar.a = i5 + 1;
                                        proxy = (Proxy) list.get(i5);
                                        ArrayList arrayList3 = new ArrayList();
                                        maVar.f = arrayList3;
                                        if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            k28 k28Var3 = ecVar.h;
                                            hostName = k28Var3.d;
                                            port = k28Var3.e;
                                        } else {
                                            SocketAddress socketAddressAddress = proxy.address();
                                            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                                                ore.e(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                                                return null;
                                            }
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                                            InetAddress address = inetSocketAddress.getAddress();
                                            hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 <= port || port >= 65536) {
                                            throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList3.add(InetSocketAddress.createUnresolved(hostName, port));
                                        } else {
                                            if (uqi.f.b(hostName)) {
                                                listSingletonList = Collections.singletonList(InetAddress.getByName(hostName));
                                            } else {
                                                ecVar.a.getClass();
                                                try {
                                                    List listN1 = a.n1(InetAddress.getAllByName(hostName));
                                                    if (listN1.isEmpty()) {
                                                        throw new UnknownHostException(ecVar.a + " returned no addresses for " + hostName);
                                                    }
                                                    listSingletonList = listN1;
                                                } catch (NullPointerException e) {
                                                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
                                                    unknownHostException.initCause(e);
                                                    throw unknownHostException;
                                                }
                                            }
                                            Iterator it = listSingletonList.iterator();
                                            while (it.hasNext()) {
                                                arrayList3.add(new InetSocketAddress((InetAddress) it.next(), port));
                                            }
                                        }
                                        Iterator it2 = ((List) maVar.f).iterator();
                                        while (it2.hasNext()) {
                                            fve fveVar2 = new fve((ec) maVar.b, proxy, (InetSocketAddress) it2.next());
                                            w4 w4Var2 = (w4) maVar.d;
                                            synchronized (w4Var2) {
                                                zContains = ((LinkedHashSet) w4Var2.a).contains(fveVar2);
                                            }
                                            if (zContains) {
                                                ((ArrayList) maVar.c).add(fveVar2);
                                            } else {
                                                arrayList.add(fveVar2);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            break;
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        cx3.Z0((ArrayList) maVar.c, arrayList);
                                        ((ArrayList) maVar.c).clear();
                                    }
                                    qf4Var2 = new qf4(arrayList);
                                    this.e = qf4Var2;
                                    if (!this.c.p) {
                                        qr7.k("Canceled");
                                        return null;
                                    }
                                    if (this.a.a(this.b, this.c, arrayList, false)) {
                                        c9eVar2 = this.c.j;
                                    } else {
                                        if (qf4Var2.l()) {
                                            qr7.d();
                                            return null;
                                        }
                                        int i6 = qf4Var2.b;
                                        qf4Var2.b = i6 + 1;
                                        fveVar = (fve) arrayList.get(i6);
                                        c9eVar = new c9e(fveVar);
                                        this.c.r = c9eVar;
                                        c9eVar.c(i, i2, i3, z, this.c, this.d);
                                        this.c.r = null;
                                        w4Var = this.c.a.z;
                                        synchronized (w4Var) {
                                            ((LinkedHashSet) w4Var.a).remove(fveVar);
                                        }
                                        if (this.a.a(this.b, this.c, arrayList, true)) {
                                            c9e c9eVar3 = this.c.j;
                                            this.j = fveVar;
                                            uqi.e(c9eVar.d);
                                            c9eVar2 = c9eVar3;
                                        } else {
                                            synchronized (c9eVar) {
                                                e9e e9eVar = this.a;
                                                e9eVar.getClass();
                                                byte[] bArr = uqi.a;
                                                e9eVar.d.add(c9eVar);
                                                e9eVar.b.c(e9eVar.c, 0L);
                                                this.c.b(c9eVar);
                                            }
                                            c9eVar2 = c9eVar;
                                        }
                                    }
                                }
                            }
                            c9eVar.c(i, i2, i3, z, this.c, this.d);
                            this.c.r = null;
                            w4Var = this.c.a.z;
                            synchronized (w4Var) {
                                ((LinkedHashSet) w4Var.a).remove(fveVar);
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    c9e c9eVar4 = this.c.j;
                                    this.j = fveVar;
                                    uqi.e(c9eVar.d);
                                    c9eVar2 = c9eVar4;
                                } else {
                                    synchronized (c9eVar) {
                                        e9e e9eVar2 = this.a;
                                        e9eVar2.getClass();
                                        byte[] bArr2 = uqi.a;
                                        e9eVar2.d.add(c9eVar);
                                        e9eVar2.b.c(e9eVar2.c, 0L);
                                        this.c.b(c9eVar);
                                        c9eVar2 = c9eVar;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            this.c.r = null;
                            throw th2;
                        }
                        arrayList = null;
                        c9eVar = new c9e(fveVar);
                        this.c.r = c9eVar;
                    }
                } else if (socketK != null) {
                    ore.k("Check failed.");
                    return null;
                }
            } else {
                this.g = 0;
                this.h = 0;
                this.i = 0;
                if (this.a.a(this.b, this.c, null, false)) {
                    c9eVar2 = this.c.j;
                } else {
                    fveVar = this.j;
                    if (fveVar != null) {
                        this.j = null;
                    } else {
                        qf4Var = this.e;
                        if (qf4Var == null) {
                        }
                        maVar = this.f;
                        if (maVar == null) {
                            ec ecVar3 = this.b;
                            y8e y8eVar2 = this.c;
                            maVar = new ma(ecVar3, y8eVar2.a.z, y8eVar2, this.d);
                            this.f = maVar;
                        }
                        if (maVar.r()) {
                            qr7.d();
                            return null;
                        }
                        arrayList = new ArrayList();
                        while (maVar.a < ((List) maVar.e).size()) {
                            ecVar = (ec) maVar.b;
                            if (maVar.a < ((List) maVar.e).size()) {
                                throw new SocketException("No route to " + ecVar.h.d + "; exhausted proxy configurations: " + ((List) maVar.e));
                            }
                            List list2 = (List) maVar.e;
                            int i7 = maVar.a;
                            maVar.a = i7 + 1;
                            proxy = (Proxy) list2.get(i7);
                            ArrayList arrayList4 = new ArrayList();
                            maVar.f = arrayList4;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                k28 k28Var4 = ecVar.h;
                                hostName = k28Var4.d;
                                port = k28Var4.e;
                            } else {
                                k28 k28Var5 = ecVar.h;
                                hostName = k28Var5.d;
                                port = k28Var5.e;
                            }
                            if (1 <= port) {
                            }
                            throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                        }
                        if (arrayList.isEmpty()) {
                            cx3.Z0((ArrayList) maVar.c, arrayList);
                            ((ArrayList) maVar.c).clear();
                        }
                        qf4Var2 = new qf4(arrayList);
                        this.e = qf4Var2;
                        if (!this.c.p) {
                            qr7.k("Canceled");
                            return null;
                        }
                        if (this.a.a(this.b, this.c, arrayList, false)) {
                            c9eVar2 = this.c.j;
                        } else {
                            if (qf4Var2.l()) {
                                qr7.d();
                                return null;
                            }
                            int i8 = qf4Var2.b;
                            qf4Var2.b = i8 + 1;
                            fveVar = (fve) arrayList.get(i8);
                            c9eVar = new c9e(fveVar);
                            this.c.r = c9eVar;
                            c9eVar.c(i, i2, i3, z, this.c, this.d);
                            this.c.r = null;
                            w4Var = this.c.a.z;
                            synchronized (w4Var) {
                                ((LinkedHashSet) w4Var.a).remove(fveVar);
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    c9e c9eVar5 = this.c.j;
                                    this.j = fveVar;
                                    uqi.e(c9eVar.d);
                                    c9eVar2 = c9eVar5;
                                } else {
                                    synchronized (c9eVar) {
                                        e9e e9eVar3 = this.a;
                                        e9eVar3.getClass();
                                        byte[] bArr3 = uqi.a;
                                        e9eVar3.d.add(c9eVar);
                                        e9eVar3.b.c(e9eVar3.c, 0L);
                                        this.c.b(c9eVar);
                                        c9eVar2 = c9eVar;
                                    }
                                }
                            }
                        }
                    }
                    arrayList = null;
                    c9eVar = new c9e(fveVar);
                    this.c.r = c9eVar;
                    c9eVar.c(i, i2, i3, z, this.c, this.d);
                    this.c.r = null;
                    w4Var = this.c.a.z;
                    synchronized (w4Var) {
                        ((LinkedHashSet) w4Var.a).remove(fveVar);
                        if (this.a.a(this.b, this.c, arrayList, true)) {
                            c9e c9eVar6 = this.c.j;
                            this.j = fveVar;
                            uqi.e(c9eVar.d);
                            c9eVar2 = c9eVar6;
                        } else {
                            synchronized (c9eVar) {
                                e9e e9eVar4 = this.a;
                                e9eVar4.getClass();
                                byte[] bArr4 = uqi.a;
                                e9eVar4.d.add(c9eVar);
                                e9eVar4.b.c(e9eVar4.c, 0L);
                                this.c.b(c9eVar);
                                c9eVar2 = c9eVar;
                            }
                        }
                    }
                }
            }
            if (c9eVar2.i(z2)) {
                return c9eVar2;
            }
            c9eVar2.k();
            if (this.j == null) {
                qf4 qf4Var4 = this.e;
                if (qf4Var4 != null ? qf4Var4.l() : true) {
                    continue;
                } else {
                    ma maVar2 = this.f;
                    if (!(maVar2 != null ? maVar2.r() : true)) {
                        qr7.k("exhausted all routes");
                        return null;
                    }
                }
            }
        }
        qr7.k("Canceled");
        return null;
    }

    public final void b(IOException iOException) {
        this.j = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).a == 8) {
            this.g++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.h++;
        } else {
            this.i++;
        }
    }
}
