package defpackage;

import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class yj5 {
    public final ny8 a;

    public yj5(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public static void a(yj5 yj5Var, xj5 xj5Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        float f17 = (i & 4) != 0 ? Float.NaN : f2;
        float f18 = (i & 8) != 0 ? Float.NaN : f3;
        float f19 = (i & 16) != 0 ? Float.NaN : f4;
        float f20 = (i & 32) != 0 ? Float.NaN : f5;
        float f21 = (i & 64) != 0 ? Float.NaN : f6;
        float f22 = (i & np0.m) != 0 ? Float.NaN : f7;
        float f23 = (i & np0.n) != 0 ? Float.NaN : f8;
        float f24 = (i & np0.o) != 0 ? Float.NaN : f9;
        float f25 = (i & 1024) != 0 ? Float.NaN : f10;
        float f26 = (i & np0.q) != 0 ? Float.NaN : f11;
        float f27 = (i & np0.r) != 0 ? Float.NaN : f12;
        float f28 = (i & 8192) != 0 ? Float.NaN : f13;
        float f29 = (i & 16384) != 0 ? Float.NaN : f14;
        float f30 = (i & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? Float.NaN : f15;
        float f31 = (i & 65536) != 0 ? Float.NaN : f16;
        String str8 = (i & 131072) != 0 ? null : str;
        float f32 = f17;
        String str9 = (i & 262144) != 0 ? null : str2;
        float f33 = f29;
        String str10 = (i & 524288) != 0 ? null : str3;
        String str11 = (i & 1048576) != 0 ? null : str4;
        float f34 = f19;
        String str12 = (i & 2097152) != 0 ? null : str5;
        float f35 = f20;
        String str13 = (i & 4194304) != 0 ? null : str6;
        float f36 = f21;
        String str14 = (i & 8388608) != 0 ? null : str7;
        float f37 = f22;
        String str15 = xj5Var.a;
        float f38 = f23;
        ny8 ny8Var = ((src) yj5Var.a.getValue()).b;
        if (((f5d) ((wo6) ny8Var.getValue())).c().a(xj5Var) || ((f5d) ((wo6) ny8Var.getValue())).j().a.a(str15)) {
            src srcVar = (src) yj5Var.a.getValue();
            ul9 ul9Var = new ul9();
            if (!Float.isNaN(f)) {
                ul9Var.put(SdkMetricStatEvent.VALUE_KEY, Float.valueOf(f));
            }
            if (!Float.isNaN(f32)) {
                ul9Var.put("value2", Float.valueOf(f32));
            }
            if (!Float.isNaN(f18)) {
                ul9Var.put("value3", Float.valueOf(f18));
            }
            if (!Float.isNaN(f34)) {
                ul9Var.put("value4", Float.valueOf(f34));
            }
            if (!Float.isNaN(f35)) {
                ul9Var.put("value5", Float.valueOf(f35));
            }
            if (!Float.isNaN(f36)) {
                ul9Var.put("value6", Float.valueOf(f36));
            }
            if (!Float.isNaN(f37)) {
                ul9Var.put("value7", Float.valueOf(f37));
            }
            if (!Float.isNaN(f38)) {
                ul9Var.put("value8", Float.valueOf(f38));
            }
            if (!Float.isNaN(f24)) {
                ul9Var.put("value9", Float.valueOf(f24));
            }
            if (!Float.isNaN(f25)) {
                ul9Var.put("value10", Float.valueOf(f25));
            }
            if (!Float.isNaN(f26)) {
                ul9Var.put("value11", Float.valueOf(f26));
            }
            if (!Float.isNaN(f27)) {
                ul9Var.put("value12", Float.valueOf(f27));
            }
            if (!Float.isNaN(f28)) {
                ul9Var.put("value13", Float.valueOf(f28));
            }
            if (!Float.isNaN(f33)) {
                ul9Var.put("value14", Float.valueOf(f33));
            }
            if (!Float.isNaN(f30)) {
                ul9Var.put("value15", Float.valueOf(f30));
            }
            if (!Float.isNaN(f31)) {
                ul9Var.put("value16", Float.valueOf(f31));
            }
            if (str8 != null) {
                ul9Var.put("valueStr", str8);
            }
            if (str9 != null) {
                ul9Var.put("valueStr2", str9);
            }
            if (str10 != null) {
                ul9Var.put("valueStr3", str10);
            }
            if (str11 != null) {
                ul9Var.put("valueStr4", str11);
            }
            if (str12 != null) {
                ul9Var.put("valueStr5", str12);
            }
            if (str13 != null) {
                ul9Var.put("valueStr6", str13);
            }
            if (str14 != null) {
                ul9Var.put("valueStr7", str14);
            }
            ae9.k((ae9) srcVar.a.getValue(), "DEV", str15, ul9Var.b(), 8);
        }
    }
}
