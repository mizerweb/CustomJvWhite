package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class wx {
    public final String a;
    public final vx b;
    public final boolean c;
    public j85 d;
    public final Handler e;
    public final LinkedHashSet f;
    public final Object g;
    public int h;
    public LinkedHashMap i;

    public wx(String str, vx vxVar, boolean z) {
        this.a = str;
        this.b = vxVar;
        this.c = z;
        Looper looperMyLooper = Looper.myLooper();
        this.e = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper);
        this.f = new LinkedHashSet();
        this.g = new Object();
        this.i = new LinkedHashMap();
    }

    public final void a(boolean z, String str, af7 af7Var) {
        boolean z2;
        boolean z3 = nec.a;
        if (z) {
            return;
        }
        String str2 = (String) af7Var.invoke();
        zyh zyhVar = new zyh(this.a, str, str2);
        Log.e("AssertionTracker", str2, zyhVar);
        if (this.c) {
            if (this.f.add(Integer.valueOf(gm0.N(zyhVar).hashCode())) && this.d != null) {
                yx yxVar = yx.a;
            }
            synchronized (this.g) {
                try {
                    Integer num = (Integer) this.i.get(str);
                    this.i.put(str, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                    int i = this.h + 1;
                    this.h = i;
                    z2 = i >= 1000;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.e.removeCallbacksAndMessages(null);
            if (z2) {
                b();
            } else {
                this.e.postDelayed(new c3(6, this), BuildConfig.SILENCE_TIME_TO_UPLOAD);
            }
        }
        if (this.b.a) {
            throw zyhVar;
        }
    }

    public final void b() {
        LinkedHashMap linkedHashMap;
        synchronized (this.g) {
            linkedHashMap = this.i;
            this.i = new LinkedHashMap();
            this.h = 0;
        }
        if (this.d != null) {
            ps8 ps8Var = qs8.d;
            khb khbVar = ps8Var.b;
            int i = dw8.c;
            dw8 dw8VarA = ui6.a(zfe.c(String.class));
            dw8 dw8VarA2 = ui6.a(zfe.c(Integer.TYPE));
            age ageVar = zfe.a;
            sr3 sr3VarA = zfe.a(Map.class);
            List listAsList = Arrays.asList(dw8VarA, dw8VarA2);
            ageVar.getClass();
            ps8Var.b(tre.A0(khbVar, new f9i(sr3VarA, listAsList, 2)), linkedHashMap);
            yx yxVar = yx.a;
        }
    }
}
