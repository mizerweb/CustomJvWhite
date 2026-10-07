package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sy3 {
    public static ty3 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.CommentEdit commentEdit = (Tasks.CommentEdit) sia.mergeFrom(new Tasks.CommentEdit(), bArr);
            Protos.MessageElements messageElements = commentEdit.oldElements;
            ArrayList arrayListA = messageElements != null ? dga.a(messageElements.elements) : null;
            long j = commentEdit.requestId;
            q24 q24Var = new q24(commentEdit.parentChatServerId, commentEdit.parentMessageServerId);
            long j2 = commentEdit.commentId;
            String str = commentEdit.isTextNull ? null : commentEdit.text;
            String str2 = commentEdit.isOldTextNull ? null : commentEdit.oldText;
            int i = commentEdit.oldStatus;
            for (wja wjaVar : wja.values()) {
                if (wjaVar.a == i) {
                    return new ty3(j, q24Var, j2, str, str2, wjaVar, arrayListA);
                }
            }
            ore.f("Array contains no element matching the predicate.");
            return null;
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
