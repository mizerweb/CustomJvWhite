package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pch {
    public static qch a(byte[] bArr) throws ProtoException {
        try {
            Tasks.SuspendBot suspendBot = (Tasks.SuspendBot) sia.mergeFrom(new Tasks.SuspendBot(), bArr);
            return new qch(suspendBot.requestId, suspendBot.chatId, suspendBot.suspend, suspendBot.botId);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
