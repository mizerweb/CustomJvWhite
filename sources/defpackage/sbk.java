package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;
import one.video.calls.sdk_private.bB;
import one.video.calls.sdk_private.bN;
import one.video.calls.sdk_private.by;
import one.video.calls.sdk_private.bz;

/* JADX INFO: loaded from: classes3.dex */
public final class sbk extends pbk {
    public static final Random j = new Random();
    public byte[] g;
    public int h;
    public final ArrayList i = new ArrayList();

    public sbk(e8k e8kVar) {
        this.a = e8kVar;
    }

    @Override // defpackage.pbk
    public final int b(int i) {
        throw new bB();
    }

    @Override // defpackage.pbk
    public final int d(z7k z7kVar, c4h c4hVar) {
        if (z7kVar.P || this.i.contains(z7kVar.a.a)) {
            return 1;
        }
        f8k f8kVar = z7kVar.a;
        Objects.toString(f8kVar);
        throw new bN();
    }

    @Override // defpackage.pbk
    public final void i(ByteBuffer byteBuffer, z4k z4kVar, long j2, ku8 ku8Var, int i) throws bz {
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (iLimit < 11) {
            dzh.a();
            return;
        }
        byteBuffer.get();
        if (byteBuffer.getInt() != 0) {
            throw new by();
        }
        int i2 = byteBuffer.get() & 255;
        int i3 = 11 + i2;
        if (iLimit < i3) {
            dzh.a();
            return;
        }
        byte[] bArr = new byte[i2];
        this.e = bArr;
        byteBuffer.get(bArr);
        int i4 = byteBuffer.get() & 255;
        if (iLimit < i3 + i4) {
            dzh.a();
            return;
        }
        byte[] bArr2 = new byte[i4];
        this.g = bArr2;
        byteBuffer.get(bArr2);
        while (byteBuffer.remaining() >= 4) {
            e8k e8kVar = new e8k(byteBuffer.getInt());
            this.i.add(e8kVar);
            e8kVar.toString();
        }
        this.h = byteBuffer.limit();
    }

    @Override // defpackage.pbk
    public final byte[] j(z4k z4kVar) {
        int length = this.e.length + 7 + this.g.length;
        ArrayList arrayList = this.i;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((arrayList.size() * 4) + length);
        byteBufferAllocate.put((byte) (((byte) j.nextInt(np0.n)) | 192));
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put((byte) this.e.length);
        byteBufferAllocate.put(this.e);
        byteBufferAllocate.put((byte) this.g.length);
        byteBufferAllocate.put(this.g);
        arrayList.forEach(new bo8(byteBufferAllocate, 6));
        return byteBufferAllocate.array();
    }

    @Override // defpackage.pbk
    public final w4k n() {
        return null;
    }

    @Override // defpackage.pbk
    public final y4k o() {
        return null;
    }

    @Override // defpackage.pbk
    public final Long p() {
        return null;
    }

    @Override // defpackage.pbk
    public final boolean r() {
        return false;
    }

    public final String toString() {
        int i = this.h;
        return "Packet V|-|V|" + (i >= 0 ? Integer.valueOf(i) : ".") + "|0  " + ((String) this.i.stream().map(new lbk(3)).collect(Collectors.joining(", ")));
    }
}
