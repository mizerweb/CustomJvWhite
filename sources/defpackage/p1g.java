package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import one.me.android.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class p1g implements hh9 {
    public static final /* synthetic */ zv8[] m;
    public final Context a;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ifh i;
    public c46 k;
    public c46 l;
    public final String b = p1g.class.getName();
    public final p3c j = qyj.S();

    static {
        z8b z8bVar = new z8b(p1g.class, "shortcutsJob", "getShortcutsJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        m = new zv8[]{z8bVar};
    }

    public p1g(Context context, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8) {
        this.a = context;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var4;
        this.f = ny8Var6;
        this.g = ny8Var7;
        this.h = ny8Var8;
        this.i = new ifh(new x82(ny8Var5, ny8Var3, 3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object a(p1g p1gVar, rt2 rt2Var, nq4 nq4Var) {
        o1g o1gVar;
        vg4 vg4VarW;
        vg4 vg4VarW2;
        Context context = p1gVar.a;
        if (nq4Var instanceof o1g) {
            o1gVar = (o1g) nq4Var;
            int i = o1gVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                o1gVar.g = i - Integer.MIN_VALUE;
            } else {
                o1gVar = new o1g(p1gVar, nq4Var);
            }
        } else {
            o1gVar = new o1g(p1gVar, nq4Var);
        }
        Object objB = o1gVar.e;
        int i2 = o1gVar.g;
        if (i2 == 0) {
            ch3.d0(objB);
            if (rt2Var.F().length() != 0 && !rt2Var.s0((et3) p1gVar.e.getValue())) {
                flb flbVar = (flb) p1gVar.g.getValue();
                o1gVar.d = rt2Var;
                o1gVar.g = 1;
                objB = flbVar.b(rt2Var, o1gVar);
                hu4 hu4Var = hu4.a;
                if (objB == hu4Var) {
                    return hu4Var;
                }
            }
            return null;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        rt2Var = o1gVar.d;
        ch3.d0(objB);
        Bitmap bitmap = (Bitmap) objB;
        if (bitmap != null) {
            String strValueOf = String.valueOf(rt2Var.a);
            l1g l1gVar = new l1g();
            l1gVar.a = context;
            l1gVar.b = strValueOf;
            l1gVar.d = rt2Var.F();
            l1gVar.e = rt2Var.F();
            l1gVar.f = IconCompat.b(bitmap);
            kk9 kk9Var = kk9.b;
            long j = rt2Var.a;
            kk9Var.getClass();
            p1gVar.d().getClass();
            p1gVar.d().getClass();
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.setAction("CUSTOM_DEEP_LINK");
            kk9.b.getClass();
            intent.setData(Uri.parse("max://max.ru/" + (":chats?id=" + j + "&type=local")));
            l1gVar.c = new Intent[]{intent};
            if (rt2Var.r0() && (((vg4VarW = rt2Var.w()) == null || !vg4VarW.F()) && ((vg4VarW2 = rt2Var.w()) == null || (vg4VarW2.a.b.z.b & 64) == 0))) {
                Set setSingleton = Collections.singleton("ru.oneme.app.sharing.category.SHORTCUT_SHARE");
                pw pwVar = new pw(0);
                pwVar.addAll(setSingleton);
                l1gVar.g = pwVar;
            }
            try {
                if (TextUtils.isEmpty(l1gVar.d)) {
                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                }
                Intent[] intentArr = l1gVar.c;
                if (intentArr == null || intentArr.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                if (l1gVar.h == null) {
                    l1gVar.h = new pd9(l1gVar.b);
                }
                l1gVar.i = true;
                return l1gVar;
            } catch (Throwable th) {
                gm0.V(p1gVar.b, "fail to create shortcut", th);
                return null;
            }
        }
        return null;
    }

    public final void b() {
        try {
            Context context = this.a;
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
            n1g.G(context).getClass();
            Iterator it = ((ArrayList) n1g.F(context)).iterator();
            if (it.hasNext()) {
                qt4.A(it.next());
                throw null;
            }
        } catch (Throwable th) {
            gm0.V(this.b, "clear: failed", th);
        }
    }

    @Override // defpackage.hh9
    public final void c() {
        b();
    }

    public final w69 d() {
        return (w69) this.f.getValue();
    }

    public final void e() {
        sgg sggVarI0 = yab.i0((gu4) this.i.getValue(), null, 2, new ai8(this, null, 24), 1);
        this.j.B(this, m[0], sggVarI0);
    }
}
