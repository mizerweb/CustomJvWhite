package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ai3 {
    public static bi3 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.ChatsList chatsList = (Tasks.ChatsList) sia.mergeFrom(new Tasks.ChatsList(), bArr);
            return new bi3(chatsList.count, chatsList.requestId, chatsList.marker, chatsList.chatsSync);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
