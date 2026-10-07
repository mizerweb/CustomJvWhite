package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xjd {
    public static akd a(byte[] bArr) throws ProtoException {
        try {
            Tasks.Profile profile = (Tasks.Profile) sia.mergeFrom(new Tasks.Profile(), bArr);
            Tasks.Rect rect = profile.crop;
            return new akd(profile.requestId, profile.firstName, profile.lastName, profile.photoToken, profile.photoId, rect != null ? new r60(rect.left, rect.top, rect.right, rect.bottom, 2) : null, profile.description, profile.link, profile.avatarType.equals("PRESET_AVATAR") ? 1 : 2);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
