package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class s5m {
    public static lok i;
    public static final xok j = xok.a(1, new Object[]{"optional-module-barcode", zgc.c}, null);
    public final String a;
    public final String b;
    public final m5m c;
    public final a0g d;
    public final Task e;
    public final Task f;
    public final String g;
    public final int h;

    public s5m(Context context, a0g a0gVar, m5m m5mVar) {
        new HashMap();
        new HashMap();
        this.a = context.getPackageName();
        this.b = p44.a(context);
        this.d = a0gVar;
        this.c = m5mVar;
        l6m.u();
        this.g = "common";
        this.e = zj9.b().c(new g35(5, this));
        zj9 zj9VarB = zj9.b();
        Objects.requireNonNull(a0gVar);
        this.f = zj9VarB.c(new vsl(a0gVar, 1));
        xok xokVar = j;
        this.h = xokVar.containsKey("common") ? rx5.d(context, (String) xokVar.get("common"), false) : -1;
    }

    public final void a(wze wzeVar, bul bulVar) throws Throwable {
        String strA;
        Task task = this.e;
        if (task.j()) {
            strA = (String) task.h();
        } else {
            strA = j09.c.a(this.g);
        }
        zj9.g().execute(new wn2(this, wzeVar, bulVar, strA, 5, false));
    }

    public final void b(wze wzeVar, fie fieVar, int i2) {
        z4m z4mVarA = c5m.a();
        z4mVarA.b = false;
        z4mVarA.g = (byte) (z4mVarA.g | 1);
        u0b u0bVarE = fieVar.e();
        if (u0bVarE == null) {
            ore.n("Null modelType");
            return;
        }
        z4mVarA.d = u0bVarE;
        z4mVarA.e = tul.FAILED;
        z4mVarA.a = ytl.DOWNLOAD_FAILED;
        z4mVarA.f = i2;
        z4mVarA.g = (byte) (z4mVarA.g | 4);
        zj9.g().execute(new wn2(this, wzeVar, z4mVarA.a(), fieVar, 6, false));
    }

    public final void c(wze wzeVar, fie fieVar, ytl ytlVar, boolean z, u0b u0bVar, tul tulVar) {
        z4m z4mVarA = c5m.a();
        z4mVarA.b = z;
        z4mVarA.g = (byte) (z4mVarA.g | 1);
        if (u0bVar == null) {
            ore.n("Null modelType");
            return;
        }
        z4mVarA.d = u0bVar;
        z4mVarA.a = ytlVar;
        z4mVarA.e = tulVar;
        zj9.g().execute(new wn2(this, wzeVar, z4mVarA.a(), fieVar, 6, false));
    }

    public final o73 d(String str, String str2) {
        lok lokVarG;
        o73 o73Var = new o73();
        o73Var.a = this.a;
        o73Var.b = this.b;
        synchronized (s5m.class) {
            try {
                lokVarG = i;
                if (lokVarG == null) {
                    mc9 mc9Var = new mc9(new nc9(Resources.getSystem().getConfiguration().getLocales()));
                    Object[] objArrCopyOf = new Object[4];
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < mc9Var.d()) {
                        String strB = p44.b(mc9Var.b(i2));
                        strB.getClass();
                        int i4 = i3 + 1;
                        int length = objArrCopyOf.length;
                        if (length < i4) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, j8f.g(length, i4));
                        }
                        objArrCopyOf[i3] = strB;
                        i2++;
                        i3 = i4;
                    }
                    lokVarG = jnk.g(objArrCopyOf, i3);
                    i = lokVarG;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        o73Var.e = lokVarG;
        o73Var.h = Boolean.TRUE;
        o73Var.d = str;
        o73Var.c = str2;
        o73Var.f = this.f.j() ? (String) this.f.h() : this.d.i();
        o73Var.j = 10;
        o73Var.k = Integer.valueOf(this.h);
        return o73Var;
    }
}
