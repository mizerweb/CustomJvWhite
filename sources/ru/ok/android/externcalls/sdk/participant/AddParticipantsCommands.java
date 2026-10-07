package ru.ok.android.externcalls.sdk.participant;

import defpackage.af7;
import defpackage.cf7;
import defpackage.fg7;
import defpackage.hi1;
import defpackage.j95;
import defpackage.kql;
import defpackage.lb;
import defpackage.mb;
import defpackage.n4g;
import defpackage.nb;
import defpackage.o91;
import defpackage.q4g;
import defpackage.qt4;
import defpackage.r66;
import defpackage.sbi;
import defpackage.sg4;
import defpackage.ww3;
import defpackage.yt1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsFailedException;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsResult;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u00011B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u001b\u001a\u00020\u00172\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\"\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160!¢\u0006\u0004\b\"\u0010#Ja\u0010+\u001a\u00020\u00172\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020'2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00152\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100¨\u00062"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/AddParticipantsCommands;", "", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lo91;", "call", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "mappings", "Lkotlin/Function0;", "Lru/ok/android/externcalls/sdk/Conversation$State;", "stateProvider", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lo91;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Laf7;)V", "Lorg/json/JSONObject;", "error", "Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException;", "parseErrorResponse", "(Lorg/json/JSONObject;)Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException;", "Lru/ok/android/externcalls/sdk/participant/add/AddParticipantsFailedException;", "parseAddError", "(Lorg/json/JSONObject;)Lru/ok/android/externcalls/sdk/participant/add/AddParticipantsFailedException;", "Lkotlin/Function1;", "", "Lsbi;", "onError", "Lq4g;", "provideSignaling", "withSignaling", "(Lcf7;Lcf7;)V", "", "link", "Ljava/lang/Runnable;", "onSuccess", "Lsg4;", "addParticipantByLink", "(Ljava/lang/String;Ljava/lang/Runnable;Lsg4;)V", "", "Lhi1;", "participantsIds", "", "isUnban", "isShowChatHistory", "Lru/ok/android/externcalls/sdk/participant/add/AddParticipantsResult;", "addParticipantsExtIds", "(Ljava/util/Collection;Ljava/lang/Boolean;ZLcf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lo91;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Laf7;", "ListenerAddParticipantsResponse", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AddParticipantsCommands {
    private final o91 call;
    private final IdMappingWrapper mappings;
    private final SignalingProvider signalingProvider;
    private final af7 stateProvider;

    public AddParticipantsCommands(SignalingProvider signalingProvider, o91 o91Var, IdMappingWrapper idMappingWrapper, af7 af7Var) {
        this.signalingProvider = signalingProvider;
        this.call = o91Var;
        this.mappings = idMappingWrapper;
        this.stateProvider = af7Var;
    }

    public static final sbi addParticipantByLink$lambda$0(String str, sg4 sg4Var, Runnable runnable, AddParticipantsCommands addParticipantsCommands, q4g q4gVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("participantIdAsQRCodeLink", str);
            q4gVar.d(kql.b(jSONObject, "add-participant"), false, new mb(0, runnable), new lb(sg4Var, 1, addParticipantsCommands));
        } catch (JSONException e) {
            sg4Var.accept(new RuntimeException("Request preparation error", e));
        }
        return sbi.a;
    }

    public static final void addParticipantByLink$lambda$0$1(sg4 sg4Var, AddParticipantsCommands addParticipantsCommands, JSONObject jSONObject) {
        sg4Var.accept(addParticipantsCommands.parseErrorResponse(jSONObject));
    }

    public static /* synthetic */ void addParticipantsExtIds$default(AddParticipantsCommands addParticipantsCommands, Collection collection, Boolean bool, boolean z, cf7 cf7Var, cf7 cf7Var2, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            cf7Var = null;
        }
        if ((i & 16) != 0) {
            cf7Var2 = null;
        }
        addParticipantsCommands.addParticipantsExtIds(collection, bool, z, cf7Var, cf7Var2);
    }

    public static final sbi addParticipantsExtIds$lambda$0(Collection collection, Boolean bool, boolean z, AddParticipantsCommands addParticipantsCommands, cf7 cf7Var, cf7 cf7Var2, q4g q4gVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                jSONArray.put(((hi1) it.next()).a);
            }
            jSONObject.put(ApiProtocol.PARAM_EXTERNAL_IDS, jSONArray);
            q4gVar.d(kql.a(jSONObject, bool, z), false, addParticipantsCommands.new ListenerAddParticipantsResponse(cf7Var, cf7Var2, collection), new lb(cf7Var2, 0, addParticipantsCommands));
        } catch (JSONException e) {
            if (cf7Var2 != null) {
                cf7Var2.invoke(new RuntimeException("add.participant", e));
            }
        }
        return sbi.a;
    }

    public static final void addParticipantsExtIds$lambda$0$0(cf7 cf7Var, AddParticipantsCommands addParticipantsCommands, JSONObject jSONObject) {
        if (cf7Var != null) {
            cf7Var.invoke(addParticipantsCommands.parseAddError(jSONObject));
        }
    }

    private final AddParticipantsFailedException parseAddError(JSONObject error) {
        String strOptString = error.optString("message");
        if (strOptString == null) {
            strOptString = "Add participants error: " + error;
        }
        return new AddParticipantsFailedException(strOptString);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    private final AddByLinkFailedException parseErrorResponse(JSONObject error) {
        AddByLinkFailedException.Reason reason;
        String strOptString = error.optString("message");
        if (strOptString == null) {
            strOptString = "Add participant by link error: " + error;
        }
        String strOptString2 = error.optString("error");
        if (strOptString2 != null) {
            switch (strOptString2) {
                case "malformed_qr_url":
                    reason = AddByLinkFailedException.Reason.MALFORMED_QR_URL;
                    break;
                case "qr.no_user_id_parameter":
                    reason = AddByLinkFailedException.Reason.QR_NO_USER_ID_PARAMETER;
                    break;
                case "qr.wrong_prefix":
                    reason = AddByLinkFailedException.Reason.QR_WRONG_PREFIX;
                    break;
                case "qr.general_error":
                    reason = AddByLinkFailedException.Reason.QR_GENERAL_ERROR;
                    break;
                case "wrong_signature":
                    reason = AddByLinkFailedException.Reason.WRONG_SIGNATURE;
                    break;
                case "link_is_outdated":
                    reason = AddByLinkFailedException.Reason.LINK_OUTDATED;
                    break;
                default:
                    reason = AddByLinkFailedException.Reason.UNKNOWN;
                    break;
            }
        } else {
            reason = AddByLinkFailedException.Reason.UNKNOWN;
        }
        return new AddByLinkFailedException(strOptString, reason);
    }

    private final void withSignaling(cf7 onError, cf7 provideSignaling) {
        q4g signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            provideSignaling.invoke(signaling);
        } else if (onError != null) {
            onError.invoke(new IllegalStateException("Conversation is not prepared or already destroyed"));
        }
    }

    public static /* synthetic */ void withSignaling$default(AddParticipantsCommands addParticipantsCommands, cf7 cf7Var, cf7 cf7Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            cf7Var = null;
        }
        addParticipantsCommands.withSignaling(cf7Var, cf7Var2);
    }

    public final void addParticipantByLink(String link, Runnable onSuccess, sg4 onError) {
        withSignaling(new AnonymousClass1(onError), new nb(link, onError, onSuccess, this, 0));
    }

    public final void addParticipantsExtIds(final Collection<hi1> participantsIds, final Boolean isUnban, final boolean isShowChatHistory, final cf7 onSuccess, final cf7 onError) {
        if (this.stateProvider.invoke() == Conversation.State.Finished) {
            return;
        }
        withSignaling$default(this, null, new cf7() { // from class: kb
            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                return AddParticipantsCommands.addParticipantsExtIds$lambda$0(participantsIds, isUnban, isShowChatHistory, this, onSuccess, onError, (q4g) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands$addParticipantByLink$1 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class AnonymousClass1 extends fg7 implements cf7 {
        public AnonymousClass1(Object obj) {
            super(1, 0, sg4.class, obj, "accept", "accept(Ljava/lang/Object;)V");
        }

        @Override // defpackage.cf7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return sbi.a;
        }

        public final void invoke(Throwable th) {
            ((sg4) this.receiver).accept(th);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001BI\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/AddParticipantsCommands$ListenerAddParticipantsResponse;", "Ln4g;", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/participant/add/AddParticipantsResult;", "Lsbi;", "onSuccess", "", "onError", "", "Lhi1;", ApiProtocol.PARAM_EXTERNAL_IDS, "<init>", "(Lru/ok/android/externcalls/sdk/participant/AddParticipantsCommands;Lcf7;Lcf7;Ljava/util/Collection;)V", "Lorg/json/JSONObject;", "response", "onResponse", "(Lorg/json/JSONObject;)V", "Lcf7;", "Ljava/util/Collection;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class ListenerAddParticipantsResponse implements n4g {
        private final Collection<hi1> externalIds;
        private final cf7 onError;
        private final cf7 onSuccess;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[qt4.H(2).length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ ListenerAddParticipantsResponse(AddParticipantsCommands addParticipantsCommands, cf7 cf7Var, cf7 cf7Var2, Collection collection, int i, j95 j95Var) {
            this((i & 1) != 0 ? null : cf7Var, (i & 2) != 0 ? null : cf7Var2, (i & 4) != 0 ? r66.a : collection);
        }

        @Override // defpackage.n4g
        public void onResponse(JSONObject response) {
            Collection collection;
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (response.has("participants")) {
                    JSONArray jSONArray = response.getJSONArray("participants");
                    int length = response.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            yt1 yt1VarX = kql.x(jSONObjectOptJSONObject);
                            int iD = qt4.D(AddParticipantsCommands.this.call.C(yt1VarX, jSONObjectOptJSONObject));
                            if (iD == 0) {
                                arrayList.add(yt1VarX);
                            } else {
                                if (iD != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                arrayList2.add(yt1VarX);
                            }
                        }
                    }
                }
                cf7 cf7Var = this.onSuccess;
                if (cf7Var != null) {
                    AddParticipantsCommands addParticipantsCommands = AddParticipantsCommands.this;
                    Collection collectionG = kql.G(response, "rejectedParticipantIds");
                    Collection collection2 = r66.a;
                    if (collectionG == null) {
                        collectionG = collection2;
                    }
                    Collection collectionG2 = kql.G(response, "bannedParticipantIds");
                    if (collectionG2 == null) {
                        collectionG2 = collection2;
                    }
                    Collection collectionD = kql.D(response, "rejectedParticipants");
                    if (collectionD == null) {
                        collectionD = collection2;
                    }
                    Collection collectionD2 = kql.D(response, "bannedParticipants");
                    if (collectionD2 == null) {
                        collectionD2 = collection2;
                    }
                    if (collectionD.isEmpty() && collectionD2.isEmpty()) {
                        collection = collection2;
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Collection<hi1> collection3 = this.externalIds;
                        if (collection3 != null) {
                            for (hi1 hi1Var : collection3) {
                                Collection collection4 = collectionD2;
                                linkedHashMap.put(hi1Var.a, new ParticipantId(hi1Var.a, hi1Var.b == 3, hi1Var.c));
                                collectionD2 = collection4;
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = collectionD2.iterator();
                        while (it.hasNext()) {
                            ParticipantId participantId = (ParticipantId) linkedHashMap.get((String) it.next());
                            if (participantId != null) {
                                arrayList3.add(participantId);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = collectionD.iterator();
                        while (it2.hasNext()) {
                            ParticipantId participantId2 = (ParticipantId) linkedHashMap.get((String) it2.next());
                            if (participantId2 != null) {
                                arrayList4.add(participantId2);
                            }
                        }
                        collection2 = arrayList3;
                        collection = arrayList4;
                    }
                    IdMappingWrapper idMappingWrapper = addParticipantsCommands.mappings;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it3 = collectionG2.iterator();
                    while (it3.hasNext()) {
                        ParticipantId byInternal = idMappingWrapper.getByInternal((yt1) it3.next());
                        if (byInternal != null) {
                            arrayList5.add(byInternal);
                        }
                    }
                    ArrayList arrayListG1 = ww3.G1(collection2, arrayList5);
                    IdMappingWrapper idMappingWrapper2 = addParticipantsCommands.mappings;
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it4 = collectionG.iterator();
                    while (it4.hasNext()) {
                        ParticipantId byInternal2 = idMappingWrapper2.getByInternal((yt1) it4.next());
                        if (byInternal2 != null) {
                            arrayList6.add(byInternal2);
                        }
                    }
                    ArrayList arrayListG2 = ww3.G1(collection, arrayList6);
                    IdMappingWrapper idMappingWrapper3 = addParticipantsCommands.mappings;
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        ParticipantId byInternal3 = idMappingWrapper3.getByInternal((yt1) it5.next());
                        if (byInternal3 != null) {
                            arrayList7.add(byInternal3);
                        }
                    }
                    IdMappingWrapper idMappingWrapper4 = addParticipantsCommands.mappings;
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        ParticipantId byInternal4 = idMappingWrapper4.getByInternal((yt1) it6.next());
                        if (byInternal4 != null) {
                            arrayList8.add(byInternal4);
                        }
                    }
                    cf7Var.invoke(new AddParticipantsResult(arrayList7, arrayList8, arrayListG2, arrayListG1));
                }
            } catch (JSONException e) {
                cf7 cf7Var2 = this.onError;
                if (cf7Var2 != null) {
                    cf7Var2.invoke(new RuntimeException("add.participant.success", e));
                }
            }
        }

        public ListenerAddParticipantsResponse(cf7 cf7Var, cf7 cf7Var2, Collection<hi1> collection) {
            this.onSuccess = cf7Var;
            this.onError = cf7Var2;
            this.externalIds = collection;
        }
    }
}
