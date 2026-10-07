package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ty {
    public static uy a(byte[] bArr) throws ProtoException {
        try {
            Tasks.AssetsRemove assetsRemove = (Tasks.AssetsRemove) sia.mergeFrom(new Tasks.AssetsRemove(), bArr);
            long[] jArr = assetsRemove.ids;
            if (jArr == null || jArr.length == 0) {
                jArr = new long[]{assetsRemove.id};
            }
            return new uy(a.b(assetsRemove.assetType), assetsRemove.requestId, jArr);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
