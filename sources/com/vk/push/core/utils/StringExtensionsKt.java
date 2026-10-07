package com.vk.push.core.utils;

import defpackage.lge;
import defpackage.r5h;
import defpackage.rl0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002¨\u0006\u0004"}, d2 = {"", "hideSensitive", "(Ljava/lang/String;)Ljava/lang/String;", "camelToSnakeCase", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class StringExtensionsKt {
    public static final lge a = new lge("(?<=[a-zA-Z])[A-Z]");

    public static final String camelToSnakeCase(String str) {
        return a.c(str, rl0.m);
    }

    public static final String hideSensitive(String str) {
        return str.length() > 8 ? "****".concat(r5h.v1(4, str)) : "****";
    }
}
