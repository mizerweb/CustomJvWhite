package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import com.vk.push.core.base.AidlException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class eg4 {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap a = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(AidlException.SDK_IS_NOT_INITIALIZED, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(AidlException.TRANSFERRED_IPC_DATA_EXCEPTION, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(AidlException.TRANSFERRED_IPC_DATA_EXCEPTION, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(AidlException.SDK_IS_NOT_INITIALIZED, 83);
        sparseIntArray2.append(AidlException.HOST_IS_NOT_MASTER, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] e(sp0 sp0Var, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = sp0Var.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = c3e.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && sp0Var.isInEditMode() && (sp0Var.getParent() instanceof wf4)) {
                wf4 wf4Var = (wf4) sp0Var.getParent();
                if (strTrim != null) {
                    HashMap map = wf4Var.m;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = wf4Var.m.get(strTrim);
                    }
                } else {
                    wf4Var.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static zf4 f(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        String str;
        zf4 zf4Var = new zf4();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? e3e.c : e3e.a);
        cg4 cg4Var = zf4Var.b;
        dg4 dg4Var = zf4Var.e;
        bg4 bg4Var = zf4Var.c;
        ag4 ag4Var = zf4Var.d;
        int[] iArr = d;
        String[] strArr = b05.a;
        String str2 = "Unknown attribute 0x";
        SparseIntArray sparseIntArray = e;
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            yf4 yf4Var = new yf4();
            bg4Var.getClass();
            ag4Var.getClass();
            dg4Var.getClass();
            int i2 = 0;
            while (i2 < indexCount) {
                int i3 = indexCount;
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i4 = i2;
                switch (f.get(index)) {
                    case 2:
                        str = str2;
                        yf4Var.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ag4Var.I));
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case vg8.l /* 35 */:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder(str2);
                        str = str2;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        str = str2;
                        yf4Var.c(5, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        str = str2;
                        yf4Var.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ag4Var.C));
                        break;
                    case 7:
                        str = str2;
                        yf4Var.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ag4Var.D));
                        break;
                    case 8:
                        str = str2;
                        yf4Var.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ag4Var.J));
                        break;
                    case 11:
                        str = str2;
                        yf4Var.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ag4Var.P));
                        break;
                    case 12:
                        str = str2;
                        yf4Var.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ag4Var.Q));
                        break;
                    case 13:
                        str = str2;
                        yf4Var.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ag4Var.M));
                        break;
                    case 14:
                        str = str2;
                        yf4Var.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ag4Var.O));
                        break;
                    case 15:
                        str = str2;
                        yf4Var.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ag4Var.R));
                        break;
                    case 16:
                        str = str2;
                        yf4Var.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ag4Var.N));
                        break;
                    case 17:
                        str = str2;
                        yf4Var.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ag4Var.d));
                        break;
                    case 18:
                        str = str2;
                        yf4Var.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ag4Var.e));
                        break;
                    case 19:
                        str = str2;
                        yf4Var.a(19, typedArrayObtainStyledAttributes.getFloat(index, ag4Var.f));
                        break;
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        str = str2;
                        yf4Var.a(20, typedArrayObtainStyledAttributes.getFloat(index, ag4Var.w));
                        break;
                    case 21:
                        str = str2;
                        yf4Var.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, ag4Var.c));
                        break;
                    case 22:
                        str = str2;
                        yf4Var.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, cg4Var.a)]);
                        break;
                    case 23:
                        str = str2;
                        yf4Var.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, ag4Var.b));
                        break;
                    case 24:
                        str = str2;
                        yf4Var.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ag4Var.F));
                        break;
                    case 27:
                        str = str2;
                        yf4Var.b(27, typedArrayObtainStyledAttributes.getInt(index, ag4Var.E));
                        break;
                    case 28:
                        str = str2;
                        yf4Var.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ag4Var.G));
                        break;
                    case 31:
                        str = str2;
                        yf4Var.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ag4Var.K));
                        break;
                    case 34:
                        str = str2;
                        yf4Var.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ag4Var.H));
                        break;
                    case LangUtils.HASH_OFFSET /* 37 */:
                        str = str2;
                        yf4Var.a(37, typedArrayObtainStyledAttributes.getFloat(index, ag4Var.x));
                        break;
                    case 38:
                        str = str2;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, zf4Var.a);
                        zf4Var.a = resourceId;
                        yf4Var.b(38, resourceId);
                        break;
                    case 39:
                        str = str2;
                        yf4Var.a(39, typedArrayObtainStyledAttributes.getFloat(index, ag4Var.U));
                        break;
                    case 40:
                        str = str2;
                        yf4Var.a(40, typedArrayObtainStyledAttributes.getFloat(index, ag4Var.T));
                        break;
                    case 41:
                        str = str2;
                        yf4Var.b(41, typedArrayObtainStyledAttributes.getInt(index, ag4Var.V));
                        break;
                    case 42:
                        str = str2;
                        yf4Var.b(42, typedArrayObtainStyledAttributes.getInt(index, ag4Var.W));
                        break;
                    case 43:
                        str = str2;
                        yf4Var.a(43, typedArrayObtainStyledAttributes.getFloat(index, cg4Var.c));
                        break;
                    case 44:
                        str = str2;
                        yf4Var.d(44, true);
                        yf4Var.a(44, typedArrayObtainStyledAttributes.getDimension(index, dg4Var.m));
                        break;
                    case 45:
                        str = str2;
                        yf4Var.a(45, typedArrayObtainStyledAttributes.getFloat(index, dg4Var.b));
                        break;
                    case 46:
                        str = str2;
                        yf4Var.a(46, typedArrayObtainStyledAttributes.getFloat(index, dg4Var.c));
                        break;
                    case 47:
                        str = str2;
                        yf4Var.a(47, typedArrayObtainStyledAttributes.getFloat(index, dg4Var.d));
                        break;
                    case 48:
                        str = str2;
                        yf4Var.a(48, typedArrayObtainStyledAttributes.getFloat(index, dg4Var.e));
                        break;
                    case 49:
                        str = str2;
                        yf4Var.a(49, typedArrayObtainStyledAttributes.getDimension(index, dg4Var.f));
                        break;
                    case 50:
                        str = str2;
                        yf4Var.a(50, typedArrayObtainStyledAttributes.getDimension(index, dg4Var.g));
                        break;
                    case 51:
                        str = str2;
                        yf4Var.a(51, typedArrayObtainStyledAttributes.getDimension(index, dg4Var.i));
                        break;
                    case 52:
                        str = str2;
                        yf4Var.a(52, typedArrayObtainStyledAttributes.getDimension(index, dg4Var.j));
                        break;
                    case 53:
                        str = str2;
                        yf4Var.a(53, typedArrayObtainStyledAttributes.getDimension(index, dg4Var.k));
                        break;
                    case 54:
                        str = str2;
                        yf4Var.b(54, typedArrayObtainStyledAttributes.getInt(index, ag4Var.X));
                        break;
                    case 55:
                        str = str2;
                        yf4Var.b(55, typedArrayObtainStyledAttributes.getInt(index, ag4Var.Y));
                        break;
                    case 56:
                        str = str2;
                        yf4Var.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ag4Var.Z));
                        break;
                    case 57:
                        str = str2;
                        yf4Var.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ag4Var.a0));
                        break;
                    case 58:
                        str = str2;
                        yf4Var.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ag4Var.b0));
                        break;
                    case 59:
                        str = str2;
                        yf4Var.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ag4Var.c0));
                        break;
                    case 60:
                        str = str2;
                        yf4Var.a(60, typedArrayObtainStyledAttributes.getFloat(index, dg4Var.a));
                        break;
                    case 62:
                        str = str2;
                        yf4Var.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ag4Var.A));
                        break;
                    case 63:
                        str = str2;
                        yf4Var.a(63, typedArrayObtainStyledAttributes.getFloat(index, ag4Var.B));
                        break;
                    case 64:
                        str = str2;
                        yf4Var.b(64, i(typedArrayObtainStyledAttributes, index, bg4Var.a));
                        break;
                    case 65:
                        str = str2;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            yf4Var.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            yf4Var.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        str = str2;
                        yf4Var.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        str = str2;
                        yf4Var.a(67, typedArrayObtainStyledAttributes.getFloat(index, bg4Var.e));
                        break;
                    case 68:
                        str = str2;
                        yf4Var.a(68, typedArrayObtainStyledAttributes.getFloat(index, cg4Var.d));
                        break;
                    case 69:
                        str = str2;
                        yf4Var.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        str = str2;
                        yf4Var.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        str = str2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        str = str2;
                        yf4Var.b(72, typedArrayObtainStyledAttributes.getInt(index, ag4Var.f0));
                        break;
                    case 73:
                        str = str2;
                        yf4Var.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ag4Var.g0));
                        break;
                    case 74:
                        str = str2;
                        yf4Var.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        str = str2;
                        yf4Var.d(75, typedArrayObtainStyledAttributes.getBoolean(index, ag4Var.n0));
                        break;
                    case 76:
                        str = str2;
                        yf4Var.b(76, typedArrayObtainStyledAttributes.getInt(index, bg4Var.c));
                        break;
                    case 77:
                        str = str2;
                        yf4Var.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        str = str2;
                        yf4Var.b(78, typedArrayObtainStyledAttributes.getInt(index, cg4Var.b));
                        break;
                    case 79:
                        str = str2;
                        yf4Var.a(79, typedArrayObtainStyledAttributes.getFloat(index, bg4Var.d));
                        break;
                    case 80:
                        str = str2;
                        yf4Var.d(80, typedArrayObtainStyledAttributes.getBoolean(index, ag4Var.l0));
                        break;
                    case 81:
                        str = str2;
                        yf4Var.d(81, typedArrayObtainStyledAttributes.getBoolean(index, ag4Var.m0));
                        break;
                    case 82:
                        str = str2;
                        yf4Var.b(82, typedArrayObtainStyledAttributes.getInteger(index, bg4Var.b));
                        break;
                    case 83:
                        str = str2;
                        yf4Var.b(83, i(typedArrayObtainStyledAttributes, index, dg4Var.h));
                        break;
                    case 84:
                        str = str2;
                        yf4Var.b(84, typedArrayObtainStyledAttributes.getInteger(index, bg4Var.g));
                        break;
                    case 85:
                        str = str2;
                        yf4Var.a(85, typedArrayObtainStyledAttributes.getFloat(index, bg4Var.f));
                        break;
                    case 86:
                        str = str2;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            bg4Var.i = resourceId2;
                            yf4Var.b(89, resourceId2);
                            if (bg4Var.i != -1) {
                                yf4Var.b(88, -2);
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            bg4Var.h = string;
                            yf4Var.c(90, string);
                            if (bg4Var.h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                bg4Var.i = resourceId3;
                                yf4Var.b(89, resourceId3);
                                yf4Var.b(88, -2);
                            } else {
                                yf4Var.b(88, -1);
                            }
                        } else {
                            yf4Var.b(88, typedArrayObtainStyledAttributes.getInteger(index, bg4Var.i));
                        }
                        break;
                    case 87:
                        str = str2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        str = str2;
                        yf4Var.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ag4Var.L));
                        break;
                    case 94:
                        str = str2;
                        yf4Var.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ag4Var.S));
                        break;
                    case 95:
                        str = str2;
                        j(yf4Var, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        str = str2;
                        j(yf4Var, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str = str2;
                        yf4Var.b(97, typedArrayObtainStyledAttributes.getInt(index, ag4Var.o0));
                        break;
                    case 98:
                        str = str2;
                        int i6 = l1b.s;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            zf4Var.a = typedArrayObtainStyledAttributes.getResourceId(index, zf4Var.a);
                        }
                        break;
                    case 99:
                        str = str2;
                        yf4Var.d(99, typedArrayObtainStyledAttributes.getBoolean(index, ag4Var.g));
                        break;
                }
                i2 = i4 + 1;
                indexCount = i3;
                str2 = str;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        bg4Var.getClass();
                        ag4Var.getClass();
                        dg4Var.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        ag4Var.p = i(typedArrayObtainStyledAttributes, index2, ag4Var.p);
                        continue;
                        i7++;
                        break;
                    case 2:
                        i = indexCount2;
                        ag4Var.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ag4Var.I);
                        continue;
                        i7++;
                        break;
                    case 3:
                        i = indexCount2;
                        ag4Var.o = i(typedArrayObtainStyledAttributes, index2, ag4Var.o);
                        continue;
                        i7++;
                        break;
                    case 4:
                        i = indexCount2;
                        ag4Var.n = i(typedArrayObtainStyledAttributes, index2, ag4Var.n);
                        continue;
                        i7++;
                        break;
                    case 5:
                        i = indexCount2;
                        ag4Var.y = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i7++;
                        break;
                    case 6:
                        i = indexCount2;
                        ag4Var.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, ag4Var.C);
                        continue;
                        i7++;
                        break;
                    case 7:
                        i = indexCount2;
                        ag4Var.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, ag4Var.D);
                        continue;
                        i7++;
                        break;
                    case 8:
                        i = indexCount2;
                        ag4Var.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ag4Var.J);
                        continue;
                        i7++;
                        break;
                    case 9:
                        i = indexCount2;
                        ag4Var.v = i(typedArrayObtainStyledAttributes, index2, ag4Var.v);
                        continue;
                        i7++;
                        break;
                    case 10:
                        i = indexCount2;
                        ag4Var.u = i(typedArrayObtainStyledAttributes, index2, ag4Var.u);
                        continue;
                        i7++;
                        break;
                    case 11:
                        i = indexCount2;
                        ag4Var.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ag4Var.P);
                        continue;
                        i7++;
                        break;
                    case 12:
                        i = indexCount2;
                        ag4Var.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ag4Var.Q);
                        continue;
                        i7++;
                        break;
                    case 13:
                        i = indexCount2;
                        ag4Var.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ag4Var.M);
                        continue;
                        i7++;
                        break;
                    case 14:
                        i = indexCount2;
                        ag4Var.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ag4Var.O);
                        continue;
                        i7++;
                        break;
                    case 15:
                        i = indexCount2;
                        ag4Var.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ag4Var.R);
                        continue;
                        i7++;
                        break;
                    case 16:
                        i = indexCount2;
                        ag4Var.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ag4Var.N);
                        continue;
                        i7++;
                        break;
                    case 17:
                        i = indexCount2;
                        ag4Var.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, ag4Var.d);
                        continue;
                        i7++;
                        break;
                    case 18:
                        i = indexCount2;
                        ag4Var.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, ag4Var.e);
                        continue;
                        i7++;
                        break;
                    case 19:
                        i = indexCount2;
                        ag4Var.f = typedArrayObtainStyledAttributes.getFloat(index2, ag4Var.f);
                        continue;
                        i7++;
                        break;
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        i = indexCount2;
                        ag4Var.w = typedArrayObtainStyledAttributes.getFloat(index2, ag4Var.w);
                        continue;
                        i7++;
                        break;
                    case 21:
                        i = indexCount2;
                        ag4Var.c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, ag4Var.c);
                        continue;
                        i7++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, cg4Var.a);
                        cg4Var.a = i8;
                        cg4Var.a = iArr[i8];
                        continue;
                        i7++;
                        break;
                    case 23:
                        i = indexCount2;
                        ag4Var.b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, ag4Var.b);
                        continue;
                        i7++;
                        break;
                    case 24:
                        i = indexCount2;
                        ag4Var.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ag4Var.F);
                        continue;
                        i7++;
                        break;
                    case 25:
                        i = indexCount2;
                        ag4Var.h = i(typedArrayObtainStyledAttributes, index2, ag4Var.h);
                        continue;
                        i7++;
                        break;
                    case 26:
                        i = indexCount2;
                        ag4Var.i = i(typedArrayObtainStyledAttributes, index2, ag4Var.i);
                        continue;
                        i7++;
                        break;
                    case 27:
                        i = indexCount2;
                        ag4Var.E = typedArrayObtainStyledAttributes.getInt(index2, ag4Var.E);
                        continue;
                        i7++;
                        break;
                    case 28:
                        i = indexCount2;
                        ag4Var.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ag4Var.G);
                        continue;
                        i7++;
                        break;
                    case 29:
                        i = indexCount2;
                        ag4Var.j = i(typedArrayObtainStyledAttributes, index2, ag4Var.j);
                        continue;
                        i7++;
                        break;
                    case 30:
                        i = indexCount2;
                        ag4Var.k = i(typedArrayObtainStyledAttributes, index2, ag4Var.k);
                        continue;
                        i7++;
                        break;
                    case 31:
                        i = indexCount2;
                        ag4Var.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ag4Var.K);
                        continue;
                        i7++;
                        break;
                    case 32:
                        i = indexCount2;
                        ag4Var.s = i(typedArrayObtainStyledAttributes, index2, ag4Var.s);
                        continue;
                        i7++;
                        break;
                    case 33:
                        i = indexCount2;
                        ag4Var.t = i(typedArrayObtainStyledAttributes, index2, ag4Var.t);
                        continue;
                        i7++;
                        break;
                    case 34:
                        i = indexCount2;
                        ag4Var.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ag4Var.H);
                        continue;
                        i7++;
                        break;
                    case vg8.l /* 35 */:
                        i = indexCount2;
                        ag4Var.m = i(typedArrayObtainStyledAttributes, index2, ag4Var.m);
                        continue;
                        i7++;
                        break;
                    case 36:
                        i = indexCount2;
                        ag4Var.l = i(typedArrayObtainStyledAttributes, index2, ag4Var.l);
                        continue;
                        i7++;
                        break;
                    case LangUtils.HASH_OFFSET /* 37 */:
                        i = indexCount2;
                        ag4Var.x = typedArrayObtainStyledAttributes.getFloat(index2, ag4Var.x);
                        continue;
                        i7++;
                        break;
                    case 38:
                        i = indexCount2;
                        zf4Var.a = typedArrayObtainStyledAttributes.getResourceId(index2, zf4Var.a);
                        continue;
                        i7++;
                        break;
                    case 39:
                        i = indexCount2;
                        ag4Var.U = typedArrayObtainStyledAttributes.getFloat(index2, ag4Var.U);
                        continue;
                        i7++;
                        break;
                    case 40:
                        i = indexCount2;
                        ag4Var.T = typedArrayObtainStyledAttributes.getFloat(index2, ag4Var.T);
                        continue;
                        i7++;
                        break;
                    case 41:
                        i = indexCount2;
                        ag4Var.V = typedArrayObtainStyledAttributes.getInt(index2, ag4Var.V);
                        continue;
                        i7++;
                        break;
                    case 42:
                        i = indexCount2;
                        ag4Var.W = typedArrayObtainStyledAttributes.getInt(index2, ag4Var.W);
                        continue;
                        i7++;
                        break;
                    case 43:
                        i = indexCount2;
                        cg4Var.c = typedArrayObtainStyledAttributes.getFloat(index2, cg4Var.c);
                        continue;
                        i7++;
                        break;
                    case 44:
                        i = indexCount2;
                        dg4Var.l = true;
                        dg4Var.m = typedArrayObtainStyledAttributes.getDimension(index2, dg4Var.m);
                        continue;
                        i7++;
                        break;
                    case 45:
                        i = indexCount2;
                        dg4Var.b = typedArrayObtainStyledAttributes.getFloat(index2, dg4Var.b);
                        continue;
                        i7++;
                        break;
                    case 46:
                        i = indexCount2;
                        dg4Var.c = typedArrayObtainStyledAttributes.getFloat(index2, dg4Var.c);
                        continue;
                        i7++;
                        break;
                    case 47:
                        i = indexCount2;
                        dg4Var.d = typedArrayObtainStyledAttributes.getFloat(index2, dg4Var.d);
                        continue;
                        i7++;
                        break;
                    case 48:
                        i = indexCount2;
                        dg4Var.e = typedArrayObtainStyledAttributes.getFloat(index2, dg4Var.e);
                        continue;
                        i7++;
                        break;
                    case 49:
                        i = indexCount2;
                        dg4Var.f = typedArrayObtainStyledAttributes.getDimension(index2, dg4Var.f);
                        continue;
                        i7++;
                        break;
                    case 50:
                        i = indexCount2;
                        dg4Var.g = typedArrayObtainStyledAttributes.getDimension(index2, dg4Var.g);
                        continue;
                        i7++;
                        break;
                    case 51:
                        i = indexCount2;
                        dg4Var.i = typedArrayObtainStyledAttributes.getDimension(index2, dg4Var.i);
                        continue;
                        i7++;
                        break;
                    case 52:
                        i = indexCount2;
                        dg4Var.j = typedArrayObtainStyledAttributes.getDimension(index2, dg4Var.j);
                        continue;
                        i7++;
                        break;
                    case 53:
                        i = indexCount2;
                        dg4Var.k = typedArrayObtainStyledAttributes.getDimension(index2, dg4Var.k);
                        continue;
                        i7++;
                        break;
                    case 54:
                        i = indexCount2;
                        ag4Var.X = typedArrayObtainStyledAttributes.getInt(index2, ag4Var.X);
                        continue;
                        i7++;
                        break;
                    case 55:
                        i = indexCount2;
                        ag4Var.Y = typedArrayObtainStyledAttributes.getInt(index2, ag4Var.Y);
                        continue;
                        i7++;
                        break;
                    case 56:
                        i = indexCount2;
                        ag4Var.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ag4Var.Z);
                        continue;
                        i7++;
                        break;
                    case 57:
                        i = indexCount2;
                        ag4Var.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ag4Var.a0);
                        continue;
                        i7++;
                        break;
                    case 58:
                        i = indexCount2;
                        ag4Var.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ag4Var.b0);
                        continue;
                        i7++;
                        break;
                    case 59:
                        i = indexCount2;
                        ag4Var.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ag4Var.c0);
                        continue;
                        i7++;
                        break;
                    case 60:
                        i = indexCount2;
                        dg4Var.a = typedArrayObtainStyledAttributes.getFloat(index2, dg4Var.a);
                        continue;
                        i7++;
                        break;
                    case 61:
                        i = indexCount2;
                        ag4Var.z = i(typedArrayObtainStyledAttributes, index2, ag4Var.z);
                        continue;
                        i7++;
                        break;
                    case 62:
                        i = indexCount2;
                        ag4Var.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ag4Var.A);
                        continue;
                        i7++;
                        break;
                    case 63:
                        i = indexCount2;
                        ag4Var.B = typedArrayObtainStyledAttributes.getFloat(index2, ag4Var.B);
                        continue;
                        i7++;
                        break;
                    case 64:
                        i = indexCount2;
                        bg4Var.a = i(typedArrayObtainStyledAttributes, index2, bg4Var.a);
                        continue;
                        i7++;
                        break;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            bg4Var.getClass();
                        } else {
                            String str3 = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            bg4Var.getClass();
                        }
                        i7++;
                        break;
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        bg4Var.getClass();
                        continue;
                        i7++;
                        break;
                    case 67:
                        i = indexCount2;
                        bg4Var.e = typedArrayObtainStyledAttributes.getFloat(index2, bg4Var.e);
                        break;
                    case 68:
                        i = indexCount2;
                        cg4Var.d = typedArrayObtainStyledAttributes.getFloat(index2, cg4Var.d);
                        break;
                    case 69:
                        i = indexCount2;
                        ag4Var.d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        ag4Var.e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        ag4Var.f0 = typedArrayObtainStyledAttributes.getInt(index2, ag4Var.f0);
                        break;
                    case 73:
                        i = indexCount2;
                        ag4Var.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ag4Var.g0);
                        break;
                    case 74:
                        i = indexCount2;
                        ag4Var.j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        ag4Var.n0 = typedArrayObtainStyledAttributes.getBoolean(index2, ag4Var.n0);
                        break;
                    case 76:
                        i = indexCount2;
                        bg4Var.c = typedArrayObtainStyledAttributes.getInt(index2, bg4Var.c);
                        break;
                    case 77:
                        i = indexCount2;
                        ag4Var.k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        cg4Var.b = typedArrayObtainStyledAttributes.getInt(index2, cg4Var.b);
                        break;
                    case 79:
                        i = indexCount2;
                        bg4Var.d = typedArrayObtainStyledAttributes.getFloat(index2, bg4Var.d);
                        break;
                    case 80:
                        i = indexCount2;
                        ag4Var.l0 = typedArrayObtainStyledAttributes.getBoolean(index2, ag4Var.l0);
                        break;
                    case 81:
                        i = indexCount2;
                        ag4Var.m0 = typedArrayObtainStyledAttributes.getBoolean(index2, ag4Var.m0);
                        break;
                    case 82:
                        i = indexCount2;
                        bg4Var.b = typedArrayObtainStyledAttributes.getInteger(index2, bg4Var.b);
                        break;
                    case 83:
                        i = indexCount2;
                        dg4Var.h = i(typedArrayObtainStyledAttributes, index2, dg4Var.h);
                        break;
                    case 84:
                        i = indexCount2;
                        bg4Var.g = typedArrayObtainStyledAttributes.getInteger(index2, bg4Var.g);
                        break;
                    case 85:
                        i = indexCount2;
                        bg4Var.f = typedArrayObtainStyledAttributes.getFloat(index2, bg4Var.f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            bg4Var.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            bg4Var.h = string2;
                            if (string2.indexOf("/") > 0) {
                                bg4Var.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, bg4Var.i);
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        i = indexCount2;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 91:
                        i = indexCount2;
                        ag4Var.q = i(typedArrayObtainStyledAttributes, index2, ag4Var.q);
                        break;
                    case 92:
                        i = indexCount2;
                        ag4Var.r = i(typedArrayObtainStyledAttributes, index2, ag4Var.r);
                        break;
                    case 93:
                        i = indexCount2;
                        ag4Var.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ag4Var.L);
                        break;
                    case 94:
                        i = indexCount2;
                        ag4Var.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ag4Var.S);
                        break;
                    case 95:
                        i = indexCount2;
                        j(ag4Var, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i7++;
                        break;
                    case 96:
                        i = indexCount2;
                        j(ag4Var, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        ag4Var.o0 = typedArrayObtainStyledAttributes.getInt(index2, ag4Var.o0);
                        break;
                }
                i7++;
            }
            if (ag4Var.j0 != null) {
                ag4Var.i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return zf4Var;
    }

    public static int i(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    public static void j(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        yf4 yf4Var;
        ag4 ag4Var;
        uf4 uf4Var;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i4 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof uf4) {
                    uf4Var = (uf4) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) uf4Var).width = i4;
                        uf4Var.W = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) uf4Var).height = i4;
                        uf4Var.X = z;
                        return;
                    }
                }
                if (obj instanceof ag4) {
                    ag4Var = (ag4) obj;
                    if (i2 == 0) {
                        ag4Var.b = i4;
                        ag4Var.l0 = z;
                        return;
                    } else {
                        ag4Var.c = i4;
                        ag4Var.m0 = z;
                        return;
                    }
                }
                if (obj instanceof yf4) {
                    yf4Var = (yf4) obj;
                    if (i2 == 0) {
                        yf4Var.b(23, i4);
                        yf4Var.d(80, z);
                        return;
                    } else {
                        yf4Var.b(21, i4);
                        yf4Var.d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z = false;
            i4 = dimensionPixelSize;
            if (obj instanceof uf4) {
                uf4Var = (uf4) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) uf4Var).width = i4;
                    uf4Var.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) uf4Var).height = i4;
                    uf4Var.X = z;
                    return;
                }
            }
            if (obj instanceof ag4) {
                ag4Var = (ag4) obj;
                if (i2 == 0) {
                    ag4Var.b = i4;
                    ag4Var.l0 = z;
                    return;
                } else {
                    ag4Var.c = i4;
                    ag4Var.m0 = z;
                    return;
                }
            }
            if (obj instanceof yf4) {
                yf4Var = (yf4) obj;
                if (i2 == 0) {
                    yf4Var.b(23, i4);
                    yf4Var.d(80, z);
                    return;
                } else {
                    yf4Var.b(21, i4);
                    yf4Var.d(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof uf4) {
                    uf4 uf4Var2 = (uf4) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) uf4Var2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) uf4Var2).height = 0;
                    }
                    k(uf4Var2, strTrim2);
                    return;
                }
                if (obj instanceof ag4) {
                    ((ag4) obj).y = strTrim2;
                    return;
                } else {
                    if (obj instanceof yf4) {
                        ((yf4) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f2 = Float.parseFloat(strTrim2);
                    if (obj instanceof uf4) {
                        uf4 uf4Var3 = (uf4) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) uf4Var3).width = 0;
                            uf4Var3.H = f2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) uf4Var3).height = 0;
                            uf4Var3.I = f2;
                            return;
                        }
                    }
                    if (obj instanceof ag4) {
                        ag4 ag4Var2 = (ag4) obj;
                        if (i2 == 0) {
                            ag4Var2.b = 0;
                            ag4Var2.U = f2;
                            return;
                        } else {
                            ag4Var2.c = 0;
                            ag4Var2.T = f2;
                            return;
                        }
                    }
                    if (obj instanceof yf4) {
                        yf4 yf4Var2 = (yf4) obj;
                        if (i2 == 0) {
                            yf4Var2.b(23, 0);
                            yf4Var2.a(39, f2);
                            return;
                        } else {
                            yf4Var2.b(21, 0);
                            yf4Var2.a(40, f2);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof uf4) {
                        uf4 uf4Var4 = (uf4) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) uf4Var4).width = 0;
                            uf4Var4.R = fMax;
                            uf4Var4.L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) uf4Var4).height = 0;
                            uf4Var4.S = fMax;
                            uf4Var4.M = 2;
                            return;
                        }
                    }
                    if (obj instanceof ag4) {
                        ag4 ag4Var3 = (ag4) obj;
                        if (i2 == 0) {
                            ag4Var3.b = 0;
                            ag4Var3.d0 = fMax;
                            ag4Var3.X = 2;
                            return;
                        } else {
                            ag4Var3.c = 0;
                            ag4Var3.e0 = fMax;
                            ag4Var3.Y = 2;
                            return;
                        }
                    }
                    if (obj instanceof yf4) {
                        yf4 yf4Var3 = (yf4) obj;
                        if (i2 == 0) {
                            yf4Var3.b(23, 0);
                            yf4Var3.b(54, 2);
                        } else {
                            yf4Var3.b(21, 0);
                            yf4Var3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void k(uf4 uf4Var, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f2 = Float.parseFloat(strSubstring3);
                        float f3 = Float.parseFloat(strSubstring4);
                        if (f2 > 0.0f && f3 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(f3 / f2);
                            } else {
                                Math.abs(f2 / f3);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        uf4Var.G = str;
    }

    public static String l(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public final void a(wf4 wf4Var) {
        b(wf4Var);
        wf4Var.setConstraintSet(null);
        wf4Var.requestLayout();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void b(wf4 wf4Var) {
        HashSet hashSet;
        int i;
        HashMap map;
        eg4 eg4Var = this;
        int childCount = wf4Var.getChildCount();
        HashMap map2 = eg4Var.c;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = wf4Var.getChildAt(i2);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + kql.B(childAt));
            } else {
                if (eg4Var.b && id == -1) {
                    ore.q("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        zf4 zf4Var = (zf4) map2.get(Integer.valueOf(id));
                        if (zf4Var != null) {
                            cg4 cg4Var = zf4Var.b;
                            ag4 ag4Var = zf4Var.d;
                            dg4 dg4Var = zf4Var.e;
                            if (childAt instanceof sp0) {
                                ag4Var.h0 = 1;
                                sp0 sp0Var = (sp0) childAt;
                                sp0Var.setId(id);
                                sp0Var.setType(ag4Var.f0);
                                sp0Var.setMargin(ag4Var.g0);
                                sp0Var.setAllowsGoneWidget(ag4Var.n0);
                                int[] iArr = ag4Var.i0;
                                if (iArr != null) {
                                    sp0Var.setReferencedIds(iArr);
                                } else {
                                    String str = ag4Var.j0;
                                    if (str != null) {
                                        int[] iArrE = e(sp0Var, str);
                                        ag4Var.i0 = iArrE;
                                        sp0Var.setReferencedIds(iArrE);
                                    }
                                }
                            }
                            uf4 uf4Var = (uf4) childAt.getLayoutParams();
                            uf4Var.a();
                            zf4Var.a(uf4Var);
                            HashMap map3 = zf4Var.f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                pf4 pf4Var = (pf4) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strK = !pf4Var.a ? qv1.k("set", str2) : str2;
                                int i3 = i2;
                                try {
                                    int iD = qt4.D(pf4Var.b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iD) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strK, cls3).invoke(childAt, Integer.valueOf(pf4Var.c));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strK, cls2).invoke(childAt, Float.valueOf(pf4Var.d));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strK, cls3).invoke(childAt, Integer.valueOf(pf4Var.g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strK, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(pf4Var.g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                StringBuilder sbV = qt4.v(" Custom Attribute \"", str2, "\" not found on ");
                                                sbV.append(cls.getName());
                                                Log.e("TransitionLayout", sbV.toString());
                                                e.printStackTrace();
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strK);
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                StringBuilder sbV2 = qt4.v(" Custom Attribute \"", str2, "\" not found on ");
                                                sbV2.append(cls.getName());
                                                Log.e("TransitionLayout", sbV2.toString());
                                                e.printStackTrace();
                                            }
                                            break;
                                        case 4:
                                            cls.getMethod(strK, CharSequence.class).invoke(childAt, pf4Var.e);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(strK, Boolean.TYPE).invoke(childAt, Boolean.valueOf(pf4Var.f));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(strK, cls2).invoke(childAt, Float.valueOf(pf4Var.d));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(strK, cls3).invoke(childAt, Integer.valueOf(pf4Var.c));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    map = map3;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    map = map3;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i2 = i3;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i = i2;
                            childAt.setLayoutParams(uf4Var);
                            if (cg4Var.b == 0) {
                                childAt.setVisibility(cg4Var.a);
                            }
                            childAt.setAlpha(cg4Var.c);
                            childAt.setRotation(dg4Var.a);
                            childAt.setRotationX(dg4Var.b);
                            childAt.setRotationY(dg4Var.c);
                            childAt.setScaleX(dg4Var.d);
                            childAt.setScaleY(dg4Var.e);
                            if (dg4Var.h != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(dg4Var.h);
                                if (viewFindViewById != null) {
                                    float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                    float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left = right - childAt.getLeft();
                                        float top = bottom - childAt.getTop();
                                        childAt.setPivotX(left);
                                        childAt.setPivotY(top);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(dg4Var.f)) {
                                    childAt.setPivotX(dg4Var.f);
                                }
                                if (!Float.isNaN(dg4Var.g)) {
                                    childAt.setPivotY(dg4Var.g);
                                }
                            }
                            childAt.setTranslationX(dg4Var.i);
                            childAt.setTranslationY(dg4Var.j);
                            childAt.setTranslationZ(dg4Var.k);
                            if (dg4Var.l) {
                                childAt.setElevation(dg4Var.m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i2;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i2 = i + 1;
                eg4Var = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i2;
            i2 = i + 1;
            eg4Var = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            zf4 zf4Var2 = (zf4) map2.get(num);
            if (zf4Var2 != null) {
                ag4 ag4Var2 = zf4Var2.d;
                if (ag4Var2.h0 == 1) {
                    Context context = wf4Var.getContext();
                    sp0 sp0Var2 = new sp0(context);
                    sp0Var2.a = new int[32];
                    sp0Var2.g = new HashMap();
                    sp0Var2.c = context;
                    tp0 tp0Var = new tp0();
                    tp0Var.p0 = new hg4[4];
                    tp0Var.q0 = 0;
                    tp0Var.r0 = 0;
                    tp0Var.s0 = true;
                    tp0Var.t0 = 0;
                    tp0Var.u0 = false;
                    sp0Var2.j = tp0Var;
                    sp0Var2.d = tp0Var;
                    sp0Var2.e();
                    sp0Var2.setVisibility(8);
                    sp0Var2.setId(num.intValue());
                    int[] iArr2 = ag4Var2.i0;
                    if (iArr2 != null) {
                        sp0Var2.setReferencedIds(iArr2);
                    } else {
                        String str3 = ag4Var2.j0;
                        if (str3 != null) {
                            int[] iArrE2 = e(sp0Var2, str3);
                            ag4Var2.i0 = iArrE2;
                            sp0Var2.setReferencedIds(iArrE2);
                        }
                    }
                    sp0Var2.setType(ag4Var2.f0);
                    sp0Var2.setMargin(ag4Var2.g0);
                    g0g g0gVar = wf4.r;
                    uf4 uf4Var2 = new uf4(-2, -2);
                    sp0Var2.e();
                    zf4Var2.a(uf4Var2);
                    wf4Var.addView(sp0Var2, uf4Var2);
                }
                if (ag4Var2.a) {
                    View guideline = new Guideline(wf4Var.getContext());
                    guideline.setId(num.intValue());
                    g0g g0gVar2 = wf4.r;
                    uf4 uf4Var3 = new uf4(-2, -2);
                    zf4Var2.a(uf4Var3);
                    wf4Var.addView(guideline, uf4Var3);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            wf4Var.getChildAt(i4);
        }
    }

    public final void c(wf4 wf4Var) {
        int i;
        HashMap map;
        HashMap map2;
        eg4 eg4Var = this;
        int childCount = wf4Var.getChildCount();
        HashMap map3 = eg4Var.c;
        map3.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = wf4Var.getChildAt(i2);
            uf4 uf4Var = (uf4) childAt.getLayoutParams();
            int id = childAt.getId();
            if (eg4Var.b && id == -1) {
                ore.q("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map3.containsKey(Integer.valueOf(id))) {
                map3.put(Integer.valueOf(id), new zf4());
            }
            zf4 zf4Var = (zf4) map3.get(Integer.valueOf(id));
            if (zf4Var == null) {
                i = childCount;
                map = map3;
            } else {
                cg4 cg4Var = zf4Var.b;
                ag4 ag4Var = zf4Var.d;
                dg4 dg4Var = zf4Var.e;
                HashMap map4 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap map5 = eg4Var.a;
                for (String str : map5.keySet()) {
                    pf4 pf4Var = (pf4) map5.get(str);
                    int i3 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map4.put(str, new pf4(pf4Var, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e3) {
                                e = e3;
                                e.printStackTrace();
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                e.printStackTrace();
                            }
                        } else {
                            map2 = map3;
                            map4.put(str, new pf4(pf4Var, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e5) {
                        e = e5;
                        map2 = map3;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        map2 = map3;
                    } catch (InvocationTargetException e7) {
                        e = e7;
                        map2 = map3;
                    }
                    childCount = i3;
                    map3 = map2;
                }
                i = childCount;
                map = map3;
                zf4Var.f = map4;
                zf4Var.a = id;
                ag4Var.h = uf4Var.e;
                ag4Var.i = uf4Var.f;
                ag4Var.j = uf4Var.g;
                ag4Var.k = uf4Var.h;
                ag4Var.l = uf4Var.i;
                ag4Var.m = uf4Var.j;
                ag4Var.n = uf4Var.k;
                ag4Var.o = uf4Var.l;
                ag4Var.p = uf4Var.m;
                ag4Var.q = uf4Var.n;
                ag4Var.r = uf4Var.o;
                ag4Var.s = uf4Var.s;
                ag4Var.t = uf4Var.t;
                ag4Var.u = uf4Var.u;
                ag4Var.v = uf4Var.v;
                ag4Var.w = uf4Var.E;
                ag4Var.x = uf4Var.F;
                ag4Var.y = uf4Var.G;
                ag4Var.z = uf4Var.p;
                ag4Var.A = uf4Var.q;
                ag4Var.B = uf4Var.r;
                ag4Var.C = uf4Var.T;
                ag4Var.D = uf4Var.U;
                ag4Var.E = uf4Var.V;
                ag4Var.f = uf4Var.c;
                ag4Var.d = uf4Var.a;
                ag4Var.e = uf4Var.b;
                ag4Var.b = ((ViewGroup.MarginLayoutParams) uf4Var).width;
                ag4Var.c = ((ViewGroup.MarginLayoutParams) uf4Var).height;
                ag4Var.F = ((ViewGroup.MarginLayoutParams) uf4Var).leftMargin;
                ag4Var.G = ((ViewGroup.MarginLayoutParams) uf4Var).rightMargin;
                ag4Var.H = ((ViewGroup.MarginLayoutParams) uf4Var).topMargin;
                ag4Var.I = ((ViewGroup.MarginLayoutParams) uf4Var).bottomMargin;
                ag4Var.L = uf4Var.D;
                ag4Var.T = uf4Var.I;
                ag4Var.U = uf4Var.H;
                ag4Var.W = uf4Var.K;
                ag4Var.V = uf4Var.J;
                ag4Var.l0 = uf4Var.W;
                ag4Var.m0 = uf4Var.X;
                ag4Var.X = uf4Var.L;
                ag4Var.Y = uf4Var.M;
                ag4Var.Z = uf4Var.P;
                ag4Var.a0 = uf4Var.Q;
                ag4Var.b0 = uf4Var.N;
                ag4Var.c0 = uf4Var.O;
                ag4Var.d0 = uf4Var.R;
                ag4Var.e0 = uf4Var.S;
                ag4Var.k0 = uf4Var.Y;
                ag4Var.N = uf4Var.x;
                ag4Var.P = uf4Var.z;
                ag4Var.M = uf4Var.w;
                ag4Var.O = uf4Var.y;
                ag4Var.R = uf4Var.A;
                ag4Var.Q = uf4Var.B;
                ag4Var.S = uf4Var.C;
                ag4Var.o0 = uf4Var.Z;
                ag4Var.J = uf4Var.getMarginEnd();
                ag4Var.K = uf4Var.getMarginStart();
                cg4Var.a = childAt.getVisibility();
                cg4Var.c = childAt.getAlpha();
                dg4Var.a = childAt.getRotation();
                dg4Var.b = childAt.getRotationX();
                dg4Var.c = childAt.getRotationY();
                dg4Var.d = childAt.getScaleX();
                dg4Var.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    dg4Var.f = pivotX;
                    dg4Var.g = pivotY;
                }
                dg4Var.i = childAt.getTranslationX();
                dg4Var.j = childAt.getTranslationY();
                dg4Var.k = childAt.getTranslationZ();
                if (dg4Var.l) {
                    dg4Var.m = childAt.getElevation();
                }
                if (childAt instanceof sp0) {
                    sp0 sp0Var = (sp0) childAt;
                    ag4Var.n0 = sp0Var.getAllowsGoneWidget();
                    ag4Var.i0 = sp0Var.getReferencedIds();
                    ag4Var.f0 = sp0Var.getType();
                    ag4Var.g0 = sp0Var.getMargin();
                }
            }
            i2++;
            eg4Var = this;
            childCount = i;
            map3 = map;
        }
    }

    public final void d(int i, int i2, int i3, int i4) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.c;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), new zf4());
        }
        zf4 zf4Var = (zf4) map.get(Integer.valueOf(i));
        if (zf4Var == null) {
            return;
        }
        ag4 ag4Var = zf4Var.d;
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    ag4Var.h = i3;
                    ag4Var.i = -1;
                    return;
                } else if (i4 != 2) {
                    c.f(l(i4), " undefined", "left to ");
                    return;
                } else {
                    ag4Var.i = i3;
                    ag4Var.h = -1;
                    return;
                }
            case 2:
                if (i4 == 1) {
                    ag4Var.j = i3;
                    ag4Var.k = -1;
                    return;
                } else if (i4 != 2) {
                    c.f(l(i4), " undefined", "right to ");
                    return;
                } else {
                    ag4Var.k = i3;
                    ag4Var.j = -1;
                    return;
                }
            case 3:
                if (i4 == 3) {
                    ag4Var.l = i3;
                    ag4Var.m = -1;
                    ag4Var.p = -1;
                    ag4Var.q = -1;
                    ag4Var.r = -1;
                    return;
                }
                if (i4 != 4) {
                    c.f(l(i4), " undefined", "right to ");
                    return;
                }
                ag4Var.m = i3;
                ag4Var.l = -1;
                ag4Var.p = -1;
                ag4Var.q = -1;
                ag4Var.r = -1;
                return;
            case 4:
                if (i4 == 4) {
                    ag4Var.o = i3;
                    ag4Var.n = -1;
                    ag4Var.p = -1;
                    ag4Var.q = -1;
                    ag4Var.r = -1;
                    return;
                }
                if (i4 != 3) {
                    c.f(l(i4), " undefined", "right to ");
                    return;
                }
                ag4Var.n = i3;
                ag4Var.o = -1;
                ag4Var.p = -1;
                ag4Var.q = -1;
                ag4Var.r = -1;
                return;
            case 5:
                if (i4 == 5) {
                    ag4Var.p = i3;
                    ag4Var.o = -1;
                    ag4Var.n = -1;
                    ag4Var.l = -1;
                    ag4Var.m = -1;
                    return;
                }
                if (i4 == 3) {
                    ag4Var.q = i3;
                    ag4Var.o = -1;
                    ag4Var.n = -1;
                    ag4Var.l = -1;
                    ag4Var.m = -1;
                    return;
                }
                if (i4 != 4) {
                    c.f(l(i4), " undefined", "right to ");
                    return;
                }
                ag4Var.r = i3;
                ag4Var.o = -1;
                ag4Var.n = -1;
                ag4Var.l = -1;
                ag4Var.m = -1;
                return;
            case 6:
                if (i4 == 6) {
                    ag4Var.t = i3;
                    ag4Var.s = -1;
                    return;
                } else if (i4 != 7) {
                    c.f(l(i4), " undefined", "right to ");
                    return;
                } else {
                    ag4Var.s = i3;
                    ag4Var.t = -1;
                    return;
                }
            case 7:
                if (i4 == 7) {
                    ag4Var.v = i3;
                    ag4Var.u = -1;
                    return;
                } else if (i4 != 6) {
                    c.f(l(i4), " undefined", "right to ");
                    return;
                } else {
                    ag4Var.u = i3;
                    ag4Var.v = -1;
                    return;
                }
            default:
                throw new IllegalArgumentException(l(i2) + " to " + l(i4) + " unknown");
        }
    }

    public final zf4 g(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.c;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), new zf4());
        }
        return (zf4) map.get(Integer.valueOf(i));
    }

    public final void h(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    zf4 zf4VarF = f(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        zf4VarF.d.a = true;
                    }
                    this.c.put(Integer.valueOf(zf4VarF.a), zf4VarF);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
