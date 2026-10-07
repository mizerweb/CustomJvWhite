package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes.dex */
public final class cm0 {
    public final ny8 a;
    public final ny8 b;

    public cm0(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public static final geh a(cm0 cm0Var, byte[] bArr, sri sriVar) {
        geh gehVar = new geh(new String(bArr, pt2.a).intern(), sriVar.c(), sriVar.a());
        gehVar.setAlpha(sriVar.b());
        gehVar.c(new PorterDuffXfermode(sriVar.d() ? PorterDuff.Mode.OVERLAY : PorterDuff.Mode.SRC_OVER));
        return gehVar;
    }

    public static ArrayList b(JSONArray jSONArray, int[] iArr) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            JSONArray jSONArray2 = jSONObject.getJSONArray("stops");
            int i2 = i * 3;
            int iMin = Math.min(i2 + 3, iArr.length);
            tre.Q(iMin, iArr.length);
            int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i2, iMin);
            if (iArrCopyOfRange.length < 2) {
                ore.p("Failed requirement.");
                return null;
            }
            int length2 = iArrCopyOfRange.length;
            int length3 = jSONArray2.length();
            float[] fArr = new float[length3];
            int length4 = jSONArray2.length();
            int i3 = 0;
            while (i3 < length4) {
                fArr[i3] = (float) jSONArray2.getDouble(i3);
                i3++;
                i = i;
            }
            int i4 = i;
            if (length2 != length3) {
                ore.p("Failed requirement.");
                return null;
            }
            arrayList.add(new rri((float) jSONObject.getDouble("x"), (float) jSONObject.getDouble("y"), (float) jSONObject.getDouble("radiusX"), (float) jSONObject.getDouble("radiusY"), (float) jSONObject.getDouble("angle"), fArr, iArrCopyOfRange));
            i = i4 + 1;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00da  */
    public final LinkedHashMap c(Context context, hm0 hm0Var) {
        Integer numC1;
        String str;
        Object next;
        int i;
        sri sriVar;
        String str2 = SdkMetricStatEvent.NAME_KEY;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zA = ((pk5) this.b.getValue()).a();
        try {
            InputStream inputStreamOpen = context.getAssets().open("max_colors_schemes.bin");
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            try {
                JSONArray jSONArray = new JSONArray(new String(bArr, pt2.a));
                int length = jSONArray.length();
                int i2 = 0;
                int i3 = 0;
                while (i3 < length) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i3);
                    y1 y1Var = new y1(i2, bm0.d);
                    while (y1Var.hasNext()) {
                        bm0 bm0Var = (bm0) y1Var.next();
                        String string = jSONObject.getString(str2);
                        hm0 hm0Var2 = new hm0(jSONObject.getString(str2) + bm0Var.a);
                        Iterator it = ((mbc) pq3.j.e(context).d).b.values().iterator();
                        while (true) {
                            numC1 = null;
                            if (!it.hasNext()) {
                                str = str2;
                                next = null;
                                break;
                            }
                            next = it.next();
                            str = str2;
                            nbc nbcVar = (nbc) next;
                            if (cqk.d(nbcVar != null ? nbcVar.c : null, string)) {
                                break;
                            }
                            str2 = str;
                        }
                        nbc nbcVar2 = (nbc) next;
                        if (nbcVar2 != null) {
                            vyh vyhVar = f55.l(nbcVar2, bm0Var.b).C().a;
                            int[] iArr = (int[]) vyhVar.f;
                            int i4 = vyhVar.b;
                            if (hm0Var == null || hm0Var.equals(hm0Var2)) {
                                JSONObject jSONObject2 = (!zA && jSONObject.has("pattern")) ? jSONObject.getJSONObject("pattern") : null;
                                JSONObject jSONObject3 = jSONObject.has("gradient") ? jSONObject.getJSONObject("gradient") : null;
                                JSONArray jSONArray2 = jSONObject.has("radial_gradient") ? jSONObject.getJSONArray("radial_gradient") : null;
                                JSONArray jSONArray3 = jSONObject.has("pattern_radial_gradient") ? jSONObject.getJSONArray("pattern_radial_gradient") : null;
                                Boolean boolValueOf = jSONObject.has("fill_color") ? Boolean.valueOf(jSONObject.getBoolean("fill_color")) : null;
                                if (jSONObject2 != null) {
                                    sriVar = new sri(jSONObject2.getString("image"), gm0.K(yl5.d().getDisplayMetrics().density * jSONObject2.getInt("width")), gm0.K(yl5.d().getDisplayMetrics().density * jSONObject2.getInt("height")), Color.alpha(i4), jSONObject2.getBoolean("is_overlay"), anl.c(i4));
                                } else {
                                    sriVar = null;
                                }
                                qri qriVar = jSONObject3 != null ? new qri(iArr, (float) jSONObject3.getDouble("angle")) : null;
                                ArrayList arrayListB = jSONArray2 != null ? b(jSONArray2, (int[]) vyhVar.e) : null;
                                ArrayList arrayListB2 = jSONArray3 != null ? b(jSONArray3, (int[]) vyhVar.d) : null;
                                qri qriVar2 = jSONObject3 != null ? new qri((int[]) vyhVar.c, (float) jSONObject3.getDouble("angle")) : null;
                                if (cqk.d(boolValueOf, Boolean.TRUE)) {
                                    i = 0;
                                    numC1 = a.c1(0, iArr);
                                } else {
                                    i = 0;
                                }
                                linkedHashMap.put(hm0Var2, new tri(sriVar, qriVar, qriVar2, arrayListB, arrayListB2, numC1));
                            } else {
                                length = length;
                                i3 = i3;
                                jSONObject = jSONObject;
                                i = 0;
                            }
                        } else {
                            length = length;
                            i3 = i3;
                            jSONObject = jSONObject;
                            i = 0;
                        }
                        i2 = i;
                        i3 = i3;
                        str2 = str;
                        zA = zA;
                        jSONArray = jSONArray;
                        length = length;
                        jSONObject = jSONObject;
                        hm0Var = hm0Var;
                    }
                    i3++;
                }
            } catch (JSONException e) {
                gm0.n("BackgroundDataLoader", "parse theme json failed: " + e);
            }
        } catch (IOException e2) {
            gm0.n("BackgroundDataLoader", "load assets failed: " + e2);
        }
        return linkedHashMap;
    }

    public final Object d(Context context, sri sriVar, mdh mdhVar) {
        return yab.K0(((n0c) ((xhh) this.a.getValue())).b(), new fze(this, context, sriVar, null, 4), mdhVar);
    }
}
