package defpackage;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x81 implements n4g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x81(n4g n4gVar, ParticipantStatesManagerImpl participantStatesManagerImpl, Map map) {
        this.a = 3;
        this.d = n4gVar;
        this.b = participantStatesManagerImpl;
        this.c = map;
    }

    @Override // defpackage.n4g
    public final void onResponse(JSONObject jSONObject) throws JSONException, InterruptedException {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                o91 o91Var = (o91) obj3;
                yt1 yt1Var = (yt1) obj2;
                n4g n4gVar = (n4g) obj;
                CidLogger cidLogger = o91Var.N;
                cidLogger.log("OKRTCCall", "handle response from signaling on add-participant command");
                try {
                    int iD = qt4.D(o91Var.C(yt1Var, jSONObject.optJSONObject("participant")));
                    if (iD != 0 && iD == 1) {
                        n4gVar.onResponse(new JSONObject().put("error", "state.accepted"));
                    }
                } catch (JSONException e) {
                    cidLogger.reportException("OKRTCCall", "add.participant.success", e);
                    return;
                }
                break;
            case 1:
                bm5 bm5Var = (bm5) obj2;
                f4g f4gVar = (f4g) obj;
                a72 a72VarA = ((o91) obj3).H0.a(jSONObject);
                if (a72VarA == null) {
                    f4gVar.run();
                } else {
                    bm5Var.accept(a72VarA);
                }
                break;
            case 2:
                ih ihVar = (ih) obj3;
                ysj ysjVar = (ysj) obj2;
                ysj ysjVar2 = (ysj) obj;
                jSONObject.getClass();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("rooms");
                o5g o5gVarR = jSONObjectOptJSONObject != null ? ((ewe) ihVar.a).r(jSONObjectOptJSONObject) : null;
                if (o5gVarR != null) {
                    ysjVar2.invoke(o5gVarR);
                } else {
                    ysjVar.invoke(new RuntimeException("Can't parse rooms from " + jSONObject));
                }
                break;
            case 3:
                ParticipantStatesManagerImpl.updateOwnStateInternal$lambda$0((n4g) obj, (ParticipantStatesManagerImpl) obj3, (Map) obj2, jSONObject);
                break;
            case 4:
                RecordManagerImpl.stopRecord$lambda$1((RecordManagerImpl) obj3, (RecordManager.StopParams) obj2, (cf7) obj, jSONObject);
                break;
            case 5:
                RecordManagerImpl.startRecord$lambda$1((RecordManagerImpl) obj3, (RecordManager.StartParams) obj2, (cf7) obj, jSONObject);
                break;
            default:
                StereoRoomCommandExecutorImpl.getHandsQueue$lambda$0((StereoRoomCommandExecutorImpl) obj3, (cf7) obj2, (tf7) obj, jSONObject);
                break;
        }
    }

    public /* synthetic */ x81(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
