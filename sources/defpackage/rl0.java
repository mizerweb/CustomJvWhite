package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes3.dex */
public final class rl0 extends ux8 implements cf7 {
    public final /* synthetic */ int a;
    public static final rl0 b = new rl0(1, 0);
    public static final rl0 c = new rl0(1, 1);
    public static final rl0 d = new rl0(1, 2);
    public static final rl0 e = new rl0(1, 3);
    public static final rl0 f = new rl0(1, 4);
    public static final rl0 g = new rl0(1, 5);
    public static final rl0 h = new rl0(1, 6);
    public static final rl0 i = new rl0(1, 7);
    public static final rl0 j = new rl0(1, 8);
    public static final rl0 k = new rl0(1, 9);
    public static final rl0 l = new rl0(1, 10);
    public static final rl0 m = new rl0(1, 11);
    public static final rl0 n = new rl0(1, 12);
    public static final rl0 o = new rl0(1, 13);
    public static final rl0 p = new rl0(1, 14);
    public static final rl0 q = new rl0(1, 15);
    public static final rl0 r = new rl0(1, 16);
    public static final rl0 s = new rl0(1, 17);
    public static final rl0 t = new rl0(1, 18);
    public static final rl0 u = new rl0(1, 19);
    public static final rl0 v = new rl0(1, 20);
    public static final rl0 w = new rl0(1, 21);
    public static final rl0 x = new rl0(1, 22);
    public static final rl0 y = new rl0(1, 23);
    public static final rl0 z = new rl0(1, 24);
    public static final rl0 A = new rl0(1, 25);
    public static final rl0 B = new rl0(1, 26);
    public static final rl0 C = new rl0(1, 27);
    public static final rl0 D = new rl0(1, 28);
    public static final rl0 E = new rl0(1, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rl0(int i2, int i3) {
        super(i2);
        this.a = i3;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01df  */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        Object objValueOf;
        int i2 = this.a;
        sbi sbiVar = sbi.a;
        switch (i2) {
            case 0:
                return qv1.g('\'', "'", (String) obj);
            case 1:
                return sbiVar;
            case 2:
                return ((PackageInfo) obj).packageName;
            case 3:
                throw new IllegalStateException("Error not implemented");
            case 4:
                return ",";
            case 5:
                return x05.i(new StringBuilder("'"), ((co8) obj).a, '\'');
            case 6:
                int iIntValue = ((Number) obj).intValue();
                StringBuilder sb = new StringBuilder("Object(type=");
                c54 c54VarA = hg5.a();
                if (c54VarA != null) {
                    c54VarA.a();
                    objValueOf = (String) c54VarA.b.get(Integer.valueOf(iIntValue));
                    if (objValueOf == null) {
                        objValueOf = Integer.valueOf(iIntValue);
                    }
                } else {
                    objValueOf = Integer.valueOf(iIntValue);
                }
                sb.append(objValueOf);
                sb.append(')');
                return "- ".concat(sb.toString());
            case 7:
                return sbiVar;
            case 8:
                Map.Entry entry = (Map.Entry) obj;
                return "  " + ((vdd) entry.getKey()).a + " = " + entry.getValue();
            case 9:
                return r66.a;
            case 10:
                return lkl.c(new wdd[0]);
            case 11:
                return "_".concat(((tn9) obj).a.group());
            case 12:
                return ((pxh) obj).getClass().getName();
            case 13:
                return ((qxh) obj).getClass().getName();
            case 14:
                ylc ylcVar = (ylc) obj;
                String str = (String) ylcVar.a;
                String str2 = (String) ylcVar.b;
                StringBuilder sb2 = new StringBuilder();
                Charset charset = StandardCharsets.UTF_8;
                sb2.append(URLEncoder.encode(str, charset.toString()));
                sb2.append('=');
                sb2.append(URLEncoder.encode(str2, charset.toString()));
                return sb2.toString();
            case 15:
                return new roe(new poe((Exception) obj));
            case 16:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 17:
                return new roe(new poe((Exception) obj));
            case 18:
                return new roe(new poe((Exception) obj));
            case 19:
                return new ComponentName((String) obj, "com.vk.push.authsdk.ipc.AuthService");
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new roe(new poe((Exception) obj));
            case 21:
                return new ComponentName((String) obj, "com.vk.push.authsdk.ipc.AuthService");
            case 22:
                xek.a.getClass();
                return (b35) xek.h.m((Context) obj, xek.b[5]);
            case 23:
                vdd vddVar = new vdd("master_host_pub");
                LinkedHashMap linkedHashMap = ((x8b) obj).a;
                Object obj2 = linkedHashMap.get(vddVar);
                Object obj3 = linkedHashMap.get(new vdd("master_host_package"));
                if (obj2 == null || obj3 == null) {
                    return null;
                }
                return new a9k((String) obj3, (String) obj2);
            case 24:
                return lkl.c(new wdd[0]);
            case 25:
                xek.a.getClass();
                return (b35) xek.h.m((Context) obj, xek.b[5]);
            case 26:
                String str3 = (String) ((x8b) obj).a.get(new vdd("master_default_host"));
                if (str3 != null) {
                    return new e9k(str3);
                }
                return null;
            case 27:
                Boolean bool = (Boolean) ((x8b) obj).a.get(new vdd("test_mode_enabled"));
                return new agk(bool != null ? bool.booleanValue() : false);
            case 28:
                Integer num = (Integer) ((x8b) obj).a.get(new vdd("last_notification_id"));
                if (num != null) {
                    return new kik(num.intValue());
                }
                return null;
            default:
                xek.a.getClass();
                return (b35) xek.e.m((Context) obj, xek.b[2]);
        }
    }
}
