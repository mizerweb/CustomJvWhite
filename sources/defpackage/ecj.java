package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandExecutorImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ecj implements n4g {
    public final /* synthetic */ int a;
    public final /* synthetic */ WatchTogetherCommandExecutorImpl b;
    public final /* synthetic */ cf7 c;

    public /* synthetic */ ecj(WatchTogetherCommandExecutorImpl watchTogetherCommandExecutorImpl, cf7 cf7Var, int i) {
        this.a = i;
        this.b = watchTogetherCommandExecutorImpl;
        this.c = cf7Var;
    }

    @Override // defpackage.n4g
    public final void onResponse(JSONObject jSONObject) {
        int i = this.a;
        cf7 cf7Var = this.c;
        WatchTogetherCommandExecutorImpl watchTogetherCommandExecutorImpl = this.b;
        switch (i) {
            case 0:
                watchTogetherCommandExecutorImpl.parseErrorResponse("setVolume", jSONObject, cf7Var);
                break;
            case 1:
                watchTogetherCommandExecutorImpl.parseErrorResponse("pause", jSONObject, cf7Var);
                break;
            case 2:
                watchTogetherCommandExecutorImpl.parseErrorResponse("resume", jSONObject, cf7Var);
                break;
            case 3:
                watchTogetherCommandExecutorImpl.parseErrorResponse("setPosition", jSONObject, cf7Var);
                break;
            case 4:
                watchTogetherCommandExecutorImpl.parseErrorResponse("play", jSONObject, cf7Var);
                break;
            case 5:
                watchTogetherCommandExecutorImpl.parseErrorResponse("setMute", jSONObject, cf7Var);
                break;
            default:
                watchTogetherCommandExecutorImpl.parseErrorResponse("stop", jSONObject, cf7Var);
                break;
        }
    }
}
