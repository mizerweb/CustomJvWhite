package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ykg implements n4g {
    public final /* synthetic */ int a;
    public final /* synthetic */ StereoRoomCommandExecutorImpl b;
    public final /* synthetic */ cf7 c;

    public /* synthetic */ ykg(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, cf7 cf7Var, int i) {
        this.a = i;
        this.b = stereoRoomCommandExecutorImpl;
        this.c = cf7Var;
    }

    @Override // defpackage.n4g
    public final void onResponse(JSONObject jSONObject) {
        int i = this.a;
        cf7 cf7Var = this.c;
        StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl = this.b;
        switch (i) {
            case 0:
                stereoRoomCommandExecutorImpl.parseErrorResponse("getHandQueue", jSONObject, cf7Var);
                break;
            case 1:
                stereoRoomCommandExecutorImpl.parseErrorResponse("requestPromotion", jSONObject, cf7Var);
                break;
            case 2:
                stereoRoomCommandExecutorImpl.parseErrorResponse("acceptPromotion", jSONObject, cf7Var);
                break;
            default:
                stereoRoomCommandExecutorImpl.parseErrorResponse("promoteParticipant", jSONObject, cf7Var);
                break;
        }
    }
}
