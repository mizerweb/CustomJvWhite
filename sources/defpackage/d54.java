package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d54 {
    public static e54 a(byte[] bArr) throws ProtoException {
        Object next;
        try {
            Tasks.Complain complain = (Tasks.Complain) sia.mergeFrom(new Tasks.Complain(), bArr);
            long j = complain.requestId;
            byte b = (byte) complain.typeId;
            y1 y1Var = new y1(0, q54.l);
            do {
                if (!y1Var.hasNext()) {
                    next = null;
                    break;
                }
                next = y1Var.next();
            } while (((q54) next).a != b);
            q54 q54Var = (q54) next;
            if (q54Var == null) {
                ore.p("Required value was null.");
                return null;
            }
            byte b2 = (byte) complain.reasonId;
            long[] jArr = complain.ids;
            long[] jArr2 = complain.serverIds;
            long j2 = complain.parentId;
            Long lValueOf = j2 != 0 ? Long.valueOf(j2) : null;
            String str = complain.details;
            long j3 = complain.postServerId;
            return new e54(j, q54Var, b2, jArr, jArr2, lValueOf, str, j3 != 0 ? Long.valueOf(j3) : null);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
