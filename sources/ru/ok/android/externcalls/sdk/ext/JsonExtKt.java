package ru.ok.android.externcalls.sdk.ext;

import defpackage.qf7;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0011\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0015\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001b\u001aB\u0010 \u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001d*\u00020\u001c*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u001eH\u0082\b¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lorg/json/JSONObject;", "", "key", "", "getLongOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;", "default", "getLongOrDefault", "(Lorg/json/JSONObject;Ljava/lang/String;J)J", "", "getIntOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "getIntOrDefault", "(Lorg/json/JSONObject;Ljava/lang/String;I)I", "", "getDoubleOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Double;", "getDoubleOrDefault", "(Lorg/json/JSONObject;Ljava/lang/String;D)D", "getStringOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "getStringOrDefault", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "getBooleanOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;", "getBooleanOrDefault", "(Lorg/json/JSONObject;Ljava/lang/String;Z)Z", "", "T", "Lkotlin/Function2;", "block", "getSafe", "(Lorg/json/JSONObject;Ljava/lang/String;Lqf7;)Ljava/lang/Object;", "calls-sdk-common"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class JsonExtKt {
    public static final boolean getBooleanOrDefault(JSONObject jSONObject, String str, boolean z) {
        Boolean booleanOrNull = getBooleanOrNull(jSONObject, str);
        return booleanOrNull != null ? booleanOrNull.booleanValue() : z;
    }

    public static final Boolean getBooleanOrNull(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return Boolean.valueOf(jSONObject.getBoolean(str));
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public static final double getDoubleOrDefault(JSONObject jSONObject, String str, double d) {
        Double doubleOrNull = getDoubleOrNull(jSONObject, str);
        return doubleOrNull != null ? doubleOrNull.doubleValue() : d;
    }

    public static final Double getDoubleOrNull(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return Double.valueOf(jSONObject.getDouble(str));
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public static final int getIntOrDefault(JSONObject jSONObject, String str, int i) {
        Integer intOrNull = getIntOrNull(jSONObject, str);
        return intOrNull != null ? intOrNull.intValue() : i;
    }

    public static final Integer getIntOrNull(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return Integer.valueOf(jSONObject.getInt(str));
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public static final long getLongOrDefault(JSONObject jSONObject, String str, long j) {
        Long longOrNull = getLongOrNull(jSONObject, str);
        return longOrNull != null ? longOrNull.longValue() : j;
    }

    public static final Long getLongOrNull(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return Long.valueOf(jSONObject.getLong(str));
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    private static final <T> T getSafe(JSONObject jSONObject, String str, qf7 qf7Var) {
        try {
            if (jSONObject.has(str)) {
                return (T) qf7Var.invoke(jSONObject, str);
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public static final String getStringOrDefault(JSONObject jSONObject, String str, String str2) {
        String stringOrNull = getStringOrNull(jSONObject, str);
        return stringOrNull == null ? str2 : stringOrNull;
    }

    public static final String getStringOrNull(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
        } catch (JSONException unused) {
        }
        return null;
    }
}
