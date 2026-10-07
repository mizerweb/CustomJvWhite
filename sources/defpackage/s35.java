package defpackage;

import android.graphics.Paint;
import android.os.Looper;
import android.text.BoringLayout;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.analytics.config.EventMetaParamsConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s35 implements af7 {
    public final /* synthetic */ int a;

    public /* synthetic */ s35(int i) {
        this.a = i;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        Object poeVar;
        switch (this.a) {
            case 0:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setDither(true);
                return paint;
            case 1:
                BoringLayout.Metrics metrics = new BoringLayout.Metrics();
                u35.y.getFontMetricsInt(metrics);
                return metrics;
            case 2:
                ic8 ic8Var = new ic8();
                ic8Var.a = 1;
                return ic8Var;
            case 3:
                return new lge("\\W+");
            case 4:
                return new q7b();
            case 5:
                return Boolean.TRUE;
            case 6:
                try {
                    Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
                    declaredField.setAccessible(true);
                    return (ThreadLocal) declaredField.get(null);
                } catch (Throwable unused) {
                    return null;
                }
            case 7:
                int i = al5.e;
                return sbi.a;
            case 8:
                return 1L;
            case 9:
                String str = ix5.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Object linkedHashMap2 = linkedHashMap.get(0);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap.put(0, linkedHashMap2);
                }
                new mf(0, (Map) linkedHashMap2, 6).A(a.Y0(new String[]{"video/avc", "video/mp4v-es", "video/3gpp", ix5.a, ix5.d, ix5.e, ix5.f}), (List) ix5.h.getValue());
                Object linkedHashMap3 = linkedHashMap.get(1);
                if (linkedHashMap3 == null) {
                    linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap.put(1, linkedHashMap3);
                }
                new mf(1, (Map) linkedHashMap3, 6).A(a.Y0(new String[]{"video/x-vnd.on2.vp8", ix5.b}), (List) ix5.i.getValue());
                ylc ylcVar = new ylc(fx5.d, new d87(linkedHashMap));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                Object linkedHashMap5 = linkedHashMap4.get(0);
                if (linkedHashMap5 == null) {
                    linkedHashMap5 = new LinkedHashMap();
                    linkedHashMap4.put(0, linkedHashMap5);
                }
                new mf(0, (Map) linkedHashMap5, 6).A(a.Y0(new String[]{ix5.a, ix5.e, ix5.f}), (List) ix5.h.getValue());
                ylc ylcVar2 = new ylc(fx5.e, new d87(linkedHashMap4));
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                Object linkedHashMap7 = linkedHashMap6.get(0);
                if (linkedHashMap7 == null) {
                    linkedHashMap7 = new LinkedHashMap();
                    linkedHashMap6.put(0, linkedHashMap7);
                }
                new mf(0, (Map) linkedHashMap7, 6).A(a.Y0(new String[]{ix5.a, ix5.e, ix5.f}), (List) ix5.h.getValue());
                Object linkedHashMap8 = linkedHashMap6.get(1);
                if (linkedHashMap8 == null) {
                    linkedHashMap8 = new LinkedHashMap();
                    linkedHashMap6.put(1, linkedHashMap8);
                }
                new mf(1, (Map) linkedHashMap8, 6).A(xw3.Q0(ix5.b), (List) ix5.i.getValue());
                ylc ylcVar3 = new ylc(fx5.f, new d87(linkedHashMap6));
                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                Object linkedHashMap10 = linkedHashMap9.get(0);
                if (linkedHashMap10 == null) {
                    linkedHashMap10 = new LinkedHashMap();
                    linkedHashMap9.put(0, linkedHashMap10);
                }
                new mf(0, (Map) linkedHashMap10, 6).A(a.Y0(new String[]{ix5.a, ix5.e}), (List) ix5.h.getValue());
                return wm9.S0(ylcVar, ylcVar2, ylcVar3, new ylc(fx5.g, new d87(linkedHashMap9)), new ylc(fx5.i, ix5.a()), new ylc(fx5.h, ix5.a()));
            case 10:
                return a.Y0(new String[]{"audio/mp4a-latm", "audio/3gpp", "audio/amr-wb"});
            case 11:
                return a.Y0(new String[]{"audio/vorbis", ix5.c});
            case 12:
                return new b06();
            case 13:
                try {
                    poeVar = MessageDigest.getInstance("SHA-256");
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                return (MessageDigest) (poeVar instanceof poe ? null : poeVar);
            case 14:
                return EventMetaParamsConfig._init_$lambda$0();
            case 15:
                return new trh(np0.n, (byte[]) xrh.a.getValue(), np0.n);
            case 16:
                return new trh(np0.n, (byte[]) xrh.b.getValue(), np0.n);
            case 17:
                return qyj.r("M-13.99 9.36 C-14.2,6.1 -14.37,2.64 -14.37,0 C-14.37,-2.64 -14.2,-6.1 -13.99,-9.36 C-13.71,-13.83 -13.57,-16.07 -11.92,-16.97 C-10.27,-17.88 -8.33,-16.81 -4.43,-14.67 C-2.15,-13.42 0.17,-12.08 1.97,-10.89 C4.2,-9.4 7.12,-7.24 9.74,-5.23 C12.83,-2.87 14.37,-1.69 14.37,0 C14.37,1.69 12.83,2.87 9.74,5.24 C7.12,7.24 4.2,9.4 1.97,10.89 C0.17,12.08 -2.15,13.42 -4.43,14.67 C-8.33,16.81 -10.27,17.88 -11.92,16.97 C-13.57,16.07 -13.71,13.83 -13.99,9.36c");
            case 18:
                return qyj.r("M-13.88 9.28 C-14.08,6.05 -14.25,2.61 -14.25,0 C-14.25,-2.61 -14.08,-6.05 -13.88,-9.28 C-13.6,-13.72 -13.45,-15.93 -11.82,-16.83 C-10.19,-17.73 -8.26,-16.67 -4.4,-14.55 C-2.13,-13.31 0.17,-11.98 1.95,-10.8 C4.17,-9.32 7.06,-7.18 9.66,-5.19 C12.72,-2.85 14.25,-1.67 14.25,0 C14.25,1.67 12.72,2.85 9.66,5.19 C7.06,7.18 4.17,9.32 1.95,10.8 C0.17,11.98 -2.13,13.31 -4.4,14.55 C-8.26,16.67 -10.19,17.73 -11.82,16.83 C-13.45,15.93 -13.6,13.72 -13.88,9.28c");
            case 19:
                return qyj.r("M-13.88 9.28 C-14.08,6.05 -14.25,2.61 -14.25,0 C-14.25,-2.61 -14.08,-6.05 -13.88,-9.28 C-13.6,-13.72 -13.45,-15.93 -11.82,-16.83 C-10.19,-17.73 -8.26,-16.67 -4.4,-14.55 C-2.13,-13.31 0.17,-11.98 1.95,-10.8 C4.17,-9.32 7.06,-7.18 9.66,-5.19 C12.72,-2.85 14.25,-1.67 14.25,0 C14.25,1.67 12.72,2.85 9.66,5.19 C7.06,7.18 4.17,9.32 1.95,10.8 C0.17,11.98 -2.13,13.31 -4.4,14.55 C-8.26,16.67 -10.19,17.73 -11.82,16.83 C-13.45,15.93 -13.6,13.72 -13.88,9.28c");
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new r7g(false);
            case 21:
                return new r7g(true);
            case 22:
                return new Paint(1);
            case 23:
                return "Failed to close file info updates pipe";
            case 24:
                return "Unexpected event for read-only channel";
            case 25:
                return "Failed to write file size update";
            case 26:
                return "Failed to close pipe's sink channel";
            case 27:
                return "Failed to close pipe's source channel";
            case 28:
                return new nt4(yl5.d().getDisplayMetrics().density * 12.0f);
            default:
                return new lge("^[+]?[^a-zA-Zа-яёА-ЯЁ]*$");
        }
    }
}
