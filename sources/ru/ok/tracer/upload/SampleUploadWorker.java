package ru.ok.tracer.upload;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import defpackage.a28;
import defpackage.ch3;
import defpackage.cqk;
import defpackage.d25;
import defpackage.e9i;
import defpackage.euc;
import defpackage.ft0;
import defpackage.i4e;
import defpackage.igh;
import defpackage.iql;
import defpackage.k89;
import defpackage.l28;
import defpackage.l89;
import defpackage.lt4;
import defpackage.lu6;
import defpackage.mol;
import defpackage.n1g;
import defpackage.pr6;
import defpackage.pt2;
import defpackage.q36;
import defpackage.rx8;
import defpackage.sb8;
import defpackage.snf;
import defpackage.so2;
import defpackage.swh;
import defpackage.ul9;
import defpackage.v2a;
import defpackage.w18;
import defpackage.wm9;
import defpackage.ww3;
import defpackage.yab;
import defpackage.z5h;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tracer/upload/SampleUploadWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tracer-sample-upload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SampleUploadWorker extends Worker {
    public SampleUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final l89 d() {
        Context context = this.a;
        WorkerParameters workerParameters = this.b;
        File file = null;
        try {
            d25 d25Var = workerParameters.b;
            d25 d25Var2 = workerParameters.b;
            File file2 = new File(d25Var.d("tracer_sample_file_path"));
            try {
                if (!file2.exists()) {
                    file2.getPath();
                    return new k89();
                }
                long jC = d25Var2.c("tracer_sample_file_size", -1L);
                Long lValueOf = jC > 0 ? Long.valueOf(jC) : null;
                String strD = d25Var2.d("tracer_sample_file_name");
                if (n1g.z(e9i.d0(context.getPackageManager(), context.getPackageName())) != d25Var2.c("tracer_version_code", 0L)) {
                    file2.delete();
                    return new k89();
                }
                String strE = e(strD, lValueOf);
                if (strE != null) {
                    f(file2, strE);
                }
                return new k89();
            } catch (Exception unused) {
                file = file2;
                if (file != null && file.exists()) {
                    file.delete();
                }
            }
        } catch (Exception unused2) {
        }
    }

    public final String e(String str, Long l) throws JSONException {
        Map mapSingletonMap;
        swh swhVar = swh.a;
        String strA = swh.a();
        if (strA == null) {
            return null;
        }
        ul9 ul9Var = new ul9();
        WorkerParameters workerParameters = this.b;
        d25 d25Var = workerParameters.b;
        d25 d25Var2 = workerParameters.b;
        String[] strArrE = d25Var.e("tracer_custom_properties_keys");
        if (strArrE == null) {
            strArrE = new String[0];
        }
        for (String str2 : strArrE) {
            String strD = d25Var2.d(str2);
            if (strD != null) {
                ul9Var.put(str2, strD);
            }
        }
        ul9 ul9VarB = ul9Var.b();
        swh swhVar2 = swh.a;
        snf snfVar = swh.e;
        if (snfVar == null) {
            snfVar = null;
        }
        snfVar.b();
        igh ighVarA = snfVar.f;
        if (ighVarA == null) {
            ighVarA = null;
        }
        if (!ul9VarB.isEmpty()) {
            ighVarA = igh.a(ighVarA, false, wm9.T0(ul9VarB, ighVarA.n), 24575);
        }
        ighVarA.getClass();
        String strA2 = iql.a(new Date());
        Map map = ighVarA.n;
        if (map.isEmpty()) {
            mapSingletonMap = Collections.singletonMap("date", strA2);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put("date", strA2);
            mapSingletonMap = linkedHashMap;
        }
        JSONObject jSONObjectF0 = yab.F0(igh.a(ighVarA, false, mapSingletonMap, 24575));
        jSONObjectF0.put("feature", workerParameters.b.d("tracer_feature_name"));
        jSONObjectF0.put("sampleSize", l);
        jSONObjectF0.put("sampleFileName", str);
        jSONObjectF0.put("sampleUuid", d25Var2.d("tracer_sample_uuid"));
        if (d25Var2.a("tracer_has_attr1", false)) {
            jSONObjectF0.put("attr1", d25Var2.c("tracer_attr1", 0L));
        }
        if (d25Var2.a("tracer_has_attr2", false)) {
            jSONObjectF0.put("attr2", d25Var2.c("tracer_attr2", 0L));
        }
        if (workerParameters.b.d("tracer_feature_tag") != null) {
            jSONObjectF0.put("tag", workerParameters.b.d("tracer_feature_tag"));
        }
        String strD2 = d25Var2.d("tracer_trace_id");
        String strD3 = d25Var2.d("tracer_span_id");
        String strD4 = d25Var2.d("tracer_trace_flags");
        if (strD2 != null && strD3 != null && strD4 != null) {
            jSONObjectF0.put("traceId", strD2);
            jSONObjectF0.put("spanId", strD3);
            jSONObjectF0.put("traceFlags", strD4);
        }
        Object obj = swh.c().get(cqk.b);
        lt4 lt4Var = obj instanceof lt4 ? (lt4) obj : null;
        if (lt4Var == null) {
            lt4Var = new lt4(new v2a(18));
        }
        euc eucVar = new euc(Uri.parse(lt4Var.b()).buildUpon().appendEncodedPath("api/sample/initUpload").appendQueryParameter("sampleToken", strA).toString(), new pr6(BaseHttpHeadersHolder.CONTENT_TYPE_JSON, 1, jSONObjectF0.toString().getBytes(pt2.a)));
        jSONObjectF0.toString();
        a28 a28VarB = ((l28) swh.h.getValue()).b(eucVar);
        try {
            JSONObject jSONObject = new JSONObject(z5h.F0((byte[]) ((pr6) a28VarB.d).c));
            so2.P(jSONObject, workerParameters.b.d("tracer_feature_name"), workerParameters.b.d("tracer_feature_tag"));
            if (a28VarB.b != 200) {
                return null;
            }
            return jSONObject.getString("uploadToken");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(a28VarB, th);
                throw th2;
            }
        }
    }

    public final void f(File file, String str) throws IOException {
        String str2;
        WorkerParameters workerParameters = this.b;
        if (workerParameters.b.a("tracer_feature_uze_gzip", true)) {
            String string = workerParameters.a.toString();
            String strP = ch3.p();
            Context context = this.a;
            if (strP.equals(context.getPackageName())) {
                str2 = "tracer";
            } else {
                str2 = "tracer-" + ((Object) Uri.encode(z5h.I0(strP, ':', '-', false)));
            }
            File file2 = new File(context.getCacheDir(), str2);
            sb8.U(file2);
            File fileQ0 = lu6.q0(file2, string.concat(".tmp"));
            try {
                mol.b(file, fileQ0);
                file.length();
                fileQ0.length();
                file.delete();
                file = fileQ0;
            } catch (IOException e) {
                fileQ0.delete();
                throw e;
            }
        } else {
            file.length();
        }
        swh swhVar = swh.a;
        Object obj = swh.c().get(cqk.b);
        lt4 lt4Var = obj instanceof lt4 ? (lt4) obj : null;
        if (lt4Var == null) {
            lt4Var = new lt4(new v2a(18));
        }
        String string2 = Uri.parse(lt4Var.b()).buildUpon().appendEncodedPath("api/sample/upload").appendQueryParameter("uploadToken", str).toString();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new w18("file", "sample", "application/octet-stream", new ft0(file)));
        try {
            a28 a28VarB = ((l28) swh.h.getValue()).b(new euc(string2, new q36(String.format("------------%016x", Arrays.copyOf(new Object[]{Long.valueOf(i4e.b.f())}, 1)), ww3.T1(arrayList))));
            try {
                int i = a28VarB.b;
                String str3 = (String) a28VarB.c;
                String strF0 = z5h.F0((byte[]) ((pr6) a28VarB.d).c);
                String strD = workerParameters.b.d("tracer_feature_name");
                String strD2 = workerParameters.b.d("tracer_feature_tag");
                if (z5h.K0(strF0, "{", false)) {
                    try {
                        so2.P(new JSONObject(strF0), strD, strD2);
                    } catch (JSONException unused) {
                    }
                }
                if (i != 200) {
                    Log.e("Tracer", str3 + " , " + strF0);
                }
                file.delete();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(a28VarB, th);
                    throw th2;
                }
            }
        } catch (Exception unused2) {
            file.delete();
        } catch (Throwable th3) {
            file.delete();
            throw th3;
        }
    }
}
