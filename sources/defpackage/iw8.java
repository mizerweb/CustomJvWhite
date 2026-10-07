package defpackage;

import android.content.Context;
import com.vk.push.core.filedatastore.JsonDeserializer;
import com.vk.push.core.remote.config.omicron.OmicronEnvironment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes.dex */
public final class iw8 implements f2a, OmicronEnvironment, esb, iih, sxh, JsonDeserializer, px5 {
    public final /* synthetic */ int a;

    public /* synthetic */ iw8(int i) {
        this.a = i;
    }

    public static String i(uxa uxaVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SdkMetricStatEvent.NAME_KEY, uxaVar.a);
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : uxaVar.b.entrySet()) {
            jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
        }
        jSONObject.put("data", jSONObject2);
        jSONObject.put("time", uxaVar.c);
        return jSONObject.toString(0);
    }

    public static final boolean j(int i) {
        int i2 = wki.c;
        char c = (char) i;
        if ('a' <= c && c < '{') {
            return true;
        }
        if ('A' > c || c >= '[') {
            return ('0' <= c && c < ':') || c == '-' || c == '_' || c == '.' || c == '~';
        }
        return true;
    }

    public static dnf k(JSONObject jSONObject) {
        jSONObject.getClass();
        return jSONObject.has("roomId") ? new cnf(jSONObject.getInt("roomId")) : bnf.a;
    }

    public static rj5 m(ec1 ec1Var, nf2 nf2Var) {
        no6 no6VarB;
        qmi qmiVar;
        b1k b1kVar = new b1k(12, nf2Var);
        List list = (List) ec1Var.g;
        tvj.a("ResolvedFeatureGroup", "resolveFeatureGroup: sessionConfig = " + ec1Var + ", lensFacing = " + nf2Var.j());
        Set set = (Set) ec1Var.f;
        if (set.isEmpty() && list.isEmpty()) {
            return null;
        }
        List list2 = (List) ec1Var.h;
        if (set.isEmpty() && list.isEmpty()) {
            ore.p("Must have at least one required or preferred feature");
            return null;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                cli cliVar = (cli) it.next();
                boolean z = cliVar instanceof igd;
                qmi qmiVar2 = qmi.g;
                if (z) {
                    qmiVar = qmi.b;
                } else if (cliVar instanceof z58) {
                    qmiVar = qmi.c;
                } else if (cliVar instanceof u48) {
                    qmiVar = qmi.d;
                } else if (c2m.c(cliVar)) {
                    qmiVar = qmi.e;
                } else {
                    qmiVar = cliVar instanceof q4h ? qmi.f : qmiVar2;
                }
                if (qmiVar == qmiVar2) {
                    no6VarB = new lo6(cliVar);
                    break;
                }
            } else {
                Iterator it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            mo6 mo6VarC = b1k.C((kr7) obj, list2);
                            if (mo6VarC != null) {
                                tvj.a("DefaultFeatureGroupResolver", "resolveFeatureGroup: filtered out preferred feature due to " + mo6VarC);
                            } else {
                                mo6VarC = null;
                            }
                            if (mo6VarC == null) {
                                arrayList.add(obj);
                            }
                        }
                        tvj.a("DefaultFeatureGroupResolver", "resolveFeatureGroup: filteredPreferredFeatures = " + arrayList);
                        no6VarB = b1kVar.B(ec1Var, arrayList, 0, r66.a);
                        break;
                    }
                    mo6 mo6VarC2 = b1k.C((kr7) it2.next(), list2);
                    if (mo6VarC2 != null) {
                        no6VarB = mo6VarC2;
                        break;
                    }
                }
            }
        }
        if (no6VarB instanceof jo6) {
            rj5 rj5Var = ((jo6) no6VarB).a;
            tvj.a("ResolvedFeatureGroup", "resolvedFeatureGroup = " + rj5Var);
            return rj5Var;
        }
        if (no6VarB instanceof ko6) {
            ore.p("Feature group is not supported");
            return null;
        }
        if (no6VarB instanceof lo6) {
            throw new IllegalArgumentException(((lo6) no6VarB).a + " is not supported");
        }
        if (!(no6VarB instanceof mo6)) {
            ore.o();
            return null;
        }
        mo6 mo6Var = (mo6) no6VarB;
        throw new IllegalArgumentException(mo6Var.a + " must be added for " + mo6Var.b);
    }

    @Override // defpackage.px5
    public int a(Context context, String str, boolean z) {
        return rx5.d(context, str, z);
    }

    @Override // defpackage.esb
    public long b(kj6 kj6Var) {
        return -1L;
    }

    @Override // defpackage.esb
    public xbf c() {
        return new vk0(-9223372036854775807L);
    }

    @Override // defpackage.iih
    public long d(int i, long j, float f) {
        if (i > 6) {
            i = 6;
        }
        long jPow = ((long) Math.pow(2.0d, i)) * 1000;
        return jPow + ((long) (jPow * f)) + j;
    }

    @Override // defpackage.esb
    public void e(long j) {
    }

    @Override // defpackage.px5
    public int f(Context context, String str) {
        return rx5.a(context, str);
    }

    @Override // com.vk.push.core.filedatastore.JsonDeserializer
    public Object fromJson(JSONObject jSONObject) {
        switch (this.a) {
            case 16:
                return new q6k(jSONObject.getString("last_delivered_push_token"), jSONObject.optBoolean("push_token_delivered"));
            case 17:
                return new e9k(jSONObject.getString("master_host_default_key"));
            default:
                return new agk(jSONObject.optBoolean("test_mode_enabled"));
        }
    }

    public y0k g(Context context) {
        y0k y0kVar;
        synchronized (this) {
            y0kVar = y0k.d;
            if (y0kVar == null) {
                y0kVar = new y0k(context.getApplicationContext());
                y0k.d = y0kVar;
            }
        }
        return y0kVar;
    }

    @Override // com.vk.push.core.remote.config.omicron.OmicronEnvironment
    public String name() {
        return "DEV";
    }
}
