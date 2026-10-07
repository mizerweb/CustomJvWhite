package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class py3 {
    public static ry3 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.CommentDeleteUser commentDeleteUser = (Tasks.CommentDeleteUser) sia.mergeFrom(new Tasks.CommentDeleteUser(), bArr);
            return new ry3(commentDeleteUser.requestId, commentDeleteUser.userId, commentDeleteUser.messageServerId, new q24(commentDeleteUser.chatServerId, commentDeleteUser.postServerId));
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
