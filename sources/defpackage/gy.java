package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gy {
    public static hy a(byte[] bArr) throws ProtoException {
        try {
            Tasks.AssetsAdd assetsAdd = (Tasks.AssetsAdd) sia.mergeFrom(new Tasks.AssetsAdd(), bArr);
            return new hy(a.b(assetsAdd.assetType), assetsAdd.requestId, assetsAdd.id);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
