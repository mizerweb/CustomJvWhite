package defpackage;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes2.dex */
final class j6l implements aqb {
    private static final Charset f = Charset.forName("UTF-8");
    private static final jp6 g;
    private static final jp6 h;
    private static final zpb i;
    private OutputStream a;
    private final Map b;
    private final Map c;
    private final zpb d;
    private final v6l e = new v6l(this);

    static {
        d6l d6lVarK = ewi.k(1);
        HashMap map = new HashMap();
        map.put(d6lVarK.annotationType(), d6lVarK);
        g = new jp6("key", p.h(map));
        d6l d6lVarK2 = ewi.k(2);
        HashMap map2 = new HashMap();
        map2.put(d6lVarK2.annotationType(), d6lVarK2);
        h = new jp6(SdkMetricStatEvent.VALUE_KEY, p.h(map2));
        i = new zpb() { // from class: g6l
            @Override // defpackage.v76
            public final void a(Object obj, Object obj2) throws IOException {
                j6l.u((Map.Entry) obj, (aqb) obj2);
            }
        };
    }

    public j6l(OutputStream outputStream, Map map, Map map2, zpb zpbVar) {
        this.a = outputStream;
        this.b = map;
        this.c = map2;
        this.d = zpbVar;
    }

    private static ByteBuffer A(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void B(int i2) throws IOException {
        while (true) {
            long j = i2 & (-128);
            int i3 = i2 & 127;
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i3);
                return;
            } else {
                outputStream.write(i3 | np0.m);
                i2 >>>= 7;
            }
        }
    }

    private final void C(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            int i2 = ((int) j) & 127;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(i2);
                return;
            } else {
                outputStream.write(i2 | np0.m);
                j >>>= 7;
            }
        }
    }

    public static /* synthetic */ void u(Map.Entry entry, aqb aqbVar) throws IOException {
        aqbVar.a(g, entry.getKey());
        aqbVar.a(h, entry.getValue());
    }

    private static int v(jp6 jp6Var) {
        d6l d6lVar = (d6l) jp6Var.b(d6l.class);
        if (d6lVar != null) {
            return d6lVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final long w(zpb zpbVar, Object obj) throws IOException {
        u5l u5lVar = new u5l();
        try {
            OutputStream outputStream = this.a;
            this.a = u5lVar;
            try {
                zpbVar.a(obj, this);
                this.a = outputStream;
                long jL = u5lVar.l();
                u5lVar.close();
                return jL;
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                u5lVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static d6l x(jp6 jp6Var) {
        d6l d6lVar = (d6l) jp6Var.b(d6l.class);
        if (d6lVar != null) {
            return d6lVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final j6l y(zpb zpbVar, jp6 jp6Var, Object obj, boolean z) throws IOException {
        long jW = w(zpbVar, obj);
        if (z && jW == 0) {
            return this;
        }
        B((v(jp6Var) << 3) | 2);
        C(jW);
        zpbVar.a(obj, this);
        return this;
    }

    private final j6l z(jri jriVar, jp6 jp6Var, Object obj, boolean z) throws IOException {
        this.e.h(jp6Var, z);
        jriVar.a(obj, this.e);
        return this;
    }

    @Override // defpackage.aqb
    public final aqb a(jp6 jp6Var, Object obj) throws IOException {
        q(jp6Var, obj, true);
        return this;
    }

    public final aqb b(jp6 jp6Var, double d) throws IOException {
        o(jp6Var, d, true);
        return this;
    }

    public final aqb c(jp6 jp6Var, float f2) throws IOException {
        p(jp6Var, f2, true);
        return this;
    }

    @Override // defpackage.aqb
    public final /* synthetic */ aqb d(jp6 jp6Var, int i2) throws IOException {
        r(jp6Var, i2, true);
        return this;
    }

    @Override // defpackage.aqb
    public final /* synthetic */ aqb e(jp6 jp6Var, long j) throws IOException {
        s(jp6Var, j, true);
        return this;
    }

    public final /* synthetic */ aqb f(jp6 jp6Var, boolean z) throws IOException {
        r(jp6Var, z ? 1 : 0, true);
        return this;
    }

    public final aqb g(String str, double d) throws IOException {
        o(jp6.c(str), d, true);
        return this;
    }

    public final aqb h(String str, int i2) throws IOException {
        r(jp6.c(str), i2, true);
        return this;
    }

    public final aqb i(String str, long j) throws IOException {
        s(jp6.c(str), j, true);
        return this;
    }

    public final aqb j(String str, Object obj) throws IOException {
        q(jp6.c(str), obj, true);
        return this;
    }

    public final aqb k(String str, boolean z) throws IOException {
        r(jp6.c(str), z ? 1 : 0, true);
        return this;
    }

    public final aqb l(Object obj) throws IOException {
        t(obj);
        return this;
    }

    public final aqb m(jp6 jp6Var) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    public final aqb n(String str) throws IOException {
        return m(jp6.c(str));
    }

    public final aqb o(jp6 jp6Var, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        B((v(jp6Var) << 3) | 1);
        this.a.write(A(8).putDouble(d).array());
        return this;
    }

    public final aqb p(jp6 jp6Var, float f2, boolean z) throws IOException {
        if (z && f2 == 0.0f) {
            return this;
        }
        B((v(jp6Var) << 3) | 5);
        this.a.write(A(4).putFloat(f2).array());
        return this;
    }

    public final aqb q(jp6 jp6Var, Object obj, boolean z) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    B((v(jp6Var) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f);
                    B(bytes.length);
                    this.a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    q(jp6Var, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    y(i, jp6Var, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    o(jp6Var, ((Double) obj).doubleValue(), z);
                    return this;
                }
                if (obj instanceof Float) {
                    p(jp6Var, ((Float) obj).floatValue(), z);
                    return this;
                }
                if (obj instanceof Number) {
                    s(jp6Var, ((Number) obj).longValue(), z);
                    return this;
                }
                if (obj instanceof Boolean) {
                    r(jp6Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    zpb zpbVar = (zpb) this.b.get(obj.getClass());
                    if (zpbVar != null) {
                        y(zpbVar, jp6Var, obj, z);
                        return this;
                    }
                    jri jriVar = (jri) this.c.get(obj.getClass());
                    if (jriVar != null) {
                        z(jriVar, jp6Var, obj, z);
                        return this;
                    }
                    if (obj instanceof x5l) {
                        r(jp6Var, ((x5l) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        r(jp6Var, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    y(this.d, jp6Var, obj, z);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    B((v(jp6Var) << 3) | 2);
                    B(bArr.length);
                    this.a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    public final j6l r(jp6 jp6Var, int i2, boolean z) throws IOException {
        if (!z || i2 != 0) {
            d6l d6lVarX = x(jp6Var);
            int iOrdinal = d6lVarX.zzb().ordinal();
            if (iOrdinal == 0) {
                B(d6lVarX.zza() << 3);
                B(i2);
                return this;
            }
            if (iOrdinal == 1) {
                B(d6lVarX.zza() << 3);
                B((i2 + i2) ^ (i2 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                B((d6lVarX.zza() << 3) | 5);
                this.a.write(A(4).putInt(i2).array());
                return this;
            }
        }
        return this;
    }

    public final j6l s(jp6 jp6Var, long j, boolean z) throws IOException {
        if (!z || j != 0) {
            d6l d6lVarX = x(jp6Var);
            int iOrdinal = d6lVarX.zzb().ordinal();
            if (iOrdinal == 0) {
                B(d6lVarX.zza() << 3);
                C(j);
                return this;
            }
            if (iOrdinal == 1) {
                B(d6lVarX.zza() << 3);
                C((j >> 63) ^ (j + j));
                return this;
            }
            if (iOrdinal == 2) {
                B((d6lVarX.zza() << 3) | 1);
                this.a.write(A(8).putLong(j).array());
                return this;
            }
        }
        return this;
    }

    public final j6l t(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        zpb zpbVar = (zpb) this.b.get(obj.getClass());
        if (zpbVar == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        zpbVar.a(obj, this);
        return this;
    }
}
