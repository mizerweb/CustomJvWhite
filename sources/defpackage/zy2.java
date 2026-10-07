package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zy2 {
    public static az2 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.ChatHide chatHide = (Tasks.ChatHide) sia.mergeFrom(new Tasks.ChatHide(), bArr);
            return new az2(chatHide.requestId, chatHide.chatId, chatHide.chatServerId);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
