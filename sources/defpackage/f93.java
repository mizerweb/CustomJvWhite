package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f93 {
    public static g93 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.ChatPersonalConfig chatPersonalConfig = (Tasks.ChatPersonalConfig) sia.mergeFrom(new Tasks.ChatPersonalConfig(), bArr);
            return new g93(chatPersonalConfig.requestId, chatPersonalConfig.chatId, chatPersonalConfig.hideNonContactBar);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
