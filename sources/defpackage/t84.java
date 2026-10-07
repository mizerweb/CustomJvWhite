package defpackage;

import android.util.Log;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.apache.http.HttpHost;

/* JADX INFO: loaded from: classes.dex */
public final class t84 {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public t84(r84 r84Var, q84 q84Var) {
        this.a = 0;
        this.c = new ArrayList();
        this.g = new IdentityHashMap();
        this.d = new ArrayList();
        this.h = new s84();
        this.e = r84Var;
        if (q84Var.a) {
            this.f = new mf(12);
        } else {
            w4 w4Var = new w4();
            w4Var.a = new SparseArray();
            this.f = w4Var;
        }
        int i = q84Var.b;
        this.b = i;
        if (i == 1) {
            this.i = new ks9(28);
            return;
        }
        if (i == 2) {
            ggg gggVar = new ggg();
            gggVar.a = 0L;
            this.i = gggVar;
        } else if (i == 3) {
            this.i = new xva(27);
        } else {
            ore.p("unknown stable id mode");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:57:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [lq4] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [vt4] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a2 -> B:21:0x00b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0166 -> B:12:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x01a5 -> B:48:0x01af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01b5 -> B:51:0x01c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01ed -> B:56:0x01f9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.t84 r37, java.util.List r38, defpackage.lq4 r39) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t84.a(t84, java.util.List, lq4):java.lang.Object");
    }

