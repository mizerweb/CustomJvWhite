package defpackage;

import java.util.Set;
import one.video.calls.sdk.error.ParticipantLimitExceededException;
import one.video.calls.sdk.error.ServiceUnavailableException;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n0m {
    public static int a(long j) {
        lvb.N(j, "out of range: %s", (j >> 32) == 0);
        return (int) j;
    }

    public static final ConversationEndReason b(it7 it7Var, gt7 gt7Var) {
        String str;
        Set set;
        Set set2;
        String str2 = null;
        switch (it7Var == null ? -1 : jt7.$EnumSwitchMapping$0[it7Var.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                ore.o();
                return null;
            case 1:
                return ConversationEndReason.SignalingTimeout.INSTANCE;
            case 2:
                return ConversationEndReason.Busy.INSTANCE;
            case 3:
                return ConversationEndReason.Missed.INSTANCE;
            case 4:
                return ConversationEndReason.Rejected.INSTANCE;
            case 5:
                if (gt7Var == null || (str = gt7Var.c) == null) {
                    str = "Unknown call error";
                }
                return new ConversationEndReason.Error(new RuntimeException(str));
            case 6:
                return ConversationEndReason.Hangup.INSTANCE;
            case 7:
                ft7 ft7Var = ft7.RINGING_TIMEOUT;
                ConversationEndReason.Canceled.Source source = (gt7Var == null || (set2 = gt7Var.a) == null || !set2.contains(ft7Var)) ? ConversationEndReason.Canceled.Source.PARTICIPANT : ConversationEndReason.Canceled.Source.RINGING_TIMEOUT;
                if (gt7Var != null && (set = gt7Var.a) != null && set.contains(ft7Var)) {
                    str2 = gt7Var.c;
                }
                return new ConversationEndReason.Canceled(source, str2);
            case 8:
                return ConversationEndReason.CallTimeout.INSTANCE;
            case 9:
                return ConversationEndReason.RemovedFromCall.INSTANCE;
            case 10:
                return new ConversationEndReason.ObsoleteClient(gt7Var != null ? gt7Var.b : null, gt7Var != null ? gt7Var.c : null);
            case 11:
                return new ConversationEndReason.Error(new ServiceUnavailableException());
            case 12:
                return new ConversationEndReason.Error(new ParticipantLimitExceededException("Participant limit exceeded"));
            case 13:
                return ConversationEndReason.Banned.INSTANCE;
            case 14:
                return ConversationEndReason.AcceptedOnAnotherDevice.INSTANCE;
            case 15:
                return ConversationEndReason.EndedForAll.INSTANCE;
            case 16:
                return ConversationEndReason.KilledWithoutDelete.INSTANCE;
            case 17:
                return ConversationEndReason.SocketClosed.INSTANCE;
            case 18:
                return ConversationEndReason.InitiallyClosed.INSTANCE;
        }
    }
}
