package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jp2 {
    public static op2 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.ChangeChatPhoto changeChatPhoto = (Tasks.ChangeChatPhoto) sia.mergeFrom(new Tasks.ChangeChatPhoto(), bArr);
            Tasks.Rect rect = changeChatPhoto.crop;
            r60 r60Var = rect != null ? new r60(rect.left, rect.top, rect.right, rect.bottom, 2) : null;
            long j = changeChatPhoto.requestId;
            String str = changeChatPhoto.file;
            return new op2(j, str.length() == 0 ? null : str, changeChatPhoto.chatId, r60Var, changeChatPhoto.lastModified);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
