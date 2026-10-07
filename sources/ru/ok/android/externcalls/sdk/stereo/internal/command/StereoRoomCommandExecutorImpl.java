package ru.ok.android.externcalls.sdk.stereo.internal.command;

import defpackage.a72;
import defpackage.af7;
import defpackage.b72;
import defpackage.cf7;
import defpackage.cqk;
import defpackage.g62;
import defpackage.kql;
import defpackage.nx;
import defpackage.q4g;
import defpackage.tf7;
import defpackage.vj7;
import defpackage.x81;
import defpackage.y3e;
import defpackage.ykg;
import defpackage.yw3;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;
import ru.ok.android.externcalls.sdk.stereo.exception.ParticipantNotFoundException;
import ru.ok.android.externcalls.sdk.stereo.exception.PromotedLimitExceeded;
import ru.ok.android.externcalls.sdk.stereo.exception.StereoRoomException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00142\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00182\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00142\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00142\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJK\u0010#\u001a\u00020\u000e2$\u0010\u0015\u001a \u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0012\u0004\u0012\u00020\u000e0\u001e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&¨\u0006'"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Ly3e;", "log", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Ly3e;)V", "", "method", "Lorg/json/JSONObject;", "errorResponse", "Lkotlin/Function1;", "", "Lsbi;", "onError", "parseErrorResponse", "(Ljava/lang/String;Lorg/json/JSONObject;Lcf7;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$PromoteParticipantParams;", "params", "Lkotlin/Function0;", "onSuccess", "promoteParticipant", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$PromoteParticipantParams;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$RequestPromotionParams;", "requestPromotion", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$RequestPromotionParams;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$AcceptPromotionParams;", "acceptPromotion", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor$AcceptPromotionParams;Laf7;Lcf7;)V", "Lkotlin/Function3;", "", "", "", "Lh62;", "getHandsQueue", "(Ltf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Ly3e;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StereoRoomCommandExecutorImpl implements StereoRoomCommandExecutor {
    private final y3e log;
    private final SignalingProvider signalingProvider;

    public StereoRoomCommandExecutorImpl(SignalingProvider signalingProvider, y3e y3eVar) {
        this.signalingProvider = signalingProvider;
        this.log = y3eVar;
    }

    public static final void acceptPromotion$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void getHandsQueue$lambda$0(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, cf7 cf7Var, tf7 tf7Var, JSONObject jSONObject) {
        a72 a72VarA = new b72(stereoRoomCommandExecutorImpl.log).a(jSONObject);
        if (a72VarA == null) {
            if (cf7Var != null) {
                cf7Var.invoke(new StereoRoomException("getHandsQueue: missing response", null, 2, null));
                return;
            }
            return;
        }
        Object objValueOf = Integer.valueOf(a72VarA.c);
        Object objValueOf2 = Boolean.valueOf(a72VarA.b);
        ArrayList arrayList = a72VarA.a;
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((g62) it.next()).a);
        }
        tf7Var.i(objValueOf, objValueOf2, arrayList2);
    }

    public final void parseErrorResponse(String method, JSONObject errorResponse, cf7 onError) {
        Object stereoRoomException;
        String strOptString = errorResponse.optString("error");
        if (cqk.d(strOptString, "chatRoom.partNotFound")) {
            stereoRoomException = new ParticipantNotFoundException("Participant not found, " + method + " command " + errorResponse);
        } else if (cqk.d(strOptString, "chatRoom.promotedLimit")) {
            stereoRoomException = new PromotedLimitExceeded();
        } else {
            stereoRoomException = new StereoRoomException("Error response for " + method + " command " + errorResponse, null, 2, null);
        }
        if (onError != null) {
            onError.invoke(stereoRoomException);
        }
    }

    public static final void promoteParticipant$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void requestPromotion$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor
    public void acceptPromotion(StereoRoomCommandExecutor.AcceptPromotionParams params, af7 onSuccess, cf7 onError) throws JSONException {
        q4g q4gVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (q4gVar == null) {
            return;
        }
        boolean reject = params.getReject();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "accept-promotion");
        jSONObject.put("reject", reject);
        q4gVar.d(new vj7(jSONObject, 0), false, new nx(14, onSuccess), new ykg(this, onError, 2));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor
    public void getHandsQueue(tf7 onSuccess, cf7 onError) throws JSONException {
        q4g q4gVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (q4gVar == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "get-hand-queue");
        q4gVar.d(new vj7(jSONObject, 0), false, new x81(this, onError, onSuccess, 6), new ykg(this, onError, 0));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor
    public void promoteParticipant(StereoRoomCommandExecutor.PromoteParticipantParams params, af7 onSuccess, cf7 onError) {
        q4g q4gVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (q4gVar == null) {
            return;
        }
        q4gVar.d(kql.p(params.getParticipantId(), params.getPromote()), false, new nx(15, onSuccess), new ykg(this, onError, 3));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor
    public void requestPromotion(StereoRoomCommandExecutor.RequestPromotionParams params, af7 onSuccess, cf7 onError) throws JSONException {
        q4g q4gVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (q4gVar == null) {
            return;
        }
        boolean unrequest = params.getUnrequest();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "request-promotion");
        jSONObject.put("unrequest", unrequest);
        q4gVar.d(new vj7(jSONObject, 0), false, new nx(13, onSuccess), new ykg(this, onError, 1));
    }
}
