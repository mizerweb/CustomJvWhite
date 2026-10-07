package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ai0 {
    public final long a;

    public ai0(long j) {
        this.a = j;
    }

    public static ai0 a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        ai0 ai0Var = new ai0(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return ai0Var;
                    }
                    ai0 ai0Var2 = new ai0(jsonReader.nextLong());
                    jsonReader.close();
                    return ai0Var2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ai0) && this.a == ((ai0) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return c0a.m(this.a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
