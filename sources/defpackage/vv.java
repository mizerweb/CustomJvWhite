package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class vv implements l8e {
    public static final Object d = new Object();
    public final String a;
    public final Class b;
    public final Object c;

    public vv(Class cls, Object obj, String str) {
        this.a = str;
        this.b = cls;
        this.c = obj;
    }

    @Override // defpackage.l8e
    public final /* bridge */ /* synthetic */ void B(Object obj, zv8 zv8Var, Object obj2) {
        b((Widget) obj, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01da A[Catch: all -> 0x0229, TryCatch #0 {all -> 0x0229, blocks: (B:8:0x001c, B:10:0x0024, B:12:0x002c, B:15:0x0034, B:17:0x003a, B:19:0x0040, B:22:0x0048, B:24:0x0050, B:26:0x0058, B:29:0x0060, B:31:0x0068, B:33:0x0070, B:36:0x0078, B:38:0x0080, B:40:0x0088, B:43:0x0090, B:45:0x0098, B:47:0x00a0, B:50:0x00a8, B:52:0x00b4, B:54:0x00ba, B:55:0x00cd, B:57:0x00d3, B:59:0x00e7, B:60:0x00eb, B:61:0x00f1, B:63:0x00f9, B:65:0x00ff, B:66:0x0112, B:68:0x0118, B:70:0x012c, B:71:0x0130, B:72:0x0136, B:74:0x013e, B:76:0x0144, B:77:0x015d, B:79:0x0163, B:80:0x0175, B:82:0x0180, B:84:0x0188, B:86:0x018e, B:88:0x0198, B:89:0x01a8, B:90:0x01b1, B:92:0x01b9, B:94:0x01c3, B:96:0x01c7, B:98:0x01cb, B:103:0x01d5, B:104:0x01da, B:106:0x01e0, B:107:0x01e9, B:109:0x01ef, B:110:0x01f8, B:112:0x01fe, B:113:0x0207, B:115:0x020d, B:116:0x0216, B:117:0x021b, B:119:0x0221), top: B:125:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01e0 A[Catch: all -> 0x0229, TryCatch #0 {all -> 0x0229, blocks: (B:8:0x001c, B:10:0x0024, B:12:0x002c, B:15:0x0034, B:17:0x003a, B:19:0x0040, B:22:0x0048, B:24:0x0050, B:26:0x0058, B:29:0x0060, B:31:0x0068, B:33:0x0070, B:36:0x0078, B:38:0x0080, B:40:0x0088, B:43:0x0090, B:45:0x0098, B:47:0x00a0, B:50:0x00a8, B:52:0x00b4, B:54:0x00ba, B:55:0x00cd, B:57:0x00d3, B:59:0x00e7, B:60:0x00eb, B:61:0x00f1, B:63:0x00f9, B:65:0x00ff, B:66:0x0112, B:68:0x0118, B:70:0x012c, B:71:0x0130, B:72:0x0136, B:74:0x013e, B:76:0x0144, B:77:0x015d, B:79:0x0163, B:80:0x0175, B:82:0x0180, B:84:0x0188, B:86:0x018e, B:88:0x0198, B:89:0x01a8, B:90:0x01b1, B:92:0x01b9, B:94:0x01c3, B:96:0x01c7, B:98:0x01cb, B:103:0x01d5, B:104:0x01da, B:106:0x01e0, B:107:0x01e9, B:109:0x01ef, B:110:0x01f8, B:112:0x01fe, B:113:0x0207, B:115:0x020d, B:116:0x0216, B:117:0x021b, B:119:0x0221), top: B:125:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01e9 A[Catch: all -> 0x0229, TryCatch #0 {all -> 0x0229, blocks: (B:8:0x001c, B:10:0x0024, B:12:0x002c, B:15:0x0034, B:17:0x003a, B:19:0x0040, B:22:0x0048, B:24:0x0050, B:26:0x0058, B:29:0x0060, B:31:0x0068, B:33:0x0070, B:36:0x0078, B:38:0x0080, B:40:0x0088, B:43:0x0090, B:45:0x0098, B:47:0x00a0, B:50:0x00a8, B:52:0x00b4, B:54:0x00ba, B:55:0x00cd, B:57:0x00d3, B:59:0x00e7, B:60:0x00eb, B:61:0x00f1, B:63:0x00f9, B:65:0x00ff, B:66:0x0112, B:68:0x0118, B:70:0x012c, B:71:0x0130, B:72:0x0136, B:74:0x013e, B:76:0x0144, B:77:0x015d, B:79:0x0163, B:80:0x0175, B:82:0x0180, B:84:0x0188, B:86:0x018e, B:88:0x0198, B:89:0x01a8, B:90:0x01b1, B:92:0x01b9, B:94:0x01c3, B:96:0x01c7, B:98:0x01cb, B:103:0x01d5, B:104:0x01da, B:106:0x01e0, B:107:0x01e9, B:109:0x01ef, B:110:0x01f8, B:112:0x01fe, B:113:0x0207, B:115:0x020d, B:116:0x0216, B:117:0x021b, B:119:0x0221), top: B:125:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01ef A[Catch: all -> 0x0229, TryCatch #0 {all -> 0x0229, blocks: (B:8:0x001c, B:10:0x0024, B:12:0x002c, B:15:0x0034, B:17:0x003a, B:19:0x0040, B:22:0x0048, B:24:0x0050, B:26:0x0058, B:29:0x0060, B:31:0x0068, B:33:0x0070, B:36:0x0078, B:38:0x0080, B:40:0x0088, B:43:0x0090, B:45:0x0098, B:47:0x00a0, B:50:0x00a8, B:52:0x00b4, B:54:0x00ba, B:55:0x00cd, B:57:0x00d3, B:59:0x00e7, B:60:0x00eb, B:61:0x00f1, B:63:0x00f9, B:65:0x00ff, B:66:0x0112, B:68:0x0118, B:70:0x012c, B:71:0x0130, B:72:0x0136, B:74:0x013e, B:76:0x0144, B:77:0x015d, B:79:0x0163, B:80:0x0175, B:82:0x0180, B:84:0x0188, B:86:0x018e, B:88:0x0198, B:89:0x01a8, B:90:0x01b1, B:92:0x01b9, B:94:0x01c3, B:96:0x01c7, B:98:0x01cb, B:103:0x01d5, B:104:0x01da, B:106:0x01e0, B:107:0x01e9, B:109:0x01ef, B:110:0x01f8, B:112:0x01fe, B:113:0x0207, B:115:0x020d, B:116:0x0216, B:117:0x021b, B:119:0x0221), top: B:125:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01f8 A[Catch: all -> 0x0229, TryCatch #0 {all -> 0x0229, blocks: (B:8:0x001c, B:10:0x0024, B:12:0x002c, B:15:0x0034, B:17:0x003a, B:19:0x0040, B:22:0x0048, B:24:0x0050, B:26:0x0058, B:29:0x0060, B:31:0x0068, B:33:0x0070, B:36:0x0078, B:38:0x0080, B:40:0x0088, B:43:0x0090, B:45:0x0098, B:47:0x00a0, B:50:0x00a8, B:52:0x00b4, B:54:0x00ba, B:55:0x00cd, B:57:0x00d3, B:59:0x00e7, B:60:0x00eb, B:61:0x00f1, B:63:0x00f9, B:65:0x00ff, B:66:0x0112, B:68:0x0118, B:70:0x012c, B:71:0x0130, B:72:0x0136, B:74:0x013e, B:76:0x0144, B:77:0x015d, B:79:0x0163, B:80:0x0175, B:82:0x0180, B:84:0x0188, B:86:0x018e, B:88:0x0198, B:89:0x01a8, B:90:0x01b1, B:92:0x01b9, B:94:0x01c3, B:96:0x01c7, B:98:0x01cb, B:103:0x01d5, B:104:0x01da, B:106:0x01e0, B:107:0x01e9, B:109:0x01ef, B:110:0x01f8, B:112:0x01fe, B:113:0x0207, B:115:0x020d, B:116:0x0216, B:117:0x021b, B:119:0x0221), top: B:125:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01fe A[Catch: all -> 0x0229, TryCatch #0 {all -> 0x0229, blocks: (B:8:0x001c, B:10:0x0024, B:12:0x002c, B:15:0x0034, B:17:0x003a, B:19:0x0040, B:22:0x0048, B:24:0x0050, B:26:0x0058, B:29:0x0060, B:31:0x0068, B:33:0x0070, B:36:0x0078, B:38:0x0080, B:40:0x0088, B:43:0x0090, B:45:0x0098, B:47:0x00a0, B:50:0x00a8, B:52:0x00b4, B:54:0x00ba, B:55:0x00cd, B:57:0x00d3, B:59:0x00e7, B:60:0x00eb, B:61:0x00f1, B:63:0x00f9, B:65:0x00ff, B:66:0x0112, B:68:0x0118, B:70:0x012c, B:71:0x0130, B:72:0x0136, B:74:0x013e, B:76:0x0144, B:77:0x015d, B:79:0x0163, B:80:0x0175, B:82:0x0180, B:84:0x0188, B:86:0x018e, B:88:0x0198, B:89:0x01a8, B:90:0x01b1, B:92:0x01b9, B:94:0x01c3, B:96:0x01c7, B:98:0x01cb, B:103:0x01d5, B:104:0x01da, B:106:0x01e0, B:107:0x01e9, B:109:0x01ef, B:110:0x01f8, B:112:0x01fe, B:113:0x0207, B:115:0x020d, B:116:0x0216, B:117:0x021b, B:119:0x0221), top: B:125:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0207 A[Catch: all -> 0x0229, TryCatch #0 {all -> 0x0229, blocks: (B:8:0x001c, B:10:0x0024, B:12:0x002c, B:15:0x0034, B:17:0x003a, B:19:0x0040, B:22:0x0048, B:24:0x0050, B:26:0x0058, B:29:0x0060, B:31:0x0068, B:33:0x0070, B:36:0x0078, B:38:0x0080, B:40:0x0088, B:43:0x0090, B:45:0x0098, B:47:0x00a0, B:50:0x00a8, B:52:0x00b4, B:54:0x00ba, B:55:0x00cd, B:57:0x00d3, B:59:0x00e7, B:60:0x00eb, B:61:0x00f1, B:63:0x00f9, B:65:0x00ff, B:66:0x0112, B:68:0x0118, B:70:0x012c, B:71:0x0130, B:72:0x0136, B:74:0x013e, B:76:0x0144, B:77:0x015d, B:79:0x0163, B:80:0x0175, B:82:0x0180, B:84:0x0188, B:86:0x018e, B:88:0x0198, B:89:0x01a8, B:90:0x01b1, B:92:0x01b9, B:94:0x01c3, B:96:0x01c7, B:98:0x01cb, B:103:0x01d5, B:104:0x01da, B:106:0x01e0, B:107:0x01e9, B:109:0x01ef, B:110:0x01f8, B:112:0x01fe, B:113:0x0207, B:115:0x020d, B:116:0x0216, B:117:0x021b, B:119:0x0221), top: B:125:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:115:0x020d A[Catch: all -> 0x0229, TryCatch #0 {all -> 0x0229, blocks: (B:8:0x001c, B:10:0x0024, B:12:0x002c, B:15:0x0034, B:17:0x003a, B:19:0x0040, B:22:0x0048, B:24:0x0050, B:26:0x0058, B:29:0x0060, B:31:0x0068, B:33:0x0070, B:36:0x0078, B:38:0x0080, B:40:0x0088, B:43:0x0090, B:45:0x0098, B:47:0x00a0, B:50:0x00a8, B:52:0x00b4, B:54:0x00ba, B:55:0x00cd, B:57:0x00d3, B:59:0x00e7, B:60:0x00eb, B:61:0x00f1, B:63:0x00f9, B:65:0x00ff, B:66:0x0112, B:68:0x0118, B:70:0x012c, B:71:0x0130, B:72:0x0136, B:74:0x013e, B:76:0x0144, B:77:0x015d, B:79:0x0163, B:80:0x0175, B:82:0x0180, B:84:0x0188, B:86:0x018e, B:88:0x0198, B:89:0x01a8, B:90:0x01b1, B:92:0x01b9, B:94:0x01c3, B:96:0x01c7, B:98:0x01cb, B:103:0x01d5, B:104:0x01da, B:106:0x01e0, B:107:0x01e9, B:109:0x01ef, B:110:0x01f8, B:112:0x01fe, B:113:0x0207, B:115:0x020d, B:116:0x0216, B:117:0x021b, B:119:0x0221), top: B:125:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:117:0x021b A[Catch: all -> 0x0229, TryCatch #0 {all -> 0x0229, blocks: (B:8:0x001c, B:10:0x0024, B:12:0x002c, B:15:0x0034, B:17:0x003a, B:19:0x0040, B:22:0x0048, B:24:0x0050, B:26:0x0058, B:29:0x0060, B:31:0x0068, B:33:0x0070, B:36:0x0078, B:38:0x0080, B:40:0x0088, B:43:0x0090, B:45:0x0098, B:47:0x00a0, B:50:0x00a8, B:52:0x00b4, B:54:0x00ba, B:55:0x00cd, B:57:0x00d3, B:59:0x00e7, B:60:0x00eb, B:61:0x00f1, B:63:0x00f9, B:65:0x00ff, B:66:0x0112, B:68:0x0118, B:70:0x012c, B:71:0x0130, B:72:0x0136, B:74:0x013e, B:76:0x0144, B:77:0x015d, B:79:0x0163, B:80:0x0175, B:82:0x0180, B:84:0x0188, B:86:0x018e, B:88:0x0198, B:89:0x01a8, B:90:0x01b1, B:92:0x01b9, B:94:0x01c3, B:96:0x01c7, B:98:0x01cb, B:103:0x01d5, B:104:0x01da, B:106:0x01e0, B:107:0x01e9, B:109:0x01ef, B:110:0x01f8, B:112:0x01fe, B:113:0x0207, B:115:0x020d, B:116:0x0216, B:117:0x021b, B:119:0x0221), top: B:125:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0221 A[Catch: all -> 0x0229, TRY_LEAVE, TryCatch #0 {all -> 0x0229, blocks: (B:8:0x001c, B:10:0x0024, B:12:0x002c, B:15:0x0034, B:17:0x003a, B:19:0x0040, B:22:0x0048, B:24:0x0050, B:26:0x0058, B:29:0x0060, B:31:0x0068, B:33:0x0070, B:36:0x0078, B:38:0x0080, B:40:0x0088, B:43:0x0090, B:45:0x0098, B:47:0x00a0, B:50:0x00a8, B:52:0x00b4, B:54:0x00ba, B:55:0x00cd, B:57:0x00d3, B:59:0x00e7, B:60:0x00eb, B:61:0x00f1, B:63:0x00f9, B:65:0x00ff, B:66:0x0112, B:68:0x0118, B:70:0x012c, B:71:0x0130, B:72:0x0136, B:74:0x013e, B:76:0x0144, B:77:0x015d, B:79:0x0163, B:80:0x0175, B:82:0x0180, B:84:0x0188, B:86:0x018e, B:88:0x0198, B:89:0x01a8, B:90:0x01b1, B:92:0x01b9, B:94:0x01c3, B:96:0x01c7, B:98:0x01cb, B:103:0x01d5, B:104:0x01da, B:106:0x01e0, B:107:0x01e9, B:109:0x01ef, B:110:0x01f8, B:112:0x01fe, B:113:0x0207, B:115:0x020d, B:116:0x0216, B:117:0x021b, B:119:0x0221), top: B:125:0x001c }] */
    public final Object a(Widget widget) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        Object obj;
        Bundle args = widget.getArgs();
        String str = this.a;
        Object obj2 = args.get(str);
        if (obj2 == null) {
            Object obj3 = d;
            Object obj4 = this.c;
            if (obj4 != obj3) {
                return obj4;
            }
        }
        Bundle args2 = widget.getArgs();
        Class cls = this.b;
        Object objValueOf = null;
        try {
            if (cqk.d(cls, Long.class)) {
                string = args2.getString(str);
                if (string != null) {
                    objValueOf = Long.valueOf(Long.parseLong(string));
                }
            } else {
                Class cls2 = Long.TYPE;
                if (cqk.d(cls, cls2) || cqk.d(cls, cls2)) {
                    string = args2.getString(str);
                    if (string != null) {
                        objValueOf = Long.valueOf(Long.parseLong(string));
                    }
                } else if (cqk.d(cls, String.class) || cqk.d(cls, null) || cqk.d(cls, String.class)) {
                    objValueOf = args2.getString(str);
                } else if (cqk.d(cls, Boolean.class)) {
                    string2 = args2.getString(str);
                    if (string2 != null) {
                        objValueOf = Boolean.valueOf(Boolean.parseBoolean(string2));
                    }
                } else {
                    Class cls3 = Boolean.TYPE;
                    if (cqk.d(cls, cls3) || cqk.d(cls, cls3)) {
                        string2 = args2.getString(str);
                        if (string2 != null) {
                            objValueOf = Boolean.valueOf(Boolean.parseBoolean(string2));
                        }
                    } else if (cqk.d(cls, Integer.class)) {
                        string3 = args2.getString(str);
                        if (string3 != null) {
                            objValueOf = Integer.valueOf(Integer.parseInt(string3));
                        }
                    } else {
                        Class cls4 = Integer.TYPE;
                        if (cqk.d(cls, cls4) || cqk.d(cls, cls4)) {
                            string3 = args2.getString(str);
                            if (string3 != null) {
                                objValueOf = Integer.valueOf(Integer.parseInt(string3));
                            }
                        } else if (cqk.d(cls, Double.class)) {
                            string4 = args2.getString(str);
                            if (string4 != null) {
                                objValueOf = Double.valueOf(Double.parseDouble(string4));
                            }
                        } else {
                            Class cls5 = Double.TYPE;
                            if (cqk.d(cls, cls5) || cqk.d(cls, cls5)) {
                                string4 = args2.getString(str);
                                if (string4 != null) {
                                    objValueOf = Double.valueOf(Double.parseDouble(string4));
                                }
                            } else if (cqk.d(cls, Float.class)) {
                                string5 = args2.getString(str);
                                if (string5 != null) {
                                    objValueOf = Float.valueOf(Float.parseFloat(string5));
                                }
                            } else {
                                Class cls6 = Float.TYPE;
                                if (cqk.d(cls, cls6) || cqk.d(cls, cls6)) {
                                    string5 = args2.getString(str);
                                    if (string5 != null) {
                                        objValueOf = Float.valueOf(Float.parseFloat(string5));
                                    }
                                } else if (cqk.d(cls, long[].class)) {
                                    String string6 = args2.getString(str);
                                    if (string6 != null) {
                                        List listL1 = r5h.l1(string6, new char[]{','});
                                        ArrayList arrayList = new ArrayList();
                                        Iterator it = listL1.iterator();
                                        while (it.hasNext()) {
                                            Long lC0 = y5h.C0(r5h.y1((String) it.next()).toString());
                                            if (lC0 != null) {
                                                arrayList.add(lC0);
                                            }
                                        }
                                        objValueOf = ww3.U1(arrayList);
                                    }
                                } else if (cqk.d(cls, int[].class)) {
                                    String string7 = args2.getString(str);
                                    if (string7 != null) {
                                        List listL2 = r5h.l1(string7, new char[]{','});
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator it2 = listL2.iterator();
                                        while (it2.hasNext()) {
                                            Integer numB0 = y5h.B0(r5h.y1((String) it2.next()).toString());
                                            if (numB0 != null) {
                                                arrayList2.add(numB0);
                                            }
                                        }
                                        objValueOf = ww3.S1(arrayList2);
                                    }
                                } else if (cqk.d(cls, String[].class)) {
                                    String string8 = args2.getString(str);
                                    if (string8 != null) {
                                        List listL3 = r5h.l1(string8, new char[]{','});
                                        ArrayList arrayList3 = new ArrayList(yw3.W0(listL3, 10));
                                        Iterator it3 = listL3.iterator();
                                        while (it3.hasNext()) {
                                            arrayList3.add(r5h.y1((String) it3.next()).toString());
                                        }
                                        obj = (String[]) arrayList3.toArray(new String[0]);
                                        objValueOf = obj;
                                    }
                                } else if (cqk.d(cls, Integer[].class)) {
                                    String[] stringArray = args2.getStringArray(str);
                                    if (stringArray != null) {
                                        ArrayList arrayList4 = new ArrayList(stringArray.length);
                                        for (String str2 : stringArray) {
                                            arrayList4.add(Integer.valueOf(Integer.parseInt(str2)));
                                        }
                                        obj = (Integer[]) arrayList4.toArray(new Integer[0]);
                                        objValueOf = obj;
                                    }
                                } else if (n51.class.isAssignableFrom(cls)) {
                                    String string9 = args2.getString(str);
                                    Object[] enumConstants = cls.getEnumConstants();
                                    Object obj5 = enumConstants != null ? enumConstants[0] : null;
                                    n51 n51Var = obj5 instanceof n51 ? (n51) obj5 : null;
                                    if (n51Var != null) {
                                        if (string9 == null) {
                                            string9 = "";
                                        }
                                        objValueOf = n51Var.a(string9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return objValueOf == null ? obj2 : objValueOf;
    }

    public final void b(Widget widget, Object obj) {
        Bundle args = widget.getArgs();
        String str = this.a;
        if (obj == null) {
            args.remove(str);
            return;
        }
        Class cls = this.b;
        if (!cqk.d(cls, Boolean.class)) {
            Class cls2 = Boolean.TYPE;
            if (!cqk.d(cls, cls2) && !cqk.d(cls, cls2)) {
                if (cqk.d(cls, boolean[].class)) {
                    args.putBooleanArray(str, (boolean[]) obj);
                    return;
                }
                if (!cqk.d(cls, Character.class)) {
                    Class cls3 = Character.TYPE;
                    if (!cqk.d(cls, cls3) && !cqk.d(cls, cls3)) {
                        if (cqk.d(cls, char[].class)) {
                            args.putCharArray(str, (char[]) obj);
                            return;
                        }
                        if (cqk.d(cls, CharSequence.class)) {
                            args.putCharSequence(str, (CharSequence) obj);
                            return;
                        }
                        if (cqk.d(cls, CharSequence[].class)) {
                            args.putCharSequenceArray(str, (CharSequence[]) obj);
                            return;
                        }
                        if (cqk.d(cls, String.class) || cqk.d(cls, null) || cqk.d(cls, String.class)) {
                            args.putString(str, (String) obj);
                            return;
                        }
                        if (cqk.d(cls, String[].class)) {
                            args.putStringArray(str, (String[]) obj);
                            return;
                        }
                        if (!cqk.d(cls, Integer.class)) {
                            Class cls4 = Integer.TYPE;
                            if (!cqk.d(cls, cls4) && !cqk.d(cls, cls4)) {
                                if (cqk.d(cls, int[].class)) {
                                    args.putIntArray(str, (int[]) obj);
                                    return;
                                }
                                if (!cqk.d(cls, Long.class)) {
                                    Class cls5 = Long.TYPE;
                                    if (!cqk.d(cls, cls5) && !cqk.d(cls, cls5)) {
                                        if (cqk.d(cls, long[].class)) {
                                            args.putLongArray(str, (long[]) obj);
                                            return;
                                        }
                                        if (!cqk.d(cls, Float.class)) {
                                            Class cls6 = Float.TYPE;
                                            if (!cqk.d(cls, cls6) && !cqk.d(cls, cls6)) {
                                                if (cqk.d(cls, float[].class)) {
                                                    args.putFloatArray(str, (float[]) obj);
                                                    return;
                                                }
                                                if (!cqk.d(cls, Double.class)) {
                                                    Class cls7 = Double.TYPE;
                                                    if (!cqk.d(cls, cls7) && !cqk.d(cls, cls7)) {
                                                        if (cqk.d(cls, double[].class)) {
                                                            args.putDoubleArray(str, (double[]) obj);
                                                            return;
                                                        }
                                                        if (!cqk.d(cls, Short.class)) {
                                                            Class cls8 = Short.TYPE;
                                                            if (!cqk.d(cls, cls8) && !cqk.d(cls, cls8)) {
                                                                if (cqk.d(cls, short[].class)) {
                                                                    args.putShortArray(str, (short[]) obj);
                                                                    return;
                                                                }
                                                                if (!cqk.d(cls, Byte.class)) {
                                                                    Class cls9 = Byte.TYPE;
                                                                    if (!cqk.d(cls, cls9) && !cqk.d(cls, cls9)) {
                                                                        if (cqk.d(cls, byte[].class)) {
                                                                            args.putByteArray(str, (byte[]) obj);
                                                                            return;
                                                                        }
                                                                        if (cqk.d(cls, Parcelable[].class)) {
                                                                            args.putParcelableArray(str, (Parcelable[]) obj);
                                                                            return;
                                                                        }
                                                                        if (cqk.d(cls, Bundle.class)) {
                                                                            args.putBundle(str, (Bundle) obj);
                                                                            return;
                                                                        }
                                                                        if (cqk.d(cls, Size.class)) {
                                                                            args.putSize(str, (Size) obj);
                                                                            return;
                                                                        }
                                                                        if (cqk.d(cls, SizeF.class)) {
                                                                            args.putSizeF(str, (SizeF) obj);
                                                                            return;
                                                                        }
                                                                        if (cqk.d(cls, ArrayList.class)) {
                                                                            ArrayList<Integer> arrayList = (ArrayList) obj;
                                                                            if (arrayList.isEmpty()) {
                                                                                return;
                                                                            }
                                                                            Object objR1 = ww3.r1(arrayList);
                                                                            if (objR1 instanceof String) {
                                                                                args.putStringArrayList(str, arrayList);
                                                                                return;
                                                                            }
                                                                            if (objR1 instanceof Parcelable) {
                                                                                args.putParcelableArrayList(str, arrayList);
                                                                                return;
                                                                            } else if (objR1 instanceof CharSequence) {
                                                                                args.putCharSequenceArrayList(str, arrayList);
                                                                                return;
                                                                            } else {
                                                                                if (!(objR1 instanceof Integer)) {
                                                                                    throw new UnsupportedOperationException(String.format("ArrayList with type of `%s` is not supported!", Arrays.copyOf(new Object[]{ww3.r1(arrayList).getClass()}, 1)));
                                                                                }
                                                                                args.putIntegerArrayList(str, arrayList);
                                                                                return;
                                                                            }
                                                                        }
                                                                        if (cqk.d(cls, SparseArray.class)) {
                                                                            SparseArray<? extends Parcelable> sparseArray = (SparseArray) obj;
                                                                            if (sparseArray.size() != 0) {
                                                                                Object next = drl.b(sparseArray).next();
                                                                                if (!(next instanceof Parcelable)) {
                                                                                    throw new UnsupportedOperationException(String.format("SparseArray with type of `%s` is not supported!", Arrays.copyOf(new Object[]{next.getClass()}, 1)));
                                                                                }
                                                                                args.putSparseParcelableArray(str, sparseArray);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        if (IBinder.class.isAssignableFrom(cls)) {
                                                                            args.putBinder(str, (IBinder) obj);
                                                                            return;
                                                                        } else if (Parcelable.class.isAssignableFrom(cls)) {
                                                                            args.putParcelable(str, (Parcelable) obj);
                                                                            return;
                                                                        } else {
                                                                            if (!Serializable.class.isAssignableFrom(cls)) {
                                                                                throw new UnsupportedOperationException(String.format("Value of `%s` type is not supported", Arrays.copyOf(new Object[]{cls}, 1)));
                                                                            }
                                                                            args.putSerializable(str, (Serializable) obj);
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                                args.putByte(str, ((Byte) obj).byteValue());
                                                                return;
                                                            }
                                                        }
                                                        args.putShort(str, ((Short) obj).shortValue());
                                                        return;
                                                    }
                                                }
                                                args.putDouble(str, ((Double) obj).doubleValue());
                                                return;
                                            }
                                        }
                                        args.putFloat(str, ((Float) obj).floatValue());
                                        return;
                                    }
                                }
                                args.putLong(str, ((Long) obj).longValue());
                                return;
                            }
                        }
                        args.putInt(str, ((Integer) obj).intValue());
                        return;
                    }
                }
                args.putChar(str, ((Character) obj).charValue());
                return;
            }
        }
        args.putBoolean(str, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.j8e
    public final /* bridge */ /* synthetic */ Object m(Object obj, zv8 zv8Var) {
        return a((Widget) obj);
    }

    public /* synthetic */ vv(String str, Class cls) {
        this(cls, d, str);
    }
}
