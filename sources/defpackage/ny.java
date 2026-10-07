package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ny {
    public static oy a(byte[] bArr) throws ProtoException {
        try {
            Tasks.AssetsListModify assetsListModify = (Tasks.AssetsListModify) sia.mergeFrom(new Tasks.AssetsListModify(), bArr);
            return new oy(assetsListModify.requestId, a.b(assetsListModify.assetType), assetsListModify.ids, assetsListModify.modifyTime);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
