package ru.ok.android.externcalls.sdk;

import defpackage.bu1;
import defpackage.du1;
import defpackage.hi1;
import defpackage.idb;
import defpackage.o0a;
import defpackage.r1b;
import defpackage.yt1;
import defpackage.zo5;
import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.capabilities.ClientCapabilities;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.local.LocalParticipantId;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;

/* JADX INFO: loaded from: classes3.dex */
public class ConversationParticipant {
    private static final String LOG_TAG = "ConversationParticipant";
    private du1 callParticipant;
    private ParticipantId externalId;
    private yt1 internalId;
    private boolean reported;
    private final LocalParticipantId localParticipantId = LocalParticipantId.nextId();
    private int capabilities = 0;

    private ConversationParticipant() {
    }

    public static ConversationParticipant fromExternal(ParticipantId participantId, IdMappingWrapper idMappingWrapper) {
        ConversationParticipant conversationParticipant = new ConversationParticipant();
        conversationParticipant.setExternalId(participantId);
        yt1 byExternal = idMappingWrapper.getByExternal(participantId);
        if (byExternal != null) {
            conversationParticipant.setInternalId(byExternal);
        }
        return conversationParticipant;
    }

    public static ConversationParticipant fromInternal(yt1 yt1Var, IdMappingWrapper idMappingWrapper) {
        ConversationParticipant conversationParticipant = new ConversationParticipant();
        conversationParticipant.setInternalId(yt1Var);
        ParticipantId byInternal = idMappingWrapper.getByInternal(yt1Var);
        if (byInternal != null) {
            conversationParticipant.setExternalId(byInternal);
        }
        return conversationParticipant;
    }

    public void deAnonymize(du1 du1Var, ParticipantId participantId, ParticipantId participantId2, LocalIdMappings localIdMappings) {
        this.externalId = participantId2;
        this.callParticipant = du1Var;
        localIdMappings.deAnonymizeMapping(participantId, this);
    }

    public long getAcceptCallEpochMs() {
        du1 du1Var = this.callParticipant;
        if (du1Var != null) {
            return du1Var.n;
        }
        return 0L;
    }

    public String getAcceptedCallClientType() {
        du1 du1Var = this.callParticipant;
        if (du1Var == null) {
            return null;
        }
        return du1Var.l;
    }

    public String getAcceptedCallPlatform() {
        du1 du1Var = this.callParticipant;
        if (du1Var == null) {
            return null;
        }
        return du1Var.m;
    }

    public o0a getAudioOptionState() {
        du1 du1Var = this.callParticipant;
        return du1Var != null ? du1Var.b.a : o0a.a;
    }

    public du1 getCallParticipant() {
        return this.callParticipant;
    }

    public ClientCapabilities getCapabilities() {
        int i;
        du1 du1Var = this.callParticipant;
        int i2 = du1Var != null ? du1Var.s : 0;
        if (i2 == 0 && (i = this.capabilities) != 0) {
            i2 = i;
        }
        return ClientCapabilities.from(i2);
    }

    public ParticipantId getExternalId() {
        return this.externalId;
    }

    public yt1 getInternalId() {
        return this.internalId;
    }

    public LocalParticipantId getLocalParticipantId() {
        return this.localParticipantId;
    }

    public List<r1b> getMovies() {
        du1 du1Var = this.callParticipant;
        return du1Var == null ? Collections.EMPTY_LIST : du1Var.r;
    }

    public idb getNetworkStatus() {
        du1 du1Var = this.callParticipant;
        return du1Var == null ? idb.a : du1Var.j;
    }

    public o0a getScreenshareOptionState() {
        du1 du1Var = this.callParticipant;
        return du1Var != null ? du1Var.b.c : o0a.a;
    }

    public o0a getVideoOptionState() {
        du1 du1Var = this.callParticipant;
        return du1Var != null ? du1Var.b.b : o0a.a;
    }

    public o0a getWatchTogetherOptionState() {
        du1 du1Var = this.callParticipant;
        return du1Var != null ? du1Var.b.d : o0a.a;
    }

