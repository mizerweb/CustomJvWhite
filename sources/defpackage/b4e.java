package defpackage;

import java.math.BigInteger;
import org.apache.http.cookie.ClientCookie;
import org.webrtc.RTCStats;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b4e {
    public static final bw2 b;
    public static final bw2 c;
    public static final bw2 d;
    public static final bw2 e;
    public static final /* synthetic */ zv8[] a = {new dwd(b4e.class, "mimeType", "getMimeType(Lorg/webrtc/RTCStats;)Ljava/lang/String;", 1), zo5.f(zfe.a, b4e.class, "decoderImplementation", "getDecoderImplementation(Lorg/webrtc/RTCStats;)Ljava/lang/String;", 1), new dwd(b4e.class, "encoderImplementation", "getEncoderImplementation(Lorg/webrtc/RTCStats;)Ljava/lang/String;", 1), new dwd(b4e.class, "sdpFmtpLine", "getSdpFmtpLine(Lorg/webrtc/RTCStats;)Ljava/lang/String;", 1), new dwd(b4e.class, "payloadType", "getPayloadType(Lorg/webrtc/RTCStats;)Ljava/lang/Long;", 1), new dwd(b4e.class, "channels", "getChannels(Lorg/webrtc/RTCStats;)Ljava/lang/Long;", 1)};
    public static final ahc f = new ahc(7);

    static {
        int i = 2;
        b = new bw2("mimeType", i);
        c = new bw2("decoderImplementation", i);
        d = new bw2("encoderImplementation", i);
        e = new bw2("sdpFmtpLine", i);
    }

    public static final BigInteger a(Object obj) {
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number == null) {
            return null;
        }
        if (number instanceof BigInteger) {
            return (BigInteger) number;
        }
        if (number instanceof Long) {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(number.longValue());
            bigIntegerValueOf.getClass();
            return bigIntegerValueOf;
        }
        if (number instanceof Integer) {
            BigInteger bigIntegerValueOf2 = BigInteger.valueOf(number.intValue());
            bigIntegerValueOf2.getClass();
            return bigIntegerValueOf2;
        }
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(number.longValue());
        bigIntegerValueOf3.getClass();
        return bigIntegerValueOf3;
    }

    public static final Double b(Object obj) {
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return Double.valueOf(number.doubleValue());
        }
        return null;
    }

    public static final Long c(Object obj) {
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return Long.valueOf(number.longValue());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    public static final String d(RTCStats rTCStats) {
        Integer numValueOf;
        Object obj = rTCStats.getMembers().get("address");
        String string = obj != null ? obj.toString() : null;
        if (string != null) {
            Object obj2 = rTCStats.getMembers().get(ClientCookie.PORT_ATTR);
            if (obj2 == null) {
                numValueOf = null;
            } else {
                Number number = obj2 instanceof Number ? (Number) obj2 : null;
                if (number != null) {
                    numValueOf = Integer.valueOf(number.intValue());
                } else {
                    numValueOf = null;
                }
            }
            if (numValueOf != null) {
                return qt4.j(numValueOf.intValue(), string, ":");
            }
        }
        return null;
    }

    public static final String e(RTCStats rTCStats) {
        Object obj = rTCStats.getMembers().get("transportId");
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
