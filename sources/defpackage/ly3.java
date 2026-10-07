package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import kotlin.collections.a;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ly3 {
    public static my3 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.CommentDelete commentDelete = (Tasks.CommentDelete) sia.mergeFrom(new Tasks.CommentDelete(), bArr);
            String str = commentDelete.complaint;
            return new my3(commentDelete.requestId, new q24(commentDelete.parentChatServerId, commentDelete.parentMessageServerId), a.m1(commentDelete.messagesId), a.m1(commentDelete.messagesServerId), (str == null || str.length() == 0) ? 0 : tt2.a(commentDelete.complaint));
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
