package ru.ok.tracer.disk.usage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.a8g;
import defpackage.ch3;
import defpackage.cqk;
import defpackage.gg5;
import defpackage.i4e;
import defpackage.i89;
import defpackage.ifh;
import defpackage.in5;
import defpackage.k89;
import defpackage.kn5;
import defpackage.l89;
import defpackage.lu6;
import defpackage.lv5;
import defpackage.nhb;
import defpackage.ou7;
import defpackage.r66;
import defpackage.ste;
import defpackage.un7;
import defpackage.ww3;
import defpackage.yw3;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tracer/disk/usage/DiskUsageWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "kn5", "tracer-disk-usage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DiskUsageWorker extends Worker {
    public final ifh e;

    public DiskUsageWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.e = new ifh(gg5.e);
    }

    public static String e(LinkedHashMap linkedHashMap, long j) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            jSONObject2.put(((un7) entry.getKey()).a, f((kn5) entry.getValue()));
        }
        jSONObject.put("consumers", jSONObject2);
        jSONObject.put("total_size", j);
        return jSONObject.toString();
    }

    public static JSONObject f(kn5 kn5Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        long j = kn5Var.a;
        List list = kn5Var.d;
        jSONObject.put("size", j);
        jSONObject.put(SdkMetricStatEvent.NAME_KEY, kn5Var.b);
        if (kn5Var.c) {
            jSONObject.put("is_dir", true);
        }
        if (kn5Var.e) {
            jSONObject.put("is_overflow", true);
        }
        if (kn5Var.f) {
            jSONObject.put("is_excluded", true);
        }
        if (!list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            List list2 = list;
            ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(jSONArray.put(f((kn5) it.next())));
            }
            jSONObject.put("children", jSONArray);
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public static kn5 h(File file, int i, ArrayList arrayList) {
        boolean z;
        ?? arrayList2;
        boolean z2;
        ?? r6;
        boolean z3;
        if (arrayList.contains(file)) {
            Objects.toString(file);
            return new kn5(0L, file.getName(), null, false, 28);
        }
        if (!file.isDirectory()) {
            return new kn5(file.length(), file.getName(), null, false, 60);
        }
        try {
            File parentFile = file.getParentFile();
            File file2 = parentFile == null ? file : new File(parentFile.getCanonicalFile(), file.getName());
            z = !cqk.d(file2.getCanonicalFile(), file2.getAbsoluteFile());
        } catch (IOException unused) {
            z = false;
        }
        if (z) {
            return new kn5(0L, file.getName(), null, false, 56);
        }
        File[] fileArrListFiles = file.listFiles();
        r66 r66Var = r66.a;
        if (fileArrListFiles != null) {
            arrayList2 = new ArrayList(fileArrListFiles.length);
            for (File file3 : fileArrListFiles) {
                arrayList2.add(h(file3, i + 1, arrayList));
            }
        } else {
            arrayList2 = r66Var;
        }
        Iterator it = ((Iterable) arrayList2).iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((kn5) it.next()).a;
        }
        long j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM + j;
        if (i > 6) {
            file.toString();
            z2 = true;
            r6 = r66Var;
        } else {
            z2 = false;
            r6 = arrayList2;
        }
        List listM1 = ww3.M1((Iterable) r6, new lv5(24));
        if (listM1.size() > 20) {
            file.toString();
            listM1 = listM1.subList(0, 20);
            z3 = true;
        } else {
            z3 = z2;
        }
        return new kn5(j2, file.getName(), listM1, z3, 32);
    }

    @Override // androidx.work.Worker
    public final l89 d() {
        File parentFile;
        ste steVar = ch3.b;
        if (a8g.n(steVar)) {
            return new k89();
        }
        long j = 0;
        long jC = this.b.b.c("probability", 0L);
        if (jC < 0 || (jC != 0 && i4e.b.g(jC) != 0)) {
            return new k89();
        }
        Context context = this.a;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            g(applicationInfo.dataDir, un7.INTERNAL_DATA, linkedHashMap);
            File externalFilesDir = context.getExternalFilesDir(null);
            g((externalFilesDir == null || (parentFile = externalFilesDir.getParentFile()) == null) ? null : parentFile.getPath(), un7.EXTERNAL_DATA, linkedHashMap);
            File parentFile2 = new File(applicationInfo.sourceDir).getParentFile();
            g(parentFile2 != null ? parentFile2.getPath() : null, un7.SRC, linkedHashMap);
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                j += ((kn5) it.next()).a;
            }
            ((in5) this.e.getValue()).getClass();
            if (j > 10737418240L) {
                File fileJ = nhb.j(context, steVar);
                lu6.s0(fileJ, e(linkedHashMap, j));
                ou7.g(context, steVar, fileJ, null, Long.valueOf(j), Collections.singletonMap("limit", String.valueOf(10737418240L)), 184);
            }
            return new k89();
        } catch (Exception unused) {
            return new i89();
        }
    }

    public final void g(String str, un7 un7Var, LinkedHashMap linkedHashMap) {
        if (str == null) {
            return;
        }
        String str2 = un7Var.a;
        File file = new File(str);
        ((in5) this.e.getValue()).getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(lu6.q0(file, ((String) it.next()).substring(str2.length() + 1)));
        }
        linkedHashMap.put(un7Var, h(file, 0, arrayList2));
    }
}
