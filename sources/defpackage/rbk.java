package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import one.video.calls.sdk_private.bJ;
import one.video.calls.sdk_private.bt;

/* JADX INFO: loaded from: classes3.dex */
public final class rbk extends pbk {
    public short g;

    @Override // defpackage.pbk
    public final int b(int i) {
        int iC = pbk.c(this.b);
        int iSum = this.c.stream().mapToInt(new ao8(15)).sum() + i;
        int iMax = Integer.max(0, (4 - iC) - iSum);
        int length = this.e.length + 1;
        if (this.b < 0) {
            iC = 4;
        }
        return length + iC + iSum + iMax + 16;
    }

    @Override // defpackage.pbk
    public final int d(z7k z7kVar, c4h c4hVar) {
        b6k b6kVar = z7kVar.G;
        byte[] bArr = this.e;
        final u4k u4kVar = b6kVar.d;
        final int i = 1;
        boolean zAnyMatch = false;
        byte b = 0;
        if (!Arrays.equals(u4kVar.b, bArr)) {
            Stream stream = u4kVar.a.values().stream();
            final byte b2 = b == true ? 1 : 0;
            stream.filter(new Predicate() { // from class: t4k
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i2 = b2;
                    u4k u4kVar2 = u4kVar;
                    z5k z5kVar = (z5k) obj;
                    u4kVar2.getClass();
                    switch (i2) {
                        case 0:
                            break;
                        case 1:
                            break;
                    }
                    return Arrays.equals(z5kVar.b, u4kVar2.b);
                }
            }).forEach(new t81(1));
            u4kVar.b = bArr;
            zAnyMatch = u4kVar.a.values().stream().filter(new Predicate() { // from class: t4k
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i2 = i;
                    u4k u4kVar2 = u4kVar;
                    z5k z5kVar = (z5k) obj;
                    u4kVar2.getClass();
                    switch (i2) {
                        case 0:
                            break;
                        case 1:
                            break;
                    }
                    return Arrays.equals(z5kVar.b, u4kVar2.b);
                }
            }).anyMatch(new e05(19));
            final int i2 = 2;
            u4kVar.a.values().stream().filter(new Predicate() { // from class: t4k
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i3 = i2;
                    u4k u4kVar2 = u4kVar;
                    z5k z5kVar = (z5k) obj;
                    u4kVar2.getClass();
                    switch (i3) {
                        case 0:
                            break;
                        case 1:
                            break;
                    }
                    return Arrays.equals(z5kVar.b, u4kVar2.b);
                }
            }).forEach(new t81(2));
            nl9.a(u4kVar.b);
        }
        if (zAnyMatch && b6kVar.d.b().size() < b6kVar.h) {
            b6kVar.a();
        }
        z7kVar.i(this, c4hVar);
        return 1;
    }

    @Override // defpackage.pbk
    public final void e(byte b) throws bJ {
        if ((b & 24) != 0) {
            throw new bJ(11, "Reserved bits in short header packet are not zero");
        }
    }

    @Override // defpackage.pbk
    public final void i(ByteBuffer byteBuffer, z4k z4kVar, long j, ku8 ku8Var, int i) throws Throwable {
        rbk rbkVar;
        ByteBuffer byteBuffer2;
        z4k z4kVar2;
        if (byteBuffer.remaining() < i + 1) {
            dzh.a();
            return;
        }
        if (byteBuffer.position() != 0) {
            c.t();
            return;
        }
        byte b = byteBuffer.get();
        if ((b & 192) != 64) {
            hs4.b();
            return;
        }
        byte[] bArr = new byte[i];
        this.e = bArr;
        byteBuffer.get(bArr);
        try {
            rbkVar = this;
            byteBuffer2 = byteBuffer;
            z4kVar2 = z4kVar;
            try {
                try {
                    rbkVar.g(byteBuffer2, b, byteBuffer.limit() - byteBuffer.position(), z4kVar2, j);
                    z4kVar2.e();
                    rbkVar.d = byteBuffer2.position();
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    rbkVar.d = byteBuffer2.position();
                    throw th2;
                }
            } catch (bt e) {
                e = e;
                bt btVar = e;
                synchronized (z4kVar2) {
                    if (z4kVar2.n) {
                        z4kVar2.c = null;
                        z4kVar2.n = false;
                        z4kVar2.e = null;
                        z4kVar2.g = null;
                    }
                }
                throw btVar;
            }
        } catch (bt e2) {
            e = e2;
            rbkVar = this;
            byteBuffer2 = byteBuffer;
            z4kVar2 = z4kVar;
        } catch (Throwable th3) {
            th = th3;
            rbkVar = this;
            byteBuffer2 = byteBuffer;
            Throwable th4 = th;
            rbkVar.d = byteBuffer2.position();
            throw th4;
        }
    }

    @Override // defpackage.pbk
    public final byte[] j(z4k z4kVar) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1500);
        short s = (short) (z4kVar.m % 2);
        this.g = s;
        byteBufferAllocate.put(pbk.a(this.b, (byte) ((s << 2) | 64)));
        byteBufferAllocate.put(this.e);
        byte[] bArrM = pbk.m(this.b);
        byteBufferAllocate.put(bArrM);
        h(byteBufferAllocate, bArrM.length, k(bArrM.length), z4kVar);
        int iLimit = byteBufferAllocate.limit();
        this.d = iLimit;
        byte[] bArr = new byte[iLimit];
        byteBufferAllocate.get(bArr);
        this.d = iLimit;
        return bArr;
    }

    @Override // defpackage.pbk
    public final void l(byte b) {
        this.g = (short) ((b & 4) >> 2);
    }

    @Override // defpackage.pbk
    public final w4k n() {
        return w4k.d;
    }

    @Override // defpackage.pbk
    public final y4k o() {
        return y4k.c;
    }

    public final String toString() {
        String str = this.f ? "P" : "";
        char cCharAt = "App".charAt(0);
        long j = this.b;
        Object objValueOf = j >= 0 ? Long.valueOf(j) : ".";
        short s = this.g;
        String strA = nl9.a(this.e);
        int i = this.d;
        int size = this.c.size();
        String str2 = (String) this.c.stream().map(new lbk(2)).collect(Collectors.joining(" "));
        StringBuilder sb = new StringBuilder("Packet ");
        sb.append(str);
        sb.append(cCharAt);
        sb.append("|");
        sb.append(objValueOf);
        sb.append("|S");
        sb.append((int) s);
        sb.append("|");
        sb.append(strA);
        zo5.C(i, size, "|", "|", sb);
        return zo5.w(sb, "  ", str2);
    }

    @Override // defpackage.pbk
    public final byte[] v() {
        return this.e;
    }
}
