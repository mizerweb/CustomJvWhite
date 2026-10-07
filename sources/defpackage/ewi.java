package defpackage;

import android.graphics.Color;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ewi {
    public static final boolean a(int i) {
        return i == 4 || i == 5 || i == 6 || i == 7 || i == 8;
    }

    public static final String b(int i) {
        if (i == 1) {
            return "video/hls";
        }
        if (i == 2) {
            return "application/dash+xml";
        }
        if (i == 3) {
            return "video/mp4";
        }
        throw null;
    }

    public static /* synthetic */ int c(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return np0.n;
            case 19:
                return 17;
            default:
                throw null;
        }
    }

    public static String d(long j, String str, String str2, String str3) {
        return str + j + str2 + str3;
    }

    public static String e(String str, ehh ehhVar, String str2, ehh ehhVar2) {
        return str + ehhVar + str2 + ehhVar2;
    }

    public static HashMap f(Class cls, dnk dnkVar) {
        HashMap map = new HashMap();
        map.put(cls, dnkVar);
        return map;
    }

    public static HashMap g(Class cls, ppk ppkVar) {
        HashMap map = new HashMap();
        map.put(cls, ppkVar);
        return map;
    }

    public static LinkedHashSet h(LinkedHashMap linkedHashMap, String str, bhh bhhVar) {
        linkedHashMap.put(str, bhhVar);
        return new LinkedHashSet();
    }

    public static dnk i(HashMap map, int i) {
        Collections.unmodifiableMap(new HashMap(map));
        return new dnk(i);
    }

    public static ppk j(HashMap map, int i) {
        Collections.unmodifiableMap(new HashMap(map));
        return new ppk(i);
    }

    public static d6l k(int i) {
        r5l r5lVar = new r5l();
        r5lVar.a(i);
        return r5lVar.b();
    }

    public static d6l l(d6l d6lVar, HashMap map, d6l d6lVar2, HashMap map2, int i) {
        map.put(d6lVar.annotationType(), d6lVar2);
        Collections.unmodifiableMap(new HashMap(map2));
        r5l r5lVar = new r5l();
        r5lVar.a(i);
        return r5lVar.b();
    }

    public static void m(int i, int i2, int i3, HashMap map, String str) {
        map.put(str, Integer.valueOf(Color.rgb(i, i2, i3)));
    }

    public static void n(a87 a87Var, kyh kyhVar) {
        kyhVar.g(new b87(a87Var));
    }

    public static void o(HashMap map) {
        Collections.unmodifiableMap(new HashMap(map));
    }

    public static void p(d6l d6lVar, HashMap map, d6l d6lVar2, HashMap map2) {
        map.put(d6lVar.annotationType(), d6lVar2);
        Collections.unmodifiableMap(new HashMap(map2));
    }

    public static /* synthetic */ String q(int i) {
        if (i == 1) {
            return "NOT_INITIALIZED";
        }
        if (i == 2) {
            return "INITIALIZING";
        }
        if (i == 3) {
            return "PENDING_RELEASE";
        }
        if (i != 4) {
            return i != 5 ? "null" : "RELEASED";
        }
        return "READY";
    }

    public static /* synthetic */ String r(int i) {
        if (i == 1) {
            return "ACTIVE_STREAMING";
        }
        if (i != 2) {
            return i != 3 ? "null" : "INACTIVE";
        }
        return "ACTIVE_NON_STREAMING";
    }

    public static /* synthetic */ String s(int i) {
        switch (i) {
            case 1:
                return "NO_ERROR";
            case 2:
                return "INTERNAL_ERROR";
            case 3:
                return "CONNECTION_REFUSED";
            case 4:
                return "FLOW_CONTROL_ERROR";
            case 5:
                return "STREAM_LIMIT_ERROR";
            case 6:
                return "STREAM_STATE_ERROR";
            case 7:
                return "FINAL_SIZE_ERROR";
            case 8:
                return "FRAME_ENCODING_ERROR";
            case 9:
                return "TRANSPORT_PARAMETER_ERROR";
            case 10:
                return "CONNECTION_ID_LIMIT_ERROR";
            case 11:
                return "PROTOCOL_VIOLATION";
            case 12:
                return "INVALID_TOKEN";
            case 13:
                return "APPLICATION_ERROR";
            case 14:
                return "CRYPTO_BUFFER_EXCEEDED";
            case 15:
                return "KEY_UPDATE_ERROR";
            case 16:
                return "AEAD_LIMIT_REACHED";
            case 17:
                return "NO_VIABLE_PATH";
            case 18:
                return "CRYPTO_ERROR";
            case 19:
                return "VERSION_NEGOTIATION_ERROR";
            default:
                return "null";
        }
    }
}
