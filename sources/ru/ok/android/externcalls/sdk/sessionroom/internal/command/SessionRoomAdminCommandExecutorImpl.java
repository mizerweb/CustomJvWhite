package ru.ok.android.externcalls.sdk.sessionroom.internal.command;

import defpackage.a9;
import defpackage.af7;
import defpackage.cf7;
import defpackage.cnf;
import defpackage.dnf;
import defpackage.eje;
import defpackage.kql;
import defpackage.nb;
import defpackage.nfi;
import defpackage.nx;
import defpackage.ofi;
import defpackage.pfi;
import defpackage.q4g;
import defpackage.sbi;
import defpackage.vj7;
import defpackage.yeh;
import defpackage.ymf;
import defpackage.yt1;
import defpackage.yw3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.admin.AssignParticipantsToRoomsParams;
import ru.ok.android.externcalls.sdk.sessionroom.admin.MoveParticipantParams;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJg\u0010\u0014\u001a\u00020\u00132\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u000e\u0012\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b0\t2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u000e\u0012\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b0\t2\u001a\u0010\u0012\u001a\u0016\u0012\b\u0012\u00060\fj\u0002`\r\u0012\b\u0012\u00060\u0010j\u0002`\u00110\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010!\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020 2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b!\u0010\"J=\u0010$\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020#2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b$\u0010%J=\u0010&\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00132\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b&\u0010'J=\u0010)\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020(2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b)\u0010*J=\u0010,\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020+2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/¨\u00060"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutorBase;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "participantDataProvider", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;)V", "", "Lcnf;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "addToRooms", "removeFromRooms", "Lyt1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "externalToInternalIdsMap", "Lpfi;", "buildUpdateRoomsParams", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lpfi;", "La9;", "params", "Lkotlin/Function0;", "Lsbi;", "onSuccess", "Lkotlin/Function1;", "", "onError", "activateRooms", "(La9;Laf7;Lcf7;)V", "Leje;", "removeRooms", "(Leje;Laf7;Lcf7;)V", "Lyeh;", "switchRoom", "(Lyeh;Laf7;Lcf7;)V", "updateRooms", "(Lpfi;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;", "assignParticipantsToRooms", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;", "moveParticipant", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SessionRoomAdminCommandExecutorImpl extends SessionRoomCommandExecutorBase implements SessionRoomAdminCommandExecutor {
    private final SessionRoomParticipantsDataProviderImpl participantDataProvider;
    private final SignalingProvider signalingProvider;

    public SessionRoomAdminCommandExecutorImpl(SignalingProvider signalingProvider, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl) {
        this.signalingProvider = signalingProvider;
        this.participantDataProvider = sessionRoomParticipantsDataProviderImpl;
    }

    private static final void activateRooms$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    private final pfi buildUpdateRoomsParams(Map<cnf, ? extends List<ParticipantId>> addToRooms, Map<cnf, ? extends List<ParticipantId>> removeFromRooms, Map<ParticipantId, yt1> externalToInternalIdsMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashSet<cnf> linkedHashSet = new LinkedHashSet();
        for (Map.Entry<cnf, ? extends List<ParticipantId>> entry : addToRooms.entrySet()) {
            linkedHashSet.add(entry.getKey());
            Iterator<ParticipantId> it = entry.getValue().iterator();
            while (it.hasNext()) {
                yt1 yt1Var = externalToInternalIdsMap.get(it.next());
                if (yt1Var != null) {
                    cnf key = entry.getKey();
                    Object arrayList = linkedHashMap.get(key);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(key, arrayList);
                    }
                    ((List) arrayList).add(yt1Var);
                }
            }
        }
        for (Map.Entry<cnf, ? extends List<ParticipantId>> entry2 : removeFromRooms.entrySet()) {
            linkedHashSet.add(entry2.getKey());
            Iterator<ParticipantId> it2 = entry2.getValue().iterator();
            while (it2.hasNext()) {
                yt1 yt1Var2 = externalToInternalIdsMap.get(it2.next());
                if (yt1Var2 != null) {
                    cnf key2 = entry2.getKey();
                    Object arrayList2 = linkedHashMap2.get(key2);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap2.put(key2, arrayList2);
                    }
                    ((List) arrayList2).add(yt1Var2);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(yw3.W0(linkedHashSet, 10));
        for (cnf cnfVar : linkedHashSet) {
            nfi nfiVar = new nfi();
            nfiVar.a = cnfVar;
            List list = (List) linkedHashMap.get(cnfVar);
            if (list != null) {
                nfiVar.b = list;
            }
            List list2 = (List) linkedHashMap2.get(cnfVar);
            if (list2 != null) {
                nfiVar.c = list2;
            }
            arrayList4.add(nfiVar);
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = new ArrayList(yw3.W0(arrayList3, 10));
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            nfi nfiVar2 = (nfi) obj;
            arrayList5.add(new ofi(nfiVar2.a, nfiVar2.b, nfiVar2.c));
        }
        return new pfi(arrayList5);
    }

    public static final sbi moveParticipant$lambda$0(SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl, MoveParticipantParams moveParticipantParams, af7 af7Var, cf7 cf7Var, yt1 yt1Var) throws JSONException {
        dnf toRoomId = moveParticipantParams.getToRoomId();
        toRoomId.getClass();
        sessionRoomAdminCommandExecutorImpl.switchRoom(new yeh(yt1Var, toRoomId), af7Var, cf7Var);
        return sbi.a;
    }

    private static final void removeRooms$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void switchRoom$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void updateRooms$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void activateRooms(a9 params, af7 onSuccess, cf7 onError) {
        throw null;
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void assignParticipantsToRooms(AssignParticipantsToRoomsParams params, af7 onSuccess, cf7 onError) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(yw3.X0(params.getAddParticipantsToRoomsMap().values()));
            linkedHashSet.addAll(yw3.X0(params.getRemoveParticipantsFromRoomsMap().values()));
            updateRooms(buildUpdateRoomsParams(params.getAddParticipantsToRoomsMap(), params.getRemoveParticipantsFromRoomsMap(), this.participantDataProvider.getInternalIdsByExternal(linkedHashSet)), onSuccess, onError);
        } catch (Throwable th) {
            if (onError != null) {
                onError.invoke(th);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void moveParticipant(MoveParticipantParams params, af7 onSuccess, cf7 onError) throws JSONException {
        ParticipantId participantId = params.getParticipantId();
        if (participantId != null) {
            this.participantDataProvider.resolveInternalIdByExternal(participantId, new nb(this, params, onSuccess, onError, 6), onError);
            return;
        }
        dnf toRoomId = params.getToRoomId();
        toRoomId.getClass();
        switchRoom(new yeh(null, toRoomId), onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void removeRooms(eje params, af7 onSuccess, cf7 onError) {
        throw null;
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void switchRoom(yeh params, af7 onSuccess, cf7 onError) throws JSONException {
        q4g q4gVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (q4gVar == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "switch-room");
        dnf dnfVar = params.a;
        if (dnfVar != null && (dnfVar instanceof cnf)) {
            jSONObject.put("toRoomId", ((cnf) dnfVar).a);
        }
        yt1 yt1Var = params.b;
        if (yt1Var != null) {
            jSONObject.put("participantId", yt1Var.b());
        }
        q4gVar.d(new vj7(jSONObject, 0), false, new nx(8, onSuccess), new ymf(this, onError, 0));
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void updateRooms(pfi params, af7 onSuccess, cf7 onError) throws JSONException {
        q4g q4gVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (q4gVar == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-rooms");
        ArrayList<ofi> arrayList = params.a;
        JSONArray jSONArray = new JSONArray();
        for (ofi ofiVar : arrayList) {
            JSONObject jSONObject2 = new JSONObject();
            cnf cnfVar = ofiVar.a;
            if (cnfVar != null) {
                jSONObject2.put("id", cnfVar.a);
            }
            kql.e(jSONObject2, "addParticipantIds", ofiVar.b);
            kql.e(jSONObject2, "removeParticipantIds", ofiVar.c);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("rooms", jSONArray);
        q4gVar.d(new vj7(jSONObject, 0), false, new nx(9, onSuccess), new ymf(this, onError, 1));
    }
}
