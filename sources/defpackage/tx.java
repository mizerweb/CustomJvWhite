package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes3.dex */
public final class tx {
    public final CidLogger a;

    public /* synthetic */ tx(CidLogger cidLogger) {
        this.a = cidLogger;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    /* JADX WARN: Code duplicated, block: B:20:0x007c A[LOOP:0: B:19:0x007a->B:20:0x007c, LOOP_END] */
    public static b2b a(JSONObject jSONObject, dnf dnfVar) throws JSONException {
        z1b z1bVar;
        z1b z1bVar2;
        long jOptLong;
        svk t1bVar;
        ArrayList arrayList;
        JSONArray jSONArrayOptJSONArray;
        int length;
        int i;
        long j = jSONObject.getLong("movieId");
        yt1 yt1VarA = yt1.a(jSONObject.getString("initiatorId"));
        String string = jSONObject.getString("title");
        String string2 = jSONObject.getString("source");
        string2.getClass();
        if (!string2.equals("MOVIE")) {
            if (string2.equals("STREAM")) {
                z1bVar2 = z1b.b;
            } else {
                z1bVar = null;
            }
            if (z1bVar == null) {
                return null;
            }
            String string3 = jSONObject.getString("externalMovieId");
            jOptLong = jSONObject.optLong("duration");
            if (jOptLong <= 0) {
                t1bVar = s1b.a;
            } else {
                t1bVar = new t1b(jOptLong);
            }
            u1b u1bVar = new u1b(j);
            string3.getClass();
            string.getClass();
            arrayList = new ArrayList();
            jSONArrayOptJSONArray = jSONObject.optJSONArray("thumbnails");
            if (jSONArrayOptJSONArray != null) {
                length = jSONArrayOptJSONArray.length();
                i = 0;
                while (i < length) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    String strOptString = jSONObject2.optString(MLFeatureConfigProviderBase.URL_KEY);
                    strOptString.getClass();
                    arrayList.add(new f2b(strOptString, jSONObject2.optInt("width"), jSONObject2.optInt("height")));
                    i++;
                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                }
            }
            return new b2b(yt1VarA, dnfVar, new r1b(u1bVar, string3, string, z1bVar, t1bVar, new g2b(arrayList)));
        }
        z1bVar2 = z1b.a;
        z1bVar = z1bVar2;
        if (z1bVar == null) {
            return null;
        }
        String string4 = jSONObject.getString("externalMovieId");
        jOptLong = jSONObject.optLong("duration");
        if (jOptLong <= 0) {
            t1bVar = s1b.a;
        } else {
            t1bVar = new t1b(jOptLong);
        }
        u1b u1bVar2 = new u1b(j);
        string4.getClass();
        string.getClass();
        arrayList = new ArrayList();
        jSONArrayOptJSONArray = jSONObject.optJSONArray("thumbnails");
        if (jSONArrayOptJSONArray != null) {
            length = jSONArrayOptJSONArray.length();
            i = 0;
            while (i < length) {
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i);
                String strOptString2 = jSONObject3.optString(MLFeatureConfigProviderBase.URL_KEY);
                strOptString2.getClass();
                arrayList.add(new f2b(strOptString2, jSONObject3.optInt("width"), jSONObject3.optInt("height")));
                i++;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
            }
        }
        return new b2b(yt1VarA, dnfVar, new r1b(u1bVar2, string4, string, z1bVar, t1bVar, new g2b(arrayList)));
    }

    public static e2b b(JSONObject jSONObject) throws JSONException {
        z1b z1bVar;
        long j = jSONObject.getLong("movieId");
        yt1 yt1VarA = yt1.a(jSONObject.getString("initiatorId"));
        String string = jSONObject.getString("source");
        string.getClass();
        if (string.equals("MOVIE")) {
            z1bVar = z1b.a;
        } else {
            z1bVar = string.equals("STREAM") ? z1b.b : null;
        }
        if (z1bVar == null) {
            return null;
        }
        Integer numB = f6m.b(jSONObject, "roomId");
        return new e2b(yt1VarA, numB != null ? new cnf(numB.intValue()) : bnf.a, new u1b(j), z1bVar);
    }

    public static ob1 c(JSONObject jSONObject) {
        yt1 yt1VarA;
        try {
            yt1VarA = yt1.a(jSONObject.optString("initiatorId"));
        } catch (Exception unused) {
            yt1VarA = null;
        }
        if (yt1VarA == null) {
            return null;
        }
        return new ob1(yt1VarA, f6m.c(jSONObject, "movieId"));
    }

    public List d(JSONObject jSONObject, dnf dnfVar) {
        b2b b2bVarA;
        CidLogger cidLogger = this.a;
        r66 r66Var = r66.a;
        jSONObject.getClass();
        dnfVar.getClass();
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("movieShareInfos");
            if (jSONArrayOptJSONArray == null) {
                return r66Var;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                jSONObject2.getClass();
                try {
                    b2bVarA = a(jSONObject2, dnfVar);
                } catch (Throwable th) {
                    cidLogger.logException("VideoStreamsParser", "Can't parse movie", th);
                    b2bVarA = null;
                }
                if (b2bVarA != null) {
                    arrayList.add(b2bVarA.c);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            cidLogger.logException("VideoStreamsParser", "Can't parse movies", th2);
            return r66Var;
        }
    }

    public tx(CidLogger cidLogger, iw8 iw8Var) {
        this.a = cidLogger;
    }
}
