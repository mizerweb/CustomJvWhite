package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tie {
    public static vie a(byte[] bArr) throws ProtoException {
        try {
            Tasks.RemoveContactPhoto removeContactPhoto = (Tasks.RemoveContactPhoto) sia.mergeFrom(new Tasks.RemoveContactPhoto(), bArr);
            return new vie(removeContactPhoto.requestId, removeContactPhoto.photoId);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
