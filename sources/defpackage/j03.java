package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j03 {
    public static k03 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.ChannelLeave channelLeave = (Tasks.ChannelLeave) sia.mergeFrom(new Tasks.ChannelLeave(), bArr);
            return new k03(channelLeave.requestId, channelLeave.chatId, channelLeave.chatServerId);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
