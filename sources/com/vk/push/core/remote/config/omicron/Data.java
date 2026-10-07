package com.vk.push.core.remote.config.omicron;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Data {
    public final Integer a;
    public final String b;
    public final HashMap c;
    public final Map d;

    public static final class Builder {
        public Integer a;
        public String b;
        public final HashMap c = new HashMap();
        public Map d;

        public Data build() {
            return new Data(this);
        }

        public Builder condition(String str) {
            this.b = str;
            return this;
        }

        public Builder pair(String str, Object obj) {
            if ((obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean)) {
                this.c.put(str, obj);
                return this;
            }
            defpackage.c.f(obj.getClass(), " not supported", "Value of type ");
            return null;
        }

        public Builder segments(Map<String, String> map) {
            this.d = map;
            return this;
        }

        public Builder version(Integer num) {
            this.a = num;
            return this;
        }
    }

    public Data(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Map<String, Object> getAll() {
        return Collections.unmodifiableMap(this.c);
    }

    public boolean getBoolean(String str, boolean z) {
        Object obj = this.c.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }

    public Boolean getBooleanOrNull(String str) {
        Object obj = this.c.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public String getCondition() {
        return this.b;
    }

    public double getDouble(String str, double d) {
        Object obj = this.c.get(str);
        return obj instanceof Number ? ((Number) obj).doubleValue() : d;
    }

    public Double getDoubleOrNull(String str) {
        Object obj = this.c.get(str);
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        return null;
    }

    public float getFloat(String str, float f) {
        Object obj = this.c.get(str);
        return obj instanceof Number ? ((Number) obj).floatValue() : f;
    }

    public Float getFloatOrNull(String str) {
        Object obj = this.c.get(str);
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        return null;
    }

    public int getInt(String str, int i) {
        Object obj = this.c.get(str);
        return obj instanceof Number ? ((Number) obj).intValue() : i;
    }

    public Integer getIntOrNull(String str) {
        Object obj = this.c.get(str);
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        return null;
    }

    public long getLong(String str, long j) {
        Object obj = this.c.get(str);
        return obj instanceof Number ? ((Number) obj).longValue() : j;
    }

    public Long getLongOrNull(String str) {
        Object obj = this.c.get(str);
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        return null;
    }

    public Map<String, String> getSegments() {
        Map map = this.d;
        if (map == null) {
            return null;
        }
        return Collections.unmodifiableMap(map);
    }

    public String getString(String str, String str2) {
        Object obj = this.c.get(str);
        return obj instanceof String ? (String) obj : str2;
    }

    public Integer getVersion() {
        return this.a;
    }

    public String getString(String str) {
        return getString(str, null);
    }

    @Deprecated
    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    @Deprecated
    public double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    @Deprecated
    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    @Deprecated
    public int getInt(String str) {
        return getInt(str, 0);
    }

    @Deprecated
    public long getLong(String str) {
        return getLong(str, 0L);
    }
}
