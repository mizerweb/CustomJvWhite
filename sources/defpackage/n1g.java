package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.XmlResourceParser;
import android.database.SQLException;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import ru.ok.android.externcalls.analytics.config.UploadConfig;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class n1g {
    public static volatile m1g a;
    public static volatile ArrayList b;
    public static volatile n1g e;
    public static final mt0 c = new mt0();
    public static final Object d = new Object();
    public static final khb f = new khb(23);

    public static final String A(View view) {
        Object poeVar;
        try {
            poeVar = view.getResources().getResourceName(view.getId());
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (roe.a(poeVar) != null) {
            poeVar = view.getClass().getName();
        }
        return (String) poeVar;
    }

    public static Object D(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return u4.d(intent, str, cls);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }

    public static Serializable E(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return u4.g(intent, str, cls);
        }
        Serializable serializableExtra = intent.getSerializableExtra(str);
        if (cls.isInstance(serializableExtra)) {
            return serializableExtra;
        }
        return null;
    }

    public static List F(Context context) {
        Bundle bundle;
        String string;
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, np0.m).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        if (Class.forName(string, false, n1g.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context) != null) {
                            throw new ClassCastException();
                        }
                        arrayList.add(null);
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
            if (b == null) {
                b = arrayList;
            }
        }
        return b;
    }

    public static m1g G(Context context) {
        if (a == null) {
            try {
                a = (m1g) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, n1g.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (a == null) {
                a = new m1g();
            }
        }
        return a;
    }

    public static int H(int i, Object obj) {
        if (obj == null) {
            return i * 37;
        }
        if (!obj.getClass().isArray()) {
            return (i * 37) + obj.hashCode();
        }
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            i = H(i, Array.get(obj, i2));
        }
        return i;
    }

    public static void I(int i, vf4 vf4Var, hg4 hg4Var, boolean z) {
        of4 of4Var;
        of4 of4Var2;
        boolean z2;
        of4 of4Var3;
        of4 of4Var4;
        if (hg4Var.m) {
            return;
        }
        if (!(hg4Var instanceof ig4) && hg4Var.x() && j(hg4Var)) {
            ig4.R(hg4Var, vf4Var, new mt0());
        }
        of4 of4VarG = hg4Var.g(2);
        of4 of4VarG2 = hg4Var.g(4);
        int iC = of4VarG.c();
        int iC2 = of4VarG2.c();
        HashSet<of4> hashSet = of4VarG.a;
        if (hashSet != null && of4VarG.c) {
            for (of4 of4Var5 : hashSet) {
                hg4 hg4Var2 = of4Var5.d;
                int i2 = i + 1;
                boolean zJ = j(hg4Var2);
                of4 of4Var6 = hg4Var2.H;
                of4 of4Var7 = hg4Var2.J;
                if (hg4Var2.x() && zJ) {
                    z2 = true;
                    ig4.R(hg4Var2, vf4Var, new mt0());
                } else {
                    z2 = true;
                }
                boolean z3 = ((of4Var5 == of4Var6 && (of4Var4 = of4Var7.f) != null && of4Var4.c) || (of4Var5 == of4Var7 && (of4Var3 = of4Var6.f) != null && of4Var3.c)) ? z2 : false;
                int i3 = hg4Var2.o0[0];
                if (i3 != 3 || zJ) {
                    if (!hg4Var2.x()) {
                        if (of4Var5 == of4Var6 && of4Var7.f == null) {
                            int iD = of4Var6.d() + iC;
                            hg4Var2.F(iD, hg4Var2.o() + iD);
                            I(i2, vf4Var, hg4Var2, z);
                        } else if (of4Var5 == of4Var7 && of4Var6.f == null) {
                            int iD2 = iC - of4Var7.d();
                            hg4Var2.F(iD2 - hg4Var2.o(), iD2);
                            I(i2, vf4Var, hg4Var2, z);
                        } else if (z3 && !hg4Var2.v()) {
                            V(i2, vf4Var, hg4Var2, z);
                        }
                    }
                } else if (i3 == 3 && hg4Var2.v >= 0 && hg4Var2.u >= 0 && (hg4Var2.f0 == 8 || (hg4Var2.r == 0 && hg4Var2.V == 0.0f))) {
                    if (!hg4Var2.v() && z3 && !hg4Var2.v()) {
                        W(i2, hg4Var, vf4Var, hg4Var2, z);
                    }
                }
            }
        }
        if (hg4Var instanceof or7) {
            return;
        }
        HashSet<of4> hashSet2 = of4VarG2.a;
        if (hashSet2 != null && of4VarG2.c) {
            for (of4 of4Var8 : hashSet2) {
                hg4 hg4Var3 = of4Var8.d;
                int i4 = i + 1;
                boolean zJ2 = j(hg4Var3);
                of4 of4Var9 = hg4Var3.H;
                of4 of4Var10 = hg4Var3.J;
                if (hg4Var3.x() && zJ2) {
                    ig4.R(hg4Var3, vf4Var, new mt0());
                }
                boolean z4 = (of4Var8 == of4Var9 && (of4Var2 = of4Var10.f) != null && of4Var2.c) || (of4Var8 == of4Var10 && (of4Var = of4Var9.f) != null && of4Var.c);
                int i5 = hg4Var3.o0[0];
                if (i5 != 3 || zJ2) {
                    if (!hg4Var3.x()) {
                        if (of4Var8 == of4Var9 && of4Var10.f == null) {
                            int iD3 = of4Var9.d() + iC2;
                            hg4Var3.F(iD3, hg4Var3.o() + iD3);
                            I(i4, vf4Var, hg4Var3, z);
                        } else if (of4Var8 == of4Var10 && of4Var9.f == null) {
                            int iD4 = iC2 - of4Var10.d();
                            hg4Var3.F(iD4 - hg4Var3.o(), iD4);
                            I(i4, vf4Var, hg4Var3, z);
                        } else if (z4 && !hg4Var3.v()) {
                            V(i4, vf4Var, hg4Var3, z);
                        }
                    }
                } else if (i5 == 3 && hg4Var3.v >= 0 && hg4Var3.u >= 0) {
                    if (hg4Var3.f0 == 8 || (hg4Var3.r == 0 && hg4Var3.V == 0.0f)) {
                        if (!hg4Var3.v() && z4 && !hg4Var3.v()) {
                            W(i4, hg4Var, vf4Var, hg4Var3, z);
                        }
                    }
                }
            }
        }
        hg4Var.m = true;
    }

    public static boolean L(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public static final vt4 M(gu4 gu4Var, vt4 vt4Var) {
        vt4 vt4VarW = w(gu4Var.k(), vt4Var, true);
        hd5 hd5Var = ao5.b;
        return (vt4VarW == hd5Var || vt4VarW.x0(khb.f) != null) ? vt4VarW : vt4VarW.u0(hd5Var);
    }

    public static final void N(tf7 tf7Var, View view) {
        Object tag = view.getTag(R.id.oneme_theme_attach_listener);
        if ((tag instanceof View.OnAttachStateChangeListener ? (View.OnAttachStateChangeListener) tag : null) != null) {
            gm0.Y("ViewThemeUtils", "try to observe onThemeChanged more than once for " + A(view));
            return;
        }
        View.OnAttachStateChangeListener h9jVar = new h9j(tf7Var, view);
        view.setTag(R.id.oneme_theme_attach_listener, h9jVar);
        if (view.isAttachedToWindow()) {
            h9jVar.onViewAttachedToWindow(view);
        }
        view.addOnAttachStateChangeListener(h9jVar);
    }

    public static hle O(String str) throws ProtocolException {
        int i;
        String strSubstring;
        boolean zK0 = z5h.K0(str, "HTTP/1.", false);
        twd twdVar = twd.HTTP_1_0;
        if (zK0) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                twdVar = twd.HTTP_1_1;
            }
        } else {
            if (!z5h.K0(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new hle(twdVar, i3, strSubstring, 7);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static final int P(String str) {
        int length = str.length();
        if (length == 2) {
            StringBuilder sb = new StringBuilder("#");
            for (int i = 0; i < 8; i++) {
                sb.append(str.charAt(1));
            }
            return Color.parseColor(sb.toString());
        }
        if (length != 4) {
            if (length == 7 || length == 9) {
                return Color.parseColor(str);
            }
            return 0;
        }
        return Color.parseColor("#" + str.charAt(1) + str.charAt(1) + str.charAt(2) + str.charAt(2) + str.charAt(3) + str.charAt(3));
    }

    public static void Q(RecyclerView recyclerView, Runnable runnable, Runnable runnable2, int i) {
        int i2 = (i & 1) != 0 ? 5 : 2;
        if ((i & 4) != 0) {
            runnable2 = null;
        }
        b(recyclerView, 0, i2, runnable, runnable2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2 A[RETURN] */
    public static final aw8 R(khb khbVar, bw8 bw8Var, boolean z) {
        aw8 aw8VarB;
        aw8 aw8VarT0;
        uad uadVar;
        rv8 rv8VarX = wk8.x(bw8Var);
        boolean zA = bw8Var.a();
        List<dw8> listE = bw8Var.e();
        ArrayList arrayList = new ArrayList(yw3.W0(listE, 10));
        for (dw8 dw8Var : listE) {
            bw8 bw8VarA = dw8Var.a();
            if (bw8VarA == null) {
                ore.e(dw8Var.a(), "Star projections in type arguments are not allowed, but had ");
                return null;
            }
            arrayList.add(bw8VarA);
        }
        if (arrayList.isEmpty()) {
            if (((qr3) rv8VarX).d().isInterface()) {
                khbVar.getClass();
            }
            if (zA) {
                aw8VarB = rif.b.b(rv8VarX);
            } else {
                aw8VarB = rif.a.b(rv8VarX);
                if (aw8VarB == null) {
                    aw8VarB = null;
                }
            }
        } else {
            khbVar.getClass();
            Object objH = !zA ? rif.c.h(rv8VarX, arrayList) : rif.d.h(rv8VarX, arrayList);
            if (objH instanceof poe) {
                objH = null;
            }
            aw8VarB = (aw8) objH;
        }
        if (aw8VarB != null) {
            return aw8VarB;
        }
        if (arrayList.isEmpty()) {
            aw8VarT0 = qe7.l(rv8VarX, new aw8[0]);
            if (aw8VarT0 == null) {
                aw8VarT0 = uhd.b(rv8VarX);
            }
            if (aw8VarT0 == null) {
                khbVar.getClass();
                if (((qr3) rv8VarX).d().isInterface()) {
                    uadVar = new uad(rv8VarX);
                    aw8VarT0 = uadVar;
                } else {
                    aw8VarT0 = null;
                }
            }
            if (aw8VarT0 != null) {
                if (zA) {
                    return lvb.o0(aw8VarT0);
                }
                return aw8VarT0;
            }
        } else {
            ArrayList arrayListB0 = tre.B0(khbVar, arrayList, z);
            if (arrayListB0 != null) {
                aw8VarT0 = tre.t0(rv8VarX, arrayListB0, new ap9(28, arrayList));
                if (aw8VarT0 == null) {
                    if (((qr3) rv8VarX).d().isInterface()) {
                        uadVar = new uad(rv8VarX);
                        aw8VarT0 = uadVar;
                    } else {
                        aw8VarT0 = null;
                    }
                }
                if (aw8VarT0 != null) {
                    if (zA) {
                        return lvb.o0(aw8VarT0);
                    }
                    return aw8VarT0;
                }
            }
        }
        return null;
    }

    public static void S(Context context, List list) {
        context.getClass();
        list.getClass();
        if (Build.VERSION.SDK_INT <= 32) {
            ArrayList arrayList = new ArrayList(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((l1g) it.next()).getClass();
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        for (l1g l1gVar : list) {
            l1gVar.getClass();
            ShortcutInfo.Builder intents = new ShortcutInfo.Builder(l1gVar.a, l1gVar.b).setShortLabel(l1gVar.d).setIntents(l1gVar.c);
            IconCompat iconCompat = l1gVar.f;
            if (iconCompat != null) {
                intents.setIcon(iconCompat.g(l1gVar.a));
            }
            if (!TextUtils.isEmpty(l1gVar.e)) {
                intents.setLongLabel(l1gVar.e);
            }
            if (!TextUtils.isEmpty(null)) {
                intents.setDisabledMessage(null);
            }
            pw pwVar = l1gVar.g;
            if (pwVar != null) {
                intents.setCategories(pwVar);
            }
            intents.setRank(0);
            PersistableBundle persistableBundle = l1gVar.j;
            if (persistableBundle != null) {
                intents.setExtras(persistableBundle);
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                pd9 pd9Var = l1gVar.h;
                if (pd9Var != null) {
                    intents.setLocusId(pd9Var.b);
                }
                intents.setLongLived(l1gVar.i);
            } else {
                if (l1gVar.j == null) {
                    l1gVar.j = new PersistableBundle();
                }
                pd9 pd9Var2 = l1gVar.h;
                if (pd9Var2 != null) {
                    l1gVar.j.putString("extraLocusId", pd9Var2.a);
                }
                l1gVar.j.putBoolean("extraLongLived", l1gVar.i);
                intents.setExtras(l1gVar.j);
            }
            if (i >= 33) {
                u4.k(intents);
            }
            arrayList2.add(intents.build());
        }
        if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList2)) {
            G(context).getClass();
            G(context).getClass();
            Iterator it2 = ((ArrayList) F(context)).iterator();
            if (it2.hasNext()) {
                throw qt4.h(it2);
            }
        }
    }

    public static int T(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int U(Object obj) {
        return T(obj == null ? 0 : obj.hashCode());
    }

    public static void V(int i, vf4 vf4Var, hg4 hg4Var, boolean z) {
        float f2 = hg4Var.c0;
        of4 of4Var = hg4Var.H;
        int iC = of4Var.f.c();
        of4 of4Var2 = hg4Var.J;
        int iC2 = of4Var2.f.c();
        int iD = of4Var.d() + iC;
        int iD2 = iC2 - of4Var2.d();
        if (iC == iC2) {
            f2 = 0.5f;
        } else {
            iC = iD;
            iC2 = iD2;
        }
        int iO = hg4Var.o();
        int i2 = (iC2 - iC) - iO;
        if (iC > iC2) {
            i2 = (iC - iC2) - iO;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2)) + iC;
        int i4 = i3 + iO;
        if (iC > iC2) {
            i4 = i3 - iO;
        }
        hg4Var.F(i3, i4);
        I(i + 1, vf4Var, hg4Var, z);
    }

    public static void W(int i, hg4 hg4Var, vf4 vf4Var, hg4 hg4Var2, boolean z) {
        float f2 = hg4Var2.c0;
        of4 of4Var = hg4Var2.H;
        int iD = of4Var.d() + of4Var.f.c();
        of4 of4Var2 = hg4Var2.J;
        int iC = of4Var2.f.c() - of4Var2.d();
        if (iC >= iD) {
            int iO = hg4Var2.o();
            if (hg4Var2.f0 != 8) {
                int i2 = hg4Var2.r;
                if (i2 == 2) {
                    iO = (int) (hg4Var2.c0 * 0.5f * (hg4Var instanceof ig4 ? hg4Var.o() : hg4Var.S.o()));
                } else if (i2 == 0) {
                    iO = iC - iD;
                }
                iO = Math.max(hg4Var2.u, iO);
                int i3 = hg4Var2.v;
                if (i3 > 0) {
                    iO = Math.min(i3, iO);
                }
            }
            int i4 = iD + ((int) ((f2 * ((iC - iD) - iO)) + 0.5f));
            hg4Var2.F(i4, iO + i4);
            I(i + 1, vf4Var, hg4Var2, z);
        }
    }

    public static void X(int i, vf4 vf4Var, hg4 hg4Var) {
        float f2 = hg4Var.d0;
        of4 of4Var = hg4Var.I;
        int iC = of4Var.f.c();
        of4 of4Var2 = hg4Var.K;
        int iC2 = of4Var2.f.c();
        int iD = of4Var.d() + iC;
        int iD2 = iC2 - of4Var2.d();
        if (iC == iC2) {
            f2 = 0.5f;
        } else {
            iC = iD;
            iC2 = iD2;
        }
        int i2 = hg4Var.i();
        int i3 = (iC2 - iC) - i2;
        if (iC > iC2) {
            i3 = (iC - iC2) - i2;
        }
        int i4 = (int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3);
        int i5 = iC + i4;
        int i6 = i5 + i2;
        if (iC > iC2) {
            i5 = iC - i4;
            i6 = i5 - i2;
        }
        hg4Var.G(i5, i6);
        i0(i + 1, vf4Var, hg4Var);
    }

    public static void Y(int i, hg4 hg4Var, vf4 vf4Var, hg4 hg4Var2) {
        float f2 = hg4Var2.d0;
        of4 of4Var = hg4Var2.I;
        int iD = of4Var.d() + of4Var.f.c();
        of4 of4Var2 = hg4Var2.K;
        int iC = of4Var2.f.c() - of4Var2.d();
        if (iC >= iD) {
            int i2 = hg4Var2.i();
            if (hg4Var2.f0 != 8) {
                int i3 = hg4Var2.s;
                if (i3 == 2) {
                    i2 = (int) (f2 * 0.5f * (hg4Var instanceof ig4 ? hg4Var.i() : hg4Var.S.i()));
                } else if (i3 == 0) {
                    i2 = iC - iD;
                }
                i2 = Math.max(hg4Var2.x, i2);
                int i4 = hg4Var2.y;
                if (i4 > 0) {
                    i2 = Math.min(i4, i2);
                }
            }
            int i5 = iD + ((int) ((f2 * ((iC - iD) - i2)) + 0.5f));
            hg4Var2.G(i5, i2 + i5);
            i0(i + 1, vf4Var, hg4Var2);
        }
    }

    public static String Z(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static final void a(File file, List list) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), pt2.a);
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                outputStreamWriter.write((String) it.next());
                outputStreamWriter.write(10);
            }
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(outputStreamWriter, th);
                throw th2;
            }
        }
    }

    public static final void a0(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        sb.append(", message: ".concat(str));
        throw new SQLException(sb.toString());
    }

    public static final void b(final RecyclerView recyclerView, final int i, final int i2, final Runnable runnable, final Runnable runnable2) {
        Handler handler = recyclerView.getHandler();
        if (handler != null && handler.hasMessages(61453)) {
            recyclerView.getHandler().removeMessages(61453, runnable);
        }
        if (!recyclerView.Y() && Looper.getMainLooper().isCurrentThread()) {
            runnable.run();
            return;
        }
        if (i == i2) {
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        Runnable runnable3 = new Runnable() { // from class: ofe
            @Override // java.lang.Runnable
            public final void run() {
                n1g.b(recyclerView, i + 1, i2, runnable, runnable2);
            }
        };
        Message messageObtain = Message.obtain(recyclerView.getHandler(), runnable3);
        messageObtain.what = 61453;
        messageObtain.obj = runnable;
        Handler handler2 = recyclerView.getHandler();
        if (handler2 != null) {
            handler2.sendMessageAtFrontOfQueue(messageObtain);
        } else {
            recyclerView.post(runnable3);
        }
    }

    public static String b0(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (L(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (L(c2)) {
                        charArray[i] = (char) (c2 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static void c(ViewGroup viewGroup, bcc bccVar, kbc kbcVar) {
        cyb cybVar;
        boolean z = bccVar instanceof zbc;
        zxb zxbVar = zxb.GHOST;
        if (z) {
            cybVar = viewGroup instanceof cyb ? (cyb) viewGroup : null;
            if (cybVar != null) {
                cybVar.setSize(ayb.i);
                cybVar.setAppearance(zxbVar);
                return;
            }
            return;
        }
        if (!(bccVar instanceof wbc) && !(bccVar instanceof xbc) && !(bccVar instanceof ecc)) {
            if (bccVar instanceof ybc) {
                return;
            }
            ore.o();
        } else {
            cybVar = viewGroup instanceof cyb ? (cyb) viewGroup : null;
            if (cybVar != null) {
                cybVar.setSize(ayb.i);
                cybVar.setAppearance(zxbVar);
                cybVar.setCustomTheme(kbcVar);
            }
        }
    }

    public static String c0(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i] = (char) (c2 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static void d(View view, dcc dccVar, int i, kbc kbcVar) {
        lcc lccVar;
        boolean z = dccVar instanceof acc;
        zxb zxbVar = zxb.GHOST;
        if (!z) {
            if (dccVar instanceof ccc) {
                cyb cybVar = view instanceof cyb ? (cyb) view : null;
                if (cybVar != null) {
                    cybVar.setAppearance(zxbVar);
                    cybVar.setSize(ayb.i);
                    return;
                }
                return;
            }
            if (!(dccVar instanceof xbc) && !(dccVar instanceof ecc)) {
                if (dccVar instanceof ybc) {
                    return;
                }
                ore.o();
                return;
            } else {
                cyb cybVar2 = view instanceof cyb ? (cyb) view : null;
                if (cybVar2 != null) {
                    cybVar2.setAppearance(zxbVar);
                    cybVar2.setSize(ayb.i);
                    cybVar2.setCustomTheme(kbcVar);
                    return;
                }
                return;
            }
        }
        int iD = qt4.D(i);
        if (iD == 0) {
            lccVar = ((acc) dccVar).b;
        } else if (iD == 1) {
            lccVar = ((acc) dccVar).a;
        } else {
            if (iD != 2) {
                ore.o();
                return;
            }
            lccVar = ((acc) dccVar).c;
        }
        if (lccVar instanceof kcc) {
            t7c t7cVar = view instanceof t7c ? (t7c) view : null;
            if (t7cVar != null) {
                t7cVar.setCollapsedStyle(o7c.b);
                return;
            }
            return;
        }
        if (lccVar instanceof hcc) {
            cyb cybVar3 = view instanceof cyb ? (cyb) view : null;
            if (cybVar3 != null) {
                cybVar3.setSize(ayb.i);
                cybVar3.setAppearance(zxbVar);
                return;
            }
            return;
        }
        if (lccVar instanceof icc) {
            dyb dybVar = view instanceof dyb ? (dyb) view : null;
            if (dybVar != null) {
                dybVar.d(ayb.i, zxbVar);
                return;
            }
            return;
        }
        if (!(lccVar instanceof jcc)) {
            if (lccVar == null) {
                return;
            }
            ore.o();
        } else {
            ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
            if (imageView != null) {
                N(new q67((jcc) lccVar, null, 4), imageView);
            }
        }
    }

    public static final String d0(byte b2) {
        if (b2 == 1) {
            return "quotation mark '\"'";
        }
        if (b2 == 2) {
            return "string escape sequence '\\'";
        }
        if (b2 == 4) {
            return "comma ','";
        }
        if (b2 == 5) {
            return "colon ':'";
        }
        if (b2 == 6) {
            return "start of the object '{'";
        }
        if (b2 == 7) {
            return "end of the object '}'";
        }
        if (b2 == 8) {
            return "start of the array '['";
        }
        if (b2 == 9) {
            return "end of the array ']'";
        }
        if (b2 == 10) {
            return "end of the input";
        }
        return b2 == 127 ? "invalid token" : "valid token";
    }

    public static void e(View view, dcc dccVar, int i) {
        lcc lccVar;
        zxb zxbVar;
        if (!(dccVar instanceof acc)) {
            if (!(dccVar instanceof ccc) && !(dccVar instanceof xbc) && !(dccVar instanceof ecc)) {
                if (dccVar instanceof ybc) {
                    return;
                }
                ore.o();
                return;
            } else {
                cyb cybVar = view instanceof cyb ? (cyb) view : null;
                if (cybVar != null) {
                    cybVar.setSize(ayb.i);
                    cybVar.setAppearance(zxb.GHOST);
                    return;
                }
                return;
            }
        }
        int iD = qt4.D(i);
        if (iD == 0) {
            lccVar = ((acc) dccVar).b;
        } else if (iD == 1) {
            lccVar = ((acc) dccVar).a;
        } else {
            if (iD != 2) {
                ore.o();
                return;
            }
            lccVar = ((acc) dccVar).c;
        }
        int iD2 = qt4.D(i);
        if (iD2 != 0) {
            zxbVar = zxb.SECONDARY;
            if (iD2 != 1 && iD2 != 2) {
                ore.o();
                return;
            }
        } else {
            zxbVar = zxb.PRIMARY;
        }
        if (lccVar instanceof kcc) {
            t7c t7cVar = view instanceof t7c ? (t7c) view : null;
            if (t7cVar != null) {
                t7cVar.setCollapsedStyle(o7c.a);
                return;
            }
            return;
        }
        if (lccVar instanceof hcc) {
            cyb cybVar2 = view instanceof cyb ? (cyb) view : null;
            if (cybVar2 != null) {
                cybVar2.setSize(ayb.i);
                cybVar2.setAppearance(zxbVar);
                return;
            }
            return;
        }
        if (lccVar instanceof icc) {
            dyb dybVar = view instanceof dyb ? (dyb) view : null;
            if (dybVar != null) {
                dybVar.d(ayb.i, zxbVar);
                return;
            }
            return;
        }
        if (!(lccVar instanceof jcc)) {
            if (lccVar == null) {
                return;
            }
            ore.o();
        } else {
            ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
            if (imageView != null) {
                N(new adh(view, (lq4) null, 15), imageView);
            }
        }
    }

    public static final void e0(Spannable spannable, gn9 gn9Var, int i, int i2, int i3) {
        Object poeVar;
        int iB = (i3 & (-16711681)) | ((gn9Var.b() & 255) << 16);
        if (i < 0) {
            i = 0;
        }
        if (i >= spannable.length()) {
            return;
        }
        int length = spannable.length();
        if (i2 > length) {
            i2 = length;
        }
        try {
            poeVar = (gn9[]) spannable.getSpans(i, i2, gn9Var.getClass());
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        gn9[] gn9VarArr = (gn9[]) poeVar;
        if (gn9VarArr != null && gn9VarArr.length != 0) {
            for (gn9 gn9Var2 : gn9VarArr) {
                tre.x0(spannable, gn9Var2, i, i2);
            }
        }
        try {
            spannable.setSpan(gn9Var, i, i2, iB);
        } catch (Throwable th2) {
            gm0.V("Markdown", "error while try to set span", th2);
        }
    }

    public static final zai f0(lq4 lq4Var, vt4 vt4Var, Object obj) {
        zai zaiVar = null;
        if ((lq4Var instanceof iu4) && vt4Var.x0(ure.c) != null) {
            iu4 callerFrame = (iu4) lq4Var;
            while (!(callerFrame instanceof tn5) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof zai) {
                    zaiVar = (zai) callerFrame;
                    break;
                }
            }
            if (zaiVar != null) {
                zaiVar.s0(vt4Var, obj);
            }
        }
        return zaiVar;
    }

    public static final void g0(gdi gdiVar) {
        gdiVar.b(3, new f(26));
        gdiVar.d(365, new t62(12));
        gdiVar.d(1046, new cp0(26));
        gdiVar.d(452, new t62(13));
        gdiVar.d(1002, new cp0(27));
        gdiVar.d(1047, new f(27));
        gdiVar.d(UploadConfig.DEFAULT_MAX_EVENT_COUNT, new cp0(28));
        gdiVar.d(801, new cp0(29));
        gdiVar.d(1048, new f(28));
        gdiVar.d(1049, new f(29));
        gdiVar.d(1050, new lu2(0));
        gdiVar.d(1051, new lu2(1));
        gdiVar.d(798, new t62(14));
        gdiVar.d(799, new lu2(2));
        gdiVar.d(1052, new lu2(3));
        gdiVar.d(1053, new t62(15));
        gdiVar.d(1054, new t62(16));
        gdiVar.d(1055, new t62(17));
        gdiVar.d(1056, new t62(18));
        gdiVar.d(1057, new mu2(0));
        gdiVar.d(1058, new mu2(1));
    }

    public static final LinkedHashMap h(XmlResourceParser xmlResourceParser) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            linkedHashMap.put(xmlResourceParser.getAttributeName(i), Integer.valueOf(i));
        }
        return linkedHashMap;
    }

    public static final Bundle i(ylc... ylcVarArr) {
        Bundle bundle = new Bundle(ylcVarArr.length);
        for (ylc ylcVar : ylcVarArr) {
            String str = (String) ylcVar.a;
            Object obj = ylcVar.b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        c.k("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, 34);
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                k51.a(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    c.k("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, 34);
                    return null;
                }
                k51.b(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void i0(int i, vf4 vf4Var, hg4 hg4Var) {
        boolean z;
        of4 of4Var;
        of4 of4Var2;
        of4 of4Var3;
        of4 of4Var4;
        if (hg4Var.n) {
            return;
        }
        if (!(hg4Var instanceof ig4) && hg4Var.x() && j(hg4Var)) {
            ig4.R(hg4Var, vf4Var, new mt0());
        }
        of4 of4VarG = hg4Var.g(3);
        of4 of4VarG2 = hg4Var.g(5);
        int iC = of4VarG.c();
        int iC2 = of4VarG2.c();
        HashSet<of4> hashSet = of4VarG.a;
        if (hashSet != null && of4VarG.c) {
            for (of4 of4Var5 : hashSet) {
                hg4 hg4Var2 = of4Var5.d;
                int i2 = i + 1;
                boolean zJ = j(hg4Var2);
                of4 of4Var6 = hg4Var2.I;
                of4 of4Var7 = hg4Var2.K;
                if (hg4Var2.x() && zJ) {
                    ig4.R(hg4Var2, vf4Var, new mt0());
                }
                boolean z2 = (of4Var5 == of4Var6 && (of4Var4 = of4Var7.f) != null && of4Var4.c) || (of4Var5 == of4Var7 && (of4Var3 = of4Var6.f) != null && of4Var3.c);
                int i3 = hg4Var2.o0[1];
                if (i3 != 3 || zJ) {
                    if (!hg4Var2.x()) {
                        if (of4Var5 == of4Var6 && of4Var7.f == null) {
                            int iD = of4Var6.d() + iC;
                            hg4Var2.G(iD, hg4Var2.i() + iD);
                            i0(i2, vf4Var, hg4Var2);
                        } else if (of4Var5 == of4Var7 && of4Var6.f == null) {
                            int iD2 = iC - of4Var7.d();
                            hg4Var2.G(iD2 - hg4Var2.i(), iD2);
                            i0(i2, vf4Var, hg4Var2);
                        } else if (z2 && !hg4Var2.w()) {
                            X(i2, vf4Var, hg4Var2);
                        }
                    }
                } else if (i3 == 3 && hg4Var2.y >= 0 && hg4Var2.x >= 0 && (hg4Var2.f0 == 8 || (hg4Var2.s == 0 && hg4Var2.V == 0.0f))) {
                    if (!hg4Var2.w() && z2 && !hg4Var2.w()) {
                        Y(i2, hg4Var, vf4Var, hg4Var2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (hg4Var instanceof or7) {
            return;
        }
        HashSet<of4> hashSet2 = of4VarG2.a;
        if (hashSet2 != null && of4VarG2.c) {
            for (of4 of4Var8 : hashSet2) {
                hg4 hg4Var3 = of4Var8.d;
                int i4 = i + 1;
                boolean zJ2 = j(hg4Var3);
                of4 of4Var9 = hg4Var3.I;
                of4 of4Var10 = hg4Var3.K;
                if (hg4Var3.x() && zJ2) {
                    ig4.R(hg4Var3, vf4Var, new mt0());
                }
                boolean z4 = (of4Var8 == of4Var9 && (of4Var2 = of4Var10.f) != null && of4Var2.c) || (of4Var8 == of4Var10 && (of4Var = of4Var9.f) != null && of4Var.c);
                int i5 = hg4Var3.o0[1];
                if (i5 != 3 || zJ2) {
                    if (!hg4Var3.x()) {
                        if (of4Var8 == of4Var9 && of4Var10.f == null) {
                            int iD3 = of4Var9.d() + iC2;
                            hg4Var3.G(iD3, hg4Var3.i() + iD3);
                            i0(i4, vf4Var, hg4Var3);
                        } else if (of4Var8 == of4Var10 && of4Var9.f == null) {
                            int iD4 = iC2 - of4Var10.d();
                            hg4Var3.G(iD4 - hg4Var3.i(), iD4);
                            i0(i4, vf4Var, hg4Var3);
                        } else if (z4 && !hg4Var3.w()) {
                            X(i4, vf4Var, hg4Var3);
                        }
                    }
                } else if (i5 == 3 && hg4Var3.y >= 0 && hg4Var3.x >= 0 && (hg4Var3.f0 == 8 || (hg4Var3.s == 0 && hg4Var3.V == 0.0f))) {
                    if (!hg4Var3.w() && z4 && !hg4Var3.w()) {
                        Y(i4, hg4Var, vf4Var, hg4Var3);
                    }
                }
            }
        }
        of4 of4VarG3 = hg4Var.g(6);
        if (of4VarG3.a != null && of4VarG3.c) {
            int iC3 = of4VarG3.c();
            for (of4 of4Var11 : of4VarG3.a) {
                hg4 hg4Var4 = of4Var11.d;
                int i6 = i + 1;
                boolean zJ3 = j(hg4Var4);
                of4 of4Var12 = hg4Var4.L;
                if (hg4Var4.x() && zJ3) {
                    ig4.R(hg4Var4, vf4Var, new mt0());
                }
                if (hg4Var4.o0[z3 ? 1 : 0] != 3 || zJ3) {
                    if (!hg4Var4.x()) {
                        if (of4Var11 == of4Var12) {
                            int iD5 = of4Var11.d() + iC3;
                            if (hg4Var4.E) {
                                int i7 = iD5 - hg4Var4.Z;
                                int i8 = hg4Var4.U + i7;
                                hg4Var4.Y = i7;
                                hg4Var4.I.i(i7);
                                hg4Var4.K.i(i8);
                                of4Var12.i(iD5);
                                z = z3 ? 1 : 0;
                                hg4Var4.l = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            i0(i6, vf4Var, hg4Var4);
                        }
                        z3 = z;
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        hg4Var.n = z3;
    }

    public static boolean j(hg4 hg4Var) {
        int[] iArr = hg4Var.o0;
        int i = iArr[0];
        int i2 = iArr[1];
        hg4 hg4Var2 = hg4Var.S;
        ig4 ig4Var = hg4Var2 != null ? (ig4) hg4Var2 : null;
        if (ig4Var != null) {
            int i3 = ig4Var.o0[0];
        }
        if (ig4Var != null) {
            int i4 = ig4Var.o0[1];
        }
        boolean z = i == 1 || hg4Var.y() || i == 2 || (i == 3 && hg4Var.r == 0 && hg4Var.V == 0.0f && hg4Var.r(0)) || (i == 3 && hg4Var.r == 1 && hg4Var.s(0, hg4Var.o()));
        boolean z2 = i2 == 1 || hg4Var.z() || i2 == 2 || (i2 == 3 && hg4Var.s == 0 && hg4Var.V == 0.0f && hg4Var.r(1)) || (i2 == 3 && hg4Var.s == 1 && hg4Var.s(1, hg4Var.i()));
        return (hg4Var.V > 0.0f && (z || z2)) || (z && z2);
    }

    public static final byte k(char c2) {
        if (c2 < '~') {
            return ys2.b[c2];
        }
        return (byte) 0;
    }

    public static void l(Object obj) {
        if (obj != null) {
            return;
        }
        ore.n("Cannot return null from a non-@Nullable @Provides method");
    }

    public static void l0(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                ore.n(zo5.h(i2, "at index "));
                return;
            }
        }
    }

    public static final void m(int i) {
        if (i >= 1) {
            return;
        }
        c.o(zo5.h(i, "Expected positive parallelism level, but got "));
    }

    public static final Object n(lq4 lq4Var, yx6 yx6Var, af7 af7Var, tf7 tf7Var, xx6[] xx6VarArr) throws Throwable {
        qx3 qx3Var = new qx3(null, yx6Var, af7Var, tf7Var, xx6VarArr);
        zx6 zx6Var = new zx6(lq4Var, lq4Var.getContext());
        Object objX = f55.x(zx6Var, true, zx6Var, qx3Var);
        return objX == hu4.a ? objX : sbi.a;
    }

    public static int o(Comparable comparable, Comparable comparable2) {
        if (comparable != null && comparable2 != null) {
            return comparable.compareTo(comparable2);
        }
        if (comparable != null || comparable2 != null) {
            if (comparable == null && comparable2 != null) {
                return -1;
            }
            if (comparable != null && comparable2 == null) {
                return 1;
            }
        }
        return 0;
    }

    public static boolean r(String str, String str2) {
        char c2;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                char cCharAt2 = str2.charAt(i);
                if (cCharAt == cCharAt2 || ((c2 = (char) ((cCharAt | ' ') - 97)) < 26 && c2 == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final void u(qxe qxeVar, String str) {
        vxe vxeVarO0 = qxeVar.O0(str);
        try {
            vxeVarO0.M0();
            p90.f(vxeVarO0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p90.f(vxeVarO0, th);
                throw th2;
            }
        }
    }

    public static final q72 v(xx6 xx6Var, i19 i19Var, n09 n09Var) {
        return e9i.o(new l83(i19Var, n09Var, xx6Var, (lq4) null, 3));
    }

    public static final vt4 w(vt4 vt4Var, vt4 vt4Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) vt4Var.E(bool, new dz(5))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) vt4Var2.E(bool, new dz(5))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return vt4Var.u0(vt4Var2);
        }
        dz dzVar = new dz(6);
        k66 k66Var = k66.a;
        vt4 vt4Var3 = (vt4) vt4Var.E(k66Var, dzVar);
        Object objE = vt4Var2;
        if (zBooleanValue2) {
            objE = vt4Var2.E(k66Var, new dz(7));
        }
        return vt4Var3.u0((vt4) objE);
    }

    public static n1g x() {
        n1g n1gVar;
        synchronized (d) {
            try {
                if (e == null) {
                    e = new ye9(3);
                }
                n1gVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n1gVar;
    }

    public static final long z(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    public abstract int B();

    public abstract int C();

    public abstract void J(String str, String str2);

    public abstract void K(String str, String str2, CancellationException cancellationException);

    public abstract boolean f(int i, int i2);

    public abstract boolean g(int i, int i2);

    public abstract void h0(String str);

    public abstract void j0(String str, String str2);

    public abstract void k0(String str, String str2, RuntimeException runtimeException);

    public abstract void p(String str, String str2);

    public abstract void q(String str, String str2, Throwable th);

    public abstract void s(String str, String str2);

    public abstract void t(String str, String str2, Throwable th);

    public Object y(int i, int i2) {
        return null;
    }
}
