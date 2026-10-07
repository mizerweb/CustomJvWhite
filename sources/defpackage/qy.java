package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qy {
    public static ry a(byte[] bArr) throws ProtoException {
        try {
            Tasks.AssetsMove assetsMove = (Tasks.AssetsMove) sia.mergeFrom(new Tasks.AssetsMove(), bArr);
            long j = assetsMove.requestId;
            return new ry(a.b(assetsMove.assetType), assetsMove.position, j, assetsMove.id, assetsMove.prevId);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
