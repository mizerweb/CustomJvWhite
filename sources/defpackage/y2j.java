package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y2j {
    public static z2j a(byte[] bArr) throws ProtoException {
        Object obj;
        try {
            Tasks.VideoPlay videoPlay = (Tasks.VideoPlay) sia.mergeFrom(new Tasks.VideoPlay(), bArr);
            long j = videoPlay.requestId;
            long j2 = videoPlay.videoId;
            long j3 = videoPlay.chatServerId;
            long j4 = videoPlay.messageServerId;
            long j5 = videoPlay.messageId;
            String str = videoPlay.attachLocalId;
            boolean z = videoPlay.startDownload;
            boolean z2 = videoPlay.saveToGallery;
            String str2 = videoPlay.token;
            int i = videoPlay.place;
            y1 y1Var = new y1(0, ns5.k);
            while (true) {
                if (!y1Var.hasNext()) {
                    obj = null;
                    break;
                }
                Object next = y1Var.next();
                if (((ns5) next).a == i) {
                    obj = next;
                    break;
                }
            }
            ns5 ns5Var = (ns5) obj;
            if (ns5Var == null) {
                ns5Var = ns5.UNKNOWN;
            }
            return new z2j(j, j2, j3, j4, j5, str, z, z2, str2, false, ns5Var);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
