package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n3b {
    public static o3b a(byte[] bArr) throws ProtoException {
        try {
            Tasks.MsgEdit msgEdit = (Tasks.MsgEdit) sia.mergeFrom(new Tasks.MsgEdit(), bArr);
            Protos.Attaches attaches = msgEdit.oldAttaches;
            List list = attaches != null ? (List) a.e(attaches).a : null;
            Protos.MessageElements messageElements = msgEdit.oldElements;
            ArrayList arrayListA = messageElements != null ? dga.a(messageElements.elements) : null;
            long j = msgEdit.requestId;
            long j2 = msgEdit.chatId;
            long j3 = msgEdit.messageId;
            long j4 = msgEdit.chatServerId;
            long j5 = msgEdit.messageServerId;
            String str = msgEdit.text;
            String str2 = msgEdit.oldText;
            int i = msgEdit.oldStatus;
            wja[] wjaVarArrValues = wja.values();
            int length = wjaVarArrValues.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2;
                wja wjaVar = wjaVarArrValues[i3];
                int i4 = length;
                if (wjaVar.a == i) {
                    return new o3b(j, j2, j3, j4, j5, str, str2, wjaVar, list, arrayListA, msgEdit.editAttaches);
                }
                i2 = i3 + 1;
                length = i4;
            }
            ore.f("Array contains no element matching the predicate.");
            return null;
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
