package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ymf implements n4g {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionRoomAdminCommandExecutorImpl b;
    public final /* synthetic */ cf7 c;

    public /* synthetic */ ymf(SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl, cf7 cf7Var, int i) {
        this.a = i;
        this.b = sessionRoomAdminCommandExecutorImpl;
        this.c = cf7Var;
    }

    @Override // defpackage.n4g
    public final void onResponse(JSONObject jSONObject) {
        int i = this.a;
        cf7 cf7Var = this.c;
        SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl = this.b;
        switch (i) {
            case 0:
                sessionRoomAdminCommandExecutorImpl.parseErrorResponse("switchRoom", jSONObject, cf7Var);
                break;
            default:
                sessionRoomAdminCommandExecutorImpl.parseErrorResponse("updateRooms", jSONObject, cf7Var);
                break;
        }
    }
}
