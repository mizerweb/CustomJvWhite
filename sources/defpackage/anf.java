package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutorImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class anf implements n4g {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionRoomCommandExecutorImpl b;
    public final /* synthetic */ cf7 c;

    public /* synthetic */ anf(SessionRoomCommandExecutorImpl sessionRoomCommandExecutorImpl, cf7 cf7Var, int i) {
        this.a = i;
        this.b = sessionRoomCommandExecutorImpl;
        this.c = cf7Var;
    }

    @Override // defpackage.n4g
    public final void onResponse(JSONObject jSONObject) {
        int i = this.a;
        cf7 cf7Var = this.c;
        SessionRoomCommandExecutorImpl sessionRoomCommandExecutorImpl = this.b;
        switch (i) {
            case 0:
                sessionRoomCommandExecutorImpl.parseErrorResponse("joinRoom", jSONObject, cf7Var);
                break;
            case 1:
                sessionRoomCommandExecutorImpl.parseErrorResponse("leaveRoom", jSONObject, cf7Var);
                break;
            default:
                sessionRoomCommandExecutorImpl.parseErrorResponse("requestAttention", jSONObject, cf7Var);
                break;
        }
    }
}
