package defpackage;

import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ojk {
    public final ifh a = new ifh(new pgk(this));

    public ojk(px8 px8Var, iw8 iw8Var, px8 px8Var2) {
    }

    public final String a(ArrayList arrayList) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            tkc tkcVar = (tkc) it.next();
            String str = tkcVar.c;
            uxa uxaVar = tkcVar.e;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_name", uxaVar.a);
            jSONObject2.put("user_id", str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME, tkcVar.a);
            String str2 = tkcVar.d;
            if (str2 == null) {
                str2 = null;
            }
            jSONObject3.put("appVersion", str2);
            jSONObject3.put("userIdSdk", str);
            jSONObject3.put("time", String.valueOf(uxaVar.c));
            for (Map.Entry entry : uxaVar.b.entrySet()) {
                jSONObject3.put((String) entry.getKey(), (String) entry.getValue());
            }
            jSONObject2.put("params", jSONObject3);
            jSONArray.put(new JSONObject(jSONObject2.toString()));
        }
        jSONObject.put("events", jSONArray);
        return jSONObject.toString();
    }

    public final HttpsURLConnection b() throws ProtocolException {
        ifh ifhVar = this.a;
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URL) ifhVar.getValue()).openConnection();
        final URL url = (URL) ifhVar.getValue();
        httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: jjk
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return str.equals(url.getHost());
            }
        });
        httpsURLConnection.setRequestMethod(HttpPost.METHOD_NAME);
        httpsURLConnection.setRequestProperty("content-type", "application/json");
        httpsURLConnection.setRequestProperty("X-Metrics-Request-Time", String.valueOf(System.currentTimeMillis()));
        httpsURLConnection.setConnectTimeout(20000);
        httpsURLConnection.setReadTimeout(20000);
        httpsURLConnection.setDoOutput(true);
        return httpsURLConnection;
    }
}
