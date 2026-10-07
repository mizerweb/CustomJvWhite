package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.text.SimpleDateFormat;
import java.util.Locale;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class p35 {
    public long a;
    public final Object b;
    public Object c;

    public p35(ivb ivbVar) {
        this.c = ivbVar;
        qvi qviVar = new qvi();
        qviVar.a = -1L;
        qviVar.b = -1L;
        this.b = qviVar;
        boolean z = nec.a;
        this.a = BuildConfig.SILENCE_TIME_TO_UPLOAD;
    }

    public void a(long j) {
        h4d h4dVar = ((ivb) this.c).c;
        boolean zC = h4dVar != null ? h4dVar.c() : false;
        qvi qviVar = (qvi) this.b;
        if (zC) {
            qviVar.a = SystemClock.elapsedRealtime();
        } else {
            qviVar.a = j;
        }
        qviVar.b = qviVar.a;
    }

    public long b() {
        h4d h4dVar;
        h4d h4dVar2;
        ivb ivbVar = (ivb) this.c;
        qvi qviVar = (qvi) this.b;
        long j = qviVar.a;
        if (j < 0) {
            return -1L;
        }
        long j2 = qviVar.b;
        if (j2 > j || (j2 == 0 && j == 0)) {
            h4d h4dVar3 = ivbVar.c;
            boolean zC = h4dVar3 != null ? h4dVar3.c() : false;
            aec aecVar = ivbVar.b;
            if (zC) {
                if (aecVar != null && (h4dVar2 = ivbVar.c) != null) {
                    kvb.p(h4dVar2, new lk8(aecVar, ((h4dVar2 != null ? h4dVar2.c() : false) && cqk.d(Looper.myLooper(), Looper.getMainLooper())) ? Long.valueOf(((ldc) aecVar).y()) : null, null), n2m.b(j, j2));
                }
            } else if (aecVar != null && (h4dVar = ivbVar.c) != null) {
                kvb.q(h4dVar, new lk8(aecVar, null, null), n2m.b(j, j2));
            }
        }
        qviVar.a = -1L;
        qviVar.b = -1L;
        return j2;
    }

    public p35() {
        this.b = new SimpleDateFormat("yyyy-MM-dd'T'XXX HH:mm:", Locale.US);
        this.c = "";
    }
}
