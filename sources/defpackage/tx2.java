package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tx2 {
    public static ux2 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.ChatDelete chatDelete = (Tasks.ChatDelete) sia.mergeFrom(new Tasks.ChatDelete(), bArr);
            return new ux2(chatDelete.requestId, chatDelete.chatId, chatDelete.chatServerId, chatDelete.lastEventTime, chatDelete.forAll);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
