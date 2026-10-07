package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class pgg implements btb, a10, p7c, jt9, l18, l8e, lpd, s6j, fbh {
    public static final float[] b = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public static final float[] c = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    public Object a;

    public pgg(int i) {
        switch (i) {
            case 5:
                this.a = new CopyOnWriteArrayList();
                break;
            case 10:
                this.a = new ucf();
                break;
            case 11:
                this.a = null;
                break;
            case 22:
                this.a = new LruCache(10);
                break;
            default:
                this.a = new qg7(b, c);
                break;
        }
    }

    public static pgg u(boolean z, int i, int i2, int i3, int i4) {
        return new pgg(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    @Override // defpackage.l8e
    public void B(Object obj, zv8 zv8Var, Object obj2) {
        Object poeVar;
        try {
            ps8 ps8Var = qs8.d;
            poeVar = ps8Var.b(tre.A0(ps8Var.b, zfe.c(bjg.class)), obj2);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        u9c u9cVar = (u9c) this.a;
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            String str = u9cVar.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Got error during encoding json=" + obj2 + "!", thA);
                }
            }
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        String str2 = (String) poeVar;
        if (str2 != null) {
            SharedPreferences.Editor editorEdit = ((u9c) this.a).d.edit();
            d0g.e(editorEdit, "stat.fresco", str2);
            ((zr6) editorEdit).apply();
        }
    }

    @Override // defpackage.p7c
    public void X() {
        t7c searchView = ((rcc) this.a).getSearchView();
        if (searchView != null) {
            searchView.setExpandable(false);
        }
    }

    @Override // defpackage.s6j
    public int a(View view) {
        return vee.B(view) - ((ViewGroup.MarginLayoutParams) ((wee) view.getLayoutParams())).leftMargin;
    }

    public void b(int i, long j, long j2) {
        final int i2;
        final long j3;
        final long j4;
        for (final jo0 jo0Var : (CopyOnWriteArrayList) this.a) {
            if (jo0Var.c) {
                i2 = i;
                j3 = j;
                j4 = j2;
            } else {
                i2 = i;
                j3 = j;
                j4 = j2;
                jo0Var.a.post(new Runnable() { // from class: io0
                    @Override // java.lang.Runnable
                    public final void run() {
                        r75 r75Var = jo0Var.b;
                        s80 s80Var = r75Var.d;
                        final wf wfVarU = r75Var.u(((c98) s80Var.b).isEmpty() ? null : (x4a) np4.n((c98) s80Var.b));
                        final int i3 = i2;
                        final long j5 = j3;
                        final long j6 = j4;
                        r75Var.y(wfVarU, 1006, new r89() { // from class: m75
                            @Override // defpackage.r89
                            public final void invoke(Object obj) {
                                ((xf) obj).J0(wfVarU, i3, j5, j6);
                            }
                        });
                    }
                });
            }
            i = i2;
            j = j3;
            j2 = j4;
        }
    }

    @Override // defpackage.lpd
    public void c() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.lpd
    public void d(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.a).setResultCode(i);
    }

    @Override // defpackage.s6j
    public int e() {
        return ((vee) this.a).J();
    }

    @Override // defpackage.p7c
    public void f() {
        zm3.b.t();
    }

    public void g() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(((HashMap) this.a).values());
            ((HashMap) this.a).clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            p76 p76Var = (p76) arrayList.get(i);
            if (p76Var != null) {
                p76Var.close();
            }
        }
    }

    @Override // defpackage.s6j
    public int h() {
        vee veeVar = (vee) this.a;
        return veeVar.n - veeVar.K();
    }

    @Override // defpackage.s6j
    public View i(int i) {
        return ((vee) this.a).v(i);
    }

    @Override // defpackage.s6j
    public int j(View view) {
        return vee.E(view) + ((ViewGroup.MarginLayoutParams) ((wee) view.getLayoutParams())).rightMargin;
    }

    public synchronized p76 k(l6g l6gVar) {
        p76 p76VarB = (p76) ((HashMap) this.a).get(l6gVar);
        if (p76VarB != null) {
            synchronized (p76VarB) {
                if (!p76.P(p76VarB)) {
                    ((HashMap) this.a).remove(l6gVar);
                    pj6.j(pgg.class, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(p76VarB)), l6gVar.a, Integer.valueOf(System.identityHashCode(l6gVar)));
                    return null;
                }
                p76VarB = p76.b(p76VarB);
            }
        }
        return p76VarB;
    }

    @Override // defpackage.fbh
    public String l() {
        return ((hbh) this.a).b;
    }

    @Override // defpackage.j8e
    public Object m(Object obj, zv8 zv8Var) {
        Object poeVar;
        String str = (String) d0g.d(zfe.a(String.class), ((u9c) this.a).d, null, "stat.fresco");
        if (str != null) {
            u9c u9cVar = (u9c) this.a;
            try {
                ps8 ps8Var = qs8.d;
                poeVar = ps8Var.a(tre.A0(ps8Var.b, zfe.c(bjg.class)), str);
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            Throwable thA = roe.a(poeVar);
            if (thA != null) {
                String str2 = u9cVar.c;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str2, c0a.o("Got error during decoding json=", str, "!"), thA);
                    }
                }
            }
            Object obj2 = poeVar instanceof poe ? null : poeVar;
            if (obj2 != null) {
                return obj2;
            }
        }
        return bjg.r;
    }

    @Override // defpackage.jt9
    public kt9 p(yfj yfjVar) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && ((context = (Context) this.a) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new ku8().p(yfjVar);
        }
        int iH = uya.h(((b87) yfjVar.c).n);
        lvb.r0("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(vqi.K(iH)));
        ch chVar = new ch(iH);
        chVar.k();
        return chVar.p(yfjVar);
    }

    @Override // defpackage.a10
    public void q(long j, List list) {
        ((i64) this.a).Q(list);
    }

    @Override // defpackage.l18
    public a28 r(ljf ljfVar) {
        return ((glh) this.a).r(ljfVar);
    }

    @Override // defpackage.btb
    public ixj s(View view, ixj ixjVar) {
        int i;
        int i2;
        boolean z;
        ixj ixjVarB;
        xwj uwjVar;
        boolean z2;
        int iD = ixjVar.d();
        vr vrVar = (vr) this.a;
        Context context = vrVar.k;
        int iD2 = ixjVar.d();
        ActionBarContextView actionBarContextView = vrVar.u;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            i2 = 8;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vrVar.u.getLayoutParams();
            boolean z3 = true;
            if (vrVar.u.isShown()) {
                if (vrVar.B1 == null) {
                    vrVar.B1 = new Rect();
                    vrVar.C1 = new Rect();
                }
                Rect rect = vrVar.B1;
                Rect rect2 = vrVar.C1;
                rect.set(ixjVar.b(), ixjVar.d(), ixjVar.c(), ixjVar.a());
                ViewGroup viewGroup = vrVar.A;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = r9j.a;
                    p9j.a(viewGroup, rect, rect2);
                } else {
                    if (!r9j.a) {
                        r9j.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            r9j.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                r9j.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = r9j.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i3 = rect.top;
                int i4 = rect.left;
                int i5 = rect.right;
                ViewGroup viewGroup2 = vrVar.A;
                WeakHashMap weakHashMap = i7j.a;
                ixj ixjVarA = z6j.a(viewGroup2);
                int iB = ixjVarA == null ? 0 : ixjVarA.b();
                int iC = ixjVarA == null ? 0 : ixjVarA.c();
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                if (i3 <= 0 || vrVar.C != null) {
                    i2 = 8;
                    View view2 = vrVar.C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            vrVar.C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    vrVar.C = view3;
                    i2 = 8;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    vrVar.A.addView(vrVar.C, -1, layoutParams);
                }
                View view4 = vrVar.C;
                z3 = view4 != null;
                if (z3 && view4.getVisibility() != 0) {
                    View view5 = vrVar.C;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!vrVar.H && z3) {
                    iD2 = 0;
                }
                i = 0;
                z = z3;
                z3 = z2;
            } else {
                i2 = 8;
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z = false;
                } else {
                    z = false;
                    z3 = false;
                }
            }
            if (z3) {
                vrVar.u.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = vrVar.C;
        if (view6 != null) {
            if (z) {
                i2 = i;
            }
            view6.setVisibility(i2);
        }
        if (iD != iD2) {
            int iB2 = ixjVar.b();
            int iC2 = ixjVar.c();
            int iA = ixjVar.a();
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 34) {
                uwjVar = new wwj(ixjVar);
            } else if (i8 >= 30) {
                uwjVar = new vwj(ixjVar);
            } else {
                uwjVar = i8 >= 29 ? new uwj(ixjVar) : new twj(ixjVar);
            }
            uwjVar.g(mi8.b(iB2, iD2, iC2, iA));
            ixjVarB = uwjVar.b();
        } else {
            ixjVarB = ixjVar;
        }
        WeakHashMap weakHashMap2 = i7j.a;
        WindowInsets windowInsetsF = ixjVarB.f();
        if (windowInsetsF == null) {
            return ixjVarB;
        }
        WindowInsets windowInsetsB = w6j.b(view, windowInsetsF);
        return !windowInsetsB.equals(windowInsetsF) ? ixj.g(windowInsetsB, view) : ixjVarB;
    }

    public synchronized void t() {
        pj6.d(pgg.class, Integer.valueOf(((HashMap) this.a).size()), "Count = %d");
    }

    public void v(l6g l6gVar) {
        p76 p76Var;
        synchronized (this) {
            p76Var = (p76) ((HashMap) this.a).remove(l6gVar);
        }
        if (p76Var == null) {
            return;
        }
        try {
            p76Var.K();
        } finally {
            p76Var.close();
        }
    }

    public synchronized void w(l6g l6gVar, p76 p76Var) {
        p76Var.getClass();
        oc9.i(Boolean.valueOf(p76.P(p76Var)));
        p76 p76Var2 = (p76) ((HashMap) this.a).get(l6gVar);
        if (p76Var2 == null) {
            return;
        }
        au3 au3VarA = au3.A(p76Var2.a);
        au3 au3VarA2 = au3.A(p76Var.a);
        if (au3VarA != null && au3VarA2 != null) {
            try {
                if (au3VarA.K() == au3VarA2.K()) {
                    ((HashMap) this.a).remove(l6gVar);
                    au3VarA2.close();
                    au3VarA.close();
                    p76Var2.close();
                    t();
                    return;
                }
            } catch (Throwable th) {
                au3VarA2.close();
                au3VarA.close();
                p76Var2.close();
                throw th;
            }
        }
        au3.E(au3VarA2);
        au3.E(au3VarA);
        p76Var2.close();
    }

    public void x(r75 r75Var) {
        CopyOnWriteArrayList<jo0> copyOnWriteArrayList = (CopyOnWriteArrayList) this.a;
        for (jo0 jo0Var : copyOnWriteArrayList) {
            if (jo0Var.b == r75Var) {
                jo0Var.c = true;
                copyOnWriteArrayList.remove(jo0Var);
            }
        }
    }

    @Override // defpackage.fbh
    public void y(ebh ebhVar) {
        hbh hbhVar = (hbh) this.a;
        int length = hbhVar.d.length;
        for (int i = 1; i < length; i++) {
            int i2 = hbhVar.d[i];
            if (i2 == 1) {
                ebhVar.c(i, hbhVar.e[i]);
            } else if (i2 == 2) {
                ebhVar.a(i, hbhVar.f[i]);
            } else if (i2 == 3) {
                ebhVar.g0(i, hbhVar.g[i]);
            } else if (i2 == 4) {
                ebhVar.d(i, hbhVar.h[i]);
            } else if (i2 == 5) {
                ebhVar.e(i);
            }
        }
    }

    public /* synthetic */ pgg(Object obj) {
        this.a = obj;
    }
}
