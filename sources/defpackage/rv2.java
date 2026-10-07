package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rv2 {
    public static sv2 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.ChatComplain chatComplain = (Tasks.ChatComplain) sia.mergeFrom(new Tasks.ChatComplain(), bArr);
            return new sv2(!ch3.r(chatComplain.complaint) ? tt2.a(chatComplain.complaint) : 0, chatComplain.requestId, chatComplain.chatId);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
