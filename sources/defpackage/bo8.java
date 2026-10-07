package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.function.Consumer;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bo8 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ ByteBuffer b;

    public /* synthetic */ bo8(ByteBuffer byteBuffer, int i) {
        this.a = i;
        this.b = byteBuffer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        ByteBuffer byteBuffer = this.b;
        switch (i) {
            case 0:
                byte[] bytes = ((String) obj).getBytes(Charset.forName("UTF-8"));
                byteBuffer.put((byte) bytes.length);
                byteBuffer.put(bytes);
                break;
            case 1:
                X500Principal x500Principal = (X500Principal) obj;
                byteBuffer.putShort((short) x500Principal.getEncoded().length);
                byteBuffer.put(x500Principal.getEncoded());
                break;
            case 2:
                byte[] bArr = (byte[]) obj;
                if (bArr.length > 65520) {
                    ore.q("Certificate size not supported");
                } else {
                    byteBuffer.put((byte) 0);
                    byteBuffer.putShort((short) bArr.length);
                    byteBuffer.put(bArr);
                    byteBuffer.putShort((short) 0);
                }
                break;
            case 3:
                byteBuffer.put((byte[]) obj);
                break;
            case 4:
                byteBuffer.put(((e8k) obj).a());
                break;
            case 5:
                ((o8k) obj).d(byteBuffer);
                break;
            case 6:
                byteBuffer.put(((e8k) obj).a());
                break;
            default:
                Map.Entry entry = (Map.Entry) obj;
                if (((Long) entry.getKey()).longValue() != 8 || ((Long) entry.getValue()).longValue() == 1) {
                    ti8.c(((Long) entry.getKey()).longValue(), byteBuffer);
                    ti8.c(((Long) entry.getValue()).longValue(), byteBuffer);
                }
                break;
        }
    }
}
