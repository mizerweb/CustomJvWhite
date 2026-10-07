package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.externcalls.sdk.exception.CallTerminatingException;
import ru.ok.android.externcalls.sdk.exception.Domain;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iql {
    public static final String a(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.US).format(date);
    }

    public static final ConversationEndReason b(d5g d5gVar, String str, String str2) {
        str.getClass();
        switch (d5gVar == null ? -1 : r4g.$EnumSwitchMapping$0[d5gVar.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                ore.o();
                return null;
            case 1:
                return new ConversationEndReason.Canceled(ConversationEndReason.Canceled.Source.PARTICIPANT, null);
            case 2:
                return ConversationEndReason.Rejected.INSTANCE;
            case 3:
                return ConversationEndReason.Hangup.INSTANCE;
            case 4:
                return ConversationEndReason.Missed.INSTANCE;
            case 5:
                return ConversationEndReason.SignalingTimeout.INSTANCE;
            case 6:
                return ConversationEndReason.Busy.INSTANCE;
            case 7:
                return new ConversationEndReason.Error(new CallTerminatingException.Builder(Domain.SERVER, str).build());
            case 8:
                return ConversationEndReason.RemovedFromCall.INSTANCE;
            case 9:
                return ConversationEndReason.AcceptedOnAnotherDevice.INSTANCE;
            case 10:
                return ConversationEndReason.EndedForAll.INSTANCE;
            case 11:
                return ConversationEndReason.CallTimeout.INSTANCE;
            case 12:
                return ConversationEndReason.Banned.INSTANCE;
            case 13:
                return ConversationEndReason.KilledWithoutDelete.INSTANCE;
            case 14:
                return ConversationEndReason.SocketClosed.INSTANCE;
            case 15:
                return ConversationEndReason.InitiallyClosed.INSTANCE;
            case 16:
                return new ConversationEndReason.ObsoleteClient(str2, str);
        }
    }
}
