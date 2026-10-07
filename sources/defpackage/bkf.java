package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bkf {
    public static dkf a(byte[] bArr) throws ProtoException {
        try {
            Tasks.DeleteChatsBatch deleteChatsBatch = (Tasks.DeleteChatsBatch) sia.mergeFrom(new Tasks.DeleteChatsBatch(), bArr);
            return new dkf(deleteChatsBatch.taskId, deleteChatsBatch.lastFailTime, rx8.h0(deleteChatsBatch.chatIds));
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
