package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class rx5 {
    public static Boolean d = null;
    public static String e = null;
    public static boolean f = false;
    public static int g = -1;
    public static Boolean h;
    public static vyl l;
    public static d1m m;
    public final Context a;
    public static final ThreadLocal i = new ThreadLocal();
    public static final h45 j = new h45(7);
    public static final iw8 k = new iw8(20);
    public static final px8 b = new px8();
    public static final xr8 c = new xr8();

    public rx5(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (f55.h(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0251 A[Catch: all -> 0x023a, DynamiteModule$LoadingException -> 0x023d, RemoteException -> 0x0240, TryCatch #11 {RemoteException -> 0x0240, DynamiteModule$LoadingException -> 0x023d, all -> 0x023a, blocks: (B:90:0x022b, B:103:0x0272, B:105:0x0278, B:106:0x0281, B:107:0x0288, B:97:0x0243, B:98:0x024c, B:101:0x0251, B:102:0x0262, B:108:0x0289, B:109:0x0292, B:110:0x0293, B:111:0x029c, B:119:0x02ad), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0262 A[Catch: all -> 0x023a, DynamiteModule$LoadingException -> 0x023d, RemoteException -> 0x0240, TryCatch #11 {RemoteException -> 0x0240, DynamiteModule$LoadingException -> 0x023d, all -> 0x023a, blocks: (B:90:0x022b, B:103:0x0272, B:105:0x0278, B:106:0x0281, B:107:0x0288, B:97:0x0243, B:98:0x024c, B:101:0x0251, B:102:0x0262, B:108:0x0289, B:109:0x0292, B:110:0x0293, B:111:0x029c, B:119:0x02ad), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0278 A[Catch: all -> 0x023a, DynamiteModule$LoadingException -> 0x023d, RemoteException -> 0x0240, TryCatch #11 {RemoteException -> 0x0240, DynamiteModule$LoadingException -> 0x023d, all -> 0x023a, blocks: (B:90:0x022b, B:103:0x0272, B:105:0x0278, B:106:0x0281, B:107:0x0288, B:97:0x0243, B:98:0x024c, B:101:0x0251, B:102:0x0262, B:108:0x0289, B:109:0x0292, B:110:0x0293, B:111:0x029c, B:119:0x02ad), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0281 A[Catch: all -> 0x023a, DynamiteModule$LoadingException -> 0x023d, RemoteException -> 0x0240, TryCatch #11 {RemoteException -> 0x0240, DynamiteModule$LoadingException -> 0x023d, all -> 0x023a, blocks: (B:90:0x022b, B:103:0x0272, B:105:0x0278, B:106:0x0281, B:107:0x0288, B:97:0x0243, B:98:0x024c, B:101:0x0251, B:102:0x0262, B:108:0x0289, B:109:0x0292, B:110:0x0293, B:111:0x029c, B:119:0x02ad), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0289 A[Catch: all -> 0x023a, DynamiteModule$LoadingException -> 0x023d, RemoteException -> 0x0240, TryCatch #11 {RemoteException -> 0x0240, DynamiteModule$LoadingException -> 0x023d, all -> 0x023a, blocks: (B:90:0x022b, B:103:0x0272, B:105:0x0278, B:106:0x0281, B:107:0x0288, B:97:0x0243, B:98:0x024c, B:101:0x0251, B:102:0x0262, B:108:0x0289, B:109:0x0292, B:110:0x0293, B:111:0x029c, B:119:0x02ad), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0293 A[Catch: all -> 0x023a, DynamiteModule$LoadingException -> 0x023d, RemoteException -> 0x0240, TryCatch #11 {RemoteException -> 0x0240, DynamiteModule$LoadingException -> 0x023d, all -> 0x023a, blocks: (B:90:0x022b, B:103:0x0272, B:105:0x0278, B:106:0x0281, B:107:0x0288, B:97:0x0243, B:98:0x024c, B:101:0x0251, B:102:0x0262, B:108:0x0289, B:109:0x0292, B:110:0x0293, B:111:0x029c, B:119:0x02ad), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:136:0x0315  */
    /* JADX WARN: Code duplicated, block: B:137:0x031b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0324  */
    /* JADX WARN: Code duplicated, block: B:145:0x0335 A[Catch: all -> 0x00c0, TryCatch #1 {all -> 0x00c0, blocks: (B:5:0x0042, B:9:0x00b9, B:16:0x00c5, B:19:0x00cb, B:32:0x00f9, B:120:0x02ae, B:121:0x02b5, B:129:0x02c4, B:131:0x02ec, B:133:0x02fd, B:143:0x032d, B:144:0x0334, B:124:0x02b8, B:125:0x02b9, B:126:0x02c0, B:145:0x0335, B:146:0x0355, B:147:0x0356, B:148:0x03a7), top: B:160:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00cb A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #1 {all -> 0x00c0, blocks: (B:5:0x0042, B:9:0x00b9, B:16:0x00c5, B:19:0x00cb, B:32:0x00f9, B:120:0x02ae, B:121:0x02b5, B:129:0x02c4, B:131:0x02ec, B:133:0x02fd, B:143:0x032d, B:144:0x0334, B:124:0x02b8, B:125:0x02b9, B:126:0x02c0, B:145:0x0335, B:146:0x0355, B:147:0x0356, B:148:0x03a7), top: B:160:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:37:0x0104 A[Catch: all -> 0x029d, TryCatch #11 {all -> 0x029d, blocks: (B:35:0x00fe, B:37:0x0104, B:38:0x0106), top: B:166:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0109 A[Catch: all -> 0x0184, DynamiteModule$LoadingException -> 0x0189, RemoteException -> 0x018e, TRY_ENTER, TryCatch #10 {RemoteException -> 0x018e, DynamiteModule$LoadingException -> 0x0189, all -> 0x0184, blocks: (B:34:0x00fd, B:40:0x0109, B:42:0x0110, B:43:0x0143, B:47:0x0149, B:49:0x0151, B:51:0x0155, B:52:0x0163, B:59:0x016e, B:67:0x01a8, B:69:0x01b0, B:70:0x01b7, B:71:0x01be, B:66:0x0193, B:74:0x01c1, B:75:0x01c2, B:76:0x01c9, B:77:0x01ca, B:78:0x01d1, B:81:0x01d4, B:82:0x01d5, B:84:0x020c, B:86:0x021f, B:88:0x0227), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0110 A[Catch: all -> 0x0184, DynamiteModule$LoadingException -> 0x0189, RemoteException -> 0x018e, TryCatch #10 {RemoteException -> 0x018e, DynamiteModule$LoadingException -> 0x0189, all -> 0x0184, blocks: (B:34:0x00fd, B:40:0x0109, B:42:0x0110, B:43:0x0143, B:47:0x0149, B:49:0x0151, B:51:0x0155, B:52:0x0163, B:59:0x016e, B:67:0x01a8, B:69:0x01b0, B:70:0x01b7, B:71:0x01be, B:66:0x0193, B:74:0x01c1, B:75:0x01c2, B:76:0x01c9, B:77:0x01ca, B:78:0x01d1, B:81:0x01d4, B:82:0x01d5, B:84:0x020c, B:86:0x021f, B:88:0x0227), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0149 A[Catch: all -> 0x0184, DynamiteModule$LoadingException -> 0x0189, RemoteException -> 0x018e, TRY_ENTER, TryCatch #10 {RemoteException -> 0x018e, DynamiteModule$LoadingException -> 0x0189, all -> 0x0184, blocks: (B:34:0x00fd, B:40:0x0109, B:42:0x0110, B:43:0x0143, B:47:0x0149, B:49:0x0151, B:51:0x0155, B:52:0x0163, B:59:0x016e, B:67:0x01a8, B:69:0x01b0, B:70:0x01b7, B:71:0x01be, B:66:0x0193, B:74:0x01c1, B:75:0x01c2, B:76:0x01c9, B:77:0x01ca, B:78:0x01d1, B:81:0x01d4, B:82:0x01d5, B:84:0x020c, B:86:0x021f, B:88:0x0227), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01ca A[Catch: all -> 0x0184, DynamiteModule$LoadingException -> 0x0189, RemoteException -> 0x018e, TryCatch #10 {RemoteException -> 0x018e, DynamiteModule$LoadingException -> 0x0189, all -> 0x0184, blocks: (B:34:0x00fd, B:40:0x0109, B:42:0x0110, B:43:0x0143, B:47:0x0149, B:49:0x0151, B:51:0x0155, B:52:0x0163, B:59:0x016e, B:67:0x01a8, B:69:0x01b0, B:70:0x01b7, B:71:0x01be, B:66:0x0193, B:74:0x01c1, B:75:0x01c2, B:76:0x01c9, B:77:0x01ca, B:78:0x01d1, B:81:0x01d4, B:82:0x01d5, B:84:0x020c, B:86:0x021f, B:88:0x0227), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01d5 A[Catch: all -> 0x0184, DynamiteModule$LoadingException -> 0x0189, RemoteException -> 0x018e, TryCatch #10 {RemoteException -> 0x018e, DynamiteModule$LoadingException -> 0x0189, all -> 0x0184, blocks: (B:34:0x00fd, B:40:0x0109, B:42:0x0110, B:43:0x0143, B:47:0x0149, B:49:0x0151, B:51:0x0155, B:52:0x0163, B:59:0x016e, B:67:0x01a8, B:69:0x01b0, B:70:0x01b7, B:71:0x01be, B:66:0x0193, B:74:0x01c1, B:75:0x01c2, B:76:0x01c9, B:77:0x01ca, B:78:0x01d1, B:81:0x01d4, B:82:0x01d5, B:84:0x020c, B:86:0x021f, B:88:0x0227), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:84:0x020c A[Catch: all -> 0x0184, DynamiteModule$LoadingException -> 0x0189, RemoteException -> 0x018e, TryCatch #10 {RemoteException -> 0x018e, DynamiteModule$LoadingException -> 0x0189, all -> 0x0184, blocks: (B:34:0x00fd, B:40:0x0109, B:42:0x0110, B:43:0x0143, B:47:0x0149, B:49:0x0151, B:51:0x0155, B:52:0x0163, B:59:0x016e, B:67:0x01a8, B:69:0x01b0, B:70:0x01b7, B:71:0x01be, B:66:0x0193, B:74:0x01c1, B:75:0x01c2, B:76:0x01c9, B:77:0x01ca, B:78:0x01d1, B:81:0x01d4, B:82:0x01d5, B:84:0x020c, B:86:0x021f, B:88:0x0227), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:86:0x021f A[Catch: all -> 0x0184, DynamiteModule$LoadingException -> 0x0189, RemoteException -> 0x018e, TryCatch #10 {RemoteException -> 0x018e, DynamiteModule$LoadingException -> 0x0189, all -> 0x0184, blocks: (B:34:0x00fd, B:40:0x0109, B:42:0x0110, B:43:0x0143, B:47:0x0149, B:49:0x0151, B:51:0x0155, B:52:0x0163, B:59:0x016e, B:67:0x01a8, B:69:0x01b0, B:70:0x01b7, B:71:0x01be, B:66:0x0193, B:74:0x01c1, B:75:0x01c2, B:76:0x01c9, B:77:0x01ca, B:78:0x01d1, B:81:0x01d4, B:82:0x01d5, B:84:0x020c, B:86:0x021f, B:88:0x0227), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0227 A[Catch: all -> 0x0184, DynamiteModule$LoadingException -> 0x0189, RemoteException -> 0x018e, TRY_LEAVE, TryCatch #10 {RemoteException -> 0x018e, DynamiteModule$LoadingException -> 0x0189, all -> 0x0184, blocks: (B:34:0x00fd, B:40:0x0109, B:42:0x0110, B:43:0x0143, B:47:0x0149, B:49:0x0151, B:51:0x0155, B:52:0x0163, B:59:0x016e, B:67:0x01a8, B:69:0x01b0, B:70:0x01b7, B:71:0x01be, B:66:0x0193, B:74:0x01c1, B:75:0x01c2, B:76:0x01c9, B:77:0x01ca, B:78:0x01d1, B:81:0x01d4, B:82:0x01d5, B:84:0x020c, B:86:0x021f, B:88:0x0227), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0243 A[Catch: all -> 0x023a, DynamiteModule$LoadingException -> 0x023d, RemoteException -> 0x0240, TryCatch #11 {RemoteException -> 0x0240, DynamiteModule$LoadingException -> 0x023d, all -> 0x023a, blocks: (B:90:0x022b, B:103:0x0272, B:105:0x0278, B:106:0x0281, B:107:0x0288, B:97:0x0243, B:98:0x024c, B:101:0x0251, B:102:0x0262, B:108:0x0289, B:109:0x0292, B:110:0x0293, B:111:0x029c, B:119:0x02ad), top: B:163:0x00fd }] */
    /* JADX WARN: Code duplicated, block: B:99:0x024d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r30v0, types: [qx5] */
    public static rx5 c(Context context, qx5 qx5Var, String str) throws DynamiteModule$LoadingException {
        ?? r10;
        int i2;
        rx5 rx5Var;
        Cursor cursor;
        int i3;
        Boolean bool;
        vyl vylVarH;
        int i4;
        m38 m38VarN0;
        Object objO0;
        oul oulVar;
        d1m d1mVar;
        oul oulVar2;
        boolean z;
        m38 m38VarN1;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new DynamiteModule$LoadingException("null application Context");
        }
        ThreadLocal threadLocal = i;
        oul oulVar3 = (oul) threadLocal.get();
        oul oulVar4 = new oul();
        threadLocal.set(oulVar4);
        h45 h45Var = j;
        Long l2 = (Long) h45Var.get();
        long jLongValue = l2.longValue();
        try {
            h45Var.set(Long.valueOf(SystemClock.uptimeMillis()));
            td0 td0VarE = qx5Var.e(context, str, k);
            String str2 = "DynamiteModule";
            int i5 = td0VarE.b;
            int i6 = td0VarE.c;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(i5).length() + 19 + String.valueOf(str).length() + 1 + String.valueOf(i6).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i5);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i6);
            Log.i("DynamiteModule", sb.toString());
            int i7 = td0VarE.d;
            if (i7 != 0) {
                if (i7 != -1) {
                    if (i7 == 1 || td0VarE.c != 0) {
                        if (i7 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                            rx5 rx5Var2 = new rx5(applicationContext);
                            if (jLongValue == 0) {
                                h45Var.remove();
                            } else {
                                h45Var.set(l2);
                            }
                            cursor2 = oulVar4.a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(oulVar3);
                            return rx5Var2;
                        }
                        if (i7 == 1) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 36);
                            sb2.append("VersionPolicy returned invalid code:");
                            sb2.append(i7);
                            throw new DynamiteModule$LoadingException(sb2.toString());
                        }
                        try {
                            try {
                                i3 = td0VarE.c;
                                try {
                                    try {
                                        try {
                                            synchronized (rx5.class) {
                                                try {
                                                    if (e(context)) {
                                                        throw new DynamiteModule$LoadingException("Remote loading disabled");
                                                    }
                                                    bool = d;
                                                    if (bool != null) {
                                                        throw new DynamiteModule$LoadingException("Failed to determine which loading route to use.");
                                                    }
                                                    if (bool.booleanValue()) {
                                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i3).length());
                                                        sb3.append("Selected remote version of ");
                                                        sb3.append(str);
                                                        sb3.append(", version >= ");
                                                        sb3.append(i3);
                                                        Log.i("DynamiteModule", sb3.toString());
                                                        synchronized (rx5.class) {
                                                            d1mVar = m;
                                                        }
                                                        if (d1mVar != null) {
                                                            throw new DynamiteModule$LoadingException("DynamiteLoaderV2 was not cached.");
                                                        }
                                                        oulVar2 = (oul) threadLocal.get();
                                                        if (oulVar2 != null || oulVar2.a == null) {
                                                            throw new DynamiteModule$LoadingException("No result cursor");
                                                        }
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor3 = oulVar2.a;
                                                        new dqb(null);
                                                        synchronized (rx5.class) {
                                                            z = g >= 2;
                                                        }
                                                        if (z) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            m38VarN1 = d1mVar.o0(new dqb(applicationContext2), str, i3, new dqb(cursor3));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            m38VarN1 = d1mVar.n0(new dqb(applicationContext2), str, i3, new dqb(cursor3));
                                                        }
                                                        Context context2 = (Context) dqb.o0(m38VarN1);
                                                        if (context2 == null) {
                                                            throw new DynamiteModule$LoadingException("Failed to get module context");
                                                        }
                                                        rx5Var = new rx5(context2);
                                                    } else {
                                                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i3).length());
                                                        sb4.append("Selected remote version of ");
                                                        sb4.append(str);
                                                        sb4.append(", version >= ");
                                                        sb4.append(i3);
                                                        Log.i("DynamiteModule", sb4.toString());
                                                        vylVarH = h(context);
                                                        if (vylVarH != null) {
                                                            throw new DynamiteModule$LoadingException("Failed to create IDynamiteLoader.");
                                                        }
                                                        Parcel parcelV = vylVarH.V(6, vylVarH.l0());
                                                        i4 = parcelV.readInt();
                                                        parcelV.recycle();
                                                        if (i4 >= 3) {
                                                            oulVar = (oul) threadLocal.get();
                                                            if (oulVar != null) {
                                                                throw new DynamiteModule$LoadingException("No cached result cursor holder");
                                                            }
                                                            m38VarN0 = vylVarH.q0(new dqb(context), str, i3, new dqb(oulVar.a));
                                                        } else if (i4 == 2) {
                                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                            m38VarN0 = vylVarH.o0(new dqb(context), str, i3);
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                            m38VarN0 = vylVarH.n0(new dqb(context), str, i3);
                                                        }
                                                        objO0 = dqb.o0(m38VarN0);
                                                        if (objO0 != null) {
                                                            throw new DynamiteModule$LoadingException("Failed to load remote module.");
                                                        }
                                                        rx5Var = new rx5((Context) objO0);
                                                    }
                                                    if (jLongValue == 0) {
                                                        j.remove();
                                                    } else {
                                                        j.set(l2);
                                                    }
                                                    cursor = oulVar4.a;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    i.set(oulVar3);
                                                    return rx5Var;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    throw th;
                                                }
                                            }
                                        } catch (RemoteException e2) {
                                            e = e2;
                                            throw new DynamiteModule$LoadingException("Failed to load remote module.", e);
                                        } catch (DynamiteModule$LoadingException e3) {
                                            throw e3;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            throw new DynamiteModule$LoadingException("Failed to load remote module.", th);
                                        }
                                    } catch (RemoteException e4) {
                                        e = e4;
                                        throw new DynamiteModule$LoadingException("Failed to load remote module.", e);
                                    } catch (DynamiteModule$LoadingException e5) {
                                        throw e5;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw new DynamiteModule$LoadingException("Failed to load remote module.", th);
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (DynamiteModule$LoadingException e6) {
                                e = e6;
                                r10 = str2;
                                String message = e.getMessage();
                                StringBuilder sb5 = new StringBuilder(String.valueOf(message).length() + 30);
                                sb5.append("Failed to load remote module: ");
                                sb5.append(message);
                                Log.w("DynamiteModule", sb5.toString());
                                i2 = td0VarE.b;
                                if (i2 != 0) {
                                }
                                throw new DynamiteModule$LoadingException("Remote load failed. No local fallback found.", e);
                            }
                        } catch (DynamiteModule$LoadingException e7) {
                            e = e7;
                            r10 = context;
                            String message2 = e.getMessage();
                            StringBuilder sb6 = new StringBuilder(String.valueOf(message2).length() + 30);
                            sb6.append("Failed to load remote module: ");
                            sb6.append(message2);
                            Log.w("DynamiteModule", sb6.toString());
                            i2 = td0VarE.b;
                            if (i2 != 0 || qx5Var.e(r10, str, new ww6(i2, 17, (byte) 0)).d != -1) {
                                throw new DynamiteModule$LoadingException("Remote load failed. No local fallback found.", e);
                            }
                            Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                            rx5Var = new rx5(applicationContext);
                        }
                    }
                } else if (td0VarE.b != 0) {
                    i7 = -1;
                    if (i7 == 1) {
                    }
                    if (i7 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                        rx5 rx5Var3 = new rx5(applicationContext);
                        if (jLongValue == 0) {
                            h45Var.remove();
                        } else {
                            h45Var.set(l2);
                        }
                        cursor2 = oulVar4.a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(oulVar3);
                        return rx5Var3;
                    }
                    if (i7 == 1) {
                        StringBuilder sb7 = new StringBuilder(String.valueOf(i7).length() + 36);
                        sb7.append("VersionPolicy returned invalid code:");
                        sb7.append(i7);
                        throw new DynamiteModule$LoadingException(sb7.toString());
                    }
                    i3 = td0VarE.c;
                    synchronized (rx5.class) {
                        if (e(context)) {
                            throw new DynamiteModule$LoadingException("Remote loading disabled");
                        }
                        bool = d;
                        if (bool != null) {
                            throw new DynamiteModule$LoadingException("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb8 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i3).length());
                            sb8.append("Selected remote version of ");
                            sb8.append(str);
                            sb8.append(", version >= ");
                            sb8.append(i3);
                            Log.i("DynamiteModule", sb8.toString());
                            synchronized (rx5.class) {
                                d1mVar = m;
                                if (d1mVar != null) {
                                    throw new DynamiteModule$LoadingException("DynamiteLoaderV2 was not cached.");
                                }
                                oulVar2 = (oul) threadLocal.get();
                                if (oulVar2 != null) {
                                }
                                throw new DynamiteModule$LoadingException("No result cursor");
                            }
                        }
                        StringBuilder sb9 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i3).length());
                        sb9.append("Selected remote version of ");
                        sb9.append(str);
                        sb9.append(", version >= ");
                        sb9.append(i3);
                        Log.i("DynamiteModule", sb9.toString());
                        vylVarH = h(context);
                        if (vylVarH != null) {
                            throw new DynamiteModule$LoadingException("Failed to create IDynamiteLoader.");
                        }
                        Parcel parcelV2 = vylVarH.V(6, vylVarH.l0());
                        i4 = parcelV2.readInt();
                        parcelV2.recycle();
                        if (i4 >= 3) {
                            oulVar = (oul) threadLocal.get();
                            if (oulVar != null) {
                                throw new DynamiteModule$LoadingException("No cached result cursor holder");
                            }
                            m38VarN0 = vylVarH.q0(new dqb(context), str, i3, new dqb(oulVar.a));
                        } else if (i4 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            m38VarN0 = vylVarH.o0(new dqb(context), str, i3);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            m38VarN0 = vylVarH.n0(new dqb(context), str, i3);
                        }
                        objO0 = dqb.o0(m38VarN0);
                        if (objO0 != null) {
                            throw new DynamiteModule$LoadingException("Failed to load remote module.");
                        }
                        rx5Var = new rx5((Context) objO0);
                        if (jLongValue == 0) {
                            j.remove();
                        } else {
                            j.set(l2);
                        }
                        cursor = oulVar4.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        i.set(oulVar3);
                        return rx5Var;
                    }
                }
            }
            int i8 = td0VarE.b;
            int i9 = td0VarE.c;
            StringBuilder sb10 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(i8).length() + 23 + String.valueOf(i9).length() + 1);
            sb10.append("No acceptable module ");
            sb10.append(str);
            sb10.append(" found. Local version is ");
            sb10.append(i8);
            sb10.append(" and remote version is ");
            sb10.append(i9);
            sb10.append(".");
            throw new DynamiteModule$LoadingException(sb10.toString());
        } catch (Throwable th5) {
            if (jLongValue == 0) {
                j.remove();
            } else {
                j.set(l2);
            }
            Cursor cursor4 = oulVar4.a;
            if (cursor4 != null) {
                cursor4.close();
            }
            i.set(oulVar3);
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0191  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4 A[Catch: all -> 0x003b, TryCatch #12 {all -> 0x003b, blocks: (B:10:0x002b, B:12:0x0037, B:52:0x00bd, B:17:0x0040, B:19:0x0047, B:21:0x004d, B:26:0x0054, B:28:0x0058, B:31:0x0061, B:33:0x0069, B:36:0x0070, B:43:0x009c, B:44:0x00a4, B:39:0x0077, B:41:0x007d, B:42:0x008e, B:47:0x00a7, B:50:0x00aa, B:51:0x00b4, B:18:0x0043), top: B:150:0x002b, inners: #13 }] */
    public static int d(Context context, String str, boolean z) {
        Throwable th;
        RemoteException remoteException;
        int i2;
        Cursor cursor;
        try {
            synchronized (rx5.class) {
                Boolean bool = d;
                boolean z2 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        g(classLoader);
                                    } catch (DynamiteModule$LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!e(context)) {
                                        return 0;
                                    }
                                    if (f) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iF = f(context, str, z, true);
                                                String str2 = e;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderC = wn9.c();
                                                    if (classLoaderC == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            yw.f();
                                                            String str3 = e;
                                                            yab.s(str3);
                                                            classLoaderC = yw.d(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = e;
                                                            yab.s(str4);
                                                            classLoaderC = new vxk(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    g(classLoaderC);
                                                    declaredField.set(null, classLoaderC);
                                                    d = bool2;
                                                    return iF;
                                                }
                                                return iF;
                                            } catch (DynamiteModule$LoadingException unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                d = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String string = e2.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(string);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z, false);
                    } catch (DynamiteModule$LoadingException e3) {
                        String message = e3.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb2.append("Failed to retrieve remote module version: ");
                        sb2.append(message);
                        Log.w("DynamiteModule", sb2.toString());
                        return 0;
                    }
                }
                vyl vylVarH = h(context);
                try {
                    if (vylVarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelV = vylVarH.V(6, vylVarH.l0());
                        int i3 = parcelV.readInt();
                        parcelV.recycle();
                        if (i3 >= 3) {
                            ThreadLocal threadLocal = i;
                            oul oulVar = (oul) threadLocal.get();
                            if (oulVar != null && (cursor = oulVar.a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) dqb.o0(vylVarH.p0(new dqb(context), str, z, ((Long) j.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i2 = cursor3.getInt(0);
                                        if (i2 > 0) {
                                            oul oulVar2 = (oul) threadLocal.get();
                                            if (oulVar2 == null || oulVar2.a != null) {
                                                z2 = false;
                                            } else {
                                                oulVar2.a = cursor3;
                                            }
                                            cursor2 = z2 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e4) {
                                    remoteException = e4;
                                    cursor2 = cursor3;
                                    String message2 = remoteException.getMessage();
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 42);
                                    sb3.append("Failed to retrieve remote module version: ");
                                    sb3.append(message2);
                                    Log.w("DynamiteModule", sb3.toString());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th;
                                    }
                                    cursor2.close();
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i3 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            dqb dqbVar = new dqb(context);
                            Parcel parcelL0 = vylVarH.l0();
                            buk.b(parcelL0, dqbVar);
                            parcelL0.writeString(str);
                            parcelL0.writeInt(z ? 1 : 0);
                            Parcel parcelV2 = vylVarH.V(5, parcelL0);
                            i2 = parcelV2.readInt();
                            parcelV2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            dqb dqbVar2 = new dqb(context);
                            Parcel parcelL1 = vylVarH.l0();
                            buk.b(parcelL1, dqbVar2);
                            parcelL1.writeString(str);
                            parcelL1.writeInt(z ? 1 : 0);
                            Parcel parcelV3 = vylVarH.V(3, parcelL1);
                            i2 = parcelV3.readInt();
                            parcelV3.recycle();
                        }
                        return i2;
                    } catch (RemoteException e5) {
                        remoteException = e5;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            try {
                yab.s(context);
                throw th5;
            } catch (Exception e6) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e6);
                throw th5;
            }
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(h)) {
            return true;
        }
        boolean z = false;
        if (h == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (go7.b.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            h = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x013a A[PHI: r3
  0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    public static int f(Context context, String str, boolean z, boolean z2) throws Throwable {
        Exception exc;
        Throwable th;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) j.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z5 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i2 = 0; i2 < count; i2++) {
                                    if (!cursorQuery.moveToPosition(i2)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i3 = 0; i3 < columnCount; i3++) {
                                        int type = cursorQuery.getType(i3);
                                        if (type == 0) {
                                            objArr[i3] = null;
                                        } else if (type == 1) {
                                            objArr[i3] = Long.valueOf(cursorQuery.getLong(i3));
                                        } else if (type == 2) {
                                            objArr[i3] = Double.valueOf(cursorQuery.getDouble(i3));
                                        } else if (type == 3) {
                                            objArr[i3] = cursorQuery.getString(i3);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i3] = cursorQuery.getBlob(i3);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i4 = matrixCursor.getInt(0);
                            if (i4 > 0) {
                                synchronized (rx5.class) {
                                    try {
                                        e = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            g = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = matrixCursor.getInt(columnIndex2) != 0;
                                            f = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                oul oulVar = (oul) i.get();
                                if (oulVar == null || oulVar.a != null) {
                                    z4 = false;
                                } else {
                                    oulVar.a = matrixCursor;
                                }
                                z5 = z3;
                                matrixCursor2 = z4 ? null : matrixCursor;
                            }
                            if (z2 && z5) {
                                throw new DynamiteModule$LoadingException("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i4;
                        }
                    } catch (Exception e2) {
                        exc = e2;
                        if (exc instanceof DynamiteModule$LoadingException) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                        sb.append("V2 version check failed: ");
                        sb.append(message);
                        throw new DynamiteModule$LoadingException(sb.toString(), exc);
                    } catch (Throwable th6) {
                        th = th6;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new DynamiteModule$LoadingException("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e3) {
                exc = e3;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public static void g(ClassLoader classLoader) throws DynamiteModule$LoadingException {
        try {
            d1m d1mVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                d1mVar = iInterfaceQueryLocalInterface instanceof d1m ? (d1m) iInterfaceQueryLocalInterface : new d1m(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
            }
            m = d1mVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e2);
        }
    }

    public static vyl h(Context context) {
        vyl vylVar;
        synchronized (rx5.class) {
            vyl vylVar2 = l;
            if (vylVar2 != null) {
                return vylVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    vylVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    vylVar = iInterfaceQueryLocalInterface instanceof vyl ? (vyl) iInterfaceQueryLocalInterface : new vyl(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
                }
                if (vylVar != null) {
                    l = vylVar;
                    return vylVar;
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) throws DynamiteModule$LoadingException {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new DynamiteModule$LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e2);
        }
    }
}
