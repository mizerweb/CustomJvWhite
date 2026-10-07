package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.UUID;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

/* JADX INFO: loaded from: classes.dex */
public class a0g {
    public static final String b = "com.google.mlkit.internal";
    public static final v64 c;
    protected final Context a;

    static {
        u64 u64VarB = v64.b(a0g.class);
        u64VarB.a(ph5.a(j0b.class));
        u64VarB.a(ph5.a(Context.class));
        u64VarB.f = new k74() { // from class: i5m
            @Override // defpackage.k74
            public final Object B(h74 h74Var) {
                return new a0g((Context) h74Var.a(Context.class));
            }
        };
        c = u64VarB.b();
    }

    public a0g(Context context) {
        this.a = context;
    }

    public static a0g g(j0b j0bVar) {
        return (a0g) j0bVar.a(a0g.class);
    }

    public synchronized void a(fie fieVar) {
        String strD = d(fieVar);
        q().edit().remove("downloading_model_id_" + fieVar.f()).remove("downloading_model_hash_" + fieVar.f()).remove("downloading_model_type_" + strD).remove("downloading_begin_time_" + fieVar.f()).remove("model_first_use_time_" + fieVar.f()).apply();
    }

    public synchronized void b(fie fieVar) {
        q().edit().remove("bad_hash_" + fieVar.f()).remove(CallAnalyticsApiRequest.KEY_APP_VERSION).apply();
    }

    public synchronized void c(fie fieVar) {
        q().edit().remove("current_model_hash_" + fieVar.f()).commit();
    }

    public synchronized String d(fie fieVar) {
        return q().getString("downloading_model_hash_" + fieVar.f(), null);
    }

    public synchronized Long e(fie fieVar) {
        long j = q().getLong("downloading_model_id_" + fieVar.f(), -1L);
        if (j < 0) {
            return null;
        }
        return Long.valueOf(j);
    }

    public synchronized String f(fie fieVar) {
        return q().getString("bad_hash_" + fieVar.f(), null);
    }

    public synchronized String h(fie fieVar) {
        return q().getString("current_model_hash_" + fieVar.f(), null);
    }

    public synchronized String i() {
        String string = q().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        q().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    public synchronized long j(fie fieVar) {
        return q().getLong("downloading_begin_time_" + fieVar.f(), 0L);
    }

    public synchronized long k(fie fieVar) {
        return q().getLong("model_first_use_time_" + fieVar.f(), 0L);
    }

    public synchronized String l() {
        return q().getString(CallAnalyticsApiRequest.KEY_APP_VERSION, null);
    }

    public synchronized void m(long j, q0b q0bVar) {
        String strB = q0bVar.b();
        String strA = q0bVar.a();
        q().edit().putString("downloading_model_hash_" + strB, strA).putLong("downloading_model_id_" + strB, j).putLong("downloading_begin_time_" + strB, SystemClock.elapsedRealtime()).apply();
    }

    public synchronized void n(fie fieVar, String str, String str2) {
        q().edit().putString("bad_hash_" + fieVar.f(), str).putString(CallAnalyticsApiRequest.KEY_APP_VERSION, str2).apply();
    }

    public synchronized void o(fie fieVar, String str) {
        q().edit().putString("current_model_hash_" + fieVar.f(), str).apply();
    }

    public synchronized void p(fie fieVar, long j) {
        q().edit().putLong("model_first_use_time_" + fieVar.f(), j).apply();
    }

    public final SharedPreferences q() {
        return this.a.getSharedPreferences(b, 0);
    }

    public final synchronized String r(String str, long j) {
        SharedPreferences sharedPreferencesQ;
        sharedPreferencesQ = q();
        yab.s(str);
        return sharedPreferencesQ.getString(String.format("cached_local_model_hash_%1s_%2s", str, Long.valueOf(j)), null);
    }

    public final synchronized void s(String str, long j, String str2) {
        SharedPreferences.Editor editorEdit = q().edit();
        yab.s(str);
        editorEdit.putString(String.format("cached_local_model_hash_%1s_%2s", str, Long.valueOf(j)), str2).apply();
    }
}
