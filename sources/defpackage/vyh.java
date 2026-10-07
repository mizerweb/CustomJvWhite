package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class vyh {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public Object d;
    public final Object e;
    public Object f;

    public vyh(qlb qlbVar) {
        int i;
        ArrayList arrayList;
        this.a = 2;
        new ArrayList();
        this.f = new Bundle();
        this.e = qlbVar;
        Context context = qlbVar.a;
        ArrayList arrayList2 = qlbVar.I;
        ArrayList<htc> arrayList3 = qlbVar.c;
        ArrayList arrayList4 = qlbVar.d;
        this.c = context;
        Notification.Builder builder = new Notification.Builder(context, qlbVar.A);
        this.d = builder;
        Notification notification = qlbVar.G;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(qlbVar.e).setContentText(qlbVar.f).setContentInfo(null).setContentIntent(qlbVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(qlbVar.h, (notification.flags & np0.m) != 0).setNumber(qlbVar.j).setProgress(qlbVar.p, qlbVar.q, qlbVar.r);
        IconCompat iconCompat = qlbVar.i;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.g(context));
        builder.setSubText(qlbVar.o).setUsesChronometer(qlbVar.m).setPriority(qlbVar.k);
        emb embVar = qlbVar.n;
        if (embVar instanceof vlb) {
            Iterator it = ((vlb) embVar).d().iterator();
            while (it.hasNext()) {
                a((klb) it.next());
            }
        } else {
            Iterator it2 = qlbVar.b.iterator();
            while (it2.hasNext()) {
                a((klb) it2.next());
            }
        }
        Bundle bundle = qlbVar.x;
        if (bundle != null) {
            ((Bundle) this.f).putAll(bundle);
        }
        ((Notification.Builder) this.d).setShowWhen(qlbVar.l);
        ((Notification.Builder) this.d).setLocalOnly(qlbVar.v);
        ((Notification.Builder) this.d).setGroup(qlbVar.s);
        ((Notification.Builder) this.d).setSortKey(qlbVar.u);
        ((Notification.Builder) this.d).setGroupSummary(qlbVar.t);
        this.b = qlbVar.D;
        ((Notification.Builder) this.d).setCategory(qlbVar.w);
        ((Notification.Builder) this.d).setColor(qlbVar.y);
        ((Notification.Builder) this.d).setVisibility(qlbVar.z);
        ((Notification.Builder) this.d).setPublicVersion(null);
        ((Notification.Builder) this.d).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    CharSequence charSequence = ((htc) it3.next()).a;
                    arrayList.add(charSequence != null ? "name:" + ((Object) charSequence) : "");
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    pw pwVar = new pw(arrayList2.size() + arrayList.size());
                    pwVar.addAll(arrayList);
                    pwVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(pwVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                ((Notification.Builder) this.d).addPerson((String) it4.next());
            }
        }
        if (arrayList4.size() > 0) {
            Bundle bundle2 = qlbVar.b().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i2 = 0; i2 < arrayList4.size(); i2++) {
                bundle4.putBundle(Integer.toString(i2), zcl.a((klb) arrayList4.get(i2)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            qlbVar.b().putBundle("android.car.EXTENSIONS", bundle2);
            ((Bundle) this.f).putBundle("android.car.EXTENSIONS", bundle3);
        }
        ((Notification.Builder) this.d).setExtras(qlbVar.x);
        ((Notification.Builder) this.d).setRemoteInputHistory(null);
        ((Notification.Builder) this.d).setBadgeIconType(qlbVar.B);
        ((Notification.Builder) this.d).setSettingsText(null);
        ((Notification.Builder) this.d).setShortcutId(qlbVar.C);
        ((Notification.Builder) this.d).setTimeoutAfter(0L);
        ((Notification.Builder) this.d).setGroupAlertBehavior(qlbVar.D);
        if (!TextUtils.isEmpty(qlbVar.A)) {
            ((Notification.Builder) this.d).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            for (htc htcVar : arrayList3) {
                Notification.Builder builder2 = (Notification.Builder) this.d;
                htcVar.getClass();
                go.a(builder2, go.i(htcVar));
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            li8.f((Notification.Builder) this.d, qlbVar.F);
            li8.g((Notification.Builder) this.d);
        }
        if (i3 >= 31 && (i = qlbVar.E) != 0) {
            jmb.b((Notification.Builder) this.d, i);
        }
        if (qlbVar.H) {
            if (((qlb) this.e).t) {
                this.b = 2;
            } else {
                this.b = 1;
            }
            ((Notification.Builder) this.d).setVibrate(null);
            ((Notification.Builder) this.d).setSound(null);
            int i4 = notification.defaults & (-4);
            notification.defaults = i4;
            ((Notification.Builder) this.d).setDefaults(i4);
            if (TextUtils.isEmpty(((qlb) this.e).s)) {
                ((Notification.Builder) this.d).setGroup("silent");
            }
            ((Notification.Builder) this.d).setGroupAlertBehavior(this.b);
        }
    }

    public static /* synthetic */ void q(vyh vyhVar, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = vyhVar.b;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        vyhVar.p(i, str, str2);
        throw null;
    }

    public void A(View view) {
        ((ArrayList) this.e).add(view);
        p3c p3cVar = (p3c) this.c;
        lfe lfeVarT = RecyclerView.T(view);
        if (lfeVarT != null) {
            View view2 = lfeVarT.a;
            RecyclerView recyclerView = (RecyclerView) p3cVar.b;
            int i = lfeVarT.q;
            if (i != -1) {
                lfeVarT.p = i;
            } else {
                WeakHashMap weakHashMap = i7j.a;
                lfeVarT.p = view2.getImportantForAccessibility();
            }
            if (recyclerView.Y()) {
                lfeVarT.q = 4;
                recyclerView.T1.add(lfeVarT);
            } else {
                WeakHashMap weakHashMap2 = i7j.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean B(vyh vyhVar, int i) {
        return vyhVar != null && Objects.equals(((mje[]) this.c)[i], ((mje[]) vyhVar.c)[i]) && Objects.equals(((rg6[]) this.d)[i], ((rg6[]) vyhVar.d)[i]);
    }

    public boolean C(int i) {
        return ((mje[]) this.c)[i] != null;
    }

    public String D(String str, boolean z) {
        int i = this.b;
        try {
            if (h() == 6 && cqk.d(F(z), str)) {
                this.d = null;
                if (h() == 5) {
                    return F(z);
                }
            }
            return null;
        } finally {
            this.b = i;
            this.d = null;
        }
    }

    public byte E() {
        String str = (String) this.f;
        int i = this.b;
        while (true) {
            int iG = G(i);
            if (iG == -1) {
                this.b = iG;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iG);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.b = iG;
                return n1g.k(cCharAt);
            }
            i = iG + 1;
        }
    }

    public String F(boolean z) {
        String strL;
        byte bE = E();
        if (z) {
            if (bE != 1 && bE != 0) {
                return null;
            }
            strL = m();
        } else {
            if (bE != 1) {
                return null;
            }
            strL = l();
        }
        this.d = strL;
        return strL;
    }

    public int G(int i) {
        if (i < ((String) this.f).length()) {
            return i;
        }
        return -1;
    }

    public int H() {
        char cCharAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        String str = (String) this.f;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.b = i;
        return i;
    }

    public boolean I() {
        int iH = H();
        String str = (String) this.f;
        if (iH >= str.length() || iH == -1 || str.charAt(iH) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public boolean J(boolean z) {
        int iG = G(H());
        String str = (String) this.f;
        int length = str.length() - iG;
        if (length >= 4 && iG != -1) {
            for (int i = 0; i < 4; i++) {
                if ("null".charAt(i) == str.charAt(iG + i)) {
                }
            }
            if (length <= 4 || n1g.k(str.charAt(iG + 4)) != 0) {
                if (z) {
                    this.b = iG + 4;
                }
                return true;
            }
        }
        return false;
    }

    public void K(char c) {
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String strM = m();
                this.b = i;
                if (cqk.d(strM, "null")) {
                    p(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        r(n1g.k(c), true);
        throw null;
    }

    public void L(View view) {
        if (((ArrayList) this.e).remove(view)) {
            p3c p3cVar = (p3c) this.c;
            lfe lfeVarT = RecyclerView.T(view);
            if (lfeVarT != null) {
                RecyclerView recyclerView = (RecyclerView) p3cVar.b;
                int i = lfeVarT.p;
                if (recyclerView.Y()) {
                    lfeVarT.q = i;
                    recyclerView.T1.add(lfeVarT);
                } else {
                    View view2 = lfeVarT.a;
                    WeakHashMap weakHashMap = i7j.a;
                    view2.setImportantForAccessibility(i);
                }
                lfeVarT.p = 0;
            }
        }
    }

    public void a(klb klbVar) {
        IconCompat iconCompatA = klbVar.a();
        int i = klbVar.f;
        boolean z = klbVar.d;
        Bundle bundle = klbVar.a;
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatA != null ? iconCompatA.g(null) : null, klbVar.h, klbVar.i);
        bie[] bieVarArr = klbVar.c;
        if (bieVarArr != null) {
            for (RemoteInput remoteInput : bie.a(bieVarArr)) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", z);
        builder.setAllowGeneratedReplies(z);
        bundle2.putInt("android.support.action.semanticAction", i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            go.h(builder, i);
        }
        if (i2 >= 29) {
            li8.h(builder);
        }
        if (i2 >= 31) {
            jmb.a(builder);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", klbVar.e);
        builder.addExtras(bundle2);
        ((Notification.Builder) this.d).addAction(builder.build());
    }

    public void b(View view, int i, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((p3c) this.c).b;
        int childCount = i < 0 ? recyclerView.getChildCount() : w(i);
        ((xp3) this.d).e(childCount, z);
        if (z) {
            A(view);
        }
        recyclerView.addView(view, childCount);
        lfe lfeVarT = RecyclerView.T(view);
        nee neeVar = recyclerView.m;
        if (neeVar != null && lfeVarT != null) {
            neeVar.z(lfeVarT);
        }
        ArrayList arrayList = recyclerView.C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((xee) recyclerView.C.get(size)).d(view);
            }
        }
    }

    public int c(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.e).append((char) (s(i + 3, charSequence) + (s(i, charSequence) << 12) + (s(i + 1, charSequence) << 8) + (s(i + 2, charSequence) << 4)));
            return i2;
        }
        this.b = i;
        if (i2 < charSequence.length()) {
            return c(this.b, charSequence);
        }
        q(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void d(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((p3c) this.c).b;
        int childCount = i < 0 ? recyclerView.getChildCount() : w(i);
        ((xp3) this.d).e(childCount, z);
        if (z) {
            A(view);
        }
        lfe lfeVarT = RecyclerView.T(view);
        if (lfeVarT != null) {
            if (!lfeVarT.u() && !lfeVarT.z()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(lfeVarT);
                c.m(sb, recyclerView.D());
                return;
            } else {
                if (RecyclerView.a2) {
                    Log.d("RecyclerView", "reAttach " + lfeVarT);
                }
                lfeVarT.j &= -257;
            }
        } else if (RecyclerView.Z1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String strD = recyclerView.D();
            sb2.append(", index: ");
            sb2.append(childCount);
            sb2.append(strD);
            throw new IllegalArgumentException(sb2.toString());
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public boolean e() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        String str = (String) this.f;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.b = i;
        return false;
    }

    public void f(int i, String str) {
        String str2 = (String) this.f;
        if (str2.length() - i < str.length()) {
            q(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                q(this, "Expected valid boolean literal prefix, but had '" + m() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public String g() {
        String string;
        StringBuilder sb = (StringBuilder) this.e;
        String str = (String) this.f;
        j('\"');
        int i = this.b;
        int iU0 = r5h.U0(str, '\"', i, 4);
        if (iU0 == -1) {
            m();
            r((byte) 1, false);
            throw null;
        }
        int i2 = i;
        while (i2 < iU0) {
            if (str.charAt(i2) == '\\') {
                int iG = this.b;
                char cCharAt = str.charAt(i2);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iG, i2);
                        int iG2 = G(i2 + 1);
                        if (iG2 == -1) {
                            q(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iC = iG2 + 1;
                        char cCharAt2 = str.charAt(iG2);
                        if (cCharAt2 == 'u') {
                            iC = c(iC, str);
                        } else {
                            char c = cCharAt2 < 'u' ? ys2.a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                q(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iG = G(iC);
                        if (iG == -1) {
                            q(this, "Unexpected EOF", iG, null, 4);
                            throw null;
                        }
                    } else {
                        i2++;
                        if (i2 >= str.length()) {
                            sb.append((CharSequence) str, iG, i2);
                            iG = G(i2);
                            if (iG == -1) {
                                q(this, "Unexpected EOF", iG, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i2);
                    }
                    i2 = iG;
                    z = true;
                    cCharAt = str.charAt(i2);
                }
                if (z) {
                    sb.append((CharSequence) str, iG, i2);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iG, i2).toString();
                }
                this.b = i2 + 1;
                return string;
            }
            i2++;
        }
        this.b = iU0 + 1;
        return str.substring(i, iU0);
    }

    public byte h() {
        String str = (String) this.f;
        int i = this.b;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                return n1g.k(cCharAt);
            }
            i = i2;
        }
        this.b = str.length();
        return (byte) 10;
    }

    public byte i(byte b) {
        byte bH = h();
        if (bH == b) {
            return bH;
        }
        r(b, true);
        throw null;
    }

    public void j(char c) {
        int i = this.b;
        if (i == -1) {
            K(c);
            throw null;
        }
        String str = (String) this.f;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                if (cCharAt == c) {
                    return;
                }
                K(c);
                throw null;
            }
            i = i2;
        }
        this.b = -1;
        K(c);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public long k() {
        boolean z;
        boolean z2;
        long j;
        double dPow;
        int iG = G(H());
        String str = (String) this.f;
        ?? r6 = 0;
        if (iG >= str.length() || iG == -1) {
            q(this, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iG) == '\"') {
            iG++;
            if (iG == str.length()) {
                q(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iG;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        long j2 = 0;
        long j3 = 0;
        while (true) {
            if (i == str.length()) {
                z2 = z;
                break;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt != 'e' && cCharAt != 'E') || z4) {
                if (cCharAt == '-' && z4) {
                    if (i == iG) {
                        q(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i++;
                    z3 = false;
                } else if (cCharAt != '+' || !z4) {
                    z2 = z;
                    if (cCharAt != '-') {
                        if (n1g.k(cCharAt) != 0) {
                            break;
                        }
                        i++;
                        int i2 = cCharAt - '0';
                        if (i2 < 0 || i2 >= 10) {
                            q(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        if (z4) {
                            j2 = (j2 * 10) + ((long) i2);
                        } else {
                            j3 = (j3 * 10) - ((long) i2);
                            if (j3 > 0) {
                                q(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        z = z2;
                    } else {
                        if (i != iG) {
                            q(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i++;
                        z = z2;
                        r6 = 0;
                        z5 = true;
                    }
                } else {
                    if (i == iG) {
                        q(this, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i++;
                    r6 = 0;
                    z3 = true;
                }
                r6 = 0;
            } else {
                if (i == iG) {
                    q(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, r6, 6);
                    throw r6;
                }
                i++;
                z3 = true;
                z4 = true;
            }
        }
        boolean z6 = i != iG;
        if (iG == i || (z5 && iG == i - 1)) {
            q(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z2) {
            if (!z6) {
                q(this, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(i) != '\"') {
                q(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i++;
        }
        this.b = i;
        long j4 = j3;
        if (z4) {
            double d = j4;
            if (!z3) {
                dPow = Math.pow(10.0d, -j2);
            } else {
                if (!z3) {
                    ore.o();
                    return 0L;
                }
                dPow = Math.pow(10.0d, j2);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                q(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                q(this, "Can't convert " + d2 + " to Long", 0, null, 6);
                throw null;
            }
            j = (long) d2;
        } else {
            j = j4;
        }
        if (z5) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        q(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public String l() {
        String str = (String) this.d;
        if (str == null) {
            return g();
        }
        this.d = null;
        return str;
    }

    public String m() {
        String string;
        StringBuilder sb = (StringBuilder) this.e;
        String str = (String) this.f;
        String str2 = (String) this.d;
        if (str2 != null) {
            this.d = null;
            return str2;
        }
        int iH = H();
        if (iH >= str.length() || iH == -1) {
            q(this, "EOF", iH, null, 4);
            throw null;
        }
        byte bK = n1g.k(str.charAt(iH));
        if (bK == 1) {
            return l();
        }
        if (bK != 0) {
            q(this, "Expected beginning of the string, but got " + str.charAt(iH), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (n1g.k(str.charAt(iH)) == 0) {
            iH++;
            if (iH >= str.length()) {
                sb.append((CharSequence) str, this.b, iH);
                int iG = G(iH);
                if (iG == -1) {
                    this.b = iH;
                    sb.append((CharSequence) str, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iH = iG;
                z = true;
            }
        }
        int i = this.b;
        if (z) {
            sb.append((CharSequence) str, i, iH);
            String string3 = sb.toString();
            sb.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(i, iH).toString();
        }
        this.b = iH;
        return string;
    }

    public String n() {
        String strM = m();
        if (!cqk.d(strM, "null") || ((String) this.f).charAt(this.b - 1) == '\"') {
            return strM;
        }
        q(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public void o(int i) {
        int iW = w(i);
        ((xp3) this.d).g(iW);
        RecyclerView recyclerView = (RecyclerView) ((p3c) this.c).b;
        View childAt = recyclerView.getChildAt(iW);
        if (childAt != null) {
            lfe lfeVarT = RecyclerView.T(childAt);
            if (lfeVarT != null) {
                if (lfeVarT.u() && !lfeVarT.z()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(lfeVarT);
                    c.m(sb, recyclerView.D());
                    return;
                } else {
                    if (RecyclerView.a2) {
                        Log.d("RecyclerView", "tmpDetach " + lfeVarT);
                    }
                    lfeVarT.j(np0.n);
                }
            }
        } else if (RecyclerView.Z1) {
            c.d(iW, recyclerView.D(), "No view at offset ");
            return;
        }
        recyclerView.detachViewFromParent(iW);
    }

    public void p(int i, String str, String str2) {
        String strConcat = str2.length() == 0 ? "" : "\n".concat(str2);
        StringBuilder sbZ = zo5.z(str, " at path: ");
        sbZ.append(((hle) this.c).g());
        sbZ.append(strConcat);
        throw xd2.e(sbZ.toString(), (String) this.f, i);
    }

    public void r(byte b, boolean z) {
        String str = (String) this.f;
        String strD0 = n1g.d0(b);
        int i = this.b;
        int i2 = z ? i - 1 : i;
        q(this, nbh.w("Expected ", strD0, ", but had '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    public int s(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        q(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public View t(int i) {
        return ((RecyclerView) ((p3c) this.c).b).getChildAt(w(i));
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return ((xp3) this.d).toString() + ", hidden list:" + ((ArrayList) this.e).size();
            case 5:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f);
                sb.append("', currentPosition=");
                return qt4.p(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    public int u() {
        return ((RecyclerView) ((p3c) this.c).b).getChildCount() - ((ArrayList) this.e).size();
    }

    public int v() {
        return this.b;
    }

    public int w(int i) {
        xp3 xp3Var = (xp3) this.d;
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((p3c) this.c).b).getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iB = i - (i2 - xp3Var.b(i2));
            if (iB == 0) {
                while (xp3Var.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iB;
        }
        return -1;
    }

    public int x() {
        return this.b;
    }

    public View y(int i) {
        return ((RecyclerView) ((p3c) this.c).b).getChildAt(i);
    }

    public int z() {
        return ((RecyclerView) ((p3c) this.c).b).getChildCount();
    }

    public vyh(p3c p3cVar) {
        this.a = 1;
        this.b = 0;
        this.c = p3cVar;
        this.d = new xp3();
        this.e = new ArrayList();
    }

    public vyh(mje[] mjeVarArr, rg6[] rg6VarArr, fzh fzhVar, Object obj) {
        this.a = 0;
        lvb.R(mjeVarArr.length == rg6VarArr.length);
        this.c = mjeVarArr;
        this.d = (rg6[]) rg6VarArr.clone();
        this.e = fzhVar;
        this.f = obj;
        this.b = mjeVarArr.length;
    }

    public vyh(String str) {
        this.a = 5;
        hle hleVar = new hle(5, (byte) 0);
        hleVar.c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        hleVar.d = iArr;
        hleVar.b = -1;
        this.c = hleVar;
        this.e = new StringBuilder();
        this.f = str;
    }

    public vyh(qg7 qg7Var, int i, oac oacVar, nac nacVar, pac pacVar) {
        this.a = 4;
        this.c = qg7Var;
        this.b = i;
        this.d = oacVar;
        this.e = nacVar;
        this.f = pacVar;
    }

    public vyh(int i, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.a = 3;
        this.b = i;
        this.c = iArr;
        this.d = iArr2;
        this.e = iArr3;
        this.f = iArr4;
    }
}
