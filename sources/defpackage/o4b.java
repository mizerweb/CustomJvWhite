package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o4b {
    public static p4b a(byte[] bArr) throws ProtoException {
        j61 j61Var;
        try {
            Tasks.MsgSendCallback msgSendCallback = (Tasks.MsgSendCallback) sia.mergeFrom(new Tasks.MsgSendCallback(), bArr);
            long j = msgSendCallback.requestId;
            String str = msgSendCallback.callbackId;
            String str2 = msgSendCallback.payload;
            long j2 = msgSendCallback.timestamp;
            long j3 = msgSendCallback.messageId;
            Tasks.MsgSendCallback.ButtonPosition buttonPosition = msgSendCallback.buttonPosition;
            g61 g61Var = new g61(buttonPosition.row, buttonPosition.column);
            String str3 = msgSendCallback.buttonType;
            j61[] j61VarArr = j61.k;
            int length = j61VarArr.length;
            for (int i = 0; i < length; i++) {
                j61Var = j61VarArr[i];
                if (j61Var.a.equalsIgnoreCase(str3)) {
                    return new p4b(j, str, str2, j2, j3, g61Var, j61Var);
                }
            }
            j61Var = j61.UNKNOWN;
            return new p4b(j, str, str2, j2, j3, g61Var, j61Var);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
