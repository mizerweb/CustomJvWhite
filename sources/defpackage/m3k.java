package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class m3k {
    public final SharedPreferences a;
    public final tu0 b;
    public final dq4 c;
    public long e;
    public long f;
    public long g;
    public long h;
    public sgg l;
    public final String d = m3k.class.getName();
    public boolean i = true;
    public final ArrayList j = new ArrayList();
    public boolean k = true;

    public m3k(SharedPreferences sharedPreferences, tu0 tu0Var, dq4 dq4Var) {
        this.a = sharedPreferences;
        this.b = tu0Var;
        this.c = dq4Var;
    }

    public final void a() {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putLong("start_realtime", this.e);
        editorEdit.putLong("start_uptime", this.f);
        editorEdit.putLong("last_realtime", this.g);
        editorEdit.putLong("last_uptime", this.h);
        editorEdit.putString("visibility_times", ww3.z1(this.j, ",", null, null, null, 62));
        editorEdit.putBoolean("is_started_in_foreground", this.i);
        editorEdit.apply();
        s2f.a(this.b, this.d, new vbi(24, this));
    }

    public final void b() {
        boolean z = this.k;
        sgg sggVar = this.l;
        lq4 lq4Var = null;
        if (z) {
            if (sggVar != null) {
                sggVar.b(null);
            }
            this.l = null;
        } else if (sggVar == null || !sggVar.isActive()) {
            this.l = yab.i0(this.c, null, 0, new oli(this, lq4Var, 27), 3);
        }
    }
}
