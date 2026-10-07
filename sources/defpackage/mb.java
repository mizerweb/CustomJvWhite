package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.dev.MediaDumpManager;
import ru.ok.android.externcalls.sdk.dev.internal.MediaDumpManagerImpl;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mb implements n4g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.n4g
    public final void onResponse(JSONObject jSONObject) throws JSONException, InterruptedException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Runnable) obj).run();
                break;
            case 1:
                ((f4g) obj).run();
                break;
            case 2:
                CidLogger cidLogger = (CidLogger) ((ll5) obj).e;
                if (jSONObject != null && "command-discarded".equals(jSONObject.optString("error"))) {
                    cidLogger.log("MediaSettingsSender", "change-media-settings command was merged with ongoing one");
                } else {
                    cidLogger.log("MediaSettingsSender", "change-media-settings error" + jSONObject);
                }
                break;
            case 3:
                ((ysj) obj).invoke(new RuntimeException("get-participant-list-chunk error " + jSONObject));
                break;
            case 4:
                ((ysj) obj).invoke(new RuntimeException("get-rooms error " + jSONObject));
                break;
            default:
                MediaDumpManagerImpl.requestMediaDump$lambda$0((MediaDumpManager.RemoteMediaDumpRequestListener) obj, jSONObject);
                break;
        }
    }

    public /* synthetic */ mb(Object obj, fg7 fg7Var, int i) {
        this.a = i;
        this.b = fg7Var;
    }
}
