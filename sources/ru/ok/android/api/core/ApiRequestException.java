package ru.ok.android.api.core;

import kotlin.Metadata;
import ru.ok.android.api.json.JsonSerializeException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/android/api/core/ApiRequestException;", "Lru/ok/android/api/core/ApiException;", "odnoklassniki-android-api_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class ApiRequestException extends ApiException {
    public ApiRequestException(JsonSerializeException jsonSerializeException) {
        super(jsonSerializeException);
    }
}