    public boolean hasRegisteredPeers() {
        du1 du1Var = this.callParticipant;
        if (du1Var != null) {
            return (du1Var.k == null && du1Var.f.isEmpty()) ? false : true;
        }
        return false;
    }

    public boolean isAdmin() {
        du1 du1Var = this.callParticipant;
        return du1Var != null && du1Var.e.contains(bu1.b);
    }

    public boolean isAnimojiEnabled() {
        du1 du1Var = this.callParticipant;
        return du1Var != null && du1Var.c.g;
    }

    public boolean isAudioEnabled() {
        du1 du1Var = this.callParticipant;
        return du1Var != null && du1Var.c.e;
    }

    public boolean isCallAccepted() {
        du1 du1Var = this.callParticipant;
        return du1Var != null && du1Var.c();
    }

    public boolean isConnected() {
        du1 du1Var = this.callParticipant;
        return du1Var != null && du1Var.h;
    }

    public boolean isCreator() {
        du1 du1Var = this.callParticipant;
        return du1Var != null && du1Var.e.contains(bu1.a);
    }

    public boolean isPrimarySpeaker() {
        du1 du1Var = this.callParticipant;
        return du1Var != null && du1Var.d();
    }

    public boolean isReported() {
        return this.reported;
    }

    public boolean isScreenCaptureEnabled() {
        du1 du1Var = this.callParticipant;
        return du1Var != null && du1Var.c.b;
    }

    public boolean isTalking() {
        du1 du1Var = this.callParticipant;
        return du1Var != null && du1Var.e();
    }

    public boolean isUseable() {
        du1 du1Var;
        return (!isReported() || (du1Var = this.callParticipant) == null || du1Var.a == null) ? false : true;
    }

    public boolean isVideoEnabled() {
        du1 du1Var = this.callParticipant;
        return du1Var != null && du1Var.c.f;
    }

    public void setCallParticipant(du1 du1Var, LocalIdMappings localIdMappings) {
        this.callParticipant = du1Var;
        if (du1Var != null) {
            this.internalId = du1Var.a;
        }
        localIdMappings.addMappings(this);
    }

    public void setCapabilities(ClientCapabilities clientCapabilities) {
        this.capabilities = clientCapabilities.getValue();
    }

    public void setDeviceIndex(int i, LocalIdMappings localIdMappings) {
        yt1 yt1Var;
        GlobalRTCLogger globalRTCLogger = GlobalRTCLogger.INSTANCE;
        StringBuilder sbY = zo5.y(i, "updateDeviceIndex ", " for ");
        sbY.append(this.externalId);
        GlobalRTCLogger.log(LOG_TAG, sbY.toString());
        if (this.externalId != null) {
            ParticipantId participantId = this.externalId;
            this.externalId = new ParticipantId(participantId.id, participantId.isAnon, i);
        }
        yt1 yt1Var2 = this.internalId;
        if (yt1Var2 != null) {
            this.internalId = new yt1(yt1Var2.b, i, yt1Var2.a);
        }
        du1 du1Var = this.callParticipant;
        if (du1Var != null && (yt1Var = du1Var.a) != null) {
            du1Var.a = new yt1(yt1Var.b, i, yt1Var.a);
            hi1 hi1Var = du1Var.q;
            if (hi1Var != null) {
                du1Var.q = new hi1(hi1Var.a, hi1Var.b, i);
            }
        }
        localIdMappings.addMappings(this);
    }

    public void setExternalId(ParticipantId participantId) {
        this.externalId = participantId;
    }

    public void setInternalId(yt1 yt1Var) {
        this.internalId = yt1Var;
        du1 du1Var = this.callParticipant;
        if (du1Var != null) {
            du1Var.a = yt1Var;
        }
    }

    public void setReported(boolean z) {
        this.reported = z;
    }

    public String toString() {
        return this.externalId + "|" + this.internalId + "|" + this.callParticipant;
    }
}
