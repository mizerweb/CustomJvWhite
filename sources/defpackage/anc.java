package defpackage;

import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes.dex */
public abstract class anc {
    public static final fu1 a(ParticipantId participantId) {
        Integer numB0;
        List listM1 = r5h.m1(participantId.id, new String[]{":"}, 6);
        int iIntValue = 0;
        if (listM1.size() > 1 && (numB0 = y5h.B0((String) listM1.get(1))) != null) {
            iIntValue = numB0.intValue();
        }
        return new fu1(Long.parseLong((String) ww3.r1(listM1)), iIntValue);
    }

    public static final ParticipantId b(long j) {
        return ParticipantId.authorized(String.valueOf(j));
    }

    public static final ParticipantId c(fu1 fu1Var) {
        return new ParticipantId(String.valueOf(fu1Var.a), false, fu1Var.b);
    }
}
