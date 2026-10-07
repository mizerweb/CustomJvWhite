package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Map;
import ru.ok.tamtam.nano.Protos;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vkg {
    public static ce9 a(byte[] bArr) {
        try {
            Protos.LogEvent logEvent = (Protos.LogEvent) sia.mergeFrom(new Protos.LogEvent(), bArr);
            long j = logEvent.time;
            String str = logEvent.type;
            String str2 = logEvent.event;
            byte[] bArr2 = logEvent.params;
            return new ce9(logEvent.userId, logEvent.sessionId, j, str, str2, bArr2 != null ? (Map) ch3.k(bArr2) : new mw(0));
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.o(e);
            return null;
        }
    }
}
