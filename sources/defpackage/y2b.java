package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class y2b {
    public final yr6 a;
    public final ljf b;
    public long h;
    public long i;
    public long k;
    public long l;
    public long m;
    public final int g = 400000;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public boolean j = true;
    public k4e n = k4e.a(0L, 0L);
    public long o = 0;
    public final i1m f = new i1m(18);

    public y2b(yr6 yr6Var, ljf ljfVar) {
        this.a = yr6Var;
        this.b = ljfVar;
    }

    public final void a() throws IOException {
        if (this.j) {
            d();
            return;
        }
        ByteBuffer byteBufferN = v21.n(this.c, this.b, false);
        int iRemaining = byteBufferN.remaining();
        long j = iRemaining + 8;
        if (this.l - this.m < j) {
            e(((Long) this.n.b.h()).longValue() + j, byteBufferN);
            lvb.b0(this.l - this.m >= j);
        }
        long j2 = this.m;
        yr6 yr6Var = this.a;
        yr6Var.b(j2);
        yr6Var.write(byteBufferN);
        long j3 = ((long) iRemaining) + j2;
        long jLongValue = ((Long) this.n.b.h()).longValue() - j3;
        lvb.b0(jLongValue < 2147483647L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt((int) jLongValue);
        String str = vqi.a;
        byteBufferAllocate.put("free".getBytes(StandardCharsets.UTF_8));
        byteBufferAllocate.flip();
        yr6Var.write(byteBufferAllocate);
        this.l = j2;
        f(j2 - this.k);
        this.n = k4e.a(Long.valueOf(j2), Long.valueOf(j2 + ((long) byteBufferN.limit())));
        yr6Var.b.truncate(j3);
    }

    public final void b() throws IOException {
        ArrayList arrayList;
        long j;
        int i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            if (i2 >= arrayList2.size()) {
                break;
            }
            g((ayh) arrayList2.get(i2));
            i2++;
        }
        int i3 = 0;
        while (true) {
            arrayList = this.d;
            if (i3 >= arrayList.size()) {
                break;
            }
            g((ayh) arrayList.get(i3));
            i3++;
        }
        if (this.e.get()) {
            a();
            if (arrayList.isEmpty()) {
                return;
            }
            byte[] bArr = new byte[8];
            for (int i4 = 7; i4 >= 0; i4--) {
                bArr[i4] = 0;
            }
            qp9 qp9Var = new qp9(bArr, 0, 78, "auxiliary.tracks.offset");
            ljf ljfVar = this.b;
            ljfVar.m(qp9Var);
            ByteBuffer byteBufferI = v21.i();
            ljf ljfVar2 = new ljf(20);
            ljfVar2.m((u2b) ljfVar.e);
            ljfVar2.m(new qp9(new byte[]{1}, 0, 75, "auxiliary.tracks.interleaved"));
            int size = arrayList.size();
            byte[] bArr2 = new byte[size + 2];
            bArr2[0] = 1;
            bArr2[1] = (byte) size;
            for (int i5 = 0; i5 < size; i5++) {
                ayh ayhVar = (ayh) arrayList.get(i5);
                int i6 = ayhVar.a.g;
                if (i6 == 1) {
                    i = 0;
                } else if (i6 == 2) {
                    i = 1;
                } else if (i6 == 3) {
                    i = 2;
                } else {
                    if (i6 != 4) {
                        qr7.p(ayhVar.a.g, "Unsupported auxiliary track type ");
                        return;
                    }
                    i = 3;
                }
                bArr2[i5 + 2] = (byte) i;
            }
            ljfVar2.m(new qp9(bArr2, 0, 0, "auxiliary.tracks.map"));
            ByteBuffer byteBufferN = v21.n(arrayList, ljfVar2, false);
            long jRemaining = byteBufferN.remaining() + byteBufferI.remaining();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            byteBufferAllocate.putInt(1);
            String str = vqi.a;
            byteBufferAllocate.put("axte".getBytes(StandardCharsets.UTF_8));
            byteBufferAllocate.putLong(jRemaining + 16);
            byteBufferAllocate.flip();
            ByteBuffer byteBufferA = dfl.a(byteBufferAllocate, byteBufferI, byteBufferN);
            long jRemaining2 = byteBufferA.remaining();
            byte[] bArr3 = new byte[8];
            int i7 = 7;
            while (true) {
                j = 255;
                if (i7 < 0) {
                    break;
                }
                bArr3[i7] = (byte) (255 & jRemaining2);
                jRemaining2 >>= 8;
                i7--;
            }
            ljfVar.m(new qp9(bArr3, 0, 78, "auxiliary.tracks.length"));
            a();
            ((HashSet) ljfVar.d).remove(qp9Var);
            yr6 yr6Var = this.a;
            FileChannel fileChannel = yr6Var.b;
            long size2 = fileChannel.size();
            byte[] bArr4 = new byte[8];
            int i8 = 7;
            while (i8 >= 0) {
                long j2 = j;
                bArr4[i8] = (byte) (size2 & j2);
                size2 >>= 8;
                i8--;
                j = j2;
            }
            ljfVar.m(new qp9(bArr4, 0, 78, "auxiliary.tracks.offset"));
            long size3 = fileChannel.size();
            a();
            lvb.b0(size3 == fileChannel.size());
            yr6Var.b(fileChannel.size());
            yr6Var.write(byteBufferA);
        }
    }

    public final void c(long j) throws IOException {
        if (this.j) {
            return;
        }
        long j2 = this.m;
        if (j2 + j >= this.l) {
            e(Math.max(this.l + Math.min(1000000000L, Math.max(500000L, (long) (j2 * 0.2f))) + j, ((Long) this.n.b.h()).longValue()), v21.n(this.c, this.b, false));
        }
    }

    public final void d() throws IOException {
        ByteBuffer byteBufferN = v21.n(this.c, this.b, false);
        int iRemaining = byteBufferN.remaining();
        long jRemaining = byteBufferN.remaining() + 8;
        long j = this.i;
        long j2 = this.h;
        long j3 = j - j2;
        yr6 yr6Var = this.a;
        if (jRemaining <= j3) {
            yr6Var.b(j2);
            yr6Var.write(byteBufferN);
            yr6Var.write(dfl.d("free", ByteBuffer.allocate((int) ((this.i - yr6Var.b.position()) - 8))));
        } else {
            this.j = false;
            long j4 = this.m;
            this.l = j4;
            yr6Var.b(j4);
            yr6Var.write(byteBufferN);
            this.n = k4e.a(Long.valueOf(this.l), Long.valueOf(this.l + ((long) iRemaining)));
            ByteBuffer byteBufferD = dfl.d("free", ByteBuffer.allocate((int) ((this.i - this.h) - 8)));
            yr6Var.b(this.h);
            yr6Var.write(byteBufferD);
        }
        f(this.m - this.k);
    }

    public final void e(long j, ByteBuffer byteBuffer) throws IOException {
        lvb.b0(j >= ((Long) this.n.b.h()).longValue());
        lvb.b0(j >= this.l);
        yr6 yr6Var = this.a;
        yr6Var.b(j);
        yr6Var.write(dfl.d("free", byteBuffer.duplicate()));
        long j2 = 8 + j;
        this.l = j2;
        f(j2 - this.k);
        this.n = k4e.a(Long.valueOf(j), Long.valueOf(j + ((long) byteBuffer.remaining())));
    }

    public final void f(long j) throws IOException {
        long j2 = this.k + 8;
        yr6 yr6Var = this.a;
        yr6Var.b(j2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(j);
        byteBufferAllocate.flip();
        yr6Var.write(byteBufferAllocate);
    }

    public final void g(ayh ayhVar) throws IOException {
        yr6 yr6Var = this.a;
        FileChannel fileChannel = yr6Var.b;
        ArrayDeque arrayDeque = ayhVar.f;
        int size = arrayDeque.size();
        ArrayDeque arrayDeque2 = ayhVar.e;
        lvb.b0(size == arrayDeque2.size());
        if (arrayDeque2.isEmpty()) {
            return;
        }
        long jLimit = 0;
        if (!this.e.getAndSet(true)) {
            yr6Var.b(0L);
            yr6Var.write(v21.i());
            int i = this.g;
            if (i > 0) {
                this.h = fileChannel.position();
                yr6Var.write(dfl.d("free", ByteBuffer.allocate(i)));
                this.i = fileChannel.position();
            }
            this.k = fileChannel.position();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            byteBufferAllocate.putInt(1);
            String str = vqi.a;
            byteBufferAllocate.put("mdat".getBytes(StandardCharsets.UTF_8));
            byteBufferAllocate.putLong(16L);
            byteBufferAllocate.flip();
            yr6Var.write(byteBufferAllocate);
            long j = this.k + 16;
            this.m = j;
            if (this.j) {
                j = BuildConfig.MAX_TIME_TO_UPLOAD;
            }
            this.l = j;
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            jLimit += (long) ((ByteBuffer) it.next()).limit();
        }
        c(jLimit);
        ayhVar.c.add(Long.valueOf(this.m));
        ayhVar.d.add(Integer.valueOf(arrayDeque2.size()));
        do {
            u31 u31Var = (u31) arrayDeque2.removeFirst();
            ByteBuffer byteBufferD = (ByteBuffer) arrayDeque.removeFirst();
            boolean zA = rsk.a(ayhVar.a);
            i1m i1mVar = this.f;
            if (zA) {
                byteBufferD = ou7.b.d(byteBufferD, i1mVar);
                u31Var = new u31(byteBufferD.remaining(), u31Var.c, u31Var.a);
            }
            c(byteBufferD.remaining());
            yr6Var.b(this.m);
            this.m += (long) fileChannel.write(byteBufferD);
            ((ByteBuffer) i1mVar.a).clear();
            ayhVar.b.add(u31Var);
        } while (!arrayDeque2.isEmpty());
        lvb.b0(this.m <= this.l);
    }

    public final void h(ayh ayhVar, ByteBuffer byteBuffer, u31 u31Var) throws IOException {
        if (Objects.equals(ayhVar.a.n, "video/av01") && ayhVar.a.q.isEmpty() && ayhVar.h == null) {
            ayhVar.h = fdl.a(byteBuffer.duplicate());
        }
        ayhVar.b(byteBuffer, u31Var);
        g(ayhVar);
        boolean zContains = this.c.contains(ayhVar);
        long j = u31Var.a;
        if (zContains && this.j && j - this.o >= 1000000) {
            d();
            this.o = j;
        }
    }
}
