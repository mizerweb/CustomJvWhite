package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ry8 implements SharedPreferences, e0g {
    public final ifh a;

    public ry8(Context context, bs6 bs6Var, cs6 cs6Var, ds6 ds6Var, g3 g3Var, int i) {
        this.a = new ifh(new qy8(context.getDir("file_prefs", 0), bs6Var, cs6Var, ds6Var, (i & 32) != 0 ? new ik4(10) : g3Var, 0));
    }

    @Override // defpackage.e0g
    public final Object a(String str) {
        return b().d.d(str);
    }

    public final as6 b() {
        return (as6) this.a.getValue();
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return b().d.b(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return b().edit();
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        return b().getAll();
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        return b().getBoolean(str, z);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        return b().getFloat(str, f);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        return b().getInt(str, i);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        return b().getLong(str, j);
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return b().getString(str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        return b().getStringSet(str, set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        b().registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        b().unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
