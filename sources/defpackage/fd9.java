package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fd9 {
    public static gd9 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.LocationStop locationStop = (Tasks.LocationStop) sia.mergeFrom(new Tasks.LocationStop(), bArr);
            return new gd9(locationStop.requestId, locationStop.chatId, locationStop.messageId);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
