package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import one.video.calls.sdk_private.bJ;

/* JADX INFO: loaded from: classes3.dex */
public final class i8k extends o8k {
    public static final Random e = new Random();
    public int a;
    public int b;
    public byte[] c;
    public byte[] d;

    @Override // defpackage.o8k
    public final int a() {
        return ti8.b(this.b) + ti8.b(this.a) + 1 + 1 + this.c.length + 16;
    }

    @Override // defpackage.o8k
    public final void b(z7k z7kVar, pbk pbkVar, c4h c4hVar) {
        b6k b6kVar = z7kVar.G;
        s4k s4kVar = b6kVar.e;
        if (s4kVar == null) {
            b6kVar.c.accept(10, "new connection id frame not allowed when using zero-length connection ID");
            return;
        }
        int i = this.b;
        int i2 = this.a;
        if (i > i2) {
            b6kVar.c.accept(7, "exceeding active connection id limit");
            return;
        }
        boolean zContainsKey = s4kVar.a.containsKey(Integer.valueOf(i2));
        s4k s4kVar2 = b6kVar.e;
        if (!zContainsKey) {
            int i3 = this.a;
            byte[] bArr = this.c;
            byte[] bArr2 = this.d;
            int i4 = s4kVar2.e;
            ConcurrentHashMap concurrentHashMap = s4kVar2.a;
            if (i3 >= i4) {
                concurrentHashMap.put(Integer.valueOf(i3), new z5k(bArr, i3, bArr2, 1));
            } else {
                concurrentHashMap.put(Integer.valueOf(i3), new z5k(bArr, i3, bArr2, 4));
                int i5 = this.a;
                hak hakVar = b6kVar.b;
                s8k s8kVar = new s8k();
                s8kVar.a = i5;
                hakVar.d(s8kVar, w4k.d, new a6k(b6kVar, 0));
            }
        } else if (!Arrays.equals(((z5k) s4kVar2.a.get(Integer.valueOf(this.a))).b, this.c)) {
            b6kVar.c.accept(10, "different cids or same sequence number");
            return;
        }
        int i6 = this.b;
        if (i6 > 0) {
            s4k s4kVar3 = b6kVar.e;
            s4kVar3.e = i6;
            int asInt = s4kVar3.a.entrySet().stream().filter(new u6(20, s4kVar3)).mapToInt(new ao8(6)).findFirst().getAsInt();
            List list = (List) s4kVar3.a.entrySet().stream().filter(new r4k(i6, 0)).filter(new e05(17)).map(new f05(16)).collect(Collectors.toList());
            list.forEach(new o01(27, s4kVar3));
            if (qt4.e(((z5k) s4kVar3.a.get(Integer.valueOf(asInt))).c, 4)) {
                z5k z5kVar = (z5k) s4kVar3.a.values().stream().filter(new e05(18)).findFirst().orElseThrow(new kn(6));
                z5kVar.c = 2;
                s4kVar3.b = z5kVar.b;
            }
            list.forEach(new a6k(b6kVar, 1));
        }
        if (b6kVar.e.b().size() > 2) {
            b6kVar.c.accept(9, "exceeding active connection id limit");
        }
    }

    @Override // defpackage.o8k
    public final void d(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 24);
        ti8.a(this.a, byteBuffer);
        ti8.a(this.b, byteBuffer);
        byteBuffer.put((byte) this.c.length);
        byteBuffer.put(this.c);
        byteBuffer.put(this.d);
    }

    public final void i(ByteBuffer byteBuffer) {
        byteBuffer.get();
        this.a = o8k.e(byteBuffer);
        this.b = o8k.e(byteBuffer);
        int i = byteBuffer.get();
        if (i <= 0 || i > 20) {
            throw new bJ(8, "invalid connection id length");
        }
        byte[] bArr = new byte[i];
        this.c = bArr;
        byteBuffer.get(bArr);
        byte[] bArr2 = new byte[16];
        this.d = bArr2;
        byteBuffer.get(bArr2);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        return nbh.y(qv1.p("NewConnectionIdFrame[", i, ",<", i2, "|"), nl9.a(this.c), "|", nl9.a(this.d), "]");
    }
}
