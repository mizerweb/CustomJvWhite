package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class ftj implements rtj {
    public final long a;
    public final long b;
    public final Context c;
    public final int d;

    public ftj(long j, long j2, Context context, gjf gjfVar) {
        this.a = j;
        this.b = j2;
        this.c = context;
        this.d = ((Number) ((g5d) gjfVar).a.K1.a(e5d.S6[139]).i()).intValue();
    }

    @Override // defpackage.rtj
    public final Boolean a(String str, String str2) {
        SharedPreferences sharedPreferencesB = b();
        if (!sharedPreferencesB.contains(str) && sharedPreferencesB.getAll().size() == this.d) {
            return Boolean.FALSE;
        }
        sharedPreferencesB.edit().putString(str, str2).apply();
        return Boolean.TRUE;
    }

    public final SharedPreferences b() {
        StringBuilder sbS = qt4.s(this.b, "webapp_ds_", "_");
        sbS.append(this.a);
        return this.c.getApplicationContext().getSharedPreferences(sbS.toString(), 0);
    }

    @Override // defpackage.rtj
    public final Boolean clear() {
        SharedPreferences sharedPreferencesB = b();
        if (sharedPreferencesB.getAll().isEmpty()) {
            return Boolean.FALSE;
        }
        sharedPreferencesB.edit().clear().apply();
        return Boolean.TRUE;
    }

    @Override // defpackage.rtj
    public final Object get(String str) {
        return b().getString(str, null);
    }

    @Override // defpackage.rtj
    public final Boolean remove(String str) {
        SharedPreferences sharedPreferencesB = b();
        if (!sharedPreferencesB.contains(str)) {
            return Boolean.FALSE;
        }
        sharedPreferencesB.edit().remove(str).apply();
        return Boolean.TRUE;
    }
}
