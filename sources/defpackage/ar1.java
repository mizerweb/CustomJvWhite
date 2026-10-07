package defpackage;

import java.util.List;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* JADX INFO: loaded from: classes3.dex */
public final class ar1 {
    public final ny8 a;

    public ar1(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final gu1 a(Conversation conversation, ConversationParticipant conversationParticipant, boolean z, boolean z2) {
        fu1 fu1Var;
        int i;
        fu1 fu1VarA = anc.a(conversationParticipant.getExternalId());
        o0a audioOptionState = conversationParticipant.getAudioOptionState();
        o0a videoOptionState = conversationParticipant.getVideoOptionState();
        o0a screenshareOptionState = conversationParticipant.getScreenshareOptionState();
        boolean zIsAudioEnabled = conversationParticipant.isAudioEnabled();
        boolean zBooleanValue = (z && conversationParticipant.isScreenCaptureEnabled()) ? ((Boolean) ((z3f) this.a.getValue()).b.getValue()).booleanValue() : false;
        p4j p4jVar = new p4j(conversationParticipant.isVideoEnabled(), new ConversationVideoTrackParticipantKey.Builder().setParticipantId(conversationParticipant.getExternalId()).setType(v4j.a).build(), z);
        p4j p4jVar2 = new p4j(conversationParticipant.isScreenCaptureEnabled(), new ConversationVideoTrackParticipantKey.Builder().setParticipantId(conversationParticipant.getExternalId()).setType(v4j.b).build(), false);
        boolean zIsCallAccepted = conversationParticipant.isCallAccepted();
        long acceptCallEpochMs = conversationParticipant.getAcceptCallEpochMs();
        boolean zIsConnected = conversationParticipant.isConnected();
        boolean zIsPrimarySpeaker = conversationParticipant.isPrimarySpeaker();
        boolean zIsTalking = conversationParticipant.isTalking();
        boolean zIsHandRaised = conversation.getParticipantStatesManager().isHandRaised(conversationParticipant.getExternalId());
        boolean zIsCreator = conversationParticipant.isCreator();
        boolean zIsAdmin = conversationParticipant.isAdmin();
        List<r1b> movies = conversationParticipant.getMovies();
        boolean zHasRegisteredPeers = conversationParticipant.hasRegisteredPeers();
        boolean z3 = conversation.getParticipantMediaStat(conversationParticipant) != null;
        int iOrdinal = conversationParticipant.getNetworkStatus().ordinal();
        if (iOrdinal != 0) {
            fu1Var = fu1VarA;
            if (iOrdinal == 1) {
                i = 2;
            } else {
                if (iOrdinal != 2) {
                    ore.o();
                    return null;
                }
                i = 3;
            }
        } else {
            fu1Var = fu1VarA;
            i = 1;
        }
        return new gu1(fu1Var, audioOptionState, videoOptionState, screenshareOptionState, zIsAudioEnabled, zBooleanValue, p4jVar, p4jVar2, zIsCreator, zIsAdmin, z2, zIsConnected, zIsCallAccepted, acceptCallEpochMs, z, zIsPrimarySpeaker, zIsTalking, zIsHandRaised, zHasRegisteredPeers, z3, movies, i, conversationParticipant.getCallParticipant().t);
    }
}
