package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v4b {
    public static w4b a(byte[] bArr) throws ProtoException {
        try {
            Tasks.MsgSharePreview msgSharePreview = (Tasks.MsgSharePreview) sia.mergeFrom(new Tasks.MsgSharePreview(), bArr);
            return new w4b(msgSharePreview.requestId, msgSharePreview.messageId, msgSharePreview.text);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
