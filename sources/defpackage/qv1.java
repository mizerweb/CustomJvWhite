package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class qv1 {
    public static int a(float f, float f2, int i) {
        return View.MeasureSpec.makeMeasureSpec(gm0.K(f * f2), i);
    }

    public static int b(float f, float f2, int i, int i2) {
        return i2 - (gm0.K(f * f2) + i);
    }

    public static int c(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    public static ImageView d(Context context, int i) {
        ImageView imageView = new ImageView(context);
        imageView.setId(i);
        return imageView;
    }

    public static TextView e(Context context, int i) {
        TextView textView = new TextView(context);
        textView.setId(i);
        return textView;
    }

    public static Object f(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String g(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String h(String str, m65 m65Var) {
        return str + m65Var;
    }

    public static String i(String str, ha9 ha9Var) {
        return str + ha9Var;
    }

    public static String j(String str, Integer num) {
        return str + num;
    }

    public static String k(String str, String str2) {
        return str + str2;
    }

    public static String l(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String m(String str, String str2, boolean z) {
        return str + z + str2;
    }

    public static String n(String str, StringBuilder sb, List list) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static String o(StringBuilder sb, String str, int i, String str2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder p(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder q(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static ArrayList r(int i, HashMap map, ArrayList arrayList, int i2, String str) {
        map.put(Integer.valueOf(i), arrayList);
        ArrayList arrayList2 = new ArrayList(i2);
        arrayList2.add(str);
        return arrayList2;
    }

    public static void s(long j, String str, String str2, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        sb.append(str2);
    }

    public static void t(gu4 gu4Var, String str, Throwable th) {
        gm0.V(gu4Var.getClass().getName(), str, th);
    }

    public static void u(String str, String str2, String str3) {
        gm0.V(str2, str3, new IllegalStateException(str));
    }

    public static void v(String str, String str2, StringBuilder sb, boolean z, boolean z2) {
        sb.append(str);
        sb.append(z);
        sb.append(str2);
        sb.append(z2);
    }

    public static /* synthetic */ String w(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String x(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "BIG_CHANGES";
        }
        return "SMALL_CHANGES";
    }

    public static /* synthetic */ String y(int i) {
        if (i == 1) {
            return "ACTIVE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "DELETED";
        }
        return "BLOCKED";
    }

    public static /* synthetic */ String z(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "REMOVED";
        }
        return "BLOCKED";
    }
}
