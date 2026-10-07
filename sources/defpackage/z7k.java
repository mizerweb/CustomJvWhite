package defpackage;

import java.io.IOException;
import java.net.ConnectException;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import one.video.calls.sdk_private.bJ;

/* JADX INFO: loaded from: classes3.dex */
public final class z7k implements obk {
    public final InetAddress A;
    public final hak B;
    public final vbk C;
    public volatile g8k D;
    public final zak E;
    public volatile c8k F;
    public final b6k G;
    public final e8k H;
    public final long I;
    public final w8k J;
    public volatile byte[] K;
    public final CountDownLatch L;
    public volatile c8k M;
    public final String N;
    public final List O;
    public boolean P;
    public final ArrayList Q;
    public final eth R;
    public volatile Thread S;
    public volatile String T;
    public volatile o5k U;
    public volatile boolean V;
    public volatile int W;
    public final f8k a;
    public final int b;
    public final ku8 c;
    public final b5k e;
    public volatile w4k i;
    public y8k j;
    public eck m;
    public volatile mak o;
    public volatile int p;
    public final jbk q;
    public volatile f5k r;
    public final ScheduledExecutorService s;
    public final ExecutorService t;
    public final String v;
    public final String w;
    public final int x;
    public final i05 y;
    public final DatagramSocket z;
    public int d = 1;
    public volatile int f = 1;
    public final Object g = new Object();
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public volatile int n = 3;
    public volatile int u = 1;

