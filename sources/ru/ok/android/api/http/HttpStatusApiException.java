package ru.ok.android.api.http;

import defpackage.zo5;
import kotlin.Metadata;
import ru.ok.android.api.core.ApiException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/android/api/http/HttpStatusApiException;", "Lru/ok/android/api/core/ApiException;", "odnoklassniki-android-httpapi_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HttpStatusApiException extends ApiException {
    public final int a;

    public HttpStatusApiException(int i) {
        super(zo5.h(i, "HTTP "));
        this.a = i;
    }
}
