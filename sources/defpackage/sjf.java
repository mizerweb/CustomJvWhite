package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sjf {
    public static void a(wzj wzjVar, long j, long j2, m8b m8bVar) {
        wzjVar.d(new wjf(j, j2, m8bVar, 0L));
    }

    public static wjf b(byte[] bArr) throws ProtoException {
        try {
            Tasks.ChatMarkBatch chatMarkBatch = (Tasks.ChatMarkBatch) sia.mergeFrom(new Tasks.ChatMarkBatch(), bArr);
            return new wjf(chatMarkBatch.taskId, chatMarkBatch.maxMark, rx8.h0(chatMarkBatch.chatIds), chatMarkBatch.lastFailTime);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
