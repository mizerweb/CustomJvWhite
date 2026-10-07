package ru.ok.android.externcalls.sdk.participant;

import defpackage.bnf;
import defpackage.cqk;
import defpackage.d12;
import defpackage.dnf;
import defpackage.du1;
import defpackage.e12;
import defpackage.e9i;
import defpackage.f12;
import defpackage.g12;
import defpackage.h12;
import defpackage.hi1;
import defpackage.su1;
import defpackage.t91;
import defpackage.tu1;
import defpackage.u91;
import defpackage.uu1;
import defpackage.uv8;
import defpackage.v91;
import defpackage.vu1;
import defpackage.vv8;
import defpackage.w91;
import defpackage.wu1;
import defpackage.x91;
import defpackage.xw3;
import defpackage.y91;
import defpackage.yt1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.id.CallExternalIdConverter;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002DEB?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010@R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010AR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010BR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010C¨\u0006F"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater;", "Ly91;", "Lwu1;", "Lh12;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "listener", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "statesManager", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;", "localIdMappings", "Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MappingUpdater;", "mappingUpdater", "Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MeChanger;", "meChanger", "<init>", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MappingUpdater;Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MeChanger;)V", "Lsu1;", "params", "Lsbi;", "onCallParticipantsAdded", "(Lsu1;)V", "Lt91;", "onActiveParticipantsAdded", "(Lt91;)V", "Ltu1;", "onCallParticipantsChanged", "(Ltu1;)V", "Lu91;", "onActiveParticipantsChanged", "(Lu91;)V", "Luu1;", "onCallParticipantsDeAnonimized", "(Luu1;)V", "Lv91;", "onActiveParticipantsDeAnonimized", "(Lv91;)V", "Lvu1;", "onCallParticipantsRemoved", "(Lvu1;)V", "Lw91;", "onActiveParticipantsRemoved", "(Lw91;)V", "Lx91;", "onActiveParticipantUpdated", "(Lx91;)V", "Ld12;", "onCurrentParticipantActiveRoomChanged", "(Ld12;)V", "Lg12;", "onRoomUpdated", "(Lg12;)V", "Le12;", "onCurrentParticipantInvitedToRoom", "(Le12;)V", "Lf12;", "onRoomRemoved", "(Lf12;)V", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;", "Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MappingUpdater;", "Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MeChanger;", "MappingUpdater", "MeChanger", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ParticipantsUpdater implements y91, wu1, h12 {
    private final IdMappingWrapper idMappingWrapper;
    private final ConversationEventsListener listener;
    private final LocalIdMappings localIdMappings;
    private final MappingUpdater mappingUpdater;
    private final MeChanger meChanger;
    private final ParticipantStatesManagerImpl statesManager;
    private final ParticipantStore store;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MappingUpdater;", "", "Lsbi;", "triggerMapUpdate", "()V", "reportIfApplicable", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface MappingUpdater {
        void reportIfApplicable();

        void triggerMapUpdate();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MeChanger;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantExternalId", "Lsbi;", "updateMyExternalId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface MeChanger {
        void updateMyExternalId(ParticipantId participantExternalId);
    }

    public ParticipantsUpdater(ConversationEventsListener conversationEventsListener, ParticipantStore participantStore, ParticipantStatesManagerImpl participantStatesManagerImpl, IdMappingWrapper idMappingWrapper, LocalIdMappings localIdMappings, MappingUpdater mappingUpdater, MeChanger meChanger) {
        this.listener = conversationEventsListener;
        this.store = participantStore;
        this.statesManager = participantStatesManagerImpl;
        this.idMappingWrapper = idMappingWrapper;
        this.localIdMappings = localIdMappings;
        this.mappingUpdater = mappingUpdater;
        this.meChanger = meChanger;
    }

    @Override // defpackage.y91
    public void onActiveParticipantUpdated(x91 params) {
        this.store.setActiveSessionRoom(params.c, params.d);
        ConversationEventsListener conversationEventsListener = this.listener;
        Collection<ConversationParticipant> collection = params.b;
        if ((collection instanceof uv8) && !(collection instanceof vv8)) {
            e9i.I0(collection, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            conversationEventsListener.onParticipantsUpdated(collection);
        } catch (ClassCastException e) {
            cqk.J(e, e9i.class.getName());
            throw e;
        }
    }

    @Override // defpackage.y91
    public void onActiveParticipantsAdded(t91 params) {
    }

    @Override // defpackage.y91
    public void onActiveParticipantsChanged(u91 params) {
    }

    @Override // defpackage.y91
    public void onActiveParticipantsDeAnonimized(v91 params) {
    }

    @Override // defpackage.y91
    public void onActiveParticipantsRemoved(w91 params) {
    }

    @Override // defpackage.wu1
    public void onCallParticipantsAdded(su1 params) {
        List<du1> list = params.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (du1 du1Var : list) {
            ParticipantStore participantStore = this.store;
            yt1 yt1Var = du1Var.a;
            if (yt1Var != null) {
                ConversationParticipant byInternal = participantStore.getByInternal(yt1Var);
                ParticipantId participantIdConvert = CallExternalIdConverter.convert(du1Var.q);
                if (participantIdConvert != null) {
                    this.idMappingWrapper.addMapping(participantIdConvert, du1Var.a);
                    if (byInternal == null) {
                        byInternal = this.store.getParticipantById(participantIdConvert);
                    }
                }
                arrayList.add(byInternal);
            }
        }
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                xw3.V0();
                throw null;
            }
            du1 du1Var2 = (du1) obj;
            ConversationParticipant conversationParticipant = (ConversationParticipant) arrayList.get(i);
            if (conversationParticipant == null) {
                yt1 yt1Var2 = du1Var2.a;
                if (yt1Var2 != null) {
                    ConversationParticipant conversationParticipantCreateConversationParticipantFromInternal = ConversationParticipantExtensionsKt.createConversationParticipantFromInternal(yt1Var2, this.idMappingWrapper);
                    ConversationParticipantExtensionsKt.setCallParticipantExt(conversationParticipantCreateConversationParticipantFromInternal, du1Var2, this.localIdMappings);
                    this.store.add(conversationParticipantCreateConversationParticipantFromInternal, params.a);
                    z = true;
                }
            } else {
                if (conversationParticipant.getCallParticipant() == null) {
                    ConversationParticipantExtensionsKt.setCallParticipantExt(conversationParticipant, du1Var2, this.localIdMappings);
                }
                z2 = true;
            }
            i = i2;
        }
        if (z) {
            this.mappingUpdater.triggerMapUpdate();
        }
        if (z2) {
            this.mappingUpdater.reportIfApplicable();
        }
    }

    @Override // defpackage.wu1
    public void onCallParticipantsChanged(tu1 params) {
        ConversationParticipant participantById;
        ArrayList arrayList = new ArrayList();
        for (du1 du1Var : params.a) {
            ParticipantStore participantStore = this.store;
            yt1 yt1Var = du1Var.a;
            if (yt1Var != null) {
                ConversationParticipant byInternal = participantStore.getByInternal(yt1Var);
                if (byInternal != null) {
                    if (byInternal.getCallParticipant() == null) {
                        ConversationParticipantExtensionsKt.setCallParticipantExt(byInternal, du1Var, this.localIdMappings);
                    }
                    if (ConversationParticipantExtensionsKt.isReportedExt(byInternal)) {
                        arrayList.add(byInternal);
                    }
                } else {
                    ParticipantId participantIdConvert = CallExternalIdConverter.convert(du1Var.q);
                    if (participantIdConvert != null && (participantById = this.store.getParticipantById(participantIdConvert)) != null) {
                        ConversationParticipantExtensionsKt.setCallParticipantExt(participantById, du1Var, this.localIdMappings);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.listener.onParticipantsChanged(arrayList);
    }

    @Override // defpackage.wu1
    public void onCallParticipantsDeAnonimized(uu1 params) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (du1 du1Var : params.a) {
            ParticipantStore participantStore = this.store;
            yt1 yt1Var = du1Var.a;
            if (yt1Var != null) {
                ConversationParticipant byInternal = participantStore.getByInternal(yt1Var);
                hi1 hi1Var = du1Var.q;
                if (byInternal != null && hi1Var != null && !cqk.d(hi1Var.a, byInternal.getExternalId().id)) {
                    ParticipantId externalId = byInternal.getExternalId();
                    ParticipantId participantIdConvert = CallExternalIdConverter.convert(hi1Var);
                    if (participantIdConvert != null) {
                        ConversationParticipantExtensionsKt.deAnonymizeExt(byInternal, du1Var, externalId, participantIdConvert, this.localIdMappings);
                        yt1 yt1Var2 = du1Var.a;
                        ConversationParticipant me2 = this.store.getMe();
                        if (cqk.d(yt1Var2, me2 != null ? me2.getInternalId() : null)) {
                            this.meChanger.updateMyExternalId(participantIdConvert);
                        }
                        if (ConversationParticipantExtensionsKt.isReportedExt(byInternal)) {
                            arrayList.add(byInternal);
                            linkedHashMap.put(participantIdConvert, externalId);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.listener.onParticipantsDeAnonymized(arrayList, linkedHashMap);
    }

    @Override // defpackage.wu1
    public void onCallParticipantsRemoved(vu1 params) {
        ConversationParticipant byInternal;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (du1 du1Var : params.a) {
            yt1 yt1Var = du1Var.a;
            if (yt1Var != null && (byInternal = this.store.getByInternal(yt1Var)) != null) {
                if (byInternal.getCallParticipant() == null) {
                    ConversationParticipantExtensionsKt.setCallParticipantExt(byInternal, du1Var, this.localIdMappings);
                }
                hashSet.add(yt1Var);
                if (ConversationParticipantExtensionsKt.isReportedExt(byInternal)) {
                    arrayList.add(byInternal);
                }
            }
        }
        this.store.removeByInternal(hashSet);
        if (arrayList.isEmpty()) {
            return;
        }
        this.statesManager.onParticipantsRemoved(arrayList);
        this.listener.onParticipantsRemoved(arrayList);
    }

    @Override // defpackage.h12
    public void onCurrentParticipantActiveRoomChanged(d12 params) {
        this.store.setActiveSessionRoom(params.a, params.b);
        this.mappingUpdater.reportIfApplicable();
    }

    @Override // defpackage.h12
    public void onCurrentParticipantInvitedToRoom(e12 params) {
        this.store.setProposedSessionRoom(params.b, params.c);
    }

    @Override // defpackage.h12
    public void onRoomRemoved(f12 params) {
        dnf proposedRoomId = this.store.getProposedRoomId();
        dnf dnfVar = params.a;
        boolean zD = cqk.d(proposedRoomId, dnfVar);
        bnf bnfVar = bnf.a;
        if (zD) {
            this.store.setProposedSessionRoom(bnfVar, null);
        }
        if (cqk.d(this.store.getActiveRoomId(), dnfVar)) {
            this.store.setActiveSessionRoom(bnfVar, null);
        }
    }

    @Override // defpackage.h12
    public void onRoomUpdated(g12 params) {
        this.store.maybeUpdateRoom(params.b);
    }
}
