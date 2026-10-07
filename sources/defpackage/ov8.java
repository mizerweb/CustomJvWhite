package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;
import one.video.calls.sdk_private.j;

/* JADX INFO: loaded from: classes3.dex */
public final class ov8 extends gab {
    public final ArrayList a = new ArrayList();

    public ov8(ByteBuffer byteBuffer) throws j {
        int iA = a(byteBuffer, ifk.certificate_authorities.a, 2);
        int i = byteBuffer.getShort();
        if (iA != i + 2) {
            p51.g("inconsistent length fields");
            throw null;
        }
        while (i > 0) {
            if (i < 2) {
                p51.g("inconsistent length fields");
                throw null;
            }
            int i2 = i - 2;
            int i3 = byteBuffer.getShort() & 65535;
            if (i3 > i2) {
                p51.g("inconsistent length fields");
                throw null;
            }
            if (i3 > byteBuffer.remaining()) {
                p51.g("inconsistent length fields");
                throw null;
            }
            byte[] bArr = new byte[i3];
            byteBuffer.get(bArr);
            i = i2 - i3;
            try {
                this.a.add(new X500Principal(bArr));
            } catch (IllegalArgumentException unused) {
                p51.g("authority not in DER format");
                throw null;
            }
        }
    }

    @Override // defpackage.gab
    public final byte[] b() {
        ArrayList arrayList = this.a;
        int iSum = arrayList.stream().mapToInt(new ao8(1)).sum() + (arrayList.size() << 1);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iSum + 6);
        byteBufferAllocate.putShort(ifk.certificate_authorities.a);
        byteBufferAllocate.putShort((short) (iSum + 2));
        byteBufferAllocate.putShort((short) iSum);
        arrayList.stream().forEach(new bo8(byteBufferAllocate, 1));
        return byteBufferAllocate.array();
    }
}
