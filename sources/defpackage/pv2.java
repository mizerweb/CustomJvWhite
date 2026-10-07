package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pv2 {
    public static qv2 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.ChatClear chatClear = (Tasks.ChatClear) sia.mergeFrom(new Tasks.ChatClear(), bArr);
            return new qv2(chatClear.requestId, chatClear.chatId, chatClear.chatServerId, chatClear.lastEventTime, chatClear.forAll);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
