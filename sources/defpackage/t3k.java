package defpackage;

import android.net.TrafficStats;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class t3k {
    public static final ifh f = new ifh(new t4i(2));
    public final String b;
    public final ifh c;
    public final ahk d;
    public final List a = (List) f.getValue();
    public final boolean e = true;

    public t3k(String str, ifh ifhVar, ahk ahkVar) {
        this.b = str;
        this.c = ifhVar;
        this.d = ahkVar;
    }

    public final v3e a(String str, ArrayList arrayList, Integer num) {
        s9k s9kVar;
        List list;
        List list2;
        List list3;
        String strConcat = str;
        if (!z5h.K0(strConcat, wk8.b("ad42ae7018da36dd"), false)) {
            strConcat = wk8.b("d69b1cb7df68efa6c426b4f9").concat(strConcat);
        }
        StringBuilder sbC = nbh.C(strConcat);
        sbC.append(wk8.b("7ade45ac8324ae138333ef55de20ae15de31"));
        sbC.append(wk8.b("f8d20cd1ee7ab78aec"));
        sbC.append(num);
        String string = sbC.toString();
        StringBuilder sb = new StringBuilder(wk8.b("9dc741e39863b4f38231b4f58c35b4bfd91a"));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int i3 = i2 + 1;
            if (i2 < 0) {
                xw3.V0();
                throw null;
            }
            wjk wjkVar = (wjk) obj;
            char c = ',';
            if (i2 > 0) {
                sb.append(',');
            }
            wjkVar.getClass();
            StringBuilder sb2 = new StringBuilder(wk8.b("8334362259145de7000c"));
            wjk.a(sb2, wjkVar.a);
            sb2.append(wk8.b("e03f61604c435c8c0904519434121dda"));
            sb2.append(wjkVar.b / 1000);
            sb2.append(wk8.b("33e1ae6d418c80431df884411ec78e5d4f94"));
            wjk.a(sb2, wjkVar.c);
            sb2.append(wk8.b("fc658a1d31a80c8c3fb0"));
            wjk.a(sb2, wjkVar.d);
            sb2.append(wk8.b("8b1182eec2a072e480ec74e89aeb7ee5bafb61eeccb8"));
            sb2.append(wjkVar.e);
            String str2 = wjkVar.f;
            if (str2 != null) {
                sb2.append(wk8.b("9ecbfbdaf6d9a4eebf89aaeab589e9a4"));
                wjk.a(sb2, str2);
            }
            sb2.append(wk8.b("910405ae822772e1c0273e"));
            sb2.append(wjkVar.g);
            String str3 = wjkVar.h;
            if (str3 != null) {
                sb2.append(wk8.b("cd1416072b3470a8717f77a84e7236f7"));
                wjk.a(sb2, str3);
            }
            String str4 = wjkVar.i;
            if (str4 != null) {
                sb2.append(wk8.b("90f29a0a26b887f96eb8c8"));
                wjk.a(sb2, str4);
            }
            sb2.append(wk8.b("cd0076b69a5468a2c50273ef8c2d"));
            ArrayList arrayList2 = wjkVar.j;
            int size2 = arrayList2.size();
            int i4 = 0;
            int i5 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList2.get(i4);
                i4++;
                int i6 = i5 + 1;
                if (i5 < 0) {
                    xw3.V0();
                    throw null;
                }
                sgk sgkVar = (sgk) obj2;
                if (i5 > 0) {
                    sb2.append(c);
                }
                sb2.append(wk8.b("8334362259145de7000c"));
                sb2.append(sgkVar.a);
                sb2.append(wk8.b("2d776728044504594913025e0a5d"));
                sb2.append(sgkVar.b);
                sb2.append('}');
                i5 = i6;
                c = ',';
            }
            sb2.append(wk8.b("c9920ba8f576"));
            sb.append(sb2.toString());
            i2 = i3;
        }
        sb.append(wk8.b("c9920ba8f576"));
        byte[] bytes = sb.toString().getBytes(pt2.a);
        ul9 ul9Var = new ul9();
        ul9Var.put(wk8.b("be32663675095cca53084693621f42db"), wk8.b("32e3142f4e64935e46778246467b8d1d45678c5c"));
        ul9Var.put(wk8.b("c333826b3ef156b146c354a605f6"), this.c.getValue());
        if (this.e) {
            ul9Var.put(wk8.b("83ff264f0c4991f72a488bae0a489cec2b4f91e4"), wk8.b("ad424f4225352bdd"));
        }
        ul9Var.put(wk8.b("0b8f8f7130fafb631efde67110fbe6641f"), this.b);
        ul9Var.put(wk8.b("23cc6d10510eaf466019"), wk8.b("32e3142f4e64935e46778246467b8d1d45678c5c"));
        ul9 ul9VarB = ul9Var.b();
        ((uhk) this.d).getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
        try {
            TrafficStats.setThreadStatsTag(string.hashCode());
            uhk.b(httpURLConnection, ul9VarB);
            uhk.c(httpURLConnection, bytes, ul9VarB);
            lo7 lo7VarA = uhk.a(httpURLConnection);
            TrafficStats.clearThreadStatsTag();
            httpURLConnection.disconnect();
            int i7 = lo7VarA.a;
            if (i7 != 200) {
                if (i7 == 429) {
                    return pjk.b;
                }
                if (400 <= i7 && i7 < 500) {
                    wk8.b("6396c80546a4ff066bbcb60677baf91125");
                    return new ijk();
                }
                if (500 > i7 || i7 >= 600) {
                    wk8.b("6292eae7b284f71a978ff116828eb2");
                    return new ijk();
                }
                wk8.b("84ac358dde50def2e8478ce1ff47c3f6ad");
                return new ijk();
            }
            JSONObject jSONObject = new JSONObject(lo7VarA.b);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(wk8.b("5e7f4f2a492011384328"));
            if (jSONObjectOptJSONObject != null) {
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(wk8.b("e3d3000f7d65a38c7d749b8c7c74a0"));
                r66 r66Var = r66.a;
                if (jSONArrayOptJSONArray != null) {
                    hj8 hj8VarF0 = oc9.f0(0, jSONArrayOptJSONArray.length());
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = hj8VarF0.iterator();
                    while (true) {
                        gj8 gj8Var = (gj8) it;
                        if (!gj8Var.c) {
                            break;
                        }
                        String strOptString = jSONArrayOptJSONArray.optString(gj8Var.nextInt());
                        if (strOptString != null) {
                            arrayList3.add(strOptString);
                        }
                    }
                    list = arrayList3;
                } else {
                    list = r66Var;
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(wk8.b("b7db9185f6f4b7d1cce19fd2f1f4b8c3ecfeb5f3eafcbadeebe2"));
                if (jSONArrayOptJSONArray2 != null) {
                    hj8 hj8VarF1 = oc9.f0(0, jSONArrayOptJSONArray2.length());
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = hj8VarF1.iterator();
                    while (true) {
                        gj8 gj8Var2 = (gj8) it2;
                        if (!gj8Var2.c) {
                            break;
                        }
                        String strOptString2 = jSONArrayOptJSONArray2.optString(gj8Var2.nextInt());
                        if (strOptString2 != null) {
                            arrayList4.add(strOptString2);
                        }
                    }
                    list2 = arrayList4;
                } else {
                    list2 = r66Var;
                }
                JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray(wk8.b("be033cccbe5962dda45d61d7a05577c7845370cabf"));
                if (jSONArrayOptJSONArray3 != null) {
                    hj8 hj8VarF2 = oc9.f0(0, jSONArrayOptJSONArray3.length());
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it3 = hj8VarF2.iterator();
                    while (true) {
                        gj8 gj8Var3 = (gj8) it3;
                        if (!gj8Var3.c) {
                            break;
                        }
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray3.optJSONObject(gj8Var3.nextInt());
                        yik yikVar = jSONObjectOptJSONObject2 != null ? new yik(jSONObjectOptJSONObject2.optInt(wk8.b("c9920d036a69"), 0), jSONObjectOptJSONObject2.optString(wk8.b("ad429b90f8f431d9"), "")) : null;
                        if (yikVar != null) {
                            arrayList5.add(yikVar);
                        }
                    }
                    list3 = arrayList5;
                } else {
                    list3 = r66Var;
                }
                s9kVar = new s9k(list, list2, list3, jSONObjectOptJSONObject.optInt(wk8.b("f4234dff8b244e91903857b98c"), 3000), jSONObjectOptJSONObject.optInt(wk8.b("4daecdf086a8dc3e99a2c0"), 0), jSONObjectOptJSONObject.optInt(wk8.b("3f2b6c137e0d536c7d0d5b4c7b035f4c"), 100), jSONObjectOptJSONObject.optLong(wk8.b("224bdc1b68b22a5268b4245657b52d476fb5264756af"), 86400000L), (float) jSONObjectOptJSONObject.optDouble(wk8.b("39aee992e188c349fe8cfc58e68c"), 1.0d));
            } else {
                s9kVar = null;
            }
            long jOptLong = jSONObject.optLong(wk8.b("fcb6c35135acd88803a6c69323b7e39225aada"), -1L);
            Long lValueOf = Long.valueOf(jOptLong);
            if (jOptLong <= 0) {
                lValueOf = null;
            }
            return new qjk(s9kVar, lValueOf != null ? Long.valueOf(lValueOf.longValue() * 1000) : null);
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
