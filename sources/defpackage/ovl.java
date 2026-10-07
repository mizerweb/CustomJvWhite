package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.facebook.fresco.middleware.HasExtraData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ovl {
    public static ehh a(qxe qxeVar, String str) {
        Map mapB;
        gof gofVar;
        vxe vxeVarO0 = qxeVar.O0("PRAGMA table_info(`" + str + "`)");
        try {
            long j = 0;
            if (vxeVarO0.M0()) {
                int iN = qyj.n(vxeVarO0, SdkMetricStatEvent.NAME_KEY);
                int iN2 = qyj.n(vxeVarO0, "type");
                int iN3 = qyj.n(vxeVarO0, "notnull");
                int iN4 = qyj.n(vxeVarO0, "pk");
                int iN5 = qyj.n(vxeVarO0, "dflt_value");
                ul9 ul9Var = new ul9();
                do {
                    String strB0 = vxeVarO0.B0(iN);
                    ul9Var.put(strB0, new bhh((int) vxeVarO0.getLong(iN4), 2, strB0, vxeVarO0.B0(iN2), vxeVarO0.isNull(iN5) ? null : vxeVarO0.B0(iN5), vxeVarO0.getLong(iN3) != 0));
                } while (vxeVarO0.M0());
                mapB = ul9Var.b();
                p90.f(vxeVarO0, null);
            } else {
                mapB = s66.a;
                p90.f(vxeVarO0, null);
            }
            vxe vxeVarO1 = qxeVar.O0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iN6 = qyj.n(vxeVarO1, "id");
                int iN7 = qyj.n(vxeVarO1, "seq");
                int iN8 = qyj.n(vxeVarO1, "table");
                int iN9 = qyj.n(vxeVarO1, "on_delete");
                int iN10 = qyj.n(vxeVarO1, "on_update");
                List listE = yok.e(vxeVarO1);
                vxeVarO1.reset();
                gof gofVar2 = new gof();
                while (vxeVarO1.M0()) {
                    if (vxeVarO1.getLong(iN7) == j) {
                        int i = (int) vxeVarO1.getLong(iN6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = iN6;
                        ArrayList<v77> arrayList3 = new ArrayList();
                        for (Object obj : listE) {
                            int i3 = iN7;
                            List list = listE;
                            if (((v77) obj).a == i) {
                                arrayList3.add(obj);
                            }
                            iN7 = i3;
                            listE = list;
                        }
                        int i4 = iN7;
                        List list2 = listE;
                        for (v77 v77Var : arrayList3) {
                            arrayList.add(v77Var.c);
                            arrayList2.add(v77Var.d);
                        }
                        gofVar2.add(new chh(vxeVarO1.B0(iN8), vxeVarO1.B0(iN9), vxeVarO1.B0(iN10), arrayList, arrayList2));
                        iN6 = i2;
                        iN7 = i4;
                        listE = list2;
                        j = 0;
                    }
                }
                gof gofVarE = p90.e(gofVar2);
                p90.f(vxeVarO1, null);
                vxe vxeVarO2 = qxeVar.O0("PRAGMA index_list(`" + str + "`)");
                try {
                    int iN11 = qyj.n(vxeVarO2, SdkMetricStatEvent.NAME_KEY);
                    int iN12 = qyj.n(vxeVarO2, HasExtraData.KEY_ORIGIN);
                    int iN13 = qyj.n(vxeVarO2, "unique");
                    if (iN11 == -1 || iN12 == -1 || iN13 == -1) {
                        p90.f(vxeVarO2, null);
                        gofVar = null;
                    } else {
                        gof gofVar3 = new gof();
                        while (vxeVarO2.M0()) {
                            if (DatabaseHelper.COMPRESSED_COLUMN_NAME.equals(vxeVarO2.B0(iN12))) {
                                dhh dhhVarF = yok.f(qxeVar, vxeVarO2.B0(iN11), vxeVarO2.getLong(iN13) == 1);
                                if (dhhVarF == null) {
                                    p90.f(vxeVarO2, null);
                                    gofVar = null;
                                } else {
                                    gofVar3.add(dhhVarF);
                                }
                            }
                        }
                        gof gofVarE2 = p90.e(gofVar3);
                        p90.f(vxeVarO2, null);
                        gofVar = gofVarE2;
                    }
                    return new ehh(str, mapB, gofVarE, gofVar);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p90.f(vxeVarO2, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    p90.f(vxeVarO1, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                p90.f(vxeVarO0, th5);
                throw th6;
            }
        }
    }

    public static void b(EditorInfo editorInfo, String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    public static void c(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            iq4.h(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            iq4.h(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = charSequence.length();
        if (i4 < 0 || i2 > length) {
            d(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            d(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            d(editorInfo, charSequence, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(charSequence.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        d(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public static void d(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }
}
