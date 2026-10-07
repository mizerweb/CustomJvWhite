package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import one.video.calls.sdk_private.j;

/* JADX INFO: loaded from: classes3.dex */
public final class fbk extends gab {
    public final e8k a;
    public final int b;
    public byte[] c;
    public final c8k d;

    public fbk(e8k e8kVar) {
        this.a = e8kVar;
        this.d = new c8k();
    }

    public static void c(int i, long j, ByteBuffer byteBuffer) {
        ti8.a(i, byteBuffer);
        int iC = ti8.c(j, byteBuffer);
        ti8.a(iC, byteBuffer);
        ti8.c(j, byteBuffer);
    }

    public static void e(ByteBuffer byteBuffer, int i, byte[] bArr) {
        ti8.a(i, byteBuffer);
        ti8.a(bArr.length, byteBuffer);
        byteBuffer.put(bArr);
    }

    @Override // defpackage.gab
    public final byte[] b() {
        byte[] bArr;
        byte[] bArr2;
        if (this.c == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1024);
            e8k e8kVar = e8k.b;
            e8k e8kVar2 = this.a;
            byteBufferAllocate.putShort((short) ((e8kVar2.equals(e8kVar) || e8kVar2.b()) ? 57 : 65445));
            byteBufferAllocate.putShort((short) 0);
            int i = this.b;
            c8k c8kVar = this.d;
            if (i == 2) {
                e(byteBufferAllocate, 0, c8kVar.a);
            }
            c(1, c8kVar.b, byteBufferAllocate);
            if (i == 2 && (bArr2 = c8kVar.q) != null) {
                e(byteBufferAllocate, 2, bArr2);
            }
            c(3, c8kVar.p, byteBufferAllocate);
            c(4, c8kVar.c, byteBufferAllocate);
            c(5, c8kVar.d, byteBufferAllocate);
            c(6, c8kVar.e, byteBufferAllocate);
            c(7, c8kVar.f, byteBufferAllocate);
            c(8, c8kVar.g, byteBufferAllocate);
            c(9, c8kVar.h, byteBufferAllocate);
            c(10, c8kVar.i, byteBufferAllocate);
            c(11, c8kVar.l, byteBufferAllocate);
            if (c8kVar.j) {
                ti8.a(12, byteBufferAllocate);
                ti8.a(0, byteBufferAllocate);
            }
            c(14, c8kVar.m, byteBufferAllocate);
            e(byteBufferAllocate, 15, c8kVar.n);
            if (i == 2 && (bArr = c8kVar.o) != null) {
                e(byteBufferAllocate, 16, bArr);
            }
            h6f h6fVar = c8kVar.r;
            if (h6fVar != null) {
                List list = (List) h6fVar.c;
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate((list.size() << 2) + 4);
                byteBufferAllocate2.put(((e8k) h6fVar.b).a());
                list.forEach(new bo8(byteBufferAllocate2, 4));
                e(byteBufferAllocate, 17, byteBufferAllocate2.array());
            }
            long j = c8kVar.s;
            if (j > 0) {
                c(32, j, byteBufferAllocate);
            }
            int iPosition = byteBufferAllocate.position();
            byteBufferAllocate.putShort(2, (short) (iPosition - 4));
            this.c = new byte[iPosition];
            byteBufferAllocate.get(this.c);
        }
        return this.c;
    }

    public final void d(ByteBuffer byteBuffer) throws j {
        boolean z;
        try {
            dc9 dc9Var = new dc9();
            byte[] bArr = new byte[4];
            byteBuffer.get(bArr);
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i >= 4) {
                    z = true;
                    break;
                } else {
                    if (bArr[i] != 0) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            if (!z) {
                dc9Var.b = InetAddress.getByAddress(bArr);
            }
            byteBuffer.get();
            byteBuffer.get();
            byte[] bArr2 = new byte[16];
            byteBuffer.get(bArr2);
            int i2 = 0;
            while (true) {
                if (i2 >= 16) {
                    z2 = true;
                    break;
                } else if (bArr2[i2] != 0) {
                    break;
                } else {
                    i2++;
                }
            }
            if (!z2) {
                dc9Var.c = InetAddress.getByAddress(bArr2);
            }
            byteBuffer.get();
            byteBuffer.get();
            if (((InetAddress) dc9Var.b) == null && ((InetAddress) dc9Var.c) == null) {
                throw new j("Preferred address: no valid IP address");
            }
            byte[] bArr3 = new byte[byteBuffer.get()];
            dc9Var.d = bArr3;
            byteBuffer.get(bArr3);
            byteBuffer.get(new byte[16]);
            this.d.k = dc9Var;
        } catch (UnknownHostException unused) {
            hs4.b();
        }
    }

    public fbk(e8k e8kVar, c8k c8kVar) {
        this.a = e8kVar;
        this.d = c8kVar;
        this.b = 1;
    }
}
