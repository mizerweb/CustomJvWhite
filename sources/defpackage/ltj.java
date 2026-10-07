package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class ltj implements rtj {
    public final long a;
    public final long b;
    public final Context c;
    public final iv4 d;
    public final whj e;
    public final int f;
    public final String g;

    public ltj(long j, long j2, Context context, gjf gjfVar, iv4 iv4Var) {
        StringBuilder sbS = qt4.s(j2, "webapp_s_key_", "_");
        sbS.append(j);
        whj whjVar = new whj(sbS.toString(), false);
        this.a = j;
        this.b = j2;
        this.c = context;
        this.d = iv4Var;
        this.e = whjVar;
        this.f = ((Number) ((g5d) gjfVar).a.L1.a(e5d.S6[140]).i()).intValue();
        this.g = ltj.class.getName();
    }

    @Override // defpackage.rtj
    public final Boolean a(String str, String str2) {
        Object poeVar;
        SharedPreferences sharedPreferencesB = b();
        try {
            whj whjVar = this.e;
            zv8[] zv8VarArr = whj.f;
            poeVar = whjVar.e(str2, null);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            Throwable thA = roe.a(poeVar);
            gm0.V(this.g, "Can't encrypt value", thA);
            this.d.a(null, new ktj(this.a, thA));
            return Boolean.FALSE;
        }
        ch3.d0(poeVar);
        String str3 = (String) poeVar;
        if (!sharedPreferencesB.contains(str) && sharedPreferencesB.getAll().size() == this.f) {
            return Boolean.FALSE;
        }
        sharedPreferencesB.edit().putString(str, str3).apply();
        return Boolean.TRUE;
    }

    public final SharedPreferences b() {
        StringBuilder sbS = qt4.s(this.b, "webapp_ss_", "_");
        sbS.append(this.a);
        return this.c.getApplicationContext().getSharedPreferences(sbS.toString(), 0);
    }

    @Override // defpackage.rtj
    public final Boolean clear() {
        SharedPreferences sharedPreferencesB = b();
        if (sharedPreferencesB.getAll().isEmpty()) {
            return Boolean.FALSE;
        }
        this.e.c();
        sharedPreferencesB.edit().clear().apply();
        return Boolean.TRUE;
    }

    @Override // defpackage.rtj
    public final Object get(String str) {
        Object poeVar;
        String string = b().getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            whj whjVar = this.e;
            zv8[] zv8VarArr = whj.f;
            poeVar = whjVar.d(string, null);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        boolean z = poeVar instanceof poe;
        if (z) {
            Throwable thA = roe.a(poeVar);
            gm0.V(this.g, "Can't decrypt value", thA);
            this.d.a(null, new jtj(this.a, thA));
        }
        if (z) {
            return null;
        }
        return poeVar;
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