    public boolean b(int i, nee neeVar) {
        ArrayList arrayList = (ArrayList) this.d;
        if (i < 0 || i > arrayList.size()) {
            qr7.l("Index must be between 0 and ", arrayList.size(), ". Given:", i);
            return false;
        }
        if (this.b != 1) {
            qyj.h("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS", neeVar.b);
        } else if (neeVar.b) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        int iM = m(neeVar);
        if ((iM == -1 ? null : (ybb) arrayList.get(iM)) != null) {
            return false;
        }
        ybb ybbVar = new ybb(neeVar, this, (j9j) this.f, ((igg) this.i).v());
        arrayList.add(i, ybbVar);
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                neeVar.t(recyclerView);
            }
        }
        if (ybbVar.e > 0) {
            ((r84) this.e).r(e(ybbVar), ybbVar.e);
        }
        d();
        return true;
    }

    public k28 c() {
        ArrayList arrayList;
        String str = (String) this.e;
        if (str == null) {
            ore.k("scheme == null");
            return null;
        }
        String strM = ghb.m(0, (String) this.f, 0, 7);
        String strM2 = ghb.m(0, (String) this.g, 0, 7);
        String str2 = (String) this.h;
        if (str2 == null) {
            ore.k("host == null");
            return null;
        }
        int iF = f();
        ArrayList arrayList2 = (ArrayList) this.c;
        ArrayList arrayList3 = new ArrayList(yw3.W0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(ghb.m(0, (String) it.next(), 0, 7));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.d;
        if (arrayList4 != null) {
            arrayList = new ArrayList(yw3.W0(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? ghb.m(0, str3, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = (String) this.i;
        return new k28(str, strM, strM2, str2, iF, arrayList, str4 != null ? ghb.m(0, str4, 0, 7) : null, toString());
    }

    public void d() {
        int i;
        Iterator it = ((ArrayList) this.d).iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 1;
                break;
            }
            ybb ybbVar = (ybb) it.next();
            int i2 = ybbVar.c.c;
            i = 3;
            if (i2 == 3 || (i2 == 2 && ybbVar.e == 0)) {
                break;
            }
        }
        r84 r84Var = (r84) this.e;
        if (i != r84Var.c) {
            r84Var.c = i;
            r84Var.a.g();
        }
    }

    public int e(ybb ybbVar) {
        ybb ybbVar2;
        Iterator it = ((ArrayList) this.d).iterator();
        int i = 0;
        while (it.hasNext() && (ybbVar2 = (ybb) it.next()) != ybbVar) {
            i += ybbVar2.e;
        }
        return i;
    }

    public int f() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        String str = (String) this.e;
        if (str.equals(HttpHost.DEFAULT_SCHEME_NAME)) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public s84 g(int i) {
        s84 s84Var = (s84) this.h;
        if (s84Var.b) {
            s84Var = new s84();
        } else {
            s84Var.b = true;
        }
        int i2 = i;
        for (ybb ybbVar : (ArrayList) this.d) {
            int i3 = ybbVar.e;
            if (i3 > i2) {
                s84Var.c = ybbVar;
                s84Var.a = i2;
                break;
            }
            i2 -= i3;
        }
        if (((ybb) s84Var.c) != null) {
            return s84Var;
        }
        ore.p(zo5.h(i, "Cannot find wrapper for "));
        return null;
    }

    public ix2 h() {
        return (ix2) this.c;
    }

    public ix2 i() {
        return (ix2) this.f;
    }

    public int j() {
        return this.b;
    }

    public ybb k(lfe lfeVar) {
        ybb ybbVar = (ybb) ((IdentityHashMap) this.g).get(lfeVar);
        if (ybbVar != null) {
            return ybbVar;
        }
        c.s("Cannot find wrapper for ", lfeVar, ", seems like it is not bound by this adapter: ", this);
        return null;
    }

    public void l(String str) {
        String strF = np4.F(ghb.m(0, str, 0, 7));
        if (strF != null) {
            this.h = strF;
        } else {
            ore.p("unexpected host: ".concat(str));
        }
    }

    public int m(nee neeVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ybb) arrayList.get(i)).c == neeVar) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    public void n(k28 k28Var, String str) {
        int i;
        Object obj;
        Object obj2;
        int i2;
        int iG;
        int i3;
        int i4;
        char cCharAt;
        String str2 = str;
        ArrayList arrayList = (ArrayList) this.c;
        byte[] bArr = uqi.a;
        int iN = uqi.n(0, str2.length(), str2);
        int iO = uqi.o(iN, str2.length(), str2);
        byte b = -1;
        if (iO - iN >= 2) {
            char cCharAt2 = str2.charAt(iN);
            if ((cqk.i(cCharAt2, 97) >= 0 && cqk.i(cCharAt2, 122) <= 0) || (cqk.i(cCharAt2, 65) >= 0 && cqk.i(cCharAt2, 90) <= 0)) {
                int i5 = iN + 1;
                while (true) {
                    if (i5 < iO) {
                        char cCharAt3 = str2.charAt(i5);
                        if (('a' <= cCharAt3 && cCharAt3 < '{') || (('A' <= cCharAt3 && cCharAt3 < '[') || (('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                            i5++;
                        } else if (cCharAt3 == ':') {
                            i = i5;
                            break;
                        }
                    }
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
        } else {
            i = -1;
            break;
        }
        int i6 = 1;
        if (i != -1) {
            obj2 = HttpHost.DEFAULT_SCHEME_NAME;
            obj = "https";
            if (str2.regionMatches(true, iN, "https:", 0, 6)) {
                this.e = obj;
                iN += 6;
                str2 = str;
            } else {
                str2 = str;
                if (!str2.regionMatches(true, iN, "http:", 0, 5)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, i) + '\'');
                }
                this.e = obj2;
                iN += 5;
            }
        } else {
            obj = "https";
            obj2 = HttpHost.DEFAULT_SCHEME_NAME;
            if (k28Var == null) {
                ore.p("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str2.length() > 6 ? r5h.u1(6, str2).concat("...") : str2));
                return;
            }
            this.e = k28Var.a;
        }
        int i7 = iN;
        int i8 = 0;
        while (true) {
            i2 = i6;
            if (i7 >= iO || !((cCharAt = str2.charAt(i7)) == '\\' || cCharAt == '/')) {
                break;
            }
            i8++;
            i7++;
            i6 = i2;
        }
        byte b2 = 35;
        if (i8 >= 2 || k28Var == null || !cqk.d(k28Var.a, (String) this.e)) {
            int i9 = iN + i8;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                iG = uqi.g(str2, i9, iO, "@/\\?#");
                byte bCharAt = iG != iO ? str2.charAt(iG) : b;
                if (bCharAt == b || bCharAt == b2 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (i10 == 0) {
                        int iF = uqi.f(':', i9, iG, str2);
                        String strE = ghb.e(i9, iF, 240, str2, " \"':;<=>@[]^`{}|/\\?#");
                        if (i11 != 0) {
                            strE = qt4.q(new StringBuilder(), (String) this.f, "%40", strE);
                        }
                        this.f = strE;
                        if (iF != iG) {
                            this.g = ghb.e(iF + 1, iG, 240, str2, " \"':;<=>@[]^`{}|/\\?#");
                            i10 = i2;
                        }
                        i11 = i2;
                    } else {
                        this.g = ((String) this.g) + "%40" + ghb.e(i9, iG, 240, str2, " \"':;<=>@[]^`{}|/\\?#");
                    }
                    i9 = iG + 1;
                    b = -1;
                    b2 = 35;
                }
            }
            int i12 = i9;
            while (true) {
                if (i12 >= iG) {
                    i12 = iG;
                    break;
                }
                char cCharAt4 = str2.charAt(i12);
                if (cCharAt4 == '[') {
                    do {
                        i12++;
                        if (i12 >= iG) {
                            break;
                        }
                    } while (str2.charAt(i12) != ']');
                } else if (cCharAt4 == ':') {
                    break;
                }
                i12++;
            }
            int i13 = i12 + 1;
            if (i13 < iG) {
                this.h = np4.F(ghb.m(i9, str2, i12, 4));
                try {
                    i4 = Integer.parseInt(ghb.e(i13, iG, 248, str2, ""));
                    if (i2 > i4 || i4 >= 65536) {
                        i4 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.b = i4;
                if (i4 == -1) {
                    qr7.f(34, str2.substring(i13, iG), "Invalid URL port: \"");
                    return;
                }
            } else {
                this.h = np4.F(ghb.m(i9, str2, i12, 4));
                String str3 = (String) this.e;
                if (str3.equals(obj2)) {
                    i3 = 80;
                } else {
                    i3 = str3.equals(obj) ? 443 : -1;
                }
                this.b = i3;
            }
            if (((String) this.h) == null) {
                qr7.f(34, str2.substring(i9, i12), "Invalid URL host: \"");
                return;
            }
            iN = iG;
        } else {
            this.f = k28Var.e();
            this.g = k28Var.a();
            this.h = k28Var.d;
            this.b = k28Var.e;
            arrayList.clear();
            arrayList.addAll(k28Var.c());
            if (iN == iO || str2.charAt(iN) == '#') {
                String strD = k28Var.d();
                this.d = strD != null ? ghb.s(ghb.e(0, 0, 211, strD, " \"'<>#")) : null;
            }
        }
        int iG2 = uqi.g(str2, iN, iO, "?#");
        if (iN != iG2) {
            char cCharAt5 = str2.charAt(iN);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                iN++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iN < iG2) {
                int iG3 = uqi.g(str2, iN, iG2, "/\\");
                boolean z = iG3 < iG2;
                String strE2 = ghb.e(iN, iG3, 240, str2, " \"<>^`{}|/\\?#");
                if (!strE2.equals(".") && !strE2.equalsIgnoreCase("%2e")) {
                    if (!strE2.equals("..") && !strE2.equalsIgnoreCase("%2e.") && !strE2.equalsIgnoreCase(".%2e") && !strE2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) qv1.f(1, arrayList)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strE2);
                        } else {
                            arrayList.add(strE2);
                        }
                        if (z) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                iN = z ? iG3 + 1 : iG3;
            }
        }
        if (iG2 < iO && str2.charAt(iG2) == '?') {
            int iF2 = uqi.f('#', iG2, iO, str2);
            this.d = ghb.s(ghb.e(iG2 + 1, iF2, 208, str2, " \"'<>#"));
            iG2 = iF2;
        }
        if (iG2 >= iO || str2.charAt(iG2) != '#') {
            return;
        }
        this.i = ghb.e(iG2 + 1, iO, 176, str2, "");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.e;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.f).length() > 0 || ((String) this.g).length() > 0) {
                    sb.append((String) this.f);
                    if (((String) this.g).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.g);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.h;
                if (str2 != null) {
                    if (r5h.M0(str2, ':')) {
                        sb.append('[');
                        sb.append((String) this.h);
                        sb.append(']');
                    } else {
                        sb.append((String) this.h);
                    }
                }
                int i = -1;
                if (this.b != -1 || ((String) this.e) != null) {
                    int iF = f();
                    String str3 = (String) this.e;
                    if (str3 == null) {
                        sb.append(':');
                        sb.append(iF);
                    } else {
                        if (str3.equals(HttpHost.DEFAULT_SCHEME_NAME)) {
                            i = 80;
                        } else if (str3.equals("https")) {
                            i = 443;
                        }
                        if (iF != i) {
                            sb.append(':');
                            sb.append(iF);
                        }
                    }
                }
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i2));
                }
                if (((ArrayList) this.d) != null) {
                    sb.append('?');
                    ArrayList arrayList2 = (ArrayList) this.d;
                    fj8 fj8VarA0 = oc9.a0(oc9.f0(0, arrayList2.size()), 2);
                    int i3 = fj8VarA0.a;
                    int i4 = fj8VarA0.b;
                    int i5 = fj8VarA0.c;
                    if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                        while (true) {
                            String str4 = (String) arrayList2.get(i3);
                            String str5 = (String) arrayList2.get(i3 + 1);
                            if (i3 > 0) {
                                sb.append('&');
                            }
                            sb.append(str4);
                            if (str5 != null) {
                                sb.append('=');
                                sb.append(str5);
                            }
                            if (i3 != i4) {
                                i3 += i5;
                            }
                        }
                    }
                }
                if (((String) this.i) != null) {
                    sb.append('#');
                    sb.append((String) this.i);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public t84(y82 y82Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, oo3 oo3Var) {
        this.a = 3;
        this.e = y82Var;
        this.f = oo3Var;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.g = ny8Var3;
        this.h = new b9b();
        this.b = 241;
        this.i = p90.a(c76.a);
    }

    public t84() {
        this.a = 1;
        this.f = "";
        this.g = "";
        this.b = -1;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add("");
    }

    public t84(int i, bs0 bs0Var, ix2 ix2Var, ix2 ix2Var2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.a = 2;
        this.b = i;
        this.e = bs0Var;
        this.f = ix2Var;
        this.c = ix2Var2;
        this.d = iArr;
        this.g = iArr2;
        this.h = iArr3;
        this.i = iArr4;
    }
}
