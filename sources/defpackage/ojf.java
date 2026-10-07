package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ojf {
    public static void a(wzj wzjVar, long j, long[] jArr) {
        wzjVar.d(new qjf(j, jArr, 0L));
    }

    public static qjf b(byte[] bArr) throws ProtoException {
        try {
            Tasks.CallHistoryClearBatch callHistoryClearBatch = (Tasks.CallHistoryClearBatch) sia.mergeFrom(new Tasks.CallHistoryClearBatch(), bArr);
            return new qjf(callHistoryClearBatch.taskId, callHistoryClearBatch.historyIds, callHistoryClearBatch.lastFailTime);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
