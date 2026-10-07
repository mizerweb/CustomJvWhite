package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ConditionVariable;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class uy8 {
    public final Object a;
    public final Object b;
    public volatile Object c;

    public uy8(Class cls) {
        this.a = new Object();
        this.b = cls.getName();
    }

    public Logger a() {
        Logger logger = (Logger) this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.a) {
            try {
                Logger logger2 = (Logger) this.c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.b);
                this.c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(List list) throws JSONException {
        swh swhVar = swh.a;
        String strA = swh.a();
        if (strA == null) {
            return;
        }
        Collection collectionE = swh.b().e();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ApiProtocol.PARAM_DEVICE_ID, yab.I((Context) this.b));
        jSONObject.put("sessions", qyj.W(list));
        if (!collectionE.isEmpty()) {
            jSONObject.put("drops", qtl.b(collectionE));
        }
        Object obj = swh.c().get(cqk.b);
        lt4 lt4Var = obj instanceof lt4 ? (lt4) obj : null;
        if (lt4Var == null) {
            lt4Var = new lt4(new v2a(18));
        }
        euc eucVar = new euc(Uri.parse(lt4Var.b()).buildUpon().appendEncodedPath("api/crash/trackSession").appendQueryParameter("crashToken", strA).toString(), so2.K(BaseHttpHeadersHolder.CONTENT_TYPE_JSON, jSONObject.toString()));
        ConditionVariable conditionVariable = new ConditionVariable();
        this.c = conditionVariable;
        yxh.b(new sc2(eucVar, this, collectionE, conditionVariable, 12));
    }

    public uy8(snf snfVar, Context context) {
        this.a = snfVar;
        this.b = context;
    }
}
