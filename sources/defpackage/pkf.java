package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class pkf {
    public static rkf a(byte[] bArr) throws ProtoException {
        try {
            Tasks.LocationRequest locationRequest = (Tasks.LocationRequest) sia.mergeFrom(new Tasks.LocationRequest(), bArr);
            return new rkf(locationRequest.requestId, locationRequest.messageId, locationRequest.liveLocation);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
