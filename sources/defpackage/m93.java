package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m93 {
    public static n93 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.ChatPinSetVisibility chatPinSetVisibility = (Tasks.ChatPinSetVisibility) sia.mergeFrom(new Tasks.ChatPinSetVisibility(), bArr);
            return new n93(chatPinSetVisibility.requestId, chatPinSetVisibility.chatServerId, chatPinSetVisibility.show);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
