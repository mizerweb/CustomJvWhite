package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l4b {
    public static n4b a(byte[] bArr) throws ProtoException {
        try {
            Tasks.MsgSend msgSend = (Tasks.MsgSend) sia.mergeFrom(new Tasks.MsgSend(), bArr);
            return new n4b(msgSend.requestId, msgSend.messageId, msgSend.chatId, msgSend.chatServerId, msgSend.userId, msgSend.notify, msgSend.traceId);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
