package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j13 {
    public static k13 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.ChatMark chatMark = (Tasks.ChatMark) sia.mergeFrom(new Tasks.ChatMark(), bArr);
            return new k13(chatMark.requestId, chatMark.chatServerId, chatMark.mark, chatMark.messageId, chatMark.setAsUnread, chatMark.awaitChatInCache, chatMark.isReadReaction);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
