package defpackage;

import java.nio.ByteBuffer;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import one.video.calls.sdk_private.bJ;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class e5k extends o8k {
    public static final int g = (int) Math.pow(2.0d, 3.0d);
    public final byte[] a;
    public long b;
    public int c;
    public List d;
    public int e;
    public String f = null;

    public e5k(int i, ArrayList arrayList) {
        this.e = 8;
        Iterator it = arrayList.iterator();
        long j = BuildConfig.MAX_TIME_TO_UPLOAD;
        while (it.hasNext()) {
            q8k q8kVar = (q8k) it.next();
            if (q8kVar.b >= j - 1) {
                ore.p("invalid range");
                throw null;
            }
            j = q8kVar.a;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (Object obj : arrayList) {
            Objects.requireNonNull(obj);
            arrayList2.add(obj);
        }
        this.d = Collections.unmodifiableList(arrayList2);
        int i2 = g;
        this.e = i2;
        this.c = (i * 1000) / i2;
        Iterator it2 = arrayList.iterator();
        q8k q8kVar2 = (q8k) it2.next();
        long j2 = q8kVar2.b;
        long j3 = q8kVar2.a;
        this.b = j2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1000);
        byteBufferAllocate.put((byte) 2);
        ti8.c(this.b, byteBufferAllocate);
        ti8.a(this.c, byteBufferAllocate);
        ti8.a(arrayList.size() - 1, byteBufferAllocate);
        ti8.a(((int) ((q8kVar2.b - j3) + 1)) - 1, byteBufferAllocate);
        while (it2.hasNext()) {
            q8k q8kVar3 = (q8k) it2.next();
            long j4 = q8kVar3.b;
            long j5 = q8kVar3.a;
            ti8.a((int) ((j3 - j4) - 2), byteBufferAllocate);
            ti8.a(((int) ((j4 - j5) + 1)) - 1, byteBufferAllocate);
            j3 = j5;
        }
        byte[] bArr = new byte[byteBufferAllocate.position()];
        this.a = bArr;
        byteBufferAllocate.get(bArr);
    }

    @Override // defpackage.o8k
    public final int a() {
        byte[] bArr = this.a;
        if (bArr != null) {
            return bArr.length;
        }
        ore.k("frame length not known for parsed frames");
        return 0;
    }

    @Override // defpackage.o8k
    public final void b(z7k z7kVar, pbk pbkVar, c4h c4hVar) {
        this.e = (int) Math.pow(2.0d, z7kVar.n);
        ((l5b[]) z7kVar.R.a)[pbkVar.o().ordinal()].a(this);
        eck eckVar = z7kVar.m;
        y4k y4kVarO = pbkVar.o();
        Instant instant = (Instant) c4hVar.b;
        if (eckVar.p) {
            return;
        }
        if (eckVar.m > 0 && !eckVar.j()) {
            eckVar.m = 0;
        }
        ybk ybkVar = eckVar.e[y4kVarO.ordinal()];
        if (!ybkVar.k) {
            ybkVar.h = Long.max(ybkVar.h, this.b);
            List list = (List) this.d.stream().flatMap(new f05(20)).filter(new wbk(ybkVar, 0)).map(new am(27, ybkVar)).filter(new lak(9)).filter(new lak(10)).collect(Collectors.toList());
            ybkVar.g.getAndAdd(((int) list.stream().filter(new lak(11)).count()) * (-1));
            y5k y5kVar = ybkVar.d;
            List list2 = (List) list.stream().filter(new lak(17)).collect(Collectors.toList());
            synchronized (y5kVar) {
                boolean z = y5kVar.b - y5kVar.a <= 3;
                y5kVar.a(list2);
                Stream map = list2.stream().filter(new u6(24, y5kVar)).map(new f05(27));
                if (z) {
                    long j = y5kVar.b;
                    map.forEach(new r5k(1, y5kVar));
                    if (y5kVar.b != j) {
                        char c = y5kVar.b < y5kVar.d ? (char) 1 : (char) 2;
                        if (c != 1 && c != 2) {
                            throw null;
                        }
                    }
                }
            }
            ybkVar.b();
            ybkVar.b.g();
            fck fckVar = ybkVar.c;
            Optional optionalFindFirst = list.stream().filter(new u6(27, this)).findFirst();
            if (optionalFindFirst.isPresent() && list.stream().anyMatch(new lak(28))) {
                Instant instant2 = ((zbk) optionalFindFirst.get()).a;
                int i = (this.c * this.e) / 1000;
                if (instant.isBefore(instant2)) {
                    Objects.toString(instant2);
                    instant.toString();
                } else {
                    if (i > fckVar.f) {
                        i = fckVar.f;
                    }
                    int millis = (int) Duration.between(instant2, instant).toMillis();
                    if (millis < fckVar.b) {
                        fckVar.b = millis;
                    }
                    if (millis >= fckVar.b + i) {
                        millis -= i;
                    }
                    fckVar.e = millis;
                    if (fckVar.c == -1) {
                        fckVar.c = millis;
                        fckVar.d = millis / 2;
                    } else {
                        fckVar.d = (((fckVar.d * 3) + Math.abs(fckVar.c - millis)) + 2) / 4;
                        fckVar.c = (((fckVar.c * 7) + millis) + 4) / 8;
                    }
                }
            }
            list.stream().forEach(new xbk(ybkVar, 0));
        }
        eckVar.f(true);
    }

    @Override // defpackage.o8k
    public final void d(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a);
    }

    public final void i(int i, long j) throws bJ {
        long j2 = (j - ((long) i)) + 1;
        if (j2 < 0) {
            throw new bJ(8, "negative packet number in ACK frame");
        }
        this.d.add(new q8k(j2, j));
    }

    public final void k(ByteBuffer byteBuffer) {
        this.d = new ArrayList();
        byte b = byteBuffer.get();
        this.b = ti8.h(byteBuffer);
        this.c = o8k.e(byteBuffer);
        int iF = ti8.f(byteBuffer);
        long j = this.b;
        int iE = o8k.e(byteBuffer);
        i(iE + 1, this.b);
        long j2 = j - ((long) iE);
        for (int i = 0; i < iF; i++) {
            int iE2 = o8k.e(byteBuffer) + 1;
            int iE3 = o8k.e(byteBuffer) + 1;
            i(iE3, (j2 - ((long) iE2)) - 1);
            j2 -= (long) (iE2 + iE3);
        }
        if (b == 3) {
            ti8.h(byteBuffer);
            ti8.h(byteBuffer);
            ti8.h(byteBuffer);
        }
    }

    public final String toString() {
        if (this.f == null) {
            this.f = (String) this.d.stream().map(new f05(19)).collect(Collectors.joining(","));
        }
        return c0a.l((this.c * this.e) / 1000, "AckFrame[", this.f, "|Δ", "]");
    }
}
