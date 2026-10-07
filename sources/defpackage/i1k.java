package defpackage;

import org.apache.http.client.methods.HttpGet;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class i1k implements fih {
    public final xhh a;
    public final String b;
    public final ny8 c;

    public i1k(ny8 ny8Var, xhh xhhVar, String str) {
        this.a = xhhVar;
        this.b = str;
        this.c = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(i1k i1kVar, double d, double d2, nq4 nq4Var) {
        h1k h1kVar;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        if (nq4Var instanceof h1k) {
            h1kVar = (h1k) nq4Var;
            int i = h1kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                h1kVar.f = i - Integer.MIN_VALUE;
            } else {
                h1kVar = new h1k(i1kVar, nq4Var);
            }
        } else {
            h1kVar = new h1k(i1kVar, nq4Var);
        }
        Object objK0 = h1kVar.d;
        int i2 = h1kVar.f;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(objK0);
            String str = "https://geocode-maps.yandex.ru/v1?lang=ru_RU&results=1&format=json&geocode=" + d2 + ',' + d + "&apikey=" + i1kVar.b;
            ag5 ag5Var = new ag5(3);
            ag5Var.e(HttpGet.METHOD_NAME, null);
            ag5Var.h(str);
            dle dleVarA = ag5Var.a();
            xt4 xt4VarD = ((n0c) i1kVar.a).d();
            rjj rjjVar = new rjj(i1kVar, dleVarA, lq4Var, 12);
            h1kVar.f = 1;
            objK0 = yab.K0(xt4VarD, rjjVar, h1kVar);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        JSONObject jSONObject = (JSONObject) objK0;
        if (jSONObject == null) {
            gm0.Y(i1k.class.getName(), "Early return in getAddress cuz of json == null");
            return null;
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("response");
        if (jSONObjectOptJSONObject4 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("GeoObjectCollection")) == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("featureMember")) == null || (jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(0)) == null || (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("GeoObject")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject3.optString(SdkMetricStatEvent.NAME_KEY);
    }

    @Override // defpackage.fih
    public final float a(double d, double d2, double d3, double d4) {
        return (float) uvl.a(d, d2, d3, d4);
    }

    @Override // defpackage.fih
    public final Object b(double d, double d2, double d3, double d4, nq4 nq4Var) {
        return yab.K0(((n0c) this.a).b(), new uwc(this, d, d2, null, 1), nq4Var);
    }

    @Override // defpackage.fih
    public final boolean c(double d, double d2, double d3, double d4) {
        return uvl.a(d, d2, d3, d4) < 10.0d;
    }
}