    public z7k(final String str, String str2, int i, long j, w8k w8kVar, e8k e8kVar, ku8 ku8Var, ArrayList arrayList, w5k w5kVar) throws UnknownHostException {
        final int i2 = 1;
        final int i3 = 3;
        f8k f8kVar = new f8k(e8kVar);
        this.a = f8kVar;
        this.b = 1;
        this.c = ku8Var;
        final int i4 = 2;
        new b8k(new h8k(new b8k(this, new b8k(this, this, this.c), 2)));
        this.e = new b5k(f8kVar, ku8Var);
        this.p = 1;
        jbk jbkVar = new jbk();
        jbkVar.a = 1;
        final int i5 = 0;
        jbkVar.b = 0;
        this.q = jbkVar;
        this.s = Executors.newScheduledThreadPool(1, new aid("scheduler", 1));
        this.t = Executors.newSingleThreadExecutor(new aid("callback-executor", 1));
        this.i = w4k.a;
        this.L = new CountDownLatch(1);
        this.O = Collections.synchronizedList(new ArrayList());
        this.W = 1;
        this.V = false;
        this.N = "h3";
        this.I = j;
        this.J = w8kVar;
        e8kVar.toString();
        this.H = e8kVar;
        this.v = str;
        this.w = str2;
        this.x = i;
        InetAddress inetAddress = null;
        if (str != null) {
            int length = str.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    int i6 = ibk.a[qt4.D(3)];
                    if (i6 == 1) {
                        inetAddress = (InetAddress) Stream.of((Object[]) allByName).filter(new lak(2)).findFirst().orElseThrow(new Supplier() { // from class: gbk
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                int i7 = i5;
                                String str3 = str;
                                switch (i7) {
                                    case 0:
                                        return new UnknownHostException("No IPv4 address found for ".concat(str3));
                                    case 1:
                                        return new UnknownHostException("No IPv6 address found for ".concat(str3));
                                    case 2:
                                        return new UnknownHostException("No address found for ".concat(str3));
                                    default:
                                        return new UnknownHostException("No address found for ".concat(str3));
                                }
                            }
                        });
                    } else if (i6 == 2) {
                        inetAddress = (InetAddress) Stream.of((Object[]) allByName).filter(new lak(3)).findFirst().orElseThrow(new Supplier() { // from class: gbk
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                int i7 = i2;
                                String str3 = str;
                                switch (i7) {
                                    case 0:
                                        return new UnknownHostException("No IPv4 address found for ".concat(str3));
                                    case 1:
                                        return new UnknownHostException("No IPv6 address found for ".concat(str3));
                                    case 2:
                                        return new UnknownHostException("No address found for ".concat(str3));
                                    default:
                                        return new UnknownHostException("No address found for ".concat(str3));
                                }
                            }
                        });
                    } else if (i6 == 3) {
                        inetAddress = (InetAddress) Stream.of((Object[]) allByName).sorted(new hbk(0)).findFirst().orElseThrow(new Supplier() { // from class: gbk
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                int i7 = i4;
                                String str3 = str;
                                switch (i7) {
                                    case 0:
                                        return new UnknownHostException("No IPv4 address found for ".concat(str3));
                                    case 1:
                                        return new UnknownHostException("No IPv6 address found for ".concat(str3));
                                    case 2:
                                        return new UnknownHostException("No address found for ".concat(str3));
                                    default:
                                        return new UnknownHostException("No address found for ".concat(str3));
                                }
                            }
                        });
                    } else if (i6 == 4) {
                        inetAddress = (InetAddress) Stream.of((Object[]) allByName).sorted(new hbk(1)).findFirst().orElseThrow(new Supplier() { // from class: gbk
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                int i7 = i3;
                                String str3 = str;
                                switch (i7) {
                                    case 0:
                                        return new UnknownHostException("No IPv4 address found for ".concat(str3));
                                    case 1:
                                        return new UnknownHostException("No IPv6 address found for ".concat(str3));
                                    case 2:
                                        return new UnknownHostException("No address found for ".concat(str3));
                                    default:
                                        return new UnknownHostException("No address found for ".concat(str3));
                                }
                            }
                        });
                    }
                    this.A = inetAddress;
                    boolean z = inetAddress instanceof Inet4Address;
                    this.Q = arrayList;
                    DatagramSocket datagramSocketCreateSocket = (w5kVar != null ? w5kVar : new dzh(15)).createSocket();
                    this.z = datagramSocketCreateSocket;
                    this.j = new y8k(this);
                    hak hakVar = new hak(this.a, z ? 1252 : 1232, datagramSocketCreateSocket, new InetSocketAddress(inetAddress, i), this, ku8Var);
                    this.B = hakVar;
                    hakVar.i.c = w4k.values();
                    this.j.f = new w2e(2, hakVar);
                    this.R = hakVar.j;
                    this.C = new vbk(datagramSocketCreateSocket, ku8Var, new w7k(this, 3), new u6(25, this));
                    this.E = new zak(this, ku8Var, w8kVar, this.t);
                    this.G = new b6k(hakVar, new ma4(5, this), ku8Var);
                    this.p = 1;
                    oki okiVar = new oki();
                    okiVar.a = this;
                    this.y = new i05(okiVar, this);
                    return;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        ore.p("hostname must be set");
        throw null;
    }

    public final d5k a(w4k w4kVar) {
        ArrayList arrayList;
        w4k w4kVar2;
        while (true) {
            arrayList = this.l;
            if (arrayList.size() > w4kVar.ordinal()) {
                break;
            }
            arrayList.add(null);
        }
        if (arrayList.get(w4kVar.ordinal()) == null) {
            w4kVar2 = w4kVar;
            arrayList.set(w4kVar.ordinal(), new d5k(this.a, w4kVar2, this.b, this.y, this.c, this.B));
        } else {
            w4kVar2 = w4kVar;
        }
        return (d5k) arrayList.get(w4kVar2.ordinal());
    }

    public final pak b(boolean z) throws IOException {
        if (this.p != 3) {
            qr7.k("not connected");
            return null;
        }
        zak zakVar = this.E;
        zakVar.getClass();
        try {
            return zakVar.b(z, 10000L, TimeUnit.DAYS, new atj(7, zakVar));
        } catch (TimeoutException unused) {
            hs4.b();
            return null;
        }
    }

    @Override // defpackage.obk
    public final void c(pbk pbkVar, c4h c4hVar) {
        if (pbkVar.d(this, c4hVar) == 2) {
            return;
        }
        eth ethVar = this.R;
        if (pbkVar.r()) {
            ((l5b[]) ethVar.a)[pbkVar.o().ordinal()].c(pbkVar);
        }
        y8k y8kVar = this.j;
        if (y8kVar.h) {
            y8kVar.g = y8kVar.a.instant();
            y8kVar.i = 1;
        }
    }

    public final void d(long j, long j2) {
        long jMin = Long.min(j, j2);
        if (jMin == 0) {
            jMin = Long.max(j, j2);
        }
        if (jMin != 0) {
            y8k y8kVar = this.j;
            y8kVar.d = jMin;
            if (y8kVar.h) {
                y8kVar.j.cancel(true);
            } else {
                y8kVar.h = true;
            }
            ScheduledExecutorService scheduledExecutorService = y8kVar.b;
            myj myjVar = new myj(1, y8kVar);
            long j3 = y8kVar.c;
            y8kVar.j = scheduledExecutorService.scheduleAtFixedRate(myjVar, j3, j3, TimeUnit.MILLISECONDS);
        }
    }

    public final void e(long j, String str, int i) {
        if (this.p == 4 || this.p == 5) {
            return;
        }
        f(new v5k(2, false, i == 1 ? Long.valueOf(j) : null, i == 2 ? Long.valueOf(j) : null));
        this.B.g();
        m(j, str, i);
        this.p = 4;
        this.E.f();
        if (this.i != w4k.a) {
            try {
                this.s.schedule(new x7k(this, 2), this.B.i() * 3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException unused) {
            }
        } else {
            this.k.add(new x7k(this, 3));
        }
        this.c.getClass();
        Instant.now();
    }

    public final void f(v5k v5kVar) {
        String string;
        StringBuilder sb;
        gfk gfkVar;
        Long l = v5kVar.b;
        Long l2 = v5kVar.a;
        if (l2 != null || l != null) {
            if (l2 != null) {
                int i = 0;
                if (l2.longValue() < 256 || l2.longValue() > 511) {
                    for (int i2 : qt4.H(19)) {
                        if (ewi.c(i2) == l2.longValue()) {
                            i = i2;
                            break;
                        }
                    }
                    string = "Transport error: ".concat(ewi.s(i));
                } else {
                    int iLongValue = (int) (l2.longValue() - 256);
                    gfk[] gfkVarArrValues = gfk.values();
                    int length = gfkVarArrValues.length;
                    while (true) {
                        if (i >= length) {
                            gfkVar = null;
                            break;
                        }
                        gfkVar = gfkVarArrValues[i];
                        if (gfkVar.a == iLongValue) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    sb = new StringBuilder("Transport error: CRYPTO_ERROR (");
                    sb.append(gfkVar);
                    sb.append(")");
                    string = sb.toString();
                }
            } else if (l != null) {
                sb = new StringBuilder("Application error: ");
                sb.append(l);
                string = sb.toString();
            } else {
                string = "No error";
            }
            " with error ".concat(string);
        }
        toString();
    }

    public final void g(c8k c8kVar) throws bJ {
        if (c8kVar.p < 1200) {
            throw new bJ(9);
        }
        if (c8kVar.i > 20) {
            throw new bJ(9);
        }
        if (c8kVar.l >= 16384) {
            throw new bJ(9);
        }
        if (c8kVar.m < 2) {
            throw new bJ(9);
        }
        byte[] bArr = c8kVar.q;
        if (bArr != null && bArr.length != 16) {
            throw new bJ(9, "Invalid stateless reset token length");
        }
        if (c8kVar.k != null) {
            s4k s4kVar = this.G.e;
            if ((s4kVar != null ? s4kVar.b : new byte[0]).length == 0) {
                throw new bJ(9, "Unexpected preferred address parameter for server using zero-length connection ID");
            }
            if (((byte[]) c8kVar.k.d).length == 0) {
                throw new bJ(9, "Preferred address with zero-length connection ID");
            }
        }
    }

    public final void h(o8k o8kVar, Consumer consumer, boolean z) {
        w4k w4kVar = w4k.d;
        hak hakVar = this.B;
        hakVar.d(o8kVar, w4kVar, consumer);
        if (z) {
            hakVar.h();
        }
    }

    public final void i(pbk pbkVar, c4h c4hVar) {
        Iterator it = pbkVar.c.iterator();
        while (it.hasNext()) {
            ((o8k) it.next()).b(this, pbkVar, c4hVar);
        }
    }

    public final void j(Throwable th) {
        if (this.p == 2) {
            this.T = th.toString();
        }
        this.p = 8;
        this.L.countDown();
        this.B.g();
        p();
        this.E.f();
    }

    public final void k(Function function, int i, w4k w4kVar, Consumer consumer, boolean z) {
        hak hakVar = this.B;
        hakVar.f(function, i, w4kVar, consumer);
        if (z) {
            hakVar.h();
        }
    }

    public final void l() {
        t81 t81Var = new t81(3);
        ArrayList arrayList = this.k;
        arrayList.forEach(t81Var);
        arrayList.clear();
    }

    public final void m(long j, String str, int i) {
        w4k w4kVar = w4k.a;
        w4k w4kVar2 = w4k.d;
        if (i == 2 && this.i != w4kVar2) {
            m(12L, "", 1);
            return;
        }
        e8k e8kVar = this.a.a;
        int iCharCount = 0;
        boolean z = i == 1;
        f5k f5kVar = new f5k();
        f5kVar.c = new byte[0];
        f5kVar.d = -1;
        f5kVar.e = z ? 28 : 29;
        f5kVar.a = j;
        if (j >= 256 && j < 512) {
            f5kVar.d = (int) (j - 256);
        }
        if (str != null) {
            int length = str.length();
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    f5kVar.c = str.getBytes(StandardCharsets.UTF_8);
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        int i2 = a8k.a[this.i.ordinal()];
        if (i2 == 1) {
            this.B.c(f5kVar, w4kVar);
        } else if (i2 == 2) {
            this.B.c(f5kVar, w4kVar);
            this.B.c(f5kVar, w4k.c);
        } else if (i2 == 3) {
            this.B.c(f5kVar, w4kVar2);
        }
        this.r = f5kVar;
    }

    public final void n(c8k c8kVar) {
        zak zakVar = this.E;
        long j = c8kVar.g;
        if (zakVar.j == null || j >= zakVar.j.longValue()) {
            zakVar.j = Long.valueOf(j);
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            zakVar.l.release((int) j);
        }
        zak zakVar2 = this.E;
        long j2 = c8kVar.h;
        if (zakVar2.k == null || j2 >= zakVar2.k.longValue()) {
            zakVar2.k = Long.valueOf(j2);
            zakVar2.m.release((int) (j2 <= 2147483647L ? j2 : 2147483647L));
        }
        this.n = c8kVar.i;
        hak hakVar = this.B;
        int i = c8kVar.l;
        hakVar.t = i;
        hakVar.g.f = i;
        eck eckVar = hakVar.k;
        synchronized (eckVar) {
            eckVar.j = i;
        }
        hak hakVar2 = this.B;
        int i2 = c8kVar.p;
        if (i2 < hakVar2.b) {
            hakVar2.b = i2;
        }
        long j3 = c8kVar.s;
        int i3 = this.u;
        if (j3 <= 0) {
            if (i3 == 2) {
                this.u = 4;
            }
        } else if (i3 == 2) {
            this.u = 3;
            Long.min(65535L, c8kVar.s);
        }
    }

    public final void o() {
        String str;
        synchronized (this) {
            try {
                if (this.p != 1) {
                    switch (this.p) {
                        case 1:
                            str = "Created";
                            break;
                        case 2:
                            str = "Handshaking";
                            break;
                        case 3:
                            str = "Connected";
                            break;
                        case 4:
                            str = "Closing";
                            break;
                        case 5:
                            str = "Draining";
                            break;
                        case 6:
                            str = "Closed";
                            break;
                        case 7:
                            str = "Failed";
                            break;
                        case 8:
                            str = "Error";
                            break;
                        default:
                            str = "null";
                            break;
                    }
                    throw new IllegalStateException("Cannot connect a connection that is in state ".concat(str));
                }
                this.E.d(this.J);
                c8k c8kVar = new c8k();
                w8k w8kVar = this.J;
                int i = w8kVar.a;
                if (i <= 0) {
                    throw new IllegalArgumentException("maxIdleTimeout must be set");
                }
                c8kVar.b = i;
                long j = w8kVar.d;
                if (j <= 0) {
                    throw new IllegalArgumentException("maxConnectionBufferSize must be set");
                }
                c8kVar.c = j;
                long j2 = w8kVar.e;
                if (j2 <= 0) {
                    throw new IllegalArgumentException("maxBidirectionalStreamBufferSize must be set");
                }
                c8kVar.f = j2;
                long j3 = w8kVar.f;
                if (j3 <= 0) {
                    throw new IllegalArgumentException("maxBidirectionalStreamBufferSize must be set");
                }
                c8kVar.d = j3;
                c8kVar.e = j3;
                int i2 = w8kVar.c;
                if (i2 < 0) {
                    throw new IllegalArgumentException("maxOpenBidirectionalStreams must be set");
                }
                c8kVar.g = i2;
                int i3 = w8kVar.b;
                if (i3 < 0) {
                    throw new IllegalArgumentException("maxOpenUnidirectionalStreams must be set");
                }
                c8kVar.h = i3;
                int i4 = w8kVar.g;
                if (i4 < 2) {
                    throw new IllegalArgumentException("activeConnectionIdLimit must be set");
                }
                c8kVar.m = i4;
                int i5 = w8kVar.h;
                if (i5 < 1200) {
                    throw new IllegalArgumentException("maxUdpPayloadSize must be set");
                }
                c8kVar.p = i5;
                if (this.u == 2) {
                    c8kVar.s = 65535L;
                }
                this.J.getClass();
                this.F = c8kVar;
                c8k c8kVar2 = this.F;
                b6k b6kVar = this.G;
                c8kVar2.n = b6kVar.f;
                List list = Collections.EMPTY_LIST;
                nl9.a(b6kVar.g);
                nl9.a(this.G.f);
                b5k b5kVar = this.e;
                s4k s4kVar = this.G.e;
                b5kVar.d(s4kVar != null ? s4kVar.b : new byte[0]);
                this.C.d.start();
                hak hakVar = this.B;
                hakVar.o = this.e;
                hakVar.m.start();
                this.S = new Thread(new x7k(this, 1), "receiver-loop");
                this.S.setDaemon(true);
                this.S.start();
                String str2 = this.N;
                boolean zIsEmpty = list.isEmpty();
                i05 i05Var = this.y;
                String str3 = this.w;
                if (str3 == null) {
                    str3 = this.v;
                }
                i05Var.g = str3;
                i05Var.h.addAll(this.Q);
                if (this.a.a.b()) {
                    c8k c8kVar3 = this.F;
                    e8k e8kVar = e8k.c;
                    Object[] objArr = {e8kVar, e8k.b};
                    ArrayList arrayList = new ArrayList(2);
                    for (int i6 = 0; i6 < 2; i6++) {
                        Object obj = objArr[i6];
                        Objects.requireNonNull(obj);
                        arrayList.add(obj);
                    }
                    c8kVar3.r = new h6f(e8kVar, 12, Collections.unmodifiableList(arrayList));
                }
                this.y.k.add(new fbk(this.a.a, this.F));
                this.y.k.add(new do8(str2));
                if (!zIsEmpty) {
                    this.y.k.add(new pj9());
                }
                try {
                    Object[] objArr2 = {mfk.rsa_pss_rsae_sha256, mfk.rsa_pss_rsae_sha384, mfk.rsa_pss_rsae_sha512, mfk.ecdsa_secp256r1_sha256, mfk.ecdsa_secp384r1_sha384, mfk.ecdsa_secp521r1_sha512};
                    ArrayList arrayList2 = new ArrayList(6);
                    for (int i7 = 0; i7 < 6; i7++) {
                        Object obj2 = objArr2[i7];
                        Objects.requireNonNull(obj2);
                        arrayList2.add(obj2);
                    }
                    this.y.j(kfk.secp256r1, Collections.unmodifiableList(arrayList2));
                } catch (IOException unused) {
                }
                if (!list.isEmpty()) {
                    throw null;
                }
                List<pak> list2 = Collections.EMPTY_LIST;
                try {
                    if (!this.L.await(this.I, TimeUnit.MILLISECONDS)) {
                        this.p = 7;
                        this.B.g();
                        p();
                        throw new ConnectException("Connection timed out after " + this.I + " ms");
                    }
                    if (this.p != 3) {
                        this.p = 7;
                        this.B.g();
                        p();
                        throw new ConnectException("Handshake error: " + (this.T != null ? this.T : ""));
                    }
                    if (!list.isEmpty()) {
                        for (pak pakVar : list2) {
                            if (pakVar != null) {
                                ((jak) pakVar).g(this.W == 3);
                            }
                        }
                    }
                } catch (InterruptedException unused2) {
                    this.p = 7;
                    this.B.g();
                    p();
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p() {
        y8k y8kVar = this.j;
        if (y8kVar.h) {
            y8kVar.b.shutdown();
        }
        hak hakVar = this.B;
        hakVar.getClass();
        hakVar.s = true;
        hakVar.m.interrupt();
        this.p = 6;
        this.s.shutdown();
        this.L.countDown();
        vbk vbkVar = this.C;
        vbkVar.f = true;
        vbkVar.d.interrupt();
        this.z.close();
        if (this.S != null) {
            this.S.interrupt();
        }
    }

    public final String toString() {
        char c;
        String str;
        String strA = nl9.a(this.G.g);
        String strA2 = nl9.a(this.G.f);
        int i = this.a.a.a;
        if (i == 1) {
            c = 1;
        } else {
            c = i == 1798521807 ? (char) 2 : (char) 0;
        }
        InetSocketAddress inetSocketAddress = new InetSocketAddress(this.A, this.x);
        StringBuilder sbQ = qv1.q("ClientConnection[", strA, "/", strA2, "(");
        if (c != 1) {
            str = c != 2 ? "null" : "V2";
        } else {
            str = "V1";
        }
        sbQ.append(str);
        sbQ.append(") with ");
        sbQ.append(inetSocketAddress);
        sbQ.append("]");
        return sbQ.toString();
    }
}
