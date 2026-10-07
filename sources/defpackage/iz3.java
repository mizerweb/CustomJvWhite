package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class iz3 {
    public static final boolean a(ky3 ky3Var) {
        return ky3Var.j == wja.DELETED && ky3Var.b == 0;
    }

    public static mz3 b(byte[] bArr) throws ProtoException {
        try {
            Tasks.CommentSend commentSend = (Tasks.CommentSend) sia.mergeFrom(new Tasks.CommentSend(), bArr);
            return new mz3(commentSend.requestId, new q24(commentSend.parentChatServerId, commentSend.parentMessageServerId), commentSend.commentId, commentSend.traceId);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
