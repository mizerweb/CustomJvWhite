package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.http.HttpHost;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vsk {
    public static String a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(cCharAt));
            } else if (Character.isUpperCase(cCharAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(cCharAt));
            } else {
                stringBuffer.append(cCharAt);
            }
        }
        return stringBuffer.toString();
    }

    public static final int b(String str) {
        int iV0 = r5h.V0(str, "\nDALVIK THREADS", 0, false, 6);
        if (iV0 < 0) {
            return -1;
        }
        int iV1 = r5h.V0(str, "\n\"main\"", iV0, false, 4);
        if (iV1 >= 0) {
            return r5h.V0(str, "\n\n\"", iV1 + 1, false, 4) + 2;
        }
        int iV2 = r5h.V0(str, "\n", iV0 + 1, false, 4);
        if (iV2 < 0) {
            return -1;
        }
        return iV2 + 1;
    }

    public static String c(sia siaVar) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            d(null, siaVar, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            return "Error printing proto: " + e.getMessage();
        } catch (InvocationTargetException e2) {
            return "Error printing proto: " + e2.getMessage();
        }
    }

    public static void d(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException {
        if (obj == null) {
            return;
        }
        int i = 0;
        if (obj instanceof sia) {
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(a(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            Class<?> cls = obj.getClass();
            for (Field field : cls.getFields()) {
                int modifiers = field.getModifiers();
                String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                    Class<?> type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray()) {
                        d(name, obj2, stringBuffer, stringBuffer2);
                    } else if (type.getComponentType() == Byte.TYPE) {
                        d(name, obj2, stringBuffer, stringBuffer2);
                    } else {
                        int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                        for (int i2 = 0; i2 < length2; i2++) {
                            d(name, Array.get(obj2, i2), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            Method[] methods = cls.getMethods();
            int length3 = methods.length;
            while (i < length3) {
                String name2 = methods[i].getName();
                if (name2.startsWith("set")) {
                    String strSubstring = name2.substring(3);
                    try {
                        if (((Boolean) cls.getMethod("has" + strSubstring, null).invoke(obj, null)).booleanValue()) {
                            d(strSubstring, cls.getMethod("get" + strSubstring, null).invoke(obj, null), stringBuffer, stringBuffer2);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
                i++;
            }
            if (str != null) {
                stringBuffer.setLength(length);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
                return;
            }
            return;
        }
        if (obj instanceof Map) {
            String strA = a(str);
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(strA);
                stringBuffer2.append(" <\n");
                int length4 = stringBuffer.length();
                stringBuffer.append("  ");
                d("key", entry.getKey(), stringBuffer, stringBuffer2);
                d(SdkMetricStatEvent.VALUE_KEY, entry.getValue(), stringBuffer, stringBuffer2);
                stringBuffer.setLength(length4);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
            }
            return;
        }
        String strA2 = a(str);
        stringBuffer2.append(stringBuffer);
        stringBuffer2.append(strA2);
        stringBuffer2.append(": ");
        if (obj instanceof String) {
            String strConcat = (String) obj;
            if (!strConcat.startsWith(HttpHost.DEFAULT_SCHEME_NAME) && strConcat.length() > 200) {
                strConcat = strConcat.substring(0, 200).concat("[...]");
            }
            int length5 = strConcat.length();
            StringBuilder sb = new StringBuilder(length5);
            while (i < length5) {
                char cCharAt = strConcat.charAt(i);
                if (cCharAt < ' ' || cCharAt > '~' || cCharAt == '\"' || cCharAt == '\'') {
                    sb.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                } else {
                    sb.append(cCharAt);
                }
                i++;
            }
            String string = sb.toString();
            stringBuffer2.append("\"");
            stringBuffer2.append(string);
            stringBuffer2.append("\"");
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            stringBuffer2.append('\"');
            while (i < bArr.length) {
                int i3 = bArr[i] & 255;
                if (i3 == 92 || i3 == 34) {
                    stringBuffer2.append('\\');
                    stringBuffer2.append((char) i3);
                } else if (i3 < 32 || i3 >= 127) {
                    stringBuffer2.append(String.format("\\%03o", Integer.valueOf(i3)));
                } else {
                    stringBuffer2.append((char) i3);
                }
                i++;
            }
            stringBuffer2.append('\"');
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append("\n");
    }
}
