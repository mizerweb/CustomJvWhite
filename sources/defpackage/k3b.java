package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k3b {
    public static l3b a(byte[] bArr) throws ProtoException {
        try {
            Tasks.MsgDeleteRange msgDeleteRange = (Tasks.MsgDeleteRange) sia.mergeFrom(new Tasks.MsgDeleteRange(), bArr);
            return new l3b(msgDeleteRange.requestId, msgDeleteRange.chatId, msgDeleteRange.startTime, msgDeleteRange.endTime, ku6.q(mg5.d, Integer.valueOf(msgDeleteRange.itemTypeId)));
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
