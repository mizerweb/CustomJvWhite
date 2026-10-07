package com.vk.push.common.utils;

import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"optStringOrNull", "", "Lorg/json/JSONObject;", "key", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class JSONExtensionKt {
    public static final String optStringOrNull(JSONObject jSONObject, String str) {
        return StringExtensionsKt.nullIfBlank(jSONObject.optString(str));
    }
}
