package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class dbm {
    private static iwk k;
    private static final owk l = owk.c("optional-module-barcode", zgc.c);
    private final String a;
    private final String b;
    private final tam c;
    private final a0g d;
    private final Task e;
    private final Task f;
    private final String g;
    private final int h;
    private final Map i = new HashMap();
    private final Map j = new HashMap();

    public dbm(Context context, final a0g a0gVar, tam tamVar, String str) {
        this.a = context.getPackageName();
        this.b = p44.a(context);
        this.d = a0gVar;
        this.c = tamVar;
        vbm.a();
        this.g = str;
        this.e = zj9.b().c(new Callable() { // from class: zam
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.b();
            }
        });
        zj9 zj9VarB = zj9.b();
        Objects.requireNonNull(a0gVar);
        this.f = zj9VarB.c(new Callable() { // from class: abm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return a0gVar.i();
            }
        });
        owk owkVar = l;
        this.h = owkVar.containsKey(str) ? rx5.d(context, (String) owkVar.get(str), false) : -1;
    }

    public static long a(List list, double d) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    private static synchronized iwk i() {
        try {
            iwk iwkVar = k;
            if (iwkVar != null) {
                return iwkVar;
            }
            mc9 mc9Var = new mc9(new nc9(Resources.getSystem().getConfiguration().getLocales()));
            zvk zvkVar = new zvk();
            for (int i = 0; i < mc9Var.d(); i++) {
                zvkVar.e(p44.b(mc9Var.b(i)));
            }
            iwk iwkVarG = zvkVar.g();
            k = iwkVarG;
            return iwkVarG;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final String j() {
        if (this.e.j()) {
            return (String) this.e.h();
        }
        return j09.c.a(this.g);
    }

    private final boolean k(p3m p3mVar, long j, long j2) {
        return this.i.get(p3mVar) == null || j - ((Long) this.i.get(p3mVar)).longValue() > WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
    }

    public final String b() throws Exception {
        return j09.c.a(this.g);
    }

    public final /* synthetic */ void c(sam samVar, p3m p3mVar, String str) {
        samVar.b(p3mVar);
        String strC = samVar.c();
        h9m h9mVar = new h9m();
        h9mVar.b(this.a);
        h9mVar.c(this.b);
        h9mVar.h(i());
        h9mVar.g(Boolean.TRUE);
        h9mVar.l(strC);
        h9mVar.j(str);
        h9mVar.i(this.f.j() ? (String) this.f.h() : this.d.i());
        h9mVar.d(10);
        h9mVar.k(Integer.valueOf(this.h));
        samVar.d(h9mVar);
        this.c.a(samVar);
    }

    public final void d(sam samVar, p3m p3mVar) {
        e(samVar, p3mVar, j());
    }

    public final void e(final sam samVar, final p3m p3mVar, final String str) {
        zj9.g().execute(new Runnable() { // from class: xam
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c(samVar, p3mVar, str);
            }
        });
    }

    public final void f(cbm cbmVar, p3m p3mVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(p3mVar, jElapsedRealtime, 30L)) {
            this.i.put(p3mVar, Long.valueOf(jElapsedRealtime));
            e(cbmVar.zza(), p3mVar, j());
        }
    }

    public final /* synthetic */ void g(p3m p3mVar, vll vllVar) {
        axk axkVar = (axk) this.j.get(p3mVar);
        if (axkVar != null) {
            for (Object obj : axkVar.c()) {
                ArrayList arrayList = new ArrayList(axkVar.b(obj));
                Collections.sort(arrayList);
                l1m l1mVar = new l1m();
                Iterator it = arrayList.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                l1mVar.a(Long.valueOf(jLongValue / ((long) arrayList.size())));
                l1mVar.c(Long.valueOf(a(arrayList, 100.0d)));
                l1mVar.f(Long.valueOf(a(arrayList, 75.0d)));
                l1mVar.d(Long.valueOf(a(arrayList, 50.0d)));
                l1mVar.b(Long.valueOf(a(arrayList, 25.0d)));
                l1mVar.e(Long.valueOf(a(arrayList, 0.0d)));
                e(vllVar.a(obj, arrayList.size(), l1mVar.g()), p3mVar, j());
            }
            this.j.remove(p3mVar);
        }
    }

    public final /* synthetic */ void h(final p3m p3mVar, Object obj, long j, final vll vllVar) {
        if (!this.j.containsKey(p3mVar)) {
            this.j.put(p3mVar, zsk.z());
        }
        ((axk) this.j.get(p3mVar)).f(obj, Long.valueOf(j));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(p3mVar, jElapsedRealtime, 30L)) {
            this.i.put(p3mVar, Long.valueOf(jElapsedRealtime));
            zj9.g().execute(new Runnable() { // from class: yam
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.g(p3mVar, vllVar);
                }
            });
        }
    }
}
