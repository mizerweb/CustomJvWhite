package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import one.video.calls.sdk_private.j;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes3.dex */
public final class do8 extends gab {
    public final /* synthetic */ int a = 1;
    public Object b;

    public do8(ByteBuffer byteBuffer) throws j {
        int iA = a(byteBuffer, ifk.application_layer_protocol_negotiation.a, 3);
        int i = byteBuffer.getShort();
        if (i != iA - 2) {
            p51.g("inconsistent lengths");
            throw null;
        }
        this.b = new ArrayList();
        while (i > 0) {
            int i2 = byteBuffer.get() & 255;
            if (i2 > i - 1) {
                p51.g("incorrect length");
                throw null;
            }
            byte[] bArr = new byte[i2];
            byteBuffer.get(bArr);
            ((List) this.b).add(new String(bArr));
            i -= i2 + 1;
        }
    }

    public static void c(int i, ByteBuffer byteBuffer) throws j {
        if (byteBuffer.remaining() >= i) {
            return;
        }
        p51.g("extension underflow");
    }

    @Override // defpackage.gab
    public final byte[] b() {
        switch (this.a) {
            case 0:
                List list = (List) this.b;
                int size = list.size() + 6 + list.stream().mapToInt(new ao8(0)).sum();
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size);
                byteBufferAllocate.putShort(ifk.application_layer_protocol_negotiation.a);
                byteBufferAllocate.putShort((short) (size - 4));
                byteBufferAllocate.putShort((short) (size - 6));
                list.forEach(new bo8(byteBufferAllocate, 0));
                return byteBufferAllocate.array();
            default:
                String str = (String) this.b;
                short length = (short) str.length();
                short s = (short) (length + 5);
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(s + 4);
                byteBufferAllocate2.putShort(ifk.server_name.a);
                byteBufferAllocate2.putShort(s);
                byteBufferAllocate2.putShort((short) (length + 3));
                byteBufferAllocate2.put((byte) 0);
                byteBufferAllocate2.putShort(length);
                byteBufferAllocate2.put(str.getBytes(Charset.forName(HTTP.ASCII)));
                return byteBufferAllocate2.array();
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "AlpnExtension " + ((List) this.b);
            default:
                return super.toString();
        }
    }

    public do8(String str) {
        if (str != null && !str.trim().isEmpty()) {
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{str}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            this.b = Collections.unmodifiableList(arrayList);
            return;
        }
        ore.p("protocol cannot be empty");
        throw null;
    }

    public /* synthetic */ do8() {
    }
}
