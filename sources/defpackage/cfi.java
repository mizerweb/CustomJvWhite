package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cfi {
    public static dfi a(byte[] bArr) throws ProtoException {
        try {
            Tasks.UpdateFireTimeProtoTask updateFireTimeProtoTask = (Tasks.UpdateFireTimeProtoTask) sia.mergeFrom(new Tasks.UpdateFireTimeProtoTask(), bArr);
            return new dfi(updateFireTimeProtoTask.requestId, updateFireTimeProtoTask.chatId, updateFireTimeProtoTask.messageId, updateFireTimeProtoTask.fireTime, updateFireTimeProtoTask.notifySender);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
