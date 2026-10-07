package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xq2 {
    public static ar2 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.ChangeProfileOrChatPhoto changeProfileOrChatPhoto = (Tasks.ChangeProfileOrChatPhoto) sia.mergeFrom(new Tasks.ChangeProfileOrChatPhoto(), bArr);
            Tasks.Rect rect = changeProfileOrChatPhoto.crop;
            r60 r60Var = rect != null ? new r60(rect.left, rect.top, rect.right, rect.bottom, 2) : null;
            long j = changeProfileOrChatPhoto.requestId;
            String str = changeProfileOrChatPhoto.file;
            return new ar2(j, str.length() == 0 ? null : str, changeProfileOrChatPhoto.chatId, r60Var, changeProfileOrChatPhoto.lastModified);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
