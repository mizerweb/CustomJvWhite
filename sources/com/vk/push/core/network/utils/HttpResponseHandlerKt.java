package com.vk.push.core.network.utils;

import com.vk.push.core.network.exception.VkpnsRequestException;
import com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException;
import com.vk.push.core.network.http.HttpResponse;
import com.vk.push.core.network.model.ResponseError;
import defpackage.cf7;
import defpackage.ch3;
import defpackage.poe;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a@\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\b"}, d2 = {"T", "Lroe;", "Lcom/vk/push/core/network/http/HttpResponse;", "Lkotlin/Function1;", "", "parseSuccess", "handleVkpnsResponse", "(Ljava/lang/Object;Lcf7;)Ljava/lang/Object;", "core-network_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class HttpResponseHandlerKt {
    public static final <T> Object handleVkpnsResponse(Object obj, cf7 cf7Var) {
        try {
            ch3.d0(obj);
            HttpResponse httpResponse = (HttpResponse) obj;
            if (ResponseErrorKt.hasErrorBody(httpResponse.getBody())) {
                ResponseError errorResponse = ResponseErrorKt.parseErrorResponse(httpResponse.getBody());
                return new poe(new VkpnsRequestWithErrorBodyException(errorResponse.toString(), errorResponse.getCode()));
            }
            if (httpResponse.isSuccessful()) {
                return cf7Var.invoke(httpResponse.getBody());
            }
            String message = httpResponse.getMessage();
            if (message == null) {
                message = "";
            }
            return new poe(new VkpnsRequestException(message, httpResponse.getCode()));
        } catch (Exception e) {
            return new poe(e);
        }
    }
}
