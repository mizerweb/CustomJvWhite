package one.video.calls.sdk.rest.api.error;

import kotlin.Metadata;
import ru.ok.android.api.core.ApiInvocationException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/video/calls/sdk/rest/api/error/ApiInvocationError;", "Lru/ok/android/api/core/ApiInvocationException;", "ok-api"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class ApiInvocationError extends ApiInvocationException {
    public static final /* synthetic */ int a = 0;

    public ApiInvocationError(int i, ApiInvocationException apiInvocationException) {
        super(i, apiInvocationException.getErrorMessage(), apiInvocationException.getErrorField(), apiInvocationException.getErrorData(), apiInvocationException.getErrorCustomKey(), apiInvocationException.getErrorCustomJson(), apiInvocationException.getErrorPage());
    }
}
