package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class t3a implements a89, vo4, a10, qt9, s6j {
    public static final Object b = new Object();
    public static volatile t3a c;
    public Object a;

    public t3a(int i) {
        switch (i) {
            case 6:
                this.a = lvb.e0(Looper.getMainLooper());
                break;
            case 17:
                this.a = new LinkedHashMap();
                break;
            case 19:
                this.a = new nhb(23);
                break;
            default:
                this.a = new e9e(pkh.h);
                break;
        }
    }

    public static t3a m(Context context) {
        t3a t3aVar;
        synchronized (b) {
            try {
                if (c == null) {
                    Context applicationContext = context.getApplicationContext();
                    t3a t3aVar2 = new t3a();
                    qg7 qg7Var = new qg7(12);
                    qg7Var.b = applicationContext;
                    qg7Var.c = applicationContext.getContentResolver();
                    t3aVar2.a = qg7Var;
                    c = t3aVar2;
                }
                t3aVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t3aVar;
    }

    @Override // defpackage.s6j
    public int a(View view) {
        return vee.F(view) - ((ViewGroup.MarginLayoutParams) ((wee) view.getLayoutParams())).topMargin;
    }

    @Override // defpackage.a89
    public void b(int i, int i2) {
        ((nee) this.a).r(i, i2);
    }

    @Override // defpackage.qt9
    public List c(String str, boolean z, boolean z2) {
        return new ArrayList(ww3.M1(ut9.e(str, z, z2), new mu1(7, (List) ((af7) this.a).invoke())));
    }

    @Override // defpackage.a89
    public void d(int i, int i2) {
        ((nee) this.a).s(i, i2);
    }

    @Override // defpackage.s6j
    public int e() {
        return ((vee) this.a).L();
    }

    @Override // defpackage.a89
    public void f(int i, int i2, Object obj) {
        ((nee) this.a).q(i, i2, obj);
    }

    @Override // defpackage.a89
    public void g(int i, int i2) {
        ((nee) this.a).p(i, i2);
    }

    @Override // defpackage.s6j
    public int h() {
        vee veeVar = (vee) this.a;
        return veeVar.o - veeVar.I();
    }

    @Override // defpackage.s6j
    public View i(int i) {
        return ((vee) this.a).v(i);
    }

    @Override // defpackage.s6j
    public int j(View view) {
        return vee.z(view) + ((ViewGroup.MarginLayoutParams) ((wee) view.getLayoutParams())).bottomMargin;
    }

    public void k(zxa zxaVar) {
        int i = zxaVar.a;
        int i2 = zxaVar.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        Integer numValueOf = Integer.valueOf(i);
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i2))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + zxaVar);
        }
        treeMap2.put(Integer.valueOf(i2), zxaVar);
    }

    public StaticLayout l(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, boolean z, TextUtils.TruncateAt truncateAt, int i2, float f) {
        int i3;
        int i4;
        ed6 ed6Var = (ed6) this.a;
        CharSequence string = charSequence;
        boolean z2 = false;
        while (true) {
            try {
                int length = string.length();
                if (z2) {
                    i4 = length;
                    i3 = 0;
                } else {
                    i3 = length;
                    i4 = 0;
                }
                return yab.n0(string, i4, i3, textPaint, i, alignment, f, z, truncateAt, i, i2, z2 ? emh.e : emh.c);
            } catch (IllegalArgumentException e) {
                gm0.V("t3a", "seems we work with RTL text", e);
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                if (z2 || !r5h.L0(message, "fromIndex", false) || !r5h.L0(message, "toIndex", false)) {
                    final String str = "unknown: " + ((Object) charSequence);
                    throw new RuntimeException(str, e) { // from class: ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
                    };
                }
                if (ed6Var != null) {
                    final String str2 = "check range exception: " + ((Object) charSequence);
                    ((t1c) ed6Var).a(new RuntimeException(str2, e) { // from class: ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
                    });
                }
                z2 = true;
            } catch (IndexOutOfBoundsException e2) {
                if (string instanceof String) {
                    final String str3 = "strange: " + ((Object) charSequence);
                    throw new RuntimeException(str3, e2) { // from class: ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
                    };
                }
                final String str4 = "t3a. Hit bug #35412, retrying with Spannables removed: " + ((Object) charSequence);
                gm0.l("t3a", str4, e2);
                if (ed6Var != null) {
                    ((t1c) ed6Var).a(new RuntimeException(str4, e2) { // from class: ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
                    });
                } else {
                    gm0.V("t3a", str4, e2);
                }
                string = string.toString();
            }
        }
    }

    public boolean n(p3a p3aVar) {
        qg7 qg7Var = (qg7) this.a;
        s3a s3aVar = p3aVar.a;
        Context context = (Context) qg7Var.b;
        int i = s3aVar.b;
        String str = s3aVar.a;
        int i2 = s3aVar.c;
        if (context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", i, i2) == 0) {
            return true;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(str, 0) != null) {
                if (qg7Var.p(s3aVar, "android.permission.STATUS_BAR_SERVICE") || qg7Var.p(s3aVar, "android.permission.MEDIA_CONTENT_CONTROL") || i2 == 1000 || i2 == Process.myUid()) {
                    return true;
                }
                String string = Settings.Secure.getString((ContentResolver) qg7Var.c, "enabled_notification_listeners");
                if (string != null) {
                    for (String str2 : string.split(":")) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str2);
                        if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(str)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            lvb.g0("MediaSessionManager", "Package " + str + " doesn't exist");
            return false;
        }
    }

    public void o() {
        ((va7) this.a).j.R();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public void p(lfe lfeVar, bs0 bs0Var, bs0 bs0Var2) {
        boolean zI;
        RecyclerView recyclerView = (RecyclerView) this.a;
        lfeVar.y(false);
        rb5 rb5Var = (rb5) recyclerView.o1;
        if (bs0Var != null) {
            rb5Var.getClass();
            int i = bs0Var.b;
            int i2 = bs0Var2.b;
            zI = (i == i2 && bs0Var.c == bs0Var2.c) ? rb5Var.i(lfeVar) : rb5Var.k(lfeVar, i, bs0Var.c, i2, bs0Var2.c);
        }
        if (zI) {
            recyclerView.h0();
        }
    }

    @Override // defpackage.a10
    public void q(long j, List list) {
        ((i64) this.a).Q(list);
    }

    public void r(lfe lfeVar, bs0 bs0Var, bs0 bs0Var2) {
        boolean zL;
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.c.l(lfeVar);
        recyclerView.g(lfeVar);
        lfeVar.y(false);
        rb5 rb5Var = (rb5) recyclerView.o1;
        rb5Var.getClass();
        int i = bs0Var.b;
        int i2 = bs0Var.c;
        View view = lfeVar.a;
        int left = bs0Var2 == null ? view.getLeft() : bs0Var2.b;
        int top = bs0Var2 == null ? view.getTop() : bs0Var2.c;
        if (lfeVar.s() || (i == left && i2 == top)) {
            zL = rb5Var.l(lfeVar);
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zL = rb5Var.k(lfeVar, i, i2, left, top);
        }
        if (zL) {
            recyclerView.h0();
        }
    }

    public /* synthetic */ t3a(c1k c1kVar) {
        v56 v56Var = new v56(25, c1kVar);
        this.a = enk.a(new p3c(26, enk.a(new c46(enk.a(new fbc(v56Var, 29, enk.a(new jxk(v56Var, 1)))), enk.a(new jxk(v56Var, 0)), v56Var))));
    }

    public /* synthetic */ t3a(Object obj) {
        this.a = obj;
    }
}
