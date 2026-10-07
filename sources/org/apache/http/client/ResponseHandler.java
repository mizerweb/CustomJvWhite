package org.apache.http.client;

import java.io.IOException;
import org.apache.http.HttpResponse;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface ResponseHandler<T> {
    T handleResponse(HttpResponse httpResponse) throws IOException;
}
