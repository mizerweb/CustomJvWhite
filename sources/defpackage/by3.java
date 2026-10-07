package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class by3 {
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public final emf a;
    public final int b;
    public final int c;
    public final int d;
    public final Uri e;
    public final CharSequence f;
    public final Bundle g;
    public final x88 h;
    public final boolean i;
    public final Object j;

    static {
        String str = vqi.a;
        k = Integer.toString(0, 36);
        l = Integer.toString(1, 36);
        m = Integer.toString(2, 36);
        n = Integer.toString(3, 36);
        o = Integer.toString(4, 36);
        p = Integer.toString(5, 36);
        q = Integer.toString(6, 36);
        r = Integer.toString(7, 36);
        s = Integer.toString(8, 36);
        t = Integer.toString(9, 36);
    }

    public by3(emf emfVar, int i, int i2, int i3, Uri uri, CharSequence charSequence, Bundle bundle, boolean z, x88 x88Var, Object obj) {
        this.a = emfVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = uri;
        this.f = charSequence;
        this.g = new Bundle(bundle);
        this.i = z;
        this.h = x88Var;
        this.j = obj;
    }

    public static Object a(int i, Object obj) {
        if (obj == null) {
            return null;
        }
        switch (i) {
            case 1:
                if (obj instanceof Integer) {
                    obj = Long.valueOf(((Integer) obj).longValue());
                }
                lvb.O("Parameter has incorrect type.", obj instanceof Long);
                return obj;
            case 2:
                lvb.O("Parameter has incorrect type.", obj instanceof Integer);
                return obj;
            case 3:
                lvb.O("Parameter has incorrect type.", obj instanceof Boolean);
                return obj;
            case 4:
                if (obj instanceof Double) {
                    obj = Float.valueOf(((Double) obj).floatValue());
                }
                lvb.O("Parameter has incorrect type.", obj instanceof Float);
                return obj;
            case 5:
                lvb.O("Parameter has incorrect type.", obj instanceof z4e);
                return obj;
            case 6:
                lvb.O("Parameter has incorrect type.", obj instanceof ry9);
                return obj;
            case 7:
                lvb.O("Parameter has incorrect type.", obj instanceof b0a);
                return obj;
            case 8:
                lvb.O("Parameter has incorrect type.", obj instanceof ryh);
                return obj;
            default:
                return null;
        }
    }

    public static boolean c(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((by3) list.get(i2)).h.b(0) == i) {
                return true;
            }
        }
        return false;
    }

    public static by3 d(emf emfVar) {
        String str = emfVar.b;
        Bundle bundle = emfVar.c;
        if (str.startsWith("androidx.media3.session.PLAYER_COMMAND_")) {
            int i = Integer.parseInt(str.substring(39));
            Object objL = l("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", m(i), bundle);
            ay3 ay3Var = new ay3(0);
            ay3Var.g(i, objL);
            return ay3Var.a();
        }
        int i2 = Integer.parseInt(str.substring(40));
        Object objL2 = l("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", i2 == 40010 ? 5 : 0, bundle);
        ay3 ay3Var2 = new ay3(0);
        ay3Var2.h(new emf(i2), objL2);
        return ay3Var2.a();
    }

    public static ghe g(List list, fmf fmfVar, h3d h3dVar) {
        int i;
        z88 z88Var = new z88(4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            by3 by3Var = (by3) list.get(i2);
            emf emfVar = by3Var.a;
            if ((emfVar == null || !fmfVar.a.contains(emfVar)) && ((i = by3Var.b) == -1 || !h3dVar.a(i))) {
                if (by3Var.i) {
                    by3Var = new by3(by3Var.a, by3Var.b, by3Var.c, by3Var.d, by3Var.e, by3Var.f, new Bundle(by3Var.g), false, by3Var.h, by3Var.j);
                }
                z88Var.c(by3Var);
            } else {
                z88Var.c(by3Var);
            }
        }
        return z88Var.h();
    }

    public static by3 i(int i, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(k);
        emf emfVarA = bundle2 == null ? null : emf.a(bundle2);
        int i2 = bundle.getInt(l, -1);
        int i3 = bundle.getInt(m, 0);
        CharSequence charSequence = bundle.getCharSequence(n, "");
        Bundle bundleN = vqi.n(bundle.getBundle(o));
        boolean z = i < 3 || bundle.getBoolean(p, true);
        Uri uri = (Uri) bundle.getParcelable(q);
        int i4 = bundle.getInt(r, 0);
        int[] intArray = bundle.getIntArray(s);
        ay3 ay3Var = new ay3(i4, i3);
        String str = t;
        if (emfVarA != null) {
            ay3Var.h(emfVarA, l(str, emfVarA.a == 40010 ? 5 : 0, bundle));
        }
        if (i2 != -1) {
            ay3Var.g(i2, l(str, m(i2), bundle));
        }
        if (uri != null && (Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"))) {
            ay3Var.e(uri);
        }
        ay3Var.b(charSequence);
        if (bundleN == null) {
            bundleN = Bundle.EMPTY;
        }
        ay3Var.d(bundleN);
        ay3Var.c(z);
        if (intArray == null) {
            intArray = new int[]{6};
        }
        ay3Var.i(intArray);
        return ay3Var.a();
    }

    public static ghe j(List list, boolean z, boolean z2) {
        int iB;
        if (list.isEmpty()) {
            a98 a98Var = c98.b;
            return ghe.e;
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            by3 by3Var = (by3) list.get(i3);
            boolean z3 = by3Var.i;
            x88 x88Var = by3Var.h;
            if (z3 && by3Var.b()) {
                for (int i4 = 0; i4 < x88Var.c() && (iB = x88Var.b(i4)) != 6; i4++) {
                    if (z && i == -1 && iB == 2) {
                        i = i3;
                        break;
                    }
                    if (z2 && i2 == -1 && iB == 3) {
                        i2 = i3;
                        break;
                    }
                }
            }
        }
        z88 z88VarL = c98.l();
        if (i != -1) {
            z88VarL.c(((by3) list.get(i)).e(2));
        }
        if (i2 != -1) {
            z88VarL.c(((by3) list.get(i2)).e(3));
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            by3 by3Var2 = (by3) list.get(i5);
            if (by3Var2.i && by3Var2.b() && i5 != i && i5 != i2 && by3Var2.h.a()) {
                z88VarL.c(by3Var2.e(6));
            }
        }
        return z88VarL.h();
    }

    public static ghe k(List list, h3d h3dVar, Bundle bundle) {
        if (list.isEmpty()) {
            a98 a98Var = c98.b;
            return ghe.e;
        }
        boolean zA = h3dVar.a.a(7, 6);
        boolean zA2 = h3dVar.a.a(9, 8);
        boolean z = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        int i = (zA || z) ? -1 : 0;
        int i2 = (zA2 || z2) ? -1 : i == 0 ? 1 : 0;
        z88 z88VarL = c98.l();
        for (int i3 = 0; i3 < list.size(); i3++) {
            by3 by3Var = (by3) list.get(i3);
            if (i3 == i) {
                if (i2 == -1) {
                    z88VarL.c(by3Var.f(x88.f(2)));
                } else {
                    z88VarL.c(by3Var.f(x88.e()));
                }
            } else if (i3 == i2) {
                z88VarL.c(by3Var.f(x88.f(3)));
            } else {
                z88VarL.c(by3Var.f(x88.d(6)));
            }
        }
        return z88VarL.h();
    }

    public static Object l(String str, int i, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return null;
        }
        switch (i) {
            case 1:
                return Long.valueOf(bundle.getLong(str));
            case 2:
                return Integer.valueOf(bundle.getInt(str));
            case 3:
                return Boolean.valueOf(bundle.getBoolean(str));
            case 4:
                return Float.valueOf(bundle.getFloat(str));
            case 5:
                Bundle bundle2 = bundle.getBundle(str);
                bundle2.getClass();
                return z4e.a(bundle2);
            case 6:
                Bundle bundle3 = bundle.getBundle(str);
                bundle3.getClass();
                return ry9.b(bundle3);
            case 7:
                Bundle bundle4 = bundle.getBundle(str);
                bundle4.getClass();
                return b0a.b(bundle4);
            case 8:
                Bundle bundle5 = bundle.getBundle(str);
                bundle5.getClass();
                return ryh.b(bundle5);
            default:
                return null;
        }
    }

    public static int m(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 5) {
            return 1;
        }
        if (i == 10) {
            return 2;
        }
        if (i == 19) {
            return 7;
        }
        if (i == 24) {
            return 4;
        }
        if (i == 29) {
            return 8;
        }
        if (i == 31) {
            return 6;
        }
        switch (i) {
            case 13:
                return 4;
            case 14:
                return 3;
            case 15:
                return 2;
            default:
                return 0;
        }
    }

    public static boolean n(String str) {
        return str.startsWith("androidx.media3.session.PLAYER_COMMAND_") || str.startsWith("androidx.media3.session.SESSION_COMMAND_");
    }

    public final boolean b() {
        Object obj = this.j;
        emf emfVar = this.a;
        if (emfVar != null) {
            int i = emfVar.a;
            if (i != 0) {
                return i == 40010 && obj != null;
            }
            return true;
        }
        int i2 = this.b;
        if (i2 != 19) {
            if (i2 != 24) {
                if (i2 != 29 && i2 != 31) {
                    switch (i2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                        case 14:
                            break;
                        case 5:
                        case 10:
                        case 13:
                        case 15:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return true;
        }
        return obj != null;
    }

    public final by3 e(int i) {
        String str;
        emf emfVar = this.a;
        if (emfVar != null && emfVar.a == 0) {
            return f(x88.d(i));
        }
        Bundle bundle = Bundle.EMPTY;
        if (this.j != null) {
            bundle = new Bundle();
            o(bundle, "androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
        }
        if (emfVar != null) {
            str = "androidx.media3.session.SESSION_COMMAND_" + emfVar.a;
        } else {
            str = "androidx.media3.session.PLAYER_COMMAND_" + this.b;
        }
        return new by3(new emf(str, bundle), -1, this.c, this.d, this.e, this.f, this.g, this.i, x88.d(i), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by3)) {
            return false;
        }
        by3 by3Var = (by3) obj;
        return Objects.equals(this.a, by3Var.a) && this.b == by3Var.b && this.c == by3Var.c && this.d == by3Var.d && Objects.equals(this.e, by3Var.e) && TextUtils.equals(this.f, by3Var.f) && this.i == by3Var.i && this.h.equals(by3Var.h) && Objects.equals(this.j, by3Var.j);
    }

    public final by3 f(x88 x88Var) {
        if (this.h.equals(x88Var)) {
            return this;
        }
        return new by3(this.a, this.b, this.c, this.d, this.e, this.f, new Bundle(this.g), this.i, x88Var, this.j);
    }

    public final void h(l3d l3dVar) {
        if (this.i) {
            Object obj = this.j;
            int i = this.b;
            if (i == 19) {
                if (obj != null) {
                    l3dVar.r((b0a) obj);
                    return;
                }
                return;
            }
            if (i == 24) {
                if (obj != null) {
                    l3dVar.b(((Float) obj).floatValue());
                    return;
                } else if (l3dVar.a() == 0.0f) {
                    l3dVar.o();
                    return;
                } else {
                    l3dVar.w();
                    return;
                }
            }
            if (i == 29) {
                if (obj != null) {
                    l3dVar.k((ryh) obj);
                    return;
                }
                return;
            }
            if (i == 31) {
                if (obj != null) {
                    l3dVar.t((ry9) obj);
                    return;
                }
                return;
            }
            switch (i) {
                case 1:
                    if (obj == null) {
                        l3dVar.n(!l3dVar.z());
                    } else {
                        l3dVar.n(((Boolean) obj).booleanValue());
                    }
                    break;
                case 2:
                    l3dVar.prepare();
                    break;
                case 3:
                    l3dVar.stop();
                    break;
                case 4:
                    l3dVar.j();
                    break;
                case 5:
                    if (obj != null) {
                        l3dVar.seekTo(((Long) obj).longValue());
                    }
                    break;
                case 6:
                    l3dVar.i();
                    break;
                case 7:
                    l3dVar.l();
                    break;
                case 8:
                    l3dVar.p();
                    break;
                case 9:
                    l3dVar.y();
                    break;
                case 10:
                    if (obj != null) {
                        l3dVar.D(((Integer) obj).intValue());
                    }
                    break;
                case 11:
                    l3dVar.J();
                    break;
                case 12:
                    l3dVar.I();
                    break;
                case 13:
                    if (obj != null) {
                        l3dVar.setPlaybackSpeed(((Float) obj).floatValue());
                    }
                    break;
                case 14:
                    if (obj == null) {
                        l3dVar.A(!l3dVar.H());
                    } else {
                        l3dVar.A(((Boolean) obj).booleanValue());
                    }
                    break;
                case 15:
                    if (obj != null) {
                        l3dVar.setRepeatMode(((Integer) obj).intValue());
                    }
                    break;
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.f, Boolean.valueOf(this.i), this.e, this.h, this.j);
    }

    public final void o(Bundle bundle, String str) {
        int iM;
        emf emfVar = this.a;
        if (emfVar != null) {
            iM = emfVar.a == 40010 ? 5 : 0;
        } else {
            iM = m(this.b);
        }
        Object obj = this.j;
        switch (iM) {
            case 1:
                bundle.putLong(str, ((Long) obj).longValue());
                break;
            case 2:
                bundle.putInt(str, ((Integer) obj).intValue());
                break;
            case 3:
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                break;
            case 4:
                bundle.putFloat(str, ((Float) obj).floatValue());
                break;
            case 5:
                bundle.putBundle(str, ((z4e) obj).c());
                break;
            case 6:
                bundle.putBundle(str, ((ry9) obj).d(false));
                break;
            case 7:
                bundle.putBundle(str, ((b0a) obj).c());
                break;
            case 8:
                bundle.putBundle(str, ((ryh) obj).c());
                break;
        }
    }
}
