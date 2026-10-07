package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class as6 implements SharedPreferences, e0g {
    public final bs6 a;
    public final ds6 b;
    public final f40 c;
    public b9b d;
    public final ifh e;
    public final ny8 f;
    public final Object g;
    public final ifh h;

    public as6(File file, bs6 bs6Var, cs6 cs6Var, ds6 ds6Var) {
        this.a = bs6Var;
        this.b = ds6Var;
        File file2 = new File(file, r5h.g1(bs6Var.a, ".prefs").concat(".prefs"));
        f40 f40Var = new f40(file2, ds6Var != null ? new gve(this) : null);
        this.c = f40Var;
        this.d = new b9b(10);
        this.e = new ifh(new x5(this, 14, cs6Var));
        this.f = rx8.P(2, new i94(21));
        this.g = new Object();
        if (file2.exists()) {
            if (ds6Var != null) {
                try {
                    ds6Var.log("read prefs from file");
                } catch (Throwable th) {
                    ds6 ds6Var2 = this.b;
                    if (ds6Var2 != null) {
                        ds6Var2.error("read prefs from file failure", th);
                    }
                }
            }
            lvb.y0(f40Var, new z00(2, this));
        }
        this.h = new ifh(new i94(22));
    }

    @Override // defpackage.e0g
    public final Object a(String str) {
        return this.d.d(str);
    }

    public final void b(Set set, boolean z, u8b u8bVar) {
        if (set.isEmpty()) {
            return;
        }
        if (u8bVar.i() && !z) {
            return;
        }
        if (!cqk.d(Looper.myLooper(), Looper.getMainLooper())) {
            ((Handler) this.h.getValue()).post(new wf6(this, set, z, u8bVar));
            return;
        }
        if (z) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((SharedPreferences.OnSharedPreferenceChangeListener) it.next()).onSharedPreferenceChanged(this, null);
            }
        }
        Object[] objArr = u8bVar.a;
        int i = u8bVar.b;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            String str = (String) objArr[i];
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                ((SharedPreferences.OnSharedPreferenceChangeListener) it2.next()).onSharedPreferenceChanged(this, str);
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.d.b(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        int i = this.a.b;
        ds6 ds6Var = this.b;
        if (ds6Var != null) {
            ds6Var.log("edit: strategy = ".concat(qv1.x(i)));
        }
        int iD = qt4.D(i);
        if (iD == 0) {
            ore.k("not supported");
            return null;
        }
        if (iD == 1) {
            return new zr6(this);
        }
        ore.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0051 A[LOOP:0: B:5:0x0018->B:15:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0054 A[EDGE_INSN: B:18:0x0054->B:16:0x0054 BREAK  A[LOOP:0: B:5:0x0018->B:15:0x0051], SYNTHETIC] */
    @Override // android.content.SharedPreferences
    public final Map getAll() {
        mw mwVar = new mw(this.d.e);
        b9b b9bVar = this.d;
        Object[] objArr = b9bVar.b;
        Object[] objArr2 = b9bVar.c;
        long[] jArr = b9bVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            mwVar.put((String) objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return mwVar;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object objD = this.d.d(str);
        Boolean bool = objD instanceof Boolean ? (Boolean) objD : null;
        return bool != null ? bool.booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object objD = this.d.d(str);
        Float f2 = objD instanceof Float ? (Float) objD : null;
        return f2 != null ? f2.floatValue() : f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object objD = this.d.d(str);
        Integer num = objD instanceof Integer ? (Integer) objD : null;
        return num != null ? num.intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object objD = this.d.d(str);
        Long l = objD instanceof Long ? (Long) objD : null;
        return l != null ? l.longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objD = this.d.d(str);
        String str3 = objD instanceof String ? (String) objD : null;
        return str3 == null ? str2 : str3;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objD = this.d.d(str);
        Set set2 = objD instanceof Set ? (Set) objD : null;
        return set2 == null ? set : set2;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.g) {
            ((HashSet) this.f.getValue()).add(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.g) {
            ((HashSet) this.f.getValue()).remove(onSharedPreferenceChangeListener);
        }
    }
}
