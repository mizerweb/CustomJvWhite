package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class jv8 implements aqb, kri {
    public final boolean a = true;
    public final JsonWriter b;
    public final Map c;
    public final Map d;
    public final zpb e;
    public final boolean f;

    public jv8(Writer writer, Map map, Map map2, zpb zpbVar, boolean z) {
        this.b = new JsonWriter(writer);
        this.c = map;
        this.d = map2;
        this.e = zpbVar;
        this.f = z;
    }

    @Override // defpackage.aqb
    public final aqb a(jp6 jp6Var, Object obj) throws IOException {
        g(obj, jp6Var.a);
        return this;
    }

    @Override // defpackage.kri
    public final kri b(String str) throws IOException {
        h();
        this.b.value(str);
        return this;
    }

    @Override // defpackage.kri
    public final kri c(boolean z) throws IOException {
        h();
        this.b.value(z);
        return this;
    }

    @Override // defpackage.aqb
    public final aqb d(jp6 jp6Var, int i) throws IOException {
        String str = jp6Var.a;
        h();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(i);
        return this;
    }

    @Override // defpackage.aqb
    public final aqb e(jp6 jp6Var, long j) throws IOException {
        String str = jp6Var.a;
        h();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(j);
        return this;
    }

    public final jv8 f(Object obj) throws IOException {
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    f(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        g(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            zpb zpbVar = (zpb) this.c.get(obj.getClass());
            if (zpbVar != null) {
                jsonWriter.beginObject();
                zpbVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            jri jriVar = (jri) this.d.get(obj.getClass());
            if (jriVar != null) {
                jriVar.a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String strName = ((Enum) obj).name();
                h();
                jsonWriter.value(strName);
                return this;
            }
            jsonWriter.beginObject();
            this.e.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            h();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                jsonWriter.value(iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                h();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                f(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                f(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final jv8 g(Object obj, String str) throws IOException {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (z) {
            if (obj == null) {
                return this;
            }
            h();
            jsonWriter.name(str);
            f(obj);
            return this;
        }
        h();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        f(obj);
        return this;
    }

    public final void h() {
        if (this.a) {
            return;
        }
        ore.k("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
