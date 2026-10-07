package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pq6 {
    public static qq6 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.FileDownloadCmd fileDownloadCmd = (Tasks.FileDownloadCmd) sia.mergeFrom(new Tasks.FileDownloadCmd(), bArr);
            return new qq6(fileDownloadCmd.requestId, fileDownloadCmd.fileId, fileDownloadCmd.fileName, fileDownloadCmd.chatId, fileDownloadCmd.messageId, fileDownloadCmd.attachLocalId);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
