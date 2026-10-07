package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zr6 implements SharedPreferences.Editor {
    public final HashMap a = new HashMap();
    public final Object b = new Object();
    public boolean c;
    public final /* synthetic */ as6 d;

    public zr6(as6 as6Var) {
        this.d = as6Var;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        ds6 ds6Var = this.d.b;
        if (ds6Var != null) {
            ds6Var.log("apply");
        }
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        synchronized (this.b) {
            this.c = true;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a6 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:9:0x002d, B:11:0x003c, B:13:0x0040, B:16:0x0049, B:18:0x004f, B:21:0x0057, B:23:0x005c, B:24:0x0066, B:26:0x006c, B:31:0x0083, B:33:0x0089, B:35:0x008f, B:38:0x0096, B:44:0x00a6, B:39:0x009a, B:42:0x00a1, B:46:0x00ab, B:50:0x00b6, B:51:0x00bb, B:53:0x00ce), top: B:63:0x002d, outer: #1 }] */
    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        boolean z;
        Object objD;
        boolean z2;
        ds6 ds6Var = this.d.b;
        if (ds6Var != null) {
            ds6Var.log("commit");
        }
        as6 as6Var = this.d;
        synchronized (as6Var.g) {
            b9b b9bVar = new b9b(as6Var.d.e);
            b9bVar.l(as6Var.d);
            Set setX1 = ww3.X1((HashSet) as6Var.f.getValue());
            synchronized (this.b) {
                try {
                    boolean zIsEmpty = setX1.isEmpty();
                    u8b u8bVar = new u8b();
                    boolean z3 = false;
                    if (this.c) {
                        ds6 ds6Var2 = as6Var.b;
                        if (ds6Var2 != null) {
                            ds6Var2.log("commit: is cleared");
                        }
                        if (b9bVar.f()) {
                            b9bVar.g();
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z = z2;
                        this.c = false;
                        z3 = z2;
                    } else {
                        z = false;
                    }
                    for (Map.Entry entry : this.a.entrySet()) {
                        String str = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (str != null) {
                            if (value == this || value == null) {
                                if (b9bVar.b(str)) {
                                    b9bVar.m(str);
                                    if (!zIsEmpty) {
                                        u8bVar.b(str);
                                    }
                                    z = true;
                                }
                            } else if (!b9bVar.b(str) || (objD = b9bVar.d(str)) == null || !objD.equals(value)) {
                                b9bVar.o(str, value);
                                if (!zIsEmpty) {
                                    u8bVar.b(str);
                                }
                                z = true;
                            }
                        }
                    }
                    this.a.clear();
                    ds6 ds6Var3 = as6Var.b;
                    if (z) {
                        if (ds6Var3 != null) {
                            ds6Var3.log("commit: has changes");
                        }
                        as6Var.d = b9bVar;
                        ((gs6) as6Var.e.getValue()).a(b9bVar);
                        as6Var.b(setX1, z3, u8bVar);
                    } else if (ds6Var3 != null) {
                        ds6Var3.log("commit: no changes");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        synchronized (this.b) {
            this.a.put(str, Boolean.valueOf(z));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        synchronized (this.b) {
            this.a.put(str, Float.valueOf(f));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        synchronized (this.b) {
            this.a.put(str, Integer.valueOf(i));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        synchronized (this.b) {
            this.a.put(str, Long.valueOf(j));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        synchronized (this.b) {
            this.a.put(str, str2);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        synchronized (this.b) {
            this.a.put(str, set);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        synchronized (this.b) {
            this.a.put(str, this);
        }
        return this;
    }
}
