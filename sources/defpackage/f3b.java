package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import kotlin.collections.a;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f3b {
    public static g3b a(byte[] bArr) throws ProtoException {
        try {
            Tasks.MsgDelete msgDelete = (Tasks.MsgDelete) sia.mergeFrom(new Tasks.MsgDelete(), bArr);
            return new g3b(msgDelete.requestId, msgDelete.chatId, msgDelete.chatServerId, a.m1(msgDelete.messagesId), a.m1(msgDelete.messagesServerId), !ch3.r(msgDelete.complaint) ? tt2.a(msgDelete.complaint) : 0, msgDelete.forMe, ku6.q(mg5.d, Integer.valueOf(msgDelete.itemTypeId)), msgDelete.notDeleteMessageFromDb);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
