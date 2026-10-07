package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bg3 {
    public static cg3 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.ChatUpdate chatUpdate = (Tasks.ChatUpdate) sia.mergeFrom(new Tasks.ChatUpdate(), bArr);
            Tasks.Rect rect = chatUpdate.crop;
            return new cg3(chatUpdate.requestId, chatUpdate.chatId, chatUpdate.chatServerId, 0, null, false, chatUpdate.descriptionIsNull ? null : chatUpdate.description, null, chatUpdate.themeIsNull ? null : chatUpdate.theme, chatUpdate.photoTokenIsNull ? null : chatUpdate.photoToken, rect != null ? new r60(rect.left, rect.top, rect.right, rect.bottom, 2) : null, chatUpdate.pinMessageIdIsNull ? null : Long.valueOf(chatUpdate.pinMessageId), chatUpdate.notifyPin);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
