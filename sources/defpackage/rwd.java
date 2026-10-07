package defpackage;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
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
public final class rwd implements aqb {
    public static final Charset f = Charset.forName("UTF-8");
    public static final jp6 g = new jp6("key", p.h(p.g(owd.class, new z30(1))));
    public static final jp6 h = new jp6(SdkMetricStatEvent.VALUE_KEY, p.h(p.g(owd.class, new z30(2))));
    public static final ct8 i = new ct8(1);
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final zpb d;
    public final swd e = new swd(this, 0);

    public rwd(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, zpb zpbVar) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = zpbVar;
    }

    public static int h(jp6 jp6Var) {
        owd owdVar = (owd) jp6Var.b(owd.class);
        if (owdVar != null) {
            return owdVar.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // defpackage.aqb
    public final aqb a(jp6 jp6Var, Object obj) {
        f(jp6Var, obj, true);
        return this;
    }

    public final void b(jp6 jp6Var, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        owd owdVar = (owd) jp6Var.b(owd.class);
        if (owdVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = owdVar.intEncoding().ordinal();
        if (iOrdinal == 0) {
            i(owdVar.tag() << 3);
            i(i2);
        } else if (iOrdinal == 1) {
            i(owdVar.tag() << 3);
            i((i2 << 1) ^ (i2 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            i((owdVar.tag() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
        }
    }

    public final void c(jp6 jp6Var, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        owd owdVar = (owd) jp6Var.b(owd.class);
        if (owdVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = owdVar.intEncoding().ordinal();
        if (iOrdinal == 0) {
            i(owdVar.tag() << 3);
            j(j);
        } else if (iOrdinal == 1) {
            i(owdVar.tag() << 3);
            j((j >> 63) ^ (j << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            i((owdVar.tag() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    @Override // defpackage.aqb
    public final aqb d(jp6 jp6Var, int i2) {
        b(jp6Var, i2, true);
        return this;
    }

    @Override // defpackage.aqb
    public final aqb e(jp6 jp6Var, long j) throws IOException {
        c(jp6Var, j, true);
        return this;
    }

    public final void f(jp6 jp6Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            i((h(jp6Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            i(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                f(jp6Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                g(i, jp6Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z && dDoubleValue == 0.0d) {
                return;
            }
            i((h(jp6Var) << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            i((h(jp6Var) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            c(jp6Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            b(jp6Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            i((h(jp6Var) << 3) | 2);
            i(bArr.length);
            this.a.write(bArr);
            return;
        }
        zpb zpbVar = (zpb) this.b.get(obj.getClass());
        if (zpbVar != null) {
            g(zpbVar, jp6Var, obj, z);
            return;
        }
        jri jriVar = (jri) this.c.get(obj.getClass());
        if (jriVar != null) {
            swd swdVar = this.e;
            swdVar.b = false;
            swdVar.d = jp6Var;
            swdVar.c = z;
            jriVar.a(obj, swdVar);
            return;
        }
        if (obj instanceof jwd) {
            b(jp6Var, ((jwd) obj).a(), true);
        } else if (obj instanceof Enum) {
            b(jp6Var, ((Enum) obj).ordinal(), true);
        } else {
            g(this.d, jp6Var, obj, z);
        }
    }

    public final void g(zpb zpbVar, jp6 jp6Var, Object obj, boolean z) throws IOException {
        zz8 zz8Var = new zz8(0);
        zz8Var.b = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = zz8Var;
            try {
                zpbVar.a(obj, this);
                this.a = outputStream;
                long j = zz8Var.b;
                zz8Var.close();
                if (z && j == 0) {
                    return;
                }
                i((h(jp6Var) << 3) | 2);
                j(j);
                zpbVar.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                zz8Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void i(int i2) throws IOException {
        while (true) {
            long j = i2 & (-128);
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i2 & 127);
                return;
            } else {
                outputStream.write((i2 & 127) | np0.m);
                i2 >>>= 7;
            }
        }
    }

    public final void j(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | np0.m);
                j >>>= 7;
            }
        }
    }
}
