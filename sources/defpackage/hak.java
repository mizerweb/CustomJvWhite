package defpackage;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import one.video.calls.sdk_private.aP;

/* JADX INFO: loaded from: classes3.dex */
public final class hak {
    public static final t81 y = new t81(4);
    public final Clock a;
    public volatile int b;
    public volatile DatagramSocket c;
    public final InetSocketAddress d;
    public final z7k e;
    public final y5k f;
    public final fck g;
    public final fak[] h;
    public final i46 i;
    public final eth j;
    public final eck k;
    public final y8k l;
    public final Thread m;
    public final boolean[] n;
    public b5k o;
    public final Object p;
    public boolean q;
    public volatile boolean r;
    public volatile boolean s;
    public volatile int t;
    public volatile long u;
    public final AtomicInteger v;
    public volatile boolean w;
    public volatile int x;

    public hak(final f8k f8kVar, int i, DatagramSocket datagramSocket, InetSocketAddress inetSocketAddress, z7k z7kVar, ku8 ku8Var) {
        Clock clockSystemUTC = Clock.systemUTC();
        fak[] fakVarArr = new fak[w4k.values().length];
        this.h = fakVarArr;
        this.n = new boolean[y4k.values().length];
        this.p = new Object();
        this.v = new AtomicInteger();
        this.w = false;
        this.x = -1;
        this.a = clockSystemUTC;
        this.b = i;
        this.c = datagramSocket;
        this.d = inetSocketAddress;
        this.e = z7kVar;
        Arrays.stream(w4k.values()).forEach(new y81(this, 5, clockSystemUTC));
        final eth ethVar = new eth();
        ethVar.a = new l5b[y4k.values().length];
        Arrays.stream(y4k.values()).forEach(new y81(ethVar, 4, this));
        this.j = ethVar;
        final i46 i46Var = new i46();
        i46Var.b = new qck[w4k.values().length];
        i46Var.a = fakVarArr;
        final s8 s8Var = new s8();
        Arrays.stream(w4k.values()).forEach(new Consumer() { // from class: jck
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                l5b nckVar;
                i46 i46Var2 = i46Var;
                eth ethVar2 = ethVar;
                f8k f8kVar2 = f8kVar;
                s8 s8Var2 = s8Var;
                w4k w4kVar = (w4k) obj;
                int iOrdinal = w4kVar.ordinal();
                if (w4kVar != w4k.b) {
                    nckVar = ((l5b[]) ethVar2.a)[w4kVar.a().ordinal()];
                } else {
                    nckVar = new nck(null, null);
                }
                l5b l5bVar = nckVar;
                int i2 = lck.a[w4kVar.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    ((qck[]) i46Var2.b)[iOrdinal] = new qck(f8kVar2, w4kVar, ((fak[]) i46Var2.a)[iOrdinal], l5bVar, s8Var2);
                    return;
                }
                qck[] qckVarArr = (qck[]) i46Var2.b;
                fak[] fakVarArr2 = (fak[]) i46Var2.a;
                if (i2 != 3) {
                    qckVarArr[iOrdinal] = new qck(f8kVar2, w4kVar, fakVarArr2[iOrdinal], l5bVar);
                } else {
                    qckVarArr[iOrdinal] = new mck(f8kVar2, w4k.a, fakVarArr2[iOrdinal], l5bVar);
                }
            }
        });
        i46Var.c = new w4k[]{w4k.a, w4k.b, w4k.c};
        this.i = i46Var;
        y5k y5kVar = new y5k(ku8Var, this);
        this.f = y5kVar;
        fck fckVar = new fck();
        fckVar.b = Integer.MAX_VALUE;
        fckVar.c = -1;
        fckVar.d = -1;
        fckVar.a = 500;
        fckVar.f = 25;
        this.g = fckVar;
        eck eckVar = new eck(z7kVar.b, fckVar, y5kVar, this, ku8Var);
        this.k = eckVar;
        z7kVar.h.add(eckVar);
        z7kVar.m = eckVar;
        this.l = z7kVar.j;
        Thread thread = new Thread(new gak(this, 0), "sender".concat(""));
        this.m = thread;
        thread.setDaemon(true);
    }

    public final void a(y4k y4kVar) {
        synchronized (this.n) {
            try {
                if (!this.n[y4kVar.ordinal()]) {
                    i46 i46Var = this.i;
                    qck qckVar = ((qck[]) i46Var.b)[y4kVar.a().ordinal()];
                    qckVar.g = new y81(i46Var, 7, y4kVar);
                    qckVar.c.d(false);
                    qckVar.f = true;
                    eck eckVar = this.k;
                    if (!eckVar.p) {
                        eckVar.e[y4kVar.ordinal()].a();
                        eckVar.m = 0;
                        eckVar.g();
                    }
                    y4kVar.toString();
                    ((l5b[]) this.j.a)[y4kVar.ordinal()] = new nck(null, null);
                    this.n[y4kVar.ordinal()] = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(y4k y4kVar, int i) {
        fak fakVar = this.h[y4kVar.a().ordinal()];
        Instant instantPlusMillis = fakVar.a.instant().plusMillis(i);
        synchronized (fakVar.e) {
            try {
                Instant instant = fakVar.f;
                if (instant == null || instantPlusMillis.isBefore(instant)) {
                    fakVar.f = instantPlusMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(f5k f5kVar, w4k w4kVar) {
        this.h[w4kVar.ordinal()].c(f5kVar, new t81(4));
    }

    public final void d(o8k o8kVar, w4k w4kVar, Consumer consumer) {
        this.h[w4kVar.ordinal()].c(o8kVar, consumer);
    }

    public final void e(List list, w4k w4kVar) {
        synchronized (this.n) {
            try {
                if (this.n[w4kVar.a().ordinal()]) {
                    Objects.toString(w4kVar.a());
                } else {
                    this.h[w4kVar.ordinal()].d.addLast(list);
                    h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(Function function, int i, w4k w4kVar, Consumer consumer) {
        ConcurrentLinkedDeque concurrentLinkedDeque = this.h[w4kVar.ordinal()].c;
        hck hckVar = new hck();
        hckVar.a = i;
        hckVar.b = function;
        hckVar.c = consumer;
        concurrentLinkedDeque.addLast(hckVar);
    }

    public final void g() {
        Arrays.stream(this.h).forEach(new t81(5));
        eck eckVar = this.k;
        if (eckVar.p) {
            return;
        }
        eckVar.p = true;
        eckVar.k.cancel(true);
        eckVar.n = null;
        eckVar.h.shutdown();
        for (y4k y4kVar : y4k.values()) {
            eckVar.e[y4kVar.ordinal()].a();
        }
    }

    public final void h() {
        synchronized (this.p) {
            this.q = true;
            this.p.notify();
        }
    }

    public final int i() {
        fck fckVar = this.g;
        int i = fckVar.c == -1 ? fckVar.a : fckVar.c;
        fck fckVar2 = this.g;
        return ((fckVar2.d == -1 ? fckVar2.a / 4 : fckVar2.d) * 4) + i + this.t;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:44:0x0108  */
    /* JADX WARN: Code duplicated, block: B:46:0x0116  */
    /* JADX WARN: Code duplicated, block: B:48:0x0124  */
    /* JADX WARN: Code duplicated, block: B:50:0x0142  */
    /* JADX WARN: Code duplicated, block: B:53:0x015d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0165  */
    /* JADX WARN: Code duplicated, block: B:64:0x019d  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c1  */
    public final void j() throws IOException {
        int i;
        final int i2;
        byte[] bArr;
        s4k s4kVar;
        byte[] bArr2;
        i46 i46Var;
        ArrayList arrayList;
        int length;
        int iMin;
        w4k[] w4kVarArr;
        int length2;
        int i3;
        int i4;
        int i5;
        int i6;
        final int i7;
        w4k w4kVar;
        qck qckVar;
        int i8;
        Optional optionalB;
        List list;
        long jMax;
        synchronized (this.p) {
            i = 1;
            i2 = 0;
            try {
                try {
                    if (!this.q) {
                        Optional optionalA = this.i.a();
                        if (optionalA.isPresent()) {
                            jMax = Long.max(Duration.between(this.a.instant(), (Temporal) optionalA.get()).toMillis(), 0L);
                            if (jMax > 0) {
                                this.v.set(0);
                                this.w = false;
                            } else if (!this.w || this.v.incrementAndGet() <= 10003) {
                                this.w = true;
                                jMax = 0;
                            } else {
                                jMax = 8000;
                            }
                        } else {
                            jMax = 5000;
                        }
                        if (jMax > 0) {
                            this.p.wait(jMax);
                        }
                    }
                    this.q = false;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (InterruptedException unused) {
            }
        }
        if (this.s) {
            this.r = false;
        }
        while (true) {
            y5k y5kVar = this.f;
            int i9 = (int) (y5kVar.b - y5kVar.a);
            int iMin2 = this.b;
            if (this.x < 0) {
                bArr = (byte[]) this.e.G.d.a.entrySet().stream().filter(new e05(15)).map(new f05(15)).findFirst().orElse(null);
                s4kVar = this.e.G.e;
                if (s4kVar != null) {
                    bArr2 = s4kVar.b;
                } else {
                    bArr2 = new byte[i2];
                }
                i46Var = this.i;
                i46Var.getClass();
                arrayList = new ArrayList();
                length = bArr2.length + 19;
                iMin = Integer.min(i9, iMin2);
                w4kVarArr = (w4k[]) i46Var.c;
                length2 = w4kVarArr.length;
                i3 = i2;
                i4 = i3;
                i5 = i4;
                i6 = i5;
                while (i3 < length2) {
                    w4kVar = w4kVarArr[i3];
                    qckVar = ((qck[]) i46Var.b)[w4kVar.ordinal()];
                    if (qckVar != null) {
                        i8 = iMin2;
                        optionalB = qckVar.b(bArr, iMin, bArr2, i8 - i4);
                        if (optionalB.isPresent()) {
                            arrayList.add((rck) optionalB.get());
                            int iB = ((rck) optionalB.get()).a.b(0);
                            i4 += iB;
                            iMin -= iB;
                            if (w4kVar == w4k.a) {
                                i5 = 1;
                            }
                            if (((rck) optionalB.get()).a.c.stream().anyMatch(new kck(0))) {
                                i6 = 1;
                            }
                        }
                        if (iMin < length && i8 - i4 < length) {
                            break;
                        }
                    } else {
                        i8 = iMin2;
                    }
                    i3++;
                    iMin2 = i8;
                }
                if (i5 != 0 || i4 >= 1200) {
                    i7 = 1;
                } else {
                    final int i10 = 1200 - i4;
                    i7 = 1;
                    arrayList.stream().map(new lbk(9)).filter(new kck(1)).findFirst().ifPresent(new Consumer() { // from class: ick
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            pbk pbkVar = (pbk) obj;
                            switch (i7) {
                                case 0:
                                    pbkVar.f(new k8k(i10));
                                    break;
                                default:
                                    pbkVar.f(new k8k(i10));
                                    break;
                            }
                        }
                    });
                    i4 += i10;
                }
                if (i6 != 0 || i4 >= 1200) {
                    i2 = 0;
                    list = arrayList;
                } else {
                    final int i11 = 1200 - i4;
                    i2 = 0;
                    arrayList.stream().map(new lbk(10)).findFirst().ifPresent(new Consumer() { // from class: ick
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            pbk pbkVar = (pbk) obj;
                            switch (i2) {
                                case 0:
                                    pbkVar.f(new k8k(i11));
                                    break;
                                default:
                                    pbkVar.f(new k8k(i11));
                                    break;
                            }
                        }
                    });
                    list = arrayList;
                }
            } else if (this.u < this.x) {
                if (((long) this.x) - this.u < iMin2) {
                    String.format("Sending data may be limited by remaining anti-amplification limit of %d bytes", Long.valueOf(((long) this.x) - this.u));
                }
                iMin2 = Integer.min(iMin2, (int) (((long) this.x) - this.u));
                bArr = (byte[]) this.e.G.d.a.entrySet().stream().filter(new e05(15)).map(new f05(15)).findFirst().orElse(null);
                s4kVar = this.e.G.e;
                if (s4kVar != null) {
                    bArr2 = s4kVar.b;
                } else {
                    bArr2 = new byte[i2];
                }
                i46Var = this.i;
                i46Var.getClass();
                arrayList = new ArrayList();
                length = bArr2.length + 19;
                iMin = Integer.min(i9, iMin2);
                w4kVarArr = (w4k[]) i46Var.c;
                length2 = w4kVarArr.length;
                i3 = i2;
                i4 = i3;
                i5 = i4;
                i6 = i5;
                while (i3 < length2) {
                    w4kVar = w4kVarArr[i3];
                    qckVar = ((qck[]) i46Var.b)[w4kVar.ordinal()];
                    if (qckVar != null) {
                        i8 = iMin2;
                        optionalB = qckVar.b(bArr, iMin, bArr2, i8 - i4);
                        if (optionalB.isPresent()) {
                            arrayList.add((rck) optionalB.get());
                            int iB2 = ((rck) optionalB.get()).a.b(0);
                            i4 += iB2;
                            iMin -= iB2;
                            if (w4kVar == w4k.a) {
                                i5 = 1;
                            }
                            if (((rck) optionalB.get()).a.c.stream().anyMatch(new kck(0))) {
                                i6 = 1;
                            }
                        }
                        if (iMin < length) {
                            continue;
                        }
                    } else {
                        i8 = iMin2;
                    }
                    i3++;
                    iMin2 = i8;
                }
                if (i5 != 0) {
                    i7 = 1;
                } else {
                    i7 = 1;
                }
                if (i6 != 0) {
                    i2 = 0;
                    list = arrayList;
                } else {
                    i2 = 0;
                    list = arrayList;
                }
            } else {
                list = Collections.EMPTY_LIST;
                i7 = i;
            }
            if (!list.isEmpty()) {
                byte[] bArr3 = new byte[this.b];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr3);
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        pbk pbkVar = ((rck) it.next()).a;
                        try {
                            byteBufferWrap.put(pbkVar.j(this.o.e(pbkVar.n())));
                            pbkVar.p();
                        } catch (aP e) {
                            if (e.a != 2) {
                                throw new IllegalStateException(e.getMessage());
                            }
                            Objects.toString(pbkVar);
                            it.remove();
                        }
                    }
                    if (byteBufferWrap.position() != 0) {
                        DatagramPacket datagramPacket = new DatagramPacket(bArr3, byteBufferWrap.position(), this.d.getAddress(), this.d.getPort());
                        Instant instant = this.a.instant();
                        this.c.send(datagramPacket);
                        list.size();
                        this.u += (long) byteBufferWrap.position();
                        list.stream().forEach(new y81(this, 6, instant));
                        ((List) list.stream().map(new f05(29)).collect(Collectors.toList())).stream().filter(new e05(27)).mapToInt(new ao8(12)).sum();
                    }
                } catch (BufferOverflowException e2) {
                    Objects.toString(list);
                    throw e2;
                }
            }
            if (list.isEmpty()) {
                return;
            } else {
                i = i7;
            }
        }
    }
}
