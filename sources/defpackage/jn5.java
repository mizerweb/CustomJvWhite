package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.work.a;
import androidx.work.b;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ru.ok.tracer.disk.usage.DiskUsageWorker;
import ru.ok.tracer.heap.dumps.exceptions.ShrinkDumpWorker;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jn5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ jn5(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 2;
        int i3 = 0;
        Context context = this.b;
        switch (i) {
            case 0:
                a8g.i = context;
                swh swhVar = swh.a;
                Object obj = swh.c().get(ch3.b);
                in5 in5Var = obj instanceof in5 ? (in5) obj : null;
                if (in5Var == null) {
                    in5Var = new in5(new dv4());
                }
                String str = "tracer.disk.usage.worker";
                if (!in5Var.a) {
                    Context context2 = a8g.i;
                    oyj oyjVarD = oyj.d(context2 != null ? context2 : null);
                    lvb.v0(oyjVarD.b.m, "CancelWorkByName_".concat("tracer.disk.usage.worker"), oyjVarD.d.a, new yj2(str, oyjVarD));
                    return;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Object obj2 = swh.c().get(cqk.b);
                if ((obj2 instanceof lt4 ? (lt4) obj2 : null) == null) {
                    new v2a(18).j();
                }
                kg4 kg4Var = new kg4(new adb(null), 3, false, true, true, false, -1L, -1L, ww3.X1(linkedHashSet));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("probability", 0L);
                d25 d25Var = new d25(linkedHashMap);
                f55.y(d25Var);
                gsc gscVar = (gsc) ((b) ((b) new b(DiskUsageWorker.class, 1L, TimeUnit.DAYS).setInputData(d25Var)).setConstraints(kg4Var)).build();
                Context context3 = a8g.i;
                oyj.d(context3 != null ? context3 : null).c("tracer.disk.usage.worker", 2, gscVar);
                return;
            case 1:
                nu7 nu7Var = nu7.a;
                nu7.c = context;
                File fileL = nhb.l(context);
                swh swhVar2 = swh.a;
                Object obj3 = swh.c().get(np4.b);
                ku7 ku7Var = obj3 instanceof ku7 ? (ku7) obj3 : null;
                if (ku7Var == null) {
                    ku7Var = new ku7(new dv4());
                }
                nu7.a(lu6.q0(fileL, "dump-tmp.hprof"));
                nu7.a(lu6.q0(fileL, "dump-tmp-meta.json"));
                if (!ku7Var.a) {
                    nu7.a(lu6.q0(fileL, "dump.hprof"));
                    nu7.a(lu6.q0(fileL, "dump-meta.json"));
                    nu7.b.set(false);
                    return;
                }
                vd7.J(new j94(1));
                Context context4 = nu7.c;
                if (context4 == null) {
                    return;
                }
                File fileL2 = nhb.l(context4);
                File fileQ0 = lu6.q0(fileL2, "dump.hprof");
                File fileQ1 = lu6.q0(fileL2, "dump-meta.json");
                if (fileQ0.exists() || fileQ1.exists()) {
                    try {
                        mu7 mu7VarB = v0m.b(lu6.p0(fileQ1, pt2.a));
                        sb8.o(fileQ1);
                        String strA = mu7VarB.a();
                        m3a m3aVar = swh.c;
                        String str2 = (String) (m3aVar != null ? m3aVar : null).d;
                        if (!cqk.d(strA, str2)) {
                            throw new IllegalStateException(("Dump from different buildUuid. Current " + str2 + " != " + strA).toString());
                        }
                        String strB = mu7VarB.b();
                        File fileL3 = nhb.l(context4);
                        sb8.U(fileL3);
                        File fileQ2 = lu6.q0(fileL3, "HEAP_DUMP_" + System.currentTimeMillis() + ".bin");
                        sb8.e0(fileQ0, fileQ2);
                        cdc cdcVar = (cdc) ((a) new a(ShrinkDumpWorker.class).setInputData(gql.a(fileQ2, strB))).build();
                        ifh ifhVar = yxh.a;
                        new Handler(Looper.getMainLooper()).post(new wxh(new su6(context4, i2, cdcVar), i3));
                        return;
                    } catch (Exception unused) {
                        nu7.a(fileQ0);
                        nu7.a(fileQ1);
                        return;
                    }
                }
                return;
            case 2:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new jn5(context, 3));
                return;
            default:
                oc9.j0(context, new sv(1), oc9.w, false);
                return;
        }
    }
}
