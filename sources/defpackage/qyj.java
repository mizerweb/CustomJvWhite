package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.work.impl.WorkDatabase;
import com.vk.push.core.base.AidlException;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class qyj {
    public static final c5b a = new c5b("REMOVED_TASK", 1);
    public static final c5b b = new c5b("CLOSED_EMPTY", 1);
    public static final Object c = new Object();
    public static final Object d = new Object();

    public static /* synthetic */ void A(ViewGroup viewGroup, View view, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if ((i5 & 2) != 0) {
            i = 0;
        }
        if ((i5 & 4) != 0) {
            i2 = 0;
        }
        if ((i5 & 8) != 0) {
            i3 = 0;
        }
        if ((i5 & 16) != 0) {
            i6 = i3;
            i7 = 0;
        } else {
            i6 = i3;
            i7 = i4;
        }
        z(i, i2, i6, i7, viewGroup, view);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:67:0x0100  */
    /* JADX WARN: Code duplicated, block: B:71:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0103 A[SYNTHETIC] */
    public static ArrayList B(String str) throws JSONException {
        int i;
        String strOptString;
        int iHashCode;
        qwf qwfVar;
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            String string = jSONObject.getString("versionName");
            long j = jSONObject.getLong("versionCode");
            String strOptString2 = jSONObject.optString("environment", "");
            qwf qwfVar2 = null;
            String str2 = strOptString2.length() > 0 ? strOptString2 : null;
            String strOptString3 = jSONObject.optString("sessionUuid", "");
            if (strOptString3.length() <= 0) {
                strOptString3 = null;
            }
            if (strOptString3 == null) {
                strOptString3 = UUID.randomUUID().toString();
            }
            String strOptString4 = jSONObject.optString("processName", "");
            if (strOptString4.length() <= 0) {
                strOptString4 = null;
            }
            String string2 = jSONObject.getString("status");
            if (string2 != null) {
                if (string2.equals("RUNNING")) {
                    i = 1;
                } else if (string2.equals("BLANK")) {
                    i = 2;
                } else if (string2.equals("CRASH")) {
                    i = 3;
                } else if (string2.equals("ANR")) {
                    i = 4;
                } else if (string2.equals("NATIVE")) {
                    i = 5;
                } else {
                    ore.p("No enum constant ru.ok.tracer.session.SessionState.Status.".concat(string2));
                }
                strOptString = jSONObject.optString("maxSeverity", "");
                if (strOptString.length() <= 0) {
                    strOptString = null;
                }
                if (strOptString != null) {
                    iHashCode = strOptString.hashCode();
                    qwfVar2 = qwf.h;
                    switch (iHashCode) {
                        case -1986360616:
                            if (!strOptString.equals("NOTICE")) {
                                qwfVar = qwf.f;
                            }
                            break;
                        case 2251950:
                            if (!strOptString.equals("INFO")) {
                                qwfVar = qwf.g;
                            }
                            break;
                        case 64921139:
                            strOptString.equals("DEBUG");
                            continue;
                            continue;
                        case 66247144:
                            if (!strOptString.equals("ERROR")) {
                                qwfVar = qwf.d;
                            }
                            break;
                        case 66665700:
                            if (!strOptString.equals("FATAL")) {
                                qwfVar = qwf.c;
                            }
                            break;
                        case 1842428796:
                            if (!strOptString.equals("WARNING")) {
                                qwfVar = qwf.e;
                            }
                            break;
                        default:
                            continue;
                            continue;
                    }
                    qwfVar2 = qwfVar;
                }
                arrayList.add(new lnf(j, string, str2, strOptString3, strOptString4, i, qwfVar2));
            } else {
                ore.n("Name is null");
            }
            i = 0;
            strOptString = jSONObject.optString("maxSeverity", "");
            if (strOptString.length() <= 0) {
                strOptString = null;
            }
            if (strOptString != null) {
                iHashCode = strOptString.hashCode();
                qwfVar2 = qwf.h;
                switch (iHashCode) {
                    case -1986360616:
                        if (!strOptString.equals("NOTICE")) {
                            qwfVar = qwf.f;
                        }
                        break;
                    case 2251950:
                        if (!strOptString.equals("INFO")) {
                            qwfVar = qwf.g;
                        }
                        break;
                    case 64921139:
                        strOptString.equals("DEBUG");
                        continue;
                        continue;
                    case 66247144:
                        if (!strOptString.equals("ERROR")) {
                            qwfVar = qwf.d;
                        }
                        break;
                    case 66665700:
                        if (!strOptString.equals("FATAL")) {
                            qwfVar = qwf.c;
                        }
                        break;
                    case 1842428796:
                        if (!strOptString.equals("WARNING")) {
                            qwfVar = qwf.e;
                        }
                        break;
                    default:
                        continue;
                        continue;
                }
                qwfVar2 = qwfVar;
            }
            arrayList.add(new lnf(j, string, str2, strOptString3, strOptString4, i, qwfVar2));
        }
        return arrayList;
    }

    public static final img C(jmg jmgVar) {
        long j = jmgVar.a;
        dmg dmgVar = new dmg();
        dmgVar.a = j;
        dmgVar.b = jmgVar.b;
        dmgVar.c = jmgVar.c;
        dmgVar.d = jmgVar.d;
        dmgVar.e = jmgVar.e;
        dmgVar.f = jmgVar.f;
        dmgVar.g = jmgVar.g;
        dmgVar.h = jmgVar.h;
        dmgVar.i = jmgVar.i;
        return new img(dmgVar);
    }

    public static int D(View view, int i) {
        Context context = view.getContext();
        Context context2 = view.getContext();
        String canonicalName = view.getClass().getCanonicalName();
        TypedValue typedValueS0 = e9i.s0(context2, i);
        if (typedValueS0 == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", canonicalName, context2.getResources().getResourceName(i)));
        }
        int i2 = typedValueS0.resourceId;
        return i2 != 0 ? context.getColor(i2) : typedValueS0.data;
    }

    public static final int E(vxe vxeVar, String str) {
        int iN = n(vxeVar, str);
        if (iN >= 0) {
            return iN;
        }
        int columnCount = vxeVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(vxeVar.getColumnName(i));
        }
        c.k("Column '", str, "' does not exist. Available columns: [", ww3.z1(arrayList, null, null, null, null, 63), 93);
        return 0;
    }

    public static final int F(View view) {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        Rect bounds;
        if (Build.VERSION.SDK_INT < 29) {
            return view.getLeft();
        }
        TouchDelegate touchDelegate = view.getTouchDelegate();
        if (touchDelegate == null || (touchDelegateInfo = touchDelegate.getTouchDelegateInfo()) == null) {
            return -1;
        }
        Region regionAt = touchDelegateInfo.getRegionCount() <= 0 ? null : touchDelegateInfo.getRegionAt(0);
        if (regionAt == null || (bounds = regionAt.getBounds()) == null) {
            return -1;
        }
        return bounds.left;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 26661. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static defpackage.vy2 I(defpackage.fka r31) {
        /*
            Method dump skipped, instruction units count: 2666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qyj.I(fka):vy2");
    }

    public static u72 J(vt4 vt4Var, qf7 qf7Var) {
        return f55.m(new n55(vt4Var, 1, qf7Var));
    }

    public static int K(int i, float f, int i2) {
        return mx3.c(mx3.e(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static final void L(View view, int i, int i2, int i3, int i4) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            if (yab.g0(view)) {
                view.layout(view2.getMeasuredWidth() - i3, i2, view2.getMeasuredWidth() - i, i4);
                return;
            } else {
                view.layout(i, i2, i3, i4);
                return;
            }
        }
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "View.layoutRelative()", "View.layoutRelative is skipped, because parent is " + view.getParent(), null);
        }
    }

    public static /* synthetic */ void M(View view, int i, int i2, int i3, int i4) {
        int measuredWidth = view.getMeasuredWidth() + i;
        if ((i4 & 8) != 0) {
            i3 = view.getMeasuredHeight() + i2;
        }
        L(view, i, i2, measuredWidth, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void N(qoc[] qocVarArr, Path path) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        qoc[] qocVarArr2 = qocVarArr;
        float[] fArr = new float[6];
        int length = qocVarArr2.length;
        int i2 = 0;
        int i3 = 0;
        char c2 = 'm';
        while (i3 < length) {
            qoc qocVar = qocVarArr2[i3];
            char c3 = qocVar.a;
            float[] fArr2 = qocVar.b;
            float f11 = fArr[i2];
            float f12 = fArr[1];
            float f13 = fArr[2];
            float f14 = fArr[3];
            float f15 = fArr[4];
            int i4 = i2;
            float f16 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case AidlException.SDK_IS_NOT_INITIALIZED /* 104 */:
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f15, f16);
                    f11 = f15;
                    f13 = f11;
                    f12 = f16;
                    f14 = f12;
                default:
                    i = 2;
                    break;
            }
            float f17 = f15;
            float f18 = f16;
            float f19 = f11;
            float f20 = f12;
            int i5 = i4;
            while (i5 < fArr2.length) {
                if (c3 == 'A') {
                    fArr2 = fArr2;
                    i5 = i5;
                    qocVar = qocVar;
                    float f21 = f20;
                    i3 = i3;
                    int i6 = i5 + 5;
                    int i7 = i5 + 6;
                    qoc.a(path, f19, f21, fArr2[i6], fArr2[i7], fArr2[i5], fArr2[i5 + 1], fArr2[i5 + 2], fArr2[i5 + 3] != 0.0f ? 1 : i4, fArr2[i5 + 4] != 0.0f ? 1 : i4);
                    f13 = fArr2[i6];
                    f = fArr2[i7];
                    f14 = f;
                    f2 = f13;
                } else if (c3 == 'C') {
                    fArr2 = fArr2;
                    i5 = i5;
                    i3 = i3;
                    qocVar = qocVar;
                    int i8 = i5 + 2;
                    int i9 = i5 + 3;
                    int i10 = i5 + 4;
                    int i11 = i5 + 5;
                    path.cubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i8], fArr2[i9], fArr2[i10], fArr2[i11]);
                    float f22 = fArr2[i10];
                    float f23 = fArr2[i11];
                    f13 = fArr2[i8];
                    f14 = fArr2[i9];
                    f = f23;
                    f2 = f22;
                } else if (c3 == 'H') {
                    fArr2 = fArr2;
                    i5 = i5;
                    qocVar = qocVar;
                    f = f20;
                    i3 = i3;
                    path.lineTo(fArr2[i5], f);
                    f2 = fArr2[i5];
                } else if (c3 == 'Q') {
                    fArr2 = fArr2;
                    i5 = i5;
                    i3 = i3;
                    qocVar = qocVar;
                    int i12 = i5 + 1;
                    int i13 = i5 + 2;
                    int i14 = i5 + 3;
                    path.quadTo(fArr2[i5], fArr2[i12], fArr2[i13], fArr2[i14]);
                    float f24 = fArr2[i5];
                    float f25 = fArr2[i12];
                    float f26 = fArr2[i13];
                    float f27 = fArr2[i14];
                    f13 = f24;
                    f14 = f25;
                    f2 = f26;
                    f = f27;
                } else if (c3 == 'V') {
                    fArr2 = fArr2;
                    i5 = i5;
                    i3 = i3;
                    qocVar = qocVar;
                    f2 = f19;
                    path.lineTo(f2, fArr2[i5]);
                    f = fArr2[i5];
                } else if (c3 != 'a') {
                    if (c3 == 'c') {
                        fArr2 = fArr2;
                        i5 = i5;
                        int i15 = i5 + 2;
                        int i16 = i5 + 3;
                        int i17 = i5 + 4;
                        int i18 = i5 + 5;
                        path.rCubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i15], fArr2[i16], fArr2[i17], fArr2[i18]);
                        float f28 = fArr2[i15] + f19;
                        float f29 = fArr2[i16] + f20;
                        f19 += fArr2[i17];
                        f20 += fArr2[i18];
                        f13 = f28;
                        f14 = f29;
                    } else if (c3 != 'h') {
                        if (c3 != 'q') {
                            if (c3 != 'v') {
                                if (c3 == 'L') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    int i19 = i5 + 1;
                                    path.lineTo(fArr2[i5], fArr2[i19]);
                                    f2 = fArr2[i5];
                                    f = fArr2[i19];
                                } else if (c3 == 'M') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    f2 = fArr2[i5];
                                    f = fArr2[i5 + 1];
                                    if (i5 > 0) {
                                        path.lineTo(f2, f);
                                    } else {
                                        path.moveTo(f2, f);
                                        f17 = f2;
                                        f18 = f;
                                    }
                                } else if (c3 == 'S') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f19 = (f19 * 2.0f) - f13;
                                        f20 = (f20 * 2.0f) - f14;
                                    }
                                    float f30 = f19;
                                    float f31 = f20;
                                    int i20 = i5 + 1;
                                    int i21 = i5 + 2;
                                    int i22 = i5 + 3;
                                    path.cubicTo(f30, f31, fArr2[i5], fArr2[i20], fArr2[i21], fArr2[i22]);
                                    f13 = fArr2[i5];
                                    f14 = fArr2[i20];
                                    f2 = fArr2[i21];
                                    f = fArr2[i22];
                                } else if (c3 == 'T') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                        f19 = (f19 * 2.0f) - f13;
                                        f20 = (f20 * 2.0f) - f14;
                                    }
                                    int i23 = i5 + 1;
                                    path.quadTo(f19, f20, fArr2[i5], fArr2[i23]);
                                    f2 = fArr2[i5];
                                    f = fArr2[i23];
                                    qocVar = qocVar;
                                    f13 = f19;
                                    f14 = f20;
                                } else if (c3 == 'l') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    int i24 = i5 + 1;
                                    path.rLineTo(fArr2[i5], fArr2[i24]);
                                    f19 += fArr2[i5];
                                    f6 = fArr2[i24];
                                } else if (c3 == 'm') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    float f32 = fArr2[i5];
                                    f19 += f32;
                                    float f33 = fArr2[i5 + 1];
                                    f20 += f33;
                                    if (i5 > 0) {
                                        path.rLineTo(f32, f33);
                                    } else {
                                        path.rMoveTo(f32, f33);
                                        qocVar = qocVar;
                                        f2 = f19;
                                        f17 = f2;
                                        f = f20;
                                        f18 = f;
                                    }
                                } else if (c3 != 's') {
                                    if (c3 != 't') {
                                        f2 = f19;
                                    } else {
                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                            f9 = f19 - f13;
                                            f10 = f20 - f14;
                                        } else {
                                            f10 = 0.0f;
                                            f9 = 0.0f;
                                        }
                                        int i25 = i5 + 1;
                                        path.rQuadTo(f9, f10, fArr2[i5], fArr2[i25]);
                                        float f34 = f9 + f19;
                                        float f35 = f10 + f20;
                                        float f36 = f19 + fArr2[i5];
                                        f20 += fArr2[i25];
                                        f14 = f35;
                                        f2 = f36;
                                        f13 = f34;
                                    }
                                    f = f20;
                                } else {
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f7 = f20 - f14;
                                        f8 = f19 - f13;
                                    } else {
                                        f8 = 0.0f;
                                        f7 = 0.0f;
                                    }
                                    int i26 = i5;
                                    int i27 = i26 + 1;
                                    int i28 = i26 + 2;
                                    int i29 = i26 + 3;
                                    fArr2 = fArr2;
                                    i5 = i26;
                                    path.rCubicTo(f8, f7, fArr2[i26], fArr2[i27], fArr2[i28], fArr2[i29]);
                                    f3 = fArr2[i5] + f19;
                                    f4 = fArr2[i27] + f20;
                                    f19 += fArr2[i28];
                                    f5 = fArr2[i29];
                                }
                                qocVar = qocVar;
                            } else {
                                fArr2 = fArr2;
                                i5 = i5;
                                path.rLineTo(0.0f, fArr2[i5]);
                                f6 = fArr2[i5];
                            }
                            f20 += f6;
                        } else {
                            fArr2 = fArr2;
                            i5 = i5;
                            int i30 = i5 + 1;
                            int i31 = i5 + 2;
                            int i32 = i5 + 3;
                            path.rQuadTo(fArr2[i5], fArr2[i30], fArr2[i31], fArr2[i32]);
                            f3 = fArr2[i5] + f19;
                            f4 = fArr2[i30] + f20;
                            f19 += fArr2[i31];
                            f5 = fArr2[i32];
                        }
                        f20 += f5;
                        f13 = f3;
                        f14 = f4;
                    } else {
                        fArr2 = fArr2;
                        i5 = i5;
                        path.rLineTo(fArr2[i5], 0.0f);
                        f19 += fArr2[i5];
                    }
                    qocVar = qocVar;
                    f2 = f19;
                    f = f20;
                } else {
                    fArr2 = fArr2;
                    i5 = i5;
                    int i33 = i5 + 5;
                    float f37 = fArr2[i33] + f19;
                    int i34 = i5 + 6;
                    float f38 = fArr2[i34] + f20;
                    qocVar = qocVar;
                    float f39 = f19;
                    float f40 = f20;
                    i3 = i3;
                    qoc.a(path, f39, f40, f37, f38, fArr2[i5], fArr2[i5 + 1], fArr2[i5 + 2], fArr2[i5 + 3] != 0.0f ? 1 : i4, fArr2[i5 + 4] != 0.0f ? 1 : i4);
                    f2 = f39 + fArr2[i33];
                    f = f40 + fArr2[i34];
                    f13 = f2;
                    f14 = f;
                }
                i5 += i;
                path = path;
                qocVar = qocVar;
                c3 = c3;
                i3 = i3;
                f19 = f2;
                f20 = f;
                c2 = c3;
                fArr2 = fArr2;
            }
            fArr[i4] = f19;
            fArr[1] = f20;
            fArr[2] = f13;
            fArr[3] = f14;
            fArr[4] = f17;
            fArr[5] = f18;
            c2 = qocVar.a;
            i3++;
            qocVarArr2 = qocVarArr;
            i2 = i4;
        }
    }

    public static GradientDrawable O(Integer num) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(num.intValue());
        return gradientDrawable;
    }

    public static final Object R(i19 i19Var, n09 n09Var, qf7 qf7Var, mdh mdhVar) {
        Object objK;
        if (n09Var != n09.b) {
            return (i19Var.d != n09.a && (objK = cqk.k(new l83(i19Var, n09Var, qf7Var, (lq4) null, 11), mdhVar)) == hu4.a) ? objK : sbi.a;
        }
        ore.p("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        return null;
    }

    public static final p3c S() {
        p3c p3cVar = new p3c(7);
        p3cVar.b = new AtomicReference(null);
        return p3cVar;
    }

    public static final GradientDrawable T(Integer num, Integer num2, Integer num3, int i) {
        float f = i;
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = f;
        }
        return U(num, num2, num3, fArr);
    }

    public static final GradientDrawable U(Integer num, Integer num2, Integer num3, float[] fArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num3.intValue(), num2.intValue());
        }
        return gradientDrawable;
    }

    public static final Object V(vt4 vt4Var, af7 af7Var, lq4 lq4Var) {
        return yab.K0(vt4Var, new y73(af7Var, (lq4) null, 11), lq4Var);
    }

    public static JSONArray W(Iterable iterable) throws JSONException {
        String str;
        String str2;
        JSONArray jSONArray = new JSONArray();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            lnf lnfVar = (lnf) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("versionName", lnfVar.b);
            jSONObject.put("versionCode", lnfVar.a);
            jSONObject.put("environment", lnfVar.c);
            jSONObject.put("sessionUuid", lnfVar.d);
            jSONObject.put("processName", lnfVar.e);
            int i = lnfVar.f;
            String str3 = null;
            if (i == 1) {
                str = "RUNNING";
            } else if (i == 2) {
                str = "BLANK";
            } else if (i == 3) {
                str = "CRASH";
            } else if (i == 4) {
                str = "ANR";
            } else {
                if (i != 5) {
                    throw null;
                }
                str = "NATIVE";
            }
            jSONObject.put("status", str);
            qwf qwfVar = lnfVar.g;
            if (qwfVar != null) {
                if (qwfVar == qwf.c) {
                    str2 = "FATAL";
                } else if (qwfVar == qwf.d) {
                    str2 = "ERROR";
                } else if (qwfVar == qwf.e) {
                    str2 = "WARNING";
                } else if (qwfVar != qwf.f) {
                    str2 = qwfVar != qwf.g ? "DEBUG" : "INFO";
                } else {
                    str2 = "NOTICE";
                }
                str3 = str2;
            }
            jSONObject.put("maxSeverity", str3);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static final void Y(f40 f40Var, g3 g3Var) throws IOException {
        FileOutputStream fileOutputStreamF = f40Var.f();
        if (fileOutputStreamF == null) {
            qr7.k("Failed to start write to atomic file");
            return;
        }
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStreamF);
            try {
                try {
                    try {
                        g3Var.invoke(new c40(dataOutputStream));
                        dataOutputStream.flush();
                        if (!f40Var.b(fileOutputStreamF)) {
                            throw new kv6("Failed to finish write data to atomic file");
                        }
                        try {
                            dataOutputStream.close();
                        } catch (IOException unused) {
                        }
                    } catch (kv6 e) {
                        throw e;
                    } catch (Exception e2) {
                        f40Var.a(fileOutputStreamF);
                        throw new IOException("Failed to write data to atomic file", e2);
                    }
                } catch (IOException e3) {
                    f40Var.a(fileOutputStreamF);
                    throw e3;
                }
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (IOException e4) {
            f40Var.a(fileOutputStreamF);
            throw e4;
        } catch (Exception e5) {
            f40Var.a(fileOutputStreamF);
            throw new IOException("Failed to create data output stream for atomic file", e5);
        }
    }

    public static void Z(int i, int i2) {
        String strB;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strB = wok.b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    ore.p(zo5.h(i2, "negative size: "));
                    return;
                }
                strB = wok.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static final i64 a(Object obj) {
        i64 i64Var = new i64();
        i64Var.Q(obj);
        return i64Var;
    }

    public static void a0(int i, int i2) {
        if (i < 0 || i > i2) {
            c.r(c0(i, i2, "index"));
        }
    }

    public static final boolean b(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cqk.i(cCharAt, np0.m) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    public static void b0(int i, int i2, int i3) {
        String strC0;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strC0 = c0(i, i3, "start index");
            } else {
                strC0 = (i2 < 0 || i2 > i3) ? c0(i2, i3, "end index") : wok.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strC0);
        }
    }

    public static String c0(int i, int i2, String str) {
        if (i < 0) {
            return wok.b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return wok.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        ore.p(zo5.h(i2, "negative size: "));
        return null;
    }

    public static boolean d(qoc[] qocVarArr, qoc[] qocVarArr2) {
        if (qocVarArr == null || qocVarArr2 == null || qocVarArr.length != qocVarArr2.length) {
            return false;
        }
        for (int i = 0; i < qocVarArr.length; i++) {
            qoc qocVar = qocVarArr[i];
            char c2 = qocVar.a;
            qoc qocVar2 = qocVarArr2[i];
            if (c2 != qocVar2.a || qocVar.b.length != qocVar2.b.length) {
                return false;
            }
        }
        return true;
    }

    public static void h(String str, boolean z) {
        if (z) {
            return;
        }
        ore.p(str);
    }

    public static void i(boolean z) {
        if (z) {
            return;
        }
        ore.a();
    }

    public static void j(int i, String str, int i2, int i3) {
        if (i < i2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
        }
        if (i <= i3) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
    }

    public static void k(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ore.n(str);
    }

    public static void l(String str, boolean z) {
        if (z) {
            return;
        }
        ore.k(str);
    }

    public static final w41 m(v78 v78Var, w41 w41Var, w41 w41Var2, h98 h98Var) {
        t78 t78Var = v78Var.a;
        if (t78Var == t78.a) {
            return w41Var;
        }
        if (t78Var == t78.b) {
            return w41Var2;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[RETURN] */
    public static final int n(vxe vxeVar, String str) {
        int columnCount = vxeVar.getColumnCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount) {
                i2 = -1;
                break;
            }
            if (str.equals(vxeVar.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        String strG = qv1.g('`', "`", str);
        int columnCount2 = vxeVar.getColumnCount();
        while (i < columnCount2) {
            if (strG.equals(vxeVar.getColumnName(i))) {
                if (i >= 0) {
                    return i;
                }
                return -1;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return i;
        }
        return -1;
    }

    public static int o(int i, int i2) {
        return mx3.e(i, (Color.alpha(i) * i2) / 255);
    }

    public static float[] p(int i, float[] fArr) {
        if (i < 0) {
            ore.a();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6 A[SYNTHETIC] */
    public static qoc[] q(String str) {
        int i;
        String strTrim;
        float[] fArrP;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char cCharAt = str.charAt(i4);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i3, i4).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i2) != 'z' || strTrim.charAt(i2) == 'Z') {
                                fArrP = new float[i2];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i5 = i2;
                                    int i6 = 1;
                                    while (i6 < length) {
                                        int i7 = i2;
                                        int i8 = i7;
                                        int i9 = i8;
                                        int i10 = i9;
                                        for (int i11 = i6; i11 < strTrim.length(); i11++) {
                                            char cCharAt2 = strTrim.charAt(i11);
                                            if (cCharAt2 == ' ') {
                                                i7 = 0;
                                                i9 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i7 = 0;
                                                        i9 = 1;
                                                        break;
                                                    case '-':
                                                        if (i11 == i6 || i7 != 0) {
                                                            i7 = 0;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 != 0) {
                                                if (i6 < i11) {
                                                    fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                                    i5++;
                                                }
                                                if (i10 != 0) {
                                                    i6 = i11;
                                                } else {
                                                    i6 = i11 + 1;
                                                }
                                                i2 = 0;
                                            }
                                        }
                                        if (i6 < i11) {
                                            fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                            i5++;
                                        }
                                        if (i10 != 0) {
                                            i6 = i11;
                                        } else {
                                            i6 = i11 + 1;
                                        }
                                        i2 = 0;
                                    }
                                    fArrP = p(i5, fArr);
                                    i2 = 0;
                                } catch (NumberFormatException e) {
                                    ore.h(c0a.o("error in parsing \"", strTrim, "\""), e);
                                    return null;
                                }
                            }
                            arrayList.add(new qoc(strTrim.charAt(i2), fArrP));
                        }
                        i3 = i4;
                        i4++;
                        i2 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i4++;
            }
            strTrim = str.substring(i3, i4).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i2) != 'z') {
                    fArrP = new float[i2];
                } else {
                    fArrP = new float[i2];
                }
                arrayList.add(new qoc(strTrim.charAt(i2), fArrP));
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new qoc(str.charAt(i3), new float[0]));
        }
        return (qoc[]) arrayList.toArray(new qoc[i]);
    }

    public static Path r(String str) {
        Path path = new Path();
        try {
            N(q(str), path);
            return path;
        } catch (RuntimeException e) {
            ore.h("Error in parsing ".concat(str), e);
            return null;
        }
    }

    public static final oyj t(Context context, ja4 ja4Var) {
        pre preVarI;
        azj azjVar = new azj(ja4Var.c);
        Context applicationContext = context.getApplicationContext();
        lhb lhbVar = ja4Var.d;
        if (context.getResources().getBoolean(R.bool.workmanager_test_configuration)) {
            preVarI = new pre(applicationContext, WorkDatabase.class, null);
            preVarI.i = true;
        } else {
            preVarI = np4.i(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            preVarI.h = new gve(applicationContext);
        }
        preVarI.f = azjVar.a;
        preVarI.d.add(new gs3(0, lhbVar));
        preVarI.a(aya.h);
        preVarI.a(new pya(2, 3, applicationContext));
        preVarI.a(aya.i);
        preVarI.a(aya.j);
        preVarI.a(new pya(5, 6, applicationContext));
        preVarI.a(aya.k);
        preVarI.a(aya.l);
        preVarI.a(aya.m);
        preVarI.a(new jya(applicationContext));
        preVarI.a(new pya(10, 11, applicationContext));
        preVarI.a(aya.d);
        preVarI.a(aya.e);
        preVarI.a(aya.f);
        preVarI.a(aya.g);
        preVarI.a(new pya(21, 22, applicationContext));
        preVarI.o = false;
        preVarI.p = true;
        preVarI.q = true;
        WorkDatabase workDatabase = (WorkDatabase) preVarI.b();
        azh azhVar = new azh(context.getApplicationContext(), azjVar);
        ijd ijdVar = new ijd(context.getApplicationContext(), ja4Var, azjVar, workDatabase);
        return new oyj(context.getApplicationContext(), ja4Var, azjVar, workDatabase, (List) pyj.a.d(context, ja4Var, azjVar, workDatabase, azhVar, ijdVar), ijdVar, azhVar);
    }

    public static d71 u(String str) {
        if (str.length() % 2 != 0) {
            c.o("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (p90.b(str.charAt(i2 + 1)) + (p90.b(str.charAt(i2)) << 4));
        }
        return new d71(bArr);
    }

    public static qoc[] v(qoc[] qocVarArr) {
        qoc[] qocVarArr2 = new qoc[qocVarArr.length];
        for (int i = 0; i < qocVarArr.length; i++) {
            qocVarArr2[i] = new qoc(qocVarArr[i]);
        }
        return qocVarArr2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0053, B:28:0x0068, B:30:0x0070, B:20:0x0045, B:23:0x004f), top: B:47:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (r1.emit(r10, r0) == r5) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0082 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object w(defpackage.yx6 r7, defpackage.hr2 r8, boolean r9, defpackage.lq4 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.sy6
            if (r0 == 0) goto L13
            r0 = r10
            sy6 r0 = (defpackage.sy6) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            sy6 r0 = new sy6
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.h
            int r1 = r0.i
            r2 = 0
            r3 = 2
            r4 = 1
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L49
            if (r1 == r4) goto L3d
            if (r1 != r3) goto L37
            boolean r9 = r0.g
            h41 r7 = r0.f
            hr2 r8 = r0.e
            yx6 r1 = r0.d
            defpackage.ch3.d0(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L53
        L35:
            r7 = move-exception
            goto L8d
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r7)
            return r2
        L3d:
            boolean r9 = r0.g
            h41 r7 = r0.f
            hr2 r8 = r0.e
            yx6 r1 = r0.d
            defpackage.ch3.d0(r10)     // Catch: java.lang.Throwable -> L35
            goto L68
        L49:
            defpackage.ch3.d0(r10)
            defpackage.e9i.M(r7)
            h41 r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L53:
            r0.d = r7     // Catch: java.lang.Throwable -> L35
            r0.e = r8     // Catch: java.lang.Throwable -> L35
            r0.f = r10     // Catch: java.lang.Throwable -> L35
            r0.g = r9     // Catch: java.lang.Throwable -> L35
            r0.i = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L64
            goto L84
        L64:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L68:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L85
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.d = r1     // Catch: java.lang.Throwable -> L35
            r0.e = r8     // Catch: java.lang.Throwable -> L35
            r0.f = r7     // Catch: java.lang.Throwable -> L35
            r0.g = r9     // Catch: java.lang.Throwable -> L35
            r0.i = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.emit(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L84:
            return r5
        L85:
            if (r9 == 0) goto L8a
            r8.b(r2)
        L8a:
            sbi r7 = defpackage.sbi.a
            return r7
        L8d:
            throw r7     // Catch: java.lang.Throwable -> L8e
        L8e:
            r10 = move-exception
            if (r9 == 0) goto La3
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L98
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L98:
            if (r2 != 0) goto La0
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            java.util.concurrent.CancellationException r2 = defpackage.mwl.a(r9, r7)
        La0:
            r8.b(r2)
        La3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qyj.w(yx6, hr2, boolean, lq4):java.lang.Object");
    }

    public static d71 x(String str) {
        d71 d71Var = new d71(str.getBytes(pt2.a));
        d71Var.c = str;
        return d71Var;
    }

    public static final Rect y(View view, int i, int i2) {
        Rect rect = new Rect();
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new kwh(view, rect, i, i2));
            return rect;
        }
        view.getHitRect(rect);
        if (rect.width() < i) {
            int iWidth = (i - rect.width()) / 2;
            rect.left -= iWidth;
            rect.right += iWidth;
        }
        if (rect.height() < i2) {
            int iHeight = (i2 - rect.height()) / 2;
            rect.top -= iHeight;
            rect.bottom += iHeight;
        }
        view.setTouchDelegate(new vg6(rect, view));
        return rect;
    }

    public static final void z(final int i, final int i2, final int i3, final int i4, final View view, final View view2) {
        if (view == null) {
            return;
        }
        view.post(new Runnable() { // from class: jwh
            @Override // java.lang.Runnable
            public final void run() {
                Rect rect = new Rect();
                View view3 = view2;
                view3.getHitRect(rect);
                rect.left -= i;
                rect.top -= i2;
                rect.right += i3;
                rect.bottom += i4;
                view.setTouchDelegate(new TouchDelegate(rect, view3));
            }
        });
    }

    public int G(qxe qxeVar, Object obj) {
        if (obj == null) {
            return 0;
        }
        vxe vxeVarO0 = qxeVar.O0(s());
        try {
            c(vxeVarO0, obj);
            vxeVarO0.M0();
            p90.f(vxeVarO0, null);
            return e9i.e0(qxeVar);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p90.f(vxeVarO0, th);
                throw th2;
            }
        }
    }

    public void H(qxe qxeVar, Iterable iterable) {
        if (iterable == null) {
            return;
        }
        vxe vxeVarO0 = qxeVar.O0(s());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    c(vxeVarO0, obj);
                    vxeVarO0.M0();
                    vxeVarO0.reset();
                    e9i.e0(qxeVar);
                }
            }
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

    public abstract void P(x3 x3Var, x3 x3Var2);

    public abstract void Q(x3 x3Var, Thread thread);

    public abstract void c(vxe vxeVar, Object obj);

    public abstract boolean e(y3 y3Var, u3 u3Var, u3 u3Var2);

    public abstract boolean f(y3 y3Var, Object obj, Object obj2);

    public abstract boolean g(y3 y3Var, x3 x3Var, x3 x3Var2);

    public abstract String s();
}
