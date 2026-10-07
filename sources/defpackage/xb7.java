package defpackage;

import android.R;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class xb7 {
    public final ub7 a;
    public final ljf b;
    public final long c;
    public ayh f;
    public boolean h;
    public long j;
    public int k;
    public final ArrayList d = new ArrayList();
    public long i = BuildConfig.MAX_TIME_TO_UPLOAD;
    public int g = 1;
    public final i1m e = new i1m(18);

    public xb7(WritableByteChannel writableByteChannel, ljf ljfVar, long j) {
        this.a = new ub7(writableByteChannel);
        this.b = ljfVar;
        this.c = j * 1000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() throws IOException {
        i1m i1mVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 4;
        oc9.p(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            i1mVar = this.e;
            i = 1;
            if (i6 >= size) {
                break;
            }
            if (((ayh) arrayList.get(i6)).e.isEmpty()) {
                i3 = i6;
            } else {
                int i8 = i6 + 1;
                ayh ayhVar = (ayh) arrayList.get(i6);
                ArrayDeque arrayDeque = ayhVar.f;
                b87 b87Var = ayhVar.a;
                int size2 = arrayDeque.size();
                ArrayDeque arrayDeque2 = ayhVar.e;
                lvb.b0(size2 == arrayDeque2.size());
                z88 z88Var = new z88(i5);
                z88 z88Var2 = new z88(i5);
                if (rsk.a(b87Var)) {
                    while (!arrayDeque.isEmpty()) {
                        ByteBuffer byteBufferD = ou7.b.d((ByteBuffer) arrayDeque.removeFirst(), i1mVar);
                        z88Var.c(byteBufferD);
                        u31 u31Var = (u31) arrayDeque2.removeFirst();
                        z88Var2.c(new u31(byteBufferD.remaining(), u31Var.c, u31Var.a));
                        i8 = i8;
                        i6 = i6;
                    }
                    i3 = i6;
                    i4 = i8;
                } else {
                    i3 = i6;
                    i4 = i8;
                    z88Var.f(arrayDeque);
                    arrayDeque.clear();
                    z88Var2.f(arrayDeque2);
                    arrayDeque2.clear();
                }
                ghe gheVarH = z88Var2.h();
                ArrayList arrayListE = v21.e(ayhVar.a(), ayhVar.i, gheVarH);
                ArrayList arrayListB = v21.b(gheVarH, arrayListE, ayhVar.a());
                boolean zIsEmpty = arrayListB.isEmpty();
                boolean z = !zIsEmpty;
                oc9.p(4, "initialCapacity");
                Object[] objArrCopyOf2 = new Object[4];
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (i9 < gheVarH.d) {
                    i11 += ((u31) gheVarH.get(i9)).b;
                    ArrayList arrayList2 = arrayListE;
                    boolean z2 = zIsEmpty;
                    ghe gheVar = gheVarH;
                    wb7 wb7Var = new wb7(((Integer) arrayListE.get(i9)).intValue(), ((u31) gheVarH.get(i9)).b, ((u31) gheVarH.get(i9)).c, !z2 ? ((Integer) arrayListB.get(i9)).intValue() : 0);
                    int i12 = i10 + 1;
                    int iB = r88.b(objArrCopyOf2.length, i12);
                    if (iB > objArrCopyOf2.length) {
                        objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iB);
                    }
                    objArrCopyOf2[i10] = wb7Var;
                    i9++;
                    i10 = i12;
                    arrayListB = arrayListB;
                    arrayListE = arrayList2;
                    zIsEmpty = z2;
                    gheVarH = gheVar;
                }
                vb7 vb7Var = new vb7(i4, b87Var, i11, z, z88Var.h(), c98.j(objArrCopyOf2, i10));
                int i13 = i7 + 1;
                int iB2 = r88.b(objArrCopyOf.length, i13);
                if (iB2 > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB2);
                }
                objArrCopyOf[i7] = vb7Var;
                i7 = i13;
            }
            i6 = i3 + 1;
            i5 = 4;
        }
        ghe gheVarJ = c98.j(objArrCopyOf, i7);
        ub7 ub7Var = this.a;
        long j = ub7Var.b;
        oc9.p(4, "initialCapacity");
        Object[] objArrCopyOf3 = new Object[4];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = gheVarJ.d;
            i2 = gheVarJ.d;
            if (i14 >= i16) {
                break;
            }
            vb7 vb7Var2 = (vb7) gheVarJ.get(i14);
            int size3 = vb7Var2.f.size();
            boolean z3 = vb7Var2.d;
            int i17 = v21.a;
            i15 += ((z3 ? 4 : 3) * size3 * 4) + 52;
            i14++;
        }
        int i18 = i15 + 32;
        int i19 = 0;
        int i20 = 0;
        while (i19 < i2) {
            vb7 vb7Var3 = (vb7) gheVarJ.get(i19);
            int i21 = vb7Var3.a;
            int i22 = v21.a;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            byteBufferAllocate.putInt(i);
            byteBufferAllocate.putInt(i21);
            byteBufferAllocate.putLong(j);
            byteBufferAllocate.flip();
            ByteBuffer byteBufferD2 = dfl.d("tfhd", byteBufferAllocate);
            b87 b87Var2 = vb7Var3.b;
            int i23 = i;
            c98 c98Var = vb7Var3.f;
            boolean z4 = vb7Var3.d;
            long j2 = j;
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(((z4 ? 4 : 3) * c98Var.size() * 4) + 12);
            byteBufferAllocate2.putInt(z4 ? 16781057 : 16779009);
            byteBufferAllocate2.putInt(c98Var.size());
            byteBufferAllocate2.putInt(i18);
            boolean zA = uya.a(b87Var2.n, b87Var2.k);
            int i24 = 0;
            while (i24 < c98Var.size()) {
                wb7 wb7Var2 = (wb7) c98Var.get(i24);
                int i25 = i19;
                byteBufferAllocate2.putInt(wb7Var2.a);
                byteBufferAllocate2.putInt(wb7Var2.b);
                byteBufferAllocate2.putInt(((wb7Var2.c & 1) != 0 || zA) ? 33554432 : R.attr.theme);
                if (z4) {
                    byteBufferAllocate2.putInt(wb7Var2.d);
                }
                i24++;
                i19 = i25;
            }
            int i26 = i19;
            byteBufferAllocate2.flip();
            ByteBuffer byteBufferC = dfl.c("traf", c98.s(byteBufferD2, dfl.d("trun", byteBufferAllocate2)));
            int i27 = i20 + 1;
            int iB3 = r88.b(objArrCopyOf3.length, i27);
            if (iB3 > objArrCopyOf3.length) {
                objArrCopyOf3 = Arrays.copyOf(objArrCopyOf3, iB3);
            }
            objArrCopyOf3[i20] = byteBufferC;
            i18 += vb7Var3.c;
            i20 = i27;
            i = i23;
            i19 = i26 + 1;
            j = j2;
        }
        int i28 = i;
        ghe gheVarJ2 = c98.j(objArrCopyOf3, i20);
        if (gheVarJ2.isEmpty()) {
            return;
        }
        int i29 = this.g;
        int i30 = v21.a;
        int i31 = 8;
        ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(8);
        byteBufferAllocate3.putInt(0);
        byteBufferAllocate3.putInt(i29);
        byteBufferAllocate3.flip();
        ByteBuffer byteBufferD3 = dfl.d("mfhd", byteBufferAllocate3);
        z88 z88Var3 = new z88(4);
        z88Var3.c(byteBufferD3);
        z88Var3.f(gheVarJ2);
        ub7Var.write(dfl.c("moof", z88Var3.h()));
        long jRemaining = 0;
        for (int i32 = 0; i32 < i2; i32++) {
            c98 c98Var2 = ((vb7) gheVarJ.get(i32)).e;
            int i33 = 0;
            while (i33 < c98Var2.size()) {
                jRemaining += (long) ((ByteBuffer) c98Var2.get(i33)).remaining();
                i33++;
                i31 = i31;
            }
        }
        ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(i31);
        long j3 = 8 + jRemaining;
        lvb.O("Only 32-bit long mdat size supported in the fragmented MP4", j3 <= 4294967295L ? i28 : 0);
        byteBufferAllocate4.putInt((int) j3);
        String str = vqi.a;
        byteBufferAllocate4.put("mdat".getBytes(StandardCharsets.UTF_8));
        byteBufferAllocate4.flip();
        ub7Var.write(byteBufferAllocate4);
        for (int i34 = 0; i34 < i2; i34++) {
            c98 c98Var3 = ((vb7) gheVarJ.get(i34)).e;
            for (int i35 = 0; i35 < c98Var3.size(); i35++) {
                ub7Var.write((ByteBuffer) c98Var3.get(i35));
            }
        }
        ((ByteBuffer) i1mVar.a).clear();
        this.g++;
        this.j = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    public final void b(ayh ayhVar, ByteBuffer byteBuffer, u31 u31Var) {
        b87 b87Var = ayhVar.a;
        ArrayDeque arrayDeque = ayhVar.e;
        if (Objects.equals(b87Var.n, "video/av01") && ayhVar.a.q.isEmpty() && ayhVar.h == null) {
            ayhVar.h = fdl.a(byteBuffer.duplicate());
        }
        if (!this.h) {
            ByteBuffer byteBufferI = v21.i();
            ub7 ub7Var = this.a;
            ub7Var.write(byteBufferI);
            ub7Var.write(v21.n(this.d, this.b, true));
            this.h = true;
        }
        ayh ayhVar2 = this.f;
        long j = this.c;
        if (ayhVar2 != null) {
            if (ayhVar == ayhVar2 && ayhVar.g && (u31Var.c & 1) > 0) {
                u31 u31Var2 = (u31) arrayDeque.peekFirst();
                u31Var2.getClass();
                u31 u31Var3 = (u31) arrayDeque.peekLast();
                u31Var3.getClass();
                if (u31Var3.a - u31Var2.a >= j) {
                    a();
                }
            }
        } else if (this.j >= j) {
            a();
        }
        ayhVar.b(byteBuffer, u31Var);
        u31 u31Var4 = (u31) arrayDeque.peekFirst();
        u31Var4.getClass();
        long j2 = u31Var4.a;
        u31 u31Var5 = (u31) arrayDeque.peekLast();
        u31Var5.getClass();
        this.i = Math.min(this.i, j2);
        this.j = Math.max(this.j, u31Var5.a - j2);
    }
}
